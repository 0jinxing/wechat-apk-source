package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.f.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

final class f$3
  implements Runnable
{
  f$3(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137272);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "releaseAudioDelayRunnable, run");
    Iterator localIterator = this.oJW.oJz.iterator();
    int i = 0;
    f localf;
    LinkedList localLinkedList;
    if (localIterator.hasNext())
    {
      ??? = (String)localIterator.next();
      if (this.oJW.SA((String)???) != 0)
        break label459;
      localf = this.oJW;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllAudioPlayersAndSaveState, appId:%s", new Object[] { ??? });
      localLinkedList = (LinkedList)localf.oJB.get(???);
      if ((localLinkedList == null) || (localLinkedList.size() == 0))
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
        label110: i = 1;
      }
    }
    label459: 
    while (true)
    {
      break;
      Object localObject4;
      h localh;
      while (true)
      {
        synchronized (localf.lrj)
        {
          localObject4 = localLinkedList.iterator();
          if (!((Iterator)localObject4).hasNext())
            break;
          localObject5 = (String)((Iterator)localObject4).next();
          if (localf.oJP.dR((String)localObject5))
            localf.oJP.dV((String)localObject5);
          localh = (h)localf.oJv.remove(localObject5);
          localf.oJw.remove(localObject5);
          if (localh == null)
            continue;
          localf.b((String)localObject5, localh);
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroy player");
          if (localh.fqY)
            f.d((String)localObject5, localh);
        }
        f.c((String)localObject5, localh);
      }
      Object localObject5 = localLinkedList.iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject4 = (String)((Iterator)localObject5).next();
        if (localObject2.oJP.dR((String)localObject4))
          localObject2.oJP.dV((String)localObject4);
        localh = (h)localObject2.oJx.remove(localObject4);
        localObject2.oJy.remove(localObject4);
        if (localh != null)
        {
          localObject2.b((String)localObject4, localh);
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroy recycled player");
          if (localh.fqY)
            f.d((String)localObject4, localh);
          else
            f.c((String)localObject4, localh);
        }
      }
      break label110;
      if (i == 0);
      synchronized (this.oJW.lrj)
      {
        this.oJW.oJH = true;
        this.oJW.oJJ = System.currentTimeMillis();
        al.n(this.oJW.oJT, 1800000L);
        AppMethodBeat.o(137272);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.f.3
 * JD-Core Version:    0.6.2
 */