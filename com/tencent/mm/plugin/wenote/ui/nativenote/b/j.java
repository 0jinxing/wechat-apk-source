package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.c;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class j extends i
{
  private ImageView uUR;
  private TextView uUS;

  public j(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27169);
    this.uUB.setVisibility(8);
    this.cAw.setVisibility(8);
    this.gCe.setVisibility(8);
    this.uUB.setOnClickListener(null);
    this.uUR = ((ImageView)paramView.findViewById(2131826406));
    this.uUS = ((TextView)paramView.findViewById(2131826407));
    AppMethodBeat.o(27169);
  }

  public final void a(c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27170);
    super.a(paramc, paramInt1, paramInt2);
    if (paramc.getType() != -4)
      AppMethodBeat.o(27170);
    while (true)
    {
      return;
      this.uUI.setVisibility(0);
      AppMethodBeat.o(27170);
    }
  }

  public final int dfW()
  {
    return -4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.j
 * JD-Core Version:    0.6.2
 */