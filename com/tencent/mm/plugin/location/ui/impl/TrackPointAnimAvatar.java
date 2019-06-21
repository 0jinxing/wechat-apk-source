package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bo;

public class TrackPointAnimAvatar extends RelativeLayout
{
  private ImageView gvq;
  private Context mContext;
  private LinearLayout nRk;
  private Animation nRl;
  private Animation nRm;
  private String username;

  public TrackPointAnimAvatar(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(113734);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(113734);
  }

  public TrackPointAnimAvatar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113733);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(113733);
  }

  private void bKG()
  {
    AppMethodBeat.i(113737);
    this.nRl = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -0.5F);
    this.nRl.setDuration(500L);
    this.nRl.setFillAfter(true);
    this.nRm = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -0.5F, 1, 0.0F);
    this.nRm.setDuration(500L);
    this.nRm.setFillAfter(true);
    this.nRl.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        AppMethodBeat.i(113731);
        TrackPointAnimAvatar.this.bringToFront();
        TrackPointAnimAvatar.b(TrackPointAnimAvatar.this).startAnimation(TrackPointAnimAvatar.a(TrackPointAnimAvatar.this));
        AppMethodBeat.o(113731);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    this.nRm.setAnimationListener(new TrackPointAnimAvatar.2(this));
    AppMethodBeat.o(113737);
  }

  private void init()
  {
    AppMethodBeat.i(113735);
    View localView = View.inflate(this.mContext, 2130970965, this);
    this.nRk = ((LinearLayout)localView.findViewById(2131828357));
    this.gvq = ((ImageView)localView.findViewById(2131828358));
    bKG();
    AppMethodBeat.o(113735);
  }

  public void setUser(String paramString)
  {
    AppMethodBeat.i(113736);
    if (!bo.isNullOrNil(paramString))
    {
      this.username = paramString;
      if (this.gvq != null)
        a.b.r(this.gvq, this.username);
    }
    AppMethodBeat.o(113736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar
 * JD-Core Version:    0.6.2
 */