package com.tencent.mm.plugin.fav.b.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;

final class b$d extends com.tencent.mm.plugin.fts.a.a.a
{
  private long mgM;
  private int mgO;

  private b$d(b paramb, long paramLong)
  {
    this.mgM = paramLong;
  }

  public final String aAo()
  {
    AppMethodBeat.i(5308);
    String str = String.format("{favItemId: %d transactionCount: %d}", new Object[] { Long.valueOf(this.mgM), Integer.valueOf(this.mgO) });
    AppMethodBeat.o(5308);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(5307);
    if (this.mgH.mgF == null)
    {
      ab.e("MicroMsg.FTS.FTS5SearchFavoriteLogic", "InsertFavItemTask: fav db is null");
      AppMethodBeat.o(5307);
    }
    while (true)
    {
      return true;
      ab.d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "start to insert favorite item");
      Cursor localCursor1 = this.mgH.mgF.a("SELECT localId, type, updateTime, fromUser, favProto, tagProto FROM FavItemInfo WHERE localId = ? AND flag <> -1;", new String[] { String.valueOf(this.mgM) }, 2);
      Cursor localCursor2 = localCursor1;
      Cursor localCursor3 = localCursor1;
      Object localObject2 = localCursor1;
      try
      {
        if (localCursor1.moveToFirst())
        {
          localCursor3 = localCursor1;
          localObject2 = localCursor1;
          b.c localc = new com/tencent/mm/plugin/fav/b/a/b$c;
          localCursor3 = localCursor1;
          localObject2 = localCursor1;
          localc.<init>(this.mgH, (byte)0);
          localCursor3 = localCursor1;
          localObject2 = localCursor1;
          localc.d(localCursor1);
          localCursor3 = localCursor1;
          localObject2 = localCursor1;
          localCursor1.close();
          localCursor1 = null;
          Object localObject3 = null;
          localCursor2 = null;
          localCursor3 = localCursor1;
          localObject2 = localObject3;
          this.mgH.mgE.beginTransaction();
          localCursor3 = localCursor1;
          localObject2 = localObject3;
          long l = this.mgM;
          localCursor3 = localCursor1;
          localObject2 = localObject3;
          this.mgH.mgE.c(c.mCd, l);
          localCursor3 = localCursor1;
          localObject2 = localObject3;
          this.mgO = b.a(this.mgH, localc);
          localCursor3 = localCursor1;
          localObject2 = localObject3;
          this.mgH.mgE.commit();
        }
        if (localCursor2 != null)
          localCursor2.close();
        AppMethodBeat.o(5307);
      }
      catch (Exception localException)
      {
        localObject2 = localCursor3;
        AppMethodBeat.o(5307);
        localObject2 = localCursor3;
        throw localException;
      }
      finally
      {
        if (localObject2 != null)
          ((Cursor)localObject2).close();
        AppMethodBeat.o(5307);
      }
    }
  }

  public final String getName()
  {
    return "InsertFavItemTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.a.b.d
 * JD-Core Version:    0.6.2
 */