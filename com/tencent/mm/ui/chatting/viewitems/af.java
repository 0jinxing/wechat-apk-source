package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.c;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

public final class af
{
  public static final class a extends c
  {
    private a yJI;

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(33264);
      View localView;
      if (paramView != null)
      {
        localView = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localView = paramLayoutInflater.inflate(2130969066, null);
        paramLayoutInflater = new af.b();
        paramLayoutInflater.enf = ((TextView)localView.findViewById(2131820587));
        paramLayoutInflater.qkY = ((TextView)localView.findViewById(2131821102));
        paramLayoutInflater.zdN = ((ImageView)localView.findViewById(2131822614));
        paramLayoutInflater.zgd = ((TextView)localView.findViewById(2131822615));
        paramLayoutInflater.zfC = ((TextView)localView.findViewById(2131821103));
        paramLayoutInflater.jPL = localView.findViewById(2131822515);
        localView.setTag(paramLayoutInflater);
      }
      AppMethodBeat.o(33264);
      return localView;
    }

    public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(33265);
      this.yJI = parama1;
      parama = (af.b)parama;
      aw.ZK();
      paramString = com.tencent.mm.model.c.XO().Rl(parambi.field_content);
      parama.zgd.setText(paramString.title);
      parama.zfC.setText(paramString.content);
      a(parama, paramString.fOt);
      ImageView localImageView = parama.zdN;
      if (paramString.mpz);
      for (int i = 0; ; i = 8)
      {
        localImageView.setVisibility(i);
        parama.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
        parama.jPL.setOnClickListener(d(parama1));
        parama.jPL.setOnLongClickListener(c(parama1));
        parama.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
        AppMethodBeat.o(33265);
        return;
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(33266);
      int i = ((ay)paramView.getTag()).position;
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
      AppMethodBeat.o(33266);
      return true;
    }

    public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
    {
      return false;
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if (paramInt == 35);
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    public final boolean b(View paramView, a parama, bi parambi)
    {
      AppMethodBeat.i(33267);
      parambi = (ay)paramView.getTag();
      aw.ZK();
      paramView = com.tencent.mm.model.c.XO().Rl(parambi.cKd.field_content);
      if (ah.nullAsNil(paramView.ptI).length() > 0)
        d.b(parama.yTx.getContext(), "qqmail", ".ui.ReadMailUI", new Intent().putExtra("msgid", parambi.cKd.field_msgId));
      while (true)
      {
        AppMethodBeat.o(33267);
        return true;
        if (ah.nullAsNil(paramView.xZu).length() > 0)
        {
          paramView = new Intent("android.intent.action.VIEW", Uri.parse(paramView.xZu));
          d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramView);
        }
      }
    }

    protected final boolean dHj()
    {
      return false;
    }

    public final boolean dHk()
    {
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.af
 * JD-Core Version:    0.6.2
 */