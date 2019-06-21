package com.tencent.mm.plugin.exdevice.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static void n(long paramLong, int paramInt)
  {
    AppMethodBeat.i(19519);
    b localb = ad.boW().Ku(String.valueOf(paramLong));
    if (localb == null)
    {
      ab.e("MicroMsg.exdevice.BTDeviceReport", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
      AppMethodBeat.o(19519);
    }
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(localb.field_deviceType).append(',');
      localStringBuilder.append(localb.field_deviceID).append(',');
      localStringBuilder.append(paramInt);
      h.pYm.X(11232, localStringBuilder.toString());
      AppMethodBeat.o(19519);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.g.a
 * JD-Core Version:    0.6.2
 */