package com.tencent.mm.plugin.sight.encode.ui;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.Camera.Parameters;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.compatible.e.x;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.d.a;
import com.tencent.mm.plugin.sight.encode.a.a;
import com.tencent.mm.plugin.sight.encode.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;

public abstract class SightCameraView extends FrameLayout
  implements d.a
{
  protected int fcL = 320;
  private long iQb = 0L;
  private com.tencent.mm.model.d iaf = new com.tencent.mm.model.d();
  private Animation nCY;
  protected boolean qBA = false;
  protected boolean qBB = false;
  protected int qBC = 6500;
  protected SightCameraView.a qBD;
  private ap qBE = new ap(Looper.getMainLooper(), new SightCameraView.1(this), true);
  private int qBF = -1;
  private Runnable qBG = new SightCameraView.2(this);
  private Runnable qBH = new SightCameraView.3(this);
  protected e qBu;
  protected a qBv;
  protected ImageView qBw;
  protected Runnable qBx;
  protected long qBy = -1L;
  protected b qBz = b.qBL;

  public SightCameraView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SightCameraView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (com.tencent.mm.plugin.sight.base.d.ckV())
      inflate(getContext(), 2130970685, this);
    while (true)
    {
      this.qBA = false;
      this.qBB = false;
      this.qBu = new e();
      paramContext = this.qBu;
      ab.i("MicroMsg.SightCamera", "init needRotate %s", new Object[] { Boolean.FALSE });
      if (q.ete.etU)
      {
        paramContext.qBs.ouT = q.ete.mVideoHeight;
        paramContext.qBs.ouU = q.ete.mVideoWidth;
        paramContext.qBs.ouS = q.ete.etW;
      }
      paramContext.qBs.ovd = com.tencent.mm.compatible.e.d.getNumberOfCameras();
      paramContext.qBs.rotate = 0;
      this.qBw = ((ImageView)findViewById(2131827543));
      clT();
      return;
      inflate(getContext(), 2130970684, this);
    }
  }

  private void clT()
  {
    if (this.qBw.getVisibility() == 4);
    while (true)
    {
      return;
      if (this.nCY != null)
        this.nCY.cancel();
      this.qBw.setVisibility(4);
    }
  }

  public final void aW(float paramFloat)
  {
    ab.d("MicroMsg.SightCameraView", "update progress %f", new Object[] { Float.valueOf(paramFloat) });
    if (this.qBF < 0)
      this.qBF = getResources().getDisplayMetrics().widthPixels;
    ViewGroup.LayoutParams localLayoutParams;
    if (paramFloat < 0.0F)
    {
      localLayoutParams = this.qBw.getLayoutParams();
      localLayoutParams.width = this.qBF;
      this.qBw.setLayoutParams(localLayoutParams);
    }
    while (true)
    {
      return;
      int i;
      if (paramFloat > 1.0F)
      {
        i = this.qBF / 2;
        localLayoutParams = this.qBw.getLayoutParams();
        localLayoutParams.width = (this.qBF - (i - 1) * 2);
        this.qBw.setLayoutParams(localLayoutParams);
      }
      else
      {
        i = (int)(getResources().getDisplayMetrics().widthPixels * paramFloat / 2.0F);
        localLayoutParams = this.qBw.getLayoutParams();
        localLayoutParams.width = (this.qBF - i * 2);
        this.qBw.setLayoutParams(localLayoutParams);
      }
    }
  }

  protected abstract void bg(String paramString, boolean paramBoolean);

  protected final void bty()
  {
    ab.w("MicroMsg.SightCameraView", "cancel record");
    if (this.qBv == null)
      throw new IllegalStateException("The mSightMedia must be set!");
    aw.RS().doN().removeCallbacks(this.qBG);
    aw.RS().aa(this.qBH);
    this.qBE.stopTimer();
    aW(0.0F);
    clT();
    setKeepScreenOn(false);
  }

  protected abstract void clS();

  protected final void clU()
  {
    this.iaf.a(this);
  }

  protected final void clV()
  {
    this.iaf.cy(false);
  }

  public a.a getCurMediaStatus()
  {
    return this.qBv.clA();
  }

  public int getDuration()
  {
    return this.qBv.getDuration();
  }

  protected abstract Surface getPreviewSurface();

  public String getRecordPath()
  {
    return this.qBv.getRecordPath();
  }

  protected abstract int getSurfaceHeight();

  protected abstract int getSurfaceWidth();

  public abstract boolean isPlaying();

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    e locale;
    if ((paramMotionEvent.getAction() == 0) && (this.qBA) && (this.qBB))
    {
      ab.i("MicroMsg.SightCameraView", "check double click %dms", new Object[] { Long.valueOf(SystemClock.elapsedRealtime() - this.qBy) });
      if (SystemClock.elapsedRealtime() - this.qBy >= 400L)
        break label358;
      this.qBu.qBt.removeMessages(4354);
      locale = this.qBu;
      if (locale.otL)
        break label122;
      ab.w("MicroMsg.SightCamera", "want to trigger zoom, but current status is not preview");
    }
    while (true)
    {
      this.qBy = SystemClock.elapsedRealtime();
      paramMotionEvent.getX();
      paramMotionEvent.getY();
      com.tencent.mm.compatible.util.d.fP(14);
      return true;
      try
      {
        label122: Camera.Parameters localParameters = locale.erH.getParameters();
        if (localParameters == null)
          continue;
        ab.i("MicroMsg.SightCamera", "trigger zoom, has zoomed %B, isSupported %B", new Object[] { Boolean.valueOf(locale.faH), Boolean.valueOf(localParameters.isZoomSupported()) });
        if (!localParameters.isZoomSupported())
          continue;
        locale.qBt.removeMessages(4353);
        if (locale.faH)
        {
          locale.qBt.faI = false;
          locale.qBt.faH = false;
          locale.qBt.faG = (e.a.f(localParameters) * -1);
          locale.qBt.sendMessage(locale.qBt.obtainMessage(4353, locale.erH));
          if (!locale.faH)
            bool = true;
          locale.faH = bool;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.SightCamera", "getParameters failed %s", new Object[] { localException.getMessage() });
          ab.printErrStackTrace("MicroMsg.SightCamera", localException, "", new Object[0]);
          localObject = null;
          continue;
          locale.qBt.faI = false;
          locale.qBt.faH = true;
          locale.qBt.faG = e.a.f((Camera.Parameters)localObject);
          locale.qBt.sendMessage(locale.qBt.obtainMessage(4353, locale.erH));
        }
      }
      label358: Object localObject = this.qBu;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      int i = getSurfaceWidth();
      int j = getSurfaceHeight();
      if (!com.tencent.mm.compatible.util.d.fP(14))
      {
        ((e)localObject).qBt.removeMessages(4354);
        ((e)localObject).qBt.faK = f1;
        ((e)localObject).qBt.faL = f2;
        ((e)localObject).qBt.faM = i;
        ((e)localObject).qBt.faN = j;
        ((e)localObject).qBt.sendMessageDelayed(((e)localObject).qBt.obtainMessage(4354, ((e)localObject).erH), 400L);
      }
    }
  }

  public abstract void setFixPreviewRate(float paramFloat);

  protected abstract void setIsMute(boolean paramBoolean);

  public void setPreviewRate(float paramFloat)
  {
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    localLayoutParams.width = localDisplayMetrics.widthPixels;
    localLayoutParams.height = ((int)(localDisplayMetrics.widthPixels / paramFloat));
    ab.i("MicroMsg.SightCameraView", "resizeLayout width:%d, height:%d, previewRate %f", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height), Float.valueOf(paramFloat) });
    postInvalidate();
  }

  public void setRecordMaxDuring(int paramInt)
  {
    ab.d("MicroMsg.SightCameraView", "setRecordMaxDuring recordMaxDuring : ".concat(String.valueOf(paramInt)));
    this.qBC = paramInt;
  }

  public void setSightCameraUIIm(SightCameraView.a parama)
  {
    this.qBD = parama;
  }

  public void setSightMedia(a parama)
  {
    this.qBv = parama;
    if ((this.qBv != null) && (this.qBu != null))
      this.qBu.mPreviewCallback = this.qBv.clB();
  }

  protected void setStopCallback(Runnable paramRunnable)
  {
    this.qBx = paramRunnable;
  }

  public void setTargetWidth(int paramInt)
  {
    this.fcL = paramInt;
  }

  protected static enum b
  {
    static
    {
      AppMethodBeat.i(25114);
      qBJ = new b("CREATE", 0);
      qBK = new b("CHANGED", 1);
      qBL = new b("DESTORY", 2);
      qBM = new b[] { qBJ, qBK, qBL };
      AppMethodBeat.o(25114);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.SightCameraView
 * JD-Core Version:    0.6.2
 */