package com.tencent.mm.plugin.fav.b.f;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.f;
import com.tencent.mm.plugin.fav.a.t;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class c extends j<f>
  implements t
{
  private e bSd;

  public c(e parame)
  {
    super(parame, f.ccO, "FavEditInfo", null);
    AppMethodBeat.i(5425);
    this.bSd = parame;
    this.bSd.hY("FavEditInfo", "CREATE INDEX IF NOT EXISTS IndexLocalId_Type ON FavEditInfo(localId,type);");
    AppMethodBeat.o(5425);
  }

  public final List<f> buQ()
  {
    Object localObject1 = null;
    AppMethodBeat.i(5428);
    Object localObject2 = this.bSd.a("select count(*) from FavEditInfo", null, 2);
    if (localObject2 == null)
    {
      ab.e("MicroMsg.Fav.FavEditInfoStorage", "count all edit info, cursor is null");
      AppMethodBeat.o(5428);
    }
    while (true)
    {
      return localObject1;
      try
      {
        if (((Cursor)localObject2).moveToFirst())
          ab.i("MicroMsg.Fav.FavEditInfoStorage", "get all edit infos, count %d", new Object[] { Integer.valueOf(((Cursor)localObject2).getInt(0)) });
        ((Cursor)localObject2).close();
        Cursor localCursor = this.bSd.a("select * from FavEditInfo", null, 2);
        if (localCursor != null)
          break label135;
        AppMethodBeat.o(5428);
      }
      catch (Exception localException2)
      {
        ab.printErrStackTrace("MicroMsg.Fav.FavEditInfoStorage", localException2, "", new Object[0]);
        ((Cursor)localObject2).close();
        AppMethodBeat.o(5428);
      }
      continue;
      label135: localObject2 = new ArrayList();
      try
      {
        if (localException2.moveToFirst())
        {
          boolean bool;
          do
          {
            f localf = new com/tencent/mm/plugin/fav/a/f;
            localf.<init>();
            localf.d(localException2);
            ((List)localObject2).add(localf);
            bool = localException2.moveToNext();
          }
          while (bool);
        }
        localException2.close();
        AppMethodBeat.o(5428);
        localObject1 = localObject2;
      }
      catch (Exception localException1)
      {
        ab.printErrStackTrace("MicroMsg.Fav.FavEditInfoStorage", localException1, "", new Object[0]);
        localException2.close();
        AppMethodBeat.o(5428);
      }
    }
  }

  public final f iD(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(5426);
    Cursor localCursor = this.bSd.a("select * from FavEditInfo where localId =  ? and type =  ?", new String[] { String.valueOf(paramLong), "0" }, 2);
    if (localCursor == null)
      AppMethodBeat.o(5426);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (localCursor.moveToFirst())
      {
        localObject2 = new f();
        ((f)localObject2).d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(5426);
    }
  }

  public final void s(long paramLong, int paramInt)
  {
    AppMethodBeat.i(5427);
    this.bSd.delete("FavEditInfo", "localId=? and type=?", new String[] { String.valueOf(paramLong), String.valueOf(paramInt) });
    AppMethodBeat.o(5427);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.f.c
 * JD-Core Version:    0.6.2
 */