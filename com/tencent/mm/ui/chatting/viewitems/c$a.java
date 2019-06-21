package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ca.a;
import com.tencent.mm.ui.chatting.view.AvatarImageView;

public class c$a
{
  public TextView enf;
  public View iVh;
  public View jPL;
  public View mRR;
  public CheckBox moo;
  public ProgressBar pyf;
  public TextView qkY;
  public c zbA;
  public AvatarImageView zbv;
  public ViewStub zbw;
  public View zbx;
  public ImageView zby;
  public String zbz;

  public static void an(View paramView, int paramInt)
  {
    AppMethodBeat.i(32789);
    if (paramView != null)
    {
      ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
      localLayoutParams.width = ((int)(paramInt / a.dmK()));
      paramView.setLayoutParams(localLayoutParams);
      paramView.requestLayout();
    }
    AppMethodBeat.o(32789);
  }

  public final void eP(View paramView)
  {
    AppMethodBeat.i(32787);
    this.mRR = paramView;
    this.enf = ((TextView)paramView.findViewById(2131820587));
    this.zbv = ((AvatarImageView)paramView.findViewById(2131821101));
    this.zbx = paramView.findViewById(2131820583);
    this.jPL = paramView.findViewById(2131822515);
    this.zby = ((ImageView)paramView.findViewById(2131822629));
    this.zbw = ((ViewStub)paramView.findViewById(2131822452));
    AppMethodBeat.o(32787);
  }

  public final void qy(boolean paramBoolean)
  {
    AppMethodBeat.i(32788);
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      if ((this.moo != null) && (this.moo.getVisibility() != i))
        this.moo.setVisibility(i);
      if ((this.iVh != null) && (this.iVh.getVisibility() != i))
        this.iVh.setVisibility(i);
      AppMethodBeat.o(32788);
      return;
    }
  }

  public final void setChattingBG(boolean paramBoolean)
  {
    AppMethodBeat.i(32786);
    if (this.zbv != null)
      this.zbv.setChattingBG(paramBoolean);
    AppMethodBeat.o(32786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.c.a
 * JD-Core Version:    0.6.2
 */