package com.tencent.mm.plugin.collect.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class e
{
  public static String a(Context paramContext, long paramLong, int paramInt)
  {
    AppMethodBeat.i(40930);
    paramLong = 1000L * paramLong;
    if (paramInt == 0)
    {
      paramContext = new SimpleDateFormat(paramContext.getString(2131298340)).format(new Date(paramLong));
      AppMethodBeat.o(40930);
    }
    while (true)
    {
      return paramContext;
      if (paramInt == 1)
      {
        paramContext = new SimpleDateFormat(paramContext.getString(2131298341)).format(new Date(paramLong));
        AppMethodBeat.o(40930);
      }
      else
      {
        paramContext = new SimpleDateFormat(paramContext.getString(2131298342)).format(new Date(paramLong));
        AppMethodBeat.o(40930);
      }
    }
  }

  public static String tG(int paramInt)
  {
    AppMethodBeat.i(40931);
    String str = String.format("%.2f", new Object[] { Double.valueOf(paramInt / 100.0D) });
    AppMethodBeat.o(40931);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.e
 * JD-Core Version:    0.6.2
 */