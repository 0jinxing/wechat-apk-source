package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;

final class NoteEditorUI$14
  implements d.a
{
  NoteEditorUI$14(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void a(String paramString, com.tencent.mm.plugin.wenote.model.a.k paramk)
  {
    AppMethodBeat.i(27009);
    ab.i("MicroMsg.Note.NoteEditorUI", "compressNoteVideo onImportFinish");
    if ((!bo.isNullOrNil(paramString)) && (e.ct(paramString)) && (paramk != null))
      paramk.thumbPath = paramString;
    AppMethodBeat.o(27009);
  }

  public final void b(String paramString, com.tencent.mm.plugin.wenote.model.a.k paramk)
  {
    AppMethodBeat.i(27010);
    ab.i("MicroMsg.Note.NoteEditorUI", "compressNoteVideo onExportFinish");
    if (NoteEditorUI.ac(this.uTu) != null)
    {
      NoteEditorUI.ac(this.uTu).dismiss();
      NoteEditorUI.ad(this.uTu);
    }
    if ((!bo.isNullOrNil(paramString)) && (e.ct(paramString)) && (paramk != null) && (!paramk.uOg))
      if (new b(paramString).length() < NoteEditorUI.dfR())
      {
        paramk.cHg = paramString;
        c.dem().a(paramk, NoteEditorUI.j(this.uTu).deW(), false, true, false);
      }
    while (true)
    {
      this.uTu.g(true, 100L);
      this.uTu.af(1, 0L);
      AppMethodBeat.o(27010);
      return;
      Toast.makeText(this.uTu.mController.ylL, this.uTu.getString(2131299756), 1).show();
      continue;
      ab.i("MicroMsg.Note.NoteEditorUI", "file not exist or user canceled");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.14
 * JD-Core Version:    0.6.2
 */