package com.tencent.mm.plugin.luckymoney.scaledLayout;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c extends ViewPagerLayoutManager
{
  private float aJg;
  private int oaY;
  private float oaZ;
  private float oba;
  private float obb;

  private c(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, float paramFloat4, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    super(paramInt2, paramBoolean);
    AppMethodBeat.i(42481);
    T(null);
    if (this.obw != paramInt4)
    {
      this.obw = paramInt4;
      removeAllViews();
    }
    T(null);
    if (this.obu != paramInt3)
    {
      this.obu = paramInt3;
      removeAllViews();
    }
    this.oaY = paramInt1;
    this.aJg = paramFloat1;
    this.oaZ = paramFloat4;
    this.oba = paramFloat2;
    this.obb = paramFloat3;
    AppMethodBeat.o(42481);
  }

  public c(Context paramContext)
  {
    this(new c.a(paramContext));
    AppMethodBeat.i(42479);
    AppMethodBeat.o(42479);
  }

  private c(c.a parama)
  {
    this(c.a.b(parama), c.a.c(parama), c.a.d(parama), c.a.e(parama), c.a.f(parama), c.a.g(parama), c.a.h(parama), c.a.i(parama), c.a.j(parama));
    AppMethodBeat.i(42480);
    AppMethodBeat.o(42480);
  }

  public final void bLS()
  {
    AppMethodBeat.i(42482);
    T(null);
    if (this.aJg == 0.8F)
      AppMethodBeat.o(42482);
    while (true)
    {
      return;
      this.aJg = 0.8F;
      removeAllViews();
      AppMethodBeat.o(42482);
    }
  }

  protected final float bLT()
  {
    return this.oaY + this.obi;
  }

  protected final float bLU()
  {
    if (this.oaZ == 0.0F);
    for (float f = 3.4028235E+38F; ; f = 1.0F / this.oaZ)
      return f;
  }

  protected final void m(View paramView, float paramFloat)
  {
    AppMethodBeat.i(42483);
    float f1 = Math.abs(this.obl + paramFloat - this.obl);
    float f2 = f1;
    if (f1 - this.obi > 0.0F)
      f2 = this.obi;
    f2 = 1.0F - f2 / this.obi * (1.0F - this.aJg);
    paramView.setScaleX(f2);
    paramView.setScaleY(f2);
    f2 = Math.abs(paramFloat);
    paramFloat = (this.obb - this.oba) / this.obq * f2 + this.oba;
    if (f2 >= this.obq)
      paramFloat = this.obb;
    paramView.setAlpha(paramFloat);
    AppMethodBeat.o(42483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.scaledLayout.c
 * JD-Core Version:    0.6.2
 */