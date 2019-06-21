package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class MemRandomValue
{
  public static final MemRandomValue EMPTY;
  public int curValue;
  public int lastValue;

  static
  {
    AppMethodBeat.i(83507);
    EMPTY = new MemRandomValue();
    AppMethodBeat.o(83507);
  }

  public MemRandomValue()
  {
    this(-1, -1);
  }

  public MemRandomValue(int paramInt1, int paramInt2)
  {
    this.lastValue = paramInt1;
    this.curValue = paramInt2;
  }

  public boolean isAssigned()
  {
    if (this.lastValue >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.MemRandomValue
 * JD-Core Version:    0.6.2
 */