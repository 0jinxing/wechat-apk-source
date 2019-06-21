package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NoteEditorUI$8
  implements DialogInterface.OnCancelListener
{
  NoteEditorUI$8(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(27003);
    if (NoteEditorUI.ac(this.uTu) != null)
    {
      NoteEditorUI.ac(this.uTu).dismiss();
      NoteEditorUI.ad(this.uTu);
    }
    AppMethodBeat.o(27003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.8
 * JD-Core Version:    0.6.2
 */