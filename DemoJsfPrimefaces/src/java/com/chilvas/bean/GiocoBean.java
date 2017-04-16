package com.chilvas.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;

@ManagedBean
@ViewScoped
//@SessionScoped
public class GiocoBean {

    private final String ANAGRAFICA_PAGE = "anagrafica";
    private final String ANAGRAFICA_DEL_GIOCO_PAGE = "anagraficaDelGioco";
    private final String VARIANTE_PAGE = "variante";
    private String pageSelected = "";
    private boolean anagraficaDone = false;
    private boolean anagraficaDelGiocoDone = false;
    private boolean varianteDone = false;

    public boolean isAnagraficaDone() {
        return anagraficaDone;
    }

    public void setAnagraficaDone(boolean anagraficaDone) {
        this.anagraficaDone = anagraficaDone;
    }

    public boolean isAnagraficaDelGiocoDone() {
        return anagraficaDelGiocoDone;
    }

    public void setAnagraficaDelGiocoDone(boolean anagraficaDelGiocoDone) {
        this.anagraficaDelGiocoDone = anagraficaDelGiocoDone;
    }

    public boolean isVarianteDone() {
        return varianteDone;
    }

    public void setVarianteDone(boolean varianteDone) {
        this.varianteDone = varianteDone;
    }

    public void goAnagrafica(ActionEvent event) {
        pageSelected = ANAGRAFICA_PAGE;
    }

    public void goAnagraficaDelGioco(ActionEvent event) {
        pageSelected = ANAGRAFICA_DEL_GIOCO_PAGE;
    }

    public void goVariante(ActionEvent event) {
        pageSelected = VARIANTE_PAGE;
    }

    public GiocoBean() {
        pageSelected = ANAGRAFICA_PAGE;
    }

    public String getPageSelected() {
        return pageSelected;
    }

    public void setPageSelected(String pageSelected) {
        this.pageSelected = pageSelected;
    }

    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    //ANAGRAFICA - Check when click confirm
    public void confirmAnagrafica() {
        //Check condition
        if (true) {
            anagraficaDone = true;
            addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirm OK", "Successful"));
            //Call javascript function when done.
            RequestContext.getCurrentInstance().execute("anagraficaDone();");
        } else {
            addMessage(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Confirm error:", "There are some errors in BL. Please try again."));
        }
    }

    //ANAGRAGICA DEL GIOCO - Check when click confirm
    public void confirmAnagraficaDelGioco() {
        //Check condition
        addMessage(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Confirm error:", "There are some errors in BL. Please try again."));
    }

    //VARIANTE - Check when click confirm
    public void confirmVariante() {
        //Check condition
        addMessage(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Confirm error:", "There are some errors in BL. Please try again."));
    }
}
