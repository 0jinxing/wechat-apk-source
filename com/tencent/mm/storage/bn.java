package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class bn extends j<bm>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(80292);
    fnj = new String[] { j.a(bm.ccO, "NewTipsInfo") };
    AppMethodBeat.o(80292);
  }

  public bn(e parame)
  {
    super(parame, bm.ccO, "NewTipsInfo", null);
    this.bSd = parame;
  }

  public final bm Ms(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(80289);
    if (this.bSd == null)
    {
      ab.e("MicroMsg.NewTipsInfoStorage", "getByTipsId, but db is null, return");
      AppMethodBeat.o(80289);
    }
    while (true)
    {
      return localObject;
      Cursor localCursor = this.bSd.a("NewTipsInfo", null, "tipId=?", new String[] { String.valueOf(paramInt) }, null, null, null, 2);
      if (localCursor.moveToFirst())
      {
        bm localbm = new bm();
        try
        {
          localbm.d(localCursor);
          localCursor.close();
          AppMethodBeat.o(80289);
          localObject = localbm;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.NewTipsInfoStorage", "getByTipsId convertFrom(cu) cause IlleagalStateException, return null");
          localCursor.close();
          AppMethodBeat.o(80289);
        }
      }
      else
      {
        ab.w("MicroMsg.NewTipsInfoStorage", "getByTipsId:%d, no data", new Object[] { Integer.valueOf(paramInt) });
        localCursor.close();
        AppMethodBeat.o(80289);
      }
    }
  }

  public final boolean a(bm parambm, String[] paramArrayOfString)
  {
    boolean bool = false;
    AppMethodBeat.i(80288);
    if (parambm == null)
    {
      ab.e("MicroMsg.NewTipsInfoStorage", "NewTipsInfo is null!");
      AppMethodBeat.o(80288);
    }
    while (true)
    {
      return bool;
      bool = super.b(parambm, false, paramArrayOfString);
      if (bool)
        b(parambm.field_tipId, 3, Integer.valueOf(parambm.field_tipId));
      ab.d("MicroMsg.NewTipsInfoStorage", "update result[%B]", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(80288);
    }
  }

  public final boolean f(bm parambm)
  {
    boolean bool = false;
    AppMethodBeat.i(80287);
    if (parambm == null)
    {
      ab.e("MicroMsg.NewTipsInfoStorage", "NewTipsInfo is null!");
      AppMethodBeat.o(80287);
    }
    while (true)
    {
      return bool;
      if (parambm.field_tipId <= 0)
      {
        ab.e("MicroMsg.NewTipsInfoStorage", "newTipsId is error, tipsId = %s", new Object[] { Integer.valueOf(parambm.field_tipId) });
        AppMethodBeat.o(80287);
      }
      else
      {
        bool = a(parambm, false);
        if (bool)
          b(parambm.field_tipId, 2, Integer.valueOf(parambm.field_tipId));
        AppMethodBeat.o(80287);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bn
 * JD-Core Version:    0.6.2
 */