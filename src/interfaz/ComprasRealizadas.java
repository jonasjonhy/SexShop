/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.sql.Date;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nico
 */
public class VentasRealizadas extends javax.swing.JPanel {

    private DefaultTableModel tablaFacturaDefault;//tabla default de los clientes
    private DefaultTableModel tablaFacturasDefault;

    /**
     * Creates new form AbmClienteGui
     */
    public VentasRealizadas() {
        initComponents();
        tablaFacturaDefault = (DefaultTableModel) tablaFactura.getModel();//conveirto la tabla
        tablaFacturasDefault = (DefaultTableModel) tablaFacturas.getModel();
    }

    public void setActionListener(ActionListener lis) {
        this.imprimir.addActionListener(lis); //boton imprimir
        this.devolucion.addActionListener(lis); //boton devolucion
        this.modificar.addActionListener(lis); //boton modificar
        this.eliminar.addActionListener(lis); //boton eliminar
    }

     public JDateChooser getClendarioDesde(){
        return calendarioDesde;
    }

    
    public JDateChooser getClendarioHasta(){
        return calendarioHasta;
    }
    
    public JTextField getFiltroApellido() {
        return filtroApellido;
    }

    public JTextField getFiltroNombre() {
        return filtroNombre;
    }

    public JDateChooser getCalendarioFactura() {
        return calendarioFactura;
    }

    public JButton getDevolucion() {
        return devolucion;
    }

    public JButton getEliminar() {
        return eliminar;
    }

    public JButton getModificar() {
        return modificar;
    }

    public JTextField getClienteFactura() {
        return clienteFactura;
    }

    public JButton getImprimir() {
        return imprimir;
    }

    public DefaultTableModel getTablaFacturaDefault() {
        return tablaFacturaDefault;
    }

    public DefaultTableModel getTablaFacturasDefault() {
        return tablaFacturasDefault;
    }

    public JTextField getFiltroId() {
        return filtroId;
    }

    public JTextField getCalenDesdeText(){
        return ((JTextField)calendarioDesde.getDateEditor().getUiComponent());
    }
    
    public JTextField getCalenHastaText(){
        return ((JTextField)calendarioHasta.getDateEditor().getUiComponent());
    }
        
    public JTable getTablaFactura() {
        return tablaFactura;
    }

    public JTable getTablaFacturas() {
        return tablaFacturas;
    }

    public JTextField getTotalFactura() {
        return totalFactura;
    }

    public JDateChooser getCalendarioDesde() {
        return calendarioDesde;
    }

    public JDateChooser getCalendarioHasta() {
        return calendarioHasta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        fondoImagen = new javax.swing.JPanel();
        panelTitulo = new org.edisoncor.gui.panel.PanelImage();
        titulo = new javax.swing.JLabel();
        panelFactura = new javax.swing.JPanel();
        labelCliente = new javax.swing.JLabel();
        clienteFactura = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        labelTotal = new javax.swing.JLabel();
        totalFactura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        calendarioFactura = new com.toedter.calendar.JDateChooser();
        panelControlFactura = new javax.swing.JPanel();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        devolucion = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        panelImage1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaFacturas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filtroNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filtroApellido = new javax.swing.JTextField();
        filtroId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        calendarioDesde = new com.toedter.calendar.JDateChooser();
        calendarioHasta = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(825, 448));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(822, 448));

        fondoImagen.setPreferredSize(new java.awt.Dimension(820, 400));

        panelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/fondoCliente2.jpg"))); // NOI18N
        panelTitulo.setPreferredSize(new java.awt.Dimension(329, 49));

        titulo.setFont(new java.awt.Font("Century Schoolbook L", 3, 24)); // NOI18N
        titulo.setText("VENTAS REALIZADAS");
        panelTitulo.add(titulo);

        panelFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factura", 0, 0, new java.awt.Font("Century Schoolbook L", 3, 18))); // NOI18N

        labelCliente.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        labelCliente.setText("Cliente");

        clienteFactura.setEditable(false);

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Articulo", "Precio", "importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tablaFactura);
        tablaFactura.getColumnModel().getColumn(0).setPreferredWidth(75);
        tablaFactura.getColumnModel().getColumn(0).setMaxWidth(75);
        tablaFactura.getColumnModel().getColumn(2).setPreferredWidth(75);
        tablaFactura.getColumnModel().getColumn(2).setMaxWidth(75);
        tablaFactura.getColumnModel().getColumn(3).setPreferredWidth(75);
        tablaFactura.getColumnModel().getColumn(3).setMaxWidth(75);

        labelTotal.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        labelTotal.setText("Total");

        totalFactura.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel3.setText("Fecha");

        calendarioFactura.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendarioFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCliente)
                        .addComponent(clienteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(calendarioFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotal)))
        );

        panelControlFactura.setLayout(new java.awt.GridLayout(1, 0));

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/modificar.png"))); // NOI18N
        modificar.setToolTipText("Modificar factura");
        panelControlFactura.add(modificar);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/borrar.png"))); // NOI18N
        eliminar.setToolTipText("Eliminar el registro de la venta de la base de datos");
        panelControlFactura.add(eliminar);

        devolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/devolver.png"))); // NOI18N
        devolucion.setToolTipText("Factura cancelada (Se borrará)");
        panelControlFactura.add(devolucion);

        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/imprimir.png"))); // NOI18N
        imprimir.setToolTipText("Abrir dialogo de impresion o exportarción");
        panelControlFactura.add(imprimir);

        panelImage1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas realizadas", 0, 0, new java.awt.Font("Century Schoolbook L", 3, 18))); // NOI18N

        tablaFacturas.setAutoCreateRowSorter(true);
        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num Factura", "Cliente", "fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFacturas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(tablaFacturas);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel1.setText("Desde");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        filtroNombre.setToolTipText("filtrar facturas por nombre del cliente");

        jLabel4.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel4.setText("Hasta");

        jLabel5.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel5.setText("Apellido");

        filtroApellido.setToolTipText("Filtrar facturas por apellido del cliente");

        filtroId.setToolTipText("Filtrar facturas por ID del cliente");

        jLabel6.setText("ID");

        calendarioDesde.setDateFormatString("yyyy-MM-dd");

        calendarioHasta.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtroNombre)
                    .addComponent(filtroApellido)))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelImage1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendarioHasta, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendarioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(filtroId, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(filtroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(filtroApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(filtroId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(calendarioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoImagenLayout = new javax.swing.GroupLayout(fondoImagen);
        fondoImagen.setLayout(fondoImagenLayout);
        fondoImagenLayout.setHorizontalGroup(
            fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelControlFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        fondoImagenLayout.setVerticalGroup(
            fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoImagenLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoImagenLayout.createSequentialGroup()
                        .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelControlFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(fondoImagen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser calendarioDesde;
    private com.toedter.calendar.JDateChooser calendarioFactura;
    private com.toedter.calendar.JDateChooser calendarioHasta;
    private javax.swing.JTextField clienteFactura;
    private javax.swing.JButton devolucion;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField filtroApellido;
    private javax.swing.JTextField filtroId;
    private javax.swing.JTextField filtroNombre;
    private javax.swing.JPanel fondoImagen;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JButton modificar;
    private javax.swing.JPanel panelControlFactura;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelTitulo;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTable tablaFacturas;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField totalFactura;
    // End of variables declaration//GEN-END:variables
}
