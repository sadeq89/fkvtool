/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fsvtool.controller;

import fsvtool.gui.GUIMainFrame;
import fsvtool.persistance.EntityManager;

/**
 *
 * @author Marcel
 */
public class MainController extends AbstractController {
    private final GUIMainFrame gui;
    private CreateGameController createGameController;
    private UserConfigController userConfigController;

    public MainController(EntityManager em) {
        super(em);
        this.gui = new GUIMainFrame();
        this.gui.setController(this);
        this.gui.setVisible(true);
    }
    
    public void action(java.awt.event.ActionEvent evt) {
        switch(evt.getActionCommand()) {
            case GUIMainFrame.NEUES_SPIEL:
                this.createGameController = new CreateGameController(this.em);
                break;
            case GUIMainFrame.TEILNEHMEN:
                //TO DO
                break;
            case GUIMainFrame.STORNIEREN:
                //TO DO
                break;
            case GUIMainFrame.LOGOUT:
                System.exit(0);
             case GUIMainFrame.EINSTELLUNGEN:
                this.userConfigController = new UserConfigController(this.em);
                break;
                
        }
    }
}
