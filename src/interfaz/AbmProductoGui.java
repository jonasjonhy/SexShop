/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nico
 */
public class AbmProductoGui extends javax.swing.JPanel {

    DefaultTableModel tablaArticulos; //Tabla Default para tener las opciones de instar y elimnar filas
    JPopupMenu popUpMenuTabla;         //popUp sobre la tabla al hacer click derecho
    JMenuItem modificarPrecioPorcentaje;          //menu del popUp
    JMenuItem modificarPrecioPesos;

    /**
     * Creates new form AbmProductoGui
     */
    public AbmProductoGui() {
        initComponents();
        tablaArticulos = (DefaultTableModel) tabla.getModel(); //convierto la tabla
        popUpMenu();    //inicializo el  popUp
        tabla.setComponentPopupMenu(popUpMenuTabla);//agrego el popUp a la tabla
    }

    //especie de constructor del popUp
    private void popUpMenu() {
        popUpMenuTabla = new JPopupMenu();
        modificarPrecioPorcentaje = new JMenuItem("Modificar precio de venta en %");
        popUpMenuTabla.add(modificarPrecioPorcentaje);
        modificarPrecioPesos= new JMenuItem("Modificar precio de venta en $");
        popUpMenuTabla.add(modificarPrecioPesos);
    }

    public void setActionListener(ActionListener lis) {
        this.guardar.addActionListener(lis);
        this.borrar.addActionListener(lis);
        this.nuevo.addActionListener(lis);
        this.siguiente.addActionListener(lis);
        this.anterior.addActionListener(lis);
        this.modificar.addActionListener(lis);
        this.modificarPrecioPorcentaje.addActionListener(lis);
        this.modificarPrecioPesos.addActionListener(lis);
    }

    public void habilitarCampos(boolean b){
        marca.setEditable(b);
        stock.setEditable(b);
        tipo.setEditable(b);
        idArticulo.setEditable(b);
        nombre.setEditable(b);
        precioCompra.setEditable(b);
        precioVenta.setEditable(b);
        proveedores.setEditable(b);
    }
    
    public void limpiarCampos(){
        marca.setText("");
        stock.setText("");
        tipo.setText("");
        idArticulo.setText("");
        nombre.setText("");
        precioCompra.setText("");
        precioVenta.setText("");
    }
    
    //retorno la tabla default de los articulos
    public DefaultTableModel getTablaArticulos() {
        return tablaArticulos;
    }

    public JTextField getBusquedaCodigo() {
        return busquedaCodigo;
    }

    public JTextField getBusquedaMarca() {
        return busquedaMarca;
    }

    public JTextField getBusquedaNombre() {
        return busquedaNombre;
    }

    public JTextField getIdArticulo() {
        return idArticulo;
    }

    public JTextField getMarca() {
        return marca;
    }

    public JTextField getNombre() {
        return nombre;
    }


    public JComboBox getProveedores() {
        return proveedores;
    }

    public JTextField getStock() {
        return stock;
    }

    public JTextField getTipo() {
        return tipo;
    }

    public JButton getAnterior() {
        return anterior;
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

    public JMenuItem getModificarPrecioPorcentaje() {
        return modificarPrecioPorcentaje;
    }
    
        public JMenuItem getModificarPrecioPesos() {
        return modificarPrecioPesos;
    }

    public JTextField getPrecioCompra() {
        return precioCompra;
    }

    public JTextField getPrecioVenta() {
        return precioVenta;
    }
        
        

    //retorno la tabla original (se usa solo para ver los seleccionados, en otros casos se debe usar la default)
    public JTable getTabla() {
        return tabla;
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
        panelControlArticulo = new org.edisoncor.gui.panel.PanelImage();
        nuevo = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        panelArticulo = new org.edisoncor.gui.panel.PanelImage();
        labelCodigo = new javax.swing.JLabel();
        idArticulo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        labelProveedor = new javax.swing.JLabel();
        precioCompra = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        labelTipo = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        proveedores = new javax.swing.JComboBox();
        labelStock = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        precioVenta = new javax.swing.JTextField();
        panelArticulos = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        labelBusquedaCodigo = new javax.swing.JLabel();
        labelBusquedaNombre = new javax.swing.JLabel();
        labelBusquedaMarca = new javax.swing.JLabel();
        busquedaCodigo = new javax.swing.JTextField();
        busquedaNombre = new javax.swing.JTextField();
        busquedaMarca = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(825, 407));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(822, 402));

