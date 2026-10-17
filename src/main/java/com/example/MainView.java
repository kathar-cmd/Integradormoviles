package com.example;

import com.example.model.Contacto;
import com.example.model.Libro;
import com.example.model.Prestamo;
import com.example.model.Usuario;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Sistema Prestamo de Libros CESDE - CRUD")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H2 titulo = new H2("Sistema Prestamo de Libros CESDE - CRUD");

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidthFull();

        tabSheet.add("Usuario", crearSeccionUsuario());
        tabSheet.add("Contacto", crearSeccionContacto());
        tabSheet.add("Libros", crearSeccionLibro());
        tabSheet.add("Prestamo  ", crearSeccionPrestamo());

        add(titulo, tabSheet);
    }

    
    private Component crearSeccionUsuario() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID Usuario");
        TextField nombreField = new TextField("Nombre");
        TextField tipoDocumentoField = new TextField("Tipo de documento");
        TextField documentoField = new TextField("Documento");
        TextField rolField = new TextField("Rol");
        TextField idContactoField = new TextField("ID Contacto");

        FormLayout form = new FormLayout(idField, nombreField, tipoDocumentoField,
                documentoField, rolField, idContactoField);

        Button btnCrear = new Button("Crear", e ->
            Notification.show("Usuario - Crear: " + nombreField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e ->
            Notification.show("Usuario - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e ->
            Notification.show("Usuario - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e ->
            Notification.show("Usuario - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            tipoDocumentoField.clear();
            documentoField.clear();
            rolField.clear();
            idContactoField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<Usuario> grid = new Grid<>(Usuario.class, false);
        grid.addColumn(Usuario::getIdUsuario).setHeader("ID Usuario").setAutoWidth(true);
        grid.addColumn(Usuario::getNombre).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(Usuario::getTipoDocumento).setHeader("Tipo de documento").setAutoWidth(true);
        grid.addColumn(Usuario::getDocumento).setHeader("Documento").setAutoWidth(true);
        grid.addColumn(Usuario::getRol).setHeader("Rol").setAutoWidth(true);
        grid.addColumn(Usuario::getIdContacto).setHeader("ID Contacto").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    
    private Component crearSeccionContacto() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID Contacto");
        TextField correoField = new TextField("Correo");
        TextField telefonoField = new TextField("Teléfono");
        TextField direccionField = new TextField("Dirección");

        FormLayout form = new FormLayout(idField, correoField, telefonoField, direccionField);

        Button btnCrear = new Button("Crear", e ->
            Notification.show("Contacto - Crear: " + correoField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e ->
            Notification.show("Contacto - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e ->
            Notification.show("Contacto - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e ->
            Notification.show("Contacto - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            correoField.clear();
            telefonoField.clear();
            direccionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<Contacto> grid = new Grid<>(Contacto.class, false);
        grid.addColumn(Contacto::getIdcontacto).setHeader("ID Contacto").setAutoWidth(true);
        grid.addColumn(Contacto::getCorreo).setHeader("Correo").setAutoWidth(true);
        grid.addColumn(Contacto::getTelefono).setHeader("Teléfono").setAutoWidth(true);
        grid.addColumn(Contacto::getDireccion).setHeader("Dirección").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    
    private Component crearSeccionLibro() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID Libro");
        TextField nombreField = new TextField("Nombre");
        TextField generoField = new TextField("Género");
        TextField seccionField = new TextField("Sección");
        TextField ejemplaresField = new TextField("Ejemplares");
        TextField anioField = new TextField("Año de publicación");

        FormLayout form = new FormLayout(idField, nombreField, generoField,
                seccionField, ejemplaresField, anioField);

        Button btnCrear = new Button("Crear", e ->
            Notification.show("Libro - Crear: " + nombreField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e ->
            Notification.show("Libro - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e ->
            Notification.show("Libro - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e ->
            Notification.show("Libro - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            generoField.clear();
            seccionField.clear();
            ejemplaresField.clear();
            anioField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<Libro> grid = new Grid<>(Libro.class, false);
        grid.addColumn(Libro::getIdLibro).setHeader("ID Libro").setAutoWidth(true);
        grid.addColumn(Libro::getNombre).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(Libro::getGenero).setHeader("Género").setAutoWidth(true);
        grid.addColumn(Libro::getSeccion).setHeader("Sección").setAutoWidth(true);
        grid.addColumn(Libro::getEjemplares).setHeader("Ejemplares").setAutoWidth(true);
        grid.addColumn(Libro::getAnioPublicacion).setHeader("Año de publicación").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    
    private Component crearSeccionPrestamo() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID Préstamo");
        TextField idUsuarioField = new TextField("ID Usuario");
        TextField idLibroField = new TextField("ID Libro");
        DatePicker fechaPrestamoField = new DatePicker("Fecha de préstamo");
        DatePicker fechaEntregaField = new DatePicker("Fecha de entrega");
        TextField cantidadField = new TextField("Cantidad de libros");

        FormLayout form = new FormLayout(idField, idUsuarioField, idLibroField,
                fechaPrestamoField, fechaEntregaField, cantidadField);

        Button btnCrear = new Button("Crear", e ->
            Notification.show("Préstamo - Crear: " + idField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e ->
            Notification.show("Préstamo - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e ->
            Notification.show("Préstamo - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e ->
            Notification.show("Préstamo - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            idUsuarioField.clear();
            idLibroField.clear();
            fechaPrestamoField.clear();
            fechaEntregaField.clear();
            cantidadField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<Prestamo> grid = new Grid<>(Prestamo.class, false);
        grid.addColumn(Prestamo::getIdPrestamo).setHeader("ID Préstamo").setAutoWidth(true);
        grid.addColumn(Prestamo::getIdUsuario).setHeader("ID Usuario").setAutoWidth(true);
        grid.addColumn(Prestamo::getIdLibro).setHeader("ID Libro").setAutoWidth(true);
        grid.addColumn(Prestamo::getFechaPrestamo).setHeader("Fecha de préstamo").setAutoWidth(true);
        grid.addColumn(Prestamo::getFechaEntrega).setHeader("Fecha de entrega").setAutoWidth(true);
        grid.addColumn(Prestamo::getCantidadLibros).setHeader("Cantidad de libros").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }
}
