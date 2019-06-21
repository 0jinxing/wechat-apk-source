package com.tencent.mm.view.b;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.b.b;

final class a$a extends b
{
  private float Acb;
  private float Acc;
  boolean Acd;
  a.b Ace;
  float ccw;
  float ccx;
  float mScale;
  float nR;
  private ValueAnimator rD;

  public a$a(a parama, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean)
  {
    this.mScale = paramFloat1;
    this.Acb = paramFloat2;
    this.Acc = paramFloat3;
    this.ccw = paramFloat4;
    this.ccx = paramFloat5;
    this.nR = paramFloat6;
    this.Acd = paramBoolean;
  }

  public final void play()
  {
    AppMethodBeat.i(116400);
    this.rD = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F, 166.0F }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, this.Acb }), PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, this.Acc }), PropertyValuesHolder.ofFloat("rotation", new float[] { 0.0F, this.nR }) });
    this.rD.addUpdateListener(new a.a.1(this));
    this.rD.addListener(new a.a.2(this));
    this.rD.setInterpolator(new LinearInterpolator());
    this.rD.setDuration(166L);
    this.rD.start();
    AppMethodBeat.o(116400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.b.a.a
 * JD-Core Version:    0.6.2
 */