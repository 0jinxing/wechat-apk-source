package com.tencent.mm.ui.e.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private static a zxq = null;

  public static void a(a parama)
  {
    zxq = parama;
  }

  public static int bV(String paramString, int paramInt)
  {
    AppMethodBeat.i(112573);
    if (zxq != null)
    {
      paramInt = zxq.bV(paramString, paramInt);
      AppMethodBeat.o(112573);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(112573);
    }
  }

  public static CharSequence c(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    AppMethodBeat.i(112572);
    if (zxq != null)
    {
      paramCharSequence = zxq.c(paramContext, paramCharSequence, paramFloat);
      AppMethodBeat.o(112572);
    }
    while (true)
    {
      return paramCharSequence;
      AppMethodBeat.o(112572);
    }
  }

  public static CharSequence h(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(112571);
    if (zxq != null)
    {
      paramCharSequence = zxq.h(paramCharSequence, paramInt);
      AppMethodBeat.o(112571);
    }
    while (true)
    {
      return paramCharSequence;
      AppMethodBeat.o(112571);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.c.b
 * JD-Core Version:    0.6.2
 */