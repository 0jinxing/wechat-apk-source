package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$a extends c.a
{
  protected ImageView mOX;
  protected ImageView mPb;
  protected View mlI;
  protected TextView moL;
  protected TextView zbU;
  protected TextView zdT;
  protected ImageView zdU;

  public final a eW(View paramView)
  {
    AppMethodBeat.i(32951);
    super.eP(paramView);
    this.mOX = ((ImageView)paramView.findViewById(2131822536));
    this.moL = ((TextView)paramView.findViewById(2131822543));
    this.zdT = ((TextView)paramView.findViewById(2131822663));
    this.mlI = paramView.findViewById(2131822662);
    this.zbU = ((TextView)paramView.findViewById(2131822454));
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    this.zdU = ((ImageView)paramView.findViewById(2131822558));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.mPb = ((ImageView)paramView.findViewById(2131822553));
    AppMethodBeat.o(32951);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.l.a
 * JD-Core Version:    0.6.2
 */