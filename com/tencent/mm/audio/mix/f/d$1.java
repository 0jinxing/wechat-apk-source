package com.tencent.mm.audio.mix.f;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.b.a;
import com.tencent.mm.audio.mix.e.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

final class d$1
  implements Runnable
{
  d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137168);
    Process.setThreadPriority(-19);
    if (this.cnW.cnw.get())
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixPlayerImpl", "stop and exit");
      AppMethodBeat.o(137168);
      return;
    }
    if (this.cnW.aQf == null)
      d.a(this.cnW);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "playback start");
    do
    {
      if (!this.cnW.cnw.get())
      {
        localObject1 = this.cnW;
        synchronized (((d)localObject1).cny)
        {
          while (true)
            if ((((d)localObject1).cnv.get()) && (!((d)localObject1).cnw.get()))
            {
              com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "waitPlay");
              try
              {
                ((d)localObject1).cny.wait();
              }
              catch (Exception localException)
              {
                com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", localException, "waitPlay", new Object[0]);
              }
            }
        }
        if (this.cnW.cnw.get())
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixPlayerImpl", "playback break");
      }
      else
      {
        this.cnW.Er();
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "release AudioTrack and exit playback thread id:%d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
        AppMethodBeat.o(137168);
        break;
      }
      ??? = this.cnW.Eo();
    }
    while (??? == null);
    Object localObject1 = ((com.tencent.mm.audio.mix.a.b)???).ckv;
    if (this.cnW.aQf == null)
      d.a(this.cnW);
    d locald;
    label329: String str;
    if ((localObject1 != null) && (localObject1.length > 0))
    {
      if ((this.cnW.aQf != null) && ((this.cnW.aQf.getPlayState() == 1) || (this.cnW.aQf.getPlayState() == 2)))
        this.cnW.aQf.play();
      ??? = this.cnW;
      ((d)???).cnT += 1;
      locald = this.cnW;
      Iterator localIterator = ((com.tencent.mm.audio.mix.a.b)???).ckw.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label474;
        str = (String)localIterator.next();
        synchronized (locald.cnz)
        {
          if (!TextUtils.isEmpty(str))
            if ((!locald.cmD.containsKey(str)) || (!((Boolean)locald.cmD.get(str)).booleanValue()))
              break;
        }
      }
      if (!locald.cmD.containsKey(str))
        break label698;
      locald.cmD.put(str, Boolean.TRUE);
    }
    label522: label698: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label329;
      locald.mHandler.post(new d.2(locald, str));
      break label329;
      label474: long l = System.currentTimeMillis();
      if (this.cnW.aQf != null)
        if (this.cnW.cnB.DX())
        {
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "isMute");
          this.cnW.aQf.setStereoVolume(0.0F, 0.0F);
        }
      for (i = this.cnW.aQf.write((byte[])localObject1, 0, localObject1.length); ; i = 0)
      {
        l = System.currentTimeMillis() - l;
        if (l > 100L)
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixPlayerImpl", "write audio track after writeSize:%d, time:%d, writeCount:%d", new Object[] { Integer.valueOf(i), Long.valueOf(l), Integer.valueOf(this.cnW.cnT) });
        if (i < 0)
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixPlayerImpl", "write audio track buffer failed, Size:%d", new Object[] { Integer.valueOf(i) });
        if (this.cnW.cnx.size() == 0)
        {
          this.cnW.cnR[0] = ((byte)localObject1[(localObject1.length - 2)]);
          this.cnW.cnR[1] = ((byte)localObject1[(localObject1.length - 1)]);
        }
        a.Dg().a(localb);
        break;
        this.cnW.aQf.setStereoVolume(1.0F, 1.0F);
        break label522;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.f.d.1
 * JD-Core Version:    0.6.2
 */