package ufr_ndef_package;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static ufr_ndef_package.UfrCoder.GetLibFullPath;
import ufr_ndef_package.UfrCoder.uFrFunctions;

/**
 *
 * @author Aleksandar
 */
public class UfrNdefForm extends javax.swing.JFrame {

    uFrFunctions ufr;
    int ufr_status = 0;
    int num = 0;
    boolean wifi_bulk = false;
    boolean uri_bulk = false;
    boolean bt_bulk = false;
    boolean sms_bulk = false;
    boolean location_bulk = false;
    boolean destination_bulk = false;
    boolean email_bulk = false;
    boolean address_bulk = false;
    boolean application_bulk = false;
    boolean text_bulk = false;
    boolean sw_bulk = false;
    boolean phone_bulk = false;
    boolean contact_bulk = false;
    boolean bitcoin_bulk = false;
    boolean skype_bulk = false;
    boolean viber_bulk = false;
    boolean whatsapp_bulk = false;
    boolean raw_bulk = false;
    
    public UfrNdefForm() {
        initComponents();
        try {
            ufr = (uFrFunctions) Native.loadLibrary(GetLibFullPath(false), uFrFunctions.class);
        } catch (UnsatisfiedLinkError e) {
            JOptionPane.showMessageDialog(null, "Unable to load library for path : " + GetLibFullPath(false));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Wifi_RB = new javax.swing.ButtonGroup();
        URI_RB_Group = new javax.swing.ButtonGroup();
        BT_RB_Group = new javax.swing.ButtonGroup();
        SMS_RB_Group = new javax.swing.ButtonGroup();
        Location_RB_Group = new javax.swing.ButtonGroup();
        Destination_RB_Group = new javax.swing.ButtonGroup();
        Email_RB_Group = new javax.swing.ButtonGroup();
        Address_RB_Group = new javax.swing.ButtonGroup();
        Application_RB_Group = new javax.swing.ButtonGroup();
        Text_RB_Group = new javax.swing.ButtonGroup();
        StreetView_RB_Group = new javax.swing.ButtonGroup();
        Phone_RB_Group = new javax.swing.ButtonGroup();
        Contact_RB_Group = new javax.swing.ButtonGroup();
        Bitcoin_RB_Group = new javax.swing.ButtonGroup();
        Skype_RB_Group = new javax.swing.ButtonGroup();
        Viber_RB_Group = new javax.swing.ButtonGroup();
        Whatsapp_RB_Group = new javax.swing.ButtonGroup();
        RAW_RB_Group = new javax.swing.ButtonGroup();
        btnReaderOpen = new java.awt.Button();
        UseAdvanced = new javax.swing.JCheckBox();
        TF_ReaderType = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_PortName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_PortInterface = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_Arg = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnNdefInitialize = new javax.swing.JButton();
        btnEraseLastRecord = new javax.swing.JButton();
        btnEraseAllNdefRecords = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnStartEEPROMEmulation = new javax.swing.JButton();
        btnStartRamEmulation = new javax.swing.JButton();
        btnStopEEPROMEmulation = new javax.swing.JButton();
        btnStopRamEmulation = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        SSID_Read_TF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        AuthType_Read_TF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Encryption_Read_TF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Password_Read_TF = new javax.swing.JTextField();
        btnWiFiRead = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        SSID_Write_TF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AuthType_Write_CB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Encryption_Write_CB = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        Password_Write_TF = new javax.swing.JTextField();
        Wifi_RB_Tag = new javax.swing.JRadioButton();
        Wifi_RB_Eeprom = new javax.swing.JRadioButton();
        Wifi_RB_Ram = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        btnWriteWifi = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Wifi_Num_Tags = new javax.swing.JTextField();
        btnWifiBulkStart = new javax.swing.JButton();
        btnWifiBulkStop = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Wifi_Remaining_Bulk = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        URI_Read_TF = new javax.swing.JTextField();
        btnURIRead = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        URI_Write_TF = new javax.swing.JTextField();
        btnURIWrite = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        URI_Identifier_CB = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        URI_RB_Tag = new javax.swing.JRadioButton();
        URI_RB_Eeprom = new javax.swing.JRadioButton();
        URI_RB_Ram = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        URI_Num_Tags = new javax.swing.JTextField();
        btnURIBulkStart = new javax.swing.JButton();
        btnURIBulkStop = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        URI_Remaining_Bulk = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        BT_Read_TF = new javax.swing.JTextField();
        btnBluetoothRead = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        BT_Write_TF = new javax.swing.JTextField();
        btnBluetoothWrite = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        BT_RB_Tag = new javax.swing.JRadioButton();
        BT_RB_Eeprom = new javax.swing.JRadioButton();
        BT_RB_Ram = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        BT_Num_Tags = new javax.swing.JTextField();
        btnBTBulkStart = new javax.swing.JButton();
        btnBTiBulkStop = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        BT_Remaining_Bulk = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        SMS_Phone_Read_TF = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        btnSMSRead = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SMS_Message_Read_TF = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        SMS_Phone_Write_TF = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnSMSWrite = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        SMS_RB_Tag = new javax.swing.JRadioButton();
        SMS_RB_Eeprom = new javax.swing.JRadioButton();
        SMS_RB_Ram = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        SMS_Num_Tags = new javax.swing.JTextField();
        btnSMSBulkStart = new javax.swing.JButton();
        btnSMSBulkStop = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        SMS_Remaining_Bulk = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SMS_Message_Write_TF = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabelbr37 = new javax.swing.JLabel();
        Location_Latitude_Read_TF = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        Location_Longitude_Read_TF = new javax.swing.JTextField();
        btnLocationRead = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabelbr38 = new javax.swing.JLabel();
        Location_Latitude_Write_TF = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        Location_Longitude_Write_TF = new javax.swing.JTextField();
        btnLocationWrite = new javax.swing.JButton();
        Location_RB_Eeprom = new javax.swing.JRadioButton();
        Location_RB_Tag = new javax.swing.JRadioButton();
        Location_RB_Ram = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        Location_Num_Tags = new javax.swing.JTextField();
        btnLocationBulkStart = new javax.swing.JButton();
        btnLocationBulkStop = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        Location_Remaining_Bulk = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        Destination_Read_TF = new javax.swing.JTextField();
        btnDestinationRead = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        Destination_Write_TF = new javax.swing.JTextField();
        btnDestinationWrite = new javax.swing.JButton();
        Destination_RB_Tag = new javax.swing.JRadioButton();
        Destination_RB_Ram = new javax.swing.JRadioButton();
        Destination_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel44 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        Destination_Num_Tags = new javax.swing.JTextField();
        btnDestinationBulkStart = new javax.swing.JButton();
        btnDestinationBulkStop = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        Destination_Remaining_Bulk = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        EmailAddress_Read_TF = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        Subject_Read_TF = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        btnEmailRead = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        EmailMessage_Read_TF = new javax.swing.JTextArea();
        jPanel29 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        EmailAddress_Write_TF = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        Subject_Write_TF = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        btnEmailWrite = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        EmailMessage_Write_TF = new javax.swing.JTextArea();
        Email_RB_Tag = new javax.swing.JRadioButton();
        Email_RB_Ram = new javax.swing.JRadioButton();
        Email_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel53 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        Email_Num_Tags = new javax.swing.JTextField();
        btnEmailBulkStart = new javax.swing.JButton();
        btnEmailBulkStop = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        Email_Remaining_Bulk = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        Address_Read_TF = new javax.swing.JTextField();
        btnAddressRead = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        Address_Write_TF = new javax.swing.JTextField();
        btnAddressWrite = new javax.swing.JButton();
        Address_RB_Tag = new javax.swing.JRadioButton();
        Address_RB_Ram = new javax.swing.JRadioButton();
        Address_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel58 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        Address_Num_Tags = new javax.swing.JTextField();
        btnAddressBulkStart = new javax.swing.JButton();
        btnAddressBulkStop = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        Address_Remaining_Bulk = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        Application_Read_TF = new javax.swing.JTextField();
        btnApplicationRead = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        Application_Write_TF = new javax.swing.JTextField();
        btnApplicationWrite = new javax.swing.JButton();
        Application_RB_Tag = new javax.swing.JRadioButton();
        Application_RB_Ram = new javax.swing.JRadioButton();
        Application_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        Application_Num_Tags = new javax.swing.JTextField();
        btnApplicationBulkStart = new javax.swing.JButton();
        btnApplicationBulkStop = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        Application_Remaining_Bulk = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        btnTextRead = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Text_Read_TF = new javax.swing.JTextArea();
        jPanel43 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        btnTextWrite = new javax.swing.JButton();
        Text_RB_Tag = new javax.swing.JRadioButton();
        Text_RB_Ram = new javax.swing.JRadioButton();
        Text_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel68 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        Text_Num_Tags = new javax.swing.JTextField();
        btnTextBulkStart = new javax.swing.JButton();
        btnTextBulkStop = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        Text_Remaining_Bulk = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Text_Write_TF = new javax.swing.JTextArea();
        jPanel34 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabelbr39 = new javax.swing.JLabel();
        StreetView_Latitude_Read_TF = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        StreetView_Longitude_Read_TF = new javax.swing.JTextField();
        btnStreetViewRead = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        jLabelbr40 = new javax.swing.JLabel();
        StreetView_Latitude_Write_TF = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        StreetView_Longitude_Write_TF = new javax.swing.JTextField();
        btnStreetViewWrite = new javax.swing.JButton();
        StreetView_RB_Eeprom = new javax.swing.JRadioButton();
        StreetView_RB_Tag = new javax.swing.JRadioButton();
        StreetView_RB_Ram = new javax.swing.JRadioButton();
        jLabel73 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        StreetView_Num_Tags = new javax.swing.JTextField();
        StreetViewBulkStart = new javax.swing.JButton();
        btnStreetViewBulkStop = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        StreetView_Remaining_Bulk = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        Phone_Read_TF = new javax.swing.JTextField();
        btnPhoneRead = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        Phone_Write_TF = new javax.swing.JTextField();
        btnPhoneWrite = new javax.swing.JButton();
        Phone_RB_Tag = new javax.swing.JRadioButton();
        Phone_RB_Ram = new javax.swing.JRadioButton();
        Phone_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel78 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        Phone_Num_Tags = new javax.swing.JTextField();
        btnPhoneBulkStart = new javax.swing.JButton();
        btnPhoneBulkStop = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        Phone_Remaining_Bulk = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        btnContactRead = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        Contact_Read_TF = new javax.swing.JTextArea();
        jPanel52 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        Contact_Name_TF = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        Contact_Company_TF = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        Contact_Address_TF = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        Contact_Phone_TF = new javax.swing.JTextField();
        btnWriteContact = new javax.swing.JButton();
        asdfasdfasfd = new javax.swing.JLabel();
        Contact_Email_TF = new javax.swing.JTextField();
        asdfasdfasfd1 = new javax.swing.JLabel();
        Contact_Website_TF = new javax.swing.JTextField();
        Contact_RB_Tag = new javax.swing.JRadioButton();
        Contact_RB_Ram = new javax.swing.JRadioButton();
        Contact_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel86 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        Contact_Num_Tags = new javax.swing.JTextField();
        btnContactBulkStart = new javax.swing.JButton();
        btnContactBulkStop = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        Contact_Remaining_Bulk = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        Bitcoin_Address_Read_TF = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        Bitcoin_Amount_Read_TF = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        btnBitcoinRead = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        Bitcoin_Message_Read_TF = new javax.swing.JTextArea();
        jPanel60 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        Bitcoin_Address_Write_TF = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        Bitcoin_Amount_Write_TF = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        btnBitcoinWrite = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        Bitcoin_Message_Write_TF = new javax.swing.JTextArea();
        Bitcoin_RB_Tag = new javax.swing.JRadioButton();
        Bitcoin_RB_Ram = new javax.swing.JRadioButton();
        Bitcoin_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel95 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        Bitcoin_Num_Tags = new javax.swing.JTextField();
        btnBitcoinBulkStart = new javax.swing.JButton();
        btnBitcoinBulkStop = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        Bitcoin_Remaining_Bulk = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jLabelbr41 = new javax.swing.JLabel();
        Skype_Username_Read_TF = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        Skype_Operation_Read_TF = new javax.swing.JTextField();
        btnSkypeRead = new javax.swing.JButton();
        jPanel63 = new javax.swing.JPanel();
        jLabelbr42 = new javax.swing.JLabel();
        Skype_Username_Write_TF = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        btnSkypeWrite = new javax.swing.JButton();
        Skype_RB_Eeprom = new javax.swing.JRadioButton();
        Skype_RB_Tag = new javax.swing.JRadioButton();
        Skype_RB_Ram = new javax.swing.JRadioButton();
        jLabel100 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        Skype_Num_Tags = new javax.swing.JTextField();
        btnSkypeBulkStart = new javax.swing.JButton();
        btnSkypeBulkStop = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        Skype_Remaining_Bulk = new javax.swing.JLabel();
        Skype_Operation_CB = new javax.swing.JComboBox<>();
        jPanel57 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        btnViberRead = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        Viber_Message_Read_TF = new javax.swing.JTextArea();
        jPanel66 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        btnViberWrite = new javax.swing.JButton();
        Viber_RB_Tag = new javax.swing.JRadioButton();
        Viber_RB_Ram = new javax.swing.JRadioButton();
        Viber_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel105 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        Viber_Num_Tags = new javax.swing.JTextField();
        btnViberBulkStart = new javax.swing.JButton();
        btnViberBulkStop = new javax.swing.JButton();
        jLabel107 = new javax.swing.JLabel();
        Viber_Remaining_Bulk = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Viber_Message_Write_TF = new javax.swing.JTextArea();
        jPanel58 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        btnWhatsappRead = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        Whatsapp_Message_Read_TF = new javax.swing.JTextArea();
        jPanel69 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        btnWhatsappWrite = new javax.swing.JButton();
        Whatsapp_RB_Tag = new javax.swing.JRadioButton();
        Whatsapp_RB_Ram = new javax.swing.JRadioButton();
        Whatsapp_RB_Eeprom = new javax.swing.JRadioButton();
        jLabel110 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        Whatsapp_Num_Tags = new javax.swing.JTextField();
        btnWhatsappBulkStart = new javax.swing.JButton();
        btnWhatsappBulkStop = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        Whatsapp_Remaining_Bulk = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        Whatsapp_Message_Write_TF = new javax.swing.JTextArea();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        Raw_Tnf_Read_TF = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        Raw_Type_Read_TF = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        Raw_ID_Read_TF = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        Raw_Payload_Read_TF = new javax.swing.JTextField();
        btnRawRead = new javax.swing.JButton();
        jPanel73 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        Raw_Tnf_Write_TF = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        Raw_RB_Tag = new javax.swing.JRadioButton();
        Raw_RB_Eeprom = new javax.swing.JRadioButton();
        Raw_RB_Ram = new javax.swing.JRadioButton();
        jLabel121 = new javax.swing.JLabel();
        btnRawWrite = new javax.swing.JButton();
        jPanel74 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        Raw_Num_Tags = new javax.swing.JTextField();
        btnRawBulkStart = new javax.swing.JButton();
        btnRawBulkStop = new javax.swing.JButton();
        jLabel123 = new javax.swing.JLabel();
        Raw_Remaining_Bulk = new javax.swing.JLabel();
        Raw_Payload_Write_TF = new javax.swing.JTextField();
        Raw_ID_Write_TF = new javax.swing.JTextField();
        Raw_Type_Write_TF = new javax.swing.JTextField();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        btnLockTagReadOnly = new javax.swing.JButton();
        jLabel124 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        Password_TF = new javax.swing.JTextField();
        Hex_CB = new javax.swing.JCheckBox();
        jLabel126 = new javax.swing.JLabel();
        Password_Protection_CB = new javax.swing.JComboBox<>();
        jLabel127 = new javax.swing.JLabel();
        Password_Address_TF = new javax.swing.JTextField();
        btnSetPassword = new javax.swing.JButton();
        btnRemovePassword = new javax.swing.JButton();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1048, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReaderOpen.setActionCommand("btnReaderOpen");
        btnReaderOpen.setLabel("Reader Open");
        btnReaderOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReaderOpenActionPerformed(evt);
            }
        });
        getContentPane().add(btnReaderOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 92, -1));
        btnReaderOpen.getAccessibleContext().setAccessibleName("btnReaderOpen");

        UseAdvanced.setText("Use ReaderOpenEx");
        UseAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseAdvancedActionPerformed(evt);
            }
        });
        getContentPane().add(UseAdvanced, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 10, -1, -1));

        TF_ReaderType.setEnabled(false);
        getContentPane().add(TF_ReaderType, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 11, 35, -1));

        jLabel1.setText("Reader type:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 14, -1, -1));

        jLabel2.setText("Port name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 14, -1, -1));

        TF_PortName.setEnabled(false);
        getContentPane().add(TF_PortName, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 11, 98, -1));

        jLabel3.setText("Port interface:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 14, -1, -1));

        TF_PortInterface.setEnabled(false);
        getContentPane().add(TF_PortInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 11, 38, -1));

        jLabel4.setText("Arg:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 14, -1, -1));

        TF_Arg.setEnabled(false);
        getContentPane().add(TF_Arg, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 11, 334, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 1048, 10));

        jLabel5.setText("STATUS :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, -1, 20));
        getContentPane().add(StatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 740, 860, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 1048, 10));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");

        btnNdefInitialize.setText("Ndef initialize");
        btnNdefInitialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNdefInitializeActionPerformed(evt);
            }
        });

        btnEraseLastRecord.setText("Erase last record");
        btnEraseLastRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraseLastRecordActionPerformed(evt);
            }
        });

        btnEraseAllNdefRecords.setText("Erase all records");
        btnEraseAllNdefRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraseAllNdefRecordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNdefInitialize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEraseLastRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEraseAllNdefRecords)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNdefInitialize)
                    .addComponent(btnEraseLastRecord)
                    .addComponent(btnEraseAllNdefRecords))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, 370, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("NDEF Tools");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 60, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setToolTipText("");

        btnStartEEPROMEmulation.setText("Start EEPROM emulation");
        btnStartEEPROMEmulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartEEPROMEmulationActionPerformed(evt);
            }
        });

        btnStartRamEmulation.setText("Start RAM emulation");
        btnStartRamEmulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartRamEmulationActionPerformed(evt);
            }
        });

        btnStopEEPROMEmulation.setText("Stop EEPROM emulation");
        btnStopEEPROMEmulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopEEPROMEmulationActionPerformed(evt);
            }
        });

        btnStopRamEmulation.setText("Stop RAM emulation");
        btnStopRamEmulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopRamEmulationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnStartEEPROMEmulation, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnStartRamEmulation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStopEEPROMEmulation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStopRamEmulation, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStartEEPROMEmulation)
                    .addComponent(btnStartRamEmulation)
                    .addComponent(btnStopEEPROMEmulation)
                    .addComponent(btnStopRamEmulation))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 650, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tag Emulation commands");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 300, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 134, 1048, 10));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("WiFi Read"));

        jLabel16.setText("SSID Name:");

        jLabel17.setText("Auth type:");

        jLabel18.setText("Encryption:");

        jLabel19.setText("Password:");

        btnWiFiRead.setText("READ");
        btnWiFiRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWiFiReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWiFiRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SSID_Read_TF))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AuthType_Read_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Encryption_Read_TF))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Password_Read_TF)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(SSID_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(AuthType_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Encryption_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Password_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnWiFiRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("WiFi Write"));

        jLabel10.setText("SSID Name:");

        jLabel11.setText("Auth type:");

        AuthType_Write_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "WPA Personal", "WPA Enterprise", "WPA2 Enterprise", "WPA2 Personal" }));

        jLabel12.setText("Encryption:");

        Encryption_Write_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "WEP", "TKIP", "AES", "AES/TKIP" }));

        jLabel13.setText("Password:");

        Wifi_RB.add(Wifi_RB_Tag);
        Wifi_RB_Tag.setSelected(true);
        Wifi_RB_Tag.setText("Tag");

        Wifi_RB.add(Wifi_RB_Eeprom);
        Wifi_RB_Eeprom.setText("Reader EEPROM");

        Wifi_RB.add(Wifi_RB_Ram);
        Wifi_RB_Ram.setText("Reader RAM");

        jLabel14.setText("Write selection:");

        btnWriteWifi.setText("WRITE");
        btnWriteWifi.setToolTipText("");
        btnWriteWifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteWifiActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel8.setText("Number of tags:");

        btnWifiBulkStart.setText("START");
        btnWifiBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWifiBulkStartActionPerformed(evt);
            }
        });

        btnWifiBulkStop.setText("STOP");
        btnWifiBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWifiBulkStopActionPerformed(evt);
            }
        });

        jLabel9.setText("Remaining tags:");

        Wifi_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Wifi_Num_Tags))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnWifiBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWifiBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Wifi_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Wifi_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnWifiBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnWifiBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Wifi_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWriteWifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SSID_Write_TF))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(AuthType_Write_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Encryption_Write_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password_Write_TF)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Wifi_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Wifi_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Wifi_RB_Ram)
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(SSID_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(AuthType_Write_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Encryption_Write_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Password_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Wifi_RB_Tag)
                    .addComponent(Wifi_RB_Eeprom)
                    .addComponent(Wifi_RB_Ram)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWriteWifi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("WiFi ", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/wifi_icon.png")), jPanel1); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("URI Read"));

        jLabel20.setText("URI:");

        btnURIRead.setText("READ");
        btnURIRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnURIReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnURIRead, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(URI_Read_TF)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(URI_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnURIRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("URI Write"));

        jLabel21.setText("URI field:");

        btnURIWrite.setText("WRITE");
        btnURIWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnURIWriteActionPerformed(evt);
            }
        });

        jLabel15.setText("URI Identifier code:");

        URI_Identifier_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A. No prepending is done.", "http://www.", "https://www.", "tel:", "mailto:", "ftp://anonymous:anonymous@", "ftp://ftp.", "ftps://", "sftp://", "smb://", "nfs://", "ftp://", "dav://", "news:", "telnet://", "imap:", "rtsp://", "urn:", "pop:", "sip:", "sips:", "tftp:", "btspp://", "btl2cap://", "btgoep://", "tcpobex://", "irdaobex://", "file://", "urn:epc:id:", "urn:epc:tag:", "urn:epc:pat:", "urn:epc:raw:", "urn:epc:", "urn:nfc:" }));

        jLabel22.setText("Write selection:");

        URI_RB_Group.add(URI_RB_Tag);
        URI_RB_Tag.setSelected(true);
        URI_RB_Tag.setText("Tag");

        URI_RB_Group.add(URI_RB_Eeprom);
        URI_RB_Eeprom.setText("Reader EEPROM");

        URI_RB_Group.add(URI_RB_Ram);
        URI_RB_Ram.setText("Reader RAM");

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel23.setText("Number of tags:");

        btnURIBulkStart.setText("START");
        btnURIBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnURIBulkStartActionPerformed(evt);
            }
        });

        btnURIBulkStop.setText("STOP");
        btnURIBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnURIBulkStopActionPerformed(evt);
            }
        });

        jLabel24.setText("Remaining tags:");

        URI_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(URI_Num_Tags))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnURIBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnURIBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(URI_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(URI_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnURIBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnURIBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(URI_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(URI_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(URI_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(URI_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnURIWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(URI_Write_TF))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(URI_Identifier_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(URI_Identifier_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(URI_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(URI_RB_Tag)
                    .addComponent(URI_RB_Eeprom)
                    .addComponent(URI_RB_Ram)
                    .addComponent(jLabel22))
                .addGap(23, 23, 23)
                .addComponent(btnURIWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("URI ", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/uri_icon.png")), jPanel4); // NOI18N

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Bluetooth Read"));

        jLabel25.setText("Bluetooth MAC address:");

        btnBluetoothRead.setText("READ");
        btnBluetoothRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBluetoothReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBluetoothRead, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_Read_TF)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(BT_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBluetoothRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Bluetooth Write"));

        jLabel26.setText("Bluetooth MAC address:");

        btnBluetoothWrite.setText("WRITE");
        btnBluetoothWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBluetoothWriteActionPerformed(evt);
            }
        });

        jLabel27.setText("Write selection:");

        BT_RB_Group.add(BT_RB_Tag);
        BT_RB_Tag.setSelected(true);
        BT_RB_Tag.setText("Tag");

        BT_RB_Group.add(BT_RB_Eeprom);
        BT_RB_Eeprom.setText("Reader EEPROM");

        BT_RB_Group.add(BT_RB_Ram);
        BT_RB_Ram.setText("Reader RAM");

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel28.setText("Number of tags:");

        btnBTBulkStart.setText("START");
        btnBTBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBTBulkStartActionPerformed(evt);
            }
        });

        btnBTiBulkStop.setText("STOP");
        btnBTiBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBTiBulkStopActionPerformed(evt);
            }
        });

        jLabel29.setText("Remaining tags:");

        BT_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_Num_Tags))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(btnBTBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBTiBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(BT_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBTBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnBTiBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBluetoothWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_Write_TF))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BT_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BT_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BT_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(BT_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(BT_RB_Tag)
                    .addComponent(BT_RB_Eeprom)
                    .addComponent(BT_RB_Ram))
                .addGap(18, 18, 18)
                .addComponent(btnBluetoothWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bluetooth", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/bluetooth_icon.png")), jPanel11); // NOI18N

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("SMS Read"));

        jLabel30.setText("Phone number:");

        jLabel31.setText("Message :");

        btnSMSRead.setText("READ");
        btnSMSRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMSReadActionPerformed(evt);
            }
        });

        SMS_Message_Read_TF.setColumns(20);
        SMS_Message_Read_TF.setRows(5);
        jScrollPane2.setViewportView(SMS_Message_Read_TF);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSMSRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SMS_Phone_Read_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(SMS_Phone_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnSMSRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("SMS Write"));

        jLabel32.setText("Phone number:");

        jLabel33.setText("Message :");

        btnSMSWrite.setText("WRITE");
        btnSMSWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMSWriteActionPerformed(evt);
            }
        });

        jLabel34.setText("Write selection:");

        SMS_RB_Group.add(SMS_RB_Tag);
        SMS_RB_Tag.setSelected(true);
        SMS_RB_Tag.setText("Tag");

        SMS_RB_Group.add(SMS_RB_Eeprom);
        SMS_RB_Eeprom.setText("Reader EEPROM");

        SMS_RB_Group.add(SMS_RB_Ram);
        SMS_RB_Ram.setText("Reader RAM");

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel35.setText("Number of tags:");

        btnSMSBulkStart.setText("START");
        btnSMSBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMSBulkStartActionPerformed(evt);
            }
        });

        btnSMSBulkStop.setText("STOP");
        btnSMSBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMSBulkStopActionPerformed(evt);
            }
        });

        jLabel36.setText("Remaining tags:");

        SMS_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SMS_Num_Tags))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(btnSMSBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSMSBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SMS_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(SMS_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSMSBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnSMSBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SMS_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        SMS_Message_Write_TF.setColumns(20);
        SMS_Message_Write_TF.setRows(5);
        jScrollPane1.setViewportView(SMS_Message_Write_TF);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSMSWrite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SMS_Phone_Write_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SMS_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SMS_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SMS_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(SMS_Phone_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(SMS_RB_Tag)
                    .addComponent(SMS_RB_Eeprom)
                    .addComponent(SMS_RB_Ram))
                .addGap(18, 18, 18)
                .addComponent(btnSMSWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("SMS", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/sms_icon.png")), jPanel15); // NOI18N

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Location Read"));

        jLabelbr37.setText("Latitude:");

        jLabel38.setText("Longitude:");

        btnLocationRead.setText("READ");
        btnLocationRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLocationRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabelbr37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Location_Latitude_Read_TF))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Location_Longitude_Read_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelbr37)
                    .addComponent(Location_Latitude_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(Location_Longitude_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLocationRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Location Write"));

        jLabelbr38.setText("Latitude:");

        jLabel39.setText("Longitude:");

        btnLocationWrite.setText("WRITE");
        btnLocationWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationWriteActionPerformed(evt);
            }
        });

        Location_RB_Group.add(Location_RB_Eeprom);
        Location_RB_Eeprom.setText("Reader EEPROM");

        Location_RB_Group.add(Location_RB_Tag);
        Location_RB_Tag.setSelected(true);
        Location_RB_Tag.setText("Tag");

        Location_RB_Group.add(Location_RB_Ram);
        Location_RB_Ram.setText("Reader RAM");

        jLabel37.setText("Write selection:");

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel40.setText("Number of tags:");

        btnLocationBulkStart.setText("START");
        btnLocationBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationBulkStartActionPerformed(evt);
            }
        });

        btnLocationBulkStop.setText("STOP");
        btnLocationBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationBulkStopActionPerformed(evt);
            }
        });

        jLabel41.setText("Remaining tags:");

        Location_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Location_Num_Tags))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(btnLocationBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocationBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Location_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(Location_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLocationBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnLocationBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Location_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Location_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Location_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Location_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnLocationWrite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabelbr38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Location_Latitude_Write_TF))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Location_Longitude_Write_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelbr38)
                    .addComponent(Location_Latitude_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(Location_Longitude_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Location_RB_Tag)
                    .addComponent(Location_RB_Eeprom)
                    .addComponent(Location_RB_Ram)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLocationWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Location", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/geolocation_icon.png")), jPanel19); // NOI18N

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Destination Read"));

        jLabel42.setText("Destination:");

        btnDestinationRead.setText("READ");
        btnDestinationRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinationReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDestinationRead, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Destination_Read_TF)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(Destination_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDestinationRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Destination Write"));

        jLabel43.setText("Destination:");

        btnDestinationWrite.setText("WRITE");
        btnDestinationWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinationWriteActionPerformed(evt);
            }
        });

        Destination_RB_Group.add(Destination_RB_Tag);
        Destination_RB_Tag.setSelected(true);
        Destination_RB_Tag.setText("Tag");

        Destination_RB_Group.add(Destination_RB_Ram);
        Destination_RB_Ram.setText("Reader RAM");

        Destination_RB_Group.add(Destination_RB_Eeprom);
        Destination_RB_Eeprom.setText("Reader EEPROM");

        jLabel44.setText("Write selection:");

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel45.setText("Number of tags:");

        btnDestinationBulkStart.setText("START");
        btnDestinationBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinationBulkStartActionPerformed(evt);
            }
        });

        btnDestinationBulkStop.setText("STOP");
        btnDestinationBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinationBulkStopActionPerformed(evt);
            }
        });

        jLabel46.setText("Remaining tags:");

        Destination_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Destination_Num_Tags))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(btnDestinationBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDestinationBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Destination_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(Destination_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDestinationBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnDestinationBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Destination_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDestinationWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Destination_Write_TF))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Destination_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Destination_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Destination_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(Destination_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Destination_RB_Tag)
                    .addComponent(Destination_RB_Eeprom)
                    .addComponent(Destination_RB_Ram)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDestinationWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Destination", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/navi_icon.png")), jPanel23); // NOI18N

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Email Read"));

        jLabel47.setText("Email address:");

        jLabel48.setText("Subject:");

        jLabel49.setText("Message:");

        btnEmailRead.setText("READ");
        btnEmailRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailReadActionPerformed(evt);
            }
        });

        EmailMessage_Read_TF.setColumns(20);
        EmailMessage_Read_TF.setRows(5);
        jScrollPane3.setViewportView(EmailMessage_Read_TF);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmailRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailAddress_Read_TF))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Subject_Read_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(EmailAddress_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(Subject_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmailRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder("Email Write"));

        jLabel50.setText("Email address:");

        jLabel51.setText("Subject:");

        jLabel52.setText("Message:");

        btnEmailWrite.setText("WRITE");
        btnEmailWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailWriteActionPerformed(evt);
            }
        });

        EmailMessage_Write_TF.setColumns(20);
        EmailMessage_Write_TF.setRows(5);
        jScrollPane4.setViewportView(EmailMessage_Write_TF);

        Email_RB_Group.add(Email_RB_Tag);
        Email_RB_Tag.setSelected(true);
        Email_RB_Tag.setText("Tag");

        Email_RB_Group.add(Email_RB_Ram);
        Email_RB_Ram.setText("Reader RAM");

        Email_RB_Group.add(Email_RB_Eeprom);
        Email_RB_Eeprom.setText("Reader EEPROM");

        jLabel53.setText("Write selection:");

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel54.setText("Number of tags:");

        btnEmailBulkStart.setText("START");
        btnEmailBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailBulkStartActionPerformed(evt);
            }
        });

        btnEmailBulkStop.setText("STOP");
        btnEmailBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailBulkStopActionPerformed(evt);
            }
        });

        jLabel55.setText("Remaining tags:");

        Email_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email_Num_Tags))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(btnEmailBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmailBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Email_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(Email_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEmailBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnEmailBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Email_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Email_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEmailWrite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailAddress_Write_TF))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Subject_Write_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4))
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(EmailAddress_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(Subject_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_RB_Tag)
                    .addComponent(Email_RB_Eeprom)
                    .addComponent(Email_RB_Ram)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addComponent(btnEmailWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Email", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/email_icon.png")), jPanel27); // NOI18N

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder("Address Read"));

        jLabel56.setText("Address:");

        btnAddressRead.setText("READ");
        btnAddressRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddressRead, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Address_Read_TF)))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(Address_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddressRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder("Address Write"));

        jLabel57.setText("Address:");

        btnAddressWrite.setText("WRITE");
        btnAddressWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressWriteActionPerformed(evt);
            }
        });

        Address_RB_Group.add(Address_RB_Tag);
        Address_RB_Tag.setSelected(true);
        Address_RB_Tag.setText("Tag");

        Address_RB_Group.add(Address_RB_Ram);
        Address_RB_Ram.setText("Reader RAM");

        Address_RB_Group.add(Address_RB_Eeprom);
        Address_RB_Eeprom.setText("Reader EEPROM");

        jLabel58.setText("Write selection:");

        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel59.setText("Number of tags:");

        btnAddressBulkStart.setText("START");
        btnAddressBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressBulkStartActionPerformed(evt);
            }
        });

        btnAddressBulkStop.setText("STOP");
        btnAddressBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressBulkStopActionPerformed(evt);
            }
        });

        jLabel60.setText("Remaining tags:");

        Address_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Address_Num_Tags))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(btnAddressBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddressBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Address_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(Address_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddressBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnAddressBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Address_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddressWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Address_Write_TF))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Address_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Address_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Address_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(Address_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address_RB_Tag)
                    .addComponent(Address_RB_Eeprom)
                    .addComponent(Address_RB_Ram)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddressWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Address", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/homeaddress_icon.png")), jPanel31); // NOI18N

        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder("Application Read"));

        jLabel61.setText("Address:");

        btnApplicationRead.setText("READ");
        btnApplicationRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplicationReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApplicationRead, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Application_Read_TF)))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(Application_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApplicationRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder("Application Write"));

        jLabel62.setText("Address:");

        btnApplicationWrite.setText("WRITE");
        btnApplicationWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplicationWriteActionPerformed(evt);
            }
        });

        Application_RB_Group.add(Application_RB_Tag);
        Application_RB_Tag.setSelected(true);
        Application_RB_Tag.setText("Tag");

        Application_RB_Group.add(Application_RB_Ram);
        Application_RB_Ram.setText("Reader RAM");

        Application_RB_Group.add(Application_RB_Eeprom);
        Application_RB_Eeprom.setText("Reader EEPROM");

        jLabel63.setText("Write selection:");

        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel64.setText("Number of tags:");

        btnApplicationBulkStart.setText("START");
        btnApplicationBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplicationBulkStartActionPerformed(evt);
            }
        });

        btnApplicationBulkStop.setText("STOP");
        btnApplicationBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplicationBulkStopActionPerformed(evt);
            }
        });

        jLabel65.setText("Remaining tags:");

        Application_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Application_Num_Tags))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(btnApplicationBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApplicationBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Application_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(Application_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnApplicationBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnApplicationBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Application_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApplicationWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Application_Write_TF))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Application_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Application_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Application_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(Application_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Application_RB_Tag)
                    .addComponent(Application_RB_Eeprom)
                    .addComponent(Application_RB_Ram)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApplicationWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Application", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/androidapp_icon.png")), jPanel32); // NOI18N

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder("Text Read"));

        jLabel66.setText("Text:");

        btnTextRead.setText("READ");
        btnTextRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextReadActionPerformed(evt);
            }
        });

        Text_Read_TF.setColumns(20);
        Text_Read_TF.setRows(5);
        jScrollPane5.setViewportView(Text_Read_TF);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTextRead, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTextRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder("Text Write"));

        jLabel67.setText("Text:");

        btnTextWrite.setText("WRITE");
        btnTextWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextWriteActionPerformed(evt);
            }
        });

        Text_RB_Group.add(Text_RB_Tag);
        Text_RB_Tag.setSelected(true);
        Text_RB_Tag.setText("Tag");

        Text_RB_Group.add(Text_RB_Ram);
        Text_RB_Ram.setText("Reader RAM");

        Text_RB_Group.add(Text_RB_Eeprom);
        Text_RB_Eeprom.setText("Reader EEPROM");

        jLabel68.setText("Write selection:");

        jPanel44.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel69.setText("Number of tags:");

        btnTextBulkStart.setText("START");
        btnTextBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextBulkStartActionPerformed(evt);
            }
        });

        btnTextBulkStop.setText("STOP");
        btnTextBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextBulkStopActionPerformed(evt);
            }
        });

        jLabel70.setText("Remaining tags:");

        Text_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_Num_Tags))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(btnTextBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTextBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(Text_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTextBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnTextBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Text_Write_TF.setColumns(20);
        Text_Write_TF.setRows(5);
        jScrollPane6.setViewportView(Text_Write_TF);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTextWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Text_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Text_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_RB_Tag)
                    .addComponent(Text_RB_Eeprom)
                    .addComponent(Text_RB_Ram)
                    .addComponent(jLabel68))
                .addGap(18, 18, 18)
                .addComponent(btnTextWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Text", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/text_icon.png")), jPanel33); // NOI18N

        jPanel45.setBorder(javax.swing.BorderFactory.createTitledBorder("StreetView Read"));

        jLabelbr39.setText("Latitude:");

        jLabel71.setText("Longitude:");

        btnStreetViewRead.setText("READ");
        btnStreetViewRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStreetViewReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStreetViewRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabelbr39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StreetView_Latitude_Read_TF))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StreetView_Longitude_Read_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelbr39)
                    .addComponent(StreetView_Latitude_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(StreetView_Longitude_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnStreetViewRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel46.setBorder(javax.swing.BorderFactory.createTitledBorder("Location Write"));

        jLabelbr40.setText("Latitude:");

        jLabel72.setText("Longitude:");

        btnStreetViewWrite.setText("WRITE");
        btnStreetViewWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStreetViewWriteActionPerformed(evt);
            }
        });

        StreetView_RB_Group.add(StreetView_RB_Eeprom);
        StreetView_RB_Eeprom.setText("Reader EEPROM");

        StreetView_RB_Group.add(StreetView_RB_Tag);
        StreetView_RB_Tag.setSelected(true);
        StreetView_RB_Tag.setText("Tag");

        StreetView_RB_Group.add(StreetView_RB_Ram);
        StreetView_RB_Ram.setText("Reader RAM");

        jLabel73.setText("Write selection:");

        jPanel47.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel74.setText("Number of tags:");

        StreetViewBulkStart.setText("START");
        StreetViewBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetViewBulkStartActionPerformed(evt);
            }
        });

        btnStreetViewBulkStop.setText("STOP");
        btnStreetViewBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStreetViewBulkStopActionPerformed(evt);
            }
        });

        jLabel75.setText("Remaining tags:");

        StreetView_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StreetView_Num_Tags))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(StreetViewBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStreetViewBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StreetView_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(StreetView_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75))
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StreetViewBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnStreetViewBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StreetView_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StreetView_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StreetView_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StreetView_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnStreetViewWrite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabelbr40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StreetView_Latitude_Write_TF))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StreetView_Longitude_Write_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelbr40)
                    .addComponent(StreetView_Latitude_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(StreetView_Longitude_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StreetView_RB_Tag)
                    .addComponent(StreetView_RB_Eeprom)
                    .addComponent(StreetView_RB_Ram)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStreetViewWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("StreetView", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/streetview_icon.png")), jPanel34); // NOI18N

        jPanel48.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Read"));

        jLabel76.setText("Phone number:");

        btnPhoneRead.setText("READ");
        btnPhoneRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhoneReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPhoneRead, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Phone_Read_TF)))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(Phone_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPhoneRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jPanel49.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Write"));

        jLabel77.setText("Phone number:");

        btnPhoneWrite.setText("WRITE");
        btnPhoneWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhoneWriteActionPerformed(evt);
            }
        });

        Phone_RB_Group.add(Phone_RB_Tag);
        Phone_RB_Tag.setSelected(true);
        Phone_RB_Tag.setText("Tag");

        Phone_RB_Group.add(Phone_RB_Ram);
        Phone_RB_Ram.setText("Reader RAM");

        Phone_RB_Group.add(Phone_RB_Eeprom);
        Phone_RB_Eeprom.setText("Reader EEPROM");

        jLabel78.setText("Write selection:");

        jPanel50.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel79.setText("Number of tags:");

        btnPhoneBulkStart.setText("START");
        btnPhoneBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhoneBulkStartActionPerformed(evt);
            }
        });

        btnPhoneBulkStop.setText("STOP");
        btnPhoneBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhoneBulkStopActionPerformed(evt);
            }
        });

        jLabel80.setText("Remaining tags:");

        Phone_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Phone_Num_Tags))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(btnPhoneBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPhoneBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Phone_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(Phone_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPhoneBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnPhoneBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Phone_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPhoneWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Phone_Write_TF))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Phone_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Phone_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Phone_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(Phone_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone_RB_Tag)
                    .addComponent(Phone_RB_Eeprom)
                    .addComponent(Phone_RB_Ram)
                    .addComponent(jLabel78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPhoneWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Phone", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/phone_icon.png")), jPanel35); // NOI18N

        jPanel53.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact Read"));

        jLabel83.setText("vCard:");

        btnContactRead.setText("READ");
        btnContactRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactReadActionPerformed(evt);
            }
        });

        Contact_Read_TF.setColumns(20);
        Contact_Read_TF.setRows(5);
        jScrollPane8.setViewportView(Contact_Read_TF);

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContactRead, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContactRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact Write"));

        jLabel81.setText("Name:");

        jLabel82.setText("Company:");

        jLabel84.setText("Address:");

        jLabel85.setText("Phone:");

        btnWriteContact.setText("WRITE");
        btnWriteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteContactActionPerformed(evt);
            }
        });

        asdfasdfasfd.setText("Email:");

        asdfasdfasfd1.setText("Website:");

        Contact_RB_Group.add(Contact_RB_Tag);
        Contact_RB_Tag.setSelected(true);
        Contact_RB_Tag.setText("Tag");

        Contact_RB_Group.add(Contact_RB_Ram);
        Contact_RB_Ram.setText("Reader RAM");

        Contact_RB_Group.add(Contact_RB_Eeprom);
        Contact_RB_Eeprom.setText("Reader EEPROM");

        jLabel86.setText("Write selection:");

        jPanel54.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel87.setText("Number of tags:");

        btnContactBulkStart.setText("START");
        btnContactBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactBulkStartActionPerformed(evt);
            }
        });

        btnContactBulkStop.setText("STOP");
        btnContactBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactBulkStopActionPerformed(evt);
            }
        });

        jLabel88.setText("Remaining tags:");

        Contact_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contact_Num_Tags))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(btnContactBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContactBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contact_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(Contact_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88))
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnContactBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnContactBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contact_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWriteContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contact_Name_TF))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contact_Company_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contact_Address_TF))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contact_Phone_TF))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(asdfasdfasfd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contact_Email_TF))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                        .addComponent(asdfasdfasfd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contact_Website_TF))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contact_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contact_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contact_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(Contact_Name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(Contact_Company_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(Contact_Address_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(Contact_Phone_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asdfasdfasfd)
                    .addComponent(Contact_Email_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asdfasdfasfd1)
                    .addComponent(Contact_Website_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_RB_Tag)
                    .addComponent(Contact_RB_Eeprom)
                    .addComponent(Contact_RB_Ram)
                    .addComponent(jLabel86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnWriteContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Contact", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/contact_icon.png")), jPanel51); // NOI18N

        jPanel59.setBorder(javax.swing.BorderFactory.createTitledBorder("Bitcoin Read"));

        jLabel89.setText("Bitcoin address:");

        jLabel90.setText("Amount:");

        jLabel91.setText("Message:");

        btnBitcoinRead.setText("READ");
        btnBitcoinRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitcoinReadActionPerformed(evt);
            }
        });

        Bitcoin_Message_Read_TF.setColumns(20);
        Bitcoin_Message_Read_TF.setRows(5);
        jScrollPane7.setViewportView(Bitcoin_Message_Read_TF);

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBitcoinRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bitcoin_Address_Read_TF))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bitcoin_Amount_Read_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7)))
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(Bitcoin_Address_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(Bitcoin_Amount_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBitcoinRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel60.setBorder(javax.swing.BorderFactory.createTitledBorder("Bitcoin Write"));

        jLabel92.setText("Bitcoin address:");

        jLabel93.setText("Amount:");

        jLabel94.setText("Message:");

        btnBitcoinWrite.setText("WRITE");
        btnBitcoinWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitcoinWriteActionPerformed(evt);
            }
        });

        Bitcoin_Message_Write_TF.setColumns(20);
        Bitcoin_Message_Write_TF.setRows(5);
        jScrollPane9.setViewportView(Bitcoin_Message_Write_TF);

        Bitcoin_RB_Group.add(Bitcoin_RB_Tag);
        Bitcoin_RB_Tag.setSelected(true);
        Bitcoin_RB_Tag.setText("Tag");

        Bitcoin_RB_Group.add(Bitcoin_RB_Ram);
        Bitcoin_RB_Ram.setText("Reader RAM");

        Bitcoin_RB_Group.add(Bitcoin_RB_Eeprom);
        Bitcoin_RB_Eeprom.setText("Reader EEPROM");

        jLabel95.setText("Write selection:");

        jPanel61.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel96.setText("Number of tags:");

        btnBitcoinBulkStart.setText("START");
        btnBitcoinBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitcoinBulkStartActionPerformed(evt);
            }
        });

        btnBitcoinBulkStop.setText("STOP");
        btnBitcoinBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitcoinBulkStopActionPerformed(evt);
            }
        });

        jLabel97.setText("Remaining tags:");

        Bitcoin_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bitcoin_Num_Tags))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(btnBitcoinBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBitcoinBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bitcoin_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(Bitcoin_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBitcoinBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnBitcoinBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bitcoin_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bitcoin_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bitcoin_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bitcoin_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnBitcoinWrite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bitcoin_Address_Write_TF))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bitcoin_Amount_Write_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9))
                    .addComponent(jPanel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(Bitcoin_Address_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(Bitcoin_Amount_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bitcoin_RB_Tag)
                    .addComponent(Bitcoin_RB_Eeprom)
                    .addComponent(Bitcoin_RB_Ram)
                    .addComponent(jLabel95))
                .addGap(18, 18, 18)
                .addComponent(btnBitcoinWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bitcoin", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/bitcoin_icon.png")), jPanel55); // NOI18N

        jPanel62.setBorder(javax.swing.BorderFactory.createTitledBorder("Skype Read"));

        jLabelbr41.setText("Username:");

        jLabel98.setText("Operation:");

        btnSkypeRead.setText("READ");
        btnSkypeRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkypeReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSkypeRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addComponent(jLabelbr41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Skype_Username_Read_TF))
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Skype_Operation_Read_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelbr41)
                    .addComponent(Skype_Username_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(Skype_Operation_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSkypeRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel63.setBorder(javax.swing.BorderFactory.createTitledBorder("Skype Wrtite"));

        jLabelbr42.setText("Username:");

        jLabel99.setText("Operation:");

        btnSkypeWrite.setText("WRITE");
        btnSkypeWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkypeWriteActionPerformed(evt);
            }
        });

        Skype_RB_Group.add(Skype_RB_Eeprom);
        Skype_RB_Eeprom.setText("Reader EEPROM");

        Skype_RB_Group.add(Skype_RB_Tag);
        Skype_RB_Tag.setSelected(true);
        Skype_RB_Tag.setText("Tag");

        Skype_RB_Group.add(Skype_RB_Ram);
        Skype_RB_Ram.setText("Reader RAM");

        jLabel100.setText("Write selection:");

        jPanel64.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel101.setText("Number of tags:");

        btnSkypeBulkStart.setText("START");
        btnSkypeBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkypeBulkStartActionPerformed(evt);
            }
        });

        btnSkypeBulkStop.setText("STOP");
        btnSkypeBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkypeBulkStopActionPerformed(evt);
            }
        });

        jLabel102.setText("Remaining tags:");

        Skype_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Skype_Num_Tags))
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addComponent(btnSkypeBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSkypeBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Skype_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(Skype_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102))
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSkypeBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnSkypeBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Skype_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Skype_Operation_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHAT", "CALL" }));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSkypeWrite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jLabelbr42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Skype_Username_Write_TF))
                    .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Skype_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Skype_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Skype_RB_Ram)
                        .addGap(0, 149, Short.MAX_VALUE))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Skype_Operation_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelbr42)
                    .addComponent(Skype_Username_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(Skype_Operation_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Skype_RB_Tag)
                    .addComponent(Skype_RB_Eeprom)
                    .addComponent(Skype_RB_Ram)
                    .addComponent(jLabel100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSkypeWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Skype", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/skype_icon.png")), jPanel56); // NOI18N

        jPanel65.setBorder(javax.swing.BorderFactory.createTitledBorder("Viber Read"));

        jLabel103.setText("Message:");

        btnViberRead.setText("READ");
        btnViberRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViberReadActionPerformed(evt);
            }
        });

        Viber_Message_Read_TF.setColumns(20);
        Viber_Message_Read_TF.setRows(5);
        jScrollPane10.setViewportView(Viber_Message_Read_TF);

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViberRead, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10)))
                .addContainerGap())
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViberRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel66.setBorder(javax.swing.BorderFactory.createTitledBorder("Viber Write"));

        jLabel104.setText("Message:");

        btnViberWrite.setText("WRITE");
        btnViberWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViberWriteActionPerformed(evt);
            }
        });

        Viber_RB_Group.add(Viber_RB_Tag);
        Viber_RB_Tag.setSelected(true);
        Viber_RB_Tag.setText("Tag");

        Viber_RB_Group.add(Viber_RB_Ram);
        Viber_RB_Ram.setText("Reader RAM");

        Viber_RB_Group.add(Viber_RB_Eeprom);
        Viber_RB_Eeprom.setText("Reader EEPROM");

        jLabel105.setText("Write selection:");

        jPanel67.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel106.setText("Number of tags:");

        btnViberBulkStart.setText("START");
        btnViberBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViberBulkStartActionPerformed(evt);
            }
        });

        btnViberBulkStop.setText("STOP");
        btnViberBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViberBulkStopActionPerformed(evt);
            }
        });

        jLabel107.setText("Remaining tags:");

        Viber_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Viber_Num_Tags))
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addComponent(btnViberBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViberBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Viber_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(Viber_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnViberBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnViberBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Viber_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Viber_Message_Write_TF.setColumns(20);
        Viber_Message_Write_TF.setRows(5);
        jScrollPane11.setViewportView(Viber_Message_Write_TF);

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViberWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Viber_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Viber_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Viber_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11)))
                .addContainerGap())
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Viber_RB_Tag)
                    .addComponent(Viber_RB_Eeprom)
                    .addComponent(Viber_RB_Ram)
                    .addComponent(jLabel105))
                .addGap(18, 18, 18)
                .addComponent(btnViberWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Viber", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/viber_icon.png")), jPanel57); // NOI18N

        jPanel68.setBorder(javax.swing.BorderFactory.createTitledBorder("Whatsapp Read"));

        jLabel108.setText("Message:");

        btnWhatsappRead.setText("READ");
        btnWhatsappRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhatsappReadActionPerformed(evt);
            }
        });

        Whatsapp_Message_Read_TF.setColumns(20);
        Whatsapp_Message_Read_TF.setRows(5);
        jScrollPane12.setViewportView(Whatsapp_Message_Read_TF);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWhatsappRead, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12)))
                .addContainerGap())
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWhatsappRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel69.setBorder(javax.swing.BorderFactory.createTitledBorder("Whatsapp Write"));

        jLabel109.setText("Message:");

        btnWhatsappWrite.setText("WRITE");
        btnWhatsappWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhatsappWriteActionPerformed(evt);
            }
        });

        Whatsapp_RB_Group.add(Whatsapp_RB_Tag);
        Whatsapp_RB_Tag.setSelected(true);
        Whatsapp_RB_Tag.setText("Tag");

        Whatsapp_RB_Group.add(Whatsapp_RB_Ram);
        Whatsapp_RB_Ram.setText("Reader RAM");

        Whatsapp_RB_Group.add(Whatsapp_RB_Eeprom);
        Whatsapp_RB_Eeprom.setText("Reader EEPROM");

        jLabel110.setText("Write selection:");

        jPanel70.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel111.setText("Number of tags:");

        btnWhatsappBulkStart.setText("START");
        btnWhatsappBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhatsappBulkStartActionPerformed(evt);
            }
        });

        btnWhatsappBulkStop.setText("STOP");
        btnWhatsappBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhatsappBulkStopActionPerformed(evt);
            }
        });

        jLabel112.setText("Remaining tags:");

        Whatsapp_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Whatsapp_Num_Tags))
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addComponent(btnWhatsappBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWhatsappBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Whatsapp_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(Whatsapp_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112))
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnWhatsappBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnWhatsappBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Whatsapp_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Whatsapp_Message_Write_TF.setColumns(20);
        Whatsapp_Message_Write_TF.setRows(5);
        jScrollPane13.setViewportView(Whatsapp_Message_Write_TF);

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWhatsappWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(jPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Whatsapp_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Whatsapp_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Whatsapp_RB_Ram)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13)))
                .addContainerGap())
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Whatsapp_RB_Tag)
                    .addComponent(Whatsapp_RB_Eeprom)
                    .addComponent(Whatsapp_RB_Ram)
                    .addComponent(jLabel110))
                .addGap(18, 18, 18)
                .addComponent(btnWhatsappWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Whatsapp", new javax.swing.ImageIcon(getClass().getResource("/ufr_ndef_package/whatsapp_icon.png")), jPanel58); // NOI18N

        jPanel72.setBorder(javax.swing.BorderFactory.createTitledBorder("RAW Read"));

        jLabel113.setText("Tnf:");

        jLabel114.setText("Type:");

        jLabel115.setText("ID:");

        jLabel116.setText("Payload");

        btnRawRead.setText("READ");
        btnRawRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRawReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRawRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Raw_Tnf_Read_TF))
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Raw_Type_Read_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Raw_ID_Read_TF))
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Raw_Payload_Read_TF)))
                .addContainerGap())
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(Raw_Tnf_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(Raw_Type_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(Raw_ID_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(Raw_Payload_Read_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnRawRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel73.setBorder(javax.swing.BorderFactory.createTitledBorder("RAW Write"));

        jLabel117.setText("Tnf:");

        jLabel118.setText("Type:");

        jLabel119.setText("ID:");

        jLabel120.setText("Payload:");

        RAW_RB_Group.add(Raw_RB_Tag);
        Raw_RB_Tag.setSelected(true);
        Raw_RB_Tag.setText("Tag");

        RAW_RB_Group.add(Raw_RB_Eeprom);
        Raw_RB_Eeprom.setText("Reader EEPROM");

        RAW_RB_Group.add(Raw_RB_Ram);
        Raw_RB_Ram.setText("Reader RAM");

        jLabel121.setText("Write selection:");

        btnRawWrite.setText("WRITE");
        btnRawWrite.setToolTipText("");
        btnRawWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRawWriteActionPerformed(evt);
            }
        });

        jPanel74.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk programming"));

        jLabel122.setText("Number of tags:");

        btnRawBulkStart.setText("START");
        btnRawBulkStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRawBulkStartActionPerformed(evt);
            }
        });

        btnRawBulkStop.setText("STOP");
        btnRawBulkStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRawBulkStopActionPerformed(evt);
            }
        });

        jLabel123.setText("Remaining tags:");

        Raw_Remaining_Bulk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Raw_Num_Tags))
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addComponent(btnRawBulkStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRawBulkStop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Raw_Remaining_Bulk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(Raw_Num_Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123))
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRawBulkStart, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnRawBulkStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Raw_Remaining_Bulk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRawWrite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addComponent(jLabel117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Raw_Tnf_Write_TF))
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel119)
                            .addComponent(jLabel120))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Raw_Payload_Write_TF)
                            .addComponent(Raw_ID_Write_TF)))
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Raw_RB_Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Raw_RB_Eeprom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Raw_RB_Ram)
                        .addGap(0, 161, Short.MAX_VALUE))
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Raw_Type_Write_TF))
                    .addComponent(jPanel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(Raw_Tnf_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(Raw_Type_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(Raw_ID_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(Raw_Payload_Write_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Raw_RB_Tag)
                    .addComponent(Raw_RB_Eeprom)
                    .addComponent(Raw_RB_Ram)
                    .addComponent(jLabel121))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRawWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("RAW", jPanel71);

        jPanel76.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic"));

        btnLockTagReadOnly.setText("Lock Tag");
        btnLockTagReadOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLockTagReadOnlyActionPerformed(evt);
            }
        });

        jLabel124.setText("This option uses tag lock bytes mechanism and irreversibly makes tag read-only.");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLockTagReadOnly, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel124)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLockTagReadOnly, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel124))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel77.setBorder(javax.swing.BorderFactory.createTitledBorder("Advanced"));

        jLabel125.setText("Password:");

        Hex_CB.setText("Hex");

        jLabel126.setText("Password protection:");

        Password_Protection_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Write protection", "Read/Write protection" }));

        jLabel127.setText("Password authentication address:");

        Password_Address_TF.setText("0");

        btnSetPassword.setText("Set password");
        btnSetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetPasswordActionPerformed(evt);
            }
        });

        btnRemovePassword.setText("Remove password");
        btnRemovePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePasswordActionPerformed(evt);
            }
        });

        jLabel128.setText("6 characters for ASCII input, if \"Hex\" is selected, 6 bytes hex input is mandatory");

        jLabel129.setText("This option defines from which page address will password verification become mandatory.");

        jLabel130.setText("If password authentication address = 0 - whole tag will be password protected.");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hex_CB))
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password_Protection_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(btnSetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemovePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password_Address_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128)
                    .addComponent(jLabel129)
                    .addComponent(jLabel130))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hex_CB)
                    .addComponent(jLabel128))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(Password_Protection_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(Password_Address_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel129))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(btnRemovePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel130))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Security", jPanel75);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean checkUID(byte[] uid, byte[] old_uid, byte uid_size)
    {
        for (int i = 0; i < uid_size; i++)
        {
            if ((uid[i]) != (old_uid[i]))
            {
                return false;
            }
        }
        return true;
    }

    
    private String ByteArrayToString(byte[] ch_array)
    {
        StringBuilder strB = new StringBuilder();
        
        for(int i = 0; i < ch_array.length; i++)
        {
            if(ch_array[i] == 0)
                break;

            strB.append((char)ch_array[i]);
        }
        
        return strB.toString();
    }
    
    private void btnReaderOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReaderOpenActionPerformed
        int status = 0x54;
        String readerType = TF_ReaderType.getText();
        String portName = TF_PortName.getText();
        String portInterface = TF_PortInterface.getText();
        String arg = TF_Arg.getText();
        
        if(!UseAdvanced.isSelected())
        {
            status = ufr.ReaderOpen();
             
            if(status == 0)
            {
                ufr.ReaderUISignal(1,1);
            }
            
            StatusLabel.setText(ufr.UFR_Status2String(status));
        }
        else
        {   
            if(readerType.equals("") || portName.equals("") || portInterface.equals("") || arg.equals(""))
            {
                JOptionPane.showMessageDialog(null, "You have to fill all parameters for ReaderOpenEx", "ReaderOpenEx format error:", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else
            {
                int reader_type = Integer.parseInt(readerType);
                byte[] bportName = portName.getBytes(StandardCharsets.US_ASCII);
                int port_interface = 0;
            
                if(portInterface.equals("U"))
                {
                    port_interface = 85;
                }
                else if(portInterface.equals("T"))
                {   
                    port_interface = 84;
                }
                else
                {
                    port_interface = Integer.parseInt(portInterface);
                }
            
                byte[] bArg = arg.getBytes(StandardCharsets.US_ASCII);
            
                status = ufr.ReaderOpenEx(reader_type, bportName, port_interface, bArg);
            }
            
            if(status == 0)
            {
                ufr.ReaderUISignal(1,1);
            }
            
            StatusLabel.setText(ufr.UFR_Status2String(status));
        }
    }//GEN-LAST:event_btnReaderOpenActionPerformed

    private void btnWriteWifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteWifiActionPerformed
        String ssid_str = SSID_Write_TF.getText();
        byte auth_type = (byte)AuthType_Write_CB.getSelectedIndex();
        byte encryption = (byte)Encryption_Write_CB.getSelectedIndex();
        String password_str = Password_Write_TF.getText();
        
        int status = 0;
        
        if(Wifi_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_WiFi((byte)1, ssid_str, auth_type, encryption, password_str);
        }
        else if(Wifi_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_WiFi((byte)0, ssid_str, auth_type, encryption, password_str);
        }
        else if(Wifi_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_WiFi((byte)2, ssid_str, auth_type, encryption, password_str);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnWriteWifiActionPerformed

    private void btnEraseAllNdefRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraseAllNdefRecordsActionPerformed
        int status = ufr.erase_all_ndef_records((byte)1);
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnEraseAllNdefRecordsActionPerformed

    private void btnWiFiReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWiFiReadActionPerformed
        
        byte[] SSID = new byte[200];
        byte[] Auth = new byte[200];
        byte[] Enc = new byte[200];
        byte[] Password = new byte[200];

        int status = ufr.ReadNdefRecord_WiFi(SSID, Auth, Enc, Password);
        
        if(status == 0)
        {
            SSID_Read_TF.setText(ByteArrayToString(SSID));   
            AuthType_Read_TF.setText(ByteArrayToString(Auth));
            Encryption_Read_TF.setText(ByteArrayToString(Enc));
            Password_Read_TF.setText(ByteArrayToString(Password));
        }
        else
        {
            SSID_Read_TF.setText("");
            AuthType_Read_TF.setText("");
            Encryption_Read_TF.setText("");
            Password_Read_TF.setText("");  
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnWiFiReadActionPerformed

    private void btnWifiBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWifiBulkStartActionPerformed
       
        try
        {
            num = Integer.parseInt(Wifi_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        wifi_bulk = true;
        Wifi_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && wifi_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String ssid_str = SSID_Write_TF.getText();
                            byte auth_type = (byte)AuthType_Write_CB.getSelectedIndex();
                            byte encryption = (byte)Encryption_Write_CB.getSelectedIndex();
                            String password_str = Password_Write_TF.getText();

                            ufr_status = ufr.WriteNdefRecord_WiFi((byte)1, ssid_str, auth_type, encryption, password_str);                

                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Wifi_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!wifi_bulk)
                                        Wifi_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();      
    }//GEN-LAST:event_btnWifiBulkStartActionPerformed

    private void btnWifiBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWifiBulkStopActionPerformed
       wifi_bulk = false;
       Wifi_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnWifiBulkStopActionPerformed

    private void btnURIReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnURIReadActionPerformed
        ByteByReference tnf = new ByteByReference();
        byte[] type_record = new byte[100];
        ByteByReference type_length = new ByteByReference();
        byte[] id = new byte[100];
        ByteByReference id_length = new ByteByReference();
        byte[] payload = new byte[500];
        IntByReference payload_length = new IntByReference();
        
        int status = ufr.read_ndef_record((byte)1, (byte)1, tnf, type_record, type_length, id, id_length, payload, payload_length);
        
        if(status == 0)
        {
            URI_Read_TF.setText(ByteArrayToString(payload));
        }
        else
        {
            URI_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnURIReadActionPerformed

    private void btnURIWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnURIWriteActionPerformed
        int status = 0;
        String uri_str = URI_Write_TF.getText();
        byte uri_id = (byte)URI_Identifier_CB.getSelectedIndex();
        
        ByteByReference tnf = new ByteByReference((byte)1);
        byte[] id = new byte[2];
        ByteByReference id_length = new ByteByReference((byte)0);
        byte[] type_record = new byte[2];
        ByteByReference type_length = new ByteByReference((byte)1);
       
        type_record[0] = 85;
        type_record[1] = 0;
        id[0] = 0;
        id[1] = 0;
        byte message_nr = 1;
        ByteByReference card_formatted = new ByteByReference();
        byte[] payload = new byte[300];
       
        payload[0] = uri_id;
        byte[] b = uri_str.getBytes();
        
        System.arraycopy(b, 0, payload, 1, b.length);
        
        IntByReference payload_length = new IntByReference(b.length + 1);
        byte payloadLen = (byte)(b.length + 1);
        int payloadLenInt = b.length + 1;
        
        if(URI_RB_Tag.isSelected())
        {
            status = ufr.write_ndef_record(message_nr, tnf, type_record, type_length, id, id_length, payload, payload_length, card_formatted);
        }
        else if(URI_RB_Eeprom.isSelected())
        {
            status = ufr.WriteEmulationNdef((byte)1, type_record, (byte)1, id, (byte)0, payload, payloadLen);
        }
        else if(URI_RB_Ram.isSelected())
        {
            status = ufr.WriteEmulationNdefRam((byte)1, type_record, (byte)1, id, (byte)0, payload, payloadLenInt);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnURIWriteActionPerformed

    private void btnURIBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnURIBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(URI_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        uri_bulk = true;
        URI_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && uri_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String uri_str = URI_Write_TF.getText();
                            byte uri_id = (byte)URI_Identifier_CB.getSelectedIndex();

                            ByteByReference tnf = new ByteByReference((byte)1);
                            byte[] id = new byte[2];
                            ByteByReference id_length = new ByteByReference((byte)0);
                            byte[] type_record = new byte[2];
                            ByteByReference type_length = new ByteByReference((byte)1);

                            type_record[0] = 85;
                            type_record[1] = 0;
                            id[0] = 0;
                            id[1] = 0;
                            byte message_nr = 1;
                            ByteByReference card_formatted = new ByteByReference();
                            byte[] payload = new byte[300];

                            payload[0] = uri_id;
                            byte[] b = uri_str.getBytes();

                            System.arraycopy(b, 0, payload, 1, b.length);

                            IntByReference payload_length = new IntByReference(b.length + 1);

                            ufr_status = ufr.write_ndef_record(message_nr, tnf, type_record, type_length, id, id_length, payload, payload_length, card_formatted);          

                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    URI_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!uri_bulk)
                                        URI_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();    
    }//GEN-LAST:event_btnURIBulkStartActionPerformed

    private void btnURIBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnURIBulkStopActionPerformed
        uri_bulk = false;
        URI_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnURIBulkStopActionPerformed

    private void btnBluetoothReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBluetoothReadActionPerformed
        byte[] bt_mac_address = new byte[20];
        
        int status = ufr.ReadNdefRecord_Bluetooth(bt_mac_address);
        
        if(status == 0)
        {
            BT_Read_TF.setText(ByteArrayToString(bt_mac_address));
        }
        else
        {
            BT_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnBluetoothReadActionPerformed

    private void btnBluetoothWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBluetoothWriteActionPerformed
        
        String btMac = BT_Write_TF.getText();
        
        if(btMac.length() != 12)
        {
            JOptionPane.showMessageDialog(this, "Invalid bluetooth MAC address!");
            StatusLabel.setText("");
            return;
        }
        
        int status = 0;
        
        if(BT_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Bluetooth((byte)1, btMac);
        }
        else if(BT_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Bluetooth((byte)0, btMac);
        }
        else if(BT_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Bluetooth((byte)2, btMac);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnBluetoothWriteActionPerformed

    private void btnBTBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBTBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(BT_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        bt_bulk = true;
        BT_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && bt_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String btMac = BT_Write_TF.getText();
                            ufr_status = ufr.WriteNdefRecord_Bluetooth((byte)1, btMac);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    BT_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!bt_bulk)
                                        BT_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();    
    }//GEN-LAST:event_btnBTBulkStartActionPerformed

    private void btnBTiBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBTiBulkStopActionPerformed
       bt_bulk = false;
       BT_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnBTiBulkStopActionPerformed

    private void btnSMSReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMSReadActionPerformed
        
        byte[] phone_number = new byte[50];
        byte[] message = new byte[500];
        
        int status = ufr.ReadNdefRecord_SMS(phone_number, message);
        
        if(status == 0)
        {
            SMS_Phone_Read_TF.setText(ByteArrayToString(phone_number));
            SMS_Message_Read_TF.setText(ByteArrayToString(message));
        }
        else
        {
            SMS_Phone_Read_TF.setText("");
            SMS_Message_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnSMSReadActionPerformed

    private void btnSMSWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMSWriteActionPerformed
        
        String phone_str = SMS_Phone_Write_TF.getText();
        String message_str = SMS_Message_Write_TF.getText();
        
        int status = 0;
        
        if(SMS_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_SMS((byte)1, phone_str, message_str);
        }
        else if(SMS_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_SMS((byte)0, phone_str, message_str);
        }
        else if(SMS_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_SMS((byte)2, phone_str, message_str);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnSMSWriteActionPerformed

    private void btnSMSBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMSBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(SMS_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        sms_bulk = true;
        SMS_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && sms_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String phone_str = SMS_Phone_Write_TF.getText();
                            String message_str = SMS_Message_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_SMS((byte)1, phone_str, message_str);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    SMS_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!sms_bulk)
                                        SMS_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();   
    }//GEN-LAST:event_btnSMSBulkStartActionPerformed

    private void btnSMSBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMSBulkStopActionPerformed
        sms_bulk = false;
        SMS_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnSMSBulkStopActionPerformed

    private void btnLocationReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationReadActionPerformed
        
        byte[] latitude = new byte[50];
        byte[] longitude = new byte[50];
        
        int status = ufr.ReadNdefRecord_GeoLocation(latitude, longitude);
        
        if(status == 0)
        {
            Location_Latitude_Read_TF.setText(ByteArrayToString(latitude));
            Location_Longitude_Read_TF.setText(ByteArrayToString(longitude));
        }
        else
        {
            Location_Latitude_Read_TF.setText("");
            Location_Longitude_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnLocationReadActionPerformed

    private void btnLocationWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationWriteActionPerformed
        
        String latitude = Location_Latitude_Write_TF.getText();
        String longitude = Location_Longitude_Write_TF.getText();
        
        int status = 0;
        
        if(Location_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_GeoLocation((byte)1, latitude, longitude);
        }
        else if(Location_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_GeoLocation((byte)0, latitude, longitude);
        }
        else if(Location_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_GeoLocation((byte)2, latitude, longitude);
        }  
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnLocationWriteActionPerformed

    private void btnLocationBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Location_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        location_bulk = true;
        Location_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && location_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String latitude = Location_Latitude_Write_TF.getText();
                            String longitude = Location_Longitude_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_GeoLocation((byte)1, latitude, longitude);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Location_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!location_bulk)
                                        Location_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();  
    }//GEN-LAST:event_btnLocationBulkStartActionPerformed

    private void btnLocationBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationBulkStopActionPerformed
        location_bulk = false;
        Location_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnLocationBulkStopActionPerformed

    private void btnDestinationReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinationReadActionPerformed
        
        byte[] destination = new byte[100];
        
        int status = ufr.ReadNdefRecord_NaviDestination(destination);
        
        if(status == 0)
        {
            String str = ByteArrayToString(destination);
            Destination_Read_TF.setText(str.substring(0, str.length() - 1));
        }
        else
        {
            Destination_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnDestinationReadActionPerformed

    private void btnDestinationWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinationWriteActionPerformed
        
        String destination = Destination_Write_TF.getText();
        
        int status = 0;
        
        if(Destination_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_NaviDestination((byte)1, destination);
        }
        else if(Destination_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_NaviDestination((byte)0, destination);
        }
        else if(Destination_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_NaviDestination((byte)2, destination);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnDestinationWriteActionPerformed

    private void btnDestinationBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinationBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Destination_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        destination_bulk = true;
        Destination_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && destination_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String destination = Destination_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_NaviDestination((byte)1, destination);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Destination_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!destination_bulk)
                                        Destination_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();  
    }//GEN-LAST:event_btnDestinationBulkStartActionPerformed

    private void btnDestinationBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinationBulkStopActionPerformed
        destination_bulk = false;
        Destination_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnDestinationBulkStopActionPerformed

    private void btnEmailReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailReadActionPerformed
        
        byte[] email_address = new byte[50];
        byte[] subject = new byte[100];
        byte[] message = new byte[500];
        
        int status = ufr.ReadNdefRecord_Email(email_address, subject, message);
        
        if(status == 0)
        {
            EmailAddress_Read_TF.setText(ByteArrayToString(email_address));
            Subject_Read_TF.setText(ByteArrayToString(subject));
            EmailMessage_Read_TF.setText(ByteArrayToString(message));
        }
        else
        {
            EmailAddress_Read_TF.setText("");
            Subject_Read_TF.setText("");
            EmailMessage_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnEmailReadActionPerformed

    private void btnEmailWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailWriteActionPerformed
        
        String emailAddress = EmailAddress_Write_TF.getText();
        String subject = Subject_Write_TF.getText();
        String e_message = EmailMessage_Write_TF.getText();
        
        int status = 0;
        
        if(Email_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Email((byte)1, emailAddress, subject, e_message);
        }
        else if(Email_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Email((byte)0, emailAddress, subject, e_message);
        }
        else if(Email_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Email((byte)2, emailAddress, subject, e_message);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnEmailWriteActionPerformed

    private void btnEmailBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Email_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        email_bulk = true;
        Email_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && email_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String emailAddress = EmailAddress_Write_TF.getText();
                            String subject = Subject_Write_TF.getText();
                            String e_message = EmailMessage_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_Email((byte)1, emailAddress, subject, e_message);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Email_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!email_bulk)
                                        Email_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start(); 
    }//GEN-LAST:event_btnEmailBulkStartActionPerformed

    private void btnEmailBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailBulkStopActionPerformed
        email_bulk = false;
        Email_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnEmailBulkStopActionPerformed
   
    private void btnAddressReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressReadActionPerformed
        
        byte[] address = new byte[100];
        
        int status = ufr.ReadNdefRecord_Address(address);
               
        if(status == 0)
        {                   
            Address_Read_TF.setText(ByteArrayToString(address));
        }
        else
        {
            Address_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnAddressReadActionPerformed

    private void btnAddressWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressWriteActionPerformed
        String addr = Address_Write_TF.getText();
        
        int status = 0;
        
        if(Address_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Address((byte)1, addr);
        }
        else if(Address_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Address((byte)0, addr);
        }
        else if(Address_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Address((byte)2, addr);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnAddressWriteActionPerformed

    private void btnAddressBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Address_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        address_bulk = true;
        Address_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && address_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String addr = Address_Write_TF.getText();   
                            
                            ufr_status = ufr.WriteNdefRecord_Address((byte)1, addr);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Address_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!address_bulk)
                                        Address_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();  
    }//GEN-LAST:event_btnAddressBulkStartActionPerformed

    private void btnAddressBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressBulkStopActionPerformed
       address_bulk = false;
       Address_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnAddressBulkStopActionPerformed

    private void btnApplicationReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicationReadActionPerformed
        
        byte[] package_name = new byte[50];
        
        int status = ufr.ReadNdefRecord_AndroidApp(package_name);
        
        if(status == 0)
        {
            Application_Read_TF.setText(ByteArrayToString(package_name));
        }
        else
        {
            Application_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnApplicationReadActionPerformed

    private void btnApplicationWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicationWriteActionPerformed
        
        String app = Application_Write_TF.getText();
        
        int status = 0;
        
        if(Application_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_AndroidApp((byte)1, app);
        }
        else if(Application_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_AndroidApp((byte)0, app);
        }
        else if(Application_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_AndroidApp((byte)2, app);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnApplicationWriteActionPerformed

    private void btnApplicationBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicationBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Application_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        application_bulk = true;
        Application_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && application_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String app = Application_Write_TF.getText();  
                            
                            ufr_status = ufr.WriteNdefRecord_AndroidApp((byte)1, app);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Application_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!application_bulk)
                                        Application_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();  
    }//GEN-LAST:event_btnApplicationBulkStartActionPerformed

    private void btnApplicationBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicationBulkStopActionPerformed
        application_bulk = false;
        Application_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnApplicationBulkStopActionPerformed

    private void btnTextReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTextReadActionPerformed
       
        byte[] text = new byte[1000];
        
        int status = ufr.ReadNdefRecord_Text(text);
        
        if(status == 0)
        {
            Text_Read_TF.setText(ByteArrayToString(text));
        }
        else
        {
            Text_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnTextReadActionPerformed

    private void btnTextWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTextWriteActionPerformed
        
        String txt = Text_Write_TF.getText();
        
        int status = 0;
        
        if(Text_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Text((byte)1, txt);
        }
        else if(Text_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Text((byte)0, txt);
        }
        else if(Text_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Text((byte)2, txt);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnTextWriteActionPerformed

    private void btnTextBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTextBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Text_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        text_bulk = true;
        Text_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && text_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String txt = Text_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_Text((byte)1, txt);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Text_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!text_bulk)
                                        Text_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();  
    }//GEN-LAST:event_btnTextBulkStartActionPerformed

    private void btnTextBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTextBulkStopActionPerformed
        text_bulk = false;
        Text_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnTextBulkStopActionPerformed

    private void btnStreetViewReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStreetViewReadActionPerformed
        
        byte[] latitude = new byte[50];
        byte[] longitude = new byte[50];
        
        int status = ufr.ReadNdefRecord_StreetView(latitude, longitude);
        
        if(status == 0)
        {
            StreetView_Latitude_Read_TF.setText(ByteArrayToString(latitude));
            StreetView_Longitude_Read_TF.setText(ByteArrayToString(longitude));
        }
        else
        {
            StreetView_Latitude_Read_TF.setText("");
            StreetView_Longitude_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnStreetViewReadActionPerformed

    private void btnStreetViewWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStreetViewWriteActionPerformed
        
        String lat = StreetView_Latitude_Write_TF.getText();
        String lon = StreetView_Longitude_Write_TF.getText();
        
        int status = 0;
        
        if(StreetView_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_StreetView((byte)1, lat, lon);
        }
        else if(StreetView_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_StreetView((byte)0, lat, lon);
        }
        else if(StreetView_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_StreetView((byte)2, lat, lon);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnStreetViewWriteActionPerformed

    private void StreetViewBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetViewBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(StreetView_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        sw_bulk = true;
        StreetView_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && sw_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String lat = StreetView_Latitude_Write_TF.getText();
                            String lon = StreetView_Longitude_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_StreetView((byte)1, lat, lon);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    StreetView_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!sw_bulk)
                                        StreetView_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();  
    }//GEN-LAST:event_StreetViewBulkStartActionPerformed

    private void btnStreetViewBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStreetViewBulkStopActionPerformed
        sw_bulk = false;
        StreetView_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnStreetViewBulkStopActionPerformed

    private void btnPhoneReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhoneReadActionPerformed
        
        byte[] phone_number = new byte[50];
        
        int status = ufr.ReadNdefRecord_Phone(phone_number);
        
        if(status == 0)
        {
            Phone_Read_TF.setText(ByteArrayToString(phone_number));
        }
        else
        {
            Phone_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnPhoneReadActionPerformed

    private void btnPhoneWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhoneWriteActionPerformed
        
        String phone = Phone_Write_TF.getText();
        
        int status = 0;
        
        if(Phone_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Phone((byte)1, phone);
        }
        else if(Phone_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Phone((byte)0, phone);
        }
        else if(Phone_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Phone((byte)2, phone);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnPhoneWriteActionPerformed

    private void btnPhoneBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhoneBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Phone_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        phone_bulk = true;
        Phone_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && phone_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String phone = Phone_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_Phone((byte)1, phone);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Phone_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!phone_bulk)
                                        Phone_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start();  
    }//GEN-LAST:event_btnPhoneBulkStartActionPerformed

    private void btnPhoneBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhoneBulkStopActionPerformed
        phone_bulk = false;
        Phone_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnPhoneBulkStopActionPerformed

    private void btnContactReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactReadActionPerformed
        
        byte[] vCard = new byte[1000];
        
        int status = ufr.ReadNdefRecord_Contact(vCard);
        
        if(status == 0)
        {
            Contact_Read_TF.setText(ByteArrayToString(vCard));
        }
        else
        {
            Contact_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnContactReadActionPerformed

    private void btnWriteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteContactActionPerformed
        
        String name = Contact_Name_TF.getText();
        String company = Contact_Company_TF.getText();
        String address = Contact_Address_TF.getText();
        String phone = Contact_Phone_TF.getText();
        String email = Contact_Email_TF.getText();
        String website = Contact_Website_TF.getText();
        
        int status = 0;
        
        if(Contact_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Contact((byte)1, name, company, address, phone, email, website);
        }
        else if(Contact_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Contact((byte)0, name, company, address, phone, email, website);
        }
        else if(Contact_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Contact((byte)2, name, company, address, phone, email, website);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnWriteContactActionPerformed

    private void btnContactBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Contact_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        contact_bulk = true;
        Contact_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && contact_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String name = Contact_Name_TF.getText();
                            String company = Contact_Company_TF.getText();
                            String address = Contact_Address_TF.getText();
                            String phone = Contact_Phone_TF.getText();
                            String email = Contact_Email_TF.getText();
                            String website = Contact_Website_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_Contact((byte)1, name, company, address, phone, email, website);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Contact_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!contact_bulk)
                                        Contact_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start(); 
    }//GEN-LAST:event_btnContactBulkStartActionPerformed

    private void btnContactBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactBulkStopActionPerformed
        contact_bulk = false;
        Contact_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnContactBulkStopActionPerformed

    private void btnBitcoinReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitcoinReadActionPerformed
        
        byte[] bitcoin_address = new byte[200];
        byte[] amount = new byte[50];
        byte[] message = new byte[500];
        
        int status = ufr.ReadNdefRecord_Bitcoin(bitcoin_address, amount, message);
        
        if(status == 0)
        {
            Bitcoin_Address_Read_TF.setText(ByteArrayToString(bitcoin_address));
            Bitcoin_Amount_Read_TF.setText(ByteArrayToString(amount));
            Bitcoin_Message_Read_TF.setText(ByteArrayToString(message));
        }
        else
        {
            Bitcoin_Address_Read_TF.setText("");
            Bitcoin_Amount_Read_TF.setText("");
            Bitcoin_Message_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnBitcoinReadActionPerformed

    private void btnBitcoinWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitcoinWriteActionPerformed
        String bitcoinAddr = Bitcoin_Address_Write_TF.getText();
        String amount = Bitcoin_Amount_Write_TF.getText();
        String message = Bitcoin_Message_Write_TF.getText();
        
        int status = 0;
        
        if(Bitcoin_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Bitcoin((byte)1, bitcoinAddr, amount, message);
        }
        else if(Bitcoin_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Bitcoin((byte)0, bitcoinAddr, amount, message);
        }
        else if(Bitcoin_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Bitcoin((byte)2, bitcoinAddr, amount, message);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnBitcoinWriteActionPerformed

    private void btnBitcoinBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitcoinBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Bitcoin_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        bitcoin_bulk = true;
        Bitcoin_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && bitcoin_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {
                            String bitcoinAddr = Bitcoin_Address_Write_TF.getText();
                            String amount = Bitcoin_Amount_Write_TF.getText();
                            String message = Bitcoin_Message_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_Bitcoin((byte)1, bitcoinAddr, amount, message);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Bitcoin_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!bitcoin_bulk)
                                        Bitcoin_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start(); 
    }//GEN-LAST:event_btnBitcoinBulkStartActionPerformed

    private void btnBitcoinBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitcoinBulkStopActionPerformed
        bitcoin_bulk = false;
        Bitcoin_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnBitcoinBulkStopActionPerformed

    private void btnSkypeReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkypeReadActionPerformed
        
        byte[] user_name = new byte[50];
        byte[] action = new byte[10];
         
        int status = ufr.ReadNdefRecord_Skype(user_name, action);
        
        if(status == 0)
        {
            Skype_Username_Read_TF.setText(ByteArrayToString(user_name));
            Skype_Operation_Read_TF.setText(ByteArrayToString(action));
        }
        else
        {
            Skype_Username_Read_TF.setText("");
            Skype_Operation_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnSkypeReadActionPerformed

    private void btnSkypeWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkypeWriteActionPerformed
        
        String username = Skype_Username_Write_TF.getText();
        byte operation = (byte)Skype_Operation_CB.getSelectedIndex();
        
        int status = 0;
        
        if(Skype_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Skype((byte)1, username, operation);
        }
        else if(Skype_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Skype((byte)0, username, operation);
        }
        else if(Skype_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Skype((byte)2, username, operation);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnSkypeWriteActionPerformed

    private void btnSkypeBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkypeBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Skype_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        skype_bulk = true;
        Skype_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && skype_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {          
                            String username = Skype_Username_Write_TF.getText();
                            byte operation = (byte)Skype_Operation_CB.getSelectedIndex();
                            
                            ufr_status = ufr.WriteNdefRecord_Skype((byte)1, username, operation);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Skype_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!skype_bulk)
                                        Skype_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start(); 
    }//GEN-LAST:event_btnSkypeBulkStartActionPerformed

    private void btnSkypeBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkypeBulkStopActionPerformed
        skype_bulk = false;
        Skype_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnSkypeBulkStopActionPerformed

    private void btnViberReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViberReadActionPerformed
        
        byte[] message = new byte[1000];
        
        int status = ufr.ReadNdefRecord_Viber(message);
        
        if(status == 0)
        {
            Viber_Message_Read_TF.setText(ByteArrayToString(message));
        }
        else
        {
            Viber_Message_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnViberReadActionPerformed

    private void btnViberWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViberWriteActionPerformed
        
        String message = Viber_Message_Write_TF.getText();
        
        int status = 0;
        
        if(Viber_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Viber((byte)1, message);
        }
        else if(Viber_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Viber((byte)0, message);
        }
        else if(Viber_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Viber((byte)2, message);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnViberWriteActionPerformed

    private void btnViberBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViberBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Viber_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        viber_bulk = true;
        Viber_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && viber_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {          
                            String message = Viber_Message_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_Viber((byte)1, message);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Viber_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!viber_bulk)
                                        Viber_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start(); 
    }//GEN-LAST:event_btnViberBulkStartActionPerformed

    private void btnViberBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViberBulkStopActionPerformed
        viber_bulk = false;
        Viber_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnViberBulkStopActionPerformed

    private void btnWhatsappReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhatsappReadActionPerformed
        byte[] message = new byte[1000];
        
        int status = ufr.ReadNdefRecord_Whatsapp(message);
        
        if(status == 0)
        {
            Whatsapp_Message_Read_TF.setText(ByteArrayToString(message));
        }
        else
        {
            Whatsapp_Message_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnWhatsappReadActionPerformed

    private void btnWhatsappWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhatsappWriteActionPerformed
        String message = Whatsapp_Message_Write_TF.getText();
        
        int status = 0;
        
        if(Whatsapp_RB_Tag.isSelected())
        {
            status = ufr.WriteNdefRecord_Whatsapp((byte)1, message);
        }
        else if(Whatsapp_RB_Eeprom.isSelected())
        {
            status = ufr.WriteNdefRecord_Whatsapp((byte)0, message);
        }
        else if(Whatsapp_RB_Ram.isSelected())
        {
            status = ufr.WriteNdefRecord_Whatsapp((byte)2, message);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnWhatsappWriteActionPerformed

    private void btnWhatsappBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhatsappBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Whatsapp_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        whatsapp_bulk = true;
        Whatsapp_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && whatsapp_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {          
                            String message = Whatsapp_Message_Write_TF.getText();
                            
                            ufr_status = ufr.WriteNdefRecord_Whatsapp((byte)1, message);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Whatsapp_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!whatsapp_bulk)
                                        Whatsapp_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start(); 
    }//GEN-LAST:event_btnWhatsappBulkStartActionPerformed

    private void btnWhatsappBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhatsappBulkStopActionPerformed
        whatsapp_bulk = false;
        Whatsapp_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnWhatsappBulkStopActionPerformed

    private void btnRawReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRawReadActionPerformed
        
        ByteByReference tnf = new ByteByReference();
        byte[] type_record = new byte[100];
        ByteByReference type_length = new ByteByReference();
        byte[] id = new byte[100];
        ByteByReference id_length = new ByteByReference();
        byte[] payload = new byte[500];
        IntByReference payload_length = new IntByReference();
        
        int status = ufr.read_ndef_record((byte)1, (byte)1, tnf, type_record, type_length, id, id_length, payload, payload_length);
        
        if(status == 0)
        {
            Raw_Tnf_Read_TF.setText(Byte.toString(tnf.getValue()));
            Raw_Type_Read_TF.setText(ByteArrayToString(type_record));
            Raw_ID_Read_TF.setText(ByteArrayToString(id));
            Raw_Payload_Read_TF.setText(ByteArrayToString(payload));
        }
        else
        {
            Raw_Tnf_Read_TF.setText("");
            Raw_Type_Read_TF.setText("");
            Raw_ID_Read_TF.setText("");
            Raw_Payload_Read_TF.setText("");
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnRawReadActionPerformed

    private void btnRawWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRawWriteActionPerformed
        
        String tnfstr = Raw_Tnf_Write_TF.getText();
        String typestr = Raw_Type_Write_TF.getText();
        String idstr = Raw_ID_Write_TF.getText();
        String payloadstr = Raw_Payload_Write_TF.getText();
        
        ByteByReference tnf = new ByteByReference(Byte.parseByte(tnfstr));
        byte[] id = new byte[2];
        ByteByReference id_length = new ByteByReference((byte)idstr.length());
        byte[] type_record = new byte[2];
        ByteByReference type_length = new ByteByReference((byte)typestr.length());
        ByteByReference card_formatted = new ByteByReference();
        
        id[0] = Byte.parseByte(idstr);
        
        byte[] payload = payloadstr.getBytes(Charset.forName("UTF-8"));
        
        IntByReference payload_length = new IntByReference(payload.length);
        
        byte payloadLen = (byte)(payload.length);
        int payloadLenInt = payload.length;
        
        int status = 0;
        
        if(Raw_RB_Tag.isSelected())
        {
            status = ufr.write_ndef_record((byte)1, tnf, type_record, type_length, id, id_length, payload, payload_length, card_formatted);
        }
        else if(Raw_RB_Eeprom.isSelected())
        {
            status = ufr.WriteEmulationNdef((byte)1, type_record, (byte)typestr.length(), id, (byte)idstr.length(), payload, payloadLen);
        }
        else if(Raw_RB_Ram.isSelected())
        {
            status = ufr.WriteEmulationNdefRam((byte)1, type_record, (byte)typestr.length(), id, (byte)idstr.length(), payload, payloadLenInt);
        }
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
    }//GEN-LAST:event_btnRawWriteActionPerformed

    private void btnRawBulkStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRawBulkStartActionPerformed
        try
        {
            num = Integer.parseInt(Raw_Num_Tags.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        
        raw_bulk = true;
        Raw_Remaining_Bulk.setText(Integer.toString(num));
        
        new Thread()
        {
            public void run()
            {
                byte[] old_uid = new byte[10];
                
                while(num != 0 && raw_bulk)
                {
                    ByteByReference bCardUIDSize = new ByteByReference();
                    ByteByReference bCardType = new ByteByReference();
                    byte[] cardUID = new byte[10];
                    ufr_status = ufr.GetCardIdEx(bCardType, cardUID, bCardUIDSize);
                    
                    if(ufr_status == 0)
                    {
                        if(checkUID(cardUID, old_uid, (byte)7) == false)
                        {          
                            String tnfstr = Raw_Tnf_Write_TF.getText();
                            String typestr = Raw_Type_Write_TF.getText();
                            String idstr = Raw_ID_Write_TF.getText();
                            String payloadstr = Raw_Payload_Write_TF.getText();

                            ByteByReference tnf = new ByteByReference(Byte.parseByte(tnfstr));
                            byte[] id = new byte[2];
                            ByteByReference id_length = new ByteByReference((byte)idstr.length());
                            byte[] type_record = new byte[2];
                            ByteByReference type_length = new ByteByReference((byte)typestr.length());
                            ByteByReference card_formatted = new ByteByReference();

                            id[0] = Byte.parseByte(idstr);

                            byte[] payload = payloadstr.getBytes(Charset.forName("UTF-8"));

                            IntByReference payload_length = new IntByReference(payload.length);
                            
                            ufr_status = ufr.write_ndef_record((byte)1, tnf, type_record, type_length, id, id_length, payload, payload_length, card_formatted);
                            
                            if(ufr_status == 0)
                            {
                                for(byte i = 0; i < bCardUIDSize.getValue(); i++)
                                {
                                    old_uid[i] = cardUID[i];
                                }
                                num = num - 1;
                                ufr.ReaderUISignal((byte)1, (byte)1);
                            }

                            SwingUtilities.invokeLater(new Runnable(){
                                public void run(){
                                    Raw_Remaining_Bulk.setText(Integer.toString(num));
                                    StatusLabel.setText(ufr.UFR_Status2String(ufr_status));

                                    if(!raw_bulk)
                                        Raw_Remaining_Bulk.setText("");
                                }
                            }); 
                        }
                    }
                    else if(ufr_status == 8)
                    {
                        for(byte i = 0; i < 10; i++)
                        {
                            old_uid[i] = 0;
                        }
                    }
                }
            }
        }.start(); 
    }//GEN-LAST:event_btnRawBulkStartActionPerformed

    private void btnRawBulkStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRawBulkStopActionPerformed
        raw_bulk = false;
        Raw_Remaining_Bulk.setText("");
    }//GEN-LAST:event_btnRawBulkStopActionPerformed

    private void btnNdefInitializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNdefInitializeActionPerformed
        
        int status = ufr.ndef_card_initialization();
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
        
    }//GEN-LAST:event_btnNdefInitializeActionPerformed

    private void btnEraseLastRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraseLastRecordActionPerformed
       
        int status = ufr.erase_last_ndef_record((byte)1);
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
        
    }//GEN-LAST:event_btnEraseLastRecordActionPerformed

    private void btnStartEEPROMEmulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartEEPROMEmulationActionPerformed
        
        int status = ufr.TagEmulationStart();
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
        
    }//GEN-LAST:event_btnStartEEPROMEmulationActionPerformed

    private void btnStartRamEmulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartRamEmulationActionPerformed
        
        int status = ufr.TagEmulationStartRam();
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
        
    }//GEN-LAST:event_btnStartRamEmulationActionPerformed

    private void btnStopEEPROMEmulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopEEPROMEmulationActionPerformed
                
        int status = ufr.TagEmulationStop();
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
        
    }//GEN-LAST:event_btnStopEEPROMEmulationActionPerformed

    private void btnStopRamEmulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopRamEmulationActionPerformed
        
        int status = ufr.TagEmulationStopRam();
        
        StatusLabel.setText(ufr.UFR_Status2String(status));
        
    }//GEN-LAST:event_btnStopRamEmulationActionPerformed

    private void btnLockTagReadOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLockTagReadOnlyActionPerformed
            int status;
            byte[] page_data = new byte[16];
            byte page_address, auth_mode;
            byte[] key = { (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF };
            ByteByReference ct = new ByteByReference();
            byte dlogic_card_type = 8;
             
            status = ufr.GetDlogicCardType(ct);
            
            byte DL_NTAG_203 = 0x05;
            byte DL_NTAG_210 = 0x06;
            byte DL_NTAG_212 = 0x07;
            byte DL_NTAG_213 = 0x08;
            byte DL_NTAG_215 = 0x09;
            byte DL_NTAG_216 = 0x0A;
            
            if(status != 0)
            {
                StatusLabel.setText(ufr.UFR_Status2String(status));
                return;
            }

            dlogic_card_type = ct.getValue();

            if ((dlogic_card_type == DL_NTAG_203)
                || dlogic_card_type == DL_NTAG_213
                || (dlogic_card_type == DL_NTAG_215)
                || (dlogic_card_type == DL_NTAG_216)
                )
            {
                
                for(int i = 0; i < 16; i++)
                    page_data[i] = 0;
                
                auth_mode = 0x60;
                page_address = 2;
                page_data[2] = (byte)0xFF; //Static lock byte 0
                page_data[3] = (byte)0xFF; //Static lock byte 1


                status = ufr.BlockWrite_PK(page_data, page_address, auth_mode, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;
                }
               
                for(int i = 0; i < 16; i++)
                    page_data[i] = 0;
                
                if ((dlogic_card_type == DL_NTAG_203)
                    || (dlogic_card_type == DL_NTAG_213)
                    || (dlogic_card_type == DL_NTAG_215)
                    || (dlogic_card_type == DL_NTAG_216))
                {
                    if (dlogic_card_type == DL_NTAG_203)
                    { 
                        page_address = 40;
                        page_data[0] = (byte)0xFF; //Dynamic lock byte 0
                        page_data[1] = (byte)0x11; //Dynamic lock byte 1
                        page_data[2] = (byte)0x00; //Dynamic lock byte 2
                    }
                    else if (dlogic_card_type == DL_NTAG_213)
                    {
                        page_address = 40;
                        page_data[0] = (byte)0xFF; //Dynamic lock byte 0
                        page_data[1] = (byte)0x0F; //Dynamic lock byte 1
                        page_data[2] = (byte)0x00; //Dynamic lock byte 2
                    }
                    else if (dlogic_card_type == DL_NTAG_215)
                    { 
                        page_address = (byte)130;
                        page_data[0] = (byte)0xFF; //Dynamic lock byte 0
                        page_data[1] = (byte)0x00; //Dynamic lock byte 1
                        page_data[2] = (byte)0x0F; //Dynamic lock byte 2
                    }
                    else if (dlogic_card_type == DL_NTAG_216)
                    { 
                        page_address = (byte)226;
                        page_data[0] = (byte)0xFF; //Dynamic lock byte 0
                        page_data[1] = (byte)0x3F; //Dynamic lock byte 1
                        page_data[2] = (byte)0x7F; //Dynamic lock byte 2
                    }

                    status = ufr.BlockWrite_PK(page_data, page_address, auth_mode, key);
                    
                    if (status != 0)
                    {
                        StatusLabel.setText(ufr.UFR_Status2String(status));        
                        return;
                    }

                    if (status == 0)
                    {
                        ufr.ReaderUISignal((byte)1, (byte)1);
                    }
                    else
                    {
                        ufr.ReaderUISignal((byte)2, (byte)2);
                    }

                    JOptionPane.showMessageDialog(this, "Tag has been locked successfully");
                    StatusLabel.setText(ufr.UFR_Status2String(status)); 
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "Unsupported card type");
                StatusLabel.setText("");
            }
    }//GEN-LAST:event_btnLockTagReadOnlyActionPerformed

    public static byte[] hexStringToByteArray(String paramString) throws IllegalArgumentException {
        int j = paramString.length();

        if (j % 2 == 1) {
            throw new IllegalArgumentException("Hex string must have even number of characters");
        }

        byte[] arrayOfByte = new byte[j / 2];
        int hiNibble, loNibble;

        for (int i = 0; i < j; i += 2) {
            hiNibble = Character.digit(paramString.charAt(i), 16);
            loNibble = Character.digit(paramString.charAt(i + 1), 16);
            if (hiNibble < 0) {
                throw new IllegalArgumentException("Illegal hex digit at position " + i);
            }
            if (loNibble < 0) {
                throw new IllegalArgumentException("Illegal hex digit at position " + (i + 1));
            }
            arrayOfByte[(i / 2)] = ((byte) ((hiNibble << 4) + loNibble));
        }
        return arrayOfByte;
    }
    
    
    private void btnRemovePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePasswordActionPerformed
        
            byte DL_NTAG_203 = 0x05;
            byte DL_NTAG_210 = 0x06;
            byte DL_NTAG_212 = 0x07;
            byte DL_NTAG_213 = 0x08;
            byte DL_NTAG_215 = 0x09;
            byte DL_NTAG_216 = 0x0A;
        
            if (Hex_CB.isSelected())
            {
                if (Password_TF.getText().length() != 12)
                {
                    JOptionPane.showMessageDialog(this, "Password needs to be 6 bytes (12 characters) long. e.g AABBCCDDEEFF");
                    return;
                }
            }
            else
            {
                if (Password_TF.getText().length() != 6)
                {
                    JOptionPane.showMessageDialog(this, "Password needs to be 6 characters long");
                    return;
                }
            }

            byte[] pwd = new byte[4];
            byte[] pack = new byte[2];

            if (Hex_CB.isSelected())
            {
                String pwd_str = Password_TF.getText().substring(0, 8);
                String pack_str = Password_TF.getText().substring(8, 12);
                pwd = hexStringToByteArray(pwd_str);
                pack = hexStringToByteArray(pack_str);
            }
            else
            {
                String pwd_str = Password_TF.getText().substring(0, 4);
                String pack_str = Password_TF.getText().substring(4, 6);
                pwd = pwd_str.getBytes(Charset.forName("UTF-8"));
                pack = pack_str.getBytes(Charset.forName("UTF-8"));
            }

            int status;
            ByteByReference ct = new ByteByReference();

            status = ufr.GetDlogicCardType(ct);
            
            if (status != 0)
            {
                StatusLabel.setText(ufr.UFR_Status2String(status));
                return;   
            }
            
            byte dlogic_card_type = ct.getValue();

            if ((dlogic_card_type == DL_NTAG_213)
                || (dlogic_card_type == DL_NTAG_215)
                || (dlogic_card_type == DL_NTAG_216)
                )
            {
                
                byte[] page_data = new byte[16];
                byte page_address = 0;
                byte[] key = { (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF };
                byte[] pwd_key = { (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF };
                byte[] pack_key = { (byte)0xFF, (byte)0xFF };
                
                System.arraycopy(pwd, 0, pwd_key, 0, 4);
                System.arraycopy(pack, 0, pack_key, 0, 2);
                System.arraycopy(pwd, 0, key, 0, 4);
                System.arraycopy(pack, 0, key, 4, 2);             

                /*pwd write*/
                if (dlogic_card_type == DL_NTAG_213)
                {
                    page_address = 43;
                }
                else if (dlogic_card_type == DL_NTAG_215)
                {
                    page_address = (byte)133;
                }
                else if (dlogic_card_type == DL_NTAG_216)
                {
                    page_address = (byte)229;
                }

                status = ufr.BlockWrite_PK(pwd_key, page_address, (byte)0x61, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;     
                }

                /* PACK write */
                if (dlogic_card_type == DL_NTAG_213)
                {
                    page_address = (byte)44;
                }
                else if (dlogic_card_type == DL_NTAG_215)
                {
                    page_address = (byte)134;
                }
                else if (dlogic_card_type == DL_NTAG_216)
                {
                    page_address = (byte)230;
                }

                status = ufr.BlockWrite_PK(pack_key, page_address, (byte)0x61, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;  
                }

                /* set password page address */
                /* setting pwd page address higher than tag user memory pages count effectively disables pwd protection */

                if (dlogic_card_type == DL_NTAG_213)
                {
                    page_address = (byte)41;
                }
                else if (dlogic_card_type == DL_NTAG_215)
                {
                    page_address = (byte)131;
                }
                else if (dlogic_card_type == DL_NTAG_216)
                {
                    page_address = (byte)227;
                }
                byte[] page_address_data = { 0x00, 0x00, 0x00, 0x00 };

                status = ufr.BlockRead_PK(page_address_data, page_address, (byte)0x61, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;  
                }

                page_address_data[3] = (byte)0xFF;

                status = ufr.BlockWrite_PK(page_address_data, page_address, (byte)0x61, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;  
                }


                /* set pwd authentication level */
                if (dlogic_card_type == DL_NTAG_213)
                {
                    page_address = (byte)42;
                }
                else if (dlogic_card_type == DL_NTAG_215)
                {
                    page_address = (byte)132;
                }
                else if (dlogic_card_type == DL_NTAG_216)
                {
                    page_address = (byte)228;
                }
                byte[] auth_level_data = { 0x00, 0x00, 0x00, 0x00 };

                status = ufr.BlockRead_PK(auth_level_data, page_address, (byte)0x61, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;  
                }

                if (Password_Protection_CB.getSelectedIndex() == 0)
                    auth_level_data[0] = (byte)0x00;
                else
                    auth_level_data[0] = (byte)0x80;

                status = ufr.BlockWrite_PK(auth_level_data, page_address, (byte)0x61, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;  
                }

                if (status == 0)
                {
                    ufr.ReaderUISignal((byte)1, (byte)1);
                }
                else
                {
                    ufr.ReaderUISignal((byte)2, (byte)2);
                }
                
                JOptionPane.showMessageDialog(this, "Password removed successfully");
                StatusLabel.setText(ufr.UFR_Status2String(status));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Unsupported card type");
                StatusLabel.setText("");
            }
    }//GEN-LAST:event_btnRemovePasswordActionPerformed

    private void btnSetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetPasswordActionPerformed
            byte DL_NTAG_203 = 0x05;
            byte DL_NTAG_210 = 0x06;
            byte DL_NTAG_212 = 0x07;
            byte DL_NTAG_213 = 0x08;
            byte DL_NTAG_215 = 0x09;
            byte DL_NTAG_216 = 0x0A;
        
            if (Hex_CB.isSelected())
            {
                if (Password_TF.getText().length() != 12)
                {
                    JOptionPane.showMessageDialog(this, "Password needs to be 6 bytes (12 characters) long. e.g AABBCCDDEEFF");
                    return;
                }
            }
            else
            {
                if (Password_TF.getText().length() != 6)
                {
                    JOptionPane.showMessageDialog(this, "Password needs to be 6 characters long");
                    return;
                }
            }

            byte[] pwd = new byte[4];
            byte[] pack = new byte[2];

            if (Hex_CB.isSelected())
            {
                String pwd_str = Password_TF.getText().substring(0, 8);
                String pack_str = Password_TF.getText().substring(8, 12);
                pwd = hexStringToByteArray(pwd_str);
                pack = hexStringToByteArray(pack_str);
            }
            else
            {
                String pwd_str = Password_TF.getText().substring(0, 4);
                String pack_str = Password_TF.getText().substring(4, 6);
                pwd = pwd_str.getBytes(Charset.forName("UTF-8"));
                pack = pack_str.getBytes(Charset.forName("UTF-8"));
            }

            int status;
            ByteByReference ct = new ByteByReference();

            status = ufr.GetDlogicCardType(ct);
            
            if (status != 0)
            {
                StatusLabel.setText(ufr.UFR_Status2String(status));
                return;   
            }
            
            byte dlogic_card_type = ct.getValue();

            if ((dlogic_card_type == DL_NTAG_213)
                || (dlogic_card_type == DL_NTAG_215)
                || (dlogic_card_type == DL_NTAG_216)
                )
            {
                /*pwd write*/

                byte[] page_data = new byte[16];
                byte page_address = 0, auth_mode = 0x60;
                byte[] key = { (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF };
                byte[] pwd_key = { (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF };
                byte[] pack_key = { (byte)0xFF, (byte)0xFF };
                System.arraycopy(pwd, 0, pwd_key, 0, 4);
                System.arraycopy(pack, 0, pack_key, 0, 2);
                
                if (dlogic_card_type == DL_NTAG_213)
                {
                    page_address = (byte)43;
                }
                else if (dlogic_card_type == DL_NTAG_215)
                {
                    page_address = (byte)133;
                }
                else if (dlogic_card_type == DL_NTAG_216)
                {
                    page_address = (byte)229;
                }

                status = ufr.BlockWrite_PK(pwd_key, page_address, (byte)0x60, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;   
                }

                /* PACK write */

                if (dlogic_card_type == DL_NTAG_213)
                {
                    page_address = (byte)44;
                }
                else if (dlogic_card_type == DL_NTAG_215)
                {
                    page_address = (byte)134;
                }
                else if (dlogic_card_type == DL_NTAG_216)
                {
                    page_address = (byte)230;
                }

                status = ufr.BlockWrite_PK(pack_key, page_address, auth_mode, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;
                }

                /* set password page address */
                if (dlogic_card_type == DL_NTAG_213)
                {
                    page_address = (byte)41;
                }
                else if (dlogic_card_type == DL_NTAG_215)
                {
                    page_address = (byte)131;
                }
                else if (dlogic_card_type == DL_NTAG_216)
                {
                    page_address = (byte)227;
                }
                byte[] page_address_data = { 0x00, 0x00, 0x00, 0x00 };

                status = ufr.BlockRead_PK(page_address_data, page_address, (byte)0x60, key);
                
                try
                {
                    page_address_data[3] = (byte)Byte.parseByte(Password_Address_TF.getText());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Invalid password address!");
                }

                status = ufr.BlockWrite_PK(page_address_data, page_address, (byte)0x60, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;
                }

                status = ufr.BlockWrite_PK(pack_key, page_address, auth_mode, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;
                }
                /* set pwd authentication level */
                if (dlogic_card_type == DL_NTAG_213)
                {
                    page_address = (byte)41;
                }
                else if (dlogic_card_type == DL_NTAG_215)
                {
                    page_address = (byte)131;
                }
                else if (dlogic_card_type == DL_NTAG_216)
                {
                    page_address = (byte)227;
                }
                byte[] auth_level_data = { 0x00, 0x00, 0x00, 0x00 };

                status = ufr.BlockRead_PK(auth_level_data, page_address, (byte)0x60, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;
                }

                if (Password_Protection_CB.getSelectedIndex() == 0)
                    auth_level_data[0] = (byte)0x00;
                else
                    auth_level_data[0] = (byte)0x80;

                status = ufr.BlockWrite_PK(auth_level_data, page_address, (byte)0x60, key);
                
                if (status != 0)
                {
                    StatusLabel.setText(ufr.UFR_Status2String(status));
                    return;
                }

                if (status == 0)
                {
                    ufr.ReaderUISignal((byte)1, (byte)1);
                }
                else
                {
                    ufr.ReaderUISignal((byte)2, (byte)2);
                }

                JOptionPane.showMessageDialog(this, "Password set successfully");
                StatusLabel.setText(ufr.UFR_Status2String(status));

            }
            else if (dlogic_card_type == DL_NTAG_203)
            {
                JOptionPane.showMessageDialog(this,"NTAG203 is not supported.");
                return;
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Unsupported card type");
                StatusLabel.setText("");
            }
    }//GEN-LAST:event_btnSetPasswordActionPerformed

    private void UseAdvancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseAdvancedActionPerformed
        if(UseAdvanced.isSelected())
        {
           TF_ReaderType.setEnabled(true);
           TF_PortName.setEnabled(true);
           TF_PortInterface.setEnabled(true);
           TF_Arg.setEnabled(true);
        }
        else
        {
           TF_ReaderType.setEnabled(false);
           TF_PortName.setEnabled(false);
           TF_PortInterface.setEnabled(false);
           TF_Arg.setEnabled(false);
        }
    }//GEN-LAST:event_UseAdvancedActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UfrNdefForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UfrNdefForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UfrNdefForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UfrNdefForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UfrNdefForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address_Num_Tags;
    private javax.swing.JRadioButton Address_RB_Eeprom;
    private javax.swing.ButtonGroup Address_RB_Group;
    private javax.swing.JRadioButton Address_RB_Ram;
    private javax.swing.JRadioButton Address_RB_Tag;
    private javax.swing.JTextField Address_Read_TF;
    private javax.swing.JLabel Address_Remaining_Bulk;
    private javax.swing.JTextField Address_Write_TF;
    private javax.swing.JTextField Application_Num_Tags;
    private javax.swing.JRadioButton Application_RB_Eeprom;
    private javax.swing.ButtonGroup Application_RB_Group;
    private javax.swing.JRadioButton Application_RB_Ram;
    private javax.swing.JRadioButton Application_RB_Tag;
    private javax.swing.JTextField Application_Read_TF;
    private javax.swing.JLabel Application_Remaining_Bulk;
    private javax.swing.JTextField Application_Write_TF;
    private javax.swing.JTextField AuthType_Read_TF;
    private javax.swing.JComboBox<String> AuthType_Write_CB;
    private javax.swing.JTextField BT_Num_Tags;
    private javax.swing.JRadioButton BT_RB_Eeprom;
    private javax.swing.ButtonGroup BT_RB_Group;
    private javax.swing.JRadioButton BT_RB_Ram;
    private javax.swing.JRadioButton BT_RB_Tag;
    private javax.swing.JTextField BT_Read_TF;
    private javax.swing.JLabel BT_Remaining_Bulk;
    private javax.swing.JTextField BT_Write_TF;
    private javax.swing.JTextField Bitcoin_Address_Read_TF;
    private javax.swing.JTextField Bitcoin_Address_Write_TF;
    private javax.swing.JTextField Bitcoin_Amount_Read_TF;
    private javax.swing.JTextField Bitcoin_Amount_Write_TF;
    private javax.swing.JTextArea Bitcoin_Message_Read_TF;
    private javax.swing.JTextArea Bitcoin_Message_Write_TF;
    private javax.swing.JTextField Bitcoin_Num_Tags;
    private javax.swing.JRadioButton Bitcoin_RB_Eeprom;
    private javax.swing.ButtonGroup Bitcoin_RB_Group;
    private javax.swing.JRadioButton Bitcoin_RB_Ram;
    private javax.swing.JRadioButton Bitcoin_RB_Tag;
    private javax.swing.JLabel Bitcoin_Remaining_Bulk;
    private javax.swing.JTextField Contact_Address_TF;
    private javax.swing.JTextField Contact_Company_TF;
    private javax.swing.JTextField Contact_Email_TF;
    private javax.swing.JTextField Contact_Name_TF;
    private javax.swing.JTextField Contact_Num_Tags;
    private javax.swing.JTextField Contact_Phone_TF;
    private javax.swing.JRadioButton Contact_RB_Eeprom;
    private javax.swing.ButtonGroup Contact_RB_Group;
    private javax.swing.JRadioButton Contact_RB_Ram;
    private javax.swing.JRadioButton Contact_RB_Tag;
    private javax.swing.JTextArea Contact_Read_TF;
    private javax.swing.JLabel Contact_Remaining_Bulk;
    private javax.swing.JTextField Contact_Website_TF;
    private javax.swing.JTextField Destination_Num_Tags;
    private javax.swing.JRadioButton Destination_RB_Eeprom;
    private javax.swing.ButtonGroup Destination_RB_Group;
    private javax.swing.JRadioButton Destination_RB_Ram;
    private javax.swing.JRadioButton Destination_RB_Tag;
    private javax.swing.JTextField Destination_Read_TF;
    private javax.swing.JLabel Destination_Remaining_Bulk;
    private javax.swing.JTextField Destination_Write_TF;
    private javax.swing.JTextField EmailAddress_Read_TF;
    private javax.swing.JTextField EmailAddress_Write_TF;
    private javax.swing.JTextArea EmailMessage_Read_TF;
    private javax.swing.JTextArea EmailMessage_Write_TF;
    private javax.swing.JTextField Email_Num_Tags;
    private javax.swing.JRadioButton Email_RB_Eeprom;
    private javax.swing.ButtonGroup Email_RB_Group;
    private javax.swing.JRadioButton Email_RB_Ram;
    private javax.swing.JRadioButton Email_RB_Tag;
    private javax.swing.JLabel Email_Remaining_Bulk;
    private javax.swing.JTextField Encryption_Read_TF;
    private javax.swing.JComboBox<String> Encryption_Write_CB;
    private javax.swing.JCheckBox Hex_CB;
    private javax.swing.JTextField Location_Latitude_Read_TF;
    private javax.swing.JTextField Location_Latitude_Write_TF;
    private javax.swing.JTextField Location_Longitude_Read_TF;
    private javax.swing.JTextField Location_Longitude_Write_TF;
    private javax.swing.JTextField Location_Num_Tags;
    private javax.swing.JRadioButton Location_RB_Eeprom;
    private javax.swing.ButtonGroup Location_RB_Group;
    private javax.swing.JRadioButton Location_RB_Ram;
    private javax.swing.JRadioButton Location_RB_Tag;
    private javax.swing.JLabel Location_Remaining_Bulk;
    private javax.swing.JTextField Password_Address_TF;
    private javax.swing.JComboBox<String> Password_Protection_CB;
    private javax.swing.JTextField Password_Read_TF;
    private javax.swing.JTextField Password_TF;
    private javax.swing.JTextField Password_Write_TF;
    private javax.swing.JTextField Phone_Num_Tags;
    private javax.swing.JRadioButton Phone_RB_Eeprom;
    private javax.swing.ButtonGroup Phone_RB_Group;
    private javax.swing.JRadioButton Phone_RB_Ram;
    private javax.swing.JRadioButton Phone_RB_Tag;
    private javax.swing.JTextField Phone_Read_TF;
    private javax.swing.JLabel Phone_Remaining_Bulk;
    private javax.swing.JTextField Phone_Write_TF;
    private javax.swing.ButtonGroup RAW_RB_Group;
    private javax.swing.JTextField Raw_ID_Read_TF;
    private javax.swing.JTextField Raw_ID_Write_TF;
    private javax.swing.JTextField Raw_Num_Tags;
    private javax.swing.JTextField Raw_Payload_Read_TF;
    private javax.swing.JTextField Raw_Payload_Write_TF;
    private javax.swing.JRadioButton Raw_RB_Eeprom;
    private javax.swing.JRadioButton Raw_RB_Ram;
    private javax.swing.JRadioButton Raw_RB_Tag;
    private javax.swing.JLabel Raw_Remaining_Bulk;
    private javax.swing.JTextField Raw_Tnf_Read_TF;
    private javax.swing.JTextField Raw_Tnf_Write_TF;
    private javax.swing.JTextField Raw_Type_Read_TF;
    private javax.swing.JTextField Raw_Type_Write_TF;
    private javax.swing.JTextArea SMS_Message_Read_TF;
    private javax.swing.JTextArea SMS_Message_Write_TF;
    private javax.swing.JTextField SMS_Num_Tags;
    private javax.swing.JTextField SMS_Phone_Read_TF;
    private javax.swing.JTextField SMS_Phone_Write_TF;
    private javax.swing.JRadioButton SMS_RB_Eeprom;
    private javax.swing.ButtonGroup SMS_RB_Group;
    private javax.swing.JRadioButton SMS_RB_Ram;
    private javax.swing.JRadioButton SMS_RB_Tag;
    private javax.swing.JLabel SMS_Remaining_Bulk;
    private javax.swing.JTextField SSID_Read_TF;
    private javax.swing.JTextField SSID_Write_TF;
    private javax.swing.JTextField Skype_Num_Tags;
    private javax.swing.JComboBox<String> Skype_Operation_CB;
    private javax.swing.JTextField Skype_Operation_Read_TF;
    private javax.swing.JRadioButton Skype_RB_Eeprom;
    private javax.swing.ButtonGroup Skype_RB_Group;
    private javax.swing.JRadioButton Skype_RB_Ram;
    private javax.swing.JRadioButton Skype_RB_Tag;
    private javax.swing.JLabel Skype_Remaining_Bulk;
    private javax.swing.JTextField Skype_Username_Read_TF;
    private javax.swing.JTextField Skype_Username_Write_TF;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JButton StreetViewBulkStart;
    private javax.swing.JTextField StreetView_Latitude_Read_TF;
    private javax.swing.JTextField StreetView_Latitude_Write_TF;
    private javax.swing.JTextField StreetView_Longitude_Read_TF;
    private javax.swing.JTextField StreetView_Longitude_Write_TF;
    private javax.swing.JTextField StreetView_Num_Tags;
    private javax.swing.JRadioButton StreetView_RB_Eeprom;
    private javax.swing.ButtonGroup StreetView_RB_Group;
    private javax.swing.JRadioButton StreetView_RB_Ram;
    private javax.swing.JRadioButton StreetView_RB_Tag;
    private javax.swing.JLabel StreetView_Remaining_Bulk;
    private javax.swing.JTextField Subject_Read_TF;
    private javax.swing.JTextField Subject_Write_TF;
    private javax.swing.JTextField TF_Arg;
    private javax.swing.JTextField TF_PortInterface;
    private javax.swing.JTextField TF_PortName;
    private javax.swing.JTextField TF_ReaderType;
    private javax.swing.JTextField Text_Num_Tags;
    private javax.swing.JRadioButton Text_RB_Eeprom;
    private javax.swing.ButtonGroup Text_RB_Group;
    private javax.swing.JRadioButton Text_RB_Ram;
    private javax.swing.JRadioButton Text_RB_Tag;
    private javax.swing.JTextArea Text_Read_TF;
    private javax.swing.JLabel Text_Remaining_Bulk;
    private javax.swing.JTextArea Text_Write_TF;
    private javax.swing.JComboBox<String> URI_Identifier_CB;
    private javax.swing.JTextField URI_Num_Tags;
    private javax.swing.JRadioButton URI_RB_Eeprom;
    private javax.swing.ButtonGroup URI_RB_Group;
    private javax.swing.JRadioButton URI_RB_Ram;
    private javax.swing.JRadioButton URI_RB_Tag;
    private javax.swing.JTextField URI_Read_TF;
    private javax.swing.JLabel URI_Remaining_Bulk;
    private javax.swing.JTextField URI_Write_TF;
    private javax.swing.JCheckBox UseAdvanced;
    private javax.swing.JTextArea Viber_Message_Read_TF;
    private javax.swing.JTextArea Viber_Message_Write_TF;
    private javax.swing.JTextField Viber_Num_Tags;
    private javax.swing.JRadioButton Viber_RB_Eeprom;
    private javax.swing.ButtonGroup Viber_RB_Group;
    private javax.swing.JRadioButton Viber_RB_Ram;
    private javax.swing.JRadioButton Viber_RB_Tag;
    private javax.swing.JLabel Viber_Remaining_Bulk;
    private javax.swing.JTextArea Whatsapp_Message_Read_TF;
    private javax.swing.JTextArea Whatsapp_Message_Write_TF;
    private javax.swing.JTextField Whatsapp_Num_Tags;
    private javax.swing.JRadioButton Whatsapp_RB_Eeprom;
    private javax.swing.ButtonGroup Whatsapp_RB_Group;
    private javax.swing.JRadioButton Whatsapp_RB_Ram;
    private javax.swing.JRadioButton Whatsapp_RB_Tag;
    private javax.swing.JLabel Whatsapp_Remaining_Bulk;
    private javax.swing.JTextField Wifi_Num_Tags;
    private javax.swing.ButtonGroup Wifi_RB;
    private javax.swing.JRadioButton Wifi_RB_Eeprom;
    private javax.swing.JRadioButton Wifi_RB_Ram;
    private javax.swing.JRadioButton Wifi_RB_Tag;
    private javax.swing.JLabel Wifi_Remaining_Bulk;
    private javax.swing.JLabel asdfasdfasfd;
    private javax.swing.JLabel asdfasdfasfd1;
    private javax.swing.JButton btnAddressBulkStart;
    private javax.swing.JButton btnAddressBulkStop;
    private javax.swing.JButton btnAddressRead;
    private javax.swing.JButton btnAddressWrite;
    private javax.swing.JButton btnApplicationBulkStart;
    private javax.swing.JButton btnApplicationBulkStop;
    private javax.swing.JButton btnApplicationRead;
    private javax.swing.JButton btnApplicationWrite;
    private javax.swing.JButton btnBTBulkStart;
    private javax.swing.JButton btnBTiBulkStop;
    private javax.swing.JButton btnBitcoinBulkStart;
    private javax.swing.JButton btnBitcoinBulkStop;
    private javax.swing.JButton btnBitcoinRead;
    private javax.swing.JButton btnBitcoinWrite;
    private javax.swing.JButton btnBluetoothRead;
    private javax.swing.JButton btnBluetoothWrite;
    private javax.swing.JButton btnContactBulkStart;
    private javax.swing.JButton btnContactBulkStop;
    private javax.swing.JButton btnContactRead;
    private javax.swing.JButton btnDestinationBulkStart;
    private javax.swing.JButton btnDestinationBulkStop;
    private javax.swing.JButton btnDestinationRead;
    private javax.swing.JButton btnDestinationWrite;
    private javax.swing.JButton btnEmailBulkStart;
    private javax.swing.JButton btnEmailBulkStop;
    private javax.swing.JButton btnEmailRead;
    private javax.swing.JButton btnEmailWrite;
    private javax.swing.JButton btnEraseAllNdefRecords;
    private javax.swing.JButton btnEraseLastRecord;
    private javax.swing.JButton btnLocationBulkStart;
    private javax.swing.JButton btnLocationBulkStop;
    private javax.swing.JButton btnLocationRead;
    private javax.swing.JButton btnLocationWrite;
    private javax.swing.JButton btnLockTagReadOnly;
    private javax.swing.JButton btnNdefInitialize;
    private javax.swing.JButton btnPhoneBulkStart;
    private javax.swing.JButton btnPhoneBulkStop;
    private javax.swing.JButton btnPhoneRead;
    private javax.swing.JButton btnPhoneWrite;
    private javax.swing.JButton btnRawBulkStart;
    private javax.swing.JButton btnRawBulkStop;
    private javax.swing.JButton btnRawRead;
    private javax.swing.JButton btnRawWrite;
    private java.awt.Button btnReaderOpen;
    private javax.swing.JButton btnRemovePassword;
    private javax.swing.JButton btnSMSBulkStart;
    private javax.swing.JButton btnSMSBulkStop;
    private javax.swing.JButton btnSMSRead;
    private javax.swing.JButton btnSMSWrite;
    private javax.swing.JButton btnSetPassword;
    private javax.swing.JButton btnSkypeBulkStart;
    private javax.swing.JButton btnSkypeBulkStop;
    private javax.swing.JButton btnSkypeRead;
    private javax.swing.JButton btnSkypeWrite;
    private javax.swing.JButton btnStartEEPROMEmulation;
    private javax.swing.JButton btnStartRamEmulation;
    private javax.swing.JButton btnStopEEPROMEmulation;
    private javax.swing.JButton btnStopRamEmulation;
    private javax.swing.JButton btnStreetViewBulkStop;
    private javax.swing.JButton btnStreetViewRead;
    private javax.swing.JButton btnStreetViewWrite;
    private javax.swing.JButton btnTextBulkStart;
    private javax.swing.JButton btnTextBulkStop;
    private javax.swing.JButton btnTextRead;
    private javax.swing.JButton btnTextWrite;
    private javax.swing.JButton btnURIBulkStart;
    private javax.swing.JButton btnURIBulkStop;
    private javax.swing.JButton btnURIRead;
    private javax.swing.JButton btnURIWrite;
    private javax.swing.JButton btnViberBulkStart;
    private javax.swing.JButton btnViberBulkStop;
    private javax.swing.JButton btnViberRead;
    private javax.swing.JButton btnViberWrite;
    private javax.swing.JButton btnWhatsappBulkStart;
    private javax.swing.JButton btnWhatsappBulkStop;
    private javax.swing.JButton btnWhatsappRead;
    private javax.swing.JButton btnWhatsappWrite;
    private javax.swing.JButton btnWiFiRead;
    private javax.swing.JButton btnWifiBulkStart;
    private javax.swing.JButton btnWifiBulkStop;
    private javax.swing.JButton btnWriteContact;
    private javax.swing.JButton btnWriteWifi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelbr37;
    private javax.swing.JLabel jLabelbr38;
    private javax.swing.JLabel jLabelbr39;
    private javax.swing.JLabel jLabelbr40;
    private javax.swing.JLabel jLabelbr41;
    private javax.swing.JLabel jLabelbr42;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
