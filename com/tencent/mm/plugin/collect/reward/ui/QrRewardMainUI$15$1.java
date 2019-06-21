package com.tencent.mm.plugin.collect.reward.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class QrRewardMainUI$15$1
  implements DialogInterface.OnClickListener
{
  QrRewardMainUI$15$1(QrRewardMainUI.15 param15)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41098);
    ab.i("MicroMsg.QrRewardMainUI", "RealnameVerifyUtil cancel");
    AppMethodBeat.o(41098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.15.1
 * JD-Core Version:    0.6.2
 */