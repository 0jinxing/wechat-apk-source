package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.b;
import com.tencent.mm.pluginsdk.ui.tools.e.c;
import com.tencent.mm.pluginsdk.ui.tools.e.d;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class AbstractVideoView extends RelativeLayout
  implements h, e.a, e.b, e.c, e.d, e.e
{
  public String TAG = "MicroMsg.AbstractVideoView";
  protected boolean VN = false;
  protected int bqQ = 0;
  protected ak fbD = new ak(Looper.getMainLooper());
  public com.tencent.mm.pluginsdk.ui.tools.e klq;
  protected TextView kye;
  protected Context mContext;
  protected ImageView miw;
  protected ProgressBar mqj;
  public h.b rcd;
  protected TextView rlj;
  protected ap vgA = new ap(new ap.a()
  {
    public final boolean BI()
    {
      AppMethodBeat.i(117937);
      boolean bool = AbstractVideoView.this.isPlaying();
      int i = AbstractVideoView.this.getCurrPosMs();
      ab.i(AbstractVideoView.this.TAG, "%s prepare start checker isplaying[%b] currPosMs[%d]", new Object[] { AbstractVideoView.this.aZk(), Boolean.valueOf(bool), Integer.valueOf(i) });
      if ((AbstractVideoView.this.klq != null) && (i <= 50))
        AbstractVideoView.this.klq.B(0.0D);
      AppMethodBeat.o(117937);
      return false;
    }
  }
  , false);
  protected ap vgB = new ap(new ap.a()
  {
    public final boolean BI()
    {
      boolean bool = false;
      AppMethodBeat.i(117938);
      if (AbstractVideoView.this.bqQ > 0)
        if (AbstractVideoView.this.isPlaying())
        {
          AbstractVideoView.a(AbstractVideoView.this);
          AppMethodBeat.o(117938);
        }
      while (true)
      {
        return bool;
        bool = true;
        AppMethodBeat.o(117938);
        continue;
        AppMethodBeat.o(117938);
      }
    }
  }
  , true);
  private b vgC = new AbstractVideoView.6(this);
  private View.OnClickListener vgD = new AbstractVideoView.7(this);
  private Runnable vgE = new AbstractVideoView.8(this);
  private h.c vgF = null;
  protected j vgG = new j();
  protected boolean vgk = true;
  protected RelativeLayout vgl;
  protected LinearLayout vgm;
  protected VideoPlayerSeekBar vgn;
  protected g vgo;
  protected boolean vgp;
  protected boolean vgq = true;
  protected int vgr = 0;
  protected boolean vgs = false;
  protected int vgt = 0;
  protected boolean vgu = true;
  protected int vgv = -1;
  protected boolean vgw = false;
  protected long vgx = 0L;
  protected int vgy = 0;
  protected ap vgz = new ap(new AbstractVideoView.1(this), true);

  public AbstractVideoView(Context paramContext)
  {
    this(paramContext, null);
  }

  public AbstractVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AbstractVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    initView();
  }

  private void Dq(int paramInt)
  {
    this.vgo.Dq(paramInt);
  }

  private void nF(boolean paramBoolean)
  {
    this.vgo.nF(paramBoolean);
  }

  private void setVideoTotalTime(int paramInt)
  {
    if ((this.vgo != null) && (this.vgo.getVideoTotalTime() != paramInt))
      this.vgo.setVideoTotalTime(paramInt);
  }

  public void EA()
  {
    ab.i(this.TAG, "%s onCompletion", new Object[] { aZk() });
    bJc();
    stopTimer();
    if (this.rcd != null)
      this.rcd.cq(getSessionId(), getMediaId());
    this.vgy = 0;
    this.vgx = 0L;
    gp(getReportIdkey() + 7);
  }

  public void aEX()
  {
    ab.i(this.TAG, "%s onUIDestroy", new Object[] { aZk() });
    stop();
    this.fbD.removeCallbacksAndMessages(null);
    stopTimer();
    this.vgB.stopTimer();
    gp(getReportIdkey() + 12);
  }

  protected void aNt()
  {
    gR(500L);
  }

  public final String aZk()
  {
    return hashCode();
  }

  protected final void ajo(String paramString)
  {
    this.vgG.url = paramString;
  }

  public void akV()
  {
    ab.i(this.TAG, "%s onUIPause %s", new Object[] { aZk(), bo.dpG() });
    this.vgr = getCurrPosSec();
    this.vgs = isPlaying();
    this.vgy = 0;
    this.vgx = 0L;
    pause();
    stopTimer();
    this.vgk = false;
    gp(getReportIdkey() + 11);
  }

  public void akW()
  {
    ab.i(this.TAG, "%s onUIResume %s", new Object[] { aZk(), bo.dpG() });
    this.vgk = true;
    gp(getReportIdkey() + 10);
  }

  public void akY()
  {
    ab.i(this.TAG, "%s on surface available", new Object[] { aZk() });
    cV(false);
  }

  public final void bJc()
  {
    ab.d(this.TAG, "%s hide loading %s", new Object[] { aZk(), bo.dpG() });
    this.fbD.removeCallbacks(this.vgE);
    this.fbD.post(new AbstractVideoView.9(this));
  }

  public void bQL()
  {
    ab.i(this.TAG, "%s onTextureUpdate ", new Object[] { aZk() });
    bJc();
  }

  protected final boolean bTd()
  {
    boolean bool;
    if (this.klq != null)
      if ((!bo.isNullOrNil(this.klq.getVideoPath())) && (this.VN))
        bool = true;
    while (true)
    {
      ab.d(this.TAG, "%s is prepared [%b] isPrepared[%b]", new Object[] { aZk(), Boolean.valueOf(bool), Boolean.valueOf(this.VN) });
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }

  protected boolean cGT()
  {
    return true;
  }

  public void cU(boolean paramBoolean)
  {
    ab.i(this.TAG, "%s on seek complete startPlay[%b]", new Object[] { aZk(), Boolean.valueOf(paramBoolean) });
    if (this.klq != null)
      this.klq.setOneTimeVideoTextureUpdateCallback(this);
    bJc();
    nF(paramBoolean);
    Dq(getCurrPosSec());
    if (paramBoolean)
    {
      cV(false);
      this.vgs = false;
      if (this.rcd != null)
        this.rcd.cs(getSessionId(), getMediaId());
    }
  }

  protected void cV(boolean paramBoolean)
  {
    ab.d(this.TAG, "%s start timer rightNow[%b]", new Object[] { aZk(), Boolean.valueOf(paramBoolean) });
    this.vgz.ae(500L, 500L);
  }

  protected com.tencent.mm.pluginsdk.ui.tools.e cf(Context paramContext)
  {
    return null;
  }

  public final void cpU()
  {
    this.vgm.removeView((View)this.vgo);
  }

  protected final void cso()
  {
    if (this.vgG.startTimeStamp == 0L)
      this.vgG.startTimeStamp = bo.anU();
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public void dH(int paramInt1, int paramInt2)
  {
    ab.i(this.TAG, "%s on get video size [%d, %d]", new Object[] { aZk(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.rcd != null)
      this.rcd.d(getSessionId(), getMediaId(), paramInt1, paramInt2);
    gp(getReportIdkey() + 8);
  }

  protected final void diM()
  {
    this.fbD.post(new AbstractVideoView.11(this));
  }

  protected final void diN()
  {
    if (this.vgG.rlG == 0L)
      this.vgG.rlG = bo.anU();
  }

  protected final void diO()
  {
    this.vgG.viE = bo.anU();
  }

  protected final void diP()
  {
    this.vgG.viF = bo.anU();
    if (this.vgG.viE > 0L)
    {
      j localj = this.vgG;
      localj.viG += this.vgG.viF - this.vgG.viE;
    }
  }

  protected final void diQ()
  {
    j localj = this.vgG;
    localj.blockCount += 1;
  }

  protected final void diR()
  {
    int i;
    int j;
    int k;
    if ((this.vgG.viF > 0L) && (this.vgG.viE > 0L))
    {
      i = (int)((this.vgG.viF - this.vgG.viE) / 1000L);
      if (!at.isWifi(this.mContext))
        break label146;
      j = 70;
      k = 74;
    }
    while (true)
    {
      int m = getReportIdkey();
      int n = getReportIdkey();
      k = bo.h((Integer)com.tencent.mm.plugin.report.e.a(i, new int[] { 1, 2, 3, 4 }, j + m, k + n));
      ab.d(this.TAG, "%s rptResumeTime [%d]", new Object[] { aZk(), Integer.valueOf(k) });
      gp(k);
      label146: 
      do
      {
        return;
        if (at.is4G(this.mContext))
        {
          j = 75;
          k = 79;
          break;
        }
        if (at.is3G(this.mContext))
        {
          j = 80;
          k = 84;
          break;
        }
      }
      while (!at.is2G(this.mContext));
      j = 85;
      k = 89;
    }
  }

  public boolean e(double paramDouble, boolean paramBoolean)
  {
    boolean bool1 = bTd();
    int i = getVideoDurationSec();
    int j = (int)paramDouble;
    int k = j;
    if (i > 0)
    {
      k = j;
      if (paramDouble > i)
        k = i;
    }
    boolean bool2;
    if (this.klq != null)
      if (!bo.isNullOrNil(this.klq.getVideoPath()))
        bool2 = true;
    while (true)
    {
      ab.c(this.TAG, "%s seek to [%d %s] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", new Object[] { aZk(), Integer.valueOf(k), Double.valueOf(paramDouble), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Integer.valueOf(i), Boolean.valueOf(bool2) });
      gp(getReportIdkey() + 5);
      if (!bool1)
        break;
      if (this.klq == null)
        break label215;
      aNt();
      Dq(k);
      this.klq.d(k * 1000, paramBoolean);
      return paramBoolean;
      bool2 = false;
      continue;
      bool2 = false;
    }
    this.vgv = k;
    if (bool2)
      this.vgu = true;
    while (true)
    {
      label215: paramBoolean = false;
      break;
      this.vgu = paramBoolean;
      start();
    }
  }

  protected void gR(long paramLong)
  {
    this.fbD.postDelayed(this.vgE, paramLong);
  }

  public int getCacheTimeSec()
  {
    return 0;
  }

  public int getCurrPosMs()
  {
    if (this.klq != null);
    for (int i = this.klq.getCurrentPosition(); ; i = 0)
      return i;
  }

  public int getCurrPosSec()
  {
    if (this.klq != null);
    for (int i = Math.round(this.klq.getCurrentPosition() * 1.0F / 1000.0F); ; i = 0)
      return i;
  }

  protected String getMediaId()
  {
    return "";
  }

  public int getPlayerType()
  {
    return this.vgt;
  }

  protected abstract int getReportIdkey();

  public String getSessionId()
  {
    return "";
  }

  public int getVideoDurationSec()
  {
    if (this.klq != null);
    for (int i = Math.round(this.klq.getDuration() * 1.0F / 1000.0F); ; i = -1)
      return i;
  }

  public int getVideoSource()
  {
    return 0;
  }

  protected final void gp(long paramLong)
  {
    if (this.vgF != null)
      this.vgF.gp(paramLong);
  }

  protected void initView()
  {
    ab.i(this.TAG, "%s init view ", new Object[] { aZk() });
    LayoutInflater.from(this.mContext).inflate(2130969173, this);
    this.miw = ((ImageView)findViewById(2131822133));
    this.vgl = ((RelativeLayout)findViewById(2131822134));
    this.rlj = ((TextView)findViewById(2131822135));
    this.mqj = ((ProgressBar)findViewById(2131821891));
    this.kye = ((TextView)findViewById(2131822138));
    this.vgm = ((LinearLayout)findViewById(2131822904));
    Object localObject = (VideoPlayerSeekBar)findViewById(2131822905);
    this.vgn = ((VideoPlayerSeekBar)localObject);
    this.vgo = ((g)localObject);
    this.vgn.setIplaySeekCallback(this.vgC);
    this.vgn.setOnClickListener(this.vgD);
    this.klq = cf(this.mContext);
    this.klq.setVideoCallback(this);
    this.klq.setOnSeekCompleteCallback(this);
    this.klq.setOnInfoCallback(this);
    this.klq.setOnSurfaceCallback(this);
    localObject = new RelativeLayout.LayoutParams(-1, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(13);
    this.vgl.addView((View)this.klq, (ViewGroup.LayoutParams)localObject);
  }

  public boolean isPlaying()
  {
    boolean bool = false;
    if (this.klq != null)
      bool = this.klq.isPlaying();
    return bool;
  }

  public void onError(int paramInt1, int paramInt2)
  {
    ab.w(this.TAG, "%s onError info [%d %d] errorCount[%d]", new Object[] { aZk(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.bqQ) });
    gp(getReportIdkey() + 90);
    this.bqQ += 1;
    if (this.bqQ > 5)
    {
      gp(getReportIdkey() + 92);
      this.vgG.viH = paramInt1;
      this.vgG.viI = paramInt2;
      h.b localb;
      String str1;
      String str2;
      String str3;
      if (this.rcd != null)
      {
        localb = this.rcd;
        str1 = getSessionId();
        str2 = getMediaId();
        if (paramInt1 != -1010)
          break label162;
        str3 = "MEDIA_ERR_SRC_NOT_SUPPORTED";
      }
      while (true)
      {
        localb.c(str1, str2, str3, paramInt1, paramInt2);
        stop();
        bJc();
        return;
        label162: if (paramInt1 == -1007)
          str3 = "MEDIA_ERR_SRC_NOT_SUPPORTED";
        else if (paramInt1 == -1004)
        {
          if (!at.isConnected(this.mContext))
            str3 = "MEDIA_ERR_NETWORK";
          else
            str3 = "MEDIA_ERR_DECODE";
        }
        else if (!at.isConnected(this.mContext))
          str3 = "MEDIA_ERR_NETWORK";
        else
          str3 = "MEDIA_ERR_DECODE";
      }
    }
    paramInt2 = getCurrPosSec();
    if (this.vgv == -1);
    for (paramInt1 = paramInt2; ; paramInt1 = this.vgv)
    {
      ab.i(this.TAG, "%s onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", new Object[] { aZk(), Integer.valueOf(paramInt1), Integer.valueOf(this.vgv), Integer.valueOf(paramInt2) });
      stop();
      aNt();
      this.fbD.postDelayed(new AbstractVideoView.3(this, paramInt1), 200L);
      break;
    }
  }

  public final void pL()
  {
    ab.i(this.TAG, "%s onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", new Object[] { aZk(), Boolean.valueOf(this.vgu), Integer.valueOf(this.vgv), Boolean.valueOf(this.VN) });
    this.VN = true;
    if (this.klq != null)
      this.klq.setOneTimeVideoTextureUpdateCallback(this);
    setVideoTotalTime(getVideoDurationSec());
    int i;
    int j;
    int k;
    if (this.vgu)
      if (this.vgv < 0)
      {
        if ((play()) && (cGT()))
          this.vgA.ae(1000L, 1000L);
        this.vgv = -1;
        this.vgu = true;
        this.vgy = 0;
        this.vgx = 0L;
        if (this.rcd != null)
          this.rcd.cp(getSessionId(), getMediaId());
        if (this.bqQ > 0)
        {
          ab.d(this.TAG, "%s start error check timer", new Object[] { aZk() });
          this.vgB.ae(5000L, 5000L);
        }
        gp(getReportIdkey() + 2);
        if (this.vgG.viC == 0L)
          this.vgG.viC = bo.anU();
        i = getVideoDurationSec();
        this.vgG.duration = i;
        if ((this.vgG.startTimeStamp > 0L) && (this.vgG.viC > 0L))
        {
          j = (int)((this.vgG.viC - this.vgG.startTimeStamp) / 1000L);
          if (!at.isWifi(this.mContext))
            break label465;
          k = 20;
          i = 24;
        }
      }
    while (true)
    {
      label314: int m = getReportIdkey();
      int n = getReportIdkey();
      i = bo.h((Integer)com.tencent.mm.plugin.report.e.a(j, new int[] { 1, 2, 3, 4 }, k + m, i + n));
      ab.d(this.TAG, "%s rptFirstPlayTime [%d]", new Object[] { aZk(), Integer.valueOf(i) });
      gp(i);
      label465: 
      do
      {
        return;
        if (!isLive())
        {
          e(this.vgv, this.vgu);
          break;
        }
        play();
        break;
        if (this.vgv < 0);
        for (double d = 0.0D; ; d = this.vgv)
        {
          e(d, this.vgu);
          break;
        }
        if (at.is4G(this.mContext))
        {
          k = 25;
          i = 29;
          break label314;
        }
        if (at.is3G(this.mContext))
        {
          k = 30;
          i = 34;
          break label314;
        }
      }
      while (!at.is2G(this.mContext));
      k = 35;
      i = 39;
    }
  }

  public boolean pause()
  {
    boolean bool = true;
    ab.i(this.TAG, "%s pause", new Object[] { aZk() });
    gp(getReportIdkey() + 4);
    if (this.klq != null)
    {
      nF(false);
      this.klq.pause();
      stopTimer();
      if (this.rcd != null)
        this.rcd.cr(getSessionId(), getMediaId());
      this.vgG.rlI = bo.anU();
    }
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public boolean play()
  {
    boolean bool = false;
    if (!this.vgk)
      ab.w(this.TAG, "%s ui on pause now, why u call me to play? [%s]", new Object[] { aZk(), bo.dpG() });
    while (true)
    {
      return bool;
      gp(getReportIdkey() + 3);
      if (this.klq != null)
      {
        bool = this.klq.start();
        ab.i(this.TAG, "%s video play [%b] isPlayOnUiPause[%b]", new Object[] { aZk(), Boolean.valueOf(bool), Boolean.valueOf(this.vgs) });
        nF(bool);
        if (bool)
        {
          this.vgs = false;
          cV(false);
          if (this.rcd != null)
            this.rcd.cs(getSessionId(), getMediaId());
        }
      }
    }
  }

  public final void ru(int paramInt)
  {
    Dq(paramInt);
  }

  public final boolean s(double paramDouble)
  {
    return e(paramDouble, isPlaying());
  }

  public void setCover(Bitmap paramBitmap)
  {
    ab.i(this.TAG, "%s set cover", new Object[] { aZk() });
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      this.miw.setImageBitmap(paramBitmap);
  }

  public void setFullDirection(int paramInt)
  {
  }

  public void setIMMVideoViewCallback(h.b paramb)
  {
    this.rcd = paramb;
  }

  public void setIsShowBasicControls(boolean paramBoolean)
  {
    ab.i(this.TAG, "%s is show seek bar[%b]", new Object[] { aZk(), Boolean.valueOf(paramBoolean) });
    this.vgp = paramBoolean;
    if (this.vgp)
      this.fbD.post(new AbstractVideoView.10(this));
    while (true)
    {
      return;
      diM();
    }
  }

  public void setMute(boolean paramBoolean)
  {
    if (this.klq != null)
      this.klq.setMute(paramBoolean);
  }

  public void setReporter(h.c paramc)
  {
    this.vgF = paramc;
  }

  public void setVideoFooterView(g paramg)
  {
    if (!(paramg instanceof View))
      ab.w(this.TAG, "%s set video footer view but is not view", new Object[] { aZk() });
    while (true)
    {
      return;
      cpU();
      this.vgo = paramg;
      this.vgq = false;
      this.vgm.addView((View)this.vgo);
    }
  }

  public void stop()
  {
    ab.i(this.TAG, "%s stop [%s]", new Object[] { aZk(), bo.dpG() });
    gp(getReportIdkey() + 6);
    if (this.klq != null)
      this.klq.stop();
    this.vgv = -1;
    this.vgu = true;
    this.VN = false;
    this.vgy = 0;
    this.vgx = 0L;
    stopTimer();
    this.fbD.postDelayed(new AbstractVideoView.2(this), 10L);
    this.vgG.viD = bo.anU();
    int i;
    int j;
    label227: Object localObject;
    if (this.vgG.blockCount > 0)
    {
      if (at.isWifi(this.mContext))
      {
        i = 41;
        j = 45;
        int k = getReportIdkey();
        int m = getReportIdkey();
        j = bo.h((Integer)com.tencent.mm.plugin.report.e.a(this.vgG.blockCount, new int[] { 1, 2, 3, 4 }, i + k, j + m));
        ab.d(this.TAG, "%s rptBlockCount [%d]", new Object[] { aZk(), Integer.valueOf(j) });
        gp(j);
      }
    }
    else if (this.vgG.startTimeStamp != 0L)
    {
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append(this.vgG.startTimeStamp).append(",");
      ((StringBuffer)localObject).append(this.vgG.viC).append(",");
      ((StringBuffer)localObject).append(this.vgG.viD).append(",");
      ((StringBuffer)localObject).append(this.vgG.rlI).append(",");
      ((StringBuffer)localObject).append(this.vgG.viE).append(",");
      ((StringBuffer)localObject).append(this.vgG.viF).append(",");
      ((StringBuffer)localObject).append(this.vgG.viG).append(",");
      ((StringBuffer)localObject).append(this.vgG.blockCount).append(",");
      if (this.vgG.viC <= 0L)
        break label808;
      l = this.vgG.viC - this.vgG.startTimeStamp;
      label429: ((StringBuffer)localObject).append(l).append(",");
      ((StringBuffer)localObject).append(this.vgG.url).append(",");
      ((StringBuffer)localObject).append(this.vgG.duration).append(",");
      ((StringBuffer)localObject).append(this.vgG.viH).append(",");
      ((StringBuffer)localObject).append(this.vgG.viI).append(",");
      ((StringBuffer)localObject).append(this.vgG.rlG).append(",");
      if (this.vgG.rlG <= this.vgG.startTimeStamp)
        break label814;
    }
    label808: label814: for (long l = this.vgG.rlG - this.vgG.startTimeStamp; ; l = 0L)
    {
      ((StringBuffer)localObject).append(l).append(",");
      ((StringBuffer)localObject).append(getPlayerType()).append(",");
      ((StringBuffer)localObject).append(getVideoSource());
      localObject = ((StringBuffer)localObject).toString();
      ab.i(this.TAG, "%s rpt video kv stat{%s}", new Object[] { aZk(), localObject });
      if (this.vgF != null)
        this.vgF.wB((String)localObject);
      localObject = this.vgG;
      ((j)localObject).startTimeStamp = 0L;
      ((j)localObject).viC = 0L;
      ((j)localObject).viD = 0L;
      ((j)localObject).rlI = 0L;
      ((j)localObject).viE = 0L;
      ((j)localObject).viF = 0L;
      ((j)localObject).viG = 0L;
      ((j)localObject).blockCount = 0;
      ((j)localObject).url = "";
      ((j)localObject).duration = 0;
      ((j)localObject).viH = 0;
      ((j)localObject).viI = 0;
      ((j)localObject).rlG = 0L;
      return;
      if (at.is4G(this.mContext))
      {
        i = 46;
        j = 50;
        break;
      }
      if (at.is3G(this.mContext))
      {
        i = 51;
        j = 55;
        break;
      }
      if (!at.is2G(this.mContext))
        break label227;
      i = 56;
      j = 60;
      break;
      l = 0L;
      break label429;
    }
  }

  protected void stopTimer()
  {
    this.vgz.stopTimer();
    this.vgA.stopTimer();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AbstractVideoView
 * JD-Core Version:    0.6.2
 */