package com.tencent.wcdb.support;

import android.util.Printer;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class LogPrinter
  implements Printer
{
  private final int mPriority;
  private final String mTag;

  public LogPrinter(int paramInt, String paramString)
  {
    this.mPriority = paramInt;
    this.mTag = paramString;
  }

  public void println(String paramString)
  {
    AppMethodBeat.i(12724);
    Log.println(this.mPriority, this.mTag, paramString);
    AppMethodBeat.o(12724);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.support.LogPrinter
 * JD-Core Version:    0.6.2
 */