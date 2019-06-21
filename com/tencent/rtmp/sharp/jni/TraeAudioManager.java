package com.tencent.rtmp.sharp.jni;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

@SuppressLint({"NewApi"})
public class TraeAudioManager extends BroadcastReceiver
{
  public static final String ACTION_TRAEAUDIOMANAGER_NOTIFY = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY";
  public static final String ACTION_TRAEAUDIOMANAGER_REQUEST = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST";
  public static final String ACTION_TRAEAUDIOMANAGER_RES = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES";
  static final int AUDIO_DEVICE_OUT_BLUETOOTH_A2DP = 128;
  static final int AUDIO_DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;
  static final int AUDIO_DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;
  static final int AUDIO_DEVICE_OUT_BLUETOOTH_SCO = 16;
  static final int AUDIO_DEVICE_OUT_BLUETOOTH_SCO_CARKIT = 64;
  static final int AUDIO_DEVICE_OUT_BLUETOOTH_SCO_HEADSET = 32;
  static final int AUDIO_DEVICE_OUT_EARPIECE = 1;
  static final int AUDIO_DEVICE_OUT_SPEAKER = 2;
  static final int AUDIO_DEVICE_OUT_WIRED_HEADPHONE = 8;
  static final int AUDIO_DEVICE_OUT_WIRED_HEADSET = 4;
  public static final int AUDIO_MANAGER_ACTIVE_NONE = 0;
  public static final int AUDIO_MANAGER_ACTIVE_RING = 2;
  public static final int AUDIO_MANAGER_ACTIVE_VOICECALL = 1;
  static final String AUDIO_PARAMETER_STREAM_ROUTING = "routing";
  public static final String CONNECTDEVICE_DEVICENAME = "CONNECTDEVICE_DEVICENAME";
  public static final String CONNECTDEVICE_RESULT_DEVICENAME = "CONNECTDEVICE_RESULT_DEVICENAME";
  public static final String DEVICE_BLUETOOTHHEADSET = "DEVICE_BLUETOOTHHEADSET";
  public static final String DEVICE_EARPHONE = "DEVICE_EARPHONE";
  public static final String DEVICE_NONE = "DEVICE_NONE";
  public static final String DEVICE_SPEAKERPHONE = "DEVICE_SPEAKERPHONE";
  public static final int DEVICE_STATUS_CONNECTED = 2;
  public static final int DEVICE_STATUS_CONNECTING = 1;
  public static final int DEVICE_STATUS_DISCONNECTED = 0;
  public static final int DEVICE_STATUS_DISCONNECTING = 3;
  public static final int DEVICE_STATUS_ERROR = -1;
  public static final int DEVICE_STATUS_UNCHANGEABLE = 4;
  public static final String DEVICE_WIREDHEADSET = "DEVICE_WIREDHEADSET";
  public static final int EARACTION_AWAY = 0;
  public static final int EARACTION_CLOSE = 1;
  public static final String EXTRA_DATA_AVAILABLEDEVICE_LIST = "EXTRA_DATA_AVAILABLEDEVICE_LIST";
  public static final String EXTRA_DATA_CONNECTEDDEVICE = "EXTRA_DATA_CONNECTEDDEVICE";
  public static final String EXTRA_DATA_DEVICECONFIG = "EXTRA_DATA_DEVICECONFIG";
  public static final String EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME = "EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME";
  public static final String EXTRA_DATA_PREV_CONNECTEDDEVICE = "EXTRA_DATA_PREV_CONNECTEDDEVICE";
  public static final String EXTRA_DATA_ROUTESWITCHEND_DEV = "EXTRA_DATA_ROUTESWITCHEND_DEV";
  public static final String EXTRA_DATA_ROUTESWITCHEND_TIME = "EXTRA_DATA_ROUTESWITCHEND_TIME";
  public static final String EXTRA_DATA_ROUTESWITCHSTART_FROM = "EXTRA_DATA_ROUTESWITCHSTART_FROM";
  public static final String EXTRA_DATA_ROUTESWITCHSTART_TO = "EXTRA_DATA_ROUTESWITCHSTART_TO";
  public static final String EXTRA_DATA_STREAMTYPE = "EXTRA_DATA_STREAMTYPE";
  public static final String EXTRA_EARACTION = "EXTRA_EARACTION";
  public static final int FORCE_ANALOG_DOCK = 8;
  public static final int FORCE_BT_A2DP = 4;
  public static final int FORCE_BT_CAR_DOCK = 6;
  public static final int FORCE_BT_DESK_DOCK = 7;
  public static final int FORCE_BT_SCO = 3;
  public static final int FORCE_DEFAULT = 0;
  public static final int FORCE_DIGITAL_DOCK = 9;
  public static final int FORCE_HEADPHONES = 2;
  public static final int FORCE_NONE = 0;
  public static final int FORCE_NO_BT_A2DP = 10;
  public static final int FORCE_SPEAKER = 1;
  public static final int FORCE_WIRED_ACCESSORY = 5;
  public static final int FOR_COMMUNICATION = 0;
  public static final int FOR_DOCK = 3;
  public static final int FOR_MEDIA = 1;
  public static final int FOR_RECORD = 2;
  public static final String GETCONNECTEDDEVICE_RESULT_LIST = "GETCONNECTEDDEVICE_REULT_LIST";
  public static final String GETCONNECTINGDEVICE_RESULT_LIST = "GETCONNECTINGDEVICE_REULT_LIST";
  public static final String ISDEVICECHANGABLED_RESULT_ISCHANGABLED = "ISDEVICECHANGABLED_REULT_ISCHANGABLED";
  public static boolean IsMusicScene = false;
  public static boolean IsUpdateSceneFlag = false;
  public static final int MODE_MUSIC_PLAYBACK = 2;
  public static final int MODE_MUSIC_PLAY_RECORD = 1;
  public static final int MODE_MUSIC_PLAY_RECORD_HIGH_QUALITY = 3;
  public static final int MODE_VOICE_CHAT = 0;
  public static final String MUSIC_CONFIG = "DEVICE_SPEAKERPHONE;DEVICE_WIREDHEADSET;DEVICE_BLUETOOTHHEADSET;";
  public static final String NOTIFY_DEVICECHANGABLE_UPDATE = "NOTIFY_DEVICECHANGABLE_UPDATE";
  public static final String NOTIFY_DEVICECHANGABLE_UPDATE_DATE = "NOTIFY_DEVICECHANGABLE_UPDATE_DATE";
  public static final String NOTIFY_DEVICELIST_UPDATE = "NOTIFY_DEVICELISTUPDATE";
  public static final String NOTIFY_RING_COMPLETION = "NOTIFY_RING_COMPLETION";
  public static final String NOTIFY_ROUTESWITCHEND = "NOTIFY_ROUTESWITCHEND";
  public static final String NOTIFY_ROUTESWITCHSTART = "NOTIFY_ROUTESWITCHSTART";
  public static final String NOTIFY_SERVICE_STATE = "NOTIFY_SERVICE_STATE";
  public static final String NOTIFY_SERVICE_STATE_DATE = "NOTIFY_SERVICE_STATE_DATE";
  public static final String NOTIFY_STREAMTYPE_UPDATE = "NOTIFY_STREAMTYPE_UPDATE";
  private static final int NUM_FORCE_CONFIG = 11;
  private static final int NUM_FORCE_USE = 4;
  public static final String OPERATION_CONNECTDEVICE = "OPERATION_CONNECTDEVICE";
  public static final String OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE = "OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE";
  public static final String OPERATION_EARACTION = "OPERATION_EARACTION";
  public static final String OPERATION_GETCONNECTEDDEVICE = "OPERATION_GETCONNECTEDDEVICE";
  public static final String OPERATION_GETCONNECTINGDEVICE = "OPERATION_GETCONNECTINGDEVICE";
  public static final String OPERATION_GETDEVICELIST = "OPERATION_GETDEVICELIST";
  public static final String OPERATION_GETSTREAMTYPE = "OPERATION_GETSTREAMTYPE";
  public static final String OPERATION_ISDEVICECHANGABLED = "OPERATION_ISDEVICECHANGABLED";
  public static final String OPERATION_RECOVER_AUDIO_FOCUS = "OPERATION_RECOVER_AUDIO_FOCUS";
  public static final String OPERATION_REGISTERAUDIOSESSION = "OPERATION_REGISTERAUDIOSESSION";
  public static final String OPERATION_REQUEST_RELEASE_AUDIO_FOCUS = "OPERATION_REQUEST_RELEASE_AUDIO_FOCUS";
  public static final String OPERATION_STARTRING = "OPERATION_STARTRING";
  public static final String OPERATION_STARTSERVICE = "OPERATION_STARTSERVICE";
  public static final String OPERATION_STOPRING = "OPERATION_STOPRING";
  public static final String OPERATION_STOPSERVICE = "OPERATION_STOPSERVICE";
  public static final String OPERATION_VOICECALL_AUDIOPARAM_CHANGED = "OPERATION_VOICECALL_AUDIOPARAM_CHANGED";
  public static final String OPERATION_VOICECALL_POSTPROCESS = "OPERATION_VOICECALL_POSTROCESS";
  public static final String OPERATION_VOICECALL_PREPROCESS = "OPERATION_VOICECALL_PREPROCESS";
  public static final String PARAM_DEVICE = "PARAM_DEVICE";
  public static final String PARAM_ERROR = "PARAM_ERROR";
  public static final String PARAM_ISHOSTSIDE = "PARAM_ISHOSTSIDE";
  public static final String PARAM_MODEPOLICY = "PARAM_MODEPOLICY";
  public static final String PARAM_OPERATION = "PARAM_OPERATION";
  public static final String PARAM_RES_ERRCODE = "PARAM_RES_ERRCODE";
  public static final String PARAM_RING_DATASOURCE = "PARAM_RING_DATASOURCE";
  public static final String PARAM_RING_FILEPATH = "PARAM_RING_FILEPATH";
  public static final String PARAM_RING_LOOP = "PARAM_RING_LOOP";
  public static final String PARAM_RING_LOOPCOUNT = "PARAM_RING_LOOPCOUNT";
  public static final String PARAM_RING_MODE = "PARAM_RING_MODE";
  public static final String PARAM_RING_RSID = "PARAM_RING_RSID";
  public static final String PARAM_RING_URI = "PARAM_RING_URI";
  public static final String PARAM_RING_USERDATA_STRING = "PARAM_RING_USERDATA_STRING";
  public static final String PARAM_SESSIONID = "PARAM_SESSIONID";
  public static final String PARAM_STATUS = "PARAM_STATUS";
  public static final String PARAM_STREAMTYPE = "PARAM_STREAMTYPE";
  public static final String REGISTERAUDIOSESSION_ISREGISTER = "REGISTERAUDIOSESSION_ISREGISTER";
  public static final int RES_ERRCODE_DEVICE_BTCONNCECTED_TIMEOUT = 10;
  public static final int RES_ERRCODE_DEVICE_NOT_VISIABLE = 8;
  public static final int RES_ERRCODE_DEVICE_UNCHANGEABLE = 9;
  public static final int RES_ERRCODE_DEVICE_UNKOWN = 7;
  public static final int RES_ERRCODE_NONE = 0;
  public static final int RES_ERRCODE_RING_NOT_EXIST = 5;
  public static final int RES_ERRCODE_SERVICE_OFF = 1;
  public static final int RES_ERRCODE_STOPRING_INTERRUPT = 4;
  public static final int RES_ERRCODE_VOICECALLPOST_INTERRUPT = 6;
  public static final int RES_ERRCODE_VOICECALL_EXIST = 2;
  public static final int RES_ERRCODE_VOICECALL_NOT_EXIST = 3;
  public static final String VIDEO_CONFIG = "DEVICE_EARPHONE;DEVICE_SPEAKERPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;";
  public static final String VOICECALL_CONFIG = "DEVICE_SPEAKERPHONE;DEVICE_EARPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;";
  static int _gHostProcessId;
  static TraeAudioManager _ginstance;
  static ReentrantLock _glock;
  static final String[] forceName;
  boolean IsBluetoothA2dpExisted;
  int _activeMode;
  AudioManager _am;
  TraeAudioSessionHost _audioSessionHost;
  TraeAudioManager.d _bluetoothCheck;
  Context _context;
  e _deviceConfigManager;
  ReentrantLock _lock;
  int _modePolicy;
  int _prevMode;
  int _streamType;
  TraeAudioManager.k _switchThread;
  TraeAudioManager.f mTraeAudioManagerLooper;
  String sessionConnectedDev;

