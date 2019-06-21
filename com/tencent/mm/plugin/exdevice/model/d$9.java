package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.HashMap;

final class d$9
  implements ap.a
{
  d$9(d paramd, long paramLong, String paramString, int paramInt)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(19107);
    int i = u.bpx().hS(this.lrs);
    ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to notify ui show the connect time out tips, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", new Object[] { this.lrr, Long.valueOf(this.lrs), Integer.valueOf(this.lru), Integer.valueOf(i) });
    if (i != 2)
    {
      ad.bph();
      e.cc(this.lrr, 2);
    }
    d.c(this.lrk).remove(Long.valueOf(this.lrs));
    AppMethodBeat.o(19107);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.9
 * JD-Core Version:    0.6.2
 */