package com.tencent.mm.ipcinvoker.wx_extension;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.h.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class PluginIPC$a
  implements a
{
  static final a eGG;

  static
  {
    AppMethodBeat.i(126207);
    eGG = new a();
    AppMethodBeat.o(126207);
  }

  public final void a(int paramInt, String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126206);
    switch (paramInt)
    {
    default:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(126206);
      while (true)
      {
        return;
        ab.v(paramString1, paramString2, paramArrayOfObject);
        AppMethodBeat.o(126206);
        continue;
        ab.d(paramString1, paramString2, paramArrayOfObject);
        AppMethodBeat.o(126206);
        continue;
        ab.i(paramString1, paramString2, paramArrayOfObject);
        AppMethodBeat.o(126206);
        continue;
        ab.w(paramString1, paramString2, paramArrayOfObject);
        AppMethodBeat.o(126206);
        continue;
        ab.e(paramString1, paramString2, paramArrayOfObject);
        AppMethodBeat.o(126206);
      }
      ab.e(paramString1, paramString2, paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.PluginIPC.a
 * JD-Core Version:    0.6.2
 */