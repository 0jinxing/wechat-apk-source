package com.tencent.mm.plugin.order.ui.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.f;

final class g$1
  implements View.OnClickListener
{
  g$1(g paramg, TextView paramTextView, LinearLayout paramLinearLayout)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43912);
    this.peK.setVisibility(8);
    for (int i = 0; i < g.a(this.peM).length; i++)
    {
      paramView = g.a(this.peM, g.a(this.peM)[i]);
      this.peL.addView(paramView, new LinearLayout.LayoutParams(-2, -2));
    }
    this.peK.setOnClickListener(null);
    if (g.b(this.peM) != null)
      g.b(this.peM).notifyDataSetChanged();
    AppMethodBeat.o(43912);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.g.1
 * JD-Core Version:    0.6.2
 */