        fondoImagen.setPreferredSize(new java.awt.Dimension(820, 400));

        panelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/fondoCliente2.jpg"))); // NOI18N
        panelTitulo.setPreferredSize(new java.awt.Dimension(329, 49));

        titulo.setFont(new java.awt.Font("Century Schoolbook L", 3, 24)); // NOI18N
        titulo.setText("CONTROL DE ARTICULOS");
        panelTitulo.add(titulo);

        panelControlArticulo.setLayout(new java.awt.GridLayout(1, 0));

        nuevo.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/agregar.png"))); // NOI18N
        nuevo.setToolTipText("Articulo nuevo");
        nuevo.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlArticulo.add(nuevo);

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/modificar.png"))); // NOI18N
        modificar.setToolTipText("Modificar articulo");
        modificar.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlArticulo.add(modificar);

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/borrar.png"))); // NOI18N
        borrar.setToolTipText("Borrar articulo");
        borrar.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlArticulo.add(borrar);

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/guardar.png"))); // NOI18N
        guardar.setToolTipText("Guardar articulo");
        guardar.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlArticulo.add(guardar);

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/anterior.png"))); // NOI18N
        anterior.setToolTipText("Articulo anterior");
        anterior.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlArticulo.add(anterior);

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Icons/siguiente.png"))); // NOI18N
        siguiente.setToolTipText("Proximo articulo");
        siguiente.setPreferredSize(new java.awt.Dimension(70, 70));
        panelControlArticulo.add(siguiente);

        panelArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del artículo", 0, 0, new java.awt.Font("Century Schoolbook L", 3, 18))); // NOI18N
        panelArticulo.setPreferredSize(new java.awt.Dimension(557, 279));
        panelArticulo.setLayout(new java.awt.GridBagLayout());

