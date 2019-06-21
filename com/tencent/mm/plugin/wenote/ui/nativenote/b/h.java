package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.c;
import com.tencent.mm.plugin.wenote.model.a.g;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class h extends i
{
  public h(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27163);
    this.uUB.setVisibility(0);
    this.cAw.setVisibility(8);
    this.gCe.setVisibility(8);
    this.uUB.setTag(this);
    this.uUB.setOnClickListener(this.nij);
    AppMethodBeat.o(27163);
  }

  public final void a(c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27164);
    this.uUE.setImageResource(2131230798);
    this.uUC.setText(((g)paramc).eUu);
    this.uUD.setText(((g)paramc).fBg);
    super.a(paramc, paramInt1, paramInt2);
    AppMethodBeat.o(27164);
  }

  public final int dfW()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.h
 * JD-Core Version:    0.6.2
 */