package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.GregorianCalendar;

public final class j
{
  public static CharSequence B(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(74163);
    if (paramInt <= 0)
    {
      paramContext = paramContext.getString(2131299729, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
      AppMethodBeat.o(74163);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131299729, new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60) });
      AppMethodBeat.o(74163);
    }
  }

  public static CharSequence g(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(74164);
    if (paramLong < 3600000L)
    {
      paramContext = "";
      AppMethodBeat.o(74164);
    }
    while (true)
    {
      return paramContext;
      GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
      GregorianCalendar localGregorianCalendar2 = new GregorianCalendar(localGregorianCalendar1.get(1), localGregorianCalendar1.get(2), localGregorianCalendar1.get(5));
      long l = paramLong - localGregorianCalendar2.getTimeInMillis();
      if ((l > 0L) && (l <= 86400000L))
      {
        paramContext = paramContext.getString(2131299977);
        AppMethodBeat.o(74164);
      }
      else
      {
        l = localGregorianCalendar2.getTimeInMillis() - paramLong;
        if ((l > 0L) && (l <= 86400000L))
        {
          paramContext = paramContext.getString(2131299986);
          AppMethodBeat.o(74164);
        }
        else
        {
          new GregorianCalendar().setTimeInMillis(paramLong);
          int i = (int)((localGregorianCalendar1.getTimeInMillis() - paramLong) / 86400000L);
          int j = i;
          if (i <= 0)
            j = 1;
          if (j > 30)
          {
            paramContext = DateFormat.format(paramContext.getString(2131299662), paramLong);
            AppMethodBeat.o(74164);
          }
          else
          {
            paramContext = paramContext.getResources().getQuantityString(2131361803, j, new Object[] { Integer.valueOf(j) });
            AppMethodBeat.o(74164);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.j
 * JD-Core Version:    0.6.2
 */