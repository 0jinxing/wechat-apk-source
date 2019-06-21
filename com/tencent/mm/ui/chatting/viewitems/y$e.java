package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;
import com.tencent.mm.ui.ah;

final class y$e extends c.a
{
  ProgressBar pyf;
  ImageView zci;
  RTChattingEmojiView zdM;
  ImageView zdN;
  View zfA;
  ImageView zfB;
  ViewStub zfz;

  public final c.a z(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(33202);
    super.eP(paramView);
    this.enf = ((TextView)paramView.findViewById(2131820587));
    this.zdM = ((RTChattingEmojiView)paramView.findViewById(2131822578));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.zfA = paramView.findViewById(2131822600);
    this.zfB = ((ImageView)paramView.findViewById(2131822601));
    this.zfB.setImageDrawable(ah.f(paramView.getContext(), 2131231237, -1));
    if (paramBoolean)
      this.qkY = ((TextView)paramView.findViewById(2131821102));
    while (true)
    {
      if (this.zdN != null)
        ((ViewGroup)this.zdN.getParent()).setBackgroundDrawable(null);
      this.zfz = ((ViewStub)paramView.findViewById(2131822665));
      AppMethodBeat.o(33202);
      return this;
      this.pyf = ((ProgressBar)paramView.findViewById(2131822660));
      this.qkY = ((TextView)paramView.findViewById(2131821102));
      this.zby = ((ImageView)paramView.findViewById(2131822629));
      this.zci = ((ImageView)paramView.findViewById(2131822661));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.y.e
 * JD-Core Version:    0.6.2
 */