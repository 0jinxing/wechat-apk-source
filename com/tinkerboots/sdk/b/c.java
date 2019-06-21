package com.tinkerboots.sdk.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public static Context context;

  public static Context getContext()
  {
    AppMethodBeat.i(65555);
    if (context == null)
    {
      localObject = new RuntimeException("TinkerClientContext, context is null, please init first");
      AppMethodBeat.o(65555);
      throw ((Throwable)localObject);
    }
    Object localObject = context;
    AppMethodBeat.o(65555);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.b.c
 * JD-Core Version:    0.6.2
 */