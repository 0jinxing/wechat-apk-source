package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class NoteEditorUI$23$2$1
  implements DialogInterface.OnCancelListener
{
  NoteEditorUI$23$2$1(NoteEditorUI.23.2 param2)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(27020);
    if (NoteEditorUI.c(this.uTC.uTB.uTu) != null)
    {
      NoteEditorUI.c(this.uTC.uTB.uTu).dismiss();
      NoteEditorUI.a(this.uTC.uTB.uTu, null);
    }
    AppMethodBeat.o(27020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.23.2.1
 * JD-Core Version:    0.6.2
 */