package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.se.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.modelappbrand.k;
import com.tencent.mm.modelstat.a.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;

public final class s$a extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33047);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969058);
      ((View)localObject).setTag(new s.d().C((View)localObject, true));
    }
    AppMethodBeat.o(33047);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33048);
    this.yJI = parama1;
    s.d locald = (s.d)parama;
    parama = (com.tencent.mm.ui.chatting.c.b.j)parama1.aF(com.tencent.mm.ui.chatting.c.b.j.class);
    parama.be(parambi);
    parama.bf(parambi);
    parama.bg(parambi);
    parama = parambi.field_content;
    ay localay;
    Object localObject;
    if (parama != null)
    {
      parama = j.b.X(parama, parambi.field_reserved);
      localay = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
      if (parama != null)
      {
        locald.zbS.setVisibility(8);
        locald.zbR.setVisibility(8);
        locald.zcq.setVisibility(8);
        paramString = (com.tencent.mm.af.g)parama.X(com.tencent.mm.af.g.class);
        localObject = locald.zbV;
        if (paramString != null)
          break label901;
        paramString = null;
        label148: if (!((ChattingItemFooter)localObject).l(paramString, parambi.field_talker))
          break label911;
        locald.jPL.setBackgroundResource(2130838230);
        label173: localObject = com.tencent.mm.pluginsdk.model.app.g.dX(parama.appId, parama.axy);
        if (localObject != null)
          b(parama1, parama, parambi);
        if ((parama.dJv != null) && (parama.dJv.length() != 0))
          break label925;
        locald.zbU.setVisibility(8);
        label225: WxaAttributes localWxaAttributes = ((d)com.tencent.mm.kernel.g.K(d.class)).zb(parama.fiP);
        locald.zbX.setVisibility(0);
        locald.zbO.setVisibility(8);
        locald.zca.setVisibility(0);
        locald.zbY.setVisibility(8);
        if (localWxaAttributes == null)
          break label954;
        paramString = localWxaAttributes.field_nickname;
        label294: locald.zco.setText(paramString);
        if (localWxaAttributes == null)
          break label963;
        paramString = localWxaAttributes.field_smallHeadURL;
        label316: o.ahp().a(paramString, locald.zcn, s.d.zel);
        locald.zcq.setVisibility(0);
        locald.zcm.setVisibility(8);
        locald.zcm.setText(parama.description);
        locald.zct.setText(parama.title);
        switch (parama.fiZ)
        {
        default:
          locald.zcp.setText(2131296613);
          label410: o.ahp().a(paramString, locald.zcn, s.d.zel);
          if (!parama1.dFx())
            if (com.tencent.mm.pluginsdk.model.app.g.h((f)localObject))
            {
              locald.zbW.setVisibility(0);
              c(parama1, locald.zbW, ay.a(parama, parambi));
            }
          break;
        case 1:
        case 2:
        }
      }
    }
    while (true)
    {
      parambi = o.ahl().c(parambi.field_imgPath, false, true);
      locald.zcr.setImageBitmap(null);
      locald.zcr.setVisibility(4);
      locald.zcs.setVisibility(0);
      com.tencent.mm.modelappbrand.a.b.abR().a(new s.a.1(this, locald), "file://".concat(String.valueOf(parambi)), null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(240, 192));
      locald.zet.setVisibility(8);
      locald.zet.setTag(bo.bc(parama.fiV, ""));
      locald.zeu.setVisibility(8);
      localObject = (com.tencent.mm.af.a)parama.X(com.tencent.mm.af.a.class);
      if ((localObject != null) && (((com.tencent.mm.af.a)localObject).ffb))
      {
        parambi = parama.fiV;
        paramString = ((k)com.tencent.mm.kernel.g.K(k.class)).pn(parambi);
        s.a(parama1, locald, (com.tencent.mm.af.a)localObject, paramString);
        s.a(parama1, locald, (com.tencent.mm.af.a)localObject, parama, paramString);
        int i = ((com.tencent.mm.af.a)localObject).ffi;
        paramInt = i;
        if (paramString != null)
        {
          paramInt = i;
          if (paramString.field_updatePeroid != 0)
            paramInt = paramString.field_updatePeroid;
        }
        if (paramInt > 0)
          ((k)com.tencent.mm.kernel.g.K(k.class)).a(s.e.bE(parama1), parama.fiQ, parambi, paramInt, new s.a.2(this, locald, (com.tencent.mm.af.a)localObject));
      }
      locald.jPL.setTag(localay);
      locald.jPL.setOnClickListener(d(parama1));
      paramString = com.tencent.mm.model.v.Zp().y(s.e.bE(parama1), true);
      parambi = (s.c)paramString.get("listener", null);
      parama = parambi;
      if (parambi == null)
      {
        parama = new s.c();
        paramString.j("listener", parama);
      }
      parama.k(parama1);
      if (this.kuU)
      {
        locald.jPL.setOnLongClickListener(c(parama1));
        locald.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
      }
      AppMethodBeat.o(33048);
      return;
      ab.e("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "amessage, msgid:%s, user:%s", new Object[] { Long.valueOf(parambi.field_msgId), paramString });
      parama = null;
      break;
      label901: paramString = paramString.fgf;
      break label148;
      label911: locald.jPL.setBackgroundResource(2130838218);
      break label173;
      label925: locald.zbU.setVisibility(0);
      b(parama1, locald.zbU, ay.arL(parama.dJv));
      break label225;
      label954: paramString = parama.cMh;
      break label294;
      label963: paramString = parama.fjb;
      break label316;
      locald.zcp.setText(2131296837);
      break label410;
      locald.zcp.setText(2131296836);
      break label410;
      locald.zbW.setVisibility(8);
      continue;
      locald.zbW.setVisibility(8);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33049);
    int i = ((ay)paramView.getTag()).position;
    j.b localb = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    Object localObject;
    if ((com.tencent.mm.pluginsdk.model.app.g.i(com.tencent.mm.pluginsdk.model.app.g.bT(localb.appId, false))) && (!com.tencent.mm.ui.chatting.j.aA(parambi)))
    {
      if (localb.type != 6)
        break label263;
      localObject = l.aiM(localb.csD);
      if (((localObject == null) || (!d.b.e(parambi, ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath))) && (!parambi.dtH()))
        paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
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
      AppMethodBeat.o(33049);
      return true;
      label263: paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33050);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33050);
    case 111:
    }
    while (true)
    {
      return false;
      d.b.a(parama, parambi, b(parama, parambi));
      AppMethodBeat.o(33050);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 587202609));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(33051);
    com.tencent.mm.modelstat.a.a(parambi, a.a.fQX);
    if (parambi.field_content == null)
      AppMethodBeat.o(33051);
    while (true)
    {
      return bool;
      paramView = j.b.me(bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
      if (paramView != null)
        break;
      AppMethodBeat.o(33051);
    }
    Object localObject1 = com.tencent.mm.pluginsdk.model.app.g.bT(paramView.appId, false);
    if (localObject1 != null)
      a(parama, paramView, d(parama, parambi), (f)localObject1, parambi.field_msgSvrId, parama.getTalkerUserName());
    ab.i("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s", new Object[] { paramView.fiP, paramView.fiO, paramView.fiQ, paramView.url, Integer.valueOf(paramView.fiZ), paramView.fiS });
    localObject1 = new se();
    ((se)localObject1).cOf.appId = paramView.fiQ;
    ((se)localObject1).cOf.userName = paramView.fiP;
    ((se)localObject1).cOf.cOh = paramView.fiO;
    ((se)localObject1).cOf.cOi = paramView.fiZ;
    ((se)localObject1).cOf.cOk = paramView.fiS;
    ((se)localObject1).cOf.axy = paramView.fja;
    Object localObject2 = ((se)localObject1).cOf;
    label256: StringBuilder localStringBuilder;
    if (paramView.fiZ != 0)
    {
      bool = true;
      ((se.a)localObject2).cOl = bool;
      ((se)localObject1).cOf.cOn.bQh = parama.getTalkerUserName();
      ((se)localObject1).cOf.cOn.bQi = paramView.fiV;
      localObject2 = paramView.fiU;
      if (!parama.dFx())
        break label413;
      ((se)localObject1).cOf.scene = 1008;
      localStringBuilder = new StringBuilder(parama.getTalkerUserName());
      localStringBuilder.append(":");
      localStringBuilder.append(b(parama, parambi));
      localStringBuilder.append(":");
      localStringBuilder.append((String)localObject2);
    }
    for (((se)localObject1).cOf.cst = localStringBuilder.toString(); ; ((se)localObject1).cOf.cst = parambi.toString())
    {
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      s.a(parama, paramView);
      AppMethodBeat.o(33051);
      bool = true;
      break;
      bool = false;
      break label256;
      label413: ((se)localObject1).cOf.scene = 1007;
      parambi = new StringBuilder(b(parama, parambi));
      parambi.append(":");
      parambi.append((String)localObject2);
    }
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.s.a
 * JD-Core Version:    0.6.2
 */