package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NoteEditorUI$10
  implements DialogInterface.OnCancelListener
{
  NoteEditorUI$10(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(27005);
    if (NoteEditorUI.ac(this.uTu) != null)
    {
      NoteEditorUI.ac(this.uTu).dismiss();
      NoteEditorUI.ad(this.uTu);
    }
    AppMethodBeat.o(27005);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.10
 * JD-Core Version:    0.6.2
 */