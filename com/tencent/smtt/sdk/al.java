package com.tencent.smtt.sdk;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

class al extends HandlerThread
{
  private static al a;

  public al(String paramString)
  {
    super(paramString);
  }

  public static al a()
  {
    try
    {
      AppMethodBeat.i(64390);
      if (a == null)
      {
        localal = new com/tencent/smtt/sdk/al;
        localal.<init>("TbsHandlerThread");
        a = localal;
        localal.start();
      }
      al localal = a;
      AppMethodBeat.o(64390);
      return localal;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.al
 * JD-Core Version:    0.6.2
 */