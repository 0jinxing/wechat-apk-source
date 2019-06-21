package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.q;

final class LuckyMoneyIndexUI$4$1
  implements h.d
{
  LuckyMoneyIndexUI$4$1(LuckyMoneyIndexUI.4 param4)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    paramInt1 = 1;
    AppMethodBeat.i(42724);
    switch (paramInt2)
    {
    default:
      h.pYm.e(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(5) });
      paramInt1 = 2;
    case 1:
    }
    while (true)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this.oeK.oeJ.mController.ylL, LuckyMoneyMyRecordUI.class);
      localIntent.putExtra("key_type", paramInt1);
      this.oeK.oeJ.startActivity(localIntent);
      AppMethodBeat.o(42724);
      return;
      h.pYm.e(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(6) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI.4.1
 * JD-Core Version:    0.6.2
 */