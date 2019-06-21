package com.tencent.mm.plugin.clean.ui.fileindexui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.clean.b.c;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;

final class CleanNewUI$6
  implements c
{
  CleanNewUI$6(CleanNewUI paramCleanNewUI)
  {
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3, HashSet<String> paramHashSet, HashMap<String, Long> paramHashMap)
  {
    AppMethodBeat.i(18818);
    CleanNewUI.a(this.kyC, bo.anU());
    CleanNewUI localCleanNewUI = this.kyC;
    j.bgd().kvV = paramLong1;
    j.bgd().kvW = paramLong2;
    j.bgd().kvX = paramLong3;
    j.bgd().kwI = paramHashMap;
    j.bgd().kww = paramHashSet;
    al.d(new CleanNewUI.8(localCleanNewUI, paramLong1));
    h.pYm.a(714L, 53L, 1L, false);
    paramLong2 = CleanNewUI.g(this.kyC) - CleanNewUI.h(this.kyC);
    paramLong1 = CleanNewUI.i(this.kyC) - CleanNewUI.j(this.kyC);
    ab.d("MicroMsg.CleanNewUI", "scan cost wxfile[%d %d %d] folder[%d %d %d] all[%d]", new Object[] { Long.valueOf(CleanNewUI.g(this.kyC)), Long.valueOf(CleanNewUI.h(this.kyC)), Long.valueOf(paramLong2), Long.valueOf(CleanNewUI.i(this.kyC)), Long.valueOf(CleanNewUI.j(this.kyC)), Long.valueOf(paramLong1), Long.valueOf(paramLong2 + paramLong1) });
    h.pYm.e(14556, new Object[] { Integer.valueOf("newui_wxfile".hashCode()), Integer.valueOf(0), Long.valueOf(CleanNewUI.h(this.kyC)), Long.valueOf(CleanNewUI.g(this.kyC)), Long.valueOf(paramLong2) });
    h.pYm.e(14556, new Object[] { Integer.valueOf("newui_folder".hashCode()), Integer.valueOf(0), Long.valueOf(CleanNewUI.j(this.kyC)), Long.valueOf(CleanNewUI.i(this.kyC)), Long.valueOf(paramLong1) });
    h.pYm.e(14556, new Object[] { Integer.valueOf("newui_all".hashCode()), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(paramLong2 + paramLong1) });
    AppMethodBeat.o(18818);
  }

  public final void dN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18817);
    if (!CleanNewUI.f(this.kyC))
      this.kyC.dQ(paramInt1, paramInt2);
    AppMethodBeat.o(18817);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.6
 * JD-Core Version:    0.6.2
 */