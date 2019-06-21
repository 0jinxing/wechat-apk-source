package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class p$a extends c.a
{
  protected TextView moL;
  protected ProgressBar pyf;
  protected TextView zbU;
  protected ImageView zby;
  protected MMNeat7extView zef;

  public final a fa(View paramView)
  {
    AppMethodBeat.i(32999);
    super.eP(paramView);
    this.zef = ((MMNeat7extView)paramView.findViewById(2131821103));
    this.pyf = ((ProgressBar)paramView.findViewById(2131822660));
    this.zby = ((ImageView)paramView.findViewById(2131822629));
    this.moL = ((TextView)paramView.findViewById(2131822543));
    this.zbU = ((TextView)paramView.findViewById(2131822454));
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    AppMethodBeat.o(32999);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.p.a
 * JD-Core Version:    0.6.2
 */