        labelCodigo.setBackground(new java.awt.Color(137, 98, 59));
        labelCodigo.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelCodigo.setText("Código");
        labelCodigo.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 15, 0, 0);
        panelArticulo.add(labelCodigo, gridBagConstraints);

        idArticulo.setEditable(false);
        idArticulo.setToolTipText("ID articulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 152;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 11, 0, 0);
        panelArticulo.add(idArticulo, gridBagConstraints);

        nombre.setEditable(false);
        nombre.setToolTipText("Nombre del articulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        panelArticulo.add(nombre, gridBagConstraints);

        labelNombre.setBackground(new java.awt.Color(137, 98, 59));
        labelNombre.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelNombre.setText("Nombre");
        labelNombre.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 15, 0, 0);
        panelArticulo.add(labelNombre, gridBagConstraints);

        labelMarca.setBackground(new java.awt.Color(137, 98, 59));
        labelMarca.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelMarca.setText("Marca");
        labelMarca.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 15, 0, 0);
        panelArticulo.add(labelMarca, gridBagConstraints);

        marca.setEditable(false);
        marca.setToolTipText("Marca del articulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 10, 0, 0);
        panelArticulo.add(marca, gridBagConstraints);

        labelProveedor.setBackground(new java.awt.Color(137, 98, 59));
        labelProveedor.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelProveedor.setText("Proveedor");
        labelProveedor.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 15, 0, 0);
        panelArticulo.add(labelProveedor, gridBagConstraints);

        precioCompra.setEditable(false);
        precioCompra.setToolTipText("Precio del articulo para la compra(Numero real)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 24);
        panelArticulo.add(precioCompra, gridBagConstraints);

        tipo.setEditable(false);
        tipo.setToolTipText("Tipo del articulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 189;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 8, 0, 24);
        panelArticulo.add(tipo, gridBagConstraints);

        labelTipo.setBackground(new java.awt.Color(137, 98, 59));
        labelTipo.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelTipo.setText("Tipo");
        labelTipo.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(55, 12, 0, 0);
        panelArticulo.add(labelTipo, gridBagConstraints);

        labelPrecio.setBackground(new java.awt.Color(137, 98, 59));
        labelPrecio.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelPrecio.setText("Precio de compra");
        labelPrecio.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 12, 0, 0);
        panelArticulo.add(labelPrecio, gridBagConstraints);

        proveedores.setToolTipText("Proveedor del articulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 22, 0);
        panelArticulo.add(proveedores, gridBagConstraints);

        labelStock.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelStock.setText("Stock");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 16, 0, 0);
        panelArticulo.add(labelStock, gridBagConstraints);

        stock.setEditable(false);
        stock.setToolTipText("Stock del articulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 27, 22, 0);
        panelArticulo.add(stock, gridBagConstraints);

        jLabel1.setText("Precio de venta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 10, 0, 0);
        panelArticulo.add(jLabel1, gridBagConstraints);

        precioVenta.setEditable(false);
        precioVenta.setToolTipText("Precio del producto para la venta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 18, 0, 24);
        panelArticulo.add(precioVenta, gridBagConstraints);

        panelArticulos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Artículos", 0, 0, new java.awt.Font("Century Schoolbook L", 3, 18))); // NOI18N

        tabla.setAutoCreateRowSorter(true);
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nombre", "Marca"
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
        jScrollPane5.setViewportView(tabla);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(80);
        tabla.getColumnModel().getColumn(0).setMaxWidth(80);

        labelBusquedaCodigo.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelBusquedaCodigo.setText("Código");

        labelBusquedaNombre.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelBusquedaNombre.setText("Nombre");

        labelBusquedaMarca.setFont(new java.awt.Font("Century Schoolbook L", 0, 15)); // NOI18N
        labelBusquedaMarca.setText("Marca");

        busquedaCodigo.setToolTipText("Filtrar por código");

        busquedaNombre.setToolTipText("Filtrar por nombre");

        busquedaMarca.setToolTipText("Filtrar por marca");

        javax.swing.GroupLayout panelArticulosLayout = new javax.swing.GroupLayout(panelArticulos);
        panelArticulos.setLayout(panelArticulosLayout);
        panelArticulosLayout.setHorizontalGroup(
            panelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArticulosLayout.createSequentialGroup()
                        .addComponent(labelBusquedaMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelArticulosLayout.createSequentialGroup()
                        .addComponent(labelBusquedaCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelArticulosLayout.createSequentialGroup()
                        .addComponent(labelBusquedaNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelArticulosLayout.setVerticalGroup(
            panelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArticulosLayout.createSequentialGroup()
                .addGroup(panelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBusquedaCodigo)
                    .addComponent(busquedaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBusquedaNombre)
                    .addComponent(busquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBusquedaMarca)
                    .addComponent(busquedaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoImagenLayout = new javax.swing.GroupLayout(fondoImagen);
        fondoImagen.setLayout(fondoImagenLayout);
        fondoImagenLayout.setHorizontalGroup(
            fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelControlArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        fondoImagenLayout.setVerticalGroup(
            fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoImagenLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoImagenLayout.createSequentialGroup()
                        .addComponent(panelArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelControlArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JButton borrar;
    private javax.swing.JTextField busquedaCodigo;
    private javax.swing.JTextField busquedaMarca;
    private javax.swing.JTextField busquedaNombre;
    private org.edisoncor.gui.panel.PanelImage fondoImagen;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField idArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelBusquedaCodigo;
    private javax.swing.JLabel labelBusquedaMarca;
    private javax.swing.JLabel labelBusquedaNombre;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelProveedor;
    private javax.swing.JLabel labelStock;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JTextField marca;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private org.edisoncor.gui.panel.PanelImage panelArticulo;
    private org.edisoncor.gui.panel.PanelImage panelArticulos;
    private org.edisoncor.gui.panel.PanelImage panelControlArticulo;
    private org.edisoncor.gui.panel.PanelImage panelTitulo;
    private javax.swing.JTextField precioCompra;
    private javax.swing.JTextField precioVenta;
    private javax.swing.JComboBox proveedores;
    private javax.swing.JButton siguiente;
    private javax.swing.JTextField stock;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tipo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
