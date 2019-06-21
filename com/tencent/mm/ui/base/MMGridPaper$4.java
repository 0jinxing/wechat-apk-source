package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMGridPaper$4
  implements MMFlipper.a
{
  MMGridPaper$4(MMGridPaper paramMMGridPaper)
  {
  }

  public final void fe(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106619);
    ab.v("MicroMsg.MMGridPaper", "onMeasure width:[new %d, old %d] height:[new %d, old %d], dialogMode[%B], orientationChange[%B]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(this.yuY.yuC), Integer.valueOf(paramInt2), Integer.valueOf(this.yuY.yuD), Boolean.valueOf(this.yuY.yuR), Boolean.valueOf(this.yuY.yuQ) });
    if (((Math.abs(this.yuY.yuD - paramInt2) < 50) && (Math.abs(this.yuY.yuC - paramInt1) < 50)) || (paramInt2 == 0) || (paramInt1 == 0))
    {
      ab.d("MicroMsg.MMGridPaper", "match width height limit, return");
      AppMethodBeat.o(106619);
    }
    while (true)
    {
      return;
      if ((this.yuY.yuR) && (this.yuY.yuC > paramInt1) && (!this.yuY.yuQ))
      {
        ab.d("MicroMsg.MMGridPaper", "match ori limit, return");
        AppMethodBeat.o(106619);
      }
      else
      {
        ab.v("MicroMsg.MMGridPaper", "onMeasure: match");
        ab.v("MicroMsg.MMGridPaper", "onMeasure: mIsManualMeasureMode[%b]", new Object[] { Boolean.valueOf(this.yuY.yuU) });
        this.yuY.yuQ = false;
        if (!this.yuY.yuU)
        {
          this.yuY.yuD = paramInt2;
          this.yuY.yuC = paramInt1;
        }
        this.yuY.refresh();
        AppMethodBeat.o(106619);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaper.4
 * JD-Core Version:    0.6.2
 */