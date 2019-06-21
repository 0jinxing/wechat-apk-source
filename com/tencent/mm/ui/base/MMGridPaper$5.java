package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class MMGridPaper$5
  implements MMFlipper.b
{
  MMGridPaper$5(MMGridPaper paramMMGridPaper)
  {
  }

  public final void BZ(int paramInt)
  {
    AppMethodBeat.i(106622);
    ab.d("MicroMsg.MMGridPaper", "onScreenChanged:curScreen[%d], topEdge[%d], bottomEdge[%d], virtualPage[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.yuY.yuH), Integer.valueOf(this.yuY.yuI), Integer.valueOf(this.yuY.yuJ) });
    if ((paramInt <= this.yuY.yuH) && (this.yuY.yuH > 0))
      this.yuY.mty.post(new MMGridPaper.5.1(this, paramInt));
    while (true)
    {
      this.yuY.yuF = paramInt;
      this.yuY.jiG.setSelectedDot(paramInt);
      AppMethodBeat.o(106622);
      return;
      if ((paramInt >= this.yuY.yuI) && (this.yuY.yuI < this.yuY.yuJ - 1))
        this.yuY.mty.post(new MMGridPaper.5.2(this, paramInt));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaper.5
 * JD-Core Version:    0.6.2
 */