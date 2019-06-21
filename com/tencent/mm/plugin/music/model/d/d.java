package com.tencent.mm.plugin.music.model.d;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.f.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class d
{
  public static long fqM;
  public static boolean oNi;
  public static boolean oNj;
  public static int oNk;
  public static int oNl;
  private static com.tencent.mm.plugin.music.model.e.a oNm;
  public static int scene;

  public static final void KX()
  {
    AppMethodBeat.i(105014);
    if (fqM > 0L)
    {
      oNl = (int)(oNl + (System.currentTimeMillis() - fqM) / 1000L);
      fqM = 0L;
    }
    AppMethodBeat.o(105014);
  }

  public static void a(int paramInt, com.tencent.mm.plugin.music.model.e.a parama)
  {
    AppMethodBeat.i(105019);
    if (parama == null)
    {
      ab.e("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat music is null, err");
      AppMethodBeat.o(105019);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat scene:%d, action:%d, src:%s, title:%s, singer:%s", new Object[] { Integer.valueOf(parama.field_musicType), Integer.valueOf(paramInt), parama.field_songWifiUrl, parama.field_songName, parama.field_songSinger });
      com.tencent.mm.plugin.report.service.h.pYm.e(15106, new Object[] { Integer.valueOf(parama.field_musicType), Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis()), parama.field_songWifiUrl, parama.field_songName, parama.field_songSinger });
      AppMethodBeat.o(105019);
    }
  }

  public static final void ad(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(105011);
    com.tencent.mm.plugin.music.model.e.a locala = ((com.tencent.mm.plugin.music.e.e)b.ar(com.tencent.mm.plugin.music.e.e.class)).bTU();
    if (locala != null)
    {
      ab.v("MicroMsg.Music.MusicReportUtil", "kvReportShakeReport: %d, %d, %d, %s, %s, %s, %s, %d %s, %s", new Object[] { Integer.valueOf(13042), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt3), locala.field_songSinger, locala.field_appId });
      com.tencent.mm.plugin.report.service.h.pYm.e(13042, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt3), locala.field_songSinger, locala.field_appId });
    }
    AppMethodBeat.o(105011);
  }

  public static final void bUs()
  {
    int i = 1;
    try
    {
      AppMethodBeat.i(105013);
      Object localObject1;
      String str1;
      String str2;
      int j;
      int k;
      int m;
      int n;
      label76: String str3;
      if (oNm != null)
      {
        KX();
        localObject1 = oNm.field_musicId;
        str1 = oNm.field_songName;
        str2 = oNm.field_songAlbum;
        j = oNm.field_songId;
        k = oNk;
        m = oNl;
        if (!oNi)
          break label378;
        n = 1;
        if (!oNj)
          break label384;
        i1 = 1;
        ab.v("MicroMsg.Music.MusicReportUtil", "kvReportMusicPlayInfo: %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", new Object[] { Integer.valueOf(13044), localObject1, str1, str2, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(scene), oNm.field_songSinger, oNm.field_appId });
        localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
        str1 = oNm.field_musicId;
        str3 = oNm.field_songName;
        str2 = oNm.field_songAlbum;
        m = oNm.field_songId;
        k = oNk;
        j = oNl;
        if (!oNi)
          break label390;
        n = 1;
        label235: if (!oNj)
          break label396;
      }
      label384: label390: label396: for (int i1 = i; ; i1 = 2)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject1).e(13044, new Object[] { str1, str3, str2, Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(scene), oNm.field_songSinger, oNm.field_appId });
        oNm = null;
        oNi = false;
        oNj = false;
        oNk = 0;
        oNl = 0;
        fqM = 0L;
        scene = 0;
        AppMethodBeat.o(105013);
        return;
        label378: n = 2;
        break;
        i1 = 2;
        break label76;
        n = 2;
        break label235;
      }
    }
    finally
    {
    }
  }

  public static final void bUt()
  {
    AppMethodBeat.i(105015);
    com.tencent.mm.plugin.report.service.h.pYm.a(285L, 4L, 1L, false);
    AppMethodBeat.o(105015);
  }

  public static final void eJ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105012);
    com.tencent.mm.plugin.music.model.e.a locala = ((com.tencent.mm.plugin.music.e.e)b.ar(com.tencent.mm.plugin.music.e.e.class)).bTU();
    if (locala != null)
    {
      ab.v("MicroMsg.Music.MusicReportUtil", "kvReportAction: %d, %s, %s, %s, %s, %d, %d, %s, %s", new Object[] { Integer.valueOf(13232), locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), locala.field_songSinger, locala.field_appId });
      com.tencent.mm.plugin.report.service.h.pYm.e(13232, new Object[] { locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), locala.field_songSinger, locala.field_appId });
    }
    AppMethodBeat.o(105012);
  }

  public static void f(com.tencent.mm.plugin.music.model.e.a parama)
  {
    try
    {
      oNm = parama;
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public static void s(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(105020);
    if (parame == null)
    {
      ab.e("MicroMsg.Music.MusicReportUtil", "idKeyReportMusicPlayerSum music is null");
      AppMethodBeat.o(105020);
    }
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      parame = new IDKey();
      parame.SetID(558);
      parame.SetKey(0);
      parame.SetValue(1L);
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(558);
      localIDKey.SetValue(1L);
      localIDKey = new IDKey();
      localIDKey.SetID(558);
      localIDKey.SetValue(1L);
      localIDKey.SetKey(10);
      localArrayList.add(parame);
      localArrayList.add(localIDKey);
      com.tencent.mm.plugin.report.service.h.pYm.b(localArrayList, true);
      AppMethodBeat.o(105020);
    }
  }

  public static final void zO(int paramInt)
  {
    AppMethodBeat.i(105016);
    if (paramInt == 2)
    {
      com.tencent.mm.aw.e locale = com.tencent.mm.aw.a.aih();
      if (locale != null)
        com.tencent.mm.plugin.fav.a.h.j(bo.getLong(locale.fKs, 0L), 1, 0);
    }
    AppMethodBeat.o(105016);
  }

  public static final void zP(int paramInt)
  {
    AppMethodBeat.i(105017);
    if (paramInt == 2)
    {
      com.tencent.mm.aw.e locale = com.tencent.mm.aw.a.aih();
      if (locale != null)
        com.tencent.mm.plugin.fav.a.h.j(bo.getLong(locale.fKs, 0L), 0, 0);
    }
    AppMethodBeat.o(105017);
  }

  public static final void zQ(int paramInt)
  {
    AppMethodBeat.i(105018);
    com.tencent.mm.plugin.music.model.e.a locala = ((com.tencent.mm.plugin.music.e.e)b.ar(com.tencent.mm.plugin.music.e.e.class)).bTU();
    if (locala != null)
    {
      ab.i("MicroMsg.Music.MusicReportUtil", "ReportMusicPlayerShareStat ShareType:%d, MusicId:%s, MusicTitle:%s, Singer:%s, AppId:%s", new Object[] { Integer.valueOf(paramInt), locala.field_musicId, locala.field_songName, locala.field_songSinger, locala.field_appId });
      com.tencent.mm.plugin.report.service.h.pYm.e(12836, new Object[] { Integer.valueOf(paramInt), locala.field_musicId, locala.field_songName, locala.field_songSinger, locala.field_appId });
    }
    AppMethodBeat.o(105018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.d.d
 * JD-Core Version:    0.6.2
 */