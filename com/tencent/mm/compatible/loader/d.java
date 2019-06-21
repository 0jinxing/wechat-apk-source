package com.tencent.mm.compatible.loader;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static Map<String, String> eut;

  public static String B(Context paramContext, String paramString)
  {
    AppMethodBeat.i(93035);
    long l = bo.anU();
    if (eut == null);
    try
    {
      ab.i("MicroMsg.PluginClassLoader", "ensurePreloadFiles");
      String str1 = bo.convertStreamToString(paramContext.getAssets().open("preload/libraries.ini"));
      localObject2 = u.amt(str1);
      ab.i("MicroMsg.PluginClassLoader", "libraries.ini content\n%s", new Object[] { str1 });
      if ((localObject2 == null) || (((Map)localObject2).size() <= 0))
      {
        ab.e("MicroMsg.PluginClassLoader", "parse libraries.ini failed");
        paramContext = paramContext.getDir("lib", 0).getAbsolutePath();
        if (eut != null)
          break label249;
        ab.e("MicroMsg.PluginClassLoader", "extractVoipDex preload so files loaded failed");
        AppMethodBeat.o(93035);
        paramContext = null;
        return paramContext;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.PluginClassLoader", "load preload libraries failed");
        ab.printErrStackTrace("MicroMsg.PluginClassLoader", localException, "", new Object[0]);
        continue;
        eut = new HashMap(((Map)localObject2).size());
        Object localObject2 = ((Map)localObject2).entrySet().iterator();
        Object localObject1;
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (Map.Entry)((Iterator)localObject2).next();
          ab.d("MicroMsg.PluginClassLoader", "preload file, plugin=%s, md5=%s", new Object[] { ((Map.Entry)localObject1).getKey(), ((Map.Entry)localObject1).getValue() });
          eut.put(((Map.Entry)localObject1).getKey(), ((Map.Entry)localObject1).getValue());
        }
        label249: paramContext = paramContext + "/" + paramString;
        String str2 = (String)eut.get(paramString);
        if (str2 == null)
        {
          ab.w("MicroMsg.PluginClassLoader", "extractVoipDex not in preloadfiles");
          AppMethodBeat.o(93035);
          paramContext = null;
        }
        else
        {
          localObject1 = new b(paramContext);
          if (((b)localObject1).exists())
          {
            localObject2 = e.atg(j.w(((b)localObject1).mUri));
            if ((localObject2 != null) && (((String)localObject2).equalsIgnoreCase(str2)))
            {
              ab.d("MicroMsg.PluginClassLoader", "extractVoipDex: targetFilePath:[%s] time:%d", new Object[] { localObject1, Long.valueOf(bo.gb(l)) });
              AppMethodBeat.o(93035);
            }
            else
            {
              ab.e("MicroMsg.PluginClassLoader", "extractVoipDex target file exists, but md5 check failed, target=%s assets=%s", new Object[] { localObject2, str2 });
            }
          }
          else
          {
            e.deleteFile(paramContext);
            if (e.y("assets:///preload/".concat(String.valueOf(paramString)), paramContext) < 0L)
            {
              ab.f("MicroMsg.PluginClassLoader", "extractVoipDex  copyAssets failed");
              AppMethodBeat.o(93035);
              paramContext = null;
            }
            else
            {
              ab.i("MicroMsg.PluginClassLoader", "extractVoipDex time:%d so:%s md5:%s ", new Object[] { Long.valueOf(bo.gb(l)), paramString, str2 });
              AppMethodBeat.o(93035);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.d
 * JD-Core Version:    0.6.2
 */