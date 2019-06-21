package com.tencent.mm.ui.chatting.viewitems;

import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

public final class aq extends c
{
  private f fQS;
  private a yJI;
  private aq.a zhT;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33403);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969114);
      ((View)localObject).setTag(new bf().fl((View)localObject));
    }
    AppMethodBeat.o(33403);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33404);
    bf localbf = (bf)parama;
    this.yJI = parama1;
    Object localObject = am.dhN().ma(parambi.field_msgId);
    String str = parambi.field_content;
    paramString = null;
    parama = paramString;
    if (localObject != null)
    {
      parama = paramString;
      if (str != null)
        parama = j.b.X(str, parambi.field_reserved);
    }
    if (parama != null)
      localbf.gnC.setText(parama.description);
    ab.d("MicroMsg.ChattingItemVoiceRemindSys", "content sys " + parambi.field_content);
    paramString = com.tencent.mm.plugin.subapp.c.e.abk(str);
    if ((paramString != null) && (paramString.sta != null) && (paramString.sta.length() > 0) && (paramString.stb > 0) && (this.fQS == null) && (parama != null) && (bo.isNullOrNil(parambi.field_imgPath)))
    {
      localObject = com.tencent.mm.plugin.subapp.c.k.ug(r.Yz());
      str = com.tencent.mm.plugin.subapp.c.h.by((String)localObject, false);
      parambi.jv((String)localObject);
      aw.ZK();
      com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
      str = l.a(str, parambi.field_msgId, parama.sdkVer, parama.appId, paramString.sta, paramString.stb, parama.type, parama.fgs);
      if (str != null)
      {
        paramString = aw.Rg();
        parama = new aq.1(this, parambi, str, paramInt);
        this.fQS = parama;
        paramString.a(221, parama);
        parama = new com.tencent.mm.plugin.record.b.e(str);
        parama.ceC();
        aw.Rg().a(parama, 0);
      }
    }
    localbf.gnC.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
    parama = localbf.gnC;
    if (this.zhT == null)
      this.zhT = new aq.a(this, this.yJI);
    parama.setOnClickListener(this.zhT);
    aw.ZK();
    if (com.tencent.mm.model.c.isSDCardAvailable())
      localbf.gnC.setOnLongClickListener(c(parama1));
    AppMethodBeat.o(33404);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33405);
    int i = ((ay)paramView.getTag()).position;
    if (!this.yJI.dFy())
      paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(33405);
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33406);
    paramMenuItem.getItemId();
    AppMethodBeat.o(33406);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1879048191);
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return true;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.aq
 * JD-Core Version:    0.6.2
 */