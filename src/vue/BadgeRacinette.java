package vue;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BadgeRacinette extends AnchorPane{
	public enum COULEUR_DAUPHIN{BLEU, ROSE};
	public enum COULEUR{ROUGE, BLEU, JAUNE, NOIR};

	public BadgeRacinette() {
		//AnchorPane this = new AnchorPane();
		this.setPrefHeight(200);
		this.setPrefWidth(166);
		this.setStyle("-fx-background-color:red");
		
		ImageView ecusson = new ImageView();
		ecusson.setImage(new Image("vue/badge/armoirie.png"));
		this.getChildren().add(ecusson);
		
		this.setVagues();
		this.getChildren().add(vagues);
		
		this.setDauphinRose();
		this.getChildren().add(dauphinRose);
		
		this.setDauphinBleu(COULEUR_DAUPHIN.BLEU);
		this.getChildren().add(dauphinBleu);
		
		Label motto = new Label();
		motto.setText("RACINETTE!!");
		motto.setStyle("-fx-font:25px Tahoma; -fx-font-weight-bold;");
		motto.setLayoutX(30);
		motto.setLayoutY(190);
		this.getChildren().add(motto);
	}
	
	protected ImageView dauphinBleu = new ImageView();
	public void setDauphinBleu(COULEUR_DAUPHIN couleur) {
		dauphinBleu.setImage(new Image("vue/badge/dauphin-bleu.png"));
		dauphinBleu.setLayoutX(160);
		dauphinBleu.setLayoutY(80);
		dauphinBleu.setScaleX(-1);
	}
	
	protected ImageView dauphinRose = new ImageView();
	public void setDauphinRose() {
		dauphinRose.setImage(new Image("vue/badge/dauphin-rose.png"));
		dauphinRose.setLayoutX(40);
		dauphinRose.setLayoutY(80);
	}
	
	protected ImageView vagues = new ImageView();
	public void setVagues() {
		vagues.setImage(new Image("vue/badge/vagues-rondes.png"));
		vagues.setScaleX(0.2);
		vagues.setScaleY(0.2);
		vagues.setLayoutX(54);
		vagues.setLayoutY(240);
	}
	
	public void setCouleur(COULEUR couleur) {
		this.setStyle("-fx-background-color:red");
	}
	
	public BadgeRacinette ALaRacinetteBrune() {
		this.setDauphinBleu(COULEUR_DAUPHIN.ROSE);
		return this;
	}
}
