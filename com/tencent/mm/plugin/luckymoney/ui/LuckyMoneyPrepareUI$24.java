package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyPrepareUI$24
  implements DialogInterface.OnClickListener
{
  LuckyMoneyPrepareUI$24(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(42968);
    paramDialogInterface = new Intent();
    paramDialogInterface.setClass(this.ohI.mController.ylL, LuckyMoneyMyRecordUI.class);
    paramDialogInterface.putExtra("key_type", 1);
    this.ohI.startActivity(paramDialogInterface);
    AppMethodBeat.o(42968);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.24
 * JD-Core Version:    0.6.2
 */