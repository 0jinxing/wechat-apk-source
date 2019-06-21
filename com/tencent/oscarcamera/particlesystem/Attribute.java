package com.tencent.oscarcamera.particlesystem;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Attribute
{
  public String mName;
  public Value mValue;
  public int mVarIndex;

  public long expression()
  {
    AppMethodBeat.i(81509);
    long l;
    if (this.mValue != null)
    {
      l = this.mValue.expression();
      AppMethodBeat.o(81509);
    }
    while (true)
    {
      return l;
      l = -1L;
      AppMethodBeat.o(81509);
    }
  }

  public double value()
  {
    AppMethodBeat.i(81508);
    double d;
    if (this.mValue != null)
    {
      d = this.mValue.value();
      AppMethodBeat.o(81508);
    }
    while (true)
    {
      return d;
      d = 0.0D;
      AppMethodBeat.o(81508);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.oscarcamera.particlesystem.Attribute
 * JD-Core Version:    0.6.2
 */