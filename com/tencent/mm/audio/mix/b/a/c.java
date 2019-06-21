package com.tencent.mm.audio.mix.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.b.d;
import com.tencent.mm.audio.mix.h.a;
import com.tencent.mm.audio.mix.h.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
  implements f
{
  private String appId;

  public c(String paramString)
  {
    this.appId = paramString;
  }

  public final void Dp()
  {
    AppMethodBeat.i(137004);
    b.i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "runTask, appId:%s", new Object[] { this.appId });
    d locald = d.Dm();
    synchronized (locald.ckQ)
    {
      Iterator localIterator = locald.ckO.iterator();
      while (localIterator.hasNext())
      {
        Object localObject3 = (String)localIterator.next();
        localObject3 = (com.tencent.mm.audio.mix.a.c)locald.ckP.get(localObject3);
        if (localObject3 != null)
          ((com.tencent.mm.audio.mix.a.c)localObject3).recycle();
      }
    }
    localObject1.ckO.clear();
    localObject1.ckP.clear();
    b.i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "delete all pcm cache File");
    ??? = d.Dm().Do();
    if (((ArrayList)???).size() > 0)
      a.b(this.appId, (ArrayList)???);
    AppMethodBeat.o(137004);
  }

  public final void end()
  {
    AppMethodBeat.i(137005);
    b.i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "end task");
    AppMethodBeat.o(137005);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.b.a.c
 * JD-Core Version:    0.6.2
 */