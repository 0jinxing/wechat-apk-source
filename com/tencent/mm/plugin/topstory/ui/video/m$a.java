package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.c;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class m$a
  implements Runnable
{
  private String mPq;

  m$a(m paramm, String paramString)
  {
    this.mPq = paramString;
  }

  public final void run()
  {
    AppMethodBeat.i(1747);
    Object localObject1 = new File(this.mPq);
    Object localObject2;
    if (((File)localObject1).exists())
    {
      localObject2 = ((File)localObject1).listFiles();
      int i = this.sEW.sEU.size();
      int j = this.sEW.sET.size();
      if (localObject2 != null);
      for (int k = localObject2.length; ; k = 0)
      {
        ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoCacheTask preloadSize: %d cacheSize: %d folderSize: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        if ((localObject2 == null) || (localObject2.length <= 10))
          break label421;
        localObject1 = new ArrayList(localObject2.length);
        j = localObject2.length;
        for (k = 0; k < j; k++)
          ((List)localObject1).add(localObject2[k]);
      }
      Collections.sort((List)localObject1, new m.a.1(this));
      ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "First: %s Last: %s", new Object[] { h.formatTime("yyyy-MM-dd HH:mm:ss", ((File)((List)localObject1).get(0)).lastModified() / 1000L), h.formatTime("yyyy-MM-dd HH:mm:ss", ((File)((List)localObject1).get(((List)localObject1).size() - 1)).lastModified() / 1000L) });
      localObject2 = ((List)localObject1).subList(10, ((List)localObject1).size());
      if (this.sEW.sDo == null)
        break label455;
      localObject1 = this.sEW.sDo.cFV().sFv;
      if (localObject1 == null)
        break label455;
    }
    label421: label455: for (localObject1 = c.au(((chw)localObject1).xgS, ((chw)localObject1).xgT); ; localObject1 = "")
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        File localFile = (File)((Iterator)localObject2).next();
        String str = localFile.getName().split("\\.")[0];
        if ((!str.equals(localObject1)) && (!this.sEW.sEU.contains(str)))
        {
          ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "Delete cache video %s %s", new Object[] { localFile.getName(), h.formatTime("yyyy-MM-dd HH:mm:ss", localFile.lastModified() / 1000L) });
          this.sEW.sET.remove(str);
          localFile.delete();
        }
      }
      AppMethodBeat.o(1747);
      while (true)
      {
        return;
        ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoCacheTask folder %s not exist", new Object[] { this.mPq });
        AppMethodBeat.o(1747);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.m.a
 * JD-Core Version:    0.6.2
 */