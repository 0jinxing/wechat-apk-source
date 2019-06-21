package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

public class OfflineVideoView extends RelativeLayout
  implements e.a
{
  private int bqQ;
  public int duration;
  private boolean eif;
  public ak kkp;
  public e klq;
  public ap klw;
  private Context mContext;
  private ImageView mmB;
  private RelativeLayout mmW;
  private boolean mqg;
  private boolean mqh;
  private ProgressBar mqj;
  public OfflineVideoView.a rkX;
  public boolean rkY;
  public boolean rkZ;
  public int rla;
  private e.e rlb;

  public OfflineVideoView(Context paramContext)
  {
    this(paramContext, null);
  }

  public OfflineVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public OfflineVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38368);
    this.mContext = null;
    this.eif = false;
    this.mqg = false;
    this.rkY = false;
    this.rkZ = true;
    this.rla = -1;
    this.bqQ = 0;
    this.duration = 0;
    this.kkp = new ak(Looper.getMainLooper());
    this.klw = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(38366);
        boolean bool;
        if (OfflineVideoView.b(OfflineVideoView.this) == null)
        {
          bool = false;
          AppMethodBeat.o(38366);
        }
        while (true)
        {
          return bool;
          if (((View)OfflineVideoView.b(OfflineVideoView.this)).getAlpha() < 1.0F)
            OfflineVideoView.this.a(true, 1.0F);
          if (OfflineVideoView.b(OfflineVideoView.this).isPlaying())
          {
            OfflineVideoView.e(OfflineVideoView.this);
            OfflineVideoView localOfflineVideoView = OfflineVideoView.this;
            int i = OfflineVideoView.b(OfflineVideoView.this).getCurrentPosition() / 1000;
            if (localOfflineVideoView.rkX != null)
              localOfflineVideoView.rkX.Dq(i);
          }
          AppMethodBeat.o(38366);
          bool = true;
        }
      }
    }
    , true);
    this.rlb = new OfflineVideoView.8(this);
    this.mContext = paramContext;
    ab.i("MicroMsg.OfflineVideoView", "%d ui init view.", new Object[] { Integer.valueOf(hashCode()) });
    LayoutInflater.from(this.mContext).inflate(2130970831, this);
    this.mmB = ((ImageView)findViewById(2131822133));
    this.mmW = ((RelativeLayout)findViewById(2131822134));
    this.mqj = ((ProgressBar)findViewById(2131821891));
    if (d.fP(18))
    {
      paramInt = 0;
      if (paramInt == 0)
        break label270;
      this.mqh = true;
    }
    for (this.klq = new VideoPlayerTextureView(this.mContext); ; this.klq = new VideoTextureView(this.mContext))
    {
      this.klq.setVideoCallback(this);
      paramContext = new RelativeLayout.LayoutParams(-1, -2);
      paramContext.addRule(13);
      this.mmW.addView((View)this.klq, paramContext);
      a(false, 0.0F);
      AppMethodBeat.o(38368);
      return;
      paramInt = 1;
      break;
      label270: this.mqh = false;
    }
  }

  private void aNt()
  {
    AppMethodBeat.i(38376);
    this.kkp.post(new OfflineVideoView.5(this));
    AppMethodBeat.o(38376);
  }

  public final void EA()
  {
    AppMethodBeat.i(38379);
    ab.i("MicroMsg.OfflineVideoView", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    if (this.rkX == null)
      if ((d.iX(18)) || (!this.mqh))
      {
        ae(0, true);
        AppMethodBeat.o(38379);
      }
    while (true)
    {
      return;
      if (this.klq != null)
      {
        String str = this.klq.getVideoPath();
        this.klq.stop();
        Mj(str);
        AppMethodBeat.o(38379);
        continue;
        this.rkX.EA();
      }
      else
      {
        AppMethodBeat.o(38379);
      }
    }
  }

  public final void Mj(String paramString)
  {
    AppMethodBeat.i(38380);
    ab.i("MicroMsg.OfflineVideoView", "%d prepare video  filePath %s", new Object[] { Integer.valueOf(hashCode()), paramString });
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.OfflineVideoView", "%d prepare video but filepath is null.", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(38380);
    }
    while (true)
    {
      return;
      if (this.klq != null)
      {
        this.klq.setOneTimeVideoTextureUpdateCallback(this.rlb);
        this.klq.setVideoPath(paramString);
      }
      AppMethodBeat.o(38380);
    }
  }

  public final void Zz(String paramString)
  {
    AppMethodBeat.i(38372);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(38372);
    while (true)
    {
      return;
      this.kkp.post(new OfflineVideoView.1(this, paramString));
      AppMethodBeat.o(38372);
    }
  }

  public final void a(boolean paramBoolean, float paramFloat)
  {
    AppMethodBeat.i(38374);
    this.kkp.post(new OfflineVideoView.4(this, paramBoolean, paramFloat));
    AppMethodBeat.o(38374);
  }

  public final void ae(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(38381);
    ab.i("MicroMsg.OfflineVideoView", "%d seek second %d afterSeekPlay %b", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    bJc();
    this.klq.d(paramInt, paramBoolean);
    startTimer();
    AppMethodBeat.o(38381);
  }

  public final void bJc()
  {
    AppMethodBeat.i(38377);
    this.kkp.post(new OfflineVideoView.6(this));
    AppMethodBeat.o(38377);
  }

  public final void bwD()
  {
    AppMethodBeat.i(38371);
    if (this.rkX != null)
    {
      PString localPString1 = new PString();
      PString localPString2 = new PString();
      if (this.rkX.a(localPString1))
      {
        if (!bo.isNullOrNil(localPString2.value))
          Zz(localPString2.value);
        if (bo.isNullOrNil(localPString1.value))
          break label95;
        Mj(localPString1.value);
        AppMethodBeat.o(38371);
      }
    }
    while (true)
    {
      return;
      aNt();
      a(false, 0.0F);
      label95: AppMethodBeat.o(38371);
      continue;
      ab.w("MicroMsg.OfflineVideoView", "%d toggle video but video callback is null", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(38371);
    }
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public int getCurrentPosition()
  {
    AppMethodBeat.i(38382);
    int i;
    if (this.klq != null)
    {
      i = this.klq.getCurrentPosition() / 1000;
      AppMethodBeat.o(38382);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(38382);
    }
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38373);
    ab.e("MicroMsg.OfflineVideoView", "%d on play video error what %d extra %d isMMVideoPlayer %b errorCount %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.mqh), Integer.valueOf(this.bqQ) });
    this.bqQ += 1;
    String str = this.klq.getVideoPath();
    this.klq.stop();
    this.mqg = true;
    a(false, 0.0F);
    if (this.bqQ <= 3)
    {
      this.kkp.postDelayed(new OfflineVideoView.2(this, str), 200L);
      AppMethodBeat.o(38373);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(str))
      {
        ab.w("MicroMsg.OfflineVideoView", "%d start third player to play", new Object[] { Integer.valueOf(hashCode()) });
        this.kkp.post(new OfflineVideoView.3(this, str));
      }
      AppMethodBeat.o(38373);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(38370);
    ab.d("MicroMsg.OfflineVideoView", "%d on resume %s", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    if (!this.mqg)
      bwD();
    this.rkY = true;
    AppMethodBeat.o(38370);
  }

  public final void pL()
  {
    AppMethodBeat.i(38375);
    a(true, 0.0F);
    this.mqg = false;
    bJc();
    this.duration = (this.klq.getDuration() / 1000);
    ab.i("MicroMsg.OfflineVideoView", "%d on prepared. shouldPlayWhenPrepared [%b] shouldSeekTimeWhenPrepared[%d]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.rkZ), Integer.valueOf(this.rla) });
    if (this.rkZ)
    {
      if (this.rla <= 0)
        this.klq.start();
      while (true)
      {
        startTimer();
        if (this.rkX != null)
          this.rkX.onStart(this.duration);
        this.rla = -1;
        AppMethodBeat.o(38375);
        return;
        ae(this.rla, true);
      }
    }
    if (this.rla > 0);
    for (int i = this.rla; ; i = 0)
    {
      ae(i, false);
      break;
    }
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(38369);
    this.eif = paramBoolean;
    this.klq.setMute(this.eif);
    AppMethodBeat.o(38369);
  }

  public void setVideoCallback(OfflineVideoView.a parama)
  {
    this.rkX = parama;
  }

  public final void startTimer()
  {
    AppMethodBeat.i(38378);
    this.klw.ae(1000L, 1000L);
    AppMethodBeat.o(38378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OfflineVideoView
 * JD-Core Version:    0.6.2
 */