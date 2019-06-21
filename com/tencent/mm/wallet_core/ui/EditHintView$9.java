package com.tencent.mm.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class EditHintView$9
  implements DialogInterface.OnClickListener
{
  EditHintView$9(EditHintView paramEditHintView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49186);
    EditHintView.p(this.Ahi).dismiss();
    AppMethodBeat.o(49186);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.EditHintView.9
 * JD-Core Version:    0.6.2
 */