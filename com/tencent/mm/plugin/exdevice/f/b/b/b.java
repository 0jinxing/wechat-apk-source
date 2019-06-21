package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.b.d;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class b extends j<com.tencent.mm.plugin.exdevice.f.b.a.a>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(19506);
    fnj = new String[] { j.a(com.tencent.mm.plugin.exdevice.f.b.a.a.ccO, "HardDeviceChampionInfo") };
    AppMethodBeat.o(19506);
  }

  public b(e parame)
  {
    super(parame, com.tencent.mm.plugin.exdevice.f.b.a.a.ccO, "HardDeviceChampionInfo", null);
    AppMethodBeat.i(19503);
    this.bSd = parame;
    parame.hY("HardDeviceChampionInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankChampionInfoRankIdAppNameIndex ON HardDeviceChampionInfo ( username )");
    AppMethodBeat.o(19503);
  }

  public final com.tencent.mm.plugin.exdevice.f.b.a.a Kr(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(19504);
    Object localObject3 = String.format("select *, rowid from %s where %s = ? limit 1", new Object[] { "HardDeviceChampionInfo", "username" });
    localObject3 = this.bSd.a((String)localObject3, new String[] { bo.bc(paramString, "") }, 2);
    if (localObject3 == null)
    {
      ab.e("MicroMsg.ExdeviceRankChampionStg", "Get no rank in DB");
      AppMethodBeat.o(19504);
      paramString = localObject2;
      return paramString;
    }
    if (((Cursor)localObject3).moveToFirst())
    {
      paramString = new com.tencent.mm.plugin.exdevice.f.b.a.a();
      paramString.d((Cursor)localObject3);
    }
    while (true)
    {
      ((Cursor)localObject3).close();
      AppMethodBeat.o(19504);
      break;
      ab.d("MicroMsg.ExdeviceRankChampionStg", "hy: no record");
      paramString = localObject1;
    }
  }

  public final boolean a(com.tencent.mm.plugin.exdevice.f.b.a.a parama)
  {
    boolean bool1 = true;
    AppMethodBeat.i(19505);
    boolean bool2;
    if (parama != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (!c(parama, new String[] { "username" }))
        break label78;
      ab.d("MicroMsg.ExdeviceRankChampionStg", "hy: update success");
      ad.bpf().a("HardDeviceChampionInfo", new d(null, null, parama.field_username));
      AppMethodBeat.o(19505);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label78: if (b(parama))
      {
        ab.d("MicroMsg.ExdeviceRankChampionStg", "hy: insert success");
        ad.bpf().a("HardDeviceChampionInfo", new d(null, null, parama.field_username));
        AppMethodBeat.o(19505);
        bool2 = bool1;
      }
      else
      {
        ab.w("MicroMsg.ExdeviceRankChampionStg", "hy: insert or update failed");
        AppMethodBeat.o(19505);
        bool2 = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.b.b.b
 * JD-Core Version:    0.6.2
 */