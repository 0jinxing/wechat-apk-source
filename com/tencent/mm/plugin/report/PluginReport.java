package com.tencent.mm.plugin.report;

import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.report.service.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PluginReport extends f
  implements b, com.tencent.mm.kernel.api.c, c
{
  private q pWZ;

  public List<String> collectStoragePaths()
  {
    AppMethodBeat.i(72661);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "logcat/" });
    AppMethodBeat.o(72661);
    return localLinkedList;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(72660);
    if (ah.bqo())
    {
      ab.i("Matrix.PluginReport", "load matrixmrs so");
      k.a("matrixmrs", PluginReport.class.getClassLoader());
    }
    this.pWZ = new q(j.class);
    com.tencent.mm.kernel.g.a(q.class, new com.tencent.mm.kernel.c.e(this.pWZ));
    e locale = e.pXa;
    h localh = h.pYm;
    ab.i("MicroMsg.ReportService", "instance set %s", new Object[] { localh });
    locale.pXb = localh;
    MatrixReport.setMrsCallback(new com.tencent.mrs.a.a());
    com.tencent.mrs.a.j(paramg.cc);
    AppMethodBeat.o(72660);
  }

  public void dependency()
  {
    AppMethodBeat.i(72659);
    dependsOn(p.class);
    AppMethodBeat.o(72659);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void installed()
  {
    AppMethodBeat.i(72658);
    alias(c.class);
    AppMethodBeat.o(72658);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(72662);
    com.tencent.mrs.a.dPc();
    AppMethodBeat.o(72662);
  }

  public void onAccountRelease()
  {
  }

  public String toString()
  {
    return "plugin-report";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.PluginReport
 * JD-Core Version:    0.6.2
 */