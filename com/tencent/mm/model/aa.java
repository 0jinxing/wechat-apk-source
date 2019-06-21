package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ar;
import com.tencent.mm.protocal.protobuf.bdv;
import com.tencent.mm.protocal.protobuf.cjj;
import com.tencent.mm.protocal.protobuf.cse;
import com.tencent.mm.protocal.protobuf.fv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bs;
import com.tencent.mm.storage.z;

public final class aa
{
  public static void a(cjj paramcjj, boolean paramBoolean)
  {
    AppMethodBeat.i(123394);
    int i = paramcjj.xic;
    int j;
    label96: z localz;
    Object localObject1;
    long l;
    label247: boolean bool;
    label259: label667: String str1;
    String str2;
    int k;
    Object localObject2;
    if (paramcjj.xid == null)
    {
      j = -1;
      ab.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile succ update:%d unifyFlag:%d, auth:%s, acct:%s, network:%s autoauth:%b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), paramcjj.xid, paramcjj.xie, paramcjj.xif, Boolean.valueOf(paramBoolean) });
      j = 0;
      if (((i & 0x1) == 0) || (paramcjj.xid == null))
        break label1244;
      j = paramcjj.xid.luF;
      g.RQ();
      g.jR(j);
      com.tencent.mm.kernel.a.b.e.Sq();
      localz = g.RP().Ry();
      localz.set(256, Boolean.FALSE);
      if ((i & 0x1) != 0)
      {
        if (paramcjj.xid.vHU <= 0)
          break label1307;
        localz.set(ac.a.xIH, Long.valueOf(paramcjj.xid.vHU));
        localz.set(ac.a.xIJ, Long.valueOf(bo.anT()));
        localz.set(ac.a.xII, Long.valueOf(com.tencent.mm.protocal.d.vxo));
        ab.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile need update flag[%d], autoauth[%b]", new Object[] { Integer.valueOf(paramcjj.xid.vHU), Boolean.valueOf(paramBoolean) });
        if (!paramBoolean)
          break label1263;
        localObject1 = com.tencent.mm.plugin.report.e.pXa;
        if (paramcjj.xid.vHU != 2)
          break label1255;
        l = 19L;
        ((com.tencent.mm.plugin.report.e)localObject1).a(148L, l, 1L, true);
      }
      if ((i & 0x2) == 0)
        break label1355;
      localObject1 = paramcjj.xie;
      ab.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect BindUin:%s, Status:%d, UserName:%s, NickName:%s, BindEmail:%s, BindMobile:%s, Alias:%s, PluginFlag:%d, RegType:%d, DeviceInfoXml:%s, SafeDevice:%d, OfficialUserName:%s, OfficialUserName:%s PushMailStatus:%d, FSURL:%s", new Object[] { p.getString(((ar)localObject1).vCf), Integer.valueOf(((ar)localObject1).jBT), ((ar)localObject1).jBB, ((ar)localObject1).jCH, ((ar)localObject1).vCg, ((ar)localObject1).vCh, ((ar)localObject1).guS, Integer.valueOf(((ar)localObject1).vCi), Integer.valueOf(((ar)localObject1).vCj), ((ar)localObject1).vCk, Integer.valueOf(((ar)localObject1).vCl), ((ar)localObject1).vCm, ((ar)localObject1).vCm, Integer.valueOf(((ar)localObject1).vCo), ((ar)localObject1).vCp });
      if (!paramBoolean)
        localz.set(52, Integer.valueOf(((ar)localObject1).vCj));
      localz.set(9, Integer.valueOf(((ar)localObject1).vCf));
      localz.set(7, Integer.valueOf(((ar)localObject1).jBT));
      localz.set(2, ((ar)localObject1).jBB);
      localz.set(4, ((ar)localObject1).jCH);
      localz.set(5, ((ar)localObject1).vCg);
      localz.set(6, ((ar)localObject1).vCh);
      localz.set(42, ((ar)localObject1).guS);
      localz.set(34, Integer.valueOf(((ar)localObject1).vCi));
      g.RP().Rz().apV(((ar)localObject1).vCk);
      localz.set(64, Integer.valueOf(((ar)localObject1).vCl));
      localz.set(21, ((ar)localObject1).vCm);
      localz.set(22, ((ar)localObject1).vCm);
      localz.set(17, Integer.valueOf(((ar)localObject1).vCo));
      av.fly.ak("login_weixin_username", ((ar)localObject1).jBB);
      av.fly.ak("last_login_nick_name", ((ar)localObject1).jCH);
      av.fly.c(((ar)localObject1).vCh, ((ar)localObject1).vCf, ((ar)localObject1).vCg);
      bool = false;
      if ((i & 0x1) == 0)
        break label1503;
      localObject1 = paramcjj.xid;
      str1 = ((fv)localObject1).vHO;
      str2 = bo.cd(com.tencent.mm.platformtools.aa.a(((fv)localObject1).vHP));
      ab.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile AuthTicket:%s, NewVersion:%d, UpdateFlag:%d, AuthResultFlag:%d, authKey:%s a2Key:%s fsurl:%s", new Object[] { ((fv)localObject1).vHS, Integer.valueOf(((fv)localObject1).vHT), Integer.valueOf(((fv)localObject1).vHU), Integer.valueOf(((fv)localObject1).vHV), bo.anv(str1), bo.anv(str2), ((fv)localObject1).vCp });
      k = ((fv)localObject1).vHI;
      localObject2 = new p(bo.h((Integer)localz.get(9, Integer.valueOf(0))));
      if (((fv)localObject1).vHJ != null)
        break label1366;
      j = -1;
      label823: ab.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile wtBuffFlag:%d, bindQQ:%s buff len:%d", new Object[] { Integer.valueOf(k), localObject2, Integer.valueOf(j) });
      if (k == 0)
        break label1497;
      if (k != 1)
        break label1378;
      com.tencent.mm.plugin.report.e.pXa.a(148L, 20L, 1L, false);
      byte[] arrayOfByte = com.tencent.mm.platformtools.aa.a(((fv)localObject1).vHJ);
      bool = g.RN().QR().a(((p)localObject2).longValue(), arrayOfByte);
      ab.i("MicroMsg.HandleAuthResponse", "WTLoginRspBuff len %s", new Object[] { Integer.valueOf(arrayOfByte.length) });
      localObject2 = bo.cd(g.RN().QR().ft(((p)localObject2).longValue()));
      localz.set(-1535680990, str1);
      localz.set(46, str2);
      localz.set(72, localObject2);
      localz.set(29, ((fv)localObject1).vCp);
      label988: ab.i("MicroMsg.HandleAuthResponse", "wtBuffFlag %s", new Object[] { Integer.valueOf(k) });
      if (((fv)localObject1).vHK != null)
      {
        localObject1 = bo.cd(com.tencent.mm.platformtools.aa.a(((fv)localObject1).vHK.vMb));
        if ((localObject1 != null) && (((String)localObject1).length() > 0))
        {
          localz.set(47, localObject1);
          g.RP().eJH.set(18, localObject1);
        }
        ab.i("MicroMsg.HandleAuthResponse", "updateProfile ksid:%s", new Object[] { bo.anv((String)localObject1) });
      }
      label1087: if ((i & 0x4) == 0)
        break label1528;
      com.tencent.mm.plugin.report.e.pXa.a(148L, 23L, 1L, false);
      paramcjj = paramcjj.xif;
      ax.a(false, paramcjj.vLL, paramcjj.vLM, paramcjj.vLK);
    }
    while (true)
    {
      if (paramBoolean)
      {
        j = 4;
        paramcjj = r.Yz();
        if (bool)
        {
          j = 1;
          paramcjj = r.Yy();
        }
        ab.i("MicroMsg.HandleAuthResponse", "loginType %s", new Object[] { Integer.valueOf(j) });
        com.tencent.mm.plugin.report.b.d.u(1, j, paramcjj);
      }
      localz.set(3, "");
      localz.set(19, "");
      localz.dsb();
      g.RP().eJH.setInt(46, 0);
      a.XG();
      AppMethodBeat.o(123394);
      return;
      j = paramcjj.xid.vHU;
      break;
      label1244: ab.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set and new uin is 0!");
      break label96;
      label1255: l = 41L;
      break label247;
      label1263: localObject1 = com.tencent.mm.plugin.report.e.pXa;
      if (paramcjj.xid.vHU == 2);
      for (l = 10L; ; l = 11L)
      {
        ((com.tencent.mm.plugin.report.e)localObject1).a(148L, l, 1L, true);
        break;
      }
      label1307: localz.set(ac.a.xIH, Long.valueOf(paramcjj.xid.vHU));
      localz.set(ac.a.xIJ, Long.valueOf(bo.anT()));
      localz.set(ac.a.xII, Long.valueOf(0L));
      break label259;
      label1355: ab.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect not set!");
      break label667;
      label1366: j = ((fv)localObject1).vHJ.getILen();
      break label823;
      label1378: if (k == 2)
      {
        com.tencent.mm.plugin.report.e.pXa.a(148L, 21L, 1L, false);
        g.RN().QR().fu(((p)localObject2).longValue());
        localObject2 = bo.cd(g.RN().QR().ft(((p)localObject2).longValue()));
        localz.set(-1535680990, str1);
        localz.set(46, str2);
        localz.set(72, localObject2);
        localz.set(29, ((fv)localObject1).vCp);
        bool = false;
        break label988;
      }
      ab.i("MicroMsg.HandleAuthResponse", "summerauth undefined wrBuffFlag[%d]", new Object[] { Integer.valueOf(k) });
      label1497: bool = false;
      break label988;
      label1503: ab.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set!");
      com.tencent.mm.plugin.report.e.pXa.a(148L, 22L, 1L, false);
      break label1087;
      label1528: ab.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile networksect not set!");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.aa
 * JD-Core Version:    0.6.2
 */