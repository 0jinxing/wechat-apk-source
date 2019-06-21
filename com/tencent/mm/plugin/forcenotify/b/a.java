package com.tencent.mm.plugin.forcenotify.b;

import a.l;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.forcenotify.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.messenger.foundation.a.s;
import com.tencent.mm.plugin.messenger.foundation.a.u;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/core/BaseForceNotifyService;", "Lcom/tencent/mm/plugin/forcenotify/api/IForceNotifyService;", "Lcom/tencent/mm/sdk/storage/MStorageEx$IOnStorageChange;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "executor", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "lastCheckExpireForceNotifyTime", "", "mainExecutor", "manualAuthEventIListener", "com/tencent/mm/plugin/forcenotify/core/BaseForceNotifyService$manualAuthEventIListener$1", "Lcom/tencent/mm/plugin/forcenotify/core/BaseForceNotifyService$manualAuthEventIListener$1;", "notifyList", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "afterSyncDoCmd", "", "addMsg", "Lcom/tencent/mm/protocal/protobuf/AddMsg;", "beforeSyncDoCmd", "p0", "getNotifyShowList", "getXmlKey", "p", "isNeedCheckExpire", "", "onModify", "info", "Lcom/tencent/mm/plugin/forcenotify/model/ForceNotifyInfo;", "onNewXmlReceived", "map", "", "p2", "Lcom/tencent/mm/modelbase/IMessageExtension$AddMsgInfo;", "onNotifyChange", "event", "", "stg", "Lcom/tencent/mm/sdk/storage/MStorageEx;", "username", "", "onReceive", "userName", "isNeedNotify", "release", "start", "plugin-force-notify_release"})
public abstract class a
  implements b, n.b
{
  final String TAG = "MicroMsg.ForceNotifyService";
  private long msQ;
  private final ak msR = new ak(this.TAG);
  private final ak msS = new ak(Looper.getMainLooper());
  public final ConcurrentLinkedQueue<String> msT = new ConcurrentLinkedQueue();
  private final a.b msU = new a.b(this);

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof String)) && ((paramInt == 5) || (paramInt == 4)))
    {
      paramn = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(paramn, "MMKernel.service(IMessengerStorage::class.java)");
      paramn = ((com.tencent.mm.plugin.messenger.foundation.a.j)paramn).XM().aoO(bo.bc((String)paramObject, ""));
      if (paramn != null)
        break label62;
    }
    while (true)
    {
      return;
      label62: if ((!paramn.NX()) || (paramn.Oa()))
      {
        Object localObject = com.tencent.mm.plugin.forcenotify.d.a.mth;
        localObject = paramn.getUsername();
        a.f.b.j.o(localObject, "contact.username");
        boolean bool = com.tencent.mm.plugin.forcenotify.d.a.Mq((String)localObject);
        ab.i(this.TAG, "[onNotifyChange] Delete contact[%s]  %s", new Object[] { paramObject, Boolean.valueOf(bool) });
        if (bool)
          if (paramn.Oa())
            am((String)paramObject, 9);
          else
            am((String)paramObject, 7);
      }
    }
  }

  public abstract void aJ(String paramString, boolean paramBoolean);

  public void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    a.f.b.j.p(paramMap, "map");
  }

  public void release()
  {
    this.msU.dead();
    u.a((s)this);
    Object localObject = g.M(p.class);
    a.f.b.j.o(localObject, "MMKernel.plugin(IPluginM…erFoundation::class.java)");
    ((p)localObject).getSysCmdMsgExtension().b("NewXmlAddForcePushApplication", (o)this);
    localObject = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject, "MMKernel.service(IMessengerStorage::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().b((n.b)this);
  }

  public void start()
  {
    u.a(5, (s)this);
    Object localObject = g.M(p.class);
    a.f.b.j.o(localObject, "MMKernel.plugin(IPluginM…erFoundation::class.java)");
    ((p)localObject).getSysCmdMsgExtension().a("NewXmlAddForcePushApplication", (o)this);
    this.msU.dnU();
    localObject = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject, "MMKernel.service(IMessengerStorage::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().a((n.b)this);
    this.msR.post((Runnable)c.mta);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class c
    implements Runnable
  {
    public static final c mta;

    static
    {
      AppMethodBeat.i(51030);
      mta = new c();
      AppMethodBeat.o(51030);
    }

    public final void run()
    {
      AppMethodBeat.i(51029);
      com.tencent.mm.plugin.forcenotify.d.a locala = com.tencent.mm.plugin.forcenotify.d.a.mth;
      com.tencent.mm.plugin.forcenotify.d.a.bya();
      AppMethodBeat.o(51029);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.b.a
 * JD-Core Version:    0.6.2
 */