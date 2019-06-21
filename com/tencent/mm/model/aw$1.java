package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;

final class aw$1
  implements c.a
{
  aw$1(aw paramaw)
  {
  }

  public final void cx(boolean paramBoolean)
  {
    AppMethodBeat.i(16276);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMCore", "summeranrt2 onAccountPostReset tid:%d stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), bo.dpG() });
    aw.b(this.flP);
    long l1 = System.currentTimeMillis();
    aw.ZK();
    long l2 = c.Ru().iV(Thread.currentThread().getId());
    aw.a(this.flP);
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMCore", "[doAccountPostReset] updated is true");
      c.XM().aoU("readerapp");
      c.Ry().set(256, Boolean.TRUE);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMCore", "[doAccountPostReset] begin to updated HardCodeUpdate");
      localObject1 = t.Zm();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.HardCodeUpdateTask", "[updateHelperIndexFor50] size:%s", new Object[] { Integer.valueOf(((List)localObject1).size()) });
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ad)((Iterator)localObject1).next();
        if ((localObject2 != null) && ((int)((a)localObject2).ewQ != 0) && (((ap)localObject2).field_showHead == 32))
        {
          ((ad)localObject2).hu(((ad)localObject2).Ny());
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.HardCodeUpdateTask", "contact to updatefavour " + ((ap)localObject2).field_username);
          aw.ZK();
          c.XM().b(((ap)localObject2).field_username, (ad)localObject2);
        }
      }
      for (localObject2 : t.fkY)
      {
        localObject1 = c.XM().aoO((String)localObject2);
        if ((localObject1 != null) && (((int)((a)localObject1).ewQ != 0) || (a.jh(((ap)localObject1).field_type))))
        {
          ((ad)localObject1).NK();
          c.XM().b((String)localObject2, (ad)localObject1);
        }
      }
      ac.Zr();
      bh.oG("ver" + d.vxo);
    }
    new ab(aw.a(this.flP));
    if (paramBoolean)
    {
      ab.x(c.XM().aoO("filehelper"));
      localObject2 = r.Yz();
      if (!bo.isNullOrNil((String)localObject2))
      {
        localObject1 = c.XM().aoO((String)localObject2);
        if ((int)((a)localObject1).ewQ != 0)
          break label1330;
        ((ad)localObject1).setUsername((String)localObject2);
        ((ad)localObject1).NB();
        aw.ZK();
        c.XM().Z((ad)localObject1);
      }
      ab.a(paramBoolean, "qqmail", false);
      ab.a(paramBoolean, "floatbottle", false);
      ab.a(paramBoolean, "shakeapp", false);
      ab.a(paramBoolean, "lbsapp", false);
      ab.a(paramBoolean, "medianote", false);
      ab.a(paramBoolean, "newsapp", true);
      c.XR().aoX("blogapp");
      c.XO().Rh("blogapp");
      c.XM().aoU("blogapp");
      ab.a(paramBoolean, "facebookapp", true);
      ab.a(paramBoolean, "qqfriend", false);
      ab.a(paramBoolean, "masssendapp", true);
      ab.a(paramBoolean, "feedsapp", true);
      c.XR().aoX("tmessage");
      c.XM().aoU("tmessage");
      ??? = c.XM().aoO("voip");
      localObject2 = c.XM().aoO("voipapp");
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = new ad();
      if ((??? != null) && ((int)((a)???).ewQ != 0))
        c.XM().aoU("voip");
      if ((int)((a)localObject1).ewQ != 0)
        break label1366;
      ((ad)localObject1).setUsername("voipapp");
      ((ad)localObject1).NB();
      ab.y((ad)localObject1);
      ((ad)localObject1).hz(4);
      ((ad)localObject1).NK();
      c.XM().aa((ad)localObject1);
      label727: localObject2 = c.XM().aoO("officialaccounts");
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = new ad();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.HardCodeHelper", "hardcodeOfficialAccounts:update[%B], contactID[%d]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf((int)((a)localObject1).ewQ) });
      if ((int)((a)localObject1).ewQ != 0)
        break label1392;
      ((ad)localObject1).setUsername("officialaccounts");
      ((ad)localObject1).NC();
      ab.y((ad)localObject1);
      ((ad)localObject1).hz(3);
      c.XM().aa((ad)localObject1);
      label834: ??? = c.XM().aoO("voipaudio");
      localObject2 = c.XM().aoO("voicevoipapp");
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = new ad();
      if ((??? != null) && ((int)((a)???).ewQ != 0))
        c.XM().aoU("voipaudio");
      if ((int)((a)localObject1).ewQ != 0)
        break label1427;
      ((ad)localObject1).setUsername("voicevoipapp");
      ((ad)localObject1).NB();
      ab.y((ad)localObject1);
      ((ad)localObject1).hz(4);
      ((ad)localObject1).NK();
      c.XM().aa((ad)localObject1);
      label953: ab.a(paramBoolean, "voiceinputapp", false);
      ab.a(paramBoolean, "linkedinplugin", false);
      localObject2 = c.XM().aoO("notifymessage");
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = new ad();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.HardCodeHelper", "hardcodeOfficialAccounts:update[%B], contactID[%d]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf((int)((a)localObject1).ewQ) });
      if ((int)((a)localObject1).ewQ != 0)
        break label1453;
      ((ad)localObject1).setUsername("notifymessage");
      ((ad)localObject1).NC();
      ab.y((ad)localObject1);
      ((ad)localObject1).hz(3);
      c.XM().aa((ad)localObject1);
      label1078: localObject2 = c.XM().aoO("appbrandcustomerservicemsg");
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = new ad();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.HardCodeHelper", "hardcodeAppBrandServiceMessage:update[%B], contactID[%d]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf((int)((a)localObject1).ewQ) });
      if ((int)((a)localObject1).ewQ != 0)
        break label1488;
      ((ad)localObject1).setUsername("appbrandcustomerservicemsg");
      ((ad)localObject1).NC();
      ab.y((ad)localObject1);
      ((ad)localObject1).setType(0);
      ((ad)localObject1).hz(3);
      c.XM().aa((ad)localObject1);
    }
    while (true)
    {
      ab.a(paramBoolean, "downloaderapp", true);
      if (paramBoolean)
      {
        aw.ZK();
        c.XR().aoX("Weixin");
        aw.ZK();
        c.XM().aoU("Weixin");
      }
      aw.ZK();
      c.Ru().mB(l2);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMCore", "summeranrt dkwt set forceManual :%b, tid[%d], take[%s]ms, stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - l1), bo.dpG() });
      aw.a(this.flP);
      c.XR().a(aw.c(aw.ZO()).Cb());
      AppMethodBeat.o(16276);
      return;
      label1330: if (a.jh(((ap)localObject1).field_type))
        break;
      ((ad)localObject1).NB();
      aw.ZK();
      c.XM().b((String)localObject2, (ad)localObject1);
      break;
      label1366: if (!paramBoolean)
        break label727;
      ((ad)localObject1).NK();
      c.XM().b("voipapp", (ad)localObject1);
      break label727;
      label1392: if (!paramBoolean)
        break label834;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.HardCodeHelper", "do update hardcode official accounts");
      ((ad)localObject1).NC();
      c.XM().b("officialaccounts", (ad)localObject1);
      break label834;
      label1427: if (!paramBoolean)
        break label953;
      ((ad)localObject1).NK();
      c.XM().b("voicevoipapp", (ad)localObject1);
      break label953;
      label1453: if (!paramBoolean)
        break label1078;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.HardCodeHelper", "do update hardcode official accounts");
      ((ad)localObject1).NC();
      c.XM().b("notifymessage", (ad)localObject1);
      break label1078;
      label1488: if (paramBoolean)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.HardCodeHelper", "do update app brand service message accunt");
        ((ad)localObject1).NC();
        c.XM().b("appbrandcustomerservicemsg", (ad)localObject1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.aw.1
 * JD-Core Version:    0.6.2
 */