package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.b.a;
import com.tencent.mm.plugin.exdevice.f.b.d;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;

public final class e extends j<com.tencent.mm.plugin.exdevice.f.b.a.e>
{
  public static final String[] fnj;
  private com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(19518);
    fnj = new String[] { j.a(com.tencent.mm.plugin.exdevice.f.b.a.e.ccO, "HardDeviceLikeUser") };
    AppMethodBeat.o(19518);
  }

  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, com.tencent.mm.plugin.exdevice.f.b.a.e.ccO, "HardDeviceLikeUser", null);
    AppMethodBeat.i(19515);
    this.bSd = parame;
    parame.hY("HardDeviceLikeUser", "CREATE INDEX IF NOT EXISTS ExdeviceRankLikeInfoRankIdAppNameIndex ON HardDeviceLikeUser ( rankID, appusername )");
    AppMethodBeat.o(19515);
  }

  public final ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.e> Ks(String paramString)
  {
    Object localObject1 = null;
    com.tencent.mm.plugin.exdevice.f.b.a.e locale = null;
    AppMethodBeat.i(19516);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ExdeviceRankLikeUserStg", "hy: param error");
      AppMethodBeat.o(19516);
      paramString = locale;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = String.format("select *, rowid from %s where %s = ? order by %s desc", new Object[] { "HardDeviceLikeUser", "rankID", "timestamp" });
      localObject2 = this.bSd.a((String)localObject2, new String[] { bo.bc(paramString, "") }, 2);
      if (localObject2 == null)
      {
        ab.e("MicroMsg.ExdeviceRankLikeUserStg", "Get no rank in DB");
        AppMethodBeat.o(19516);
        paramString = locale;
      }
      else
      {
        paramString = localObject1;
        if (((Cursor)localObject2).moveToFirst())
        {
          paramString = new ArrayList();
          do
          {
            locale = new com.tencent.mm.plugin.exdevice.f.b.a.e();
            locale.d((Cursor)localObject2);
            paramString.add(locale);
          }
          while (((Cursor)localObject2).moveToNext());
        }
        ((Cursor)localObject2).close();
        AppMethodBeat.o(19516);
      }
    }
  }

  public final void a(String paramString1, String paramString2, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.e> paramArrayList)
  {
    AppMethodBeat.i(19517);
    boolean bool;
    if (!bo.isNullOrNil(paramString1))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramArrayList != null)
        break label45;
      ab.i("MicroMsg.ExdeviceRankLikeUserStg", "batchInsertOrUpdate failed, data is null.");
      AppMethodBeat.o(19517);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label45: paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        com.tencent.mm.plugin.exdevice.f.b.a.e locale = (com.tencent.mm.plugin.exdevice.f.b.a.e)paramArrayList.next();
        if (locale != null);
        for (bool = true; ; bool = false)
        {
          Assert.assertTrue(bool);
          if (!c(locale, new String[] { "rankID", "username" }))
            break label122;
          ab.d("MicroMsg.ExdeviceRankLikeUserStg", "hy: update success");
          break;
        }
        label122: if (b(locale))
          ab.d("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert success");
        else
          ab.w("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert or update failed");
      }
      ad.bpf().a("HardDeviceLikeUser", new d(paramString1, paramString2, null));
      AppMethodBeat.o(19517);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.b.b.e
 * JD-Core Version:    0.6.2
 */