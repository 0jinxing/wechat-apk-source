package com.tencent.mm.ai;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class x
{
  public static <T extends btd> a.a<T> a(a<T> parama)
  {
    Object localObject1 = null;
    AppMethodBeat.i(58317);
    Object localObject2;
    if (w.fuq == null)
    {
      localObject2 = null;
      if (localObject2 != null)
        break label47;
      ab.e("MicroMsg.SynchronousCgiCall", "NetSceneQueue not ready, just return NULL");
      AppMethodBeat.o(58317);
      parama = localObject1;
    }
    while (true)
    {
      return parama;
      localObject2 = w.fuq.Rh();
      break;
      label47: if (al.isMainThread())
      {
        parama = new IllegalAccessError("Cant call this function in main thread");
        AppMethodBeat.o(58317);
        throw parama;
      }
      if (((p)localObject2).ftB.oAl.getLooper().getThread().getId() == Thread.currentThread().getId())
      {
        parama = new IllegalAccessError("Cant call this function in NetSceneQueue's worker thread!!!");
        AppMethodBeat.o(58317);
        throw parama;
      }
      localObject2 = new AtomicReference();
      CountDownLatch localCountDownLatch = new CountDownLatch(1);
      parama.acy().b(new x.3((AtomicReference)localObject2, localCountDownLatch));
      try
      {
        localCountDownLatch.await();
        parama = (a.a)((AtomicReference)localObject2).get();
        AppMethodBeat.o(58317);
      }
      catch (Exception parama)
      {
        ab.printErrStackTrace("MicroMsg.SynchronousCgiCall", parama, "semaphore await exp ", new Object[0]);
        AppMethodBeat.o(58317);
        parama = localObject1;
      }
    }
  }

  public static <T extends btd> a.a<T> c(b paramb)
  {
    Object localObject1 = null;
    AppMethodBeat.i(58316);
    if (paramb == null)
    {
      paramb = new IllegalArgumentException("Cant use NULL rr");
      AppMethodBeat.o(58316);
      throw paramb;
    }
    Object localObject2;
    if (w.fuq == null)
    {
      localObject2 = null;
      if (localObject2 != null)
        break label68;
      ab.e("MicroMsg.SynchronousCgiCall", "NetSceneQueue not ready, just return NULL");
      AppMethodBeat.o(58316);
      paramb = localObject1;
    }
    while (true)
    {
      return paramb;
      localObject2 = w.fuq.Rh();
      break;
      label68: if (al.isMainThread())
      {
        paramb = new IllegalAccessError("Cant call this function in main thread");
        AppMethodBeat.o(58316);
        throw paramb;
      }
      if (((p)localObject2).ftB.oAl.getLooper().getThread().getId() == Thread.currentThread().getId())
      {
        paramb = new IllegalAccessError("Cant call this function in NetSceneQueue's worker thread!!!");
        AppMethodBeat.o(58316);
        throw paramb;
      }
      AtomicReference localAtomicReference = new AtomicReference();
      localObject2 = new CountDownLatch(1);
      w.a(paramb, new w.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, m paramAnonymousm)
        {
          AppMethodBeat.i(58313);
          this.fuB.set(a.a.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, (btd)paramAnonymousb.fsH.fsP, paramAnonymousm, null));
          this.val$latch.countDown();
          AppMethodBeat.o(58313);
          return 0;
        }
      });
      new ap(Looper.getMainLooper(), new x.2(localAtomicReference, (CountDownLatch)localObject2), false).ae(20000L, 20000L);
      try
      {
        ((CountDownLatch)localObject2).await();
        paramb = (a.a)localAtomicReference.get();
        AppMethodBeat.o(58316);
      }
      catch (InterruptedException paramb)
      {
        ab.printErrStackTrace("MicroMsg.SynchronousCgiCall", paramb, "latch await exp ", new Object[0]);
        AppMethodBeat.o(58316);
        paramb = localObject1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.x
 * JD-Core Version:    0.6.2
 */