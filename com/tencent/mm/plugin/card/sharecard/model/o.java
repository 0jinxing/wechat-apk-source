package com.tencent.mm.plugin.card.sharecard.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class o extends j<n>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(88088);
    fnj = new String[] { j.a(n.ccO, "ShareCardSyncItemInfo") };
    AppMethodBeat.o(88088);
  }

  public o(e parame)
  {
    super(parame, n.ccO, "ShareCardSyncItemInfo", null);
    this.bSd = parame;
  }

  public final List<n> baU()
  {
    AppMethodBeat.i(88087);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.bSd.a("select * from ShareCardSyncItemInfo where retryCount < 10", null, 2);
    while (localCursor.moveToNext())
    {
      n localn = new n();
      localn.d(localCursor);
      localArrayList.add(localn);
    }
    localCursor.close();
    ab.d("MicroMsg.ShareCardSyncItemInfoStorage", "getAll, share card count = %d", new Object[] { Integer.valueOf(localArrayList.size()) });
    AppMethodBeat.o(88087);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.o
 * JD-Core Version:    0.6.2
 */