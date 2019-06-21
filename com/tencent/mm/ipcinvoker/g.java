package com.tencent.mm.ipcinvoker;

import android.app.Application;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.a.d;
import com.tencent.mm.ipcinvoker.h.a.a;
import com.tencent.mm.ipcinvoker.h.c;
import java.util.Map;

public final class g
{
  public static void lh(String paramString)
  {
    AppMethodBeat.i(114040);
    if (b.PL().le(paramString))
      AppMethodBeat.o(114040);
    while (true)
    {
      return;
      m.post(new g.3(paramString));
      AppMethodBeat.o(114040);
    }
  }

  public static void li(String paramString)
  {
    AppMethodBeat.i(114041);
    if (b.PL().le(paramString))
      AppMethodBeat.o(114041);
    while (true)
    {
      return;
      m.post(new g.4(paramString));
      AppMethodBeat.o(114041);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.g
 * JD-Core Version:    0.6.2
 */