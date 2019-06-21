package com.google.android.gms.common.util;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ThreadUtils
{
  public static boolean isMainThread()
  {
    AppMethodBeat.i(90275);
    boolean bool;
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      bool = true;
      AppMethodBeat.o(90275);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90275);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.ThreadUtils
 * JD-Core Version:    0.6.2
 */