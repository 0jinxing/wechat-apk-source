package com.tencent.mm.pluginsdk.model.app;

import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.j.b.a;
import com.tencent.mm.af.n;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.al;
import com.tencent.mm.g.a.al.a;
import com.tencent.mm.g.a.bx;
import com.tencent.mm.g.a.nh;
import com.tencent.mm.g.a.nj;
import com.tencent.mm.g.a.nj.a;
import com.tencent.mm.g.a.nm;
import com.tencent.mm.g.a.s;
import com.tencent.mm.g.a.ue;
import com.tencent.mm.g.a.uf;
import com.tencent.mm.g.a.ve;
import com.tencent.mm.g.a.vn;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.cb;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.protocal.protobuf.atc;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class j
  implements com.tencent.mm.ai.e
{
  private e.b a(e.a parama, String paramString, j.b paramb)
  {
    AppMethodBeat.i(27318);
    cm localcm = parama.eAB;
    aw.ZK();
    com.tencent.mm.plugin.messenger.foundation.a.a.h localh = com.tencent.mm.model.c.XO();
    aw.ZK();
    Object localObject1 = com.tencent.mm.model.c.XU();
    Object localObject2 = r.Yz();
    String str1 = aa.a(localcm.vEB);
    String str2 = aa.a(localcm.vEC);
    int i;
    if ((((com.tencent.mm.plugin.messenger.foundation.a.a.k)localObject1).has(str1)) || (((String)localObject2).equals(str1)))
      i = 1;
    while (true)
    {
      bf.b localb = bf.oE(localcm.vEG);
      localObject2 = null;
      if (localb != null)
        localObject2 = localb.fmp;
      label117: Object localObject3;
      label358: int j;
      label435: boolean bool;
      if (t.nE((String)localObject2))
      {
        localObject2 = "notifymessage";
        localObject3 = localh.Q((String)localObject2, localcm.ptF);
        ab.i("MicroMsg.AppMessageExtension", "dkmsgid doInsertMessage svrid:%d localid:%d", new Object[] { Long.valueOf(localcm.ptF), Long.valueOf(((cy)localObject3).field_msgId) });
        if ((((cy)localObject3).field_msgId != 0L) && (((cy)localObject3).field_createTime + 604800000L < bf.q((String)localObject2, localcm.pcX)))
        {
          ab.w("MicroMsg.AppMessageExtension", "dkmsgid doInsertMessage msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(localcm.ptF), Long.valueOf(((cy)localObject3).field_msgId) });
          bf.fm(((cy)localObject3).field_msgId);
          ((bi)localObject3).setMsgId(0L);
        }
        localObject1 = localObject3;
        if (((cy)localObject3).field_msgId == 0L)
        {
          localObject1 = new bi();
          ((bi)localObject1).eI(localcm.ptF);
          ((bi)localObject1).eJ(bf.q((String)localObject2, localcm.pcX));
        }
        if (paramb.fgl != null)
        {
          ((bi)localObject1).jB(paramb.fgl.dJE);
          ab.i("MicroMsg.AppMessageExtension", "[chatting_exp] expidstr:%s", new Object[] { ((cy)localObject1).dJE });
        }
        ((bi)localObject1).setType(l.d(paramb));
        if (!((bi)localObject1).drC())
          break label1710;
        localObject3 = paramb.content;
        ((bi)localObject1).setContent((String)localObject3);
        if (((bi)localObject1).drC())
          ((bi)localObject1).jz(paramb.dJv);
        if ((localcm.vEE != 2) || (((cy)localObject1).field_msgId != 0L))
          break label2025;
        switch (((bi)localObject1).getType())
        {
        default:
          j = 0;
          if (j == 0)
            if (paramb.type == 2)
            {
              bool = true;
              label451: localObject3 = aa.a(localcm.vEF);
              if (ae.giF)
              {
                ab.w("MicroMsg.AppMessageExtension", "Test.useCdnDownThumb  set img buf null !!!!!!!");
                localObject3 = null;
              }
              if (bo.cb((byte[])localObject3))
                break label1745;
              if ((paramb.type != 33) && (paramb.type != 36) && (paramb.type != 46) && (paramb.type != 44))
                break label1728;
              localObject3 = o.ahl().a((byte[])localObject3, Bitmap.CompressFormat.PNG);
              label534: if (bo.isNullOrNil((String)localObject3))
                ab.w("MicroMsg.AppMessageExtension", "thumbData MsgInfo content:%s", new Object[] { ((cy)localObject1).field_content });
              if (!bo.isNullOrNil((String)localObject3))
              {
                ((bi)localObject1).jv((String)localObject3);
                ab.d("MicroMsg.AppMessageExtension", "new thumbnail saved, path".concat(String.valueOf(localObject3)));
              }
              label593: if (i == 0)
                break label2301;
              ((bi)localObject1).hO(1);
              ((bi)localObject1).ju((String)localObject2);
              j = localcm.jBT;
              label618: ((bi)localObject1).setStatus(j);
              if (paramb.type == 2001)
                if (paramb.showType == 1)
                {
                  if ((TextUtils.isEmpty(paramb.fic)) || (TextUtils.isEmpty(paramb.fid)) || (paramb.fie <= 0))
                    break label2339;
                  ab.i("MicroMsg.AppMessageExtension", "ljd:this is new year msg! send predownload image event!");
                  localObject2 = new al();
                  ((al)localObject2).ctv = new al.a();
                  ((al)localObject2).ctv.cty = paramb.fid;
                  ((al)localObject2).ctv.ctw = paramb.fic;
                  ((al)localObject2).ctv.ctz = paramb.fie;
                  com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
                }
            }
          break;
        case -1879048191:
        case -1879048190:
        case -1879048189:
        }
      }
      try
      {
        label744: if (!bo.ek(paramb.fio))
        {
          localObject2 = paramb.fio.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = ((String)((Iterator)localObject2).next()).split(",");
            if ((localObject3 != null) && (localObject3.length > 0))
            {
              localObject3 = localObject3[0];
              if ((!bo.isNullOrNil((String)localObject3)) && (((String)localObject3).equals(r.Yz())))
              {
                ((bi)localObject1).hY(((cy)localObject1).field_flag | 0x8);
                ab.i("MicroMsg.AppMessageExtension", "check c2c payer list, myself is payer, add red flag");
                x(true, ((cy)localObject1).field_talker);
              }
            }
          }
        }
        while (true)
        {
          ab.i("MicroMsg.AppMessageExtension", "paymsgid: %s", new Object[] { paramb.fib });
          ((bi)localObject1).ix(localcm.vEG);
          if (localb != null)
          {
            ((bi)localObject1).jA(localb.fmu);
            ((bi)localObject1).jy(localb.fmt);
          }
          bf.a((bi)localObject1, parama);
          if (((cy)localObject1).field_msgId != 0L)
            break label2567;
          ((bi)localObject1).setMsgId(bf.l((bi)localObject1));
          parama = new s();
          parama.csF.csG = ((bi)localObject1);
          parama.csF.csH = paramb;
          com.tencent.mm.sdk.b.a.xxA.m(parama);
          parama = new e.b((bi)localObject1, true);
          if ((((bi)localObject1).getType() == 301989937) && (t.nC(((cy)localObject1).field_talker)))
            ((bi)localObject1).setMsgId(0L);
          if ((((bi)localObject1).dtu()) && ("notifymessage".equals(((cy)localObject1).field_talker)))
          {
            localObject2 = br.z(((cy)localObject1).field_content, "msg");
            if (localObject2 != null)
            {
              localObject2 = bo.nullAsNil((String)((Map)localObject2).get(".msg.fromusername"));
              if (ad.mg((String)localObject2))
              {
                ((d)com.tencent.mm.kernel.g.K(d.class)).b((String)localObject2, null);
                ab.d("MicroMsg.AppMessageExtension", "trigger to get app brand WxaInfo(%s)", new Object[] { localObject2 });
              }
            }
          }
          if (((bi)localObject1).getType() == 536870961)
          {
            localObject2 = (com.tencent.mm.af.b)paramb.X(com.tencent.mm.af.b.class);
            localObject3 = new nj();
            ((nj)localObject3).cJG.cJD = ((cy)localObject1).field_msgId;
            ((nj)localObject3).cJG.cJH = ((com.tencent.mm.af.b)localObject2).cJF;
            ((nj)localObject3).cJG.cJh = paramString;
            if (((cy)localObject1).field_isSend == 1)
            {
              ab.d("MicroMsg.AppMessageExtension", "fromuser: %s, touser: %s", new Object[] { str1, str2 });
              ((nj)localObject3).cJG.username = ((cy)localObject1).field_talker;
            }
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
            if (((nj)localObject3).cJG.cJh != null)
            {
              ((bi)localObject1).setContent(((nj)localObject3).cJG.cJh);
              localh.a(((cy)localObject1).field_msgId, (bi)localObject1);
            }
          }
          if ((!bo.isNullOrNil(paramb.fih)) && (((bi)localObject1).getType() == 436207665))
          {
            localObject2 = new nh();
            ((nh)localObject2).cJC.cJD = ((cy)localObject1).field_msgId;
            ((nh)localObject2).cJC.cJh = paramString;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          }
          if ((paramb.type == 2000) && (!bo.isNullOrNil(paramb.fhy)))
          {
            paramString = new nm();
            paramString.cJL.cEa = paramb.fhy;
            paramString.cJL.cvx = ((cy)localObject1).field_msgId;
            paramString.cJL.cJM = paramb;
            com.tencent.mm.sdk.b.a.xxA.m(paramString);
            x(false, ((cy)localObject1).field_talker);
          }
          paramb = paramb.fjf;
          paramString = bo.bc((String)paramb.get(".msg.appmsg.ext_pay_info.pay_type"), "");
          if (((paramString.equals("wx_f2f")) || (paramString.equals("wx_md"))) && (parama.fsZ))
          {
            long l1 = ((cy)localObject1).field_createTime;
            long l2 = cb.aaE();
            ab.i("MicroMsg.AppMessageExtension", "pay voice msg: %s, create: %s, current: %s", new Object[] { paramString, Long.valueOf(l1), Long.valueOf(l2) });
            localObject3 = new bx();
            j = bo.getInt((String)paramb.get(".msg.appmsg.ext_pay_info.pay_fee"), 0);
            localObject2 = bo.nullAsNil((String)paramb.get(".msg.appmsg.ext_pay_info.pay_feetype"));
            localObject1 = bo.nullAsNil((String)paramb.get(".msg.appmsg.ext_pay_info.pay_outtradeno"));
            paramb = bo.nullAsNil((String)paramb.get(".msg.appmsg.ext_pay_info.voice_content"));
            if ((j > 0) && (!bo.isNullOrNil((String)localObject2)) && (!bo.isNullOrNil((String)localObject1)))
            {
              ((bx)localObject3).cuX.cuY = j;
              ((bx)localObject3).cuX.cuZ = ((String)localObject2);
              ((bx)localObject3).cuX.cva = ((String)localObject1);
              ((bx)localObject3).cuX.cvb = paramString;
              ((bx)localObject3).cuX.cvc = (l2 - l1);
              ((bx)localObject3).cuX.cvd = 0;
              ((bx)localObject3).cuX.cve = paramb;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
            }
          }
          AppMethodBeat.o(27318);
          return parama;
          i = 0;
          break;
          if (i != 0)
          {
            localObject2 = str2;
            break label117;
          }
          localObject2 = str1;
          break label117;
          label1710: localObject3 = paramString;
          break label358;
          j = 1;
          break label435;
          bool = false;
          break label451;
          label1728: localObject3 = a((byte[])localObject3, bool, ((bi)localObject1).dty());
          break label534;
          label1745: if ((!bo.isNullOrNil(paramb.fgE)) && (!bo.isNullOrNil(paramb.fgK)))
          {
            a(((cy)localObject1).field_msgSvrId, (bi)localObject1, (String)localObject2, paramb.fgK, paramb.fgE, paramb.fgF, bool, paramb, "", false);
            break label593;
          }
          String str3;
          Object localObject4;
          com.tencent.mm.at.a.a locala;
          Object localObject5;
          if (!bo.isNullOrNil(paramb.thumburl))
          {
            ab.d("MicroMsg.AppMessageExtension", "get cdn image " + paramb.thumburl);
            str3 = com.tencent.mm.a.g.x(bo.anU().getBytes());
            localObject3 = o.ahl().getFullPath(str3);
            o.ahl();
            localObject4 = com.tencent.mm.at.g.si(str3);
            locala = o.ahp();
            str3 = paramb.thumburl;
            localObject5 = new c.a();
            ((c.a)localObject5).ePJ = ((String)localObject3);
            ((c.a)localObject5).ePH = true;
            locala.a(str3, null, ((c.a)localObject5).ahG());
            ((bi)localObject1).jv((String)localObject4);
            ab.d("MicroMsg.AppMessageExtension", "new thumbnail saved, path ".concat(String.valueOf(localObject3)));
            break label593;
          }
          if (bo.isNullOrNil(paramb.fgv))
            break label593;
          a(((cy)localObject1).field_msgSvrId, (bi)localObject1, (String)localObject2, paramb.fgB, paramb.fgv, paramb.fgw, bool, paramb, paramb.fgA, true);
          ab.d("MicroMsg.AppMessageExtension", "get cdn image " + paramb.fgv);
          break label593;
          label2025: if (!bo.isNullOrNil(paramb.thumburl))
          {
            ab.d("MicroMsg.AppMessageExtension", "get cdn image " + paramb.thumburl);
            localObject3 = com.tencent.mm.a.g.x(bo.anU().getBytes());
            if (paramb.type == 2001)
              localObject3 = com.tencent.mm.a.g.x(paramb.thumburl.getBytes());
            str3 = o.ahl().getFullPath((String)localObject3);
            o.ahl();
            localObject5 = com.tencent.mm.at.g.si((String)localObject3);
            locala = o.ahp();
            localObject3 = paramb.thumburl;
            localObject4 = new c.a();
            ((c.a)localObject4).ePJ = str3;
            ((c.a)localObject4).ePH = true;
            locala.a((String)localObject3, null, ((c.a)localObject4).ahG());
            ((bi)localObject1).jv((String)localObject5);
            ab.d("MicroMsg.AppMessageExtension", "new thumbnail saved, path ".concat(String.valueOf(str3)));
            break label593;
          }
          if (bo.isNullOrNil(paramb.fgv))
            break label593;
          if (paramb.type == 2);
          for (bool = true; ; bool = false)
          {
            a(((cy)localObject1).field_msgSvrId, (bi)localObject1, (String)localObject2, paramb.fgB, paramb.fgv, paramb.fgw, bool, paramb, paramb.fgA, true);
            ab.d("MicroMsg.AppMessageExtension", "get cdn image " + paramb.fgv);
            break;
          }
          label2301: ((bi)localObject1).hO(0);
          ((bi)localObject1).ju((String)localObject2);
          if (localcm.jBT > 3)
          {
            j = localcm.jBT;
            break label618;
          }
          j = 3;
          break label618;
          label2339: ab.e("MicroMsg.AppMessageExtension", "ljd:this is new year msg! don't send predownload image event, because image preload data is illegal!");
          break label744;
          if (!"1001".equals(paramb.fhY))
          {
            localObject2 = new com/tencent/mm/g/a/ve;
            ((ve)localObject2).<init>();
            ((ve)localObject2).cSb.cJh = paramString;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
            x(false, ((cy)localObject1).field_talker);
            if ("1002".equals(paramb.fhY))
            {
              localObject3 = (com.tencent.mm.af.c)paramb.X(com.tencent.mm.af.c.class);
              localObject2 = new com/tencent/mm/protocal/protobuf/atc;
              ((atc)localObject2).<init>();
              ((atc)localObject2).wwX = ((com.tencent.mm.af.c)localObject3).ffX;
              ((atc)localObject2).wxa = ((com.tencent.mm.af.c)localObject3).ffY;
              ((atc)localObject2).wwW = ((com.tencent.mm.af.c)localObject3).ffV;
              ((atc)localObject2).wwZ = ((com.tencent.mm.af.c)localObject3).ffW;
              if (i == 0)
                break label2544;
              ((atc)localObject2).wwV = ((com.tencent.mm.af.c)localObject3).ffR;
              ((atc)localObject2).wwY = ((com.tencent.mm.af.c)localObject3).ffS;
              ((com.tencent.mm.plugin.luckymoney.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.luckymoney.a.a.class)).a((atc)localObject2);
            }
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.AppMessageExtension", "check c2c payer list error: %s", new Object[] { localException.getMessage() });
          continue;
          label2544: localException.wwV = ((com.tencent.mm.af.c)localObject3).ffT;
          localException.wwY = ((com.tencent.mm.af.c)localObject3).ffU;
          continue;
          label2567: localh.b(localcm.ptF, (bi)localObject1);
          parama = new e.b((bi)localObject1, false);
        }
      }
    }
  }

  static String a(byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(27317);
    paramArrayOfByte = o.ahl().a(paramArrayOfByte, paramBoolean1, Bitmap.CompressFormat.PNG, paramBoolean2);
    AppMethodBeat.o(27317);
    return paramArrayOfByte;
  }

  private boolean a(long paramLong, bi parambi, String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean1, j.b paramb, String paramString4, boolean paramBoolean2)
  {
    AppMethodBeat.i(27321);
    ab.i("MicroMsg.AppMessageExtension", "getThumbByCdn msgsvrid:%d aes:%s thumblen:%d url:%s talker:%s bigThumb:%b", new Object[] { Long.valueOf(parambi.field_msgSvrId), paramString2, Integer.valueOf(paramInt), paramString3, paramString1, Boolean.valueOf(paramBoolean1) });
    long l = bo.anU();
    int i;
    com.tencent.mm.i.g localg;
    if (paramb != null)
    {
      i = paramb.type;
      paramb = o.ahl().q(bo.anU(), "", "");
      localg = new com.tencent.mm.i.g();
      localg.field_mediaId = com.tencent.mm.al.c.a("downappthumb", parambi.field_createTime, paramString1, String.valueOf(paramLong));
      localg.field_fullpath = paramb;
      if (!paramBoolean2)
        break label290;
      localg.field_fileType = 19;
      localg.egm = paramString3;
      label163: localg.field_totalLen = paramInt;
      localg.field_aesKey = paramString2;
      localg.field_priority = com.tencent.mm.i.a.efD;
      localg.field_authKey = paramString4;
      if (!t.kH(paramString1))
        break label308;
    }
    label290: label308: for (int j = 1; ; j = 0)
    {
      localg.field_chattype = j;
      ab.d("MicroMsg.AppMessageExtension", "get thumb by cdn [appmsg 1] chatType[%d] talker[%s] ", new Object[] { Integer.valueOf(localg.field_chattype), paramString1 });
      localg.egl = new j.1(this, paramLong, paramString3, l, paramInt, paramString1, paramb, i, paramBoolean1);
      com.tencent.mm.al.f.afx().b(localg, -1);
      AppMethodBeat.o(27321);
      return true;
      i = 0;
      break;
      localg.field_fileId = paramString3;
      localg.field_fileType = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
      break label163;
    }
  }

  public static String hE(String paramString1, String paramString2)
  {
    AppMethodBeat.i(27315);
    if (bo.isNullOrNil(paramString2))
    {
      paramString1 = null;
      AppMethodBeat.o(27315);
    }
    while (true)
    {
      return paramString1;
      String str = paramString2;
      if (t.kH(paramString1))
      {
        int i = bf.ox(paramString2);
        str = paramString2;
        if (i != -1)
          str = (paramString2 + " ").substring(i + 2).trim();
      }
      paramString1 = bo.anj(str);
      AppMethodBeat.o(27315);
    }
  }

  private static void x(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(27319);
    ak localak;
    if (!bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.AppMessageExtension", "updateC2CAAMsgMark, mark: %s, talker: %s", new Object[] { Boolean.valueOf(paramBoolean), paramString });
      aw.ZK();
      localak = com.tencent.mm.model.c.XR().aoZ(paramString);
      if (localak != null)
      {
        if (!paramBoolean)
          break label87;
        localak.jj(16777216);
      }
    }
    while (true)
    {
      aw.ZK();
      com.tencent.mm.model.c.XR().a(localak, paramString);
      AppMethodBeat.o(27319);
      return;
      label87: localak.jk(16777216);
    }
  }

  public final void a(e.c paramc)
  {
    AppMethodBeat.i(27320);
    bi localbi = paramc.cKd;
    if (localbi == null)
    {
      ab.e("MicroMsg.AppMessageExtension", "[onPreDelMessage] msg == null");
      AppMethodBeat.o(27320);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.AppMessageExtension", "onPreDelMessage " + localbi.field_imgPath);
      paramc = new ue();
      paramc.cQo.path = localbi.field_imgPath;
      com.tencent.mm.sdk.b.a.xxA.m(paramc);
      paramc = localbi.field_content;
      if (paramc != null)
      {
        paramc = j.b.me(paramc);
        if ((paramc != null) && (paramc.type == 6))
        {
          com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.compatible.util.e.euQ + paramc.title);
          com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.compatible.util.e.euQ + paramc.title + "_tmp");
        }
      }
      AppMethodBeat.o(27320);
    }
  }

  public final boolean a(j.a parama, String paramString1, long paramLong, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    AppMethodBeat.i(27322);
    String str = o.ahl().q("Note_".concat(String.valueOf(paramString1)), "", "");
    boolean bool;
    if (com.tencent.mm.vfs.e.ct(str))
    {
      bool = false;
      AppMethodBeat.o(27322);
      return bool;
    }
    com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
    localg.field_mediaId = com.tencent.mm.al.c.a("downappthumb", paramLong, paramString4, String.valueOf(paramString1));
    localg.field_fullpath = str;
    localg.field_fileType = com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE;
    localg.field_totalLen = paramInt;
    localg.field_aesKey = paramString2;
    localg.field_fileId = paramString3;
    localg.field_priority = com.tencent.mm.i.a.efD;
    if (t.kH(paramString4));
    for (paramInt = 1; ; paramInt = 0)
    {
      localg.field_chattype = paramInt;
      ab.d("MicroMsg.AppMessageExtension", "get thumb by cdn [appmsg 2] chatType[%d] user[%s] ", new Object[] { Integer.valueOf(localg.field_chattype), paramString4 });
      localg.egl = new j.2(this, parama, paramString3);
      com.tencent.mm.al.f.afx().b(localg, -1);
      bool = true;
      AppMethodBeat.o(27322);
      break;
    }
  }

  public final e.b b(e.a parama)
  {
    b localb = null;
    AppMethodBeat.i(27316);
    ab.d("MicroMsg.AppMessageExtension", "process add app message");
    Object localObject1 = parama.eAB;
    Object localObject2 = aa.a(((cm)localObject1).vEB);
    Object localObject3 = aa.a(((cm)localObject1).vEC);
    j.b localb1;
    if ((bo.isNullOrNil((String)localObject2)) || (bo.isNullOrNil((String)localObject3)))
    {
      ab.e("MicroMsg.AppMessageExtension", "empty fromuser or touser");
      localObject3 = null;
      localb1 = j.b.me((String)localObject3);
      if (localb1 != null)
        break label113;
      ab.e("MicroMsg.AppMessageExtension", "parse app message failed, insert failed");
      AppMethodBeat.o(27316);
      parama = localb;
    }
    label320: 
    while (true)
    {
      return parama;
      localObject3 = hE((String)localObject2, aa.a(((cm)localObject1).vED));
      break;
      label113: if (localb1.fif)
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(352273, localObject3);
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(352274, Long.valueOf(System.currentTimeMillis()));
        new a((String)localObject3).dhv();
        AppMethodBeat.o(27316);
        parama = localb;
      }
      else
      {
        f localf = am.bYJ().aiJ(localb1.appId);
        String str = localb1.appId;
        int i = localb1.axy;
        if (localf == null);
        for (localObject2 = "null"; ; localObject2 = Integer.valueOf(localf.field_appVersion))
        {
          ab.i("MicroMsg.AppMessageExtension", "check version appid:%s, msgVer:%d, appVer:%s", new Object[] { str, Integer.valueOf(i), localObject2 });
          if ((localf == null) || (localf.field_appVersion < localb1.axy))
            am.bYI().aiH(localb1.appId);
          parama = a(parama, aa.a(((cm)localObject1).vED), localb1);
          if (parama.csG != null)
            break label320;
          AppMethodBeat.o(27316);
          parama = localb;
          break;
        }
        localObject2 = parama.csG;
        if (((bi)localObject2).drC())
        {
          if (!bo.isNullOrNil(localb1.fjc))
          {
            localObject3 = new vn();
            ((vn)localObject3).cSA.cHz = localb1.fjc;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
          }
          AppMethodBeat.o(27316);
        }
        else if (((bi)localObject2).getType() == 301989937)
        {
          AppMethodBeat.o(27316);
        }
        else
        {
          if (((bi)localObject2).getType() == -1879048190)
          {
            localObject1 = new uf();
            ((uf)localObject1).cQp.cHz = ((String)localObject3);
            ((uf)localObject1).cQp.description = localb1.description;
            ((uf)localObject1).cQp.csG = ((bi)localObject2);
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          }
          if ((((bi)localObject2).getType() == 49) && (!bo.isNullOrNil(localb1.canvasPageXml)))
          {
            localObject1 = new com.tencent.mm.g.a.f();
            ((com.tencent.mm.g.a.f)localObject1).crT.crU = localb1.canvasPageXml;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          }
          localObject1 = new com.tencent.mm.af.j();
          localb1.a((com.tencent.mm.af.j)localObject1);
          ((com.tencent.mm.af.j)localObject1).field_msgId = ((cy)localObject2).field_msgId;
          if ((am.dhN().ma(((cy)localObject2).field_msgId) == null) && (am.dhN().b((com.tencent.mm.sdk.e.c)localObject1)))
          {
            if (localb1.type == 40)
            {
              localb = am.aUq().lZ(((cy)localObject2).field_msgId);
              localObject3 = n.mj((String)localObject3);
              if (localb == null)
                l.a(null, ((cy)localObject2).field_msgId, 0, null, null, ((n)localObject3).fjt, localb1.type, 0);
              localObject3 = new com.tencent.mm.plugin.record.b.e(((cy)localObject2).field_msgId, ((cy)localObject2).field_msgSvrId, null);
              aw.Rg().a((m)localObject3, 0);
            }
            AppMethodBeat.o(27316);
          }
          else
          {
            AppMethodBeat.o(27316);
            parama = localb;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.j
 * JD-Core Version:    0.6.2
 */