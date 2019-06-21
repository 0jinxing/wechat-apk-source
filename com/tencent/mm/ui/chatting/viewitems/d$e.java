package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.a;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.n;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.ii;
import com.tencent.mm.g.a.lz;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.u;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.modelappbrand.i.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.b;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.s.i;
import com.tencent.mm.ui.chatting.s.j;
import com.tencent.mm.ui.chatting.s.l;
import com.tencent.mm.ui.chatting.s.n;
import com.tencent.mm.ui.e.m;
import com.tencent.mm.ui.tools.ShowImageUI;

public final class d$e extends c
  implements s.n
{
  private boolean rEF = false;
  private com.tencent.mm.ui.chatting.d.a yJI;
  protected s.i zcO;
  protected s.l zcP;
  protected s.j zcQ;

  private static void a(d.c paramc, com.tencent.mm.ui.chatting.c.b.h paramh, bi parambi)
  {
    AppMethodBeat.i(32854);
    if ((parambi.field_status == 2) && (a(paramh, parambi.field_msgId)))
    {
      if (paramc.zci == null)
        break label61;
      paramc.zci.setVisibility(0);
      AppMethodBeat.o(32854);
    }
    while (true)
    {
      return;
      if (paramc.zci != null)
        paramc.zci.setVisibility(8);
      label61: AppMethodBeat.o(32854);
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32852);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969085);
      ((View)localObject).setTag(new d.c().y((View)localObject, false));
    }
    AppMethodBeat.o(32852);
    return localObject;
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32858);
    com.tencent.mm.ui.base.h.d(parama.yTx.getContext(), parama.yTx.getMMResources().getString(2131298216), "", parama.yTx.getMMResources().getString(2131297035), parama.yTx.getMMResources().getString(2131296868), new d.e.8(this, parambi, parama), new d.e.9(this));
    AppMethodBeat.o(32858);
  }

  public final void a(c.a parama, int paramInt, final com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32853);
    final d.c localc = (d.c)parama;
    this.yJI = parama1;
    ((com.tencent.mm.ui.chatting.c.b.j)parama1.aF(com.tencent.mm.ui.chatting.c.b.j.class)).bg(parambi);
    localc.reset();
    String str = parambi.field_content;
    ((com.tencent.mm.ui.chatting.c.b.j)parama1.aF(com.tencent.mm.ui.chatting.c.b.j.class)).be(parambi);
    j.b localb;
    Object localObject1;
    if (str != null)
    {
      localb = j.b.X(str, parambi.field_reserved);
      localObject1 = n.mj(str);
    }
    while (true)
    {
      Object localObject2 = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
      int i = 0;
      int j = 0;
      Object localObject3 = localObject2;
      com.tencent.mm.pluginsdk.model.app.f localf;
      boolean bool;
      label621: int k;
      if (localb != null)
      {
        localf = com.tencent.mm.pluginsdk.model.app.g.dX(localb.appId, localb.axy);
        localc.gnB.setText(localb.title);
        localc.gnC.setText(localb.description);
        localc.zbN.setMaxLines(1);
        localc.gnB.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690316));
        localc.gnC.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690164));
        localc.zcd.setBackgroundResource(2130838204);
        localc.zcd.setPadding(0, parama1.yTx.getContext().getResources().getDimensionPixelSize(2131427796), 0, 0);
        localc.zbI.setVisibility(0);
        localc.zcb.setVisibility(0);
        localc.gnC.setVisibility(0);
        localc.zcf.setVisibility(8);
        localc.zcg.setVisibility(8);
        localc.zbS.setVisibility(8);
        localc.zbR.setVisibility(8);
        localc.zbO.setVisibility(8);
        localc.zbL.setVisibility(8);
        localc.zbK.setVisibility(8);
        localc.zcq.setVisibility(8);
        localc.zcj.setVisibility(8);
        localc.zcd.setVisibility(0);
        localc.zcv.setVisibility(8);
        localc.zcC.setVisibility(8);
        d.c.an(localc.zcc, localc.zcJ);
        if ((localf != null) && (localf.field_appName != null) && (localf.field_appName.trim().length() > 0))
          break label1288;
        localObject3 = localb.appName;
        bool = true;
        com.tencent.mm.bz.a.fromDPToPix(parama1.yTx.getContext(), 12);
        if ((localb.type == 20) || ("wxaf060266bfa9a35c".equals(localb.appId)))
          bool = p.a.dgQ().cjQ();
        if ((!bool) || (localb.appId == null) || (localb.appId.length() <= 0) || (!com.tencent.mm.pluginsdk.model.app.g.dg((String)localObject3)))
          break label1315;
        localc.moL.setText(com.tencent.mm.pluginsdk.model.app.g.b(parama1.yTx.getContext(), localf, (String)localObject3));
        localc.zbM.setVisibility(0);
        localc.moL.setVisibility(0);
        localc.moL.setCompoundDrawables(null, null, null, null);
        localc.zbJ.setVisibility(0);
        if ((localf == null) || (!localf.xy()))
          break label1298;
        a(parama1, localc.moL, parambi, localb, localf.field_packageName, parambi.field_msgSvrId);
        localc.zbJ.setImageResource(2130838294);
        a(parama1, localc.zbJ, localb.appId);
        label646: bool = false;
        localc.zbI.setVisibility(0);
        if (!this.kuU)
          break label1490;
        localf = null;
        localObject3 = localf;
        if (localb.type != 33)
        {
          localObject3 = localf;
          if (localb.type != 36)
          {
            localObject3 = localf;
            if (localb.type != 44)
            {
              localObject3 = localf;
              if (!d.b.arC(parambi.field_imgPath))
                localObject3 = com.tencent.mm.at.o.ahl().a(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), false);
            }
          }
        }
        if ((localObject3 == null) || (((Bitmap)localObject3).isRecycled()))
          break label1484;
        localc.zbI.setImageBitmap((Bitmap)localObject3);
        label772: if (localb.type == 3)
          localc.zcd.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            private boolean zcR = false;

            public final boolean onPreDraw()
            {
              AppMethodBeat.i(32839);
              if (this.zcR)
              {
                localc.zcd.getViewTreeObserver().removeOnPreDrawListener(this);
                AppMethodBeat.o(32839);
                return true;
              }
              localc.zcd.getViewTreeObserver().removeOnPreDrawListener(this);
              this.zcR = true;
              int i = com.tencent.mm.bz.a.fromDPToPix(parama1.yTx.getContext(), 24);
              Bitmap localBitmap = this.val$bitmap;
              Object localObject;
              if (localBitmap != null)
              {
                localObject = localBitmap;
                if (!localBitmap.isRecycled());
              }
              else
              {
                localObject = com.tencent.mm.sdk.platformtools.d.au(parama1.yTx.getContext().getResources().getColor(2131689868), i, i);
              }
              int j = ((Bitmap)localObject).getHeight();
              if (i > j)
                i = j;
              while (true)
              {
                localObject = com.tencent.mm.sdk.platformtools.d.e(com.tencent.mm.sdk.platformtools.d.al(Bitmap.createScaledBitmap((Bitmap)localObject, i, i, true)), 20);
                j = localc.zcd.getHeight();
                int k = localc.zcd.getWidth();
                i = j;
                if (j == 0)
                  i = com.tencent.mm.bz.a.al(parama1.yTx.getContext(), 2131428220);
                j = k;
                if (k == 0)
                  j = com.tencent.mm.bz.a.al(parama1.yTx.getContext(), 2131428221);
                localObject = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, 2130838204, j, i));
                localc.zcd.setBackgroundDrawable((Drawable)localObject);
                AppMethodBeat.o(32839);
                break;
              }
            }
          });
        label805: localc.zbT.setOnClickListener(null);
        switch (localb.type)
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
          k = 1;
          parama = (c.a)localObject2;
          i = j;
        case 3:
        case 6:
        case 4:
        case 36:
        case 5:
        case 33:
        case 44:
        case 7:
        case 10:
        case 13:
        case 20:
        case 0:
        case 15:
        case 25:
        case 26:
        case 27:
        case 16:
        case 24:
        case 19:
        case 34:
        case 40:
        }
      }
      while (true)
      {
        label1022: if (k != 0)
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.zbN.setVisibility(0);
            localc.zbN.setMaxLines(2);
            localc.zbN.setText(localb.title);
            localc.gnB.setVisibility(8);
            if (!bool)
              break label7302;
            if ((localb.type != 33) && (localb.type != 36) && (localb.type != 44))
              break label7204;
            paramString = com.tencent.mm.at.o.ahl().so(parambi.HF());
            localc.zbI.setImageResource(2131230820);
            com.tencent.mm.modelappbrand.a.b.abR().a(localc.zbI, "file://".concat(String.valueOf(paramString)), null, null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(50, 50));
            localObject3 = parama;
          }
        while (true)
        {
          label1077: if (i == 0)
          {
            localc.zcc.setTag(localObject3);
            localc.zcc.setOnClickListener(d(parama1));
          }
          if (this.kuU)
          {
            localc.zcc.setOnLongClickListener(c(parama1));
            localc.zcc.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
          }
          a(paramInt, localc, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
          AppMethodBeat.o(32853);
          return;
          label1288: localObject3 = localf.field_appName;
          break;
          label1298: a(parama1, localc.moL, localb.appId);
          break label621;
          label1315: if (localb.type == 24)
          {
            localc.moL.setText(ah.getContext().getString(2131299589));
            localc.zbM.setVisibility(0);
            localc.moL.setVisibility(0);
            localc.zbJ.setVisibility(8);
            break label646;
          }
          if ((localb.type == 19) || (((n)localObject1).fju == 19))
          {
            localc.moL.setText(ah.getContext().getString(2131298141));
            localc.zbM.setVisibility(0);
            localc.moL.setVisibility(0);
            localc.zbJ.setVisibility(8);
            break label646;
          }
          if (d.a(localb, localc))
            break label646;
          localc.zbM.setVisibility(8);
          localc.moL.setVisibility(8);
          localc.zbJ.setVisibility(8);
          break label646;
          label1484: bool = true;
          break label772;
          label1490: localc.zbI.setImageBitmap(BitmapFactory.decodeResource(parama1.yTx.getMMResources(), 2130839706));
          bool = false;
          break label805;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            localc.gnB.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690691));
            label1569: localc.gnC.setVisibility(0);
            localc.gnC.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690691));
            localc.zbN.setVisibility(8);
            localc.zbO.setVisibility(4);
            localc.gnC.setMaxLines(2);
            localc.zbT.setVisibility(0);
            if (!parambi.field_msgId.equals(parama.zbz))
              break label1842;
            localc.zbT.setImageResource(2130839637);
            label1678: parama = new d.f();
            parama.cvx = parambi.field_msgId;
            parama.cHz = parambi.field_content;
            parama.imgPath = parambi.field_imgPath;
            localc.zbT.setTag(parama);
            localc.zbT.setOnClickListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dDa());
            if (bool)
            {
              parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()));
              if ((parama != null) && (!parama.isRecycled()))
                break label1856;
              localc.zbI.setImageResource(2131230800);
            }
          }
          while (true)
          {
            if (!dHm())
              break label1868;
            if (localc.pyf == null)
              break label7308;
            localc.pyf.setVisibility(8);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            localc.gnB.setVisibility(8);
            break label1569;
            label1842: localc.zbT.setImageResource(2130839639);
            break label1678;
            label1856: localc.zbI.setImageBitmap(parama);
          }
          label1868: if (localc.pyf == null)
            break label7308;
          localc.pyf.setVisibility(0);
          if (parambi.field_status < 2)
            break label7308;
          localc.pyf.setVisibility(8);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            localc.gnB.setMaxLines(2);
          }
          while (true)
          {
            localc.gnC.setVisibility(0);
            localc.zbN.setVisibility(8);
            localc.zbO.setVisibility(4);
            localc.gnC.setMaxLines(2);
            localc.gnC.setText(bo.ga(localb.fgo));
            localc.zbT.setVisibility(8);
            d.c.a(localc, str, localb.fgo);
            d.c.a(localc, Boolean.FALSE, parambi, localb.csD, localb.title);
            if (!bool)
              break label7308;
            if (!bo.any(localb.fgp))
              break label2103;
            localc.zbI.setImageResource(2130837803);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            localc.gnB.setVisibility(8);
          }
          label2103: localc.zbI.setImageResource(com.tencent.mm.pluginsdk.model.o.aiD(localb.fgp));
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            label2160: localc.gnC.setVisibility(0);
            localc.zbN.setVisibility(8);
            localc.gnC.setMaxLines(2);
            localc.zbO.setVisibility(4);
            localc.zbT.setVisibility(0);
            localc.zbT.setImageResource(2130840523);
            if (!bool)
              break label7308;
            parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()));
            if ((parama != null) && (!parama.isRecycled()))
              break label2300;
            localc.zbI.setImageResource(2131230817);
          }
          while (true)
          {
            localc.zbT.setVisibility(8);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            localc.gnB.setVisibility(8);
            break label2160;
            label2300: localc.zbI.setImageBitmap(parama);
          }
          paramString = ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zb(localb.fiP);
          if (paramString != null)
          {
            parama = paramString.field_nickname;
            label2344: if (paramString == null)
              break label2596;
          }
          label2596: for (paramString = paramString.field_smallHeadURL; ; paramString = localb.fjb)
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
            com.tencent.mm.at.o.ahp().a(paramString, localc.zcn, r.d.zel);
            parama = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, true);
            localc.zcr.setImageBitmap(null);
            com.tencent.mm.modelappbrand.a.b.abR().a(localc.zcr, "file://".concat(String.valueOf(parama)), null, null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(240, 192));
            if (!dHm())
              break label2606;
            a(localc, (com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi);
            if (localc.pyf == null)
              break label7308;
            localc.pyf.setVisibility(8);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            parama = localb.cMh;
            break label2344;
          }
          label2606: if (localc.pyf == null)
            break label7308;
          localc.pyf.setVisibility(0);
          if (parambi.field_status < 2)
            break label7308;
          localc.pyf.setVisibility(8);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          parama = (com.tencent.mm.af.e)localb.X(com.tencent.mm.af.e.class);
          if ((parama != null) && (parama.fgb == 1) && (parama.ffZ == 5) && (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVP()))
          {
            d.c.a(parama1, localc, localb, parambi, bool);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break label1022;
          }
          localc.gnB.setVisibility(8);
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.zbN.setMaxLines(2);
            localc.zbN.setVisibility(0);
            localc.zbN.setText(localb.title);
            label2789: localc.gnC.setMaxLines(3);
            localc.zbO.setVisibility(4);
            if (!d.h(localb))
              break label3173;
            localc.zbT.setImageResource(2130840523);
            localc.zbT.setVisibility(0);
            label2835: if (bool)
            {
              parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()));
              if (parama != null)
                break label3195;
              localObject1 = new com.tencent.mm.at.a.a.c.a();
              ((com.tencent.mm.at.a.a.c.a)localObject1).ePT = 2131230820;
              ((com.tencent.mm.at.a.a.c.a)localObject1).ePG = true;
              ((com.tencent.mm.at.a.a.c.a)localObject1).ePK = com.tencent.mm.plugin.i.c.bGF();
              ((com.tencent.mm.at.a.a.c.a)localObject1).ct(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 50), com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 50)).ePF = true;
              localObject3 = com.tencent.mm.at.o.ahp();
              if (!bo.isNullOrNil(localb.thumburl))
                break label3186;
              parama = localb.fgv;
              label2942: ((com.tencent.mm.at.a.a)localObject3).a(parama, localc.zbI, ((com.tencent.mm.at.a.a.c.a)localObject1).ahG());
            }
            label2958: if (!dHm())
              break label3228;
            a(localc, (com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi);
            if (localc.pyf != null)
              localc.pyf.setVisibility(8);
          }
          while (true)
          {
            if (localb == null)
              break label7308;
            i = u.ad(b(parama1, parambi), parama1.getTalkerUserName());
            k = -1;
            parama = (com.tencent.mm.af.e)localb.X(com.tencent.mm.af.e.class);
            if (parama != null)
              k = parama.ffZ;
            ((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a(localb.url, k, 1, new Object[] { Long.valueOf(parambi.field_msgSvrId), paramString, Integer.valueOf(i) });
            if ((!this.rEF) && (k != -1) && (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(23)))
            {
              this.rEF = true;
              ((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rX(1);
            }
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            localc.zbN.setVisibility(8);
            break label2789;
            label3173: localc.zbT.setVisibility(8);
            break label2835;
            label3186: parama = localb.thumburl;
            break label2942;
            label3195: if (parama.isRecycled())
            {
              localc.zbI.setImageResource(2131230820);
              break label2958;
            }
            localc.zbI.setImageBitmap(parama);
            break label2958;
            label3228: if (localc.pyf != null)
            {
              localc.pyf.setVisibility(0);
              if (parambi.field_status >= 2)
                localc.pyf.setVisibility(8);
            }
          }
          paramString = ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zb(localb.fiP);
          switch (localb.fiR)
          {
          default:
          case 2:
          case 3:
          case 1:
          case 0:
          }
          while (true)
          {
            k = 1;
            while (true)
            {
              if (k != 0)
                break label7321;
              if (!dHm())
                break label3827;
              a(localc, (com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi);
              if (localc.pyf == null)
                break label7321;
              localc.pyf.setVisibility(8);
              parama = (c.a)localObject2;
              i = j;
              break;
              if (paramString != null)
              {
                parama = paramString.field_nickname;
                label3394: if (paramString == null)
                  break label3600;
              }
              label3600: for (paramString = paramString.field_smallHeadURL; ; paramString = localb.fjb)
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
                com.tencent.mm.at.o.ahp().a(paramString, localc.zcn, r.d.zel);
                parama = com.tencent.mm.at.o.ahl().so(parambi.field_imgPath);
                localc.zcr.setImageBitmap(null);
                com.tencent.mm.modelappbrand.a.b.abR().a(new d.e.2(this, localc), "file://".concat(String.valueOf(parama)), null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(240, 192));
                k = 0;
                break;
                parama = localb.cMh;
                break label3394;
              }
              if (paramString != null)
              {
                parama = paramString.field_nickname;
                label3621: if (paramString == null)
                  break label3744;
              }
              label3744: for (paramString = paramString.field_smallHeadURL; ; paramString = null)
              {
                localc.zcd.setVisibility(8);
                localc.zcq.setVisibility(8);
                localc.zcj.setVisibility(0);
                localc.zcl.setText(parama);
                localc.zcv.setVisibility(8);
                if (!bo.isNullOrNil(paramString))
                  break label3750;
                parama = com.tencent.mm.at.o.ahl().so(parambi.HF());
                com.tencent.mm.modelappbrand.a.b.abR().a(localc.zck, "file://".concat(String.valueOf(parama)), com.tencent.mm.modelappbrand.a.a.abQ(), com.tencent.mm.modelappbrand.a.f.fqH);
                k = 0;
                break;
                parama = localb.title;
                break label3621;
              }
              label3750: com.tencent.mm.modelappbrand.a.b.abR().a(localc.zck, paramString, com.tencent.mm.modelappbrand.a.a.abQ(), com.tencent.mm.modelappbrand.a.f.fqH);
              k = 0;
            }
            localc.zbM.setVisibility(0);
            localc.zbJ.setVisibility(0);
            localc.zbJ.setBackground(null);
            localc.zbJ.setImageResource(2131230904);
            d.a(localc.moL, localb);
          }
          label3827: if (localc.pyf == null)
            break label7321;
          localc.pyf.setVisibility(0);
          if (parambi.getStatus() < 2)
            break label7321;
          localc.pyf.setVisibility(8);
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          if (localb.cw(false))
          {
            parama = localb.p(parama1.getContext(), false);
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
                break label4096;
              localc.zcA.setImageResource(2131231694);
            }
            while (true)
            {
              parama = com.tencent.mm.at.o.ahl().so(parambi.HF());
              localc.zcz.setImageBitmap(null);
              com.tencent.mm.modelappbrand.a.b.abR().a(new d.e.4(this, localc), "file://".concat(String.valueOf(parama)), null, ((i)com.tencent.mm.kernel.g.K(i.class)).a(240, 120, i.a.fpG));
              k = 0;
              parama = (c.a)localObject2;
              i = j;
              break;
              k = 1;
              parama = (c.a)localObject2;
              i = j;
              break;
              label4096: if (j.a.fgi.ordinal() == localb.fiW)
                com.tencent.mm.at.o.aho().a(localb.fjb, new d.e.3(this, localc));
            }
          }
          k = 1;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          localc.gnB.setVisibility(8);
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.zbN.setMaxLines(2);
            localc.zbN.setVisibility(0);
            localc.zbN.setText(localb.title);
            label4207: localc.gnC.setMaxLines(3);
            localc.zbO.setVisibility(4);
            localc.zbT.setVisibility(8);
            if (bool)
            {
              parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.getContext()));
              if ((parama != null) && (!parama.isRecycled()))
                break label4329;
              localc.zbI.setImageResource(2131230820);
            }
          }
          while (true)
          {
            if (!dHm())
              break label4341;
            if (localc.pyf == null)
              break label7308;
            localc.pyf.setVisibility(8);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            localc.zbN.setVisibility(8);
            break label4207;
            label4329: localc.zbI.setImageBitmap(parama);
          }
          label4341: if (localc.pyf == null)
            break label7308;
          localc.pyf.setVisibility(0);
          if (parambi.getStatus() < 2)
            break label7308;
          localc.pyf.setVisibility(8);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          localc.zbN.setVisibility(0);
          if (localb.fgP == 1)
            localc.zbN.setText(2131302761);
          while (true)
          {
            if ((localb.title != null) && (localb.title.length() > 0))
            {
              localc.gnB.setVisibility(0);
              localc.gnB.setText(localb.title);
            }
            localc.gnC.setMaxLines(4);
            localc.zbO.setVisibility(4);
            localc.zbT.setVisibility(8);
            if (!bool)
              break label7308;
            parama = com.tencent.mm.at.o.ahl().b(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()), false);
            if ((parama == null) || (parama.isRecycled()))
              break label4606;
            localc.zbI.setImageBitmap(parama);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            if (localb.fgP == 2)
              localc.zbN.setText(2131302763);
            else if (localb.fgP == 3)
              localc.zbN.setText(2131302762);
            else
              localc.zbN.setText(2131302764);
          }
          label4606: localc.zbI.setImageResource(2131230820);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          localc.gnB.setVisibility(0);
          localc.gnB.setText(localb.title);
          localc.zbN.setVisibility(0);
          localc.zbN.setText(2131298178);
          localc.gnC.setMaxLines(4);
          localc.zbO.setVisibility(4);
          localc.zbT.setVisibility(8);
          if (!bool)
            break label7308;
          parama = com.tencent.mm.at.o.ahl().b(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()), false);
          if ((parama != null) && (!parama.isRecycled()))
          {
            localc.zbI.setImageBitmap(parama);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break label1022;
          }
          localc.zbI.setImageResource(2131230820);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            localc.gnB.setText(localb.title);
            localc.zbN.setVisibility(8);
          }
          localc.gnC.setMaxLines(4);
          localc.zbO.setVisibility(4);
          localc.zbT.setVisibility(8);
          if (!bool)
            break label7308;
          parama = com.tencent.mm.at.o.ahl().b(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()), false);
          if ((parama != null) && (!parama.isRecycled()))
          {
            localc.zbI.setImageBitmap(parama);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break label1022;
          }
          localc.zbI.setImageResource(2131230820);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          if ((localb.title != null) && (localb.title.length() > 0))
            localc.gnB.setVisibility(0);
          while (true)
          {
            localc.gnC.setVisibility(0);
            localc.zbN.setVisibility(8);
            localc.zbO.setVisibility(8);
            localc.zbT.setVisibility(4);
            localc.gnC.setMaxLines(2);
            if (!bool)
              break label7308;
            parama = com.tencent.mm.pluginsdk.model.app.g.b(localb.appId, 1, com.tencent.mm.bz.a.getDensity(parama1.getContext()));
            if ((parama != null) && (!parama.isRecycled()))
              break label5088;
            localc.zbI.setImageResource(2131230820);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            localc.gnB.setVisibility(8);
          }
          label5088: localc.zbI.setImageBitmap(parama);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            label5138: localc.gnC.setVisibility(0);
            localc.zbN.setVisibility(8);
            localc.zbT.setVisibility(8);
            localc.zbO.setVisibility(4);
            localc.gnC.setMaxLines(2);
            if (bool)
            {
              parama = com.tencent.mm.at.o.ahl().b(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()), false);
              if ((parama != null) && (!parama.isRecycled()))
                break label5322;
              localc.zbI.setImageResource(2131230820);
            }
          }
          while (true)
          {
            parama = new ay(parambi, false, paramInt, "", false, parama1.dDw(), localb.cMg, localb.cMh, localb.title, localb.fgX, localb.url, false, false);
            localc.zcc.setTag(parama);
            localc.zcc.setOnClickListener(i(parama1));
            i = 1;
            k = 0;
            break;
            localc.gnB.setVisibility(8);
            break label5138;
            label5322: localc.zbI.setImageBitmap(parama);
          }
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            label5362: localc.gnC.setVisibility(0);
            localc.zbN.setVisibility(8);
            localc.zbT.setVisibility(8);
            localc.zbO.setVisibility(4);
            localc.gnC.setMaxLines(2);
            if (bool)
            {
              parama = com.tencent.mm.at.o.ahl().b(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()), false);
              if ((parama != null) && (!parama.isRecycled()))
                break label5574;
              localc.zbI.setImageResource(2131230820);
            }
          }
          while (true)
          {
            parama = new ay(parambi, paramInt, "", parama1.dDw(), localb.cMg, localb.cMh, localb.title, localb.fiD, localb.designerName, localb.designerRediretctUrl, localb.url);
            localc.zcc.setTag(parama);
            paramString = localc.zcc;
            if (this.zcO == null)
              this.zcO = new s.i(parama1);
            paramString.setOnClickListener(this.zcO);
            i = 1;
            k = 0;
            break;
            localc.gnB.setVisibility(8);
            break label5362;
            label5574: localc.zbI.setImageBitmap(parama);
          }
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            label5614: localc.gnC.setVisibility(0);
            localc.zbN.setVisibility(8);
            localc.zbT.setVisibility(8);
            localc.zbO.setVisibility(4);
            localc.gnC.setMaxLines(2);
            if (bool)
            {
              if (!bo.isNullOrNil(parambi.HF()))
                break label5895;
              com.tencent.mm.at.o.ahp().a(localb.thumburl, localc.zbI);
            }
            label5693: parama = new ay();
            parama.cKd = parambi;
            parama.yFW = false;
            parama.position = paramInt;
            parama.zis = false;
            parama.title = parama1.dDw();
            parama.cMg = localb.cMg;
            parama.cMh = localb.cMh;
            parama.zit = localb.title;
            if (localb.type != 26)
              break label5952;
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
            k = 1;
          }
          while (true)
          {
            localc.zcc.setTag(parama);
            j = 0;
            i = k;
            k = j;
            break;
            localc.gnB.setVisibility(8);
            break label5614;
            label5895: parama = com.tencent.mm.at.o.ahl().b(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()), false);
            if ((parama == null) || (parama.isRecycled()))
            {
              localc.zbI.setImageResource(2131230820);
              break label5693;
            }
            localc.zbI.setImageBitmap(parama);
            break label5693;
            label5952: if (localb.type == 27)
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
              k = 1;
            }
            else
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgTo", "unknow view type");
              k = 0;
            }
          }
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
              break label7308;
            parama = com.tencent.mm.at.o.ahl().b(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()), false);
            if (parama == null)
              break label6240;
            localc.zbI.setImageBitmap(parama);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            localc.zbN.setVisibility(8);
          }
          label6240: localc.zbI.setImageResource(2131230820);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          localc.gnB.setVisibility(8);
          localc.zbN.setVisibility(0);
          if ((localb.title != null) && (localb.title.length() > 0))
            localc.zbN.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localc.zbN.getContext(), localb.title, (int)localc.zbN.getTextSize()));
          while (true)
          {
            localc.gnC.setMaxLines(3);
            localc.zbO.setVisibility(4);
            localc.zbT.setVisibility(8);
            if (bool)
              localc.zbI.setVisibility(8);
            d.c.b(parama1, localc, localb, parambi, bool);
            if (!dHm())
              break label6484;
            a(localc, (com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi);
            if (localc.pyf == null)
              break label7308;
            localc.pyf.setVisibility(8);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break;
            localc.zbN.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localc.zbN.getContext(), ah.getContext().getString(2131299765), (int)localc.zbN.getTextSize()));
          }
          label6484: if (localc.pyf == null)
            break label7308;
          localc.pyf.setVisibility(0);
          if (parambi.getStatus() < 2)
            break label7308;
          localc.pyf.setVisibility(8);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          d.c.a(parama1, localc, localb, bool);
          if (dHm())
          {
            a(localc, (com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi);
            if (localc.pyf == null)
              break label7308;
            localc.pyf.setVisibility(8);
            k = 0;
            parama = (c.a)localObject2;
            i = j;
            break label1022;
          }
          if (localc.pyf == null)
            break label7308;
          localc.pyf.setVisibility(0);
          if (parambi.getStatus() < 2)
            break label7308;
          localc.pyf.setVisibility(8);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localc.gnB.setVisibility(0);
            if (!bo.isNullOrNil(localb.fhL))
              if (!bo.isNullOrNil(localb.fhL))
              {
                localc.gnB.setTextColor(bo.bS(localb.fhL, parama1.getContext().getResources().getColor(2131689761)));
                label6725: localc.gnC.setMaxLines(2);
                localc.gnC.setVisibility(0);
                if (bo.isNullOrNil(localb.fhM))
                  break label7049;
                localc.gnC.setTextColor(bo.bS(localb.fhM, parama1.getContext().getResources().getColor(2131690139)));
                label6783: localc.zbN.setVisibility(8);
                localc.zbO.setVisibility(4);
                localc.zbT.setVisibility(8);
                localc.zbM.setVisibility(0);
                localc.moL.setVisibility(0);
                if (bo.isNullOrNil(localb.fhH))
                  break label7073;
                localc.moL.setText(localb.fhH);
              }
          }
          while (true)
            if (this.kuU)
            {
              paramString = com.tencent.mm.at.o.ahl().e(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()));
              if ((paramString != null) && (!paramString.isRecycled()))
              {
                parama = com.tencent.mm.sdk.platformtools.d.a(paramString, false, paramString.getWidth() / 2);
                localc.zbI.setImageBitmap(parama);
              }
              if (!bo.isNullOrNil(localb.fhK))
              {
                com.tencent.mm.at.o.ahp().a(localb.fhK, new ImageView(parama1.getContext()), new com.tencent.mm.at.a.a.c.a().ahD().ahG(), new d.e.5(this, localc, parama1));
                k = 0;
                parama = (c.a)localObject2;
                i = j;
                break;
                localc.gnB.setTextColor(parama1.getContext().getResources().getColor(2131689761));
                break label6725;
                localc.gnB.setTextColor(parama1.getContext().getResources().getColor(2131689761));
                break label6725;
                localc.gnB.setVisibility(8);
                break label6725;
                label7049: localc.gnC.setTextColor(parama1.getContext().getResources().getColor(2131690139));
                break label6783;
                label7073: localc.moL.setText(2131298139);
                continue;
              }
              localc.zcd.getViewTreeObserver().addOnPreDrawListener(new d.e.6(this, localc, parama1, paramString));
              k = 0;
              parama = (c.a)localObject2;
              i = j;
              break;
            }
          localc.zbI.setImageBitmap(BitmapFactory.decodeResource(parama1.yTx.getMMResources(), 2130839706));
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          if (((n)localObject1).fju != 19)
            break label7308;
          d.c.a(parama1, localc, localb, bool);
          k = 0;
          parama = (c.a)localObject2;
          i = j;
          break label1022;
          localc.zbN.setVisibility(8);
          break label1077;
          label7204: localObject2 = com.tencent.mm.at.o.ahl().b(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()), false);
          if (localObject2 != null)
          {
            paramString = (String)localObject2;
            if (!((Bitmap)localObject2).isRecycled());
          }
          else
          {
            paramString = com.tencent.mm.at.o.ahl().e(parambi.HF(), com.tencent.mm.bz.a.getDensity(parama1.getContext()));
          }
          if ((paramString != null) && (!paramString.isRecycled()))
          {
            localc.zbI.setImageBitmap(paramString);
            localObject3 = parama;
          }
          else
          {
            localc.zbI.setImageResource(2130837803);
            label7302: localObject3 = parama;
          }
        }
        label7308: k = 0;
        parama = (c.a)localObject2;
        i = j;
        continue;
        label7321: parama = (c.a)localObject2;
        i = j;
      }
      localObject1 = null;
      localb = null;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32855);
    int i = ((ay)paramView.getTag()).position;
    if (parambi.field_content == null)
      AppMethodBeat.o(32855);
    j.b localb;
    for (boolean bool1 = true; ; bool1 = true)
    {
      return bool1;
      localb = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
      if (localb != null)
        break;
      AppMethodBeat.o(32855);
    }
    Object localObject = com.tencent.mm.pluginsdk.model.app.g.bT(localb.appId, false);
    if ((com.tencent.mm.pluginsdk.model.app.g.i((com.tencent.mm.pluginsdk.model.app.f)localObject)) && (!com.tencent.mm.ui.chatting.j.aA(parambi)))
      paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
    if (((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)) && (!ad.mg(this.yJI.getTalkerUserName())))
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
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
      label295: if ((bool1) && (!this.yJI.dFy()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(2131298150));
      if ((com.tencent.mm.bp.d.afj("favorite")) && ((localObject == null) || (!((com.tencent.mm.pluginsdk.model.app.f)localObject).xy())))
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
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
        AppMethodBeat.o(32855);
        bool1 = true;
        break;
        bool1 = com.tencent.mm.aj.f.aeH();
        break label295;
        bool1 = com.tencent.mm.aj.f.aeB();
        break label295;
        boolean bool2 = com.tencent.mm.aj.f.aeF();
        bool1 = bool2;
        if (bo.any(localb.fgp))
          break label295;
        paramContextMenu.add(i, 150, 0, this.yJI.yTx.getMMResources().getString(2131298161));
        bool1 = bool2;
        break label295;
        bool1 = com.tencent.mm.aj.f.aey();
        break label295;
        bool1 = com.tencent.mm.aj.f.aex();
        break label295;
        bool1 = com.tencent.mm.aj.f.aeD();
        break label295;
        bool1 = com.tencent.mm.aj.f.aez();
        break label295;
        if ((localb.fhD != 5) && (localb.fhD != 6) && (localb.fhD != 2))
          break label858;
        if (localb.fhD != 2)
          paramContextMenu.clear();
        paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
        AppMethodBeat.o(32855);
        bool1 = false;
        break;
        paramContextMenu.clear();
        paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
        AppMethodBeat.o(32855);
        bool1 = false;
        break;
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
      }
      label858: bool1 = false;
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32856);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 100:
    case 111:
    case 114:
    case 103:
    }
    while (true)
    {
      AppMethodBeat.o(32856);
      while (true)
      {
        return false;
        AppMethodBeat.o(32856);
        continue;
        d.b.a(parama, parambi, b(parama, parambi));
        AppMethodBeat.o(32856);
        continue;
        paramMenuItem = parambi.field_content;
        if (paramMenuItem == null)
        {
          AppMethodBeat.o(32856);
        }
        else
        {
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
            AppMethodBeat.o(32856);
            break;
            com.tencent.mm.ui.chatting.am.a(parambi, bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend), parama.yTx.getContext());
            continue;
            com.tencent.mm.ui.chatting.am.d(parambi, parama.yTx.getContext());
            continue;
            com.tencent.mm.ui.chatting.am.b(parambi, bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend), parama.yTx.getContext());
            continue;
            com.tencent.mm.ui.chatting.am.a(parambi, parama.yTx.getContext(), b(parama, parambi), parama.dFx());
            continue;
            com.tencent.mm.ui.chatting.am.m(bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend), parama.yTx.getContext());
            continue;
            com.tencent.mm.ui.chatting.am.c(parambi, bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend), parama.yTx.getContext());
            continue;
            com.tencent.mm.ui.chatting.am.c(parambi, parama.yTx.getContext());
          }
          paramMenuItem = parambi.field_content;
          if (paramMenuItem != null)
            break;
          AppMethodBeat.o(32856);
        }
      }
      paramMenuItem = j.b.me(paramMenuItem);
      if (paramMenuItem != null)
        switch (paramMenuItem.type)
        {
        default:
          break;
        case 16:
          parama = new ii();
          parama.cDs.cDt = paramMenuItem.cDt;
          parama.cDs.cuQ = parambi.field_msgId;
          parama.cDs.cDu = parambi.field_talker;
          com.tencent.mm.sdk.b.a.xxA.m(parama);
        }
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && ((paramInt == 49) || (paramInt == 335544369) || (paramInt == 402653233) || (paramInt == 369098801)));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32857);
    paramView.getTag();
    Object localObject1 = parambi.field_content;
    boolean bool;
    if (localObject1 == null)
    {
      bool = false;
      AppMethodBeat.o(32857);
    }
    label648: label809: label1457: label2357: 
    while (true)
    {
      return bool;
      Object localObject2 = j.b.me((String)localObject1);
      label1465: label4796: if (localObject2 == null)
      {
        bool = false;
        AppMethodBeat.o(32857);
      }
      else
      {
        localObject1 = com.tencent.mm.pluginsdk.model.app.g.bT(((j.b)localObject2).appId, true);
        if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appId)))
          a(parama, (j.b)localObject2, r.Yz(), (com.tencent.mm.pluginsdk.model.app.f)localObject1, parambi.field_msgSvrId, parama.getTalkerUserName());
        switch (((j.b)localObject2).type)
        {
        default:
        case 6:
        case 3:
        case 4:
        case 5:
        case 33:
        case 44:
        case 36:
        case 7:
        case 10:
        case 20:
        case 13:
        case 16:
        case 19:
        case 24:
        case 34:
        }
        label865: label1775: 
        while (true)
          label240: if ((((j.b)localObject2).url != null) && (!((j.b)localObject2).url.equals("")))
          {
            int i;
            Object localObject3;
            Object localObject4;
            if (!bo.isNullOrNil(((j.b)localObject2).canvasPageXml))
            {
              paramView = new Intent();
              paramView.putExtra("sns_landig_pages_from_source", 5);
              paramView.putExtra("msg_id", parambi.field_msgId);
              paramView.putExtra("sns_landing_pages_xml", ((j.b)localObject2).canvasPageXml);
              paramView.putExtra("sns_landing_pages_share_thumb_url", parambi.field_imgPath);
              paramView.addFlags(268435456);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", paramView);
              bool = true;
              AppMethodBeat.o(32857);
              break;
              aw.ZK();
              if (!com.tencent.mm.model.c.isSDCardAvailable())
              {
                com.tencent.mm.ui.base.t.hO(parama.yTx.getContext());
                bool = true;
                AppMethodBeat.o(32857);
                break;
              }
              if (bo.any(((j.b)localObject2).fgp))
              {
                long l = parambi.field_msgId;
                localObject2 = ((j.b)localObject2).csD;
                paramView = com.tencent.mm.pluginsdk.model.app.am.aUq().aiE((String)localObject2);
                if ((paramView == null) || (!paramView.bCR()))
                  i = 0;
                while (true)
                {
                  if (i == 0)
                    break label648;
                  bool = true;
                  AppMethodBeat.o(32857);
                  break;
                  aw.ZK();
                  localObject1 = com.tencent.mm.model.c.XO().jf(l);
                  if (((bi)localObject1).dtH())
                  {
                    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgTo", "openImg:: msg is clean, attachId %s, msgId: %d, msgSvrId: %d, imgPath: %s", new Object[] { localObject2, Long.valueOf(l), Long.valueOf(((cy)localObject1).field_msgSvrId), ((cy)localObject1).field_imgPath });
                    paramView = new Intent();
                    paramView.setClassName(this.yJI.yTx.getContext(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
                    paramView.putExtra("clean_view_type", 1);
                    this.yJI.startActivity(paramView);
                    i = 1;
                  }
                  else
                  {
                    localObject1 = new Intent(this.yJI.yTx.getContext(), ShowImageUI.class);
                    ((Intent)localObject1).putExtra("key_image_path", paramView.field_fileFullPath);
                    ((Intent)localObject1).putExtra("key_message_id", l);
                    ((Intent)localObject1).putExtra("key_favorite", true);
                    this.yJI.startActivity((Intent)localObject1);
                    i = 1;
                  }
                }
              }
              paramView = new Intent();
              paramView.setClassName(parama.yTx.getContext(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
              paramView.putExtra("app_msg_id", parambi.field_msgId);
              parama.startActivity(paramView);
              bool = true;
              AppMethodBeat.o(32857);
              break;
              com.tencent.mm.plugin.report.service.h.pYm.e(13043, new Object[] { Integer.valueOf(2), ((j.b)localObject2).description, ((j.b)localObject2).appId });
              if (a(parama, (j.b)localObject2, parambi))
              {
                bool = true;
                AppMethodBeat.o(32857);
                break;
              }
              localObject3 = com.tencent.mm.pluginsdk.model.app.p.B(((j.b)localObject2).url, "message");
              localObject4 = com.tencent.mm.pluginsdk.model.app.p.B(((j.b)localObject2).fgn, "message");
              localObject1 = getPackageInfo(parama.yTx.getContext(), ((j.b)localObject2).appId);
              if (localObject1 == null)
              {
                paramView = null;
                if (localObject1 != null)
                  break label865;
              }
              for (i = 0; ; i = ((PackageInfo)localObject1).versionCode)
              {
                a(parama, (String)localObject3, (String)localObject4, paramView, i, ((j.b)localObject2).appId, true, parambi.field_msgId, parambi.field_msgSvrId, parambi);
                bool = true;
                AppMethodBeat.o(32857);
                break;
                paramView = ((PackageInfo)localObject1).versionName;
                break label809;
              }
              if (!bo.isNullOrNil(((j.b)localObject2).canvasPageXml))
              {
                paramView = new Intent();
                paramView.putExtra("sns_landig_pages_from_source", 5);
                paramView.putExtra("msg_id", parambi.field_msgId);
                paramView.putExtra("sns_landing_pages_xml", ((j.b)localObject2).canvasPageXml);
                paramView.putExtra("sns_landing_pages_share_thumb_url", parambi.field_imgPath);
                paramView.addFlags(268435456);
                com.tencent.mm.bp.d.b(parama.yTx.getContext(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", paramView);
                bool = true;
                AppMethodBeat.o(32857);
                break;
              }
              localObject1 = (com.tencent.mm.plugin.websearch.api.ab)((j.b)localObject2).X(com.tencent.mm.plugin.websearch.api.ab.class);
              if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.websearch.api.ab)localObject1).uaa)))
              {
                paramView = new cvi();
                paramView.uaa = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uaa;
                paramView.uab = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uab;
                paramView.uac = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uac;
                paramView.uad = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uad;
                paramView.uae = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uae;
                paramView.uai = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uai;
                paramView.lvz = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).lvz;
                paramView.lvA = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).lvA;
                paramView.qVw = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).qVw;
                paramView.uaf = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uaf;
                paramView.uag = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uag;
                paramView.uah = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uah;
                paramView.source = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).source;
                paramView.phw = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).phw;
                paramView.uaj = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uaj;
                paramView.ual = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).ual;
                paramView.uam = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uam;
                paramView.uan = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uan;
                paramView.uak = ((com.tencent.mm.plugin.websearch.api.ab)localObject1).uak;
                localObject1 = com.tencent.mm.plugin.topstory.a.g.a(paramView, 32, parama.yTx.getContext().getString(2131300133));
                aa.a(parama.yTx.getContext(), (chv)localObject1);
                com.tencent.mm.plugin.topstory.a.h.a(paramView, parambi);
                bool = true;
                AppMethodBeat.o(32857);
                break;
              }
              if ((((j.b)localObject2).url != null) && (!((j.b)localObject2).url.equals("")))
              {
                localObject4 = ((j.b)localObject2).url;
                label1275: PackageInfo localPackageInfo;
                if (parama.dFx())
                {
                  localObject1 = "groupmessage";
                  localObject4 = com.tencent.mm.pluginsdk.model.app.p.B((String)localObject4, (String)localObject1);
                  localObject1 = ((j.b)localObject2).fgn;
                  localPackageInfo = getPackageInfo(parama.yTx.getContext(), ((j.b)localObject2).appId);
                  localObject3 = new Intent();
                  ((Intent)localObject3).putExtra("rawUrl", (String)localObject4);
                  ((Intent)localObject3).putExtra("webpageTitle", ((j.b)localObject2).title);
                  Bundle localBundle = new Bundle();
                  localBundle.putString("key_snsad_statextstr", ((j.b)localObject2).cMn);
                  if ((((j.b)localObject2).appId != null) && (("wx751a1acca5688ba3".equals(((j.b)localObject2).appId)) || ("wxfbc915ff7c30e335".equals(((j.b)localObject2).appId)) || ("wx482a4001c37e2b74".equals(((j.b)localObject2).appId))))
                    localBundle.putString("jsapi_args_appid", ((j.b)localObject2).appId);
                  ((Intent)localObject3).putExtra("jsapiargs", localBundle);
                  if (bo.isNullOrNil((String)localObject1))
                    break label2054;
                  ((Intent)localObject3).putExtra("shortUrl", (String)localObject1);
                  if (localPackageInfo != null)
                    break label2071;
                  localObject1 = null;
                  ((Intent)localObject3).putExtra("version_name", (String)localObject1);
                  if (localPackageInfo != null)
                    break label2081;
                  i = 0;
                  ((Intent)localObject3).putExtra("version_code", i);
                  if (!bo.isNullOrNil(((j.b)localObject2).cMg))
                  {
                    ((Intent)localObject3).putExtra("srcUsername", ((j.b)localObject2).cMg);
                    ((Intent)localObject3).putExtra("srcDisplayname", ((j.b)localObject2).cMh);
                  }
                  ((Intent)localObject3).putExtra("msg_id", parambi.field_msgId);
                  ((Intent)localObject3).putExtra("KPublisherId", "msg_" + Long.toString(parambi.field_msgSvrId));
                  ((Intent)localObject3).putExtra("KAppId", ((j.b)localObject2).appId);
                  ((Intent)localObject3).putExtra("geta8key_username", parama.getTalkerUserName());
                  ((Intent)localObject3).putExtra("pre_username", b(parama, parambi));
                  ((Intent)localObject3).putExtra("from_scence", 2);
                  i = u.ad(b(parama, parambi), parama.getTalkerUserName());
                  ((Intent)localObject3).putExtra("prePublishId", "msg_" + Long.toString(parambi.field_msgSvrId));
                  ((Intent)localObject3).putExtra("preUsername", b(parama, parambi));
                  ((Intent)localObject3).putExtra("preChatName", parama.getTalkerUserName());
                  ((Intent)localObject3).putExtra("preChatTYPE", i);
                  ((Intent)localObject3).putExtra("preMsgIndex", 0);
                  switch (i)
                  {
                  case 3:
                  case 4:
                  case 5:
                  default:
                    i = 0;
                    ((Intent)localObject3).putExtra("share_report_pre_msg_url", ((j.b)localObject2).url);
                    ((Intent)localObject3).putExtra("share_report_pre_msg_title", ((j.b)localObject2).title);
                    ((Intent)localObject3).putExtra("share_report_pre_msg_desc", ((j.b)localObject2).description);
                    ((Intent)localObject3).putExtra("share_report_pre_msg_icon_url", ((j.b)localObject2).thumburl);
                    ((Intent)localObject3).putExtra("share_report_pre_msg_appid", ((j.b)localObject2).appId);
                    ((Intent)localObject3).putExtra("share_report_from_scene", i);
                    if (i == 5)
                      ((Intent)localObject3).putExtra("share_report_biz_username", parama.getTalkerUserName());
                    localObject1 = (com.tencent.mm.af.e)((j.b)localObject2).X(com.tencent.mm.af.e.class);
                    if (localObject1 == null)
                      break;
                  case 2:
                  case 1:
                  case 6:
                  case 7:
                  }
                }
                int j;
                for (i = ((com.tencent.mm.af.e)localObject1).ffZ; ; i = -1)
                {
                  ((Intent)localObject3).putExtra(e.m.ygo, i);
                  j = parama.yTx.getContext().getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
                  if ((localObject1 == null) || (i != 5) || (((com.tencent.mm.af.e)localObject1).fgb != 1) || (!((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVP()))
                    break label2115;
                  localObject1 = new Bundle();
                  ((Bundle)localObject1).putInt("biz_video_scene", 1);
                  ((Bundle)localObject1).putInt("biz_video_subscene", j);
                  ((Bundle)localObject1).putInt("geta8key_scene", 1);
                  com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c.a(parama.yTx.getContext(), parambi.field_msgId, parambi.field_msgSvrId, 0, paramView.findViewById(2131822444), (Bundle)localObject1);
                  bool = true;
                  AppMethodBeat.o(32857);
                  break;
                  localObject1 = "singlemessage";
                  break label1275;
                  ((Intent)localObject3).putExtra("shortUrl", ((j.b)localObject2).url);
                  break label1457;
                  localObject1 = localPackageInfo.versionName;
                  break label1465;
                  i = localPackageInfo.versionCode;
                  break label1484;
                  i = 2;
                  break label1775;
                  i = 3;
                  break label1775;
                  i = 5;
                  break label1775;
                }
                if ((((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(3)) && (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a(parama.yTx.getContext(), (String)localObject4, i, 1, j, (Intent)localObject3)))
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgTo", "jump to TmplWebview");
                  bool = true;
                  AppMethodBeat.o(32857);
                  break;
                }
                com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject3);
              }
              bool = true;
              AppMethodBeat.o(32857);
              break;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgTo", "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s", new Object[] { ((j.b)localObject2).fiP, ((j.b)localObject2).fiO, ((j.b)localObject2).fiQ, ((j.b)localObject2).url, Integer.valueOf(((j.b)localObject2).fiZ), ((j.b)localObject2).fiS });
              if ((44 == ((j.b)localObject2).type) && ((!((j.b)localObject2).cw(false)) || (bo.isNullOrNil(((j.b)localObject2).p(parama.yTx.getContext(), false)))))
                continue;
              localObject4 = parama.getTalkerUserName();
              localObject1 = b(parama, parambi);
              localObject3 = new Bundle();
              if ((parama.yTx instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI))
              {
                i = 10;
                ((Bundle)localObject3).putInt("stat_scene", i);
                ((Bundle)localObject3).putString("stat_msg_id", "msg_" + Long.toString(parambi.field_msgSvrId));
                ((Bundle)localObject3).putString("stat_chat_talker_username", (String)localObject4);
                ((Bundle)localObject3).putString("stat_send_msg_user", (String)localObject1);
                switch (((j.b)localObject2).fiR)
                {
                default:
                  i = 1;
                case 1:
                case 0:
                case 2:
                case 3:
                }
              }
              while (true)
              {
                if (i != 0)
                  break label240;
                bool = true;
                AppMethodBeat.o(32857);
                break;
                if (parama.dFx())
                {
                  i = 2;
                  break label2357;
                }
                if (com.tencent.mm.model.t.mZ((String)localObject4))
                {
                  i = 7;
                  break label2357;
                }
                i = 1;
                break label2357;
                paramView = new Intent();
                paramView.putExtra("key_username", ((j.b)localObject2).fiP);
                if (parama.dFx())
                {
                  paramView.putExtra("key_from_scene", 1);
                  paramView.putExtra("key_scene_note", parama.getTalkerUserName() + ":" + (String)localObject1);
                }
                while (true)
                {
                  paramView.putExtra("_stat_obj", (Bundle)localObject3);
                  localObject1 = new WxaExposedParams.a();
                  ((WxaExposedParams.a)localObject1).appId = ((j.b)localObject2).fiQ;
                  ((WxaExposedParams.a)localObject1).from = 6;
                  ((WxaExposedParams.a)localObject1).gVt = ((j.b)localObject2).fiZ;
                  ((WxaExposedParams.a)localObject1).gVu = ((j.b)localObject2).fiT;
                  paramView.putExtra("key_scene_exposed_params", ((WxaExposedParams.a)localObject1).ayP());
                  com.tencent.mm.bp.d.b(parama.yTx.getContext(), "appbrand", ".ui.AppBrandProfileUI", paramView);
                  i = 0;
                  break;
                  paramView.putExtra("key_from_scene", 2);
                  paramView.putExtra("key_scene_note", (String)localObject4);
                }
                if ((parama.yTx instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI))
                {
                  com.tencent.mm.modelappbrand.a.a((String)localObject4, 1073, (j.b)localObject2, (Bundle)localObject3);
                  i = 0;
                }
                else if (com.tencent.mm.model.t.mZ((String)localObject4))
                {
                  com.tencent.mm.modelappbrand.a.a((String)localObject4, 1074, (j.b)localObject2, (Bundle)localObject3);
                  i = 0;
                }
                else
                {
                  com.tencent.mm.modelappbrand.a.a((String)localObject4, (String)localObject1, parama.dFx(), (j.b)localObject2, (Bundle)localObject3);
                  i = 0;
                  continue;
                  com.tencent.mm.modelappbrand.a.b((String)localObject4, (String)localObject1, parama.dFx(), (j.b)localObject2, (Bundle)localObject3);
                  i = 0;
                }
              }
              if ((bo.isNullOrNil(((j.b)localObject2).fiQ)) && (bo.isNullOrNil(((j.b)localObject2).fiP)))
              {
                parambi = ((j.b)localObject2).url;
                if (parama.dFx());
                for (paramView = "groupmessage"; ; paramView = "singlemessage")
                {
                  paramView = com.tencent.mm.pluginsdk.model.app.p.B(parambi, paramView);
                  parambi = new Intent();
                  parambi.putExtra("rawUrl", paramView);
                  parambi.putExtra("webpageTitle", ((j.b)localObject2).title);
                  parambi.putExtra("shortUrl", ((j.b)localObject2).url);
                  com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", parambi);
                  bool = true;
                  AppMethodBeat.o(32857);
                  break;
                }
              }
              localObject1 = parama.getTalkerUserName();
              paramView = b(parama, parambi);
              localObject4 = new Bundle();
              if (parama.dFx())
                i = 2;
              while (true)
              {
                ((Bundle)localObject4).putInt("stat_scene", i);
                ((Bundle)localObject4).putString("stat_msg_id", "msg_" + Long.toString(parambi.field_msgSvrId));
                ((Bundle)localObject4).putString("stat_chat_talker_username", (String)localObject1);
                ((Bundle)localObject4).putString("stat_send_msg_user", paramView);
                ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(parama.yTx.getContext(), parama.getTalkerUserName(), b(parama, parambi), parama.dFx(), (j.b)localObject2);
                bool = true;
                AppMethodBeat.o(32857);
                break;
                if (com.tencent.mm.model.t.mZ((String)localObject1))
                  i = 7;
                else
                  i = 1;
              }
              if ((localObject1 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject1).xy()) && (a(parama, (com.tencent.mm.pluginsdk.model.app.f)localObject1)))
              {
                bool = true;
                AppMethodBeat.o(32857);
                break;
              }
              ((com.tencent.mm.ui.chatting.c.b.b)parama.aF(com.tencent.mm.ui.chatting.c.b.b.class)).a(parambi, new d.e.7(this, (com.tencent.mm.pluginsdk.model.app.f)localObject1, parama, (j.b)localObject2, parambi));
              bool = true;
              AppMethodBeat.o(32857);
              break;
              if (bo.isNullOrNil(((j.b)localObject2).fgQ))
              {
                bool = false;
                AppMethodBeat.o(32857);
                break;
              }
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_Product_xml", ((j.b)localObject2).fgQ);
              paramView.putExtra("key_ProductUI_getProductInfoScene", 1);
              if (parambi.field_imgPath == null)
                paramView.putExtra("key_ProductUI_chatting_msgId", parambi.field_msgId);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "scanner", ".ui.ProductUI", paramView);
              bool = true;
              AppMethodBeat.o(32857);
              break;
              if (bo.isNullOrNil(((j.b)localObject2).fgT))
              {
                bool = false;
                AppMethodBeat.o(32857);
                break;
              }
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_TV_xml", ((j.b)localObject2).fgT);
              paramView.putExtra("key_TV_getProductInfoScene", 1);
              if (parambi.field_imgPath == null)
                paramView.putExtra("key_TVInfoUI_chatting_msgId", parambi.field_msgId);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "shake", ".ui.TVInfoUI", paramView);
              bool = true;
              AppMethodBeat.o(32857);
              break;
              if (bo.isNullOrNil(((j.b)localObject2).fgW))
              {
                bool = false;
                AppMethodBeat.o(32857);
                break;
              }
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_product_info", ((j.b)localObject2).fgW);
              paramView.putExtra("key_product_scene", 1);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "product", ".ui.MallProductUI", paramView);
              bool = true;
              AppMethodBeat.o(32857);
              break;
              if (bo.isNullOrNil(((j.b)localObject2).cDt))
              {
                bool = false;
                AppMethodBeat.o(32857);
                break;
              }
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_card_app_msg", ((j.b)localObject2).cDt);
              paramView.putExtra("key_from_scene", ((j.b)localObject2).fhD);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "card", ".ui.CardDetailUI", paramView);
              bool = true;
              AppMethodBeat.o(32857);
              break;
              paramView = new Intent();
              paramView.putExtra("message_id", parambi.field_msgId);
              paramView.putExtra("record_xml", ((j.b)localObject2).fgU);
              i = u.ad(b(parama, parambi), parama.getTalkerUserName());
              paramView.putExtra("prePublishId", "msg_" + Long.toString(parambi.field_msgSvrId));
              paramView.putExtra("preUsername", b(parama, parambi));
              paramView.putExtra("preChatName", parama.getTalkerUserName());
              paramView.putExtra("preChatTYPE", i);
              d.a.a(paramView, parama, parambi, this);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "record", ".ui.RecordMsgDetailUI", paramView);
              bool = true;
              AppMethodBeat.o(32857);
              break;
              paramView = new lz();
              paramView.cHO.context = parama.yTx.getContext();
              paramView.cHO.cvx = parambi.field_msgId;
              paramView.cHO.cHc = parama.dFx();
              paramView.cHO.cHP = ((j.b)localObject2).fgU;
              paramView.cHO.scene = 6;
              com.tencent.mm.sdk.b.a.xxA.m(paramView);
              bool = true;
              AppMethodBeat.o(32857);
              break;
              paramView = new Intent();
              paramView.putExtra("key_biz_uin", ((j.b)localObject2).fhF);
              paramView.putExtra("key_order_id", ((j.b)localObject2).fhG);
              if ((parambi.field_talker != null) && (!parambi.field_talker.equals("")) && (com.tencent.mm.model.t.kH(parambi.field_talker)))
                paramView.putExtra("key_chatroom_name", parambi.field_talker);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "card", ".ui.CardGiftAcceptUI", paramView);
              bool = true;
              AppMethodBeat.o(32857);
              break;
            }
            paramView = (com.tencent.mm.plugin.websearch.api.ab)((j.b)localObject2).X(com.tencent.mm.plugin.websearch.api.ab.class);
            if ((paramView != null) && (!bo.isNullOrNil(paramView.uaa)))
            {
              localObject1 = new cvi();
              ((cvi)localObject1).uaa = paramView.uaa;
              ((cvi)localObject1).uab = paramView.uab;
              ((cvi)localObject1).uac = paramView.uac;
              ((cvi)localObject1).uad = paramView.uad;
              ((cvi)localObject1).uae = paramView.uae;
              ((cvi)localObject1).uai = paramView.uai;
              ((cvi)localObject1).lvz = paramView.lvz;
              ((cvi)localObject1).lvA = paramView.lvA;
              ((cvi)localObject1).qVw = paramView.qVw;
              ((cvi)localObject1).uaf = paramView.uaf;
              ((cvi)localObject1).uag = paramView.uag;
              ((cvi)localObject1).uah = paramView.uah;
              ((cvi)localObject1).source = paramView.source;
              ((cvi)localObject1).phw = paramView.phw;
              ((cvi)localObject1).uaj = paramView.uaj;
              ((cvi)localObject1).ual = paramView.ual;
              ((cvi)localObject1).uam = paramView.uam;
              ((cvi)localObject1).uan = paramView.uan;
              ((cvi)localObject1).uak = paramView.uak;
              paramView = com.tencent.mm.plugin.topstory.a.g.a((cvi)localObject1, 32, parama.yTx.getContext().getString(2131300133));
              aa.a(parama.yTx.getContext(), paramView);
              com.tencent.mm.plugin.topstory.a.h.a((cvi)localObject1, parambi);
              bool = true;
              AppMethodBeat.o(32857);
              break;
            }
            localObject1 = ((j.b)localObject2).url;
            if (parama.dFx())
            {
              paramView = "groupmessage";
              localObject3 = com.tencent.mm.pluginsdk.model.app.p.B((String)localObject1, paramView);
              paramView = ((j.b)localObject2).url;
              localObject1 = getPackageInfo(parama.yTx.getContext(), ((j.b)localObject2).appId);
              localObject4 = new Intent();
              ((Intent)localObject4).putExtra("rawUrl", (String)localObject3);
              ((Intent)localObject4).putExtra("webpageTitle", ((j.b)localObject2).title);
              if ((((j.b)localObject2).appId != null) && (("wx751a1acca5688ba3".equals(((j.b)localObject2).appId)) || ("wxfbc915ff7c30e335".equals(((j.b)localObject2).appId)) || ("wx482a4001c37e2b74".equals(((j.b)localObject2).appId))))
              {
                localObject3 = new Bundle();
                ((Bundle)localObject3).putString("jsapi_args_appid", ((j.b)localObject2).appId);
                ((Intent)localObject4).putExtra("jsapiargs", (Bundle)localObject3);
              }
              if (bo.isNullOrNil(paramView))
                break label4796;
              ((Intent)localObject4).putExtra("shortUrl", paramView);
              if (localObject1 != null)
                break label4813;
              paramView = null;
              label4339: ((Intent)localObject4).putExtra("version_name", paramView);
              if (localObject1 != null)
                break label4822;
              i = 0;
              ((Intent)localObject4).putExtra("version_code", i);
              if (!bo.isNullOrNil(((j.b)localObject2).cMg))
              {
                ((Intent)localObject4).putExtra("srcUsername", ((j.b)localObject2).cMg);
                ((Intent)localObject4).putExtra("srcDisplayname", ((j.b)localObject2).cMh);
              }
              ((Intent)localObject4).putExtra("msg_id", parambi.field_msgId);
              ((Intent)localObject4).putExtra("KPublisherId", "msg_" + Long.toString(parambi.field_msgSvrId));
              ((Intent)localObject4).putExtra("KAppId", ((j.b)localObject2).appId);
              ((Intent)localObject4).putExtra("geta8key_username", parama.getTalkerUserName());
              ((Intent)localObject4).putExtra("pre_username", b(parama, parambi));
              ((Intent)localObject4).putExtra("from_scence", 2);
              ((Intent)localObject4).putExtra("expid_str", parambi.dJE);
              i = u.ad(b(parama, parambi), parama.getTalkerUserName());
              ((Intent)localObject4).putExtra("prePublishId", "msg_" + Long.toString(parambi.field_msgSvrId));
              ((Intent)localObject4).putExtra("preUsername", b(parama, parambi));
              ((Intent)localObject4).putExtra("preChatName", parama.getTalkerUserName());
              ((Intent)localObject4).putExtra("preChatTYPE", i);
              ((Intent)localObject4).putExtra("preMsgIndex", 0);
              switch (i)
              {
              case 3:
              case 4:
              case 5:
              default:
                i = 0;
              case 2:
              case 1:
              case 6:
              case 7:
              }
            }
            while (true)
            {
              ((Intent)localObject4).putExtra("share_report_pre_msg_url", ((j.b)localObject2).url);
              ((Intent)localObject4).putExtra("share_report_pre_msg_title", ((j.b)localObject2).title);
              ((Intent)localObject4).putExtra("share_report_pre_msg_desc", ((j.b)localObject2).description);
              ((Intent)localObject4).putExtra("share_report_pre_msg_icon_url", ((j.b)localObject2).thumburl);
              ((Intent)localObject4).putExtra("share_report_pre_msg_appid", ((j.b)localObject2).appId);
              ((Intent)localObject4).putExtra("share_report_from_scene", i);
              if (i == 5)
                ((Intent)localObject4).putExtra("share_report_biz_username", parama.getTalkerUserName());
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject4);
              bool = true;
              AppMethodBeat.o(32857);
              break;
              paramView = "singlemessage";
              break label4167;
              ((Intent)localObject4).putExtra("shortUrl", ((j.b)localObject2).url);
              break label4332;
              paramView = ((PackageInfo)localObject1).versionName;
              break label4339;
              i = ((PackageInfo)localObject1).versionCode;
              break label4357;
              i = 2;
              continue;
              i = 3;
              continue;
              i = 5;
            }
          }
        label1484: label4332: bool = false;
        label2115: label4167: label4813: label4822: AppMethodBeat.o(32857);
      }
    }
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.e
 * JD-Core Version:    0.6.2
 */