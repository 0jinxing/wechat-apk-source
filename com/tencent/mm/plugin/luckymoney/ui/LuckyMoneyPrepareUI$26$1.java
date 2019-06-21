package com.tencent.mm.plugin.luckymoney.ui;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;

final class LuckyMoneyPrepareUI$26$1
  implements n.c
{
  LuckyMoneyPrepareUI$26$1(LuckyMoneyPrepareUI.26 param26, boolean paramBoolean)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(42969);
    if (!this.ohM)
    {
      if (bo.gW(this.ohN.obO.nYN, 1))
        paraml.hi(1, 2131301147);
      paraml.hi(2, 2131301185);
      AppMethodBeat.o(42969);
    }
    while (true)
    {
      return;
      paraml.a(3, this.ohN.ohI.getResources().getColor(2131690250), this.ohN.ohI.mController.ylL.getString(2131301091));
      AppMethodBeat.o(42969);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.26.1
 * JD-Core Version:    0.6.2
 */