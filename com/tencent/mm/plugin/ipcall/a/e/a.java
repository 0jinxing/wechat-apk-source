package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
{
  public boolean cFy = false;

  protected void bHT()
  {
  }

  public final void finish()
  {
    AppMethodBeat.i(21882);
    if (this.cFy)
    {
      bHT();
      this.cFy = false;
    }
    AppMethodBeat.o(21882);
  }

  public void reset()
  {
  }

  public void start()
  {
    AppMethodBeat.i(21881);
    reset();
    this.cFy = true;
    AppMethodBeat.o(21881);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.e.a
 * JD-Core Version:    0.6.2
 */