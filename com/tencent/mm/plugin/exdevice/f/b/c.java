package com.tencent.mm.plugin.exdevice.f.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.f.a.j;
import com.tencent.mm.plugin.exdevice.f.a.l;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.ai.f
{
  public f lwf;
  public com.tencent.mm.plugin.exdevice.f.a.f lwg;

  public c()
  {
    AppMethodBeat.i(19478);
    ab.d("MicroMsg.ExdeviceRankInfoManager", "hy: constructing manager....");
    aw.Rg().a(1042, this);
    aw.Rg().a(1041, this);
    aw.Rg().a(1043, this);
    aw.Rg().a(1040, this);
    AppMethodBeat.o(19478);
  }

  public static ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> Kn(String paramString)
  {
    Object localObject1 = null;
    com.tencent.mm.plugin.exdevice.f.b.a.d locald = null;
    AppMethodBeat.i(19480);
    ab.d("MicroMsg.ExdeviceRankInfoManager", "hy: getting like info...");
    com.tencent.mm.plugin.exdevice.f.b.b.d locald1;
    if (!bo.isNullOrNil(paramString))
    {
      locald1 = ad.boX();
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.ExdeviceRankInfoStg", "hy: param error");
        AppMethodBeat.o(19480);
        paramString = locald;
      }
    }
    while (true)
    {
      return paramString;
      Object localObject2 = String.format("select *, rowid from %s where %s = ? order by %s desc", new Object[] { "HardDeviceRankInfo", "rankID", "score" });
      localObject2 = locald1.bSd.a((String)localObject2, new String[] { bo.bc(paramString, "") }, 2);
      if (localObject2 == null)
      {
        ab.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
        AppMethodBeat.o(19480);
        paramString = locald;
      }
      else
      {
        if (((Cursor)localObject2).moveToFirst())
        {
          paramString = new ArrayList();
          do
          {
            locald = new com.tencent.mm.plugin.exdevice.f.b.a.d();
            locald.d((Cursor)localObject2);
            paramString.add(locald);
          }
          while (((Cursor)localObject2).moveToNext());
        }
        while (true)
        {
          ((Cursor)localObject2).close();
          AppMethodBeat.o(19480);
          break;
          ab.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
          paramString = localObject1;
        }
        ab.w("MicroMsg.ExdeviceRankInfoManager", "hy: param error");
        AppMethodBeat.o(19480);
        paramString = locald;
      }
    }
  }

  public static void d(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(19479);
    aw.Rg().a(new l(paramString3, paramString2, paramInt, paramString1), 0);
    AppMethodBeat.o(19479);
  }

  public static void f(String paramString, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList)
  {
    AppMethodBeat.i(19481);
    com.tencent.mm.plugin.exdevice.f.b.b.d locald = ad.boX();
    if (!bo.isNullOrNil(paramString));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if (paramArrayList == null)
        break label218;
      String str = String.format("select COUNT(*) from %s where %s = ?", new Object[] { "HardDeviceRankInfo", "rankID" });
      paramString = locald.bSd.a(str, new String[] { bo.bc(paramString, "") }, 2);
      if (paramString != null)
        break;
      ab.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
      i = 0;
      if (i != 0)
        break label177;
      paramString = paramArrayList.iterator();
      while (paramString.hasNext())
        locald.a((com.tencent.mm.plugin.exdevice.f.b.a.d)paramString.next(), false);
    }
    if (paramString.moveToFirst());
    for (int i = paramString.getInt(0); ; i = 0)
    {
      paramString.close();
      break;
      ab.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
    }
    AppMethodBeat.o(19481);
    while (true)
    {
      return;
      label177: paramString = paramArrayList.iterator();
      while (paramString.hasNext())
        locald.b((com.tencent.mm.plugin.exdevice.f.b.a.d)paramString.next(), false);
      AppMethodBeat.o(19481);
      continue;
      label218: ab.w("MicroMsg.ExdeviceRankInfoStg", "hy: data is null. abort insert");
      AppMethodBeat.o(19481);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(19482);
    ab.d("MicroMsg.ExdeviceRankInfoManager", "hy: netscene back.err type: %d, err code: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramm instanceof j))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break label116;
      ab.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error.");
      AppMethodBeat.o(19482);
    }
    while (true)
    {
      return;
      if ((paramm instanceof l))
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
          AppMethodBeat.o(19482);
        }
      }
      else
      {
        if (((paramm instanceof com.tencent.mm.plugin.exdevice.f.a.m)) && ((paramInt1 != 0) || (paramInt2 != 0)))
          ab.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
        label116: AppMethodBeat.o(19482);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.b.c
 * JD-Core Version:    0.6.2
 */