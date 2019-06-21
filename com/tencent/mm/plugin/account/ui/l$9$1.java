package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;

final class l$9$1
  implements DialogInterface.OnClickListener
{
  l$9$1(l.9 param9)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125139);
    this.gDG.gDD.gDo.gDJ.dzH();
    l.a(this.gDG.gDD, this.gDG.gDD.account);
    AppMethodBeat.o(125139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.l.9.1
 * JD-Core Version:    0.6.2
 */