package com.qq.taf.jce.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class DoubleField extends NumberField
{
  private double data;

  DoubleField(double paramDouble, int paramInt)
  {
    super(paramInt);
    this.data = paramDouble;
  }

  public double get()
  {
    return this.data;
  }

  public Number getNumber()
  {
    AppMethodBeat.i(117016);
    double d = this.data;
    AppMethodBeat.o(117016);
    return Double.valueOf(d);
  }

  public void set(double paramDouble)
  {
    this.data = paramDouble;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.DoubleField
 * JD-Core Version:    0.6.2
 */