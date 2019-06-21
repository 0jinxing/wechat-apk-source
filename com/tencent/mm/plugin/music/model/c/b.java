package com.tencent.mm.plugin.music.model.c;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.plugin.music.f.a.a;
import com.tencent.mm.plugin.music.f.a.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  implements c
{
  public final boolean Tn(String paramString)
  {
    AppMethodBeat.i(105006);
    boolean bool = k.kx(paramString);
    AppMethodBeat.o(105006);
    return bool;
  }

  public final String findLibPath(String paramString)
  {
    AppMethodBeat.i(105005);
    String str = paramString;
    if (!paramString.startsWith("lib"))
      str = "lib".concat(String.valueOf(paramString));
    paramString = str;
    if (!str.endsWith(".so"))
      paramString = str + ".so";
    AppMethodBeat.o(105005);
    return paramString;
  }

  public final boolean load(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(105004);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.Music.WechatMusicLoadLibrary", "LoadLibrary lib_name is null");
      AppMethodBeat.o(105004);
    }
    while (true)
    {
      return bool;
      if (k.kx(paramString))
      {
        AppMethodBeat.o(105004);
        bool = true;
      }
      else
      {
        ab.i("MicroMsg.Music.WechatMusicLoadLibrary", "load library %s", new Object[] { paramString });
        ClassLoader localClassLoader = a.class.getClassLoader();
        String str = k.ky(paramString);
        if (!TextUtils.isEmpty(str))
        {
          ab.i("MicroMsg.Music.WechatMusicLoadLibrary", "LoadLibrary find and load the lib %s so", new Object[] { str });
          k.a(paramString, localClassLoader);
          AppMethodBeat.o(105004);
          bool = true;
        }
        else
        {
          ab.e("MicroMsg.Music.WechatMusicLoadLibrary", "LoadLibrary can't find the lib %s so", new Object[] { paramString });
          AppMethodBeat.o(105004);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.c.b
 * JD-Core Version:    0.6.2
 */