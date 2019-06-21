package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class az
{
  protected float K;
  protected int L;
  protected int M;
  protected float N;
  protected boolean O;
  protected boolean P;
  protected int Q;

  public az()
  {
    AppMethodBeat.i(100726);
    this.K = 1.0F;
    this.L = Color.argb(17, 0, 163, 255);
    this.M = Color.argb(255, 0, 163, 255);
    this.N = 0.0F;
    this.O = true;
    this.P = false;
    this.Q = di.c;
    AppMethodBeat.o(100726);
  }

  public float D()
  {
    return this.N;
  }

  public int E()
  {
    return this.Q;
  }

  public void a(boolean paramBoolean)
  {
    this.O = paramBoolean;
  }

  public void a_(int paramInt)
  {
    this.Q = paramInt;
    this.P = true;
  }

  public void c(float paramFloat)
  {
    this.N = paramFloat;
    this.P = true;
  }

  public void c(int paramInt)
  {
    this.M = paramInt;
    this.P = true;
  }

  public void d(float paramFloat)
  {
    this.K = paramFloat;
    this.P = true;
  }

  public void d(int paramInt)
  {
    this.L = paramInt;
    this.P = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.az
 * JD-Core Version:    0.6.2
 */