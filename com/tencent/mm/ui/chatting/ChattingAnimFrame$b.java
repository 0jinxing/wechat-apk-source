package com.tencent.mm.ui.chatting;

import android.graphics.Matrix;
import android.view.View.OnLayoutChangeListener;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.c.a.a;
import com.tencent.mm.ui.c.a.b;

final class ChattingAnimFrame$b extends Animation
{
  private int mSize;
  private float yIa;
  private float yIb;
  private float yIc;
  private float yId;
  private float yIe;
  private float yIf;
  private float yIg;
  private float yIh;
  private float yIi;
  private float yIj;
  private int yIk;
  private boolean yIl;
  private View.OnLayoutChangeListener yiU;

  public ChattingAnimFrame$b(ChattingAnimFrame paramChattingAnimFrame, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(30507);
    this.yIk = 0;
    this.mSize = 0;
    this.yIl = false;
    this.yiU = new ChattingAnimFrame.b.1(this);
    this.yIk = paramInt1;
    this.mSize = paramInt2;
    this.yIl = false;
    AppMethodBeat.o(30507);
  }

  public ChattingAnimFrame$b(ChattingAnimFrame paramChattingAnimFrame, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(30508);
    this.yIk = 0;
    this.mSize = 0;
    this.yIl = false;
    this.yiU = new ChattingAnimFrame.b.1(this);
    this.yIk = paramInt1;
    this.mSize = paramInt2;
    this.yIl = paramBoolean;
    AppMethodBeat.o(30508);
  }

  public final void aE()
  {
    AppMethodBeat.i(30512);
    this.yIe = (this.yIa * ChattingAnimFrame.a(this.yHZ));
    this.yIf = (this.yIb * ChattingAnimFrame.a(this.yHZ));
    if (this.yIk == 2)
    {
      this.yIg = (this.yIc * ChattingAnimFrame.b(this.yHZ));
      this.yIh = (this.yId * ChattingAnimFrame.b(this.yHZ));
      AppMethodBeat.o(30512);
    }
    while (true)
    {
      return;
      if (this.yIk == 3)
      {
        this.yIg = (this.yIc * ChattingAnimFrame.c(this.yHZ));
        this.yIh = (this.yId * ChattingAnimFrame.c(this.yHZ));
        if (ChattingAnimFrame.d(this.yHZ))
        {
          this.yIg = (this.yIc * ChattingAnimFrame.c(this.yHZ) - ChattingAnimFrame.e(this.yHZ));
          this.yIh = (this.yId * ChattingAnimFrame.c(this.yHZ) - ChattingAnimFrame.e(this.yHZ));
        }
        if (this.yIh < 0.0F)
        {
          this.yIh = 0.0F;
          AppMethodBeat.o(30512);
        }
      }
      else
      {
        this.yIg = (this.yIc * ChattingAnimFrame.c(this.yHZ));
        this.yIh = (this.yId * ChattingAnimFrame.c(this.yHZ));
        AppMethodBeat.o(30512);
      }
    }
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    AppMethodBeat.i(30510);
    float f1 = this.yIe;
    float f2 = this.yIg;
    if (this.yIe != this.yIf)
      f1 = this.yIe + (this.yIf - this.yIe) * paramFloat;
    if (this.yIg != this.yIh)
    {
      float f3 = this.yIg + (this.yIh - this.yIg) * paramFloat;
      f2 = f3;
      if (this.yIk == 2)
        f2 = f3 - this.mSize;
    }
    paramTransformation.getMatrix().setTranslate(f1, f2);
    if ((this.yIi != this.yIj) && (3 == this.yIk))
    {
      paramFloat = this.yIi + (this.yIj - this.yIi) * paramFloat;
      paramTransformation.getMatrix().postScale(paramFloat, paramFloat);
    }
    AppMethodBeat.o(30510);
  }

  protected final void finalize()
  {
    AppMethodBeat.i(30511);
    super.finalize();
    ab.i("MicroMsg.ChattingAnimFrame", "finalize!");
    this.yHZ.removeOnLayoutChangeListener(this.yiU);
    AppMethodBeat.o(30511);
  }

  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(30509);
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    switch (this.yIk)
    {
    default:
      this.yIa = ChattingAnimFrame.Y(0.1F, 0.9F);
      this.yIb = ChattingAnimFrame.Y(this.yIa - 0.5F, this.yIa + 0.5F);
      this.yIc = -0.2F;
      this.yId = 1.2F;
      setInterpolator(new LinearInterpolator());
    case 1:
    case 3:
    case 2:
    case 999:
    }
    while (true)
    {
      if ((this.yIk != 0) && (this.yIk != 1))
        this.yHZ.addOnLayoutChangeListener(this.yiU);
      aE();
      AppMethodBeat.o(30509);
      return;
      this.yIa = ChattingAnimFrame.Y(0.1F, 0.9F);
      this.yIb = ChattingAnimFrame.Y(this.yIa - 0.25F, this.yIa + 0.25F);
      this.yIc = 1.5F;
      this.yId = -0.2F;
      setInterpolator(new LinearInterpolator());
      continue;
      this.yIa = 0.0F;
      this.yIb = 0.0F;
      this.yIc = 1.5F;
      if (this.yIl);
      for (this.yId = ChattingAnimFrame.Y(0.4F, 0.55F); ; this.yId = ChattingAnimFrame.Y(0.55F, 0.85F))
      {
        setInterpolator(new b());
        break;
      }
      this.yIa = 0.0F;
      this.yIb = 0.0F;
      this.yIc = 0.0F;
      this.yId = 1.0F;
      setInterpolator(new a());
      continue;
      this.yIa = ChattingAnimFrame.Y(0.1F, 0.9F);
      this.yIb = ChattingAnimFrame.Y(this.yIa - 0.5F, this.yIa + 0.5F);
      this.yIc = 0.0F;
      this.yId = 0.0F;
      this.yIi = 0.8F;
      this.yIj = 1.1F;
      setInterpolator(new LinearInterpolator());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingAnimFrame.b
 * JD-Core Version:    0.6.2
 */