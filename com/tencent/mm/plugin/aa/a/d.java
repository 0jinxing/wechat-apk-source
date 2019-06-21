package com.tencent.mm.plugin.aa.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.vending.g.b;

public final class d
  implements com.tencent.mm.ai.f
{
  private static long glA = 4000000L;
  private static long glB = 200000L;
  private static int glx = 20;
  private static int gly = 20;
  private static int glz = 20;
  public String glC = "";
  public String glD = "";
  b glt;

  public d()
  {
  }

  private d(String paramString1, String paramString2)
  {
    this.glC = paramString1;
    this.glD = paramString2;
  }

  public static int aoh()
  {
    AppMethodBeat.i(40598);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(ac.a.xOT, Integer.valueOf(glx))).intValue();
    AppMethodBeat.o(40598);
    return i;
  }

  public static int aoi()
  {
    AppMethodBeat.i(40599);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(ac.a.xOV, Integer.valueOf(glz))).intValue();
    AppMethodBeat.o(40599);
    return i;
  }

  public static long aoj()
  {
    AppMethodBeat.i(40600);
    g.RQ();
    long l = ((Long)g.RP().Ry().get(ac.a.xOX, Long.valueOf(glB))).longValue();
    AppMethodBeat.o(40600);
    return l;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(40601);
    ab.i("MicroMsg.AAOperationData", "get AAOperation, onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.aa.a.a.h)paramm).gmm;
      ab.i("MicroMsg.AAOperationData", "get AAOperation data, retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s", new Object[] { Integer.valueOf(paramString.kCl), paramString.kCm, Integer.valueOf(paramString.vzZ), Integer.valueOf(paramString.vAa), Integer.valueOf(paramString.vAb), Long.valueOf(paramString.vAc), Long.valueOf(paramString.vAd), paramString.kCx, paramString.kCy });
      if (paramString.kCl == 0)
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xOT, Integer.valueOf(paramString.vzZ));
        g.RQ();
        g.RP().Ry().set(ac.a.xOU, Integer.valueOf(paramString.vAa));
        g.RQ();
        g.RP().Ry().set(ac.a.xOV, Integer.valueOf(paramString.vAb));
        g.RQ();
        g.RP().Ry().set(ac.a.xOW, Long.valueOf(paramString.vAc));
        g.RQ();
        g.RP().Ry().set(ac.a.xOX, Long.valueOf(paramString.vAd));
        com.tencent.mm.plugin.report.service.h.pYm.a(407L, 33L, 1L, false);
        com.tencent.mm.vending.g.f.a(this.glt, new Object[] { new d(paramString.kCy, paramString.kCx) });
        AppMethodBeat.o(40601);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.vending.g.f.dMj().cR(Boolean.FALSE);
      com.tencent.mm.plugin.report.service.h.pYm.a(407L, 35L, 1L, false);
      AppMethodBeat.o(40601);
      continue;
      com.tencent.mm.vending.g.f.dMj().cR(Boolean.FALSE);
      com.tencent.mm.plugin.report.service.h.pYm.a(407L, 34L, 1L, false);
      AppMethodBeat.o(40601);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.d
 * JD-Core Version:    0.6.2
 */