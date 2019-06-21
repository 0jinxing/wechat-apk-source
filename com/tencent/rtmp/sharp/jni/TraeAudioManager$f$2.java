package com.tencent.rtmp.sharp.jni;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

class TraeAudioManager$f$2 extends Handler
{
  TraeAudioManager$f$2(TraeAudioManager.f paramf)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(65659);
    Object localObject;
    try
    {
      HashMap localHashMap = (HashMap)paramMessage.obj;
      if (QLog.isColorLevel())
      {
        StringBuilder localStringBuilder = new StringBuilder("TraeAudioManagerLooper msg:").append(paramMessage.what).append(" _enabled:");
        if (this.a.g)
        {
          str = "Y";
          QLog.w("TRAE", 2, str);
        }
      }
      else
      {
        if (paramMessage.what != 32772)
          break label106;
        this.a.a(localHashMap);
        AppMethodBeat.o(65659);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject = null;
        continue;
        String str = "N";
        continue;
        label106: if (this.a.g)
          break;
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "******* disabled ,skip msg******");
        paramMessage = new Intent();
        this.a.p.sendResBroadcast(paramMessage, (HashMap)localObject, 1);
        AppMethodBeat.o(65659);
      }
      switch (paramMessage.what)
      {
      default:
      case 32773:
      case 32774:
      case 32777:
      case 32778:
      case 32779:
      case 32780:
      case 32781:
      case 32788:
      case 32782:
      case 32783:
      case 32790:
      case 32791:
      case 32784:
      case 32775:
      case 32776:
      case 32785:
      case 32789:
      case 32786:
      case 32787:
      }
    }
    while (true)
    {
      AppMethodBeat.o(65659);
      break;
      this.a.b();
      AppMethodBeat.o(65659);
      break;
      this.a.b((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      this.a.p.InternalSessionIsDeviceChangabled((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      this.a.p.InternalSessionGetConnectedDevice((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      this.a.p.InternalSessionGetConnectingDevice((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      this.a.c((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      this.a.d((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      paramMessage = (Integer)((HashMap)localObject).get("PARAM_STREAMTYPE");
      if (paramMessage == null)
      {
        if (!QLog.isColorLevel())
          continue;
        QLog.e("TRAE", 2, " MESSAGE_VOICECALL_AUIDOPARAM_CHANGED params.get(PARAM_STREAMTYPE)==null!!");
        AppMethodBeat.o(65659);
        break;
      }
      this.a.p._streamType = paramMessage.intValue();
      this.a.b(paramMessage.intValue());
      AppMethodBeat.o(65659);
      break;
      this.a.e((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      this.a.f((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      this.a.g();
      AppMethodBeat.o(65659);
      break;
      this.a.a(this.a.p._streamType);
      AppMethodBeat.o(65659);
      break;
      this.a.g((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      this.a.p.InternalSessionConnectDevice((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      this.a.p.InternalSessionEarAction((HashMap)localObject);
      AppMethodBeat.o(65659);
      break;
      paramMessage = this.a.p._deviceConfigManager.f();
      localObject = this.a.p._deviceConfigManager.h();
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "MESSAGE_AUTO_DEVICELIST_UPDATE  connectedDev:" + (String)localObject + " highestDev" + paramMessage);
      if (TraeAudioManager.IsUpdateSceneFlag)
      {
        if ((TraeAudioManager.IsMusicScene) && (!this.a.p.IsBluetoothA2dpExisted))
        {
          this.a.p.InternalConnectDevice(this.a.p._deviceConfigManager.e("DEVICE_BLUETOOTHHEADSET"), null, true);
          AppMethodBeat.o(65659);
          break;
        }
        this.a.p.InternalConnectDevice(paramMessage, null, true);
        AppMethodBeat.o(65659);
        break;
      }
      if (!paramMessage.equals(localObject))
      {
        this.a.p.InternalConnectDevice(paramMessage, null, false);
        AppMethodBeat.o(65659);
        break;
      }
      this.a.p.InternalNotifyDeviceListUpdate();
      AppMethodBeat.o(65659);
      break;
      paramMessage = (String)((HashMap)localObject).get("PARAM_DEVICE");
      if (this.a.p.InternalConnectDevice(paramMessage, null, false) != 0)
      {
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, " plugin dev:" + paramMessage + " sessionConnectedDev:" + this.a.p.sessionConnectedDev + " connected fail,auto switch!");
        this.a.p.InternalConnectDevice(this.a.p._deviceConfigManager.f(), null, false);
        AppMethodBeat.o(65659);
        break;
        if (this.a.p.InternalConnectDevice(this.a.p.sessionConnectedDev, null, false) != 0)
        {
          paramMessage = (String)((HashMap)localObject).get("PARAM_DEVICE");
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, " plugout dev:" + paramMessage + " sessionConnectedDev:" + this.a.p.sessionConnectedDev + " connected fail,auto switch!");
          this.a.p.InternalConnectDevice(this.a.p._deviceConfigManager.f(), null, false);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.f.2
 * JD-Core Version:    0.6.2
 */