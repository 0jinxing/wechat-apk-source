package com.tencent.oscarcamera.particlesystem;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Value
{
  private static final String TAG;
  private static final int TYPE_CONST = 0;
  private static final int TYPE_EXPRESSION = 1;
  private double mConstVal;
  private long mNativeExpression;
  private int mType;

  static
  {
    AppMethodBeat.i(81562);
    TAG = Value.class.getSimpleName();
    AppMethodBeat.o(81562);
  }

  public Value(Object paramObject)
  {
    AppMethodBeat.i(81561);
    this.mType = 0;
    this.mConstVal = 0.0D;
    this.mNativeExpression = -1L;
    if ((paramObject instanceof Number))
    {
      this.mType = 0;
      this.mConstVal = ((Number)paramObject).doubleValue();
      this.mNativeExpression = -1L;
      AppMethodBeat.o(81561);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof String))
      {
        this.mType = 1;
        this.mNativeExpression = ParticleSystem.compile((String)paramObject);
      }
      AppMethodBeat.o(81561);
    }
  }

  public long expression()
  {
    return this.mNativeExpression;
  }

  public double value()
  {
    double d1 = 0.0D;
    double d2;
    if (this.mType == 0)
      d2 = this.mConstVal;
    while (true)
    {
      return d2;
      d2 = d1;
      if (this.mType == 1)
        d2 = d1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.oscarcamera.particlesystem.Value
 * JD-Core Version:    0.6.2
 */