package com.tencent.mm.plugin.downloader_app.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface a
{
  public static enum a
  {
    static
    {
      AppMethodBeat.i(35545);
      kNZ = new a("OK", 0);
      kOa = new a("FAIL", 1);
      kOb = new a("WAIT_FOR_WIFI", 2);
      kOc = new a("CANCEL", 3);
      kOd = new a[] { kNZ, kOa, kOb, kOc };
      AppMethodBeat.o(35545);
    }
  }

  public static abstract interface b
  {
    public abstract void a(a.a parama, long paramLong);
  }

  public static abstract interface c
  {
    public abstract void biB();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.a.a
 * JD-Core Version:    0.6.2
 */