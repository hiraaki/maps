package models;

/**
 * Created by mhi on 31/03/17.
 */
public class Esquina {
    private int id;
    private Position position;
    private int id_rua;
    private int id_rua2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getId_rua() {
        return id_rua;
    }

    public void setId_rua(int id_rua) {
        this.id_rua = id_rua;
    }

    public int getId_rua2() {
        return id_rua2;
    }

    public void setId_rua2(int id_rua2) {
        this.id_rua2 = id_rua2;
    }
}
