package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.a;

public class TalkRoomPopupNav extends LinearLayout
{
  public View miL;
  private a yAE;
  public LinearLayout yAF;
  private LinearLayout yAG;
  private ImageView yAH;
  private ImageView yAI;
  public ScaleAnimation yAJ;
  public Animation yAK;
  public int yAL;
  public int yAM;
  private ScaleAnimation yAN;
  private Animation yAO;
  private AlphaAnimation yAP;
  private AlphaAnimation yAQ;
  public LinearLayout yoK;

  public TalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(30017);
    this.yAL = 0;
    this.yAM = 0;
    initView();
    AppMethodBeat.o(30017);
  }

  @TargetApi(11)
  public TalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(30016);
    this.yAL = 0;
    this.yAM = 0;
    initView();
    AppMethodBeat.o(30016);
  }

  private void initView()
  {
    AppMethodBeat.i(30023);
    inflate(getContext(), 2130970917, this);
    this.yoK = ((LinearLayout)findViewById(2131828219));
    this.yAF = ((LinearLayout)findViewById(2131828223));
    this.yAG = ((LinearLayout)findViewById(2131828225));
    this.miL = findViewById(2131828218);
    this.yAH = ((ImageView)findViewById(2131828220));
    this.yAI = ((ImageView)findViewById(2131828221));
    this.yAI.setVisibility(8);
    this.yoK.setOnClickListener(new TalkRoomPopupNav.1(this));
    ((Button)findViewById(2131828226)).setOnClickListener(new TalkRoomPopupNav.2(this));
    ((Button)findViewById(2131828227)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(30008);
        TalkRoomPopupNav.b(TalkRoomPopupNav.this);
        if (TalkRoomPopupNav.a(TalkRoomPopupNav.this) != null)
          TalkRoomPopupNav.a(TalkRoomPopupNav.this).dAu();
        AppMethodBeat.o(30008);
      }
    });
    this.yAL = this.miL.getLayoutParams().height;
    this.yAM = this.yAF.getLayoutParams().height;
    AppMethodBeat.o(30023);
  }

  public void setBgViewResource(int paramInt)
  {
    AppMethodBeat.i(30020);
    if (this.miL != null)
      this.miL.setBackgroundResource(paramInt);
    AppMethodBeat.o(30020);
  }

  public void setDialogContent(String paramString)
  {
    AppMethodBeat.i(30019);
    ((TextView)findViewById(2131828224)).setText(paramString);
    AppMethodBeat.o(30019);
  }

  public void setIconAnim(int paramInt)
  {
    AppMethodBeat.i(30022);
    if (paramInt < 0)
    {
      if (this.yAI != null)
        this.yAI.setVisibility(8);
      AppMethodBeat.o(30022);
    }
    while (true)
    {
      return;
      if (this.yAI != null)
      {
        this.yAI.setImageResource(paramInt);
        this.yAI.setVisibility(0);
      }
      AppMethodBeat.o(30022);
    }
  }

  public void setIconRes(int paramInt)
  {
    AppMethodBeat.i(30021);
    if (this.yAH != null)
      this.yAH.setImageResource(paramInt);
    AppMethodBeat.o(30021);
  }

  public void setNavContent(String paramString)
  {
    AppMethodBeat.i(30018);
    ((TextView)findViewById(2131828222)).setText(paramString);
    AppMethodBeat.o(30018);
  }

  public void setOnClickListener(a parama)
  {
    this.yAE = parama;
  }

  public final void start()
  {
    AppMethodBeat.i(30024);
    if ((this.yAP == null) || (this.yAQ == null))
    {
      this.yAP = new AlphaAnimation(0.0F, 1.0F);
      this.yAP.setDuration(1000L);
      this.yAP.setStartOffset(0L);
      this.yAQ = new AlphaAnimation(1.0F, 0.0F);
      this.yAQ.setDuration(1000L);
      this.yAQ.setStartOffset(0L);
      this.yAP.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          AppMethodBeat.i(30014);
          if (TalkRoomPopupNav.f(TalkRoomPopupNav.this) != null)
            TalkRoomPopupNav.g(TalkRoomPopupNav.this).startAnimation(TalkRoomPopupNav.f(TalkRoomPopupNav.this));
          AppMethodBeat.o(30014);
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
        }
      });
      this.yAQ.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          AppMethodBeat.i(30015);
          if (TalkRoomPopupNav.h(TalkRoomPopupNav.this) != null)
            TalkRoomPopupNav.g(TalkRoomPopupNav.this).startAnimation(TalkRoomPopupNav.h(TalkRoomPopupNav.this));
          AppMethodBeat.o(30015);
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
        }
      });
      this.yAI.startAnimation(this.yAP);
    }
    AppMethodBeat.o(30024);
  }

  public final void stop()
  {
    AppMethodBeat.i(30025);
    if ((this.yAP != null) && (this.yAQ != null))
    {
      BackwardSupportUtil.a.a(this.yAI, this.yAP);
      BackwardSupportUtil.a.a(this.yAI, this.yAQ);
      this.yAI.clearAnimation();
      this.yAP = null;
      this.yAQ = null;
    }
    AppMethodBeat.o(30025);
  }

  public static abstract interface a
  {
    public abstract void dAt();

    public abstract void dAu();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.TalkRoomPopupNav
 * JD-Core Version:    0.6.2
 */