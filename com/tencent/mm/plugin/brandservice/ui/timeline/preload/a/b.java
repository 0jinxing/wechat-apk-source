package com.tencent.mm.plugin.brandservice.ui.timeline.preload.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

public final class b extends j<a>
{
  public static final String[] fjY;
  public static final String[] fjZ;
  final com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(14398);
    fjY = new String[] { j.a(a.fjX, "BizAppMsgReportContext") };
    fjZ = new String[0];
    AppMethodBeat.o(14398);
  }

  public b(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, a.fjX, "BizAppMsgReportContext", fjZ);
    this.bSd = parame;
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(14395);
    parama.field_appMsgReportContextId = parama.field_reportTime;
    boolean bool = super.b(parama);
    AppMethodBeat.o(14395);
    return bool;
  }

  public final void ba(List<a> paramList)
  {
    AppMethodBeat.i(14396);
    long l = g.RP().eJN.iV(Thread.currentThread().getId());
    paramList = paramList.iterator();
    while (paramList.hasNext())
      if (!a((a)paramList.next(), new String[0]))
        ab.v("MicroMsg.Preload.BizAppMsgReportContextStorage", "[remove] delete fail");
    g.RP().eJN.mB(l);
    AppMethodBeat.o(14396);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.a.b
 * JD-Core Version:    0.6.2
 */