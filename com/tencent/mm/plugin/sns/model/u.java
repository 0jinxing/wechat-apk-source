package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.rn;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.r;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.widget.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ata;
import com.tencent.mm.protocal.protobuf.brf;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.protocal.protobuf.cao;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbx;
import com.tencent.mm.protocal.protobuf.cby;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class u extends com.tencent.mm.ai.m
  implements com.tencent.mm.network.k
{
  private static List<ar> qJB;
  private static com.tencent.mm.plugin.sns.h.c qJD;
  private static boolean qJE;
  private String ecX;
  com.tencent.mm.ai.b ehh;
  com.tencent.mm.ai.f ehi;
  private u.a qJC;

  static
  {
    AppMethodBeat.i(36322);
    qJB = new LinkedList();
    qJE = true;
    AppMethodBeat.o(36322);
  }

  public u()
  {
    AppMethodBeat.i(36305);
    this.ecX = "";
    this.qJC = new u.a(this);
    ab.i("MicroMsg.NetSceneNewSyncAlbum", "NetSceneSnsSync %d", new Object[] { Integer.valueOf(256) });
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new cbx();
    ((b.a)localObject1).fsK = new cby();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnssync";
    ((b.a)localObject1).fsI = 214;
    ((b.a)localObject1).fsL = 102;
    ((b.a)localObject1).fsM = 1000000102;
    this.ehh = ((b.a)localObject1).acD();
    ((cbx)this.ehh.fsG.fsP).vTN = 256;
    this.ecX = r.Yz();
    long l;
    Object localObject2;
    if (qJE)
    {
      l = System.currentTimeMillis();
      localObject1 = new StringBuilder();
      com.tencent.mm.kernel.g.RQ();
      localObject1 = com.tencent.mm.kernel.g.RP().cachePath + "ad_1100007";
      ab.i("MicroMsg.NetSceneNewSyncAlbum", "filepath to list  ".concat(String.valueOf(localObject1)));
      localObject2 = com.tencent.mm.vfs.e.e((String)localObject1, 0, -1);
      if (localObject2 == null);
    }
    try
    {
      com.tencent.mm.plugin.sns.h.c localc = new com/tencent/mm/plugin/sns/h/c;
      localc.<init>();
      qJD = (com.tencent.mm.plugin.sns.h.c)localc.parseFrom((byte[])localObject2);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("fileToList ");
      ab.i("MicroMsg.NetSceneNewSyncAlbum", System.currentTimeMillis() - l);
      if (qJD == null)
      {
        ab.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId parser error");
        qJE = false;
        AppMethodBeat.o(36305);
        return;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", localIOException, "", new Object[0]);
        com.tencent.mm.vfs.e.deleteFile((String)localObject1);
        continue;
        ab.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId size " + qJD.qQf.size());
      }
    }
  }

  private static void Zz()
  {
    AppMethodBeat.i(36319);
    Iterator localIterator = qJB.iterator();
    while (localIterator.hasNext())
    {
      ar localar = (ar)localIterator.next();
      if (localar != null)
        localar.Zz();
    }
    AppMethodBeat.o(36319);
  }

  public static void a(ar paramar)
  {
    AppMethodBeat.i(36320);
    if (!qJB.contains(paramar))
      qJB.add(paramar);
    AppMethodBeat.o(36320);
  }

  private static boolean a(cao paramcao)
  {
    AppMethodBeat.i(36315);
    try
    {
      can localcan1 = paramcao.wZN;
      long l1 = paramcao.vQE;
      String str = bo.nullAsNil(paramcao.ptv);
      long l2 = paramcao.wZM;
      int i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsAdNotifyLimit"), 0);
      int j = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsAdNotifyLikeTimeLimit"), 0);
      int k = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsAdNotifyCommentTimeLimit"), 0);
      Object localObject;
      if (((i > 0) || (j > 0) || (k > 0)) && ((localcan1.jCt == 8) || (localcan1.jCt == 7)) && (!a.a(l1, paramcao, i, j, k, true)))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("pass the comment clientId ");
        ab.i("MicroMsg.NetSceneNewSyncAlbum", str + " snsId: " + l1 + " " + localcan1.wZJ + " " + localcan1.wZG + " actionLimit:" + i + " actionLikeTimeLimit:" + j + " actionCommentTimeLimit:" + k);
        a.a(l1, paramcao);
        bool = false;
        AppMethodBeat.o(36315);
      }
      while (true)
      {
        return bool;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("processNormalAction clientId ");
        ab.i("MicroMsg.NetSceneNewSyncAlbum", str + " snsId: " + l1 + " " + localcan1.wZJ + " " + localcan1.wZG + " actionLimit: " + i);
        if (!af.cnK().a(l1, localcan1.wPm, localcan1.pcX, str))
        {
          can localcan2 = paramcao.wZO;
          localObject = new com/tencent/mm/plugin/sns/storage/j;
          ((j)localObject).<init>();
          ((j)localObject).field_snsID = l1;
          ((j)localObject).field_parentID = l2;
          ((j)localObject).field_createTime = localcan1.pcX;
          ((j)localObject).field_talker = localcan1.wPm;
          ((j)localObject).field_type = localcan1.jCt;
          ((j)localObject).field_curActionBuf = localcan1.toByteArray();
          ((j)localObject).field_refActionBuf = localcan2.toByteArray();
          ((j)localObject).field_clientId = str;
          if (d.fF(localcan1.wZL, 2));
          for (j = 1; ; j = 0)
          {
            ((j)localObject).field_isSilence = j;
            if ((localcan1.jCt != 8) && (localcan1.jCt != 7))
              break label532;
            ((j)localObject).field_commentSvrID = localcan1.wZJ;
            if (a.a(l1, paramcao))
              break label566;
            paramcao = new java/lang/StringBuilder;
            paramcao.<init>("pass comment ID ");
            ab.i("MicroMsg.NetSceneNewSyncAlbum", ((j)localObject).field_snsID + " " + ((j)localObject).field_commentSvrID);
            bool = false;
            AppMethodBeat.o(36315);
            break;
          }
          label532: ((j)localObject).field_commentSvrID = localcan1.wZG;
          bool = aj.a(l1, paramcao);
          if (!bool)
          {
            bool = false;
            AppMethodBeat.o(36315);
          }
          else
          {
            label566: af.cnK().b((com.tencent.mm.sdk.e.c)localObject);
            af.cnK().y(l1, d.fF(localcan1.wZL, 2));
            bool = true;
            AppMethodBeat.o(36315);
          }
        }
        else
        {
          bool = false;
          AppMethodBeat.o(36315);
        }
      }
    }
    catch (Exception paramcao)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramcao, "", new Object[0]);
        boolean bool = false;
        AppMethodBeat.o(36315);
      }
    }
  }

  private static boolean a(cao paramcao, can paramcan, long paramLong1, long paramLong2, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(36316);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("processHbAction clientId ");
      ab.i("MicroMsg.NetSceneNewSyncAlbum", paramString + " snsId: " + paramLong1 + " " + paramcan.wZJ + " " + paramcan.wZG);
      if (!com.tencent.mm.plugin.sns.lucky.a.g.cmw())
      {
        ab.i("MicroMsg.NetSceneNewSyncAlbum", "passed because close lucky");
        AppMethodBeat.o(36316);
      }
      while (true)
      {
        return bool;
        if (!af.cnK().a(paramLong1, paramcan.wPm, paramcan.pcX, paramString))
        {
          can localcan = paramcao.wZO;
          localObject = new com/tencent/mm/plugin/sns/storage/j;
          ((j)localObject).<init>();
          ((j)localObject).field_snsID = paramLong1;
          ((j)localObject).field_parentID = paramLong2;
          ((j)localObject).field_createTime = paramcan.pcX;
          ((j)localObject).field_talker = paramcan.wPm;
          ((j)localObject).field_type = paramcan.jCt;
          ((j)localObject).field_curActionBuf = paramcan.toByteArray();
          ((j)localObject).field_refActionBuf = localcan.toByteArray();
          ((j)localObject).field_clientId = paramString;
          ((j)localObject).field_commentSvrID = paramcan.wZG;
          paramString = new java/lang/StringBuilder;
          paramString.<init>("curAction.HBBuffer ");
          ab.i("MicroMsg.NetSceneNewSyncAlbum", paramcan.wZK);
          aj.c(paramLong1, paramcao);
          Zz();
          af.cnK().b((com.tencent.mm.sdk.e.c)localObject);
          bool = true;
          AppMethodBeat.o(36316);
        }
        else
        {
          AppMethodBeat.o(36316);
        }
      }
    }
    catch (Exception paramcao)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + paramcao.getMessage());
        ab.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramcao, "", new Object[0]);
        AppMethodBeat.o(36316);
      }
    }
  }

  public static void b(ar paramar)
  {
    AppMethodBeat.i(36321);
    qJB.remove(paramar);
    AppMethodBeat.o(36321);
  }

  private static boolean b(cao paramcao, can paramcan, long paramLong1, long paramLong2, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(36317);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("processGrabHbAction clientId ");
      ab.i("MicroMsg.NetSceneNewSyncAlbum", paramString + " snsId: " + paramLong1 + " " + paramcan.wZJ + " " + paramcan.wZG);
      if (!af.cnK().a(paramLong1, paramcan.wPm, paramcan.pcX, paramString))
      {
        localObject = paramcao.wZO;
        paramcao = new com/tencent/mm/plugin/sns/storage/j;
        paramcao.<init>();
        paramcao.field_snsID = paramLong1;
        paramcao.field_parentID = paramLong2;
        paramcao.field_createTime = paramcan.pcX;
        paramcao.field_talker = paramcan.wPm;
        paramcao.field_type = paramcan.jCt;
        paramcao.field_curActionBuf = paramcan.toByteArray();
        paramcao.field_refActionBuf = ((can)localObject).toByteArray();
        paramcao.field_clientId = paramString;
        paramcao.field_commentSvrID = paramcan.wZG;
        paramString = new com/tencent/mm/protocal/protobuf/ata;
        paramString.<init>();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("curAction.HBBuffer ");
        ab.i("MicroMsg.NetSceneNewSyncAlbum", paramcan.wZK);
        paramString.parseFrom(com.tencent.mm.platformtools.aa.a(paramcan.wZK));
        paramcan = new java/lang/StringBuilder;
        paramcan.<init>("hbbuffer  ");
        ab.i("MicroMsg.NetSceneNewSyncAlbum", paramString.cSh);
        af.cnK().b(paramcao);
        bool = true;
        AppMethodBeat.o(36317);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(36317);
      }
    }
    catch (Exception paramcao)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + paramcao.getMessage());
        ab.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramcao, "", new Object[0]);
        AppMethodBeat.o(36317);
      }
    }
  }

  public static void cmZ()
  {
    AppMethodBeat.i(36310);
    if (qJD == null)
      AppMethodBeat.o(36310);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      Object localObject1 = new StringBuilder();
      com.tencent.mm.kernel.g.RQ();
      localObject1 = com.tencent.mm.kernel.g.RP().cachePath + "ad_1100007";
      ab.i("MicroMsg.NetSceneNewSyncAlbum", "listToFile to list  ".concat(String.valueOf(localObject1)));
      try
      {
        Object localObject2 = qJD.toByteArray();
        com.tencent.mm.vfs.e.b((String)localObject1, (byte[])localObject2, localObject2.length);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("listTofile ");
        ab.i("MicroMsg.NetSceneNewSyncAlbum", System.currentTimeMillis() - l + " igNoreAbTestId " + qJD.qQf.size());
        AppMethodBeat.o(36310);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", localException, "listToFile failed: ".concat(String.valueOf(localObject1)), new Object[0]);
        AppMethodBeat.o(36310);
      }
    }
  }

  public static void cna()
  {
    AppMethodBeat.i(36318);
    Iterator localIterator = qJB.iterator();
    while (localIterator.hasNext())
    {
      ar localar = (ar)localIterator.next();
      if (localar != null)
        localar.ZA();
    }
    AppMethodBeat.o(36318);
  }

  public static void kg(long paramLong)
  {
    AppMethodBeat.i(36307);
    if (qJD == null)
      qJD = new com.tencent.mm.plugin.sns.h.c();
    qJD.qQf.add(Long.valueOf(paramLong));
    AppMethodBeat.o(36307);
  }

  public static void kh(long paramLong)
  {
    AppMethodBeat.i(36308);
    if (qJD != null)
      qJD.qQf.remove(Long.valueOf(paramLong));
    AppMethodBeat.o(36308);
  }

  public static boolean ki(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(36309);
    if (qJD == null)
      AppMethodBeat.o(36309);
    while (true)
    {
      return bool;
      if (qJD.qQf.contains(Long.valueOf(paramLong)))
      {
        bool = true;
        AppMethodBeat.o(36309);
      }
      else
      {
        AppMethodBeat.o(36309);
      }
    }
  }

  public static boolean kj(long paramLong)
  {
    AppMethodBeat.i(36314);
    try
    {
      bool = a.a(paramLong, null, bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsAdNotifyLimit"), 0), bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsAdNotifyLikeTimeLimit"), 0), bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsAdNotifyCommentTimeLimit"), 0), false);
      AppMethodBeat.o(36314);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", localException, "", new Object[0]);
        boolean bool = true;
        AppMethodBeat.o(36314);
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(36306);
    com.tencent.mm.kernel.g.RQ();
    byte[] arrayOfByte = bo.anf(bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(8195, null)));
    SKBuiltinBuffer_t localSKBuiltinBuffer_t = new SKBuiltinBuffer_t();
    localSKBuiltinBuffer_t.setBuffer(arrayOfByte);
    ((cbx)this.ehh.fsG.fsP).vTO = localSKBuiltinBuffer_t;
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36306);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36311);
    ab.d("MicroMsg.NetSceneNewSyncAlbum", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36311);
    }
    while (true)
    {
      return;
      cby localcby = (cby)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      paramArrayOfByte = localcby.vTR.jBw;
      if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
      {
        ab.d("MicroMsg.NetSceneNewSyncAlbum", "cmlList size:" + paramArrayOfByte.size());
        paramString = this.qJC;
        paramString.mgm = paramArrayOfByte;
        paramString.mgn.sendEmptyMessage(0);
        AppMethodBeat.o(36311);
      }
      else
      {
        if ((localcby.vTO != null) && (localcby.vTO.getBuffer() != null))
        {
          paramArrayOfByte = localcby.vTO.getBuffer().toByteArray();
          paramq = com.tencent.mm.protocal.aa.j(((cbx)((com.tencent.mm.ai.b)paramq).fsG.fsP).vTO.getBuffer().toByteArray(), paramArrayOfByte);
          if ((paramq != null) && (paramq.length > 0))
          {
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RP().Ry().set(8195, bo.cd(paramq));
          }
        }
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(36311);
      }
    }
  }

  public final boolean a(tb paramtb, ak paramak)
  {
    boolean bool1 = false;
    AppMethodBeat.i(36312);
    try
    {
      localObject1 = new com/tencent/mm/protocal/protobuf/cbf;
      ((cbf)localObject1).<init>();
      localcbf = (cbf)((cbf)localObject1).parseFrom(paramtb.wau.getBuffer().toByteArray());
      paramtb = new java/lang/String;
      paramtb.<init>(localcbf.xam.getBuffer().toByteArray());
      if ((paramtb.indexOf("<contentStyle><![CDATA[1]]></contentStyle>") >= 0) || (paramtb.indexOf("<contentStyle>1</contentStyle>") >= 0));
      l locall;
      int j;
      for (bool2 = true; ; bool2 = false)
      {
        paramtb = new java/lang/StringBuilder;
        paramtb.<init>("snsSync ");
        ab.i("MicroMsg.NetSceneNewSyncAlbum", localcbf.vQE + " " + com.tencent.mm.plugin.sns.data.i.jV(localcbf.vQE) + " isPhoto " + bool2);
        if (!bool2)
          break label379;
        localObject1 = com.tencent.mm.plugin.sns.data.i.jV(localcbf.vQE);
        locall = af.cnJ().YX(localcbf.vHl);
        if (bo.isNullOrNil(locall.field_newerIds))
          break label413;
        localObject2 = locall.field_newerIds.split(",");
        i = 0;
        j = 1;
        while (i < localObject2.length)
        {
          if (((String)localObject1).equals(localObject2[i]))
            j = 0;
          i++;
        }
      }
      int i = 0;
      paramtb = (tb)localObject1;
      while ((i < 2) && (i < localObject2.length) && (j != 0))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramtb = paramtb + "," + localObject2[i];
        i++;
      }
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("snsync newerIds ");
      ab.d("MicroMsg.NetSceneNewSyncAlbum", localcbf.vQE + " S: " + (String)localObject1 + " list " + locall.field_newerIds + " newer " + paramtb);
      if (j != 0)
        af.cnJ().gq(localcbf.vHl, paramtb);
      label379: 
      while (af.cnF().kv(localcbf.vQE))
      {
        ab.i("MicroMsg.NetSceneNewSyncAlbum", "this item has in your sns pass it");
        AppMethodBeat.o(36312);
        bool2 = bool1;
        return bool2;
        af.cnJ().gq(localcbf.vHl, (String)localObject1);
      }
    }
    catch (Exception paramtb)
    {
      while (true)
      {
        cbf localcbf;
        label413: ab.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramtb, "", new Object[0]);
        AppMethodBeat.o(36312);
        boolean bool2 = bool1;
        continue;
        paramtb = com.tencent.mm.sdk.b.a.xxA;
        Object localObject1 = new com/tencent/mm/g/a/rn;
        ((rn)localObject1).<init>();
        paramtb.m((com.tencent.mm.sdk.b.b)localObject1);
        paramtb = af.bCo();
        localObject1 = new com/tencent/mm/plugin/sns/model/u$1;
        ((u.1)localObject1).<init>(this, localcbf, paramak);
        paramtb.post((Runnable)localObject1);
        AppMethodBeat.o(36312);
        bool2 = true;
      }
    }
  }

  public final boolean acI()
  {
    return true;
  }

  public final int acn()
  {
    return 10;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final boolean b(tb paramtb, ak paramak)
  {
    AppMethodBeat.i(36313);
    try
    {
      localObject1 = new com/tencent/mm/protocal/protobuf/cao;
      ((cao)localObject1).<init>();
      localcao = (cao)((cao)localObject1).parseFrom(paramtb.wau.getBuffer().toByteArray());
      l1 = localcao.vQE;
      l2 = localcao.wZM;
      localcan1 = localcao.wZN;
      localObject1 = localcao.ptv;
      paramtb = (tb)localObject1;
      if (localObject1 == null)
        paramtb = "";
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("process action ");
      ab.i("MicroMsg.NetSceneNewSyncAlbum", localcan1.jCt + " " + l1 + " " + paramtb);
      switch (localcan1.jCt)
      {
      default:
        a(localcao);
      case 9:
        while (!d.fF(localcan1.wZL, 2))
        {
          bool = true;
          localObject1 = af.bCo();
          paramtb = new com/tencent/mm/plugin/sns/model/u$2;
          paramtb.<init>(this, bool, localcan1, paramak);
          ((ak)localObject1).post(paramtb);
          bool = true;
          AppMethodBeat.o(36313);
          return bool;
          paramtb = af.cnK().f(l1, localcan1.wZG, localcan1.jCt);
          if (paramtb != null)
          {
            paramtb.cqD();
            bool = af.cnK().a(paramtb.xDa, paramtb);
            aj.b(l1, localcao);
            ab.i("MicroMsg.NetSceneNewSyncAlbum", " setdel flag  ".concat(String.valueOf(bool)));
          }
        }
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      }
    }
    catch (Exception paramtb)
    {
      while (true)
      {
        Object localObject1;
        cao localcao;
        long l1;
        long l2;
        can localcan1;
        ab.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramtb, "", new Object[0]);
        boolean bool = false;
        AppMethodBeat.o(36313);
        continue;
        paramtb = af.cnK().f(l1, localcan1.wZJ, localcan1.jCt);
        if (paramtb != null)
        {
          paramtb.cqD();
          bool = af.cnK().a(paramtb.xDa, paramtb);
          aj.b(l1, localcao);
          ab.i("MicroMsg.NetSceneNewSyncAlbum", " setdel ad flag  ".concat(String.valueOf(bool)));
          continue;
          localObject1 = af.cnK();
          paramtb = " update SnsComment set commentflag = 2 where snsID = ".concat(String.valueOf(l1));
          ab.i("MicroMsg.SnsCommentStorage", "set sns del ".concat(String.valueOf(paramtb)));
          bool = ((com.tencent.mm.plugin.sns.storage.k)localObject1).fni.hY("SnsComment", paramtb);
          if (bool)
            ((com.tencent.mm.plugin.sns.storage.k)localObject1).doNotify();
          ab.i("MicroMsg.NetSceneNewSyncAlbum", "processSnsDelAction ".concat(String.valueOf(bool)));
          continue;
          paramtb = af.cnK();
          Object localObject2 = localcan1.wPm;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>(" update SnsComment set commentflag = 1 where snsID = ");
          localObject1 = l1 + " and talker = '" + bo.vA((String)localObject2) + "'";
          ab.i("MicroMsg.SnsCommentStorage", "set sns del  by username ".concat(String.valueOf(localObject1)));
          bool = paramtb.fni.hY("SnsComment", (String)localObject1);
          if (bool)
            paramtb.doNotify();
          ab.i("MicroMsg.NetSceneNewSyncAlbum", "processAdSnsDelAction ".concat(String.valueOf(bool)));
          aj.b(l1, localcao);
          continue;
          a(localcao, localcan1, l1, l2, paramtb);
          continue;
          b(localcao, localcan1, l1, l2, paramtb);
          continue;
          com.tencent.mm.plugin.sns.storage.i.kw(l1);
          localObject1 = af.cnF().kD(l1);
          paramtb = ((n)localObject1).cqu();
          paramtb.dtW = 1;
          ((n)localObject1).c(paramtb);
          af.cnF().b(l1, (n)localObject1);
          continue;
          paramtb = localcan1.vFa;
          if (m.kc(l1))
          {
            localObject1 = new com/tencent/mm/plugin/sns/model/m;
            ((m)localObject1).<init>(l1, paramtb);
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject1, 0);
          }
          while (true)
          {
            try
            {
              localObject2 = localcao.wZN;
              localObject1 = bo.nullAsNil(localcao.ptv);
              l2 = localcao.wZM;
              int i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsAdNotifyLimit"), 0);
              int j = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsAdNotifyLikeTimeLimit"), 0);
              int k = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsAdNotifyCommentTimeLimit"), 0);
              if (paramtb == null)
                break label1064;
              ab.i("MicroMsg.NetSceneNewSyncAlbum", "processAdAtAction clientId %s, snsId %s, aid %s, commentId %s, actionLimit %s", new Object[] { localObject1, Long.valueOf(l1), Integer.valueOf(paramtb.wTz), Integer.valueOf(((can)localObject2).wZG), Integer.valueOf(i) });
              if (paramtb.wTz == 0)
                com.tencent.mm.plugin.report.service.h.pYm.k(955L, 4L, 1L);
              if (af.cnK().a(l1, ((can)localObject2).wPm, ((can)localObject2).pcX, (String)localObject1))
                break;
              can localcan2 = localcao.wZO;
              paramtb = new com/tencent/mm/plugin/sns/storage/j;
              paramtb.<init>();
              paramtb.field_snsID = l1;
              paramtb.field_parentID = l2;
              paramtb.field_createTime = ((can)localObject2).pcX;
              paramtb.field_talker = ((can)localObject2).wPm;
              paramtb.field_type = ((can)localObject2).jCt;
              paramtb.field_curActionBuf = ((can)localObject2).toByteArray();
              paramtb.field_refActionBuf = localcan2.toByteArray();
              paramtb.field_clientId = ((String)localObject1);
              if (!d.fF(((can)localObject2).wZL, 2))
                break label1088;
              m = 1;
              paramtb.field_isSilence = m;
              paramtb.field_commentSvrID = ((can)localObject2).wZJ;
              if (!af.cnI().kv(l1))
                break label1147;
              if (((i <= 0) && (j <= 0) && (k <= 0)) || (a.a(l1, localcao, i, j, k, true)))
                break label1094;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("check comment fail, pass comment ID ");
              ab.i("MicroMsg.NetSceneNewSyncAlbum", paramtb.field_snsID + " " + paramtb.field_commentSvrID);
            }
            catch (Exception paramtb)
            {
              ab.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramtb, "", new Object[0]);
            }
            break;
            label1064: ab.i("MicroMsg.NetSceneNewSyncAlbum", "remindFriendsInfo is null!");
            com.tencent.mm.plugin.report.service.h.pYm.k(955L, 3L, 1L);
            continue;
            label1088: int m = 0;
          }
          label1094: if (!a.a(l1, localcao))
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("pass comment ID ");
            ab.i("MicroMsg.NetSceneNewSyncAlbum", paramtb.field_snsID + " " + paramtb.field_commentSvrID);
          }
          else
          {
            label1147: af.cnK().b(paramtb);
            af.cnK().y(l1, d.fF(((can)localObject2).wZL, 2));
            continue;
            bool = false;
          }
        }
      }
    }
  }

  public final int getType()
  {
    return 214;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.u
 * JD-Core Version:    0.6.2
 */