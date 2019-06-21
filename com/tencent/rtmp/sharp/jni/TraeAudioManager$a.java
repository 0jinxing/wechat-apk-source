package com.tencent.rtmp.sharp.jni;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(11)
class TraeAudioManager$a extends TraeAudioManager.d
  implements BluetoothProfile.ServiceListener
{
  Context a;
  TraeAudioManager.e b;
  BluetoothAdapter c;
  BluetoothProfile d;
  private final ReentrantLock f;

  TraeAudioManager$a(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
    AppMethodBeat.i(65611);
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.f = new ReentrantLock();
    AppMethodBeat.o(65611);
  }

  public void a()
  {
    AppMethodBeat.i(65613);
    AudioDeviceInterface.LogTraceEntry("_profile:" + this.d);
    this.f.lock();
    try
    {
      if (this.c != null)
      {
        if (this.d != null)
          this.c.closeProfileProxy(1, this.d);
        this.d = null;
      }
      this.f.unlock();
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65613);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (QLog.isColorLevel())
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(" closeProfileProxy:e:");
          QLog.w("TRAE", 2, localException.getMessage());
        }
        this.f.unlock();
      }
    }
    finally
    {
      this.f.unlock();
      AppMethodBeat.o(65613);
    }
  }

  void a(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(65618);
    int i;
    int j;
    if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(paramIntent.getAction()))
    {
      i = paramIntent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
      j = paramIntent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE", -1);
      paramIntent = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "BT ACTION_CONNECTION_STATE_CHANGED|   EXTRA_CONNECTION_STATE " + c(i));
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "    EXTRA_PREVIOUS_CONNECTION_STATE " + c(j));
      Object localObject;
      if (QLog.isColorLevel())
      {
        localObject = new StringBuilder("    EXTRA_DEVICE ").append(paramIntent).append(" ");
        if (paramIntent != null)
        {
          paramContext = paramIntent.getName();
          QLog.w("TRAE", 2, paramContext);
        }
      }
      else
      {
        if (i != 2)
          break label250;
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "   dev:" + paramIntent.getName() + " connected,start sco...");
        this.b.a("DEVICE_BLUETOOTHHEADSET", true);
        localObject = this.b;
        if (paramIntent == null)
          break label244;
        paramContext = paramIntent.getName();
        label226: ((TraeAudioManager.e)localObject).b(paramContext);
        AppMethodBeat.o(65618);
      }
    }
    while (true)
    {
      return;
      paramContext = " ";
      break;
      label244: paramContext = "unkown";
      break label226;
      label250: if (i == 0)
      {
        this.b.a("DEVICE_BLUETOOTHHEADSET", false);
        AppMethodBeat.o(65618);
        continue;
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(paramIntent.getAction()))
        {
          i = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
          j = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
          paramContext = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "BT ACTION_SCO_AUDIO_STATE_UPDATED|   EXTRA_CONNECTION_STATE  dev:".concat(String.valueOf(paramContext)));
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "   EXTRA_SCO_AUDIO_STATE " + b(i));
          if (QLog.isColorLevel())
          {
            QLog.w("TRAE", 2, "   EXTRA_SCO_AUDIO_PREVIOUS_STATE " + b(j));
            AppMethodBeat.o(65618);
          }
        }
        else if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(paramIntent.getAction()))
        {
          paramContext = BluetoothAdapter.getDefaultAdapter();
        }
      }
      else
      {
        switch (paramContext.getProfileConnectionState(2))
        {
        case 1:
        default:
          QLog.w("TRAE", 2, "BluetoothA2dp" + paramContext.getProfileConnectionState(2));
          AppMethodBeat.o(65618);
          break;
        case 2:
          QLog.w("TRAE", 2, "BluetoothA2dp STATE_CONNECTED");
          this.e.IsBluetoothA2dpExisted = true;
          AppMethodBeat.o(65618);
          break;
        case 0:
          QLog.w("TRAE", 2, "BluetoothA2dp STATE_DISCONNECTED");
          this.e.IsBluetoothA2dpExisted = false;
          AppMethodBeat.o(65618);
        }
      }
    }
  }

  void a(IntentFilter paramIntentFilter)
  {
    AppMethodBeat.i(65617);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, " " + c() + " _addAction");
    paramIntentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
    paramIntentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
    paramIntentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
    AppMethodBeat.o(65617);
  }

  @TargetApi(11)
  public boolean a(Context paramContext, TraeAudioManager.e parame)
  {
    boolean bool = false;
    AppMethodBeat.i(65612);
    AudioDeviceInterface.LogTraceEntry("");
    if ((paramContext == null) || (parame == null))
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, " err ctx==null||_devCfg==null");
      AppMethodBeat.o(65612);
    }
    while (true)
    {
      return bool;
      this.a = paramContext;
      this.b = parame;
      this.c = BluetoothAdapter.getDefaultAdapter();
      if (this.c == null)
      {
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " err getDefaultAdapter fail!");
        AppMethodBeat.o(65612);
        continue;
      }
      this.f.lock();
      try
      {
        if ((this.c.isEnabled()) && (this.d == null) && (!this.c.getProfileProxy(this.a, this, 1)))
        {
          if (QLog.isColorLevel())
            QLog.e("TRAE", 2, "BluetoohHeadsetCheck: getProfileProxy HEADSET fail!");
          this.f.unlock();
          AppMethodBeat.o(65612);
          continue;
        }
        this.f.unlock();
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65612);
        bool = true;
      }
      finally
      {
        this.f.unlock();
        AppMethodBeat.o(65612);
      }
    }
  }

  public boolean b()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(65614);
    this.f.lock();
    boolean bool3 = bool1;
    try
    {
      List localList;
      if (this.d != null)
      {
        localList = this.d.getConnectedDevices();
        if (localList == null)
        {
          this.f.unlock();
          AppMethodBeat.o(65614);
          bool3 = bool2;
        }
      }
      while (true)
      {
        return bool3;
        int i = localList.size();
        bool3 = bool1;
        if (i > 0)
          bool3 = true;
        this.f.unlock();
        AppMethodBeat.o(65614);
      }
    }
    finally
    {
      this.f.unlock();
      AppMethodBeat.o(65614);
    }
  }

  public String c()
  {
    return "BluetoohHeadsetCheck";
  }

  @TargetApi(11)
  public void onServiceConnected(int paramInt, BluetoothProfile paramBluetoothProfile)
  {
    AppMethodBeat.i(65615);
    AudioDeviceInterface.LogTraceEntry("_profile:" + this.d + " profile:" + paramInt + " proxy:" + paramBluetoothProfile);
    if (paramInt == 1)
      this.f.lock();
    while (true)
    {
      try
      {
        Object localObject;
        if ((this.d != null) && (this.d != paramBluetoothProfile))
        {
          if (QLog.isColorLevel())
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("BluetoohHeadsetCheck: HEADSET Connected proxy:");
            QLog.w("TRAE", 2, paramBluetoothProfile + " _profile:" + this.d);
          }
          this.c.closeProfileProxy(1, this.d);
          this.d = null;
        }
        this.d = paramBluetoothProfile;
        if (this.d == null)
          break label477;
        paramBluetoothProfile = this.d.getConnectedDevices();
        if ((paramBluetoothProfile != null) && (this.d != null))
        {
          if (QLog.isColorLevel())
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("TRAEBluetoohProxy: HEADSET Connected devs:");
            QLog.w("TRAE", 2, paramBluetoothProfile.size() + " _profile:" + this.d);
          }
          paramInt = 0;
          if (paramInt < paramBluetoothProfile.size())
          {
            localObject = (BluetoothDevice)paramBluetoothProfile.get(paramInt);
            try
            {
              if (this.d != null)
              {
                i = this.d.getConnectionState((BluetoothDevice)localObject);
                if (i == 2)
                  this.b.b(((BluetoothDevice)localObject).getName());
                if (QLog.isColorLevel())
                {
                  StringBuilder localStringBuilder = new java/lang/StringBuilder;
                  localStringBuilder.<init>("   ");
                  QLog.w("TRAE", 2, paramInt + " " + ((BluetoothDevice)localObject).getName() + " ConnectionState:" + i);
                }
                paramInt++;
              }
            }
            catch (Exception localException)
            {
              int i = 0;
              continue;
            }
          }
        }
        this.f.unlock();
        if (this.b != null)
        {
          if (this.e._deviceConfigManager == null)
            break label472;
          paramBluetoothProfile = this.e._deviceConfigManager.d();
          if (TextUtils.isEmpty(paramBluetoothProfile))
            this.b.a("DEVICE_BLUETOOTHHEADSET", false);
        }
        else
        {
          AudioDeviceInterface.LogTraceExit();
          AppMethodBeat.o(65615);
          return;
        }
      }
      finally
      {
        this.f.unlock();
        AppMethodBeat.o(65615);
      }
      if (b())
      {
        this.b.a("DEVICE_BLUETOOTHHEADSET", true);
        this.e.checkDevicePlug("DEVICE_BLUETOOTHHEADSET", true);
      }
      else
      {
        this.b.a("DEVICE_BLUETOOTHHEADSET", false);
        continue;
        label472: paramBluetoothProfile = null;
        continue;
        label477: paramBluetoothProfile = null;
      }
    }
  }

  @TargetApi(11)
  public void onServiceDisconnected(int paramInt)
  {
    AppMethodBeat.i(65616);
    AudioDeviceInterface.LogTraceEntry("_profile:" + this.d + " profile:" + paramInt);
    if (paramInt == 1)
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "TRAEBluetoohProxy: HEADSET Disconnected");
      if (b())
        this.e.checkDevicePlug("DEVICE_BLUETOOTHHEADSET", false);
      this.f.lock();
    }
    try
    {
      if (this.d != null)
      {
        this.c.closeProfileProxy(1, this.d);
        this.d = null;
      }
      this.f.unlock();
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65616);
      return;
    }
    finally
    {
      this.f.unlock();
      AppMethodBeat.o(65616);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.a
 * JD-Core Version:    0.6.2
 */