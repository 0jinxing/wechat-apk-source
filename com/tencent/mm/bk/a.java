package com.tencent.mm.bk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static CharSequence B(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(16634);
    if (paramInt <= 0)
    {
      paramContext = paramContext.getString(2131299729, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
      AppMethodBeat.o(16634);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131299729, new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60) });
      AppMethodBeat.o(16634);
    }
  }

  public static float fY(long paramLong)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(16633);
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F)
      f2 = f1;
    while (true)
    {
      f2 = Math.round(f2);
      AppMethodBeat.o(16633);
      return f2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bk.a
 * JD-Core Version:    0.6.2
 */