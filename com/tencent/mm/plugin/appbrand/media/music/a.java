package com.tencent.mm.plugin.appbrand.media.music;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class a
{
  public String cBb;
  public int cBc;
  public String cwz;
  private HashMap<String, c> fBy;
  public String ikS;
  public String ikT;

  private a()
  {
    AppMethodBeat.i(137837);
    this.fBy = new HashMap();
    AppMethodBeat.o(137837);
  }

  public final void Cv(String paramString)
  {
    AppMethodBeat.i(137840);
    if (this.fBy.get(paramString) == null)
    {
      ab.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already remove appid: %s", new Object[] { paramString });
      AppMethodBeat.o(137840);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.b.a.xxA.d((c)this.fBy.remove(paramString));
      this.fBy.remove(paramString);
      AppMethodBeat.o(137840);
    }
  }

  public final boolean Cw(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(137841);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.AppBrandMusicPlayerManager", "appId is empty");
      AppMethodBeat.o(137841);
    }
    while (true)
    {
      return bool;
      if (!paramString.equalsIgnoreCase(this.ikS))
      {
        ab.e("MicroMsg.AppBrandMusicPlayerManager", "appId is not equals pre play id");
        AppMethodBeat.o(137841);
      }
      else if (TextUtils.isEmpty(this.ikT))
      {
        ab.e("MicroMsg.AppBrandMusicPlayerManager", "now app not play music");
        AppMethodBeat.o(137841);
      }
      else
      {
        paramString = com.tencent.mm.aw.a.aih();
        if (paramString == null)
        {
          ab.e("MicroMsg.AppBrandMusicPlayerManager", "wrapper is null");
          AppMethodBeat.o(137841);
        }
        else if (!this.ikT.equalsIgnoreCase(paramString.fJU))
        {
          ab.e("MicroMsg.AppBrandMusicPlayerManager", "musicId is diff");
          AppMethodBeat.o(137841);
        }
        else if (!com.tencent.mm.aw.a.aie())
        {
          ab.i("MicroMsg.AppBrandMusicPlayerManager", "MusicHelper.isPlayingMusic FALSE");
          AppMethodBeat.o(137841);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(137841);
        }
      }
    }
  }

  public final void a(c paramc, String paramString)
  {
    AppMethodBeat.i(137839);
    if (this.fBy.get(paramString) != null)
    {
      ab.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already add appid: %s", new Object[] { paramString });
      AppMethodBeat.o(137839);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.b.a.xxA.c(paramc);
      this.fBy.put(paramString, paramc);
      AppMethodBeat.o(137839);
    }
  }

  public final boolean cD(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(137838);
    if (paramString2.equalsIgnoreCase("play"))
    {
      ab.i("MicroMsg.AppBrandMusicPlayerManager", "play option appid %s, pre appid %s", new Object[] { paramString1, this.ikS });
      AppMethodBeat.o(137838);
    }
    while (true)
    {
      return bool;
      if (paramString1.equalsIgnoreCase(this.ikS))
      {
        paramString1 = com.tencent.mm.aw.a.aih();
        if ((paramString1 != null) && (paramString1.fJU.equals(this.ikT)))
          AppMethodBeat.o(137838);
      }
      else
      {
        AppMethodBeat.o(137838);
        bool = false;
      }
    }
  }

  public static final class a
  {
    private static a ikU;

    static
    {
      AppMethodBeat.i(137836);
      ikU = new a((byte)0);
      AppMethodBeat.o(137836);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.music.a
 * JD-Core Version:    0.6.2
 */