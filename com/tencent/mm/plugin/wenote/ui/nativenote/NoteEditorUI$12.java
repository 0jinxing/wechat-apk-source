package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class NoteEditorUI$12
  implements DialogInterface.OnCancelListener
{
  NoteEditorUI$12(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(27007);
    if (NoteEditorUI.c(this.uTu) != null)
    {
      NoteEditorUI.c(this.uTu).dismiss();
      NoteEditorUI.a(this.uTu, null);
    }
    AppMethodBeat.o(27007);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.12
 * JD-Core Version:    0.6.2
 */