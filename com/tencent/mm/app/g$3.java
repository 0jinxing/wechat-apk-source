package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.FileSystemManager.b;
import java.security.Key;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

final class g$3
  implements FileSystemManager.b
{
  g$3(g paramg)
  {
  }

  private static boolean Bk()
  {
    AppMethodBeat.i(138007);
    try
    {
      bool = com.tencent.mm.kernel.g.RK();
      AppMethodBeat.o(138007);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(138007);
      }
    }
  }

  public final Key e(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(138008);
    if ((paramMap.get("account") == null) || (!Bk()))
    {
      paramString = null;
      AppMethodBeat.o(138008);
    }
    while (true)
    {
      return paramString;
      ab.i("VFS.Debug", "KeyGen.generate: ".concat(String.valueOf(paramString)));
      paramMap = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      paramString = new SecretKeySpec(com.tencent.mm.a.g.y((a.QG() + paramString).getBytes()), "RC4");
      AppMethodBeat.o(138008);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.g.3
 * JD-Core Version:    0.6.2
 */