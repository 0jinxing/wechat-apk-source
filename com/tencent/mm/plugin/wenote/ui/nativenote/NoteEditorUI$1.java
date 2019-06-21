package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.g;

final class NoteEditorUI$1
  implements View.OnClickListener
{
  NoteEditorUI$1(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26994);
    if (NoteEditorUI.a(this.uTu) != null)
      NoteEditorUI.a(this.uTu).uPB.dismiss();
    NoteEditorUI.b(this.uTu).setVisibility(8);
    AppMethodBeat.o(26994);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.1
 * JD-Core Version:    0.6.2
 */