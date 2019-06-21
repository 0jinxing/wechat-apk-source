package com.tencent.mm.plugin.d.a.d;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

final class b$c extends ak
{
  private WeakReference<b> jGh;

  public b$c(Looper paramLooper, b paramb)
  {
    super(paramLooper);
    AppMethodBeat.i(18511);
    this.jGh = null;
    this.jGh = new WeakReference(paramb);
    AppMethodBeat.o(18511);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(18512);
    b localb = (b)this.jGh.get();
    if (localb == null)
    {
      ab.w("MicroMsg.exdevice.BluetoothSDKManager", "null == BluetoothSdkManager");
      AppMethodBeat.o(18512);
      return;
    }
    ab.i("MicroMsg.exdevice.BluetoothSDKManager", "handleMessage Message.What = " + paramMessage.what);
    switch (paramMessage.what)
    {
    default:
    case 4:
    case 5:
    case 1:
    case 2:
    case 3:
    case 0:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(18512);
      break;
      paramMessage = (b.f)paramMessage.obj;
      localb.jIX.l(paramMessage.jJb, paramMessage.jJc);
      AppMethodBeat.o(18512);
      break;
      paramMessage = (b.g)paramMessage.obj;
      localb.jIX.gB(paramMessage.mSessionId);
      AppMethodBeat.o(18512);
      break;
      paramMessage = (b.h)paramMessage.obj;
      localb.jIX.b(paramMessage.mSessionId, paramMessage.mData);
      AppMethodBeat.o(18512);
      break;
      localb.jIX.rQ(paramMessage.arg1);
      AppMethodBeat.o(18512);
      break;
      b.i locali = (b.i)paramMessage.obj;
      localb.jIX.a(locali.jJe, locali.mDeviceName, paramMessage.arg1, locali.hGc, locali.jJf);
      AppMethodBeat.o(18512);
      break;
      paramMessage = (b.j)paramMessage.obj;
      localb.jIX.m(paramMessage.jJb, paramMessage.jJc);
      AppMethodBeat.o(18512);
      break;
      paramMessage = (b.d)paramMessage.obj;
      localb.jIX.g(paramMessage.mSessionId, paramMessage.jJa, paramMessage.jFM);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.d.b.c
 * JD-Core Version:    0.6.2
 */