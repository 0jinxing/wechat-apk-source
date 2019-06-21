package com.tencent.mm.plugin.music.cache;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.ArrayList;
import java.util.Map;

public final class g
{
  private static ae<String, String> oLe;
  private static ae<String, Boolean> oLf;
  private static ae<String, Integer> oLg;
  private static ae<String, Integer> oLh;
  private static ae<String, Long> oLi;
  private static ae<String, String> oLj;
  private static String oLk;
  private static int oLl;

  static
  {
    AppMethodBeat.i(137444);
    oLe = new ae(20);
    oLf = new ae(20);
    oLg = new ae(20);
    oLh = new ae(20);
    oLi = new ae(20);
    oLj = new ae(20);
    oLk = null;
    oLl = 0;
    AppMethodBeat.o(137444);
  }

  public static void HS(String paramString)
  {
    AppMethodBeat.i(137439);
    Logger.i("MicroMsg.Music.PieceFileCache", "deleteFileByUrl");
    h.HS(com.tencent.mm.plugin.music.h.b.Tv(paramString));
    AppMethodBeat.o(137439);
  }

  public static void SV(String paramString)
  {
    AppMethodBeat.i(137426);
    if (!TextUtils.isEmpty(SW(paramString)))
    {
      AppMethodBeat.o(137426);
      return;
    }
    if (e.bTG());
    for (String str = ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).SR(paramString); ; str = "")
    {
      if (!TextUtils.isEmpty(str))
      {
        ArrayList localArrayList = new ArrayList(1);
        localArrayList.add(str);
        new f(localArrayList).bTy();
        if ((!TextUtils.isEmpty(paramString)) && (!TextUtils.isEmpty(str)))
          oLe.put(paramString, str);
      }
      AppMethodBeat.o(137426);
      break;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
    }
  }

  public static String SW(String paramString)
  {
    AppMethodBeat.i(137429);
    if (oLe.aj(paramString))
    {
      paramString = (String)oLe.get(paramString);
      AppMethodBeat.o(137429);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(137429);
    }
  }

  public static boolean SX(String paramString)
  {
    AppMethodBeat.i(137431);
    boolean bool;
    if (oLf.aj(paramString))
    {
      bool = ((Boolean)oLf.get(paramString)).booleanValue();
      AppMethodBeat.o(137431);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137431);
    }
  }

  public static String SY(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(137434);
    paramString = SW(paramString);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.Music.PieceCacheHelper", "getMusicMIMEType musicId is empty!");
      AppMethodBeat.o(137434);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (e.bTG())
      {
        paramString = ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).ST(paramString);
        AppMethodBeat.o(137434);
      }
      else
      {
        ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        AppMethodBeat.o(137434);
        paramString = localObject;
      }
    }
  }

  public static String SZ(String paramString)
  {
    AppMethodBeat.i(137435);
    if (oLj.aj(paramString))
    {
      paramString = (String)oLj.get(paramString);
      AppMethodBeat.o(137435);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(137435);
    }
  }

  public static long Ta(String paramString)
  {
    AppMethodBeat.i(137436);
    long l;
    if (oLi.aj(paramString))
    {
      l = ((Long)oLi.get(paramString)).longValue();
      AppMethodBeat.o(137436);
    }
    while (true)
    {
      return l;
      l = -1L;
      AppMethodBeat.o(137436);
    }
  }

  public static int Tb(String paramString)
  {
    AppMethodBeat.i(137441);
    int i;
    if ((paramString != null) && (oLg.aj(paramString)))
    {
      i = ((Integer)oLg.get(paramString)).intValue();
      AppMethodBeat.o(137441);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(137441);
    }
  }

  public static int Tc(String paramString)
  {
    AppMethodBeat.i(137443);
    int i;
    if ((paramString != null) && (oLh.aj(paramString)))
    {
      i = ((Integer)oLh.get(paramString)).intValue();
      AppMethodBeat.o(137443);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(137443);
    }
  }

  public static void aV(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(137430);
    if (!TextUtils.isEmpty(paramString))
      oLf.put(paramString, Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(137430);
  }

  public static void ah(String paramString, long paramLong)
  {
    AppMethodBeat.i(137437);
    if (paramLong > 0L)
      oLi.put(paramString, Long.valueOf(paramLong));
    AppMethodBeat.o(137437);
  }

  public static int bTA()
  {
    AppMethodBeat.i(137428);
    if (oLl != 0)
    {
      i = oLl;
      AppMethodBeat.o(137428);
      return i;
    }
    if (e.bTG());
    for (int i = ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).bTA(); ; i = 3)
    {
      oLl = i;
      ab.i("MicroMsg.Music.PieceCacheHelper", "sRemovePlayingAudioPlayerGroupCount:%d", new Object[] { Integer.valueOf(oLl) });
      if (oLl == 0)
        oLl = 3;
      i = oLl;
      AppMethodBeat.o(137428);
      break;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
    }
  }

  public static void cI(String paramString, int paramInt)
  {
    AppMethodBeat.i(137440);
    if (paramString != null)
      oLg.put(paramString, Integer.valueOf(paramInt));
    AppMethodBeat.o(137440);
  }

  public static void cJ(String paramString, int paramInt)
  {
    AppMethodBeat.i(137442);
    if (paramString != null)
      oLh.put(paramString, Integer.valueOf(paramInt));
    AppMethodBeat.o(137442);
  }

  public static long ek(String paramString)
  {
    AppMethodBeat.i(137438);
    long l = h.ek(paramString);
    AppMethodBeat.o(137438);
    return l;
  }

  public static void fo(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137433);
    String str = SW(paramString1);
    if (TextUtils.isEmpty(str))
    {
      ab.e("MicroMsg.Music.PieceCacheHelper", "setMusicMIMEType musicId is empty!");
      AppMethodBeat.o(137433);
    }
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(SZ(paramString1)))
      {
        AppMethodBeat.o(137433);
      }
      else
      {
        ab.i("MicroMsg.Music.PieceCacheHelper", "setMusicMIMEType url:%s mimeType:%s", new Object[] { paramString1, paramString2 });
        if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)))
          oLj.put(paramString1, paramString2);
        if (e.bTG())
        {
          ((c)com.tencent.mm.plugin.music.f.c.b.ar(c.class)).fm(str, paramString2);
          AppMethodBeat.o(137433);
        }
        else
        {
          ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
          AppMethodBeat.o(137433);
        }
      }
    }
  }

  public static String getAccPath()
  {
    AppMethodBeat.i(137427);
    String str;
    if (oLk != null)
    {
      str = oLk;
      AppMethodBeat.o(137427);
    }
    while (true)
    {
      return str;
      str = e.getAccPath();
      if (TextUtils.isEmpty(str))
      {
        ab.i("MicroMsg.Music.PieceCacheHelper", "retAccPath:%s is invalid", new Object[] { str });
        str = com.tencent.mm.loader.j.b.eSn;
        AppMethodBeat.o(137427);
      }
      else
      {
        ab.i("MicroMsg.Music.PieceCacheHelper", "getAccPath retAccPath:%s", new Object[] { str });
        oLk = str;
        AppMethodBeat.o(137427);
      }
    }
  }

  public static void r(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(137432);
    if ((paramMap != null) && (SX(paramString)))
    {
      paramMap.put("Cookie", "qqmusic_fromtag=97;qqmusic_uin=1234567;qqmusic_key=;");
      paramMap.put("referer", "stream12.qqmusic.qq.com");
    }
    AppMethodBeat.o(137432);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.g
 * JD-Core Version:    0.6.2
 */