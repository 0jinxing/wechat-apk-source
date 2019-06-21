package com.tencent.mm.plugin.appbrand.appusage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.sq;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.LinkedList;

public final class f$1
  implements Runnable
{
  public f$1(long paramLong, LinkedList paramLinkedList1, LinkedList paramLinkedList2, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129743);
    sq localsq = new sq();
    localsq.waf = at.getNetTypeString(ah.getContext());
    localsq.latitude = c.getLatitude();
    localsq.longitude = c.getLongitude();
    new f.1.1(this, this.hbB, this.hbC, this.hbD, this.hbE, this.hbF, this.hbG, localsq).acy();
    AppMethodBeat.o(129743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.f.1
 * JD-Core Version:    0.6.2
 */