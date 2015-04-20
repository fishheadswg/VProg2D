package com.mygdx.game;

import javax.swing.*;

// This isn't really a class, so much as a way to stick all of the menu
// generating functions into one spot for organization.
// A cleaner and more "proper" refactor of this would be cool if anyone has the
// time.
public class JMenuBuilder {
    private static JMenuItem newJMenuItemWithIcon
    (String name, String iconFilename) {
        ImageIcon icon = new ImageIcon(iconFilename);
        JMenuItem item = new JMenuItem(name);
        item.setIcon(icon);
        return item;
    }
    
    public static JMenu buildFileMenu() {
        JMenu menu = new JMenu("File");
        
        // "new_" is icky, but "new" is a reserved keyword.
        JMenuItem new_ = newJMenuItemWithIcon("New", "createProject_small.png");
        JMenuItem open = newJMenuItemWithIcon("Open", "loadProject_small.png");
        JMenuItem save = newJMenuItemWithIcon("Save", "saveProject_small.png");
        
        menu.add(new_);
        menu.add(open);
        menu.add(save);
        
        return menu;
    }
    
    public static JMenu buildProjectMenu() {
        JMenu menu = new JMenu("Project");
        
        JMenuItem build = newJMenuItemWithIcon("Build", "construct_small.png");
        JMenuItem test = newJMenuItemWithIcon("Test", "test_small.png");
        JMenuItem run = newJMenuItemWithIcon("Run", "runProgram_small.png");
        
        menu.add(build);
        menu.add(test);
        menu.add(run);
        
        return menu;
    }
    
    public static JMenu buildHelpMenu() {
        JMenu menu = new JMenu("Help");
        
        JMenuItem about = new JMenuItem("About");
        
        menu.add(about);
        
        return menu;
    }
}
