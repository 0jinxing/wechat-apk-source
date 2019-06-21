package com.tencent.mm.plugin.voip.widget;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.ui.c;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.MMTextureView;
import java.lang.ref.WeakReference;

public abstract class BaseSmallView extends FrameLayout
{
  private Runnable iYR = new Runnable()
  {
    public final void run()
    {
      AppMethodBeat.i(5136);
      float f = (float)(System.currentTimeMillis() - BaseSmallView.a(BaseSmallView.this)) * 1.0F / 200.0F;
      if (f <= 1.0F)
      {
        BaseSmallView.this.lda.postDelayed(BaseSmallView.b(BaseSmallView.this), 5L);
        BaseSmallView localBaseSmallView = BaseSmallView.this;
        int i = BaseSmallView.c(BaseSmallView.this).x;
        int j = (int)((BaseSmallView.d(BaseSmallView.this).x * 1.0F - BaseSmallView.c(BaseSmallView.this).x) * f);
        int k = BaseSmallView.c(BaseSmallView.this).y;
        BaseSmallView.a(localBaseSmallView, i + j, (int)(f * (BaseSmallView.d(BaseSmallView.this).y * 1.0F - BaseSmallView.c(BaseSmallView.this).y)) + k);
        AppMethodBeat.o(5136);
      }
      while (true)
      {
        return;
        BaseSmallView.a(BaseSmallView.this, BaseSmallView.d(BaseSmallView.this).x, BaseSmallView.d(BaseSmallView.this).y);
        BaseSmallView.this.onAnimationEnd();
        AppMethodBeat.o(5136);
      }
    }
  };
  private WindowManager lca;
  protected ak lda;
  private View.OnClickListener mOnClickListener;
  private long mStartTime;
  CaptureView sRg;
  protected long sRs;
  protected WeakReference<c> sVY;
  public MMTextureView sXQ;
  private PointF tbX = new PointF();
  private Point tbY = new Point();
  private Point tbZ = new Point();
  private Point tca = new Point();
  private Point tcb;

  public BaseSmallView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.lca = ((WindowManager)paramContext.getSystemService("window"));
    this.lda = new ak();
    this.tcb = new Point(this.lca.getDefaultDisplay().getWidth(), this.lca.getDefaultDisplay().getHeight());
  }

  private void gd(int paramInt1, int paramInt2)
  {
    WindowManager.LayoutParams localLayoutParams;
    if (this.lca != null)
    {
      localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
      localLayoutParams.x = paramInt1;
      localLayoutParams.y = paramInt2;
      ab.d("MicroMsg.Voip.BaseSmallView", "updateWindowPosition, x: %d, y: %d", new Object[] { Integer.valueOf(localLayoutParams.x), Integer.valueOf(localLayoutParams.y) });
    }
    try
    {
      this.lca.updateViewLayout(this, localLayoutParams);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Voip.BaseSmallView", localThrowable, "", new Object[0]);
    }
  }

  public void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
  }

  public void c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
  }

  public void cJD()
  {
  }

  protected abstract void cLq();

  protected abstract void cLr();

  public void dY(int paramInt1, int paramInt2)
  {
  }

  public abstract OpenGlRender getFilterData();

  protected abstract void onAnimationEnd();

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
      while (true)
      {
        return true;
        this.tbX.x = paramMotionEvent.getRawX();
        this.tbX.y = paramMotionEvent.getRawY();
        paramMotionEvent = (WindowManager.LayoutParams)getLayoutParams();
        this.tbY.x = paramMotionEvent.x;
        this.tbY.y = paramMotionEvent.y;
        continue;
        gd((int)Math.max(Math.min(this.tbY.x + paramMotionEvent.getRawX() - this.tbX.x, this.tcb.x), 0.0F), (int)Math.max(Math.min(this.tbY.y + paramMotionEvent.getRawY() - this.tbX.y, this.tcb.y), 0.0F));
      }
    case 1:
    }
    if ((Math.abs(paramMotionEvent.getRawX() - this.tbX.x) < BackwardSupportUtil.b.b(getContext(), 3.0F)) && (Math.abs(paramMotionEvent.getRawY() - this.tbX.y) < BackwardSupportUtil.b.b(getContext(), 3.0F)) && (this.mOnClickListener != null))
      this.mOnClickListener.onClick(this);
    cLq();
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    this.tbZ.x = ((int)Math.max(Math.min(f1 + this.tbY.x - this.tbX.x, this.tcb.x), 0.0F));
    this.tbZ.y = ((int)Math.max(Math.min(f2 + this.tbY.y - this.tbX.y, this.tcb.y), 0.0F));
    int i = BackwardSupportUtil.b.b(getContext(), 5.0F);
    if (this.tbZ.x + getWidth() / 2 <= this.tcb.x / 2);
    for (this.tca.x = i; ; this.tca.x = (this.tcb.x - getWidth() - i))
    {
      this.tca.y = this.tbZ.y;
      this.mStartTime = System.currentTimeMillis();
      this.lda.postDelayed(this.iYR, 5L);
      cLr();
      break;
    }
  }

  public abstract void setCaptureView(CaptureView paramCaptureView);

  public void setConnectSec(long paramLong)
  {
    this.sRs = paramLong;
  }

  public void setHWDecMode(int paramInt)
  {
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }

  public void setVoipBeauty(int paramInt)
  {
  }

  public void setVoipUIListener(c paramc)
  {
    ab.i("MicroMsg.Voip.BaseSmallView", "hwViewSmall setVoipUIListener, before initHWView");
    this.sVY = new WeakReference(paramc);
    ((c)this.sVY.get()).b(this.sXQ);
  }

  public void uninit()
  {
    this.lda.removeCallbacks(this.iYR);
    this.lca = null;
    if (this.sRg != null)
    {
      removeView(this.sRg);
      this.sRg = null;
      ab.d("MicroMsg.Voip.BaseSmallView", "CaptureView removed");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.BaseSmallView
 * JD-Core Version:    0.6.2
 */