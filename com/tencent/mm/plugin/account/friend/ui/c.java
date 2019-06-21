package com.tencent.mm.plugin.account.friend.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;

public final class c
  implements View.OnClickListener
{
  private Context context;
  private c.a gxm;

  public c(Context paramContext, c.a parama)
  {
    this.context = paramContext;
    this.gxm = parama;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108570);
    paramView = (c.b)paramView.getTag();
    String str = paramView.gxo;
    int i = paramView.position;
    int j = p.cB(str);
    new g(this.context, new c.1(this, i)).m(new int[] { j });
    AppMethodBeat.o(108570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.c
 * JD-Core Version:    0.6.2
 */