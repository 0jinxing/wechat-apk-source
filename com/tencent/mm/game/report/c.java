package com.tencent.mm.game.report;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.adf;
import com.tencent.mm.protocal.protobuf.adg;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class c
{
  private static LinkedList<com.tencent.mm.game.report.api.d> eBA;
  private static boolean eBB;
  private static String eBC;
  private static String eBD;

  static
  {
    AppMethodBeat.i(59591);
    eBA = new LinkedList();
    eBC = "log_id";
    eBD = "log_ext";
    AppMethodBeat.o(59591);
  }

  private static void Pt()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(59589);
        if (eBB)
        {
          ab.i("MicroMsg.ReportService", "tryDoScene isBusy");
          AppMethodBeat.o(59589);
          return;
        }
        if (bo.ek(eBA))
        {
          ab.i("MicroMsg.ReportService", "waitingList is null");
          AppMethodBeat.o(59589);
          continue;
        }
      }
      finally
      {
      }
      com.tencent.mm.game.report.api.d locald = (com.tencent.mm.game.report.api.d)eBA.remove(0);
      if (locald != null)
      {
        eBB = true;
        Object localObject2 = new com/tencent/mm/ai/b$a;
        ((b.a)localObject2).<init>();
        ((b.a)localObject2).uri = "/cgi-bin/micromsg-bin/gamereportkv";
        ((b.a)localObject2).fsI = 427;
        ((b.a)localObject2).fsL = 0;
        ((b.a)localObject2).fsM = 0;
        Object localObject3 = new com/tencent/mm/protocal/protobuf/adf;
        ((adf)localObject3).<init>();
        ((adf)localObject3).vOz = com.tencent.mm.protocal.d.vxj;
        ((adf)localObject3).vOA = com.tencent.mm.protocal.d.vxi;
        ((adf)localObject3).vOB = com.tencent.mm.protocal.d.vxl;
        ((adf)localObject3).vOC = com.tencent.mm.protocal.d.vxm;
        ((adf)localObject3).vOD = aa.dor();
        ((adf)localObject3).pXL = locald.eBH;
        ((adf)localObject3).vOE = locald.eBI;
        ((b.a)localObject2).fsJ = ((com.tencent.mm.bt.a)localObject3);
        localObject3 = new com/tencent/mm/protocal/protobuf/adg;
        ((adg)localObject3).<init>();
        ((b.a)localObject2).fsK = ((com.tencent.mm.bt.a)localObject3);
        localObject3 = ((b.a)localObject2).acD();
        localObject2 = new com/tencent/mm/game/report/c$1;
        ((c.1)localObject2).<init>();
        w.a((b)localObject3, (w.a)localObject2);
        AppMethodBeat.o(59589);
      }
      else
      {
        Pt();
        AppMethodBeat.o(59589);
      }
    }
  }

  public static void a(com.tencent.mm.game.report.api.d paramd)
  {
    AppMethodBeat.i(59587);
    if (ah.bqo())
    {
      b(paramd);
      AppMethodBeat.o(59587);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putInt(eBC, paramd.eBH);
      localBundle.putString(eBD, paramd.eBI);
      f.a("com.tencent.mm", localBundle, a.class, null);
      AppMethodBeat.o(59587);
    }
  }

  private static void b(com.tencent.mm.game.report.api.d paramd)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(59588);
        if ((!g.RN().QY()) || (com.tencent.mm.kernel.a.QT()))
        {
          ab.w("MicroMsg.ReportService", "report, account not ready");
          AppMethodBeat.o(59588);
          return;
        }
        if (paramd == null)
        {
          AppMethodBeat.o(59588);
          continue;
        }
      }
      finally
      {
      }
      eBA.add(paramd);
      Pt();
      AppMethodBeat.o(59588);
    }
  }

  static class a
    implements com.tencent.mm.ipcinvoker.a<Bundle, Bundle>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.c
 * JD-Core Version:    0.6.2
 */