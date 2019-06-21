package com.tencent.mm.ui.chatting.i;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.a.c.a;

final class a$b extends c.a
{
  TextView gnC;
  ImageView iqT;
  TextView moL;

  public a$b(a parama, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(32515);
    this.iqT = ((ImageView)paramView.findViewById(2131821479));
    this.gnC = ((TextView)paramView.findViewById(2131820602));
    this.moL = ((TextView)paramView.findViewById(2131820615));
    this.moL.setVisibility(8);
    AppMethodBeat.o(32515);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.a.b
 * JD-Core Version:    0.6.2
 */