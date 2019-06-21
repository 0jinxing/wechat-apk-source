package com.tencent.mm.b;

import android.animation.Animator.AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.e.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends b
{
  private int ccc;
  c ccd;
  public float cce;
  public float ccf;
  public float ccg;
  public Rect cch;
  public RectF cci;
  Matrix ccj;
  public long cck;
  private ValueAnimator rD;
  public Animator.AnimatorListener uw;

  public a(c paramc)
  {
    AppMethodBeat.i(116138);
    this.ccc = 200;
    this.cck = 0L;
    this.ccd = paramc;
    this.ccj = new Matrix();
    this.cci = new RectF();
    AppMethodBeat.o(116138);
  }

  public final void cancel()
  {
    AppMethodBeat.i(116140);
    ab.d("MicroMsg.CropActionUpAnim", "[cancel]");
    this.aFV = false;
    this.cco = true;
    if (this.rD != null)
      this.rD.cancel();
    AppMethodBeat.o(116140);
  }

  public final void play()
  {
    AppMethodBeat.i(116139);
    ab.i("MicroMsg.CropActionUpAnim", "[play]");
    if (!this.cco)
      AppMethodBeat.o(116139);
    while (true)
    {
      return;
      this.aFV = false;
      this.cco = false;
      this.rD = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("scale", new float[] { 1.0F, this.cce }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, this.ccf }), PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, this.ccg }), PropertyValuesHolder.ofFloat("background_alpha", new float[] { 0.0F, 255.0F }) });
      this.rD.addUpdateListener(new a.1(this));
      this.rD.addListener(new a.2(this));
      this.rD.setInterpolator(new LinearInterpolator());
      this.rD.setDuration(this.ccc);
      this.rD.setStartDelay(this.cck);
      this.rD.start();
      AppMethodBeat.o(116139);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.a
 * JD-Core Version:    0.6.2
 */