package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class be extends c.a
{
  protected TextView gnC;
  protected ImageView zjv;

  public final be fk(View paramView)
  {
    AppMethodBeat.i(33454);
    super.eP(paramView);
    this.gnC = ((TextView)paramView.findViewById(2131822534));
    this.zjv = ((ImageView)paramView.findViewById(2131822536));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    AppMethodBeat.o(33454);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.be
 * JD-Core Version:    0.6.2
 */