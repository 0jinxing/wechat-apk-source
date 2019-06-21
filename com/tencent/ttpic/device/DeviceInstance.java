package com.tencent.ttpic.device;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import java.util.HashMap;

public class DeviceInstance
{
  public static final String BRAND_MEIZU = "MEIZU";
  private static final String[][] BRAND_NAMES;
  public static final String BRAND_VIVO = "VIVO";
  public static final String BRAND_XIAOMI = "XIAOMI";
  private static final DeviceInstance INSTANCE;
  public static final String MODEL_COOLPAD_8150 = "8150";
  public static final String MODEL_K_TOUCH_W619 = "K-Touch W619";
  public static final String MODEL_NEXUS_6 = "MOTOROLA_Nexus_6";
  public static final String MODEL_NEXUS_6P = "HUAWEI_Nexus_6P";
  public static final String NUBIA_NX511J = "NUBIA_NX511J";
  private static final String[][] SOC_SCORE;
  private static String TAG;
  private String mDeviceName;
  private HashMap<String, String> mModelMap;
  private HashMap<String, String> mSocMap;

  static
  {
    AppMethodBeat.i(49853);
    TAG = DeviceInstance.class.getSimpleName();
    String[] arrayOfString1 = { "FIH", "MOTOROLA" };
    String[] arrayOfString2 = { "K-Touch", "TIANYU" };
    String[] arrayOfString3 = { "Amazon", "AMAZON" };
    String[] arrayOfString4 = { "Acer", "ACER" };
    String[] arrayOfString5 = { "Philips", "PHILIPS" };
    String[] arrayOfString6 = { "Google", "GOOGLE" };
    String[] arrayOfString7 = { "Fason", "FANSHANG" };
    String[] arrayOfString8 = { "Dell", "DELL" };
    String[] arrayOfString9 = { "dlkjl12389", "DPD" };
    String[] arrayOfString10 = { "sharp", "SHARP" };
    String[] arrayOfString11 = { "vivo", "VIVO" };
    String[] arrayOfString12 = { "LeMobile", "LESHI" };
    String[] arrayOfString13 = { "360", "QIHOO" };
    String[] arrayOfString14 = { "CMDC", "CMDC" };
    String[] arrayOfString15 = { "DOOV", "DOOV" };
    BRAND_NAMES = new String[][] { { "motorola", "MOTOROLA" }, { "mot", "MOTOROLA" }, arrayOfString1, { "Sony Ericsson", "SONYERICSSON" }, { "Sony", "SONY" }, { "samsung", "SAMSUNG" }, { "HTC", "HTC" }, { "HUN", "HTC" }, { "LGE", "LG" }, { "alps", "OPPO" }, { "OPPO", "OPPO" }, { "TCL", "TCL" }, { "LENOVO", "LENOVO" }, { "ZTE", "ZTE" }, { "Meizu", "MEIZU" }, { "Xiaomi", "XIAOMI" }, { "HUAWEI", "HUAWEI" }, { "TIANYU", "TIANYU" }, { "sprd", "TIANYU" }, arrayOfString2, { "YuLong", "COOLPAD" }, { "CoolPad", "COOLPAD" }, arrayOfString3, { "Hisense", "HISENSE" }, arrayOfString4, { "GIONEE", "JINLI" }, arrayOfString5, { "asus", "GOOGLE" }, arrayOfString6, { "snda.com", "SHENGDA" }, { "koobee", "KUBI" }, { "AMOI", "XIAXIN" }, arrayOfString7, { "ainol", "AINUO" }, arrayOfString8, arrayOfString9, { "haier", "HAIER" }, arrayOfString10, { "BBK", "BBK" }, arrayOfString11, { "nubia", "NUBIA" }, { "KONKA", "KONKA" }, arrayOfString12, { "Letv", "LESHI" }, { "Meitu", "MEITU" }, { "OnePlus", "ONEPLUS" }, arrayOfString13, arrayOfString14, arrayOfString15 };
    arrayOfString1 = new String[] { "Samsung Exynos 8895", "6500" };
    arrayOfString2 = new String[] { "Qualcomm Snapdragon 835", "6100" };
    arrayOfString3 = new String[] { "Qualcomm Snapdragon 821", "4500" };
    arrayOfString4 = new String[] { "Qualcomm Snapdragon 820", "4100" };
    arrayOfString5 = new String[] { "Qualcomm Snapdragon 660", "4100" };
    arrayOfString6 = new String[] { "HiSilicon Kirin 955", "5300" };
    arrayOfString7 = new String[] { "HiSilicon Kirin 950", "5100" };
    arrayOfString8 = new String[] { "Mediatek Helio X27", "4800" };
    arrayOfString9 = new String[] { "Qualcomm Snapdragon 810", "3800" };
    arrayOfString10 = new String[] { "Qualcomm Snapdragon 653", "3800" };
    arrayOfString11 = new String[] { "Qualcomm Snapdragon 652", "3600" };
    arrayOfString12 = new String[] { "Qualcomm Snapdragon 650", "3500" };
    arrayOfString13 = new String[] { "Qualcomm Snapdragon 808", "3300" };
    arrayOfString14 = new String[] { "Qualcomm Snapdragon 805", "3200" };
    arrayOfString15 = new String[] { "Qualcomm Snapdragon 626", "3200" };
    String[] arrayOfString16 = { "Qualcomm Snapdragon 801", "3100" };
    String[] arrayOfString17 = { "Mediatek MT6797T Helio X25", "3800" };
    String[] arrayOfString18 = { "Mediatek MT6797 Helio X20", "3700" };
    String[] arrayOfString19 = { "Mediatek MT6795 Helio X10", "3400" };
    String[] arrayOfString20 = { "Mediatek M675x Helio P25", "3700" };
    String[] arrayOfString21 = { "Mediatek M6757 Helio P20", "3600" };
    String[] arrayOfString22 = { "Mediatek MT6755T Helio P15", "3300" };
    String[] arrayOfString23 = { "Mediatek MT6755 Helio P10", "3300" };
    String[] arrayOfString24 = { "Mediatek MT6797M", "3600" };
    String[] arrayOfString25 = { "Mediatek MT6753T", "3100" };
    String[] arrayOfString26 = { "Mediatek MT6753", "3100" };
    String[] arrayOfString27 = { "HiSilicon Kirin 930", "3400" };
    String[] arrayOfString28 = { "HiSilicon Kirin 659", "3400" };
    String[] arrayOfString29 = { "HiSilicon Kirin 655", "3400" };
    String[] arrayOfString30 = { "HiSilicon Kirin 650", "3300" };
    String[] arrayOfString31 = { "Samsung Exynos 7420", "3900" };
    String[] arrayOfString32 = { "Samsung Exynos 7580", "3400" };
    String[] arrayOfString33 = { "Samsung Exynos 5433", "3300" };
    String[] arrayOfString34 = { "Samsung Exynos 5430", "3100" };
    String[] arrayOfString35 = { "NVIDIA Tegra X1", "3100" };
    String[] arrayOfString36 = { "Intel Atom Z8500", "3100" };
    String[] arrayOfString37 = { "Qualcomm Snapdragon 800", "2700" };
    String[] arrayOfString38 = { "Qualcomm Snapdragon 617", "2400" };
    String[] arrayOfString39 = { "Qualcomm Snapdragon 616", "1900" };
    String[] arrayOfString40 = { "Qualcomm Snapdragon 615", "1800" };
    String[] arrayOfString41 = { "Qualcomm Snapdragon 600", "1800" };
    String[] arrayOfString42 = { "Qualcomm Snapdragon 435", "2800" };
    String[] arrayOfString43 = { "Qualcomm Snapdragon 430", "2700" };
    String[] arrayOfString44 = { "Qualcomm Snapdragon 427", "2600" };
    String[] arrayOfString45 = { "Qualcomm Snapdragon 425", "1700" };
    String[] arrayOfString46 = { "Qualcomm Snapdragon 410", "1100" };
    String[] arrayOfString47 = { "Qualcomm Snapdragon S4 MSM8960 Pro", "1200" };
    String[] arrayOfString48 = { "Qualcomm Snapdragon S4 Pro APQ8064", "1700" };
    String[] arrayOfString49 = { "Mediatek MT6752m", "2900" };
    String[] arrayOfString50 = { "Mediatek MT6752", "1800" };
    String[] arrayOfString51 = { "Mediatek MT6755M", "2600" };
    String[] arrayOfString52 = { "Mediatek MT6735", "1600" };
    String[] arrayOfString53 = { "Mediatek MT6735P", "1600" };
    String[] arrayOfString54 = { "Mediatek MT6750", "2100" };
    String[] arrayOfString55 = { "Mediatek MT6595", "2500" };
    String[] arrayOfString56 = { "Mediatek MT6592", "2200" };
    String[] arrayOfString57 = { "Mediatek MT6580", "1500" };
    String[] arrayOfString58 = { "Samsung Exynos 7570", "1700" };
    String[] arrayOfString59 = { "Samsung Exynos 5800", "2300" };
    String[] arrayOfString60 = { "Samsung Exynos 5422", "2000" };
    String[] arrayOfString61 = { "Samsung Exynos 5420", "2000" };
    String[] arrayOfString62 = { "Samsung Exynos 5410", "1700" };
    String[] arrayOfString63 = { "Samsung Exynos 5250", "1200" };
    String[] arrayOfString64 = { "Samsung Exynos 4412", "1500" };
    String[] arrayOfString65 = { "HiSilicon Kirin 928", "2300" };
    String[] arrayOfString66 = { "HiSilicon Kirin 920 Hi3630", "1800" };
    String[] arrayOfString67 = { "HiSilicon Kirin 920", "1800" };
    String[] arrayOfString68 = { "HiSilicon Kirin 910T", "2200" };
    String[] arrayOfString69 = { "HiSilicon Kirin 620", "2000" };
    String[] arrayOfString70 = { "Intel Atom Z2560", "2800" };
    String[] arrayOfString71 = { "Intel Atom Z3745", "2100" };
    String[] arrayOfString72 = { "NVIDIA Tegra K1", "2700" };
    String[] arrayOfString73 = { "Qualcomm Snapdragon 400", "900" };
    String[] arrayOfString74 = { "Qualcomm Snapdragon 208", "600" };
    String[] arrayOfString75 = { "Qualcomm Snapdragon 200", "600" };
    String[] arrayOfString76 = { "Samsung Exynos 3470", "900" };
    String[] arrayOfString77 = { "NVIDIA Tegra 3 T30", "800" };
    String[] arrayOfString78 = { "Ti OMAP 4470", "800" };
    String[] arrayOfString79 = { "Ti OMAP 4460", "600" };
    String[] arrayOfString80 = { "Ti OMAP 4430", "500" };
    SOC_SCORE = new String[][] { arrayOfString1, { "Samsung Exynos 8890", "5300" }, arrayOfString2, arrayOfString3, arrayOfString4, arrayOfString5, { "Hisilicon Kirin 960", "6000" }, arrayOfString6, arrayOfString7, arrayOfString8, arrayOfString9, arrayOfString10, arrayOfString11, arrayOfString12, arrayOfString13, arrayOfString14, arrayOfString15, arrayOfString16, { "Qualcomm Snapdragon 625", "3100" }, arrayOfString17, { "Mediatek Helio X23", "3800" }, arrayOfString18, arrayOfString19, arrayOfString20, arrayOfString21, arrayOfString22, arrayOfString23, arrayOfString24, arrayOfString25, arrayOfString26, { "HiSilicon Kirin 935", "3500" }, arrayOfString27, arrayOfString28, arrayOfString29, arrayOfString30, arrayOfString31, { "Samsung Exynos 7870", "3400" }, arrayOfString32, arrayOfString33, arrayOfString34, arrayOfString35, arrayOfString36, arrayOfString37, arrayOfString38, arrayOfString39, arrayOfString40, arrayOfString41, arrayOfString42, arrayOfString43, arrayOfString44, arrayOfString45, { "Qualcomm Snapdragon 415", "1300" }, { "Qualcomm Snapdragon 412", "1200" }, arrayOfString46, arrayOfString47, arrayOfString48, { "Mediatek MT6795", "2600" }, arrayOfString49, arrayOfString50, arrayOfString51, arrayOfString52, arrayOfString53, { "Mediatek MT6737", "1800" }, arrayOfString54, arrayOfString55, arrayOfString56, { "Mediatek MT6582", "1600" }, arrayOfString57, { "Samsung Exynos 7578", "1800" }, arrayOfString58, arrayOfString59, arrayOfString60, arrayOfString61, arrayOfString62, { "Samsung Exynos 5260", "1700" }, arrayOfString63, arrayOfString64, arrayOfString65, arrayOfString66, arrayOfString67, { "HiSilicon Kirin 925", "2200" }, arrayOfString68, arrayOfString69, arrayOfString70, arrayOfString71, arrayOfString72, { "NVIDIA Tegra K1 Denver", "2700" }, { "NVIDIA Tegra 4", "2200" }, arrayOfString73, { "Qualcomm Snapdragon 210", "600" }, arrayOfString74, arrayOfString75, { "Qualcomm Snapdragon S4 MSM8960T", "900" }, { "Qualcomm Snapdragon S4 MSM8960", "800" }, { "Qualcomm Snapdragon S4 Plus MSM8227", "600" }, { "Samsung Exynos 4210", "700" }, arrayOfString76, { "NVIDIA Tegra 3 T30L", "900" }, arrayOfString77, arrayOfString78, arrayOfString79, arrayOfString80 };
    INSTANCE = new DeviceInstance();
    AppMethodBeat.o(49853);
  }

