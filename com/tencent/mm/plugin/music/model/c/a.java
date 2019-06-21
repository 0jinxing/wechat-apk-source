package com.tencent.mm.plugin.music.model.c;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static HashMap<Integer, Boolean> oMV;
  private static HashMap<Integer, Long> oMW;

  static
  {
    AppMethodBeat.i(105003);
    oMV = new HashMap();
    oMW = new HashMap();
    oMV.put(Integer.valueOf(0), Boolean.FALSE);
    oMV.put(Integer.valueOf(1), Boolean.FALSE);
    oMV.put(Integer.valueOf(4), Boolean.FALSE);
    oMV.put(Integer.valueOf(5), Boolean.FALSE);
    oMV.put(Integer.valueOf(6), Boolean.FALSE);
    oMV.put(Integer.valueOf(7), Boolean.FALSE);
    oMV.put(Integer.valueOf(8), Boolean.FALSE);
    oMV.put(Integer.valueOf(9), Boolean.FALSE);
    oMW.put(Integer.valueOf(0), Long.valueOf(0L));
    oMW.put(Integer.valueOf(1), Long.valueOf(0L));
    oMW.put(Integer.valueOf(4), Long.valueOf(0L));
    oMW.put(Integer.valueOf(5), Long.valueOf(0L));
    oMW.put(Integer.valueOf(6), Long.valueOf(0L));
    oMW.put(Integer.valueOf(7), Long.valueOf(0L));
    oMW.put(Integer.valueOf(8), Long.valueOf(0L));
    oMW.put(Integer.valueOf(9), Long.valueOf(0L));
    AppMethodBeat.o(105003);
  }

  private static boolean eI(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(105002);
    if ((paramInt1 == 0) && ((paramInt2 & 0x1) > 0))
      ab.i("MicroMsg.Music.MusicPlayerSwitcher", "support CHATTING_UI");
    while (true)
    {
      AppMethodBeat.o(105002);
      return bool;
      if ((paramInt1 == 1) && ((paramInt2 & 0x2) > 0))
      {
        ab.i("MicroMsg.Music.MusicPlayerSwitcher", "support SNS_TIMELINE_UI");
      }
      else if ((paramInt1 == 4) && ((paramInt2 & 0x4) > 0))
      {
        ab.i("MicroMsg.Music.MusicPlayerSwitcher", "support SHAKE_MUSIC_UI");
      }
      else if ((paramInt1 == 5) && ((paramInt2 & 0x8) > 0))
      {
        ab.i("MicroMsg.Music.MusicPlayerSwitcher", "support PRODUCT_UI");
      }
      else if ((paramInt1 == 6) && ((paramInt2 & 0x10) > 0))
      {
        ab.i("MicroMsg.Music.MusicPlayerSwitcher", "support FAVORITE_UI");
      }
      else if ((paramInt1 == 7) && ((paramInt2 & 0x20) > 0))
      {
        ab.i("MicroMsg.Music.MusicPlayerSwitcher", "support WEBVIEW_UI");
      }
      else if ((paramInt1 == 8) && ((paramInt2 & 0x40) > 0))
      {
        ab.i("MicroMsg.Music.MusicPlayerSwitcher", "support SNS_USER_TIMELINE_UI");
      }
      else if ((paramInt1 == 9) && ((paramInt2 & 0x80) > 0))
      {
        ab.i("MicroMsg.Music.MusicPlayerSwitcher", "support SEARCH_TIMELINE_UI");
      }
      else
      {
        ab.i("MicroMsg.Music.MusicPlayerSwitcher", "QQMusicPlayer not support this scene %d", new Object[] { Integer.valueOf(paramInt1) });
        bool = false;
      }
    }
  }

  public static boolean zF(int paramInt)
  {
    AppMethodBeat.i(105000);
    long l = System.currentTimeMillis();
    boolean bool;
    if (l - ((Long)oMW.get(Integer.valueOf(paramInt))).longValue() < 10000L)
    {
      bool = ((Boolean)oMV.get(Integer.valueOf(paramInt))).booleanValue();
      AppMethodBeat.o(105000);
    }
    while (true)
    {
      return bool;
      oMW.put(Integer.valueOf(paramInt), Long.valueOf(l));
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100283");
      if (!localc.isValid())
      {
        ab.e("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer item.isValid is false");
        bool = zL(paramInt);
        AppMethodBeat.o(105000);
        continue;
      }
      Map localMap = localc.dru();
      if (localMap == null)
      {
        ab.e("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer args == null");
        bool = zL(paramInt);
        AppMethodBeat.o(105000);
        continue;
      }
      if (!localMap.containsKey("support_player_flag"))
      {
        ab.e("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer not contain the support_player_flag key");
        bool = zL(paramInt);
        AppMethodBeat.o(105000);
        continue;
      }
      if (TextUtils.isEmpty((CharSequence)localMap.get("support_player_flag")))
      {
        ab.e("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer not contain the the value is empty");
        bool = zL(paramInt);
        AppMethodBeat.o(105000);
        continue;
      }
      String str = (String)localMap.get("support_player_flag");
      try
      {
        i = Integer.valueOf(str, 16).intValue();
        ab.i("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer contain support_player_flag:%s", new Object[] { str });
        l = ((Long)g.RP().Ry().get(ac.a.xQU, Long.valueOf(0L))).longValue();
        if (l == 0L)
        {
          ab.i("MicroMsg.Music.MusicPlayerSwitcher", "sequence is 0");
          g.RP().Ry().set(ac.a.xQU, Long.valueOf(localc.field_sequence));
          g.RP().Ry().set(ac.a.xQT, Integer.valueOf(i));
          bool = eI(paramInt, i);
          oMV.put(Integer.valueOf(paramInt), Boolean.valueOf(bool));
          AppMethodBeat.o(105000);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Music.MusicPlayerSwitcher", localNumberFormatException, "supportQQMusicPlayer", new Object[0]);
          int i = 0;
          continue;
          if (l == localc.field_sequence)
          {
            ab.i("MicroMsg.Music.MusicPlayerSwitcher", "sequence is equal, check flag from local switch flag");
            bool = eI(paramInt, ((Integer)g.RP().Ry().get(ac.a.xQT, Integer.valueOf(i))).intValue());
          }
          else
          {
            ab.i("MicroMsg.Music.MusicPlayerSwitcher", "sequence is diff, update local data");
            g.RP().Ry().set(ac.a.xQU, Long.valueOf(localc.field_sequence));
            g.RP().Ry().set(ac.a.xQT, Integer.valueOf(i));
            bool = eI(paramInt, i);
          }
        }
      }
    }
  }

  private static boolean zL(int paramInt)
  {
    AppMethodBeat.i(105001);
    int i = ((Integer)g.RP().Ry().get(ac.a.xQT, Integer.valueOf(0))).intValue();
    boolean bool = eI(paramInt, i);
    ab.i("MicroMsg.Music.MusicPlayerSwitcher", "checkLocalSupportPlayerFlag support_player_flag:%s", new Object[] { Integer.toHexString(i) });
    oMV.put(Integer.valueOf(paramInt), Boolean.valueOf(bool));
    AppMethodBeat.o(105001);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.c.a
 * JD-Core Version:    0.6.2
 */