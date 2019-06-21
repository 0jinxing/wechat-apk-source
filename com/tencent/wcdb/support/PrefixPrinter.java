package com.tencent.wcdb.support;

import android.util.Printer;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PrefixPrinter
  implements Printer
{
  private final String mPrefix;
  private final Printer mPrinter;

  private PrefixPrinter(Printer paramPrinter, String paramString)
  {
    this.mPrinter = paramPrinter;
    this.mPrefix = paramString;
  }

  public static Printer create(Printer paramPrinter, String paramString)
  {
    AppMethodBeat.i(12736);
    if ((paramString == null) || (paramString.equals("")))
      AppMethodBeat.o(12736);
    while (true)
    {
      return paramPrinter;
      paramPrinter = new PrefixPrinter(paramPrinter, paramString);
      AppMethodBeat.o(12736);
    }
  }

  public void println(String paramString)
  {
    AppMethodBeat.i(12737);
    this.mPrinter.println(this.mPrefix + paramString);
    AppMethodBeat.o(12737);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.support.PrefixPrinter
 * JD-Core Version:    0.6.2
 */