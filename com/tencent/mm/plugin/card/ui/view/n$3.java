package com.tencent.mm.plugin.card.ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;

final class n$3
  implements View.OnClickListener
{
  n$3(n paramn, View paramView1, View paramView2, ImageView paramImageView, Button paramButton, ViewGroup paramViewGroup, b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88764);
    this.kqX.setVisibility(8);
    this.kqY.setVisibility(8);
    this.kqZ.setVisibility(0);
    this.kra.setVisibility(8);
    this.kqU.kqH.d(c.krD);
    this.kqU.d(this.kqT, this.kqW);
    AppMethodBeat.o(88764);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.n.3
 * JD-Core Version:    0.6.2
 */