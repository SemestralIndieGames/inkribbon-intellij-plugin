package com.semestralindiegames.inkribbon;

import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.components.JBTextArea;

import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InkRibbonPanel {

    private final JBPanel<?> panel;
    private final JBLabel folderLabel;

    private Path saveDirectory;

    public InkRibbonPanel(Project project) {
        panel = new JBPanel<>(new BorderLayout(8, 8));

        folderLabel = new JBLabel("Folder: [None]");
        JButton selectFolderButton = new JButton("Select Folder");
        JBTextArea textArea = new JBTextArea(20, 80);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JBScrollPane scrollPane = new JBScrollPane(textArea);

        JButton newEntryButton = new JButton("📅 New Entry");
        JButton saveButton = new JButton("💾 Save");

        JBPanel<?> topPanel = new JBPanel<>(new BorderLayout());
        topPanel.add(folderLabel, BorderLayout.CENTER);
        topPanel.add(selectFolderButton, BorderLayout.EAST);

        JBPanel<?> bottomPanel = new JBPanel<>(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(newEntryButton);
        bottomPanel.add(saveButton);

        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        selectFolderButton.addActionListener(e -> {
            FileChooserDescriptor descriptor = FileChooserDescriptorFactory.createSingleFolderDescriptor();
            descriptor.setTitle("Select Folder");

            VirtualFile file = FileChooser.chooseFile(descriptor, project, null);
            if (file != null) {
                saveDirectory = Paths.get(file.getPath());
                folderLabel.setText("Folder: " + saveDirectory);
            }
        });

        newEntryButton.addActionListener(e -> {
            Messages.showInfoMessage("Crear entrada del día (falta implementar)", "Nueva Bitácora");
        });

        saveButton.addActionListener(e -> {
            Messages.showInfoMessage("Guardar contenido (falta implementar)", "Guardar Entrada");
        });
    }

    public JComponent getContent() {
        return panel;
    }

}
