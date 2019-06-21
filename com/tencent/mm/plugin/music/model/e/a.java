package com.tencent.mm.plugin.music.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.g.c.db;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends db
{
  public static c.a ccO;
  public String fKs;
  public String playUrl;

  static
  {
    AppMethodBeat.i(105033);
    ccO = db.Hm();
    AppMethodBeat.o(105033);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean bUu()
  {
    if ((this.field_songBgColor != 0) && (this.field_songLyricColor != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean bUv()
  {
    AppMethodBeat.i(105030);
    boolean bool;
    if (!bo.isNullOrNil(this.field_songHAlbumUrl))
    {
      bool = true;
      AppMethodBeat.o(105030);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105030);
    }
  }

  public final e bUw()
  {
    AppMethodBeat.i(105032);
    e locale = new e();
    locale.fJU = this.field_originMusicId;
    locale.fJS = this.field_musicType;
    locale.fKh = this.field_appId;
    locale.fJY = this.field_songAlbum;
    locale.fKi = this.field_songAlbumType;
    locale.fJZ = this.field_songAlbumUrl;
    locale.fKa = this.field_songWifiUrl;
    locale.fJW = this.field_songName;
    locale.fJX = this.field_songSinger;
    locale.fKb = this.field_songWapLinkUrl;
    locale.fKc = this.field_songWebUrl;
    locale.fKe = this.field_songAlbumLocalPath;
    locale.fKk = this.field_songMediaId;
    locale.fKm = this.field_songSnsAlbumUser;
    locale.fKo = this.field_songSnsShareUser;
    locale.fKq = this.field_hideBanner;
    locale.fKr = this.field_jsWebUrlDomain;
    locale.startTime = this.field_startTime;
    locale.fKs = this.fKs;
    locale.protocol = this.field_protocol;
    locale.fKt = this.field_barBackToWebView;
    locale.fKu = this.field_musicbar_url;
    locale.playUrl = this.playUrl;
    AppMethodBeat.o(105032);
    return locale;
  }

  public final boolean g(a parama)
  {
    AppMethodBeat.i(105031);
    boolean bool;
    if (parama == null)
    {
      bool = false;
      AppMethodBeat.o(105031);
    }
    while (true)
    {
      return bool;
      bool = this.field_musicId.equals(parama.field_musicId);
      AppMethodBeat.o(105031);
    }
  }

  public final boolean w(int[] paramArrayOfInt)
  {
    boolean bool = true;
    if ((this.field_songBgColor == paramArrayOfInt[0]) && (this.field_songLyricColor == paramArrayOfInt[1]));
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.e.a
 * JD-Core Version:    0.6.2
 */