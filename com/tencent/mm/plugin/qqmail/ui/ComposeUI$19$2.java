package com.tencent.mm.plugin.qqmail.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;

final class ComposeUI$19$2
  implements DialogInterface.OnClickListener
{
  ComposeUI$19$2(ComposeUI.19 param19, MailAddrsViewControl paramMailAddrsViewControl)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(68200);
    ComposeUI.i(this.pxh.pwY).postDelayed(new ComposeUI.19.2.1(this), 150L);
    AppMethodBeat.o(68200);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.19.2
 * JD-Core Version:    0.6.2
 */