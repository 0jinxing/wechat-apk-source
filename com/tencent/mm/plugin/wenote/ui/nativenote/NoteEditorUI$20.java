package com.tencent.mm.plugin.wenote.ui.nativenote;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class NoteEditorUI$20
  implements Runnable
{
  NoteEditorUI$20(NoteEditorUI paramNoteEditorUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27016);
    if ((this.uTA) && (!NoteEditorUI.O(this.uTu)))
    {
      this.uTu.showVKB();
      AppMethodBeat.o(27016);
    }
    while (true)
    {
      return;
      if ((!this.uTA) && (NoteEditorUI.O(this.uTu)))
        this.uTu.aqX();
      AppMethodBeat.o(27016);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.20
 * JD-Core Version:    0.6.2
 */