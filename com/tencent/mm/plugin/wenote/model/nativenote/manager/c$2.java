package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.h;
import com.tencent.mm.plugin.wenote.model.nativenote.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class c$2
  implements Runnable
{
  c$2(c paramc, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26715);
    ArrayList localArrayList = h.a(c.d(this.uPg), this.uPh, false);
    ab.i("MicroMsg.Note.NoteDataManager", "updateDataByHtml, start mNotifyListener.setUpNoteData(dataItems, true)");
    if (c.e(this.uPg) != null)
      c.e(this.uPg).c(localArrayList, true);
    AppMethodBeat.o(26715);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.c.2
 * JD-Core Version:    0.6.2
 */