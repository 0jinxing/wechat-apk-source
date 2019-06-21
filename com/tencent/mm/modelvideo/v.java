package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.n;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public final class v
  implements com.tencent.mm.ai.e
{
  public static int a(int paramInt1, com.tencent.mm.i.d paramd, long paramLong1, s params, String paramString1, String paramString2, int paramInt2, String paramString3, long paramLong2)
  {
    AppMethodBeat.i(50863);
    if (paramInt1 != 0)
    {
      ab.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), params.getUser(), paramString2, paramString1 });
      new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_THUMBIMAGE), Integer.valueOf(paramInt2), "" })).ajK();
      AppMethodBeat.o(50863);
    }
    while (true)
    {
      return paramInt1;
      if (paramd != null)
        break;
      paramInt1 = 0;
      AppMethodBeat.o(50863);
    }
    label218: int i;
    int j;
    if (paramd.field_retCode != 0)
    {
      ab.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramd.field_retCode), Long.valueOf(paramLong1), params.getUser(), paramString2, paramString1 });
      if (paramd != null)
        break label859;
      paramInt1 = -1;
      paramLong1 = bo.anU();
      i = com.tencent.mm.al.c.bW(ah.getContext());
      j = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
      if (paramd != null)
        break label867;
      paramString1 = "";
      label243: if (paramd != null)
        break label876;
      paramString2 = "";
      label251: new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt2), paramString1, "", "", "", "", "", "", "", paramString2 })).ajK();
      if ((paramd != null) && (paramd.field_retCode != 0))
      {
        if (paramd != null)
          break label885;
        paramInt1 = -1;
        label395: paramLong1 = bo.anU();
        j = com.tencent.mm.al.c.bW(ah.getContext());
        i = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
        if (paramd != null)
          break label893;
        paramString1 = "";
        label420: if (paramd != null)
          break label902;
      }
    }
    label902: for (paramd = ""; ; paramd = paramd.efY)
    {
      new com.tencent.mm.g.b.a.d(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt2), paramString1, "", "", "", "", "", "", "", paramd })).ajK();
      paramd = o.all();
      paramString1 = params.getFileName();
      params = t.a.c.fXz;
      if (!bo.isNullOrNil(paramString1))
      {
        paramString1 = paramd.uf(paramString1);
        if (paramString1 != null)
        {
          params = new t.a.a(paramString1.getFileName(), t.a.b.fXx, params, paramString1.fXk, paramString1.fVs);
          paramd.fry.cF(params);
          paramd.fry.doNotify();
        }
      }
      paramInt1 = 0;
      AppMethodBeat.o(50863);
      break;
      File localFile = new File(paramString1);
      new File(paramString3).renameTo(localFile);
      ab.i("MicroMsg.VideoMsgExtension", "getThumbByCdn succ. msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(paramLong1), params.getUser(), paramString2, paramString1 });
      if (params.fXk == 3)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(198L, 6L, paramInt2, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(198L, 7L, 1L, false);
        paramString1 = com.tencent.mm.plugin.report.service.h.pYm;
        if (com.tencent.mm.model.t.kH(params.getUser()));
        for (paramLong1 = 9L; ; paramLong1 = 8L)
        {
          paramString1.a(198L, paramLong1, 1L, false);
          break;
        }
      }
      com.tencent.mm.plugin.report.service.h.pYm.a(198L, 11L, paramInt2, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(198L, 12L, 1L, false);
      paramString1 = com.tencent.mm.plugin.report.service.h.pYm;
      if (com.tencent.mm.model.t.kH(params.getUser()));
      for (paramLong1 = 14L; ; paramLong1 = 13L)
      {
        paramString1.a(198L, paramLong1, 1L, false);
        break;
      }
      label859: paramInt1 = paramd.field_retCode;
      break label218;
      label867: paramString1 = paramd.field_transInfo;
      break label243;
      label876: paramString2 = paramd.efY;
      break label251;
      label885: paramInt1 = paramd.field_retCode;
      break label395;
      label893: paramString1 = paramd.field_transInfo;
      break label420;
    }
  }

  public final void a(e.c paramc)
  {
    int i = 1;
    AppMethodBeat.i(50862);
    paramc = paramc.cKd;
    if (paramc == null)
      AppMethodBeat.o(50862);
    while (true)
    {
      return;
      paramc = paramc.field_imgPath;
      if (!bo.isNullOrNil(paramc))
      {
        t localt = o.all();
        Object localObject;
        if (localt.fni.delete("videoinfo2", "filename= ?", new String[] { String.valueOf(paramc) }) > 0)
        {
          localObject = new t.a.a(paramc, t.a.b.fXw, t.a.c.fXz, 1, -1L);
          localt.fry.cF(localObject);
          localt.fry.doNotify();
          if (i == 0);
        }
        else
        {
          try
          {
            localObject = new com/tencent/mm/vfs/b;
            o.all();
            ((com.tencent.mm.vfs.b)localObject).<init>(t.ui(paramc));
            ((com.tencent.mm.vfs.b)localObject).delete();
            localObject = new com/tencent/mm/vfs/b;
            o.all();
            ((com.tencent.mm.vfs.b)localObject).<init>(t.uh(paramc));
            ((com.tencent.mm.vfs.b)localObject).delete();
            AppMethodBeat.o(50862);
            continue;
            i = 0;
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.VideoLogic", "ERR: Delete file Failed" + com.tencent.mm.compatible.util.g.Mq() + " file:" + paramc + " msg:" + localException.getMessage());
          }
        }
      }
      else
      {
        AppMethodBeat.o(50862);
      }
    }
  }

  public final e.b b(e.a arg1)
  {
    AppMethodBeat.i(50861);
    Object localObject1 = ???.eAB;
    if (localObject1 == null)
    {
      ab.e("MicroMsg.VideoMsgExtension", "onPreAddMessage cmdAM is null , give up.");
      ??? = null;
      AppMethodBeat.o(50861);
    }
    while (true)
    {
      return ???;
      String str1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, "");
      Object localObject2 = aa.a(((cm)localObject1).vEC);
      Object localObject4 = aa.a(((cm)localObject1).vEB);
      boolean bool1;
      label103: Object localObject5;
      if ((((j)com.tencent.mm.kernel.g.K(j.class)).XU().has((String)localObject4)) || (str1.equals(localObject4)))
      {
        bool1 = true;
        ab.d("MicroMsg.VideoMsgExtension", "video msg fromuser %s, toUser %s, userName %s, isSender %b", new Object[] { localObject4, localObject2, str1, Boolean.valueOf(bool1) });
        localObject5 = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr();
        if (!str1.equals(localObject4))
          break label370;
      }
      label370: for (Object localObject6 = localObject2; ; localObject6 = localObject4)
      {
        localObject6 = ((com.tencent.mm.plugin.messenger.foundation.a.a.h)localObject5).Q((String)localObject6, ((cm)localObject1).ptF);
        ab.i("MicroMsg.VideoMsgExtension", "dkmsgid prepareMsgInfo svrid:%d localid:%d, flag:%d, msgseq:%d, addMsgInfo[%s]", new Object[] { Long.valueOf(((cm)localObject1).ptF), Long.valueOf(((cy)localObject6).field_msgId), Integer.valueOf(((cy)localObject6).field_flag), Long.valueOf(((cy)localObject6).field_msgSeq), ??? });
        if ((((cy)localObject6).field_msgId != 0L) && (((cy)localObject6).field_createTime + 604800000L < bf.q((String)localObject4, ((cm)localObject1).pcX)))
        {
          ab.w("MicroMsg.VideoMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(((cm)localObject1).ptF), Long.valueOf(((cy)localObject6).field_msgId) });
          bf.fm(((cy)localObject6).field_msgId);
          ((bi)localObject6).setMsgId(0L);
        }
        if (((cy)localObject6).field_msgId == 0L)
          break label377;
        ab.d("MicroMsg.VideoMsgExtension", "Msgid:%d duplicate give up ", new Object[] { Long.valueOf(((cm)localObject1).ptF) });
        ??? = null;
        AppMethodBeat.o(50861);
        break;
        bool1 = false;
        break label103;
      }
      label377: String str2 = aa.a(((cm)localObject1).vED);
      localObject6 = new s();
      if (bool1)
        localObject4 = localObject2;
      ((s)localObject6).cIS = ((String)localObject4);
      ((s)localObject6).createTime = ((cm)localObject1).pcX;
      ((s)localObject6).cKK = ((cm)localObject1).ptF;
      ((s)localObject6).fXj = ((cm)localObject1).vED.wVI;
      ab.i("MicroMsg.VideoMsgExtension", "parseVideoMsgXml [%s] msg Source[%s]", new Object[] { str2, ((cm)localObject1).vEG });
      Object localObject7 = br.z(str2, "msg");
      if (localObject7 == null)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 216L, 1L, false);
        ??? = null;
        AppMethodBeat.o(50861);
        continue;
      }
      localObject4 = new bi();
      ((bi)localObject4).ix(((cm)localObject1).vEG);
      ((bi)localObject4).jA(bf.oF(((cm)localObject1).vEG));
      String str3;
      int i;
      String str4;
      String str5;
      int j;
      int m;
      while (true)
      {
        try
        {
          ((s)localObject6).frO = bo.getInt((String)((Map)localObject7).get(".msg.videomsg.$length"), 0);
          ((s)localObject6).fXd = bo.getInt((String)((Map)localObject7).get(".msg.videomsg.$playlength"), 0);
          ab.i("MicroMsg.VideoMsgExtension", "video msg total len %d, video len %d", new Object[] { Integer.valueOf(((s)localObject6).frO), Integer.valueOf(((s)localObject6).fXd) });
          ((s)localObject6).fWW = ((String)((Map)localObject7).get(".msg.videomsg.$fromusername"));
          if (str1.equals(((s)localObject6).alt()))
            ((s)localObject6).fWW = ((String)localObject2);
          ((s)localObject6).cMn = ((String)((Map)localObject7).get(".msg.statextstr"));
          localObject2 = (String)((Map)localObject7).get(".msg.videomsg.$cdnthumbaeskey");
          str3 = (String)((Map)localObject7).get(".msg.videomsg.$cdnthumburl");
          i = bo.getInt((String)((Map)localObject7).get(".msg.videomsg.$cdnthumblength"), 0);
          str4 = (String)((Map)localObject7).get(".msg.videomsg.$tpvideourl");
          str5 = (String)((Map)localObject7).get(".msg.videomsg.$tpthumburl");
          str1 = (String)((Map)localObject7).get(".msg.videomsg.$tpauthkey");
          localObject5 = (String)((Map)localObject7).get(".msg.videomsg.$tpthumbaeskey");
          j = bo.getInt((String)((Map)localObject7).get(".msg.videomsg.$tpthumblength"), 0);
          int k = bo.getInt((String)((Map)localObject7).get(".msg.videomsg.$type"), 0);
          ab.d("MicroMsg.VideoMsgExtension", "video msg exportType :".concat(String.valueOf(k)));
          if (k == 44)
          {
            m = 1;
            ((s)localObject6).fXh = m;
            if (62 != ((cm)localObject1).nao)
              continue;
            ((s)localObject6).fXk = 3;
            String str6 = bo.bc((String)((Map)localObject7).get(".msg.streamvideo.streamvideourl"), "");
            m = bo.getInt((String)((Map)localObject7).get(".msg.streamvideo.streamvideototaltime"), 0);
            String str7 = bo.bc((String)((Map)localObject7).get(".msg.streamvideo.streamvideotitle"), "");
            localObject8 = bo.bc((String)((Map)localObject7).get(".msg.streamvideo.streamvideowording"), "");
            String str8 = bo.bc((String)((Map)localObject7).get(".msg.streamvideo.streamvideoweburl"), "");
            String str9 = bo.bc((String)((Map)localObject7).get(".msg.streamvideo.streamvideoaduxinfo"), "");
            String str10 = bo.bc((String)((Map)localObject7).get(".msg.streamvideo.streamvideopublishid"), "");
            if (((s)localObject6).fXm == null)
            {
              cfh localcfh = new com/tencent/mm/protocal/protobuf/cfh;
              localcfh.<init>();
              ((s)localObject6).fXm = localcfh;
            }
            ((s)localObject6).fXm.fiI = str7;
            ((s)localObject6).fXm.wid = m;
            ((s)localObject6).fXm.fiG = str6;
            ((s)localObject6).fXm.fiJ = ((String)localObject8);
            ((s)localObject6).fXm.fiK = str8;
            ((s)localObject6).fXm.fiM = str9;
            ((s)localObject6).fXm.fiN = str10;
            boolean bool2 = ((s)localObject6).alt().equals((String)com.tencent.mm.kernel.g.RP().Ry().get(2, ""));
            if (!bool2)
              break label1220;
            ??? = null;
            AppMethodBeat.o(50861);
            break;
          }
          m = 0;
          continue;
          if (k <= 0)
            break label1211;
          ((s)localObject6).fXk = 2;
          continue;
        }
        catch (Exception )
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 216L, 1L, false);
          ab.e("MicroMsg.VideoMsgExtension", "parsing voice msg xml failed");
          ab.e("MicroMsg.VideoMsgExtension", "exception:%s", new Object[] { bo.l(???) });
          ??? = null;
          AppMethodBeat.o(50861);
        }
        break;
        label1211: ((s)localObject6).fXk = 1;
      }
      label1220: localObject7 = (String)((Map)localObject7).get(".msg.commenturl");
      Object localObject8 = br.z(str2, "msgoperation");
      if (localObject8 != null)
      {
        ((bi)localObject4).jB((String)((Map)localObject8).get(".msgoperation.expinfo.expidstr"));
        ((bi)localObject4).ie(bo.getInt((String)((Map)localObject8).get(".msgoperation.sightmsg.downloadcontroltype"), 0));
        ab.i("MicroMsg.VideoMsgExtension", "[chatting_exp] expidstr:%s, downloadcontroltype:%d", new Object[] { ((cy)localObject4).dJE, Integer.valueOf(((cy)localObject4).dJF) });
      }
      localObject8 = t.ug(((s)localObject6).alt());
      ((s)localObject6).fileName = ((String)localObject8);
      ((bi)localObject4).eI(((s)localObject6).cKK);
      ((bi)localObject4).jv(((s)localObject6).getFileName());
      ((bi)localObject4).eJ(bf.q(((s)localObject6).getUser(), ((s)localObject6).createTime));
      ((bi)localObject4).ju(((s)localObject6).getUser());
      ((bi)localObject4).setStatus(((cm)localObject1).jBT);
      if (bool1)
      {
        m = 1;
        label1403: ((bi)localObject4).hO(m);
        if (((cm)localObject1).nao != 62)
          break label1546;
        ((bi)localObject4).setType(62);
      }
      long l1;
      while (true)
      {
        ((bi)localObject4).setContent(q.d(((s)localObject6).alt(), 0L, false));
        ((bi)localObject4).jw(str2);
        ((bi)localObject4).jz((String)localObject7);
        ((bi)localObject4).ix(((cm)localObject1).vEG);
        bf.a((bi)localObject4, ???);
        l1 = bf.l((bi)localObject4);
        if (l1 > 0L)
          break label1556;
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 215L, 1L, false);
        ab.e("MicroMsg.VideoMsgExtension", "onPreAddMessage insert msg failed local:%d svrid:%d", new Object[] { Long.valueOf(l1), Long.valueOf(((s)localObject6).cKK) });
        ??? = null;
        AppMethodBeat.o(50861);
        break;
        m = 0;
        break label1403;
        label1546: ((bi)localObject4).setType(43);
      }
      label1556: ((s)localObject6).fXe = ((int)l1);
      ((s)localObject6).fXb = bo.anT();
      ((s)localObject6).fXf = 0;
      ((s)localObject6).status = 111;
      ab.d("MicroMsg.VideoMsgExtension", "Insert fileName[" + ((s)localObject6).getFileName() + "] size:" + ((s)localObject6).frO + " svrid:" + ((s)localObject6).cKK + " timelen:" + ((s)localObject6).fXd + " user:" + ((s)localObject6).getUser() + " human:" + ((s)localObject6).alt());
      if (!o.all().b((s)localObject6))
      {
        ab.d("MicroMsg.VideoMsgExtension", "Insert Error fileName:" + ((s)localObject6).getFileName());
        ??? = null;
        AppMethodBeat.o(50861);
        continue;
      }
      o.all();
      str2 = t.ui((String)localObject8);
      ??? = aa.a(((cm)localObject1).vEF);
      ab.i("MicroMsg.VideoMsgExtension", "imgBuf  :%d", new Object[] { Integer.valueOf(bo.cc(???)) });
      if (ae.giF)
      {
        ab.w("MicroMsg.VideoMsgExtension", "Test.useCdnDownThumb  set img buf null !!!!!!!");
        ??? = null;
      }
      if (!bo.cb(???))
      {
        t.a(str2, 0, ???);
        label1801: if (((bi)localObject4).bwt())
        {
          com.tencent.mm.modelcontrol.c.afC();
          if (((cy)localObject4).dJF != 1)
            break label2434;
          m = 1;
          label1825: if (m != 0)
          {
            u.up(((cy)localObject4).field_imgPath);
            com.tencent.mm.al.f.afx().fyQ.add("video_" + ((cy)localObject4).field_msgId);
          }
        }
        m = 1;
        i = 0;
        if (com.tencent.mm.model.t.kH(((s)localObject6).getUser()))
        {
          i = n.mA(((s)localObject6).getUser());
          if ((!com.tencent.mm.model.t.nN(((s)localObject6).getUser())) && (com.tencent.mm.model.t.nM(((s)localObject6).getUser())))
            break label3139;
          m = 2;
        }
        com.tencent.mm.plugin.report.service.h.pYm.e(14388, new Object[] { Long.valueOf(((cy)localObject4).field_msgSvrId), Integer.valueOf(m), "", Integer.valueOf(i) });
        localObject2 = o.aln();
      }
      synchronized (((i)localObject2).fVS)
      {
        ((i)localObject2).fVS.offerFirst(localObject4);
        ((i)localObject2).ald();
        ??? = new e.b((bi)localObject4, true);
        AppMethodBeat.o(50861);
        continue;
        if (!bo.isNullOrNil(str4))
        {
          l1 = ((s)localObject6).cKK;
          ab.i("MicroMsg.VideoMsgExtension", "getThumbByCdn msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l1), ((s)localObject6).getUser(), str5, str2 });
          l2 = bo.anU();
          localObject2 = str2 + ".tmp";
          ??? = new com.tencent.mm.i.g();
          ???.field_mediaId = com.tencent.mm.al.c.a("downvideothumb", ((s)localObject6).createTime, ((s)localObject6).getUser(), String.valueOf(l1));
          ???.field_fullpath = ((String)localObject2);
          ???.field_fileType = 19;
          ???.field_aesKey = ((String)localObject5);
          ???.field_authKey = str1;
          ???.egm = str5;
          ???.egl = new v.1(this, l1, (s)localObject6, str2, str5, j, (String)localObject2, l2);
          com.tencent.mm.al.f.afx().b(???, -1);
          break label1801;
        }
        long l2 = ((s)localObject6).cKK;
        ab.i("MicroMsg.VideoMsgExtension", "getThumbByCdn msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l2), ((s)localObject6).getUser(), str3, str2 });
        l1 = bo.anU();
        localObject1 = str2 + ".tmp";
        ??? = new com.tencent.mm.i.g();
        ???.field_mediaId = com.tencent.mm.al.c.a("downvideothumb", ((s)localObject6).createTime, ((s)localObject6).getUser(), String.valueOf(l2));
        ???.field_fullpath = ((String)localObject1);
        ???.field_fileType = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
        ???.field_totalLen = i;
        ???.field_aesKey = ((String)localObject2);
        ???.field_fileId = str3;
        ???.field_priority = com.tencent.mm.i.a.efD;
        if (com.tencent.mm.model.t.kH(((s)localObject6).getUser()));
        for (m = 1; ; m = 0)
        {
          ???.field_chattype = m;
          ab.d("MicroMsg.VideoMsgExtension", "get thumb by cdn [video] chatType[%d] user[%s] ", new Object[] { Integer.valueOf(???.field_chattype), ((s)localObject6).getUser() });
          ???.egl = new v.2(this, l2, (s)localObject6, str2, str3, i, (String)localObject1, l1);
          com.tencent.mm.al.f.afx().b(???, -1);
          break;
        }
        label2434: if (((cy)localObject4).dJF == 2)
        {
          m = 0;
          break label1825;
        }
        if (!com.tencent.mm.modelcontrol.c.v((bi)localObject4))
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "this message need control, do not auto download C2C short video.");
          m = 0;
          break label1825;
        }
        ??? = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("C2CSightNotAutoDownloadTimeRange");
        ab.i("MicroMsg.BusyTimeControlLogic", "C2CSightNotAutoDownloadTimeRange value: ".concat(String.valueOf(???)));
        if (com.tencent.mm.modelcontrol.b.rR(???))
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "it is busy time now , do not auto download C2C short video.");
          m = 0;
          break label1825;
        }
        localObject2 = ((cy)localObject4).field_talker;
        ab.d("MicroMsg.SubCoreAutoDownload", "isC2CSightAutoDownload msg talker: ".concat(String.valueOf(localObject2)));
        m = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("SIGHTSessionAutoLoadNetwork"), 1);
        if (m == 3)
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "setting is not download sight automate, %d, %d", new Object[] { Long.valueOf(((cy)localObject4).field_msgId), Long.valueOf(((cy)localObject4).field_msgSvrId) });
          m = 0;
          break label1825;
        }
        if (at.isWifi(ah.getContext()))
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "match wifi, do auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cy)localObject4).field_msgId), Long.valueOf(((cy)localObject4).field_msgSvrId), ((cy)localObject4).field_imgPath });
          ??? = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO((String)localObject2);
          if ((??? != null) && ((int)???.ewQ > 0) && (((com.tencent.mm.model.t.kH((String)localObject2)) && (???.dua == 0)) || (???.DX())))
            break label3124;
          m = 1;
          break label1825;
        }
        if (at.is2G(ah.getContext()))
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "match edge, do not auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cy)localObject4).field_msgId), Long.valueOf(((cy)localObject4).field_msgSvrId), ((cy)localObject4).field_imgPath });
          m = 0;
          break label1825;
        }
        ??? = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(((cy)localObject4).field_talker);
        if (com.tencent.mm.model.t.kH(((cy)localObject4).field_talker))
        {
          if (???.dua == 0)
          {
            ab.i("MicroMsg.SubCoreAutoDownload", "match muted chatroom and not wifi, do not auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cy)localObject4).field_msgId), Long.valueOf(((cy)localObject4).field_msgSvrId), ((cy)localObject4).field_imgPath });
            m = 0;
            break label1825;
          }
          if (((at.is3G(ah.getContext())) || (at.is4G(ah.getContext()))) && (m == 1))
          {
            ab.i("MicroMsg.SubCoreAutoDownload", "match 3G/4G and unmuted chatroom, do auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cy)localObject4).field_msgId), Long.valueOf(((cy)localObject4).field_msgSvrId), ((cy)localObject4).field_imgPath });
            m = 1;
            break label1825;
          }
          ab.i("MicroMsg.SubCoreAutoDownload", "unknown auto download short video step A");
          m = 0;
          break label1825;
        }
        if (???.DX())
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "match muted and not wifi, do not auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cy)localObject4).field_msgId), Long.valueOf(((cy)localObject4).field_msgSvrId), ((cy)localObject4).field_imgPath });
          m = 0;
          break label1825;
        }
        if (((at.is3G(ah.getContext())) || (at.is4G(ah.getContext()))) && (m == 1))
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "match 3G/4G and unmuted, do auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((cy)localObject4).field_msgId), Long.valueOf(((cy)localObject4).field_msgSvrId), ((cy)localObject4).field_imgPath });
          m = 1;
          break label1825;
        }
        ab.i("MicroMsg.SubCoreAutoDownload", "unknown auto download short video step B");
        m = 0;
        break label1825;
        label3124: ab.i("MicroMsg.SubCoreAutoDownload", "default can not auto download C2C short video.");
        m = 0;
        break label1825;
        label3139: m = 3;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.v
 * JD-Core Version:    0.6.2
 */