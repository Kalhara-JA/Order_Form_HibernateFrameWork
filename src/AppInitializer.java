import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.List;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        setItemDetailsIfEmpty();

        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm.fxml"))));
        primaryStage.show();

    }

    private void setItemDetailsIfEmpty() {
        try (Session session = HibernateUtil.createSession()) {
            Query from_item = session.createQuery("FROM Item");
            List list = from_item.list();
            if (list.isEmpty()) {
                Item i1 = new Item("I1", new DescriptionData("Item 1 Desc 1", "Item 1 Desc 2"), 2500.0, 20);
                Item i2 = new Item("I2", new DescriptionData("Item 2 Desc 1", "Item 2 Desc 2"), 2000.0, 30);
                Item i3 = new Item("I3", new DescriptionData("Item 3 Desc 1", "Item 3 Desc 2"), 1500.0, 40);
                Item i4 = new Item("I4", new DescriptionData("Item 4 Desc 1", "Item 4 Desc 2"), 1800.0, 50);
                Item i5 = new Item("I5", new DescriptionData("Item 5 Desc 1", "Item 5 Desc 2"), 3000.0, 60);

                Transaction transaction = session.beginTransaction();
                session.save(i1);
                session.save(i2);
                session.save(i3);
                session.save(i4);
                session.save(i5);

                new Alert(Alert.AlertType.CONFIRMATION, "Item saved").show();
                transaction.commit();
            }
        }
    }
}
