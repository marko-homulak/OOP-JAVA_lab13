import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.WindowConstants;

public class WindowWithMenu extends JFrame {

    public WindowWithMenu() {
        setUpWindow();
        setUpMenuBar();
        revalidate();
    }
    
    private void setUpWindow() {
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Window with menu");     
    }
    
    private void setUpMenuBar() {
        JMenuBar menuBar = new JMenuBar();
    
        setUpServiceMenuItem(menuBar);
    
        setUpTableMenuItem(menuBar);
    
        setJMenuBar(menuBar);
    }
    
    private void setUpServiceMenuItem(JMenuBar menuBar) {
        JMenu service = new JMenu("Service");
    
        JCheckBoxMenuItem languageMenuItem = new JCheckBoxMenuItem("Language");
        JCheckBoxMenuItem spellingMenuItem = new JCheckBoxMenuItem("Spelling");
        service.add(spellingMenuItem);
        service.add(new JSeparator());
        service.add(languageMenuItem);
    
        menuBar.add(service);
    }
    
    private void setUpTableMenuItem(JMenuBar menuBar) {
        JMenu table = new JMenu("Table");
    
        JMenu insertSubMenu = new JMenu("Insert");
        JMenuItem insertRowsMenuItem = new JMenuItem("Rows");
        JMenuItem insertColumnsMenuItem = new JMenuItem("Columns");
        insertSubMenu.add(insertRowsMenuItem);
        insertSubMenu.add(insertColumnsMenuItem);
        table.add(insertSubMenu);
    
        JMenu deleteSubMenu = new JMenu("Separate");
        JMenuItem deleteRowsMenuItem = new JMenuItem("Rows");
        JMenuItem deleteColumnsMenuItem = new JMenuItem("Columns");
        deleteSubMenu.add(deleteRowsMenuItem);
        deleteSubMenu.add(deleteColumnsMenuItem);
        table.add(deleteSubMenu);
    
        menuBar.add(table);
    }

}
