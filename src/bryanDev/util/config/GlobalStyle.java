package bryanDev.util.config;

public class GlobalStyle {

    public static int[] Color1 = {0,0,20};
    public static int[] Color2 = Configuration.Color2(Color1);
    public static int[] Color3 = Configuration.Color3(Color1);
    public static int[] Color4 = Configuration.Color4(Color1);
    public static int[] Color5 = Configuration.Color5(Color1);

    private final StyleTable styleTable;
    private final StyleButton styleButton;
    private final StyleTextField styleTextField;
    private final StylePasswordField stylePasswordField;
    private final StyleFrame styleFrame;
    private final StyleTextArea styleTextArea;
    private final StyleSlider styleSlider;

    public GlobalStyle() {
        this.styleTable = new StyleTable();
        this.styleButton = new StyleButton();
        this.styleTextField = new StyleTextField();
        this.stylePasswordField = new StylePasswordField();
        this.styleFrame = new StyleFrame();
        this.styleTextArea = new StyleTextArea();
        this.styleSlider = new StyleSlider();
    }

    public StyleTable Table() {
        return styleTable;
    }

    public StyleButton Button() {
        return styleButton;
    }

    public StyleTextField TextField() {
        return styleTextField;
    }

    public StylePasswordField PasswordField() {
        return stylePasswordField;
    }

    public StyleFrame Frame() {
        return styleFrame;
    }

    public StyleTextArea TextArea() {
        return styleTextArea;
    }
    
     public StyleSlider Slider() {
        return styleSlider;
    }

    private static GlobalStyle instance;

    public static GlobalStyle getInstance() {
        if (instance == null) {
            instance = new GlobalStyle();
        }
        return instance;
    }
}
