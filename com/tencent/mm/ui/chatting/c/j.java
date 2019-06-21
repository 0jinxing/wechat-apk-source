package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.d.a;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.protocal.protobuf.abt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.ae;
import com.tencent.mm.ui.chatting.ah;
import com.tencent.mm.ui.chatting.ah.a;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.q;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.i.class)
public class j extends a
  implements ah, com.tencent.mm.ui.chatting.c.b.i
{
  public static az yOM;
  private ad cFn;
  private com.tencent.mm.ui.tools.o elS;
  private boolean hasInit = false;
  private Animation qzp;
  private boolean yFW;
  private String yLB = "";
  private boolean yNq = false;
  private ChattingFooterMoreBtnBar yON;
  private boolean yOO = true;

  static
  {
    AppMethodBeat.i(31343);
    yOM = new az(5, "MicroMsg.ChattingMoreBtnBarHelper");
    AppMethodBeat.o(31343);
  }

  private void dDM()
  {
    AppMethodBeat.i(31338);
    if (this.yNq)
      this.cgL.showOptionMenu(false);
    while (true)
    {
      ((aj)this.cgL.aF(aj.class)).dFn();
      AppMethodBeat.o(31338);
      return;
      ((r)this.cgL.aF(r.class)).dEp();
    }
  }

  public final void a(ah.a parama)
  {
  }

  public final void b(ah.a parama)
  {
    AppMethodBeat.i(31341);
    dDL();
    AppMethodBeat.o(31341);
  }

  public final void bc(bi parambi)
  {
    AppMethodBeat.i(31335);
    if (this.hasInit)
    {
      ab.e("MicroMsg.ChattingMoreBtnBarHelper", "[init] hasInit!");
      this.cFn = this.cgL.sRl;
      if ((!this.cgL.dFw()) && (!((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn()))
        break label576;
    }
    label576: for (boolean bool = true; ; bool = false)
    {
      this.yFW = bool;
      this.yON.dCp();
      this.cgL.yTx.getController().addSearchMenu(true, this.elS);
      this.yON.startAnimation(this.qzp);
      this.yON.setVisibility(0);
      this.yNq = true;
      ((z)this.cgL.aF(z.class)).dEP();
      com.tencent.mm.ui.chatting.c.b.h localh = (com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
      localh.dCS();
      localh.dCR();
      localh.nf(parambi.field_msgId);
      int i = localh.cdf();
      this.yON.On(i);
      ((com.tencent.mm.ui.chatting.c.b.l)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.l.class)).dDV();
      this.cgL.aqX();
      dDM();
      ((com.tencent.mm.ui.chatting.c.b.o)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class)).dEg();
      com.tencent.mm.plugin.report.service.h.pYm.e(10811, new Object[] { Integer.valueOf(1) });
      if (this.cFn.dsf())
      {
        parambi = this.cgL;
        ab.i("MicroMsg.ChattingContext", "[showOptionMenu] menuID:%d", new Object[] { Integer.valueOf(2131820645) });
        parambi.yTy.removeOptionMenu(2131820645);
      }
      ((com.tencent.mm.ui.chatting.c.b.s)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.s.class)).dEz();
      AppMethodBeat.o(31335);
      return;
      this.hasInit = true;
      if (this.yON == null)
      {
        ((ViewStub)this.cgL.findViewById(2131822393)).inflate();
        this.yON = ((ChattingFooterMoreBtnBar)this.cgL.findViewById(2131822729));
      }
      if (((z)this.cgL.aF(z.class)).dEW())
      {
        ab.w("MicroMsg.ChattingMoreBtnBarHelper", "is in show search chat result");
        if (this.elS == null);
      }
      for (this.elS.zHa = null; ; this.elS.zHa = new j.8(this))
      {
        this.yON.c(3, new j.2(this));
        this.yON.c(2, new j.3(this));
        this.yON.c(1, new j.4(this));
        this.yON.c(0, new j.5(this));
        this.yON.c(4, new View.OnClickListener()
        {
          private void c(cl paramAnonymouscl)
          {
            AppMethodBeat.i(31323);
            paramAnonymouscl.cvA.fragment = j.this.cgL.yTx;
            paramAnonymouscl.cvA.cvH = 41;
            paramAnonymouscl.cvA.cvJ = new j.6.1(this);
            com.tencent.mm.sdk.b.a.xxA.m(paramAnonymouscl);
            int i;
            Object localObject1;
            long l;
            Object localObject2;
            if (paramAnonymouscl.cvB.ret == 0)
            {
              i = 1;
              localObject1 = j.c(j.this);
              l = bo.anT();
              Iterator localIterator = ((List)localObject1).iterator();
              while (localIterator.hasNext())
              {
                localObject1 = (bi)localIterator.next();
                if (((bi)localObject1).bAA())
                {
                  localObject2 = j.b.me(bo.anj(((cy)localObject1).field_content));
                  if ((localObject2 != null) && (((j.b)localObject2).type == 5) && (!bo.isNullOrNil(((j.b)localObject2).url)))
                    if (!((bi)localObject1).drC())
                      break label647;
                }
              }
            }
            label647: for (int j = 1; ; j = 2)
            {
              while (true)
              {
                ab.d("MicroMsg.ChattingMoreBtnBarHelper", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), ((j.b)localObject2).url, Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(2), Integer.valueOf(1) });
                localObject1 = "";
                try
                {
                  localObject2 = URLEncoder.encode(((j.b)localObject2).url, "UTF-8");
                  localObject1 = localObject2;
                  com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { localObject1, Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(2), Integer.valueOf(i) });
                  break;
                  i = 2;
                }
                catch (UnsupportedEncodingException localUnsupportedEncodingException)
                {
                  while (true)
                    ab.printErrStackTrace("MicroMsg.ChattingMoreBtnBarHelper", localUnsupportedEncodingException, "", new Object[0]);
                }
              }
              if (paramAnonymouscl.cvB.ret == 0)
                if (14 != paramAnonymouscl.cvA.type)
                {
                  ab.d("MicroMsg.ChattingMoreBtnBarHelper", "not record type, do not report");
                  AppMethodBeat.o(31323);
                }
              while (true)
              {
                return;
                if (paramAnonymouscl.cvA.cvD == null)
                {
                  ab.e("MicroMsg.ChattingMoreBtnBarHelper", "want to report record fav, but type count is null");
                  AppMethodBeat.o(31323);
                }
                else
                {
                  com.tencent.mm.plugin.report.service.h.pYm.e(11142, new Object[] { Integer.valueOf(paramAnonymouscl.cvA.cvD.wiK), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiL), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiM), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiN), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiO), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiP), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiQ), Integer.valueOf(paramAnonymouscl.cvA.cvD.fileCount), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiR), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiS), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiT), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiU), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiV), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiW), Integer.valueOf(paramAnonymouscl.cvA.cvD.wiX) });
                  AppMethodBeat.o(31323);
                }
              }
            }
          }

          private static String eX(List<bi> paramAnonymousList)
          {
            AppMethodBeat.i(31324);
            StringBuffer localStringBuffer = new StringBuffer();
            paramAnonymousList = paramAnonymousList.iterator();
            while (paramAnonymousList.hasNext())
              localStringBuffer.append(((bi)paramAnonymousList.next()).field_msgId);
            paramAnonymousList = localStringBuffer.toString();
            AppMethodBeat.o(31324);
            return paramAnonymousList;
          }

          private static void eY(List<bi> paramAnonymousList)
          {
            AppMethodBeat.i(31328);
            paramAnonymousList = paramAnonymousList.iterator();
            while (paramAnonymousList.hasNext())
            {
              bi localbi = (bi)paramAnonymousList.next();
              com.tencent.mm.ui.chatting.a.a(a.c.yFG, a.d.yFL, localbi, 0);
            }
            AppMethodBeat.o(31328);
          }

          private void g(HashSet<Long> paramAnonymousHashSet)
          {
            AppMethodBeat.i(31326);
            if (paramAnonymousHashSet.isEmpty())
              new ak(Looper.getMainLooper()).post(new j.6.5(this));
            AppMethodBeat.o(31326);
          }

          public final void dDP()
          {
            AppMethodBeat.i(31327);
            j.a(j.this, "");
            List localList = j.c(j.this);
            if (com.tencent.mm.ui.chatting.j.eS(localList))
            {
              com.tencent.mm.ui.base.h.a(j.this.cgL.yTx.getContext(), j.this.cgL.yTx.getContext().getString(2131299637), "", j.this.cgL.yTx.getContext().getString(2131296322), new j.6.6(this));
              AppMethodBeat.o(31327);
            }
            while (true)
            {
              return;
              cl localcl = new cl();
              ab.d("MicroMsg.ChattingMoreBtnBarHelper", "want fav msgs from %s", new Object[] { j.e(j.this).field_username });
              Object localObject1;
              Object localObject2;
              Object localObject3;
              if (localList.size() == 1)
              {
                localObject1 = (bi)localList.get(0);
                if ((localObject1 != null) && ((((bi)localObject1).bAA()) || (((bi)localObject1).drC())))
                {
                  localObject2 = v.nW(((cy)localObject1).field_msgSvrId);
                  localObject3 = v.Zp().y((String)localObject2, true);
                  ((v.b)localObject3).j("prePublishId", "msg_" + ((cy)localObject1).field_msgSvrId);
                  boolean bool = ((com.tencent.mm.ui.chatting.c.b.d)j.this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm();
                  ((v.b)localObject3).j("preUsername", com.tencent.mm.ui.chatting.viewitems.c.a((bi)localObject1, j.d(j.this), bool));
                  ((v.b)localObject3).j("preChatName", j.e(j.this).field_username);
                  ((v.b)localObject3).j("preMsgIndex", Integer.valueOf(0));
                  ((v.b)localObject3).j("sendAppMsgScene", Integer.valueOf(1));
                  ((com.tencent.mm.plugin.sns.b.i)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.sns.b.i.class)).a("adExtStr", (v.b)localObject3, (bi)localObject1);
                  localcl.cvA.cvF = ((String)localObject2);
                }
              }
              if (com.tencent.mm.pluginsdk.model.g.a(j.this.cgL.yTx.getContext(), localcl, j.e(j.this).field_username, localList, true))
              {
                localObject1 = localList.iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  localObject3 = (bi)((Iterator)localObject1).next();
                  if (((bi)localObject3).bAA())
                    com.tencent.mm.modelstat.b.fRa.b((bi)localObject3, com.tencent.mm.af.k.k((bi)localObject3));
                  else
                    com.tencent.mm.modelstat.b.fRa.D((bi)localObject3);
                }
                c(localcl);
                eY(j.c(j.this));
                AppMethodBeat.o(31327);
              }
              else
              {
                if (j.c(j.this).size() > 1)
                {
                  localObject2 = j.this.cgL.yTx.getContext();
                  if (localcl.cvA.cvG >= 0)
                  {
                    localObject1 = j.this.cgL.yTx.getContext().getString(2131299636);
                    label535: if (localcl.cvA.cvG < 0)
                      break label639;
                  }
                  label639: for (localObject3 = j.this.cgL.yTx.getContext().getString(2131298421); ; localObject3 = j.this.cgL.yTx.getContext().getString(2131301955))
                  {
                    com.tencent.mm.ui.base.h.d((Context)localObject2, (String)localObject1, "", (String)localObject3, j.this.cgL.yTx.getContext().getString(2131298419), new j.6.7(this, localList, localcl), null);
                    AppMethodBeat.o(31327);
                    break;
                    localObject1 = j.this.cgL.yTx.getContext().getString(2131299635);
                    break label535;
                  }
                }
                com.tencent.mm.ui.base.h.g(j.this.cgL.yTx.getContext(), localcl.cvA.cvG, 0);
                AppMethodBeat.o(31327);
              }
            }
          }

          public final void onClick(final View paramAnonymousView)
          {
            AppMethodBeat.i(31325);
            Object localObject1 = j.c(j.this);
            paramAnonymousView = new HashSet();
            Object localObject2 = eX((List)localObject1);
            if (((String)localObject2).equals(j.f(j.this)))
            {
              com.tencent.mm.ui.base.t.makeText(j.this.cgL.yTx.getContext(), j.this.cgL.yTx.getContext().getString(2131299578), 0).show();
              AppMethodBeat.o(31325);
            }
            while (true)
            {
              return;
              j.a(j.this, (String)localObject2);
              localObject1 = ((List)localObject1).iterator();
              label791: 
              while (((Iterator)localObject1).hasNext())
              {
                localObject2 = (bi)((Iterator)localObject1).next();
                Object localObject3;
                Object localObject4;
                if (((bi)localObject2).bAA())
                {
                  localObject3 = j.b.me(((cy)localObject2).field_content);
                  if ((localObject3 != null) && (((j.b)localObject3).type == 6) && (!bo.isNullOrNil(((j.b)localObject3).fgu)))
                  {
                    com.tencent.mm.pluginsdk.model.app.b localb = com.tencent.mm.pluginsdk.model.app.l.d((bi)localObject2, ((j.b)localObject3).csD);
                    if ((localb != null) && ((!com.tencent.mm.vfs.e.ct(localb.field_fileFullPath)) || (com.tencent.mm.vfs.e.asZ(localb.field_fileFullPath) != localb.field_totalLen)))
                    {
                      ab.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadTpFileAndFav startDownload msgID:%d", new Object[] { Long.valueOf(((cy)localObject2).field_msgId) });
                      paramAnonymousView.add(Long.valueOf(((cy)localObject2).field_msgId));
                      localObject4 = new com.tencent.mm.i.g();
                      ((com.tencent.mm.i.g)localObject4).egl = new j.6.4(this, localb, (bi)localObject2, paramAnonymousView);
                      ((com.tencent.mm.i.g)localObject4).field_mediaId = com.tencent.mm.al.c.a("checkExist", bo.anU(), ((cy)localObject2).field_talker, ((cy)localObject2).field_msgId);
                      ((com.tencent.mm.i.g)localObject4).field_aesKey = ((j.b)localObject3).eyr;
                      ((com.tencent.mm.i.g)localObject4).field_fileType = 19;
                      ((com.tencent.mm.i.g)localObject4).field_authKey = ((j.b)localObject3).fgA;
                      ((com.tencent.mm.i.g)localObject4).egm = ((j.b)localObject3).fgu;
                      if ((localb == null) || (bo.isNullOrNil(localb.field_fileFullPath)))
                        break label685;
                      ((com.tencent.mm.i.g)localObject4).field_fullpath = localb.field_fileFullPath;
                      label366: if (!com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject4, -1))
                      {
                        ab.e("MicroMsg.ChattingMoreBtnBarHelper", "openim attach download failed before rescend");
                        paramAnonymousView.remove(Long.valueOf(((cy)localObject2).field_msgId));
                      }
                    }
                  }
                }
                int i;
                if (((bi)localObject2).drE())
                {
                  localObject4 = com.tencent.mm.at.o.ahl().fI(((cy)localObject2).field_msgSvrId);
                  if (((cy)localObject2).field_isSend != 1)
                    break label719;
                  if (!((com.tencent.mm.at.e)localObject4).agQ())
                    break label713;
                  i = 1;
                  label436: if ((((com.tencent.mm.at.e)localObject4).offset < ((com.tencent.mm.at.e)localObject4).frO) || (((com.tencent.mm.at.e)localObject4).frO == 0))
                  {
                    ab.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadImgAndFav start  msgID:%d", new Object[] { Long.valueOf(((cy)localObject2).field_msgId) });
                    paramAnonymousView.add(Long.valueOf(((cy)localObject2).field_msgId));
                    if (!com.tencent.mm.at.o.ahm().a(((com.tencent.mm.at.e)localObject4).fDy, ((cy)localObject2).field_msgId, i, localObject2, 2130838182, new d.a()
                    {
                      public final void a(long paramAnonymous2Long1, long paramAnonymous2Long2, int paramAnonymous2Int1, int paramAnonymous2Int2, Object paramAnonymous2Object)
                      {
                        AppMethodBeat.i(31319);
                        ab.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadImgAndFav download image taskcancel: msgID:%d", new Object[] { Long.valueOf(this.fku.field_msgId) });
                        paramAnonymousView.remove(Long.valueOf(this.fku.field_msgId));
                        j.6.a(j.6.this, paramAnonymousView);
                        AppMethodBeat.o(31319);
                      }

                      public final void a(long paramAnonymous2Long1, long paramAnonymous2Long2, int paramAnonymous2Int1, int paramAnonymous2Int2, Object paramAnonymous2Object, int paramAnonymous2Int3, int paramAnonymous2Int4, m paramAnonymous2m)
                      {
                      }

                      public final void a(long paramAnonymous2Long1, long paramAnonymous2Long2, int paramAnonymous2Int1, int paramAnonymous2Int2, Object paramAnonymous2Object, int paramAnonymous2Int3, int paramAnonymous2Int4, String paramAnonymous2String, m paramAnonymous2m)
                      {
                        AppMethodBeat.i(31318);
                        if ((paramAnonymous2Int3 == 0) && (paramAnonymous2Int4 == 0));
                        for (boolean bool = true; ; bool = false)
                        {
                          ab.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadImgAndFav taskEnd image succed: %s, msgID:%d, errType: %s, errCode:%s", new Object[] { Boolean.valueOf(bool), Long.valueOf(this.fku.field_msgId), Integer.valueOf(paramAnonymous2Int3), Integer.valueOf(paramAnonymous2Int4) });
                          paramAnonymousView.remove(Long.valueOf(this.fku.field_msgId));
                          j.6.a(j.6.this, paramAnonymousView);
                          AppMethodBeat.o(31318);
                          return;
                        }
                      }
                    }))
                      paramAnonymousView.remove(Long.valueOf(((cy)localObject2).field_msgId));
                  }
                }
                if ((((bi)localObject2).bws()) || (((bi)localObject2).bwt()))
                {
                  localObject3 = u.ut(((cy)localObject2).field_imgPath);
                  if ((localObject3 != null) && (((com.tencent.mm.modelvideo.s)localObject3).status != 199))
                  {
                    paramAnonymousView.add(Long.valueOf(((cy)localObject2).field_msgId));
                    localObject4 = new j.6.2(this, (bi)localObject2, paramAnonymousView);
                    com.tencent.mm.modelvideo.o.all().a((t.a)localObject4, Looper.getMainLooper());
                    ab.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadVideoAndFav start  msgID:%d, fileName:%s", new Object[] { Long.valueOf(((cy)localObject2).field_msgId), ((cy)localObject2).field_imgPath });
                    if (((com.tencent.mm.modelvideo.s)localObject3).aly())
                      ab.i("MicroMsg.ChattingMoreBtnBarHelper", "start complete online video");
                    for (i = u.uA(((cy)localObject2).field_imgPath); ; i = u.up(((cy)localObject2).field_imgPath))
                    {
                      if (i == 0)
                        break label791;
                      paramAnonymousView.remove(Long.valueOf(((cy)localObject2).field_msgId));
                      break;
                      label685: aw.ZK();
                      ((com.tencent.mm.i.g)localObject4).field_fullpath = com.tencent.mm.pluginsdk.model.app.l.X(com.tencent.mm.model.c.Ye(), ((j.b)localObject3).title, ((j.b)localObject3).fgp);
                      break label366;
                      label713: i = 0;
                      break label436;
                      label719: if (!((com.tencent.mm.at.e)localObject4).agQ())
                      {
                        i = 0;
                        break label436;
                      }
                      localObject3 = com.tencent.mm.at.f.a((com.tencent.mm.at.e)localObject4);
                      if (!com.tencent.mm.vfs.e.ct(com.tencent.mm.at.o.ahl().q(((com.tencent.mm.at.e)localObject3).fDz, "", "")))
                      {
                        i = 0;
                        break label436;
                      }
                      i = 1;
                      break label436;
                      ab.i("MicroMsg.ChattingMoreBtnBarHelper", "start complete offline video");
                    }
                  }
                }
              }
              g(paramAnonymousView);
              AppMethodBeat.o(31325);
            }
          }
        });
        this.qzp = AnimationUtils.loadAnimation(this.cgL.yTx.getContext(), 2131034229);
        ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).c(new j.1(this));
        break;
        this.elS = new com.tencent.mm.ui.tools.o((byte)0);
      }
    }
  }

  public final void bd(bi parambi)
  {
    AppMethodBeat.i(31336);
    if (parambi == null)
    {
      ab.w("MicroMsg.ChattingMoreBtnBarHelper", "perform search mode click msg item fail, msg is null");
      AppMethodBeat.o(31336);
    }
    while (true)
    {
      return;
      com.tencent.mm.ui.chatting.c.b.h localh = (com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
      if (localh.nf(parambi.field_msgId))
      {
        int i = localh.cdf();
        this.yON.On(i);
        this.yON.setVisibility(0);
        this.elS.dJS();
      }
      AppMethodBeat.o(31336);
    }
  }

  public final void dCI()
  {
    AppMethodBeat.i(31340);
    dDL();
    AppMethodBeat.o(31340);
  }

  public final boolean dCJ()
  {
    return this.yOO;
  }

  public final void dDL()
  {
    AppMethodBeat.i(31337);
    this.cgL.yTx.getController().addSearchMenu(false, this.elS);
    this.yON.setVisibility(8);
    ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).bvQ();
    ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDA();
    ((z)this.cgL.aF(z.class)).dEP();
    this.yNq = false;
    dDM();
    ((com.tencent.mm.ui.chatting.c.b.l)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.l.class)).cuB();
    ((com.tencent.mm.ui.chatting.c.b.o)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class)).dEg();
    this.cgL.aqX();
    com.tencent.mm.ui.chatting.k.dCa();
    AppMethodBeat.o(31337);
  }

  public final boolean dDN()
  {
    return this.yNq;
  }

  public final void dDO()
  {
    AppMethodBeat.i(31339);
    if (this.elS != null)
    {
      this.elS.dJS();
      this.elS.zHa = null;
    }
    AppMethodBeat.o(31339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j
 * JD-Core Version:    0.6.2
 */