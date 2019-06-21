package com.tencent.mm.plugin.music.h;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.cache.g;
import com.tencent.mm.plugin.music.cache.i;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class d
{
  public static void M(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(137698);
    if (parame == null)
    {
      ab.e("MicroMsg.Music.MusicUrlParser", "GetShakeMusicUrl, musicWrapper is null");
      AppMethodBeat.o(137698);
      return;
    }
    boolean bool1 = at.isWifi(ah.getContext());
    boolean bool2 = at.isNetworkConnected(ah.getContext());
    Object localObject1 = new PBool();
    Object localObject2;
    label60: String str2;
    int i;
    label118: int j;
    label128: label164: String str3;
    String str4;
    if (bo.isNullOrNil(parame.fKa))
    {
      localObject2 = parame.fKc;
      String str1 = parame.fKb;
      str2 = e.a((String)localObject2, str1, bool1, (PBool)localObject1);
      ab.i("MicroMsg.Music.MusicUrlParser", "parsePlayUrl mSrc:%s", new Object[] { str2 });
      ab.i("MicroMsg.Music.MusicUrlParser", "songWifiUrl:%s", new Object[] { parame.fKa });
      if (!bool1)
        break label316;
      i = 1;
      if (!((PBool)localObject1).value)
        break label322;
      j = 1;
      ab.i("MicroMsg.Music.MusicUrlParser", "isWifi:%d, isQQMusic:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if (!bool1)
        break label328;
      bool1 = ((PBool)localObject1).value;
      if (e.Tw(str2))
      {
        ab.i("MicroMsg.Music.MusicUrlParser", "can match shake music wifi url");
        bool1 = true;
      }
      str3 = "";
      if (bool2)
        break label422;
      ab.i("MicroMsg.Music.MusicUrlParser", "isNetConnected false, detect right Url to play");
      str4 = e.a((String)localObject2, str1, true, (PBool)localObject1);
      localObject1 = e.a((String)localObject2, str1, false, (PBool)localObject1);
      if (str4 != null)
      {
        localObject2 = str3;
        if (str4.equals(localObject1));
      }
      else
      {
        if (!c.L(parame))
          break label333;
        ab.i("MicroMsg.Music.MusicUrlParser", "use exoMusicPlayer");
        localObject2 = str3;
      }
      label253: if ((TextUtils.isEmpty((CharSequence)localObject2)) || (((String)localObject2).equals(str2)))
        break label422;
      ab.i("MicroMsg.Music.MusicUrlParser", "reset the mSrc :%s", new Object[] { localObject2 });
    }
    while (true)
    {
      parame.playUrl = ((String)localObject2);
      g.aV((String)localObject2, bool1);
      AppMethodBeat.o(137698);
      break;
      localObject2 = parame.fKa;
      break label60;
      label316: i = 0;
      break label118;
      label322: j = 0;
      break label128;
      label328: bool1 = false;
      break label164;
      label333: if (c.zX(parame.fJS))
      {
        ab.i("MicroMsg.Music.MusicUrlParser", "use qqMusicPlayer");
        if (i.Tf(str4))
        {
          localObject2 = str4;
          break label253;
        }
        localObject2 = str3;
        if (!i.Tf((String)localObject1))
          break label253;
        localObject2 = localObject1;
        break label253;
      }
      if (d(parame, true))
        localObject2 = str4;
      while (true)
      {
        ab.i("MicroMsg.Music.MusicUrlParser", "use musicPlayer");
        break;
        localObject2 = localObject1;
        if (!d(parame, false))
          localObject2 = "";
      }
      label422: localObject2 = str2;
    }
  }

  private static boolean d(com.tencent.mm.aw.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(137699);
    parame = new File(b.aW(b.K(parame), paramBoolean));
    if ((parame.exists()) && (parame.length() > 0L))
    {
      paramBoolean = true;
      AppMethodBeat.o(137699);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(137699);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.h.d
 * JD-Core Version:    0.6.2
 */