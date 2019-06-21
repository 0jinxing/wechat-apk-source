package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class d extends i
{
  public d(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27155);
    this.uUB.setVisibility(0);
    this.cAw.setVisibility(8);
    this.gCe.setVisibility(8);
    this.uUB.setTag(this);
    this.uUB.setOnClickListener(this.nij);
    AppMethodBeat.o(27155);
  }

  public final void a(com.tencent.mm.plugin.wenote.model.a.c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27156);
    this.uUE.setImageResource(com.tencent.mm.plugin.fav.ui.c.LX(((com.tencent.mm.plugin.wenote.model.a.d)paramc).uOf));
    this.uUC.setText(((com.tencent.mm.plugin.wenote.model.a.d)paramc).title);
    this.uUD.setText(((com.tencent.mm.plugin.wenote.model.a.d)paramc).content);
    super.a(paramc, paramInt1, paramInt2);
    AppMethodBeat.o(27156);
  }

  public final int dfW()
  {
    return 5;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.d
 * JD-Core Version:    0.6.2
 */