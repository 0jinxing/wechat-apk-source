package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.snackbar.b;

final class NoteEditorUI$6$1
  implements Runnable
{
  NoteEditorUI$6$1(NoteEditorUI.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26999);
    this.uTw.mhZ.dismiss();
    b.i(this.uTw.uTu, this.uTw.uTu.getString(2131299884));
    AppMethodBeat.o(26999);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.6.1
 * JD-Core Version:    0.6.2
 */