///usr/bin/env java --enable-preview --source 21 -cp "*" "$0" "$@" ; exit $?

/*
 * Requires flatlaf-3.2.jar on the same directory
 * You can also remove '-cp "*"' from the 'shebang' and use the CLASSPATH variable instead:
 *  CLASSPATH="*" ./Scripting.java
 *
 * Dependencies can be declared using 'JBang': https://www.jbang.dev (not working out of the box)
 */

import com.formdev.flatlaf.FlatDarculaLaf;

import java.io.File;
import java.nio.file.Paths;
import javax.swing.*;
import java.awt.*;
import java.lang.System.Logger;
import java.nio.file.Path;

import static java.lang.System.Logger.Level.INFO;
import static java.util.Arrays.stream;
import static java.util.Objects.requireNonNull;

void main() throws Exception {
    final var currentPath = Paths.get("").toRealPath();
    final var directoryFrame = new DirectoryFrame(currentPath);

    directoryFrame.open();
}

static class DirectoryFrame extends JFrame {
    static {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        }
        catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }

    private static final Logger logger = System.getLogger(DirectoryFrame.class.getName());
    private static final Toolkit toolkit = Toolkit.getDefaultToolkit();
    private static final Dimension screenSize = toolkit.getScreenSize();

    public DirectoryFrame(final Path path) {
        final var file = path.toFile();
        final var displayedFiles = file.listFiles();

        logger.log(INFO, "Displaying directory frame for %s".formatted(file.getAbsolutePath()));

        requireNonNull(displayedFiles);
        add(new JScrollPane(new JList<>(stream(displayedFiles).map(File::getName).toArray())));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void open() {
        setVisible(true);
        pack();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
    }
}
