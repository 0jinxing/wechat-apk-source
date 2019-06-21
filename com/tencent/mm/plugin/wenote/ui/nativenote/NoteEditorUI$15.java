package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.d;

final class NoteEditorUI$15
  implements DialogInterface.OnCancelListener
{
  NoteEditorUI$15(NoteEditorUI paramNoteEditorUI, d paramd, k paramk)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(27011);
    paramDialogInterface = this.uTy;
    paramDialogInterface.isStop = true;
    paramDialogInterface.interrupt();
    this.uTz.uOg = true;
    this.uTu.g(true, 100L);
    this.uTu.af(1, 0L);
    AppMethodBeat.o(27011);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.15
 * JD-Core Version:    0.6.2
 */