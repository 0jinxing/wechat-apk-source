package com.tencent.mm.plugin.appbrand.appusage;

import a.f.b.j;
import a.l;
import a.y;
import android.os.Looper;
import android.support.v7.h.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.c.b;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.cdb;
import com.tencent.mm.protocal.protobuf.dk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionModifyQueue;", "Lcom/tencent/mm/kernel/service/IService;", "Lcom/tencent/mm/kernel/service/IServiceLifeCycle;", "()V", "memoryQueue", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/StarWxaSortOperation;", "timeoutOpTimer", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "applyDiff", "", "diff", "Landroid/support/v7/util/DiffUtil$DiffResult;", "oldList", "", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "newList", "callback", "Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionModifyQueue$OnModifiedCallback;", "applyDiff$plugin_appbrand_integration_release", "deserializeFromDisk", "", "modelClient2Server", "Lcom/tencent/mm/protocal/protobuf/StarWxaInfo;", "clientUse", "onRegister", "onUnregister", "push", "op", "reason", "Lcom/tencent/mm/plugin/appbrand/appusage/CgiUpdateWxaStarRecord$UpdateReason;", "serializeToDisk", "triggerRequest", "writeBackQueue", "queue", "Companion", "OnModifiedCallback", "plugin-appbrand-integration_release"})
@e(com.tencent.mm.plugin.appbrand.a.c.class)
public final class c
  implements com.tencent.mm.kernel.c.a, b
{
  public static final c.a gYK;
  private final LinkedList<cdb> gYI;
  private final ap gYJ;

  static
  {
    AppMethodBeat.i(134503);
    gYK = new c.a((byte)0);
    AppMethodBeat.o(134503);
  }

  public c()
  {
    AppMethodBeat.i(134502);
    this.gYI = new LinkedList();
    this.gYJ = new ap(Looper.getMainLooper(), (ap.a)new c.d(this), false);
    AppMethodBeat.o(134502);
  }

  // ERROR //
  public final void SH()
  {
    // Byte code:
    //   0: ldc 159
    //   2: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 165	com/tencent/mm/plugin/appbrand/app/f:auZ	()Lcom/tencent/mm/plugin/appbrand/q/a;
    //   8: ldc 167
    //   10: invokevirtual 173	com/tencent/mm/plugin/appbrand/q/a:DH	(Ljava/lang/String;)[B
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull +104 -> 119
    //   18: aload_1
    //   19: arraylength
    //   20: ifne +61 -> 81
    //   23: iconst_1
    //   24: istore_2
    //   25: iload_2
    //   26: ifne +85 -> 111
    //   29: invokestatic 165	com/tencent/mm/plugin/appbrand/app/f:auZ	()Lcom/tencent/mm/plugin/appbrand/q/a;
    //   32: ldc 167
    //   34: invokevirtual 177	com/tencent/mm/plugin/appbrand/q/a:clear	(Ljava/lang/String;)V
    //   37: new 179	com/tencent/mm/protocal/protobuf/dk
    //   40: astore_3
    //   41: aload_3
    //   42: invokespecial 180	com/tencent/mm/protocal/protobuf/dk:<init>	()V
    //   45: aload_3
    //   46: aload_1
    //   47: invokevirtual 184	com/tencent/mm/protocal/protobuf/dk:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   50: pop
    //   51: aload_0
    //   52: getfield 90	com/tencent/mm/plugin/appbrand/appusage/c:gYI	Ljava/util/LinkedList;
    //   55: astore_1
    //   56: aload_1
    //   57: monitorenter
    //   58: aload_0
    //   59: getfield 90	com/tencent/mm/plugin/appbrand/appusage/c:gYI	Ljava/util/LinkedList;
    //   62: aload_3
    //   63: getfield 187	com/tencent/mm/protocal/protobuf/dk:eow	Ljava/util/LinkedList;
    //   66: checkcast 151	java/util/Collection
    //   69: invokevirtual 190	java/util/LinkedList:addAll	(Ljava/util/Collection;)Z
    //   72: pop
    //   73: aload_1
    //   74: monitorexit
    //   75: ldc 159
    //   77: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: return
    //   81: iconst_0
    //   82: istore_2
    //   83: goto -58 -> 25
    //   86: astore_3
    //   87: aload_1
    //   88: monitorexit
    //   89: ldc 159
    //   91: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_3
    //   95: athrow
    //   96: astore_1
    //   97: ldc 192
    //   99: ldc 194
    //   101: aload_1
    //   102: invokestatic 200	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   105: invokevirtual 204	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   108: invokestatic 210	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   111: ldc 159
    //   113: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   116: goto -36 -> 80
    //   119: ldc 159
    //   121: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: goto -44 -> 80
    //
    // Exception table:
    //   from	to	target	type
    //   58	73	86	finally
    //   37	58	96	java/lang/Exception
    //   73	80	96	java/lang/Exception
    //   87	96	96	java/lang/Exception
  }

  public final void SI()
  {
    AppMethodBeat.i(134497);
    dk localdk = new dk();
    synchronized (this.gYI)
    {
      localdk.eow.addAll((Collection)this.gYI);
      if (localdk.eow.isEmpty());
    }
    while (true)
    {
      try
      {
        com.tencent.mm.plugin.appbrand.app.f.auZ().s("AppBrandCollectionModifyQueue", localdk.toByteArray());
        AppMethodBeat.o(134497);
        return;
        localObject = finally;
        AppMethodBeat.o(134497);
        throw localObject;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "serializeToDisk, write kv failed, e = ".concat(String.valueOf(localException)));
      }
      AppMethodBeat.o(134497);
    }
  }

  public final void a(z.b paramb)
  {
    AppMethodBeat.i(134501);
    j.p(paramb, "reason");
    ab.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "triggerRequest reason = " + paramb.name());
    this.gYJ.stopTimer();
    LinkedList localLinkedList1 = new LinkedList();
    while (true)
    {
      synchronized (this.gYI)
      {
        localLinkedList1.addAll((Collection)this.gYI);
        this.gYI.clear();
        y localy = y.AUy;
        if (localLinkedList1.isEmpty())
        {
          ab.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "triggerRequest reason=[" + paramb.intValue + "], queue empty");
          if ((paramb == z.b.haA) || (paramb == z.b.haB))
          {
            paramb = ae.haH;
            ae.a.cQ(2, 2);
          }
          AppMethodBeat.o(134501);
          return;
        }
      }
      ab.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "run cgi reason=[" + paramb.intValue + "], queue_size=" + localLinkedList1.size());
      new z((List)localLinkedList1, paramb.intValue).acy().j((com.tencent.mm.vending.c.a)new c.e(this, paramb, localLinkedList1));
      AppMethodBeat.o(134501);
    }
  }

  public final void a(cdb paramcdb, z.b paramb)
  {
    AppMethodBeat.i(134499);
    j.p(paramcdb, "op");
    j.p(paramb, "reason");
    while (true)
    {
      synchronized (this.gYI)
      {
        this.gYI.addLast(paramcdb);
        paramcdb = y.AUy;
        switch (d.eQZ[paramb.ordinal()])
        {
        default:
          a(paramb);
          AppMethodBeat.o(134499);
          return;
        case 1:
        }
      }
      this.gYJ.ms(30000L);
      AppMethodBeat.o(134499);
    }
  }

  public final boolean a(android.support.v7.h.c.b paramb, List<? extends LocalUsageInfo> arg2, List<? extends LocalUsageInfo> paramList2, c.b paramb1)
  {
    AppMethodBeat.i(134498);
    j.p(paramb, "diff");
    j.p(???, "oldList");
    j.p(paramList2, "newList");
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll((Collection)???);
    PInt localPInt = new PInt(0);
    while (true)
    {
      synchronized (this.gYI)
      {
        c.c localc = new com/tencent/mm/plugin/appbrand/appusage/c$c;
        localc.<init>(this, paramb, localPInt, paramList2, paramb1, localArrayList);
        paramb.a((d)localc);
        paramb = y.AUy;
        if (localPInt.value > 0)
        {
          bool = true;
          AppMethodBeat.o(134498);
          return bool;
        }
      }
      AppMethodBeat.o(134498);
      boolean bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.c
 * JD-Core Version:    0.6.2
 */