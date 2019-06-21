package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class al extends j<ak>
{
  public static final String[] fnj;
  e bSd;

  static
  {
    AppMethodBeat.i(87929);
    fnj = new String[] { j.a(ak.ccO, "PendingCardId") };
    AppMethodBeat.o(87929);
  }

  public al(e parame)
  {
    super(parame, ak.ccO, "PendingCardId", null);
    this.bSd = parame;
  }

  public final List<ak> baU()
  {
    AppMethodBeat.i(87928);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.bSd.a("select * from PendingCardId where retryCount < 10", null, 2);
    while (localCursor.moveToNext())
    {
      ak localak = new ak();
      localak.d(localCursor);
      localArrayList.add(localak);
    }
    localCursor.close();
    ab.d("MicroMsg.PendingCardIdInfoStorage", "getAll, count = %d", new Object[] { Integer.valueOf(localArrayList.size()) });
    AppMethodBeat.o(87928);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.al
 * JD-Core Version:    0.6.2
 */