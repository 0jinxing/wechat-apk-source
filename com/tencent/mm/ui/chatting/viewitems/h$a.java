package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMTextView;

final class h$a extends c.a
{
  View gbS;
  ImageView zci;
  MMTextView zdy;

  public final c.a z(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(32902);
    super.eP(paramView);
    this.enf = ((TextView)paramView.findViewById(2131820587));
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    this.zdy = ((MMTextView)paramView.findViewById(2131821103));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.gbS = paramView.findViewById(2131820581);
    if (!paramBoolean)
    {
      this.zci = ((ImageView)paramView.findViewById(2131822661));
      this.zby = ((ImageView)paramView.findViewById(2131822629));
      this.pyf = ((ProgressBar)paramView.findViewById(2131822660));
    }
    AppMethodBeat.o(32902);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.h.a
 * JD-Core Version:    0.6.2
 */