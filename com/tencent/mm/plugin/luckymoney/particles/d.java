package com.tencent.mm.plugin.luckymoney.particles;

public final class d
{
  public final int oao;
  public final int oap;
  public final int oaq;
  public final int oar;

  public d(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, paramInt1, paramInt2);
  }

  private d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.oao = paramInt1;
    this.oap = paramInt2;
    this.oaq = paramInt3;
    this.oar = paramInt4;
  }

  protected final float aI(float paramFloat)
  {
    return this.oao + (this.oaq - this.oao) * paramFloat;
  }

  protected final float aJ(float paramFloat)
  {
    return this.oap + (this.oar - this.oap) * paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.d
 * JD-Core Version:    0.6.2
 */