package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.HashMap;

final class d$8
  implements ap.a
{
  d$8(d paramd, long paramLong, String paramString, int paramInt)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(19106);
    int i = u.bpx().hS(this.lrs);
    ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to check the sync connect state, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", new Object[] { this.lrr, Long.valueOf(this.lrs), Integer.valueOf(this.lru), Integer.valueOf(i) });
    d.hH(this.lrs);
    d.b(this.lrk).remove(Long.valueOf(this.lrs));
    AppMethodBeat.o(19106);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.8
 * JD-Core Version:    0.6.2
 */