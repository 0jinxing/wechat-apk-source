package com.tencent.mm.plugin.music.model.e;

import android.content.Context;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.memory.a.c;
import com.tencent.mm.plugin.music.model.d;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends j<a>
{
  public com.tencent.mm.sdk.e.e bSd;
  public f<String, a> oNq;
  public f<String, com.tencent.mm.plugin.music.model.a> oNr;

  public b(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, a.ccO, "Music", null);
    AppMethodBeat.i(105034);
    this.bSd = parame;
    this.oNq = new c(20);
    this.oNr = new c(10);
    AppMethodBeat.o(105034);
  }

  public final a Tp(String paramString)
  {
    AppMethodBeat.i(105035);
    if (this.oNq.get(paramString) != null)
    {
      paramString = (a)this.oNq.get(paramString);
      AppMethodBeat.o(105035);
    }
    while (true)
    {
      return paramString;
      Object localObject = String.format("Select * From Music Where musicId=?", new Object[0]);
      Cursor localCursor = this.bSd.a((String)localObject, new String[] { paramString }, 2);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        localObject = new a();
        ((a)localObject).d(localCursor);
        localCursor.close();
        this.oNq.put(paramString, localObject);
        AppMethodBeat.o(105035);
        paramString = (String)localObject;
      }
      else
      {
        if (localCursor != null)
          localCursor.close();
        paramString = null;
        AppMethodBeat.o(105035);
      }
    }
  }

  public final a ac(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105038);
    ab.i("MicroMsg.Music.MusicStorage", "updateMusicWithColor %s %d %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    a locala = Tp(paramString);
    if (locala == null)
    {
      ab.e("MicroMsg.Music.MusicStorage", "updateMusicWithColor can not find music %s", new Object[] { paramString });
      paramString = null;
      AppMethodBeat.o(105038);
    }
    while (true)
    {
      return paramString;
      locala.field_songBgColor = paramInt1;
      locala.field_songLyricColor = paramInt2;
      c(locala, new String[] { "songBgColor", "songLyricColor" });
      this.oNq.put(paramString, locala);
      AppMethodBeat.o(105038);
      paramString = locala;
    }
  }

  public final com.tencent.mm.plugin.music.model.a b(a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(105036);
    if (this.oNr.get(parama.field_musicId) != null)
    {
      parama = (com.tencent.mm.plugin.music.model.a)this.oNr.get(parama.field_musicId);
      AppMethodBeat.o(105036);
    }
    while (true)
    {
      return parama;
      parama = c(parama, paramBoolean);
      AppMethodBeat.o(105036);
    }
  }

  public final com.tencent.mm.plugin.music.model.a c(a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(105037);
    com.tencent.mm.plugin.music.model.a locala = com.tencent.mm.plugin.music.model.a.a(parama.field_songLyric, ah.getContext().getString(2131301597), parama.field_songSnsShareUser, d.a(parama), parama.field_songSinger, paramBoolean);
    this.oNr.put(parama.field_musicId, locala);
    AppMethodBeat.o(105037);
    return locala;
  }

  public final a x(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(105039);
    String str = com.tencent.mm.plugin.music.h.b.K(parame);
    a locala = Tp(str);
    if (locala == null)
      locala = new a();
    for (int i = 0; ; i = 1)
    {
      locala.field_musicId = str;
      locala.field_originMusicId = parame.fJU;
      locala.field_musicType = parame.fJS;
      locala.field_appId = parame.fKh;
      if (bo.isNullOrNil(locala.field_appId))
        locala.field_appId = d.v(parame);
      locala.field_songAlbum = parame.fJY;
      locala.field_songAlbumType = parame.fKi;
      locala.field_songWifiUrl = parame.fKa;
      locala.field_songName = parame.fJW;
      locala.field_songSinger = parame.fJX;
      locala.field_songWapLinkUrl = parame.fKb;
      locala.field_songWebUrl = parame.fKc;
      locala.field_songAlbumLocalPath = parame.fKe;
      locala.field_songMediaId = parame.fKk;
      locala.field_songSnsAlbumUser = parame.fKm;
      locala.field_songAlbumUrl = parame.fJZ;
      locala.field_songSnsShareUser = parame.fKo;
      if (!bo.isNullOrNil(parame.fKl))
        locala.field_songHAlbumUrl = parame.fKl;
      locala.field_updateTime = System.currentTimeMillis();
      if (locala.field_songId == 0)
      {
        com.tencent.mm.plugin.music.h.e.O(parame);
        locala.field_songId = parame.fKj;
      }
      if (((bo.isNullOrNil(locala.field_songWapLinkUrl)) || (locala.field_songWapLinkUrl.equals(locala.field_songWebUrl))) && (!bo.isNullOrNil(locala.field_songWifiUrl)))
        locala.field_songWapLinkUrl = locala.field_songWifiUrl;
      if ((locala.field_songId == 0) && (parame.fJS == 4));
      try
      {
        locala.field_songId = Integer.valueOf(parame.fJU).intValue();
        label290: locala.field_hideBanner = parame.fKq;
        locala.field_jsWebUrlDomain = parame.fKr;
        locala.field_startTime = parame.startTime;
        locala.fKs = parame.fKs;
        locala.field_protocol = parame.protocol;
        locala.field_barBackToWebView = parame.fKt;
        locala.field_musicbar_url = parame.fKu;
        if (i != 0)
        {
          ab.i("MicroMsg.Music.MusicStorage", "update music %s", new Object[] { str });
          c(locala, new String[0]);
        }
        while (true)
        {
          this.oNq.put(str, locala);
          AppMethodBeat.o(105039);
          return locala;
          ab.i("MicroMsg.Music.MusicStorage", "insert music %s", new Object[] { str });
          b(locala);
        }
      }
      catch (Exception localException)
      {
        break label290;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.e.b
 * JD-Core Version:    0.6.2
 */