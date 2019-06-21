package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NoteEditorUI$21
  implements Runnable
{
  NoteEditorUI$21(NoteEditorUI paramNoteEditorUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27017);
    ImageButton localImageButton = (ImageButton)NoteEditorUI.P(this.uTu).findViewById(2131826374);
    View localView = NoteEditorUI.P(this.uTu).findViewById(2131826375);
    switch (this.Ko)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(27017);
      while (true)
      {
        return;
        NoteEditorUI.af(this.uTu).setVisibility(8);
        if (!NoteEditorUI.f(this.uTu).uTV)
        {
          NoteEditorUI.P(this.uTu).setVisibility(8);
          AppMethodBeat.o(27017);
        }
        else
        {
          NoteEditorUI.P(this.uTu).setVisibility(0);
          AppMethodBeat.o(27017);
          continue;
          localImageButton.setImageResource(2131231729);
          localView.setVisibility(8);
          NoteEditorUI.P(this.uTu).setVisibility(0);
          NoteEditorUI.af(this.uTu).setVisibility(8);
          AppMethodBeat.o(27017);
          continue;
          NoteEditorUI.P(this.uTu).setVisibility(0);
          NoteEditorUI.af(this.uTu).setVisibility(8);
          AppMethodBeat.o(27017);
        }
      }
      localImageButton.setImageResource(2131231728);
      localView.setVisibility(0);
      NoteEditorUI.P(this.uTu).setVisibility(0);
      NoteEditorUI.af(this.uTu).setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.21
 * JD-Core Version:    0.6.2
 */