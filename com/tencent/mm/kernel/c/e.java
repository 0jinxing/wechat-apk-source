package com.tencent.mm.kernel.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e<T extends a>
  implements b, c<T>
{
  private T eMH;

  public e(T paramT)
  {
    this.eMH = paramT;
  }

  public final void SH()
  {
    AppMethodBeat.i(51937);
    if ((this.eMH instanceof b))
      ((b)this.eMH).SH();
    AppMethodBeat.o(51937);
  }

  public final void SI()
  {
    AppMethodBeat.i(51938);
    if ((this.eMH instanceof b))
      ((b)this.eMH).SI();
    AppMethodBeat.o(51938);
  }

  public final T SJ()
  {
    return this.eMH;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.c.e
 * JD-Core Version:    0.6.2
 */