package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class aa$a extends c.a
{
  protected TextView zfK;
  protected TextView zfL;
  protected TextView zfM;
  protected TextView zfN;
  protected TextView zfO;
  protected TextView zfP;
  protected ImageView zfQ;

  aa$a(aa paramaa)
  {
  }

  public final a ff(View paramView)
  {
    AppMethodBeat.i(33212);
    super.eP(paramView);
    this.zfK = ((TextView)paramView.findViewById(2131822644));
    this.zfM = ((TextView)paramView.findViewById(2131822642));
    this.zfL = ((TextView)paramView.findViewById(2131822645));
    this.zfN = ((TextView)paramView.findViewById(2131822643));
    this.zfO = ((TextView)paramView.findViewById(2131822648));
    this.zfP = ((TextView)paramView.findViewById(2131822646));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.zfQ = ((ImageView)paramView.findViewById(2131822647));
    AppMethodBeat.o(33212);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.aa.a
 * JD-Core Version:    0.6.2
 */