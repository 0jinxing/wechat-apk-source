package com.tencent.mm.plugin.fav.b.f;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.s;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class b extends j<com.tencent.mm.plugin.fav.a.e>
  implements s
{
  private com.tencent.mm.sdk.e.e bSd;

  public b(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, com.tencent.mm.plugin.fav.a.e.ccO, "FavConfigInfo", null);
    this.bSd = parame;
  }

  private com.tencent.mm.plugin.fav.a.e bvt()
  {
    AppMethodBeat.i(5423);
    com.tencent.mm.plugin.fav.a.e locale = new com.tencent.mm.plugin.fav.a.e();
    ab.d("MicroMsg.FavConfigStorage", "get fav config sql %s", new Object[] { "select * from FavConfigInfo where configId = 8216" });
    Cursor localCursor = this.bSd.a("select * from FavConfigInfo where configId = 8216", null, 2);
    if (localCursor != null)
    {
      if (localCursor.moveToFirst())
        locale.d(localCursor);
      localCursor.close();
    }
    AppMethodBeat.o(5423);
    return locale;
  }

  public final void aV(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(5422);
    com.tencent.mm.plugin.fav.a.e locale = bvt();
    boolean bool;
    if (8216 == locale.field_configId)
    {
      locale.field_value = bo.cd(paramArrayOfByte);
      bool = c(locale, new String[0]);
      ab.i("MicroMsg.FavConfigStorage", "update sync key: %s, result %B", new Object[] { locale.field_value, Boolean.valueOf(bool) });
      AppMethodBeat.o(5422);
    }
    while (true)
    {
      return;
      locale.field_configId = 8216;
      locale.field_value = bo.cd(paramArrayOfByte);
      bool = b(locale);
      ab.i("MicroMsg.FavConfigStorage", "insert sync key: %s, result %B", new Object[] { locale.field_value, Boolean.valueOf(bool) });
      AppMethodBeat.o(5422);
    }
  }

  public final byte[] buP()
  {
    AppMethodBeat.i(5424);
    Object localObject = bvt();
    if (8216 != ((com.tencent.mm.plugin.fav.a.e)localObject).field_configId)
    {
      ab.w("MicroMsg.FavConfigStorage", "get sync key from fav db fail, try to load from mmdb");
      g.RQ();
      if (((Boolean)g.RP().Ry().get(8224, Boolean.FALSE)).booleanValue())
        ab.w("MicroMsg.FavConfigStorage", "get sync from mmdb fail, has trans");
    }
    else
    {
      ab.i("MicroMsg.FavConfigStorage", "get sync key, id %d, value %s", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.fav.a.e)localObject).field_configId), ((com.tencent.mm.plugin.fav.a.e)localObject).field_value });
      localObject = bo.anf(((com.tencent.mm.plugin.fav.a.e)localObject).field_value);
      AppMethodBeat.o(5424);
    }
    while (true)
    {
      return localObject;
      g.RQ();
      localObject = bo.nullAsNil((String)g.RP().Ry().get(8216, ""));
      ab.i("MicroMsg.FavConfigStorage", "get sync key(%s) from mmdb, do update fav sync key", new Object[] { localObject });
      localObject = bo.anf((String)localObject);
      aV((byte[])localObject);
      ab.w("MicroMsg.FavConfigStorage", "set fav sync key has trans");
      g.RQ();
      g.RP().Ry().set(8224, Boolean.TRUE);
      AppMethodBeat.o(5424);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.f.b
 * JD-Core Version:    0.6.2
 */