  private DeviceInstance()
  {
    AppMethodBeat.i(49843);
    this.mModelMap = new HashMap();
    this.mSocMap = new HashMap();
    this.mDeviceName = "";
    for (int i = 0; i < BRAND_NAMES.length; i++)
      this.mModelMap.put(BRAND_NAMES[i][0].toUpperCase(), BRAND_NAMES[i][1]);
    for (i = 0; i < SOC_SCORE.length; i++)
      this.mSocMap.put(SOC_SCORE[i][0], SOC_SCORE[i][1]);
    showDeviceInfo();
    AppMethodBeat.o(49843);
  }

  public static DeviceInstance getInstance()
  {
    return INSTANCE;
  }

  private void showDeviceInfo()
  {
    AppMethodBeat.i(49852);
    LogUtils.d(TAG, "****** DeviceInfo  (+) *****");
    LogUtils.d(TAG, "DeviceName = " + getDeviceName());
    LogUtils.d(TAG, "SubName = " + getDeviceName() + "_" + Build.DISPLAY.replace(" ", "_").toUpperCase());
    LogUtils.d(TAG, "MODEL = " + Build.MODEL);
    LogUtils.d(TAG, "SDK_INT = " + Build.VERSION.SDK_INT);
    LogUtils.d(TAG, "BRAND = " + Build.BRAND);
    LogUtils.d(TAG, "DEVICE = " + Build.DEVICE);
    LogUtils.d(TAG, "DISPLAY = " + Build.DISPLAY);
    LogUtils.d(TAG, "HARDWARE = " + Build.HARDWARE);
    LogUtils.d(TAG, "MANUFACTURER = " + Build.MANUFACTURER);
    LogUtils.d(TAG, "PRODUCT = " + Build.PRODUCT);
    LogUtils.d(TAG, "TAGS = " + Build.TAGS);
    LogUtils.d(TAG, "USER = " + Build.USER);
    LogUtils.d(TAG, "TYPE = " + Build.TYPE);
    LogUtils.d(TAG, "BOARD = " + Build.BOARD);
    LogUtils.d(TAG, "****** DeviceInfo (-) *****");
    AppMethodBeat.o(49852);
  }

