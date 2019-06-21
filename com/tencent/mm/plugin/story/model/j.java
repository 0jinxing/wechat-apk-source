package com.tencent.mm.plugin.story.model;

import android.graphics.Point;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.fa;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.story.PluginStory.b;
import com.tencent.mm.plugin.story.PluginStory.c;
import com.tencent.mm.plugin.story.api.o.b;
import com.tencent.mm.plugin.story.h.i;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.h.m;
import com.tencent.mm.plugin.story.h.o;
import com.tencent.mm.plugin.story.model.f.a.i;
import com.tencent.mm.protocal.protobuf.cdu;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryCore;", "Lcom/tencent/mm/model/ISubCore;", "()V", "dataDB", "Lcom/tencent/mm/storagebase/SqliteDB;", "handler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "isAccInit", "", "lock", "", "needResetDb", "storyAsyncQueueMgr", "Lcom/tencent/mm/plugin/story/model/StoryAsyncQueueMgr;", "storyCleanListener", "Lcom/tencent/mm/plugin/story/PluginStory$StoryCleanListener;", "storyCommentStorage", "Lcom/tencent/mm/plugin/story/storage/StoryCommentStorage;", "storyConfigChangeListener", "Lcom/tencent/mm/plugin/story/model/StoryCore$ConfigChangedListener;", "storyDBFactories", "Ljava/util/HashMap;", "", "Lcom/tencent/mm/storagebase/SqliteDB$IFactory;", "getStoryDBFactories", "()Ljava/util/HashMap;", "setStoryDBFactories", "(Ljava/util/HashMap;)V", "storyEditorDataStorage", "Lcom/tencent/mm/plugin/story/storage/StoryEditorDataStorage;", "storyExtInfoStg", "Lcom/tencent/mm/plugin/story/storage/StoryExtInfoStorage;", "storyHistoryInfoStorage", "Lcom/tencent/mm/plugin/story/storage/StoryHistoryInfoStorage;", "storyInfoStg", "Lcom/tencent/mm/plugin/story/storage/StoryInfoStorage;", "storyLoader", "Lcom/tencent/mm/plugin/story/model/download/StoryLoader;", "storyRoomInfoStg", "Lcom/tencent/mm/plugin/story/storage/StoryRoomInfoStorage;", "storyServer", "Lcom/tencent/mm/plugin/story/model/StoryLogic$StoryServer;", "storySyncListener", "Lcom/tencent/mm/plugin/story/PluginStory$StorySynclistener;", "storyUploadManager", "Lcom/tencent/mm/plugin/story/model/upload/UploadManager;", "storyVideoCacheStorage", "Lcom/tencent/mm/plugin/story/storage/StoryVideoCacheStorage;", "taskThread", "checkDir", "", "clearPluginData", "pluginFlag", "getBaseDBFactories", "isValid", "onAccountPostReset", "updated", "onAccountRelease", "onSdcardMount", "mounted", "parpareTaskThread", "resetDb", "updateConfigs", "Companion", "ConfigChangedListener", "plugin-story_release"})
public final class j
  implements at
{
  private static final String TAG = "MicroMsg.StoryCore";
  private static String qLl;
  private static final int qLv = 103;
  private static final Point qLw;
  private static final int rSO = 150;
  private static final com.tencent.mm.sdk.b.c<fa> rSP;
  private static boolean rSQ;
  private static boolean rSR;
  private static long rSS;
  public static final j.a rST;
  private com.tencent.mm.cd.h eJN;
  private final byte[] eMl;
  private final ak handler;
  private boolean qLf;
  private boolean qLi;
  private com.tencent.mm.plugin.story.h.g rSA;
  private m rSB;
  private com.tencent.mm.plugin.story.h.b rSC;
  private o rSD;
  private com.tencent.mm.plugin.story.h.e rSE;
  private i rSF;
  private com.tencent.mm.plugin.story.model.g.c rSG;
  private e rSH;
  private com.tencent.mm.plugin.story.model.c.e rSI;
  private o.a rSJ;
  private PluginStory.c rSK;
  private PluginStory.b rSL;
  private j.c rSM;
  private ak rSN;
  private HashMap<Integer, h.d> rSy;
  private k rSz;

  static
  {
    AppMethodBeat.i(109086);
    rST = new j.a((byte)0);
    TAG = "MicroMsg.StoryCore";
    qLl = "";
    qLw = new Point();
    qLv = 103;
    rSO = 150;
    rSP = (com.tencent.mm.sdk.b.c)new j.b();
    rSS = -1L;
    AppMethodBeat.o(109086);
  }

  public j()
  {
    AppMethodBeat.i(109085);
    this.eMl = new byte[0];
    this.rSy = new HashMap();
    this.rSK = new PluginStory.c();
    this.rSL = new PluginStory.b();
    this.rSM = new j.c(this);
    this.handler = new ak(Looper.getMainLooper());
    com.tencent.mm.sdk.g.d.a((Runnable)new j.d(this), "SnsCore_task_handler", 10).start();
    ((Map)this.rSy).put(Integer.valueOf("MMStoryInfo".hashCode()), j.1.rSU);
    ((Map)this.rSy).put(Integer.valueOf("StoryExtItem".hashCode()), j.2.rSV);
    ((Map)this.rSy).put(Integer.valueOf("StoryCommentSync".hashCode()), j.3.rSW);
    ((Map)this.rSy).put(Integer.valueOf("StoryVideoCacheInfo".hashCode()), j.4.rSX);
    ((Map)this.rSy).put(Integer.valueOf("StoryEditorInfo".hashCode()), j.5.rSY);
    ((Map)this.rSy).put(Integer.valueOf("StoryRoomInfo".hashCode()), j.6.rSZ);
    ((Map)this.rSy).put(Integer.valueOf("MMStoryHistoryItem".hashCode()), j.7.rTa);
    AppMethodBeat.o(109085);
  }

  public static boolean isValid()
  {
    AppMethodBeat.i(109084);
    boolean bool = com.tencent.mm.kernel.g.RN().QY();
    AppMethodBeat.o(109084);
    return bool;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(109082);
    if (this.qLi)
    {
      AppMethodBeat.o(109082);
      return;
    }
    this.qLi = true;
    this.qLf = true;
    Object localObject1 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class);
    a.f.b.j.o(localObject1, "plugin(IPluginStory::class.java)");
    com.tencent.mm.vfs.e.tf(((com.tencent.mm.plugin.story.api.e)localObject1).getAccStoryPath());
    localObject1 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class);
    a.f.b.j.o(localObject1, "plugin(IPluginStory::class.java)");
    com.tencent.mm.vfs.e.tf(((com.tencent.mm.plugin.story.api.e)localObject1).getAccStoryTmpPath());
    com.tencent.mm.sdk.b.a.xxA.c((com.tencent.mm.sdk.b.c)this.rSK);
    com.tencent.mm.sdk.b.a.xxA.c((com.tencent.mm.sdk.b.c)this.rSL);
    com.tencent.mm.pluginsdk.cmd.b.a((com.tencent.mm.pluginsdk.cmd.a)new h(), new String[] { "//story" });
    localObject1 = j.a.cya();
    ((com.tencent.mm.plugin.story.model.g.c)localObject1).rXK.a((com.tencent.mm.loader.g.f)((com.tencent.mm.plugin.story.model.g.c)localObject1).rXM);
    ((com.tencent.mm.plugin.story.model.g.c)localObject1).rXA.a((com.tencent.mm.loader.g.f)((com.tencent.mm.plugin.story.model.g.c)localObject1).rXN);
    Object localObject2 = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localObject2, "MMKernel.network()");
    ((com.tencent.mm.kernel.b)localObject2).Rg().a(351, (com.tencent.mm.ai.f)localObject1);
    localObject1 = j.a.cxU();
    ((com.tencent.mm.plugin.story.h.g)localObject1).c((k.a)localObject1);
    localObject1 = com.tencent.mm.plugin.story.model.b.b.rVw;
    localObject2 = com.tencent.mm.vfs.e.e(com.tencent.mm.plugin.story.model.b.b.rVo, 0, -1);
    if (localObject2 != null)
    {
      if (localObject2.length != 0)
        break label440;
      i = 1;
      label229: if (i != 0)
        break label446;
    }
    label440: label446: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        com.tencent.mm.plugin.story.model.b.b.rVq.parseFrom((byte[])localObject2);
      localObject2 = com.tencent.mm.kernel.g.RO();
      a.f.b.j.o(localObject2, "network()");
      ((com.tencent.mm.kernel.b)localObject2).Rg().a(354, (com.tencent.mm.ai.f)localObject1);
      localObject2 = com.tencent.mm.kernel.g.RO();
      a.f.b.j.o(localObject2, "network()");
      ((com.tencent.mm.kernel.b)localObject2).Rg().a(764, (com.tencent.mm.ai.f)localObject1);
      com.tencent.mm.plugin.story.model.b.b.col();
      j.a.cyf();
      com.tencent.mm.plugin.story.model.f.a.rWL.init();
      rSP.dnU();
      localObject1 = l.rTg;
      l.reset();
      localObject1 = l.rTg;
      com.tencent.mm.vfs.e.tf(l.cyk() + "coming/");
      com.tencent.mm.vfs.e.tf(l.cyk() + "/pic/");
      com.tencent.mm.vfs.e.tf(l.cyk() + "/video/");
      com.tencent.mm.plugin.story.api.o.rQN = (o.b)com.tencent.mm.plugin.story.model.d.d.rVX;
      com.tencent.mm.sdk.b.a.xxA.c((com.tencent.mm.sdk.b.c)this.rSM);
      AppMethodBeat.o(109082);
      break;
      i = 0;
      break label229;
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(109083);
    com.tencent.mm.sdk.b.a.xxA.d((com.tencent.mm.sdk.b.c)this.rSK);
    com.tencent.mm.sdk.b.a.xxA.d((com.tencent.mm.sdk.b.c)this.rSL);
    com.tencent.mm.sdk.b.a.xxA.d((com.tencent.mm.sdk.b.c)this.rSM);
    com.tencent.mm.pluginsdk.cmd.b.N(new String[] { "//story" });
    Object localObject = j.a.cya();
    ((com.tencent.mm.plugin.story.model.g.c)localObject).rXK.b((com.tencent.mm.loader.g.f)((com.tencent.mm.plugin.story.model.g.c)localObject).rXM);
    ((com.tencent.mm.plugin.story.model.g.c)localObject).rXA.b((com.tencent.mm.loader.g.f)((com.tencent.mm.plugin.story.model.g.c)localObject).rXN);
    com.tencent.mm.kernel.b localb = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localb, "MMKernel.network()");
    localb.Rg().b(351, (com.tencent.mm.ai.f)localObject);
    localObject = j.a.cxU();
    ((com.tencent.mm.plugin.story.h.g)localObject).d((k.a)localObject);
    localObject = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.cyZ();
    localb = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localb, "network()");
    localb.Rg().b(354, (com.tencent.mm.ai.f)localObject);
    localb = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localb, "network()");
    localb.Rg().b(764, (com.tencent.mm.ai.f)localObject);
    localObject = com.tencent.mm.plugin.story.model.f.a.rWL;
    ab.i(com.tencent.mm.plugin.story.model.f.a.TAG, "destroy: ");
    j.a.cxU().d((k.a)localObject);
    j.a.cxT().d((k.a)localObject);
    com.tencent.mm.plugin.story.model.f.a.ilQ.clear();
    com.tencent.mm.plugin.story.model.f.a.rWJ.dead();
    localObject = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.b(com.tencent.mm.plugin.story.model.f.a.rWK);
    rSP.dead();
    AppMethodBeat.o(109083);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.j
 * JD-Core Version:    0.6.2
 */