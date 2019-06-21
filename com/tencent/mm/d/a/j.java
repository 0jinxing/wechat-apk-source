package com.tencent.mm.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class j extends w
{
  private static final ThreadLocal<j> chH;
  private final a chF;
  private boolean chG;

  static
  {
    AppMethodBeat.i(113827);
    chH = new ThreadLocal();
    AppMethodBeat.o(113827);
  }

  private j(a parama)
  {
    this.chF = parama;
    this.chG = true;
  }

  public static j a(a parama)
  {
    AppMethodBeat.i(113822);
    if (chH.get() != null)
    {
      parama = new RuntimeException("Only one Looper may be created per thread");
      AppMethodBeat.o(113822);
      throw parama;
    }
    parama = new j(parama);
    chH.set(parama);
    AppMethodBeat.o(113822);
    return parama;
  }

  protected final void CA()
  {
    AppMethodBeat.i(113826);
    if (this.chF != null)
      this.chF.wakeUpUVLoop();
    AppMethodBeat.o(113826);
  }

  protected final boolean Cx()
  {
    AppMethodBeat.i(113823);
    boolean bool;
    if ((!this.chG) && (super.Cx()))
    {
      bool = true;
      AppMethodBeat.o(113823);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(113823);
    }
  }

  protected final void Cy()
  {
    AppMethodBeat.i(113824);
    super.Cy();
    this.chG = this.chF.Cw();
    AppMethodBeat.o(113824);
  }

  protected final void Cz()
  {
    AppMethodBeat.i(113825);
    super.Cz();
    if (this.chF != null)
      this.chF.closeUVLoop();
    AppMethodBeat.o(113825);
  }

  static abstract interface a
  {
    public abstract boolean Cw();

    public abstract void closeUVLoop();

    public abstract void wakeUpUVLoop();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.j
 * JD-Core Version:    0.6.2
 */