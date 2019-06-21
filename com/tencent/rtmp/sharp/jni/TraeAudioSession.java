package com.tencent.rtmp.sharp.jni;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Process;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TraeAudioSession extends BroadcastReceiver
{
  static int s_nSessionIdAllocator = 0;
  final String TRAE_ACTION_PHONE_STATE;
  private boolean _canSwtich2Earphone;
  private String _connectedDev;
  private TraeAudioSession.a mCallback;
  private Context mContext;
  private boolean mIsHostside;
  private long mSessionId;

  public TraeAudioSession(Context paramContext, TraeAudioSession.a parama)
  {
    AppMethodBeat.i(65801);
    this.mIsHostside = false;
    this.mSessionId = -9223372036854775808L;
    this._connectedDev = "DEVICE_NONE";
    this._canSwtich2Earphone = true;
    this.TRAE_ACTION_PHONE_STATE = "android.intent.action.PHONE_STATE";
    TXCLog.w("TRAE", "TraeAudioSession create");
    if (Process.myPid() == TraeAudioManager._gHostProcessId)
      bool = true;
    this.mIsHostside = bool;
    this.mSessionId = requestSessionId();
    this.mCallback = parama;
    this.mContext = paramContext;
    StringBuilder localStringBuilder;
    Object localObject;
    if ((paramContext == null) && (QLog.isColorLevel()))
    {
      localStringBuilder = new StringBuilder("AudioSession | Invalid parameters: ctx = ");
      if (paramContext != null)
        break label188;
      localObject = "null";
    }
    while (true)
    {
      localObject = localStringBuilder.append((String)localObject).append("; cb = ");
      if (parama == null)
      {
        parama = "null";
        QLog.w("TRAE", 2, parama);
        parama = new IntentFilter();
        parama.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES");
        parama.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
        if (paramContext == null);
      }
      try
      {
        paramContext.registerReceiver(this, parama);
        label176: registerAudioSession(true);
        AppMethodBeat.o(65801);
        return;
        label188: localObject = "{object}";
        continue;
        parama = "{object}";
      }
      catch (Exception paramContext)
      {
        break label176;
      }
    }
  }

  public static void ExConnectDevice(Context paramContext, String paramString)
  {
    AppMethodBeat.i(65800);
    if ((paramContext == null) || (paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(65800);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
      localIntent.putExtra("PARAM_SESSIONID", -9223372036854775808L);
      localIntent.putExtra("PARAM_OPERATION", "OPERATION_CONNECTDEVICE");
      localIntent.putExtra("CONNECTDEVICE_DEVICENAME", paramString);
      paramContext.sendBroadcast(localIntent);
      AppMethodBeat.o(65800);
    }
  }

  private int registerAudioSession(boolean paramBoolean)
  {
    AppMethodBeat.i(65803);
    int i;
    if (this.mContext == null)
    {
      i = -1;
      AppMethodBeat.o(65803);
    }
    while (true)
    {
      return i;
      if (this.mIsHostside)
      {
        i = TraeAudioManager.registerAudioSession(paramBoolean, this.mSessionId, this.mContext);
        AppMethodBeat.o(65803);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_REGISTERAUDIOSESSION");
        localIntent.putExtra("REGISTERAUDIOSESSION_ISREGISTER", paramBoolean);
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65803);
      }
    }
  }

  public static long requestSessionId()
  {
    AppMethodBeat.i(65799);
    long l1 = Process.myPid();
    int i = s_nSessionIdAllocator + 1;
    s_nSessionIdAllocator = i;
    long l2 = i;
    AppMethodBeat.o(65799);
    return (l1 << 32) + l2;
  }

  public int EarAction(int paramInt)
  {
    AppMethodBeat.i(65810);
    if (this.mIsHostside)
    {
      paramInt = TraeAudioManager.earAction("OPERATION_EARACTION", this.mSessionId, this.mIsHostside, paramInt);
      AppMethodBeat.o(65810);
    }
    while (true)
    {
      return paramInt;
      if ((this.mContext == null) || ((paramInt != 0) && (paramInt != 1)))
      {
        paramInt = -1;
        AppMethodBeat.o(65810);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_EARACTION");
        localIntent.putExtra("EXTRA_EARACTION", paramInt);
        this.mContext.sendBroadcast(localIntent);
        paramInt = 0;
        AppMethodBeat.o(65810);
      }
    }
  }

  public int connectDevice(String paramString)
  {
    AppMethodBeat.i(65808);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.connectDevice("OPERATION_CONNECTDEVICE", this.mSessionId, this.mIsHostside, paramString);
      AppMethodBeat.o(65808);
    }
    while (true)
    {
      return i;
      if ((this.mContext == null) || (paramString == null) || (paramString.length() <= 0))
      {
        i = -1;
        AppMethodBeat.o(65808);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_CONNECTDEVICE");
        localIntent.putExtra("CONNECTDEVICE_DEVICENAME", paramString);
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65808);
      }
    }
  }

  public int connectHighestPriorityDevice()
  {
    AppMethodBeat.i(65809);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.connectHighestPriorityDevice("OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65809);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65809);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65809);
      }
    }
  }

  public int getConnectedDevice()
  {
    AppMethodBeat.i(65812);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.getConnectedDevice("OPERATION_GETCONNECTEDDEVICE", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65812);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65812);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_GETCONNECTEDDEVICE");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65812);
      }
    }
  }

  public int getConnectingDevice()
  {
    AppMethodBeat.i(65813);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.getConnectingDevice("OPERATION_GETCONNECTINGDEVICE", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65813);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65813);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_GETCONNECTINGDEVICE");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65813);
      }
    }
  }

  public int getDeviceList()
  {
    AppMethodBeat.i(65806);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.getDeviceList("OPERATION_GETDEVICELIST", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65806);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65806);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_GETDEVICELIST");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65806);
      }
    }
  }

  public int getStreamType()
  {
    AppMethodBeat.i(65807);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.getStreamType("OPERATION_GETSTREAMTYPE", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65807);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65807);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_GETSTREAMTYPE");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65807);
      }
    }
  }

  public int isDeviceChangabled()
  {
    AppMethodBeat.i(65811);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.isDeviceChangabled("OPERATION_ISDEVICECHANGABLED", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65811);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65811);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_ISDEVICECHANGABLED");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65811);
      }
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = false;
    AppMethodBeat.i(65823);
    if (paramIntent == null)
      AppMethodBeat.o(65823);
    while (true)
    {
      return;
      long l1;
      int i;
      Object localObject1;
      while (true)
      {
        try
        {
          l1 = paramIntent.getLongExtra("PARAM_SESSIONID", -9223372036854775808L);
          paramContext = paramIntent.getStringExtra("PARAM_OPERATION");
          i = paramIntent.getIntExtra("PARAM_RES_ERRCODE", 0);
          if (!"com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY".equals(paramIntent.getAction()))
            break label820;
          if (!"NOTIFY_SERVICE_STATE".equals(paramContext))
            break label238;
          bool2 = paramIntent.getBooleanExtra("NOTIFY_SERVICE_STATE_DATE", false);
          if (QLog.isColorLevel())
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("AudioSession|[onServiceStateUpdate]");
            if (!bool2)
              break label231;
            paramContext = "on";
            QLog.w("TRAE", 2, paramContext);
          }
          if (this.mCallback != null)
            this.mCallback.a(bool2);
          AppMethodBeat.o(65823);
        }
        catch (Exception paramContext)
        {
          if (QLog.isColorLevel())
            QLog.e("TRAE", 2, "AudioSession| nSessinId = " + this.mSessionId + " onReceive::intent:" + paramIntent.toString() + " intent.getAction():" + paramIntent.getAction() + " Exception:" + paramContext.getMessage());
          AppMethodBeat.o(65823);
        }
        break;
        label231: paramContext = "off";
      }
      label238: Object localObject2;
      String str1;
      String str2;
      int j;
      Object localObject3;
      if ("NOTIFY_DEVICELISTUPDATE".equals(paramContext))
      {
        localObject2 = paramIntent.getStringArrayExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST");
        localObject1 = paramIntent.getStringExtra("EXTRA_DATA_CONNECTEDDEVICE");
        str1 = paramIntent.getStringExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE");
        str2 = paramIntent.getStringExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME");
        paramContext = "\n";
        for (j = 0; j < localObject2.length; j++)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          paramContext = paramContext + "AudioSession|    " + j + " " + localObject2[j] + "\n";
          if ((localObject2[j].equals("DEVICE_WIREDHEADSET")) || (localObject2[j].equals("DEVICE_BLUETOOTHHEADSET")))
            bool2 = false;
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = paramContext + "\n";
        if (QLog.isColorLevel())
        {
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>("AudioSession|[onDeviceListUpdate]  connected:");
          QLog.w("TRAE", 2, (String)localObject1 + " prevConnected:" + str1 + " bt:" + str2 + " Num:" + localObject2.length + (String)localObject3);
        }
        this._canSwtich2Earphone = bool2;
        this._connectedDev = ((String)localObject1);
        if (this.mCallback != null)
          this.mCallback.a((String[])localObject2, (String)localObject1, str1, str2);
        AppMethodBeat.o(65823);
      }
      else if ("NOTIFY_DEVICECHANGABLE_UPDATE".equals(paramContext))
      {
        bool2 = paramIntent.getBooleanExtra("NOTIFY_DEVICECHANGABLE_UPDATE_DATE", true);
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "AudioSession|[onDeviceChangabledUpdate]".concat(String.valueOf(bool2)));
        if (this.mCallback != null)
          this.mCallback.b(bool2);
        AppMethodBeat.o(65823);
      }
      else if ("NOTIFY_STREAMTYPE_UPDATE".equals(paramContext))
      {
        j = paramIntent.getIntExtra("EXTRA_DATA_STREAMTYPE", -1);
        if (QLog.isColorLevel())
        {
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>("AudioSession|[onStreamTypeUpdate] err:");
          QLog.w("TRAE", 2, i + " st:" + j);
        }
        if (this.mCallback != null)
          this.mCallback.a(j);
        AppMethodBeat.o(65823);
      }
      else if ("NOTIFY_ROUTESWITCHSTART".equals(paramContext))
      {
        localObject1 = paramIntent.getStringExtra("EXTRA_DATA_ROUTESWITCHSTART_FROM");
        paramContext = paramIntent.getStringExtra("EXTRA_DATA_ROUTESWITCHSTART_TO");
        if ((this.mCallback != null) && (localObject1 != null) && (paramContext != null))
          this.mCallback.a((String)localObject1, paramContext);
        AppMethodBeat.o(65823);
      }
      else if ("NOTIFY_ROUTESWITCHEND".equals(paramContext))
      {
        paramContext = paramIntent.getStringExtra("EXTRA_DATA_ROUTESWITCHEND_DEV");
        long l2 = paramIntent.getLongExtra("EXTRA_DATA_ROUTESWITCHEND_TIME", -1L);
        if ((this.mCallback != null) && (paramContext != null) && (l2 != -1L))
          this.mCallback.a(paramContext, l2);
        AppMethodBeat.o(65823);
        continue;
        label820: if ("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES".equals(paramIntent.getAction()))
        {
          l2 = this.mSessionId;
          if (l2 != l1)
          {
            AppMethodBeat.o(65823);
            continue;
          }
          if ("OPERATION_GETDEVICELIST".equals(paramContext))
          {
            localObject1 = paramIntent.getStringArrayExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST");
            str1 = paramIntent.getStringExtra("EXTRA_DATA_CONNECTEDDEVICE");
            str2 = paramIntent.getStringExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE");
            localObject2 = paramIntent.getStringExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME");
            paramContext = "\n";
            j = 0;
            bool2 = bool1;
            while (j < localObject1.length)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              paramContext = paramContext + "AudioSession|    " + j + " " + localObject1[j] + "\n";
              if ((localObject1[j].equals("DEVICE_WIREDHEADSET")) || (localObject1[j].equals("DEVICE_BLUETOOTHHEADSET")))
                bool2 = false;
              j++;
            }
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = paramContext + "\n";
            this._canSwtich2Earphone = bool2;
            this._connectedDev = str1;
            if (QLog.isColorLevel())
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>("AudioSession|[onGetDeviceListRes] err:");
              QLog.w("TRAE", 2, i + " connected:" + str1 + " prevConnected:" + str2 + " bt:" + (String)localObject2 + " Num:" + localObject1.length + (String)localObject3);
            }
            if (this.mCallback != null)
              this.mCallback.a(i, (String[])localObject1, str1, str2, (String)localObject2);
            AppMethodBeat.o(65823);
            continue;
          }
          if ("OPERATION_CONNECTDEVICE".equals(paramContext))
          {
            paramContext = paramIntent.getStringExtra("CONNECTDEVICE_RESULT_DEVICENAME");
            if (QLog.isColorLevel())
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("AudioSession|[onConnectDeviceRes] err:");
              QLog.w("TRAE", 2, i + " dev:" + paramContext);
            }
            if (this.mCallback != null)
            {
              localObject1 = this.mCallback;
              bool2 = bool3;
              if (i == 0)
                bool2 = true;
              ((TraeAudioSession.a)localObject1).a(i, paramContext, bool2);
            }
            AppMethodBeat.o(65823);
            continue;
          }
          if ("OPERATION_EARACTION".equals(paramContext))
          {
            j = paramIntent.getIntExtra("EXTRA_EARACTION", -1);
            if (QLog.isColorLevel())
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>("AudioSession|[onConnectDeviceRes] err:");
              QLog.w("TRAE", 2, i + " earAction:" + j);
            }
            AppMethodBeat.o(65823);
            continue;
          }
          if ("OPERATION_ISDEVICECHANGABLED".equals(paramContext))
          {
            bool2 = paramIntent.getBooleanExtra("ISDEVICECHANGABLED_REULT_ISCHANGABLED", false);
            if (QLog.isColorLevel())
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>("AudioSession|[onIsDeviceChangabledRes] err:");
              localObject1 = paramContext.append(i).append(" Changabled:");
              if (!bool2)
                break label1438;
            }
            for (paramContext = "Y"; ; paramContext = "N")
            {
              QLog.w("TRAE", 2, paramContext);
              if (this.mCallback != null)
                this.mCallback.a(i, bool2);
              AppMethodBeat.o(65823);
              break;
            }
          }
          if ("OPERATION_GETCONNECTEDDEVICE".equals(paramContext))
          {
            paramContext = paramIntent.getStringExtra("GETCONNECTEDDEVICE_REULT_LIST");
            if (QLog.isColorLevel())
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("AudioSession|[onGetConnectedDeviceRes] err:");
              QLog.w("TRAE", 2, i + " dev:" + paramContext);
            }
            if (this.mCallback != null)
              this.mCallback.a(i, paramContext);
            AppMethodBeat.o(65823);
            continue;
          }
          if ("OPERATION_GETCONNECTINGDEVICE".equals(paramContext))
          {
            localObject1 = paramIntent.getStringExtra("GETCONNECTINGDEVICE_REULT_LIST");
            if (QLog.isColorLevel())
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>("AudioSession|[onGetConnectingDeviceRes] err:");
              QLog.w("TRAE", 2, i + " dev:" + (String)localObject1);
            }
            if (this.mCallback != null)
              this.mCallback.b(i, (String)localObject1);
            AppMethodBeat.o(65823);
            continue;
          }
          if ("OPERATION_GETSTREAMTYPE".equals(paramContext))
          {
            j = paramIntent.getIntExtra("EXTRA_DATA_STREAMTYPE", -1);
            if (QLog.isColorLevel())
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>("AudioSession|[onGetStreamTypeRes] err:");
              QLog.w("TRAE", 2, i + " st:" + j);
            }
            if (this.mCallback != null)
              this.mCallback.a(i, j);
            AppMethodBeat.o(65823);
            continue;
          }
          if ("NOTIFY_RING_COMPLETION".equals(paramContext))
          {
            localObject1 = paramIntent.getStringExtra("PARAM_RING_USERDATA_STRING");
            if (QLog.isColorLevel())
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>("AudioSession|[onRingCompletion] err:");
              QLog.w("TRAE", 2, i + " userData:" + (String)localObject1);
            }
            if (this.mCallback != null)
              this.mCallback.c(i, (String)localObject1);
            AppMethodBeat.o(65823);
            continue;
          }
          if ("OPERATION_VOICECALL_PREPROCESS".equals(paramContext))
          {
            if (QLog.isColorLevel())
              QLog.w("TRAE", 2, "AudioSession|[onVoicecallPreprocess] err:".concat(String.valueOf(i)));
            if (this.mCallback != null)
              this.mCallback.b(i);
          }
        }
      }
      else
      {
        label1438: AppMethodBeat.o(65823);
      }
    }
  }

  public int recoverAudioFocus()
  {
    AppMethodBeat.i(65822);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.recoverAudioFocus("OPERATION_RECOVER_AUDIO_FOCUS", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65822);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65822);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_RECOVER_AUDIO_FOCUS");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65822);
      }
    }
  }

  public void release()
  {
    AppMethodBeat.i(65802);
    if (this.mContext != null);
    try
    {
      this.mContext.unregisterReceiver(this);
      label21: registerAudioSession(false);
      this.mContext = null;
      this.mCallback = null;
      AppMethodBeat.o(65802);
      return;
    }
    catch (Exception localException)
    {
      break label21;
    }
  }

  public int requestReleaseAudioFocus()
  {
    AppMethodBeat.i(65821);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.requestReleaseAudioFocus("OPERATION_REQUEST_RELEASE_AUDIO_FOCUS", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65821);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65821);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_REQUEST_RELEASE_AUDIO_FOCUS");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65821);
      }
    }
  }

  public void setCallback(TraeAudioSession.a parama)
  {
    this.mCallback = parama;
  }

  public int startRing(int paramInt1, int paramInt2, Uri paramUri, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(65817);
    if (this.mIsHostside)
    {
      paramInt1 = TraeAudioManager.startRing("OPERATION_STARTRING", this.mSessionId, this.mIsHostside, paramInt1, paramInt2, paramUri, paramString, paramBoolean, 1, "normal-ring", false);
      AppMethodBeat.o(65817);
    }
    while (true)
    {
      return paramInt1;
      if (this.mContext == null)
      {
        paramInt1 = -1;
        AppMethodBeat.o(65817);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_RING_DATASOURCE", paramInt1);
        localIntent.putExtra("PARAM_RING_RSID", paramInt2);
        localIntent.putExtra("PARAM_RING_URI", paramUri);
        localIntent.putExtra("PARAM_RING_FILEPATH", paramString);
        localIntent.putExtra("PARAM_RING_LOOP", paramBoolean);
        localIntent.putExtra("PARAM_RING_MODE", false);
        localIntent.putExtra("PARAM_RING_USERDATA_STRING", "normal-ring");
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_STARTRING");
        this.mContext.sendBroadcast(localIntent);
        paramInt1 = 0;
        AppMethodBeat.o(65817);
      }
    }
  }

  public int startRing(int paramInt1, int paramInt2, Uri paramUri, String paramString1, boolean paramBoolean, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(65818);
    if (this.mIsHostside)
    {
      paramInt1 = TraeAudioManager.startRing("OPERATION_STARTRING", this.mSessionId, this.mIsHostside, paramInt1, paramInt2, paramUri, paramString1, paramBoolean, paramInt3, paramString2, false);
      AppMethodBeat.o(65818);
    }
    while (true)
    {
      return paramInt1;
      if (this.mContext == null)
      {
        paramInt1 = -1;
        AppMethodBeat.o(65818);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_RING_DATASOURCE", paramInt1);
        localIntent.putExtra("PARAM_RING_RSID", paramInt2);
        localIntent.putExtra("PARAM_RING_URI", paramUri);
        localIntent.putExtra("PARAM_RING_FILEPATH", paramString1);
        localIntent.putExtra("PARAM_RING_LOOP", paramBoolean);
        localIntent.putExtra("PARAM_RING_LOOPCOUNT", paramInt3);
        localIntent.putExtra("PARAM_RING_MODE", false);
        localIntent.putExtra("PARAM_RING_USERDATA_STRING", paramString2);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_STARTRING");
        this.mContext.sendBroadcast(localIntent);
        paramInt1 = 0;
        AppMethodBeat.o(65818);
      }
    }
  }

  public int startRing(int paramInt1, int paramInt2, Uri paramUri, String paramString1, boolean paramBoolean1, int paramInt3, String paramString2, boolean paramBoolean2)
  {
    AppMethodBeat.i(65819);
    if (this.mIsHostside)
    {
      paramInt1 = TraeAudioManager.startRing("OPERATION_STARTRING", this.mSessionId, this.mIsHostside, paramInt1, paramInt2, paramUri, paramString1, paramBoolean1, paramInt3, paramString2, paramBoolean2);
      AppMethodBeat.o(65819);
    }
    while (true)
    {
      return paramInt1;
      if (this.mContext == null)
      {
        paramInt1 = -1;
        AppMethodBeat.o(65819);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_RING_DATASOURCE", paramInt1);
        localIntent.putExtra("PARAM_RING_RSID", paramInt2);
        localIntent.putExtra("PARAM_RING_URI", paramUri);
        localIntent.putExtra("PARAM_RING_FILEPATH", paramString1);
        localIntent.putExtra("PARAM_RING_LOOP", paramBoolean1);
        localIntent.putExtra("PARAM_RING_LOOPCOUNT", paramInt3);
        localIntent.putExtra("PARAM_RING_MODE", paramBoolean2);
        localIntent.putExtra("PARAM_RING_USERDATA_STRING", paramString2);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_STARTRING");
        this.mContext.sendBroadcast(localIntent);
        paramInt1 = 0;
        AppMethodBeat.o(65819);
      }
    }
  }

  public int startService(String paramString)
  {
    AppMethodBeat.i(65804);
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.length() > 0);
    }
    else
    {
      str = "internal_disable_dev_switch";
    }
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.startService("OPERATION_STARTSERVICE", this.mSessionId, this.mIsHostside, str);
      AppMethodBeat.o(65804);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65804);
      }
      else
      {
        paramString = new Intent();
        paramString.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        paramString.putExtra("PARAM_SESSIONID", this.mSessionId);
        paramString.putExtra("PARAM_OPERATION", "OPERATION_STARTSERVICE");
        paramString.putExtra("EXTRA_DATA_DEVICECONFIG", str);
        this.mContext.sendBroadcast(paramString);
        i = 0;
        AppMethodBeat.o(65804);
      }
    }
  }

  public int stopRing()
  {
    AppMethodBeat.i(65820);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.stopRing("OPERATION_STOPRING", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65820);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65820);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_STOPRING");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65820);
      }
    }
  }

  public int stopService()
  {
    AppMethodBeat.i(65805);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.stopService("OPERATION_STOPSERVICE", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65805);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65805);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_STOPSERVICE");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65805);
      }
    }
  }

  public int voiceCallAudioParamChanged(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65816);
    if (this.mIsHostside)
    {
      paramInt1 = TraeAudioManager.voiceCallAudioParamChanged("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST", this.mSessionId, this.mIsHostside, paramInt1, paramInt2);
      AppMethodBeat.o(65816);
    }
    while (true)
    {
      return paramInt1;
      if (this.mContext == null)
      {
        paramInt1 = -1;
        AppMethodBeat.o(65816);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_MODEPOLICY", paramInt1);
        localIntent.putExtra("PARAM_STREAMTYPE", paramInt2);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_VOICECALL_AUDIOPARAM_CHANGED");
        this.mContext.sendBroadcast(localIntent);
        paramInt1 = 0;
        AppMethodBeat.o(65816);
      }
    }
  }

  public int voiceCallPostprocess()
  {
    AppMethodBeat.i(65815);
    int i;
    if (this.mIsHostside)
    {
      i = TraeAudioManager.voicecallPostprocess("OPERATION_VOICECALL_POSTROCESS", this.mSessionId, this.mIsHostside);
      AppMethodBeat.o(65815);
    }
    while (true)
    {
      return i;
      if (this.mContext == null)
      {
        i = -1;
        AppMethodBeat.o(65815);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_VOICECALL_POSTROCESS");
        this.mContext.sendBroadcast(localIntent);
        i = 0;
        AppMethodBeat.o(65815);
      }
    }
  }

  public int voiceCallPreprocess(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65814);
    if (this.mIsHostside)
    {
      paramInt1 = TraeAudioManager.voicecallPreprocess("OPERATION_VOICECALL_PREPROCESS", this.mSessionId, this.mIsHostside, paramInt1, paramInt2);
      AppMethodBeat.o(65814);
    }
    while (true)
    {
      return paramInt1;
      if (this.mContext == null)
      {
        paramInt1 = -1;
        AppMethodBeat.o(65814);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
        localIntent.putExtra("PARAM_MODEPOLICY", paramInt1);
        localIntent.putExtra("PARAM_STREAMTYPE", paramInt2);
        localIntent.putExtra("PARAM_OPERATION", "OPERATION_VOICECALL_PREPROCESS");
        this.mContext.sendBroadcast(localIntent);
        paramInt1 = 0;
        AppMethodBeat.o(65814);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioSession
 * JD-Core Version:    0.6.2
 */