  static
  {
    AppMethodBeat.i(65758);
    IsMusicScene = false;
    IsUpdateSceneFlag = false;
    _glock = new ReentrantLock();
    _ginstance = null;
    _gHostProcessId = -1;
    forceName = new String[] { "FORCE_NONE", "FORCE_SPEAKER", "FORCE_HEADPHONES", "FORCE_BT_SCO", "FORCE_BT_A2DP", "FORCE_WIRED_ACCESSORY", "FORCE_BT_CAR_DOCK", "FORCE_BT_DESK_DOCK", "FORCE_ANALOG_DOCK", "FORCE_NO_BT_A2DP", "FORCE_DIGITAL_DOCK" };
    AppMethodBeat.o(65758);
  }

  TraeAudioManager(Context paramContext)
  {
    AppMethodBeat.i(65719);
    this._am = null;
    this._context = null;
    this._activeMode = 0;
    this._prevMode = 0;
    this._streamType = 0;
    this._modePolicy = -1;
    this.IsBluetoothA2dpExisted = true;
    this._audioSessionHost = null;
    this._deviceConfigManager = null;
    this._bluetoothCheck = null;
    this.sessionConnectedDev = "DEVICE_NONE";
    this.mTraeAudioManagerLooper = null;
    this._lock = new ReentrantLock();
    this._switchThread = null;
    AudioDeviceInterface.LogTraceEntry(" context:".concat(String.valueOf(paramContext)));
    if (paramContext == null)
      AppMethodBeat.o(65719);
    while (true)
    {
      return;
      this._context = paramContext;
      this.mTraeAudioManagerLooper = new TraeAudioManager.f(this, this);
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65719);
    }
  }

  static boolean IsEabiLowVersion()
  {
    AppMethodBeat.i(65703);
    String str1 = Build.CPU_ABI;
    String str2 = "unknown";
    if (Build.VERSION.SDK_INT >= 8);
    try
    {
      str2 = (String)Build.class.getDeclaredField("CPU_ABI2").get(null);
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "IsEabiVersion CPU_ABI:" + str1 + " CPU_ABI2:" + str2);
      if ((IsEabiLowVersionByAbi(str1)) && (IsEabiLowVersionByAbi(str2)))
      {
        AppMethodBeat.o(65703);
        bool = true;
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool;
        if (IsEabiLowVersionByAbi(str1))
        {
          AppMethodBeat.o(65703);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(65703);
          bool = false;
          continue;
          AppMethodBeat.o(65703);
          bool = false;
        }
      }
    }
  }

  public static boolean IsEabiLowVersionByAbi(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(65702);
    if (paramString == null)
      AppMethodBeat.o(65702);
    while (true)
    {
      return bool;
      if (paramString.contains("x86"))
      {
        AppMethodBeat.o(65702);
        bool = false;
      }
      else if (paramString.contains("mips"))
      {
        AppMethodBeat.o(65702);
        bool = false;
      }
      else if (paramString.equalsIgnoreCase("armeabi"))
      {
        AppMethodBeat.o(65702);
      }
      else if (paramString.equalsIgnoreCase("armeabi-v7a"))
      {
        AppMethodBeat.o(65702);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(65702);
      }
    }
  }

  public static int SetSpeakerForTest(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(65711);
    int i = -1;
    _glock.lock();
    int j;
    if (_ginstance != null)
      j = _ginstance.InternalSetSpeaker(paramContext, paramBoolean);
    while (true)
    {
      _glock.unlock();
      AppMethodBeat.o(65711);
      return j;
      j = i;
      if (QLog.isColorLevel())
      {
        QLog.w("TRAE", 2, "TraeAudioManager|static SetSpeakerForTest|null == _ginstance");
        j = i;
      }
    }
  }

  public static boolean checkDevName(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(65698);
    if (paramString == null)
      AppMethodBeat.o(65698);
    while (true)
    {
      return bool;
      if ((!"DEVICE_SPEAKERPHONE".equals(paramString)) && (!"DEVICE_EARPHONE".equals(paramString)) && (!"DEVICE_WIREDHEADSET".equals(paramString)) && (!"DEVICE_BLUETOOTHHEADSET".equals(paramString)))
      {
        AppMethodBeat.o(65698);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(65698);
      }
    }
  }

  static int connectDevice(String paramString1, long paramLong, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(65728);
    int i;
    if (paramString2 == null)
    {
      i = -1;
      AppMethodBeat.o(65728);
    }
    while (true)
    {
      return i;
      HashMap localHashMap = new HashMap();
      localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
      localHashMap.put("PARAM_OPERATION", paramString1);
      localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
      localHashMap.put("CONNECTDEVICE_DEVICENAME", paramString2);
      localHashMap.put("PARAM_DEVICE", paramString2);
      i = sendMessage(32775, localHashMap);
      AppMethodBeat.o(65728);
    }
  }

  static int connectHighestPriorityDevice(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65729);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32789, localHashMap);
    AppMethodBeat.o(65729);
    return i;
  }

  static int earAction(String paramString, long paramLong, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(65730);
    if ((paramInt != 0) && (paramInt != 1))
    {
      paramInt = -1;
      AppMethodBeat.o(65730);
    }
    while (true)
    {
      return paramInt;
      HashMap localHashMap = new HashMap();
      localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
      localHashMap.put("PARAM_OPERATION", paramString);
      localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
      localHashMap.put("EXTRA_EARACTION", Integer.valueOf(paramInt));
      paramInt = sendMessage(32776, localHashMap);
      AppMethodBeat.o(65730);
    }
  }

  static void forceVolumeControlStream(AudioManager paramAudioManager, int paramInt)
  {
    AppMethodBeat.i(65757);
    Class localClass = Integer.TYPE;
    paramAudioManager = invokeMethod(paramAudioManager, "forceVolumeControlStream", new Object[] { Integer.valueOf(paramInt) }, new Class[] { localClass });
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "forceVolumeControlStream  streamType:" + paramInt + " res:" + paramAudioManager);
    AppMethodBeat.o(65757);
  }

  static int getAudioSource(int paramInt)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(65704);
    if (IsMusicScene)
    {
      AppMethodBeat.o(65704);
      i = j;
    }
    while (true)
    {
      return i;
      if (IsEabiLowVersion())
      {
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "[Config] armeabi low Version, getAudioSource _audioSourcePolicy:" + paramInt + " source:0");
        AppMethodBeat.o(65704);
        i = j;
      }
      else
      {
        j = Build.VERSION.SDK_INT;
        if (paramInt >= 0)
        {
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "[Config] getAudioSource _audioSourcePolicy:" + paramInt + " source:" + paramInt);
          AppMethodBeat.o(65704);
          i = paramInt;
        }
        else
        {
          if (j >= 11)
            i = 7;
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "[Config] getAudioSource _audioSourcePolicy:" + paramInt + " source:" + i);
          AppMethodBeat.o(65704);
        }
      }
    }
  }

  static int getAudioStreamType(int paramInt)
  {
    int i = 3;
    AppMethodBeat.i(65705);
    if (IsMusicScene)
      AppMethodBeat.o(65705);
    while (true)
    {
      return i;
      if (!IsEabiLowVersion())
        break;
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "[Config] armeabi low Version, getAudioStreamType audioStreamTypePolicy:" + paramInt + " streamType:3");
      AppMethodBeat.o(65705);
    }
    int j = Build.VERSION.SDK_INT;
    if (paramInt >= 0)
      i = paramInt;
    while (true)
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "[Config] getAudioStreamType audioStreamTypePolicy:" + paramInt + " streamType:" + i);
      AppMethodBeat.o(65705);
      break;
      if (j >= 9)
        i = 0;
    }
  }

  static int getCallAudioMode(int paramInt)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(65706);
    if (IsMusicScene)
    {
      AppMethodBeat.o(65706);
      i = j;
    }
    while (true)
    {
      return i;
      if (IsEabiLowVersion())
      {
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "[Config] armeabi low Version, getCallAudioMode modePolicy:" + paramInt + " mode:0");
        AppMethodBeat.o(65706);
        i = j;
      }
      else
      {
        j = Build.VERSION.SDK_INT;
        if (paramInt >= 0)
        {
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "[Config] getCallAudioMode modePolicy:" + paramInt + " mode:" + paramInt);
          AppMethodBeat.o(65706);
          i = paramInt;
        }
        else
        {
          if (j >= 11)
            i = 3;
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "[Config] getCallAudioMode _modePolicy:" + paramInt + " mode:" + i + "facturer:" + Build.MANUFACTURER + " model:" + Build.MODEL);
          AppMethodBeat.o(65706);
        }
      }
    }
  }

  static int getConnectedDevice(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65732);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32778, localHashMap);
    AppMethodBeat.o(65732);
    return i;
  }

  static int getConnectingDevice(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65733);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32779, localHashMap);
    AppMethodBeat.o(65733);
    return i;
  }

  static int getDeviceList(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65724);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32774, localHashMap);
    AppMethodBeat.o(65724);
    return i;
  }

  static String getForceConfigName(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < forceName.length));
    for (String str = forceName[paramInt]; ; str = "unknow")
      return str;
  }

  static int getForceUse(int paramInt)
  {
    AppMethodBeat.i(65756);
    Object localObject = Integer.TYPE;
    localObject = invokeStaticMethod("android.media.AudioSystem", "getForceUse", new Object[] { Integer.valueOf(paramInt) }, new Class[] { localObject });
    if (localObject != null);
    for (localObject = (Integer)localObject; ; localObject = Integer.valueOf(0))
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "getForceUse  usage:" + paramInt + " config:" + localObject + " ->" + getForceConfigName(((Integer)localObject).intValue()));
      paramInt = ((Integer)localObject).intValue();
      AppMethodBeat.o(65756);
      return paramInt;
    }
  }

  static int getStreamType(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65725);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32784, localHashMap);
    AppMethodBeat.o(65725);
    return i;
  }

  public static int init(Context paramContext)
  {
    AppMethodBeat.i(65717);
    TXCLog.w("TRAE", "TraeAudioManager init _ginstance:" + _ginstance);
    AudioDeviceInterface.LogTraceEntry(" _ginstance:" + _ginstance);
    _glock.lock();
    if (_ginstance == null)
      _ginstance = new TraeAudioManager(paramContext);
    _glock.unlock();
    AudioDeviceInterface.LogTraceExit();
    AppMethodBeat.o(65717);
    return 0;
  }

  public static Object invokeMethod(Object paramObject, String paramString, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    AppMethodBeat.i(65751);
    Object localObject = null;
    try
    {
      paramObject = paramObject.getClass().getMethod(paramString, paramArrayOfClass).invoke(paramObject, paramArrayOfObject);
      AppMethodBeat.o(65751);
      return paramObject;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramObject = localObject;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "invokeMethod Exception:" + paramString.getMessage());
          paramObject = localObject;
        }
      }
    }
  }

  public static Object invokeStaticMethod(String paramString1, String paramString2, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    Object localObject = null;
    AppMethodBeat.i(65752);
    try
    {
      paramArrayOfObject = Class.forName(paramString1).getMethod(paramString2, paramArrayOfClass).invoke(null, paramArrayOfObject);
      AppMethodBeat.o(65752);
      return paramArrayOfObject;
    }
    catch (ClassNotFoundException paramString2)
    {
      while (true)
      {
        paramArrayOfObject = localObject;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "ClassNotFound:".concat(String.valueOf(paramString1)));
          paramArrayOfObject = localObject;
        }
      }
    }
    catch (NoSuchMethodException paramString1)
    {
      while (true)
      {
        paramArrayOfObject = localObject;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "NoSuchMethod:".concat(String.valueOf(paramString2)));
          paramArrayOfObject = localObject;
        }
      }
    }
    catch (IllegalArgumentException paramString1)
    {
      while (true)
      {
        paramArrayOfObject = localObject;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "IllegalArgument:".concat(String.valueOf(paramString2)));
          paramArrayOfObject = localObject;
        }
      }
    }
    catch (IllegalAccessException paramString1)
    {
      while (true)
      {
        paramArrayOfObject = localObject;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "IllegalAccess:".concat(String.valueOf(paramString2)));
          paramArrayOfObject = localObject;
        }
      }
    }
    catch (InvocationTargetException paramString1)
    {
      while (true)
      {
        paramArrayOfObject = localObject;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "InvocationTarget:".concat(String.valueOf(paramString2)));
          paramArrayOfObject = localObject;
        }
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        paramArrayOfObject = localObject;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "invokeStaticMethod Exception:" + paramString1.getMessage());
          paramArrayOfObject = localObject;
        }
      }
    }
  }

  static boolean isCloseSystemAPM(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(65701);
    if (paramInt != -1)
      AppMethodBeat.o(65701);
    while (true)
    {
      return bool;
      if (Build.MANUFACTURER.equals("Xiaomi"))
      {
        if (Build.MODEL.equals("MI 2"))
        {
          AppMethodBeat.o(65701);
          bool = true;
        }
        else if (Build.MODEL.equals("MI 2A"))
        {
          AppMethodBeat.o(65701);
          bool = true;
        }
        else if (Build.MODEL.equals("MI 2S"))
        {
          AppMethodBeat.o(65701);
          bool = true;
        }
        else if (Build.MODEL.equals("MI 2SC"))
        {
          AppMethodBeat.o(65701);
          bool = true;
        }
      }
      else if ((Build.MANUFACTURER.equals("samsung")) && (Build.MODEL.equals("SCH-I959")))
      {
        AppMethodBeat.o(65701);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(65701);
      }
    }
  }

  static int isDeviceChangabled(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65731);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32777, localHashMap);
    AppMethodBeat.o(65731);
    return i;
  }

  public static boolean isHandfree(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(65699);
    if (!checkDevName(paramString))
      AppMethodBeat.o(65699);
    while (true)
    {
      return bool;
      if ("DEVICE_SPEAKERPHONE".equals(paramString))
      {
        bool = true;
        AppMethodBeat.o(65699);
      }
      else
      {
        AppMethodBeat.o(65699);
      }
    }
  }

  static int recoverAudioFocus(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65740);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32791, localHashMap);
    AppMethodBeat.o(65740);
    return i;
  }

  public static int registerAudioSession(boolean paramBoolean, long paramLong, Context paramContext)
  {
    AppMethodBeat.i(65715);
    int i = -1;
    _glock.lock();
    if (_ginstance != null)
    {
      if (!paramBoolean)
        break label54;
      _ginstance._audioSessionHost.add(paramLong, paramContext);
    }
    while (true)
    {
      i = 0;
      _glock.unlock();
      AppMethodBeat.o(65715);
      return i;
      label54: _ginstance._audioSessionHost.remove(paramLong);
    }
  }

  static int requestReleaseAudioFocus(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65739);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32790, localHashMap);
    AppMethodBeat.o(65739);
    return i;
  }

  public static int sendMessage(int paramInt, HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65716);
    int i = -1;
    _glock.lock();
    if (_ginstance != null)
      i = _ginstance.internalSendMessage(paramInt, paramHashMap);
    _glock.unlock();
    AppMethodBeat.o(65716);
    return i;
  }

  static void setForceUse(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65755);
    Object localObject = Integer.TYPE;
    Class localClass = Integer.TYPE;
    localObject = invokeStaticMethod("android.media.AudioSystem", "setForceUse", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }, new Class[] { localObject, localClass });
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "setForceUse  usage:" + paramInt1 + " config:" + paramInt2 + " ->" + getForceConfigName(paramInt2) + " res:" + localObject);
    AppMethodBeat.o(65755);
  }

  static void setParameters(String paramString)
  {
    AppMethodBeat.i(65753);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "setParameters  :".concat(String.valueOf(paramString)));
    invokeStaticMethod("android.media.AudioSystem", "setParameters", new Object[] { paramString }, new Class[] { String.class });
    AppMethodBeat.o(65753);
  }

  static void setPhoneState(int paramInt)
  {
    AppMethodBeat.i(65754);
    Class localClass = Integer.TYPE;
    invokeStaticMethod("android.media.AudioSystem", "setPhoneState", new Object[] { Integer.valueOf(paramInt) }, new Class[] { localClass });
    AppMethodBeat.o(65754);
  }

  static int startRing(String paramString1, long paramLong, boolean paramBoolean1, int paramInt1, int paramInt2, Uri paramUri, String paramString2, boolean paramBoolean2, int paramInt3, String paramString3, boolean paramBoolean3)
  {
    AppMethodBeat.i(65737);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString1);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean1));
    localHashMap.put("PARAM_RING_DATASOURCE", Integer.valueOf(paramInt1));
    localHashMap.put("PARAM_RING_RSID", Integer.valueOf(paramInt2));
    localHashMap.put("PARAM_RING_URI", paramUri);
    localHashMap.put("PARAM_RING_FILEPATH", paramString2);
    localHashMap.put("PARAM_RING_LOOP", Boolean.valueOf(paramBoolean2));
    localHashMap.put("PARAM_RING_LOOPCOUNT", Integer.valueOf(paramInt3));
    localHashMap.put("PARAM_RING_MODE", Boolean.valueOf(paramBoolean3));
    localHashMap.put("PARAM_RING_USERDATA_STRING", paramString3);
    paramInt1 = sendMessage(32782, localHashMap);
    AppMethodBeat.o(65737);
    return paramInt1;
  }

  static int startService(String paramString1, long paramLong, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(65726);
    int i;
    if (paramString2.length() <= 0)
    {
      i = -1;
      AppMethodBeat.o(65726);
    }
    while (true)
    {
      return i;
      HashMap localHashMap = new HashMap();
      localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
      localHashMap.put("PARAM_OPERATION", paramString1);
      localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
      localHashMap.put("EXTRA_DATA_DEVICECONFIG", paramString2);
      i = sendMessage(32772, localHashMap);
      AppMethodBeat.o(65726);
    }
  }

  static int stopRing(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65738);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32783, localHashMap);
    AppMethodBeat.o(65738);
    return i;
  }

  static int stopService(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65727);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32773, localHashMap);
    AppMethodBeat.o(65727);
    return i;
  }

  public static void uninit()
  {
    AppMethodBeat.i(65718);
    TXCLog.w("TRAE", "TraeAudioManager uninit _ginstance:" + _ginstance);
    AudioDeviceInterface.LogTraceEntry(" _ginstance:" + _ginstance);
    _glock.lock();
    if (_ginstance != null)
    {
      _ginstance.release();
      _ginstance = null;
    }
    _glock.unlock();
    AudioDeviceInterface.LogTraceExit();
    AppMethodBeat.o(65718);
  }

  static int voiceCallAudioParamChanged(String paramString, long paramLong, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65736);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    localHashMap.put("PARAM_MODEPOLICY", Integer.valueOf(paramInt1));
    localHashMap.put("PARAM_STREAMTYPE", Integer.valueOf(paramInt2));
    paramInt1 = sendMessage(32788, localHashMap);
    AppMethodBeat.o(65736);
    return paramInt1;
  }

  static int voicecallPostprocess(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65735);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    int i = sendMessage(32781, localHashMap);
    AppMethodBeat.o(65735);
    return i;
  }

  static int voicecallPreprocess(String paramString, long paramLong, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65734);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    localHashMap.put("PARAM_MODEPOLICY", Integer.valueOf(paramInt1));
    localHashMap.put("PARAM_STREAMTYPE", Integer.valueOf(paramInt2));
    paramInt1 = sendMessage(32780, localHashMap);
    AppMethodBeat.o(65734);
    return paramInt1;
  }

  public TraeAudioManager.d CreateBluetoothCheck(Context paramContext, e parame)
  {
    AppMethodBeat.i(65750);
    Object localObject1;
    Object localObject2;
    if (Build.VERSION.SDK_INT >= 11)
    {
      localObject1 = new TraeAudioManager.a(this);
      localObject2 = localObject1;
      if (!((TraeAudioManager.d)localObject1).a(paramContext, parame))
        localObject2 = new TraeAudioManager.b(this);
      if (QLog.isColorLevel())
      {
        parame = new StringBuilder("CreateBluetoothCheck:").append(((TraeAudioManager.d)localObject2).c()).append(" skip android4.3:");
        if (Build.VERSION.SDK_INT != 18)
          break label144;
      }
    }
    label144: for (paramContext = "Y"; ; paramContext = "N")
    {
      QLog.w("TRAE", 2, paramContext);
      AppMethodBeat.o(65750);
      return localObject2;
      if (Build.VERSION.SDK_INT != 18)
      {
        localObject1 = new TraeAudioManager.c(this);
        break;
      }
      localObject1 = new TraeAudioManager.b(this);
      break;
    }
  }

  int InternalConnectDevice(String paramString, HashMap<String, Object> paramHashMap, boolean paramBoolean)
  {
    int i = -1;
    AppMethodBeat.i(65742);
    AudioDeviceInterface.LogTraceEntry(" devName:".concat(String.valueOf(paramString)));
    if (paramString == null)
      AppMethodBeat.o(65742);
    while (true)
    {
      return i;
      if ((IsMusicScene) && (paramString.equals("DEVICE_EARPHONE")))
      {
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, "MusicScene, Connect device:" + paramString + " failed");
        AppMethodBeat.o(65742);
      }
      else if ((!paramBoolean) && (!this._deviceConfigManager.h().equals("DEVICE_NONE")) && (paramString.equals(this._deviceConfigManager.h())))
      {
        AppMethodBeat.o(65742);
        i = 0;
      }
      else if ((checkDevName(paramString) != true) || (this._deviceConfigManager.c(paramString) != true))
      {
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " checkDevName fail");
        AppMethodBeat.o(65742);
      }
      else
      {
        if (InternalIsDeviceChangeable() == true)
          break;
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " InternalIsDeviceChangeable fail");
        AppMethodBeat.o(65742);
      }
    }
    if (this._switchThread != null)
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "_switchThread:" + this._switchThread.b());
      this._switchThread.f();
      this._switchThread = null;
    }
    if (paramString.equals("DEVICE_EARPHONE"))
      this._switchThread = new TraeAudioManager.h(this);
    while (true)
    {
      if (this._switchThread != null)
      {
        this._switchThread.a(paramHashMap);
        this._switchThread.start();
      }
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65742);
      i = 0;
      break;
      if (paramString.equals("DEVICE_SPEAKERPHONE"))
        this._switchThread = new TraeAudioManager.j(this);
      else if (paramString.equals("DEVICE_WIREDHEADSET"))
        this._switchThread = new TraeAudioManager.i(this);
      else if (paramString.equals("DEVICE_BLUETOOTHHEADSET"))
        this._switchThread = new g();
    }
  }

  boolean InternalIsDeviceChangeable()
  {
    AppMethodBeat.i(65744);
    String str = this._deviceConfigManager.g();
    boolean bool;
    if ((str == null) || (str.equals("DEVICE_NONE")) || (str.equals("")))
    {
      bool = true;
      AppMethodBeat.o(65744);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65744);
    }
  }

  int InternalNotifyDeviceChangableUpdate()
  {
    AppMethodBeat.i(65749);
    int i;
    if (this._context == null)
    {
      i = -1;
      AppMethodBeat.o(65749);
    }
    while (true)
    {
      return i;
      boolean bool = InternalIsDeviceChangeable();
      new Handler(Looper.getMainLooper()).post(new TraeAudioManager.3(this, bool));
      i = 0;
      AppMethodBeat.o(65749);
    }
  }

  int InternalNotifyDeviceListUpdate()
  {
    AppMethodBeat.i(65748);
    AudioDeviceInterface.LogTraceEntry("");
    int i;
    if (this._context == null)
    {
      i = -1;
      AppMethodBeat.o(65748);
    }
    while (true)
    {
      return i;
      Object localObject = this._deviceConfigManager.j();
      ArrayList localArrayList = (ArrayList)((HashMap)localObject).get("EXTRA_DATA_AVAILABLEDEVICE_LIST");
      String str = (String)((HashMap)localObject).get("EXTRA_DATA_CONNECTEDDEVICE");
      localObject = (String)((HashMap)localObject).get("EXTRA_DATA_PREV_CONNECTEDDEVICE");
      new Handler(Looper.getMainLooper()).post(new TraeAudioManager.2(this, localArrayList, str, (String)localObject));
      AudioDeviceInterface.LogTraceExit();
      i = 0;
      AppMethodBeat.o(65748);
    }
  }

  int InternalSessionConnectDevice(HashMap<String, Object> paramHashMap)
  {
    int i = 0;
    AppMethodBeat.i(65741);
    AudioDeviceInterface.LogTraceEntry("");
    if ((paramHashMap == null) || (this._context == null))
      AppMethodBeat.o(65741);
    for (int j = -1; ; j = -1)
    {
      return j;
      if (!IsMusicScene)
        break;
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "MusicScene: InternalSessionConnectDevice failed");
      AppMethodBeat.o(65741);
    }
    String str = (String)paramHashMap.get("PARAM_DEVICE");
    TXCLog.w("TRAE", "ConnectDevice: ".concat(String.valueOf(str)));
    boolean bool = InternalIsDeviceChangeable();
    if (checkDevName(str) != true)
      j = 7;
    while (true)
    {
      label114: StringBuilder localStringBuilder;
      if (QLog.isColorLevel())
      {
        localStringBuilder = new StringBuilder("sessonID:").append((Long)paramHashMap.get("PARAM_SESSIONID")).append(" devName:").append(str).append(" bChangabled:");
        if (!bool)
          break label277;
      }
      label277: for (Object localObject = "Y"; ; localObject = "N")
      {
        QLog.w("TRAE", 2, (String)localObject + " err:" + j);
        if (j == 0)
          break label285;
        localObject = new Intent();
        ((Intent)localObject).putExtra("CONNECTDEVICE_RESULT_DEVICENAME", (String)paramHashMap.get("PARAM_DEVICE"));
        sendResBroadcast((Intent)localObject, paramHashMap, j);
        AppMethodBeat.o(65741);
        j = -1;
        break;
        if (!this._deviceConfigManager.c(str))
        {
          j = 8;
          break label114;
        }
        if (bool)
          break label401;
        j = 9;
        break label114;
      }
      label285: if (str.equals(this._deviceConfigManager.h()))
      {
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " --has connected!");
        localObject = new Intent();
        ((Intent)localObject).putExtra("CONNECTDEVICE_RESULT_DEVICENAME", (String)paramHashMap.get("PARAM_DEVICE"));
        sendResBroadcast((Intent)localObject, paramHashMap, j);
        AppMethodBeat.o(65741);
        j = i;
        break;
      }
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, " --connecting...");
      InternalConnectDevice(str, paramHashMap, false);
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65741);
      j = i;
      break;
      label401: j = 0;
    }
  }

  int InternalSessionEarAction(HashMap<String, Object> paramHashMap)
  {
    return 0;
  }

  int InternalSessionGetConnectedDevice(HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65745);
    Intent localIntent = new Intent();
    localIntent.putExtra("GETCONNECTEDDEVICE_REULT_LIST", this._deviceConfigManager.h());
    sendResBroadcast(localIntent, paramHashMap, 0);
    AppMethodBeat.o(65745);
    return 0;
  }

  int InternalSessionGetConnectingDevice(HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65746);
    Intent localIntent = new Intent();
    localIntent.putExtra("GETCONNECTINGDEVICE_REULT_LIST", this._deviceConfigManager.g());
    sendResBroadcast(localIntent, paramHashMap, 0);
    AppMethodBeat.o(65746);
    return 0;
  }

  int InternalSessionIsDeviceChangabled(HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65743);
    Intent localIntent = new Intent();
    localIntent.putExtra("ISDEVICECHANGABLED_REULT_ISCHANGABLED", InternalIsDeviceChangeable());
    sendResBroadcast(localIntent, paramHashMap, 0);
    AppMethodBeat.o(65743);
    return 0;
  }

  void InternalSetMode(int paramInt)
  {
    AppMethodBeat.i(65714);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "SetMode entry:".concat(String.valueOf(paramInt)));
    if (this._am == null)
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "setMode:" + paramInt + " fail am=null");
      AppMethodBeat.o(65714);
      return;
    }
    this._am.setMode(paramInt);
    StringBuilder localStringBuilder;
    if (QLog.isColorLevel())
    {
      localStringBuilder = new StringBuilder("setMode:").append(paramInt);
      if (this._am.getMode() == paramInt)
        break label147;
    }
    label147: for (String str = "fail"; ; str = "success")
    {
      QLog.w("TRAE", 2, str);
      AppMethodBeat.o(65714);
      break;
    }
  }

  int InternalSetSpeaker(Context paramContext, boolean paramBoolean)
  {
    int i = -1;
    AppMethodBeat.i(65712);
    if (paramContext == null)
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "Could not InternalSetSpeaker - no context");
      AppMethodBeat.o(65712);
    }
    AudioManager localAudioManager;
    while (true)
    {
      return i;
      localAudioManager = (AudioManager)paramContext.getSystemService("audio");
      if (localAudioManager != null)
        break;
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "Could not InternalSetSpeaker - no audio manager");
      AppMethodBeat.o(65712);
    }
    StringBuilder localStringBuilder;
    if (QLog.isColorLevel())
    {
      localStringBuilder = new StringBuilder("InternalSetSpeaker entry:speaker:");
      if (!localAudioManager.isSpeakerphoneOn())
        break label181;
      paramContext = "Y";
      label108: localStringBuilder = localStringBuilder.append(paramContext).append("-->:");
      if (!paramBoolean)
        break label188;
    }
    label181: label188: for (paramContext = "Y"; ; paramContext = "N")
    {
      QLog.w("TRAE", 2, paramContext);
      if ((!isCloseSystemAPM(this._modePolicy)) || (this._activeMode == 2))
        break label195;
      i = InternalSetSpeakerSpe(localAudioManager, paramBoolean);
      AppMethodBeat.o(65712);
      break;
      paramContext = "N";
      break label108;
    }
    label195: if (localAudioManager.isSpeakerphoneOn() != paramBoolean)
      localAudioManager.setSpeakerphoneOn(paramBoolean);
    if (localAudioManager.isSpeakerphoneOn() == paramBoolean);
    for (i = 0; ; i = -1)
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "InternalSetSpeaker exit:" + paramBoolean + " res:" + i + " mode:" + localAudioManager.getMode());
      AppMethodBeat.o(65712);
      break;
    }
  }

  int InternalSetSpeakerSpe(AudioManager paramAudioManager, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(65713);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "InternalSetSpeakerSpe fac:" + Build.MANUFACTURER + " model:" + Build.MODEL + " st:" + this._streamType + " media_force_use:" + getForceUse(1));
    if (paramBoolean)
    {
      InternalSetMode(0);
      paramAudioManager.setSpeakerphoneOn(true);
      setForceUse(1, 1);
      if (paramAudioManager.isSpeakerphoneOn() != paramBoolean)
        break label184;
    }
    while (true)
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "InternalSetSpeakerSpe exit:" + paramBoolean + " res:" + i + " mode:" + paramAudioManager.getMode());
      AppMethodBeat.o(65713);
      return i;
      InternalSetMode(3);
      paramAudioManager.setSpeakerphoneOn(false);
      setForceUse(1, 0);
      break;
      label184: i = -1;
    }
  }

  void _updateEarphoneVisable()
  {
    AppMethodBeat.i(65708);
    if (this._deviceConfigManager.c("DEVICE_WIREDHEADSET"))
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, " detected headset plugin,so disable earphone");
      this._deviceConfigManager.a("DEVICE_EARPHONE", false);
      AppMethodBeat.o(65708);
    }
    while (true)
    {
      return;
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, " detected headset plugout,so enable earphone");
      this._deviceConfigManager.a("DEVICE_EARPHONE", true);
      AppMethodBeat.o(65708);
    }
  }

  void checkAutoDeviceListUpdate()
  {
    AppMethodBeat.i(65709);
    if (this._deviceConfigManager.b() == true)
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "checkAutoDeviceListUpdate got update!");
      _updateEarphoneVisable();
      this._deviceConfigManager.c();
      internalSendMessage(32785, new HashMap());
    }
    AppMethodBeat.o(65709);
  }

  void checkDevicePlug(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(65710);
    Object localObject;
    if (this._deviceConfigManager.b() == true)
      if (QLog.isColorLevel())
      {
        StringBuilder localStringBuilder = new StringBuilder("checkDevicePlug got update dev:").append(paramString);
        if (paramBoolean)
        {
          localObject = " piugin";
          QLog.w("TRAE", 2, (String)localObject + " connectedDev:" + this._deviceConfigManager.h());
        }
      }
      else
      {
        _updateEarphoneVisable();
        this._deviceConfigManager.c();
        if (!paramBoolean)
          break label137;
        localObject = new HashMap();
        ((HashMap)localObject).put("PARAM_DEVICE", paramString);
        internalSendMessage(32786, (HashMap)localObject);
        AppMethodBeat.o(65710);
      }
    while (true)
    {
      return;
      localObject = " plugout";
      break;
      label137: localObject = this._deviceConfigManager.h();
      if ((((String)localObject).equals(paramString)) || (((String)localObject).equals("DEVICE_NONE")))
      {
        localObject = new HashMap();
        ((HashMap)localObject).put("PARAM_DEVICE", paramString);
        internalSendMessage(32787, (HashMap)localObject);
        AppMethodBeat.o(65710);
      }
      else
      {
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, " ---No switch,plugout:" + paramString + " connectedDev:" + (String)localObject);
        internalSendMessage(32785, new HashMap());
        AppMethodBeat.o(65710);
      }
    }
  }

  int internalSendMessage(int paramInt, HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65723);
    int i = -1;
    if (this.mTraeAudioManagerLooper != null)
      i = this.mTraeAudioManagerLooper.a(paramInt, paramHashMap);
    AppMethodBeat.o(65723);
    return i;
  }

  void onHeadsetPlug(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(65722);
    Object localObject = paramIntent.getStringExtra("name");
    paramContext = (Context)localObject;
    if (localObject == null)
      paramContext = "unkonw";
    localObject = "" + " [" + paramContext + "] ";
    int i = paramIntent.getIntExtra("state", -1);
    paramContext = (Context)localObject;
    if (i != -1)
    {
      localObject = new StringBuilder().append((String)localObject);
      if (i == 0)
      {
        paramContext = "unplugged";
        paramContext = paramContext;
      }
    }
    else
    {
      localObject = paramContext + " mic:";
      int j = paramIntent.getIntExtra("microphone", -1);
      paramContext = (Context)localObject;
      if (j != -1)
      {
        paramIntent = new StringBuilder().append((String)localObject);
        if (j != 1)
          break label251;
        paramContext = "Y";
        label166: paramContext = paramContext;
      }
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "onHeadsetPlug:: ".concat(String.valueOf(paramContext)));
      paramContext = this._deviceConfigManager;
      if (1 != i)
        break label258;
    }
    label258: for (boolean bool = true; ; bool = false)
    {
      paramContext.a("DEVICE_WIREDHEADSET", bool);
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "onHeadsetPlug exit");
      AppMethodBeat.o(65722);
      return;
      paramContext = "plugged";
      break;
      label251: paramContext = "unkown";
      break label166;
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(65721);
    if ((paramIntent == null) || (paramContext == null))
    {
      if (QLog.isColorLevel())
        QLog.d("TRAE", 2, "onReceive intent or context is null!");
      AppMethodBeat.o(65721);
    }
    label1065: 
    while (true)
    {
      return;
      Object localObject1;
      String str;
      Object localObject2;
      boolean bool1;
      boolean bool2;
      try
      {
        localObject1 = paramIntent.getAction();
        str = paramIntent.getStringExtra("PARAM_OPERATION");
        if (QLog.isColorLevel())
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("TraeAudioManager|onReceive::Action:");
          QLog.w("TRAE", 2, paramIntent.getAction());
        }
        if (this._deviceConfigManager == null)
        {
          if (QLog.isColorLevel())
            QLog.d("TRAE", 2, "_deviceConfigManager null!");
          AppMethodBeat.o(65721);
          continue;
        }
        bool1 = this._deviceConfigManager.c("DEVICE_WIREDHEADSET");
        bool2 = this._deviceConfigManager.c("DEVICE_BLUETOOTHHEADSET");
        if (!"android.intent.action.HEADSET_PLUG".equals(paramIntent.getAction()))
          break label230;
        onHeadsetPlug(paramContext, paramIntent);
        if ((!bool1) && (this._deviceConfigManager.c("DEVICE_WIREDHEADSET") == true))
          checkDevicePlug("DEVICE_WIREDHEADSET", true);
        if ((bool1 != true) || (this._deviceConfigManager.c("DEVICE_WIREDHEADSET")))
          break label1065;
        checkDevicePlug("DEVICE_WIREDHEADSET", false);
        AppMethodBeat.o(65721);
      }
      catch (Exception paramContext)
      {
        AppMethodBeat.o(65721);
      }
      continue;
      label230: if (!"android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction()))
      {
        if ("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST".equals(localObject1))
        {
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "   OPERATION:".concat(String.valueOf(str)));
          if ("OPERATION_REGISTERAUDIOSESSION".equals(str))
          {
            registerAudioSession(paramIntent.getBooleanExtra("REGISTERAUDIOSESSION_ISREGISTER", false), paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), paramContext);
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_STARTSERVICE".equals(str))
          {
            startService(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false, paramIntent.getStringExtra("EXTRA_DATA_DEVICECONFIG"));
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_STOPSERVICE".equals(str))
          {
            stopService(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false);
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_GETDEVICELIST".equals(str))
          {
            getDeviceList(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false);
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_GETSTREAMTYPE".equals(str))
          {
            getStreamType(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false);
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_CONNECTDEVICE".equals(str))
          {
            connectDevice(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false, paramIntent.getStringExtra("CONNECTDEVICE_DEVICENAME"));
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE".equals(str))
          {
            connectHighestPriorityDevice(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false);
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_EARACTION".equals(str))
          {
            earAction(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false, paramIntent.getIntExtra("EXTRA_EARACTION", -1));
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_ISDEVICECHANGABLED".equals(str))
          {
            isDeviceChangabled(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false);
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_GETCONNECTEDDEVICE".equals(str))
          {
            getConnectedDevice(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false);
            AppMethodBeat.o(65721);
          }
          else if ("OPERATION_GETCONNECTINGDEVICE".equals(str))
          {
            getConnectingDevice(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false);
            AppMethodBeat.o(65721);
          }
          else
          {
            int i;
            int j;
            if ("OPERATION_VOICECALL_PREPROCESS".equals(str))
            {
              i = paramIntent.getIntExtra("PARAM_MODEPOLICY", -1);
              j = paramIntent.getIntExtra("PARAM_STREAMTYPE", -1);
              voicecallPreprocess(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false, i, j);
              AppMethodBeat.o(65721);
            }
            else if ("OPERATION_VOICECALL_POSTROCESS".equals(str))
            {
              voicecallPostprocess(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false);
              AppMethodBeat.o(65721);
            }
            else if ("OPERATION_VOICECALL_AUDIOPARAM_CHANGED".equals(str))
            {
              i = paramIntent.getIntExtra("PARAM_MODEPOLICY", -1);
              j = paramIntent.getIntExtra("PARAM_STREAMTYPE", -1);
              voiceCallAudioParamChanged(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false, i, j);
              AppMethodBeat.o(65721);
            }
            else if ("OPERATION_STARTRING".equals(str))
            {
              j = paramIntent.getIntExtra("PARAM_RING_DATASOURCE", -1);
              i = paramIntent.getIntExtra("PARAM_RING_RSID", -1);
              localObject1 = (Uri)paramIntent.getParcelableExtra("PARAM_RING_URI");
              paramContext = paramIntent.getStringExtra("PARAM_RING_FILEPATH");
              bool2 = paramIntent.getBooleanExtra("PARAM_RING_LOOP", false);
              localObject2 = paramIntent.getStringExtra("PARAM_RING_USERDATA_STRING");
              int k = paramIntent.getIntExtra("PARAM_RING_LOOPCOUNT", 1);
              bool1 = paramIntent.getBooleanExtra("PARAM_RING_MODE", false);
              startRing(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false, j, i, (Uri)localObject1, paramContext, bool2, k, (String)localObject2, bool1);
              AppMethodBeat.o(65721);
            }
            else if ("OPERATION_STOPRING".equals(str))
            {
              stopRing(str, paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L), false);
              AppMethodBeat.o(65721);
            }
          }
        }
        else if (this._deviceConfigManager != null)
        {
          if (this._bluetoothCheck != null)
            this._bluetoothCheck.a(paramContext, paramIntent, this._deviceConfigManager);
          if ((!bool2) && (this._deviceConfigManager.c("DEVICE_BLUETOOTHHEADSET") == true))
            checkDevicePlug("DEVICE_BLUETOOTHHEADSET", true);
          if ((bool2 == true) && (!this._deviceConfigManager.c("DEVICE_BLUETOOTHHEADSET")))
            checkDevicePlug("DEVICE_BLUETOOTHHEADSET", false);
        }
      }
      else
        AppMethodBeat.o(65721);
    }
  }

  void printDevices()
  {
    int i = 0;
    AppMethodBeat.i(65700);
    AudioDeviceInterface.LogTraceEntry("");
    int j = this._deviceConfigManager.e();
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "   ConnectedDevice:" + this._deviceConfigManager.h());
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "   ConnectingDevice:" + this._deviceConfigManager.g());
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "   prevConnectedDevice:" + this._deviceConfigManager.i());
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "   AHPDevice:" + this._deviceConfigManager.f());
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "   deviceNamber:".concat(String.valueOf(j)));
    for (int k = 0; k < j; k++)
    {
      localObject = this._deviceConfigManager.a(k);
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "      " + k + " devName:" + (String)localObject + " Visible:" + this._deviceConfigManager.c((String)localObject) + " Priority:" + this._deviceConfigManager.d((String)localObject));
    }
    Object localObject = (String[])this._deviceConfigManager.k().toArray(new String[0]);
    k = i;
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "   AvailableNamber:" + localObject.length);
    for (k = i; k < localObject.length; k++)
    {
      String str = localObject[k];
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "      " + k + " devName:" + str + " Visible:" + this._deviceConfigManager.c(str) + " Priority:" + this._deviceConfigManager.d(str));
    }
    AudioDeviceInterface.LogTraceExit();
    AppMethodBeat.o(65700);
  }

  public void release()
  {
    AppMethodBeat.i(65720);
    AudioDeviceInterface.LogTraceEntry("");
    if (this.mTraeAudioManagerLooper != null)
    {
      this.mTraeAudioManagerLooper.a();
      this.mTraeAudioManagerLooper = null;
    }
    AudioDeviceInterface.LogTraceExit();
    AppMethodBeat.o(65720);
  }

  int sendResBroadcast(final Intent paramIntent, final HashMap<String, Object> paramHashMap, final int paramInt)
  {
    AppMethodBeat.i(65747);
    if (this._context == null)
    {
      AppMethodBeat.o(65747);
      paramInt = -1;
    }
    while (true)
    {
      return paramInt;
      final Long localLong = (Long)paramHashMap.get("PARAM_SESSIONID");
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, " sessonID:" + localLong + " " + (String)paramHashMap.get("PARAM_OPERATION"));
      if ((localLong == null) || (localLong.longValue() == -9223372036854775808L))
      {
        InternalNotifyDeviceListUpdate();
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, "sendResBroadcast sid null,don't send res");
        AppMethodBeat.o(65747);
        paramInt = -1;
      }
      else
      {
        localLong = (Long)paramHashMap.get("PARAM_SESSIONID");
        paramHashMap = (String)paramHashMap.get("PARAM_OPERATION");
        new Handler(Looper.getMainLooper()).post(new Runnable()
        {
          public void run()
          {
            AppMethodBeat.i(65697);
            paramIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES");
            paramIntent.putExtra("PARAM_SESSIONID", localLong);
            paramIntent.putExtra("PARAM_OPERATION", paramHashMap);
            paramIntent.putExtra("PARAM_RES_ERRCODE", paramInt);
            if (TraeAudioManager.this._context != null)
              TraeAudioManager.this._context.sendBroadcast(paramIntent);
            AppMethodBeat.o(65697);
          }
        });
        paramInt = 0;
        AppMethodBeat.o(65747);
      }
    }
  }

  void updateDeviceStatus()
  {
    AppMethodBeat.i(65707);
    int i = this._deviceConfigManager.e();
    int j = 0;
    if (j < i)
    {
      String str = this._deviceConfigManager.a(j);
      boolean bool;
      if (str != null)
        if (str.equals("DEVICE_BLUETOOTHHEADSET"))
          if (this._bluetoothCheck == null)
            bool = this._deviceConfigManager.a(str, false);
      while (true)
      {
        if ((bool == true) && (QLog.isColorLevel()))
          QLog.w("TRAE", 2, "pollUpdateDevice dev:" + str + " Visible:" + this._deviceConfigManager.c(str));
        j++;
        break;
        bool = this._deviceConfigManager.a(str, this._bluetoothCheck.b());
        continue;
        if (str.equals("DEVICE_WIREDHEADSET"))
        {
          bool = this._deviceConfigManager.a(str, this._am.isWiredHeadsetOn());
        }
        else
        {
          if (str.equals("DEVICE_SPEAKERPHONE"))
            this._deviceConfigManager.a(str, true);
          bool = false;
        }
      }
    }
    checkAutoDeviceListUpdate();
    AppMethodBeat.o(65707);
  }

  class e
  {
    HashMap<String, TraeAudioManager.e.a> a;
    String b;
    String c;
    String d;
    ReentrantLock e;
    boolean f;
    String g;

    public e()
    {
      AppMethodBeat.i(65625);
      this.a = new HashMap();
      this.b = "DEVICE_NONE";
      this.c = "DEVICE_NONE";
      this.d = "DEVICE_NONE";
      this.e = new ReentrantLock();
      this.f = false;
      this.g = "unknow";
      AppMethodBeat.o(65625);
    }

    public String a(int paramInt)
    {
      AppMethodBeat.i(65636);
      this.e.lock();
      Iterator localIterator = this.a.entrySet().iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        localObject = (Map.Entry)localIterator.next();
        if (i != paramInt);
      }
      for (Object localObject = (TraeAudioManager.e.a)((Map.Entry)localObject).getValue(); ; localObject = null)
      {
        if (localObject != null);
        for (localObject = ((TraeAudioManager.e.a)localObject).a(); ; localObject = "DEVICE_NONE")
        {
          this.e.unlock();
          AppMethodBeat.o(65636);
          return localObject;
          i++;
          break;
        }
      }
    }

    public void a()
    {
      AppMethodBeat.i(65628);
      this.e.lock();
      this.a.clear();
      this.b = "DEVICE_NONE";
      this.c = "DEVICE_NONE";
      this.d = "DEVICE_NONE";
      this.e.unlock();
      AppMethodBeat.o(65628);
    }

    public boolean a(String paramString)
    {
      boolean bool = false;
      AppMethodBeat.i(65626);
      AudioDeviceInterface.LogTraceEntry(" strConfigs:".concat(String.valueOf(paramString)));
      if ((paramString == null) || (paramString.length() <= 0))
        AppMethodBeat.o(65626);
      while (true)
      {
        return bool;
        String str = paramString.replace("\n", "").replace("\r", "");
        if ((str == null) || (str.length() <= 0))
        {
          AppMethodBeat.o(65626);
        }
        else
        {
          paramString = str;
          if (str.indexOf(";") < 0)
            paramString = str + ";";
          paramString = paramString.split(";");
          if ((paramString == null) || (1 > paramString.length))
          {
            AppMethodBeat.o(65626);
          }
          else
          {
            this.e.lock();
            for (int i = 0; i < paramString.length; i++)
              a(paramString[i], i);
            this.e.unlock();
            TraeAudioManager.this.printDevices();
            AppMethodBeat.o(65626);
            bool = true;
          }
        }
      }
    }

    boolean a(String paramString, int paramInt)
    {
      boolean bool = false;
      AppMethodBeat.i(65627);
      AudioDeviceInterface.LogTraceEntry(" devName:" + paramString + " priority:" + paramInt);
      TraeAudioManager.e.a locala = new TraeAudioManager.e.a(this);
      if (locala.a(paramString, paramInt))
        if (this.a.containsKey(paramString))
        {
          if (QLog.isColorLevel())
            QLog.e("TRAE", 2, "err dev exist!");
          AppMethodBeat.o(65627);
        }
      while (true)
      {
        return bool;
        this.a.put(paramString, locala);
        this.f = true;
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, " n" + e() + " 0:" + a(0));
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65627);
        bool = true;
        continue;
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " err dev init!");
        AppMethodBeat.o(65627);
      }
    }

    public boolean a(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(65631);
      this.e.lock();
      Object localObject = (TraeAudioManager.e.a)this.a.get(paramString);
      if ((localObject != null) && (((TraeAudioManager.e.a)localObject).b() != paramBoolean))
      {
        ((TraeAudioManager.e.a)localObject).a(paramBoolean);
        this.f = true;
        if (QLog.isColorLevel())
        {
          localObject = new StringBuilder(" ++setVisible:").append(paramString);
          if (!paramBoolean)
            break label103;
          paramString = " Y";
          QLog.w("TRAE", 2, paramString);
        }
      }
      for (paramBoolean = true; ; paramBoolean = false)
      {
        this.e.unlock();
        AppMethodBeat.o(65631);
        return paramBoolean;
        label103: paramString = " N";
        break;
      }
    }

    public void b(String paramString)
    {
      AppMethodBeat.i(65632);
      if (paramString == null)
      {
        this.g = "unknow";
        AppMethodBeat.o(65632);
      }
      while (true)
      {
        return;
        if (paramString.isEmpty())
        {
          this.g = "unknow";
          AppMethodBeat.o(65632);
        }
        else
        {
          this.g = paramString;
          AppMethodBeat.o(65632);
        }
      }
    }

    public boolean b()
    {
      AppMethodBeat.i(65629);
      this.e.lock();
      boolean bool = this.f;
      this.e.unlock();
      AppMethodBeat.o(65629);
      return bool;
    }

    public void c()
    {
      AppMethodBeat.i(65630);
      this.e.lock();
      this.f = false;
      this.e.unlock();
      AppMethodBeat.o(65630);
    }

    public boolean c(String paramString)
    {
      AppMethodBeat.i(65633);
      this.e.lock();
      paramString = (TraeAudioManager.e.a)this.a.get(paramString);
      if (paramString != null);
      for (boolean bool = paramString.b(); ; bool = false)
      {
        this.e.unlock();
        AppMethodBeat.o(65633);
        return bool;
      }
    }

    public int d(String paramString)
    {
      AppMethodBeat.i(65634);
      this.e.lock();
      paramString = (TraeAudioManager.e.a)this.a.get(paramString);
      if (paramString != null);
      for (int i = paramString.c(); ; i = -1)
      {
        this.e.unlock();
        AppMethodBeat.o(65634);
        return i;
      }
    }

    public String d()
    {
      return this.g;
    }

    public int e()
    {
      AppMethodBeat.i(65635);
      this.e.lock();
      int i = this.a.size();
      this.e.unlock();
      AppMethodBeat.o(65635);
      return i;
    }

    public String e(String paramString)
    {
      AppMethodBeat.i(65637);
      this.e.lock();
      Iterator localIterator = this.a.entrySet().iterator();
      Object localObject1 = null;
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map.Entry)localIterator.next();
        ((Map.Entry)localObject2).getKey();
        ((Map.Entry)localObject2).getValue();
        localObject2 = (TraeAudioManager.e.a)((Map.Entry)localObject2).getValue();
        if ((localObject2 != null) && (((TraeAudioManager.e.a)localObject2).b()) && (!((TraeAudioManager.e.a)localObject2).a().equals(paramString)))
          if (localObject1 == null)
          {
            localObject1 = localObject2;
          }
          else
          {
            if (((TraeAudioManager.e.a)localObject2).c() < localObject1.c())
              break label162;
            localObject1 = localObject2;
          }
      }
      label162: 
      while (true)
      {
        break;
        this.e.unlock();
        if (localObject1 != null)
        {
          paramString = localObject1.a();
          AppMethodBeat.o(65637);
        }
        while (true)
        {
          return paramString;
          paramString = "DEVICE_SPEAKERPHONE";
          AppMethodBeat.o(65637);
        }
      }
    }

    public String f()
    {
      AppMethodBeat.i(65638);
      this.e.lock();
      Iterator localIterator = this.a.entrySet().iterator();
      Object localObject1 = null;
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map.Entry)localIterator.next();
        ((Map.Entry)localObject2).getKey();
        ((Map.Entry)localObject2).getValue();
        localObject2 = (TraeAudioManager.e.a)((Map.Entry)localObject2).getValue();
        if ((localObject2 != null) && (((TraeAudioManager.e.a)localObject2).b()))
          if (localObject1 == null)
          {
            localObject1 = localObject2;
          }
          else
          {
            if (((TraeAudioManager.e.a)localObject2).c() < ((TraeAudioManager.e.a)localObject1).c())
              break label140;
            localObject1 = localObject2;
          }
      }
      label140: 
      while (true)
      {
        break;
        this.e.unlock();
        if (localObject1 != null)
        {
          localObject1 = ((TraeAudioManager.e.a)localObject1).a();
          AppMethodBeat.o(65638);
        }
        while (true)
        {
          return localObject1;
          localObject1 = "DEVICE_SPEAKERPHONE";
          AppMethodBeat.o(65638);
        }
      }
    }

    public boolean f(String paramString)
    {
      AppMethodBeat.i(65642);
      this.e.lock();
      TraeAudioManager.e.a locala = (TraeAudioManager.e.a)this.a.get(paramString);
      if ((locala != null) && (locala.b()))
        this.d = paramString;
      for (boolean bool = true; ; bool = false)
      {
        this.e.unlock();
        AppMethodBeat.o(65642);
        return bool;
      }
    }

    public String g()
    {
      AppMethodBeat.i(65639);
      this.e.lock();
      Object localObject = (TraeAudioManager.e.a)this.a.get(this.d);
      if ((localObject != null) && (((TraeAudioManager.e.a)localObject).b()));
      for (localObject = this.d; ; localObject = null)
      {
        this.e.unlock();
        AppMethodBeat.o(65639);
        return localObject;
      }
    }

    public boolean g(String paramString)
    {
      AppMethodBeat.i(65643);
      this.e.lock();
      TraeAudioManager.e.a locala = (TraeAudioManager.e.a)this.a.get(paramString);
      if ((locala != null) && (locala.b()))
      {
        if ((this.c != null) && (!this.c.equals(paramString)))
          this.b = this.c;
        this.c = paramString;
        this.d = "";
      }
      for (boolean bool = true; ; bool = false)
      {
        this.e.unlock();
        AppMethodBeat.o(65643);
        return bool;
      }
    }

    public String h()
    {
      AppMethodBeat.i(65640);
      this.e.lock();
      String str = m();
      this.e.unlock();
      AppMethodBeat.o(65640);
      return str;
    }

    public String i()
    {
      AppMethodBeat.i(65641);
      this.e.lock();
      String str = n();
      this.e.unlock();
      AppMethodBeat.o(65641);
      return str;
    }

    public HashMap<String, Object> j()
    {
      AppMethodBeat.i(65644);
      HashMap localHashMap = new HashMap();
      this.e.lock();
      localHashMap.put("EXTRA_DATA_AVAILABLEDEVICE_LIST", l());
      localHashMap.put("EXTRA_DATA_CONNECTEDDEVICE", m());
      localHashMap.put("EXTRA_DATA_PREV_CONNECTEDDEVICE", n());
      this.e.unlock();
      AppMethodBeat.o(65644);
      return localHashMap;
    }

    public ArrayList<String> k()
    {
      AppMethodBeat.i(65645);
      new ArrayList();
      this.e.lock();
      ArrayList localArrayList = l();
      this.e.unlock();
      AppMethodBeat.o(65645);
      return localArrayList;
    }

    ArrayList<String> l()
    {
      AppMethodBeat.i(65646);
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        TraeAudioManager.e.a locala = (TraeAudioManager.e.a)((Map.Entry)localIterator.next()).getValue();
        if ((locala != null) && (locala.b()))
          localArrayList.add(locala.a());
      }
      AppMethodBeat.o(65646);
      return localArrayList;
    }

    String m()
    {
      AppMethodBeat.i(65647);
      Object localObject = (TraeAudioManager.e.a)this.a.get(this.c);
      if ((localObject != null) && (((TraeAudioManager.e.a)localObject).b()));
      for (localObject = this.c; ; localObject = "DEVICE_NONE")
      {
        AppMethodBeat.o(65647);
        return localObject;
      }
    }

    String n()
    {
      AppMethodBeat.i(65648);
      Object localObject = (TraeAudioManager.e.a)this.a.get(this.b);
      if ((localObject != null) && (((TraeAudioManager.e.a)localObject).b()));
      for (localObject = this.b; ; localObject = "DEVICE_NONE")
      {
        AppMethodBeat.o(65648);
        return localObject;
      }
    }
  }

  class g extends TraeAudioManager.k
  {
    g()
    {
      super();
    }

    public void a()
    {
      AppMethodBeat.i(65650);
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "connect bluetoothHeadset: do nothing");
      e();
      AppMethodBeat.o(65650);
    }

    public String b()
    {
      return "DEVICE_BLUETOOTHHEADSET";
    }

    @TargetApi(8)
    public void c()
    {
      AppMethodBeat.i(65651);
      if (TraeAudioManager.this._am == null)
        AppMethodBeat.o(65651);
      while (true)
      {
        return;
        d();
        AppMethodBeat.o(65651);
      }
    }

    @TargetApi(8)
    void d()
    {
      AppMethodBeat.i(65652);
      if (Build.VERSION.SDK_INT > 8)
        TraeAudioManager.this._am.stopBluetoothSco();
      TraeAudioManager.this._am.setBluetoothScoOn(false);
      AppMethodBeat.o(65652);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager
 * JD-Core Version:    0.6.2
 */