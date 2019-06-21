package com.google.android.exoplayer2;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

public final class j
{
  private static final HashSet<String> aNY;
  private static String aNZ;

  static
  {
    AppMethodBeat.i(94839);
    aNY = new HashSet();
    aNZ = "goog.exo.core";
    AppMethodBeat.o(94839);
  }

  public static void ar(String paramString)
  {
    try
    {
      AppMethodBeat.i(94838);
      if (aNY.add(paramString))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        aNZ = aNZ + ", " + paramString;
      }
      AppMethodBeat.o(94838);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public static String qa()
  {
    try
    {
      String str = aNZ;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.j
 * JD-Core Version:    0.6.2
 */