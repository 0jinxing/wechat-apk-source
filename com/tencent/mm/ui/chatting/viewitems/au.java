package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class au extends c.a
{
  protected TextView gnC;
  protected TextView zic;
  protected TextView zid;
  protected Button zie;
  protected Button zif;
  protected ImageView zig;

  public final au fj(View paramView)
  {
    AppMethodBeat.i(33441);
    super.eP(paramView);
    this.gnC = ((TextView)paramView.findViewById(2131822534));
    this.zic = ((TextView)paramView.findViewById(2131822681));
    this.zid = ((TextView)paramView.findViewById(2131822682));
    this.zie = ((Button)paramView.findViewById(2131822683));
    this.zif = ((Button)paramView.findViewById(2131822684));
    this.zig = ((ImageView)paramView.findViewById(2131822685));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    AppMethodBeat.o(33441);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.au
 * JD-Core Version:    0.6.2
 */