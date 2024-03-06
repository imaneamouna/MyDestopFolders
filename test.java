import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
public class test {
 
    public static void main(String[] args) {
        // إنشاء إطار للتطبيق
        JFrame frame = new JFrame("جدول مقارنة الخوارزميات");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // البيانات المستخدمة لملء الجدول
        Object[][] data = {
            {"محمد", "طالب"},
            {"ليلى", "مهندسة"},
            {"علي", "مبرمج"}
        };

        // الأوقات المستغرقة لكل خوارزمية
        String[] algorithmTimes = {"2 ms", "5 ms", "3 ms"};

        // عناوين الأعمدة
        String[] columnNames = {"الاسم", "المهنة", "وقت الخوارزمية (ms)"};

        // إنشاء DefaultTableModel
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // إضافة الأوقات المستغرقة لكل شخص
        for (int i = 0; i < data.length; i++) {
            model.setValueAt(algorithmTimes[i], i, 2);
        }

        // إنشاء جدول
        JTable table = new JTable(model);

        // إضافة الجدول إلى لوحة التمرير
        JScrollPane scrollPane = new JScrollPane(table);

        // إضافة لوحة التمرير إلى الإطار
        frame.add(scrollPane, BorderLayout.CENTER);

        // تعيين حجم الإطار وإظهاره
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
      
  
}

