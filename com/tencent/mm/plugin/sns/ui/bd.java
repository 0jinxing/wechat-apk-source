package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bd
{
  Context mContext;
  int qDY = -1;
  FrameLayout qOM;
  private au qPr;
  SnsCommentShowAbLayout rDJ = null;
  LinearLayout rpT;
  LinearLayout rpU;

  public bd(Context paramContext, au paramau, FrameLayout paramFrameLayout)
  {
    this.mContext = paramContext;
    this.qPr = paramau;
    this.qOM = paramFrameLayout;
  }

  public final boolean crO()
  {
    AppMethodBeat.i(39884);
    boolean bool;
    if (this.rDJ != null)
    {
      this.qOM.removeView(this.rDJ);
      this.rDJ = null;
      bool = true;
      AppMethodBeat.o(39884);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(39884);
    }
  }

  final void dP(final View paramView)
  {
    AppMethodBeat.i(39883);
    paramView.clearAnimation();
    paramView.startAnimation(this.qPr.rpS);
    this.qPr.rpS.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        AppMethodBeat.i(39882);
        if (paramView != null)
        {
          paramView.setVisibility(8);
          bd.this.crO();
        }
        AppMethodBeat.o(39882);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    AppMethodBeat.o(39883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bd
 * JD-Core Version:    0.6.2
 */