package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ap;

public class MMProgressBar extends LinearLayout
{
  private int max;
  private ap oXA;
  private TextView qyR;
  private int ywb;
  private int ywc;
  private TextView ywd;
  private MMProgressBar.a ywe;

  public MMProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106705);
    this.max = 100;
    this.ywb = 0;
    this.ywc = 0;
    this.oXA = new ap(new MMProgressBar.1(this), false);
    inflate(getContext(), 2130970212, this);
    this.ywd = ((TextView)findViewById(2131826084));
    this.qyR = ((TextView)findViewById(2131826083));
    AppMethodBeat.o(106705);
  }

  private int getProgressLength()
  {
    AppMethodBeat.i(106709);
    int i = getWidth() * this.ywb / this.max;
    int j = i;
    if (i < BackwardSupportUtil.b.b(getContext(), 20.0F))
      j = BackwardSupportUtil.b.b(getContext(), 20.0F);
    AppMethodBeat.o(106709);
    return j;
  }

  public int getMax()
  {
    return this.max;
  }

  public int getProgress()
  {
    return this.ywc;
  }

  public void setAutoProgress(boolean paramBoolean)
  {
    AppMethodBeat.i(106707);
    if (paramBoolean)
    {
      this.oXA.ae(40L, 40L);
      AppMethodBeat.o(106707);
    }
    while (true)
    {
      return;
      this.oXA.stopTimer();
      AppMethodBeat.o(106707);
    }
  }

  public void setMax(int paramInt)
  {
    this.max = paramInt;
  }

  public void setOnProgressChangedListener(MMProgressBar.a parama)
  {
    this.ywe = parama;
  }

  public void setProgress(int paramInt)
  {
    AppMethodBeat.i(106706);
    int i = paramInt;
    if (paramInt > this.max)
      i = this.max;
    this.ywc = i;
    if (this.oXA.doT())
      setAutoProgress(true);
    AppMethodBeat.o(106706);
  }

  public void setTips(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(106708);
    this.qyR.setText(paramCharSequence);
    AppMethodBeat.o(106708);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMProgressBar
 * JD-Core Version:    0.6.2
 */