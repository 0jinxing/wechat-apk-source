package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.de;
import com.tencent.mm.g.a.de.a;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.plugin.exdevice.service.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class d$10 extends w
{
  d$10(d paramd)
  {
  }

  public final void a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2)
  {
    AppMethodBeat.i(19108);
    ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, deviceId = %s, oldSate = %d, newState = %d, errCode = %d", new Object[] { com.tencent.mm.plugin.exdevice.j.b.ie(paramLong1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (ah.getContext() == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "MMApplicationContext is null");
      AppMethodBeat.o(19108);
    }
    while (true)
    {
      return;
      Object localObject;
      if (4 == paramInt2)
      {
        u.bpx().hW(paramLong1);
        localObject = com.tencent.mm.plugin.exdevice.h.a.Kt("shut_down_device");
        if ((localObject != null) && (localObject.length != 0))
        {
          int i = localObject.length;
          for (paramInt3 = 0; paramInt3 < i; paramInt3++)
          {
            paramLong2 = localObject[paramInt3];
            if (paramLong2 == paramLong1)
            {
              ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel in the shut down device list, deviceId = %d", new Object[] { Long.valueOf(paramLong2) });
              d.hH(paramLong2);
              if (!com.tencent.mm.plugin.exdevice.h.a.E("shut_down_device", paramLong2))
                ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "removeFromSharedPreferences failed!!!");
            }
          }
        }
        if (d.d(this.lrk).get(Long.valueOf(paramLong1)) == null)
          break label340;
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "Device connect strategy(%d)", new Object[] { d.d(this.lrk).get(Long.valueOf(paramLong1)) });
        localObject = new de();
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        if ((!((de)localObject).cwp.cgQ) || ((((Integer)d.d(this.lrk).get(Long.valueOf(paramLong1))).intValue() & 0x1) != 1))
          d.hH(paramLong1);
      }
      while (true)
        if (paramInt1 != paramInt2)
        {
          com.tencent.mm.plugin.exdevice.h.b localb = ad.boW().Ku(String.valueOf(paramLong1));
          if ((localb == null) || (bo.isNullOrNil(localb.field_brandName)))
          {
            ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "get hdinfo by mac failed : %d", new Object[] { Long.valueOf(paramLong1) });
            AppMethodBeat.o(19108);
            break;
            label340: d.hH(paramLong1);
            continue;
          }
          localObject = u.bpx().hT(paramLong1);
          if (localObject != null)
            ((f.a)localObject).cxs = paramInt2;
          while (true)
          {
            if (paramInt2 != 2)
              break label411;
            ab.w("MicroMsg.exdevice.ExdeviceConnectManager", "newState = EMMACCS_connected");
            AppMethodBeat.o(19108);
            break;
            ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "get connect state faild : %d", new Object[] { Long.valueOf(paramLong1) });
          }
          label411: ad.bph();
          e.b(localb.field_brandName, localb.field_url, paramInt2, localb.field_deviceID);
        }
      AppMethodBeat.o(19108);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.10
 * JD-Core Version:    0.6.2
 */