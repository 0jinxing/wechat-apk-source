package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NoteEditorUI$29
  implements DialogInterface.OnClickListener
{
  NoteEditorUI$29(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(27037);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(27037);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.29
 * JD-Core Version:    0.6.2
 */