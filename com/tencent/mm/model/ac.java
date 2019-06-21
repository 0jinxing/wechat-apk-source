package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public final class ac
{
  public static void Zr()
  {
    AppMethodBeat.i(16275);
    Cursor localCursor = c.XM().dsu();
    if (localCursor == null);
    for (int i = 0; ; i = localCursor.getCount())
    {
      ab.i("MicroMsg.HardCodeUpdateTask", "[unstarAllBizContactFor50] size:%s", new Object[] { Integer.valueOf(i) });
      if (localCursor.moveToFirst())
        do
        {
          ad localad = new ad();
          localad.d(localCursor);
          localad.NN();
          c.XM().b(localad.field_username, localad);
        }
        while (localCursor.moveToNext());
      localCursor.close();
      AppMethodBeat.o(16275);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ac
 * JD-Core Version:    0.6.2
 */