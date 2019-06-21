package com.tencent.mm.plugin.music.e;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.g.a.kd.b;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.network.b.b;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService;
import com.tencent.mm.plugin.music.model.notification.b.1;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.amz;
import com.tencent.mm.protocal.protobuf.rl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class m extends g
  implements com.tencent.mm.ai.f, e
{
  private int mode;
  private int oMa;
  private List<String> oMb;
  private com.tencent.mm.plugin.music.model.notification.b oMc;
  private com.tencent.mm.plugin.music.model.b.b oMd;
  private com.tencent.mm.plugin.music.model.b.a oMe;
  private com.tencent.mm.plugin.music.model.b.c oMf;
  private boolean oMg;

  public m()
  {
    AppMethodBeat.i(104840);
    this.mode = 1;
    this.oMb = new ArrayList();
    this.oMc = new com.tencent.mm.plugin.music.model.notification.b();
    AppMethodBeat.o(104840);
  }

  private void bUi()
  {
    AppMethodBeat.i(104853);
    com.tencent.mm.sdk.g.d.post(new a((byte)0), "music_get_list_task");
    AppMethodBeat.o(104853);
  }

  public final String Th(String paramString)
  {
    AppMethodBeat.i(104860);
    paramString = com.tencent.mm.plugin.music.model.a.b.Th(paramString);
    ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "contain shake tag playUrl:%s", new Object[] { paramString });
    paramString = com.tencent.mm.plugin.music.model.a.b.Tl(paramString);
    AppMethodBeat.o(104860);
    return paramString;
  }

  public final URL Ti(String paramString)
  {
    AppMethodBeat.i(104861);
    paramString = new b.b(paramString).url;
    AppMethodBeat.o(104861);
    return paramString;
  }

  public final void a(com.tencent.mm.aw.e parame, int paramInt)
  {
    AppMethodBeat.i(104867);
    super.a(parame, paramInt);
    com.tencent.mm.plugin.music.model.d.d.bUs();
    AppMethodBeat.o(104867);
  }

  public final void a(com.tencent.mm.plugin.music.model.e.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(104869);
    if (parama == null)
      AppMethodBeat.o(104869);
    while (true)
    {
      return;
      if (this.oMd != null)
      {
        com.tencent.mm.kernel.g.RO().eJo.c(this.oMd);
        this.oMd = null;
      }
      if (parama.field_songId <= 0)
      {
        ab.e("MicroMsg.Music.MusicWechatPrivateLogic", "can't get songId ");
        h.pYm.X(10911, "1");
        AppMethodBeat.o(104869);
      }
      else
      {
        this.oMd = new com.tencent.mm.plugin.music.model.b.b(parama, paramBoolean);
        com.tencent.mm.kernel.g.RO().eJo.a(this.oMd, 0);
        AppMethodBeat.o(104869);
      }
    }
  }

  public final com.tencent.mm.aw.e bTQ()
  {
    AppMethodBeat.i(104850);
    Object localObject;
    if (this.oMb.size() <= this.oMa)
    {
      AppMethodBeat.o(104850);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = (String)this.oMb.get(this.oMa);
      localObject = com.tencent.mm.plugin.music.model.e.bUk().Tp((String)localObject);
      if (localObject != null)
      {
        localObject = ((com.tencent.mm.plugin.music.model.e.a)localObject).bUw();
        AppMethodBeat.o(104850);
      }
      else
      {
        AppMethodBeat.o(104850);
        localObject = null;
      }
    }
  }

  public final com.tencent.mm.plugin.music.model.e.a bTU()
  {
    AppMethodBeat.i(104849);
    Object localObject;
    if (this.oMb.size() <= this.oMa)
    {
      localObject = null;
      AppMethodBeat.o(104849);
    }
    while (true)
    {
      return localObject;
      localObject = (String)this.oMb.get(this.oMa);
      localObject = com.tencent.mm.plugin.music.model.e.bUk().Tp((String)localObject);
      AppMethodBeat.o(104849);
    }
  }

  public final boolean bTV()
  {
    AppMethodBeat.i(104851);
    com.tencent.mm.plugin.music.model.e.a locala = bTU();
    if (locala != null);
    boolean bool;
    switch (locala.field_musicType)
    {
    case 2:
    case 3:
    case 5:
    case 7:
    default:
      bool = false;
      AppMethodBeat.o(104851);
    case 1:
    case 4:
    case 6:
    case 8:
    case 9:
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(104851);
    }
  }

  public final List<String> bTW()
  {
    return this.oMb;
  }

  public final void bTX()
  {
    this.mode = 1;
  }

  public final void bTY()
  {
    AppMethodBeat.i(104855);
    if (this.mode == 1)
      AppMethodBeat.o(104855);
    while (true)
    {
      return;
      this.oMa += 1;
      this.oMa %= this.oMb.size();
      this.oLQ.ju(true);
      this.oLQ.p(null);
      AppMethodBeat.o(104855);
    }
  }

  public final void bTZ()
  {
    AppMethodBeat.i(104856);
    if (this.mode == 1)
      AppMethodBeat.o(104856);
    while (true)
    {
      return;
      this.oMa = (this.oMa + this.oMb.size() - 1);
      this.oMa %= this.oMb.size();
      this.oLQ.ju(true);
      this.oLQ.p(null);
      AppMethodBeat.o(104856);
    }
  }

  public final int bUa()
  {
    return this.oMa;
  }

  public final void bUb()
  {
    AppMethodBeat.i(104857);
    if (!this.oLQ.bTS().aie())
    {
      ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "really exit music");
      this.mode = 1;
    }
    AppMethodBeat.o(104857);
  }

  public final boolean bUc()
  {
    AppMethodBeat.i(104858);
    boolean bool;
    if ((this.oMb.size() > 0) && (this.mode == 2))
    {
      bool = true;
      AppMethodBeat.o(104858);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104858);
    }
  }

  public final void d(List<com.tencent.mm.aw.e> paramList, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(104848);
        if ((paramList == null) || (paramList.size() == 0))
        {
          ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "appendMusicList error");
          AppMethodBeat.o(104848);
          return;
        }
        if (paramBoolean)
          this.oMb.clear();
        Iterator localIterator = paramList.iterator();
        if (localIterator.hasNext())
        {
          paramList = (com.tencent.mm.aw.e)localIterator.next();
          this.oMb.add(com.tencent.mm.plugin.music.h.b.K(paramList));
          com.tencent.mm.plugin.music.model.e.bUk().x(paramList);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(104848);
    }
  }

  public final boolean g(com.tencent.mm.aw.e parame)
  {
    boolean bool = true;
    AppMethodBeat.i(104843);
    if (parame == null)
    {
      ab.e("MicroMsg.Music.MusicWechatPrivateLogic", "musicWrapper is false, do not start music");
      AppMethodBeat.o(104843);
      bool = false;
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.music.model.e.a locala = bTU();
      int i;
      if (locala != null)
      {
        if (locala != null)
          break label80;
        i = 0;
      }
      while (true)
      {
        if (i != 0)
          break label122;
        ab.e("MicroMsg.Music.MusicWechatPrivateLogic", "music or url is null, do not start music");
        this.oLQ.r(parame);
        AppMethodBeat.o(104843);
        bool = false;
        break;
        label80: if ((TextUtils.isEmpty(locala.field_songWifiUrl)) && (TextUtils.isEmpty(locala.field_songWapLinkUrl)) && (TextUtils.isEmpty(locala.field_songWebUrl)))
          i = 0;
        else
          i = 1;
      }
      label122: if (locala.field_isBlock == 1)
      {
        ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "not play music, music is block %s", new Object[] { locala.field_musicId });
        this.oLQ.r(parame);
        com.tencent.mm.plugin.music.model.d.d.s(parame);
        AppMethodBeat.o(104843);
        bool = false;
      }
      else
      {
        ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "musicType %d", new Object[] { Integer.valueOf(locala.field_musicType) });
        ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "music protocol:%s", new Object[] { locala.field_protocol });
        locala.playUrl = parame.playUrl;
        if (this.oMe != null)
          com.tencent.mm.kernel.g.RO().eJo.c(this.oMe);
        com.tencent.mm.kernel.g.RO().eJo.a(940, this);
        this.oMe = new com.tencent.mm.plugin.music.model.b.a(locala.field_musicType, locala);
        com.tencent.mm.kernel.g.RO().eJo.a(this.oMe, 0);
        if (com.tencent.mm.plugin.music.model.a.b.b(locala))
        {
          ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "get shake music new url to play");
          parame = locala.playUrl;
          if (TextUtils.isEmpty(parame))
            ab.e("MicroMsg.Music.MusicWechatPrivateLogic", "GetShakeMusicUrl, url is null");
          while (true)
          {
            AppMethodBeat.o(104843);
            bool = false;
            break;
            if (this.oMf != null)
            {
              com.tencent.mm.kernel.g.RO().eJo.c(this.oMf);
              this.oMf = null;
            }
            ab.e("MicroMsg.Music.MusicWechatPrivateLogic", "GetShakeMusicUrl, url is %s", new Object[] { parame });
            this.oMf = new com.tencent.mm.plugin.music.model.b.c(parame);
            com.tencent.mm.kernel.g.RO().eJo.a(this.oMf, 0);
            h.pYm.a(558L, 213L, 1L, true);
          }
        }
        AppMethodBeat.o(104843);
      }
    }
  }

  public final int getMode()
  {
    return this.mode;
  }

  public final com.tencent.mm.aw.e h(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104844);
    Object localObject = com.tencent.mm.plugin.music.h.b.K(parame);
    int i;
    if (this.oMb != null)
    {
      i = 0;
      if (i < this.oMb.size())
        if (((String)localObject).equals(this.oMb.get(i)))
        {
          this.oMa = i;
          i = 1;
          label57: j = i;
          if (this.oMb.size() > 1)
          {
            j = i;
            if (parame.fKp)
              this.mode = 2;
          }
        }
    }
    for (int j = i; ; j = 0)
    {
      if (j != 0)
        localObject = bTQ();
      while (true)
      {
        AppMethodBeat.o(104844);
        return localObject;
        i++;
        break;
        this.oMb.clear();
        this.oMb.add(com.tencent.mm.plugin.music.h.b.K(parame));
        this.oMa = 0;
        com.tencent.mm.plugin.music.model.e.bUk().x(parame);
        localObject = parame;
        if (this.mode == 2)
        {
          bUi();
          localObject = parame;
        }
      }
      i = 0;
      break label57;
    }
  }

  public final com.tencent.mm.aw.e i(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104845);
    com.tencent.mm.aw.e locale;
    if ((parame == null) && (this.oMb.size() == 0))
    {
      ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "musicWrapper is null && musicList's size is 0");
      locale = null;
      AppMethodBeat.o(104845);
      return locale;
    }
    if (parame == null)
      locale = bTQ();
    while (true)
    {
      AppMethodBeat.o(104845);
      break;
      this.oMb.clear();
      this.oMb.add(com.tencent.mm.plugin.music.h.b.K(parame));
      this.oMa = 0;
      com.tencent.mm.plugin.music.model.e.bUk().x(parame);
      locale = parame;
      if (this.mode == 2)
      {
        bUi();
        locale = parame;
      }
    }
  }

  public final void init()
  {
    AppMethodBeat.i(104841);
    super.init();
    com.tencent.mm.kernel.g.RO().eJo.a(520, this);
    com.tencent.mm.kernel.g.RO().eJo.a(769, this);
    com.tencent.mm.plugin.music.model.notification.b localb = this.oMc;
    ab.i("MicroMsg.Music.MMMusicNotificationHelper", "initMusicPlayerService");
    localb.hAA = new b.1(localb);
    localb.hAA.dnU();
    AppMethodBeat.o(104841);
  }

  public final void j(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104847);
    if (parame != null)
    {
      this.oMb.clear();
      this.oMb.add(com.tencent.mm.plugin.music.h.b.K(parame));
      this.oMa = 0;
      com.tencent.mm.plugin.music.model.e.bUk().x(parame);
      AppMethodBeat.o(104847);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "shake music item is null");
      AppMethodBeat.o(104847);
    }
  }

  public final void k(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104862);
    super.k(parame);
    com.tencent.mm.plugin.music.model.d.d.bUs();
    com.tencent.mm.plugin.music.model.d.d.fqM = System.currentTimeMillis();
    com.tencent.mm.plugin.music.model.d.d.f(bTU());
    AppMethodBeat.o(104862);
  }

  public final void l(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104863);
    super.l(parame);
    com.tencent.mm.plugin.music.model.d.d.fqM = System.currentTimeMillis();
    AppMethodBeat.o(104863);
  }

  public final com.tencent.mm.aw.e m(List<com.tencent.mm.aw.e> paramList, int paramInt)
  {
    AppMethodBeat.i(104846);
    if ((paramList == null) || (paramList.size() == 0) || (paramInt >= paramList.size()))
    {
      ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "music wrapper list error");
      paramList = null;
      AppMethodBeat.o(104846);
    }
    while (true)
    {
      return paramList;
      this.oMb.clear();
      for (int i = 0; i < paramList.size(); i++)
      {
        com.tencent.mm.aw.e locale = (com.tencent.mm.aw.e)paramList.get(i);
        this.oMb.add(com.tencent.mm.plugin.music.h.b.K(locale));
        com.tencent.mm.plugin.music.model.e.bUk().x(locale);
      }
      this.oMa = paramInt;
      this.mode = 2;
      ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "startPlayNewMusicList:%d", new Object[] { Integer.valueOf(this.oMa) });
      paramList = bTQ();
      AppMethodBeat.o(104846);
    }
  }

  public final void m(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104864);
    super.m(parame);
    com.tencent.mm.plugin.music.model.d.d.KX();
    AppMethodBeat.o(104864);
  }

  public final void n(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104865);
    super.n(parame);
    com.tencent.mm.plugin.music.model.d.d.bUs();
    AppMethodBeat.o(104865);
  }

  public final void o(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104866);
    super.o(parame);
    com.tencent.mm.plugin.music.model.d.d.bUs();
    if (this.mode == 2)
      bTY();
    AppMethodBeat.o(104866);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(104868);
    Object localObject1;
    if ((paramm instanceof com.tencent.mm.plugin.music.model.b.a))
    {
      ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "onSceneEnd errCode:%d", new Object[] { Integer.valueOf(paramInt2) });
      com.tencent.mm.kernel.g.RO().eJo.b(940, this);
      if ((paramInt1 != 4) || (paramInt2 != -24))
        break label772;
      paramm = ((com.tencent.mm.plugin.music.model.b.a)paramm).oMF;
      if ((bTU() != null) && (paramm.fJU.equals(bTU().field_musicId)))
        this.oLQ.aic();
      paramString = com.tencent.mm.plugin.music.model.e.bUk();
      paramm = paramm.fJU;
      localObject1 = new ContentValues();
      ((ContentValues)localObject1).put("isBlock", Integer.valueOf(1));
      paramString.bSd.update("Music", (ContentValues)localObject1, "musicId=?", new String[] { paramm });
      paramString = (com.tencent.mm.plugin.music.model.e.a)paramString.oNq.get(paramm);
      if (paramString != null)
        paramString.field_isBlock = 1;
      ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "onSceneEnd music is block %s", new Object[] { bTU().field_musicId });
      AppMethodBeat.o(104868);
    }
    while (true)
    {
      return;
      if ((paramm instanceof com.tencent.mm.plugin.music.model.b.b))
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          AppMethodBeat.o(104868);
        }
        else
        {
          paramString = (com.tencent.mm.plugin.music.model.b.b)paramm;
          Object localObject2 = paramString.oMG;
          localObject1 = paramString.oMw.field_musicId;
          if ((localObject2 != null) && (localObject1 != null))
          {
            Object localObject3 = this.oMb.iterator();
            while (((Iterator)localObject3).hasNext())
            {
              paramm = (String)((Iterator)localObject3).next();
              if (paramm.equals(localObject1))
              {
                localObject3 = aa.b(((amz)localObject2).wrD);
                localObject1 = aa.b(((amz)localObject2).wrE);
                localObject2 = aa.b(((amz)localObject2).wrC);
                com.tencent.mm.plugin.music.model.e.b localb = com.tencent.mm.plugin.music.model.e.bUk();
                boolean bool = paramString.oMH;
                com.tencent.mm.plugin.music.model.e.a locala = localb.Tp(paramm);
                if (locala == null)
                  ab.e("MicroMsg.Music.MusicStorage", "updateMusicWithLyricResponse can not find music %s", new Object[] { paramm });
                while (true)
                {
                  ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "get response %s %s %s", new Object[] { localObject3, localObject1, localObject2 });
                  if (bo.isNullOrNil((String)localObject1))
                    break label561;
                  paramm = new ke();
                  paramm.cFH.action = 6;
                  paramm.cFH.cFI = paramString.oMw.field_musicId;
                  com.tencent.mm.sdk.b.a.xxA.a(paramm, Looper.getMainLooper());
                  AppMethodBeat.o(104868);
                  break;
                  if (!bo.isNullOrNil((String)localObject3))
                    locala.field_songAlbumUrl = ((String)localObject3);
                  locala.field_songHAlbumUrl = ((String)localObject1);
                  locala.field_songLyric = ((String)localObject2);
                  localb.c(locala, new String[] { "songAlbumUrl", "songHAlbumUrl", "songLyric" });
                  localb.oNq.put(paramm, locala);
                  localb.c(locala, bool);
                }
              }
            }
          }
          label561: AppMethodBeat.o(104868);
        }
      }
      else
      {
        if ((paramm instanceof com.tencent.mm.plugin.music.model.b.c))
        {
          ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "GetShakeMusicUrl onSceneEnd errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          paramm = (com.tencent.mm.plugin.music.model.b.c)paramm;
          ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "getShakeMusicUrlScene callback, playUrl:%s, tempPlayUrl:%s", new Object[] { paramm.playUrl, paramm.oMJ });
          if ((paramInt1 != 0) || (paramInt2 != 0))
            h.pYm.a(558L, 214L, 1L, true);
          while (true)
          {
            paramString = bTU();
            if ((paramString == null) || (TextUtils.isEmpty(paramString.playUrl)) || (!paramString.playUrl.equalsIgnoreCase(paramm.playUrl)))
              break label741;
            ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is same, start to play shake music");
            this.oLQ.q(paramString.bUw());
            AppMethodBeat.o(104868);
            break;
            com.tencent.mm.plugin.music.model.a.b.fq(paramm.playUrl, paramm.oMJ);
          }
          label741: if (paramString != null)
            ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is diff, don't play, current playUrl is %s, netscene playUrl is %s", new Object[] { paramString.playUrl, paramm.playUrl });
        }
        label772: AppMethodBeat.o(104868);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(104842);
    this.oMb.clear();
    com.tencent.mm.kernel.g.RO().eJo.b(520, this);
    com.tencent.mm.kernel.g.RO().eJo.b(940, this);
    com.tencent.mm.kernel.g.RO().eJo.b(769, this);
    com.tencent.mm.plugin.music.model.notification.b localb = this.oMc;
    ab.i("MicroMsg.Music.MMMusicNotificationHelper", "uninitMusicPlayerService");
    Intent localIntent = new Intent();
    localIntent.setClass(ah.getContext(), MMMusicPlayerService.class);
    ah.getContext().stopService(localIntent);
    localb.oMK = null;
    localb.hAA.dead();
    AppMethodBeat.o(104842);
  }

  public final void xs(int paramInt)
  {
    AppMethodBeat.i(104852);
    h.pYm.a(285L, 2L, 1L, false);
    if (this.mode == 1)
      if (this.oMg)
      {
        ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "already running get list");
        AppMethodBeat.o(104852);
      }
    while (true)
    {
      return;
      this.mode = 2;
      if (this.oMb.size() <= 1)
        bUi();
      while (true)
      {
        com.tencent.mm.plugin.music.model.d.d.ad(1, 2, paramInt);
        AppMethodBeat.o(104852);
        break;
        localke = new ke();
        localke.cFH.action = 5;
        com.tencent.mm.sdk.b.a.xxA.m(localke);
      }
      this.mode = 1;
      ke localke = new ke();
      localke.cFH.action = 5;
      com.tencent.mm.sdk.b.a.xxA.m(localke);
      com.tencent.mm.plugin.music.model.d.d.ad(2, 1, paramInt);
      AppMethodBeat.o(104852);
    }
  }

  public final boolean zF(int paramInt)
  {
    AppMethodBeat.i(104859);
    boolean bool = com.tencent.mm.plugin.music.model.c.a.zF(paramInt);
    AppMethodBeat.o(104859);
    return bool;
  }

  public final void zH(int paramInt)
  {
    AppMethodBeat.i(104854);
    if (this.oMb.size() == 0)
      AppMethodBeat.o(104854);
    while (true)
    {
      return;
      int i = (paramInt - 100000) % this.oMb.size();
      paramInt = i;
      if (i < 0)
        paramInt = i + this.oMb.size();
      if (paramInt != this.oMa)
      {
        this.oMa = paramInt;
        this.oLQ.p(null);
      }
      AppMethodBeat.o(104854);
    }
  }

  final class a
    implements Runnable
  {
    private a()
    {
    }

    public final void run()
    {
      AppMethodBeat.i(104838);
      long l = System.currentTimeMillis();
      m.a(m.this, true);
      Object localObject1 = m.this.bTQ();
      ArrayList localArrayList = new ArrayList();
      ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "musicWrapper.MusicType:%d", new Object[] { Integer.valueOf(((com.tencent.mm.aw.e)localObject1).fJS) });
      int i;
      label117: Object localObject2;
      switch (((com.tencent.mm.aw.e)localObject1).fJS)
      {
      case 2:
      case 3:
      case 5:
      case 7:
      default:
        localObject1 = null;
        if (localObject1 == null)
          break label341;
        i = 0;
        if (i >= ((List)localObject1).size())
          break label341;
        localObject2 = (com.tencent.mm.aw.e)((List)localObject1).get(i);
        if (localObject2 == null)
          ab.e("MicroMsg.Music.MusicWechatPrivateLogic", "wrapper is null, continue");
        break;
      case 6:
      case 4:
      case 1:
      case 8:
      }
      while (true)
      {
        i++;
        break label117;
        localObject1 = new gh();
        ((gh)localObject1).cAH.type = 18;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = ((gh)localObject1).cAI.cAV;
        break;
        localObject1 = new kd();
        ((kd)localObject1).cFz.action = -4;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = ((kd)localObject1).cFA.cAV;
        break;
        localObject1 = new kd();
        ((kd)localObject1).cFz.action = -5;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = ((kd)localObject1).cFA.cAV;
        break;
        localObject2 = new kd();
        ((kd)localObject2).cFz.action = -6;
        ((kd)localObject2).cFz.cFB = ((com.tencent.mm.aw.e)localObject1);
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        localObject1 = ((kd)localObject2).cFA.cAV;
        break;
        com.tencent.mm.plugin.music.model.e.bUk().x((com.tencent.mm.aw.e)localObject2);
        localArrayList.add(com.tencent.mm.plugin.music.h.b.K((com.tencent.mm.aw.e)localObject2));
      }
      label341: ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "GetMusicWrapperListTask run time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      m.a(m.this, false);
      localObject1 = new m.b(m.this, (byte)0);
      ((m.b)localObject1).oMi = localArrayList;
      al.d((Runnable)localObject1);
      AppMethodBeat.o(104838);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.e.m
 * JD-Core Version:    0.6.2
 */