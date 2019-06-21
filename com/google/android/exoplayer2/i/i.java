package com.google.android.exoplayer2.i;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i
{
  public static boolean aH(String paramString)
  {
    AppMethodBeat.i(95880);
    boolean bool = "audio".equals(aM(paramString));
    AppMethodBeat.o(95880);
    return bool;
  }

  public static boolean aI(String paramString)
  {
    AppMethodBeat.i(95881);
    boolean bool = "video".equals(aM(paramString));
    AppMethodBeat.o(95881);
    return bool;
  }

  public static boolean aJ(String paramString)
  {
    AppMethodBeat.i(95882);
    boolean bool = "text".equals(aM(paramString));
    AppMethodBeat.o(95882);
    return bool;
  }

  public static String aK(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(95883);
    if (paramString == null)
    {
      AppMethodBeat.o(95883);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = paramString.trim();
      if ((paramString.startsWith("avc1")) || (paramString.startsWith("avc3")))
      {
        paramString = "video/avc";
        AppMethodBeat.o(95883);
      }
      else if ((paramString.startsWith("hev1")) || (paramString.startsWith("hvc1")))
      {
        paramString = "video/hevc";
        AppMethodBeat.o(95883);
      }
      else if ((paramString.startsWith("vp9")) || (paramString.startsWith("vp09")))
      {
        paramString = "video/x-vnd.on2.vp9";
        AppMethodBeat.o(95883);
      }
      else if ((paramString.startsWith("vp8")) || (paramString.startsWith("vp08")))
      {
        paramString = "video/x-vnd.on2.vp8";
        AppMethodBeat.o(95883);
      }
      else if (paramString.startsWith("mp4a"))
      {
        paramString = "audio/mp4a-latm";
        AppMethodBeat.o(95883);
      }
      else if ((paramString.startsWith("ac-3")) || (paramString.startsWith("dac3")))
      {
        paramString = "audio/ac3";
        AppMethodBeat.o(95883);
      }
      else if ((paramString.startsWith("ec-3")) || (paramString.startsWith("dec3")))
      {
        paramString = "audio/eac3";
        AppMethodBeat.o(95883);
      }
      else if ((paramString.startsWith("dtsc")) || (paramString.startsWith("dtse")))
      {
        paramString = "audio/vnd.dts";
        AppMethodBeat.o(95883);
      }
      else if ((paramString.startsWith("dtsh")) || (paramString.startsWith("dtsl")))
      {
        paramString = "audio/vnd.dts.hd";
        AppMethodBeat.o(95883);
      }
      else if (paramString.startsWith("opus"))
      {
        paramString = "audio/opus";
        AppMethodBeat.o(95883);
      }
      else if (paramString.startsWith("vorbis"))
      {
        paramString = "audio/vorbis";
        AppMethodBeat.o(95883);
      }
      else
      {
        AppMethodBeat.o(95883);
        paramString = localObject;
      }
    }
  }

  public static int aL(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(95884);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(95884);
    while (true)
    {
      return i;
      if (aH(paramString))
      {
        i = 1;
        AppMethodBeat.o(95884);
      }
      else if (aI(paramString))
      {
        i = 2;
        AppMethodBeat.o(95884);
      }
      else if ((aJ(paramString)) || ("application/cea-608".equals(paramString)) || ("application/cea-708".equals(paramString)) || ("application/x-mp4-cea-608".equals(paramString)) || ("application/x-subrip".equals(paramString)) || ("application/ttml+xml".equals(paramString)) || ("application/x-quicktime-tx3g".equals(paramString)) || ("application/x-mp4-vtt".equals(paramString)) || ("application/x-rawcc".equals(paramString)) || ("application/vobsub".equals(paramString)) || ("application/pgs".equals(paramString)) || ("application/dvbsubs".equals(paramString)))
      {
        i = 3;
        AppMethodBeat.o(95884);
      }
      else if (("application/id3".equals(paramString)) || ("application/x-emsg".equals(paramString)) || ("application/x-scte35".equals(paramString)) || ("application/x-camera-motion".equals(paramString)))
      {
        i = 4;
        AppMethodBeat.o(95884);
      }
      else
      {
        AppMethodBeat.o(95884);
      }
    }
  }

  private static String aM(String paramString)
  {
    AppMethodBeat.i(95885);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(95885);
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf('/');
      if (i == -1)
      {
        paramString = new IllegalArgumentException("Invalid mime type: ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(95885);
        throw paramString;
      }
      paramString = paramString.substring(0, i);
      AppMethodBeat.o(95885);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.i
 * JD-Core Version:    0.6.2
 */