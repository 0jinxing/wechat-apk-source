package com.tencent.mm.plugin.record.b;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.tq;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.aaz;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class n
{
  private static final com.tencent.mm.a.f<Integer, com.tencent.mm.protocal.b.a.c> emX;

  static
  {
    AppMethodBeat.i(135720);
    emX = new com.tencent.mm.memory.a.c(32);
    AppMethodBeat.o(135720);
  }

  public static int BH(int paramInt)
  {
    if (2 == paramInt)
      paramInt = com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE;
    while (true)
    {
      return paramInt;
      if (4 == paramInt)
        paramInt = com.tencent.mm.i.a.MediaType_VIDEO;
      else
        paramInt = com.tencent.mm.i.a.MediaType_FILE;
    }
  }

  public static String LA(String paramString)
  {
    AppMethodBeat.i(135711);
    paramString = paramString + "_t";
    AppMethodBeat.o(135711);
    return paramString;
  }

  public static com.tencent.mm.protocal.b.a.c VI(String paramString)
  {
    AppMethodBeat.i(135713);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.RecordMsgLogic", "xml is null");
      AppMethodBeat.o(135713);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      int i = paramString.hashCode();
      Object localObject = (com.tencent.mm.protocal.b.a.c)emX.get(Integer.valueOf(i));
      if (localObject != null)
      {
        ab.d("MicroMsg.RecordMsgLogic", "get record msg data from cache");
        AppMethodBeat.o(135713);
        paramString = (String)localObject;
      }
      else
      {
        if (paramString.trim().contains("<recordinfo>"));
        for (localObject = br.z(paramString, "recordinfo"); ; localObject = br.z("<recordinfo>" + paramString + "</recordinfo>", "recordinfo"))
        {
          if (localObject != null)
            break label148;
          ab.e("MicroMsg.RecordMsgLogic", "values is null: %s", new Object[] { paramString });
          AppMethodBeat.o(135713);
          paramString = null;
          break;
        }
        label148: com.tencent.mm.protocal.b.a.c localc = new com.tencent.mm.protocal.b.a.c();
        localc.title = ((String)((Map)localObject).get(".recordinfo.title"));
        localc.desc = ((String)((Map)localObject).get(".recordinfo.desc"));
        localc.vzJ = ((String)((Map)localObject).get(".recordinfo.favusername"));
        if (((Map)localObject).get(".recordinfo.noteinfo") != null)
        {
          aaz localaaz = new aaz();
          localaaz.win = ((String)((Map)localObject).get(".recordinfo.noteinfo.noteeditor"));
          localaaz.wim = ((String)((Map)localObject).get(".recordinfo.noteinfo.noteauthor"));
          localc.vzK = localaaz;
          localc.lgR = bo.getLong((String)((Map)localObject).get(".recordinfo.edittime"), 0L);
        }
        a(paramString, localc);
        emX.put(Integer.valueOf(i), localc);
        AppMethodBeat.o(135713);
        paramString = localc;
      }
    }
  }

  public static int a(Context paramContext, String paramString1, String paramString2, List<bi> paramList, cl paramcl, com.tencent.mm.protocal.b.a.d paramd)
  {
    AppMethodBeat.i(135700);
    int i;
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
      i = -1;
      AppMethodBeat.o(135700);
    }
    while (true)
    {
      return i;
      if ((paramList == null) || (paramList.isEmpty()))
      {
        ab.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
        i = -1;
        AppMethodBeat.o(135700);
      }
      else
      {
        if (paramcl != null)
        {
          locald = paramd;
          if (paramd != null)
            break label115;
        }
        paramcl = new cl();
        if (b.a(paramContext, paramcl, paramString2, paramList))
          break;
        i = -1;
        AppMethodBeat.o(135700);
      }
    }
    com.tencent.mm.protocal.b.a.d locald = a(paramContext, paramcl, paramString2);
    label115: paramList = a(locald.title, locald.desc, paramcl.cvA.cvC);
    paramd = new bi();
    paramString2 = null;
    if (!bo.isNullOrNil(locald.thumbPath))
    {
      paramContext = bo.readFromFile(locald.thumbPath);
      label168: if (paramContext != null)
        if (paramContext.length <= 65536)
          break label444;
    }
    long l;
    label444: for (paramContext = com.tencent.mm.at.o.ahl().a(paramContext, false, Bitmap.CompressFormat.JPEG); ; paramContext = com.tencent.mm.at.o.ahl().W(paramContext))
    {
      ab.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " thumbData MsgInfo path:" + paramContext);
      if (!bo.isNullOrNil(paramContext))
        paramd.jv(paramContext);
      paramd.setContent(j.b.a(paramList, null, null));
      paramd.setStatus(1);
      paramd.ju(paramString1);
      paramd.eJ(bf.oC(paramString1));
      paramd.hO(1);
      paramd.setType(49);
      if (com.tencent.mm.aj.f.kq(paramString1))
        paramd.ix(com.tencent.mm.aj.a.e.aae());
      l = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(paramd);
      ab.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " msginfo insert id: " + l);
      if (l >= 0L)
        break label455;
      ab.e("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Mq() + "insert msg failed :" + l);
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(135700);
      break;
      paramContext = paramString2;
      if (locald.cKc != 0)
        break label168;
      paramContext = paramString2;
      if (bo.isNullOrNil(locald.mjO))
        break label168;
      paramContext = com.tencent.mm.sdk.platformtools.d.ai(com.tencent.mm.ah.b.a(locald.mjO, false, -1));
      break label168;
    }
    label455: ab.i("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
    paramd.setMsgId(l);
    paramContext = new com.tencent.mm.af.j();
    paramContext.field_xml = paramd.field_content;
    paramContext.field_title = paramList.title;
    paramContext.field_type = paramList.type;
    paramContext.field_description = paramList.description;
    paramContext.field_msgId = l;
    com.tencent.mm.plugin.s.a.bYK().b(paramContext);
    paramContext = paramcl.cvA.cvC.wiv.iterator();
    for (boolean bool = false; paramContext.hasNext(); bool = true)
    {
      label567: paramString2 = (aar)paramContext.next();
      if (bo.isNullOrNil(paramString2.mnd))
      {
        paramd = paramString2.toString();
        i = paramString2.dataType;
        paramString2.akU(com.tencent.mm.a.g.x((paramd + i + System.currentTimeMillis()).getBytes()));
      }
      if ((!bool) && (!com.tencent.mm.a.e.ct(paramString2.wgx)) && (!com.tencent.mm.a.e.ct(paramString2.wgz)) && (bo.isNullOrNil(paramString2.wfZ)) && (bo.isNullOrNil(paramString2.fgE)) && (bo.isNullOrNil(paramString2.whr)) && (bo.isNullOrNil(paramString2.fgv)))
        break label567;
    }
    ab.d("MicroMsg.RecordMsgLogic", "summerrecord needNetScene:%b", new Object[] { Boolean.valueOf(bool) });
    if (bool)
    {
      paramContext = new com.tencent.mm.plugin.record.a.j();
      paramContext.field_msgId = l;
      paramContext.field_title = paramList.title;
      paramContext.field_desc = paramList.description;
      paramContext.field_toUser = paramString1;
      paramContext.field_dataProto = paramcl.cvA.cvC;
      paramContext.field_type = 3;
      paramContext.field_localId = (new Random().nextInt(2147483645) + 1);
      ab.i("MicroMsg.RecordMsgLogic", "summerrecord needNetScene insert ret:%b, id:%d, localid:%d", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgStorage().b(paramContext)), Long.valueOf(l), Integer.valueOf(paramContext.field_localId) });
      ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgService().a(paramContext);
    }
    while (true)
    {
      i = 0;
      AppMethodBeat.o(135700);
      break;
      ab.d("MicroMsg.RecordMsgLogic", "summerrecord do not trans cdn, directly send msg id:%d", new Object[] { Long.valueOf(l) });
      ((com.tencent.mm.plugin.record.a.f)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.record.a.f.class)).jB(l);
    }
  }

  public static int a(String paramString1, abf paramabf, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5)
  {
    AppMethodBeat.i(135704);
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
      paramInt = -1;
      AppMethodBeat.o(135704);
    }
    while (true)
    {
      return paramInt;
      if ((paramabf == null) || (paramabf.wiv.isEmpty()))
      {
        ab.w("MicroMsg.RecordMsgLogic", "send record msg error, favprotoitem error");
        paramInt = -1;
        AppMethodBeat.o(135704);
      }
      else
      {
        paramString3 = a(paramString2, paramString3, paramabf);
        bi localbi = new bi();
        paramString2 = null;
        if (!bo.isNullOrNil(paramString4))
        {
          paramString2 = bo.readFromFile(paramString4);
          label98: if (paramString2 != null)
            if (paramString2.length <= 65536)
              break label374;
        }
        long l;
        label374: for (paramString2 = com.tencent.mm.at.o.ahl().a(paramString2, false, Bitmap.CompressFormat.JPEG); ; paramString2 = com.tencent.mm.at.o.ahl().W(paramString2))
        {
          ab.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " thumbData MsgInfo path:" + paramString2);
          if (!bo.isNullOrNil(paramString2))
            localbi.jv(paramString2);
          localbi.setContent(j.b.a(paramString3, null, null));
          localbi.setStatus(1);
          localbi.ju(paramString1);
          localbi.eJ(bf.oC(paramString1));
          localbi.hO(1);
          localbi.setType(49);
          if (com.tencent.mm.aj.f.kq(paramString1))
            localbi.ix(com.tencent.mm.aj.a.e.aae());
          l = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(localbi);
          ab.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " msginfo insert id: " + l);
          if (l >= 0L)
            break label385;
          ab.e("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Mq() + "insert msg failed :" + l);
          paramInt = 0 - com.tencent.mm.compatible.util.g.getLine();
          AppMethodBeat.o(135704);
          break;
          if (paramInt != 0)
          {
            paramString2 = com.tencent.mm.sdk.platformtools.d.ai(com.tencent.mm.sdk.platformtools.d.LV(paramInt));
            break label98;
          }
          if (bo.isNullOrNil(paramString5))
            break label98;
          paramString2 = com.tencent.mm.sdk.platformtools.d.ai(com.tencent.mm.ah.b.a(paramString5, false, -1));
          break label98;
        }
        label385: ab.i("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
        localbi.setMsgId(l);
        paramString2 = new com.tencent.mm.af.j();
        paramString2.field_xml = localbi.field_content;
        paramString2.field_title = paramString3.title;
        paramString2.field_type = paramString3.type;
        paramString2.field_description = paramString3.description;
        paramString2.field_msgId = l;
        com.tencent.mm.plugin.s.a.bYK().b(paramString2);
        paramString4 = paramabf.wiv.iterator();
        do
        {
          if (!paramString4.hasNext())
            break;
          paramString2 = (aar)paramString4.next();
        }
        while ((bo.isNullOrNil(paramString2.wfZ)) && (bo.isNullOrNil(paramString2.fgE)));
        paramString2 = new com.tencent.mm.plugin.record.a.j();
        paramString2.field_msgId = l;
        paramString2.field_title = paramString3.title;
        paramString2.field_desc = paramString3.description;
        paramString2.field_toUser = paramString1;
        paramString2.field_dataProto = paramabf;
        paramString2.field_type = 1;
        paramString2.field_localId = (new Random().nextInt(2147483645) + 1);
        ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgStorage().b(paramString2);
        ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgService().a(paramString2);
        paramInt = 0;
        AppMethodBeat.o(135704);
      }
    }
  }

  public static int a(String paramString1, String paramString2, bi parambi)
  {
    AppMethodBeat.i(135703);
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
      i = -1;
      AppMethodBeat.o(135703);
    }
    label106: String str;
    com.tencent.mm.protocal.b.a.c localc;
    long l;
    while (true)
    {
      return i;
      if ((parambi == null) || (bo.isNullOrNil(parambi.field_content)))
      {
        ab.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
        i = -1;
        AppMethodBeat.o(135703);
      }
      else if (1 == parambi.field_status)
      {
        ab.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo is sending");
        i = -1;
        AppMethodBeat.o(135703);
      }
      else
      {
        Iterator localIterator = bo.P(paramString1.split(",")).iterator();
        if (!localIterator.hasNext())
          break label923;
        str = (String)localIterator.next();
        ab.i("MicroMsg.RecordMsgLogic", "send recordMsg, toUser[%s] msgId[%d], msgType[%d]", new Object[] { str, Long.valueOf(parambi.field_msgId), Integer.valueOf(parambi.field_status) });
        localObject1 = bf.oz(parambi.field_content);
        paramString1 = j.b.me((String)localObject1);
        if (paramString1 == null)
        {
          ab.w("MicroMsg.RecordMsgLogic", "send record msg error, parse appmsg error");
          i = -1;
          AppMethodBeat.o(135703);
        }
        else
        {
          localc = VI(paramString1.fgU);
          if (localc == null)
          {
            ab.w("MicroMsg.RecordMsgLogic", "send record msg error, parse record data error");
            i = -1;
            AppMethodBeat.o(135703);
          }
          else
          {
            localObject2 = new bi();
            if (!bo.isNullOrNil(parambi.field_imgPath))
            {
              Object localObject3 = bo.readFromFile(com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true));
              localObject3 = com.tencent.mm.at.o.ahl().W((byte[])localObject3);
              ab.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " thumbData from msg MsgInfo path:" + (String)localObject3);
              if (!bo.isNullOrNil((String)localObject3))
                ((bi)localObject2).jv((String)localObject3);
            }
            ((bi)localObject2).setContent((String)localObject1);
            ((bi)localObject2).setStatus(1);
            ((bi)localObject2).ju(str);
            ((bi)localObject2).eJ(bf.oC(str));
            ((bi)localObject2).hO(1);
            ((bi)localObject2).setType(49);
            l = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z((bi)localObject2);
            ab.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " msginfo insert id: " + l);
            if (l >= 0L)
              break;
            ab.e("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.Mq() + "insert msg failed :" + l);
            i = 0 - com.tencent.mm.compatible.util.g.getLine();
            AppMethodBeat.o(135703);
          }
        }
      }
    }
    ab.i("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
    ((bi)localObject2).setMsgId(l);
    Object localObject1 = new tq();
    ((tq)localObject1).cPN.cPO = parambi.field_msgId;
    ((tq)localObject1).cPN.cPP = l;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    localObject1 = new com.tencent.mm.af.j();
    ((com.tencent.mm.af.j)localObject1).field_xml = ((cy)localObject2).field_content;
    ((com.tencent.mm.af.j)localObject1).field_title = paramString1.title;
    ((com.tencent.mm.af.j)localObject1).field_type = paramString1.type;
    ((com.tencent.mm.af.j)localObject1).field_description = paramString1.description;
    ((com.tencent.mm.af.j)localObject1).field_msgId = l;
    com.tencent.mm.plugin.s.a.bYK().b((com.tencent.mm.sdk.e.c)localObject1);
    Object localObject2 = localc.fjr.iterator();
    do
    {
      if (!((Iterator)localObject2).hasNext())
        break;
      localObject1 = (aar)((Iterator)localObject2).next();
    }
    while ((bo.isNullOrNil(((aar)localObject1).wfZ)) && (bo.isNullOrNil(((aar)localObject1).fgE)) && (bo.isNullOrNil(((aar)localObject1).whr)) && (bo.isNullOrNil(((aar)localObject1).fgv)));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        localObject1 = new com.tencent.mm.plugin.record.a.j();
        localObject2 = new abf();
        ((abf)localObject2).wiv.addAll(localc.fjr);
        ((com.tencent.mm.plugin.record.a.j)localObject1).field_msgId = l;
        ((com.tencent.mm.plugin.record.a.j)localObject1).field_oriMsgId = parambi.field_msgId;
        ((com.tencent.mm.plugin.record.a.j)localObject1).field_toUser = str;
        ((com.tencent.mm.plugin.record.a.j)localObject1).field_title = paramString1.title;
        ((com.tencent.mm.plugin.record.a.j)localObject1).field_desc = bo.bc(localc.desc, paramString1.description);
        ((com.tencent.mm.plugin.record.a.j)localObject1).field_dataProto = ((abf)localObject2);
        ((com.tencent.mm.plugin.record.a.j)localObject1).field_type = 0;
        ((com.tencent.mm.plugin.record.a.j)localObject1).field_favFrom = localc.vzJ;
        ((com.tencent.mm.plugin.record.a.j)localObject1).field_localId = (new Random().nextInt(2147483645) + 1);
        ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgStorage().b((com.tencent.mm.sdk.e.c)localObject1);
        ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgService().a((com.tencent.mm.plugin.record.a.j)localObject1);
      }
      while (true)
      {
        if (bo.isNullOrNil(paramString2))
          break label921;
        com.tencent.mm.plugin.messenger.a.g.bOk().F(str, paramString2, t.nK(str));
        break;
        ab.d("MicroMsg.RecordMsgLogic", "do not check upload, directly send msg");
        ((com.tencent.mm.plugin.record.a.f)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.record.a.f.class)).jB(l);
      }
      label921: break label106;
      label923: i = 0;
      AppMethodBeat.o(135703);
      break;
    }
  }

  public static j.b a(String paramString1, String paramString2, abf paramabf)
  {
    AppMethodBeat.i(135698);
    LinkedList localLinkedList = paramabf.wiv;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<recordinfo>");
    localStringBuilder.append("<title>").append(bo.ani(paramString1)).append("</title>");
    localStringBuilder.append("<desc>").append(bo.ani(paramString2)).append("</desc>");
    a(localStringBuilder, paramabf);
    localStringBuilder.append(o.bK(localLinkedList));
    localStringBuilder.append("<favusername>").append(bo.ani(com.tencent.mm.model.r.Yz())).append("</favusername>");
    localStringBuilder.append("</recordinfo>");
    paramabf = new j.b();
    paramabf.title = paramString1;
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (paramString2.length() > 200)
        paramString1 = paramString2.substring(0, 200);
    }
    paramabf.description = paramString1;
    if ((!bo.ek(localLinkedList)) && (!bo.isNullOrNil(((aar)localLinkedList.get(0)).wgo)) && (((aar)localLinkedList.get(0)).wgo.equals(".htm")))
      paramabf.type = 24;
    for (paramabf.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008"; ; paramabf.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0")
    {
      paramabf.action = "view";
      paramabf.fgU = localStringBuilder.toString();
      AppMethodBeat.o(135698);
      return paramabf;
      paramabf.type = 19;
    }
  }

  public static com.tencent.mm.protocal.b.a.d a(Context paramContext, cl paramcl, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(135701);
    com.tencent.mm.protocal.b.a.d locald = new com.tencent.mm.protocal.b.a.d();
    Object localObject1 = new SparseIntArray();
    Object localObject2;
    if (com.tencent.mm.aj.f.kq(paramString))
    {
      locald.title = paramcl.cvA.cvC.title;
      ab.d("MicroMsg.RecordMsgLogic", "msgInfo title %s", new Object[] { locald.title });
      paramString = new LinkedList();
      if (paramcl.cvA.cvC == null)
        break label413;
      paramcl = paramcl.cvA.cvC.wiv;
      localObject2 = paramcl.iterator();
    }
    while (true)
    {
      if (!((Iterator)localObject2).hasNext())
        break label1487;
      Object localObject3 = (aar)((Iterator)localObject2).next();
      int j = ((SparseIntArray)localObject1).get(((aar)localObject3).dataType);
      ((SparseIntArray)localObject1).put(((aar)localObject3).dataType, j + 1);
      switch (((aar)localObject3).dataType)
      {
      case 9:
      case 12:
      case 13:
      case 18:
      default:
        break;
      case 1:
        if (paramString.size() < 5)
        {
          paramString.add(((aar)localObject3).wgV + ":" + ((aar)localObject3).desc + "\n");
          continue;
          if (t.kH(paramString))
          {
            locald.title = paramContext.getString(2131302200);
            break;
          }
          localObject2 = com.tencent.mm.model.r.YB();
          paramString = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mI(paramString);
          if (((String)localObject2).equals(paramString))
          {
            locald.title = paramContext.getString(2131299698, new Object[] { localObject2 });
            break;
          }
          locald.title = paramContext.getString(2131299697, new Object[] { localObject2, paramString });
          break;
          paramcl = new LinkedList();
        }
        break;
      case 3:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131297079) + "\n");
        break;
      case 2:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131297012) + "\n");
        if (i == 0)
        {
          a(locald, (aar)localObject3, 2130837705);
          i = 1;
        }
        break;
      case 5:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131297071) + ((aar)localObject3).title + "\n");
        if (i == 0)
        {
          a(locald, (aar)localObject3, 2131230820);
          i = 1;
        }
        break;
      case 15:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131297076) + "\n");
        if (i == 0)
        {
          a(locald, (aar)localObject3, 2131230817);
          i = 1;
        }
        break;
      case 4:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131297076) + "\n");
        if (i == 0)
        {
          a(locald, (aar)localObject3, 2131230817);
          i = 1;
        }
        break;
      case 6:
        if (paramString.size() < 5)
        {
          paramcl = ((aar)localObject3).wgT.why;
          localObject3 = new StringBuilder().append(((aar)localObject3).wgV).append(":").append(paramContext.getString(2131296967));
          if ((!bo.isNullOrNil(paramcl.cIK)) && (!paramcl.cIK.equals(paramContext.getString(2131296967))))
            break label919;
        }
        for (paramcl = paramcl.label; ; paramcl = paramcl.cIK)
        {
          paramString.add(paramcl + "\n");
          if (i != 0)
            break;
          locald.cKc = 2131230798;
          i = 1;
          break;
        }
      case 7:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131296980) + ((aar)localObject3).title + "\n");
        if (i == 0)
        {
          a(locald, (aar)localObject3, 2131230800);
          i = 1;
        }
        break;
      case 8:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131296942) + ((aar)localObject3).title + "\n");
        if (i == 0)
        {
          a(locald, (aar)localObject3, 2131230813);
          i = 1;
        }
        break;
      case 10:
      case 11:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131297017) + ((aar)localObject3).wgT.whC.title + "\n");
        if (i == 0)
        {
          a(locald, (aar)localObject3, 2131230813);
          i = 1;
        }
        break;
      case 14:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131296527) + "\n");
        if (i == 0)
        {
          a(locald, (aar)localObject3, 2131230813);
          i = 1;
        }
        break;
      case 16:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131296947) + "\n");
        if (i == 0)
        {
          locald.mjO = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rn(((aar)localObject3).desc).svN;
          i = 1;
        }
        break;
      case 17:
        if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131297030) + "\n");
        break;
      case 19:
        label413: if (paramString.size() < 5)
          paramString.add(((aar)localObject3).wgV + ":" + paramContext.getString(2131296528) + ((aar)localObject3).title + "\n");
        label919: break;
      }
    }
    label1487: locald.desc = "";
    paramcl = paramString.iterator();
    for (paramContext = ""; paramcl.hasNext(); paramContext = paramContext + (String)localObject1)
      localObject1 = (String)paramcl.next();
    paramcl = paramContext.trim();
    paramContext = paramcl;
    if (paramString.size() >= 5)
      paramContext = paramcl + "...";
    locald.desc = paramContext;
    AppMethodBeat.o(135701);
    return locald;
  }

  public static String a(String paramString1, String paramString2, abf paramabf, String paramString3)
  {
    AppMethodBeat.i(135697);
    if ((paramabf == null) || (paramabf.wiv == null))
    {
      ab.e("MicroMsg.RecordMsgLogic", "buildRecordAppMsgXML error: protoItem or datalist is null");
      paramString1 = "";
      AppMethodBeat.o(135697);
      return paramString1;
    }
    LinkedList localLinkedList = paramabf.wiv;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<recordinfo>");
    localStringBuilder.append("<title>").append(bo.ani(paramString1)).append("</title>");
    localStringBuilder.append("<desc>").append(bo.ani(paramString2)).append("</desc>");
    a(localStringBuilder, paramabf);
    localStringBuilder.append(o.bK(localLinkedList));
    localStringBuilder.append("<favusername>").append(bo.ani(paramString3)).append("</favusername>");
    localStringBuilder.append("</recordinfo>");
    paramabf = new j.b();
    paramabf.title = paramString1;
    paramabf.description = paramString2;
    if ((localLinkedList.size() > 0) && (!bo.isNullOrNil(((aar)localLinkedList.get(0)).wgo)) && (((aar)localLinkedList.get(0)).wgo.equals(".htm")))
      paramabf.type = 24;
    for (paramabf.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008"; ; paramabf.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0")
    {
      paramabf.action = "view";
      paramabf.fgU = localStringBuilder.toString();
      paramString1 = j.b.a(paramabf, null, null);
      AppMethodBeat.o(135697);
      break;
      paramabf.type = 19;
    }
  }

  private static void a(com.tencent.mm.protocal.b.a.d paramd, aar paramaar, int paramInt)
  {
    AppMethodBeat.i(135702);
    paramaar = paramaar.wgz;
    if (com.tencent.mm.a.e.ct(paramaar))
    {
      paramd.thumbPath = paramaar;
      AppMethodBeat.o(135702);
    }
    while (true)
    {
      return;
      paramd.cKc = paramInt;
      AppMethodBeat.o(135702);
    }
  }

  private static void a(String paramString, com.tencent.mm.protocal.b.a.c paramc)
  {
    AppMethodBeat.i(135714);
    paramc.fjr.clear();
    for (Object localObject1 = DocumentBuilderFactory.newInstance(); ; localObject1 = null)
      while (true)
      {
        try
        {
          localObject2 = ((DocumentBuilderFactory)localObject1).newDocumentBuilder();
          localObject1 = new org/xml/sax/InputSource;
          Object localObject3 = new java/io/ByteArrayInputStream;
          ((ByteArrayInputStream)localObject3).<init>(paramString.getBytes());
          ((InputSource)localObject1).<init>((InputStream)localObject3);
          paramString = ((DocumentBuilder)localObject2).parse((InputSource)localObject1);
          paramString.normalize();
          paramString = paramString.getDocumentElement().getElementsByTagName("datalist");
          if (paramString == null)
            break label3864;
          NodeList localNodeList = paramString.item(0).getChildNodes();
          if ((localNodeList == null) || (localNodeList.getLength() <= 0))
            break label3864;
          int i = localNodeList.getLength();
          int j = 0;
          if (j >= i)
            break label3864;
          localObject1 = localNodeList.item(j);
          paramString = br.b((Node)localObject1);
          int m;
          if ((localObject1 instanceof Element))
          {
            localObject1 = ((Element)localObject1).getElementsByTagName("recordxml");
            if ((localObject1 == null) || (((NodeList)localObject1).getLength() <= 0))
              break;
            localObject2 = ((NodeList)localObject1).item(0).getChildNodes();
            if ((localObject2 == null) || (((NodeList)localObject2).getLength() <= 0))
              break;
            int k = ((NodeList)localObject2).getLength();
            m = 0;
            if (m >= k)
              break;
            localObject1 = ((NodeList)localObject2).item(m);
            if (!(localObject1 instanceof Element))
              continue;
            localObject1 = br.b((Node)localObject1);
            ab.d("MicroMsg.RecordMsgLogic", "recordXml: %s", new Object[] { localObject1 });
            if (!paramString.trim().startsWith("<dataitem"))
              break label3873;
            paramString = br.z(paramString, "dataitem");
            if (paramString != null)
              continue;
            paramString = null;
          }
          try
          {
            paramc.fjr.add(paramString);
            j++;
            continue;
            m++;
            continue;
            localObject3 = new com/tencent/mm/protocal/protobuf/aar;
            ((aar)localObject3).<init>();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).LE(bo.getInt((String)paramString.get(".dataitem" + ".$datatype"), 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akZ((String)paramString.get(".dataitem" + ".$datasourceid"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).LF(bo.getInt((String)paramString.get(".dataitem" + ".$datastatus"), 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akR((String)paramString.get(".dataitem" + ".datafmt"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akH((String)paramString.get(".dataitem" + ".datatitle"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akI((String)paramString.get(".dataitem" + ".datadesc"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akJ((String)paramString.get(".dataitem" + ".cdnthumburl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akK((String)paramString.get(".dataitem" + ".cdnthumbkey"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).LB(bo.getInt((String)paramString.get(".dataitem" + ".thumbwidth"), 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).LC(bo.getInt((String)paramString.get(".dataitem" + ".thumbheight"), 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akL((String)paramString.get(".dataitem" + ".cdndataurl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akM((String)paramString.get(".dataitem" + ".cdndatakey"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).fgv = ((String)paramString.get(".dataitem" + ".tpthumburl"));
            ((aar)localObject3).whn = true;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).ali((String)paramString.get(".dataitem" + ".tpaeskey"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).alj((String)paramString.get(".dataitem" + ".tpauthkey"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).alk((String)paramString.get(".dataitem" + ".tpdataurl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).fgB = ((String)paramString.get(".dataitem" + ".tpthumbaeskey"));
            ((aar)localObject3).wht = true;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = (String)paramString.get(".dataitem" + ".duration");
            if ((localObject2 != null) && (((String)localObject2).length() > 0))
              ((aar)localObject3).LD(bo.getInt((String)localObject2, 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akO((String)paramString.get(".dataitem" + ".streamdataurl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akP((String)paramString.get(".dataitem" + ".streamlowbandurl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akN((String)paramString.get(".dataitem" + ".streamweburl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akS((String)paramString.get(".dataitem" + ".fullmd5"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akT((String)paramString.get(".dataitem" + ".head256md5"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = (String)paramString.get(".dataitem" + ".datasize");
            if (!bo.isNullOrNil((String)localObject2))
              ((aar)localObject3).mf(bo.getInt((String)localObject2, 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akQ((String)paramString.get(".dataitem" + ".dataext"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akX((String)paramString.get(".dataitem" + ".thumbfullmd5"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).akY((String)paramString.get(".dataitem" + ".thumbhead256md5"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = (String)paramString.get(".dataitem" + ".thumbsize");
            if (!bo.isNullOrNil((String)localObject2))
              ((aar)localObject3).mg(bo.getInt((String)localObject2, 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).ala((String)paramString.get(".dataitem" + ".streamvideoid"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject4 = (String)paramString.get(".dataitem" + ".$dataid");
            localObject2 = localObject4;
            if (bo.isNullOrNil((String)localObject4))
              localObject2 = String.valueOf(j);
            ((aar)localObject3).akU((String)localObject2);
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = (String)paramString.get(".dataitem" + ".$htmlid");
            if (!bo.isNullOrNil((String)localObject2))
              ((aar)localObject3).ale((String)localObject2);
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).LG(bo.getInt((String)paramString.get(".dataitem" + ".$dataillegaltype"), 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).alb((String)paramString.get(".dataitem" + ".sourcetitle"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).alc((String)paramString.get(".dataitem" + ".sourcename"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).all((String)paramString.get(".dataitem" + ".sourcedesc"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).ald((String)paramString.get(".dataitem" + ".sourcetime"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aar)localObject3).alf((String)paramString.get(".dataitem" + ".statextstr"));
            if (localObject1 != null)
              ((aar)localObject3).alh((String)localObject1);
            localObject1 = new com/tencent/mm/protocal/protobuf/aas;
            ((aas)localObject1).<init>();
            localObject2 = new com/tencent/mm/protocal/protobuf/aat;
            ((aat)localObject2).<init>();
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((aat)localObject2).LI(bo.getInt((String)paramString.get(".dataitem" + ".$sourcetype"), 0));
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject4 = (String)paramString.get(".dataitem" + ".dataitemsource.fromusr");
            if (!bo.isNullOrNil((String)localObject4))
            {
              ((aat)localObject2).alm((String)localObject4);
              ab.d("MicroMsg.RecordMsgParser", "fromusr %s", new Object[] { ((aat)localObject2).cEV });
            }
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject4 = (String)paramString.get(".dataitem" + ".dataitemsource.realchatname");
            if (!bo.isNullOrNil((String)localObject4))
            {
              ((aat)localObject2).alp((String)localObject4);
              ab.d("MicroMsg.RecordMsgParser", "realChatname %s", new Object[] { ((aat)localObject2).whU });
            }
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((aat)localObject2).alr((String)paramString.get(".dataitem" + ".appid"));
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((aat)localObject2).als((String)paramString.get(".dataitem" + ".link"));
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((aat)localObject2).alt((String)paramString.get(".dataitem" + ".brandid"));
            ((aas)localObject1).c((aat)localObject2);
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject4 = ".dataitem" + ".locitem";
            if (!paramString.containsKey(localObject4))
            {
              ab.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject4 });
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ".dataitem" + ".weburlitem";
              if (paramString.containsKey(localObject2))
                break label2938;
              ab.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject4 = ".dataitem" + ".productitem";
              if (paramString.containsKey(localObject4))
                break label3162;
              ab.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject4 });
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ".dataitem" + ".tvitem";
              if (paramString.containsKey(localObject2))
                break label3383;
              ab.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ".dataitem" + ".appbranditem";
              if (paramString.containsKey(localObject2))
                break label3563;
              ab.v("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
              ((aar)localObject3).a((aas)localObject1);
              paramString = (String)localObject3;
              continue;
            }
            localObject2 = new com/tencent/mm/protocal/protobuf/aay;
            ((aay)localObject2).<init>();
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            if (!bo.isNullOrNil((String)paramString.get((String)localObject4 + ".label")))
            {
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              ((aay)localObject2).alu((String)paramString.get((String)localObject4 + ".label"));
            }
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            if (!bo.isNullOrNil((String)paramString.get((String)localObject4 + ".poiname")))
            {
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              ((aay)localObject2).alv((String)paramString.get((String)localObject4 + ".poiname"));
            }
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject5 = (String)paramString.get((String)localObject4 + ".lng");
            if (!bo.isNullOrNil((String)localObject5))
              ((aay)localObject2).D(bo.getDouble((String)localObject5, 0.0D));
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject5 = (String)paramString.get((String)localObject4 + ".lat");
            if (!bo.isNullOrNil((String)localObject5))
              ((aay)localObject2).E(bo.getDouble((String)localObject5, 0.0D));
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject4 = (String)paramString.get((String)localObject4 + ".scale");
            if (!bo.isNullOrNil((String)localObject4))
            {
              if (((String)localObject4).indexOf('.') != -1)
                ((aay)localObject2).LJ(bo.getInt(((String)localObject4).substring(0, ((String)localObject4).indexOf('.')), -1));
            }
            else
            {
              ((aas)localObject1).a((aay)localObject2);
              continue;
            }
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.RecordMsgLogic", "get record msg data from xml error: %s", new Object[] { paramString.getMessage() });
            ab.printErrStackTrace("MicroMsg.RecordMsgLogic", paramString, "", new Object[0]);
            paramc.fjr.clear();
            continue;
          }
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.RecordMsgLogic", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
          AppMethodBeat.o(135714);
          return;
        }
        ((aay)localObject2).LJ(bo.getInt((String)localObject4, -1));
        continue;
        label2938: Object localObject4 = new com/tencent/mm/protocal/protobuf/abu;
        ((abu)localObject4).<init>();
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abu)localObject4).alQ((String)paramString.get((String)localObject2 + ".title"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abu)localObject4).alR((String)paramString.get((String)localObject2 + ".desc"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abu)localObject4).alT((String)paramString.get((String)localObject2 + ".thumburl"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abu)localObject4).alS((String)paramString.get((String)localObject2 + ".link"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abu)localObject4).LO(bo.getInt((String)paramString.get((String)localObject2 + ".opencache"), 0));
        ((aas)localObject1).a((abu)localObject4);
        continue;
        label3162: Object localObject2 = new com/tencent/mm/protocal/protobuf/abe;
        ((abe)localObject2).<init>();
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abe)localObject2).alw((String)paramString.get((String)localObject4 + ".title"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abe)localObject2).alx((String)paramString.get((String)localObject4 + ".desc"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abe)localObject2).aly((String)paramString.get((String)localObject4 + ".thumburl"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abe)localObject2).alz((String)paramString.get((String)localObject4 + ".productinfo"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abe)localObject2).LK(bo.getInt((String)paramString.get((String)localObject4 + ".$type"), 0));
        ((aas)localObject1).a((abe)localObject2);
        continue;
        label3383: localObject4 = new com/tencent/mm/protocal/protobuf/abo;
        ((abo)localObject4).<init>();
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abo)localObject4).alM((String)paramString.get((String)localObject2 + ".title"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abo)localObject4).alN((String)paramString.get((String)localObject2 + ".desc"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abo)localObject4).alO((String)paramString.get((String)localObject2 + ".thumburl"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((abo)localObject4).alP((String)paramString.get((String)localObject2 + ".tvinfo"));
        ((aas)localObject1).a((abo)localObject4);
        continue;
        label3563: localObject4 = new com/tencent/mm/protocal/protobuf/aap;
        ((aap)localObject4).<init>();
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((aap)localObject4).username = ((String)paramString.get((String)localObject2 + ".username"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((aap)localObject4).appId = ((String)paramString.get((String)localObject2 + ".appid"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((aap)localObject4).cBc = bo.getInt((String)paramString.get((String)localObject2 + ".pkgtype"), 0);
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((aap)localObject4).iconUrl = ((String)paramString.get((String)localObject2 + ".iconurl"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((aap)localObject4).type = bo.getInt((String)paramString.get((String)localObject2 + ".type"), 0);
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((aap)localObject4).csu = ((String)paramString.get((String)localObject2 + ".pagepath"));
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((aap)localObject4).wfO = ((String)paramString.get((String)localObject2 + ".sourcedisplayname"));
        ((aas)localObject1).a((aap)localObject4);
        continue;
        label3864: AppMethodBeat.o(135714);
        continue;
        label3873: paramString = null;
      }
  }

  private static void a(StringBuilder paramStringBuilder, abf paramabf)
  {
    AppMethodBeat.i(135699);
    if (paramabf.vzK != null)
    {
      paramStringBuilder.append("<noteinfo>");
      paramStringBuilder.append("<noteauthor>").append(bo.ani(paramabf.vzK.wim)).append("</noteauthor>");
      paramStringBuilder.append("<noteeditor>").append(bo.ani(paramabf.vzK.win)).append("</noteeditor>");
      paramStringBuilder.append("</noteinfo>");
      paramStringBuilder.append("<edittime>").append(paramabf.lgR).append("</edittime>");
    }
    AppMethodBeat.o(135699);
  }

  public static boolean b(aar paramaar, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(135715);
    if (paramaar == null)
    {
      ab.w("MicroMsg.RecordMsgLogic", "try download data fail, dataitem is null");
      AppMethodBeat.o(135715);
      paramBoolean = false;
      return paramBoolean;
    }
    String str = h(paramaar.mnd, paramLong, true);
    Object localObject = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH(str);
    if (localObject == null)
    {
      i locali = new i();
      locali.field_cdnKey = paramaar.wgb;
      locali.field_cdnUrl = paramaar.wfZ;
      locali.field_dataId = paramaar.mnd;
      locali.field_mediaId = str;
      locali.field_totalLen = ((int)paramaar.wgu);
      locali.field_localId = (new Random().nextInt(2147483645) + 1);
      locali.field_path = c(paramaar, paramLong);
      locali.field_type = 1;
      locali.field_fileType = BH(paramaar.dataType);
      locali.field_isThumb = false;
      locali.field_tpaeskey = paramaar.who;
      locali.field_tpauthkey = paramaar.fgA;
      locali.field_tpdataurl = paramaar.whr;
      boolean bool = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(locali);
      ab.d("MicroMsg.RecordMsgLogic", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(locali.field_localId), Boolean.valueOf(bool) });
      localObject = locali;
      if (!bo.isNullOrNil(paramaar.whb))
      {
        localObject = locali;
        if (paramaar.whb.equals("WeNoteHtmlFile"))
        {
          ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNService().a(locali);
          localObject = locali;
        }
      }
    }
    while (true)
    {
      ab.d("MicroMsg.RecordMsgLogic", "try download data, dump record cdninfo: %s", new Object[] { localObject });
      if (4 == ((i)localObject).field_status)
      {
        ab.w("MicroMsg.RecordMsgLogic", "try download, but cdn info out of date, code[%d]", new Object[] { Integer.valueOf(((i)localObject).field_errCode) });
        AppMethodBeat.o(135715);
        paramBoolean = false;
        break;
      }
      if (3 == ((i)localObject).field_status)
      {
        ab.i("MicroMsg.RecordMsgLogic", "try download, but cdn info error, code[%d], can retry[%B]", new Object[] { Integer.valueOf(((i)localObject).field_errCode), Boolean.valueOf(paramBoolean) });
        if (paramBoolean)
        {
          ((i)localObject).field_status = 1;
          ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b((i)localObject, new String[] { "localId" });
        }
      }
      else
      {
        ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNService().run();
        AppMethodBeat.o(135715);
        paramBoolean = true;
        break;
      }
      AppMethodBeat.o(135715);
      paramBoolean = false;
      break;
    }
  }

  public static String c(aar paramaar, long paramLong)
  {
    int i = 1;
    AppMethodBeat.i(135707);
    if (paramaar == null)
    {
      paramaar = "";
      AppMethodBeat.o(135707);
    }
    Object localObject1;
    while (true)
    {
      return paramaar;
      localObject1 = paramaar.mnd;
      if ((!bo.isNullOrNil((String)localObject1)) && (ah.bqo()) && (com.tencent.mm.kernel.g.RK()))
        break;
      paramaar = "";
      AppMethodBeat.o(135707);
    }
    Object localObject2 = jE(paramLong);
    Object localObject3;
    if ((paramaar.dataType == 8) && (!bo.isNullOrNil(paramaar.title)))
    {
      localObject3 = paramaar.title;
      j = paramaar.mnd.hashCode();
      localObject1 = new StringBuilder();
      com.tencent.mm.kernel.g.RQ();
      File localFile = new File(String.format("%s/%d/%d/", new Object[] { com.tencent.mm.kernel.g.RP().eJM + "record/", Long.valueOf(paramLong), Integer.valueOf(j & 0xFF) }));
      if (localFile.exists())
      {
        j = i;
        localObject2 = localFile;
        localObject1 = localObject3;
        if (localFile.isDirectory());
      }
      else
      {
        localFile.mkdirs();
        localObject1 = localObject3;
        localObject2 = localFile;
      }
    }
    for (int j = i; ; j = 0)
    {
      localObject3 = localObject1;
      if (paramaar.wgo != null)
      {
        localObject3 = localObject1;
        if (paramaar.wgo.trim().length() > 0)
        {
          localObject3 = localObject1;
          if (j == 0)
            localObject3 = (String)localObject1 + "." + paramaar.wgo;
        }
      }
      paramaar = new File((File)localObject2, (String)localObject3).getAbsolutePath();
      AppMethodBeat.o(135707);
      break;
    }
  }

  public static boolean c(aar paramaar, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(135717);
    if (paramaar == null)
    {
      ab.w("MicroMsg.RecordMsgLogic", "try download thumb error, dataitem is null");
      AppMethodBeat.o(135717);
      paramBoolean = false;
      return paramBoolean;
    }
    String str1 = LA(paramaar.mnd);
    String str2 = h(str1, paramLong, true);
    i locali = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH(str2);
    if (locali == null)
    {
      locali = new i();
      locali.field_cdnKey = paramaar.wfV;
      locali.field_cdnUrl = paramaar.fgE;
      locali.field_dataId = str1;
      locali.field_mediaId = str2;
      locali.field_totalLen = ((int)paramaar.wgF);
      locali.field_localId = (new Random().nextInt(2147483645) + 1);
      locali.field_path = f(paramaar, paramLong);
      locali.field_type = 1;
      locali.field_fileType = com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE;
      locali.field_isThumb = true;
      locali.field_tpdataurl = paramaar.fgv;
      locali.field_tpauthkey = paramaar.fgA;
      locali.field_tpaeskey = paramaar.fgB;
      boolean bool = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(locali);
      ab.d("MicroMsg.RecordMsgLogic", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(locali.field_localId), Boolean.valueOf(bool) });
    }
    for (paramaar = locali; ; paramaar = locali)
    {
      ab.v("MicroMsg.RecordMsgLogic", "try download thumb, dump record cdninfo: %s", new Object[] { paramaar });
      if (4 == paramaar.field_status)
      {
        ab.w("MicroMsg.RecordMsgLogic", "try download thumb, but cdn info out of date, code[%d]", new Object[] { Integer.valueOf(paramaar.field_errCode) });
        AppMethodBeat.o(135717);
        paramBoolean = false;
        break;
      }
      if (3 == paramaar.field_status)
      {
        ab.i("MicroMsg.RecordMsgLogic", "try download thumb, but cdn info error, code[%d], can retry[%B]", new Object[] { Integer.valueOf(paramaar.field_errCode), Boolean.valueOf(paramBoolean) });
        if (paramBoolean)
        {
          paramaar.field_status = 1;
          ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(paramaar, new String[] { "localId" });
        }
      }
      else
      {
        ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNService().run();
        AppMethodBeat.o(135717);
        paramBoolean = true;
        break;
      }
      AppMethodBeat.o(135717);
      paramBoolean = false;
      break;
    }
  }

  public static boolean d(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(135708);
    boolean bool = new File(c(paramaar, paramLong)).exists();
    AppMethodBeat.o(135708);
    return bool;
  }

  public static boolean e(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(135709);
    boolean bool = new File(f(paramaar, paramLong)).exists();
    AppMethodBeat.o(135709);
    return bool;
  }

  public static String f(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(135710);
    if ((paramaar == null) || (bo.isNullOrNil(paramaar.mnd)))
    {
      paramaar = "";
      AppMethodBeat.o(135710);
    }
    while (true)
    {
      return paramaar;
      paramaar = LA(paramaar.mnd);
      paramaar = new File(jE(paramLong), paramaar).getAbsolutePath();
      AppMethodBeat.o(135710);
    }
  }

  public static boolean g(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(135716);
    boolean bool;
    if (paramaar == null)
    {
      ab.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate fail, dataitem is null");
      AppMethodBeat.o(135716);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramaar = h(paramaar.mnd, paramLong, true);
      paramaar = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH(paramaar);
      if (paramaar == null)
      {
        ab.d("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, not find cdn info");
        AppMethodBeat.o(135716);
        bool = false;
      }
      else if (4 == paramaar.field_status)
      {
        ab.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, status err, code %d", new Object[] { Integer.valueOf(paramaar.field_errCode) });
        AppMethodBeat.o(135716);
        bool = true;
      }
      else
      {
        ab.d("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, find cdn info, status %d", new Object[] { Integer.valueOf(paramaar.field_status) });
        AppMethodBeat.o(135716);
        bool = false;
      }
    }
  }

  public static String h(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(135712);
    if (paramBoolean)
    {
      paramString = paramString + "@record_download@" + paramLong;
      AppMethodBeat.o(135712);
    }
    while (true)
    {
      return paramString;
      paramString = paramString + "@record_upload@" + paramLong;
      AppMethodBeat.o(135712);
    }
  }

  public static boolean h(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(135719);
    boolean bool = com.tencent.mm.sdk.platformtools.r.amo(c(paramaar, paramLong));
    AppMethodBeat.o(135719);
    return bool;
  }

  private static File jE(long paramLong)
  {
    AppMethodBeat.i(135705);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = new File(String.format("%s/%d/", new Object[] { com.tencent.mm.kernel.g.RP().eJM + "record/", Long.valueOf(paramLong) }));
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
      ((File)localObject).mkdirs();
    AppMethodBeat.o(135705);
    return localObject;
  }

  public static void jF(long paramLong)
  {
    AppMethodBeat.i(135706);
    File localFile = jE(paramLong);
    boolean bool = com.tencent.mm.a.e.t(localFile);
    ab.i("MicroMsg.RecordMsgLogic", "do clear resource, path %s, result %B", new Object[] { localFile.getAbsolutePath(), Boolean.valueOf(bool) });
    AppMethodBeat.o(135706);
  }

  public static String mK(String paramString)
  {
    AppMethodBeat.i(135718);
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
    if (localObject == null)
    {
      ab.w("MicroMsg.RecordMsgLogic", "wtf get contact null, username %s", new Object[] { paramString });
      localObject = "";
      AppMethodBeat.o(135718);
      return localObject;
    }
    String str = ((ad)localObject).Oj();
    localObject = str;
    if (t.kH(str))
    {
      localObject = com.tencent.mm.model.n.my(paramString);
      paramString = com.tencent.mm.model.r.Yz();
      if ((localObject != null) && (!((List)localObject).isEmpty()))
        break label114;
      ab.w("MicroMsg.RecordMsgLogic", "get members from username error, content empty");
    }
    for (localObject = str; ; localObject = com.tencent.mm.model.n.f((List)localObject, 3))
    {
      AppMethodBeat.o(135718);
      break;
      label114: ((List)localObject).remove(paramString);
      ((List)localObject).add(0, paramString);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.n
 * JD-Core Version:    0.6.2
 */