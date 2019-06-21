package com.tencent.mm.plugin.brandservice.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.a;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.c;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.d;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.e;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.f;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.h;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

public class MPVideoViewControlBar extends VideoPlayerSeekBar
  implements d.a
{
  private TextView atH;
  private LinearLayout hZB;
  private ImageView hZC;
  private FrameLayout hZD;
  private ImageView hZE;
  private ImageView hZF;
  private ImageView hZG;
  private LinearLayout hZH;
  private LinearLayout hZI;
  private d.h hZJ;
  ap hZK;
  private ap hZL;
  private boolean hZM;
  private boolean hZO;
  private boolean hZP;
  private boolean hZQ;
  private boolean hZR;
  private boolean hZS;
  private d.d hZT;
  private d.e hZU;
  private ImageView hZz;

  public MPVideoViewControlBar(Context paramContext)
  {
    super(paramContext);
  }

  public MPVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MPVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void aFC()
  {
    AppMethodBeat.i(14606);
    if (this.hZO)
    {
      this.hZz.setVisibility(0);
      if (this.hZM)
      {
        this.hZz.setImageResource(2131231648);
        AppMethodBeat.o(14606);
      }
    }
    while (true)
    {
      return;
      this.hZz.setImageResource(2131231647);
      AppMethodBeat.o(14606);
      continue;
      this.hZz.setVisibility(8);
      AppMethodBeat.o(14606);
    }
  }

  private void aFJ()
  {
    AppMethodBeat.i(14614);
    aFM();
    aFC();
    aFx();
    aFL();
    aFK();
    AppMethodBeat.o(14614);
  }

  private void aFK()
  {
    AppMethodBeat.i(14615);
    if (this.hZM);
    for (int i = getResources().getDimensionPixelSize(2131428571); ; i = getResources().getDimensionPixelSize(2131428561))
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams;
      if (this.qyo != null)
      {
        localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.qyo.getLayoutParams();
        localMarginLayoutParams.setMarginStart(i);
        this.qyo.setLayoutParams(localMarginLayoutParams);
      }
      if (this.hZI != null)
      {
        localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.hZI.getLayoutParams();
        localMarginLayoutParams.setMarginStart(i);
        this.hZI.setLayoutParams(localMarginLayoutParams);
      }
      if (this.hZE != null)
      {
        localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.hZE.getLayoutParams();
        localMarginLayoutParams.setMarginStart(i);
        this.hZE.setLayoutParams(localMarginLayoutParams);
      }
      if (this.hZz != null)
      {
        localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.hZz.getLayoutParams();
        localMarginLayoutParams.setMarginStart(i);
        this.hZz.setLayoutParams(localMarginLayoutParams);
      }
      AppMethodBeat.o(14615);
      return;
    }
  }

  private void aFL()
  {
    AppMethodBeat.i(14616);
    if (this.hZM);
    for (float f = getResources().getDimensionPixelSize(2131428574); ; f = getResources().getDimensionPixelSize(2131428567))
    {
      this.qyp.setTextSize(0, f);
      this.qyq.setTextSize(0, f);
      AppMethodBeat.o(14616);
      return;
    }
  }

  private void aFM()
  {
    AppMethodBeat.i(14617);
    ViewGroup.LayoutParams localLayoutParams = this.hZB.getLayoutParams();
    if (this.hZM)
    {
      localLayoutParams.height = getResources().getDimensionPixelSize(2131428572);
      this.hZB.setLayoutParams(localLayoutParams);
      if (!this.hZM)
        break label111;
    }
    label111: for (int i = getResources().getDimensionPixelSize(2131428573); ; i = getResources().getDimensionPixelSize(2131428564))
    {
      this.hZB.setPadding(0, 0, i, 0);
      if (this.hZH != null)
        this.hZH.setPadding(i, 0, i, 0);
      AppMethodBeat.o(14617);
      return;
      localLayoutParams.height = getResources().getDimensionPixelSize(2131428563);
      break;
    }
  }

  private boolean aFP()
  {
    boolean bool = false;
    AppMethodBeat.i(14620);
    if (this.hZJ == null)
    {
      ab.i("MicroMsg.MPVideoViewControlBar", "updateMiddleBar mStatePorter null");
      AppMethodBeat.o(14620);
    }
    int i;
    int j;
    while (true)
    {
      return bool;
      i = this.hZJ.aFg();
      j = this.hZJ.aFh();
      if ((i < 0) || (j < 0))
      {
        AppMethodBeat.o(14620);
      }
      else
      {
        k = i;
        if (i > j)
          k = j;
        i = getBarLen();
        if (i > 0)
          break;
        AppMethodBeat.o(14620);
        bool = true;
      }
    }
    if (j == 0);
    double d;
    for (int k = 0; ; k = (int)(k * 1.0D / j * d))
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.hZC.getLayoutParams();
      localLayoutParams.width = k;
      this.hZC.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(14620);
      bool = true;
      break;
      d = i;
    }
  }

  private void aFS()
  {
    int i = 0;
    AppMethodBeat.i(14627);
    boolean bool;
    Object localObject;
    if (this.hZQ)
    {
      bool = this.hZP;
      localObject = this.hZD;
      if (!bool)
        break label86;
      j = 0;
      label32: ((FrameLayout)localObject).setVisibility(j);
      localObject = this.qyp;
      if (!bool)
        break label93;
      j = 0;
      label50: ((TextView)localObject).setVisibility(j);
      localObject = this.qyq;
      if (!bool)
        break label100;
    }
    label86: label93: label100: for (int j = i; ; j = 8)
    {
      ((TextView)localObject).setVisibility(j);
      AppMethodBeat.o(14627);
      return;
      bool = false;
      break;
      j = 8;
      break label32;
      j = 8;
      break label50;
    }
  }

  private void aFx()
  {
    AppMethodBeat.i(14599);
    if (this.hZM)
    {
      this.hZH.setVisibility(0);
      AppMethodBeat.o(14599);
    }
    while (true)
    {
      return;
      this.hZH.setVisibility(8);
      AppMethodBeat.o(14599);
    }
  }

  private void aFz()
  {
    AppMethodBeat.i(14603);
    if (this.hZR)
      if (this.hZS)
      {
        this.qyo.setVisibility(8);
        this.hZF.setVisibility(0);
        AppMethodBeat.o(14603);
      }
    while (true)
    {
      return;
      this.qyo.setVisibility(0);
      this.hZF.setVisibility(8);
      AppMethodBeat.o(14603);
      continue;
      this.qyo.setVisibility(8);
      this.hZF.setVisibility(8);
      AppMethodBeat.o(14603);
    }
  }

  private void df(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14628);
    if (this.hZT != null)
      this.hZT.dd(paramInt1, paramInt2);
    AppMethodBeat.o(14628);
  }

  public final void aDF()
  {
    AppMethodBeat.i(14613);
    this.hZM = false;
    aFJ();
    AppMethodBeat.o(14613);
  }

  public final void aEZ()
  {
    AppMethodBeat.i(14601);
    if ((this.hZR) && (this.hZS))
      this.hZF.setVisibility(8);
    AppMethodBeat.o(14601);
  }

  public final boolean aFA()
  {
    return false;
  }

  public final void aFD()
  {
    AppMethodBeat.i(14607);
    setVisibility(0);
    if (this.hZK == null)
      this.hZK = new ap(new MPVideoViewControlBar.2(this), false);
    this.hZK.stopTimer();
    this.hZK.ae(3000L, 3000L);
    AppMethodBeat.o(14607);
  }

  public final void aFE()
  {
    AppMethodBeat.i(14608);
    if (this.hZK != null)
    {
      this.hZK.stopTimer();
      this.hZK.ae(3000L, 3000L);
    }
    AppMethodBeat.o(14608);
  }

  public final boolean aFF()
  {
    AppMethodBeat.i(14610);
    boolean bool;
    if (getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(14610);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14610);
    }
  }

  public final void aFG()
  {
    AppMethodBeat.i(14611);
    if (aFF())
    {
      setVisibility(8);
      AppMethodBeat.o(14611);
    }
    while (true)
    {
      return;
      aFD();
      AppMethodBeat.o(14611);
    }
  }

  public final void aFH()
  {
    AppMethodBeat.i(14612);
    this.hZM = true;
    aFJ();
    AppMethodBeat.o(14612);
  }

  public final boolean aFI()
  {
    return this.hZM;
  }

  public final void aFN()
  {
    AppMethodBeat.i(14618);
    if (this.hZL == null)
      this.hZL = new ap(new ap.a()
      {
        public final boolean BI()
        {
          AppMethodBeat.i(14588);
          boolean bool;
          if (!MPVideoViewControlBar.b(MPVideoViewControlBar.this))
          {
            bool = false;
            AppMethodBeat.o(14588);
          }
          while (true)
          {
            return bool;
            bool = true;
            AppMethodBeat.o(14588);
          }
        }
      }
      , true);
    aFP();
    this.hZL.stopTimer();
    this.hZL.ae(500L, 500L);
    AppMethodBeat.o(14618);
  }

  public final void aFO()
  {
    AppMethodBeat.i(14619);
    if (this.hZL != null)
      this.hZL.stopTimer();
    AppMethodBeat.o(14619);
  }

  public final void aFQ()
  {
    AppMethodBeat.i(14622);
    if (this.qyr == 0)
      AppMethodBeat.o(14622);
    while (true)
    {
      return;
      if (this.hOy)
      {
        AppMethodBeat.o(14622);
      }
      else if (this.qyn == null)
      {
        AppMethodBeat.o(14622);
      }
      else
      {
        this.qyp.setText(oy(this.mPosition / 60) + ":" + oy(this.mPosition % 60));
        if (getBarLen() == 0)
        {
          AppMethodBeat.o(14622);
        }
        else
        {
          FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.qyn.getLayoutParams();
          int i = getBarLen();
          localLayoutParams.leftMargin = gR(this.mPosition, i);
          this.qyn.setLayoutParams(localLayoutParams);
          localLayoutParams = (FrameLayout.LayoutParams)this.qyl.getLayoutParams();
          localLayoutParams.width = ((int)(this.mPosition * 1.0D / this.qyr * i));
          this.qyl.setLayoutParams(localLayoutParams);
          requestLayout();
          df(this.mPosition, this.qyr);
          AppMethodBeat.o(14622);
        }
      }
    }
  }

  public final boolean aFR()
  {
    boolean bool = false;
    AppMethodBeat.i(14626);
    if (this.hZD != null)
      if ((getVisibility() == 0) && (this.hZD.getVisibility() == 0))
      {
        bool = true;
        AppMethodBeat.o(14626);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(14626);
      continue;
      AppMethodBeat.o(14626);
    }
  }

  public final void aFy()
  {
    AppMethodBeat.i(14602);
    if ((this.hZR) && (this.hZS))
      this.hZF.setVisibility(0);
    AppMethodBeat.o(14602);
  }

  public int getLayoutId()
  {
    return 2130970259;
  }

  public final void hide()
  {
    AppMethodBeat.i(138511);
    setVisibility(8);
    AppMethodBeat.o(138511);
  }

  public final void init()
  {
    AppMethodBeat.i(14591);
    super.init();
    this.hZz = ((ImageView)this.contentView.findViewById(2131821430));
    this.hZC = ((ImageView)this.contentView.findViewById(2131821424));
    this.hZD = ((FrameLayout)this.contentView.findViewById(2131821422));
    this.hZB = ((LinearLayout)findViewById(2131820987));
    this.hZE = ((ImageView)findViewById(2131821429));
    this.hZF = ((ImageView)findViewById(2131821419));
    this.hZG = ((ImageView)findViewById(2131821418));
    this.atH = ((TextView)findViewById(2131820678));
    this.hZH = ((LinearLayout)findViewById(2131821417));
    this.hZI = ((LinearLayout)findViewById(2131821420));
    AppMethodBeat.o(14591);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(14589);
    if (this.hZL != null)
      this.hZL.stopTimer();
    if (this.hZK != null)
      this.hZK.stopTimer();
    AppMethodBeat.o(14589);
  }

  public final void seek(int paramInt)
  {
    AppMethodBeat.i(14621);
    super.seek(paramInt);
    df(this.mPosition, this.qyr);
    AppMethodBeat.o(14621);
  }

  public void setDanmakuBtnOnClickListener(d.f paramf)
  {
  }

  public void setDanmakuBtnOpen(boolean paramBoolean)
  {
  }

  public void setExitFullScreenBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(14593);
    this.hZG.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(14593);
  }

  public void setFullScreenBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(14605);
    this.hZz.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(14605);
  }

  public void setIplaySeekCallback(final d.c paramc)
  {
    AppMethodBeat.i(14590);
    setIplaySeekCallback(new b()
    {
      public final void aFw()
      {
        AppMethodBeat.i(14585);
        paramc.aFw();
        AppMethodBeat.o(14585);
      }

      public final void oA(int paramAnonymousInt)
      {
        AppMethodBeat.i(14586);
        paramc.oA(paramAnonymousInt);
        AppMethodBeat.o(14586);
      }
    });
    AppMethodBeat.o(14590);
  }

  public void setIsPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(14604);
    this.cAW = paramBoolean;
    if (this.cAW)
    {
      this.qyo.setImageResource(2131231656);
      this.hZF.setImageResource(2131231656);
      AppMethodBeat.o(14604);
    }
    while (true)
    {
      return;
      this.qyo.setImageResource(2131231657);
      this.hZF.setImageResource(2131231657);
      AppMethodBeat.o(14604);
    }
  }

  public void setMuteBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(14592);
    this.hZE.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(14592);
  }

  public void setMuteBtnState(boolean paramBoolean)
  {
    AppMethodBeat.i(14597);
    if (paramBoolean)
    {
      this.hZE.setImageResource(2131231652);
      AppMethodBeat.o(14597);
    }
    while (true)
    {
      return;
      this.hZE.setImageResource(2131231653);
      AppMethodBeat.o(14597);
    }
  }

  public void setOnPlayButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(14594);
    super.setOnPlayButtonClickListener(paramOnClickListener);
    this.hZF.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(14594);
  }

  public void setOnUpdateProgressLenListener(d.d paramd)
  {
    this.hZT = paramd;
  }

  public void setOnVisibilityChangedListener(d.e parame)
  {
    this.hZU = parame;
  }

  public void setPlayBtnInCenterPosition(boolean paramBoolean)
  {
    AppMethodBeat.i(14600);
    this.hZS = paramBoolean;
    aFz();
    AppMethodBeat.o(14600);
  }

  public void setShowControlProgress(boolean paramBoolean)
  {
    AppMethodBeat.i(14598);
    this.hZQ = paramBoolean;
    aFS();
    AppMethodBeat.o(14598);
  }

  public void setShowDanmakuBtn(boolean paramBoolean)
  {
  }

  public void setShowFullScreenBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(14623);
    this.hZO = paramBoolean;
    aFC();
    aFx();
    AppMethodBeat.o(14623);
  }

  public void setShowMuteBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(14596);
    ImageView localImageView = this.hZE;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      AppMethodBeat.o(14596);
      return;
    }
  }

  public void setShowPlayBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(14624);
    this.hZR = paramBoolean;
    aFz();
    AppMethodBeat.o(14624);
  }

  public void setShowProgress(boolean paramBoolean)
  {
    AppMethodBeat.i(14625);
    this.hZP = paramBoolean;
    aFS();
    AppMethodBeat.o(14625);
  }

  public void setStatePorter(d.h paramh)
  {
    this.hZJ = paramh;
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(14595);
    if (!bo.isNullOrNil(paramString))
      this.atH.setText(paramString);
    AppMethodBeat.o(14595);
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(14629);
    super.setVisibility(paramInt);
    if (paramInt == 0)
    {
      if (this.hZU == null)
        break label67;
      this.hZU.onVisibilityChanged(true);
      AppMethodBeat.o(14629);
    }
    while (true)
    {
      return;
      if (((paramInt == 8) || (paramInt == 4)) && (this.hZU != null))
        this.hZU.onVisibilityChanged(false);
      label67: AppMethodBeat.o(14629);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoViewControlBar
 * JD-Core Version:    0.6.2
 */