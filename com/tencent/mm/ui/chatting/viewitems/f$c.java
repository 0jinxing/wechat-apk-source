package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.b;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

public final class f$c extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32884);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969086);
      ((View)localObject).setTag(new f.a().eT((View)localObject));
    }
    AppMethodBeat.o(32884);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32885);
    this.yJI = parama1;
    f.a locala = (f.a)parama;
    paramString = parambi.field_content;
    if (paramString != null);
    for (Object localObject = j.b.X(paramString, parambi.field_reserved); ; localObject = null)
    {
      b localb;
      if (localObject != null)
      {
        f.a(parama.jPL, (j.b)localObject, "MicroMsg.ChattingItemAppMsgC2CTo", true);
        locala.zde.setTypeface(Typeface.defaultFromStyle(0));
        parama1.yTx.getContext().getResources().getDimensionPixelSize(2131427858);
        parama1.yTx.getContext().getResources().getDimensionPixelSize(2131428202);
        localb = (b)((j.b)localObject).X(b.class);
        if (parambi.field_isSend != 1)
          break label474;
        paramString = localb.ffB;
        if (!bo.isNullOrNil(paramString))
          break label484;
        paramString = ((j.b)localObject).description;
        locala.zde.setSingleLine(false);
        locala.zde.setMaxLines(3);
        label162: locala.zde.setText(j.b(parama1.yTx.getContext(), paramString, locala.zdj));
        locala.zde.setTextSize(0, locala.zdj);
        if (!bo.isNullOrNil(localb.ffC))
          locala.zde.setTextColor(Color.parseColor(localb.ffC));
        localObject = locala.zdf;
        if (parambi.field_isSend != 1)
          break label496;
        paramString = localb.ffF;
        label252: ((TextView)localObject).setText(paramString);
        if (!bo.isNullOrNil(localb.ffH))
          locala.zdf.setTextColor(Color.parseColor(localb.ffH));
        localObject = locala.zdg;
        if (parambi.field_isSend != 1)
          break label506;
      }
      label474: label484: label496: label506: for (paramString = localb.ffD; ; paramString = localb.ffE)
      {
        ((TextView)localObject).setText(paramString);
        locala.zdd.setImageBitmap(null);
        if (!bo.isNullOrNil(localb.ffv))
        {
          paramString = new com.tencent.mm.at.a.a.c.a();
          aw.ZK();
          paramString.ePK = com.tencent.mm.model.c.XX();
          paramString.ePH = true;
          paramString.ePZ = true;
          paramString = paramString.ahG();
          o.ahp().a(localb.ffv, locala.zdd, paramString);
        }
        parama.jPL.setOnClickListener(d(parama1));
        parama.jPL.setOnLongClickListener(c(parama1));
        parama.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
        parama1 = new ay(parambi, this.yJI.dFx(), paramInt, null, '\000');
        parama.jPL.setTag(parama1);
        AppMethodBeat.o(32885);
        return;
        paramString = localb.ffA;
        break;
        locala.zde.setSingleLine(true);
        break label162;
        paramString = localb.ffG;
        break label252;
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32886);
    paramContextMenu.add(((ay)paramView.getTag()).position, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(32886);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32887);
    boolean bool;
    switch (paramMenuItem.getItemId())
    {
    default:
      bool = false;
      AppMethodBeat.o(32887);
    case 103:
    }
    while (true)
    {
      return bool;
      String str1 = parambi.field_content;
      paramMenuItem = null;
      if (str1 != null)
        paramMenuItem = j.b.X(str1, parambi.field_reserved);
      if (paramMenuItem != null)
      {
        String str2 = parambi.field_talker;
        String str3 = paramMenuItem.fhS;
        String str4 = paramMenuItem.fhT;
        str1 = paramMenuItem.fhU;
        String str5 = paramMenuItem.fhV;
        String str6 = paramMenuItem.fhQ;
        parambi = paramMenuItem.fhX;
        paramMenuItem = paramMenuItem.fhY;
        com.tencent.mm.ui.base.h.d(parama.yTx.getContext(), parama.yTx.getMMResources().getString(2131298216), parama.yTx.getMMResources().getString(2131297031), parama.yTx.getMMResources().getString(2131298217), parama.yTx.getMMResources().getString(2131296868), new f.c.1(this, str2, str3, str4, str1, str5, str6, parambi, paramMenuItem, parama), new f.c.2(this));
      }
      bool = true;
      AppMethodBeat.o(32887);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 536870961));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32888);
    String str = parambi.field_content;
    paramView = null;
    if (str != null)
      paramView = j.b.X(str, parambi.field_reserved);
    if (paramView != null)
    {
      ab.i("MicroMsg.ChattingItemAppMsgC2CTo", "click honey pay");
      paramView = Uri.parse(((b)paramView.X(b.class)).ffs).getQueryParameter("cardNo");
      parambi = new Intent();
      parambi.putExtra("key_is_payer", true);
      parambi.putExtra("key_card_no", paramView);
      d.b(parama.yTx.getContext(), "honey_pay", ".ui.HoneyPayProxyUI", parambi);
    }
    AppMethodBeat.o(32888);
    return true;
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.f.c
 * JD-Core Version:    0.6.2
 */