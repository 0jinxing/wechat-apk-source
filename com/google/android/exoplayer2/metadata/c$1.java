package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements c
{
  public final boolean g(Format paramFormat)
  {
    AppMethodBeat.i(95347);
    paramFormat = paramFormat.aOd;
    boolean bool;
    if (("application/id3".equals(paramFormat)) || ("application/x-emsg".equals(paramFormat)) || ("application/x-scte35".equals(paramFormat)))
    {
      bool = true;
      AppMethodBeat.o(95347);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95347);
    }
  }

  public final a h(Format paramFormat)
  {
    AppMethodBeat.i(95348);
    paramFormat = paramFormat.aOd;
    int i = -1;
    switch (paramFormat.hashCode())
    {
    default:
    case -1248341703:
    case 1154383568:
    case 1652648887:
    }
    while (true)
      switch (i)
      {
      default:
        paramFormat = new IllegalArgumentException("Attempted to create decoder for unsupported format");
        AppMethodBeat.o(95348);
        throw paramFormat;
        if (paramFormat.equals("application/id3"))
        {
          i = 0;
          continue;
          if (paramFormat.equals("application/x-emsg"))
          {
            i = 1;
            continue;
            if (paramFormat.equals("application/x-scte35"))
              i = 2;
          }
        }
        break;
      case 0:
      case 1:
      case 2:
      }
    paramFormat = new com.google.android.exoplayer2.metadata.id3.a();
    AppMethodBeat.o(95348);
    while (true)
    {
      return paramFormat;
      paramFormat = new com.google.android.exoplayer2.metadata.emsg.a();
      AppMethodBeat.o(95348);
      continue;
      paramFormat = new com.google.android.exoplayer2.metadata.scte35.a();
      AppMethodBeat.o(95348);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.c.1
 * JD-Core Version:    0.6.2
 */