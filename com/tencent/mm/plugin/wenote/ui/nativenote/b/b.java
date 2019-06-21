package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.c;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class b extends i
{
  public b(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27149);
    this.uUB.setVisibility(8);
    this.cAw.setVisibility(8);
    this.gCe.setVisibility(8);
    this.uUB.setOnClickListener(null);
    AppMethodBeat.o(27149);
  }

  public final void a(c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27150);
    super.a(paramc, paramInt1, paramInt2);
    if (paramc.getType() != -2)
      AppMethodBeat.o(27150);
    while (true)
    {
      return;
      if (this.uSJ.uQI != 3)
      {
        AppMethodBeat.o(27150);
      }
      else
      {
        this.uUJ.setVisibility(0);
        AppMethodBeat.o(27150);
      }
    }
  }

  public final int dfW()
  {
    return -2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.b
 * JD-Core Version:    0.6.2
 */