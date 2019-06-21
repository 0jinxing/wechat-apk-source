package com.tencent.mm.graphics.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLongClickListener;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.graphics.b.d;
import com.tencent.mm.graphics.b.d.1;
import com.tencent.mm.graphics.c.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class WxBaseImageView extends FrameLayout
{
  private long aIv;
  private boolean cph;
  private ViewStub eDd;
  private ViewStub eDe;
  private ImageView eDf;
  private SubsamplingScaleImageView eDg;
  private com.tencent.mm.graphics.a.b eDh;
  private a eDi;
  private com.tencent.mm.graphics.a.c eDj;
  private boolean eDk;
  private a.a eDl;
  private a.a eDm;
  private boolean eDn;
  private boolean eDo;
  private boolean eDp;
  private boolean eDq;
  private boolean eDr;
  private boolean eDs;
  private al eDt;
  protected int imageHeight;
  protected int imageWidth;
  private Context mContext;
  private Rect mRect;

  public WxBaseImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public WxBaseImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(57110);
    this.eDd = null;
    this.eDe = null;
    this.eDf = null;
    this.eDg = null;
    this.eDh = null;
    this.eDi = null;
    this.eDj = com.tencent.mm.graphics.a.c.eCx;
    this.eDk = false;
    this.mRect = new Rect();
    this.eDr = false;
    this.eDs = false;
    this.eDt = null;
    this.mContext = paramContext;
    LayoutInflater.from(getContext()).inflate(2130971005, this, true);
    this.eDd = ((ViewStub)findViewById(2131828438));
    paramContext = this.eDd.inflate();
    if (paramContext != null)
    {
      this.eDg = ((SubsamplingScaleImageView)paramContext);
      this.eDg.setVisibility(0);
    }
    paramContext = com.tencent.mm.graphics.b.c.eCI;
    if (!paramContext.eCM)
    {
      paramContext.eCM = true;
      ab.i("MicroMsg.Metronome", "[start] stack:%s", new Object[] { bo.dpG() });
      paramContext.bsZ.postFrameCallback(paramContext);
    }
    d.eCO.eCP = new WeakReference(this.mContext);
    this.eDg.setOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
    {
      public final void onViewAttachedToWindow(View paramAnonymousView)
      {
      }

      public final void onViewDetachedFromWindow(View paramAnonymousView)
      {
        AppMethodBeat.i(57102);
        d.eCO.Pz();
        WxBaseImageView.a(WxBaseImageView.this);
        AppMethodBeat.o(57102);
      }
    });
    AppMethodBeat.o(57110);
  }

  private void PB()
  {
    AppMethodBeat.i(57127);
    if (!this.eDk)
      AppMethodBeat.o(57127);
    while (true)
    {
      return;
      if (this.cph)
      {
        AppMethodBeat.o(57127);
      }
      else if ((this.eDn) && (!this.eDp))
      {
        AppMethodBeat.o(57127);
      }
      else if ((this.eDo) && (!this.eDq))
      {
        AppMethodBeat.o(57127);
      }
      else
      {
        ab.i("MicroMsg.WxBaseImageView", "alvinluo reportImageInfo info ready and report");
        com.tencent.mm.graphics.c.a locala = com.tencent.mm.graphics.c.a.eCU;
        com.tencent.mm.graphics.c.a.a(this.eDm, this.eDl);
        this.cph = true;
        AppMethodBeat.o(57127);
      }
    }
  }

  private String getActivityName()
  {
    AppMethodBeat.i(57124);
    String str;
    if ((this.mContext != null) && ((this.mContext instanceof Activity)))
    {
      str = ((Activity)this.mContext).getClass().getSimpleName();
      AppMethodBeat.o(57124);
    }
    while (true)
    {
      return str;
      str = "Default";
      AppMethodBeat.o(57124);
    }
  }

  private void jp(int paramInt)
  {
    AppMethodBeat.i(57125);
    try
    {
      com.davemorrissey.labs.subscaleview.d.a locala;
      if ((this.eDg != null) && (this.eDl != null))
      {
        this.eDl.eCY = ((int)(System.currentTimeMillis() - this.aIv));
        locala = this.eDg.getImageDecodeRecord();
        if (locala == null)
          break label141;
      }
      label141: for (this.eDl.eCZ = locala.aIE; ; this.eDl.eCZ = 0)
      {
        this.eDl.eCX = paramInt;
        this.eDl.orientation = this.eDg.getPreviewOrientation();
        this.eDl.width = this.eDg.getPreviewWidth();
        this.eDl.height = this.eDg.getPreviewHeight();
        this.eDl.aIY = 1;
        this.eDl.fileSize = e.cs(this.eDl.imagePath);
        AppMethodBeat.o(57125);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WxBaseImageView", localException, "alvinluo fillPreviewInfo exception", new Object[0]);
        AppMethodBeat.o(57125);
      }
    }
  }

  private void jq(int paramInt)
  {
    AppMethodBeat.i(57126);
    try
    {
      com.davemorrissey.labs.subscaleview.d.a locala;
      a.a locala1;
      int i;
      if ((this.eDg != null) && (this.eDm != null))
      {
        this.eDm.eCY = ((int)(System.currentTimeMillis() - this.aIv));
        locala = this.eDg.getImageDecodeRecord();
        if (locala == null)
          break label158;
        locala1 = this.eDm;
        i = locala.aIF;
      }
      label158: for (locala1.eCZ = (locala.aIG + i); ; this.eDl.eCZ = 0)
      {
        this.eDm.eCX = paramInt;
        this.eDm.orientation = this.eDg.getRequiredRotation();
        this.eDm.width = this.eDg.getSWidth();
        this.eDm.height = this.eDg.getSHeight();
        this.eDm.aIY = this.eDg.getFullImageSampleSize();
        this.eDm.fileSize = e.cs(this.eDm.imagePath);
        AppMethodBeat.o(57126);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WxBaseImageView", localException, "alvinluo fillMainInfo exception", new Object[0]);
        AppMethodBeat.o(57126);
      }
    }
  }

  public final void PA()
  {
    AppMethodBeat.i(57123);
    if (this.eDg != null)
    {
      SubsamplingScaleImageView localSubsamplingScaleImageView = this.eDg;
      localSubsamplingScaleImageView.a(localSubsamplingScaleImageView.aKy, new PointF(0.0F, 0.0F));
    }
    AppMethodBeat.o(57123);
  }

  public final void a(String paramString, com.davemorrissey.labs.subscaleview.view.a parama)
  {
    AppMethodBeat.i(57113);
    ab.d("MicroMsg.WxBaseImageView", "alvinluo: loading from local file: %s, width: %d, height: %d", new Object[] { paramString, Integer.valueOf(this.imageWidth), Integer.valueOf(this.imageHeight) });
    if (this.eDj == com.tencent.mm.graphics.a.c.eCx)
      if (this.eDg == null)
      {
        ab.e("MicroMsg.WxBaseImageView", "alvinluo WxBaseImageView laodFile mTileIv is null");
        AppMethodBeat.o(57113);
      }
    while (true)
    {
      return;
      if (paramString == null)
      {
        ab.i("MicroMsg.WxBaseImageView", "alvinluo WxBaseImageView loadFile path is null");
        AppMethodBeat.o(57113);
      }
      else
      {
        this.eDd.setVisibility(0);
        com.davemorrissey.labs.subscaleview.view.a locala = com.davemorrissey.labs.subscaleview.view.a.af(paramString);
        int i = this.imageWidth;
        int j = this.imageHeight;
        if (locala.bitmap == null)
        {
          locala.aIJ = i;
          locala.aIK = j;
        }
        if (locala.aIL != null)
        {
          locala.aII = true;
          locala.aIJ = locala.aIL.width();
          locala.aIK = locala.aIL.height();
        }
        this.aIv = System.currentTimeMillis();
        ab.i("MicroMsg.WxBaseImageView", "alvinluo onStartLoad imagePath: %s, mStartLoadTime: %d", new Object[] { paramString, Long.valueOf(this.aIv) });
        this.eDm = new a.a();
        this.eDm.eCW = 22;
        this.eDm.imagePath = paramString;
        this.eDm.cKf = getActivityName();
        this.eDo = true;
        if (parama != null)
        {
          this.eDl = new a.a();
          if (parama.uri != null)
          {
            this.eDl.imagePath = parama.uri.toString();
            label286: this.eDl.eCW = 21;
            this.eDl.cKf = getActivityName();
          }
        }
        for (this.eDn = true; ; this.eDn = false)
        {
          if (parama == null)
            break label354;
          this.eDg.a(locala, parama);
          AppMethodBeat.o(57113);
          break;
          this.eDl.imagePath = "";
          break label286;
        }
        label354: this.eDg.setImage(locala);
        AppMethodBeat.o(57113);
      }
    }
  }

  public final void bW(int paramInt1, int paramInt2)
  {
    this.imageWidth = paramInt1;
    this.imageHeight = paramInt2;
  }

  public Bitmap getFullImageBitmap()
  {
    AppMethodBeat.i(57118);
    Bitmap localBitmap;
    if (this.eDg != null)
    {
      localBitmap = this.eDg.getFullImageBitmap();
      AppMethodBeat.o(57118);
    }
    while (true)
    {
      return localBitmap;
      localBitmap = null;
      AppMethodBeat.o(57118);
    }
  }

  public float getScale()
  {
    AppMethodBeat.i(57122);
    float f;
    if (this.eDg != null)
    {
      f = this.eDg.getScale();
      AppMethodBeat.o(57122);
    }
    while (true)
    {
      return f;
      f = 1.0F;
      AppMethodBeat.o(57122);
    }
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57111);
    super.onMeasure(paramInt1, paramInt2);
    this.mRect.left = getLeft();
    this.mRect.right = getRight();
    this.mRect.top = getTop();
    this.mRect.bottom = getBottom();
    if (!getGlobalVisibleRect(this.mRect))
      this.eDk = false;
    while (true)
    {
      PB();
      AppMethodBeat.o(57111);
      return;
      ab.d("MicroMsg.WxBaseImageView", "alvinluo ImageView visible, can report");
      this.eDk = true;
      if (this.eDs)
        continue;
      this.eDs = true;
      d locald = d.eCO;
      synchronized (locald.eCR)
      {
        if (locald.isRunning)
        {
          ab.w("MicroMsg.PerformanceMonitor", "hy: already running. stop last and run new");
          locald.isRunning = false;
        }
        if (locald.mTimer != null)
          locald.mTimer.cancel();
        System.gc();
        Object localObject3 = new java/util/Timer;
        ((Timer)localObject3).<init>("Handle_Monitor_mem_cpu", true);
        locald.mTimer = ((Timer)localObject3);
        locald.eCQ.clear();
        if ((locald.eCP != null) && (locald.eCP.get() != null))
        {
          localObject4 = locald.eCQ;
          localObject3 = new com/tencent/mm/graphics/b/b;
          ((com.tencent.mm.graphics.b.b)localObject3).<init>((Context)locald.eCP.get());
          ((HashMap)localObject4).put(Integer.valueOf(2), localObject3);
        }
        Object localObject4 = locald.mTimer;
        localObject3 = new com/tencent/mm/graphics/b/d$1;
        ((d.1)localObject3).<init>(locald);
        ((Timer)localObject4).scheduleAtFixedRate((TimerTask)localObject3, 0L, 5L);
        locald.isRunning = true;
      }
    }
  }

  public void setAnimateMode(com.tencent.mm.graphics.a.a parama)
  {
    AppMethodBeat.i(57116);
    ab.d("MicroMsg.WxBaseImageView", "hy: set current animation mode: %s", new Object[] { parama });
    AppMethodBeat.o(57116);
  }

  public void setEdgeSwipeListener(SubsamplingScaleImageView.c paramc)
  {
    AppMethodBeat.i(57115);
    this.eDg.setEdgeSwipeListener(paramc);
    AppMethodBeat.o(57115);
  }

  public void setFitType(ImageView.ScaleType paramScaleType)
  {
    AppMethodBeat.i(57117);
    ab.d("MicroMsg.WxBaseImageView", "hy: set fit type: %s", new Object[] { paramScaleType });
    AppMethodBeat.o(57117);
  }

  public void setForceTileFlag(com.tencent.mm.graphics.a.c paramc)
  {
    AppMethodBeat.i(57112);
    ab.d("MicroMsg.WxBaseImageView", "hy: setting force tile flag; %s", new Object[] { paramc });
    this.eDj = paramc;
    AppMethodBeat.o(57112);
  }

  public void setGestureDetectorListener(GestureDetector.SimpleOnGestureListener paramSimpleOnGestureListener)
  {
    AppMethodBeat.i(57119);
    if (this.eDg != null)
      this.eDg.setGestureDetectorListener(paramSimpleOnGestureListener);
    AppMethodBeat.o(57119);
  }

  public void setImageMatrix(Matrix paramMatrix)
  {
  }

  public void setOnImageLoadEventListener(com.tencent.mm.graphics.a.b paramb)
  {
    AppMethodBeat.i(57121);
    if (this.eDg != null)
    {
      this.eDh = new WxBaseImageView.3(this, paramb);
      this.eDg.setOnImageEventListener(this.eDh);
    }
    AppMethodBeat.o(57121);
  }

  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    AppMethodBeat.i(57120);
    if (this.eDg != null)
      this.eDg.setOnLongClickListener(paramOnLongClickListener);
    AppMethodBeat.o(57120);
  }

  public void setScaleRate(float paramFloat)
  {
    AppMethodBeat.i(57114);
    if (this.eDg != null)
      this.eDg.setScaleRate(paramFloat);
    AppMethodBeat.o(57114);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.ui.WxBaseImageView
 * JD-Core Version:    0.6.2
 */