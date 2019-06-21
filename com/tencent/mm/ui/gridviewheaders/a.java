package com.tencent.mm.ui.gridviewheaders;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Calendar;
import java.util.Date;

public class a
{
  private static a zym;
  private long zyj;
  private long zyk;
  private long zyl;

  private a()
  {
    AppMethodBeat.i(107324);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(7, 1);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    this.zyk = localCalendar.getTimeInMillis();
    localCalendar = Calendar.getInstance();
    localCalendar.set(5, 1);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    this.zyl = localCalendar.getTimeInMillis();
    this.zyj = Calendar.getInstance().getTimeInMillis();
    AppMethodBeat.o(107324);
  }

  private static long c(Date paramDate)
  {
    AppMethodBeat.i(107327);
    long l = paramDate.getYear() * 100 + paramDate.getMonth();
    AppMethodBeat.o(107327);
    return l;
  }

  public static a dJg()
  {
    AppMethodBeat.i(107323);
    if (zym == null);
    try
    {
      a locala = new com/tencent/mm/ui/gridviewheaders/a;
      locala.<init>();
      zym = locala;
      locala = zym;
      AppMethodBeat.o(107323);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(107323);
    }
  }

  public static long nv(long paramLong)
  {
    AppMethodBeat.i(107326);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    localCalendar.set(5, 1);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    paramLong = localCalendar.getTimeInMillis();
    AppMethodBeat.o(107326);
    return paramLong;
  }

  public final String a(Date paramDate, Context paramContext)
  {
    AppMethodBeat.i(107328);
    if (paramDate.getTime() >= this.zyk)
    {
      paramDate = paramContext.getString(2131304050);
      AppMethodBeat.o(107328);
    }
    while (true)
    {
      return paramDate;
      if (paramDate.getTime() >= this.zyl)
      {
        paramDate = paramContext.getString(2131304049);
        AppMethodBeat.o(107328);
      }
      else
      {
        paramDate = String.format("%d/%d", new Object[] { Integer.valueOf(paramDate.getYear() + 1900), Integer.valueOf(paramDate.getMonth() + 1) });
        AppMethodBeat.o(107328);
      }
    }
  }

  public final long b(Date paramDate)
  {
    AppMethodBeat.i(107325);
    long l;
    if (paramDate.getTime() >= this.zyk)
    {
      l = 9223372036854775807L;
      AppMethodBeat.o(107325);
    }
    while (true)
    {
      return l;
      if (paramDate.getTime() >= this.zyl)
      {
        l = 9223372036854775806L;
        AppMethodBeat.o(107325);
      }
      else
      {
        l = c(paramDate);
        AppMethodBeat.o(107325);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.a
 * JD-Core Version:    0.6.2
 */