package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends BaseFilter
{
  public a(int paramInt)
  {
    super(paramInt);
  }

  public final void setAdjustParam(float paramFloat)
  {
    AppMethodBeat.i(86280);
    addParam(new m.f("filterAdjustParam", paramFloat));
    AppMethodBeat.o(86280);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a
 * JD-Core Version:    0.6.2
 */