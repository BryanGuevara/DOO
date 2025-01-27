package bryanDev.util.config;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class StyleFrame {
    
    public void configureFrame(JFrame frame, String title, String iconPath) {
        if (frame == null || title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("El JFrame o el título no pueden ser nulos o vacíos.");
        }
        frame.setLocationRelativeTo(null);
        frame.setTitle(title);
        frame.setResizable(false);
        frame.setBackground(new Color(255, 10, 10));
        
        if (iconPath != null && !iconPath.trim().isEmpty()) {
            frame.setIconImage(new ImageIcon(iconPath).getImage());
        }
    }
    
}
