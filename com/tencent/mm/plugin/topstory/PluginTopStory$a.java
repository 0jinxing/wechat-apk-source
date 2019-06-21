package com.tencent.mm.plugin.topstory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;

final class PluginTopStory$a
  implements Runnable
{
  private PluginTopStory$a(PluginTopStory paramPluginTopStory)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(65445);
    ab.i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard ftsrecommendVideo folder %b", new Object[] { Boolean.valueOf(com.tencent.mm.a.e.cu(com.tencent.mm.compatible.util.e.eSn + "ftsrecommendVideo/")) });
    ab.i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard topstory folder %b", new Object[] { Boolean.valueOf(com.tencent.mm.a.e.cu(com.tencent.mm.compatible.util.e.eSn + "topstory/")) });
    Object localObject1 = new File(com.tencent.mm.plugin.topstory.a.g.cFl());
    if (((File)localObject1).exists())
    {
      localObject1 = ((File)localObject1).listFiles();
      if (localObject1 != null)
      {
        int i = localObject1.length;
        for (int j = 0; j < i; j++)
        {
          Object localObject2 = localObject1[j];
          boolean bool = com.tencent.mm.a.e.cu(localObject2.getAbsolutePath());
          ab.i("MicroMsg.TopStory.PluginTopStory", "Delete Cache File %s %b", new Object[] { localObject2.getAbsolutePath(), Boolean.valueOf(bool) });
        }
      }
      com.tencent.mm.vfs.e.tf(com.tencent.mm.plugin.topstory.a.g.cFl() + ".nomedia/");
    }
    while (true)
    {
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUS, Long.valueOf(0L));
      AppMethodBeat.o(65445);
      return;
      com.tencent.mm.vfs.e.tf(com.tencent.mm.plugin.topstory.a.g.cFl());
      com.tencent.mm.vfs.e.tf(com.tencent.mm.plugin.topstory.a.g.cFl() + ".nomedia/");
      ab.i("MicroMsg.TopStory.PluginTopStory", "Create TopStoryCacheFolder");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.PluginTopStory.a
 * JD-Core Version:    0.6.2
 */