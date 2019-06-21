package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.np;
import com.tencent.mm.g.a.rp;
import com.tencent.mm.g.a.rq;
import com.tencent.mm.g.a.rr;
import com.tencent.mm.g.a.vt;
import com.tencent.mm.g.a.vt.a;
import com.tencent.mm.g.a.vu;
import com.tencent.mm.g.a.vu.a;
import com.tencent.mm.model.u;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelvideo.n.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.at;
import com.tencent.mm.protocal.protobuf.av;
import com.tencent.mm.protocal.protobuf.ayq;
import com.tencent.mm.protocal.protobuf.bas;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.bax;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cap;
import com.tencent.mm.protocal.protobuf.cba;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbp;
import com.tencent.mm.protocal.protobuf.cbq;
import com.tencent.mm.protocal.protobuf.cbr;
import com.tencent.mm.protocal.protobuf.cbu;
import com.tencent.mm.protocal.protobuf.cde;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.civ;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.nl;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class s extends m
  implements k
{
  int cNE;
  int eFs;
  private com.tencent.mm.sdk.b.c eFv;
  private com.tencent.mm.sdk.b.c eFw;
  private com.tencent.mm.ai.b ehh;
  public f ehi;
  boolean ekq;
  private TimeLineObject qJm;
  private TimeLineObject qJn;
  long qJo;
  private int qJp;
  private vt qJq;
  private vu qJr;
  int qJs;
  private HashMap<Integer, Integer> qJt;
  String qJu;
  HashMap<String, bau> qJv;
  HashMap<String, Integer> qJw;
  String qJx;

  public s(String paramString1, int paramInt1, int paramInt2, List<String> paramList, TimeLineObject paramTimeLineObject, int paramInt3, String paramString2, int paramInt4, LinkedList<Long> paramLinkedList, int paramInt5, bav parambav, boolean paramBoolean, LinkedList<bts> paramLinkedList1, cbp paramcbp, com.tencent.mm.bt.b paramb, String paramString3)
  {
    AppMethodBeat.i(36289);
    this.qJo = 0L;
    this.ekq = false;
    this.qJp = 0;
    this.qJt = new HashMap();
    this.eFs = 0;
    this.qJu = "";
    this.qJv = new HashMap();
    this.qJw = new HashMap();
    this.qJx = "";
    this.eFv = new s.2(this);
    this.eFw = new s.3(this);
    this.qJm = paramTimeLineObject;
    this.cNE = paramInt3;
    this.qJs = paramInt5;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new cbq();
    ((b.a)localObject1).fsK = new cbr();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnspost";
    ((b.a)localObject1).fsI = 209;
    ((b.a)localObject1).fsL = 97;
    ((b.a)localObject1).fsM = 1000000097;
    this.ehh = ((b.a)localObject1).acD();
    cbq localcbq = (cbq)this.ehh.fsG.fsP;
    if (!TextUtils.isEmpty(paramTimeLineObject.qNO.vCy.vCt))
    {
      localObject1 = new nl();
      ((nl)localObject1).vRQ = paramTimeLineObject.qNO.vCy.vCt;
      localcbq.xba = ((nl)localObject1);
    }
    localObject1 = com.tencent.mm.model.v.Zp().nV(parambav.cvF);
    Object localObject2;
    if (localObject1 != null)
    {
      this.qJq = new vt();
      this.qJq.cSG.cSH = ((v.b)localObject1).getString("prePublishId", "");
      this.qJq.cSG.url = ((v.b)localObject1).getString("url", "");
      this.qJq.cSG.cSJ = ((v.b)localObject1).getString("preUsername", "");
      this.qJq.cSG.cSK = ((v.b)localObject1).getString("preChatName", "");
      this.qJq.cSG.cSL = ((v.b)localObject1).getInt("preMsgIndex", 0);
      this.qJq.cSG.cSP = ((v.b)localObject1).getInt("sendAppMsgScene", 0);
      this.qJq.cSG.cSQ = ((v.b)localObject1).getInt("getA8KeyScene", 0);
      this.qJq.cSG.cSR = ((v.b)localObject1).getString("referUrl", null);
      this.qJq.cSG.cSS = ((v.b)localObject1).getString("adExtStr", null);
      this.qJq.cSG.cST = paramString3;
      if (((v.b)localObject1).containsKey("_tmpl_webview_transfer_scene"))
      {
        this.qJr = new vu();
        this.qJr.cSV.cSW = ((v.b)localObject1).getInt("_tmpl_webview_transfer_scene", -1);
      }
      localObject1 = "";
      paramString3 = (String)localObject1;
      if (paramTimeLineObject.rjC != null)
      {
        localObject2 = new cdg();
        paramString3 = Base64.decode(paramTimeLineObject.rjC, 0);
      }
    }
    try
    {
      ((cdg)localObject2).parseFrom(paramString3);
      paramString3 = (String)localObject1;
      if (((cdg)localObject2).xcU != null)
        paramString3 = ((cdg)localObject2).xcU.mVX;
      localObject1 = paramString3;
      if (bo.isNullOrNil(paramString3))
      {
        localObject1 = paramString3;
        if (paramTimeLineObject.xfH != null)
          localObject1 = paramTimeLineObject.xfH.Id;
      }
      localcbq.xaZ = String.format(Locale.US, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[] { this.qJq.cSG.cSH, this.qJq.cSG.cSJ, this.qJq.cSG.cSK, Integer.valueOf(u.ad(this.qJq.cSG.cSJ, this.qJq.cSG.cSK)), Integer.valueOf(this.qJq.cSG.cSQ), localObject1 });
      paramString3 = new SKBuiltinBuffer_t();
      paramString3.setBuffer(paramString1.getBytes());
      int i = paramString1.length();
      int j = paramString3.getILen();
      if (paramb == null);
      for (paramInt3 = 0; ; paramInt3 = paramb.wR.length)
      {
        ab.i("MicroMsg.NetSceneSnsPost", "len:%d   skb:%d ctx.len:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt3) });
        localcbq.xam = paramString3;
        localcbq.xaU = paramInt1;
        localcbq.wFe = paramInt2;
        localcbq.ptv = paramString2;
        this.qJp = paramInt1;
        if (ae.gib)
        {
          localcbq.xam = new SKBuiltinBuffer_t();
          ab.e("MicroMsg.NetSceneSnsPost", "post error setObjectDesc is null!");
        }
        paramString3 = new LinkedList();
        if ((paramList == null) || (paramList.size() <= 0))
          break label981;
        paramList = paramList.iterator();
        for (paramString1 = ""; paramList.hasNext(); paramString1 = paramString1 + "; + " + (String)localObject2)
        {
          localObject2 = (String)paramList.next();
          localObject1 = new bts();
          ((bts)localObject1).alV((String)localObject2);
          paramString3.add(localObject1);
        }
      }
      ab.d("MicroMsg.NetSceneSnsPost", "post with list : ".concat(String.valueOf(paramString1)));
      label981: localcbq.xaw = paramString3;
      localcbq.xav = paramString3.size();
      localcbq.xaV = paramInt4;
      paramString1 = localcbq.xaZ;
      if (parambav.wFw != null)
      {
        paramInt1 = parambav.wFw.wZS;
        ab.i("MicroMsg.NetSceneSnsPost", "setObjectSource: %d, clientid:%s fromScene:%s, score:%d", new Object[] { Integer.valueOf(paramInt5), paramString2, paramString1, Integer.valueOf(paramInt1) });
        if ((paramLinkedList1 != null) && (paramLinkedList1.size() > 0))
        {
          if (!paramBoolean)
            break label1254;
          localcbq.xaB = paramLinkedList1;
          localcbq.xaA = paramLinkedList1.size();
        }
      }
      while (true)
      {
        ab.d("MicroMsg.NetSceneSnsPost", "setObjectSource ".concat(String.valueOf(paramInt5)));
        localcbq.xaW = paramInt5;
        paramString1 = new civ();
        if (!bo.isNullOrNil(parambav.token))
        {
          paramString1.xhJ = parambav.token;
          paramString1.xhK = parambav.wFn;
          localcbq.wNQ = paramString1;
        }
        if ((paramLinkedList == null) || (paramLinkedList.isEmpty()))
          break label1318;
        localcbq.wHG = paramLinkedList.size();
        paramString1 = paramLinkedList.iterator();
        while (paramString1.hasNext())
        {
          paramList = (Long)paramString1.next();
          paramString2 = new cba();
          paramString2.xak = paramList.longValue();
          localcbq.wFk.add(paramString2);
        }
        paramInt1 = 0;
        break;
        label1254: localcbq.wFp = paramLinkedList1;
        localcbq.xaC = paramLinkedList1.size();
      }
      ab.d("MicroMsg.NetSceneSnsPost", "tagid " + paramLinkedList.size() + " " + localcbq.wFk.toString());
      label1318: localcbq.wFq = paramcbp;
      if (!bo.isNullOrNil(parambav.wFs))
        localcbq.xaE = new cbu();
      if (paramcbp != null)
        ab.d("MicroMsg.NetSceneSnsPost", "SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", new Object[] { paramcbp.vFJ, paramcbp.vFK, paramcbp.vFL });
      if (paramb != null)
        localcbq.xaY = new SKBuiltinBuffer_t().setBuffer(paramb);
      localcbq.xbd = parambav.wFw;
      paramString1 = af.cnF().DK(this.cNE);
      if ((paramString1 != null) && ((paramString1.field_type == 1) || (paramString1.field_type == 15)) && (paramTimeLineObject.xfI != null) && (paramTimeLineObject.xfI.wbK != null) && (paramTimeLineObject.xfI.wbK.size() > 0) && (parambav.wFf != null) && (parambav.wFf.size() == paramTimeLineObject.xfI.wbK.size()))
      {
        paramString1 = af.getAccSnsPath();
        paramList = paramTimeLineObject.xfI.wbK.iterator();
        paramInt1 = 0;
      }
      while (true)
      {
        if (paramList.hasNext())
        {
          paramLinkedList = (bau)paramList.next();
          if ((paramLinkedList.jCt == 2) || (paramLinkedList.jCt == 6))
          {
            paramTimeLineObject = new bas();
            if (paramLinkedList.jCt != 2)
              break label1830;
            paramInt2 = 2;
            label1597: paramTimeLineObject.nda = paramInt2;
            if (paramLinkedList.jCt == 6)
            {
              paramString2 = an.fZ(paramString1, paramLinkedList.Id);
              paramLinkedList = com.tencent.mm.plugin.sns.data.i.p(paramLinkedList);
              paramString2 = com.tencent.mm.plugin.sight.base.d.WR(paramString2 + paramLinkedList);
              if (paramString2 != null)
                paramTimeLineObject.wED = ((int)Math.round(paramString2.eWK / 1000.0D));
            }
            paramString2 = (ayq)parambav.wFf.get(paramInt1);
            paramString2 = af.cnu().kE(paramString2.wCt);
          }
        }
        try
        {
          paramLinkedList = new com/tencent/mm/protocal/protobuf/bax;
          paramLinkedList.<init>();
          paramLinkedList = (bax)paramLinkedList.parseFrom(paramString2.rfI);
          paramTimeLineObject.vFH = paramLinkedList.wFI;
          this.qJt.put(Integer.valueOf(paramString2.reX), Integer.valueOf(paramLinkedList.wFI));
          label1767: ab.i("MicroMsg.NetSceneSnsPost", "post add mediaInfo, Source: %s, videoPlayLength: %s, MediaType: %s", new Object[] { Integer.valueOf(paramTimeLineObject.vFH), Integer.valueOf(paramTimeLineObject.wED), Integer.valueOf(paramTimeLineObject.nda) });
          localcbq.xbc.add(paramTimeLineObject);
          paramInt1++;
          continue;
          label1830: paramInt2 = 1;
          break label1597;
          localcbq.xbb = localcbq.xbc.size();
          ab.i("MicroMsg.NetSceneSnsPost", "post mediaCount: %s", new Object[] { Integer.valueOf(localcbq.xbb) });
          localcbq.vIl = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.bVS());
          AppMethodBeat.o(36289);
          return;
        }
        catch (Exception paramString2)
        {
          break label1767;
        }
      }
    }
    catch (Exception paramString3)
    {
      while (true)
        paramString3 = (String)localObject1;
    }
  }

  private void XQ(String paramString)
  {
    AppMethodBeat.i(36292);
    this.qJx = paramString;
    paramString = com.tencent.mm.model.c.c.abi().ll("100132");
    if (paramString.isValid())
      this.eFs = bo.getInt((String)paramString.dru().get("needUploadData"), 1);
    if ((this.qJs != 12) && (this.eFs == 0))
      AppMethodBeat.o(36292);
    while (true)
    {
      return;
      if ((this.qJn != null) && (this.qJn.xfI != null) && (this.qJn.xfI.wbK != null) && (this.qJn.xfI.wbK.size() > 0))
      {
        paramString = this.qJn.xfI.wbK;
        com.tencent.mm.sdk.b.a.xxA.c(this.eFv);
        com.tencent.mm.sdk.b.a.xxA.c(this.eFw);
        paramString = paramString.iterator();
        int i = 0;
        while (paramString.hasNext())
        {
          Object localObject = (bau)paramString.next();
          if (((bau)localObject).jCt == 2)
          {
            String str = g.C((bau)localObject);
            if (!bo.isNullOrNil(str))
            {
              this.qJw.put(str, Integer.valueOf(i));
              this.qJv.put(str, localObject);
              localObject = new np();
              ((np)localObject).cJU.filePath = str;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
              i++;
            }
          }
        }
      }
      AppMethodBeat.o(36292);
    }
  }

  private static boolean a(TimeLineObject paramTimeLineObject1, TimeLineObject paramTimeLineObject2)
  {
    AppMethodBeat.i(36293);
    boolean bool;
    if ((paramTimeLineObject1 == null) || (paramTimeLineObject2 == null) || (paramTimeLineObject1.xfI == null) || (paramTimeLineObject2.xfI == null))
    {
      bool = false;
      AppMethodBeat.o(36293);
    }
    while (true)
    {
      return bool;
      String str1 = af.getAccSnsPath();
      for (int i = 0; (i < paramTimeLineObject1.xfI.wbK.size()) && (i < paramTimeLineObject2.xfI.wbK.size()); i++)
      {
        Object localObject1 = (bau)paramTimeLineObject1.xfI.wbK.get(i);
        Object localObject2 = (bau)paramTimeLineObject2.xfI.wbK.get(i);
        String str2 = com.tencent.mm.plugin.sns.data.i.m((bau)localObject1);
        String str3 = com.tencent.mm.plugin.sns.data.i.n((bau)localObject1);
        String str4 = com.tencent.mm.plugin.sns.data.i.o((bau)localObject1);
        String str5 = com.tencent.mm.plugin.sns.data.i.p((bau)localObject1);
        String str6 = com.tencent.mm.plugin.sns.data.i.l((bau)localObject2);
        String str7 = com.tencent.mm.plugin.sns.data.i.e((bau)localObject2);
        String str8 = com.tencent.mm.plugin.sns.data.i.f((bau)localObject2);
        String str9 = com.tencent.mm.plugin.sns.data.i.j((bau)localObject2);
        ab.d("MicroMsg.NetSceneSnsPost", "updateMediaFileName " + str2 + "  - " + str6);
        localObject1 = an.fZ(str1, ((bau)localObject1).Id);
        localObject2 = an.fZ(str1, ((bau)localObject2).Id);
        com.tencent.mm.vfs.e.tf((String)localObject2);
        com.tencent.mm.vfs.e.aQ((String)localObject1 + str2, (String)localObject2 + str6);
        com.tencent.mm.vfs.e.aQ((String)localObject1 + str3, (String)localObject2 + str7);
        com.tencent.mm.vfs.e.aQ((String)localObject1 + str4, (String)localObject2 + str8);
        if (com.tencent.mm.vfs.e.ct((String)localObject1 + str5))
        {
          ab.i("MicroMsg.NetSceneSnsPost", "post done copy file %s", new Object[] { (String)localObject2 + str9 });
          com.tencent.mm.vfs.e.aQ((String)localObject1 + str5, (String)localObject2 + str9);
        }
      }
      bool = true;
      AppMethodBeat.o(36293);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(36290);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36290);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36291);
    ab.i("MicroMsg.NetSceneSnsPost", "post netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    Object localObject1 = (cbr)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if (paramInt2 == 4)
      paramq = af.cnF().DK(this.cNE);
    try
    {
      paramArrayOfByte = new com/tencent/mm/protocal/protobuf/bav;
      paramArrayOfByte.<init>();
      paramArrayOfByte = (bav)paramArrayOfByte.parseFrom(paramq.field_postBuf);
      paramArrayOfByte.wFm = paramInt3;
      paramArrayOfByte.wFu = ((cbr)localObject1).wFu;
      paramArrayOfByte.wFv = false;
      paramq.field_postBuf = paramArrayOfByte.toByteArray();
      label150: if (paramq != null)
      {
        paramq.cqY();
        af.cnF().b(this.cNE, paramq);
        af.cnE().CT(this.cNE);
        ab.d("MicroMsg.NetSceneSnsPost", "onErrorServer, publish SnsPostFailEvent, snsInfoLocalId: " + paramq.cqU());
        paramq = new rp();
        paramq.cNA.cNB = this.cNE;
        com.tencent.mm.sdk.b.a.xxA.m(paramq);
      }
      if ((this.qJm != null) && (this.qJm.xfI != null) && (this.qJm.xfI.wbJ == 21))
        com.tencent.mm.plugin.sns.lucky.a.b.kT(8);
      switch (paramInt3)
      {
      default:
        com.tencent.mm.plugin.sns.lucky.a.b.kT(20);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(36291);
      case 201:
      case -1:
      case 211:
      }
      while (true)
      {
        return;
        com.tencent.mm.plugin.sns.lucky.a.b.kT(17);
        break;
        com.tencent.mm.plugin.sns.lucky.a.b.kT(19);
        break;
        com.tencent.mm.plugin.sns.lucky.a.b.kT(18);
        break;
        if (paramInt3 != 0)
        {
          af.cnE().CT(this.cNE);
          if ((this.qJm != null) && (this.qJm.xfI != null) && (this.qJm.xfI.wbJ == 21))
          {
            com.tencent.mm.plugin.sns.lucky.a.b.kT(8);
            com.tencent.mm.plugin.sns.lucky.a.b.kT(16);
          }
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(36291);
          continue;
        }
        if ((((cbr)localObject1).wZu == null) || (((cbr)localObject1).wZu.xam == null) || (((cbr)localObject1).wZu.xam.getBuffer() == null))
        {
          ab.e("MicroMsg.NetSceneSnsPost", "err respone buffer is null ignore");
          af.cnE().CT(this.cNE);
          paramq = af.cnF().DK(this.cNE);
          if (paramq != null)
          {
            paramq.cqX();
            af.cnF().b(this.cNE, paramq);
            paramq = new rr();
            paramq.cNG.cNB = this.cNE;
            com.tencent.mm.sdk.b.a.xxA.m(paramq);
          }
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(36291);
          continue;
        }
        Object localObject2 = new String(((cbr)localObject1).wZu.xam.getBuffer().toByteArray());
        if (this.qJp == 0)
          ab.d("MicroMsg.NetSceneSnsPost", "resp " + (String)localObject2 + "  ");
        this.qJn = com.tencent.mm.modelsns.e.tC((String)localObject2);
        Object localObject3;
        if (this.qJn.xfN != null)
        {
          paramArrayOfByte = this.qJn.Id;
          localObject3 = this.qJn.xfN.fiN;
          paramq = this.qJn.xfN.fiM;
          com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
          locald.l("20CurrPublishId", paramArrayOfByte + ",");
          locald.l("20SourcePublishId", (String)localObject3 + ",");
          locald.l("20SourceAdUxInfo", paramq + ",");
          ab.i("MicroMsg.SnsVideoStatistic", "report snsad_shareReport: " + locald.Fk());
          com.tencent.mm.plugin.report.service.h.pYm.e(13004, new Object[] { locald });
        }
        paramArrayOfByte = af.cnF().DK(this.cNE);
        paramq = paramArrayOfByte;
        if (paramArrayOfByte == null)
        {
          ab.e("MicroMsg.NetSceneSnsPost", "the item has delete");
          paramq = new com.tencent.mm.plugin.sns.storage.n();
        }
        paramq.ls(((cbr)localObject1).wZu.pcX);
        paramq.YR((String)localObject2);
        paramq.field_localFlag &= -17;
        paramq.kz(((cbr)localObject1).wZu.vQE);
        paramq.kB(((cbr)localObject1).wZu.vQE);
        if ((((cbr)localObject1).wZu.wGz & 0x1) > 0)
          paramq.cqR();
        this.qJo = ((cbr)localObject1).wZu.vQE;
        if (this.qJq != null)
        {
          this.qJq.cSG.cSI = ("sns_" + com.tencent.mm.plugin.sns.data.i.jV(this.qJo));
          com.tencent.mm.sdk.b.a.xxA.m(this.qJq);
        }
        if ((this.qJr != null) && (this.qJr.cSV.cSW != -1))
          com.tencent.mm.sdk.b.a.xxA.m(this.qJr);
        localObject1 = ((cbr)localObject1).wZu;
        ((cbf)localObject1).xam.setBuffer(new byte[0]);
        try
        {
          if ((((cbf)localObject1).xas == 0) && (((cbf)localObject1).xap == 0) && (((cbf)localObject1).xav == 0) && (((cbf)localObject1).wHG == 0))
          {
            ab.d("MicroMsg.NetSceneSnsPost", "no use! this buf");
            label1113: paramq.cqX();
            af.cnF().b(this.cNE, paramq);
            af.cnE().CT(this.cNE);
            if (((this.qJm.xfI.wbJ == 1) && (this.qJm.dtW == 0) && (this.qJn.dtW == 1)) || ((this.qJm.xfI.wbJ == 15) && (this.qJm.xfP == 0) && (this.qJn.xfP == 1) && (com.tencent.mm.plugin.sns.storage.i.kw(com.tencent.mm.plugin.sns.storage.v.Zm(paramq.cqA())))))
              new ak(Looper.getMainLooper()).post(new s.1(this));
            paramArrayOfByte = com.tencent.mm.plugin.sns.i.g.qTp.co(Integer.valueOf(this.cNE));
            if ((paramArrayOfByte != null) && (this.qJn != null))
            {
              paramArrayOfByte.ajH();
              paramArrayOfByte.ajI();
              paramArrayOfByte.tz(this.qJn.Id);
              paramArrayOfByte.mb(this.qJn.xfI.wbJ);
              paramArrayOfByte.ajK();
            }
            paramArrayOfByte = com.tencent.mm.plugin.sns.i.h.qTp.co(Integer.valueOf(this.cNE));
            if ((paramArrayOfByte != null) && (this.qJn != null))
            {
              paramArrayOfByte.ajH();
              paramArrayOfByte.ajI();
              paramArrayOfByte.tz(this.qJn.Id);
              paramArrayOfByte.mb(this.qJn.xfI.wbJ);
              paramArrayOfByte.ajK();
            }
            paramArrayOfByte = new rr();
            paramArrayOfByte.cNG.cNB = this.cNE;
            com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte);
            if (paramq.field_type == 21)
            {
              com.tencent.mm.plugin.sns.lucky.a.b.kT(7);
              System.currentTimeMillis();
            }
            a(this.qJm, this.qJn);
            if (this.qJn != null)
              break label1714;
            paramArrayOfByte = "";
            label1470: XQ(paramArrayOfByte);
            if (af.cnB() != null)
              af.cnB().cmp();
          }
        }
        catch (IOException paramArrayOfByte)
        {
          try
          {
            long l;
            if (paramq.field_type == 15)
            {
              localObject2 = (bau)this.qJn.xfI.wbK.get(0);
              if (localObject2 != null)
              {
                paramq = new java/lang/StringBuilder;
                paramq.<init>();
                paramq = an.fZ(af.getAccSnsPath(), ((bau)localObject2).Id) + com.tencent.mm.plugin.sns.data.i.j((bau)localObject2);
                paramArrayOfByte = com.tencent.mm.modelvideo.n.alj();
                localObject2 = ((bau)localObject2).Url;
                l = ((cbf)localObject1).vQE;
                if (!bo.isNullOrNil((String)localObject2))
                {
                  boolean bool = bo.isNullOrNil(paramq);
                  if (!bool)
                    break label1726;
                }
              }
            }
            while (true)
            {
              label1600: l = ((cbf)localObject1).vQE;
              paramq = new rq();
              paramq.cNC.cND = l;
              paramq.cNC.cNE = this.cNE;
              paramq.cNC.cNF = this.qJt;
              com.tencent.mm.sdk.b.a.xxA.m(paramq);
              this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
              AppMethodBeat.o(36291);
              break;
              paramq.bi(((cbf)localObject1).toByteArray());
              break label1113;
              paramArrayOfByte = paramArrayOfByte;
              ab.printErrStackTrace("MicroMsg.NetSceneSnsPost", paramArrayOfByte, "", new Object[0]);
              break label1113;
              label1714: paramArrayOfByte = this.qJn.xfF;
              break label1470;
              label1726: localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((String)localObject2).hashCode();
              ab.d("MicroMsg.SubCoreMediaRpt", "rpt sns video upload info snsKey[%s] url[%s] snsId[%d] path[%s]", new Object[] { localObject3, localObject2, Long.valueOf(l), paramq });
              localObject2 = (n.a)paramArrayOfByte.fWm.get(localObject3);
              if (localObject2 != null)
              {
                ((n.a)localObject2).fWB = String.valueOf(l);
                ((n.a)localObject2).fWA = paramq;
                paramArrayOfByte.a(((n.a)localObject2).fVQ, (String)localObject3);
              }
            }
          }
          catch (Exception paramq)
          {
            break label1600;
          }
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      break label150;
    }
  }

  public final int getType()
  {
    return 209;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.s
 * JD-Core Version:    0.6.2
 */