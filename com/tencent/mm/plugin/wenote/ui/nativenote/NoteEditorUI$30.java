package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class NoteEditorUI$30
  implements Runnable
{
  NoteEditorUI$30(NoteEditorUI paramNoteEditorUI, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27038);
    h.a(this.uTu.mController.ylL, this.uTG, NoteEditorUI.e(this.uTu));
    AppMethodBeat.o(27038);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.30
 * JD-Core Version:    0.6.2
 */