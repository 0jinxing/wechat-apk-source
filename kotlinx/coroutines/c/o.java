package kotlinx.coroutines.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "()V", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "bufferSize", "", "getBufferSize$kotlinx_coroutines_core", "()I", "consumerIndex", "Lkotlinx/atomicfu/AtomicInt;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "add", "", "task", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "addLast", "addToGlobalQueue", "", "offloadAllWork", "offloadAllWork$kotlinx_coroutines_core", "offloadWork", "poll", "pollExternal", "predicate", "Lkotlin/Function1;", "size", "size$kotlinx_coroutines_core", "tryAddLast", "trySteal", "victim", "tryStealLastScheduled", "time", "", "kotlinx-coroutines-core"})
public final class o
{
  private static final AtomicReferenceFieldUpdater BTa;
  static final AtomicIntegerFieldUpdater BTc;
  static final AtomicIntegerFieldUpdater BTe;
  private final AtomicReferenceArray<i> BSY;
  volatile Object BSZ;
  volatile int BTb;
  volatile int BTd;

  static
  {
    AppMethodBeat.i(118313);
    BTa = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "BSZ");
    BTc = AtomicIntegerFieldUpdater.newUpdater(o.class, "BTb");
    BTe = AtomicIntegerFieldUpdater.newUpdater(o.class, "BTd");
    AppMethodBeat.o(118313);
  }

  public o()
  {
    AppMethodBeat.i(118312);
    this.BSY = new AtomicReferenceArray(128);
    this.BSZ = null;
    this.BTb = 0;
    this.BTd = 0;
    AppMethodBeat.o(118312);
  }

  private final void a(e parame)
  {
    AppMethodBeat.i(118308);
    int i = a.h.e.im(emm() / 2, 1);
    int j = 0;
    label23: int k;
    i locali;
    if (j < i)
    {
      k = this.BTd;
      if (k - this.BTb == 0)
      {
        locali = null;
        label42: if (locali != null)
          break label109;
        AppMethodBeat.o(118308);
      }
    }
    while (true)
    {
      return;
      int m = k & 0x7F;
      if (((i)this.BSY.get(m) == null) || (!BTe.compareAndSet(this, k, k + 1)))
        break label23;
      locali = (i)this.BSY.getAndSet(m, null);
      break label42;
      label109: a(parame, locali);
      j++;
      break;
      AppMethodBeat.o(118308);
    }
  }

  private static void a(e parame, i parami)
  {
    AppMethodBeat.i(118309);
    if (!parame.en(parami))
    {
      parame = (Throwable)new IllegalStateException("GlobalQueue could not be closed yet".toString());
      AppMethodBeat.o(118309);
      throw parame;
    }
    AppMethodBeat.o(118309);
  }

  private final boolean a(long paramLong, o paramo, e parame)
  {
    AppMethodBeat.i(118307);
    i locali = (i)paramo.BSZ;
    boolean bool;
    if (locali == null)
    {
      AppMethodBeat.o(118307);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramLong - locali.BSM < m.BSS)
      {
        AppMethodBeat.o(118307);
        bool = false;
      }
      else if (BTa.compareAndSet(paramo, locali, null))
      {
        a(locali, parame);
        bool = true;
        AppMethodBeat.o(118307);
      }
      else
      {
        AppMethodBeat.o(118307);
        bool = false;
      }
    }
  }

  private final boolean c(i parami)
  {
    boolean bool = false;
    AppMethodBeat.i(118311);
    if (emm() == 127)
      AppMethodBeat.o(118311);
    while (true)
    {
      return bool;
      int i = this.BTb & 0x7F;
      if (this.BSY.get(i) != null)
      {
        AppMethodBeat.o(118311);
      }
      else
      {
        this.BSY.lazySet(i, parami);
        BTc.incrementAndGet(this);
        bool = true;
        AppMethodBeat.o(118311);
      }
    }
  }

  public final boolean a(i parami, e parame)
  {
    AppMethodBeat.i(118304);
    j.p(parami, "task");
    j.p(parame, "globalQueue");
    parami = (i)BTa.getAndSet(this, parami);
    boolean bool;
    if (parami == null)
    {
      bool = true;
      AppMethodBeat.o(118304);
    }
    while (true)
    {
      return bool;
      bool = b(parami, parame);
      AppMethodBeat.o(118304);
    }
  }

  public final boolean a(o paramo, e parame)
  {
    AppMethodBeat.i(118306);
    j.p(paramo, "victim");
    j.p(parame, "globalQueue");
    long l = m.BSX.nanoTime();
    int i = paramo.emm();
    boolean bool;
    if (i == 0)
    {
      bool = a(l, paramo, parame);
      AppMethodBeat.o(118306);
    }
    while (true)
    {
      return bool;
      bool = false;
      int j = a.h.e.im(i / 2, 1);
      for (i = 0; ; i++)
      {
        if (i >= j)
          break label228;
        label75: int k = paramo.BTd;
        i locali;
        if (k - paramo.BTb == 0)
          locali = null;
        while (true)
        {
          if (locali != null)
            break label211;
          AppMethodBeat.o(118306);
          break;
          int m = k & 0x7F;
          locali = (i)paramo.BSY.get(m);
          if (locali == null)
            break label75;
          if ((l - locali.BSM >= m.BSS) || (paramo.emm() > m.BST));
          for (int n = 1; ; n = 0)
          {
            if (n != 0)
              break label177;
            locali = null;
            break;
          }
          label177: if (!BTe.compareAndSet(paramo, k, k + 1))
            break label75;
          locali = (i)paramo.BSY.getAndSet(m, null);
        }
        label211: bool = true;
        a(locali, parame);
      }
      label228: AppMethodBeat.o(118306);
    }
  }

  public final void b(e parame)
  {
    AppMethodBeat.i(118310);
    j.p(parame, "globalQueue");
    i locali = (i)BTa.getAndSet(this, null);
    if (locali != null)
      a(parame, locali);
    while (true)
    {
      int i = this.BTd;
      if (i - this.BTb == 0);
      int j;
      for (locali = null; ; locali = (i)this.BSY.getAndSet(j, null))
      {
        if (locali != null)
          break label110;
        AppMethodBeat.o(118310);
        return;
        j = i & 0x7F;
        if (((i)this.BSY.get(j) == null) || (!BTe.compareAndSet(this, i, i + 1)))
          break;
      }
      label110: a(parame, locali);
    }
  }

  public final boolean b(i parami, e parame)
  {
    AppMethodBeat.i(118305);
    j.p(parami, "task");
    j.p(parame, "globalQueue");
    for (boolean bool = true; !c(parami); bool = false)
      a(parame);
    AppMethodBeat.o(118305);
    return bool;
  }

  public final int emm()
  {
    return this.BTb - this.BTd;
  }

  public final i emn()
  {
    AppMethodBeat.i(118303);
    i locali = (i)BTa.getAndSet(this, null);
    int i;
    if (locali == null)
    {
      i = this.BTd;
      if (i - this.BTb == 0)
      {
        AppMethodBeat.o(118303);
        locali = null;
      }
    }
    while (true)
    {
      return locali;
      int j = i & 0x7F;
      if (((i)this.BSY.get(j) == null) || (!BTe.compareAndSet(this, i, i + 1)))
        break;
      locali = (i)this.BSY.getAndSet(j, null);
      AppMethodBeat.o(118303);
      continue;
      AppMethodBeat.o(118303);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.o
 * JD-Core Version:    0.6.2
 */