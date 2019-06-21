package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bi;

final class TextPreviewUI$3
  implements DialogInterface.OnClickListener
{
  TextPreviewUI$3(TextPreviewUI paramTextPreviewUI, bi parambi)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31045);
    TextPreviewUI.a(this.yMF, this.fku);
    AppMethodBeat.o(31045);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI.3
 * JD-Core Version:    0.6.2
 */