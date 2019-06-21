package com.tencent.mm.plugin.websearch.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public class WebSearchWebVideoViewControlBar extends WebSearchVideoPlayerSeekBar
{
  private static int ucq = -1;
  private ImageView hZC;
  private FrameLayout hZD;
  private ImageView hZE;
  public ap hZK;
  public ap hZL;
  public boolean hZM;
  private ImageView hZz;
  protected RelativeLayout kGo;
  private ImageView uco;
  private WebSearchWebVideoViewControlBar.a ucp;

  public WebSearchWebVideoViewControlBar(Context paramContext)
  {
    super(paramContext);
  }

  public WebSearchWebVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public WebSearchWebVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void aFC()
  {
    AppMethodBeat.i(73847);
    if (this.hZM)
    {
      this.hZz.setImageResource(2131231349);
      this.hZz.setVisibility(8);
      this.uco.setVisibility(0);
      AppMethodBeat.o(73847);
    }
    while (true)
    {
      return;
      this.uco.setVisibility(8);
      this.hZz.setVisibility(0);
      this.hZz.setImageResource(2130838886);
      AppMethodBeat.o(73847);
    }
  }

  private void aFL()
  {
    AppMethodBeat.i(73853);
    if (this.hZM);
    for (float f = getResources().getDimensionPixelSize(2131428415); ; f = getResources().getDimensionPixelSize(2131428413))
    {
      this.qyp.setTextSize(0, f);
      this.qyq.setTextSize(0, f);
      AppMethodBeat.o(73853);
      return;
    }
  }

  private void aFM()
  {
    AppMethodBeat.i(73854);
    ViewGroup.LayoutParams localLayoutParams = this.kGo.getLayoutParams();
    if (this.hZM);
    for (localLayoutParams.height = getResources().getDimensionPixelSize(2131428414); ; localLayoutParams.height = getResources().getDimensionPixelSize(2131428412))
    {
      this.kGo.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(73854);
      return;
    }
  }

  private void cVL()
  {
    AppMethodBeat.i(73841);
    if (!this.hZM)
      if (this.cAW)
      {
        this.qyo.setImageResource(2130838874);
        AppMethodBeat.o(73841);
      }
    while (true)
    {
      return;
      this.qyo.setImageResource(2130838888);
      AppMethodBeat.o(73841);
      continue;
      if (this.cAW)
      {
        this.qyo.setImageResource(2130838874);
        AppMethodBeat.o(73841);
      }
      else
      {
        this.qyo.setImageResource(2130838888);
        AppMethodBeat.o(73841);
      }
    }
  }

  public final void Dq(int paramInt)
  {
    AppMethodBeat.i(73858);
    seek((int)Math.ceil(this.ucp.cVN() * 1.0D / 1000.0D));
    AppMethodBeat.o(73858);
  }

  public final void NO()
  {
    AppMethodBeat.i(73842);
    this.hZE.setImageResource(2130838891);
    AppMethodBeat.o(73842);
  }

  public final void aDF()
  {
    AppMethodBeat.i(73851);
    this.hZM = false;
    aFJ();
    AppMethodBeat.o(73851);
  }

  public final void aFE()
  {
    AppMethodBeat.i(73849);
    if (this.hZK != null)
    {
      this.hZK.stopTimer();
      this.hZK.ae(2000L, 2000L);
    }
    AppMethodBeat.o(73849);
  }

  public final void aFJ()
  {
    AppMethodBeat.i(73852);
    aFM();
    aFC();
    cVL();
    aFL();
    AppMethodBeat.o(73852);
  }

  public final boolean aFP()
  {
    boolean bool = false;
    AppMethodBeat.i(73855);
    if (this.ucp == null)
    {
      ab.i("MicroMsg.FtsWebVideoViewControlBar", "updateMiddleBar mStatePorter null");
      AppMethodBeat.o(73855);
    }
    while (true)
    {
      return bool;
      int i = this.ucp.aFg();
      int j = this.ucp.aFh();
      if ((i < 0) || (j < 0))
      {
        AppMethodBeat.o(73855);
      }
      else
      {
        int k = this.hZD.getWidth();
        if (k <= 0)
        {
          AppMethodBeat.o(73855);
          bool = true;
        }
        else
        {
          FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.hZC.getLayoutParams();
          int m = k;
          if (j != 0)
            m = (int)(k * (1.0F - i / j));
          if (m > 0);
          while (true)
          {
            localLayoutParams.rightMargin = (m + ucq);
            this.hZC.setLayoutParams(localLayoutParams);
            if ((i < j) || (j == 0))
              break label170;
            AppMethodBeat.o(73855);
            break;
            m = 0;
          }
          label170: AppMethodBeat.o(73855);
          bool = true;
        }
      }
    }
  }

  public final void cHd()
  {
    AppMethodBeat.i(73848);
    if (this.hZK != null)
      this.hZK.stopTimer();
    AppMethodBeat.o(73848);
  }

  public final void cHe()
  {
    AppMethodBeat.i(73856);
    this.qyo.setVisibility(8);
    AppMethodBeat.o(73856);
  }

  public final void cHf()
  {
    AppMethodBeat.i(73857);
    this.qyo.setVisibility(0);
    AppMethodBeat.o(73857);
  }

  public final void cVM()
  {
    AppMethodBeat.i(73843);
    this.hZE.setImageResource(2130838887);
    AppMethodBeat.o(73843);
  }

  public int getBarPointWidth()
  {
    AppMethodBeat.i(73840);
    int i = this.qyn.getWidth();
    AppMethodBeat.o(73840);
    return i;
  }

  protected ImageView getExitFullscreenIv()
  {
    return this.uco;
  }

  public int getLayoutId()
  {
    return 2130969643;
  }

  public final void init()
  {
    AppMethodBeat.i(73838);
    super.init();
    this.hZz = ((ImageView)this.contentView.findViewById(2131821430));
    this.hZE = ((ImageView)this.contentView.findViewById(2131824286));
    this.hZC = ((ImageView)this.contentView.findViewById(2131821424));
    this.hZD = ((FrameLayout)this.contentView.findViewById(2131821422));
    this.kGo = ((RelativeLayout)findViewById(2131820987));
    this.uco = ((ImageView)this.contentView.findViewById(2131821418));
    if (ucq < 0)
      ucq = getResources().getDimensionPixelSize(2131428416);
    AppMethodBeat.o(73838);
  }

  public final void nG(boolean paramBoolean)
  {
    AppMethodBeat.i(73850);
    if (getVisibility() == 0);
    for (int i = 1; i != 0; i = 0)
    {
      setVisibility(8);
      AppMethodBeat.o(73850);
      return;
    }
    setVisibility(0);
    if (!paramBoolean)
      cHf();
    while (true)
    {
      if (this.hZK == null)
        this.hZK = new ap(new WebSearchWebVideoViewControlBar.1(this), false);
      this.hZK.stopTimer();
      this.hZK.ae(2000L, 2000L);
      AppMethodBeat.o(73850);
      break;
      cHe();
    }
  }

  public void setEnterFullScreenBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(73845);
    this.hZz.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(73845);
  }

  public void setExitFullScreenBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(73846);
    this.uco.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(73846);
  }

  public void setIsPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(73839);
    this.cAW = paramBoolean;
    cVL();
    AppMethodBeat.o(73839);
  }

  public void setMuteBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(73844);
    this.hZE.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(73844);
  }

  public void setStatePorter(WebSearchWebVideoViewControlBar.a parama)
  {
    this.ucp = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.ui.WebSearchWebVideoViewControlBar
 * JD-Core Version:    0.6.2
 */