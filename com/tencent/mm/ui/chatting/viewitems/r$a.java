package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
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
import com.tencent.mm.model.bh;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelappbrand.ac;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelstat.a.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.r.n;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

public final class r$a extends c
  implements com.tencent.mm.modelappbrand.f
{
  private com.tencent.mm.modelappbrand.ab hpp;
  private com.tencent.mm.ui.chatting.d.a yJI;

  public r$a()
  {
    AppMethodBeat.i(33022);
    this.hpp = new ac(this);
    AppMethodBeat.o(33022);
  }

  public final void F(View paramView, int paramInt)
  {
    AppMethodBeat.i(33028);
    Object localObject = paramView.getTag();
    if (!(localObject instanceof r.d))
      AppMethodBeat.o(33028);
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "onWidgetStateChanged(%s, state : %d)", new Object[] { Integer.valueOf(paramView.hashCode()), Integer.valueOf(paramInt) });
      paramView = (r.d)localObject;
      switch (paramInt)
      {
      case 2:
      case 3:
      default:
        paramView.iNB.dKT();
        paramView.iNB.setVisibility(4);
        paramView.zen.setVisibility(4);
        paramView.kuG.setVisibility(0);
        paramView.kuG.setImageResource(2131230877);
        AppMethodBeat.o(33028);
        break;
      case 0:
        paramView.iNB.setVisibility(0);
        paramView.iNB.dKS();
        paramView.kuG.setVisibility(4);
        paramView.zen.setVisibility(4);
        AppMethodBeat.o(33028);
        break;
      case 1:
        paramView.iNB.dKT();
        paramView.iNB.setVisibility(4);
        paramView.zen.setVisibility(4);
        paramView.kuG.setVisibility(0);
        paramView.kuG.setImageResource(2131231220);
        AppMethodBeat.o(33028);
        break;
      case 4:
        paramView.iNB.dKT();
        paramView.iNB.setVisibility(4);
        paramView.zen.setVisibility(0);
        paramView.kuG.setVisibility(4);
        AppMethodBeat.o(33028);
      }
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33023);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969059);
      paramLayoutInflater = new r.d().B((View)localObject, true);
      paramView = ((e)com.tencent.mm.kernel.g.K(e.class)).bS(((View)localObject).getContext());
      paramLayoutInflater.zen = paramView;
      paramLayoutInflater.zem.addView(paramView, new ViewGroup.LayoutParams(-1, -1));
      ((View)localObject).setTag(paramLayoutInflater);
    }
    AppMethodBeat.o(33023);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33024);
    this.yJI = parama1;
    r.d locald = (r.d)parama;
    Object localObject = parambi.field_content;
    parama = (com.tencent.mm.ui.chatting.c.b.j)parama1.aF(com.tencent.mm.ui.chatting.c.b.j.class);
    parama.be(parambi);
    parama.bf(parambi);
    parama.bg(parambi);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "filling Wxa dynamic from ChattingItem(%s)", new Object[] { paramString });
    ay localay;
    if (localObject != null)
    {
      parama = j.b.X((String)localObject, parambi.field_reserved);
      localay = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
      if (parama != null)
      {
        locald.zbS.setVisibility(8);
        locald.zbR.setVisibility(8);
        locald.zcq.setVisibility(8);
        paramString = (com.tencent.mm.af.g)parama.X(com.tencent.mm.af.g.class);
        localObject = locald.zbV;
        if (paramString != null)
          break label829;
        paramString = null;
        label167: if (!((ChattingItemFooter)localObject).l(paramString, parambi.field_talker))
          break label839;
        locald.jPL.setBackgroundResource(2130838230);
        label192: com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.dX(parama.appId, parama.axy);
        if (localf != null)
          b(parama1, parama, parambi);
        if ((parama.dJv != null) && (parama.dJv.length() != 0))
          break label853;
        locald.zbU.setVisibility(8);
        label244: localObject = ((d)com.tencent.mm.kernel.g.K(d.class)).zb(parama.fiP);
        locald.zbX.setVisibility(0);
        locald.zbO.setVisibility(8);
        locald.zca.setVisibility(0);
        locald.zbY.setVisibility(8);
        if (localObject == null)
          break label882;
        paramString = ((WxaAttributes)localObject).field_nickname;
        label314: if (localObject == null)
          break label891;
        localObject = ((WxaAttributes)localObject).field_smallHeadURL;
        label326: locald.zcq.setVisibility(0);
        locald.zcm.setVisibility(8);
        locald.zct.setText(parama.title);
        locald.zcm.setText(parama.description);
        locald.zco.setText(paramString);
        switch (parama.fiZ)
        {
        default:
          locald.zcp.setText(2131296613);
          label415: o.ahp().a((String)localObject, locald.zcn, r.d.zel);
          if (!parama1.dFx())
            if (com.tencent.mm.pluginsdk.model.app.g.h(localf))
            {
              locald.zbW.setVisibility(0);
              c(parama1, locald.zbW, ay.a(parama, parambi));
              label470: localObject = (com.tencent.mm.af.a)parama.X(com.tencent.mm.af.a.class);
              paramString = new Bundle();
              paramString.putString("app_id", parama.fiQ);
              paramString.putString("msg_id", parambi.field_msgId);
              if (localObject == null)
                break label954;
              parambi = ((com.tencent.mm.af.a)localObject).feZ;
              label541: paramString.putString("cache_key", parambi);
              paramString.putString("msg_title", parama.title);
              paramString.putString("msg_path", parama.fiO);
              paramString.putInt("msg_pkg_type", parama.fiZ);
              paramString.putInt("pkg_version", parama.axy);
              paramString.putInt("widget_type", 0);
              if (!parama1.dFx())
                break label960;
            }
          break;
        case 1:
        case 2:
        }
      }
    }
    label829: label960: for (paramInt = 1008; ; paramInt = 1007)
    {
      paramString.putInt("scene", paramInt);
      paramString.putInt("view_init_width", r.d.zej);
      paramString.putInt("view_init_height", r.d.zek);
      locald.zen.setTag(locald);
      ((e)com.tencent.mm.kernel.g.K(e.class)).a(n.bE(parama1), locald.zen, paramString, this.hpp);
      locald.jPL.setTag(localay);
      locald.jPL.setOnClickListener(d(parama1));
      paramString = com.tencent.mm.model.v.Zp().y(n.bE(parama1), true);
      parambi = (r.c)paramString.get("listener", null);
      parama = parambi;
      if (parambi == null)
      {
        parama = new r.c();
        paramString.j("listener", parama);
      }
      parama.k(parama1);
      if (this.kuU)
        locald.jPL.setOnLongClickListener(c(parama1));
      AppMethodBeat.o(33024);
      return;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "amessage, msgid:%s, user:%s", new Object[] { Long.valueOf(parambi.field_msgId), paramString });
      parama = null;
      break;
      paramString = paramString.fgf;
      break label167;
      label839: locald.jPL.setBackgroundResource(2130838218);
      break label192;
      label853: locald.zbU.setVisibility(0);
      b(parama1, locald.zbU, ay.arL(parama.dJv));
      break label244;
      label882: paramString = parama.cMh;
      break label314;
      label891: localObject = parama.fjb;
      break label326;
      locald.zcp.setText(2131296837);
      break label415;
      locald.zcp.setText(2131296836);
      break label415;
      locald.zbW.setVisibility(8);
      break label470;
      locald.zbW.setVisibility(8);
      break label470;
      parambi = null;
      break label541;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33025);
    int i = ((ay)paramView.getTag()).position;
    j.b localb = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    Object localObject;
    if ((com.tencent.mm.pluginsdk.model.app.g.i(com.tencent.mm.pluginsdk.model.app.g.bT(localb.appId, false))) && (!com.tencent.mm.ui.chatting.j.aA(parambi)))
    {
      if (localb.type != 6)
        break label371;
      localObject = com.tencent.mm.pluginsdk.model.app.l.aiM(localb.csD);
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
      if (bh.o(parambi))
        paramContextMenu.clear();
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
      paramView = ((e)com.tencent.mm.kernel.g.K(e.class)).abz();
      if ((paramView.abE()) || (paramView.kR(localb.fiZ)))
      {
        paramContextMenu.add(i, 133, 0, this.yJI.yTx.getMMResources().getString(2131298163));
        paramContextMenu.add(i, 132, 0, this.yJI.yTx.getMMResources().getString(2131298162));
      }
      AppMethodBeat.o(33025);
      return true;
      label371: paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33026);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33026);
    case 111:
    case 133:
    case 132:
    }
    while (true)
    {
      return false;
      d.b.a(parama, parambi, b(parama, parambi));
      AppMethodBeat.o(33026);
      continue;
      Object localObject = parambi.field_content;
      paramMenuItem = null;
      if (localObject != null)
        paramMenuItem = j.b.me((String)localObject);
      if (paramMenuItem == null)
      {
        AppMethodBeat.o(33026);
      }
      else
      {
        localObject = new Bundle();
        ((Bundle)localObject).putString("app_id", paramMenuItem.fiQ);
        ((Bundle)localObject).putString("msg_id", parambi.field_msgId);
        ((Bundle)localObject).putInt("pkg_type", paramMenuItem.fiZ);
        ((Bundle)localObject).putInt("pkg_version", paramMenuItem.fiT);
        ((e)com.tencent.mm.kernel.g.K(e.class)).abz().e(parama.yTx.getContext(), (Bundle)localObject);
        AppMethodBeat.o(33026);
        continue;
        ((e)com.tencent.mm.kernel.g.K(e.class)).abz().bT(parama.yTx.getContext());
        AppMethodBeat.o(33026);
      }
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 553648177));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(33027);
    com.tencent.mm.modelstat.a.a(parambi, a.a.fQX);
    if (parambi.field_content == null)
      AppMethodBeat.o(33027);
    Object localObject1;
    while (true)
    {
      return bool;
      localObject1 = j.b.me(bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
      if (localObject1 != null)
        break;
      AppMethodBeat.o(33027);
    }
    paramView = com.tencent.mm.pluginsdk.model.app.g.bT(((j.b)localObject1).appId, false);
    if (paramView != null)
      a(parama, (j.b)localObject1, d(parama, parambi), paramView, parambi.field_msgSvrId, parama.getTalkerUserName());
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s", new Object[] { ((j.b)localObject1).fiP, ((j.b)localObject1).fiO, ((j.b)localObject1).fiQ, ((j.b)localObject1).url, Integer.valueOf(((j.b)localObject1).fiZ), ((j.b)localObject1).fiS });
    paramView = new se();
    paramView.cOf.appId = ((j.b)localObject1).fiQ;
    paramView.cOf.userName = ((j.b)localObject1).fiP;
    paramView.cOf.cOh = ((j.b)localObject1).fiO;
    paramView.cOf.cOi = ((j.b)localObject1).fiZ;
    paramView.cOf.cOk = ((j.b)localObject1).fiS;
    paramView.cOf.axy = ((j.b)localObject1).fja;
    Object localObject2 = paramView.cOf;
    if (((j.b)localObject1).fiZ != 0)
    {
      bool = true;
      label261: ((se.a)localObject2).cOl = bool;
      paramView.cOf.cOn.bQh = parama.getTalkerUserName();
      paramView.cOf.cOn.bQi = ((j.b)localObject1).fiV;
      localObject1 = ((j.b)localObject1).fiU;
      if (!parama.dFx())
        break label410;
      paramView.cOf.scene = 1008;
      localObject2 = new StringBuilder(parama.getTalkerUserName());
      ((StringBuilder)localObject2).append(":");
      ((StringBuilder)localObject2).append(b(parama, parambi));
      ((StringBuilder)localObject2).append(":");
      ((StringBuilder)localObject2).append((String)localObject1);
    }
    for (paramView.cOf.cst = ((StringBuilder)localObject2).toString(); ; paramView.cOf.cst = parama.toString())
    {
      com.tencent.mm.sdk.b.a.xxA.m(paramView);
      AppMethodBeat.o(33027);
      bool = true;
      break;
      bool = false;
      break label261;
      label410: paramView.cOf.scene = 1007;
      parama = new StringBuilder(b(parama, parambi));
      parama.append(":");
      parama.append((String)localObject1);
    }
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.r.a
 * JD-Core Version:    0.6.2
 */