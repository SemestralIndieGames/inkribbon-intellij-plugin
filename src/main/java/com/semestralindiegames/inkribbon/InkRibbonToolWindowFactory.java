package com.semestralindiegames.inkribbon;

import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import org.jetbrains.annotations.NotNull;

public class InkRibbonToolWindowFactory implements ToolWindowFactory, DumbAware {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        InkRibbonPanel inkRibbonPanel = new InkRibbonPanel(project);
        toolWindow.getComponent().add(inkRibbonPanel.getContent());
    }
}
