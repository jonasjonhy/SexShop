/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;

/**
 *
 * @author nico
 */
public class AbmClienteGui extends javax.swing.JPanel {

    private DefaultTableModel tablaClientes;//tabla default de los clientes
    /**
     * Creates new form AbmClienteGui
     */
    public AbmClienteGui() {
        initComponents();
        tablaClientes = (DefaultTableModel) tabla.getModel(); //conveirto la tabla

    }
    
    public void setActionListener(ActionListener lis) {
        this.guardar.addActionListener(lis);
        this.borrar.addActionListener(lis);
        this.nuevo.addActionListener(lis);
        this.siguiente.addActionListener(lis);
        this.anterior.addActionListener(lis);
        this.modificar.addActionListener(lis);
        this.articulosComprados.addActionListener(lis);
    }
   
    
    
    public JButton getAnterior() {
        return anterior;
    }

    public JButton getArticulosComprados() {
        return articulosComprados;
    }

    public JButton getBorrar() {
        return borrar;
    }

    public JButton getGuardar() {
        return guardar;
    }

    public JButton getModificar() {
        return modificar;
    }

    public JButton getNuevo() {
        return nuevo;
    }

    public JButton getSiguiente() {
        return siguiente;
    }
    
    public JTable getTabla(){
        return tabla;
    }
    
    public DefaultTableModel getTablaClientes(){
        return tablaClientes;
    }
    
    /*setea los campos con los datos del cliente*/
    public void CargarCampos(Cliente c){
        idCliente.setText(c.getId().toString());
        nombre.setText(c.get("nombre").toString());
        apellido.setText(c.get("apellido").toString());
        telFijo.setText(c.get("telefono").toString());
        email.setText(c.get("mail").toString());
        celular.setText(c.get("celular").toString());
    }
    
    public void habilitarCampos(boolean b){
        apellido.setEditable(b);
        celular.setEditable(b);
        email.setEditable(b);
        nombre.setEditable(b);
        telFijo.setEditable(b); 
    }
    
    public void limpiarCampos(){
        apellido.setText("");
        celular.setText("");
        email.setText("");
        idCliente.setText("");
        nombre.setText("");
        telFijo.setText("");
    }

    public JTextField getApellido() {
        return apellido;
    }

    public JTextField getBusquedaApellido() {
        return busquedaApellido;
    }

    public JTextField getBusquedaCodigo() {
        return busquedaCodigo;
    }

    public JTextField getCelular() {
        return celular;
    }

    public JTextField getEmail() {
        return email;
    }

    public JTextField getIdCliente() {
        return idCliente;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public JTextField getTelFijo() {
        return telFijo;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        fondoImagen = new org.edisoncor.gui.panel.PanelImage();
        panelTitulo = new org.edisoncor.gui.panel.PanelImage();
        titulo = new javax.swing.JLabel();
        panelCliente = new org.edisoncor.gui.panel.PanelImage();
        labelCodigo = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        telFijo = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        articulosComprados = new javax.swing.JButton();
        celular = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        panelControlCliente = new org.edisoncor.gui.panel.PanelImage();
        nuevo = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        panelClientes = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        busquedaCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        busquedaApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(825, 407));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(822, 402));

        fondoImagen.setPreferredSize(new java.awt.Dimension(820, 400));

        panelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/fondoCliente2.jpg"))); // NOI18N
        panelTitulo.setPreferredSize(new java.awt.Dimension(329, 49));

        titulo.setFont(new java.awt.Font("Century Schoolbook L", 3, 24)); // NOI18N
        titulo.setText("CONTROL DE CLIENTES");
        panelTitulo.add(titulo);

        panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del cliente", 0, 0, new java.awt.Font("Century Schoolbook L", 3, 18))); // NOI18N
        panelCliente.setPreferredSize(new java.awt.Dimension(557, 279));
        panelCliente.setLayout(new java.awt.GridBagLayout());

