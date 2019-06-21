package com.tencent.mm.plugin.exdevice.service;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.b.e;
import com.tencent.mm.plugin.d.a.b.e.5;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class y$a extends ak
{
  public y$a(y paramy, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(19657);
    switch (paramMessage.what)
    {
    default:
    case 2:
    case 0:
    case 1:
    case 5:
    case 3:
    case 4:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    }
    while (true)
    {
      AppMethodBeat.o(19657);
      while (true)
      {
        return;
        paramMessage = (y.d)paramMessage.obj;
        y.a(this.lxl, paramMessage.lwo, paramMessage.lqL, paramMessage.lqz, paramMessage.hxN);
        AppMethodBeat.o(19657);
        continue;
        paramMessage = (y.k)paramMessage.obj;
        if (!y.a(this.lxl, paramMessage.lwo, paramMessage.lxt))
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startTaskImp failed!!!");
        AppMethodBeat.o(19657);
        continue;
        long l = ((Long)paramMessage.obj).longValue();
        if (!y.a(this.lxl, l))
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopTaskImp failed!!!");
        AppMethodBeat.o(19657);
        continue;
        paramMessage = (y.c)paramMessage.obj;
        y.a(this.lxl, paramMessage.jJa, paramMessage.lwm, paramMessage.lwn, paramMessage.lqz);
        AppMethodBeat.o(19657);
        continue;
        paramMessage = (y.j)paramMessage.obj;
        if (!y.a(this.lxl, paramMessage.jJa, paramMessage.lxs, paramMessage.lxo))
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startChannelImp failed!!!");
        AppMethodBeat.o(19657);
        continue;
        if (y.b(this.lxl, ((Long)paramMessage.obj).longValue()))
          break;
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopChannelImp failed!!!");
        AppMethodBeat.o(19657);
        continue;
        paramMessage = (y.b)paramMessage.obj;
        y.a(this.lxl, paramMessage.mErrorCode, paramMessage.jJa, paramMessage.lqG, paramMessage.lwl, paramMessage.lqA);
        AppMethodBeat.o(19657);
        continue;
        paramMessage = (y.e)paramMessage.obj;
        if (!this.lxl.c(paramMessage.ltB, paramMessage.lxn, paramMessage.lxo))
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTConnectImpl error");
        AppMethodBeat.o(19657);
        continue;
        l = ((Long)paramMessage.obj).longValue();
        paramMessage = this.lxl;
        ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTDisonnectImpl. mac=%d", new Object[] { Long.valueOf(l) });
        if (paramMessage.lxj != null)
        {
          paramMessage = paramMessage.lxj;
          ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "disconnect. mac = %d", new Object[] { Long.valueOf(l) });
          if (!paramMessage.aVw())
          {
            ab.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
            AppMethodBeat.o(19657);
          }
          else
          {
            paramMessage.Q(new e.5(paramMessage, l));
          }
        }
        else
        {
          AppMethodBeat.o(19657);
          continue;
          paramMessage = (y.c)paramMessage.obj;
          if (!this.lxl.b(paramMessage.jJa, paramMessage.lwm, paramMessage.lwn, paramMessage.lqz, paramMessage.jGw))
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTOnSateChangeImpl error");
          AppMethodBeat.o(19657);
          continue;
          paramMessage = (y.i)paramMessage.obj;
          if (!this.lxl.c(paramMessage.ltB, paramMessage.mData, paramMessage.lxr))
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTSendDataImpl error");
          AppMethodBeat.o(19657);
          continue;
          paramMessage = (y.h)paramMessage.obj;
          if (!this.lxl.e(paramMessage.ltB, paramMessage.lqL, paramMessage.lqz, paramMessage.hxN))
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTOnSendEndImpl error");
          AppMethodBeat.o(19657);
          continue;
          paramMessage = (y.f)paramMessage.obj;
          this.lxl.d(paramMessage.ltB, paramMessage.mData);
          AppMethodBeat.o(19657);
        }
      }
      paramMessage = (y.g)paramMessage.obj;
      y.a(this.lxl, paramMessage);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.y.a
 * JD-Core Version:    0.6.2
 */