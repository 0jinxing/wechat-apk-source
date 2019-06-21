package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.b.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import junit.framework.Assert;

public final class d extends j<com.tencent.mm.plugin.exdevice.f.b.a.d>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(19514);
    fnj = new String[] { j.a(com.tencent.mm.plugin.exdevice.f.b.a.d.ccO, "HardDeviceRankInfo") };
    AppMethodBeat.o(19514);
  }

  public d(e parame)
  {
    super(parame, com.tencent.mm.plugin.exdevice.f.b.a.d.ccO, "HardDeviceRankInfo", null);
    AppMethodBeat.i(19508);
    this.bSd = parame;
    parame.hY("HardDeviceRankInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankInfoRankIdAppNameIndex ON HardDeviceRankInfo ( rankID, appusername )");
    AppMethodBeat.o(19508);
  }

  private boolean c(com.tencent.mm.plugin.exdevice.f.b.a.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(19513);
    if (paramd != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      b(paramd);
      ab.d("MicroMsg.ExdeviceRankInfoStg", "hy: insert success");
      if (paramBoolean)
        ad.bpf().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(paramd.field_rankID, paramd.field_appusername, paramd.field_username));
      AppMethodBeat.o(19513);
      return true;
    }
  }

  public final com.tencent.mm.plugin.exdevice.f.b.a.d a(com.tencent.mm.plugin.exdevice.f.b.d paramd)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(19509);
    Object localObject3 = String.format("select *, rowid from %s where %s = ? and %s = ? limit 1", new Object[] { "HardDeviceRankInfo", "rankID", "username" });
    localObject3 = this.bSd.a((String)localObject3, new String[] { bo.bc(paramd.lvL, ""), bo.bc(paramd.username, "") }, 2);
    if (localObject3 == null)
    {
      ab.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
      AppMethodBeat.o(19509);
      paramd = localObject2;
      return paramd;
    }
    if (((Cursor)localObject3).moveToFirst())
    {
      paramd = new com.tencent.mm.plugin.exdevice.f.b.a.d();
      paramd.d((Cursor)localObject3);
    }
    while (true)
    {
      ((Cursor)localObject3).close();
      AppMethodBeat.o(19509);
      break;
      ab.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
      paramd = localObject1;
    }
  }

  public final boolean a(com.tencent.mm.plugin.exdevice.f.b.a.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(19511);
    if (b(paramd, paramBoolean))
      AppMethodBeat.o(19511);
    while (true)
    {
      return true;
      c(paramd, paramBoolean);
      AppMethodBeat.o(19511);
    }
  }

  public final boolean b(com.tencent.mm.plugin.exdevice.f.b.a.d paramd, boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(19512);
    boolean bool2;
    if (paramd != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      com.tencent.mm.plugin.exdevice.f.b.a.d locald = a(new com.tencent.mm.plugin.exdevice.f.b.d(paramd.field_rankID, paramd.field_appusername, paramd.field_username));
      if (locald == null)
        break label143;
      locald.field_likecount = paramd.field_likecount;
      locald.field_selfLikeState = paramd.field_selfLikeState;
      c(locald, new String[] { "rankID", "username" });
      ab.d("MicroMsg.ExdeviceRankInfoStg", "hy: update success");
      if (paramBoolean)
        ad.bpf().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(paramd.field_rankID, paramd.field_appusername, paramd.field_username));
      AppMethodBeat.o(19512);
    }
    for (paramBoolean = bool1; ; paramBoolean = false)
    {
      return paramBoolean;
      bool2 = false;
      break;
      label143: AppMethodBeat.o(19512);
    }
  }

  public final void g(String paramString, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList)
  {
    AppMethodBeat.i(19510);
    if ((bo.isNullOrNil(paramString)) || (paramArrayList == null))
    {
      ab.w("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo failed, rank id is null or nil or data is null.");
      AppMethodBeat.o(19510);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo, rankId(%s) , size(%d).", new Object[] { paramString, Integer.valueOf(paramArrayList.size()) });
      for (int i = 0; i < paramArrayList.size(); i++)
        a((com.tencent.mm.plugin.exdevice.f.b.a.d)paramArrayList.get(i), false);
      ad.bpf().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(paramString, null, null));
      AppMethodBeat.o(19510);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.b.b.d
 * JD-Core Version:    0.6.2
 */