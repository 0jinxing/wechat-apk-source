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
import com.tencent.mm.modelappbrand.ac;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.r.n;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.s.n;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

public final class r$b extends c
  implements com.tencent.mm.modelappbrand.f, s.n
{
  private com.tencent.mm.modelappbrand.ab hpp;
  private com.tencent.mm.ui.chatting.d.a yJI;

  public r$b()
  {
    AppMethodBeat.i(33029);
    this.hpp = new ac(this);
    AppMethodBeat.o(33029);
  }

  public final void F(View paramView, int paramInt)
  {
    AppMethodBeat.i(33035);
    Object localObject = paramView.getTag();
    if (!(localObject instanceof r.d))
      AppMethodBeat.o(33035);
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "onWidgetStateChanged(%s, state : %d)", new Object[] { Integer.valueOf(paramView.hashCode()), Integer.valueOf(paramInt) });
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
        AppMethodBeat.o(33035);
        break;
      case 0:
        paramView.iNB.setVisibility(0);
        paramView.iNB.dKS();
        paramView.zen.setVisibility(4);
        paramView.kuG.setVisibility(4);
        AppMethodBeat.o(33035);
        break;
      case 1:
        paramView.iNB.dKT();
        paramView.iNB.setVisibility(4);
        paramView.zen.setVisibility(4);
        paramView.kuG.setVisibility(0);
        paramView.kuG.setImageResource(2131231220);
        AppMethodBeat.o(33035);
        break;
      case 4:
        paramView.iNB.dKT();
        paramView.iNB.setVisibility(4);
        paramView.zen.setVisibility(0);
        paramView.kuG.setVisibility(4);
        AppMethodBeat.o(33035);
      }
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33030);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969096);
      paramLayoutInflater = new r.d().B((View)localObject, false);
      paramView = ((e)com.tencent.mm.kernel.g.K(e.class)).bS(((View)localObject).getContext());
      paramLayoutInflater.zen = paramView;
      paramLayoutInflater.zem.addView(paramView, new ViewGroup.LayoutParams(-1, -1));
      ((View)localObject).setTag(paramLayoutInflater);
    }
    AppMethodBeat.o(33030);
    return localObject;
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33036);
    if (parambi.bAA())
    {
      com.tencent.mm.pluginsdk.model.app.l.al(parambi);
      bf.fm(parambi.field_msgId);
      parama.qp(true);
      AppMethodBeat.o(33036);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(33036);
    }
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33031);
    r.d locald = (r.d)parama;
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
          break label697;
        paramString = ((WxaAttributes)localObject).field_nickname;
        if (localObject == null)
          break label706;
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
          label259: o.ahp().a((String)localObject, locald.zcn, r.d.zel);
          if (dHm())
          {
            paramString = (h)parama1.aF(h.class);
            if ((parambi.field_status == 2) && (a(paramString, parambi.field_msgId)))
            {
              if (locald.zci != null)
                locald.zci.setVisibility(0);
              label332: if (locald.pyf != null)
                locald.pyf.setVisibility(8);
              label350: paramString = (com.tencent.mm.af.a)parama.X(com.tencent.mm.af.a.class);
              localObject = new Bundle();
              ((Bundle)localObject).putString("app_id", parama.fiQ);
              ((Bundle)localObject).putString("msg_id", parambi.field_msgId);
              if (paramString == null)
                break label803;
              paramString = paramString.feZ;
              label421: ((Bundle)localObject).putString("cache_key", paramString);
              ((Bundle)localObject).putString("msg_title", parama.title);
              ((Bundle)localObject).putString("msg_path", parama.fiO);
              ((Bundle)localObject).putInt("msg_pkg_type", parama.fiZ);
              ((Bundle)localObject).putInt("pkg_version", parama.axy);
              ((Bundle)localObject).putInt("widget_type", 0);
              if (!parama1.dFx())
                break label809;
            }
          }
          break;
        case 1:
        case 2:
        }
      }
      label803: label809: for (int i = 1008; ; i = 1007)
      {
        ((Bundle)localObject).putInt("scene", i);
        ((Bundle)localObject).putInt("view_init_width", r.d.zej);
        ((Bundle)localObject).putInt("view_init_height", r.d.zek);
        locald.zen.setTag(locald);
        ((e)com.tencent.mm.kernel.g.K(e.class)).a(n.bE(parama1), locald.zen, (Bundle)localObject, this.hpp);
        locald.jPL.setTag(localay);
        locald.jPL.setOnClickListener(d(parama1));
        localObject = com.tencent.mm.model.v.Zp().y(n.bE(parama1), true);
        paramString = (r.c)((v.b)localObject).get("listener", null);
        parama = paramString;
        if (paramString == null)
        {
          parama = new r.c();
          ((v.b)localObject).j("listener", parama);
        }
        parama.k(parama1);
        if (this.kuU)
          locald.jPL.setOnLongClickListener(c(parama1));
        a(paramInt, locald, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
        AppMethodBeat.o(33031);
        return;
        label697: paramString = parama.cMh;
        break;
        label706: localObject = parama.fjb;
        break label170;
        locald.zcp.setText(2131296837);
        break label259;
        locald.zcp.setText(2131296836);
        break label259;
        if (locald.zci == null)
          break label332;
        locald.zci.setVisibility(8);
        break label332;
        if (locald.pyf == null)
          break label350;
        locald.pyf.setVisibility(0);
        if (parambi.field_status < 2)
          break label350;
        locald.pyf.setVisibility(8);
        break label350;
        paramString = null;
        break label421;
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33032);
    int i = ((ay)paramView.getTag()).position;
    if (parambi.field_content == null)
      AppMethodBeat.o(33032);
    while (true)
    {
      return true;
      j.b localb = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
      if (localb == null)
      {
        AppMethodBeat.o(33032);
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
        paramView = ((e)com.tencent.mm.kernel.g.K(e.class)).abz();
        if ((paramView.abE()) || (paramView.kR(localb.fiZ)))
        {
          paramContextMenu.add(i, 133, 0, this.yJI.yTx.getMMResources().getString(2131298163));
          paramContextMenu.add(i, 132, 0, this.yJI.yTx.getMMResources().getString(2131298162));
        }
        AppMethodBeat.o(33032);
      }
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33033);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33033);
    case 111:
    case 103:
    case 133:
    case 132:
    }
    while (true)
    {
      return false;
      d.b.a(parama, parambi, b(parama, parambi));
      AppMethodBeat.o(33033);
      continue;
      paramMenuItem = parambi.field_content;
      if (paramMenuItem == null)
      {
        AppMethodBeat.o(33033);
      }
      else
      {
        parama = j.b.me(paramMenuItem);
        if (parama != null)
          switch (parama.type)
          {
          default:
          case 16:
          }
        while (true)
        {
          AppMethodBeat.o(33033);
          break;
          paramMenuItem = new ii();
          paramMenuItem.cDs.cDt = parama.cDt;
          paramMenuItem.cDs.cuQ = parambi.field_msgId;
          paramMenuItem.cDs.cDu = parambi.field_talker;
          com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
        }
        Object localObject = parambi.field_content;
        paramMenuItem = null;
        if (localObject != null)
          paramMenuItem = j.b.me((String)localObject);
        if (paramMenuItem == null)
        {
          AppMethodBeat.o(33033);
        }
        else
        {
          localObject = new Bundle();
          ((Bundle)localObject).putString("app_id", paramMenuItem.fiQ);
          ((Bundle)localObject).putString("msg_id", parambi.field_msgId);
          ((Bundle)localObject).putInt("pkg_type", paramMenuItem.fiZ);
          ((Bundle)localObject).putInt("pkg_version", paramMenuItem.fiT);
          ((e)com.tencent.mm.kernel.g.K(e.class)).abz().e(parama.yTx.getContext(), (Bundle)localObject);
          AppMethodBeat.o(33033);
          continue;
          ((e)com.tencent.mm.kernel.g.K(e.class)).abz().bT(parama.yTx.getContext());
          AppMethodBeat.o(33033);
        }
      }
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 553648177));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(33034);
    paramView.getTag();
    paramView = parambi.field_content;
    if (paramView == null)
      AppMethodBeat.o(33034);
    while (true)
    {
      return bool;
      paramView = j.b.me(paramView);
      if (paramView != null)
        break;
      AppMethodBeat.o(33034);
    }
    Object localObject1 = com.tencent.mm.pluginsdk.model.app.g.bT(paramView.appId, true);
    if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appId)))
      a(parama, paramView, r.Yz(), (com.tencent.mm.pluginsdk.model.app.f)localObject1, parambi.field_msgSvrId, parama.getTalkerUserName());
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
        break label344;
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
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
      AppMethodBeat.o(33034);
      bool = true;
      break;
      bool = false;
      break label192;
      label344: ((se)localObject1).cOf.scene = 1007;
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
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.r.b
 * JD-Core Version:    0.6.2
 */