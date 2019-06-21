package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.snackbar.b;

final class NoteEditorUI$7
  implements Runnable
{
  NoteEditorUI$7(NoteEditorUI paramNoteEditorUI, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27002);
    this.mhZ.dismiss();
    b.i(this.uTu, this.uTu.getString(2131299884));
    AppMethodBeat.o(27002);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.7
 * JD-Core Version:    0.6.2
 */