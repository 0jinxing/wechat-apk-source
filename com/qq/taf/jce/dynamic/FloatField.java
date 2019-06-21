package com.qq.taf.jce.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class FloatField extends NumberField
{
  private float data;

  FloatField(float paramFloat, int paramInt)
  {
    super(paramInt);
    this.data = paramFloat;
  }

  public float get()
  {
    return this.data;
  }

  public Number getNumber()
  {
    AppMethodBeat.i(117018);
    float f = this.data;
    AppMethodBeat.o(117018);
    return Float.valueOf(f);
  }

  public void set(float paramFloat)
  {
    this.data = paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.FloatField
 * JD-Core Version:    0.6.2
 */