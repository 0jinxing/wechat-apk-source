package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NoteEditorUI$25
  implements Runnable
{
  NoteEditorUI$25(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27033);
    if (NoteEditorUI.ac(this.uTu) != null)
    {
      NoteEditorUI.ac(this.uTu).dismiss();
      NoteEditorUI.ad(this.uTu);
    }
    AppMethodBeat.o(27033);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.25
 * JD-Core Version:    0.6.2
 */