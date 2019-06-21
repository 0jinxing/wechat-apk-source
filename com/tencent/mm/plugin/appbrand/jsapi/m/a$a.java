package com.tencent.mm.plugin.appbrand.jsapi.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

 enum a$a
{
  final DateFormat hUg;

  static
  {
    AppMethodBeat.i(126342);
    hUd = new a("YEAR", 0, new SimpleDateFormat("yyyy", Locale.US));
    hUe = new a("MONTH", 1, new SimpleDateFormat("yyyy-MM", Locale.US));
    hUf = new a("DAY", 2, new SimpleDateFormat("yyyy-MM-dd", Locale.US));
    hUh = new a[] { hUd, hUe, hUf };
    AppMethodBeat.o(126342);
  }

  private a$a(DateFormat paramDateFormat)
  {
    this.hUg = paramDateFormat;
  }

  static a BJ(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(126340);
    paramString = paramString.substring(0, Math.max(0, Math.min(paramString.length(), 5))).toLowerCase();
    switch (paramString.hashCode())
    {
    default:
      i = -1;
      switch (i)
      {
      default:
        label70: paramString = hUe;
        AppMethodBeat.o(126340);
      case 0:
      case 1:
      case 2:
      }
      break;
    case 3704893:
    case 104080000:
    case 99228:
    }
    while (true)
    {
      return paramString;
      if (!paramString.equals("year"))
        break;
      break label70;
      if (!paramString.equals("month"))
        break;
      i = 1;
      break label70;
      if (!paramString.equals("day"))
        break;
      i = 2;
      break label70;
      paramString = hUd;
      AppMethodBeat.o(126340);
      continue;
      paramString = hUe;
      AppMethodBeat.o(126340);
      continue;
      paramString = hUf;
      AppMethodBeat.o(126340);
    }
  }

  final Date parse(String paramString)
  {
    AppMethodBeat.i(126341);
    try
    {
      paramString = this.hUg.parse(paramString);
      AppMethodBeat.o(126341);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(126341);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.a.a
 * JD-Core Version:    0.6.2
 */