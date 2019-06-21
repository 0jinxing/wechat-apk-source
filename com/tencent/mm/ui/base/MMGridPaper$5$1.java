package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMGridPaper$5$1
  implements Runnable
{
  MMGridPaper$5$1(MMGridPaper.5 param5, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106620);
    MMGridPaperGridView localMMGridPaperGridView = (MMGridPaperGridView)this.yva.yuY.yuA.getChildAt(this.yva.yuY.yuA.getChildCount() - 1);
    int i = this.yuZ - (this.yva.yuY.yuA.getChildCount() >> 1);
    ab.i("MicroMsg.MMGridPaper", "move up, old index[%d], new index[%d]", new Object[] { Integer.valueOf(this.yva.yuY.yuA.getChildCount() - 1), Integer.valueOf(i) });
    this.yva.yuY.yuA.removeViewAt(this.yva.yuY.yuA.getChildCount() - 1);
    localMMGridPaperGridView.a(i, this.yva.yuY.fW, this.yva.yuY.mNumColumns, this.yva.yuY.yuB);
    this.yva.yuY.yuA.addView(localMMGridPaperGridView, 0);
    i = this.yva.yuY.yuA.getChildCount();
    this.yva.yuY.yuA.NF(i >> 1);
    MMGridPaper.a(this.yva.yuY, -1);
    AppMethodBeat.o(106620);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaper.5.1
 * JD-Core Version:    0.6.2
 */