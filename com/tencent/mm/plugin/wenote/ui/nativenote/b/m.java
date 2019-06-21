package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.c;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class m extends i
{
  public m(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27180);
    this.uUB.setVisibility(0);
    this.cAw.setVisibility(8);
    this.gCe.setVisibility(8);
    this.uUB.setTag(this);
    this.uUB.setOnClickListener(this.nij);
    AppMethodBeat.o(27180);
  }

  public final void a(c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27181);
    this.uUE.setImageResource(2131231660);
    this.uUC.setText(((j)paramc).title);
    this.uUD.setText(((j)paramc).content);
    super.a(paramc, paramInt1, paramInt2);
    AppMethodBeat.o(27181);
  }

  public final int dfW()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.m
 * JD-Core Version:    0.6.2
 */