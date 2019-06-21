package com.tencent.mm.ui.chatting.i;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.a.c.a;

final class f$b extends c.a
{
  TextView gnC;
  ImageView iqT;
  TextView moL;
  ImageView moR;

  public f$b(f paramf, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(32617);
    this.iqT = ((ImageView)paramView.findViewById(2131821479));
    this.gnC = ((TextView)paramView.findViewById(2131820602));
    this.gnC.setVisibility(8);
    this.moL = ((TextView)paramView.findViewById(2131820615));
    this.moR = ((ImageView)paramView.findViewById(2131821480));
    this.moR.setImageResource(2130839639);
    this.moR.setVisibility(0);
    AppMethodBeat.o(32617);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.f.b
 * JD-Core Version:    0.6.2
 */