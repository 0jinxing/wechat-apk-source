package com.tencent.mm.ui.chatting.i;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.a.c.a;

final class d$b extends c.a
{
  TextView gnC;
  ImageView iqT;

  public d$b(d paramd, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(32544);
    this.iqT = ((ImageView)paramView.findViewById(2131821479));
    this.gnB.setSingleLine(false);
    this.gnB.setMaxLines(2);
    this.gnC = ((TextView)paramView.findViewById(2131820603));
    AppMethodBeat.o(32544);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.d.b
 * JD-Core Version:    0.6.2
 */