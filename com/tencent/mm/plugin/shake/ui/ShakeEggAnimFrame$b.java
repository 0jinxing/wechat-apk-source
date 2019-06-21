package com.tencent.mm.plugin.shake.ui;

import android.graphics.Matrix;
import android.view.animation.Transformation;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeEggAnimFrame$b extends ShakeEggAnimFrame.a
{
  private int hkc;
  private int hkd;
  private float qup;
  private float quq;
  private float qur;
  private float qus;
  private float qut;
  private float quu;
  private float quv;
  private float quw;
  private float qux;
  private float quy;

  public ShakeEggAnimFrame$b(ShakeEggAnimFrame paramShakeEggAnimFrame, int paramInt1, int paramInt2)
  {
    super(paramShakeEggAnimFrame);
    AppMethodBeat.i(24711);
    this.qut = 0.01F;
    this.quu = 0.02F;
    this.hkc = paramInt1;
    this.hkd = paramInt2;
    this.qup = ShakeEggAnimFrame.Y(0.1F, 0.9F);
    this.quq = this.qup;
    this.qus = ShakeEggAnimFrame.Y(-0.3F, -0.1F);
    restart();
    AppMethodBeat.o(24711);
  }

  private void aE()
  {
    this.quv = (this.qup * this.hkc);
    this.quw = (this.quq * this.hkc);
    this.qux = (this.qur * this.hkd);
    this.quy = (this.qus * this.hkd);
  }

  private void restart()
  {
    AppMethodBeat.i(24713);
    if (this.qus > 0.0F)
      this.quu += this.qut;
    this.qur = this.qus;
    this.qus += this.quu;
    if (this.qur > 1.1F)
      ckA();
    aE();
    AppMethodBeat.o(24713);
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    AppMethodBeat.i(24712);
    float f1 = this.quv;
    float f2 = this.qux;
    if (this.quv != this.quw)
      f1 = this.quv + (this.quw - this.quv) * paramFloat;
    if (this.qux != this.quy)
      f2 = this.qux + (this.quy - this.qux) * paramFloat;
    paramTransformation.getMatrix().setTranslate(f1, f2);
    if (paramFloat == 1.0F)
      restart();
    AppMethodBeat.o(24712);
  }

  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(24714);
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    setRepeatCount(-1);
    setDuration(this.duration);
    AppMethodBeat.o(24714);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame.b
 * JD-Core Version:    0.6.2
 */