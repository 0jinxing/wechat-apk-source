package com.tencent.mm.plugin.appbrand.jsapi.video;

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
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

public class AppBrandVideoViewControlBar extends VideoPlayerSeekBar
  implements d.a
{
  private TextView atH;
  private ImageView hZA;
  private LinearLayout hZB;
  private ImageView hZC;
  private FrameLayout hZD;
  private ImageView hZE;
  private ImageView hZF;
  private ImageView hZG;
  private LinearLayout hZH;
  private LinearLayout hZI;
  private d.h hZJ;
  private ap hZK;
  private ap hZL;
  private boolean hZM;
  private boolean hZN;
  private boolean hZO;
  private boolean hZP;
  private boolean hZQ;
  private boolean hZR;
  private boolean hZS;
  private d.d hZT;
  private d.e hZU;
  private ImageView hZz;

  public AppBrandVideoViewControlBar(Context paramContext)
  {
    super(paramContext);
  }

  public AppBrandVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AppBrandVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void aFB()
  {
    AppMethodBeat.i(131557);
    if (this.hZN)
    {
      this.hZA.setImageResource(2131230886);
      AppMethodBeat.o(131557);
    }
    while (true)
    {
      return;
      this.hZA.setImageResource(2131230885);
      AppMethodBeat.o(131557);
    }
  }

  private void aFC()
  {
    AppMethodBeat.i(131558);
    if (this.hZO)
    {
      this.hZz.setVisibility(0);
      if (this.hZM)
      {
        this.hZz.setImageResource(2131230891);
        AppMethodBeat.o(131558);
      }
    }
    while (true)
    {
      return;
      this.hZz.setImageResource(2131230888);
      AppMethodBeat.o(131558);
      continue;
      this.hZz.setVisibility(8);
      AppMethodBeat.o(131558);
    }
  }

  private void aFJ()
  {
    AppMethodBeat.i(131567);
    aFM();
    aFC();
    aFx();
    aFL();
    aFK();
    AppMethodBeat.o(131567);
  }

  private void aFK()
  {
    AppMethodBeat.i(131568);
    if (this.hZM);
    for (int i = getResources().getDimensionPixelSize(2131428102); ; i = getResources().getDimensionPixelSize(2131428092))
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
      if (this.hZA != null)
      {
        localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.hZA.getLayoutParams();
        localMarginLayoutParams.setMarginStart(i);
        this.hZA.setLayoutParams(localMarginLayoutParams);
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
      AppMethodBeat.o(131568);
      return;
    }
  }

  private void aFL()
  {
    AppMethodBeat.i(131569);
    if (this.hZM);
    for (float f = getResources().getDimensionPixelSize(2131428105); ; f = getResources().getDimensionPixelSize(2131428098))
    {
      this.qyp.setTextSize(0, f);
      this.qyq.setTextSize(0, f);
      AppMethodBeat.o(131569);
      return;
    }
  }

  private void aFM()
  {
    AppMethodBeat.i(131570);
    ViewGroup.LayoutParams localLayoutParams = this.hZB.getLayoutParams();
    if (this.hZM)
    {
      localLayoutParams.height = getResources().getDimensionPixelSize(2131428103);
      this.hZB.setLayoutParams(localLayoutParams);
      if (!this.hZM)
        break label109;
    }
    label109: for (int i = getResources().getDimensionPixelSize(2131428104); ; i = getResources().getDimensionPixelSize(2131428095))
    {
      this.hZB.setPadding(0, 0, i, 0);
      if (this.hZH != null)
        this.hZH.setPadding(i, 0, i, 0);
      AppMethodBeat.o(131570);
      return;
      localLayoutParams.height = getResources().getDimensionPixelSize(2131428094);
      break;
    }
  }

  private boolean aFP()
  {
    boolean bool = false;
    AppMethodBeat.i(131573);
    if (this.hZJ == null)
    {
      ab.i("MicroMsg.AppBrandVideoViewControlBar", "updateMiddleBar mStatePorter null");
      AppMethodBeat.o(131573);
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
        AppMethodBeat.o(131573);
      }
      else
      {
        k = i;
        if (i > j)
          k = j;
        i = getBarLen();
        if (i > 0)
          break;
        AppMethodBeat.o(131573);
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
      AppMethodBeat.o(131573);
      bool = true;
      break;
      d = i;
    }
  }

  private void aFS()
  {
    int i = 0;
    AppMethodBeat.i(131580);
    boolean bool;
    Object localObject;
    if (this.hZQ)
    {
      bool = this.hZP;
      localObject = this.hZD;
      if (!bool)
        break label84;
      j = 0;
      label31: ((FrameLayout)localObject).setVisibility(j);
      localObject = this.qyp;
      if (!bool)
        break label91;
      j = 0;
      label49: ((TextView)localObject).setVisibility(j);
      localObject = this.qyq;
      if (!bool)
        break label98;
    }
    label84: label91: label98: for (int j = i; ; j = 8)
    {
      ((TextView)localObject).setVisibility(j);
      AppMethodBeat.o(131580);
      return;
      bool = false;
      break;
      j = 8;
      break label31;
      j = 8;
      break label49;
    }
  }

  private void aFx()
  {
    AppMethodBeat.i(131548);
    if (this.hZM)
    {
      this.hZH.setVisibility(0);
      AppMethodBeat.o(131548);
    }
    while (true)
    {
      return;
      this.hZH.setVisibility(8);
      AppMethodBeat.o(131548);
    }
  }

  private void aFz()
  {
    AppMethodBeat.i(131552);
    if (this.hZR)
      if (this.hZS)
      {
        this.qyo.setVisibility(8);
        this.hZF.setVisibility(0);
        AppMethodBeat.o(131552);
      }
    while (true)
    {
      return;
      this.qyo.setVisibility(0);
      this.hZF.setVisibility(8);
      AppMethodBeat.o(131552);
      continue;
      this.qyo.setVisibility(8);
      this.hZF.setVisibility(8);
      AppMethodBeat.o(131552);
    }
  }

  private void df(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131581);
    if (this.hZT != null)
      this.hZT.dd(paramInt1, paramInt2);
    AppMethodBeat.o(131581);
  }

  public final void aDF()
  {
    AppMethodBeat.i(131566);
    this.hZM = false;
    aFJ();
    AppMethodBeat.o(131566);
  }

  public final void aEZ()
  {
    AppMethodBeat.i(131550);
    if ((this.hZR) && (this.hZS))
      this.hZF.setVisibility(8);
    AppMethodBeat.o(131550);
  }

  public final boolean aFA()
  {
    return this.hZN;
  }

  public final void aFD()
  {
    AppMethodBeat.i(131560);
    setVisibility(0);
    if (this.hZK == null)
      this.hZK = new ap(new AppBrandVideoViewControlBar.3(this), false);
    this.hZK.stopTimer();
    this.hZK.ae(7000L, 7000L);
    AppMethodBeat.o(131560);
  }

  public final void aFE()
  {
    AppMethodBeat.i(131561);
    if (this.hZK != null)
    {
      this.hZK.stopTimer();
      this.hZK.ae(7000L, 7000L);
    }
    AppMethodBeat.o(131561);
  }

  public final boolean aFF()
  {
    AppMethodBeat.i(131563);
    boolean bool;
    if (getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(131563);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(131563);
    }
  }

  public final void aFG()
  {
    AppMethodBeat.i(131564);
    if (aFF())
    {
      setVisibility(8);
      AppMethodBeat.o(131564);
    }
    while (true)
    {
      return;
      aFD();
      AppMethodBeat.o(131564);
    }
  }

  public final void aFH()
  {
    AppMethodBeat.i(131565);
    this.hZM = true;
    aFJ();
    AppMethodBeat.o(131565);
  }

  public final boolean aFI()
  {
    return this.hZM;
  }

  public final void aFN()
  {
    AppMethodBeat.i(131571);
    if (this.hZL == null)
      this.hZL = new ap(new AppBrandVideoViewControlBar.4(this), true);
    aFP();
    this.hZL.stopTimer();
    this.hZL.ae(500L, 500L);
    AppMethodBeat.o(131571);
  }

  public final void aFO()
  {
    AppMethodBeat.i(131572);
    if (this.hZL != null)
      this.hZL.stopTimer();
    AppMethodBeat.o(131572);
  }

  public final void aFQ()
  {
    AppMethodBeat.i(131575);
    if (this.qyr == 0)
      AppMethodBeat.o(131575);
    while (true)
    {
      return;
      if (this.hOy)
      {
        AppMethodBeat.o(131575);
      }
      else if (this.qyn == null)
      {
        AppMethodBeat.o(131575);
      }
      else
      {
        this.qyp.setText(oy(this.mPosition / 60) + ":" + oy(this.mPosition % 60));
        if (getBarLen() == 0)
        {
          AppMethodBeat.o(131575);
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
          AppMethodBeat.o(131575);
        }
      }
    }
  }

  public final boolean aFR()
  {
    boolean bool = false;
    AppMethodBeat.i(131579);
    if (this.hZD != null)
      if ((getVisibility() == 0) && (this.hZD.getVisibility() == 0))
      {
        bool = true;
        AppMethodBeat.o(131579);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(131579);
      continue;
      AppMethodBeat.o(131579);
    }
  }

  public final void aFy()
  {
    AppMethodBeat.i(131551);
    if ((this.hZR) && (this.hZS))
      this.hZF.setVisibility(0);
    AppMethodBeat.o(131551);
  }

  public int getLayoutId()
  {
    return 2130968745;
  }

  public final void hide()
  {
    AppMethodBeat.i(131562);
    setVisibility(8);
    AppMethodBeat.o(131562);
  }

  public final void init()
  {
    AppMethodBeat.i(131540);
    super.init();
    this.hZz = ((ImageView)this.contentView.findViewById(2131821430));
    this.hZA = ((ImageView)this.contentView.findViewById(2131821428));
    this.hZC = ((ImageView)this.contentView.findViewById(2131821424));
    this.hZD = ((FrameLayout)this.contentView.findViewById(2131821422));
    this.hZB = ((LinearLayout)findViewById(2131820987));
    this.hZE = ((ImageView)findViewById(2131821429));
    this.hZF = ((ImageView)findViewById(2131821419));
    this.hZG = ((ImageView)findViewById(2131821418));
    this.atH = ((TextView)findViewById(2131820678));
    this.hZH = ((LinearLayout)findViewById(2131821417));
    this.hZI = ((LinearLayout)findViewById(2131821420));
    AppMethodBeat.o(131540);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(131538);
    if (this.hZL != null)
      this.hZL.stopTimer();
    if (this.hZK != null)
      this.hZK.stopTimer();
    AppMethodBeat.o(131538);
  }

  public final void seek(int paramInt)
  {
    AppMethodBeat.i(131574);
    super.seek(paramInt);
    df(this.mPosition, this.qyr);
    AppMethodBeat.o(131574);
  }

  public void setDanmakuBtnOnClickListener(d.f paramf)
  {
    AppMethodBeat.i(131555);
    this.hZA.setOnClickListener(new AppBrandVideoViewControlBar.2(this, paramf));
    AppMethodBeat.o(131555);
  }

  public void setDanmakuBtnOpen(boolean paramBoolean)
  {
    AppMethodBeat.i(131556);
    this.hZN = paramBoolean;
    aFB();
    AppMethodBeat.o(131556);
  }

  public void setExitFullScreenBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(131542);
    this.hZG.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(131542);
  }

  public void setFullScreenBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(131554);
    this.hZz.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(131554);
  }

  public void setIplaySeekCallback(d.c paramc)
  {
    AppMethodBeat.i(131539);
    setIplaySeekCallback(new AppBrandVideoViewControlBar.1(this, paramc));
    AppMethodBeat.o(131539);
  }

  public void setIsPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(131553);
    this.cAW = paramBoolean;
    if (this.cAW)
    {
      this.qyo.setImageResource(2131230899);
      this.hZF.setImageResource(2131230899);
      AppMethodBeat.o(131553);
    }
    while (true)
    {
      return;
      this.qyo.setImageResource(2131230900);
      this.hZF.setImageResource(2131230900);
      AppMethodBeat.o(131553);
    }
  }

  public void setMuteBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(131541);
    this.hZE.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(131541);
  }

  public void setMuteBtnState(boolean paramBoolean)
  {
    AppMethodBeat.i(131546);
    if (paramBoolean)
    {
      this.hZE.setImageResource(2131230895);
      AppMethodBeat.o(131546);
    }
    while (true)
    {
      return;
      this.hZE.setImageResource(2131230896);
      AppMethodBeat.o(131546);
    }
  }

  public void setOnPlayButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(131543);
    super.setOnPlayButtonClickListener(paramOnClickListener);
    this.hZF.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(131543);
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
    AppMethodBeat.i(131549);
    this.hZS = paramBoolean;
    aFz();
    AppMethodBeat.o(131549);
  }

  public void setShowControlProgress(boolean paramBoolean)
  {
    AppMethodBeat.i(131547);
    this.hZQ = paramBoolean;
    aFS();
    AppMethodBeat.o(131547);
  }

  public void setShowDanmakuBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(131559);
    if (paramBoolean)
    {
      this.hZA.setVisibility(0);
      AppMethodBeat.o(131559);
    }
    while (true)
    {
      return;
      this.hZA.setVisibility(8);
      AppMethodBeat.o(131559);
    }
  }

  public void setShowFullScreenBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(131576);
    this.hZO = paramBoolean;
    aFC();
    aFx();
    AppMethodBeat.o(131576);
  }

  public void setShowMuteBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(131545);
    ImageView localImageView = this.hZE;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      AppMethodBeat.o(131545);
      return;
    }
  }

  public void setShowPlayBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(131577);
    this.hZR = paramBoolean;
    aFz();
    AppMethodBeat.o(131577);
  }

  public void setShowProgress(boolean paramBoolean)
  {
    AppMethodBeat.i(131578);
    this.hZP = paramBoolean;
    aFS();
    AppMethodBeat.o(131578);
  }

  public void setStatePorter(d.h paramh)
  {
    this.hZJ = paramh;
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(131544);
    if (!bo.isNullOrNil(paramString))
      this.atH.setText(paramString);
    AppMethodBeat.o(131544);
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(131582);
    super.setVisibility(paramInt);
    if (paramInt == 0)
    {
      if (this.hZU == null)
        break label67;
      this.hZU.onVisibilityChanged(true);
      AppMethodBeat.o(131582);
    }
    while (true)
    {
      return;
      if (((paramInt == 8) || (paramInt == 4)) && (this.hZU != null))
        this.hZU.onVisibilityChanged(false);
      label67: AppMethodBeat.o(131582);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoViewControlBar
 * JD-Core Version:    0.6.2
 */