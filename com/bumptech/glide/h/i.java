package com.bumptech.glide.h;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

public final class i
{
  public static void b(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(92597);
    if (!paramBoolean)
    {
      paramString = new IllegalArgumentException(paramString);
      AppMethodBeat.o(92597);
      throw paramString;
    }
    AppMethodBeat.o(92597);
  }

  public static <T extends Collection<Y>, Y> T c(T paramT)
  {
    AppMethodBeat.i(92600);
    if (paramT.isEmpty())
    {
      paramT = new IllegalArgumentException("Must not be empty.");
      AppMethodBeat.o(92600);
      throw paramT;
    }
    AppMethodBeat.o(92600);
    return paramT;
  }

  public static String checkNotEmpty(String paramString)
  {
    AppMethodBeat.i(92599);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = new IllegalArgumentException("Must not be null or empty");
      AppMethodBeat.o(92599);
      throw paramString;
    }
    AppMethodBeat.o(92599);
    return paramString;
  }

  public static <T> T d(T paramT, String paramString)
  {
    AppMethodBeat.i(92598);
    if (paramT == null)
    {
      paramT = new NullPointerException(paramString);
      AppMethodBeat.o(92598);
      throw paramT;
    }
    AppMethodBeat.o(92598);
    return paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.i
 * JD-Core Version:    0.6.2
 */