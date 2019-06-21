package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class NoteEditorUI$23
  implements MenuItem.OnMenuItemClickListener
{
  NoteEditorUI$23(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    int i = 1;
    AppMethodBeat.i(27031);
    d locald = new d(this.uTu.mController.ylL, 1, false);
    locald.rBl = new NoteEditorUI.23.1(this);
    locald.rBm = new NoteEditorUI.23.2(this);
    int j;
    if (NoteEditorUI.d(this.uTu) == 2)
    {
      paramMenuItem = c.dem();
      j = i;
      if (paramMenuItem.uPe <= 0)
      {
        if (paramMenuItem.uPd > 0)
          j = i;
      }
      else
      {
        if (j != 0)
          break label106;
        AppMethodBeat.o(27031);
      }
    }
    while (true)
    {
      return false;
      j = 0;
      break;
      label106: if (NoteEditorUI.d(this.uTu) == 2)
      {
        this.uTu.deb();
        if (NoteEditorUI.a(this.uTu) != null)
          NoteEditorUI.a(this.uTu).uPB.dismiss();
        NoteEditorUI.b(this.uTu).setVisibility(8);
        if (NoteEditorUI.J(this.uTu))
          e.dfb().dff();
      }
      NoteEditorUI.A(this.uTu).postDelayed(new NoteEditorUI.23.3(this, locald), 100L);
      AppMethodBeat.o(27031);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.23
 * JD-Core Version:    0.6.2
 */