        labelCodigo.setBackground(new java.awt.Color(137, 98, 59));
        labelCodigo.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        labelCodigo.setText("Código");
        labelCodigo.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 9, 0, 0);
        panelCliente.add(labelCodigo, gridBagConstraints);

        idCliente.setEditable(false);
        idCliente.setToolTipText("ID cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 152;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 11, 0, 0);
        panelCliente.add(idCliente, gridBagConstraints);

        nombre.setEditable(false);
        nombre.setToolTipText("Nombre del cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        panelCliente.add(nombre, gridBagConstraints);

        labelNombre.setBackground(new java.awt.Color(137, 98, 59));
        labelNombre.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        labelNombre.setText("Nombre");
        labelNombre.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 9, 0, 0);
        panelCliente.add(labelNombre, gridBagConstraints);

        labelTelefono.setBackground(new java.awt.Color(137, 98, 59));
        labelTelefono.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        labelTelefono.setText("Telefono Fijo");
        labelTelefono.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 9, 0, 0);
        panelCliente.add(labelTelefono, gridBagConstraints);

        telFijo.setEditable(false);
        telFijo.setToolTipText("Telefono fijo del cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 118;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        panelCliente.add(telFijo, gridBagConstraints);

        email.setEditable(false);
        email.setToolTipText("Email del cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 169;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 1, 28, 0);
        panelCliente.add(email, gridBagConstraints);

        labelEmail.setBackground(new java.awt.Color(137, 98, 59));
        labelEmail.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        labelEmail.setText("Email");
        labelEmail.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 9, 0, 0);
        panelCliente.add(labelEmail, gridBagConstraints);

        articulosComprados.setText("Articulos comprados");
        articulosComprados.setToolTipText("Articulos comprados por el cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        panelCliente.add(articulosComprados, gridBagConstraints);

        celular.setEditable(false);
        celular.setToolTipText("Telefono celular del cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 177;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 14);
        panelCliente.add(celular, gridBagConstraints);

        apellido.setEditable(false);
        apellido.setToolTipText("Apellido del cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 177;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 14);
        panelCliente.add(apellido, gridBagConstraints);

        labelApellido.setBackground(new java.awt.Color(137, 98, 59));
        labelApellido.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        labelApellido.setText("Apellido");
        labelApellido.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 18, 0, 0);
        panelCliente.add(labelApellido, gridBagConstraints);

        labelCelular.setBackground(new java.awt.Color(137, 98, 59));
        labelCelular.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        labelCelular.setText("Celular");
        labelCelular.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 24, 0, 0);
        panelCliente.add(labelCelular, gridBagConstraints);

        panelControlCliente.setLayout(new java.awt.GridLayout(1, 0));

        nuevo.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/agregar.png"))); // NOI18N
        nuevo.setToolTipText("Nuevo cliente");
        nuevo.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlCliente.add(nuevo);

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/modificar.png"))); // NOI18N
        modificar.setToolTipText("Modificar cliente ");
        modificar.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlCliente.add(modificar);

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/borrar.png"))); // NOI18N
        borrar.setToolTipText("Borrar cliente");
        borrar.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlCliente.add(borrar);

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/guardar.png"))); // NOI18N
        guardar.setToolTipText("Guardar cliente");
        guardar.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlCliente.add(guardar);

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/anterior.png"))); // NOI18N
        anterior.setToolTipText("Cliente anterior");
        anterior.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlCliente.add(anterior);

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/siguiente.png"))); // NOI18N
        siguiente.setToolTipText("Proximo cliente");
        siguiente.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlCliente.add(siguiente);

        panelClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", 0, 0, new java.awt.Font("Century Schoolbook L", 3, 18))); // NOI18N

        tabla.setAutoCreateRowSorter(true);
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Apellido", "Nombre"
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
        jScrollPane3.setViewportView(tabla);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(75);
        tabla.getColumnModel().getColumn(0).setMaxWidth(80);

        busquedaCodigo.setToolTipText("Filtrar busqueda por ID");

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        jLabel1.setText("Código");

        busquedaApellido.setToolTipText("Filtrar busqueda por apellido");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        jLabel3.setText("Apellido");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busquedaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoImagenLayout = new javax.swing.GroupLayout(fondoImagen);
        fondoImagen.setLayout(fondoImagenLayout);
        fondoImagenLayout.setHorizontalGroup(
            fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelControlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoImagenLayout.setVerticalGroup(
            fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoImagenLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoImagenLayout.createSequentialGroup()
                        .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelControlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton articulosComprados;
    private javax.swing.JButton borrar;
    private javax.swing.JTextField busquedaApellido;
    private javax.swing.JTextField busquedaCodigo;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField email;
    private org.edisoncor.gui.panel.PanelImage fondoImagen;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField idCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private org.edisoncor.gui.panel.PanelImage panelCliente;
    private org.edisoncor.gui.panel.PanelImage panelClientes;
    private org.edisoncor.gui.panel.PanelImage panelControlCliente;
    private org.edisoncor.gui.panel.PanelImage panelTitulo;
    private javax.swing.JButton siguiente;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telFijo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
