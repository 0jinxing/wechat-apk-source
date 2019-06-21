package com.google.android.exoplayer2.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.f.a.c;
import com.google.android.exoplayer2.f.g.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$1
  implements g
{
  public final boolean g(Format paramFormat)
  {
    AppMethodBeat.i(95654);
    paramFormat = paramFormat.aOd;
    boolean bool;
    if (("text/vtt".equals(paramFormat)) || ("text/x-ssa".equals(paramFormat)) || ("application/ttml+xml".equals(paramFormat)) || ("application/x-mp4-vtt".equals(paramFormat)) || ("application/x-subrip".equals(paramFormat)) || ("application/x-quicktime-tx3g".equals(paramFormat)) || ("application/cea-608".equals(paramFormat)) || ("application/x-mp4-cea-608".equals(paramFormat)) || ("application/cea-708".equals(paramFormat)) || ("application/dvbsubs".equals(paramFormat)))
    {
      bool = true;
      AppMethodBeat.o(95654);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95654);
    }
  }

  public final e k(Format paramFormat)
  {
    AppMethodBeat.i(95655);
    String str = paramFormat.aOd;
    int i = -1;
    switch (str.hashCode())
    {
    default:
    case -1004728940:
    case 822864842:
    case -1026075066:
    case 1693976202:
    case 1668750253:
    case 691401887:
    case 1566015601:
    case 930165504:
    case 1566016562:
    case -1351681404:
    }
    while (true)
      switch (i)
      {
      default:
        paramFormat = new IllegalArgumentException("Attempted to create decoder for unsupported format");
        AppMethodBeat.o(95655);
        throw paramFormat;
        if (str.equals("text/vtt"))
        {
          i = 0;
          continue;
          if (str.equals("text/x-ssa"))
          {
            i = 1;
            continue;
            if (str.equals("application/x-mp4-vtt"))
            {
              i = 2;
              continue;
              if (str.equals("application/ttml+xml"))
              {
                i = 3;
                continue;
                if (str.equals("application/x-subrip"))
                {
                  i = 4;
                  continue;
                  if (str.equals("application/x-quicktime-tx3g"))
                  {
                    i = 5;
                    continue;
                    if (str.equals("application/cea-608"))
                    {
                      i = 6;
                      continue;
                      if (str.equals("application/x-mp4-cea-608"))
                      {
                        i = 7;
                        continue;
                        if (str.equals("application/cea-708"))
                        {
                          i = 8;
                          continue;
                          if (str.equals("application/dvbsubs"))
                            i = 9;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
    paramFormat = new com.google.android.exoplayer2.f.g.g();
    AppMethodBeat.o(95655);
    while (true)
    {
      return paramFormat;
      paramFormat = new com.google.android.exoplayer2.f.c.a(paramFormat.aOf);
      AppMethodBeat.o(95655);
      continue;
      paramFormat = new b();
      AppMethodBeat.o(95655);
      continue;
      paramFormat = new com.google.android.exoplayer2.f.e.a();
      AppMethodBeat.o(95655);
      continue;
      paramFormat = new com.google.android.exoplayer2.f.d.a();
      AppMethodBeat.o(95655);
      continue;
      paramFormat = new com.google.android.exoplayer2.f.f.a(paramFormat.aOf);
      AppMethodBeat.o(95655);
      continue;
      paramFormat = new com.google.android.exoplayer2.f.a.a(paramFormat.aOd, paramFormat.aOu);
      AppMethodBeat.o(95655);
      continue;
      paramFormat = new c(paramFormat.aOu);
      AppMethodBeat.o(95655);
      continue;
      paramFormat = new com.google.android.exoplayer2.f.b.a(paramFormat.aOf);
      AppMethodBeat.o(95655);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.1
 * JD-Core Version:    0.6.2
 */