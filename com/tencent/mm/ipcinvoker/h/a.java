package com.tencent.mm.ipcinvoker.h;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements com.tencent.mm.ipcinvoker.h.a.a
{
  public final void a(int paramInt, String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(114123);
    if (paramInt < 4)
      AppMethodBeat.o(114123);
    while (true)
    {
      return;
      Log.println(paramInt, paramString1, String.format(paramString2, paramArrayOfObject));
      AppMethodBeat.o(114123);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.h.a
 * JD-Core Version:    0.6.2
 */