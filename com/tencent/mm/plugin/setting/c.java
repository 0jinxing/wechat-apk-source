package com.tencent.mm.plugin.setting;

import android.annotation.SuppressLint;
import android.support.v4.app.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bx;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.bko;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class c
  implements at
{
  private n.b qju;
  private bz.a qjv;
  private o qjw;
  private bz.a qjx;
  private o qjy;

  public c()
  {
    AppMethodBeat.i(126830);
    this.qju = new c.1(this);
    this.qjv = new c.2(this);
    this.qjw = new c.3(this);
    this.qjx = new c.4(this);
    this.qjy = new c.5(this);
    ab.i("MicroMsg.SubCoreSetting", "SubCoreSetting constructor: " + System.currentTimeMillis());
    AppMethodBeat.o(126830);
  }

  static void ciq()
  {
    AppMethodBeat.i(126835);
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xRF, Long.valueOf(0L));
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xRG, "");
    com.tencent.mm.x.c.PK().y(262157, false);
    AppMethodBeat.o(126835);
  }

  @SuppressLint({"UseSparseArrays"})
  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
    AppMethodBeat.i(126833);
    ab.i("MicroMsg.SubCoreSetting", "SubCoreSetting onSdcardMount: " + System.currentTimeMillis());
    AppMethodBeat.o(126833);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(126832);
    ab.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountPostReset: " + System.currentTimeMillis());
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a("redpointinfo", this.qjv, true);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a("crowdtest", this.qjx, true);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a("showtrustedfriends", this.qjw);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a("DeviceProtectRedSpot", this.qjy);
    int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xRE, Integer.valueOf(d.vxo))).intValue();
    long l = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xRF, Long.valueOf(0L))).longValue();
    if ((i <= d.vxo) || (l < System.currentTimeMillis()))
      ciq();
    if (paramBoolean)
    {
      i = r.YK();
      com.tencent.mm.kernel.g.RP().Ry().set(34, Integer.valueOf(i & 0xFFEFFFFF & 0xFFBFFFFF));
      Object localObject1 = new bko();
      ((bko)localObject1).vCi = 1048576;
      ((bko)localObject1).wNJ = 0;
      ((j)com.tencent.mm.kernel.g.K(j.class)).XL().c(new j.a(39, (com.tencent.mm.bt.a)localObject1));
      localObject1 = new bko();
      ((bko)localObject1).vCi = 4194304;
      ((bko)localObject1).wNJ = 0;
      ((j)com.tencent.mm.kernel.g.K(j.class)).XL().c(new j.a(39, (com.tencent.mm.bt.a)localObject1));
      ab.i("MicroMsg.SubCoreSetting", "set void default open");
      if (!y.L(ah.getContext()).areNotificationsEnabled())
      {
        ab.w("MicroMsg.SubCoreSetting", "sys notification disable！");
        h.pYm.a(500L, 18L, 1L, false);
      }
      ab.i("MicroMsg.SubCoreSetting", "is update from %s", new Object[] { Integer.valueOf(com.tencent.mm.kernel.g.RN().eIR.eKf) });
      Object localObject2 = bx.fnB.aat();
      if (((Set)localObject2).size() == 2)
      {
        localObject1 = new String[2];
        localObject2 = ((Set)localObject2).iterator();
        for (i = 0; ((Iterator)localObject2).hasNext(); i++)
        {
          String str = (String)((Iterator)localObject2).next();
          localObject1[i] = bx.fnB.getString(str, "login_user_name");
        }
        if ((!bo.Q(new String[] { localObject1[0], localObject1[1] })) && (localObject1[0].equals(localObject1[1])))
        {
          ab.w("MicroMsg.SubCoreSetting", "old dirty data!!!");
          bx.fnB.oK(localObject1[0]);
          bx.fnB.oK(localObject1[1]);
        }
      }
    }
    if ((com.tencent.mm.m.g.Nu().getInt("ShowTurnOnFriendVerificationSysmsgSwitch", 0) == 1) && ((r.YD() & 0x20) == 0))
      ((j)com.tencent.mm.kernel.g.K(j.class)).XM().a(this.qju);
    AppMethodBeat.o(126832);
  }

  public final void iy(int paramInt)
  {
    AppMethodBeat.i(126831);
    ab.i("MicroMsg.SubCoreSetting", "SubCoreSetting clearPluginData: " + System.currentTimeMillis());
    AppMethodBeat.o(126831);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(126834);
    ab.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountRelease: " + System.currentTimeMillis());
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("redpointinfo", this.qjv, true);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("crowdtest", this.qjx, true);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("showtrustedfriends", this.qjw);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("DeviceProtectRedSpot", this.qjy);
    ((j)com.tencent.mm.kernel.g.K(j.class)).XM().b(this.qju);
    AppMethodBeat.o(126834);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.c
 * JD-Core Version:    0.6.2
 */