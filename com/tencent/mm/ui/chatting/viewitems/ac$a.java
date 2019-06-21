package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ac$a extends c.a
{
  protected ImageView gvq;
  protected TextView zfU;

  ac$a(ac paramac)
  {
  }

  public final a fh(View paramView)
  {
    AppMethodBeat.i(33224);
    super.eP(paramView);
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.gvq = ((ImageView)paramView.findViewById(2131822649));
    this.zfU = ((TextView)paramView.findViewById(2131822641));
    AppMethodBeat.o(33224);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ac.a
 * JD-Core Version:    0.6.2
 */