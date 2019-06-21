package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TraeAudioManager$c extends TraeAudioManager.d
{
  Class<?> a = null;
  Class<?> b = null;
  Object c = null;
  Method d = null;
  Context e = null;
  TraeAudioManager.e f = null;

  TraeAudioManager$c(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
  }

  public void a()
  {
    AppMethodBeat.i(65665);
    AudioDeviceInterface.LogTraceEntry("");
    if (this.c == null)
      AppMethodBeat.o(65665);
    while (true)
    {
      return;
      Object localObject;
      try
      {
        Method localMethod = this.a.getDeclaredMethod("close", new Class[0]);
        if (localMethod == null)
          AppMethodBeat.o(65665);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        while (true)
        {
          if (QLog.isColorLevel())
            QLog.e("TRAE", 2, "BTLooperThread _uninitHeadsetfor2x method close NoSuchMethodException");
          localObject = null;
        }
      }
      try
      {
        localObject.invoke(this.c, new Object[0]);
        label82: this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65665);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        break label82;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        break label82;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        break label82;
      }
    }
  }

  void a(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(65668);
    int i;
    int j;
    int k;
    if ("android.bluetooth.headset.action.AUDIO_STATE_CHANGED".equals(paramIntent.getAction()))
    {
      i = paramIntent.getIntExtra("android.bluetooth.headset.extra.STATE", -2);
      j = paramIntent.getIntExtra("android.bluetooth.headset.extra.PREVIOUS_STATE", -2);
      k = paramIntent.getIntExtra("android.bluetooth.headset.extra.AUDIO_STATE", -2);
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "++ AUDIO_STATE_CHANGED|  STATE ".concat(String.valueOf(i)));
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "       PREVIOUS_STATE ".concat(String.valueOf(j)));
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "       AUDIO_STATE ".concat(String.valueOf(k)));
      if (k == 2)
      {
        this.f.a("DEVICE_BLUETOOTHHEADSET", true);
        AppMethodBeat.o(65668);
      }
    }
    while (true)
    {
      return;
      if (k == 0)
      {
        this.f.a("DEVICE_BLUETOOTHHEADSET", false);
        AppMethodBeat.o(65668);
        continue;
        if ("android.bluetooth.headset.action.STATE_CHANGED".equals(paramIntent.getAction()))
        {
          j = paramIntent.getIntExtra("android.bluetooth.headset.extra.STATE", -2);
          k = paramIntent.getIntExtra("android.bluetooth.headset.extra.PREVIOUS_STATE", -2);
          i = paramIntent.getIntExtra("android.bluetooth.headset.extra.AUDIO_STATE", -2);
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "++ STATE_CHANGED|  STATE ".concat(String.valueOf(j)));
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "       PREVIOUS_STATE ".concat(String.valueOf(k)));
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "       AUDIO_STATE ".concat(String.valueOf(i)));
          if (i == 2)
          {
            this.f.a("DEVICE_BLUETOOTHHEADSET", true);
            AppMethodBeat.o(65668);
            continue;
          }
          if (i == 0)
            this.f.a("DEVICE_BLUETOOTHHEADSET", false);
        }
      }
      else
      {
        AppMethodBeat.o(65668);
      }
    }
  }

  void a(IntentFilter paramIntentFilter)
  {
    AppMethodBeat.i(65667);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, " " + c() + " _addAction");
    paramIntentFilter.addAction("android.bluetooth.headset.action.AUDIO_STATE_CHANGED");
    paramIntentFilter.addAction("android.bluetooth.headset.action.STATE_CHANGED");
    AppMethodBeat.o(65667);
  }

  public boolean a(Context paramContext, TraeAudioManager.e parame)
  {
    boolean bool = false;
    AppMethodBeat.i(65664);
    AudioDeviceInterface.LogTraceEntry("");
    this.e = paramContext;
    this.f = parame;
    if ((this.e == null) || (this.f == null))
      AppMethodBeat.o(65664);
    while (true)
    {
      return bool;
      try
      {
        this.a = Class.forName("android.bluetooth.BluetoothHeadset");
        if (this.a == null)
          AppMethodBeat.o(65664);
      }
      catch (Exception parame)
      {
        while (true)
          if (QLog.isColorLevel())
            QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset class not found");
        try
        {
          this.b = Class.forName("android.bluetooth.BluetoothHeadset$ServiceListener");
        }
        catch (Exception parame)
        {
          try
          {
            while (true)
            {
              this.d = this.a.getDeclaredMethod("getCurrentHeadset", new Class[0]);
              if (this.d != null)
                break label169;
              AppMethodBeat.o(65664);
              break;
              parame = parame;
              if (QLog.isColorLevel())
                QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset.ServiceListener class not found:".concat(String.valueOf(parame)));
            }
          }
          catch (NoSuchMethodException parame)
          {
            while (true)
              if (QLog.isColorLevel())
                QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset NoSuchMethodException");
            try
            {
              label169: this.c = this.a.getConstructor(new Class[] { Context.class, this.b }).newInstance(new Object[] { paramContext, null });
              if (this.c == null)
                AppMethodBeat.o(65664);
            }
            catch (IllegalArgumentException paramContext)
            {
              while (true)
                if (QLog.isColorLevel())
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor IllegalArgumentException");
            }
            catch (InstantiationException paramContext)
            {
              while (true)
                if (QLog.isColorLevel())
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor InstantiationException");
            }
            catch (IllegalAccessException paramContext)
            {
              while (true)
                if (QLog.isColorLevel())
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor IllegalAccessException");
            }
            catch (InvocationTargetException paramContext)
            {
              while (true)
                if (QLog.isColorLevel())
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor InvocationTargetException");
            }
            catch (NoSuchMethodException paramContext)
            {
              while (true)
                if (QLog.isColorLevel())
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor NoSuchMethodException");
              this.f.a("DEVICE_BLUETOOTHHEADSET", b());
              if (!b())
                break label371;
            }
            this.f.a("DEVICE_BLUETOOTHHEADSET", true);
            this.g.checkDevicePlug("DEVICE_BLUETOOTHHEADSET", true);
          }
        }
      }
    }
    while (true)
    {
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65664);
      bool = true;
      break;
      label371: this.f.a("DEVICE_BLUETOOTHHEADSET", false);
    }
  }

  public boolean b()
  {
    AppMethodBeat.i(65666);
    String str1 = null;
    boolean bool;
    if ((this.d == null) || (this.d == null))
    {
      AppMethodBeat.o(65666);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        Object localObject = this.d.invoke(this.c, new Object[0]);
        if (QLog.isColorLevel())
        {
          StringBuilder localStringBuilder = new StringBuilder("BTLooperThread BluetoothHeadset method getCurrentHeadset res:");
          if (localObject != null)
          {
            str1 = " Y";
            QLog.w("TRAE", 2, str1);
          }
        }
        else
        {
          if (localObject == null)
            break label171;
          bool = true;
          AppMethodBeat.o(65666);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
        {
          String str2 = str1;
          if (QLog.isColorLevel())
          {
            QLog.w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset IllegalArgumentException");
            str2 = str1;
          }
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        while (true)
        {
          String str3 = str1;
          if (QLog.isColorLevel())
          {
            QLog.w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset IllegalAccessException");
            str3 = str1;
          }
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        while (true)
        {
          String str4 = str1;
          if (QLog.isColorLevel())
          {
            QLog.w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset InvocationTargetException");
            str4 = str1;
            continue;
            str1 = "N";
          }
        }
        label171: AppMethodBeat.o(65666);
        bool = false;
      }
    }
  }

  public String c()
  {
    return "BluetoohHeadsetCheckFor2x";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.c
 * JD-Core Version:    0.6.2
 */