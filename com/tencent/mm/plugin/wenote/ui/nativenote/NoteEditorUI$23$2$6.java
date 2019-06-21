package com.tencent.mm.plugin.wenote.ui.nativenote;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.a;
import com.tencent.mm.plugin.wenote.model.h;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

final class NoteEditorUI$23$2$6
  implements Runnable
{
  NoteEditorUI$23$2$6(NoteEditorUI.23.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27027);
    NoteEditorUI.j(this.uTC.uTB.uTu).deV();
    a locala = new a();
    locala.uNT = false;
    locala.uNZ = false;
    c.dem().a(locala);
    int i = NoteEditorUI.j(this.uTC.uTB.uTu).uQI;
    NoteEditorUI.j(this.uTC.uTB.uTu).uQI = 3;
    h.JW(i);
    AppMethodBeat.o(27027);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.23.2.6
 * JD-Core Version:    0.6.2
 */