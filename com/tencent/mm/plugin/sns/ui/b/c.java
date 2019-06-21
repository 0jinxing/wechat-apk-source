package com.tencent.mm.plugin.sns.ui.b;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public ValueAnimator nVD;
  private Context rFO;
  public int rFP;
  public int rFQ;
  public int rFR;
  public int rFS;
  public a rFT;
  View view;

  public c(Activity paramActivity, View paramView)
  {
    AppMethodBeat.i(40009);
    this.rFO = paramActivity;
    this.view = paramView;
    this.nVD = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.nVD.addUpdateListener(new c.1(this));
    this.nVD.addListener(new c.2(this));
    this.nVD.setDuration(400L);
    AppMethodBeat.o(40009);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.c
 * JD-Core Version:    0.6.2
 */