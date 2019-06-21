package com.tencent.mm.emoji.sync;

import a.f.b.j;
import a.f.b.k;
import a.l;
import a.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.g.a.h;
import com.tencent.mm.loader.g.f;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/sync/EmojiSyncManager;", "", "customType", "", "(I)V", "callbackQueue", "Ljava/util/LinkedList;", "Lcom/tencent/mm/emoji/sync/SyncCallback;", "connectivityReceiver", "Landroid/content/BroadcastReceiver;", "getCustomType", "()I", "downloadCallback", "com/tencent/mm/emoji/sync/EmojiSyncManager$downloadCallback$1", "Lcom/tencent/mm/emoji/sync/EmojiSyncManager$downloadCallback$1;", "downloadList", "", "", "kotlin.jvm.PlatformType", "", "downloadQueue", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/emoji/sync/EmojiDownLoadTask;", "<set-?>", "remainSize", "getRemainSize", "setRemainSize", "startNonWifi", "", "Lcom/tencent/mm/emoji/sync/EmojiSyncManager$SyncState;", "syncState", "getSyncState", "()Lcom/tencent/mm/emoji/sync/EmojiSyncManager$SyncState;", "setSyncState", "(Lcom/tencent/mm/emoji/sync/EmojiSyncManager$SyncState;)V", "totalSize", "getTotalSize", "setTotalSize", "addDownloadTask", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "checkAutoStart", "checkBroken", "checkSync", "checkSyncEmoji", "start", "withBroken", "destroy", "init", "markBroken", "md5", "registerCallback", "callback", "force", "startInternal", "stop", "unregisterCallback", "Companion", "ConnectivityReceiver", "SyncState", "plugin-emojisdk_release"})
public final class EmojiSyncManager
{
  public static final EmojiSyncManager.a ezA;
  private static EmojiSyncManager ezy;
  private static EmojiSyncManager ezz;
  private BroadcastReceiver aGB;
  private final com.tencent.mm.loader.g.d<a> ezq;
  private final LinkedList<c> ezr;
  public EmojiSyncManager.b ezs;
  public final List<String> ezt;
  public int ezu;
  private boolean ezv;
  private final d ezw;
  final int ezx;

  static
  {
    AppMethodBeat.i(63284);
    ezA = new EmojiSyncManager.a((byte)0);
    AppMethodBeat.o(63284);
  }

  public EmojiSyncManager(int paramInt)
  {
    AppMethodBeat.i(63283);
    this.ezx = paramInt;
    this.ezq = new com.tencent.mm.loader.g.d((com.tencent.mm.loader.g.a.d)new com.tencent.mm.loader.g.a.g((com.tencent.mm.loader.g.a.c)new com.tencent.mm.loader.g.a.a(2147483647), new h(), "EmojiSync"));
    this.ezr = new LinkedList();
    this.ezs = EmojiSyncManager.b.ezB;
    this.ezt = Collections.synchronizedList((List)new LinkedList());
    this.ezw = new d(this);
    AppMethodBeat.o(63283);
  }

  private final boolean Pd()
  {
    AppMethodBeat.i(63282);
    boolean bool;
    if ((this.ezv) || (at.isWifi(ah.getContext())))
    {
      bool = true;
      AppMethodBeat.o(63282);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63282);
    }
  }

  private void j(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63279);
    j.p(paramEmojiInfo, "emojiInfo");
    ab.i(b.Ow(), this.ezx + " addDownloadTask: " + paramEmojiInfo.Aq());
    this.ezq.a((com.tencent.mm.loader.g.c)new a(paramEmojiInfo));
    AppMethodBeat.o(63279);
  }

  private final void startInternal()
  {
    AppMethodBeat.i(63281);
    ab.i(b.Ow(), this.ezx + " startInternal: " + this.ezv + ' ' + at.isWifi(ah.getContext()) + ' ' + "size is " + this.ezt.size());
    ??? = this.ezt;
    j.o(???, "downloadList");
    synchronized ((Iterable)???)
    {
      Iterator localIterator = ((Iterable)???).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject3 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
        j.o(localObject3, "plugin(IPluginEmoji::class.java)");
        localObject3 = ((com.tencent.mm.plugin.emoji.b.d)localObject3).getProvider().Je(str);
        if (localObject3 != null)
          j((EmojiInfo)localObject3);
      }
    }
    y localy = y.AUy;
    this.ezs = EmojiSyncManager.b.ezC;
    com.tencent.mm.ab.b.a((a.f.a.a)new f(this));
    AppMethodBeat.o(63281);
  }

  public final void cg(boolean paramBoolean)
  {
    AppMethodBeat.i(63277);
    this.ezv = paramBoolean;
    if (this.ezs != EmojiSyncManager.b.ezC)
    {
      List localList = this.ezt;
      j.o(localList, "downloadList");
      if (((Collection)localList).isEmpty())
        break label69;
    }
    label69: for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (Pd()))
        startInternal();
      AppMethodBeat.o(63277);
      return;
    }
  }

  public final void ch(final boolean paramBoolean)
  {
    AppMethodBeat.i(63280);
    ab.i(b.Ow(), this.ezx + " checkSyncEmoji: true " + paramBoolean);
    com.tencent.mm.ab.b.a("EmojiSyncManager_checkBrokenEmoji", (a.f.a.a)new c(this, paramBoolean));
    AppMethodBeat.o(63280);
  }

  public final void destroy()
  {
    AppMethodBeat.i(63276);
    ab.i(b.Ow(), "destroy customType: " + this.ezx);
    this.ezq.b((f)this.ezw);
    this.ezq.clean();
    if (this.aGB != null)
    {
      ah.getContext().unregisterReceiver(this.aGB);
      this.aGB = null;
    }
    AppMethodBeat.o(63276);
  }

  public final void init()
  {
    AppMethodBeat.i(63275);
    ab.i(b.Ow(), "init customType: " + this.ezx);
    this.ezq.a((f)this.ezw);
    this.aGB = ((BroadcastReceiver)new EmojiSyncManager.ConnectivityReceiver());
    ah.getContext().registerReceiver(this.aGB, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    AppMethodBeat.o(63275);
  }

  public final void stop()
  {
    AppMethodBeat.i(63278);
    ab.i(b.Ow(), this.ezx + " stop: " + at.isWifi(ah.getContext()));
    this.ezv = false;
    this.ezq.clean();
    if (!this.ezt.isEmpty())
    {
      this.ezs = EmojiSyncManager.b.ezD;
      com.tencent.mm.ab.b.a((a.f.a.a)new EmojiSyncManager.g(this));
    }
    AppMethodBeat.o(63278);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class c extends k
    implements a.f.a.a<y>
  {
    c(EmojiSyncManager paramEmojiSyncManager, boolean paramBoolean)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/emoji/sync/EmojiSyncManager$downloadCallback$1", "Lcom/tencent/mm/loader/loader/LoaderCoreCallback;", "Lcom/tencent/mm/emoji/sync/EmojiDownLoadTask;", "onLoaderFin", "", "task", "status", "Lcom/tencent/mm/loader/loader/WorkStatus;", "plugin-emojisdk_release"})
  public static final class d
    implements f<a>
  {
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  public static final class e extends k
    implements a.f.a.a<y>
  {
    public e(EmojiSyncManager paramEmojiSyncManager, c paramc)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class f extends k
    implements a.f.a.a<y>
  {
    f(EmojiSyncManager paramEmojiSyncManager)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.sync.EmojiSyncManager
 * JD-Core Version:    0.6.2
 */