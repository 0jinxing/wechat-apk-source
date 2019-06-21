package com.tencent.mm.ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.f;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.neattextview.textview.view.NeatTextView;

public final class ai extends c
{
  private aj zgA;
  private ag zgB;
  private ak zgC;
  private at zgD;

  public ai()
  {
    AppMethodBeat.i(33279);
    this.zgA = new aj();
    this.zgB = new ag();
    this.zgC = new ak();
    this.zgD = new at();
    AppMethodBeat.o(33279);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33280);
    View localView;
    if (paramView != null)
    {
      localView = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localView = paramLayoutInflater.inflate(2130969083, null);
      paramLayoutInflater = new ai.b(this);
      paramLayoutInflater.mRR = localView;
      paramLayoutInflater.enf = ((TextView)localView.findViewById(2131820587));
      paramLayoutInflater.zgE = ((MMNeat7extView)localView.findViewById(2131821103));
      paramLayoutInflater.zgE.setOnTouchListener(new f(paramLayoutInflater.zgE, new m(paramLayoutInflater.zgE.getContext())));
      localView.setTag(paramLayoutInflater);
    }
    AppMethodBeat.o(33280);
    return localView;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33281);
    if (parambi.getType() == 10002)
      paramString = this.zgB;
    while (true)
    {
      paramString.b(parama, paramInt, parama1, parambi);
      AppMethodBeat.o(33281);
      return;
      if (parambi.getType() == 570425393)
        paramString = this.zgC;
      else if (parambi.getType() == 603979825)
        paramString = this.zgD;
      else
        paramString = this.zgA;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 10000) || (paramInt == 10002) || (paramInt == 570425393) || (paramInt == 64) || (paramInt == 603979825));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return false;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ai
 * JD-Core Version:    0.6.2
 */