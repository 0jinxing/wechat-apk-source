package com.tencent.mm.plugin.fts.ui.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.MMActivity;

public final class c
{
  MMActivity crP;
  public c.a mMG;
  public boolean mMH;
  public FTSVoiceInputLayoutImpl mMI;
  public TextView mMJ;
  public ImageView mMK;
  long mML;
  long mMM;
  long mMN;
  private FTSVoiceInputLayoutImpl.a mMO;
  Toast mMP;
  private VoiceInputLayout.a mMQ;

  public c(Context paramContext, FTSVoiceInputLayoutImpl paramFTSVoiceInputLayoutImpl, TextView paramTextView, ImageView paramImageView)
  {
    AppMethodBeat.i(62178);
    this.mMH = false;
    this.mMO = new c.1(this);
    this.mMQ = new c.2(this);
    this.crP = ((MMActivity)paramContext);
    this.mMI = paramFTSVoiceInputLayoutImpl;
    this.mMJ = paramTextView;
    this.mMK = paramImageView;
    this.mMI.setFTSVoiceDetectListener(this.mMO);
    this.mMI.setLongClickLisnter(this.mMQ);
    paramContext = ObjectAnimator.ofFloat(this.mMK, "rotation", new float[] { 0.0F, 360.0F });
    paramContext.setRepeatCount(-1);
    paramContext.setRepeatMode(1);
    paramContext.setDuration(1000L);
    paramContext.start();
    AppMethodBeat.o(62178);
  }

  public final void bBy()
  {
    AppMethodBeat.i(62179);
    this.mMI.setVisibility(8);
    AppMethodBeat.o(62179);
  }

  public final void show()
  {
    AppMethodBeat.i(62180);
    if (!aa.dor().equals("zh_CN"))
      AppMethodBeat.o(62180);
    while (true)
    {
      return;
      this.mMI.setAlpha(0.0F);
      this.mMI.animate().alpha(1.0F).setDuration(500L).start();
      this.mMI.setVisibility(0);
      this.mMK.setVisibility(8);
      this.mMJ.setText("");
      AppMethodBeat.o(62180);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.c
 * JD-Core Version:    0.6.2
 */