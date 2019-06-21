package com.tencent.mm.kernel.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.b;
import com.tencent.mm.kernel.a.a.a.a;
import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class f<T> extends com.tencent.mm.kernel.a.a.a<T>
  implements c<T>
{
  private c<T> eLM;
  private d<T> eLS;
  public Class eLT;
  private volatile boolean eLU = false;

  public f(Class paramClass, d<T> paramd, c paramc)
  {
    this.eLT = paramClass;
    this.eLS = paramd;
    this.eLM = paramc;
  }

  public final a<T> Sp()
  {
    AppMethodBeat.i(123340);
    a locala = this.eLS.Sp();
    AppMethodBeat.o(123340);
    return locala;
  }

  public final List<a.a> Sw()
  {
    AppMethodBeat.i(123343);
    ArrayList localArrayList = new ArrayList(1);
    Iterator localIterator = this.eLx.values().iterator();
    while (localIterator.hasNext())
    {
      a.a locala = (a.a)localIterator.next();
      if (!((a)locala).eLB)
      {
        int i = ((a)locala).eLV;
        a locala1 = ((a)locala).eLY;
        if (((a)locala).eLY != null);
        for (Object localObject = Boolean.valueOf(((a)locala).eLY.eLB); ; localObject = "")
        {
          ab.e("MMSkeleton.ParallelsDependencies", "ParallelsDependencies node(%s) not consumed!!!! %s, %s, %s", new Object[] { locala, Integer.valueOf(i), locala1, localObject });
          localArrayList.add(locala);
          break;
        }
      }
    }
    AppMethodBeat.o(123343);
    return localArrayList;
  }

  public final void a(a<T> parama)
  {
    AppMethodBeat.i(123341);
    parama = parama.Si();
    if (parama != null)
    {
      parama = parama.iterator();
      while (parama.hasNext())
      {
        a locala = (a)parama.next();
        if (locala.SB())
          this.eLS.b(locala);
      }
    }
    AppMethodBeat.o(123341);
  }

  public final a.a<T> aE(T paramT)
  {
    AppMethodBeat.i(123336);
    if (!this.eLx.containsKey(paramT))
      this.eLx.putIfAbsent(paramT, new a(paramT, this.eLT, this.eLM, (byte)0));
    paramT = (a.a)this.eLx.get(paramT);
    AppMethodBeat.o(123336);
    return paramT;
  }

  public final a<T> aK(T paramT)
  {
    AppMethodBeat.i(123337);
    paramT = (a)this.eLx.get(paramT);
    AppMethodBeat.o(123337);
    return paramT;
  }

  public final void aL(Object paramObject)
  {
    AppMethodBeat.i(123342);
    a locala = (a)this.eLx.get(paramObject);
    if (locala.eLA != ((a)paramObject).eLA)
      ab.e("MMSkeleton.ParallelsDependencies", "not same!!!! %s, %s, %s, %s", new Object[] { locala, locala.eLA, paramObject, this.eLx.get(paramObject) });
    if ((this.eLU) && (locala.Sy()))
      this.eLS.b(locala);
    AppMethodBeat.o(123342);
  }

  public final void prepare()
  {
    AppMethodBeat.i(123339);
    ab.i("MMSkeleton.ParallelsDependencies", "ParallelsDependencies for type %s", new Object[] { this.eLT });
    Assert.assertNotNull(this.eLS);
    this.eLU = true;
    Iterator localIterator = this.eLx.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (a.a)localIterator.next();
      if (((a.a)localObject).Sl())
      {
        localObject = (a)localObject;
        ab.d("MMSkeleton.ParallelsDependencies", "ParallelsDependencies prepare can provide %s", new Object[] { localObject });
        if (((a)localObject).Sy())
          this.eLS.b((a)localObject);
        ab.d("MMSkeleton.ParallelsDependencies", "ParallelsDependencies prepare can provide %s done", new Object[] { localObject });
      }
    }
    ab.d("MMSkeleton.ParallelsDependencies", "ParallelsDependencies prepare %s done", new Object[] { this.eLT });
    AppMethodBeat.o(123339);
  }

  public final void reset(boolean paramBoolean)
  {
    AppMethodBeat.i(123338);
    Iterator localIterator = this.eLx.values().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (paramBoolean)
        locala.eLB = false;
      try
      {
        locala.eLV = locala.Sk();
        locala.eLX = false;
      }
      finally
      {
        AppMethodBeat.o(123338);
      }
    }
    AppMethodBeat.o(123338);
  }

  public static final class a<T> extends a.a<T>
  {
    volatile int eLV;
    private boolean eLW;
    volatile boolean eLX;
    public volatile a eLY;
    public volatile a eLZ;
    public h eMa;
    private c eMb;
    public f.b eMc;

    private a(T paramT, Class paramClass, c paramc)
    {
      super();
      AppMethodBeat.i(123327);
      this.eLV = 0;
      this.eLW = false;
      this.eLX = false;
      this.eMa = new h();
      this.eMc = new f.b();
      this.eMa.eLE = paramClass;
      this.eMb = paramc;
      AppMethodBeat.o(123327);
    }

    // ERROR //
    private void SA()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: ldc 71
      //   4: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   7: aload_0
      //   8: getfield 40	com/tencent/mm/kernel/a/b/f$a:eLX	Z
      //   11: ifeq +46 -> 57
      //   14: ldc 73
      //   16: ldc 75
      //   18: iconst_3
      //   19: anewarray 77	java/lang/Object
      //   22: dup
      //   23: iconst_0
      //   24: aload_0
      //   25: aastore
      //   26: dup
      //   27: iconst_1
      //   28: aload_0
      //   29: getfield 80	com/tencent/mm/kernel/a/a/a$a:eLB	Z
      //   32: invokestatic 86	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   35: aastore
      //   36: dup
      //   37: iconst_2
      //   38: aload_0
      //   39: getfield 47	com/tencent/mm/kernel/a/b/f$a:eMa	Lcom/tencent/mm/kernel/a/b/h;
      //   42: getfield 56	com/tencent/mm/kernel/a/b/h:eLE	Ljava/lang/Class;
      //   45: aastore
      //   46: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   49: ldc 71
      //   51: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   54: aload_0
      //   55: monitorexit
      //   56: return
      //   57: ldc 73
      //   59: ldc 94
      //   61: invokestatic 97	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   64: ldc 73
      //   66: ldc 99
      //   68: iconst_3
      //   69: anewarray 77	java/lang/Object
      //   72: dup
      //   73: iconst_0
      //   74: aload_0
      //   75: aastore
      //   76: dup
      //   77: iconst_1
      //   78: aload_0
      //   79: getfield 80	com/tencent/mm/kernel/a/a/a$a:eLB	Z
      //   82: invokestatic 86	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   85: aastore
      //   86: dup
      //   87: iconst_2
      //   88: aload_0
      //   89: getfield 47	com/tencent/mm/kernel/a/b/f$a:eMa	Lcom/tencent/mm/kernel/a/b/h;
      //   92: getfield 56	com/tencent/mm/kernel/a/b/h:eLE	Ljava/lang/Class;
      //   95: aastore
      //   96: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   99: aload_0
      //   100: invokevirtual 102	java/lang/Object:wait	()V
      //   103: ldc 73
      //   105: ldc 104
      //   107: iconst_3
      //   108: anewarray 77	java/lang/Object
      //   111: dup
      //   112: iconst_0
      //   113: aload_0
      //   114: aastore
      //   115: dup
      //   116: iconst_1
      //   117: aload_0
      //   118: getfield 80	com/tencent/mm/kernel/a/a/a$a:eLB	Z
      //   121: invokestatic 86	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   124: aastore
      //   125: dup
      //   126: iconst_2
      //   127: aload_0
      //   128: getfield 47	com/tencent/mm/kernel/a/b/f$a:eMa	Lcom/tencent/mm/kernel/a/b/h;
      //   131: getfield 56	com/tencent/mm/kernel/a/b/h:eLE	Ljava/lang/Class;
      //   134: aastore
      //   135: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   138: ldc 71
      //   140: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   143: goto -89 -> 54
      //   146: astore_1
      //   147: aload_0
      //   148: monitorexit
      //   149: aload_1
      //   150: athrow
      //   151: astore_1
      //   152: ldc 73
      //   154: aload_1
      //   155: ldc 106
      //   157: iconst_0
      //   158: anewarray 77	java/lang/Object
      //   161: invokestatic 110	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   164: ldc 71
      //   166: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   169: goto -115 -> 54
      //
      // Exception table:
      //   from	to	target	type
      //   2	7	146	finally
      //   7	49	146	finally
      //   49	54	146	finally
      //   57	138	146	finally
      //   138	143	146	finally
      //   152	169	146	finally
      //   7	49	151	java/lang/InterruptedException
      //   57	138	151	java/lang/InterruptedException
    }

    private boolean Sx()
    {
      if ((this.eLV == 0) && ((this.eLY == null) || (this.eLY.eLB)));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    private boolean Sz()
    {
      boolean bool1 = true;
      try
      {
        AppMethodBeat.i(123331);
        Object localObject1 = this.eLA;
        Class localClass = this.eMa.eLE;
        boolean bool2 = this.eLX;
        int i = this.eLV;
        a locala = this.eLY;
        Object localObject2;
        if (this.eLY != null)
        {
          localObject2 = Boolean.valueOf(this.eLY.eLB);
          ab.i("MMSkeleton.ParallelsDependencies", "ParallelsDependencies checkIfResolved for %s with type %s mProvided %s, %s, %s, %s, %s", new Object[] { localObject1, localClass, Boolean.valueOf(bool2), Integer.valueOf(i), locala, localObject2, this.eMa.eMm });
          if (!this.eLX)
            break label139;
          AppMethodBeat.o(123331);
        }
        while (true)
        {
          return bool1;
          localObject2 = "";
          break;
          label139: bool1 = Sx();
          AppMethodBeat.o(123331);
        }
      }
      finally
      {
      }
    }

    public final boolean SB()
    {
      try
      {
        AppMethodBeat.i(123333);
        this.eLV -= 1;
        boolean bool = Sy();
        AppMethodBeat.o(123333);
        return bool;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }

    public final boolean Sy()
    {
      boolean bool1 = false;
      try
      {
        AppMethodBeat.i(123330);
        Object localObject1 = this.eLA;
        Class localClass = this.eMa.eLE;
        boolean bool2 = this.eLX;
        int i = this.eLV;
        a locala = this.eLY;
        Object localObject2;
        if (this.eLY != null)
        {
          localObject2 = Boolean.valueOf(this.eLY.eLB);
          ab.d("MMSkeleton.ParallelsDependencies", "ParallelsDependencies checkIfResolvedAndSwallowIt for %s with type %s mProvided %s, %s, %s, %s, %s", new Object[] { localObject1, localClass, Boolean.valueOf(bool2), Integer.valueOf(i), locala, localObject2, this.eMa.eMm });
          if (!this.eLX)
            break label139;
          AppMethodBeat.o(123330);
        }
        while (true)
        {
          return bool1;
          localObject2 = "";
          break;
          label139: if (Sx())
          {
            ab.i("MMSkeleton.ParallelsDependencies", "checkIfResolvedAndSwallowIt node %s, consumed %s, phase %s resolved!", new Object[] { this, Boolean.valueOf(this.eLB), this.eMa.eLE });
            this.eLX = true;
            notify();
            AppMethodBeat.o(123330);
            bool1 = true;
          }
          else
          {
            AppMethodBeat.o(123330);
          }
        }
      }
      finally
      {
      }
    }

    public final void a(a.a parama)
    {
      AppMethodBeat.i(123328);
      super.a(parama);
      try
      {
        this.eLV += 1;
        return;
      }
      finally
      {
        AppMethodBeat.o(123328);
      }
      throw parama;
    }

    public final void a(com.tencent.mm.vending.c.a parama)
    {
      AppMethodBeat.i(123329);
      if (!this.eLB)
        if (!Sz())
        {
          Object localObject = Sj();
          Assert.assertNotNull(localObject);
          Iterator localIterator = ((HashSet)localObject).iterator();
          while (localIterator.hasNext())
          {
            localObject = (a.a)localIterator.next();
            if (!((a)localObject).eLB)
              ab.i("MMSkeleton.ParallelsDependencies", "ParallelsNode(%s) found it's depending node(%s) not consumed.", new Object[] { this, localObject });
          }
        }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          SA();
        this.eMc.eMd.dOV();
        if (!this.eLB)
        {
          j.i("MMSkeleton.ParallelsDependencies", "Consume node(%s) on phase(%s) may after waiting resolved.", new Object[] { this, this.eMa.eLE });
          parama.call(this);
          this.eLB = true;
        }
        this.eMc.eMd.done();
        AppMethodBeat.o(123329);
        return;
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(123334);
      String str = super.toString() + " - with type " + this.eMa.eLE;
      AppMethodBeat.o(123334);
      return str;
    }
  }

  public static final class b
  {
    public b eMd;

    public b()
    {
      AppMethodBeat.i(123335);
      this.eMd = new b();
      AppMethodBeat.o(123335);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.a.b.f
 * JD-Core Version:    0.6.2
 */