package projetpizzeria;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageAcceuil extends JFrame {

	 
	private static final long serialVersionUID = 1L;

	public PageAcceuil() {
	      initComponents();
	    }

	// BackGround Color = #ffa1ac
	private void initComponents() {
	        // Propri�t�s de la fen�tre
	        setTitle("Bella Pizza - Page d'Accueil");
	        setSize(1300, 700);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        // Cr�ation des composants
	        JLabel welcomeLabel = new JLabel("Bienvenue chez Bella Pizza !");
	        JButton menuButton = new JButton("Voir le Menu");
	        JButton ordersButton = new JButton("G�rer les Commandes");
	        JButton statsButton = new JButton("Voir les Statistiques");
	        JButton exitButton = new JButton("Quitter");

	        // Ajout des �couteurs d'�v�nements
	        menuButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Logique pour afficher le menu
	                System.out.println("Affichage du menu des pizzas");
	                new MenuFrame().setVisible(true);
	            }
	        });

	        ordersButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Logique pour g�rer les commandes
	                System.out.println("Gestion des commandes");
	                new OrdersFrame().setVisible(true);
	            }
	        });

	        statsButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Logique pour afficher les statistiques
	                System.out.println("Affichage des statistiques");
	                new StatsFrame().setVisible(true);
	            }
	        });

	        exitButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });

	        // Ajout des composants au panneau
	        JPanel panel = new JPanel();
	        panel.add(welcomeLabel);
	        panel.add(menuButton);
	        panel.add(ordersButton);
	        panel.add(statsButton);
	        panel.add(exitButton);

	        // Ajout du panneau � la fen�tre
	        add(panel, BorderLayout.CENTER);
	    }

	  
	    }


