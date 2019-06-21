package com.tencent.mm.plugin.luckymoney.sns;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsLuckyMoneyPrepareUI$3
  implements DialogInterface.OnClickListener
{
  SnsLuckyMoneyPrepareUI$3(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(42510);
    paramDialogInterface = new Intent();
    paramDialogInterface.setClass(this.obN.mController.ylL, LuckyMoneyMyRecordUI.class);
    paramDialogInterface.putExtra("key_type", 1);
    this.obN.startActivity(paramDialogInterface);
    AppMethodBeat.o(42510);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.3
 * JD-Core Version:    0.6.2
 */