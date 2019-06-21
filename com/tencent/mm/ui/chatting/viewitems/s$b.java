package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.ii;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.se.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.modelappbrand.k;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.s.n;

public final class s$b extends c
  implements s.n
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33055);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969095);
      ((View)localObject).setTag(new s.d().C((View)localObject, false));
    }
    AppMethodBeat.o(33055);
    return localObject;
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33060);
    if (parambi.bAA())
    {
      l.al(parambi);
      bf.fm(parambi.field_msgId);
      parama.qp(true);
      AppMethodBeat.o(33060);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(33060);
    }
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33056);
    s.d locald = (s.d)parama;
    this.yJI = parama1;
    parama = (com.tencent.mm.ui.chatting.c.b.j)parama1.aF(com.tencent.mm.ui.chatting.c.b.j.class);
    parama.bg(parambi);
    paramString = parambi.field_content;
    parama.be(parambi);
    if (paramString != null);
    for (parama = j.b.X(paramString, parambi.field_reserved); ; parama = null)
    {
      ay localay = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
      Object localObject;
      if (parama != null)
      {
        locald.zbS.setVisibility(8);
        locald.zbR.setVisibility(8);
        locald.zbO.setVisibility(8);
        locald.zcq.setVisibility(8);
        localObject = ((d)com.tencent.mm.kernel.g.K(d.class)).zb(parama.fiP);
        if (localObject == null)
          break label773;
        paramString = ((WxaAttributes)localObject).field_nickname;
        if (localObject == null)
          break label782;
        localObject = ((WxaAttributes)localObject).field_smallHeadURL;
        label170: locald.zcq.setVisibility(0);
        locald.zcm.setVisibility(8);
        locald.zct.setText(parama.title);
        locald.zcm.setText(parama.description);
        locald.zco.setText(paramString);
        switch (parama.fiZ)
        {
        default:
          locald.zcp.setText(2131296613);
          label258: o.ahp().a((String)localObject, locald.zcn, s.d.zel);
          if (dHm())
          {
            paramString = (h)parama1.aF(h.class);
            if ((parambi.field_status == 2) && (a(paramString, parambi.field_msgId)))
            {
              if (locald.zci != null)
                locald.zci.setVisibility(0);
              label330: if (locald.pyf != null)
                locald.pyf.setVisibility(8);
            }
          }
          break;
        case 1:
        case 2:
        }
      }
      while (true)
      {
        paramString = o.ahl().c(parambi.field_imgPath, false, true);
        locald.zcr.setImageBitmap(null);
        locald.zcr.setVisibility(4);
        locald.zcs.setVisibility(0);
        com.tencent.mm.modelappbrand.a.b.abR().a(new s.b.1(this, locald), "file://".concat(String.valueOf(paramString)), null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(240, 192));
        locald.zet.setVisibility(8);
        locald.zet.setTag(bo.bc(parama.fiV, ""));
        locald.zeu.setVisibility(8);
        localObject = (com.tencent.mm.af.a)parama.X(com.tencent.mm.af.a.class);
        if ((localObject != null) && (((com.tencent.mm.af.a)localObject).ffb))
        {
          String str = parama.fiV;
          paramString = ((k)com.tencent.mm.kernel.g.K(k.class)).pn(str);
          s.a(parama1, locald, (com.tencent.mm.af.a)localObject, paramString);
          s.a(parama1, locald, (com.tencent.mm.af.a)localObject, parama, paramString);
          int i = ((com.tencent.mm.af.a)localObject).ffi;
          int j = i;
          if (paramString != null)
          {
            j = i;
            if (paramString.field_updatePeroid != 0)
              j = paramString.field_updatePeroid;
          }
          if (j > 0)
            ((k)com.tencent.mm.kernel.g.K(k.class)).a(s.e.bE(parama1), parama.fiQ, str, j, new s.b.2(this, locald, (com.tencent.mm.af.a)localObject));
        }
        locald.jPL.setTag(localay);
        locald.jPL.setOnClickListener(d(parama1));
        localObject = com.tencent.mm.model.v.Zp().y(s.e.bE(parama1), true);
        paramString = (s.c)((v.b)localObject).get("listener", null);
        parama = paramString;
        if (paramString == null)
        {
          parama = new s.c();
          ((v.b)localObject).j("listener", parama);
        }
        parama.k(parama1);
        if (this.kuU)
        {
          locald.jPL.setOnLongClickListener(c(parama1));
          locald.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
        }
        a(paramInt, locald, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
        AppMethodBeat.o(33056);
        return;
        label773: paramString = parama.cMh;
        break;
        label782: localObject = parama.fjb;
        break label170;
        locald.zcp.setText(2131296837);
        break label258;
        locald.zcp.setText(2131296836);
        break label258;
        if (locald.zci == null)
          break label330;
        locald.zci.setVisibility(8);
        break label330;
        if (locald.pyf != null)
        {
          locald.pyf.setVisibility(0);
          if (parambi.field_status >= 2)
            locald.pyf.setVisibility(8);
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33057);
    int i = ((ay)paramView.getTag()).position;
    if (parambi.field_content == null)
      AppMethodBeat.o(33057);
    while (true)
    {
      return true;
      j.b localb = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
      if (localb == null)
      {
        AppMethodBeat.o(33057);
      }
      else
      {
        if ((com.tencent.mm.pluginsdk.model.app.g.i(com.tencent.mm.pluginsdk.model.app.g.bT(localb.appId, false))) && (!com.tencent.mm.ui.chatting.j.aA(parambi)))
          paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
        if (((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)))
          paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
        dq localdq = new dq();
        localdq.cxc.cvx = parambi.field_msgId;
        com.tencent.mm.sdk.b.a.xxA.m(localdq);
        if ((localdq.cxd.cwB) || (d.b.a(this.yJI.yTx.getContext(), localb)))
          paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
        AppMethodBeat.o(33057);
      }
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33058);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33058);
    case 111:
    case 103:
    }
    while (true)
    {
      return false;
      d.b.a(parama, parambi, b(parama, parambi));
      AppMethodBeat.o(33058);
      continue;
      paramMenuItem = parambi.field_content;
      if (paramMenuItem != null)
        break;
      AppMethodBeat.o(33058);
    }
    parama = j.b.me(paramMenuItem);
    if (parama != null)
      switch (parama.type)
      {
      default:
      case 16:
      }
    while (true)
    {
      AppMethodBeat.o(33058);
      break;
      paramMenuItem = new ii();
      paramMenuItem.cDs.cDt = parama.cDt;
      paramMenuItem.cDs.cuQ = parambi.field_msgId;
      paramMenuItem.cDs.cDu = parambi.field_talker;
      com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 587202609));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(33059);
    paramView.getTag();
    paramView = parambi.field_content;
    if (paramView == null)
      AppMethodBeat.o(33059);
    while (true)
    {
      return bool;
      paramView = j.b.me(paramView);
      if (paramView != null)
        break;
      AppMethodBeat.o(33059);
    }
    Object localObject1 = com.tencent.mm.pluginsdk.model.app.g.bT(paramView.appId, true);
    if ((localObject1 != null) && (!bo.isNullOrNil(((f)localObject1).field_appId)))
      a(parama, paramView, r.Yz(), (f)localObject1, parambi.field_msgSvrId, parama.getTalkerUserName());
    localObject1 = new se();
    ((se)localObject1).cOf.appId = paramView.fiQ;
    ((se)localObject1).cOf.userName = paramView.fiP;
    ((se)localObject1).cOf.cOh = paramView.fiO;
    ((se)localObject1).cOf.cOi = paramView.fiZ;
    ((se)localObject1).cOf.cOk = paramView.fiS;
    ((se)localObject1).cOf.axy = paramView.fja;
    Object localObject2 = ((se)localObject1).cOf;
    label192: StringBuilder localStringBuilder;
    if (paramView.fiZ != 0)
    {
      bool = true;
      ((se.a)localObject2).cOl = bool;
      localObject2 = paramView.fiU;
      if (!parama.dFx())
        break label349;
      ((se)localObject1).cOf.scene = 1008;
      localStringBuilder = new StringBuilder(parama.getTalkerUserName());
      localStringBuilder.append(":");
      localStringBuilder.append(b(parama, parambi));
      localStringBuilder.append(":");
      localStringBuilder.append((String)localObject2);
    }
    for (((se)localObject1).cOf.cst = localStringBuilder.toString(); ; ((se)localObject1).cOf.cst = parambi.toString())
    {
      ((se)localObject1).cOf.cOn.bQh = parama.getTalkerUserName();
      ((se)localObject1).cOf.cOn.bQi = paramView.fiV;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      s.a(parama, paramView);
      AppMethodBeat.o(33059);
      bool = true;
      break;
      bool = false;
      break label192;
      label349: ((se)localObject1).cOf.scene = 1007;
      parambi = new StringBuilder(b(parama, parambi));
      parambi.append(":");
      parambi.append((String)localObject2);
    }
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.s.b
 * JD-Core Version:    0.6.2
 */