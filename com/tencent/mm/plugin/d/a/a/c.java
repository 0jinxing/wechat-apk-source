package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class c
{
  public String cbq = "";
  String jEJ = null;
  public e jEK = null;
  public double jEL = 0.0D;

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(18327);
    boolean bool;
    if ((this.jEK == null) || (paramObject == null))
    {
      bool = false;
      AppMethodBeat.o(18327);
    }
    while (true)
    {
      return bool;
      if (this == paramObject)
      {
        bool = true;
        AppMethodBeat.o(18327);
      }
      else
      {
        bool = Arrays.equals(((c)paramObject).jEK.jEO.jFp, this.jEK.jEO.jFp);
        AppMethodBeat.o(18327);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(18326);
    int i;
    if (this.jEK == null)
    {
      i = 0;
      AppMethodBeat.o(18326);
    }
    while (true)
    {
      return i;
      i = Arrays.hashCode(this.jEK.jEO.jFp);
      AppMethodBeat.o(18326);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.c
 * JD-Core Version:    0.6.2
 */