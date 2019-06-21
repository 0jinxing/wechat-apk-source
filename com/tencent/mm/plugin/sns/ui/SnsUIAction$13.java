package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMPullDownView.e;

final class SnsUIAction$13
  implements MMPullDownView.e
{
  SnsUIAction$13(SnsUIAction paramSnsUIAction)
  {
  }

  public final boolean bhk()
  {
    AppMethodBeat.i(39652);
    ab.e("MicroMsg.SnsActivity", "bottomLoad  isAll:" + this.rCe.koC);
    if (!this.rCe.koC)
      SnsUIAction.g(this.rCe);
    AppMethodBeat.o(39652);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction.13
 * JD-Core Version:    0.6.2
 */