package com.tencent.mm.plugin.music.model.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.cache.e;
import com.tencent.mm.plugin.music.h.c;
import com.tencent.mm.plugin.music.model.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.io.File;

public final class b
{
  private static ae<String, String> oMD;
  private static ae<String, Long> oME;

  static
  {
    AppMethodBeat.i(104916);
    oMD = new ae(20);
    oME = new ae(20);
    AppMethodBeat.o(104916);
  }

  public static String SP(String paramString)
  {
    AppMethodBeat.i(104915);
    String str = Th(paramString);
    if ((!TextUtils.isEmpty(str)) && (!str.equalsIgnoreCase(paramString)))
    {
      ab.i("MicroMsg.Music.MusicUrlParser", "use temp shake music url to play:%s", new Object[] { str });
      AppMethodBeat.o(104915);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      if (Tk(paramString))
      {
        paramString = Tl(str);
        ab.i("MicroMsg.Music.MusicUrlParser", "play url :%s", new Object[] { paramString });
        AppMethodBeat.o(104915);
      }
      else
      {
        paramString = "";
        AppMethodBeat.o(104915);
      }
    }
  }

  public static String Th(String paramString)
  {
    AppMethodBeat.i(104911);
    String str;
    if ((!TextUtils.isEmpty(paramString)) && (oMD.aj(paramString)))
    {
      str = (String)oMD.get(paramString);
      if (str != null)
        break label49;
      AppMethodBeat.o(104911);
    }
    while (true)
    {
      return paramString;
      str = null;
      break;
      label49: AppMethodBeat.o(104911);
      paramString = str;
    }
  }

  private static boolean Tk(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(104913);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(104913);
    while (true)
    {
      return bool;
      if (paramString.contains("wxshakemusic"))
      {
        bool = true;
        AppMethodBeat.o(104913);
      }
      else
      {
        AppMethodBeat.o(104913);
      }
    }
  }

  public static String Tl(String paramString)
  {
    AppMethodBeat.i(104914);
    if (Tk(paramString))
    {
      int i = paramString.lastIndexOf("wxshakemusic");
      if (i > 1)
      {
        paramString = paramString.substring(0, i - 1);
        AppMethodBeat.o(104914);
      }
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(104914);
      continue;
      AppMethodBeat.o(104914);
    }
  }

  public static boolean b(a parama)
  {
    AppMethodBeat.i(104912);
    boolean bool;
    if ((parama == null) || (TextUtils.isEmpty(parama.playUrl)))
    {
      AppMethodBeat.o(104912);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!Tk(parama.playUrl))
      {
        AppMethodBeat.o(104912);
        bool = false;
      }
      else
      {
        if (c.zX(parama.field_musicType))
        {
          if ((parama == null) || (TextUtils.isEmpty(parama.playUrl)))
          {
            i = 0;
            label74: if ((i == 0) || (!com.tencent.mm.plugin.music.cache.h.Td(parama.playUrl)))
              break label144;
          }
          label144: for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label246;
            ab.i("MicroMsg.Music.MusicUrlParser", "qq music pieceFile cache is valid");
            AppMethodBeat.o(104912);
            bool = false;
            break;
            com.tencent.mm.aw.h localh = e.SQ(com.tencent.mm.plugin.music.h.b.Tu(parama.playUrl));
            if ((localh != null) && (localh.fKw == 1))
            {
              i = 1;
              break label74;
            }
            i = 0;
            break label74;
          }
        }
        bool = at.isWifi(ah.getContext());
        if (bool)
          if (parama.field_wifiEndFlag == 1)
          {
            i = 1;
            label170: if ((i == 0) || (!new File(com.tencent.mm.plugin.music.h.b.aW(parama.field_musicId, bool)).exists()))
              break label241;
          }
        label241: for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label246;
          ab.i("MicroMsg.Music.MusicUrlParser", "music cache is valid");
          AppMethodBeat.o(104912);
          bool = false;
          break;
          i = 0;
          break label170;
          if (parama.field_endFlag == 1)
          {
            i = 1;
            break label170;
          }
          i = 0;
          break label170;
        }
        label246: if (!oMD.aj(parama.playUrl))
        {
          AppMethodBeat.o(104912);
          bool = true;
        }
        else
        {
          long l = 0L;
          if (oME.aj(parama.playUrl))
            l = ((Long)oME.get(parama.playUrl)).longValue();
          if (System.currentTimeMillis() - l > 86400000L)
          {
            oMD.remove(parama.playUrl);
            oME.remove(parama.playUrl);
            ab.i("MicroMsg.Music.MusicUrlParser", "shake music url in cache is timeout");
            AppMethodBeat.o(104912);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(104912);
            bool = false;
          }
        }
      }
    }
  }

  public static void fq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(104910);
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
      AppMethodBeat.o(104910);
    while (true)
    {
      return;
      oMD.put(paramString1, paramString2);
      oME.put(paramString1, Long.valueOf(System.currentTimeMillis()));
      AppMethodBeat.o(104910);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.b
 * JD-Core Version:    0.6.2
 */