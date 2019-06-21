package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

public class WebViewBag extends FrameLayout
{
  private static final int uze;
  private ImageView iUn;
  private Runnable iYR;
  private View kRR;
  private WindowManager lca;
  protected ak lda;
  private View.OnClickListener mOnClickListener;
  private long mStartTime;
  private PointF tbX;
  private Point tbY;
  private Point tbZ;
  private Point tca;
  private Point tcb;
  private a uzb;
  private WebViewBagBgView uzc;
  private boolean uzd;

  static
  {
    AppMethodBeat.i(8196);
    uze = com.tencent.mm.bz.a.ge(ah.getContext()) - b.uyh - b.uyj - b.uyk;
    AppMethodBeat.o(8196);
  }

  public WebViewBag(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(8186);
    this.tbX = new PointF();
    this.tbY = new Point();
    this.tbZ = new Point();
    this.tca = new Point();
    this.iYR = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(8184);
        float f = (float)(System.currentTimeMillis() - WebViewBag.a(WebViewBag.this)) * 1.0F / 200.0F;
        if (f <= 1.0F)
        {
          WebViewBag.this.lda.postDelayed(WebViewBag.b(WebViewBag.this), 5L);
          WebViewBag localWebViewBag = WebViewBag.this;
          int i = WebViewBag.c(WebViewBag.this).x;
          int j = (int)((WebViewBag.d(WebViewBag.this).x * 1.0F - WebViewBag.c(WebViewBag.this).x) * f);
          int k = WebViewBag.c(WebViewBag.this).y;
          WebViewBag.a(localWebViewBag, i + j, (int)(f * (WebViewBag.d(WebViewBag.this).y * 1.0F - WebViewBag.c(WebViewBag.this).y)) + k);
          AppMethodBeat.o(8184);
        }
        while (true)
        {
          return;
          WebViewBag.a(WebViewBag.this, WebViewBag.d(WebViewBag.this).x, WebViewBag.d(WebViewBag.this).y);
          WebViewBag.e(WebViewBag.this);
          AppMethodBeat.o(8184);
        }
      }
    };
    this.lca = ((WindowManager)paramContext.getSystemService("window"));
    this.lda = new ak();
    this.tcb = new Point(com.tencent.mm.bz.a.gd(ah.getContext()), com.tencent.mm.bz.a.ge(ah.getContext()));
    LayoutInflater.from(paramContext).inflate(2130971209, this);
    this.iUn = ((ImageView)findViewById(2131820915));
    this.uzc = ((WebViewBagBgView)findViewById(2131829163));
    this.kRR = findViewById(2131820987);
    this.uzc.setStartColor(paramContext.getResources().getColor(2131690676));
    this.uzc.setAngryColor(paramContext.getResources().getColor(2131690675));
    AppMethodBeat.o(8186);
  }

  private void gd(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(8193);
    WindowManager.LayoutParams localLayoutParams;
    if (this.lca != null)
    {
      localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
      localLayoutParams.x = paramInt1;
      localLayoutParams.y = paramInt2;
    }
    while (true)
    {
      try
      {
        this.lca.updateViewLayout(this, localLayoutParams);
        AppMethodBeat.o(8193);
        return;
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.WebViewBag", localThrowable, "", new Object[0]);
      }
      AppMethodBeat.o(8193);
    }
  }

  public final void a(com.tencent.mm.ui.widget.c paramc)
  {
    AppMethodBeat.i(8188);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.addAnimation(localAlphaAnimation);
    localAnimationSet.addAnimation(localScaleAnimation);
    localAnimationSet.setDuration(80L);
    localAnimationSet.restrictDuration(100L);
    localAnimationSet.setAnimationListener(paramc);
    localAnimationSet.setFillAfter(true);
    this.kRR.startAnimation(localAnimationSet);
    AppMethodBeat.o(8188);
  }

  public final void dbe()
  {
    AppMethodBeat.i(8187);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.addAnimation(localAlphaAnimation);
    localAnimationSet.addAnimation(localScaleAnimation);
    localAnimationSet.setDuration(100L);
    localAnimationSet.restrictDuration(150L);
    localAnimationSet.setFillAfter(true);
    this.kRR.startAnimation(localAnimationSet);
    AppMethodBeat.o(8187);
  }

  protected Point getLastTouchDownViewPos()
  {
    return this.tbY;
  }

  public final void j(int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(8190);
    WebViewBagBgView localWebViewBagBgView = this.uzc;
    localWebViewBagBgView.uzn = false;
    long l = System.currentTimeMillis();
    ab.i("MicroMsg.WebViewBagBgView", "setAngryInfo:%d now:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l) });
    localWebViewBagBgView.mDuration = paramInt1;
    localWebViewBagBgView.svV = paramInt2;
    localWebViewBagBgView.mStartTime = paramLong;
    localWebViewBagBgView.lT(l);
    if (paramLong > l)
      localWebViewBagBgView.postDelayed(new WebViewBagBgView.1(localWebViewBagBgView), paramLong - l);
    while (true)
    {
      localWebViewBagBgView.invalidate();
      AppMethodBeat.o(8190);
      return;
      localWebViewBagBgView.uzn = true;
    }
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(8185);
    ab.i("MicroMsg.WebViewBag", "onConfigurationChanged orientation:%d", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    this.tcb.x = com.tencent.mm.bz.a.gd(ah.getContext());
    this.tcb.y = com.tencent.mm.bz.a.ge(ah.getContext());
    AppMethodBeat.o(8185);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(8192);
    boolean bool;
    if (!this.uzd)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(8192);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      if (this.uzb != null)
        this.uzb.onTouchEvent(paramMotionEvent);
      bool = true;
      AppMethodBeat.o(8192);
      break;
      this.tbX.x = paramMotionEvent.getRawX();
      this.tbX.y = paramMotionEvent.getRawY();
      WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
      this.tbY.x = localLayoutParams.x;
      this.tbY.y = localLayoutParams.y;
      continue;
      gd((int)Math.max(Math.min(this.tbY.x + paramMotionEvent.getRawX() - this.tbX.x, this.tcb.x), 0.0F), (int)Math.max(Math.min(this.tbY.y + paramMotionEvent.getRawY() - this.tbX.y, this.tcb.y), 0.0F));
      continue;
      if ((Math.abs(paramMotionEvent.getRawX() - this.tbX.x) >= BackwardSupportUtil.b.b(getContext(), 3.0F)) || (Math.abs(paramMotionEvent.getRawY() - this.tbX.y) >= BackwardSupportUtil.b.b(getContext(), 3.0F)))
        break label300;
      if (this.mOnClickListener != null)
        this.mOnClickListener.onClick(this);
    }
    label300: float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    this.tbZ.x = ((int)Math.max(Math.min(f1 + this.tbY.x - this.tbX.x, this.tcb.x), 0.0F));
    this.tbZ.y = ((int)Math.max(Math.min(f2 + this.tbY.y - this.tbX.y, this.tcb.y), 0.0F));
    if (this.tbZ.x + getWidth() / 2 <= this.tcb.x / 2)
    {
      this.tca.x = b.uyk;
      label432: this.tca.y = this.tbZ.y;
      if (this.tca.y != 0)
        break label547;
      this.tca.y = b.uyk;
    }
    while (true)
    {
      this.mStartTime = System.currentTimeMillis();
      this.lda.postDelayed(this.iYR, 5L);
      if (this.uzb == null)
        break;
      this.uzb.gz(this.tca.x, this.tca.y);
      break;
      this.tca.x = (this.tcb.x - getWidth() - b.uyk);
      break label432;
      label547: if (this.tca.y > uze)
        this.tca.y = uze;
    }
  }

  public void setIcon(String paramString)
  {
    AppMethodBeat.i(8189);
    Object localObject = new c.a();
    ((c.a)localObject).eQf = true;
    ((c.a)localObject).ePH = true;
    ((c.a)localObject).ePK = com.tencent.mm.plugin.i.c.XW();
    ((c.a)localObject).ePT = 2131232157;
    localObject = ((c.a)localObject).ahG();
    o.ahp().a(paramString, this.iUn, (com.tencent.mm.at.a.a.c)localObject);
    AppMethodBeat.o(8189);
  }

  public void setListener(a parama)
  {
    this.uzb = parama;
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }

  public void setTouchEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(8191);
    ab.i("MicroMsg.WebViewBag", "setTouchEnable enable:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.uzd = paramBoolean;
    AppMethodBeat.o(8191);
  }

  public static abstract interface a
  {
    public abstract void gz(int paramInt1, int paramInt2);

    public abstract void onTouchEvent(MotionEvent paramMotionEvent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag
 * JD-Core Version:    0.6.2
 */