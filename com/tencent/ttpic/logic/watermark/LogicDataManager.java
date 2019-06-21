package com.tencent.ttpic.logic.watermark;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.ExifInterface;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.model.Audio2Text;
import com.tencent.ttpic.model.Audio2Text.FIFOList;
import com.tencent.ttpic.model.Audio2Text.LoopRepList;
import com.tencent.ttpic.model.VideoMaterial;
import com.tencent.ttpic.model.WMElement;
import com.tencent.ttpic.util.VideoMaterialUtil;
import com.tencent.ttpic.util.VideoPrefsUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicDataManager
{
  public static final String ALTITUDE = "[altitude]";
  private static final String DATA_DEFAULT_LOCATION = "中国";
  private static final String DATA_DEFAULT_NO_NETWORK = "无网络";
  private static final String DATA_DEFAULT_TEMPERATURE = "0";
  private static final String DATA_DEFAULT_WEATHER = "晴";
  private static final String DATA_DEFAULT_WEATHER_TYPE = "";
  public static final String DATE = "[date]";
  public static final String DATE_D = "[date:D]";
  public static final String DATE_EEE = "[date:EEE]";
  public static final String DATE_EEEE = "[date:EEEE]";
  public static final String DATE_H = "[date:H]";
  public static final String DATE_H0 = "[date:H0]";
  public static final String DATE_H1 = "[date:H1]";
  public static final String DATE_HH = "[date:HH]";
  public static final String DATE_M = "[date:M]";
  public static final String DATE_M0 = "[date:M0]";
  public static final String DATE_M1 = "[date:M1]";
  public static final String DATE_MM = "[date:MM]";
  public static final String DATE_MMM = "[date:MMM]";
  public static final String DATE_MMMM = "[date:MMMM]";
  public static final String DATE_W = "[date:W]";
  public static final String DATE_Y0 = "[date:Y0]";
  public static final String DATE_Y1 = "[date:Y1]";
  public static final String DATE_Y2 = "[date:Y2]";
  public static final String DATE_Y3 = "[date:Y3]";
  public static final String DATE_YY = "[date:YY]";
  public static final String DATE_YYYY = "[date:YYYY]";
  public static final String DATE_a = "[date:a]";
  public static final String DATE_d = "[date:d]";
  public static final String DATE_d0 = "[date:d0]";
  public static final String DATE_d1 = "[date:d1]";
  public static final String DATE_dd = "[date:dd]";
  public static final String DATE_e = "[date:e]";
  public static final String DATE_h = "[date:h]";
  public static final String DATE_h0 = "[date:h0]";
  public static final String DATE_h1 = "[date:h1]";
  public static final String DATE_hh = "[date:hh]";
  public static final String DATE_m = "[date:m]";
  public static final String DATE_m0 = "[date:m0]";
  public static final String DATE_m1 = "[date:m1]";
  public static final String DATE_mm = "[date:mm]";
  public static final String DATE_s = "[date:s]";
  public static final String DATE_s0 = "[date:s0]";
  public static final String DATE_s1 = "[date:s1]";
  public static final String DATE_ss = "[date:ss]";
  public static final String DATE_w = "[date:w]";
  public static final String DATE_y0 = "[date:y0]";
  public static final String DATE_y1 = "[date:y1]";
  public static final String DATE_y2 = "[date:y2]";
  public static final String DATE_y3 = "[date:y3]";
  public static final String DATE_yy = "[date:yy]";
  public static final String DATE_yyyy = "[date:yyyy]";
  public static final String DB = "[db]";
  private static final int DECIBEL_UPDATE_INTERVAL = 500;
  public static final String LOCATION = "[location]";
  public static final Pattern PATTERN_NUMERICAL;
  public static final Pattern PATTERN_SPEECHS;
  public static final Pattern PATTERN_SPEECHW;
  public static final String PIC_DATE_M0 = "[picDate:M0]";
  public static final String PIC_DATE_M1 = "[picDate:M1]";
  public static final String PIC_DATE_d0 = "[picDate:d0]";
  public static final String PIC_DATE_d1 = "[picDate:d1]";
  public static final String PIC_DATE_y0 = "[picDate:y0]";
  public static final String PIC_DATE_y1 = "[picDate:y1]";
  public static final String PIC_DATE_y2 = "[picDate:y2]";
  public static final String PIC_DATE_y3 = "[picDate:y3]";
  public static final String SPEECHS_ALL = "[speech:all]";
  public static final String SPEED = "[speed]";
  private static final String STRING_EMPTY = "";
  public static final String TEMPERATURE = "[temperature]";
  public static final String TEMPERATURE_0 = "[temperature_0]";
  public static final String TEMPERATURE_1 = "[temperature_1]";
  public static final String TEMPERATURE_s = "[temperature_s]";
  public static final String WEATHER = "[weather]";
  public static final String WEATHER_TYPE = "[weatherType]";
  private static LogicDataManager mInstance;
  private final String TAG;
  private String mAltitude;
  private int mDecibel;
  private long mDecibelUpdateTimestamp;
  private List<WMElement> mEditableWMElements;
  private String mLocation;
  private boolean mNeedDecibel;
  private String mPictureDate;
  private Map<String, LogicDataManager.LogicValueProvider> mProviderMap;
  private LogicDataManager.OnSilenceEventListener mSilenceEventListener;
  private String mTemperature;
  private boolean mUseDecibelFromCameraRecorder;
  private int mVTSegmentCount;
  private int mVTSegmentTime;
  private int mVTSilenceTime;
  private List<String> mVoiceTextDup;
  private Queue<String> mVoiceTextQueue;
  private String mWeather;
  private String mWeatherType;

  static
  {
    AppMethodBeat.i(83424);
    PATTERN_SPEECHS = Pattern.compile("\\[speech:s-?\\d?\\]");
    PATTERN_SPEECHW = Pattern.compile("\\[speech:w-?\\d?\\]");
    PATTERN_NUMERICAL = Pattern.compile("-?\\d+");
    AppMethodBeat.o(83424);
  }

  private LogicDataManager()
  {
    AppMethodBeat.i(83332);
    this.TAG = LogicDataManager.class.getSimpleName();
    this.mLocation = "中国";
    this.mWeather = "晴";
    this.mWeatherType = "";
    this.mAltitude = "无网络";
    this.mTemperature = "0";
    this.mProviderMap = new HashMap();
    this.mEditableWMElements = new ArrayList();
    this.mNeedDecibel = false;
    this.mDecibelUpdateTimestamp = 0L;
    this.mUseDecibelFromCameraRecorder = false;
    this.mVoiceTextDup = new CopyOnWriteArrayList();
    this.mVoiceTextQueue = new LinkedList();
    AppMethodBeat.o(83332);
  }

  private int adjustDB(int paramInt)
  {
    return (int)(0.65D * paramInt + 40.0D);
  }

  private void buildDataProviderMap()
  {
    AppMethodBeat.i(83334);
    this.mProviderMap.put("[date]", new LogicDataManager.1(this));
    this.mProviderMap.put("[date:yy]", new LogicDataManager.2(this));
    this.mProviderMap.put("[date:yyyy]", new LogicDataManager.3(this));
    this.mProviderMap.put("[date:y0]", new LogicDataManager.4(this));
    this.mProviderMap.put("[date:y1]", new LogicDataManager.5(this));
    this.mProviderMap.put("[date:y2]", new LogicDataManager.6(this));
    this.mProviderMap.put("[date:y3]", new LogicDataManager.7(this));
    this.mProviderMap.put("[date:M]", new LogicDataManager.8(this));
    this.mProviderMap.put("[date:MM]", new LogicDataManager.9(this));
    this.mProviderMap.put("[date:MMM]", new LogicDataManager.LogicValueProvider()
    {
      public String getValue()
      {
        AppMethodBeat.i(83273);
        String str = LogicDataManager.access$600(LogicDataManager.this);
        AppMethodBeat.o(83273);
        return str;
      }
    });
    this.mProviderMap.put("[date:MMMM]", new LogicDataManager.11(this));
    this.mProviderMap.put("[date:M0]", new LogicDataManager.12(this));
    this.mProviderMap.put("[date:M1]", new LogicDataManager.13(this));
    this.mProviderMap.put("[date:w]", new LogicDataManager.14(this));
    this.mProviderMap.put("[date:W]", new LogicDataManager.15(this));
    this.mProviderMap.put("[date:d]", new LogicDataManager.16(this));
    this.mProviderMap.put("[date:dd]", new LogicDataManager.17(this));
    this.mProviderMap.put("[date:d0]", new LogicDataManager.18(this));
    this.mProviderMap.put("[date:d1]", new LogicDataManager.19(this));
    this.mProviderMap.put("[date:D]", new LogicDataManager.20(this));
    this.mProviderMap.put("[date:e]", new LogicDataManager.21(this));
    this.mProviderMap.put("[date:EEE]", new LogicDataManager.LogicValueProvider()
    {
      public String getValue()
      {
        AppMethodBeat.i(83286);
        String str = LogicDataManager.access$1600(LogicDataManager.this);
        AppMethodBeat.o(83286);
        return str;
      }
    });
    this.mProviderMap.put("[date:EEEE]", new LogicDataManager.LogicValueProvider()
    {
      public String getValue()
      {
        AppMethodBeat.i(83287);
        String str = LogicDataManager.access$1700(LogicDataManager.this);
        AppMethodBeat.o(83287);
        return str;
      }
    });
    this.mProviderMap.put("[date:a]", new LogicDataManager.LogicValueProvider()
    {
      public String getValue()
      {
        AppMethodBeat.i(83288);
        String str = LogicDataManager.access$1800(LogicDataManager.this);
        AppMethodBeat.o(83288);
        return str;
      }
    });
    this.mProviderMap.put("[date:h]", new LogicDataManager.25(this));
    this.mProviderMap.put("[date:hh]", new LogicDataManager.LogicValueProvider()
    {
      public String getValue()
      {
        AppMethodBeat.i(83290);
        String str = LogicDataManager.access$2000(LogicDataManager.this);
        AppMethodBeat.o(83290);
        return str;
      }
    });
    this.mProviderMap.put("[date:h0]", new LogicDataManager.27(this));
    this.mProviderMap.put("[date:h1]", new LogicDataManager.28(this));
    this.mProviderMap.put("[date:H]", new LogicDataManager.29(this));
    this.mProviderMap.put("[date:HH]", new LogicDataManager.30(this));
    this.mProviderMap.put("[date:H0]", new LogicDataManager.31(this));
    this.mProviderMap.put("[date:H1]", new LogicDataManager.32(this));
    this.mProviderMap.put("[date:m]", new LogicDataManager.33(this));
    this.mProviderMap.put("[date:mm]", new LogicDataManager.34(this));
    this.mProviderMap.put("[date:m0]", new LogicDataManager.35(this));
    this.mProviderMap.put("[date:m1]", new LogicDataManager.36(this));
    this.mProviderMap.put("[date:s]", new LogicDataManager.37(this));
    this.mProviderMap.put("[date:ss]", new LogicDataManager.LogicValueProvider()
    {
      public String getValue()
      {
        AppMethodBeat.i(83303);
        String str = LogicDataManager.access$2900(LogicDataManager.this);
        AppMethodBeat.o(83303);
        return str;
      }
    });
    this.mProviderMap.put("[date:s0]", new LogicDataManager.LogicValueProvider()
    {
      public String getValue()
      {
        AppMethodBeat.i(83304);
        String str = LogicDataManager.access$3000(LogicDataManager.this, 0);
        AppMethodBeat.o(83304);
        return str;
      }
    });
    this.mProviderMap.put("[date:s1]", new LogicDataManager.40(this));
    this.mProviderMap.put("[db]", new LogicDataManager.41(this));
    this.mProviderMap.put("[altitude]", new LogicDataManager.42(this));
    this.mProviderMap.put("[location]", new LogicDataManager.43(this));
    this.mProviderMap.put("[weather]", new LogicDataManager.44(this));
    this.mProviderMap.put("[weatherType]", new LogicDataManager.45(this));
    this.mProviderMap.put("[temperature]", new LogicDataManager.46(this));
    this.mProviderMap.put("[temperature_0]", new LogicDataManager.47(this));
    this.mProviderMap.put("[temperature_1]", new LogicDataManager.48(this));
    this.mProviderMap.put("[temperature_s]", new LogicDataManager.49(this));
    this.mProviderMap.put("[speech:all]", new LogicDataManager.50(this));
    this.mProviderMap.put("[picDate:y0]", new LogicDataManager.51(this));
    this.mProviderMap.put("[picDate:y1]", new LogicDataManager.52(this));
    this.mProviderMap.put("[picDate:y2]", new LogicDataManager.53(this));
    this.mProviderMap.put("[picDate:y3]", new LogicDataManager.54(this));
    this.mProviderMap.put("[picDate:M0]", new LogicDataManager.55(this));
    this.mProviderMap.put("[picDate:M1]", new LogicDataManager.56(this));
    this.mProviderMap.put("[picDate:d0]", new LogicDataManager.57(this));
    this.mProviderMap.put("[picDate:d1]", new LogicDataManager.58(this));
    AppMethodBeat.o(83334);
  }

  private int fetchNumerical(String paramString)
  {
    AppMethodBeat.i(83384);
    paramString = PATTERN_NUMERICAL.matcher(paramString);
    if (paramString.find())
      paramString = paramString.group();
    while (true)
    {
      try
      {
        i = Integer.parseInt(paramString);
        AppMethodBeat.o(83384);
        return i;
      }
      catch (NumberFormatException paramString)
      {
        LogUtils.e(paramString);
      }
      int i = 0;
      AppMethodBeat.o(83384);
    }
  }

  private String fetchSpeechSentence(String paramString)
  {
    AppMethodBeat.i(83382);
    ArrayList localArrayList = new ArrayList(this.mVoiceTextDup);
    if (localArrayList.isEmpty())
    {
      paramString = "";
      AppMethodBeat.o(83382);
    }
    int i;
    while (true)
    {
      return paramString;
      i = fetchNumerical(paramString);
      if (!BaseUtils.indexOutOfBounds(localArrayList, Math.abs(i - 1)))
        break;
      paramString = "";
      AppMethodBeat.o(83382);
    }
    int j = i;
    if (i == 0)
      j = (int)(Math.random() * localArrayList.size()) + 1;
    if (j > 0)
      j--;
    while (true)
    {
      paramString = (String)localArrayList.get(j);
      AppMethodBeat.o(83382);
      break;
      j = localArrayList.size() - Math.abs(j);
    }
  }

  private String fetchSpeechWord(String paramString)
  {
    AppMethodBeat.i(83383);
    int i = fetchNumerical(paramString);
    if (i != 0)
    {
      paramString = new ArrayList(this.mVoiceTextDup);
      if (paramString.isEmpty())
      {
        paramString = "";
        AppMethodBeat.o(83383);
      }
    }
    while (true)
    {
      return paramString;
      paramString = (String)paramString.get(paramString.size() - 1);
      if (paramString.length() < Math.abs(i))
      {
        paramString = "";
        AppMethodBeat.o(83383);
        continue;
      }
      if (i > 0)
      {
        paramString = String.valueOf(paramString.charAt(i - 1));
        AppMethodBeat.o(83383);
        continue;
      }
      paramString = String.valueOf(paramString.length() - Math.abs(i));
      AppMethodBeat.o(83383);
      continue;
      synchronized (this.mVoiceTextQueue)
      {
        if (!this.mVoiceTextQueue.isEmpty())
        {
          paramString = String.valueOf(this.mVoiceTextQueue.poll());
          AppMethodBeat.o(83383);
          continue;
        }
        paramString = "";
        AppMethodBeat.o(83383);
      }
    }
  }

  private String getAltitude()
  {
    return this.mAltitude;
  }

  private String getD()
  {
    AppMethodBeat.i(83353);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("D").format((Date)localObject);
    AppMethodBeat.o(83353);
    return localObject;
  }

  private String getEEE()
  {
    int i = 0;
    AppMethodBeat.i(83355);
    Object localObject = Calendar.getInstance();
    ((Calendar)localObject).setTime(new Date());
    int j = ((Calendar)localObject).get(7) - 1;
    if (j < 0)
      j = i;
    while (true)
    {
      localObject = new String[] { "Sun.", "Mon.", "Tues.", "Wed.", "Thur.", "Fri.", "Sat." }[j];
      AppMethodBeat.o(83355);
      return localObject;
    }
  }

  private String getEEEE()
  {
    int i = 0;
    AppMethodBeat.i(83356);
    Object localObject = Calendar.getInstance();
    ((Calendar)localObject).setTime(new Date());
    int j = ((Calendar)localObject).get(7) - 1;
    if (j < 0);
    while (true)
    {
      localObject = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }[i];
      AppMethodBeat.o(83356);
      return localObject;
      i = j;
    }
  }

  private String getH()
  {
    AppMethodBeat.i(83361);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("H").format((Date)localObject);
    AppMethodBeat.o(83361);
    return localObject;
  }

  private String getH(int paramInt)
  {
    AppMethodBeat.i(83363);
    String str = getHH().substring(paramInt, paramInt + 1);
    AppMethodBeat.o(83363);
    return str;
  }

  private String getHH()
  {
    AppMethodBeat.i(83362);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("HH").format((Date)localObject);
    AppMethodBeat.o(83362);
    return localObject;
  }

  public static LogicDataManager getInstance()
  {
    try
    {
      AppMethodBeat.i(83331);
      if (mInstance == null)
      {
        localLogicDataManager = new com/tencent/ttpic/logic/watermark/LogicDataManager;
        localLogicDataManager.<init>();
        mInstance = localLogicDataManager;
      }
      LogicDataManager localLogicDataManager = mInstance;
      AppMethodBeat.o(83331);
      return localLogicDataManager;
    }
    finally
    {
    }
  }

  private String getM()
  {
    AppMethodBeat.i(83343);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("M").format((Date)localObject);
    AppMethodBeat.o(83343);
    return localObject;
  }

  private String getM(int paramInt)
  {
    AppMethodBeat.i(83347);
    String str = getMM().substring(paramInt, paramInt + 1);
    AppMethodBeat.o(83347);
    return str;
  }

  private String getMM()
  {
    AppMethodBeat.i(83344);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("MM").format((Date)localObject);
    AppMethodBeat.o(83344);
    return localObject;
  }

  private String getMMM()
  {
    AppMethodBeat.i(83345);
    int i = Integer.parseInt(getM(0));
    String str;
    if (i == 0)
    {
      i = Integer.parseInt(getM(1));
      if (i >= 12)
        break label145;
      str = new String[] { "Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sept.", "Oct.", "Nov.", "Dec." }[i];
      AppMethodBeat.o(83345);
    }
    while (true)
    {
      return str;
      i = i * 10 + Integer.parseInt(getM(1));
      break;
      label145: str = "";
      AppMethodBeat.o(83345);
    }
  }

  private String getMMMM()
  {
    AppMethodBeat.i(83346);
    int i = Integer.parseInt(getM(0));
    String str;
    if (i == 0)
    {
      i = Integer.parseInt(getM(1));
      if (i >= 12)
        break label145;
      str = new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }[i];
      AppMethodBeat.o(83346);
    }
    while (true)
    {
      return str;
      i = i * 10 + Integer.parseInt(getM(1));
      break;
      label145: str = "";
      AppMethodBeat.o(83346);
    }
  }

  private String getTemperature()
  {
    return this.mTemperature;
  }

  private String getTemperature(int paramInt)
  {
    AppMethodBeat.i(83371);
    if (!TextUtils.isEmpty(this.mTemperature));
    while (true)
    {
      try
      {
        String str1;
        if (Integer.parseInt(this.mTemperature) >= 0)
        {
          if (paramInt + 1 <= this.mTemperature.length())
          {
            str1 = this.mTemperature.substring(paramInt, paramInt + 1);
            AppMethodBeat.o(83371);
            return str1;
          }
        }
        else if (paramInt + 2 <= this.mTemperature.length())
        {
          str1 = this.mTemperature.substring(paramInt + 1, paramInt + 2);
          AppMethodBeat.o(83371);
          continue;
        }
      }
      catch (Exception localException)
      {
      }
      String str2 = "";
      AppMethodBeat.o(83371);
    }
  }

  private String getTemperatureSymbol()
  {
    AppMethodBeat.i(83372);
    if (!TextUtils.isEmpty(this.mTemperature));
    while (true)
    {
      try
      {
        if (Integer.parseInt(this.mTemperature) >= 0)
        {
          str1 = "+";
          AppMethodBeat.o(83372);
          return str1;
        }
        String str1 = "-";
        AppMethodBeat.o(83372);
        continue;
      }
      catch (Exception localException)
      {
      }
      String str2 = "";
      AppMethodBeat.o(83372);
    }
  }

  private String getTimestamp()
  {
    AppMethodBeat.i(83339);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Date)localObject);
    AppMethodBeat.o(83339);
    return localObject;
  }

  private String getW()
  {
    AppMethodBeat.i(83349);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("W").format((Date)localObject);
    AppMethodBeat.o(83349);
    return localObject;
  }

  private String geta()
  {
    AppMethodBeat.i(83357);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("a").format((Date)localObject);
    AppMethodBeat.o(83357);
    return localObject;
  }

  private String getd()
  {
    AppMethodBeat.i(83350);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("d").format((Date)localObject);
    AppMethodBeat.o(83350);
    return localObject;
  }

  private String getd(int paramInt)
  {
    AppMethodBeat.i(83351);
    String str = getdd().substring(paramInt, paramInt + 1);
    AppMethodBeat.o(83351);
    return str;
  }

  private String getdd()
  {
    AppMethodBeat.i(83352);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("dd").format((Date)localObject);
    AppMethodBeat.o(83352);
    return localObject;
  }

  private String gete()
  {
    int i = 0;
    AppMethodBeat.i(83354);
    Object localObject = Calendar.getInstance();
    ((Calendar)localObject).setTime(new Date());
    int j = ((Calendar)localObject).get(7) - 1;
    if (j < 0);
    while (true)
    {
      localObject = new String[] { "日", "一", "二", "三", "四", "五", "六" }[i];
      AppMethodBeat.o(83354);
      return localObject;
      i = j;
    }
  }

  private String geth()
  {
    AppMethodBeat.i(83358);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("h").format((Date)localObject);
    AppMethodBeat.o(83358);
    return localObject;
  }

  private String geth(int paramInt)
  {
    AppMethodBeat.i(83360);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("hh").format((Date)localObject).substring(paramInt, paramInt + 1);
    AppMethodBeat.o(83360);
    return localObject;
  }

  private String gethh()
  {
    AppMethodBeat.i(83359);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("hh").format((Date)localObject);
    AppMethodBeat.o(83359);
    return localObject;
  }

  private String getm()
  {
    AppMethodBeat.i(83364);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("m").format((Date)localObject);
    AppMethodBeat.o(83364);
    return localObject;
  }

  private String getm(int paramInt)
  {
    AppMethodBeat.i(83366);
    String str = getmm().substring(paramInt, paramInt + 1);
    AppMethodBeat.o(83366);
    return str;
  }

  private String getmm()
  {
    AppMethodBeat.i(83365);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("mm").format((Date)localObject);
    AppMethodBeat.o(83365);
    return localObject;
  }

  private String gets()
  {
    AppMethodBeat.i(83367);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("s").format((Date)localObject);
    AppMethodBeat.o(83367);
    return localObject;
  }

  private String gets(int paramInt)
  {
    AppMethodBeat.i(83369);
    String str = getss().substring(paramInt, paramInt + 1);
    AppMethodBeat.o(83369);
    return str;
  }

  private String getss()
  {
    AppMethodBeat.i(83368);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("ss").format((Date)localObject);
    AppMethodBeat.o(83368);
    return localObject;
  }

  private String getw()
  {
    AppMethodBeat.i(83348);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("w").format((Date)localObject);
    AppMethodBeat.o(83348);
    return localObject;
  }

  private String gety(int paramInt)
  {
    AppMethodBeat.i(83342);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("yyyy").format((Date)localObject).substring(paramInt, paramInt + 1);
    AppMethodBeat.o(83342);
    return localObject;
  }

  private String getyy()
  {
    AppMethodBeat.i(83340);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("yy").format((Date)localObject);
    AppMethodBeat.o(83340);
    return localObject;
  }

  private String getyyyy()
  {
    AppMethodBeat.i(83341);
    Object localObject = new Date();
    localObject = new SimpleDateFormat("yyyy").format((Date)localObject);
    AppMethodBeat.o(83341);
    return localObject;
  }

  private void resetParams()
  {
    this.mNeedDecibel = false;
    this.mUseDecibelFromCameraRecorder = false;
    this.mDecibelUpdateTimestamp = 0L;
  }

  public void addEditableWMElement(WMElement paramWMElement)
  {
    AppMethodBeat.i(83375);
    this.mEditableWMElements.add(paramWMElement);
    AppMethodBeat.o(83375);
  }

  public void addWatermarkDict(Map<String, String> paramMap)
  {
    AppMethodBeat.i(83381);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      this.mProviderMap.put("[" + (String)paramMap.getKey() + "]", new LogicDataManager.59(this, paramMap));
    }
    AppMethodBeat.o(83381);
  }

  public void buildVoice2TextParams(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83335);
    if ((paramVideoMaterial == null) || (paramVideoMaterial.getAudio2Text() == null))
      AppMethodBeat.o(83335);
    while (true)
    {
      return;
      this.mVTSilenceTime = ((int)(paramVideoMaterial.getAudio2Text().silenceTime * 1000.0D));
      this.mVTSegmentCount = paramVideoMaterial.getAudio2Text().segmentCount;
      this.mVTSegmentTime = ((int)(paramVideoMaterial.getAudio2Text().segmentTime * 1000.0D));
      clearVoiceTexts();
      if (!VideoMaterialUtil.isAudio2textMaterial(paramVideoMaterial))
      {
        AppMethodBeat.o(83335);
      }
      else if (paramVideoMaterial.getAudio2Text().sentenceMode == 1)
      {
        this.mVoiceTextDup = new Audio2Text.LoopRepList(paramVideoMaterial.getAudio2Text().sentenceCount);
        AppMethodBeat.o(83335);
      }
      else
      {
        this.mVoiceTextDup = new Audio2Text.FIFOList(paramVideoMaterial.getAudio2Text().sentenceCount);
        AppMethodBeat.o(83335);
      }
    }
  }

  public void clearVoiceTexts()
  {
    AppMethodBeat.i(83386);
    this.mVoiceTextDup.clear();
    this.mVoiceTextQueue.clear();
    AppMethodBeat.o(83386);
  }

  public void destroy()
  {
    AppMethodBeat.i(83378);
    destroyDecibelDetector();
    AppMethodBeat.o(83378);
  }

  public void destroyDecibelDetector()
  {
  }

  public List<String> getCurTextList()
  {
    AppMethodBeat.i(83385);
    ArrayList localArrayList;
    if (!this.mVoiceTextDup.isEmpty())
    {
      localArrayList = new ArrayList(this.mVoiceTextDup);
      if ((this.mVoiceTextDup instanceof Audio2Text.FIFOList))
      {
        String str = (String)localArrayList.get(localArrayList.size() - 1);
        localArrayList.clear();
        localArrayList.add(str);
      }
      AppMethodBeat.o(83385);
    }
    while (true)
    {
      return localArrayList;
      localArrayList = new ArrayList();
      AppMethodBeat.o(83385);
    }
  }

  public String getCurrentText()
  {
    AppMethodBeat.i(83387);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("audio2text : ");
    ((StringBuffer)localObject).append("\n");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(83387);
    return localObject;
  }

  public String getDB()
  {
    AppMethodBeat.i(83370);
    int i = adjustDB(this.mDecibel);
    AppMethodBeat.o(83370);
    return String.valueOf(i);
  }

  public List<WMElement> getEditableWMElement()
  {
    return this.mEditableWMElements;
  }

  public String getLocation()
  {
    return this.mLocation;
  }

  public String getValue(String paramString)
  {
    AppMethodBeat.i(83338);
    String str = paramString;
    if (this.mProviderMap.containsKey(paramString))
      str = ((LogicDataManager.LogicValueProvider)this.mProviderMap.get(paramString)).getValue();
    AppMethodBeat.o(83338);
    return str;
  }

  public boolean hasObtainedServerData()
  {
    AppMethodBeat.i(83380);
    boolean bool;
    if ((!"中国".equals(this.mLocation)) && (!"晴".equals(this.mWeather)) && (!"0".equals(this.mTemperature)) && (!"无网络".equals(this.mAltitude)))
    {
      bool = true;
      AppMethodBeat.o(83380);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(83380);
    }
  }

  public void init(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83333);
    resetParams();
    buildDataProviderMap();
    buildVoice2TextParams(paramVideoMaterial);
    AppMethodBeat.o(83333);
  }

  public String mapWeatherCode(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "";
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      return str;
      str = "晴";
      continue;
      str = "多云";
      continue;
      str = "阴";
      continue;
      str = "雨";
      continue;
      str = "雪";
      continue;
      str = "雾";
      continue;
      str = "雨加雪";
      continue;
      str = "雷阵雨";
      continue;
      str = "沙尘暴";
      continue;
      str = "大风";
    }
  }

  public boolean needDecibel()
  {
    return this.mNeedDecibel;
  }

  public void recordDate(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(83377);
    if (paramString1.equals("since"))
    {
      VideoPrefsUtil.getDefaultPrefs().edit().putString("prefs_key_watermark_since_".concat(String.valueOf(paramString2)), paramString3).apply();
      AppMethodBeat.o(83377);
    }
    while (true)
    {
      return;
      if (paramString1.equals("countdown"))
        VideoPrefsUtil.getDefaultPrefs().edit().putString("prefs_key_watermark_countdown_".concat(String.valueOf(paramString2)), paramString3).apply();
      AppMethodBeat.o(83377);
    }
  }

  public void removeEditableWMElement(WMElement paramWMElement)
  {
    AppMethodBeat.i(83376);
    this.mEditableWMElements.remove(paramWMElement);
    AppMethodBeat.o(83376);
  }

  public String replaceWithData(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(83373);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(83373);
    while (true)
    {
      return paramString;
      Iterator localIterator = paramSet.iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramSet = paramString;
        if (PATTERN_SPEECHS.matcher(paramString).find())
        {
          paramSet = paramString;
          if (PATTERN_SPEECHS.matcher(str).find())
            paramSet = paramString.replace(str, fetchSpeechSentence(str));
        }
        paramString = paramSet;
        if (PATTERN_SPEECHW.matcher(paramSet).find())
        {
          paramString = paramSet;
          if (PATTERN_SPEECHW.matcher(str).find())
            paramString = paramSet.replace(str, fetchSpeechWord(str));
        }
        if (this.mProviderMap.containsKey(str));
        for (paramSet = ((LogicDataManager.LogicValueProvider)this.mProviderMap.get(str)).getValue(); ; paramSet = "")
        {
          paramString = paramString.replace(str, paramSet);
          break;
        }
      }
      AppMethodBeat.o(83373);
    }
  }

  public void setAltitude(String paramString)
  {
    this.mAltitude = paramString;
  }

  public void setDecibel(int paramInt)
  {
    AppMethodBeat.i(83379);
    long l = System.currentTimeMillis();
    if (l - this.mDecibelUpdateTimestamp > 500L)
    {
      this.mDecibel = paramInt;
      this.mDecibelUpdateTimestamp = l;
    }
    AppMethodBeat.o(83379);
  }

  public void setDecibelFromCameraRecorder(boolean paramBoolean)
  {
    this.mUseDecibelFromCameraRecorder = paramBoolean;
  }

  public void setLocation(String paramString)
  {
    this.mLocation = paramString;
  }

  public void setNeedDB(boolean paramBoolean)
  {
    this.mNeedDecibel = paramBoolean;
  }

  public void setOnSilenceEventListener(LogicDataManager.OnSilenceEventListener paramOnSilenceEventListener)
  {
    this.mSilenceEventListener = paramOnSilenceEventListener;
  }

  public void setPictureDate(String paramString)
  {
    AppMethodBeat.i(83388);
    try
    {
      ExifInterface localExifInterface = new android/media/ExifInterface;
      localExifInterface.<init>(paramString);
      this.mPictureDate = localExifInterface.getAttribute("DateTime");
      AppMethodBeat.o(83388);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(83388);
    }
  }

  public void setTemperature(String paramString)
  {
    this.mTemperature = paramString;
  }

  public void setWeather(int paramInt)
  {
    AppMethodBeat.i(83336);
    this.mWeather = mapWeatherCode(paramInt);
    AppMethodBeat.o(83336);
  }

  public void setWeatherType(int paramInt)
  {
    AppMethodBeat.i(83337);
    this.mWeatherType = String.valueOf(paramInt);
    AppMethodBeat.o(83337);
  }

  public void test()
  {
    AppMethodBeat.i(83374);
    Iterator localIterator = this.mProviderMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      new StringBuilder().append((String)localEntry.getKey()).append(": ").append(((LogicDataManager.LogicValueProvider)localEntry.getValue()).getValue());
    }
    AppMethodBeat.o(83374);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager
 * JD-Core Version:    0.6.2
 */