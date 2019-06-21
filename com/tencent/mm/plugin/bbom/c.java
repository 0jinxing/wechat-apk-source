package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.ez;
import com.tencent.mm.g.a.hj;
import com.tencent.mm.g.a.je;
import com.tencent.mm.g.a.je.a;
import com.tencent.mm.g.a.jy;
import com.tencent.mm.g.a.km;
import com.tencent.mm.g.a.sy;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.a.tg;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.bbw;
import com.tencent.mm.protocal.protobuf.bck;
import com.tencent.mm.protocal.protobuf.bkf;
import com.tencent.mm.protocal.protobuf.bkg;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.qe;
import com.tencent.mm.protocal.protobuf.qf;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.b;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.bv;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import org.json.JSONObject;

public final class c
  implements com.tencent.mm.ai.f, com.tencent.mm.plugin.messenger.foundation.a.c
{
  private static void D(ad paramad)
  {
    AppMethodBeat.i(18240);
    ak localak;
    if ((paramad != null) && (com.tencent.mm.aj.f.rb(paramad.field_username)) && (!com.tencent.mm.aj.f.kq(paramad.field_username)))
    {
      com.tencent.mm.model.aw.ZK();
      localak = com.tencent.mm.model.c.XR().aoZ(paramad.field_username);
      paramad = z.aeR().qP(paramad.field_username);
      if (!com.tencent.mm.aj.f.re(paramad.field_username))
        AppMethodBeat.o(18240);
    }
    while (true)
    {
      return;
      if (localak == null)
      {
        localak = new ak(paramad.field_username);
        ab.i("MicroMsg.BigBallContactAssemblerImpl", "Enterprise belong %s, userName: %s", new Object[] { paramad.adX(), paramad.field_username });
        localak.jj(bo.nullAsNil(paramad.adX()));
        localak.dsI();
        com.tencent.mm.model.aw.ZK();
        com.tencent.mm.model.c.XR().d(localak);
      }
      AppMethodBeat.o(18240);
    }
  }

  private static void a(bbv parambbv, String paramString, ad paramad, boolean paramBoolean)
  {
    AppMethodBeat.i(18237);
    Object localObject = r.Yz();
    if ((localObject != null) && (!((String)localObject).equals(paramString)))
    {
      localObject = z.aeR().qP(paramString);
      ((com.tencent.mm.aj.d)localObject).field_username = paramString;
      ((com.tencent.mm.aj.d)localObject).field_brandList = parambbv.guX;
      parambbv = parambbv.wCa;
      if (parambbv != null)
      {
        ((com.tencent.mm.aj.d)localObject).field_brandFlag = parambbv.gvb;
        ((com.tencent.mm.aj.d)localObject).field_brandInfo = parambbv.gvd;
        ((com.tencent.mm.aj.d)localObject).field_brandIconURL = parambbv.gve;
        ((com.tencent.mm.aj.d)localObject).field_extInfo = parambbv.gvc;
        if (paramBoolean)
        {
          ((com.tencent.mm.aj.d)localObject).field_attrSyncVersion = null;
          ((com.tencent.mm.aj.d)localObject).field_incrementUpdateTime = 0L;
          ab.i("MicroMsg.BigBallContactAssemblerImpl", "Reset biz(%s) Attribute syncVersion and incUpdateTime.", new Object[] { paramString });
        }
        if (!bo.isNullOrNil(((com.tencent.mm.aj.d)localObject).field_extInfo))
          ((com.tencent.mm.aj.d)localObject).cJ(true);
      }
      if ((((com.tencent.mm.aj.d)localObject).cJ(false) != null) && (((com.tencent.mm.aj.d)localObject).cJ(false).getServiceType() == 3) && (((com.tencent.mm.aj.d)localObject).cJ(false).aer() != null) && (!bo.isNullOrNil(((com.tencent.mm.aj.d)localObject).adX())))
      {
        ((com.tencent.mm.aj.d)localObject).field_enterpriseFather = ((com.tencent.mm.aj.d)localObject).adX();
        ab.d("MicroMsg.BigBallContactAssemblerImpl", "saveBizInfo, %s set enterpriseFather %s", new Object[] { paramString, ((com.tencent.mm.aj.d)localObject).field_enterpriseFather });
      }
      if (!z.aeR().e((com.tencent.mm.aj.d)localObject))
        z.aeR().d((com.tencent.mm.aj.d)localObject);
      paramad.hI(((com.tencent.mm.aj.d)localObject).field_type);
    }
    AppMethodBeat.o(18237);
  }

  public static boolean a(ad paramad, bbv parambbv, boolean paramBoolean)
  {
    AppMethodBeat.i(18238);
    if ((paramad == null) || (bo.isNullOrNil(paramad.field_username)))
    {
      ab.e("MicroMsg.BigBallContactAssemblerImpl", "dkinit dealModContactExtInfo failed invalid contact");
      paramBoolean = false;
      AppMethodBeat.o(18238);
      return paramBoolean;
    }
    String str = paramad.field_username;
    Object localObject1 = paramad.field_encryptUsername;
    Object localObject2 = com.tencent.mm.ah.b.a(str, parambbv);
    o.act().b((com.tencent.mm.ah.h)localObject2);
    localObject2 = parambbv.wBZ;
    if ((!paramad.field_username.endsWith("@chatroom")) && (localObject2 != null))
    {
      ab.i("MicroMsg.BigBallContactAssemblerImpl", "SnsFlag modcontact " + ((ccl)localObject2).guY + " " + parambbv.wcB);
      ab.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBg modcontact " + ((ccl)localObject2).guZ);
      ab.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + ((ccl)localObject2).gva);
      ab.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + ((ccl)localObject2).xbQ);
      ab.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + ((ccl)localObject2).xbR);
      if (com.tencent.mm.plugin.sns.b.n.qFy != null)
        com.tencent.mm.plugin.sns.b.n.qFy.a(paramad.field_username, (ccl)localObject2);
    }
    boolean bool;
    if (com.tencent.mm.n.a.jh(paramad.field_type))
    {
      bool = com.tencent.mm.bi.d.akP().ep(str, 1);
      if (!bool)
        break label430;
      ab.d("MicroMsg.BigBallContactAssemblerImpl", "fmsgConversation updateState succ, user = ".concat(String.valueOf(str)));
    }
    while (true)
    {
      ab.i("MicroMsg.BigBallContactAssemblerImpl", "processModContact, update state(ADDED) FMessageConversation, ret = ".concat(String.valueOf(bool)));
      if ((com.tencent.mm.n.a.jh(paramad.field_type)) && ((paramad.getSource() == 10) || (paramad.getSource() == 13)))
      {
        w.n(ah.getContext(), paramad.field_username, paramad.field_encryptUsername);
        localObject1 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(paramad.field_encryptUsername);
        if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.account.friend.a.a)localObject1).guM)))
        {
          ((com.tencent.mm.plugin.account.friend.a.a)localObject1).username = paramad.field_username;
          ab.d("MicroMsg.BigBallContactAssemblerImpl", "account sync: update addr ".concat(String.valueOf(com.tencent.mm.plugin.account.a.getAddrUploadStg().a(((com.tencent.mm.plugin.account.friend.a.a)localObject1).guM, (com.tencent.mm.plugin.account.friend.a.a)localObject1))));
        }
      }
      a(parambbv, str, paramad, paramBoolean);
      AppMethodBeat.o(18238);
      paramBoolean = true;
      break;
      label430: bool = com.tencent.mm.bi.d.akP().ep((String)localObject1, 1);
      ab.d("MicroMsg.BigBallContactAssemblerImpl", "fmsgConversation updateState succ, encryptUser = ".concat(String.valueOf(localObject1)));
    }
  }

  private static boolean a(ad paramad, bv parambv)
  {
    AppMethodBeat.i(18239);
    boolean bool1 = false;
    if (!bo.isNullOrNil(parambv.field_conDescription))
      paramad.iX(parambv.field_conDescription);
    boolean bool2 = bool1;
    if (!t.mX(paramad.field_username))
    {
      bool2 = bool1;
      if (com.tencent.mm.n.a.jh(paramad.field_type))
      {
        bool1 = true;
        bool2 = bool1;
        if (!bo.isNullOrNil(parambv.field_conDescription))
        {
          bbw localbbw = new bbw();
          localbbw.wGA = paramad.field_username;
          localbbw.Desc = parambv.field_conDescription;
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.XL().c(new j.a(54, localbbw));
          bool2 = bool1;
        }
      }
    }
    AppMethodBeat.o(18239);
    return bool2;
  }

  private static void bG(String paramString, int paramInt)
  {
    AppMethodBeat.i(18241);
    bf[] arrayOfbf = null;
    bt[] arrayOfbt;
    Object localObject1;
    ax[] arrayOfax;
    if ((paramInt == 26) || (paramInt == 27) || (paramInt == 28) || (paramInt == 29))
    {
      ab.d("MicroMsg.BigBallContactAssemblerImpl", "initAddContent, scene is shake");
      arrayOfbt = com.tencent.mm.bi.d.akR().apY(paramString);
      localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(ah.getContext(), arrayOfbt);
      arrayOfax = null;
    }
    while (localObject1 == null)
    {
      AppMethodBeat.o(18241);
      return;
      if (paramInt == 18)
      {
        ab.d("MicroMsg.BigBallContactAssemblerImpl", "initAddContent, scene is lbs");
        arrayOfbf = com.tencent.mm.bi.d.akQ().apz(paramString);
        localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(ah.getContext(), arrayOfbf);
        arrayOfbt = null;
        arrayOfax = null;
      }
      else
      {
        arrayOfax = com.tencent.mm.bi.d.akO().apv(paramString);
        localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(ah.getContext(), arrayOfax);
        arrayOfbt = null;
      }
    }
    paramInt = 0;
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    bi localbi;
    int k;
    int m;
    if (j < i)
    {
      localObject2 = localObject1[j];
      localbi = new bi();
      localbi.setContent(localObject2.fjz);
      k = t.nK(localObject2.username);
      if (arrayOfax != null)
      {
        m = paramInt + 1;
        localbi.eJ(arrayOfax[paramInt].field_createTime);
        paramInt = m;
      }
    }
    label528: 
    while (true)
    {
      label213: localbi.ju(localObject2.username);
      localbi.setType(k);
      label250: long l;
      if (localObject2.cRY)
      {
        localbi.setStatus(2);
        localbi.hO(1);
        com.tencent.mm.model.aw.ZK();
        l = com.tencent.mm.model.c.XO().Z(localbi);
        if (l == -1L)
          break label381;
      }
      label381: for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue(bool);
        ab.i("MicroMsg.BigBallContactAssemblerImpl", "new msg inserted to db , local id = ".concat(String.valueOf(l)));
        j++;
        break;
        if (arrayOfbf != null)
        {
          m = paramInt + 1;
          localbi.eJ(arrayOfbf[paramInt].field_createtime * 1000L);
          paramInt = m;
          break label213;
        }
        if (arrayOfbt == null)
          break label528;
        m = paramInt + 1;
        localbi.eJ(arrayOfbt[paramInt].field_createtime * 1000L);
        paramInt = m;
        break label213;
        localbi.setStatus(6);
        localbi.hO(0);
        break label250;
      }
      localObject1 = new bi();
      if (arrayOfax != null)
        ((bi)localObject1).eJ(arrayOfax[0].field_createTime + 1L);
      while (true)
      {
        ((bi)localObject1).ju(paramString);
        ((bi)localObject1).setContent(ah.getContext().getString(2131304130));
        ((bi)localObject1).setType(10000);
        ((bi)localObject1).setStatus(6);
        ((bi)localObject1).hO(0);
        com.tencent.mm.model.aw.ZK();
        com.tencent.mm.model.c.XO().Z((bi)localObject1);
        AppMethodBeat.o(18241);
        break;
        if (arrayOfbf != null)
          ((bi)localObject1).eJ(arrayOfbf[0].field_createtime * 1000L + 1L);
        else if (arrayOfbt != null)
          ((bi)localObject1).eJ(arrayOfbt[0].field_createtime * 1000L + 1L);
      }
    }
  }

  public final void a(ad paramad1, ad paramad2, bbv parambbv, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(18235);
    String str = paramad1.field_username;
    Object localObject1 = paramad1.field_encryptUsername;
    if ((paramad2 != null) && (!bo.nullAsNil(paramad2.dum).equals(bo.nullAsNil(parambbv.wGv))))
    {
      com.tencent.mm.bc.c.aiB();
      com.tencent.mm.bc.c.sY(str);
    }
    if (!bo.cb(paramArrayOfByte))
    {
      if (ad.Mn(paramad1.field_verifyFlag))
        a(parambbv, str, paramad1, true);
      if ((paramad2 == null) || (com.tencent.mm.n.a.jh(paramad2.field_type)) || (!com.tencent.mm.n.a.jh(paramad1.field_type)))
        break label1688;
    }
    label790: label1688: for (int i = 1; ; i = 0)
    {
      Object localObject2 = paramad1.field_username;
      if (parambbv.wGw == null);
      Object localObject3;
      for (paramArrayOfByte = ""; ; paramArrayOfByte = Integer.valueOf(bo.h(Integer.valueOf(parambbv.wGw.wNu.size()))))
      {
        ab.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s PhoneNumList size:%s", new Object[] { localObject2, paramArrayOfByte });
        localObject2 = new StringBuffer();
        if ((parambbv.wGw == null) || (parambbv.wGw.wNu == null))
          break label280;
        localObject3 = parambbv.wGw.wNu.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          paramArrayOfByte = (bkf)((Iterator)localObject3).next();
          if (paramArrayOfByte.wNt != null)
            ((StringBuffer)localObject2).append(paramArrayOfByte.wNt + ",");
        }
        a(paramad1, parambbv, true);
        break;
      }
      label280: ab.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", new Object[] { paramad1.field_username, ((StringBuffer)localObject2).toString() });
      paramArrayOfByte = null;
      int j = 0;
      if (paramad2 != null)
        paramArrayOfByte = paramad2.dur;
      if (paramArrayOfByte != null)
      {
        paramad2 = paramArrayOfByte;
        if (!paramArrayOfByte.equals(""));
      }
      else
      {
        com.tencent.mm.model.aw.ZK();
        localObject3 = com.tencent.mm.model.c.XN().RB((String)localObject1);
        paramad2 = paramArrayOfByte;
        if (localObject3 != null)
          paramad2 = ((bv)localObject3).field_conPhone;
      }
      ab.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, oldPhoneList %s", new Object[] { paramad1.field_username, bo.nullAsNil(paramad2) });
      int n;
      if (!bo.isNullOrNil(paramad2))
      {
        paramArrayOfByte = paramad2.split(",");
        int k = paramArrayOfByte.length;
        int m = 0;
        n = 0;
        while (m < k)
        {
          paramad2 = paramArrayOfByte[m];
          int i1 = n;
          int i2 = j;
          if (!bo.isNullOrNil(((StringBuffer)localObject2).toString()))
          {
            localObject3 = ((StringBuffer)localObject2).toString().split(",");
            i1 = localObject3.length;
            i2 = 0;
            while (i2 < i1)
              if (!paramad2.equals(localObject3[i2]))
              {
                n = 1;
                i2++;
              }
              else
              {
                n = 0;
              }
            i1 = n;
            i2 = j;
            if (n != 0)
            {
              ((StringBuffer)localObject2).append(paramad2);
              i2 = 1;
              i1 = n;
            }
          }
          m++;
          n = i1;
          j = i2;
        }
        if (j != 0)
        {
          localObject3 = new bck();
          ((bck)localObject3).wGA = paramad1.field_username;
          bkg localbkg = new bkg();
          if (!bo.isNullOrNil(((StringBuffer)localObject2).toString()))
          {
            paramArrayOfByte = ((StringBuffer)localObject2).toString().split(",");
            localbkg.jBv = paramArrayOfByte.length;
            localbkg.wNu = new LinkedList();
            m = paramArrayOfByte.length;
            for (n = 0; n < m; n++)
            {
              byte b = paramArrayOfByte[n];
              paramad2 = new bkf();
              paramad2.wNt = b;
              localbkg.wNu.add(paramad2);
            }
            ((bck)localObject3).wGw = localbkg;
            com.tencent.mm.model.aw.ZK();
            com.tencent.mm.model.c.XL().c(new j.a(60, (com.tencent.mm.bt.a)localObject3));
          }
        }
        if ((i != 0) && (15 == parambbv.vFH) && (!bo.isNullOrNil(paramad1.field_username)))
        {
          paramad2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(paramad1.field_username);
          if (paramad2 != null)
          {
            localObject3 = com.tencent.mm.plugin.report.service.h.pYm;
            paramArrayOfByte = paramad1.field_username;
            if (!bo.isNullOrNil(paramad2.Aq()))
              break label1147;
            n = 0;
            if (((StringBuffer)localObject2).toString().split(",").length < 5)
              break label1153;
            i = 5;
            ((com.tencent.mm.plugin.report.service.h)localObject3).e(12040, new Object[] { paramArrayOfByte, Integer.valueOf(3), Integer.valueOf(n), Integer.valueOf(i) });
          }
        }
      }
      ab.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", new Object[] { paramad1.field_username, ((StringBuffer)localObject2).toString() });
      paramad2 = ((StringBuffer)localObject2).toString();
      if (!bo.isNullOrNil(paramad2))
      {
        ab.i("MicroMsg.BigBallContactAssemblerImpl", paramad2);
        paramad1.jd(paramad2);
      }
      if ((!t.kH(str)) && (parambbv.wnN != null))
        com.tencent.mm.model.n.a(str, parambbv.wnN);
      boolean bool1 = false;
      com.tencent.mm.model.aw.ZK();
      paramArrayOfByte = com.tencent.mm.model.c.XN().RB(paramad1.field_username);
      if (!bo.isNullOrNil(paramad1.field_conRemark))
        if ((paramArrayOfByte != null) && (!bo.isNullOrNil(paramad1.dul)) && (!paramad1.dul.equals(paramArrayOfByte.field_conDescription)))
          a(paramad1, paramArrayOfByte);
      for (boolean bool2 = false; ; bool2 = paramBoolean)
      {
        ab.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s needModContact %s encryptUser:%s", new Object[] { paramad1.field_username, Boolean.valueOf(bool2), localObject1 });
        if (bool2)
          t.v(paramad1);
        paramad2 = null;
        com.tencent.mm.model.aw.ZK();
        paramArrayOfByte = com.tencent.mm.model.c.XN().RB(paramad1.field_encryptUsername);
        if (paramArrayOfByte != null)
          paramad2 = paramArrayOfByte.field_contactLabels;
        parambbv = paramad2;
        if (bo.isNullOrNil(paramad2))
        {
          com.tencent.mm.model.aw.ZK();
          localObject1 = com.tencent.mm.model.c.XN().RB(paramad1.field_username);
          parambbv = paramad2;
          paramArrayOfByte = (byte[])localObject1;
          if (localObject1 != null)
          {
            parambbv = ((bv)localObject1).field_contactLabels;
            paramArrayOfByte = (byte[])localObject1;
          }
        }
        if (!bo.isNullOrNil(parambbv))
        {
          com.tencent.mm.plugin.label.a.a.bJa().eQ(paramad1.field_username, parambbv);
          paramArrayOfByte.field_contactLabels = "";
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.XN().a(paramArrayOfByte);
        }
        AppMethodBeat.o(18235);
        return;
        label1147: n = 1;
        break;
        i = ((StringBuffer)localObject2).toString().split(",").length;
        break label790;
        if (paramArrayOfByte != null)
        {
          paramad2 = paramArrayOfByte;
          if (!bo.isNullOrNil(paramArrayOfByte.field_encryptUsername));
        }
        else
        {
          paramad2 = paramArrayOfByte;
          if (!bo.isNullOrNil((String)localObject1))
          {
            com.tencent.mm.model.aw.ZK();
            paramad2 = com.tencent.mm.model.c.XN().RB((String)localObject1);
          }
        }
        paramBoolean = bool1;
        if (paramad2 != null)
        {
          paramBoolean = bool1;
          if (!bo.isNullOrNil(paramad2.field_encryptUsername))
          {
            ab.i("MicroMsg.BigBallContactAssemblerImpl", "mod stranger remark : " + paramad2.field_encryptUsername);
            paramad1.iz(paramad2.field_conRemark);
            paramad1.iF(com.tencent.mm.platformtools.g.vo(paramad2.field_conRemark));
            paramad1.iG(com.tencent.mm.platformtools.g.vp(paramad2.field_conRemark));
            paramBoolean = a(paramad1, paramad2);
          }
        }
        switch (paramad1.getSource())
        {
        case 12:
        default:
        case 10:
        case 11:
        case 13:
        }
      }
      paramad2 = null;
      if ((parambbv != null) && (!bo.isNullOrNil(parambbv.wGo)))
      {
        ab.i("MicroMsg.BigBallContactAssemblerImpl", "MobileHash[%s],MobileFullHash[%s]", new Object[] { parambbv.wGo, parambbv.wGp });
        paramArrayOfByte = com.tencent.mm.plugin.account.a.getAddrUploadStg();
        paramad2 = parambbv.wGo;
        str = parambbv.wGp;
        parambbv = paramArrayOfByte.vW(paramad2);
        paramad2 = parambbv;
        if (parambbv == null)
          paramad2 = paramArrayOfByte.vW(str);
        if (paramad2 != null)
          break label1643;
        ab.i("MicroMsg.BigBallContactAssemblerImpl", "dealWithRemark-> addr == null");
      }
      while (true)
      {
        bool2 = paramBoolean;
        if (paramad2 == null)
          break;
        bool2 = paramBoolean;
        if (bo.isNullOrNil(paramad2.apA()))
          break;
        bool2 = paramBoolean;
        if (!paramad2.apI())
          break;
        ab.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], remarkChange[%s]", new Object[] { paramad2.apA(), paramad2.getUsername(), Boolean.valueOf(paramBoolean) });
        paramad2.username = paramad1.field_username;
        paramad2.status = 2;
        paramad2.apH();
        bool1 = paramBoolean;
        if (!paramBoolean)
        {
          paramad1.iz(paramad2.apA());
          paramad1.iF(com.tencent.mm.platformtools.g.vo(paramad2.apA()));
          paramad1.iG(com.tencent.mm.platformtools.g.vp(paramad2.apA()));
          bool1 = true;
        }
        bool2 = bool1;
        if (!com.tencent.mm.n.a.jh(paramad1.field_type))
          break;
        ab.i("MicroMsg.BigBallContactAssemblerImpl", "updateAddrUp RealName[%s], User[%s], remarkChange[%s]", new Object[] { paramad2.apA(), paramad2.getUsername(), Boolean.valueOf(bool1) });
        com.tencent.mm.plugin.account.a.getAddrUploadStg().a(paramad2.Aq(), paramad2);
        bool2 = bool1;
        break;
        if (bo.isNullOrNil((String)localObject1))
          break label1418;
        paramad2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT((String)localObject1);
        break label1418;
        label1643: ab.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], needSetRemark[%s]", new Object[] { bo.nullAsNil(paramad2.apA()), bo.nullAsNil(paramad2.getUsername()), Boolean.valueOf(paramad2.apI()) });
      }
    }
  }

  public final void b(ad paramad1, ad paramad2, bbv parambbv, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(18236);
    paramArrayOfByte = paramad1.field_username;
    Object localObject1 = paramad1.field_encryptUsername;
    Object localObject2;
    Object localObject3;
    label138: label209: label240: Object localObject4;
    int n;
    if (t.kH(paramArrayOfByte))
    {
      if (parambbv.wnN != null)
      {
        localObject2 = parambbv.wnN.vXi;
        if (com.tencent.mm.bh.d.fUv != null)
          break label1627;
        i = 0;
        if (i == 0)
        {
          localObject2 = parambbv.wnN.vXi;
          localObject3 = new sz();
          ((sz)localObject3).cPf.cPh = true;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
          if ((!bo.isNullOrNil(paramArrayOfByte)) && (t.kH(paramArrayOfByte)) && (!bo.isNullOrNil(((sz)localObject3).cPg.cPj)) && (paramArrayOfByte.equals(((sz)localObject3).cPg.cPj)))
            break label1897;
        }
        localObject2 = parambbv.wnN.vXi;
        if (localObject2 != null)
        {
          localObject2 = ((LinkedList)localObject2).iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext())
              break;
            localObject3 = (qf)((Iterator)localObject2).next();
          }
          while ((bo.isNullOrNil(((qf)localObject3).jBB)) || (!((qf)localObject3).jBB.equals(r.Yz())));
        }
        i = 0;
        if (i != 0)
          ((com.tencent.mm.plugin.multitalk.model.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RU(paramArrayOfByte);
      }
      if (parambbv.wnN != null)
        break label2046;
      i = 0;
      localObject3 = parambbv.wGj;
      localObject2 = parambbv.wGi;
      int j = parambbv.wGt;
      int k = parambbv.wGs;
      localObject4 = parambbv.ndT;
      int m = parambbv.wGr;
      if (parambbv.wnN != null)
        break label2058;
      n = -1;
      label286: ab.i("MicroMsg.BigBallContactAssemblerImpl", "processModContact chatroom:%s count:%d ChatRoomData:%s owner:%s type:%d max:%d upgrader:%s ver:%d infomask:%d ", new Object[] { paramArrayOfByte, Integer.valueOf(i), localObject3, localObject2, Integer.valueOf(j), Integer.valueOf(k), localObject4, Integer.valueOf(m), Integer.valueOf(n) });
      if ((parambbv.wnN != null) && (parambbv.wnN.ehB != 0))
      {
        localObject2 = new com.tencent.mm.j.a.a.a();
        ((com.tencent.mm.j.a.a.a)localObject2).type = parambbv.wGt;
        ((com.tencent.mm.j.a.a.a)localObject2).ehD = parambbv.wGs;
        ((com.tencent.mm.j.a.a.a)localObject2).eox = parambbv.ndT;
        ((com.tencent.mm.j.a.a.a)localObject2).eoy = parambbv.wGr;
        if (parambbv.wnN.vXj == 0)
          ((com.tencent.mm.j.a.a.a)localObject2).cGj = parambbv.wGr;
        if (com.tencent.mm.model.n.N(paramArrayOfByte, parambbv.wGr))
        {
          localObject3 = new hj();
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
          com.tencent.mm.model.n.O(paramArrayOfByte, parambbv.wGt);
        }
        localObject3 = new km();
        ((km)localObject3).cGi.chatroomName = paramArrayOfByte;
        ((km)localObject3).cGi.cGj = ((com.tencent.mm.j.a.a.a)localObject2).cGj;
        com.tencent.mm.model.n.a(paramArrayOfByte, parambbv.wGi, parambbv.wnN, parambbv.wGy, r.Yz(), (com.tencent.mm.j.a.a.a)localObject2, (com.tencent.mm.sdk.b.b)localObject3);
      }
    }
    if ((!com.tencent.mm.n.a.jh(paramad1.field_type)) && (!paramad1.NY()) && (!ad.mR(paramad1.field_username)) && (!t.kH(paramad1.field_username)))
    {
      ab.w("MicroMsg.BigBallContactAssemblerImpl", "processModContact delChatContact now user:%s ,type:%d", new Object[] { paramad1.field_username, Integer.valueOf(paramad1.field_type) });
      com.tencent.mm.model.aw.ZK();
      com.tencent.mm.model.c.XR().aoX(paramad1.field_username);
    }
    if ((paramad1.field_type & 0x800) != 0)
      if ((paramad2 == null) || ((paramad2.field_type & 0x800) != (paramad1.field_type & 0x800)))
      {
        if ((com.tencent.mm.aj.f.rb(paramad1.field_username)) && (!com.tencent.mm.aj.f.kq(paramad1.field_username)))
          D(paramad1);
      }
      else
        label679: if ((paramad2 == null) || (com.tencent.mm.n.a.jh(paramad2.field_type)) || (!com.tencent.mm.n.a.jh(paramad1.field_type)))
          break label2502;
    label934: label1959: label2495: label2502: for (int i = 1; ; i = 0)
    {
      if (com.tencent.mm.n.a.jh(paramad1.field_type))
      {
        com.tencent.mm.model.aw.ZK();
        localObject2 = com.tencent.mm.model.c.XN().RB(paramArrayOfByte);
        if (localObject2 != null)
        {
          paramArrayOfByte = (byte[])localObject2;
          if (!bo.isNullOrNil(((bv)localObject2).field_encryptUsername));
        }
        else
        {
          paramArrayOfByte = (byte[])localObject2;
          if (!bo.isNullOrNil((String)localObject1))
          {
            com.tencent.mm.model.aw.ZK();
            paramArrayOfByte = com.tencent.mm.model.c.XN().RB((String)localObject1);
          }
        }
        if ((paramArrayOfByte != null) && (!bo.isNullOrNil(paramArrayOfByte.field_encryptUsername)))
        {
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.XN().RC(paramArrayOfByte.field_encryptUsername);
        }
      }
      if (com.tencent.mm.aj.f.ra(paramad1.field_username))
      {
        z.afa();
        com.tencent.mm.aj.c.a(paramad1.field_username, null);
        if ((i != 0) && (com.tencent.mm.aj.f.rb(paramad1.field_username)))
        {
          if (!com.tencent.mm.aj.f.kq(paramad1.field_username))
            break label2306;
          z.aeZ();
          com.tencent.mm.aj.a.h.a(paramad1.field_username, null);
        }
      }
      label874: paramArrayOfByte = com.tencent.mm.aj.f.qX(paramad1.field_username);
      if (paramArrayOfByte != null)
      {
        paramArrayOfByte = paramArrayOfByte.cJ(false);
        if (paramArrayOfByte != null)
        {
          n = 0;
          if (paramArrayOfByte.fvc != null)
            n = paramArrayOfByte.fvc.optInt("WXAppType", 0);
          if (n != 0)
          {
            n = 1;
            if (n != 0)
            {
              z.afd();
              com.tencent.mm.aj.a.qy(paramad1.field_username);
            }
            if ((paramad1.field_type & 0x8) == 0)
              break label2445;
            if ((paramad2 == null) || ((paramad2.field_type & 0x8) != (paramad1.field_type & 0x8)))
            {
              com.tencent.mm.model.aw.ZK();
              com.tencent.mm.model.c.XR().c(new String[] { paramad1.field_username }, "@blacklist");
            }
            label1007: if (!paramBoolean)
            {
              if ((paramad1 != null) && (paramad1.dsf()) && (com.tencent.mm.n.a.jh(paramad1.field_type)))
              {
                long l = System.currentTimeMillis();
                com.tencent.mm.model.aw.ZK();
                paramArrayOfByte = com.tencent.mm.model.c.XR().aoZ(paramad1.field_username);
                if ((paramArrayOfByte != null) && (paramArrayOfByte.jl(4194304)))
                {
                  com.tencent.mm.model.aw.ZK();
                  paramBoolean = com.tencent.mm.model.c.XR().a(paramad1.field_username, 4194304, false, paramArrayOfByte.field_attrflag);
                  ab.i("MicroMsg.BigBallContactAssemblerImpl", "Reset temp session attr flag.(talker %s, updateSucc %s, cost %s)", new Object[] { paramad1.field_username, Boolean.valueOf(paramBoolean), Long.valueOf(System.currentTimeMillis() - l) });
                }
              }
              if ((paramad2 != null) && ((int)paramad2.ewQ > 0) && (paramad2.duj != 0) && (paramad2.duk == 0) && (paramad1.duk == 1))
              {
                ab.d("MicroMsg.BigBallContactAssemblerImpl", "hakon removeParentRefAndUnread user = %s", new Object[] { paramad1.field_username });
                com.tencent.mm.model.aw.ZK();
                com.tencent.mm.model.c.XR().app(paramad1.field_username);
                com.tencent.mm.model.aw.ZK();
                paramad2 = com.tencent.mm.model.c.XR().aoZ("officialaccounts");
                if (paramad2 != null)
                {
                  com.tencent.mm.model.aw.ZK();
                  paramad2.hM(com.tencent.mm.model.c.XR().dsQ());
                  ab.d("MicroMsg.BigBallContactAssemblerImpl", "unread count is %d", new Object[] { Integer.valueOf(paramad2.field_unReadCount) });
                  com.tencent.mm.model.aw.ZK();
                  paramArrayOfByte = com.tencent.mm.model.c.XR().apm("officialaccounts");
                  com.tencent.mm.model.aw.ZK();
                  localObject1 = com.tencent.mm.model.c.XO().Rb(paramArrayOfByte);
                  if ((localObject1 == null) || (((cy)localObject1).field_msgId <= 0L))
                    break label2495;
                  paramad2.ap((bi)localObject1);
                  paramad2.setContent(((cy)localObject1).field_talker + ":" + ((cy)localObject1).field_content);
                  paramad2.jg(Integer.toString(((bi)localObject1).getType()));
                  com.tencent.mm.model.aw.ZK();
                  localObject4 = com.tencent.mm.model.c.XR().Cb();
                  if (localObject4 != null)
                  {
                    localObject3 = new PString();
                    localObject2 = new PString();
                    paramArrayOfByte = new PInt();
                    ((bi)localObject1).ju("officialaccounts");
                    ((bi)localObject1).setContent(paramad2.field_content);
                    ((be.b)localObject4).a((bi)localObject1, (PString)localObject3, (PString)localObject2, paramArrayOfByte, true);
                    paramad2.jh(((PString)localObject3).value);
                    paramad2.ji(((PString)localObject2).value);
                    paramad2.hP(paramArrayOfByte.value);
                  }
                }
              }
            }
          }
        }
      }
      while (true)
      {
        com.tencent.mm.model.aw.ZK();
        com.tencent.mm.model.c.XR().a(paramad2, paramad2.field_username);
        if (i != 0)
        {
          paramad2 = new jy();
          paramad2.cFk.username = paramad1.field_username;
          paramad2.cFk.cFl = paramad1.cFl;
          com.tencent.mm.sdk.b.a.xxA.m(paramad2);
        }
        if ((i != 0) && (parambbv.vFH == 18))
        {
          paramad2 = new je();
          paramad2.cEq.cEr = paramad1.field_encryptUsername;
          paramad2.cEq.type = 2;
          com.tencent.mm.bi.d.akQ().QU(paramad2.cEq.cEr);
          com.tencent.mm.sdk.b.a.xxA.m(paramad2);
        }
        if (i != 0)
          bG(paramad1.field_username, parambbv.vFH);
        com.tencent.mm.plugin.label.a.a.bJa().ahw();
        AppMethodBeat.o(18236);
        return;
        label1627: localObject3 = com.tencent.mm.bh.d.fUv.akN();
        if ((bo.isNullOrNil((String)localObject3)) || (!((String)localObject3).equals(paramArrayOfByte)) || (!t.kH(paramArrayOfByte)))
        {
          i = 0;
          break;
        }
        if (localObject2 != null)
        {
          localObject3 = ((LinkedList)localObject2).iterator();
          while (true)
            if (((Iterator)localObject3).hasNext())
            {
              localObject2 = (qf)((Iterator)localObject3).next();
              if ((!bo.isNullOrNil(((qf)localObject2).jBB)) && (((qf)localObject2).jBB.equals(r.Yz())))
              {
                i = 0;
                break;
              }
            }
        }
        if (com.tencent.mm.bh.d.fUu != null)
        {
          if (com.tencent.mm.bh.d.fUu.aV(paramArrayOfByte, r.Yz()))
          {
            ab.i("MicroMsg.BigBallContactAssemblerImpl", "kicked self shareing");
            localObject2 = new tg();
            ((tg)localObject2).cPx.userName = paramArrayOfByte;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          }
          com.tencent.mm.bh.d.fUu.a(paramArrayOfByte, null, 0.0D, 0.0D, "", "", "");
        }
        if ((com.tencent.mm.bh.d.fUv != null) && (!bo.isNullOrNil(com.tencent.mm.bh.d.fUu.akM())))
        {
          ab.i("MicroMsg.BigBallContactAssemblerImpl", "sync remove chatroom end track %s", new Object[] { com.tencent.mm.bh.d.fUv.akN() });
          localObject2 = new ez();
          ((ez)localObject2).cys.username = com.tencent.mm.bh.d.fUv.akN();
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        }
        i = 1;
        break;
        label1897: if (localObject2 != null)
        {
          localObject2 = ((LinkedList)localObject2).iterator();
          while (true)
          {
            if (!((Iterator)localObject2).hasNext())
              break label1959;
            localObject3 = (qf)((Iterator)localObject2).next();
            if (!bo.isNullOrNil(((qf)localObject3).jBB))
              if (((qf)localObject3).jBB.equals(r.Yz()))
                break;
          }
        }
        if (com.tencent.mm.bg.g.fUs != null)
          com.tencent.mm.bg.g.fUs.a(paramArrayOfByte, null, "", "", 0);
        localObject2 = new sz();
        ((sz)localObject2).cPf.cPi = true;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        localObject2 = new sy();
        ((sy)localObject2).cPd.cPe = true;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        break label138;
        i = 1;
        break label209;
        label2046: i = parambbv.wnN.ehB;
        break label240;
        n = parambbv.wnN.vXj;
        break label286;
        if ((!paramad1.dsf()) || (!com.tencent.mm.aj.f.qZ(paramad1.field_username)) || (paramad1 == null) || (!paramad1.dsf()) || (!com.tencent.mm.aj.f.qZ(paramad1.field_username)))
          break label679;
        ab.i("MicroMsg.BigBallContactAssemblerImpl", "dealPlaceSubscribeBizToTop uct : " + paramad1.field_username);
        com.tencent.mm.model.aw.ZK();
        localObject2 = com.tencent.mm.model.c.XR().aoZ(paramad1.field_username);
        z.aeR().qP(paramad1.field_username);
        if (localObject2 != null)
          break label679;
        com.tencent.mm.model.aw.ZK();
        if (com.tencent.mm.model.c.XR().aoZ("officialaccounts") == null)
        {
          localObject2 = new ak("officialaccounts");
          ((ak)localObject2).dsI();
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.XR().d((ak)localObject2);
        }
        localObject2 = new ak(paramad1.field_username);
        ((ak)localObject2).jj("officialaccounts");
        com.tencent.mm.model.aw.ZK();
        com.tencent.mm.model.c.XR().d((ak)localObject2);
        break label679;
        if (((paramad2 != null) && ((paramad2.field_type & 0x800) == (paramad1.field_type & 0x800))) || (!com.tencent.mm.aj.f.rb(paramad1.field_username)) || (com.tencent.mm.aj.f.kq(paramad1.field_username)))
          break label679;
        D(paramad1);
        break label679;
        if (!com.tencent.mm.aj.f.re(paramad1.field_username))
          break label874;
        com.tencent.mm.model.aw.ZK();
        if (com.tencent.mm.model.c.XR().aoZ(paramad1.field_username) != null)
          break label874;
        localObject2 = z.aeR().qP(paramad1.field_username);
        paramArrayOfByte = new ak(paramad1.field_username);
        if (!((com.tencent.mm.aj.d)localObject2).adR())
        {
          ab.i("MicroMsg.BigBallContactAssemblerImpl", "Enterprise belong %s, userName: %s", new Object[] { ((com.tencent.mm.aj.d)localObject2).adX(), paramad1.field_username });
          paramArrayOfByte.jj(bo.nullAsNil(((com.tencent.mm.aj.d)localObject2).adX()));
        }
        while (true)
        {
          paramArrayOfByte.dsI();
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.XR().d(paramArrayOfByte);
          break;
          paramArrayOfByte.jj(null);
        }
        n = 0;
        break label934;
        if ((paramad2 != null) && ((paramad2.field_type & 0x8) == (paramad1.field_type & 0x8)))
          break label1007;
        com.tencent.mm.model.aw.ZK();
        com.tencent.mm.model.c.XR().c(new String[] { paramad1.field_username }, "");
        break label1007;
        paramad2.dsI();
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(18242);
    ab.i("MicroMsg.BigBallContactAssemblerImpl", "onsceneEnd errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramm.getType() != 681)
      AppMethodBeat.o(18242);
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        AppMethodBeat.o(18242);
      }
      else if (!com.tencent.mm.kernel.g.RN().eJb)
      {
        ab.w("MicroMsg.BigBallContactAssemblerImpl", "initialize notify is not done.");
        AppMethodBeat.o(18242);
      }
      else
      {
        paramm = ((com.tencent.mm.az.b)paramm).fLs;
        paramString = new HashSet();
        try
        {
          Iterator localIterator = paramm.iterator();
          while (localIterator.hasNext())
          {
            paramm = (j.b)localIterator.next();
            if (paramm.getCmdId() != 2)
              break label260;
            localObject = new com/tencent/mm/protocal/protobuf/bbv;
            ((bbv)localObject).<init>();
            paramString.add(aa.a(((bbv)((bbv)localObject).parseFrom(paramm.getBuffer())).wcB));
          }
        }
        catch (Exception paramm)
        {
          while (true)
          {
            Object localObject;
            ab.printErrStackTrace("MicroMsg.BigBallContactAssemblerImpl", paramm, "BaseProtoBuf parseFrom error!", new Object[0]);
            paramm = paramString.iterator();
            while (paramm.hasNext())
            {
              paramString = (String)paramm.next();
              if (!bo.isNullOrNil(paramString))
                ao.a.flu.a(paramString, null, null);
            }
            label260: if (paramm.getCmdId() == 54)
            {
              localObject = new com/tencent/mm/protocal/protobuf/bbw;
              ((bbw)localObject).<init>();
              paramString.add(((bbw)((bbw)localObject).parseFrom(paramm.getBuffer())).wGA);
            }
            else if (paramm.getCmdId() == 60)
            {
              localObject = new com/tencent/mm/protocal/protobuf/bck;
              ((bck)localObject).<init>();
              paramString.add(((bck)((bck)localObject).parseFrom(paramm.getBuffer())).wGA);
            }
          }
          AppMethodBeat.o(18242);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.c
 * JD-Core Version:    0.6.2
 */