package com.tencent.mm.modelvideo;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.a.f;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

public class MMVideoView extends CommonVideoView
  implements b.a
{
  private String fUJ;
  protected b fUK;
  protected String fUL;
  public String fUM;
  private h.a fUN;
  protected int fUO;
  protected int fUP;
  protected f fUQ;
  protected int fUR;
  protected int fUS;
  private boolean fUT;
  protected boolean fUU;
  protected int fUV;
  protected int fUW;
  protected boolean fUX;
  private boolean fUY;
  private boolean fUZ;
  protected MMVideoView.a fVa;
  private boolean fVb;
  public boolean fVc;
  private ap fVd;

  public MMVideoView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(50630);
    this.fUO = 0;
    this.fUP = 0;
    this.fUV = 0;
    this.fUX = false;
    this.fUY = false;
    this.fUZ = false;
    this.fVb = false;
    this.fVd = new ap(new MMVideoView.1(this), true);
    AppMethodBeat.o(50630);
  }

  public MMVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(50631);
    this.fUO = 0;
    this.fUP = 0;
    this.fUV = 0;
    this.fUX = false;
    this.fUY = false;
    this.fUZ = false;
    this.fVb = false;
    this.fVd = new ap(new MMVideoView.1(this), true);
    AppMethodBeat.o(50631);
  }

  public MMVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(50632);
    this.fUO = 0;
    this.fUP = 0;
    this.fUV = 0;
    this.fUX = false;
    this.fUY = false;
    this.fUZ = false;
    this.fVb = false;
    this.fVd = new ap(new MMVideoView.1(this), true);
    AppMethodBeat.o(50632);
  }

  private void akX()
  {
    AppMethodBeat.i(50650);
    ab.i(this.TAG, "%s pauseByDataBlock ", new Object[] { aZk() });
    aNt();
    pause();
    AppMethodBeat.o(50650);
  }

  private String getRootPath()
  {
    AppMethodBeat.i(50636);
    String str;
    if (!bo.isNullOrNil(this.fUJ))
    {
      str = this.fUJ;
      AppMethodBeat.o(50636);
    }
    while (true)
    {
      return str;
      str = com.tencent.mm.compatible.util.e.eSn + "video/";
      AppMethodBeat.o(50636);
    }
  }

  private boolean i(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(50653);
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    try
    {
      if (this.fUQ.a(paramInt1, paramInt2, localPInt1, localPInt2))
      {
        bool = this.fUK.isVideoDataAvailable(this.fUL, localPInt1.value, localPInt2.value);
        if (bool)
          break label242;
        String str = this.fUL + "_" + localPInt1.value + "_" + localPInt2.value;
        if ((this.fUY) && (!paramBoolean))
          break label197;
        this.fUY = true;
        this.fUK.requestVideoData(this.fUL, localPInt1.value, localPInt2.value);
        AppMethodBeat.o(50653);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e(this.TAG, "%s check video data error[%s] ", new Object[] { aZk(), localException.toString() });
        boolean bool = false;
        continue;
        label197: ab.d(this.TAG, "%s already request video [%s] isRequestNow[%b] isSeek[%b] ", new Object[] { aZk(), localException, Boolean.valueOf(this.fUY), Boolean.valueOf(paramBoolean) });
        continue;
        label242: ab.d(this.TAG, "%s already had video data.", new Object[] { aZk() });
      }
    }
  }

  public boolean C(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(50646);
    switch (this.fUO)
    {
    default:
    case 1:
    case 3:
    case 2:
    case 0:
    }
    do
    {
      paramBoolean = true;
      while (true)
      {
        ab.c(this.TAG, "%s seek video time %d, download status %d playStatus %d", new Object[] { aZk(), Integer.valueOf(paramInt), Integer.valueOf(this.fUO), Integer.valueOf(this.fUP) });
        AppMethodBeat.o(50646);
        return paramBoolean;
        this.fUP = 2;
        PInt localPInt1 = new PInt();
        PInt localPInt2 = new PInt();
        a(paramInt, localPInt1, localPInt2);
        if (i(localPInt1.value, localPInt2.value, true))
        {
          this.fUS = -1;
          this.fUU = false;
          this.fUV = localPInt2.value;
          this.fUP = 3;
          super.e(paramInt, paramBoolean);
          paramBoolean = true;
        }
        else
        {
          this.fUS = paramInt;
          this.fUT = paramBoolean;
          this.fUU = true;
          akX();
          paramBoolean = false;
          continue;
          super.e(paramInt, paramBoolean);
          paramBoolean = true;
          continue;
          paramBoolean = true;
        }
      }
    }
    while (bTd());
    if (this.vgw)
    {
      this.vgu = paramBoolean;
      this.fUT = paramBoolean;
      this.vgv = paramInt;
      this.fUS = paramInt;
    }
    while (true)
    {
      start();
      break;
      this.vgu = paramBoolean;
      if (paramInt > 0)
        this.vgv = paramInt;
      else
        this.vgv = this.vgr;
    }
  }

  public void EA()
  {
    AppMethodBeat.i(50641);
    if (this.fVc)
    {
      C(0, true);
      AppMethodBeat.o(50641);
    }
    while (true)
    {
      return;
      if (this.fUL != null)
        this.fUK.dV(this.fUL);
      reset();
      if (this.klq != null)
        this.klq.stop();
      super.EA();
      AppMethodBeat.o(50641);
    }
  }

  protected boolean a(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(50649);
    paramPInt1.value = Math.max(paramInt, this.fUV);
    if (this.fUP == 1)
    {
      paramPInt1.value = paramInt;
      paramPInt1.value += this.fUW;
    }
    if (this.fUP == 2)
    {
      paramPInt1.value = (paramInt - 8);
      if (paramPInt1.value < 0)
        paramPInt1.value = 0;
      paramPInt2.value = (paramPInt1.value + this.fUW + 8);
    }
    if ((this.fUP == 3) || (this.fUP == 4))
    {
      paramPInt1.value = this.fUV;
      paramPInt2.value = (this.fUW + paramInt + 1 + this.fVa.fVg);
    }
    if (paramPInt2.value >= this.fUR + 1)
      paramPInt2.value = (this.fUR + 1);
    if (paramPInt2.value < paramPInt1.value)
    {
      paramPInt1.value += this.fVa.fVg;
      AppMethodBeat.o(50649);
    }
    while (true)
    {
      return bool;
      ab.i(this.TAG, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", new Object[] { aZk(), Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramInt), Integer.valueOf(this.fUP), Integer.valueOf(this.fUV), Integer.valueOf(this.fUW), this.fUL });
      AppMethodBeat.o(50649);
      bool = true;
    }
  }

  public void ad(String paramString, int paramInt)
  {
    AppMethodBeat.i(50657);
    if ((!bo.isEqual(this.fUL, paramString)) || (this.fUO == 3))
    {
      AppMethodBeat.o(50657);
      return;
    }
    ab.i(this.TAG, "%s download finish [%d]", new Object[] { aZk(), Integer.valueOf(paramInt) });
    if (paramInt == 0)
      this.fUO = 3;
    String str;
    if (this.fUN != null)
    {
      paramString = this.fUN;
      str = this.fUM;
      if (this.fUP <= 0)
        break label124;
    }
    label124: for (boolean bool = true; ; bool = false)
    {
      paramString.am(str, bool);
      cV(true);
      this.fUY = false;
      AppMethodBeat.o(50657);
      break;
    }
  }

  protected void akT()
  {
    this.fVa.fVf = 5;
    this.fVa.fVg = 2;
  }

  protected void akU()
  {
    AppMethodBeat.i(50637);
    ab.c(this.TAG, "%s prepareVideo", new Object[] { aZk() });
    if (this.klq != null)
    {
      this.fUX = true;
      this.klq.setVideoPath(this.fUM);
    }
    AppMethodBeat.o(50637);
  }

  public void akV()
  {
    AppMethodBeat.i(50638);
    super.akV();
    if (this.fVb)
    {
      this.fUZ = true;
      stop();
    }
    AppMethodBeat.o(50638);
  }

  public void akW()
  {
    AppMethodBeat.i(50639);
    super.akW();
    ab.i(this.TAG, "%s onUIResume stopDownloadByUiPause[%b] currTimeOnUiPause[%d] isPlayOnUiPause[%b]", new Object[] { aZk(), Boolean.valueOf(this.fUZ), Integer.valueOf(this.vgr), Boolean.valueOf(this.vgs) });
    if (this.fUZ)
    {
      C(this.vgr, this.vgs);
      AppMethodBeat.o(50639);
    }
    while (true)
    {
      return;
      if ((this.klq != null) && (d.iW(24)) && ((this.klq instanceof VideoPlayerTextureView)))
      {
        ((VideoPlayerTextureView)this.klq).bPd();
        AppMethodBeat.o(50639);
      }
      else
      {
        AppMethodBeat.o(50639);
      }
    }
  }

  public void akY()
  {
  }

  public void c(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(50635);
    super.c(paramBoolean, paramString, paramInt);
    if (!bo.isNullOrNil(paramString))
    {
      this.fUL = ("MMVideo_" + paramString.hashCode());
      this.fUM = (getRootPath() + "MMVideo_" + paramString.hashCode() + ".mp4");
      com.tencent.mm.vfs.e.tf(com.tencent.mm.vfs.e.atb(this.fUM));
      ab.i(this.TAG, "%s set video path [%s %s]", new Object[] { aZk(), this.fUL, this.fUM });
    }
    AppMethodBeat.o(50635);
  }

  public void cU(boolean paramBoolean)
  {
    AppMethodBeat.i(50647);
    super.cU(paramBoolean);
    bJc();
    AppMethodBeat.o(50647);
  }

  public void cV(boolean paramBoolean)
  {
    AppMethodBeat.i(50658);
    ab.d(this.TAG, "%s start timer rightNow[%b]", new Object[] { aZk(), Boolean.valueOf(paramBoolean) });
    this.fVd.stopTimer();
    this.fVd.ae(10L, 500L);
    AppMethodBeat.o(50658);
  }

  public com.tencent.mm.pluginsdk.ui.tools.e cf(Context paramContext)
  {
    AppMethodBeat.i(50643);
    this.vgt = 1;
    paramContext = new VideoPlayerTextureView(paramContext);
    paramContext.setNeedResetExtractor(true);
    AppMethodBeat.o(50643);
    return paramContext;
  }

  public int getCacheTimeSec()
  {
    AppMethodBeat.i(50660);
    int i;
    if (this.fUO == 3)
    {
      i = getVideoDurationSec();
      AppMethodBeat.o(50660);
    }
    while (true)
    {
      return i;
      i = this.fUV;
      AppMethodBeat.o(50660);
    }
  }

  public String getMediaId()
  {
    return this.fUL;
  }

  public int getReportIdkey()
  {
    return 100;
  }

  public void h(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50656);
    if (!bo.isEqual(this.fUL, paramString))
      AppMethodBeat.o(50656);
    while (true)
    {
      return;
      ab.d(this.TAG, "%s download  onProgress [%d, %d]", new Object[] { aZk(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(50656);
    }
  }

  public void initView()
  {
    AppMethodBeat.i(50633);
    super.initView();
    this.TAG = "MicroMsg.MMVideoView";
    this.fUQ = new f();
    this.fVa = new MMVideoView.a();
    akT();
    reset();
    AppMethodBeat.o(50633);
  }

  public final void ml(int paramInt)
  {
    AppMethodBeat.i(50654);
    ab.i(this.TAG, "%s deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s", new Object[] { aZk(), Integer.valueOf(paramInt), Integer.valueOf(this.fUR), this.fUL });
    if (this.fUR != 0)
    {
      ab.w(this.TAG, "moov had callback, do nothing.");
      AppMethodBeat.o(50654);
    }
    while (true)
    {
      return;
      diN();
      try
      {
        if (this.fUQ == null)
        {
          ab.w(this.TAG, "%s parser is null, thread is error.", new Object[] { aZk() });
          AppMethodBeat.o(50654);
          continue;
        }
        if (!this.fUQ.v(this.fUM, paramInt))
          break label268;
        this.fUR = this.fUQ.gkm;
        ab.i(this.TAG, "%s mp4 parse moov success. duration %d cdnMediaId %s ", new Object[] { aZk(), Integer.valueOf(this.fUR), this.fUL });
        if (mm(0))
          akU();
        if (this.fUS != -1)
          break label254;
        this.fUP = 1;
        AppMethodBeat.o(50654);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace(this.TAG, localException, "%s deal moov ready error [%s]", new Object[] { aZk(), this.fUL });
        AppMethodBeat.o(50654);
      }
      continue;
      label254: this.fUP = 2;
      AppMethodBeat.o(50654);
      continue;
      label268: ab.w(this.TAG, "%s mp4 parse moov error. cdnMediaId %s", new Object[] { aZk(), this.fUL });
      this.fUK.requestVideoData(this.fUL, 0, -1);
      AppMethodBeat.o(50654);
    }
  }

  protected final boolean mm(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(50645);
    if (this.fUS != -1);
    for (int i = this.fUS; ; i = paramInt)
    {
      ab.i(this.TAG, "%s check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d playStatus %d downloadStatus %d cdnMediaId %s isPrepareVideo[%b], isPrepared[%b]", new Object[] { aZk(), Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.fUV), Integer.valueOf(this.fUR), Integer.valueOf(this.fUP), Integer.valueOf(this.fUO), this.fUL, Boolean.valueOf(this.fUX), Boolean.valueOf(this.VN) });
      switch (this.fUO)
      {
      default:
        ab.w(this.TAG, "%s check time default.", new Object[] { aZk() });
        bool1 = false;
      case 1:
      case 3:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(50645);
        return bool1;
        if (!mn(i))
        {
          this.fUU = true;
          if (this.fUV <= 0)
            if (this.fUS == -1)
            {
              this.fUP = 1;
              label229: bool1 = false;
            }
        }
        while (true)
        {
          ru(i);
          PInt localPInt1 = new PInt();
          PInt localPInt2 = new PInt();
          if (!a(i, localPInt1, localPInt2))
            break label706;
          if (!i(localPInt1.value, localPInt2.value, false))
            break label727;
          this.fUV = Math.max(this.fUV, localPInt2.value);
          bool1 = bool2;
          break;
          this.fUP = 2;
          break label229;
          ab.i(this.TAG, "%s pause by load data cdnMediaId %s, playStatus %d", new Object[] { aZk(), this.fUL, Integer.valueOf(this.fUP) });
          diO();
          if ((this.fUP != 2) && (this.fUP != 4))
          {
            this.fUW += this.fVa.fVf;
            this.fUW = Math.min(this.fUW, 60);
            diQ();
            this.fUP = 4;
          }
          akX();
          break label229;
          if (this.fUX)
          {
            ru(i);
            ab.i(this.TAG, "resumeByDataGain, playStatus:%s, isPlaying:%s, pauseByLoadData:%s", new Object[] { Integer.valueOf(this.fUP), Boolean.valueOf(this.klq.isPlaying()), Boolean.valueOf(this.fUU) });
            if (this.fUU)
            {
              diP();
              diR();
              ab.i(this.TAG, "%s resume by data gain cdnMediaId %s", new Object[] { aZk(), this.fUL });
              if (this.fUS != -1)
              {
                C(this.fUS, this.fUT);
                this.fUS = -1;
                bool1 = false;
                label551: this.fUU = bool1;
                paramInt = 3;
              }
            }
            while (true)
            {
              this.fUP = paramInt;
              do
              {
                bool1 = true;
                break;
                if (play())
                {
                  bool1 = false;
                  break label551;
                }
                bool1 = true;
                break label551;
              }
              while ((this.fUP == 3) && (this.klq.isPlaying()));
              ab.i(this.TAG, "%s start to play video playStatus[%d]", new Object[] { aZk(), Integer.valueOf(this.fUP) });
              if (play())
                paramInt = 3;
              else
                paramInt = this.fUP;
            }
          }
          ab.i(this.TAG, "%s prepare cdnMediaId [%s]", new Object[] { aZk(), this.fUL });
          if (this.fUP == 5)
            this.fUP = 1;
          akU();
          bool1 = true;
        }
        label706: ab.d(this.TAG, "%s can not calc download.", new Object[] { aZk() });
        label727: continue;
        if (this.VN)
        {
          if (this.fUU)
          {
            if (this.fUS == -1)
              break label788;
            C(this.fUS, true);
            this.fUS = -1;
          }
          while (true)
          {
            this.fUU = bool1;
            this.fUP = 3;
            ru(i);
            bool1 = bool2;
            break;
            label788: if (!play())
              bool1 = true;
          }
        }
        if (this.fUP == 5)
          this.fUP = 1;
        akU();
        bool1 = bool2;
        continue;
        ab.w(this.TAG, "%s download error.", new Object[] { aZk() });
        bool1 = false;
      }
    }
  }

  public boolean mn(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(50648);
    if (this.fUO == 3)
    {
      AppMethodBeat.o(50648);
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      if ((this.fUV - paramInt <= 1) && (this.fUV < this.fUR))
      {
        AppMethodBeat.o(50648);
        continue;
      }
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      try
      {
        if (this.fUQ.a(paramInt, paramInt + 1, localPInt1, localPInt2))
        {
          bool2 = this.fUK.isVideoDataAvailable(this.fUL, localPInt1.value, localPInt2.value);
          bool1 = bool2;
          if (bool2);
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          try
          {
            this.fUV = paramInt;
            bool1 = bool2;
            AppMethodBeat.o(50648);
            break;
            localException1 = localException1;
            bool1 = false;
            ab.e(this.TAG, "%s check video data error %s ", new Object[] { aZk(), localException1.toString() });
            continue;
          }
          catch (Exception localException2)
          {
            boolean bool2;
            bool1 = bool2;
            continue;
          }
          bool1 = false;
        }
      }
    }
  }

  public final void onDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50655);
    this.fUY = false;
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      ab.w(this.TAG, "%s deal data available error offset[%d], length[%d]", new Object[] { aZk(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(50655);
    }
    while (true)
    {
      return;
      if (!bo.isEqual(this.fUL, paramString))
      {
        AppMethodBeat.o(50655);
        continue;
      }
      try
      {
        this.fUV = this.fUQ.cK(paramInt1, paramInt2);
        ab.i(this.TAG, "%s deal data available. offset[%d] length[%d] cachePlayTime[%d]", new Object[] { aZk(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.fUV) });
        cV(true);
        AppMethodBeat.o(50655);
      }
      catch (Exception paramString)
      {
        while (true)
          ab.e(this.TAG, "%s deal data available file pos to video time error[%s] ", new Object[] { aZk(), paramString.toString() });
      }
    }
  }

  public boolean pause()
  {
    AppMethodBeat.i(50651);
    boolean bool = super.pause();
    if (bool)
      this.fUP = 4;
    AppMethodBeat.o(50651);
    return bool;
  }

  public final boolean play()
  {
    AppMethodBeat.i(50652);
    boolean bool = super.play();
    if (bool)
      this.fUP = 3;
    AppMethodBeat.o(50652);
    return bool;
  }

  public void reset()
  {
    this.fUS = -1;
    this.fUV = 0;
    this.fUR = 0;
    this.fUP = 0;
    this.fUO = 0;
    this.fUU = false;
    this.fUX = false;
    this.fUY = false;
    if (this.fVa != null)
      this.fUW = this.fVa.fVf;
  }

  protected void setDownloadStatus(int paramInt)
  {
    this.fUO = paramInt;
  }

  protected void setFilepath(String paramString)
  {
    this.fUM = paramString;
  }

  public void setIMMDownloadFinish(h.a parama)
  {
    this.fUN = parama;
  }

  public void setIOnlineVideoProxy(b paramb)
  {
    AppMethodBeat.i(50634);
    this.fUK = paramb;
    this.fUK.a(this);
    AppMethodBeat.o(50634);
  }

  public void setLoop(boolean paramBoolean)
  {
    this.fVc = paramBoolean;
  }

  public void setRootPath(String paramString)
  {
    this.fUJ = paramString;
  }

  public void setScaleType(h.d paramd)
  {
    AppMethodBeat.i(50644);
    if ((this.klq instanceof VideoPlayerTextureView))
    {
      ((VideoPlayerTextureView)this.klq).setScaleType(paramd);
      gp(getReportIdkey() + 14);
    }
    AppMethodBeat.o(50644);
  }

  public void start()
  {
    AppMethodBeat.i(50640);
    ab.i(this.TAG, "%s start cdnMediaId[%s] timeDuration[%d]", new Object[] { aZk(), this.fUL, Integer.valueOf(this.fUR) });
    if (this.klq != null)
    {
      if (!bo.isNullOrNil(this.klq.getVideoPath()))
        break label145;
      aNt();
      this.fVb = true;
      this.fUR = 0;
      this.fUO = 1;
      if (this.fUK != null)
      {
        this.fUK.r(this.fUL, this.fUM, this.url);
        this.fUK.a(this);
      }
      cso();
    }
    while (true)
    {
      gp(getReportIdkey() + 1);
      AppMethodBeat.o(50640);
      return;
      label145: play();
    }
  }

  public void stop()
  {
    AppMethodBeat.i(50642);
    if (this.fUK != null)
      this.fUK.dV(this.fUL);
    reset();
    super.stop();
    AppMethodBeat.o(50642);
  }

  public void stopTimer()
  {
    AppMethodBeat.i(50659);
    this.fVd.stopTimer();
    AppMethodBeat.o(50659);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.MMVideoView
 * JD-Core Version:    0.6.2
 */