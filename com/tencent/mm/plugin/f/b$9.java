package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.c;

final class b$9
  implements c
{
  b$9(b paramb)
  {
  }

  public final boolean f(com.tencent.mm.vfs.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(18589);
    if (paramb.isDirectory())
      AppMethodBeat.o(18589);
    while (true)
    {
      return bool;
      if ((paramb.getName().endsWith(".apk")) || (paramb.getName().endsWith(".temp")))
      {
        bool = true;
        AppMethodBeat.o(18589);
      }
      else
      {
        AppMethodBeat.o(18589);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.9
 * JD-Core Version:    0.6.2
 */