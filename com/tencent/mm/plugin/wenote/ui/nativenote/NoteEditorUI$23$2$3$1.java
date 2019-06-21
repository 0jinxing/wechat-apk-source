package com.tencent.mm.plugin.wenote.ui.nativenote;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class NoteEditorUI$23$2$3$1
  implements Runnable
{
  NoteEditorUI$23$2$3$1(NoteEditorUI.23.2.3 param3, p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27023);
    NoteEditorUI.l(this.uTE.uTC.uTB.uTu).mfd = true;
    this.mmg.dismiss();
    ab.d("MicroMsg.Note.NoteEditorUI", "do del, local id %d", new Object[] { Long.valueOf(NoteEditorUI.h(this.uTE.uTC.uTB.uTu)) });
    this.uTE.uTC.uTB.uTu.finish();
    AppMethodBeat.o(27023);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.23.2.3.1
 * JD-Core Version:    0.6.2
 */