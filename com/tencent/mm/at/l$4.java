package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.ai.t;
import com.tencent.mm.ai.v;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.clk;
import com.tencent.mm.protocal.protobuf.cll;
import com.tencent.mm.protocal.protobuf.my;
import com.tencent.mm.protocal.protobuf.mz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

final class l$4
  implements g.a
{
  l$4(l paraml)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(78325);
    ab.d(l.f(this.fFF), "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { l.j(this.fFF), Integer.valueOf(paramInt), paramc, paramd });
    if (paramInt == -21005)
    {
      ab.w(l.f(this.fFF), "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { l.j(this.fFF) });
      if (l.k(this.fFF) != null)
        l.k(this.fFF).agX();
      l.g(this.fFF).onSceneEnd(3, paramInt, "", this.fFF);
      AppMethodBeat.o(78325);
    }
    long l1;
    label418: e locale;
    Object localObject;
    while (true)
    {
      return 0;
      long l2;
      int i;
      int j;
      int k;
      if (paramInt != 0)
      {
        ab.e(l.f(this.fFF), "cdntra cdnCallback clientid:%s startRet:%d", new Object[] { l.j(this.fFF), Integer.valueOf(paramInt) });
        i.lC((int)l.b(this.fFF));
        i.lB((int)l.b(this.fFF));
        if (paramd != null)
        {
          l1 = l.l(this.fFF);
          l2 = bo.anU();
          i = com.tencent.mm.al.c.bW(ah.getContext());
          j = l.m(this.fFF);
          k = paramd.field_fileLength;
          paramc = paramd.field_transInfo;
          if (paramd != null)
            break label418;
        }
        for (paramString = ""; ; paramString = l.sp(paramd.efY))
        {
          new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramc, "", "", "", "", "", "", "", paramString })).ajK();
          l.g(this.fFF).onSceneEnd(3, paramInt, "", this.fFF);
          if (l.k(this.fFF) != null)
            l.k(this.fFF).agX();
          AppMethodBeat.o(78325);
          break;
        }
      }
      locale = l.d(this.fFF);
      if ((locale == null) || (locale.fDy != l.c(this.fFF)))
      {
        com.tencent.mm.al.f.afx().rN(l.j(this.fFF));
        ab.e(l.f(this.fFF), "cdntra get imginfo failed maybe delete by user imgLocalId:%d client:%s", new Object[] { Long.valueOf(l.c(this.fFF)), l.j(this.fFF) });
        if (l.k(this.fFF) != null)
          l.k(this.fFF).agX();
        AppMethodBeat.o(78325);
      }
      else if (paramc != null)
      {
        l.a(this.fFF, locale, paramc.field_finishedLength, 0L, 0, paramd);
        AppMethodBeat.o(78325);
      }
      else if (paramd != null)
      {
        ab.i(l.f(this.fFF), "dkupimg sceneResult:%s", new Object[] { paramd });
        if (paramd.field_retCode != 0)
        {
          ab.e(l.f(this.fFF), "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { l.j(this.fFF), Integer.valueOf(paramd.field_retCode), paramd });
          if (paramd.field_retCode == -21111)
          {
            ab.w(l.f(this.fFF), "summersafecdn cdntra  ERR_CDNCOM_SAFEPROTO_NOAESKEY clientid:%s, enableHitcheck:%b", new Object[] { l.j(this.fFF), Boolean.valueOf(l.n(this.fFF)) });
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RS().aa(new l.4.1(this, paramd));
            AppMethodBeat.o(78325);
            continue;
          }
          if (paramd.field_retCode == -5103237)
          {
            ab.w(l.f(this.fFF), "upload hevc failed try jpg");
            com.tencent.mm.kernel.g.RS().aa(new l.4.2(this));
            AppMethodBeat.o(78325);
            continue;
          }
          paramString = null;
          if (!bo.cb(paramd.field_sKeyrespbuf))
            paramString = new cll();
        }
      }
      else
      {
        try
        {
          paramString.parseFrom(paramd.field_sKeyrespbuf);
          ab.d(l.f(this.fFF), "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramString.BaseResponse.Ret), paramString.BaseResponse.ErrMsg.toString() });
          i.lC((int)l.b(this.fFF));
          i.lB((int)l.b(this.fFF));
          j = paramd.field_retCode;
          l1 = l.l(this.fFF);
          l2 = bo.anU();
          i = com.tencent.mm.al.c.bW(ah.getContext());
          k = l.m(this.fFF);
          paramInt = paramd.field_fileLength;
          localObject = paramd.field_transInfo;
          if (paramd == null)
          {
            paramc = "";
            paramc = com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(j), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(paramInt), localObject, "", "", "", "", "", "", "", paramc });
            new com.tencent.mm.g.b.a.f(paramc).ajK();
            new com.tencent.mm.g.b.a.d(paramc).ajK();
            if ((paramString == null) || (paramString.BaseResponse.Ret == 0))
              break label1258;
            l.g(this.fFF).onSceneEnd(4, paramString.BaseResponse.Ret, paramString.BaseResponse.ErrMsg.toString(), this.fFF);
            if (l.k(this.fFF) != null)
              l.k(this.fFF).agX();
            label1136: AppMethodBeat.o(78325);
          }
        }
        catch (IOException paramc)
        {
          while (true)
          {
            paramString = null;
            ab.e(l.f(this.fFF), "UploadMsgImgResponse parse fail: %s", new Object[] { paramc });
            ab.e(l.f(this.fFF), "exception:%s", new Object[] { bo.l(paramc) });
          }
        }
        catch (e.a.a.b paramc)
        {
          while (true)
          {
            paramString = null;
            ab.e(l.f(this.fFF), "UploadMsgImgResponse parse UninitializedMessageException: %s", new Object[] { paramc });
            ab.e(l.f(this.fFF), "exception:%s", new Object[] { bo.l(paramc) });
            continue;
            paramc = l.sp(paramd.efY);
            continue;
            label1258: l.g(this.fFF).onSceneEnd(3, paramd.field_retCode, "", this.fFF);
          }
        }
      }
    }
    ab.i(l.f(this.fFF), "summersafecdn uploadMsgImg by cdn, UploadHitCacheType: %d, needSendMsg:%b", new Object[] { Integer.valueOf(paramd.field_UploadHitCacheType), Boolean.valueOf(paramd.field_needSendMsgField) });
    paramString = h.pYm;
    if (locale.cvd == 0)
    {
      paramInt = 3;
      label1338: paramString.e(13230, new Object[] { Integer.valueOf(paramInt), l.u(this.fFF), Integer.valueOf(paramd.field_UploadHitCacheType) });
      paramString = l.v(this.fFF);
      paramc = f.sg(paramString);
      if ((paramc == null) || (bo.isNullOrNil(paramc.appId)))
        break label2921;
    }
    label1582: label2509: label2918: label2921: for (paramc = f.c(paramc.appId, paramc.mediaTagName, paramc.messageExt, paramc.messageAction); ; paramc = "")
    {
      if (bo.isNullOrNil(paramString))
      {
        paramString = "<msg><img aeskey=\"" + paramd.field_aesKey + "\" cdnmidimgurl=\"" + paramd.field_fileId + "\" cdnbigimgurl=\"" + paramd.field_fileId + "\" ";
        paramString = paramString + "cdnthumburl=\"" + paramd.field_fileId + "\" cdnthumbaeskey=\"" + paramd.field_aesKey + "\" cdnthumblength=\"" + paramd.field_thumbimgLength + "\" ";
        paramString = new StringBuilder().append(paramString).append("length=\"");
        if (paramd.field_midimgLength == 0)
        {
          paramInt = paramd.field_fileLength;
          paramString = paramInt + "\" hdlength=\"" + paramd.field_fileLength + "\"/>" + paramc + "</msg>";
          ab.i(l.f(this.fFF), "cdn callback new build cdnInfo:%s", new Object[] { paramString });
        }
      }
      while (true)
      {
        while (true)
        {
          localObject = paramString;
          if (paramd.Jm())
          {
            if (!bo.isNullOrNil(l.w(this.fFF)))
              break label2337;
            ab.w(l.f(this.fFF), "summersafecdn sceneResult isUploadBySafeCDNWithMD5 but prepareResponse AESKey is null");
          }
          for (localObject = paramString; ; localObject = paramString + "length=\"" + paramd.field_midimgLength + "\" hdlength=\"" + paramd.field_fileLength + "\"/>" + paramc + "</msg>")
          {
            locale.se((String)localObject);
            l.b(this.fFF, (String)localObject);
            if (l.b(this.fFF) != l.c(this.fFF))
              l.e(this.fFF).se((String)localObject);
            if (!paramd.field_needSendMsgField)
              break label2509;
            com.tencent.mm.kernel.g.RO().eJo.a(new m(l.x(this.fFF), (clk)l.s(this.fFF).fsG.fsP, locale, paramd, new l.4.3(this, paramd, locale)), 0);
            break;
            paramInt = locale.cvd;
            break label1338;
            paramInt = paramd.field_midimgLength;
            break label1582;
            localObject = br.z(paramString, "msg");
            if (localObject == null)
              break label2918;
            if (locale.fDC == 0)
            {
              paramString = "<msg><img aeskey=\"" + (String)((Map)localObject).get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + paramd.field_fileId + "\" cdnbigimgurl=\"" + (String)((Map)localObject).get(".msg.img.$cdnbigimgurl") + "\" ";
              paramString = paramString + "cdnthumburl=\"" + (String)((Map)localObject).get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)((Map)localObject).get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)((Map)localObject).get(".msg.img.cdnthumblength") + "\" ";
              paramString = new StringBuilder().append(paramString).append("length=\"");
              if (paramd.field_midimgLength == 0)
                paramInt = paramd.field_fileLength;
            }
            label2028: for (paramString = paramInt + "\" hdlength=\"" + (String)((Map)localObject).get(".msg.img.$hdlength") + "\"/>" + paramc + "</msg>"; ; paramString = paramString + "length=\"" + (String)((Map)localObject).get(".msg.img.$length") + "\" hdlength=\"" + paramd.field_fileLength + "\"/>" + paramc + "</msg>")
            {
              ab.i(l.f(this.fFF), "cdn callback rebuild cdnInfo:%s", new Object[] { paramString });
              break;
              paramInt = paramd.field_midimgLength;
              break label2028;
              paramString = "<msg><img aeskey=\"" + (String)((Map)localObject).get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + (String)((Map)localObject).get(".msg.img.$cdnmidimgurl") + "\" cdnbigimgurl=\"" + paramd.field_fileId + "\" ";
              paramString = paramString + "cdnthumburl=\"" + (String)((Map)localObject).get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)((Map)localObject).get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)((Map)localObject).get(".msg.img.cdnthumblength") + "\" ";
            }
            paramString = "<msg><img aeskey=\"" + l.w(this.fFF) + "\" cdnmidimgurl=\"" + paramd.field_fileId + "\" cdnbigimgurl=\"" + paramd.field_fileId + "\" ";
            paramString = paramString + "cdnthumburl=\"" + paramd.field_fileId + "\" cdnthumbaeskey=\"" + l.w(this.fFF) + "\" ";
          }
          new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(l.l(this.fFF)), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(l.m(this.fFF)), Integer.valueOf(paramd.field_fileLength), paramd.field_transInfo, "", "", "", "", "", "", "", l.sp(paramd.efY) })).ajK();
          paramString = new cll();
          try
          {
            paramString.parseFrom(paramd.field_sKeyrespbuf);
            if (paramString.ptF != 0L);
            for (l1 = paramString.ptF; ; l1 = paramInt)
            {
              ab.d(l.f(this.fFF), "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramString.BaseResponse.Ret), paramString.BaseResponse.ErrMsg.toString() });
              if (l.a(this.fFF, locale, locale.frO, l1, paramString.pcX, paramd))
              {
                l.g(this.fFF).onSceneEnd(0, 0, "", this.fFF);
                if (l.k(this.fFF) != null)
                  l.k(this.fFF).agX();
              }
              AppMethodBeat.o(78325);
              break;
              paramInt = paramString.ptD;
            }
          }
          catch (IOException paramString)
          {
            ab.e(l.f(this.fFF), "UploadMsgImgResponse parse fail: %s", new Object[] { paramString });
            ab.e(l.f(this.fFF), "exception:%s", new Object[] { bo.l(paramString) });
            l.g(this.fFF).onSceneEnd(3, paramd.field_retCode, "", this.fFF);
          }
        }
        if (l.k(this.fFF) == null)
          break label1136;
        l.k(this.fFF).agX();
        break label1136;
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(78326);
    Object localObject1 = (clk)l.s(this.fFF).fsG.fsP;
    my localmy = new my();
    localmy.vRl = ((clk)localObject1).xja.wVI;
    localmy.ndG = ((clk)localObject1).vEB.wVI;
    localmy.ndF = ((clk)localObject1).vEC.wVI;
    localmy.vRm = ((clk)localObject1).xjh;
    localmy.vRn = ((clk)localObject1).xji;
    localmy.Scene = l.y(this.fFF);
    localmy.vRp = l.z(this.fFF);
    localmy.vRq = l.A(this.fFF);
    localmy.vRr = l.B(this.fFF);
    localmy.vEG = ((clk)localObject1).vEG;
    localmy.vRw = l.C(this.fFF);
    localmy.fKh = ((clk)localObject1).fKh;
    localmy.vCs = ((clk)localObject1).vCs;
    localmy.vCu = ((clk)localObject1).vCu;
    localmy.vCt = ((clk)localObject1).vCt;
    localObject1 = l.d(this.fFF);
    Object localObject2 = o.ahl().q(((e)localObject1).fDz, "", "");
    com.tencent.mm.al.f.afy();
    localmy.vRy = com.tencent.mm.al.a.rI((String)localObject2);
    localmy.vRz = ((e)localObject1).fDD;
    int i;
    if (localmy.vRz <= 0)
    {
      if (l.x(this.fFF) == 4)
      {
        i = 2;
        localmy.vRz = i;
      }
    }
    else
      switch (l.x(this.fFF))
      {
      case 3:
      case 5:
      default:
        localmy.vFH = 2;
        label318: if (localmy.vRz == 3)
          localmy.vFH = 4;
        ab.i(l.f(this.fFF), "getCdnAuthInfo: mediaid:%s thumbwidth:%d, thumbheight:%d,MsgSource:%s,touser:%s aeskey[%s], imgLocalId[%d], msgLocalId[%d], getBigImgPath()[%s], fullpath[%s], prereq.CRC32[%d] prereq.MsgForwardType[%d], prereq.Source[%d]", new Object[] { paramString, Integer.valueOf(localmy.vRm), Integer.valueOf(localmy.vRn), localmy.vEG, localmy.ndF, localmy.vRw, Long.valueOf(l.c(this.fFF)), Long.valueOf(l.D(this.fFF)), ((e)localObject1).fDz, localObject2, Integer.valueOf(localmy.vRy), Integer.valueOf(localmy.vRz), Integer.valueOf(localmy.vFH) });
        paramString = new b.a();
        paramString.fsJ = localmy;
        paramString.fsK = new cll();
        paramString.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
        paramString.fsI = 625;
        paramString.fsL = 9;
        paramString.fsM = 1000000009;
        localObject1 = paramString.acD();
        localObject2 = l.E(this.fFF).adg();
        String str = l.f(this.fFF);
        if (localObject2 == null)
        {
          paramString = "acc == null";
          label568: ab.i(str, "getCdnAuthInfo login:%s", new Object[] { paramString });
          if ((localObject2 == null) || (!((com.tencent.mm.network.c)localObject2).adb()))
            break label752;
          if (!t.a(((com.tencent.mm.network.c)localObject2).jQ(1), ((com.tencent.mm.network.c)localObject2).ada(), ((com.tencent.mm.network.c)localObject2).adc(), ((com.tencent.mm.ai.b)localObject1).acF(), paramByteArrayOutputStream, ((com.tencent.mm.network.c)localObject2).ade()))
            break label718;
          ab.d(l.f(this.fFF), "getCdnAuthInfo successed.clientimgid:%s", new Object[] { localmy.vRl });
          AppMethodBeat.o(78326);
        }
        break;
      case 1:
      case 2:
      case 4:
      case 6:
      }
    while (true)
    {
      return;
      i = 1;
      break;
      localmy.vFH = 1;
      break label318;
      localmy.vFH = 3;
      break label318;
      localmy.vFH = 5;
      break label318;
      paramString = Boolean.valueOf(((com.tencent.mm.network.c)localObject2).adb());
      break label568;
      label718: ab.e(l.f(this.fFF), "getCdnAuthInfo failed. clientimgid:%s", new Object[] { localmy.vRl });
      AppMethodBeat.o(78326);
      continue;
      label752: ab.e(l.f(this.fFF), "getCdnAuthInfo accinfo return null. clientimgid:%s", new Object[] { localmy.vRl });
      AppMethodBeat.o(78326);
    }
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78327);
    PInt localPInt = new PInt();
    mz localmz = new mz();
    try
    {
      paramArrayOfByte = v.a(paramArrayOfByte, com.tencent.mm.kernel.g.RO().eJo.ftA.adg().jQ(1), localPInt, localmz);
      ab.i(l.f(this.fFF), "decodePrepareResponse aeskey[%s], fileid[%s], clientimgid[%s]", new Object[] { localmz.vRw, localmz.vRA, localmz.vRl });
      l.c(this.fFF, localmz.vRw);
      ab.i(l.f(this.fFF), "decodePrepareResponse, clientmediaid:%s, ret:%d", new Object[] { paramString, Integer.valueOf(localPInt.value) });
      AppMethodBeat.o(78327);
      paramString = paramArrayOfByte;
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e(l.f(this.fFF), "decodePrepareResponse Exception:%s", new Object[] { paramString });
        l.c(this.fFF, null);
        AppMethodBeat.o(78327);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.l.4
 * JD-Core Version:    0.6.2
 */