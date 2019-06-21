package com.tencent.mm.plugin.music.b;

import android.os.MessageQueue.IdleHandler;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.f.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class f$4
  implements MessageQueue.IdleHandler
{
  f$4(f paramf, String paramString)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(137273);
    com.tencent.mm.ag.b localb = (com.tencent.mm.ag.b)this.oJW.oJC.get(this.oJX);
    if (localb == null)
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "preloadMixCache param is null");
    long l1;
    long l2;
    c localc;
    int i;
    int j;
    if ((!TextUtils.isEmpty(localb.filePath)) && (!this.oJW.oJP.ee(localb.filePath)))
    {
      l1 = com.tencent.mm.audio.mix.h.a.ek(localb.filePath);
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "preloadMixCache preload filePath:%s, fileSize:%d", new Object[] { localb.filePath, Long.valueOf(l1) });
      l2 = com.tencent.mm.audio.mix.b.d.Dm().Dn();
      localc = this.oJW.oJP;
      long l3 = com.tencent.mm.audio.mix.b.d.Dm().Dn();
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "cacheInMemoryTotalSize:%d, appId:%s", new Object[] { Long.valueOf(l3), localc.appId });
      if (l3 >= 50000000L)
      {
        i = 1;
        if (i != 0)
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixPlayer", "isLoadedCacheExceedMaxMemory, exceed max cache 50M!, appId:%s", new Object[] { localc.appId });
        j = 0;
        if (this.oJW.oJO.containsKey(localb.filePath))
          j = ((Integer)this.oJW.oJO.get(localb.filePath)).intValue();
        if (i == 0)
          break label286;
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "loaded cache is exceed Max Memory 50M, don't load more audio into memory!");
        if (this.oJW.oJL != null)
          this.oJW.oJL.zs(713);
        this.oJW.oJP.ec("");
      }
    }
    while (true)
    {
      AppMethodBeat.o(137273);
      return false;
      i = 0;
      break;
      label286: if (l2 + l1 > 50000000L)
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "loaded cache and loading fileSize is exceed Max Memory 50M, don't load more audio into memory!  loadCacheBufferSize:%d, fileSize:%d", new Object[] { Long.valueOf(l2), Long.valueOf(l1) });
        if (this.oJW.oJL != null)
          this.oJW.oJL.zs(714);
        this.oJW.oJP.ec("");
      }
      else if (j >= 30)
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "load audio fail number exceed MAX_LOAD_FAIL_COUNT, don't load again!");
      }
      else if (!com.tencent.mm.audio.mix.h.a.ej(localb.filePath))
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "don't support load large file and invalid file");
      }
      else
      {
        localc = this.oJW.oJP;
        String str = localb.filePath;
        if (!localc.cnp.dB(str))
        {
          localb.fqX = true;
          localb.fileSize = l1;
          this.oJW.oJP.a(localb);
        }
        else
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "mix audio cache is loading");
          continue;
          if (!TextUtils.isEmpty(localb.filePath))
          {
            localb.fqX = false;
            if (!this.oJW.oJP.dR(this.oJX))
              this.oJW.oJP.b(localb);
            localb.fileSize = com.tencent.mm.audio.mix.h.a.ek(localb.filePath);
          }
          else
          {
            localb.fqX = false;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.f.4
 * JD-Core Version:    0.6.2
 */