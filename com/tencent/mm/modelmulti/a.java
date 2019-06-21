package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.a.mx;
import com.tencent.mm.g.a.pg;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.a.sw;
import com.tencent.mm.g.a.tr;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.account.friend.a.p;
import com.tencent.mm.plugin.account.friend.a.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.protocal.protobuf.auw;
import com.tencent.mm.protocal.protobuf.ayj;
import com.tencent.mm.protocal.protobuf.bbn;
import com.tencent.mm.protocal.protobuf.bbq;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.bcf;
import com.tencent.mm.protocal.protobuf.bcq;
import com.tencent.mm.protocal.protobuf.bdx;
import com.tencent.mm.protocal.protobuf.bim;
import com.tencent.mm.protocal.protobuf.bmt;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.cfc;
import com.tencent.mm.protocal.protobuf.cgc;
import com.tencent.mm.protocal.protobuf.cme;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.plugin.messenger.foundation.a.r
{
  public static boolean a(ad paramad)
  {
    AppMethodBeat.i(16493);
    boolean bool;
    if ((paramad == null) || (bo.isNullOrNil(paramad.field_username)))
      if (paramad == null)
      {
        paramad = "-1";
        ab.w("MicroMsg.BigBallOfMudSyncExtension", "dealModContactExtInfo username:%s ", new Object[] { paramad });
        AppMethodBeat.o(16493);
        bool = false;
      }
    while (true)
    {
      return bool;
      paramad = paramad.field_username;
      break;
      aw.ZK();
      Object localObject = com.tencent.mm.model.c.XM().aoS(paramad.field_username);
      if (bo.cb((byte[])localObject))
      {
        paramad = paramad.field_username;
        if (localObject == null);
        for (int i = -1; ; i = localObject.length)
        {
          ab.w("MicroMsg.BigBallOfMudSyncExtension", "dealModContactExtInfo username:%s  buf:%d", new Object[] { paramad, Integer.valueOf(i) });
          AppMethodBeat.o(16493);
          bool = false;
          break;
        }
      }
      try
      {
        bbv localbbv2 = new com/tencent/mm/protocal/protobuf/bbv;
        localbbv2.<init>();
        localObject = (bbv)localbbv2.parseFrom((byte[])localObject);
        aw.ZK();
        com.tencent.mm.model.c.XM().aoT(paramad.field_username);
        if (localObject == null)
        {
          ab.e("MicroMsg.BigBallOfMudSyncExtension", "dkinit dealModContactExtInfo failed parse buf failed.");
          AppMethodBeat.o(16493);
          bool = false;
        }
      }
      catch (Exception localException)
      {
        bbv localbbv1;
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.BigBallOfMudSyncExtension", localException, "", new Object[0]);
          localbbv1 = null;
        }
        bool = com.tencent.mm.plugin.bbom.c.a(paramad, localbbv1, false);
        AppMethodBeat.o(16493);
      }
    }
  }

  public final void a(tb paramtb, byte[] paramArrayOfByte, boolean paramBoolean, com.tencent.mm.plugin.messenger.foundation.a.t paramt)
  {
    AppMethodBeat.i(16492);
    switch (paramtb.wat)
    {
    default:
      ab.e("MicroMsg.BigBallOfMudSyncExtension", "doCmd: no processing method, cmd id=" + paramtb.wat);
      AppMethodBeat.o(16492);
    case 22:
    case 13:
    case 15:
    case 23:
    case 25:
    case 24:
    case 33:
    case 35:
    case 44:
    case 999999:
    case 53:
    case 204:
    }
    while (true)
    {
      return;
      paramtb = (auw)new auw().parseFrom(paramArrayOfByte);
      paramArrayOfByte = new p();
      paramArrayOfByte.username = paramtb.jBB;
      paramArrayOfByte.gvE = paramtb.wyY;
      paramArrayOfByte.fvK = ((int)bo.anT());
      com.tencent.mm.plugin.account.a.getInviteFriendOpenStg().b(paramArrayOfByte);
      AppMethodBeat.o(16492);
      continue;
      paramt = (bcf)new bcf().parseFrom(paramArrayOfByte);
      if (1 == paramt.wGK)
      {
        aw.ZK();
        paramArrayOfByte = com.tencent.mm.model.c.XU();
        paramtb = aa.a(paramt.wcB);
        if (paramt.wGu == 1)
        {
          paramBoolean = true;
          label264: if (paramt.wGL != 1)
            break label300;
        }
        label300: for (boolean bool = true; ; bool = false)
        {
          paramArrayOfByte.e(paramtb, paramBoolean, bool);
          AppMethodBeat.o(16492);
          break;
          paramBoolean = false;
          break label264;
        }
      }
      ab.e("MicroMsg.BigBallOfMudSyncExtension", "unknown micro blog type:" + paramt.wGK);
      AppMethodBeat.o(16492);
      continue;
      paramtb = (bbq)new bbq().parseFrom(paramArrayOfByte);
      if (paramtb != null)
      {
        ab.d("MicroMsg.BigBallOfMudSyncExtension", "processModChatRoomMember username:" + paramtb.wcB + " nickname:" + paramtb.wyX);
        paramt = aa.a(paramtb.wcB);
        aw.ZK();
        paramArrayOfByte = com.tencent.mm.model.c.XM().aoO(paramt);
        paramArrayOfByte.setUsername(paramt);
        paramArrayOfByte.iB(aa.a(paramtb.wyX));
        paramArrayOfByte.iC(aa.a(paramtb.wce));
        paramArrayOfByte.iD(aa.a(paramtb.wcf));
        paramArrayOfByte.hA(paramtb.guN);
        paramArrayOfByte.iz(aa.a(paramtb.wFK));
        paramArrayOfByte.iF(aa.a(paramtb.wFM));
        paramArrayOfByte.iG(aa.a(paramtb.wFL));
        paramArrayOfByte.hD(paramtb.wbA);
        paramt = new h();
        paramt.bJt = -1;
        paramt.username = paramArrayOfByte.field_username;
        paramt.frV = paramtb.vXn;
        paramt.frW = paramtb.vXm;
        ab.d("MicroMsg.BigBallOfMudSyncExtension", "dkhurl chatmember %s b[%s] s[%s]", new Object[] { paramt.getUsername(), paramt.ack(), paramt.acl() });
        paramt.cB(true);
        if ((paramtb.wGb != 3) && (paramtb.wGb != 4))
          break label751;
        paramArrayOfByte.hz(paramtb.wGb);
        paramt.dtR = paramtb.wGb;
      }
      while (true)
      {
        com.tencent.mm.ah.o.act().b(paramt);
        aw.ZK();
        com.tencent.mm.model.c.XM().Y(paramArrayOfByte);
        paramt = com.tencent.mm.aj.z.aeR().qP(paramArrayOfByte.field_username);
        paramt.field_username = paramArrayOfByte.field_username;
        paramt.field_brandList = paramtb.guX;
        paramtb = paramtb.wCa;
        if (paramtb != null)
        {
          paramt.field_brandFlag = paramtb.gvb;
          paramt.field_brandInfo = paramtb.gvd;
          paramt.field_brandIconURL = paramtb.gve;
          paramt.field_extInfo = paramtb.gvc;
        }
        if (!com.tencent.mm.aj.z.aeR().e(paramt))
          com.tencent.mm.aj.z.aeR().d(paramt);
        AppMethodBeat.o(16492);
        break;
        label751: if (paramtb.wGb == 2)
        {
          paramArrayOfByte.hz(3);
          paramt.dtR = 3;
          paramArrayOfByte.hz(3);
          if (!com.tencent.mm.model.r.Yz().equals(paramArrayOfByte.field_username))
          {
            com.tencent.mm.ah.o.acd();
            com.tencent.mm.ah.d.E(paramArrayOfByte.field_username, false);
            com.tencent.mm.ah.o.acd();
            com.tencent.mm.ah.d.E(paramArrayOfByte.field_username, true);
            com.tencent.mm.ah.o.acv().pZ(paramArrayOfByte.field_username);
          }
        }
      }
      paramtb = (act)new act().parseFrom(paramArrayOfByte);
      switch (paramtb.wkw)
      {
      case 2:
      case 3:
      default:
        ab.e("MicroMsg.BigBallOfMudSyncExtension", "unknown function switch id:" + paramtb.wkw);
        AppMethodBeat.o(16492);
        break;
      case 1:
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(17, Integer.valueOf(paramtb.pvD));
        AppMethodBeat.o(16492);
        break;
      case 4:
        AppMethodBeat.o(16492);
        continue;
        paramtb = (cgc)new cgc().parseFrom(paramArrayOfByte);
        if (paramtb != null)
        {
          paramBoolean = true;
          label968: Assert.assertTrue(paramBoolean);
          if (bo.nullAsNil(paramtb.jBB).length() <= 0)
            break label1023;
        }
        label1023: for (paramBoolean = true; ; paramBoolean = false)
        {
          Assert.assertTrue(paramBoolean);
          if (ad.aou(paramtb.jBB))
            break label1028;
          ab.w("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: tcontact should ends with @t.qq.com");
          AppMethodBeat.o(16492);
          break;
          paramBoolean = false;
          break label968;
        }
        label1028: aw.ZK();
        paramArrayOfByte = com.tencent.mm.model.c.XM().aoO(paramtb.jBB);
        if ((paramArrayOfByte == null) || ((int)paramArrayOfByte.ewQ == 0))
        {
          paramArrayOfByte = new ad(paramtb.jBB);
          paramArrayOfByte.iz(paramtb.vXl);
          paramArrayOfByte.hD(1);
          paramArrayOfByte.NH();
          aw.ZK();
          if (com.tencent.mm.model.c.XM().aa(paramArrayOfByte) == -1)
          {
            ab.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: insert contact failed");
            AppMethodBeat.o(16492);
          }
          else
          {
            paramt = paramArrayOfByte.field_username;
            if (paramt == null)
              ab.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
          }
        }
        else
        {
          while (true)
          {
            paramArrayOfByte = new sw();
            paramArrayOfByte.cOY.opType = 1;
            paramArrayOfByte.cOY.cIS = paramtb.jBB;
            paramArrayOfByte.cOY.cIT = paramtb.wPH;
            paramArrayOfByte.cOY.cIU = paramtb.wbH;
            com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte);
            AppMethodBeat.o(16492);
            break;
            if (!paramt.endsWith("@t.qq.com"))
            {
              ab.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
            }
            else
            {
              paramArrayOfByte = new h();
              paramArrayOfByte.username = paramt;
              paramArrayOfByte.dtR = 3;
              paramArrayOfByte.bJt = 3;
              com.tencent.mm.ah.o.act().b(paramArrayOfByte);
              continue;
              if (!bo.nullAsNil(paramtb.vXl).equals(bo.nullAsNil(paramArrayOfByte.field_username)))
              {
                paramArrayOfByte.iz(paramtb.vXl);
                aw.ZK();
                if (com.tencent.mm.model.c.XM().b(paramArrayOfByte.field_username, paramArrayOfByte) == -1)
                  ab.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: update contact failed");
              }
            }
          }
          paramtb = (bmt)new bmt().parseFrom(paramArrayOfByte);
          if (paramtb != null)
          {
            paramBoolean = true;
            label1345: Assert.assertTrue(paramBoolean);
            if (bo.nullAsNil(paramtb.jBB).length() <= 0)
              break label1400;
          }
          label1400: for (paramBoolean = true; ; paramBoolean = false)
          {
            Assert.assertTrue(paramBoolean);
            if (ad.aow(paramtb.jBB))
              break label1405;
            ab.w("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: qcontact should ends with @t.qq.com");
            AppMethodBeat.o(16492);
            break;
            paramBoolean = false;
            break label1345;
          }
          label1405: aw.ZK();
          paramArrayOfByte = com.tencent.mm.model.c.XM().aoO(paramtb.jBB);
          if ((paramArrayOfByte == null) || ((int)paramArrayOfByte.ewQ == 0))
          {
            paramArrayOfByte = new ad(paramtb.jBB);
            paramArrayOfByte.NH();
            paramArrayOfByte.iB(paramtb.vXl);
            paramArrayOfByte.iz(paramtb.vXl);
            paramArrayOfByte.hD(4);
            aw.ZK();
            if (com.tencent.mm.model.c.XM().aa(paramArrayOfByte) == -1)
            {
              ab.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: insert contact failed");
              AppMethodBeat.o(16492);
            }
            else
            {
              b.pV(paramArrayOfByte.field_username);
            }
          }
          else
          {
            while (true)
            {
              paramArrayOfByte = new mx();
              paramArrayOfByte.cIO.opType = 1;
              paramArrayOfByte.cIO.cIS = paramtb.jBB;
              paramArrayOfByte.cIO.cIT = paramtb.wPH;
              paramArrayOfByte.cIO.cIU = paramtb.wbH;
              com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte);
              AppMethodBeat.o(16492);
              break;
              if (!bo.nullAsNil(paramtb.vXl).equals(bo.nullAsNil(paramArrayOfByte.field_username)))
              {
                paramArrayOfByte.iB(paramtb.vXl);
                paramArrayOfByte.iz(paramtb.vXl);
                aw.ZK();
                if (com.tencent.mm.model.c.XM().b(paramArrayOfByte.field_username, paramArrayOfByte) == -1)
                  ab.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: update contact failed");
              }
            }
            paramtb = (bbn)new bbn().parseFrom(paramArrayOfByte);
            if (paramtb != null)
            {
              paramBoolean = true;
              label1668: Assert.assertTrue(paramBoolean);
              if (bo.nullAsNil(paramtb.jBB).length() <= 0)
                break label1948;
              paramBoolean = true;
              label1687: Assert.assertTrue(paramBoolean);
              paramt = new ad();
              paramt.setUsername(paramtb.jBB);
              paramt.setType(paramtb.jCt);
              paramt.hA(paramtb.guN);
              paramt.iW(RegionCodeDecoder.aC(paramtb.guW, paramtb.guO, paramtb.guP));
              paramt.iQ(paramtb.guQ);
              paramArrayOfByte = new h();
              paramArrayOfByte.bJt = -1;
              paramArrayOfByte.username = paramtb.jBB;
              paramArrayOfByte.frV = paramtb.vXn;
              paramArrayOfByte.frW = paramtb.vXm;
              ab.d("MicroMsg.BigBallOfMudSyncExtension", "dkhurl bottle %s b[%s] s[%s]", new Object[] { paramArrayOfByte.getUsername(), paramArrayOfByte.ack(), paramArrayOfByte.acl() });
              ab.d("MicroMsg.BigBallOfMudSyncExtension", "bottlecontact imgflag:" + paramtb.wGb + " hd:" + paramtb.wGc);
              if (paramtb.wGc == 0)
                break label1953;
              paramBoolean = true;
              label1873: paramArrayOfByte.cB(paramBoolean);
              if ((paramtb.wGb != 3) && (paramtb.wGb != 4))
                break label1958;
              paramt.hz(paramtb.wGb);
              paramArrayOfByte.dtR = paramtb.wGb;
            }
            while (true)
            {
              com.tencent.mm.ah.o.act().b(paramArrayOfByte);
              aw.ZK();
              com.tencent.mm.model.c.XM().X(paramt);
              AppMethodBeat.o(16492);
              break;
              paramBoolean = false;
              break label1668;
              label1948: paramBoolean = false;
              break label1687;
              label1953: paramBoolean = false;
              break label1873;
              label1958: if (paramtb.wGb == 2)
              {
                paramt.hz(3);
                paramArrayOfByte.dtR = 3;
                com.tencent.mm.ah.o.acd();
                com.tencent.mm.ah.d.E(paramtb.jBB, false);
                com.tencent.mm.ah.o.acd();
                com.tencent.mm.ah.d.E(paramtb.jBB, true);
                com.tencent.mm.ah.o.acv().pZ(paramtb.jBB);
              }
              else
              {
                paramt.hz(3);
                paramArrayOfByte.dtR = 3;
              }
            }
            paramt = (bcq)new bcq().parseFrom(paramArrayOfByte);
            label2053: int i;
            label2097: int j;
            if (paramt != null)
            {
              paramBoolean = true;
              Assert.assertTrue(paramBoolean);
              paramtb = com.tencent.mm.model.r.Yz();
              i = paramt.vOw;
              if (i != 2)
                break label2343;
              paramtb = ad.aoC(paramtb);
              aw.ZK();
              paramArrayOfByte = (String)com.tencent.mm.model.c.Ry().get(12553, null);
              paramBoolean = false;
              if ((paramArrayOfByte == null) || (!paramArrayOfByte.equals(paramt.wGV)))
              {
                com.tencent.mm.ah.o.acd();
                com.tencent.mm.ah.d.E(paramtb, true);
                aw.ZK();
                paramArrayOfByte = com.tencent.mm.model.c.Ry();
                if (i != 2)
                  break label2364;
                j = 12553;
                label2144: paramArrayOfByte.set(j, paramt.wGV);
                paramBoolean = true;
              }
              ab.d("MicroMsg.BigBallOfMudSyncExtension", "ModUserImg beRemove:%b imgtype:%d md5:%s big:%s sm:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i), paramt.wGV, paramt.vXm, paramt.vXn });
              paramArrayOfByte = new h();
              paramArrayOfByte.username = paramtb;
              paramArrayOfByte.frW = paramt.vXm;
              paramArrayOfByte.frV = paramt.vXn;
              if (!bo.isNullOrNil(paramArrayOfByte.acl()))
              {
                if (i != 1)
                  break label2372;
                aw.ZK();
                com.tencent.mm.model.c.Ry().set(59, Boolean.TRUE);
              }
            }
            while (true)
            {
              paramArrayOfByte.cB(false);
              paramArrayOfByte.bJt = 56;
              if (!bo.isNullOrNil(paramt.wGV))
                paramArrayOfByte.cB(true);
              com.tencent.mm.ah.o.act().b(paramArrayOfByte);
              if (paramBoolean)
                new com.tencent.mm.ah.e().a(paramtb, new a.1(this));
              AppMethodBeat.o(16492);
              break;
              paramBoolean = false;
              break label2053;
              label2343: aw.ZK();
              paramArrayOfByte = (String)com.tencent.mm.model.c.Ry().get(12297, null);
              break label2097;
              label2364: j = 12297;
              break label2144;
              label2372: aw.ZK();
              com.tencent.mm.model.c.Ry().set(60, Boolean.TRUE);
            }
            paramt = (cme)new cme().parseFrom(paramArrayOfByte);
            ab.i("MicroMsg.BigBallOfMudSyncExtension", "snsExtFlag:%s, snsExtFlagEx:%s, snsPrivacyRecent:%s", new Object[] { Integer.valueOf(paramt.wBZ.guY), Integer.valueOf(paramt.wBZ.xbQ), Integer.valueOf(paramt.wBZ.xbR) });
            aw.ZK();
            String str = (String)com.tencent.mm.model.c.Ry().get(2, null);
            if ((str == null) || (str.length() <= 0))
            {
              AppMethodBeat.o(16492);
            }
            else
            {
              if (n.qFy != null)
                n.qFy.a(str, paramt.wBZ);
              ab.i("MicroMsg.BigBallOfMudSyncExtension", "storyExtFlag:%s", new Object[] { Integer.valueOf(paramt.xkj.xeE) });
              ((com.tencent.mm.plugin.story.api.e)g.M(com.tencent.mm.plugin.story.api.e.class)).updateStoryUserInfo(str, paramt.xkj);
              paramArrayOfByte = f.qX(com.tencent.mm.model.r.Yz());
              paramtb = paramArrayOfByte;
              if (paramArrayOfByte == null)
                paramtb = new com.tencent.mm.aj.d();
              paramtb.field_username = str;
              paramtb.field_brandList = paramt.guX;
              if ((paramtb.adQ()) && (paramtb.cJ(false) != null) && (paramtb.cJ(false).aer() != null) && (!bo.isNullOrNil(paramtb.adX())))
              {
                paramtb.field_enterpriseFather = paramtb.adX();
                ab.d("MicroMsg.BigBallOfMudSyncExtension", "processModUserInfoExt, %s set enterpriseFather %s", new Object[] { str, paramtb.field_enterpriseFather });
              }
              if (!com.tencent.mm.aj.z.aeR().e(paramtb))
                com.tencent.mm.aj.z.aeR().d(paramtb);
              j = paramt.xjS;
              i = paramt.xjT;
              int k = paramt.xjU;
              ab.d("MicroMsg.BigBallOfMudSyncExtension", "roomSize :" + j + " rommquota: " + i + " invite: " + k);
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(135175, Integer.valueOf(j));
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(135176, Integer.valueOf(i));
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(135177, Integer.valueOf(k));
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(144385, Integer.valueOf(paramt.xjY));
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(ac.a.xNQ, Integer.valueOf(paramt.wlv));
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(339975, Integer.valueOf(paramt.xkg));
              ab.i("MicroMsg.BigBallOfMudSyncExtension", "hy: sync do cmd pay wallet type: %d %d", new Object[] { Integer.valueOf(paramt.xkg), Integer.valueOf(paramt.wlv) });
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(ac.a.xLU, bo.bc(paramt.duq, ""));
              ab.d("MicroMsg.BigBallOfMudSyncExtension", "weidianinfo:%s", new Object[] { paramt.duq });
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(147457, Long.valueOf(paramt.xkh));
              ab.d("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.ExtStatus:%s", new Object[] { Long.valueOf(paramt.xkh) });
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(ac.a.xQe, paramt.xki);
              paramtb = new h();
              paramtb.bJt = -1;
              paramtb.username = str;
              paramtb.frW = paramt.vXm;
              paramtb.frV = paramt.vXn;
              paramtb.cB(true);
              paramtb.dtR = 3;
              ab.d("MicroMsg.BigBallOfMudSyncExtension", "dkavatar user:[%s] big:[%s] sm:[%s]", new Object[] { paramtb.getUsername(), paramtb.ack(), paramtb.acl() });
              com.tencent.mm.ah.o.act().b(paramtb);
              paramtb = paramt.wGm;
              paramArrayOfByte = paramt.wGn;
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(274433, paramArrayOfByte);
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(274434, paramtb);
              if (paramt.vEU != null)
              {
                aw.ZK();
                com.tencent.mm.model.c.Ry().set(286721, paramt.vEU.vLl);
                aw.ZK();
                com.tencent.mm.model.c.Ry().set(286722, paramt.vEU.vLm);
                aw.ZK();
                com.tencent.mm.model.c.Ry().set(286723, paramt.vEU.vLn);
              }
              if ((paramt.xke != null) && (paramt.xke.wLS != null) && (paramt.xke.wLS.getILen() > 0))
              {
                ab.i("MicroMsg.BigBallOfMudSyncExtension", "tomgest PatternLockInfo %d", new Object[] { Integer.valueOf(paramt.xke.wLS.getILen()) });
                paramtb = new tr();
                paramtb.cPQ.cPR = paramt.xke;
                com.tencent.mm.sdk.b.a.xxA.m(paramtb);
              }
              AppMethodBeat.o(16492);
              continue;
              try
              {
                j = com.tencent.mm.a.o.t(paramArrayOfByte, 0);
                ab.d("MicroMsg.BigBallOfMudSyncExtension", "local test synccmd, sleep %d", new Object[] { Integer.valueOf(j) });
                if (j > 0)
                  Thread.sleep(j);
                AppMethodBeat.o(16492);
              }
              catch (InterruptedException paramtb)
              {
                ab.printErrStackTrace("MicroMsg.BigBallOfMudSyncExtension", paramtb, "", new Object[0]);
                AppMethodBeat.o(16492);
              }
              continue;
              paramtb = (bdx)new bdx().parseFrom(paramArrayOfByte);
              ab.d("MicroMsg.BigBallOfMudSyncExtension", "rollback, msgtype is %d, msgid is %d", new Object[] { Integer.valueOf(paramtb.nao), Long.valueOf(paramtb.ptF) });
              if (com.tencent.mm.model.t.np(paramtb.ndG))
              {
                paramArrayOfByte = new pg();
                paramArrayOfByte.cLy.cvx = paramtb.ptF;
                com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte);
              }
              AppMethodBeat.o(16492);
              continue;
              paramtb = new qu();
              paramtb.cMZ.data = paramArrayOfByte;
              com.tencent.mm.sdk.b.a.xxA.m(paramtb);
              AppMethodBeat.o(16492);
            }
          }
        }
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.a
 * JD-Core Version:    0.6.2
 */