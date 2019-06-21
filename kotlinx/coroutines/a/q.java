package kotlinx.coroutines.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "T", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "a", "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "", "()Z", "size", "", "size$annotations", "addImpl", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "addLastIf", "cond", "Lkotlin/Function0;", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function0;)Z", "clear", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "removeAtImpl", "index", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "predicate", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "siftDownFrom", "i", "siftUpFrom", "swap", "j", "kotlinx-coroutines-core"})
public final class q<T extends r,  extends Comparable<? super T>>
{
  public T[] BRS;
  public volatile int size;

  private final void Vc(int paramInt)
  {
    AppMethodBeat.i(118389);
    for (int i = paramInt; ; i = paramInt)
    {
      int j = i * 2 + 1;
      if (j >= this.size)
        AppMethodBeat.o(118389);
      while (true)
      {
        return;
        Object localObject1 = this.BRS;
        if (localObject1 == null)
          j.dWJ();
        paramInt = j;
        if (j + 1 < this.size)
        {
          localObject2 = localObject1[(j + 1)];
          if (localObject2 == null)
            j.dWJ();
          Comparable localComparable = (Comparable)localObject2;
          localObject2 = localObject1[j];
          if (localObject2 == null)
            j.dWJ();
          paramInt = j;
          if (localComparable.compareTo(localObject2) < 0)
            paramInt = j + 1;
        }
        Object localObject2 = localObject1[i];
        if (localObject2 == null)
          j.dWJ();
        localObject2 = (Comparable)localObject2;
        localObject1 = localObject1[paramInt];
        if (localObject1 == null)
          j.dWJ();
        if (((Comparable)localObject2).compareTo(localObject1) > 0)
          break;
        AppMethodBeat.o(118389);
      }
      ir(i, paramInt);
    }
  }

  private final void ir(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118390);
    r[] arrayOfr = this.BRS;
    if (arrayOfr == null)
      j.dWJ();
    r localr1 = arrayOfr[paramInt2];
    if (localr1 == null)
      j.dWJ();
    r localr2 = arrayOfr[paramInt1];
    if (localr2 == null)
      j.dWJ();
    arrayOfr[paramInt1] = localr1;
    arrayOfr[paramInt2] = localr2;
    localr1.setIndex(paramInt1);
    localr2.setIndex(paramInt2);
    AppMethodBeat.o(118390);
  }

  public final T Va(int paramInt)
  {
    AppMethodBeat.i(118387);
    if (this.size > 0);
    for (int i = 1; i == 0; i = 0)
    {
      localObject1 = (Throwable)new IllegalStateException("Check failed.".toString());
      AppMethodBeat.o(118387);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.BRS;
    if (localObject1 == null)
      j.dWJ();
    this.size -= 1;
    Comparable localComparable;
    if (paramInt < this.size)
    {
      ir(paramInt, this.size);
      i = (paramInt - 1) / 2;
      if (paramInt > 0)
      {
        localComparable = localObject1[paramInt];
        if (localComparable == null)
          j.dWJ();
        localComparable = (Comparable)localComparable;
        Object localObject2 = localObject1[i];
        if (localObject2 == null)
          j.dWJ();
        if (localComparable.compareTo(localObject2) < 0)
        {
          ir(paramInt, i);
          Vb(i);
        }
      }
    }
    else
    {
      localComparable = localObject1[this.size];
      if (localComparable == null)
        j.dWJ();
      if (localComparable.elp() != (q)this)
        break label218;
    }
    label218: for (paramInt = 1; ; paramInt = 0)
    {
      if (paramInt != 0)
        break label223;
      localObject1 = (Throwable)new IllegalStateException("Check failed.".toString());
      AppMethodBeat.o(118387);
      throw ((Throwable)localObject1);
      Vc(paramInt);
      break;
    }
    label223: localComparable.a(null);
    localComparable.setIndex(-1);
    localObject1[this.size] = null;
    AppMethodBeat.o(118387);
    return localComparable;
  }

  public final void Vb(int paramInt)
  {
    AppMethodBeat.i(118388);
    while (true)
    {
      if (paramInt <= 0)
        AppMethodBeat.o(118388);
      int i;
      while (true)
      {
        return;
        Object localObject = this.BRS;
        if (localObject == null)
          j.dWJ();
        i = (paramInt - 1) / 2;
        Comparable localComparable = localObject[i];
        if (localComparable == null)
          j.dWJ();
        localComparable = (Comparable)localComparable;
        localObject = localObject[paramInt];
        if (localObject == null)
          j.dWJ();
        if (localComparable.compareTo(localObject) > 0)
          break;
        AppMethodBeat.o(118388);
      }
      ir(paramInt, i);
      paramInt = i;
    }
  }

  public final boolean a(T paramT)
  {
    int i = 0;
    boolean bool = false;
    while (true)
    {
      int j;
      try
      {
        AppMethodBeat.i(118386);
        j.p(paramT, "node");
        if (paramT.elp() == null)
        {
          AppMethodBeat.o(118386);
          return bool;
        }
        j = paramT.getIndex();
        if (j >= 0)
          i = 1;
        if (i == 0)
        {
          paramT = new java/lang/IllegalStateException;
          paramT.<init>("Check failed.".toString());
          paramT = (Throwable)paramT;
          AppMethodBeat.o(118386);
          throw paramT;
        }
      }
      finally
      {
      }
      Va(j);
      AppMethodBeat.o(118386);
      bool = true;
    }
  }

  public final T elR()
  {
    try
    {
      AppMethodBeat.i(118385);
      r localr = elS();
      AppMethodBeat.o(118385);
      return localr;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final T elS()
  {
    Object localObject = this.BRS;
    if (localObject != null);
    for (localObject = localObject[0]; ; localObject = null)
      return localObject;
  }

  public final boolean isEmpty()
  {
    if (this.size == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.q
 * JD-Core Version:    0.6.2
 */