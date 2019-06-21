package com.tencent.mm.plugin.emojicapture.model.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.f.e;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.ui.b.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixTask;", "Lcom/tencent/mm/loader/loader/IWorkTask;", "mixInfo", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixInfo;", "(Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixInfo;)V", "TAG", "", "mixCost", "", "getMixCost", "()J", "setMixCost", "(J)V", "getMixInfo", "()Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixInfo;", "timeEnter", "getTimeEnter", "call", "", "handleResult", "success", "", "uniqueId", "plugin-emojicapture_release"})
public final class h extends com.tencent.mm.loader.g.c
{
  final String TAG;
  final long ezZ;
  long liJ;
  final d liK;

  public h(d paramd)
  {
    AppMethodBeat.i(2680);
    this.liK = paramd;
    this.TAG = "MicroMsg.EmojiMixTask";
    this.ezZ = this.liK.ezZ;
    AppMethodBeat.o(2680);
  }

  public final void Pa()
  {
    Object localObject1 = null;
    AppMethodBeat.i(2678);
    k localk = new k(this.liK.videoPath, this.liK.liy, this.liK.lis, this.liK.liz, this.liK.liA, this.liK.liB, this.liK.liC, this.liK.ezZ);
    long l = bo.anU();
    Object localObject2 = this.liK.liy.eWG.iterator();
    while (((Iterator)localObject2).hasNext())
      ((com.tencent.mm.media.editor.a.b)((Iterator)localObject2).next()).init();
    EmojiCaptureReporter.up(37);
    Object localObject3 = (a.f.a.b)new h.a(this, l);
    localk.eyR = System.currentTimeMillis();
    com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.WR(localk.videoPath);
    double d;
    label189: label253: boolean bool3;
    label372: int i;
    if (locala != null)
    {
      localObject2 = Integer.valueOf(locala.eTk);
      if (!(localObject2 instanceof Integer))
        break label644;
      d = 1000.0D / locala.eTk;
      localk.lja = ((a.f.a.b)localObject3);
      localObject2 = new StringBuilder("start decode ");
      localObject3 = Thread.currentThread();
      j.o(localObject3, "Thread.currentThread()");
      localObject3 = ((StringBuilder)localObject2).append(((Thread)localObject3).getId()).append(", fps: ");
      if (locala == null)
        break label650;
      localObject2 = Integer.valueOf(locala.eTk);
      localObject3 = ((StringBuilder)localObject3).append(localObject2).append(", duration: ");
      localObject2 = localObject1;
      if (locala != null)
        localObject2 = Integer.valueOf(locala.eWK);
      ab.i("MicroMsg.EmojiMixer", localObject2 + ", videoFrameDuration: " + d + ", removeBackground:" + localk.ljd + ", path: " + localk.videoPath);
      localk.frameCount = 0;
      localObject2 = com.tencent.mm.plugin.emojicapture.model.d.lhz;
      boolean bool1 = localk.ljd;
      boolean bool2 = localk.liB;
      if (localk.liz <= 1)
        break label656;
      bool3 = true;
      if (locala == null)
        break label662;
      i = locala.eWK;
      label384: com.tencent.mm.plugin.emojicapture.model.d.a(bool1, bool2, bool3, i);
      if (!localk.liC)
        break label668;
      localObject2 = com.tencent.mm.plugin.emojicapture.model.d.lhz;
      com.tencent.mm.plugin.emojicapture.model.d.bne();
    }
    while (true)
    {
      localk.liY = ((e)new b(localk.videoPath, (com.tencent.mm.media.f.d)localk.ljc, localk.liz));
      if (!bo.isNullOrNil(localk.hzs))
      {
        localObject2 = localk.hzs;
        localObject1 = com.tencent.mm.plugin.emojicapture.model.c.lhw;
        i = com.tencent.mm.plugin.emojicapture.model.c.bmN();
        localObject1 = com.tencent.mm.plugin.emojicapture.model.c.lhw;
        int j = com.tencent.mm.plugin.emojicapture.model.c.bmN();
        localObject1 = localk.liY;
        if (localObject1 == null)
          j.avw("syncMgr");
        localk.liZ = new c((String)localObject2, i, j, ()((e)localObject1).eWU, localk.liC);
      }
      localObject2 = com.tencent.mm.plugin.emojicapture.model.c.lhw;
      i = com.tencent.mm.plugin.emojicapture.model.c.bmN();
      localObject2 = com.tencent.mm.plugin.emojicapture.model.c.lhw;
      localk.liX = new com.tencent.mm.plugin.emojicapture.ui.b.d(i, com.tencent.mm.plugin.emojicapture.model.c.bmN());
      localObject2 = localk.liX;
      if (localObject2 == null)
        j.avw("mixPixelBuffer");
      ((com.tencent.mm.plugin.emojicapture.ui.b.d)localObject2).loY = ((a.f.a.a)new k.d(localk));
      localObject2 = localk.liX;
      if (localObject2 == null)
        j.avw("mixPixelBuffer");
      localObject1 = (a.f.a.a)new k.e(localk, locala);
      ((com.tencent.mm.plugin.emojicapture.ui.b.d)localObject2).loW.post((Runnable)new d.b((com.tencent.mm.plugin.emojicapture.ui.b.d)localObject2, (a.f.a.a)localObject1));
      AppMethodBeat.o(2678);
      return;
      localObject2 = null;
      break;
      label644: d = 0.0D;
      break label189;
      label650: localObject2 = null;
      break label253;
      label656: bool3 = false;
      break label372;
      label662: i = 0;
      break label384;
      label668: localObject2 = com.tencent.mm.plugin.emojicapture.model.d.lhz;
      com.tencent.mm.plugin.emojicapture.model.d.bnd();
    }
  }

  public final String Pc()
  {
    AppMethodBeat.i(2679);
    long l = this.ezZ;
    AppMethodBeat.o(2679);
    return String.valueOf(l);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.h
 * JD-Core Version:    0.6.2
 */