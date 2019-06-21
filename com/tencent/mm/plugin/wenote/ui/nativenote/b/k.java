package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.c;

public final class k extends i
{
  private View uUT;

  public k(View paramView, com.tencent.mm.plugin.wenote.model.nativenote.manager.k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27172);
    this.uUB.setVisibility(8);
    this.cAw.setVisibility(8);
    this.gCe.setVisibility(8);
    this.uUB.setOnClickListener(null);
    this.uUG.setOnClickListener(new k.1(this));
    AppMethodBeat.o(27172);
  }

  public final void a(c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27173);
    super.a(paramc, paramInt1, paramInt2);
    if (paramc.getType() != -1)
      AppMethodBeat.o(27173);
    while (true)
    {
      return;
      paramc = (RelativeLayout.LayoutParams)this.uUH.getLayoutParams();
      paramc.bottomMargin = 0;
      paramc.topMargin = 0;
      this.uUH.setLayoutParams(paramc);
      this.uUG.setVisibility(0);
      this.uUT = this.apJ.findViewById(2131826401);
      AppMethodBeat.o(27173);
    }
  }

  public final int dfW()
  {
    return -1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.k
 * JD-Core Version:    0.6.2
 */