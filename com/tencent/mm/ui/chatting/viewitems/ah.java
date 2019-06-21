package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class ah
{
  public static final class a extends al.a
  {
    private com.tencent.mm.ui.chatting.d.a yJI;

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(33271);
      Object localObject;
      if (paramView != null)
      {
        localObject = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localObject = new v(paramLayoutInflater, 2130969082);
        ((View)localObject).setTag(new ah.c().fe((View)localObject));
      }
      AppMethodBeat.o(33271);
      return localObject;
    }

    public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(33272);
      this.yJI = parama1;
      parama = (ah.c)parama;
      a.a locala = a.a.rE(parambi.field_content);
      if (locala == null)
        AppMethodBeat.o(33272);
      while (true)
      {
        return;
        paramString = locala.cEV;
        a(parama, parama1, parambi, paramString);
        a(parama, parama1, paramString, parambi);
        j.a(parama.zfC.getContext(), com.tencent.mm.ak.a.a(locala), (int)parama.zfC.getTextSize(), 1, null, "");
        parama.zfC.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
        parama.zfC.setOnLongClickListener(c(parama1));
        AppMethodBeat.o(33272);
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(33273);
      if (parambi.dtE())
      {
        int i = ((ay)paramView.getTag()).position;
        if (parambi.field_status == 5)
          paramContextMenu.add(i, 103, 0, paramView.getContext().getString(2131298217));
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
      }
      AppMethodBeat.o(33273);
      return true;
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if ((!paramBoolean) && ((paramInt == 55) || (paramInt == 57)));
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    protected final boolean dHj()
    {
      return false;
    }
  }

  public static final class b extends al.b
  {
    private com.tencent.mm.ui.chatting.d.a yJI;

    public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(33274);
      this.yJI = parama1;
      parama = (al.f)parama;
      paramString = a.a.rE(parambi.field_content);
      if (parambi.field_status >= 2)
        parama.pyf.setVisibility(8);
      while (true)
      {
        j.a(parama.zgQ.getContext(), com.tencent.mm.ak.a.a(paramString), (int)parama.zgQ.getTextSize(), 1, null, "");
        parama.zgQ.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
        parama.zgQ.setOnLongClickListener(c(parama1));
        a(paramInt, parama, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
        AppMethodBeat.o(33274);
        return;
        parama.pyf.setVisibility(0);
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(33275);
      if (parambi.dtE())
      {
        int i = ((ay)paramView.getTag()).position;
        if (parambi.field_status == 5)
          paramContextMenu.add(i, 103, 0, paramView.getContext().getString(2131298217));
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
      }
      AppMethodBeat.o(33275);
      return true;
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if ((paramBoolean) && ((paramInt == 55) || (paramInt == 57)));
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ah
 * JD-Core Version:    0.6.2
 */