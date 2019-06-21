package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.al.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.bi;
import java.util.Map;

public final class h extends com.tencent.mm.model.e
{
  public static int a(int paramInt1, com.tencent.mm.i.d paramd, bi parambi, String paramString1, long paramLong1, String paramString2, String paramString3, int paramInt2, long paramLong2, String paramString4)
  {
    AppMethodBeat.i(78280);
    if (paramInt1 != 0)
    {
      ab.e("MicroMsg.ImgMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), paramString1, paramString3, paramString2 });
      parambi.setStatus(5);
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().b(parambi.field_msgSvrId, parambi);
      paramd = com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_THUMBIMAGE), Integer.valueOf(paramInt2), "" });
      new com.tencent.mm.g.b.a.f(paramd).ajK();
      new com.tencent.mm.g.b.a.d(paramd).ajK();
      o.ahl().doNotify();
      AppMethodBeat.o(78280);
    }
    while (true)
    {
      return 0;
      if (paramd != null)
        break;
      AppMethodBeat.o(78280);
    }
    int i;
    label297: int k;
    if (paramd.field_retCode != 0)
    {
      ab.e("MicroMsg.ImgMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramd.field_retCode), Long.valueOf(paramLong1), paramString1, paramString3, paramString2 });
      parambi.setStatus(5);
      if (!bo.isNullOrNil(parambi.field_talker))
        ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().b(parambi.field_msgSvrId, parambi);
      if (paramd != null)
        break label941;
      i = paramInt1;
      paramLong1 = bo.anU();
      int j = com.tencent.mm.al.c.bW(ah.getContext());
      k = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
      if (paramd != null)
        break label950;
      parambi = "";
      label322: if (paramd != null)
        break label958;
      paramString1 = "";
      label329: new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(i), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt2), parambi, "", "", "", "", "", "", "", paramString1 })).ajK();
      if ((paramd != null) && (paramd.field_retCode != 0))
      {
        if (paramd != null)
          break label966;
        label471: paramLong1 = bo.anU();
        i = com.tencent.mm.al.c.bW(ah.getContext());
        k = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
        if (paramd != null)
          break label974;
        parambi = "";
        label496: if (paramd != null)
          break label982;
      }
    }
    label713: label974: label982: for (paramd = ""; ; paramd = paramd.efY)
    {
      new com.tencent.mm.g.b.a.d(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(paramInt2), parambi, "", "", "", "", "", "", "", paramd })).ajK();
      o.ahl().doNotify();
      AppMethodBeat.o(78280);
      break;
      if (r.amp(paramString4))
      {
        Object localObject = paramString2 + "_hevc";
        com.tencent.mm.vfs.e.aQ(paramString4, (String)localObject);
        if (!com.tencent.mm.vfs.e.ct(paramString2))
          com.tencent.mm.vfs.e.atc(paramString2);
        ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).nativeWxam2Pic((String)localObject, paramString2);
        parambi.setStatus(6);
        paramString4 = new PInt();
        localObject = new PInt();
        com.tencent.mm.sdk.platformtools.d.c(paramString2, paramString4, (PInt)localObject);
        parambi.hZ(paramString4.value);
        parambi.ia(((PInt)localObject).value);
        ab.i("MicroMsg.ImgMsgExtension", "getThumbByCdn succ. sceneResult.field_retCode:%d msgSvrId:%d fromUser:%s thumb[%d,%d] thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramd.field_retCode), Long.valueOf(paramLong1), paramString1, Integer.valueOf(paramString4.value), Integer.valueOf(((PInt)localObject).value), paramString3, paramString2 });
        if (!bo.isNullOrNil(parambi.field_talker))
          ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().b(parambi.field_msgSvrId, parambi);
        com.tencent.mm.plugin.report.service.h.pYm.a(198L, 1L, paramInt2, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(198L, 2L, 1L, false);
        parambi = com.tencent.mm.plugin.report.service.h.pYm;
        if (!t.kH(paramString1))
          break label933;
      }
      for (paramLong1 = 4L; ; paramLong1 = 3L)
      {
        parambi.a(198L, paramLong1, 1L, false);
        break;
        com.tencent.mm.vfs.e.aQ(paramString4, paramString2);
        break label713;
      }
      i = paramd.field_retCode;
      break label297;
      parambi = paramd.field_transInfo;
      break label322;
      paramString1 = paramd.efY;
      break label329;
      paramInt1 = paramd.field_retCode;
      break label471;
      parambi = paramd.field_transInfo;
      break label496;
    }
  }

  public final bi a(cm paramcm, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(78279);
    Object localObject1 = o.ahl();
    paramString3 = super.a(paramcm, paramString1, paramString2, paramString3);
    if (paramString3.field_msgId != 0L)
      AppMethodBeat.o(78279);
    long l1;
    while (true)
    {
      return paramString3;
      l1 = paramcm.ptF;
      paramString2 = ((g)localObject1).fI(l1);
      if (paramString2.cKK == l1)
      {
        com.tencent.mm.vfs.e.deleteFile(((g)localObject1).q(paramString2.fDz, "", ""));
        com.tencent.mm.vfs.e.deleteFile(((g)localObject1).q(paramString2.fDE, "", ""));
        com.tencent.mm.vfs.e.deleteFile(((g)localObject1).q(paramString2.fDB, "", ""));
        com.tencent.mm.vfs.e.deleteFile(((g)localObject1).q(paramString2.fDB, "", "") + "hd");
        ((g)localObject1).fni.delete("ImgInfo2", "msgSvrId=?", new String[] { String.valueOf(l1) });
        if (paramString2.agQ())
        {
          paramString2 = ((g)localObject1).ly(paramString2.fDJ);
          if (paramString2 != null)
          {
            com.tencent.mm.vfs.e.deleteFile(((g)localObject1).q(paramString2.fDz, "", ""));
            com.tencent.mm.vfs.e.deleteFile(((g)localObject1).q(paramString2.fDE, "", ""));
            com.tencent.mm.vfs.e.deleteFile(((g)localObject1).q(paramString2.fDB, "", ""));
            com.tencent.mm.vfs.e.deleteFile(((g)localObject1).q(paramString2.fDB, "", "") + "hd");
            ((g)localObject1).fni.delete("ImgInfo2", "id=?", new String[] { paramString2.fDy });
          }
        }
      }
      if (paramcm.vEE == 2)
        break;
      ab.e("MicroMsg.ImgMsgExtension", "data type img, but has no imgstatus_hasimg ?!");
      AppMethodBeat.o(78279);
    }
    paramString2 = aa.a(paramcm.vEF);
    if (ae.giF)
    {
      ab.w("MicroMsg.ImgMsgExtension", "Test.useCdnDownThumb  set img buf null !!!!!!!");
      paramString2 = null;
    }
    while (true)
    {
      Object localObject2 = br.z(paramString3.field_content, "msg");
      l1 = -1L;
      int i;
      int j;
      if (!bo.isNullOrNil(paramString3.field_content))
      {
        ab.i("MicroMsg.ImgMsgExtension", "cdntra content:[%s]", new Object[] { paramString3.field_content });
        if (localObject2 == null)
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 190L, 1L, false);
        if (localObject2 == null)
          break label1564;
        i = bo.getInt((String)((Map)localObject2).get(".msg.img.$hdlength"), 0);
        j = bo.getInt((String)((Map)localObject2).get(".msg.img.$tphdlength"), 0);
        if (i <= 0)
          break label1144;
        l1 = ((g)localObject1).a(paramString2, paramcm.ptF, true, paramString3.field_content, new PString(), new PInt(), new PInt());
      }
      while (true)
      {
        label527: Object localObject3 = br.z(paramString3.field_content, "msgoperation");
        if (localObject3 != null)
        {
          paramString3.jB((String)((Map)localObject3).get(".msgoperation.expinfo.expidstr"));
          paramString3.ie(bo.getInt((String)((Map)localObject3).get(".msgoperation.imagemsg.downloadcontroltype"), 0));
          ab.i("MicroMsg.ImgMsgExtension", "[chatting_exp] expidstr:%s, downloadcontroltype:%d", new Object[] { paramString3.dJE, Integer.valueOf(paramString3.dJF) });
        }
        localObject3 = (String)((Map)localObject2).get(".msg.img.$tpthumburl");
        PString localPString = new PString();
        PInt localPInt = new PInt();
        Object localObject4 = new PInt();
        long l2 = ((g)localObject1).a(paramString2, paramcm.ptF, false, paramString3.field_content, localPString, localPInt, (PInt)localObject4);
        if ((bo.cb(paramString2)) && (localObject2 != null) && (!bo.isNullOrNil((String)localObject3)))
        {
          localPInt.value = bo.getInt((String)((Map)localObject2).get(".msg.img.$tpthumbwidth"), 0);
          ((PInt)localObject4).value = bo.getInt((String)((Map)localObject2).get(".msg.img.$tpthumbheight"), 0);
        }
        if (l2 > 0L)
        {
          paramString3.jv(localPString.value);
          paramString3.hZ(localPInt.value);
          paramString3.ia(((PInt)localObject4).value);
          if (l1 > 0L)
          {
            paramcm = o.ahl().b(Long.valueOf(l2));
            paramcm.lx(1);
            paramcm.lu((int)l1);
            o.ahl().a(Long.valueOf(l2), paramcm);
          }
        }
        if ((bo.cb(paramString2)) && (localObject2 != null) && (!bo.isNullOrNil((String)localObject3)))
        {
          paramcm = (String)((Map)localObject2).get(".msg.img.$tpthumbaeskey");
          j = bo.getInt((String)((Map)localObject2).get(".msg.img.tpthumblength"), 0);
          paramString2 = (String)((Map)localObject2).get(".msg.img.$tpauthkey");
          localObject1 = ((g)localObject1).q(com.tencent.mm.a.g.x(("SERVERID://" + paramString3.field_msgSvrId).getBytes()), "th_", "");
          l2 = paramString3.field_msgSvrId;
          ab.i("MicroMsg.ImgMsgExtension", "getThumbByCdn msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l2), paramString1, localObject3, localObject1 });
          l1 = bo.anU();
          localObject4 = (String)localObject1 + ".tmp";
          localObject2 = new com.tencent.mm.i.g();
          ((com.tencent.mm.i.g)localObject2).field_mediaId = com.tencent.mm.al.c.a("downimgthumb", paramString3.field_createTime, paramString1, String.valueOf(l2));
          ((com.tencent.mm.i.g)localObject2).field_fullpath = ((String)localObject4);
          ((com.tencent.mm.i.g)localObject2).field_fileType = 19;
          ((com.tencent.mm.i.g)localObject2).field_aesKey = paramcm;
          ((com.tencent.mm.i.g)localObject2).field_authKey = paramString2;
          ((com.tencent.mm.i.g)localObject2).egm = ((String)localObject3);
          if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).bja())
          {
            i = 2;
            ((com.tencent.mm.i.g)localObject2).expectImageFormat = i;
            ((com.tencent.mm.i.g)localObject2).egl = new h.1(this, paramString3, paramString1, l2, (String)localObject1, (String)localObject3, j, l1, (String)localObject4);
            paramString3.setStatus(4);
            com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject2, -1);
          }
        }
        label1144: 
        while ((!bo.cb(paramString2)) || (localObject2 == null))
          while (true)
          {
            AppMethodBeat.o(78279);
            break;
            if (j <= 0)
              break label1564;
            l1 = ((g)localObject1).a(paramString2, paramcm.ptF, true, paramString3.field_content, new PString(), new PInt(), new PInt());
            break label527;
            i = 1;
          }
        paramString2 = (String)((Map)localObject2).get(".msg.img.$cdnthumbaeskey");
        paramcm = (String)((Map)localObject2).get(".msg.img.$cdnthumburl");
        j = bo.getInt((String)((Map)localObject2).get(".msg.img.$cdnthumblength"), 0);
        localObject2 = ((g)localObject1).q(com.tencent.mm.a.g.x(("SERVERID://" + paramString3.field_msgSvrId).getBytes()), "th_", "");
        l2 = paramString3.field_msgSvrId;
        ab.i("MicroMsg.ImgMsgExtension", "getThumbByCdn msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l2), paramString1, paramcm, localObject2 });
        l1 = bo.anU();
        localObject3 = (String)localObject2 + ".tmp";
        localObject1 = new com.tencent.mm.i.g();
        ((com.tencent.mm.i.g)localObject1).field_mediaId = com.tencent.mm.al.c.a("downimgthumb", paramString3.field_createTime, paramString1, String.valueOf(l2));
        ((com.tencent.mm.i.g)localObject1).field_fullpath = ((String)localObject3);
        ((com.tencent.mm.i.g)localObject1).field_fileType = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
        ((com.tencent.mm.i.g)localObject1).field_totalLen = j;
        ((com.tencent.mm.i.g)localObject1).field_aesKey = paramString2;
        ((com.tencent.mm.i.g)localObject1).field_fileId = paramcm;
        ((com.tencent.mm.i.g)localObject1).field_priority = com.tencent.mm.i.a.efD;
        if (t.kH(paramString1))
        {
          i = 1;
          label1446: ((com.tencent.mm.i.g)localObject1).field_chattype = i;
          if (!((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).bja())
            break label1558;
        }
        label1558: for (i = 2; ; i = 1)
        {
          ((com.tencent.mm.i.g)localObject1).expectImageFormat = i;
          ab.d("MicroMsg.ImgMsgExtension", "get thumb by cdn [image] chatType[%d] fromUser[%s] ", new Object[] { Integer.valueOf(((com.tencent.mm.i.g)localObject1).field_chattype), paramString1 });
          ((com.tencent.mm.i.g)localObject1).egl = new h.2(this, paramString3, paramString1, l2, (String)localObject2, paramcm, j, l1, (String)localObject3);
          paramString3.setStatus(4);
          com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject1, -1);
          break;
          i = 0;
          break label1446;
        }
        label1564: l1 = -1L;
      }
    }
  }

  public final void a(e.c paramc)
  {
    AppMethodBeat.i(78281);
    o.ahl().x(paramc.cKd);
    AppMethodBeat.o(78281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.h
 * JD-Core Version:    0.6.2
 */