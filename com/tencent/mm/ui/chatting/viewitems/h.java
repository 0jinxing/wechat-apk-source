package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.s.n;
import com.tencent.mm.ui.widget.MMTextView;
import java.net.URLDecoder;

public final class h
{
  public static final class c extends c
    implements s.n
  {
    private a yJI;

    private static String arD(String paramString)
    {
      AppMethodBeat.i(32909);
      try
      {
        paramString = j.b.me(paramString);
        if (paramString != null)
        {
          paramString = URLDecoder.decode(paramString.content, "UTF-8");
          AppMethodBeat.o(32909);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.ChattingItemTextTo", "getMsgContent error: %s", new Object[] { paramString.getMessage() });
          paramString = "";
          AppMethodBeat.o(32909);
        }
      }
    }

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(32908);
      Object localObject;
      if (paramView != null)
      {
        localObject = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localObject = new v(paramLayoutInflater, 2130969105);
        ((View)localObject).setTag(new h.a().z((View)localObject, false));
      }
      AppMethodBeat.o(32908);
      return localObject;
    }

    public final void a(a parama, bi parambi)
    {
      AppMethodBeat.i(32912);
      if (parambi.bAA())
      {
        l.al(parambi);
        bf.fm(parambi.field_msgId);
        parama.qp(true);
        AppMethodBeat.o(32912);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(32912);
      }
    }

    public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(32910);
      this.yJI = parama1;
      parama = (h.a)parama;
      if (dHm())
      {
        if (parama.pyf != null)
          parama.pyf.setVisibility(8);
        if ((parambi.field_status == 1) || (parambi.field_status == 5))
        {
          if (parama.zci != null)
            parama.zci.setVisibility(8);
          parama.zdy.setBackgroundResource(2130838321);
          parambi.xZd = true;
        }
      }
      while (parama.pyf == null)
        while (true)
        {
          paramString = arD(parambi.field_content);
          if (bo.isNullOrNil(paramString))
            ab.e("MicroMsg.ChattingItemTextTo", "[carl] text to, content is null! why?? localid : %s, svrid : %s", new Object[] { Long.valueOf(parambi.field_msgId), Long.valueOf(parambi.field_msgSvrId) });
          parama.zdy.setMinWidth(0);
          parama.zdy.setText(paramString);
          paramString = parama.zdy;
          i = parambi.getType();
          String str = parama1.getTalkerUserName();
          if (i != 301989937)
            j.a(paramString, str);
          paramString.getText();
          paramString = ay.b(parambi, parama1.dFx(), paramInt);
          parama.zdy.setTag(paramString);
          parama.zdy.setOnLongClickListener(c(parama1));
          parama.zdy.setOnDoubleClickLitsener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCY());
          a(paramInt, parama, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
          AppMethodBeat.o(32910);
          return;
          parama.zdy.setBackgroundResource(2130838320);
          if (parama.zci != null)
            if (a((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi.field_msgId))
            {
              if (parambi.xZd)
              {
                paramString = new AlphaAnimation(0.5F, 1.0F);
                paramString.setDuration(300L);
                parama.zdy.startAnimation(paramString);
                parambi.xZd = false;
              }
              parama.zci.setVisibility(0);
            }
            else
            {
              parama.zci.setVisibility(8);
            }
        }
      paramString = parama.pyf;
      if (parambi.field_status >= 2);
      for (int i = 8; ; i = 0)
      {
        paramString.setVisibility(i);
        break;
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(32911);
      paramContextMenu.add(((ay)paramView.getTag()).position, 100, 0, paramView.getContext().getString(2131298154));
      AppMethodBeat.o(32911);
      return false;
    }

    public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
    {
      return false;
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if ((paramBoolean) && (paramInt == 503316529));
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    public final boolean b(View paramView, a parama, bi parambi)
    {
      return false;
    }

    public final boolean dHk()
    {
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.h
 * JD-Core Version:    0.6.2
 */