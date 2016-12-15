package com.av.treeview;

import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.net.URL;

/**
 * Created by vasiliev-alexey on 15.12.16.
 */
public class TreeViewUtil {
    public static TreeView<String> getTreeView() {
        TreeItem<String> depts = new TreeItem<>("Departments");
// Add items to depts
        TreeItem<String> isDept = new TreeItem<String>("IS");




        Label  lis = new Label("Is");
        depts.setGraphic(getImageView("department"));

        isDept.setExpanded(1==1);

        TreeItem<String> claimsDept = new TreeItem<String>("Claims");
        TreeItem<String> underwritingDept = new TreeItem<String>("Underwriting");
        depts.getChildren().addAll(isDept, claimsDept, underwritingDept);

        // Add BranchExpended event handler
        depts.addEventHandler(TreeItem.<String>branchExpandedEvent(),
                e -> System.out.println("Node expanded: " + e.getSource().getValue()));
// Add BranchCollapsed event handler
        depts.addEventHandler(TreeItem.<String>branchCollapsedEvent(),
                e -> System.out.println("Node collapsed: " + e.getSource().getValue()));


// Add employees for each dept
        isDept.getChildren().addAll(new TreeItem<String>("Doug Dyer"),
                new TreeItem<String>("Jim Beeson"),
                new TreeItem<String>("Simon Ng"));
        claimsDept.getChildren().addAll(new TreeItem<String>("Lael Boyd"),
                new TreeItem<String>("Janet Biddle"));
        underwritingDept.getChildren().addAll(new TreeItem<String>("Ken McEwen"),
                new TreeItem<String>("Ken Mann"),
                new TreeItem<String>("Lola Ng"));
// Create a TreeView with depts as its root item
        TreeView<String> treeView = new TreeView<>(depts);
        return treeView;
    }

    public static ImageView getImageView(String pictName) {
        String imageStr = "picture/"+pictName+".png";
        URL imageUrl = TreeViewUtil.class.getClassLoader().getResource(imageStr);
        Image img = new Image(imageUrl.toExternalForm());
        ImageView imgView = new ImageView(img);
        return imgView;

    }



}
