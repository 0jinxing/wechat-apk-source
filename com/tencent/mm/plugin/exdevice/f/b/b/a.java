package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.b.a.c;
import com.tencent.mm.plugin.exdevice.f.b.b;
import com.tencent.mm.protocal.protobuf.ach;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class a extends j<c>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(19502);
    fnj = new String[] { j.a(c.ccO, "HardDeviceRankFollowInfo") };
    AppMethodBeat.o(19502);
  }

  public a(e parame)
  {
    super(parame, c.ccO, "HardDeviceRankFollowInfo", null);
    AppMethodBeat.i(19490);
    this.bSd = parame;
    parame.hY("HardDeviceRankFollowInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankFollowRankIdAppNameIndex ON HardDeviceRankFollowInfo ( rankID, appusername )");
    AppMethodBeat.o(19490);
  }

  private boolean N(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = false;
    AppMethodBeat.i(19493);
    String str = String.format("select * from %s where %s=? and %s=? and %s=? limit 1", new Object[] { "HardDeviceRankFollowInfo", "rankID", "appusername", "username" });
    paramString1 = this.bSd.a(str, new String[] { bo.bc(paramString1, ""), bo.bc(paramString2, ""), bo.bc(paramString3, "") }, 2);
    if (paramString1 == null)
    {
      ab.e("MicroMsg.ExdeviceFollowInfoStg", "ap: check follow not in DB");
      AppMethodBeat.o(19493);
    }
    while (true)
    {
      return bool;
      bool = paramString1.moveToFirst();
      paramString1.close();
      ab.d("MicroMsg.ExdeviceFollowInfoStg", "checkUserIsFollow %s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(19493);
    }
  }

  private boolean O(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = true;
    AppMethodBeat.i(19499);
    paramString1 = a(new b(paramString1, paramString2, paramString3));
    if (paramString1 != null)
    {
      a(paramString1, new String[] { "rankID", "appusername", "username" });
      ab.d("MicroMsg.ExdeviceFollowInfoStg", "ap: update success");
      AppMethodBeat.o(19499);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(19499);
      bool = false;
    }
  }

  private boolean a(c paramc)
  {
    AppMethodBeat.i(19497);
    if (b(paramc))
      AppMethodBeat.o(19497);
    while (true)
    {
      return true;
      c(paramc);
      AppMethodBeat.o(19497);
    }
  }

  private boolean b(c paramc)
  {
    boolean bool1 = true;
    AppMethodBeat.i(19500);
    if (paramc != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      c localc = a(new b(paramc.field_rankID, paramc.field_appusername, paramc.field_username));
      if (localc == null)
        break label105;
      localc.field_step = paramc.field_step;
      c(localc, new String[] { "rankID", "appusername", "username" });
      ab.d("MicroMsg.ExdeviceFollowInfoStg", "ap: update success");
      AppMethodBeat.o(19500);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label105: AppMethodBeat.o(19500);
    }
  }

  private boolean c(c paramc)
  {
    AppMethodBeat.i(19501);
    if (paramc != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      b(paramc);
      ab.d("MicroMsg.ExdeviceFollowInfoStg", "ap: insert success");
      AppMethodBeat.o(19501);
      return true;
    }
  }

  public final boolean Kp(String paramString)
  {
    AppMethodBeat.i(19492);
    boolean bool = N("hardcode_rank_id", "hardcode_app_name", paramString);
    AppMethodBeat.o(19492);
    return bool;
  }

  public final boolean Kq(String paramString)
  {
    AppMethodBeat.i(19498);
    boolean bool = O("hardcode_rank_id", "hardcode_app_name", paramString);
    AppMethodBeat.o(19498);
    return bool;
  }

  public final c a(b paramb)
  {
    AppMethodBeat.i(19491);
    Object localObject = String.format("select *, rowid from %s where %s = ? and %s = ? and %s = ? limit 1", new Object[] { "HardDeviceRankFollowInfo", "rankID", "username", "appusername" });
    localObject = this.bSd.a((String)localObject, new String[] { bo.bc(paramb.lvL, ""), bo.bc(paramb.username, ""), bo.bc(paramb.appName, "") }, 2);
    if (localObject == null)
    {
      ab.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get no follow in DB");
      paramb = null;
      AppMethodBeat.o(19491);
      return paramb;
    }
    paramb = null;
    if (((Cursor)localObject).moveToFirst())
    {
      paramb = new c();
      paramb.d((Cursor)localObject);
    }
    while (true)
    {
      ((Cursor)localObject).close();
      AppMethodBeat.o(19491);
      break;
      ab.d("MicroMsg.ExdeviceFollowInfoStg", "ap: no record");
    }
  }

  public final void a(ArrayList<ach> paramArrayList, String paramString1, String paramString2)
  {
    AppMethodBeat.i(19495);
    if (paramArrayList != null)
    {
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        paramArrayList = (ach)localIterator.next();
        c localc = new c();
        localc.field_rankID = paramString1;
        localc.field_step = paramArrayList.hzv;
        localc.field_username = paramArrayList.username;
        localc.field_appusername = paramString2;
        a(localc);
      }
    }
    AppMethodBeat.o(19495);
  }

  public final ArrayList<c> bpk()
  {
    c localc = null;
    Object localObject1 = null;
    AppMethodBeat.i(19494);
    Object localObject2 = String.format("select *, rowid from %s where %s= ? and %s = ? order by rowid asc", new Object[] { "HardDeviceRankFollowInfo", "rankID", "appusername" });
    localObject2 = this.bSd.a((String)localObject2, new String[] { "hardcode_rank_id", "hardcode_app_name" }, 2);
    if (localObject2 == null)
    {
      ab.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get follows not in DB");
      AppMethodBeat.o(19494);
      return localObject1;
    }
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new ArrayList();
      do
      {
        localc = new c();
        localc.d((Cursor)localObject2);
        ab.d("MicroMsg.ExdeviceFollowInfoStg", "follow info: rowid: %s, info: %s", new Object[] { Integer.valueOf(((Cursor)localObject2).getColumnIndex("rowid")), localc.toString() });
        ((ArrayList)localObject1).add(localc);
      }
      while (((Cursor)localObject2).moveToNext());
      ab.d("MicroMsg.ExdeviceFollowInfoStg", "getAllFollowItem: %d, %s", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()), ((ArrayList)localObject1).toString() });
    }
    while (true)
    {
      ((Cursor)localObject2).close();
      AppMethodBeat.o(19494);
      break;
      ab.d("MicroMsg.ExdeviceFollowInfoStg", "ap: no record");
      localObject1 = localc;
    }
  }

  public final void by(List<c> paramList)
  {
    AppMethodBeat.i(19496);
    if ((bo.isNullOrNil("hardcode_rank_id")) || (bo.isNullOrNil("hardcode_app_name")))
      ab.e("MicroMsg.ExdeviceFollowInfoStg", "ap: delete follows,params is null");
    while (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (c)localIterator.next();
        paramList.field_rankID = "hardcode_rank_id";
        paramList.field_appusername = "hardcode_app_name";
        a(paramList);
      }
      ab.d("MicroMsg.ExdeviceFollowInfoStg", "ap: delete rankId: %s %s count %d", new Object[] { "hardcode_rank_id", "hardcode_app_name", Integer.valueOf(this.bSd.delete("HardDeviceRankFollowInfo", "rankID=? and appusername=?", new String[] { "hardcode_rank_id", "hardcode_app_name" })) });
    }
    AppMethodBeat.o(19496);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.b.b.a
 * JD-Core Version:    0.6.2
 */