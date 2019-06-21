package com.tencent.mm.plugin.fts.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.c.b;
import com.tencent.mm.plugin.websearch.api.g;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class FTSMainUI$10
  implements g
{
  FTSMainUI$10(FTSMainUI paramFTSMainUI)
  {
  }

  public final void bBg()
  {
    AppMethodBeat.i(61876);
    FTSMainUI.d(this.mJJ).mIS.mLG = 1;
    AppMethodBeat.o(61876);
  }

  public final void onClick()
  {
    AppMethodBeat.i(61875);
    b localb = FTSMainUI.k(this.mJJ);
    k.a(this.mJJ.query, FTSMainUI.d(this.mJJ).getCount(), FTSMainUI.n(this.mJJ), localb, 24);
    AppMethodBeat.o(61875);
  }

  public final boolean u(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(61877);
    int i = FTSMainUI.s(this.mJJ);
    int j = FTSMainUI.t(this.mJJ);
    int k = j;
    if (this.mJJ.mController.ymc == -3)
      k = j - x.gp(this.mJJ);
    if ((paramArrayOfInt[0] >= 0) && (paramArrayOfInt[0] < i) && (paramArrayOfInt[1] >= 0) && (paramArrayOfInt[1] < k))
      AppMethodBeat.o(61877);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(61877);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.10
 * JD-Core Version:    0.6.2
 */