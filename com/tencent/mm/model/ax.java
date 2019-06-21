package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.ad;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.f;
import com.tencent.mm.protocal.j.a;
import com.tencent.mm.protocal.j.b;
import com.tencent.mm.protocal.j.c;
import com.tencent.mm.protocal.j.d;
import com.tencent.mm.protocal.j.e;
import com.tencent.mm.protocal.j.f;
import com.tencent.mm.protocal.j.g;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.o;
import com.tencent.mm.protocal.o.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ar;
import com.tencent.mm.protocal.protobuf.atn;
import com.tencent.mm.protocal.protobuf.ato;
import com.tencent.mm.protocal.protobuf.baf;
import com.tencent.mm.protocal.protobuf.bah;
import com.tencent.mm.protocal.protobuf.bdu;
import com.tencent.mm.protocal.protobuf.bdv;
import com.tencent.mm.protocal.protobuf.cjj;
import com.tencent.mm.protocal.protobuf.csd;
import com.tencent.mm.protocal.protobuf.cwd;
import com.tencent.mm.protocal.protobuf.fv;
import com.tencent.mm.protocal.protobuf.ge;
import com.tencent.mm.protocal.protobuf.gf;
import com.tencent.mm.protocal.protobuf.gh;
import com.tencent.mm.protocal.protobuf.hh;
import com.tencent.mm.protocal.protobuf.ll;
import com.tencent.mm.protocal.protobuf.lm;
import com.tencent.mm.protocal.protobuf.xu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class ax extends k
  implements j.c
{
  private static a flT = null;
  private final int flQ;
  private final j.f flR;
  private final j.g flS;

  public ax(int paramInt)
  {
    AppMethodBeat.i(58095);
    boolean bool;
    if ((paramInt == 702) || (paramInt == 701) || (paramInt == 252) || (paramInt == 763))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.flQ = paramInt;
      if ((paramInt != 702) && (paramInt != 763))
        break label95;
      this.flR = new j.a();
      this.flS = new j.b();
      AppMethodBeat.o(58095);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label95: this.flR = new j.d();
      this.flS = new j.e();
      AppMethodBeat.o(58095);
    }
  }

  public static SharedPreferences ZQ()
  {
    AppMethodBeat.i(138429);
    SharedPreferences localSharedPreferences = ay.ZQ();
    AppMethodBeat.o(138429);
    return localSharedPreferences;
  }

  public static int a(q paramq)
  {
    AppMethodBeat.i(58104);
    Object localObject1 = (j.f)paramq.acF();
    j.g localg = (j.g)paramq.ZS();
    ab.i("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo type:%d, hashcode:%d, ret:%d, stack[%s]", new Object[] { Integer.valueOf(((j.f)localObject1).ZU()), Integer.valueOf(paramq.hashCode()), Integer.valueOf(localg.eCX), bo.dpG() });
    int i;
    if (localg.eCX != 0)
    {
      ab.d("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo resp just decoded and ret result:%d", new Object[] { Integer.valueOf(localg.eCX) });
      i = localg.eCX;
      AppMethodBeat.o(58104);
      return i;
    }
    cjj localcjj = localg.vxV;
    int j = localcjj.xic;
    Object localObject2;
    int k;
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    byte[] arrayOfByte3;
    if ((j & 0x1) != 0)
    {
      localObject2 = localcjj.xid;
      k = ((fv)localObject2).vHV;
      ab.i("MicroMsg.MMReqRespAuth", "decodeAndRetriveAccInfo authResultFlag:%d UpdateFlag:%d ", new Object[] { Integer.valueOf(k), Integer.valueOf(((fv)localObject2).vHU) });
      arrayOfByte1 = aa.a(((fv)localObject2).vHY);
      arrayOfByte2 = aa.a(((fv)localObject2).vHZ);
      paramq = ((fv)localObject2).vHF;
      arrayOfByte3 = aa.a(((fv)localObject2).vHG);
      int m = paramq.vIn.getILen();
      int n = paramq.wdx;
      if (arrayOfByte3 == null)
      {
        i = -1;
        label234: ab.d("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key len:%d, nid:%d sessionKey len:%d, sessionKey：%s, clientSession[%s], serverSession[%s]", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i), bo.anv(bo.ca(arrayOfByte3)), bo.anv(bo.ca(arrayOfByte1)), bo.anv(bo.ca(arrayOfByte2)) });
        localObject2 = aa.a(paramq.vIn);
        localObject1 = ((j.f)localObject1).vxU;
        if (bo.cb((byte[])localObject2))
          break label657;
        m = localObject2.length;
        Object localObject3 = bo.anv(bo.ca((byte[])localObject2));
        if (localObject1 != null)
          break label645;
        i = -1;
        label345: ab.d("MicroMsg.MMReqRespAuth", "summerauth svrPubKey len:%d value:%s prikey len:%d, values:%s", new Object[] { Integer.valueOf(m), localObject3, Integer.valueOf(i), bo.anv(bo.ca((byte[])localObject1)) });
        localObject3 = new PByteArray();
        m = MMProtocalJni.computerKeyWithAllStr(paramq.wdx, (byte[])localObject2, (byte[])localObject1, (PByteArray)localObject3, 0);
        paramq = ((PByteArray)localObject3).value;
        if (paramq != null)
          break label651;
        i = -1;
        label422: ab.i("MicroMsg.MMReqRespAuth", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(i), bo.anv(bo.ca(paramq)) });
        label458: if (paramq == null)
          break label684;
        localObject2 = paramq;
        label465: localg.vxW = ((byte[])localObject2);
        if ((k & 0x4) == 0)
          break label788;
        ab.d("MicroMsg.MMReqRespAuth", "summerauth must decode session key");
        if (bo.cb(paramq))
          break label747;
        paramq = MMProtocalJni.aesDecrypt(arrayOfByte3, paramq);
        if (arrayOfByte3 != null)
          break label692;
        i = -1;
        label506: localObject2 = bo.anv(bo.ca(arrayOfByte3));
        if (paramq != null)
          break label699;
        k = -1;
        label523: ab.d("MicroMsg.MMReqRespAuth", "summerauth aesDecrypt sessionKey len:%d, value:%s, session len:%d, value:%s", new Object[] { Integer.valueOf(i), localObject2, Integer.valueOf(k), bo.anv(bo.ca(paramq)) });
        if (bo.cb(paramq))
          break label706;
        ab.d("MicroMsg.MMReqRespAuth", "summerauth decode session key succ session:%s", new Object[] { bo.anv(bo.ca(paramq)) });
        localg.b(paramq, arrayOfByte1, arrayOfByte2);
        localg.eCX = 1;
        label606: if ((j & 0x2) == 0)
          break label869;
        localg.gcF = localcjj.xie.jBB;
      }
    }
    while (true)
    {
      i = localg.eCX;
      AppMethodBeat.o(58104);
      break;
      i = arrayOfByte3.length;
      break label234;
      label645: i = localObject1.length;
      break label345;
      label651: i = paramq.length;
      break label422;
      label657: com.tencent.mm.plugin.report.e.pXa.a(148L, 24L, 1L, false);
      ab.w("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key is null!");
      paramq = null;
      break label458;
      label684: localObject2 = new byte[0];
      break label465;
      label692: i = arrayOfByte3.length;
      break label506;
      label699: k = paramq.length;
      break label523;
      label706: com.tencent.mm.plugin.report.e.pXa.a(148L, 25L, 1L, false);
      ab.d("MicroMsg.MMReqRespAuth", "summerauth decode session key failed ret null!");
      localg.b(new byte[0], arrayOfByte1, arrayOfByte2);
      localg.eCX = 2;
      break label606;
      label747: com.tencent.mm.plugin.report.e.pXa.a(148L, 26L, 1L, false);
      ab.d("MicroMsg.MMReqRespAuth", "summerauth decode session key failed as agreedECDHKey is null!");
      localg.b(new byte[0], arrayOfByte1, arrayOfByte2);
      localg.eCX = 2;
      break label606;
      label788: com.tencent.mm.plugin.report.e.pXa.a(148L, 27L, 1L, false);
      ab.d("MicroMsg.MMReqRespAuth", "summerauth not need decode session key");
      localg.b(arrayOfByte3, arrayOfByte1, arrayOfByte2);
      localg.eCX = 1;
      break label606;
      ab.d("MicroMsg.MMReqRespAuth", "summerauth auth sect not set so ret failed AuthSectResp[%s]", new Object[] { localcjj.xid });
      localg.b(new byte[0], new byte[0], new byte[0]);
      localg.eCX = 2;
      break label606;
      label869: ab.d("MicroMsg.MMReqRespAuth", "summerauth acct sect not set!");
    }
  }

  public static void a(a parama)
  {
    flT = parama;
  }

  public static void a(boolean paramBoolean, lm paramlm, bdu parambdu, ato paramato)
  {
    AppMethodBeat.i(58100);
    int i;
    int j;
    label20: int k;
    label27: int m;
    label34: int n;
    label41: int i1;
    if (paramlm == null)
    {
      i = -1;
      if (paramlm != null)
        break label202;
      j = -1;
      if (paramato != null)
        break label211;
      k = -1;
      if (parambdu != null)
        break label220;
      m = -1;
      if (parambdu != null)
        break label229;
      n = -1;
      if (parambdu != null)
        break label238;
      i1 = -1;
      label48: if (parambdu != null)
        break label247;
      localObject1 = "null";
      label57: if (parambdu != null)
        break label256;
      localObject2 = "null";
      label66: ab.i("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo resetnewwork:%b iplist[l:%d s:%d] hostList[%d] noop[%d %d] typing[%d] port[%s] timeout[%s]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), localObject1, localObject2 });
      if ((paramato != null) && (paramato.jBw != null) && (paramato.jBw.size() > 0))
        break label265;
      ab.f("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", new Object[] { bo.dpG() });
      AppMethodBeat.o(58100);
    }
    while (true)
    {
      return;
      i = paramlm.vOZ;
      break;
      label202: j = paramlm.vPa;
      break label20;
      label211: k = paramato.jBv;
      break label27;
      label220: m = parambdu.wHy;
      break label34;
      label229: n = parambdu.wHz;
      break label41;
      label238: i1 = parambdu.wHA;
      break label48;
      label247: localObject1 = parambdu.wHw;
      break label57;
      label256: localObject2 = parambdu.wHx;
      break label66;
      label265: if ((paramato != null) && (paramato.jBw != null) && (paramato.jBw.size() > 0))
        break label313;
      ab.f("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", new Object[] { bo.dpG() });
      AppMethodBeat.o(58100);
    }
    label313: Object localObject3 = new LinkedList();
    ((List)localObject3).clear();
    if (paramlm != null)
    {
      localObject4 = paramlm.vPd.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject2 = (ll)((Iterator)localObject4).next();
        localObject1 = "";
        if (((ll)localObject2).vOY != null)
          localObject1 = ((ll)localObject2).vOY.dlY();
        ((List)localObject3).add(new o(((ll)localObject2).type, ((ll)localObject2).vOX.dlY(), ((ll)localObject2).port, (String)localObject1));
        ab.d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo short type:%d port:%d ip:%s", new Object[] { Integer.valueOf(((ll)localObject2).type), Integer.valueOf(((ll)localObject2).port), ((ll)localObject2).vOX.dlY() });
      }
    }
    Object localObject2 = o.ei((List)localObject3);
    Object localObject1 = new LinkedList();
    if (paramlm != null)
    {
      localObject4 = paramlm.vPc.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject3 = (ll)((Iterator)localObject4).next();
        paramlm = "";
        if (((ll)localObject3).vOY != null)
          paramlm = ((ll)localObject3).vOY.dlY();
        ((List)localObject1).add(new o(((ll)localObject3).type, ((ll)localObject3).vOX.dlY(), ((ll)localObject3).port, paramlm));
        ab.d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo long type:%d port:%d ip:%s", new Object[] { Integer.valueOf(((ll)localObject3).type), Integer.valueOf(((ll)localObject3).port), ((ll)localObject3).vOX.dlY() });
      }
    }
    localObject3 = o.ei((List)localObject1);
    ab.d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo builtin ip long[%s] short[%s]", new Object[] { localObject3, localObject2 });
    g.RQ();
    g.RP().eJH.set(2, localObject2);
    Object localObject4 = ah.getContext().getSharedPreferences("system_config_prefs", 0);
    ((SharedPreferences)localObject4).edit().putString("builtin_short_ips", (String)localObject2).commit();
    g.RQ();
    g.RP().eJH.set(3, localObject3);
    if (parambdu != null)
    {
      g.RQ();
      g.RP().eJH.set(6, parambdu.wHw);
      g.RQ();
      g.RP().eJH.set(7, parambdu.wHx);
      if (parambdu.wHA != 0)
      {
        g.RQ();
        paramlm = g.RP().eJH;
        if (parambdu.wHA > 60)
        {
          i = 60;
          paramlm.set(35, Integer.valueOf(i));
        }
      }
      else
      {
        ad.y(parambdu.wHy, parambdu.wHB);
      }
    }
    for (paramlm = o.hN(parambdu.wHw, parambdu.wHx); ; paramlm = null)
    {
      parambdu = "";
      localObject1 = "";
      String[] arrayOfString1 = new String[paramato.jBw.size()];
      String[] arrayOfString2 = new String[paramato.jBw.size()];
      int[] arrayOfInt = new int[paramato.jBw.size()];
      ab.d("MicroMsg.MMReqRespAuth", "hostlist.Count=%d", new Object[] { Integer.valueOf(paramato.jBv) });
      Iterator localIterator = paramato.jBw.iterator();
      i = 0;
      paramato = (ato)localObject1;
      while (true)
      {
        if (!localIterator.hasNext())
          break label1195;
        localObject1 = (atn)localIterator.next();
        ab.d("MicroMsg.MMReqRespAuth", "dkidc host org:%s sub:%s", new Object[] { ((atn)localObject1).wxE, ((atn)localObject1).wxF });
        arrayOfString1[i] = ((atn)localObject1).wxE;
        arrayOfString2[i] = ((atn)localObject1).wxF;
        arrayOfInt[i] = ((atn)localObject1).wxG;
        j = i + 1;
        i = j;
        if (!bo.isNullOrNil(((atn)localObject1).wxE))
        {
          i = j;
          if (!bo.isNullOrNil(((atn)localObject1).wxF))
          {
            if (((atn)localObject1).wxE.equals("short.weixin.qq.com"))
            {
              g.RQ();
              g.RP().eJH.set(24, ((atn)localObject1).wxF);
              paramato = ((atn)localObject1).wxF;
              i = j;
              continue;
              i = parambdu.wHA;
              break;
            }
            if (((atn)localObject1).wxE.equals("long.weixin.qq.com"))
            {
              g.RQ();
              g.RP().eJH.set(25, ((atn)localObject1).wxF);
              parambdu = ((atn)localObject1).wxF;
              i = j;
            }
            else
            {
              i = j;
              if (((atn)localObject1).wxE.equals("support.weixin.qq.com"))
              {
                i = j;
                if (!bo.isNullOrNil(((atn)localObject1).wxF))
                {
                  ((SharedPreferences)localObject4).edit().putString("support.weixin.qq.com", ((atn)localObject1).wxF).commit();
                  i = j;
                }
              }
            }
          }
        }
      }
      label1195: g.RQ();
      localObject1 = g.RO().eJo.ftA;
      if ((arrayOfString1.length > 0) && (localObject1 != null))
        ((com.tencent.mm.network.e)localObject1).setHostInfo(arrayOfString1, arrayOfString2, arrayOfInt);
      if (!bo.isNullOrNil(parambdu))
      {
        g.RQ();
        g.RP().eJH.set(25, parambdu);
      }
      if (!bo.isNullOrNil(paramato))
      {
        g.RQ();
        g.RP().eJH.set(24, paramato);
      }
      if ((localObject1 != null) && (paramlm != null))
        ((com.tencent.mm.network.e)localObject1).a(paramBoolean, (String)localObject2, (String)localObject3, paramlm.vys, paramlm.vyt, paramlm.vyu, paramlm.vyv, paramato, parambdu);
      AppMethodBeat.o(58100);
      break;
    }
  }

  private q kD(int paramInt)
  {
    AppMethodBeat.i(58096);
    ab.i("MicroMsg.MMReqRespAuth", "summerauth autoAuthReq authReqFlag:%d, this:%d, stack:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(hashCode()), bo.dpG() });
    Object localObject1 = (j.f)acF();
    Object localObject2 = (j.g)this.flS;
    Object localObject3 = ay.ZQ();
    int i = ((SharedPreferences)localObject3).getInt("key_auth_update_version", 0);
    ab.d("MicroMsg.MMReqRespAuth", "summerauth updateVersion:%d, clientVersion:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(d.vxo) });
    long l;
    hh localhh;
    if (i < d.vxo)
    {
      if ((this.flQ == 702) || (this.flQ == 763))
      {
        i = 12;
        ((l.d)localObject1).vyf = i;
        localObject4 = com.tencent.mm.plugin.report.e.pXa;
        if (this.flQ != 702)
          break label330;
      }
      label330: for (l = 14L; ; l = 13L)
      {
        ((com.tencent.mm.plugin.report.e)localObject4).a(148L, l, 1L, false);
        localhh = new hh();
        localhh.vJW = paramInt;
        localhh.vHN = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
        localhh.vHM = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
        localObject4 = new csd();
        localhh.vJU = ((csd)localObject4);
        ((csd)localObject4).vLY = "";
        ((csd)localObject4).vLX = "";
        ((csd)localObject4).xpA = "";
        localObject4 = new cwd();
        localhh.vJV = ((cwd)localObject4);
        ((cwd)localObject4).wsM = "";
        ((cwd)localObject4).wsL = "";
        if (g.RK())
          break label376;
        ab.e("MicroMsg.MMReqRespAuth", "autoAuthReq build autoauth Req  , failed  acc not ready");
        localObject4 = null;
        AppMethodBeat.o(58096);
        return localObject4;
        i = 16;
        break;
      }
    }
    if ((this.flQ == 702) || (this.flQ == 763));
    for (i = 2; ; i = 1)
    {
      ((l.d)localObject1).vyf = i;
      break;
    }
    label376: g.RQ();
    Object localObject4 = bo.nullAsNil((String)g.RP().Ry().get(2, null));
    g.RQ();
    Object localObject5 = new com.tencent.mm.a.p(bo.a((Integer)g.RP().Ry().get(9, null), 0));
    if (bo.isNullOrNil((String)localObject4))
      localObject4 = ((com.tencent.mm.a.p)localObject5).toString();
    while (true)
    {
      g.RQ();
      Object localObject6 = g.RN().QR();
      l = ((com.tencent.mm.a.p)localObject5).longValue();
      boolean bool;
      label488: Object localObject7;
      if ((this.flQ == 252) || (this.flQ == 701))
      {
        bool = true;
        localObject7 = ((com.tencent.mm.ai.y)localObject6).a(l, "", bool);
        if (localObject7 != null)
          break label882;
        paramInt = -1;
        label509: if (localObject7 != null)
          break label889;
        localObject6 = "null";
        label519: ab.i("MicroMsg.MMReqRespAuth", "summerauth loginbuf username:%s, qq:%s, len:%d, content:[%s]", new Object[] { localObject4, localObject5, Integer.valueOf(paramInt), localObject6 });
        localObject5 = new SKBuiltinBuffer_t();
        if (!bo.cb((byte[])localObject7))
          break label902;
        localObject6 = new byte[0];
        label575: localhh.vJT = ((SKBuiltinBuffer_t)localObject5).setBuffer((byte[])localObject6);
        if ((this.flQ != 702) && (this.flQ != 763))
          break label1027;
        localObject6 = (j.a)localObject1;
        localObject7 = (j.b)localObject2;
        localObject2 = new ge();
        localObject1 = new gh();
        ((j.a)localObject6).vxQ.vIo = ((gh)localObject1);
        ((j.a)localObject6).vxQ.vIp = ((ge)localObject2);
        localObject3 = ((SharedPreferences)localObject3).getString("_auth_key", "");
        if (localObject3 != null)
          break label909;
        paramInt = -1;
        ab.i("MicroMsg.MMReqRespAuth", "summerauths KEY_SP_SUFFIX keyStr[%s]", new Object[] { Integer.valueOf(paramInt) });
        localObject5 = bo.anf((String)localObject3);
        localObject3 = new gf();
        if (bo.cb((byte[])localObject5))
          break label951;
        ((ge)localObject2).vHH = new SKBuiltinBuffer_t().setBuffer((byte[])localObject5);
        ab.i("MicroMsg.MMReqRespAuth", "summerauths keyBuf[%s, %s]", new Object[] { Integer.valueOf(((ge)localObject2).vHH.getBuffer().wR.length), Integer.valueOf(localObject5.length) });
      }
      while (true)
      {
        try
        {
          ((gf)localObject3).parseFrom((byte[])localObject5);
          if (((gf)localObject3).vIm == null)
            break label985;
          ((gh)localObject1).vIq = ((gf)localObject3).vIm;
          ab.w("MicroMsg.MMReqRespAuth", "summerauthkey AesEncryptKey [%s][%s]", new Object[] { Integer.valueOf(((gf)localObject3).vIm.getBuffer().wR.length), bo.ca(((gf)localObject3).vIm.getBuffer().wR) });
          ((ge)localObject2).vIg = localhh;
          ((j.a)localObject6).username = ((String)localObject4);
          ((j.g)localObject7).gcF = ((String)localObject4);
          AppMethodBeat.o(58096);
          localObject4 = this;
          break;
          bool = false;
          break label488;
          label882: paramInt = localObject7.length;
          break label509;
          label889: localObject6 = bo.anv(bo.ca((byte[])localObject7));
          break label519;
          label902: localObject6 = localObject7;
          break label575;
          label909: paramInt = ((String)localObject3).length();
        }
        catch (IOException localIOException)
        {
          com.tencent.mm.plugin.report.e.pXa.a(148L, 15L, 1L, false);
          ab.printErrStackTrace("MicroMsg.MMReqRespAuth", localIOException, "summerauthkey Failed parse autoauthkey buf", new Object[0]);
          continue;
        }
        label951: com.tencent.mm.plugin.report.e.pXa.a(148L, 16L, 1L, false);
        ((ge)localObject2).vHH = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
        continue;
        label985: com.tencent.mm.plugin.report.e.pXa.a(148L, 17L, 1L, false);
        ((gh)localObject1).vIq = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
        ab.w("MicroMsg.MMReqRespAuth", "summerauthkey AesEncryptKey null!");
        continue;
        label1027: localObject3 = (j.d)localObject1;
        localObject6 = new bah();
        localObject7 = new baf();
        ((j.d)localObject3).vxS.wEb = ((bah)localObject6);
        ((j.d)localObject3).vxS.wEc = ((baf)localObject7);
        ((baf)localObject7).wEa = 2;
        ((baf)localObject7).vIg = localhh;
        ((bah)localObject6).jBB = ((String)localObject4);
        g.RQ();
        localObject4 = bo.nullAsNil((String)g.RP().Ry().get(3, null));
        g.RQ();
        ((bah)localObject6).vLJ = bo.nullAsNil((String)g.RP().Ry().get(19, null));
        ((bah)localObject6).vLW = ((String)localObject4);
      }
    }
  }

  public final int ZP()
  {
    int i = 0;
    AppMethodBeat.i(58097);
    if (g.RK())
    {
      g.RQ();
      g.RN();
      i = a.QF();
      AppMethodBeat.o(58097);
    }
    while (true)
    {
      return i;
      ab.e("MicroMsg.MMReqRespAuth", "dkwt acc NOT Ready , the fucking MMReqRespBase need the fucking uin ???  if u find this log , fuck dk. %s", new Object[] { bo.dpG() });
      AppMethodBeat.o(58097);
    }
  }

  public final l.d ZR()
  {
    return this.flR;
  }

  public final l.e ZS()
  {
    return this.flS;
  }

  public final void a(j.f paramf, j.g paramg, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(58099);
    if (!g.RK())
    {
      ab.e("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd but account not ready");
      AppMethodBeat.o(58099);
    }
    while (true)
    {
      return;
      cjj localcjj = paramg.vxV;
      boolean bool;
      if ((localcjj != null) && (localcjj.xid != null))
      {
        int i = paramg.vxV.xid.vHW;
        ab.i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto:%s", new Object[] { Integer.valueOf(i) });
        g.RQ();
        g.RP().eJH.set(47, Integer.valueOf(i));
        com.tencent.mm.network.e locale = g.RO().eJo.ftA;
        if (locale != null)
        {
          if ((i & 0x1) != 0)
            break label265;
          bool = true;
          label124: locale.cI(bool);
        }
      }
      while (true)
      {
        ab.i("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        if ((paramInt1 == 0) && (paramInt2 == 0))
          break label390;
        if ((paramInt1 != 4) || (paramInt2 != -301))
          break label313;
        com.tencent.mm.plugin.report.e.pXa.a(148L, 18L, 1L, false);
        ab.i("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC");
        if ((localcjj == null) || (localcjj.xif == null))
          break label296;
        a(true, paramg.vxV.xif.vLL, paramg.vxV.xif.vLM, paramg.vxV.xif.vLK);
        AppMethodBeat.o(58099);
        break;
        label265: bool = false;
        break label124;
        ab.i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto not set as ret:%s", new Object[] { Integer.valueOf(paramg.vyl) });
      }
      label296: ab.w("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC but NetworkSectResp is null");
      AppMethodBeat.o(58099);
      continue;
      label313: paramf = com.tencent.mm.plugin.report.e.pXa;
      if (f.vxx)
      {
        l = 119L;
        label328: paramf.a(148L, l, 1L, false);
        paramf = com.tencent.mm.plugin.report.e.pXa;
        if (!f.vxy)
          break label382;
      }
      label382: for (long l = 121L; ; l = 122L)
      {
        paramf.a(148L, l, 1L, false);
        AppMethodBeat.o(58099);
        break;
        l = 120L;
        break label328;
      }
      label390: if (flT != null)
        flT.a(paramf, paramg);
      AppMethodBeat.o(58099);
    }
  }

  public final q cn(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(58098);
    q localq = new ax(paramInt1).kD(paramInt2);
    AppMethodBeat.o(58098);
    return localq;
  }

  public final int getType()
  {
    AppMethodBeat.i(58102);
    int i = this.flR.ZU();
    AppMethodBeat.o(58102);
    return i;
  }

  public final String getUri()
  {
    AppMethodBeat.i(58103);
    String str = this.flR.getUri();
    AppMethodBeat.o(58103);
    return str;
  }

  public static abstract interface a
  {
    public abstract void a(j.f paramf, j.g paramg);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ax
 * JD-Core Version:    0.6.2
 */