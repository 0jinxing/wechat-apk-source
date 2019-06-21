package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.c;
import java.util.Map;

public final class m extends com.tencent.luggage.f.a.a
{
  private static volatile Boolean hLa;

  static
  {
    AppMethodBeat.i(131114);
    try
    {
      ab.i("MicroMsg.TencentLocationManagerWxImp", "printBluetoothEnable open:%b", new Object[] { Boolean.valueOf(BluetoothAdapter.getDefaultAdapter().isEnabled()) });
    }
    catch (Exception localException1)
    {
      try
      {
        Object localObject = (LocationManager)ah.getContext().getSystemService("location");
        if (localObject != null)
        {
          boolean bool1 = ((LocationManager)localObject).isProviderEnabled("gps");
          boolean bool2 = ((LocationManager)localObject).isProviderEnabled("network");
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("isGPSEnable ");
          ab.i("MicroMsg.TencentLocationManagerWxImp", bool1 + ", isNetworkEnable:" + bool2);
        }
        while (true)
        {
          ab.i("MicroMsg.TencentLocationManagerWxImp", "Imei:%s", new Object[] { q.LK() });
          AppMethodBeat.o(131114);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("MicroMsg.TencentLocationManagerWxImp", localException1, "", new Object[0]);
          ab.i("MicroMsg.TencentLocationManagerWxImp", "printBluetoothEnable fail");
          break;
          ab.e("MicroMsg.TencentLocationManagerWxImp", "locationManager is null");
        }
      }
      catch (Exception localException2)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.TencentLocationManagerWxImp", localException2, "", new Object[0]);
      }
    }
  }

  public final boolean yh()
  {
    AppMethodBeat.i(131113);
    if (hLa != null)
      hLa.booleanValue();
    Object localObject;
    while (true)
    {
      bool = hLa.booleanValue();
      AppMethodBeat.o(131113);
      return bool;
      localObject = a.b.eGM;
      localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.ll("100459");
      if (localObject != null)
        break;
      ab.i("MicroMsg.TencentLocationManagerWxImp", "[sLocationLogOpen] item is null");
      hLa = Boolean.FALSE;
    }
    if ((((c)localObject).isValid()) && ("true".equals(((c)localObject).dru().get("isLocationLogOpen"))));
    for (boolean bool = true; ; bool = false)
    {
      hLa = Boolean.valueOf(bool);
      ab.i("MicroMsg.TencentLocationManagerWxImp", "sLocationLogOpen:%b", new Object[] { hLa });
      hLa.booleanValue();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.m
 * JD-Core Version:    0.6.2
 */