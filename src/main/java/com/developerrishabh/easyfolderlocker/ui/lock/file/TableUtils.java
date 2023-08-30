package com.developerrishabh.easyfolderlocker.ui.lock.file;



import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableUtils {

    public void addingTableRow(JTable itemTable) {
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        Object[] data = {null, null, null};
        model.addRow(data);
        itemTable.setModel(model);
    }
}
