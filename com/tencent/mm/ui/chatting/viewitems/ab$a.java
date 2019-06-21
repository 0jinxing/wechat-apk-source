package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.NoMeasuredTextView;

final class ab$a extends c.a
{
  protected ImageView gvq;
  protected NoMeasuredTextView zfS;

  ab$a(ab paramab)
  {
  }

  public final a fg(View paramView)
  {
    AppMethodBeat.i(33218);
    super.eP(paramView);
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.gvq = ((ImageView)paramView.findViewById(2131822639));
    this.zfS = ((NoMeasuredTextView)paramView.findViewById(2131822641));
    AppMethodBeat.o(33218);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ab.a
 * JD-Core Version:    0.6.2
 */