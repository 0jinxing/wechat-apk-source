package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class VoiceTipInfoView extends LinearLayout
{
  public ProgressBar gHA;
  TextView iDT;
  TextView poi;
  boolean sMN;
  private boolean sMO;
  private TextView sMP;
  private boolean sMQ;
  private float sMR;

  public VoiceTipInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(26227);
    this.sMN = false;
    this.sMO = false;
    this.sMQ = false;
    this.sMR = 0.0F;
    paramContext = LayoutInflater.from(paramContext).inflate(2130971026, this, true);
    this.gHA = ((ProgressBar)paramContext.findViewById(2131823898));
    bQt();
    this.iDT = ((TextView)paramContext.findViewById(2131828458));
    this.poi = ((TextView)paramContext.findViewById(2131823773));
    this.sMP = ((TextView)paramContext.findViewById(2131828480));
    reset();
    AppMethodBeat.o(26227);
  }

  public final void bQs()
  {
    AppMethodBeat.i(26229);
    ab.d("MicroMsg.VoiceTipInfoView", "mProgressBar show");
    this.gHA.setVisibility(0);
    AppMethodBeat.o(26229);
  }

  public final void bQt()
  {
    AppMethodBeat.i(26230);
    ab.d("MicroMsg.VoiceTipInfoView", "mProgressBar hide");
    this.gHA.setVisibility(8);
    AppMethodBeat.o(26230);
  }

  public final void cIe()
  {
    AppMethodBeat.i(26235);
    ab.d("MicroMsg.VoiceTipInfoView", "showTitle, titleTv.getVisibility:%d, mAnimingTitle:%b", new Object[] { Integer.valueOf(this.iDT.getVisibility()), Boolean.valueOf(this.sMN) });
    if (((this.iDT.getVisibility() == 4) || (this.iDT.getVisibility() == 8)) && (!this.sMN))
    {
      this.iDT.clearAnimation();
      this.sMN = true;
      a.b(this.iDT, getContext(), new VoiceTipInfoView.2(this));
      AppMethodBeat.o(26235);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.VoiceTipInfoView", "showTitle, directly set to VISIBLE");
      this.iDT.clearAnimation();
      this.iDT.setVisibility(0);
      this.iDT.invalidate();
      AppMethodBeat.o(26235);
    }
  }

  public final void cIf()
  {
    AppMethodBeat.i(26236);
    this.poi.setVisibility(8);
    AppMethodBeat.o(26236);
  }

  public final void cIg()
  {
    AppMethodBeat.i(26237);
    if ((this.sMP.getVisibility() == 4) && (!this.sMQ))
    {
      this.sMP.clearAnimation();
      this.sMQ = true;
      TextView localTextView = this.sMP;
      getContext();
      a.b(localTextView, new VoiceTipInfoView.4(this));
      AppMethodBeat.o(26237);
    }
    while (true)
    {
      return;
      this.sMP.clearAnimation();
      this.sMP.setVisibility(0);
      AppMethodBeat.o(26237);
    }
  }

  public final void cIh()
  {
    AppMethodBeat.i(26238);
    if ((this.sMP.getVisibility() == 0) && (!this.sMQ))
    {
      this.sMP.clearAnimation();
      this.sMQ = true;
      a.a(this.sMP, getContext(), new a.a()
      {
        public final void cHV()
        {
        }

        public final void cHW()
        {
          AppMethodBeat.i(26226);
          VoiceTipInfoView.c(VoiceTipInfoView.this).setVisibility(4);
          VoiceTipInfoView.d(VoiceTipInfoView.this);
          AppMethodBeat.o(26226);
        }
      });
      AppMethodBeat.o(26238);
    }
    while (true)
    {
      return;
      this.sMP.clearAnimation();
      this.sMP.setVisibility(4);
      AppMethodBeat.o(26238);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(26228);
    this.poi.setTextSize(0, getContext().getResources().getDimension(2131428752));
    this.sMR = this.poi.getTextSize();
    this.poi.clearAnimation();
    ab.d("MicroMsg.VoiceTipInfoView", "mTipSize %f", new Object[] { Float.valueOf(this.sMR) });
    AppMethodBeat.o(26228);
  }

  public void setErr(int paramInt)
  {
    AppMethodBeat.i(26240);
    this.sMP.setText(paramInt);
    AppMethodBeat.o(26240);
  }

  public void setErr(String paramString)
  {
    AppMethodBeat.i(26239);
    this.sMP.setText(paramString);
    AppMethodBeat.o(26239);
  }

  public void setTipText(int paramInt)
  {
    AppMethodBeat.i(26232);
    this.poi.setText(paramInt);
    this.poi.setVisibility(0);
    AppMethodBeat.o(26232);
  }

  public void setTipText(String paramString)
  {
    AppMethodBeat.i(26231);
    this.poi.setText(paramString);
    this.poi.setVisibility(0);
    AppMethodBeat.o(26231);
  }

  public void setTitleText(int paramInt)
  {
    AppMethodBeat.i(26234);
    this.iDT.setText(paramInt);
    this.iDT.setVisibility(0);
    AppMethodBeat.o(26234);
  }

  public void setTitleText(String paramString)
  {
    AppMethodBeat.i(26233);
    this.iDT.setText(paramString);
    this.iDT.setVisibility(0);
    AppMethodBeat.o(26233);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView
 * JD-Core Version:    0.6.2
 */