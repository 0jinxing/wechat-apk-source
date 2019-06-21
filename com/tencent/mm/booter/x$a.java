package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public final class x$a
{
  public int csm;
  public String ede;
  public int edf;
  public int edg;
  public long edh;
  public int edi;
  public int edj = 0;
  int edk = 0;
  int edl = 0;
  public long time;
  public int type;

  public x$a(x paramx)
  {
  }

  public final String toString()
  {
    AppMethodBeat.i(15878);
    String str = String.format(Locale.US, "%d#%d#%d#%d#%d#%d#%d#%s#%d#%d#%d|", new Object[] { Integer.valueOf(this.type), Long.valueOf(this.time), Integer.valueOf(this.edf), Integer.valueOf(this.csm), Integer.valueOf(this.edg), Long.valueOf(this.edh), Integer.valueOf(this.edi), this.ede, Integer.valueOf(this.edj), Integer.valueOf(this.edk), Integer.valueOf(this.edl) });
    AppMethodBeat.o(15878);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.x.a
 * JD-Core Version:    0.6.2
 */