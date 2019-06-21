package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.model.d.a;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.b;
import com.tencent.mm.pluginsdk.ui.tools.e.c;
import com.tencent.mm.pluginsdk.ui.tools.e.d;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.pluginsdk.ui.tools.q;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

public class VideoPlayView extends RelativeLayout
  implements d.a, e
{
  private int duration;
  private String ePJ;
  private boolean eif;
  private ak fbD;
  private ProgressBar gHA;
  public View iVh;
  public e klq;
  private int qyX;
  private int qyY;
  private boolean qyZ;
  private VideoPlayView.a qza;
  private ViewGroup qzb;
  public a qzc;
  private double qzd;
  public TextView qze;
  public String qzf;
  private View qzg;
  public ImageView qzh;
  public boolean qzi;
  private int qzj;
  private int qzk;
  private boolean qzl;
  private boolean qzm;
  private long qzn;
  private Animation qzo;
  private Animation qzp;
  private Runnable qzq;
  public int qzr;

  public VideoPlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(70325);
    this.qyX = 320;
    this.qyY = 240;
    this.qyZ = true;
    this.klq = null;
    this.qzd = 0.0D;
    this.qzf = "";
    this.fbD = new ak();
    this.qzi = true;
    this.duration = 0;
    this.qzj = 0;
    this.qzk = 0;
    this.qzl = false;
    this.qzm = false;
    this.qzn = 0L;
    this.qzo = new AlphaAnimation(1.0F, 0.0F);
    this.qzp = new AlphaAnimation(0.0F, 1.0F);
    this.qzq = new VideoPlayView.4(this);
    this.qzr = 0;
    this.eif = false;
    init();
    AppMethodBeat.o(70325);
  }

  public VideoPlayView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(70326);
    this.qyX = 320;
    this.qyY = 240;
    this.qyZ = true;
    this.klq = null;
    this.qzd = 0.0D;
    this.qzf = "";
    this.fbD = new ak();
    this.qzi = true;
    this.duration = 0;
    this.qzj = 0;
    this.qzk = 0;
    this.qzl = false;
    this.qzm = false;
    this.qzn = 0L;
    this.qzo = new AlphaAnimation(1.0F, 0.0F);
    this.qzp = new AlphaAnimation(0.0F, 1.0F);
    this.qzq = new VideoPlayView.4(this);
    this.qzr = 0;
    this.eif = false;
    init();
    AppMethodBeat.o(70326);
  }

  private void CF(int paramInt)
  {
    AppMethodBeat.i(70338);
    if (paramInt >= 0);
    for (double d = paramInt; ; d = this.klq.getLastProgresstime())
    {
      this.qzd = d;
      ab.i("MicroMsg.VideoPlayView", "pause play " + this.qzd + " lastTime: " + paramInt + " last " + this.klq.getLastProgresstime());
      this.klq.pause();
      this.fbD.post(new VideoPlayView.7(this));
      if (this.qza != null)
        this.qza.clr();
      AppMethodBeat.o(70338);
      return;
    }
  }

  private void clp()
  {
    AppMethodBeat.i(70331);
    ((View)this.qzc).setVisibility(0);
    this.qzg.setVisibility(0);
    if (this.qzi)
      this.qzh.setVisibility(0);
    int i;
    if (this.qzr == 2)
      i = 0;
    while (true)
    {
      if (i != 0)
        this.iVh.setVisibility(0);
      this.fbD.removeCallbacks(this.qzq);
      this.fbD.postDelayed(this.qzq, 3000L);
      AppMethodBeat.o(70331);
      return;
      if (bo.isNullOrNil(this.qzf))
        i = 0;
      else
        i = 1;
    }
  }

  private void init()
  {
    AppMethodBeat.i(70327);
    this.qzo.setDuration(200L);
    this.qzp.setDuration(200L);
    View.inflate(getContext(), 2130970989, this);
    this.qzg = findViewById(2131828415);
    this.qzh = ((ImageView)findViewById(2131828416));
    this.qzh.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
    this.gHA = ((ProgressBar)findViewById(2131821219));
    this.qzb = ((ViewGroup)findViewById(2131823992));
    this.klq = q.fT(getContext());
    this.klq.setLoop(false);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    this.qzb.addView((View)this.klq, 0, localLayoutParams);
    this.qze = ((TextView)findViewById(2131827573));
    this.iVh = this.qze;
    this.klq.setVideoCallback(new e.a()
    {
      public final void EA()
      {
        AppMethodBeat.i(70313);
        ab.d("MicroMsg.VideoPlayView", "on completion " + bo.dpG().toString());
        if (!VideoPlayView.b(VideoPlayView.this))
        {
          VideoPlayView.a(VideoPlayView.this, 0.0D);
          VideoPlayView.this.B(0.0D);
          VideoPlayView.c(VideoPlayView.this).setIsPlay(false);
          VideoPlayView.a(VideoPlayView.this, 0);
          VideoPlayView.d(VideoPlayView.this);
          if (System.currentTimeMillis() - VideoPlayView.e(VideoPlayView.this) < 2000L)
          {
            ab.i("MicroMsg.VideoPlayView", "Too short onCompletion");
            AppMethodBeat.o(70313);
          }
        }
        while (true)
        {
          return;
          VideoPlayView.a(VideoPlayView.this, System.currentTimeMillis());
          if (VideoPlayView.f(VideoPlayView.this) != null)
          {
            VideoPlayView.f(VideoPlayView.this).cls();
            AppMethodBeat.o(70313);
            continue;
            VideoPlayView.c(VideoPlayView.this).setIsPlay(false);
            VideoPlayView.a(VideoPlayView.this, (int)VideoPlayView.g(VideoPlayView.this));
            VideoPlayView.d(VideoPlayView.this);
            if (VideoPlayView.f(VideoPlayView.this) != null)
              VideoPlayView.f(VideoPlayView.this).clt();
          }
          else
          {
            AppMethodBeat.o(70313);
          }
        }
      }

      public final int dG(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(70314);
        al.d(new VideoPlayView.1.1(this, paramAnonymousInt1, paramAnonymousInt2));
        AppMethodBeat.o(70314);
        return 0;
      }

      public final void dH(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(70315);
        VideoPlayView.c(VideoPlayView.this, paramAnonymousInt1);
        VideoPlayView.d(VideoPlayView.this, paramAnonymousInt2);
        if (VideoPlayView.k(VideoPlayView.this))
          VideoPlayView.l(VideoPlayView.this).post(new VideoPlayView.1.2(this));
        AppMethodBeat.o(70315);
      }

      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(70312);
        ab.e("MicroMsg.VideoPlayView", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        VideoPlayView.a(VideoPlayView.this).stop();
        AppMethodBeat.o(70312);
      }

      public final void pL()
      {
        AppMethodBeat.i(70311);
        ab.d("MicroMsg.VideoPlayView", g.Mp() + " onPrepared");
        VideoPlayView.a(VideoPlayView.this, true);
        AppMethodBeat.o(70311);
      }
    });
    if ((this.klq instanceof VideoSightView))
      ((VideoSightView)this.klq).setEnableConfigChanged(false);
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(70316);
        if (paramAnonymousMotionEvent.getAction() == 1)
          VideoPlayView.m(VideoPlayView.this);
        while (true)
        {
          AppMethodBeat.o(70316);
          return true;
          paramAnonymousMotionEvent.getAction();
        }
      }
    });
    clq();
    ((View)this.klq).post(new VideoPlayView.3(this));
    AppMethodBeat.o(70327);
  }

  private void kB(boolean paramBoolean)
  {
    AppMethodBeat.i(70337);
    this.klq.B(this.qzd);
    this.klq.start();
    ab.i("MicroMsg.VideoPlayView", "startplay get duration " + this.duration + " lastPlayProgressTime: " + this.qzd);
    if (this.qza != null)
      this.qza.kC(paramBoolean);
    AppMethodBeat.o(70337);
  }

  public final void B(double paramDouble)
  {
    AppMethodBeat.i(70349);
    this.klq.B(paramDouble);
    this.qzc.seek((int)paramDouble);
    AppMethodBeat.o(70349);
  }

  public final void clo()
  {
    AppMethodBeat.i(70330);
    this.gHA.setVisibility(0);
    AppMethodBeat.o(70330);
  }

  public final void clq()
  {
    AppMethodBeat.i(70332);
    if (this.qzc != null)
      ((View)this.qzc).setVisibility(4);
    this.qzg.setVisibility(8);
    this.qzh.setVisibility(8);
    this.iVh.setVisibility(8);
    AppMethodBeat.o(70332);
  }

  public final void d(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(70352);
    B(paramDouble);
    AppMethodBeat.o(70352);
  }

  public int getCurrentPosition()
  {
    AppMethodBeat.i(70346);
    int i = this.klq.getCurrentPosition();
    AppMethodBeat.o(70346);
    return i;
  }

  public int getDuration()
  {
    AppMethodBeat.i(70347);
    int i;
    if (this.duration == 0)
    {
      i = this.klq.getDuration();
      AppMethodBeat.o(70347);
    }
    while (true)
    {
      return i;
      i = this.duration;
      AppMethodBeat.o(70347);
    }
  }

  public double getLastProgresstime()
  {
    AppMethodBeat.i(70344);
    double d = Math.max(this.qzd, this.klq.getLastProgresstime());
    AppMethodBeat.o(70344);
    return d;
  }

  public long getLastSurfaceUpdateTime()
  {
    return 0L;
  }

  public String getVideoPath()
  {
    return this.ePJ;
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(70339);
    boolean bool = this.klq.isPlaying();
    AppMethodBeat.o(70339);
    return bool;
  }

  public final void onDetach()
  {
    AppMethodBeat.i(70342);
    this.klq.onDetach();
    AppMethodBeat.o(70342);
  }

  public final void pause()
  {
    AppMethodBeat.i(70336);
    CF(-1);
    AppMethodBeat.o(70336);
  }

  public void setForceScaleFullScreen(boolean paramBoolean)
  {
  }

  public void setIsDownloading(boolean paramBoolean)
  {
    AppMethodBeat.i(70329);
    this.qzl = paramBoolean;
    Object localObject;
    if ((this.klq != null) && ((this.klq instanceof VideoSightView)))
    {
      localObject = (VideoSightView)this.klq;
      if (((VideoSightView)localObject).getController() != null)
      {
        localObject = ((VideoSightView)localObject).getController();
        if (paramBoolean)
          break label66;
      }
    }
    label66: for (paramBoolean = true; ; paramBoolean = false)
    {
      ((b)localObject).qxH = paramBoolean;
      AppMethodBeat.o(70329);
      return;
    }
  }

  public void setLeftButtonOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(70333);
    this.qzg.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(70333);
  }

  public void setLoop(boolean paramBoolean)
  {
    AppMethodBeat.i(70343);
    this.klq.setLoop(paramBoolean);
    AppMethodBeat.o(70343);
  }

  public void setMute(boolean paramBoolean)
  {
    this.eif = paramBoolean;
  }

  public void setOnInfoCallback(e.b paramb)
  {
  }

  public void setOnSeekCompleteCallback(e.c paramc)
  {
  }

  public void setOnSurfaceCallback(e.d paramd)
  {
  }

  public void setOneTimeVideoTextureUpdateCallback(e.e parame)
  {
  }

  public void setPlayProgressCallback(boolean paramBoolean)
  {
    AppMethodBeat.i(70350);
    this.klq.setPlayProgressCallback(paramBoolean);
    AppMethodBeat.o(70350);
  }

  public void setRightButtonOnCliclListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(70334);
    this.qzh.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(70334);
  }

  public void setThumb(Bitmap paramBitmap)
  {
    AppMethodBeat.i(70348);
    this.klq.setThumb(paramBitmap);
    AppMethodBeat.o(70348);
  }

  public void setVideoCallback(e.a parama)
  {
    AppMethodBeat.i(70345);
    this.klq.setVideoCallback(parama);
    AppMethodBeat.o(70345);
  }

  public void setVideoPath(String paramString)
  {
    AppMethodBeat.i(70324);
    this.ePJ = paramString;
    ab.i("MicroMsg.VideoPlayView", "videoPath  %s", new Object[] { this.ePJ });
    this.klq.setVideoPath(this.ePJ);
    AppMethodBeat.o(70324);
  }

  public void setVideoPlayViewEvent(VideoPlayView.a parama)
  {
    this.qza = parama;
  }

  public void setVideoTotalTime(int paramInt)
  {
    AppMethodBeat.i(70328);
    if (this.qzc.getVideoTotalTime() != paramInt)
      this.qzc.setVideoTotalTime(paramInt);
    AppMethodBeat.o(70328);
  }

  public final boolean start()
  {
    AppMethodBeat.i(70335);
    kB(true);
    AppMethodBeat.o(70335);
    return true;
  }

  public final void stop()
  {
    AppMethodBeat.i(70341);
    this.klq.stop();
    AppMethodBeat.o(70341);
  }

  public final void update(int paramInt)
  {
    AppMethodBeat.i(70351);
    this.qzm = true;
    Object localObject;
    if ((this.qzk == 0) || (this.qzj == 0))
    {
      localObject = getResources().getDisplayMetrics();
      this.qzk = ((DisplayMetrics)localObject).heightPixels;
      this.qzj = ((DisplayMetrics)localObject).widthPixels;
      if (this.qzk < this.qzj)
      {
        this.qzk = ((DisplayMetrics)localObject).widthPixels;
        this.qzj = ((DisplayMetrics)localObject).heightPixels;
      }
      ab.i("MicroMsg.VideoPlayView", "getScreen screen_height:" + this.qzk + " screen_width:" + this.qzj);
    }
    ViewGroup.LayoutParams localLayoutParams = this.qzb.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams1;
    if (this.qzc == null)
    {
      localObject = null;
      localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
      if (paramInt != 1)
        break label410;
      localLayoutParams1.width = this.qzj;
      localLayoutParams1.height = ((int)(this.qzj * 1.0D * this.qyY / this.qyX));
      if (this.qzc != null)
        ((RelativeLayout.LayoutParams)localObject).bottomMargin = BackwardSupportUtil.b.b(getContext(), 0.0F);
    }
    while (true)
    {
      if (this.qzc != null)
      {
        this.qzc.clm();
        ((View)this.qzc).setLayoutParams((ViewGroup.LayoutParams)localObject);
        if ((this.qzc instanceof AdVideoPlayerLoadingBar))
          this.fbD.postDelayed(new VideoPlayView.8(this), 500L);
      }
      ab.i("MicroMsg.VideoPlayView", "orientation " + paramInt + " " + localLayoutParams1.width + " " + localLayoutParams1.height);
      ((View)this.klq).setLayoutParams(localLayoutParams1);
      if ((this.klq instanceof com.tencent.mm.plugin.sight.decode.a.a))
        ((com.tencent.mm.plugin.sight.decode.a.a)this.klq).fi(localLayoutParams1.width, localLayoutParams1.height);
      localLayoutParams.height = localLayoutParams1.height;
      localLayoutParams.width = localLayoutParams1.width;
      this.qzb.setLayoutParams(localLayoutParams);
      ((View)this.klq).requestLayout();
      AppMethodBeat.o(70351);
      return;
      localObject = (RelativeLayout.LayoutParams)((View)this.qzc).getLayoutParams();
      break;
      label410: localLayoutParams1.height = this.qzj;
      localLayoutParams1.width = ((int)(this.qzj * 1.0D * this.qyX / this.qyY));
      if (this.qzc != null)
        ((RelativeLayout.LayoutParams)localObject).bottomMargin = BackwardSupportUtil.b.b(getContext(), 0.0F);
    }
  }

  public final boolean w(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(70340);
    paramBoolean = this.klq.w(paramContext, paramBoolean);
    AppMethodBeat.o(70340);
    return paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.VideoPlayView
 * JD-Core Version:    0.6.2
 */