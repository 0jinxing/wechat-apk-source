package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class NoteEditorUI$9
  implements Runnable
{
  NoteEditorUI$9(NoteEditorUI paramNoteEditorUI, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27004);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.uTx.size(); i++)
    {
      String str = (String)this.uTx.get(i);
      com.tencent.mm.plugin.wenote.model.a.f localf = new com.tencent.mm.plugin.wenote.model.a.f();
      localf.uOp = true;
      localf.type = 2;
      localf.uOo = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().des();
      localf.mnd = com.tencent.mm.plugin.wenote.model.f.agW(localf.toString());
      NoteEditorUI.a(this.uTu, new aar());
      NoteEditorUI.ae(this.uTu).akU(localf.mnd);
      localf.uOq = com.tencent.mm.plugin.wenote.b.c.hs(str, com.tencent.mm.plugin.wenote.model.f.o(NoteEditorUI.ae(this.uTu)));
      localf.cHg = com.tencent.mm.plugin.wenote.b.c.ht(localf.uOq, com.tencent.mm.plugin.wenote.model.f.c(NoteEditorUI.ae(this.uTu)));
      localArrayList.add(localf);
    }
    if ((NoteEditorUI.ac(this.uTu) != null) && (NoteEditorUI.ac(this.uTu).isShowing()))
    {
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(localArrayList, NoteEditorUI.j(this.uTu).deW(), true, false, true, false);
      this.uTu.g(true, 100L);
      this.uTu.af(1, 0L);
      AppMethodBeat.o(27004);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Note.NoteEditorUI", "user canceled");
      AppMethodBeat.o(27004);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.9
 * JD-Core Version:    0.6.2
 */