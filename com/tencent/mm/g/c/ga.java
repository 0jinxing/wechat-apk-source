package com.tencent.mm.g.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import junit.framework.Assert;

public final class ga extends h
{
  private static HashMap<Integer, h.d> eaA;
  private static ga eaz;

  static
  {
    AppMethodBeat.i(51352);
    eaz = null;
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("FavItemInfo".hashCode()), new ga.1());
    eaA.put(Integer.valueOf("FavSearchInfo".hashCode()), new ga.2());
    eaA.put(Integer.valueOf("FavEditInfo".hashCode()), new ga.3());
    eaA.put(Integer.valueOf("FavCdnInfo".hashCode()), new ga.4());
    eaA.put(Integer.valueOf("FavConfigInfo".hashCode()), new ga.5());
    AppMethodBeat.o(51352);
  }

  private ga()
  {
    AppMethodBeat.i(51349);
    long l1 = System.currentTimeMillis();
    g.RN();
    if (a.QF() != 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      localObject = g.RP().cachePath + "enFavorite.db";
      ab.d("MicroMsg.FavoriteDataBase", "db path", new Object[] { localObject });
      g.RN();
      long l2 = a.QF();
      q.LK();
      if (a("", (String)localObject, l2, eaA))
        break;
      localObject = new com.tencent.mm.model.b((byte)0);
      AppMethodBeat.o(51349);
      throw ((Throwable)localObject);
    }
    Object localObject = this.ybS;
    if (!bo.isNullOrNil((String)localObject))
    {
      ab.e("MicroMsg.FavoriteDataBase", "dbinit failed :".concat(String.valueOf(localObject)));
      com.tencent.mm.sdk.a.b.A("init db Favorite Failed: [ " + (String)localObject + "]", "DBinit");
    }
    ab.d("MicroMsg.FavoriteDataBase", "init db Favorite time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(51349);
  }

  public static ga HI()
  {
    AppMethodBeat.i(51350);
    if (eaz == null)
      eaz = new ga();
    ga localga = eaz;
    AppMethodBeat.o(51350);
    return localga;
  }

  public final void jC(String paramString)
  {
    AppMethodBeat.i(51351);
    super.jC(paramString);
    eaz = null;
    AppMethodBeat.o(51351);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ga
 * JD-Core Version:    0.6.2
 */