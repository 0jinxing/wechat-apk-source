package com.tencent.mm.plugin.wenote.ui.nativenote;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

final class NoteEditorUI$18
  implements Runnable
{
  NoteEditorUI$18(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27014);
    WXRTEditText localWXRTEditText = NoteEditorUI.j(this.uTu).deS();
    if (localWXRTEditText != null)
      localWXRTEditText.clearFocus();
    AppMethodBeat.o(27014);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.18
 * JD-Core Version:    0.6.2
 */