  public String getDeviceName()
  {
    AppMethodBeat.i(49844);
    if (TextUtils.isEmpty(this.mDeviceName))
    {
      if (!Build.MODEL.equalsIgnoreCase("K-Touch W619"))
        break label116;
      this.mDeviceName = ((String)this.mModelMap.get("TIANYU") + " " + Build.MODEL);
    }
    while (true)
    {
      this.mDeviceName = this.mDeviceName.replace(" ", "_").replace("+", "").replace("(t)", "");
      String str = this.mDeviceName;
      AppMethodBeat.o(49844);
      return str;
      label116: if ((Build.MODEL.equalsIgnoreCase("8150")) && (Build.BRAND.equalsIgnoreCase("COOLPAD")))
        this.mDeviceName = ((String)this.mModelMap.get("COOLPAD") + " " + Build.MODEL);
      else
        this.mDeviceName = ((String)this.mModelMap.get(Build.MANUFACTURER.toUpperCase()) + " " + Build.MODEL);
    }
  }

  public SOC_CLASS getDeviceSocClass(String paramString)
  {
    AppMethodBeat.i(49845);
    LogUtils.d(TAG, "[getDeviceSocClass] + BEGIN, socInfo = ".concat(String.valueOf(paramString)));
    String str1 = "";
    String str2 = str1;
    if (!TextUtils.isEmpty(paramString))
    {
      str2 = str1;
      if (this.mSocMap != null)
      {
        str2 = str1;
        if (this.mSocMap.containsKey(paramString))
          str2 = (String)this.mSocMap.get(paramString);
      }
    }
    LogUtils.d(TAG, "[getDeviceSocClass] scoreValue = ".concat(String.valueOf(str2)));
    paramString = SOC_CLASS.NULL;
    int i;
    if (!TextUtils.isEmpty(str2))
    {
      i = Integer.parseInt(str2);
      if (i >= SOC_CLASS.HIGH.score)
        paramString = SOC_CLASS.HIGH;
    }
    while (true)
    {
      LogUtils.d(TAG, "[getDeviceSocClass] + END, socClass = ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(49845);
      return paramString;
      if (i >= SOC_CLASS.NORMAL.score)
        paramString = SOC_CLASS.NORMAL;
      else if (i >= SOC_CLASS.LOW.score)
        paramString = SOC_CLASS.LOW;
      else if (i > SOC_CLASS.V_LOW.score)
        paramString = SOC_CLASS.V_LOW;
    }
  }

  public int getMaxMemorySizeInKB()
  {
    AppMethodBeat.i(49850);
    String str = getDeviceName().toLowerCase().trim();
    DeviceInstance.DEVICE_MEM[] arrayOfDEVICE_MEM = DeviceInstance.DEVICE_MEM.values();
    int i = arrayOfDEVICE_MEM.length;
    int j = 0;
    if (j < i)
    {
      DeviceInstance.DEVICE_MEM localDEVICE_MEM = arrayOfDEVICE_MEM[j];
      if (str.endsWith(DeviceInstance.DEVICE_MEM.access$000(localDEVICE_MEM).toLowerCase()))
      {
        j = DeviceInstance.DEVICE_MEM.access$100(localDEVICE_MEM);
        AppMethodBeat.o(49850);
      }
    }
    while (true)
    {
      return j;
      j++;
      break;
      j = 2147483647;
      AppMethodBeat.o(49850);
    }
  }

  public boolean isMeiZuDevice()
  {
    AppMethodBeat.i(49849);
    LogUtils.d(TAG, "[isMeiZuDevice] + BEGIN");
    boolean bool1 = false;
    String str = getDeviceName();
    boolean bool2 = bool1;
    if (!TextUtils.isEmpty(str))
    {
      bool2 = bool1;
      if (str.startsWith("MEIZU"))
        bool2 = true;
    }
    LogUtils.d(TAG, "[isMeiZuDevice] + END, isMeizu = ".concat(String.valueOf(bool2)));
    AppMethodBeat.o(49849);
    return bool2;
  }

  public boolean isViVoDevice()
  {
    AppMethodBeat.i(49847);
    LogUtils.d(TAG, "[isViVoDevice] + BEGIN");
    boolean bool1 = false;
    String str = getDeviceName();
    boolean bool2 = bool1;
    if (!TextUtils.isEmpty(str))
    {
      bool2 = bool1;
      if (str.startsWith("VIVO"))
        bool2 = true;
    }
    LogUtils.d(TAG, "[isViVoDevice] + END, isViVo = ".concat(String.valueOf(bool2)));
    AppMethodBeat.o(49847);
    return bool2;
  }

  public boolean isVivoY23LDevice()
  {
    AppMethodBeat.i(49848);
    String str = getDeviceName();
    boolean bool;
    if ((!TextUtils.isEmpty(str)) && (str.equals("VIVO_vivo_Y23L")))
    {
      bool = true;
      AppMethodBeat.o(49848);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49848);
    }
  }

