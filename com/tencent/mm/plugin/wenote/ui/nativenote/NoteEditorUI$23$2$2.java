package com.tencent.mm.plugin.wenote.ui.nativenote;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class NoteEditorUI$23$2$2
  implements Runnable
{
  NoteEditorUI$23$2$2(NoteEditorUI.23.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27022);
    NoteEditorUI localNoteEditorUI = this.uTC.uTB.uTu;
    Object localObject = c.dem().deu();
    if (NoteEditorUI.ahr((String)localObject))
    {
      localObject = new gh();
      ((gh)localObject).cAH.type = 12;
      ((gh)localObject).cAH.cvv = localNoteEditorUI.fDy;
      a.xxA.m((b)localObject);
      if (NoteEditorUI.c(this.uTC.uTB.uTu) != null)
        break label150;
      AppMethodBeat.o(27022);
    }
    while (true)
    {
      return;
      if ((localNoteEditorUI.uNq) || (localNoteEditorUI.uMY))
      {
        ab.i("MicroMsg.Note.NoteEditorUI", "syncWNNoteFavItem noteeditorui, do savewnnotefavitem");
        localNoteEditorUI.i((String)localObject, true, true);
      }
      while (true)
      {
        localNoteEditorUI.uTk = true;
        break;
        if (localNoteEditorUI.uSQ)
        {
          ab.i("MicroMsg.Note.NoteEditorUI", "syncWNNoteFavItem noteeditorui, do updateWNNoteFavitem");
          localNoteEditorUI.i((String)localObject, false, true);
        }
      }
      label150: al.d(new NoteEditorUI.23.2.2.1(this));
      AppMethodBeat.o(27022);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.23.2.2
 * JD-Core Version:    0.6.2
 */