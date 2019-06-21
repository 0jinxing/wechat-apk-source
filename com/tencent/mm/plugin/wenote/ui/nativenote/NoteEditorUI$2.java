package com.tencent.mm.plugin.wenote.ui.nativenote;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.ui.nativenote.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class NoteEditorUI$2
  implements Runnable
{
  NoteEditorUI$2(NoteEditorUI paramNoteEditorUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26995);
    ab.i("MicroMsg.Note.NoteEditorUI", "huahuastart: onNotifyItemChanged,position is %d", new Object[] { Integer.valueOf(this.sN) });
    NoteEditorUI.S(this.uTu).cg(this.sN);
    ab.i("MicroMsg.Note.NoteEditorUI", "huahuaend: onNotifyItemChanged,position is %d", new Object[] { Integer.valueOf(this.sN) });
    AppMethodBeat.o(26995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.2
 * JD-Core Version:    0.6.2
 */