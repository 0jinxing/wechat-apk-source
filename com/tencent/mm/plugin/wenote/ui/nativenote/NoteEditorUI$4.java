package com.tencent.mm.plugin.wenote.ui.nativenote;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.ui.nativenote.a.a;

final class NoteEditorUI$4
  implements Runnable
{
  NoteEditorUI$4(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26997);
    if (NoteEditorUI.X(this.uTu) != null)
    {
      NoteEditorUI.X(this.uTu).ah(NoteEditorUI.Y(this.uTu), NoteEditorUI.Z(this.uTu));
      NoteEditorUI.a(this.uTu, NoteEditorUI.Y(this.uTu));
      NoteEditorUI.b(this.uTu, NoteEditorUI.Z(this.uTu));
    }
    AppMethodBeat.o(26997);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.4
 * JD-Core Version:    0.6.2
 */