package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.ai;
import com.tencent.mm.ui.chatting.c.b.h;

public final class am
{
  public static final class b extends c
  {
    private com.tencent.mm.ui.chatting.d.a yJI;
    private am.c zhl;

    private am.c dHr()
    {
      AppMethodBeat.i(33340);
      if (this.zhl == null)
        this.zhl = new am.c(this.yJI);
      am.c localc = this.zhl;
      AppMethodBeat.o(33340);
      return localc;
    }

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(33341);
      Object localObject;
      if (paramView != null)
      {
        localObject = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localObject = new v(paramLayoutInflater, 2130969106);
        ((View)localObject).setTag(new am.d().z((View)localObject, false));
      }
      AppMethodBeat.o(33341);
      return localObject;
    }

    public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(33342);
      this.yJI = parama1;
      paramString = (am.d)parama;
      am.d.a(paramString, parambi, false, paramInt, parama1, dHr(), c(parama1));
      if (dHm())
      {
        parama = u.ut(parambi.field_imgPath);
        if ((parama != null) && (parama.status == 199) && (a((h)parama1.aF(h.class), parambi.field_msgId)))
        {
          if (paramString.zci == null)
            break label125;
          paramString.zci.setVisibility(0);
          AppMethodBeat.o(33342);
        }
      }
      while (true)
      {
        return;
        if (paramString.zci != null)
          paramString.zci.setVisibility(8);
        label125: AppMethodBeat.o(33342);
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(33343);
      aw.ZK();
      if (com.tencent.mm.model.c.isSDCardAvailable())
        if (paramView == null)
          AppMethodBeat.o(33343);
      for (boolean bool = false; ; bool = true)
      {
        return bool;
        int i = ((ay)paramView.getTag()).position;
        s locals = o.all().uf(parambi.field_imgPath);
        Object localObject = paramContextMenu.add(i, 130, 0, paramView.getContext().getString(2131298159));
        int j = paramView.getWidth();
        int k = paramView.getHeight();
        int[] arrayOfInt = new int[2];
        paramView.getLocationInWindow(arrayOfInt);
        Intent localIntent = new Intent();
        localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", k).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]);
        ((MenuItem)localObject).setIntent(localIntent);
        if (locals != null)
        {
          j = locals.status;
          if ((104 != j) && (103 != j) && (105 != j) && (106 != j))
            paramContextMenu.add(i, 107, 0, paramView.getContext().getString(2131302491));
        }
        if ((locals != null) && ((locals.status == 199) || (locals.status == 199)))
        {
          if (d.afj("favorite"))
            paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
          localObject = new dq();
          ((dq)localObject).cxc.cvx = parambi.field_msgId;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
          if (((dq)localObject).cxd.cwB)
            paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
          if ((!parambi.drC()) && ((parambi.bws()) || (parambi.bwt())) && (a(parambi, this.yJI)) && ((locals.status == 199) || (locals.status == 199) || (parambi.dJz == 1)) && (arB(parambi.field_talker)))
            paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
          if ((f.aez()) && (!this.yJI.dFy()))
            paramContextMenu.add(i, 114, 0, paramView.getContext().getString(2131298150));
        }
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298155));
        AppMethodBeat.o(33343);
      }
    }

    public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33344);
      ((ai)parama.aF(ai.class)).a(paramMenuItem, parambi);
      AppMethodBeat.o(33344);
      return false;
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if ((paramBoolean) && (paramInt == 43));
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33345);
      dHr().onClick(paramView);
      AppMethodBeat.o(33345);
      return true;
    }

    public final boolean dHk()
    {
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.am
 * JD-Core Version:    0.6.2
 */