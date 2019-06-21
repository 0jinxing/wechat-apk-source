package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMGridPaper$5$2
  implements Runnable
{
  MMGridPaper$5$2(MMGridPaper.5 param5, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106621);
    MMGridPaperGridView localMMGridPaperGridView = (MMGridPaperGridView)this.yva.yuY.yuA.getChildAt(0);
    int i = this.yuZ + (this.yva.yuY.yuA.getChildCount() >> 1);
    ab.i("MicroMsg.MMGridPaper", "move down, old index[0], new index[%d]", new Object[] { Integer.valueOf(i) });
    this.yva.yuY.yuA.removeViewAt(0);
    localMMGridPaperGridView.a(i, this.yva.yuY.fW, this.yva.yuY.mNumColumns, this.yva.yuY.yuB);
    this.yva.yuY.yuA.addView(localMMGridPaperGridView);
    i = this.yva.yuY.yuA.getChildCount();
    this.yva.yuY.yuA.NF(i >> 1);
    MMGridPaper.a(this.yva.yuY, 1);
    AppMethodBeat.o(106621);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaper.5.2
 * JD-Core Version:    0.6.2
 */