  public boolean isXiaoMiDevice()
  {
    AppMethodBeat.i(49846);
    LogUtils.d(TAG, "[isXiaoMiDevice] + BEGIN");
    boolean bool1 = false;
    String str = getDeviceName();
    boolean bool2 = bool1;
    if (!TextUtils.isEmpty(str))
    {
      bool2 = bool1;
      if (str.startsWith("XIAOMI"))
        bool2 = true;
    }
    LogUtils.d(TAG, "[isXiaoMiDevice] + END, isXiaomi = ".concat(String.valueOf(bool2)));
    AppMethodBeat.o(49846);
    return bool2;
  }

  public boolean needLoadAll()
  {
    boolean bool = false;
    AppMethodBeat.i(49851);
    String str = getDeviceName().toLowerCase().trim();
    DeviceInstance.DEVICE_MEM[] arrayOfDEVICE_MEM = DeviceInstance.DEVICE_MEM.values();
    int i = arrayOfDEVICE_MEM.length;
    int j = 0;
    if (j < i)
      if (str.endsWith(DeviceInstance.DEVICE_MEM.access$000(arrayOfDEVICE_MEM[j]).toLowerCase()))
      {
        bool = true;
        AppMethodBeat.o(49851);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(49851);
    }
  }

  public static enum SOC_CLASS
  {
    public int score;
    public int value;

    static
    {
      AppMethodBeat.i(49842);
      NULL = new SOC_CLASS("NULL", 0, -1, -1);
      HIGH = new SOC_CLASS("HIGH", 1, 0, 4000);
      NORMAL = new SOC_CLASS("NORMAL", 2, 1, 3000);
      LOW = new SOC_CLASS("LOW", 3, 2, 1000);
      V_LOW = new SOC_CLASS("V_LOW", 4, 3, 0);
      $VALUES = new SOC_CLASS[] { NULL, HIGH, NORMAL, LOW, V_LOW };
      AppMethodBeat.o(49842);
    }

    private SOC_CLASS(int paramInt1, int paramInt2)
    {
      this.value = paramInt1;
      this.score = paramInt2;
    }

    public final String toString()
    {
      AppMethodBeat.i(49841);
      String str = "SOC_CLASS{value=" + this.value + ", score=" + this.score + '}';
      AppMethodBeat.o(49841);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.device.DeviceInstance
 * JD-Core Version:    0.6.2
 */