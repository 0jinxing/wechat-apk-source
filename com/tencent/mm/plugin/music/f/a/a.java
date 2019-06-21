package com.tencent.mm.plugin.music.f.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import java.util.HashMap;

public class a
{
  private static boolean aIA;
  private static c oNN;
  private static boolean oNO;

  static
  {
    AppMethodBeat.i(137648);
    oNN = new a((byte)0);
    oNO = false;
    aIA = false;
    AppMethodBeat.o(137648);
  }

  public static void a(c paramc)
  {
    oNN = paramc;
  }

  public static void bUE()
  {
    AppMethodBeat.i(137646);
    ab.i("MicroMsg.Audio.AudioPlayerUtils", "configQQMusicSdkConfig");
    AudioPlayerConfigure.setLog(new a.1());
    AudioPlayerConfigure.setSoLibraryLoader(new a.2());
    if ((!oNO) && (!aIA))
    {
      aIA = true;
      com.tencent.mm.sdk.g.d.post(new a.3(), "audio load NLog");
    }
    AppMethodBeat.o(137646);
  }

  public static boolean bUF()
  {
    boolean bool1 = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(137647);
        if (oNO)
        {
          bool1 = true;
          AppMethodBeat.o(137647);
          return bool1;
        }
        if (oNN == null)
        {
          AppMethodBeat.o(137647);
          continue;
        }
      }
      finally
      {
      }
      oNN.load(NativeLibs.nlog.getName());
      boolean bool2 = oNN.Tn(NativeLibs.nlog.getName());
      if (bool2)
      {
        try
        {
          oNO = AudioPlayerConfigure.enableNativeLog(null);
          if (oNO)
            ab.i("MicroMsg.Audio.AudioPlayerUtils", "enableNativeLog success");
          bool1 = oNO;
          AppMethodBeat.o(137647);
        }
        catch (Throwable localThrowable)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.Audio.AudioPlayerUtils", localThrowable, "checkNLogLoad", new Object[0]);
            if (!com.tencent.mm.compatible.util.d.fP(20))
              break;
            oNO = AudioPlayerConfigure.enableNativeLog(null);
          }
          AppMethodBeat.o(137647);
          throw localThrowable;
        }
      }
      else
      {
        ab.i("MicroMsg.Audio.AudioPlayerUtils", "enableNativeLog fail");
        AppMethodBeat.o(137647);
      }
    }
  }

  static final class a
    implements c
  {
    private HashMap<String, Boolean> oNP;

    private a()
    {
      AppMethodBeat.i(137642);
      this.oNP = new HashMap();
      AppMethodBeat.o(137642);
    }

    public final boolean Tn(String paramString)
    {
      AppMethodBeat.i(137645);
      boolean bool;
      if (this.oNP.containsKey(paramString))
      {
        bool = true;
        AppMethodBeat.o(137645);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(137645);
      }
    }

    public final String findLibPath(String paramString)
    {
      AppMethodBeat.i(137644);
      ab.i("MicroMsg.Audio.AudioPlayerUtils", "findLibPath %s", new Object[] { paramString });
      String str = paramString;
      if (!paramString.startsWith("lib"))
        str = "lib".concat(String.valueOf(paramString));
      paramString = str;
      if (!str.endsWith(".so"))
        paramString = str + ".so";
      AppMethodBeat.o(137644);
      return paramString;
    }

    public final boolean load(String paramString)
    {
      AppMethodBeat.i(137643);
      boolean bool;
      if (TextUtils.isEmpty(paramString))
      {
        ab.e("MicroMsg.Audio.AudioPlayerUtils", "LoadLibrary lib_name is null");
        AppMethodBeat.o(137643);
        bool = false;
      }
      while (true)
      {
        return bool;
        if ((this.oNP.containsKey(paramString)) && (((Boolean)this.oNP.get(paramString)).booleanValue()))
        {
          ab.e("MicroMsg.Audio.AudioPlayerUtils", "LoadLibrary lib_name %s is loaded", new Object[] { paramString });
          AppMethodBeat.o(137643);
          bool = true;
        }
        else
        {
          this.oNP.put(paramString, Boolean.TRUE);
          System.loadLibrary(paramString);
          AppMethodBeat.o(137643);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.a.a
 * JD-Core Version:    0.6.2
 */