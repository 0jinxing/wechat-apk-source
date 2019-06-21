package com.tencent.mm.plugin.exdevice.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.dz;
import com.tencent.mm.plugin.exdevice.service.n.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends n.a
{
  private static final a lqV;

  static
  {
    AppMethodBeat.i(19088);
    lqV = new a();
    AppMethodBeat.o(19088);
  }

  public static a boA()
  {
    return lqV;
  }

  public final Bundle k(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(19087);
    ab.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "onExdeviceInvoke, action code = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramBundle == null)
    {
      ab.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
      AppMethodBeat.o(19087);
    }
    while (true)
    {
      return null;
      switch (paramInt)
      {
      default:
        AppMethodBeat.o(19087);
      case 0:
      }
    }
    if (paramBundle == null)
      ab.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
    while (true)
    {
      AppMethodBeat.o(19087);
      break;
      paramInt = paramBundle.getInt("key_state");
      ab.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "handleOnBluetoothStateChange, state = %d", new Object[] { Integer.valueOf(paramInt) });
      if (-1 == paramInt)
      {
        ab.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "invalid state, just leave!!!");
      }
      else
      {
        paramBundle = new dz();
        paramBundle.cxz.cxA = paramInt;
        if (!com.tencent.mm.sdk.b.a.xxA.m(paramBundle))
          ab.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "EventCenter.instance.publish failed!!!");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.a
 * JD-Core Version:    0.6.2
 */