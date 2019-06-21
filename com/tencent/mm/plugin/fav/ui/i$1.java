package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.mt;
import com.tencent.mm.g.a.mt.b;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.sx;
import com.tencent.mm.g.a.sx.b;
import com.tencent.mm.model.ad.a;
import com.tencent.mm.model.ad.b;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class i$1
  implements Runnable
{
  i$1(String paramString1, List paramList, Context paramContext, String paramString2, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74117);
    Iterator localIterator1 = bo.P(this.mjI.split(",")).iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      Iterator localIterator2 = this.mjJ.iterator();
      while (localIterator2.hasNext())
      {
        Object localObject1 = (com.tencent.mm.plugin.fav.a.g)localIterator2.next();
        if (localObject1 == null)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.FavSendLogic", "in run workerThread,want to send fav msg, but info is null,infos.size = %d", new Object[] { Integer.valueOf(this.mjJ.size()) });
        }
        else
        {
          h.pYm.e(10925, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.fav.a.g)localObject1).field_type), Integer.valueOf(((com.tencent.mm.plugin.fav.a.g)localObject1).field_id) });
          Object localObject3;
          Object localObject4;
          Object localObject5;
          Object localObject6;
          Object localObject7;
          label1250: int i;
          Object localObject2;
          switch (((com.tencent.mm.plugin.fav.a.g)localObject1).field_type)
          {
          case 3:
          case 9:
          case 12:
          case 13:
          default:
            break;
          case 1:
            com.tencent.mm.plugin.messenger.a.g.bOk().F(str, ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.desc, t.nK(str));
            break;
          case 2:
            localObject3 = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wiv.iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject4 = (aar)((Iterator)localObject3).next();
              com.tencent.mm.plugin.messenger.a.g.bOk().a(this.val$context, str, com.tencent.mm.plugin.fav.a.b.b((aar)localObject4), 0, "", "");
            }
          case 16:
            i.a(this.val$context, str, com.tencent.mm.plugin.fav.a.b.c((com.tencent.mm.plugin.fav.a.g)localObject1));
            break;
          case 4:
            i.b(this.val$context, str, com.tencent.mm.plugin.fav.a.b.c((com.tencent.mm.plugin.fav.a.g)localObject1));
            break;
          case 6:
            localObject3 = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.why;
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("<msg>");
            ((StringBuilder)localObject4).append("<location ");
            ((StringBuilder)localObject4).append("x=\"").append(((aay)localObject3).lat).append("\" ");
            ((StringBuilder)localObject4).append("y=\"").append(((aay)localObject3).lng).append("\" ");
            ((StringBuilder)localObject4).append("scale=\"").append(((aay)localObject3).cED).append("\" ");
            ((StringBuilder)localObject4).append("label=\"").append(bo.bc(((aay)localObject3).label, "")).append("\" ");
            ((StringBuilder)localObject4).append("maptype=\"0\" ");
            ((StringBuilder)localObject4).append("poiname=\"").append(bo.bc(((aay)localObject3).cIK, "")).append("\" ");
            ((StringBuilder)localObject4).append("/>");
            ((StringBuilder)localObject4).append("</msg>");
            com.tencent.mm.plugin.messenger.a.g.bOk().F(str, ((StringBuilder)localObject4).toString(), 48);
            break;
          case 8:
            i.a(str, (com.tencent.mm.plugin.fav.a.g)localObject1, com.tencent.mm.plugin.fav.a.b.c((com.tencent.mm.plugin.fav.a.g)localObject1));
            break;
          case 7:
            localObject5 = this.val$context;
            localObject6 = com.tencent.mm.plugin.fav.a.b.c((com.tencent.mm.plugin.fav.a.g)localObject1);
            localObject3 = new WXMusicObject();
            ((WXMusicObject)localObject3).musicUrl = ((aar)localObject6).wgg;
            ((WXMusicObject)localObject3).musicDataUrl = ((aar)localObject6).wgi;
            ((WXMusicObject)localObject3).musicLowBandUrl = ((aar)localObject6).wgk;
            ((WXMusicObject)localObject3).musicLowBandDataUrl = ((aar)localObject6).wgk;
            localObject7 = new WXMediaMessage();
            ((WXMediaMessage)localObject7).mediaObject = ((WXMediaMessage.IMediaObject)localObject3);
            ((WXMediaMessage)localObject7).title = ((aar)localObject6).title;
            ((WXMediaMessage)localObject7).description = ((aar)localObject6).desc;
            localObject4 = bo.readFromFile(com.tencent.mm.plugin.fav.a.b.c((aar)localObject6));
            localObject3 = localObject4;
            if (localObject4 == null)
            {
              localObject3 = bo.bc(((aar)localObject6).cvq, "");
              localObject3 = bo.readFromFile(com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(((String)localObject3).getBytes()));
            }
            ((WXMediaMessage)localObject7).thumbData = ((byte[])localObject3);
            localObject3 = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wit.appId;
            localObject4 = ad.a.fls.t((Context)localObject5, (String)localObject3);
            ((com.tencent.mm.plugin.fav.a.ab)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.fav.a.ab.class)).a((WXMediaMessage)localObject7, (String)localObject3, (String)localObject4, str);
            break;
          case 5:
            if (localObject1 == null)
            {
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavSendLogic", "item info is null, send fav url fail, return");
            }
            else
            {
              localObject7 = com.tencent.mm.plugin.fav.a.b.c((com.tencent.mm.plugin.fav.a.g)localObject1);
              localObject6 = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.whA;
              Object localObject8 = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wit;
              localObject5 = new j.b();
              if (localObject6 != null)
              {
                ((j.b)localObject5).title = ((abu)localObject6).title;
                localObject4 = ((abu)localObject6).thumbUrl;
                localObject3 = localObject4;
                if (bo.isNullOrNil((String)localObject4))
                  localObject3 = bo.bc(((aar)localObject7).cvq, "");
                ((j.b)localObject5).thumburl = ((String)localObject3);
              }
              if (bo.isNullOrNil(((j.b)localObject5).title))
                ((j.b)localObject5).title = ((aar)localObject7).title;
              if (localObject6 != null)
                ((j.b)localObject5).description = ((abu)localObject6).desc;
              if (bo.isNullOrNil(((j.b)localObject5).description))
                ((j.b)localObject5).description = ((aar)localObject7).desc;
              if (((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.whA != null)
                ((j.b)localObject5).url = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.whA.wiY;
              if ((localObject8 != null) && (bo.isNullOrNil(((j.b)localObject5).url)))
                ((j.b)localObject5).url = ((abl)localObject8).link;
              if (!bo.isNullOrNil(((aar)localObject7).canvasPageXml))
                ((j.b)localObject5).canvasPageXml = ((aar)localObject7).canvasPageXml;
              ((j.b)localObject5).action = "view";
              ((j.b)localObject5).type = 5;
              ((j.b)localObject5).cMn = ((aar)localObject7).cMn;
              localObject4 = bo.readFromFile(com.tencent.mm.plugin.fav.a.b.c((aar)localObject7));
              localObject3 = localObject4;
              if (localObject4 == null)
                if (localObject6 != null)
                  break label1250;
              for (localObject3 = null; ; localObject3 = ((abu)localObject6).thumbUrl)
              {
                localObject4 = localObject3;
                if (bo.isNullOrNil((String)localObject3))
                  localObject4 = bo.bc(((aar)localObject7).cvq, "");
                localObject3 = bo.readFromFile(com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(((String)localObject4).getBytes()));
                localObject8 = "fav_" + r.Yz() + "_" + ((com.tencent.mm.plugin.fav.a.g)localObject1).field_id;
                localObject4 = v.nW((String)localObject8);
                localObject6 = v.Zp().y((String)localObject4, true);
                ((v.b)localObject6).j("prePublishId", localObject8);
                ((v.b)localObject6).j("preUsername", ((com.tencent.mm.plugin.fav.a.g)localObject1).field_fromUser);
                ((v.b)localObject6).j("sendAppMsgScene", Integer.valueOf(1));
                ((v.b)localObject6).j("adExtStr", ((aar)localObject7).cMn);
                com.tencent.mm.plugin.messenger.a.g.bOk().a(str, (byte[])localObject3, j.b.a((j.b)localObject5, null, null), (String)localObject4);
                break;
              }
            }
            break;
          case 10:
            localObject3 = this.val$context;
            localObject4 = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.whC;
            localObject1 = new mt();
            ((mt)localObject1).cIE.opType = 0;
            ((mt)localObject1).cIE.cIG = ((abe)localObject4).info;
            ((mt)localObject1).cIE.context = ((Context)localObject3);
            a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            if (((mt)localObject1).cIF.cvi)
            {
              localObject4 = bo.readFromFile(com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(bo.bc(((abe)localObject4).thumbUrl, "").getBytes()));
              localObject3 = localObject4;
              if (localObject4 == null)
                localObject3 = bo.readFromFile(((mt)localObject1).cIF.thumbPath);
              com.tencent.mm.plugin.messenger.a.g.bOk().a(str, (byte[])localObject3, ((mt)localObject1).cIF.cIH, null);
            }
            break;
          case 15:
            localObject3 = this.val$context;
            localObject4 = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.whE;
            localObject1 = new sx();
            ((sx)localObject1).cPa.opType = 0;
            ((sx)localObject1).cPa.cPc = ((abo)localObject4).info;
            ((sx)localObject1).cPa.context = ((Context)localObject3);
            a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.FavSendLogic", "sendFavTV ret = [%s], thumbUrl = [%s]", new Object[] { Boolean.valueOf(((sx)localObject1).cPb.cvi), ((abo)localObject4).thumbUrl });
            if (((sx)localObject1).cPb.cvi)
            {
              localObject4 = bo.readFromFile(com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(bo.bc(((abo)localObject4).thumbUrl, "").getBytes()));
              localObject3 = localObject4;
              if (localObject4 == null)
                localObject3 = bo.readFromFile(((sx)localObject1).cPb.thumbPath);
              com.tencent.mm.plugin.messenger.a.g.bOk().a(str, (byte[])localObject3, ((sx)localObject1).cPb.cIH, null);
            }
            break;
          case 11:
            localObject3 = this.val$context;
            localObject4 = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.whC;
            localObject1 = new mt();
            ((mt)localObject1).cIE.opType = 1;
            ((mt)localObject1).cIE.cIG = ((abe)localObject4).info;
            ((mt)localObject1).cIE.context = ((Context)localObject3);
            a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            if (((mt)localObject1).cIF.cvi)
            {
              localObject4 = bo.readFromFile(com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(bo.bc(((abe)localObject4).thumbUrl, "").getBytes()));
              localObject3 = localObject4;
              if (localObject4 == null)
                localObject3 = bo.readFromFile(((mt)localObject1).cIF.thumbPath);
              com.tencent.mm.plugin.messenger.a.g.bOk().a(str, (byte[])localObject3, ((mt)localObject1).cIF.cIH, null);
            }
            break;
          case 14:
          case 18:
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FavSendLogic", "want send record, fav id %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.fav.a.g)localObject1).field_id) });
            localObject3 = i.a.a(this.val$context, (com.tencent.mm.plugin.fav.a.g)localObject1);
            localObject4 = new abf();
            try
            {
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.FavSendLogic", "do clone fav proto item");
              ((abf)localObject4).parseFrom(((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.toByteArray());
              localObject5 = ((abf)localObject4).wiv;
              localObject1 = ((LinkedList)localObject5).iterator();
              for (i = 0; ((Iterator)localObject1).hasNext(); i++)
              {
                localObject7 = (aar)((Iterator)localObject1).next();
                if ((((aar)localObject7).wgT != null) && (((aar)localObject7).wgT.whN != null) && (((aar)localObject7).wgT.whN.type == 3))
                {
                  ((aar)localObject7).LE(1);
                  ((aar)localObject7).akI(this.val$context.getString(2131296992));
                  ((LinkedList)localObject5).set(i, localObject7);
                  ((abf)localObject4).aE((LinkedList)localObject5);
                }
              }
            }
            catch (Exception localException)
            {
              while (true)
              {
                com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.FavSendLogic", localException, "", new Object[0]);
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.FavSendLogic", "clone fav proto item error: %s", new Object[] { localException.getMessage() });
              }
              localObject2 = new nt();
              ((nt)localObject2).cJY.type = 2;
              ((nt)localObject2).cJY.toUser = str;
              ((nt)localObject2).cJY.cKb = ((abf)localObject4);
              ((nt)localObject2).cJY.title = ((i.a)localObject3).title;
              ((nt)localObject2).cJY.desc = ((i.a)localObject3).desc;
              ((nt)localObject2).cJY.thumbPath = ((i.a)localObject3).thumbPath;
              ((nt)localObject2).cJY.cKg = ((i.a)localObject3).mjO;
              a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
            }
            break;
          case 17:
            localObject4 = com.tencent.mm.plugin.fav.a.b.c((com.tencent.mm.plugin.fav.a.g)localObject2).desc;
            localObject3 = bi.a.apC((String)localObject4);
            localObject2 = com.tencent.mm.plugin.messenger.a.g.bOk();
            if (ad.aox(((bi.a)localObject3).svN));
            for (i = 66; ; i = 42)
            {
              ((d)localObject2).F(str, (String)localObject4, i);
              break;
            }
          }
        }
      }
      if (!bo.isNullOrNil(this.mjK))
        com.tencent.mm.plugin.messenger.a.g.bOk().F(str, this.mjK, t.nK(str));
    }
    al.d(this.cfC);
    AppMethodBeat.o(74117);
  }

  public final String toString()
  {
    AppMethodBeat.i(74118);
    String str = super.toString() + "|sendFavMsg";
    AppMethodBeat.o(74118);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.i.1
 * JD-Core Version:    0.6.2
 */