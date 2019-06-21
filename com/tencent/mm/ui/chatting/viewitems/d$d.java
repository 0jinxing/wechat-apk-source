package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.a;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.j.b.a;
import com.tencent.mm.af.n;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.lz;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.u;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.modelappbrand.i.a;
import com.tencent.mm.modelstat.a.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.b;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.am;
import com.tencent.mm.ui.chatting.s.i;
import com.tencent.mm.ui.chatting.s.j;
import com.tencent.mm.ui.chatting.s.l;
import com.tencent.mm.ui.e.m;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.io.Serializable;
import java.util.List;

public final class d$d extends c
{
  private boolean mgQ;
  private com.tencent.mm.ui.chatting.d.a yJI;
  protected s.i zcO;
  protected s.l zcP;
  protected s.j zcQ;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32834);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969047);
      ((View)localObject).setTag(new d.c().y((View)localObject, true));
    }
    AppMethodBeat.o(32834);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32835);
    d.c localc = (d.c)parama;
    this.yJI = parama1;
    localc.reset();
    Object localObject1 = parambi.field_content;
    Object localObject2 = (com.tencent.mm.ui.chatting.c.b.j)parama1.aF(com.tencent.mm.ui.chatting.c.b.j.class);
    ((com.tencent.mm.ui.chatting.c.b.j)localObject2).be(parambi);
    ((com.tencent.mm.ui.chatting.c.b.j)localObject2).bf(parambi);
    ((com.tencent.mm.ui.chatting.c.b.j)localObject2).bg(parambi);
    int i;
    if (this.mgQ)
    {
      i = parambi.field_content.indexOf(':');
      if (i != -1)
        localObject1 = parambi.field_content.substring(i + 1);
    }
    while (true)
    {
      j.b localb;
      Object localObject3;
      int j;
      label466: label492: com.tencent.mm.pluginsdk.model.app.f localf;
      label554: boolean bool;
      if (localObject1 != null)
      {
        localb = j.b.X((String)localObject1, parambi.field_reserved);
        localObject3 = n.mj((String)localObject1);
        paramString = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
        i = 0;
        j = 0;
        localObject2 = paramString;
        if (localb != null)
        {
          localc.gnB.setText(localb.getTitle());
          localc.gnC.setText(localb.getDescription());
          localc.zbN.setMaxLines(1);
          localc.gnB.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690316));
          localc.gnC.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690164));
          localc.zcd.setBackgroundResource(2130838171);
          localc.zcd.setPadding(0, parama1.yTx.getContext().getResources().getDimensionPixelSize(2131427796), 0, 0);
          localc.zbI.setVisibility(0);
          localc.zcb.setVisibility(0);
          localc.gnC.setVisibility(0);
          localc.zbP.setVisibility(8);
          localc.zbS.setVisibility(8);
          localc.zbR.setVisibility(8);
          localc.zcf.setVisibility(8);
          localc.zcg.setVisibility(8);
          localc.zbK.setVisibility(8);
          localc.zbL.setVisibility(8);
          localc.zcq.setVisibility(8);
          localc.zcj.setVisibility(8);
          localc.zcd.setVisibility(0);
          localc.zcv.setVisibility(8);
          localc.zcC.setVisibility(8);
          d.c.an(localc.zcc, localc.zcJ);
          localObject2 = (com.tencent.mm.af.g)localb.X(com.tencent.mm.af.g.class);
          ChattingItemFooter localChattingItemFooter = localc.zbV;
          if (localObject2 != null)
            break label1591;
          localObject2 = null;
          if (!localChattingItemFooter.l((List)localObject2, parambi.field_talker))
            break label1601;
          localc.zcc.setBackgroundResource(2130838230);
          localf = com.tencent.mm.pluginsdk.model.app.g.dX(localb.appId, localb.axy);
          if (localf != null)
            b(parama1, localb, parambi);
          if ((localf != null) && (localf.field_appName != null) && (localf.field_appName.trim().length() > 0))
            break label1615;
          localObject2 = localb.appName;
          bool = true;
          com.tencent.mm.bz.a.fromDPToPix(parama1.yTx.getContext(), 12);
          if ((localb.type == 20) || ("wxaf060266bfa9a35c".equals(localb.appId)))
            bool = p.a.dgQ().cjQ();
          if ((!bool) || (localb.appId == null) || (localb.appId.length() <= 0) || (!com.tencent.mm.pluginsdk.model.app.g.dg((String)localObject2)))
            break label1642;
          localc.moL.setText(com.tencent.mm.pluginsdk.model.app.g.b(parama1.yTx.getContext(), localf, (String)localObject2));
          localc.moL.setVisibility(0);
          localc.moL.setCompoundDrawables(null, null, null, null);
          localc.zbM.setVisibility(0);
          localc.zbJ.setVisibility(0);
          if ((localf == null) || (!localf.xy()))
            break label1625;
          a(parama1, localc.moL, parambi, localb, localf.field_packageName, parambi.field_msgSvrId);
          label733: localc.zbJ.setImageResource(2130838294);
          a(parama1, localc.zbJ, localb.appId);
          label758: if ((localb.fgl == null) || (localb.fgl.fjm == 0))
            break label1811;
          i = 1;
          label780: if (i != 0)
            localc.zbM.setVisibility(8);
          bool = false;
          localc.zbI.setVisibility(0);
          if ((localb.fgl == null) || (localb.fgl.fjj != 1))
            break label1817;
          i = 1;
          label830: if ((i != 0) || (!this.kuU))
            break label1829;
          localChattingItemFooter = null;
          localObject2 = localChattingItemFooter;
          if (localb.type != 33)
          {
            localObject2 = localChattingItemFooter;
            if (localb.type != 36)
            {
              localObject2 = localChattingItemFooter;
              if (localb.type != 44)
              {
                localObject2 = localChattingItemFooter;
                if (!d.b.arC(parambi.field_imgPath))
                  localObject2 = com.tencent.mm.at.o.ahl().a(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
              }
            }
          }
          if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled()))
            break label1823;
          localc.zbI.setImageBitmap((Bitmap)localObject2);
          label949: if (localb.type == 3)
            localc.zcd.getViewTreeObserver().addOnPreDrawListener(new d.d.1(this, localc, parama1, (Bitmap)localObject2));
          label982: if ((localb.dJv != null) && (localb.dJv.length() != 0))
            break label1856;
          localc.zbU.setVisibility(8);
          label1011: localc.zbT.setOnClickListener(null);
          localc.zbX.setVisibility(0);
          localc.zbO.setVisibility(8);
          localc.zca.setVisibility(0);
          localc.zbY.setVisibility(8);
        }
      }
      label1319: label1476: label1615: label1625: label2397: label5479: switch (localb.type)
      {
      case 1:
      case 2:
      case 8:
      case 9:
      case 11:
      case 12:
      case 14:
      case 17:
      case 18:
      case 21:
      case 22:
      case 23:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 35:
      case 37:
      case 38:
      case 39:
      case 41:
      case 42:
      case 43:
      default:
        paramInt = 1;
        parama = paramString;
        i = j;
      case 3:
      case 6:
      case 4:
      case 5:
      case 36:
      case 33:
      case 44:
      case 7:
      case 10:
      case 13:
      case 20:
      case 0:
        while (true)
        {
          if (paramInt != 0)
          {
            if ((localb.title == null) || (localb.title.length() <= 0))
              break label6837;
            localc.zbN.setVisibility(0);
            localc.zbN.setMaxLines(2);
            localc.zbN.setText(localb.title);
            localc.gnB.setVisibility(8);
            if (bool)
            {
              if ((localb.type != 33) && (localb.type != 36) && (localb.type != 44))
                break label6850;
              paramString = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, true);
              localc.zbI.setImageResource(2131230820);
              com.tencent.mm.modelappbrand.a.b.abR().a(localc.zbI, "file://".concat(String.valueOf(paramString)), null, null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(50, 50));
            }
          }
          if (parama1.dFx())
            break label6971;
          if (!com.tencent.mm.pluginsdk.model.app.g.h(localf))
            break label6955;
          localc.zbW.setVisibility(0);
          c(parama1, localc.zbW, ay.a(localb, parambi));
          localObject2 = parama;
          if (i == 0)
          {
            localc.zcc.setTag(localObject2);
            localc.zcc.setOnClickListener(d(parama1));
          }
          if (this.kuU)
          {
            localc.zcc.setOnLongClickListener(c(parama1));
            localc.zcc.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
          }
          AppMethodBeat.o(32835);
          return;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingItemAppMsgFrom", "amessage, msgid:%s, user:%s", new Object[] { Long.valueOf(parambi.field_msgId), paramString });
          localObject3 = null;
          localb = null;
          break;
          localObject2 = ((com.tencent.mm.af.g)localObject2).fgf;
          break label466;
          localc.zcc.setBackgroundResource(2130838218);
          break label492;
          localObject2 = localf.field_appName;
          break label554;
          a(parama1, localc.moL, localb.appId);
          break label733;
          if (localb.type == 24)
          {
            localc.moL.setText(ah.getContext().getString(2131299589));
            localc.zbM.setVisibility(0);
            localc.moL.setVisibility(0);
            localc.zbJ.setVisibility(8);
            break label758;
          }
          if ((localb.type == 19) || (((n)localObject3).fju == 19))
          {
            localc.moL.setText(ah.getContext().getString(2131298141));
            localc.zbM.setVisibility(0);
            localc.moL.setVisibility(0);
            localc.zbJ.setVisibility(8);
            break label758;
          }
          if (d.a(localb, localc))
            break label758;
          localc.zbM.setVisibility(8);
          localc.moL.setVisibility(8);
          localc.zbJ.setVisibility(8);
          break label758;
          i = 0;
          break label780;
          i = 0;
          break label830;
          bool = true;
          break label949;
          localc.zbI.setImageBitmap(BitmapFactory.decodeResource(parama1.yTx.getMMResources(), 2130839706));
          bool = false;
          break label982;
          localc.zbU.setVisibility(0);
          b(parama1, localc.zbU, ay.arL(localb.dJv));
          break label1011;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            localc.gnB.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690691));
            localc.gnC.setVisibility(0);
            localc.gnC.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690691));
            localc.zbN.setVisibility(8);
            localc.zbO.setVisibility(4);
            localc.zbT.setVisibility(0);
            if (!parambi.field_msgId.equals(parama.zbz))
              break label2186;
            localc.zbT.setImageResource(2130839637);
            localc.gnC.setMaxLines(2);
            if (bool)
            {
              parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()));
              if ((parama != null) && (!parama.isRecycled()))
                break label2200;
              localc.zbI.setImageResource(2131230800);
            }
          }
          while (true)
          {
            parama = new d.f();
            parama.cvx = parambi.field_msgId;
            parama.cHz = parambi.field_content;
            parama.imgPath = parambi.field_imgPath;
            localc.zbT.setTag(parama);
            localc.zbT.setOnClickListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dDa());
            paramInt = 0;
            parama = paramString;
            i = j;
            break;
            localc.gnB.setVisibility(8);
            break label1938;
            localc.zbT.setImageResource(2130839639);
            break label2038;
            localc.zbI.setImageBitmap(parama);
          }
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            localc.gnB.setMaxLines(2);
          }
          while (true)
          {
            localc.gnC.setVisibility(0);
            localc.zbN.setVisibility(8);
            localc.zbT.setVisibility(8);
            localc.zbO.setVisibility(4);
            localc.gnC.setMaxLines(2);
            localc.gnC.setText(bo.ga(localb.fgo));
            d.c.a(localc, (String)localObject1, localb.fgo);
            d.c.a(localc, Boolean.TRUE, parambi, localb.csD, localb.title);
            if (!bool)
              break label6987;
            if (!bo.any(localb.fgp))
              break label2397;
            localc.zbI.setImageResource(2130837803);
            paramInt = 0;
            parama = paramString;
            i = j;
            break;
            localc.gnB.setVisibility(8);
          }
          localc.zbI.setImageResource(com.tencent.mm.pluginsdk.model.o.aiD(localb.fgp));
          paramInt = 0;
          parama = paramString;
          i = j;
          continue;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            localc.gnC.setVisibility(0);
            localc.zbN.setVisibility(8);
            localc.zbT.setVisibility(0);
            localc.zbT.setImageResource(2130840523);
            localc.zbO.setVisibility(4);
            localc.gnC.setMaxLines(2);
            if (!bool)
              break label6987;
            parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()));
            if ((parama != null) && (!parama.isRecycled()))
              break label2592;
            localc.zbI.setImageResource(2131230817);
          }
          while (true)
          {
            localc.zbT.setVisibility(8);
            paramInt = 0;
            parama = paramString;
            i = j;
            break;
            localc.gnB.setVisibility(8);
            break label2453;
            localc.zbI.setImageBitmap(parama);
          }
          parama = (com.tencent.mm.af.e)localb.X(com.tencent.mm.af.e.class);
          if ((parama != null) && (parama.fgb == 1) && (parama.ffZ == 5) && (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVP()))
          {
            d.c.a(parama1, localc, localb, parambi, bool);
            paramInt = 0;
            parama = paramString;
            i = j;
          }
          else
          {
            localc.gnB.setVisibility(8);
            if ((localb.title != null) && (localb.title.length() > 0))
            {
              localc.zbN.setMaxLines(2);
              localc.zbN.setVisibility(0);
              localc.zbN.setText(localb.getTitle());
              localc.gnC.setMaxLines(3);
              if (!d.h(localb))
                break label2938;
              localc.zbT.setVisibility(0);
              localc.zbT.setImageResource(2130840523);
              localc.zbO.setVisibility(4);
              if (!bool)
                break label6987;
              parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()));
              if ((parama != null) && (!parama.isRecycled()))
                break label2960;
              localObject1 = new com.tencent.mm.at.a.a.c.a();
              ((com.tencent.mm.at.a.a.c.a)localObject1).ePT = 2131230820;
              ((com.tencent.mm.at.a.a.c.a)localObject1).ePG = true;
              ((com.tencent.mm.at.a.a.c.a)localObject1).ePK = com.tencent.mm.plugin.i.c.bGF();
              ((com.tencent.mm.at.a.a.c.a)localObject1).ct(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 50), com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 50)).ePF = true;
              localObject2 = com.tencent.mm.at.o.ahp();
              if (!bo.isNullOrNil(localb.thumburl))
                break label2951;
            }
            for (parama = localb.fgv; ; parama = localb.thumburl)
            {
              ((com.tencent.mm.at.a.a)localObject2).a(parama, localc.zbI, ((com.tencent.mm.at.a.a.c.a)localObject1).ahG());
              paramInt = 0;
              parama = paramString;
              i = j;
              break;
              localc.zbN.setVisibility(8);
              break label2737;
              localc.zbT.setVisibility(8);
              break label2774;
            }
            localc.zbI.setImageBitmap(parama);
            paramInt = 0;
            parama = paramString;
            i = j;
            continue;
            localObject2 = ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zb(localb.fiP);
            if (localObject2 != null)
            {
              parama = ((WxaAttributes)localObject2).field_nickname;
              if (localObject2 == null)
                break label3223;
            }
            for (localObject2 = ((WxaAttributes)localObject2).field_smallHeadURL; ; localObject2 = localb.fjb)
            {
              localc.zcd.setVisibility(8);
              localc.zcq.setVisibility(0);
              localc.zcj.setVisibility(8);
              localc.zcm.setVisibility(8);
              localc.zcv.setVisibility(8);
              localc.zct.setText(localb.title);
              localc.zcm.setText(localb.description);
              localc.zco.setText(parama);
              d.a(localc.zcp, localb);
              com.tencent.mm.at.o.ahp().a((String)localObject2, localc.zcn, r.d.zel);
              parama = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, true);
              localc.zcr.setImageBitmap(null);
              com.tencent.mm.modelappbrand.a.b.abR().a(localc.zcr, "file://".concat(String.valueOf(parama)), null, null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(240, 192));
              paramInt = 0;
              parama = paramString;
              i = j;
              break;
              parama = localb.cMh;
              break label3013;
            }
            localObject2 = ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zb(localb.fiP);
            switch (localb.fiR)
            {
            default:
              paramInt = 1;
              parama = paramString;
              i = j;
              break;
            case 2:
            case 3:
              if (localObject2 != null)
              {
                parama = ((WxaAttributes)localObject2).field_nickname;
                if (localObject2 == null)
                  break label3543;
              }
              for (localObject2 = ((WxaAttributes)localObject2).field_smallHeadURL; ; localObject2 = localb.fjb)
              {
                localc.zcd.setVisibility(8);
                localc.zcq.setVisibility(0);
                localc.zcj.setVisibility(8);
                localc.zcm.setVisibility(8);
                localc.zcv.setVisibility(8);
                localc.zct.setText(localb.title);
                localc.zcm.setText(localb.description);
                localc.zco.setText(parama);
                d.a(localc.zcp, localb);
                com.tencent.mm.at.o.ahp().a((String)localObject2, localc.zcn, r.d.zel);
                parama = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, true);
                localc.zcr.setImageBitmap(null);
                localc.zcr.setVisibility(4);
                localc.zcs.setVisibility(0);
                com.tencent.mm.modelappbrand.a.b.abR().a(new d.d.2(this, localc), "file://".concat(String.valueOf(parama)), null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(240, 192));
                paramInt = 0;
                parama = paramString;
                i = j;
                break;
                parama = localb.cMh;
                break label3311;
              }
            case 1:
              if (localObject2 != null)
              {
                parama = ((WxaAttributes)localObject2).field_nickname;
                if (localObject2 == null)
                  break label3695;
              }
              for (localObject2 = ((WxaAttributes)localObject2).field_smallHeadURL; ; localObject2 = null)
              {
                localc.zcd.setVisibility(8);
                localc.zcq.setVisibility(8);
                localc.zcj.setVisibility(0);
                localc.zcl.setText(parama);
                localc.zcv.setVisibility(8);
                if (!bo.isNullOrNil((String)localObject2))
                  break label3701;
                parama = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, true);
                com.tencent.mm.modelappbrand.a.b.abR().a(localc.zck, "file://".concat(String.valueOf(parama)), com.tencent.mm.modelappbrand.a.a.abQ(), com.tencent.mm.modelappbrand.a.f.fqH);
                paramInt = 0;
                parama = paramString;
                i = j;
                break;
                parama = localb.title;
                break label3564;
              }
              com.tencent.mm.modelappbrand.a.b.abR().a(localc.zck, (String)localObject2, com.tencent.mm.modelappbrand.a.a.abQ(), com.tencent.mm.modelappbrand.a.f.fqH);
              paramInt = 0;
              parama = paramString;
              i = j;
              break;
            case 0:
              localc.zbM.setVisibility(0);
              localc.zbJ.setVisibility(0);
              localc.zbJ.setBackground(null);
              localc.zbJ.setImageResource(2131230904);
              d.a(localc.moL, localb);
              break label1256;
              if (localb.cw(false))
              {
                parama = localb.p(parama1.yTx.getContext(), false);
                if (!bo.isNullOrNil(parama))
                {
                  localc.zcB.setText(parama);
                  localc.zcd.setVisibility(8);
                  localc.zcq.setVisibility(8);
                  localc.zcj.setVisibility(8);
                  localc.zcv.setVisibility(0);
                  localc.zcw.setText(localb.title);
                  localc.zcx.setText(localb.description);
                  if (j.a.fgh.ordinal() != localb.fiW)
                    break label4010;
                  localc.zcA.setImageResource(2131231694);
                }
                while (true)
                {
                  parama = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, true);
                  localc.zcz.setImageBitmap(null);
                  com.tencent.mm.modelappbrand.a.b.abR().a(new d.d.4(this, localc), "file://".concat(String.valueOf(parama)), null, ((i)com.tencent.mm.kernel.g.K(i.class)).a(240, 120, i.a.fpG));
                  paramInt = 0;
                  parama = paramString;
                  i = j;
                  break;
                  paramInt = 1;
                  parama = paramString;
                  i = j;
                  break;
                  if (j.a.fgi.ordinal() == localb.fiW)
                    com.tencent.mm.at.o.aho().a(localb.fjb, new d.d.3(this, localc));
                }
              }
              paramInt = 1;
              parama = paramString;
              i = j;
              continue;
              localc.gnB.setVisibility(8);
              if ((localb.title != null) && (localb.title.trim().length() > 0))
              {
                localc.zbN.setMaxLines(2);
                localc.zbN.setVisibility(0);
                localc.zbN.setText(localb.getTitle());
              }
              while (true)
              {
                localc.gnC.setMaxLines(3);
                localc.zbT.setVisibility(8);
                localc.zbO.setVisibility(4);
                if (!bool)
                  break label6987;
                parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()));
                if ((parama != null) && (!parama.isRecycled()))
                  break label4223;
                localc.zbI.setImageResource(2131230820);
                paramInt = 0;
                parama = paramString;
                i = j;
                break;
                localc.zbN.setVisibility(8);
              }
              localc.zbI.setImageBitmap(parama);
              paramInt = 0;
              parama = paramString;
              i = j;
              continue;
              localc.zbN.setVisibility(0);
              if (localb.fgP == 1)
                localc.zbN.setText(2131302761);
              while (true)
              {
                if ((localb.title != null) && (localb.title.length() > 0))
                {
                  localc.gnB.setVisibility(0);
                  localc.gnB.setText(localb.getTitle());
                }
                localc.gnC.setMaxLines(4);
                localc.zbO.setVisibility(4);
                localc.zbT.setVisibility(8);
                if (!bool)
                  break label6987;
                parama = com.tencent.mm.at.o.ahl().b(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
                if ((parama == null) || (parama.isRecycled()))
                  break label4462;
                localc.zbI.setImageBitmap(parama);
                paramInt = 0;
                parama = paramString;
                i = j;
                break;
                if (localb.fgP == 2)
                  localc.zbN.setText(2131302763);
                else if (localb.fgP == 3)
                  localc.zbN.setText(2131302762);
                else
                  localc.zbN.setText(2131302764);
              }
              localc.zbI.setImageResource(2131230820);
              paramInt = 0;
              parama = paramString;
              i = j;
              continue;
              localc.gnB.setVisibility(0);
              localc.gnB.setText(localb.getTitle());
              localc.zbN.setVisibility(0);
              localc.zbN.setText(2131298178);
              localc.gnC.setMaxLines(4);
              localc.zbO.setVisibility(4);
              localc.zbT.setVisibility(8);
              if (!bool)
                break label6987;
              parama = com.tencent.mm.at.o.ahl().b(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
              if ((parama != null) && (!parama.isRecycled()))
              {
                localc.zbI.setImageBitmap(parama);
                paramInt = 0;
                parama = paramString;
                i = j;
              }
              else
              {
                localc.zbI.setImageResource(2131230820);
                paramInt = 0;
                parama = paramString;
                i = j;
                continue;
                if ((localb.title != null) && (localb.title.length() > 0))
                {
                  localc.gnB.setVisibility(0);
                  localc.gnB.setText(localb.getTitle());
                  localc.zbN.setVisibility(8);
                }
                localc.gnC.setMaxLines(4);
                localc.zbO.setVisibility(4);
                localc.zbT.setVisibility(8);
                if (!bool)
                  break label6987;
                parama = com.tencent.mm.at.o.ahl().b(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
                if ((parama != null) && (!parama.isRecycled()))
                {
                  localc.zbI.setImageBitmap(parama);
                  paramInt = 0;
                  parama = paramString;
                  i = j;
                }
                else
                {
                  localc.zbI.setImageResource(2131230820);
                  paramInt = 0;
                  parama = paramString;
                  i = j;
                  continue;
                  if ((localb.title != null) && (localb.title.length() > 0))
                    localc.gnB.setVisibility(0);
                  while (true)
                  {
                    localc.gnC.setVisibility(0);
                    localc.zbN.setVisibility(8);
                    localc.zbT.setVisibility(8);
                    localc.zbO.setVisibility(4);
                    localc.gnC.setMaxLines(2);
                    if (!bool)
                      break label6987;
                    parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()));
                    if ((parama != null) && (!parama.isRecycled()))
                      break label4947;
                    localc.zbI.setImageResource(2131230820);
                    paramInt = 0;
                    parama = paramString;
                    i = j;
                    break;
                    localc.gnB.setVisibility(8);
                  }
                  localc.zbI.setImageBitmap(parama);
                  paramInt = 0;
                  parama = paramString;
                  i = j;
                }
              }
              break;
            }
          }
        }
      case 15:
        if ((localb.title != null) && (localb.title.length() > 0))
        {
          localc.gnB.setVisibility(0);
          localc.gnC.setVisibility(0);
          localc.zbN.setVisibility(8);
          localc.zbT.setVisibility(8);
          localc.zbO.setVisibility(4);
          localc.gnC.setMaxLines(2);
          if (bool)
          {
            parama = com.tencent.mm.at.o.ahl().b(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
            if ((parama != null) && (!parama.isRecycled()))
              break label5184;
            localc.zbI.setImageResource(2131230820);
          }
        }
        while (true)
        {
          parama = new ay(parambi, false, paramInt, "", false, localb.title, localb.cMg, localb.cMh, localb.title, localb.fgX, localb.url, false, false);
          localc.zcc.setTag(parama);
          localc.zcc.setOnClickListener(i(parama1));
          i = 1;
          paramInt = 0;
          break;
          localc.gnB.setVisibility(8);
          break label4996;
          localc.zbI.setImageBitmap(parama);
        }
      case 25:
        label3564: label3695: if ((localb.title != null) && (localb.title.length() > 0))
        {
          localc.gnB.setVisibility(0);
          localc.gnC.setVisibility(0);
          localc.zbN.setVisibility(8);
          localc.zbT.setVisibility(8);
          localc.zbO.setVisibility(4);
          localc.gnC.setMaxLines(2);
          if (bool)
          {
            parama = com.tencent.mm.at.o.ahl().b(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
            if ((parama != null) && (!parama.isRecycled()))
              break label5439;
            localc.zbI.setImageResource(2131230820);
          }
        }
        while (true)
        {
          label4462: parama = new ay(parambi, paramInt, "", parama1.dDw(), localb.cMg, localb.cMh, localb.title, localb.fiD, localb.designerName, localb.designerRediretctUrl, localb.url);
          label5224: localc.zcc.setTag(parama);
          paramString = localc.zcc;
          if (this.zcO == null)
            this.zcO = new s.i(parama1);
          paramString.setOnClickListener(this.zcO);
          i = 1;
          paramInt = 0;
          break;
          localc.gnB.setVisibility(8);
          break label5224;
          localc.zbI.setImageBitmap(parama);
        }
      case 26:
      case 27:
        label1256: label1642: label2038: label2938: label4223: if ((localb.title != null) && (localb.title.length() > 0))
        {
          localc.gnB.setVisibility(0);
          localc.gnC.setVisibility(0);
          localc.zbN.setVisibility(8);
          localc.zbT.setVisibility(8);
          localc.zbO.setVisibility(4);
          localc.gnC.setMaxLines(2);
          if (bool)
          {
            parama = com.tencent.mm.at.o.ahl().b(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
            if ((parama != null) && (!parama.isRecycled()))
              break label5775;
            localc.zbI.setImageResource(2131230820);
          }
          parama = new ay();
          parama.cKd = parambi;
          parama.yFW = false;
          parama.position = paramInt;
          parama.zis = false;
          parama.title = parama1.dDw();
          parama.cMg = localb.cMg;
          parama.cMh = localb.cMh;
          parama.zit = localb.title;
          if (localb.type != 26)
            break label5787;
          parama.tid = localb.tid;
          parama.fiE = localb.fiE;
          parama.desc = localb.desc;
          parama.iconUrl = localb.iconUrl;
          parama.secondUrl = localb.secondUrl;
          parama.pageType = localb.pageType;
          paramString = localc.zcc;
          if (this.zcP == null)
            this.zcP = new s.l(parama1);
          paramString.setOnClickListener(this.zcP);
          paramInt = 1;
        }
        label3311: label3701: break;
      case 16:
      case 24:
      case 19:
      case 34:
      case 40:
      }
      while (true)
      {
        label1433: label1591: label1601: label2774: label3543: localc.zcc.setTag(parama);
        label1811: label1817: label1823: label1829: label1856: label3013: label4947: j = 0;
        label1938: label2200: label2592: label2737: label5184: label5576: i = paramInt;
        label2186: label2453: label3223: label4010: label5439: paramInt = j;
        label2951: label2960: break;
        label4996: localc.gnB.setVisibility(8);
        break label5479;
        label5775: localc.zbI.setImageBitmap(parama);
        break label5576;
        label5787: if (localb.type == 27)
        {
          parama.tid = localb.tid;
          parama.fiE = localb.fiE;
          parama.desc = localb.desc;
          parama.iconUrl = localb.iconUrl;
          parama.secondUrl = localb.secondUrl;
          parama.pageType = localb.pageType;
          paramString = localc.zcc;
          if (this.zcQ == null)
            this.zcQ = new s.j(parama1);
          paramString.setOnClickListener(this.zcQ);
          paramInt = 1;
          continue;
          localc.gnB.setVisibility(0);
          localc.gnB.setText(localb.description);
          localc.gnC.setText(localb.fhC);
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.zbN.setVisibility(0);
            localc.zbN.setText(localb.title);
          }
          while (true)
          {
            localc.gnC.setMaxLines(4);
            localc.zbO.setVisibility(4);
            localc.zbT.setVisibility(8);
            if (!bool)
              break label6987;
            parama = com.tencent.mm.at.o.ahl().b(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
            if (parama == null)
              break label6061;
            localc.zbI.setImageBitmap(parama);
            paramInt = 0;
            parama = paramString;
            i = j;
            break;
            localc.zbN.setVisibility(8);
          }
          label6061: localc.zbI.setImageResource(2131230820);
          paramInt = 0;
          parama = paramString;
          i = j;
          break;
          localc.gnB.setVisibility(8);
          localc.zbN.setVisibility(0);
          if ((localb.title != null) && (localb.title.trim().length() > 0))
            localc.zbN.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localc.zbN.getContext(), localb.title, localc.zbN.getTextSize()));
          while (true)
          {
            localc.gnC.setMaxLines(3);
            localc.zbT.setVisibility(8);
            localc.zbO.setVisibility(4);
            if (bool)
            {
              localc.zbI.setVisibility(8);
              localc.zcb.setVisibility(8);
            }
            d.c.b(parama1, localc, localb, parambi, bool);
            paramInt = 0;
            parama = paramString;
            i = j;
            break;
            localc.zbN.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localc.zbN.getContext(), ah.getContext().getString(2131299765), localc.zbN.getTextSize()));
          }
          d.c.a(parama1, localc, localb, bool);
          paramInt = 0;
          parama = paramString;
          i = j;
          break;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            if (!bo.isNullOrNil(localb.fhL))
            {
              localc.gnB.setTextColor(bo.bS(localb.fhL, parama1.yTx.getContext().getResources().getColor(2131689761)));
              label6366: localc.gnC.setMaxLines(2);
              localc.gnC.setVisibility(0);
              if (bo.isNullOrNil(localb.fhM))
                break label6695;
              localc.gnC.setTextColor(bo.bS(localb.fhM, parama1.yTx.getContext().getResources().getColor(2131690139)));
              label6427: localc.zbN.setVisibility(8);
              localc.zbO.setVisibility(4);
              localc.zbT.setVisibility(8);
              localc.zbM.setVisibility(0);
              localc.moL.setVisibility(0);
              if (bo.isNullOrNil(localb.fhH))
                break label6722;
              localc.moL.setText(localb.fhH);
            }
          }
          while (true)
            if (this.kuU)
            {
              localObject2 = com.tencent.mm.at.o.ahl().a(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
              if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
              {
                parama = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject2, false, ((Bitmap)localObject2).getWidth() / 2);
                localc.zbI.setImageBitmap(parama);
              }
              if (!bo.isNullOrNil(localb.fhK))
              {
                localObject2 = com.tencent.mm.at.o.ahp();
                parama = localb.fhK;
                localObject3 = new ImageView(parama1.yTx.getContext());
                localObject1 = new com.tencent.mm.at.a.a.c.a();
                ((com.tencent.mm.at.a.a.c.a)localObject1).ePH = true;
                ((com.tencent.mm.at.a.a)localObject2).a(parama, (ImageView)localObject3, ((com.tencent.mm.at.a.a.c.a)localObject1).ahG(), new d.d.5(this, localc, parama1));
                paramInt = 0;
                parama = paramString;
                i = j;
                break;
                localc.gnB.setTextColor(parama1.yTx.getContext().getResources().getColor(2131689761));
                break label6366;
                localc.gnB.setVisibility(8);
                break label6366;
                label6695: localc.gnC.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690139));
                break label6427;
                label6722: localc.moL.setText(2131298139);
                continue;
              }
              localc.zcd.getViewTreeObserver().addOnPreDrawListener(new d.d.6(this, localc, parama1, (Bitmap)localObject2));
              paramInt = 0;
              parama = paramString;
              i = j;
              break;
            }
          localc.zbI.setImageBitmap(BitmapFactory.decodeResource(parama1.yTx.getMMResources(), 2130839706));
          paramInt = 0;
          parama = paramString;
          i = j;
          break;
          if (((n)localObject3).fju == 19)
          {
            d.c.a(parama1, localc, localb, bool);
            paramInt = 0;
            parama = paramString;
            i = j;
            break;
            label6837: localc.zbN.setVisibility(8);
            break label1319;
            label6850: localObject2 = com.tencent.mm.at.o.ahl().b(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
            if (localObject2 != null)
            {
              paramString = (String)localObject2;
              if (!((Bitmap)localObject2).isRecycled());
            }
            else
            {
              paramString = com.tencent.mm.at.o.ahl().a(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
            }
            if ((paramString != null) && (!paramString.isRecycled()))
            {
              localc.zbI.setImageBitmap(paramString);
              break label1433;
            }
            localc.zbI.setImageResource(2130837803);
            break label1433;
            label6955: localc.zbW.setVisibility(8);
            localObject2 = parama;
            break label1476;
            label6971: localc.zbW.setVisibility(8);
            localObject2 = parama;
            break label1476;
          }
          label6987: paramInt = 0;
          parama = paramString;
          i = j;
          break;
        }
        paramInt = 0;
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32836);
    int i = ((ay)paramView.getTag()).position;
    int j = l.aiL(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    j.b localb = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.bT(localb.appId, false);
    Object localObject;
    if ((com.tencent.mm.pluginsdk.model.app.g.i(localf)) && (!com.tencent.mm.ui.chatting.j.aA(parambi)))
    {
      if (localb.type != 6)
        break label593;
      localObject = l.aiM(localb.csD);
      if (((localObject == null) || (!d.b.e(parambi, ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath))) && (!parambi.dtH()))
        paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
    }
    boolean bool1;
    if ((localb.fgo <= 0) || ((localb.fgo > 0) && (j >= 100)))
      switch (localb.type)
      {
      default:
        bool1 = false;
      case 3:
      case 8:
      case 6:
      case 2:
      case 1:
      case 5:
      case 4:
      case 16:
      case 34:
      }
    while (true)
    {
      label275: if ((bool1) && (!this.yJI.dFy()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(2131298150));
      if ((com.tencent.mm.bp.d.afj("favorite")) && ((localf == null) || (!localf.xy())))
        switch (localb.type)
        {
        case 7:
        case 8:
        case 9:
        case 11:
        case 12:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 21:
        case 22:
        case 23:
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 10:
        case 13:
        case 19:
        case 20:
        case 24:
        }
      while (true)
      {
        localObject = new dq();
        ((dq)localObject).cxc.cvx = parambi.field_msgId;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        if ((((dq)localObject).cxd.cwB) || (d.b.a(this.yJI.yTx.getContext(), localb)))
          paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
        if (bh.o(parambi))
          paramContextMenu.clear();
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
        bool1 = true;
        AppMethodBeat.o(32836);
        while (true)
        {
          return bool1;
          label593: paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
          break;
          bool1 = com.tencent.mm.aj.f.aeH();
          break label275;
          bool1 = com.tencent.mm.aj.f.aeB();
          break label275;
          boolean bool2 = com.tencent.mm.aj.f.aeF();
          bool1 = bool2;
          if (bo.any(localb.fgp))
            break label275;
          paramContextMenu.add(i, 150, 0, this.yJI.yTx.getMMResources().getString(2131298161));
          bool1 = bool2;
          break label275;
          bool1 = com.tencent.mm.aj.f.aey();
          break label275;
          bool1 = com.tencent.mm.aj.f.aex();
          break label275;
          bool1 = com.tencent.mm.aj.f.aeD();
          break label275;
          bool1 = com.tencent.mm.aj.f.aez();
          break label275;
          if ((localb.fhD != 5) && (localb.fhD != 6) && (localb.fhD != 2))
            break label889;
          if ((localb.fhD != 2) || (bh.o(parambi)))
            paramContextMenu.clear();
          paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
          AppMethodBeat.o(32836);
          bool1 = false;
          continue;
          paramContextMenu.clear();
          paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
          AppMethodBeat.o(32836);
          bool1 = false;
        }
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
      }
      label889: bool1 = false;
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32837);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(32837);
    case 100:
    case 111:
    case 114:
    }
    while (true)
    {
      return false;
      AppMethodBeat.o(32837);
      continue;
      d.b.a(parama, parambi, b(parama, parambi));
      AppMethodBeat.o(32837);
      continue;
      paramMenuItem = parambi.field_content;
      if (paramMenuItem != null)
        break;
      AppMethodBeat.o(32837);
    }
    paramMenuItem = j.b.me(paramMenuItem);
    if (paramMenuItem != null)
      switch (paramMenuItem.type)
      {
      case 7:
      default:
      case 3:
      case 8:
      case 6:
      case 2:
      case 1:
      case 5:
      case 4:
      }
    while (true)
    {
      AppMethodBeat.o(32837);
      break;
      am.a(parambi, bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend), parama.yTx.getContext());
      continue;
      am.d(parambi, parama.yTx.getContext());
      continue;
      am.b(parambi, bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend), parama.yTx.getContext());
      continue;
      am.a(parambi, parama.yTx.getContext(), b(parama, parambi), parama.dFx());
      continue;
      am.m(bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend), parama.yTx.getContext());
      continue;
      am.c(parambi, bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend), parama.yTx.getContext());
      continue;
      am.c(parambi, parama.yTx.getContext());
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && ((paramInt == 49) || (paramInt == 335544369) || (paramInt == 402653233) || (paramInt == 369098801)));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32838);
    com.tencent.mm.modelstat.a.a(parambi, a.a.fQX);
    Object localObject1 = parambi.field_content;
    Object localObject2 = Boolean.FALSE;
    boolean bool;
    if (localObject1 == null)
    {
      bool = false;
      AppMethodBeat.o(32838);
    }
    while (true)
    {
      return bool;
      j.b localb = j.b.me(bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
      localObject1 = n.mj((String)localObject1);
      if (localb == null)
      {
        bool = false;
        AppMethodBeat.o(32838);
      }
      else
      {
        if (((n)localObject1).fju != 0)
        {
          localObject2 = Boolean.TRUE;
          localb.type = ((n)localObject1).fju;
        }
        localObject1 = com.tencent.mm.pluginsdk.model.app.g.bT(localb.appId, false);
        Object localObject3 = d(parama, parambi);
        if (localObject1 != null)
          a(parama, localb, (String)localObject3, (com.tencent.mm.pluginsdk.model.app.f)localObject1, parambi.field_msgSvrId, parama.getTalkerUserName());
        int i;
        switch (localb.type)
        {
        default:
          i = 1;
        case 3:
        case 4:
        case 6:
        case 7:
        case 10:
        case 20:
        case 13:
        case 19:
        case 16:
        case 33:
        case 44:
        case 36:
        case 24:
        case 34:
        }
        label3595: 
        while (true)
          label279: if ((i != 0) && (localb.url != null) && (!localb.url.equals("")))
          {
            label564: label620: Object localObject4;
            if (!bo.isNullOrNil(localb.canvasPageXml))
            {
              paramView = new Intent();
              paramView.putExtra("sns_landig_pages_from_source", 5);
              paramView.putExtra("msg_id", parambi.field_msgId);
              paramView.putExtra("sns_landing_pages_xml", localb.canvasPageXml);
              paramView.putExtra("sns_landing_pages_share_thumb_url", parambi.field_imgPath);
              paramView.addFlags(268435456);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", paramView);
              bool = true;
              AppMethodBeat.o(32838);
              break;
              com.tencent.mm.plugin.report.service.h.pYm.e(13043, new Object[] { Integer.valueOf(2), localb.description, localb.appId });
              if ((com.tencent.mm.r.a.bJ(parama.yTx.getContext())) || (com.tencent.mm.r.a.bH(parama.yTx.getContext())))
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgFrom", "Voip is running, can't do this");
                bool = true;
                AppMethodBeat.o(32838);
                break;
              }
              if (a(parama, localb, parambi))
              {
                bool = true;
                AppMethodBeat.o(32838);
                break;
              }
              localObject1 = com.tencent.mm.pluginsdk.model.app.p.B(localb.url, "message");
              localObject3 = com.tencent.mm.pluginsdk.model.app.p.B(localb.fgn, "message");
              localObject2 = getPackageInfo(parama.yTx.getContext(), localb.appId);
              if (localObject2 == null)
              {
                paramView = null;
                if (localObject2 != null)
                  break label620;
              }
              for (j = 0; ; j = ((PackageInfo)localObject2).versionCode)
              {
                a(parama, (String)localObject1, (String)localObject3, paramView, j, localb.appId, true, parambi.field_msgId, parambi.field_msgSvrId, parambi);
                bool = true;
                AppMethodBeat.o(32838);
                break;
                paramView = ((PackageInfo)localObject2).versionName;
                break label564;
              }
              if (!this.kuU)
              {
                com.tencent.mm.ui.base.t.hO(parama.yTx.getContext());
                bool = true;
                AppMethodBeat.o(32838);
                break;
              }
              paramView = new Intent();
              paramView.setClassName(parama.yTx.getContext(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
              paramView.putExtra("app_msg_id", parambi.field_msgId);
              parama.startActivity(paramView);
              bool = true;
              AppMethodBeat.o(32838);
              break;
              if ((localObject1 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject1).xy()) && (a(parama, (com.tencent.mm.pluginsdk.model.app.f)localObject1)))
              {
                bool = true;
                AppMethodBeat.o(32838);
                break;
              }
              if ((localb.csD == null) || (localb.csD.length() == 0))
                ((com.tencent.mm.ui.chatting.c.b.b)parama.aF(com.tencent.mm.ui.chatting.c.b.b.class)).a(parambi, new d.d.7(this, (com.tencent.mm.pluginsdk.model.app.f)localObject1, parama, localb, (String)localObject3, parambi));
              while (true)
              {
                bool = true;
                AppMethodBeat.o(32838);
                break;
                if (!this.kuU)
                {
                  com.tencent.mm.ui.base.t.hO(parama.yTx.getContext());
                  bool = true;
                  AppMethodBeat.o(32838);
                  break;
                }
                paramView = new Intent();
                paramView.setClassName(parama.yTx.getContext(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
                paramView.putExtra("app_msg_id", parambi.field_msgId);
                parama.yTx.startActivityForResult(paramView, 210);
              }
              if (bo.isNullOrNil(localb.fgQ))
              {
                bool = false;
                AppMethodBeat.o(32838);
                break;
              }
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_Product_xml", localb.fgQ);
              paramView.putExtra("key_ProductUI_getProductInfoScene", 1);
              if (parambi.field_imgPath == null)
                paramView.putExtra("key_ProductUI_chatting_msgId", parambi.field_msgId);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "scanner", ".ui.ProductUI", paramView);
              bool = true;
              AppMethodBeat.o(32838);
              break;
              if (bo.isNullOrNil(localb.fgT))
              {
                bool = false;
                AppMethodBeat.o(32838);
                break;
              }
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_TV_xml", localb.fgT);
              paramView.putExtra("key_TV_getProductInfoScene", 1);
              if (parambi.field_imgPath == null)
                paramView.putExtra("key_TVInfoUI_chatting_msgId", parambi.field_msgId);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "shake", ".ui.TVInfoUI", paramView);
              bool = true;
              AppMethodBeat.o(32838);
              break;
              if (bo.isNullOrNil(localb.fgW))
              {
                bool = false;
                AppMethodBeat.o(32838);
                break;
              }
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_product_info", localb.fgW);
              paramView.putExtra("key_product_scene", 1);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "product", ".ui.MallProductUI", paramView);
              bool = true;
              AppMethodBeat.o(32838);
              break;
              paramView = new Intent();
              paramView.putExtra("message_id", parambi.field_msgId);
              paramView.putExtra("record_xml", localb.fgU);
              paramView.putExtra("big_appmsg", (Serializable)localObject2);
              j = u.ad(b(parama, parambi), parama.getTalkerUserName());
              paramView.putExtra("prePublishId", "msg_" + Long.toString(parambi.field_msgSvrId));
              paramView.putExtra("preUsername", b(parama, parambi));
              paramView.putExtra("preChatName", parama.getTalkerUserName());
              paramView.putExtra("preChatTYPE", j);
              d.a.a(paramView, parama, parambi, this);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "record", ".ui.RecordMsgDetailUI", paramView);
              bool = true;
              AppMethodBeat.o(32838);
              break;
              if (bo.isNullOrNil(localb.cDt))
              {
                bool = false;
                AppMethodBeat.o(32838);
                break;
              }
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_card_app_msg", localb.cDt);
              paramView.putExtra("key_from_scene", localb.fhD);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "card", ".ui.CardDetailUI", paramView);
              bool = true;
              AppMethodBeat.o(32838);
              break;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgFrom", "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s", new Object[] { localb.fiP, localb.fiO, localb.fiQ, localb.url, Integer.valueOf(localb.fiZ), localb.fiS });
              if ((44 == localb.type) && ((!localb.cw(false)) || (bo.isNullOrNil(localb.p(parama.yTx.getContext(), false)))))
              {
                i = 1;
                continue;
              }
              localObject4 = parama.getTalkerUserName();
              localObject3 = b(parama, parambi);
              localObject2 = new Bundle();
              if ((parama.yTx instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI))
              {
                j = 10;
                label1595: ((Bundle)localObject2).putInt("stat_scene", j);
                ((Bundle)localObject2).putString("stat_msg_id", "msg_" + Long.toString(parambi.field_msgSvrId));
                ((Bundle)localObject2).putString("stat_chat_talker_username", (String)localObject4);
                ((Bundle)localObject2).putString("stat_send_msg_user", (String)localObject3);
                switch (localb.fiR)
                {
                default:
                  j = 1;
                case 1:
                case 0:
                case 2:
                case 3:
                }
              }
              while (true)
              {
                i = j;
                if (j != 0)
                  break label279;
                bool = true;
                AppMethodBeat.o(32838);
                break;
                if (parama.dFx())
                {
                  j = 2;
                  break label1595;
                }
                if (com.tencent.mm.model.t.mZ((String)localObject4))
                {
                  j = 7;
                  break label1595;
                }
                j = 1;
                break label1595;
                localObject1 = new Intent();
                ((Intent)localObject1).putExtra("key_username", localb.fiP);
                if (parama.dFx())
                {
                  ((Intent)localObject1).putExtra("key_from_scene", 1);
                  ((Intent)localObject1).putExtra("key_scene_note", (String)localObject4 + ":" + (String)localObject3);
                }
                while (true)
                {
                  localObject3 = new WxaExposedParams.a();
                  ((WxaExposedParams.a)localObject3).appId = localb.fiQ;
                  ((WxaExposedParams.a)localObject3).from = 6;
                  ((WxaExposedParams.a)localObject3).gVt = localb.fiZ;
                  ((WxaExposedParams.a)localObject3).gVu = localb.fiT;
                  ((Intent)localObject1).putExtra("key_scene_exposed_params", ((WxaExposedParams.a)localObject3).ayP());
                  ((Intent)localObject1).putExtra("_stat_obj", (Bundle)localObject2);
                  com.tencent.mm.bp.d.b(parama.yTx.getContext(), "appbrand", ".ui.AppBrandProfileUI", (Intent)localObject1);
                  j = 0;
                  break;
                  ((Intent)localObject1).putExtra("key_from_scene", 2);
                  ((Intent)localObject1).putExtra("key_scene_note", (String)localObject4);
                }
                if ((parama.yTx instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI))
                {
                  com.tencent.mm.modelappbrand.a.a((String)localObject4, 1073, localb, (Bundle)localObject2);
                  j = 0;
                }
                else if (com.tencent.mm.model.t.mZ((String)localObject4))
                {
                  com.tencent.mm.modelappbrand.a.a((String)localObject4, 1074, localb, (Bundle)localObject2);
                  j = 0;
                }
                else
                {
                  com.tencent.mm.modelappbrand.a.a((String)localObject4, (String)localObject3, parama.dFx(), localb, (Bundle)localObject2);
                  j = 0;
                  continue;
                  com.tencent.mm.modelappbrand.a.b((String)localObject4, (String)localObject3, parama.dFx(), localb, (Bundle)localObject2);
                  j = 0;
                }
              }
              if ((bo.isNullOrNil(localb.fiQ)) && (bo.isNullOrNil(localb.fiP)))
              {
                parambi = localb.url;
                if (parama.dFx());
                for (paramView = "groupmessage"; ; paramView = "singlemessage")
                {
                  parambi = com.tencent.mm.pluginsdk.model.app.p.B(parambi, paramView);
                  paramView = new Intent();
                  paramView.putExtra("rawUrl", parambi);
                  paramView.putExtra("webpageTitle", localb.title);
                  paramView.putExtra("shortUrl", localb.url);
                  com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramView);
                  bool = true;
                  AppMethodBeat.o(32838);
                  break;
                }
              }
              localObject1 = parama.getTalkerUserName();
              paramView = b(parama, parambi);
              localObject2 = new Bundle();
              if (parama.dFx())
                j = 2;
              while (true)
              {
                ((Bundle)localObject2).putInt("stat_scene", j);
                ((Bundle)localObject2).putString("stat_msg_id", "msg_" + Long.toString(parambi.field_msgSvrId));
                ((Bundle)localObject2).putString("stat_chat_talker_username", (String)localObject1);
                ((Bundle)localObject2).putString("stat_send_msg_user", paramView);
                ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(parama.yTx.getContext(), parama.getTalkerUserName(), b(parama, parambi), parama.dFx(), localb);
                bool = true;
                AppMethodBeat.o(32838);
                break;
                if (com.tencent.mm.model.t.mZ((String)localObject1))
                  j = 7;
                else
                  j = 1;
              }
              paramView = new lz();
              paramView.cHO.context = parama.yTx.getContext();
              paramView.cHO.cvx = parambi.field_msgId;
              paramView.cHO.cHc = parama.dFx();
              paramView.cHO.cHP = localb.fgU;
              paramView.cHO.scene = 6;
              com.tencent.mm.sdk.b.a.xxA.m(paramView);
              bool = true;
              AppMethodBeat.o(32838);
              break;
              paramView = new Intent();
              paramView.putExtra("key_from_user_name", b(parama, parambi));
              paramView.putExtra("key_biz_uin", localb.fhF);
              paramView.putExtra("key_order_id", localb.fhG);
              if ((parambi.field_talker != null) && (!parambi.field_talker.equals("")) && (com.tencent.mm.model.t.kH(parambi.field_talker)))
                paramView.putExtra("key_chatroom_name", parambi.field_talker);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "card", ".ui.CardGiftAcceptUI", paramView);
              bool = true;
              AppMethodBeat.o(32838);
              break;
            }
            localObject2 = (com.tencent.mm.plugin.websearch.api.ab)localb.X(com.tencent.mm.plugin.websearch.api.ab.class);
            if ((localObject2 != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.websearch.api.ab)localObject2).uaa)))
            {
              paramView = new cvi();
              paramView.uaa = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uaa;
              paramView.uab = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uab;
              paramView.uac = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uac;
              paramView.uad = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uad;
              paramView.uae = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uae;
              paramView.uai = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uai;
              paramView.lvz = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).lvz;
              paramView.lvA = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).lvA;
              paramView.qVw = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).qVw;
              paramView.uaf = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uaf;
              paramView.uag = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uag;
              paramView.uah = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uah;
              paramView.source = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).source;
              paramView.phw = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).phw;
              paramView.uaj = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uaj;
              paramView.ual = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).ual;
              paramView.uam = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uam;
              paramView.uan = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uan;
              paramView.uak = ((com.tencent.mm.plugin.websearch.api.ab)localObject2).uak;
              localObject2 = com.tencent.mm.plugin.topstory.a.g.a(paramView, 32, parama.yTx.getContext().getString(2131300133));
              com.tencent.mm.plugin.topstory.a.h.a(paramView, parambi);
              aa.a(parama.yTx.getContext(), (chv)localObject2);
              bool = true;
              AppMethodBeat.o(32838);
              break;
            }
            localObject1 = localb.url;
            if (parama.dFx())
            {
              localObject2 = "groupmessage";
              label2807: localObject3 = com.tencent.mm.pluginsdk.model.app.p.B((String)localObject1, (String)localObject2);
              String str = localb.url;
              localObject4 = getPackageInfo(parama.yTx.getContext(), localb.appId);
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("rawUrl", (String)localObject3);
              ((Intent)localObject1).putExtra("webpageTitle", localb.title);
              if ((localb.appId != null) && (("wx751a1acca5688ba3".equals(localb.appId)) || ("wxfbc915ff7c30e335".equals(localb.appId)) || ("wx482a4001c37e2b74".equals(localb.appId))))
              {
                localObject2 = new Bundle();
                ((Bundle)localObject2).putString("jsapi_args_appid", localb.appId);
                ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
              }
              if (bo.isNullOrNil(str))
                break label3595;
              ((Intent)localObject1).putExtra("shortUrl", str);
              label2976: if (localObject4 != null)
                break label3612;
              localObject2 = null;
              label2984: ((Intent)localObject1).putExtra("version_name", (String)localObject2);
              if (localObject4 != null)
                break label3622;
              j = 0;
              label3003: ((Intent)localObject1).putExtra("version_code", j);
              if (!bo.isNullOrNil(localb.cMg))
              {
                ((Intent)localObject1).putExtra("srcUsername", localb.cMg);
                ((Intent)localObject1).putExtra("srcDisplayname", localb.cMh);
              }
              ((Intent)localObject1).putExtra("msg_id", parambi.field_msgId);
              ((Intent)localObject1).putExtra("KPublisherId", "msg_" + Long.toString(parambi.field_msgSvrId));
              ((Intent)localObject1).putExtra("KAppId", localb.appId);
              ((Intent)localObject1).putExtra("geta8key_username", parama.getTalkerUserName());
              ((Intent)localObject1).putExtra("pre_username", b(parama, parambi));
              ((Intent)localObject1).putExtra("from_scence", 2);
              ((Intent)localObject1).putExtra("expid_str", parambi.dJE);
              j = u.ad(b(parama, parambi), parama.getTalkerUserName());
              ((Intent)localObject1).putExtra("prePublishId", "msg_" + Long.toString(parambi.field_msgSvrId));
              ((Intent)localObject1).putExtra("preUsername", b(parama, parambi));
              ((Intent)localObject1).putExtra("preChatName", parama.getTalkerUserName());
              ((Intent)localObject1).putExtra("preChatTYPE", j);
              ((Intent)localObject1).putExtra("preMsgIndex", 0);
              switch (j)
              {
              case 3:
              case 4:
              case 5:
              default:
                j = 0;
                label3307: ((Intent)localObject1).putExtra("share_report_pre_msg_url", localb.url);
                ((Intent)localObject1).putExtra("share_report_pre_msg_title", localb.title);
                ((Intent)localObject1).putExtra("share_report_pre_msg_desc", localb.description);
                ((Intent)localObject1).putExtra("share_report_pre_msg_icon_url", localb.thumburl);
                ((Intent)localObject1).putExtra("share_report_pre_msg_appid", localb.appId);
                ((Intent)localObject1).putExtra("share_report_from_scene", j);
                if (j == 5)
                  ((Intent)localObject1).putExtra("share_report_biz_username", parama.getTalkerUserName());
                localObject2 = (com.tencent.mm.af.e)localb.X(com.tencent.mm.af.e.class);
                if (localObject2 == null)
                  break;
              case 2:
              case 1:
              case 6:
              case 7:
              }
            }
            for (int j = ((com.tencent.mm.af.e)localObject2).ffZ; ; j = -1)
            {
              ((Intent)localObject1).putExtra(e.m.ygo, j);
              ((Intent)localObject1).addFlags(536870912);
              i = parama.yTx.getContext().getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
              if ((localObject2 == null) || (j != 5) || (((com.tencent.mm.af.e)localObject2).fgb != 1) || (!((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVP()))
                break label3656;
              localObject2 = new Bundle();
              ((Bundle)localObject2).putInt("biz_video_scene", 1);
              ((Bundle)localObject2).putInt("biz_video_subscene", i);
              ((Bundle)localObject2).putInt("geta8key_scene", 1);
              com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c.a(parama.yTx.getContext(), parambi.field_msgId, parambi.field_msgSvrId, 0, paramView.findViewById(2131822444), (Bundle)localObject2);
              bool = true;
              AppMethodBeat.o(32838);
              break;
              localObject2 = "singlemessage";
              break label2807;
              ((Intent)localObject1).putExtra("shortUrl", localb.url);
              break label2976;
              label3612: localObject2 = ((PackageInfo)localObject4).versionName;
              break label2984;
              label3622: j = ((PackageInfo)localObject4).versionCode;
              break label3003;
              j = 2;
              break label3307;
              j = 3;
              break label3307;
              j = 5;
              break label3307;
            }
            label3656: if ((((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(3)) && (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a(parama.yTx.getContext(), (String)localObject3, j, 1, i, (Intent)localObject1)))
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgFrom", "jump to TmplWebview");
              bool = true;
              AppMethodBeat.o(32838);
              break;
            }
            com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
            bool = true;
            AppMethodBeat.o(32838);
            break;
          }
        bool = false;
        AppMethodBeat.o(32838);
      }
    }
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.d
 * JD-Core Version:    0.6.2
 */