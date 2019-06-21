package com.tencent.mm.kernel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.c.d.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class c
{
  public com.tencent.mm.kernel.a.a.a<Class<? extends com.tencent.mm.kernel.b.f>> eJA;
  private com.tencent.mm.kernel.c.d eJB;
  protected a eJC;
  public Class<? extends com.tencent.mm.kernel.b.a> eJD;
  private com.tencent.mm.kernel.a.a eJE;
  private final ConcurrentHashMap<Class<? extends com.tencent.mm.kernel.b.a>, com.tencent.mm.kernel.b.f> eJw;
  private final ArrayList<com.tencent.mm.kernel.b.f> eJx;
  private final ConcurrentHashMap<Class<? extends com.tencent.mm.kernel.b.f>, ArrayList<Class<? extends com.tencent.mm.kernel.b.a>>> eJy;
  private final ConcurrentHashMap<Class<? extends com.tencent.mm.kernel.b.a>, Class<? extends com.tencent.mm.kernel.b.f>> eJz;

  public c()
  {
    AppMethodBeat.i(123231);
    this.eJw = new ConcurrentHashMap();
    this.eJx = new ArrayList();
    this.eJy = new ConcurrentHashMap();
    this.eJz = new ConcurrentHashMap();
    this.eJA = new com.tencent.mm.kernel.a.a.a();
    this.eJB = new com.tencent.mm.kernel.c.d();
    this.eJD = null;
    this.eJB.eMF = new d.a()
    {
      public final void a(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        AppMethodBeat.i(123230);
        if (c.this.eJC != null)
          c.this.eJC.d(paramAnonymousa);
        AppMethodBeat.o(123230);
      }

      public final void a(com.tencent.mm.kernel.c.c paramAnonymousc)
      {
        AppMethodBeat.i(123228);
        if (((paramAnonymousc instanceof com.tencent.mm.kernel.c.e)) && (c.this.eJC != null))
          c.this.eJC.b(paramAnonymousc.SJ());
        AppMethodBeat.o(123228);
      }

      public final void b(com.tencent.mm.kernel.c.c paramAnonymousc)
      {
        AppMethodBeat.i(123229);
        if (((paramAnonymousc instanceof com.tencent.mm.kernel.c.e)) && (c.this.eJC != null))
          c.this.eJC.c(paramAnonymousc.SJ());
        AppMethodBeat.o(123229);
      }
    };
    AppMethodBeat.o(123231);
  }

  private <T extends com.tencent.mm.kernel.b.a> T N(Class<T> paramClass)
  {
    try
    {
      AppMethodBeat.i(123243);
      Assert.assertNotNull(paramClass);
      paramClass = (com.tencent.mm.kernel.b.a)this.eJw.get(paramClass);
      AppMethodBeat.o(123243);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }

  private boolean O(Class<? extends com.tencent.mm.kernel.b.a> paramClass)
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(123244);
      Assert.assertNotNull(paramClass);
      if (!J(paramClass))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Plugin ");
        j.w("MMSkeleton.CorePlugins", paramClass + " must be installed!", new Object[0]);
        AppMethodBeat.o(123244);
      }
      while (true)
      {
        return bool;
        bool = true;
        AppMethodBeat.o(123244);
      }
    }
    finally
    {
    }
    throw paramClass;
  }

  private com.tencent.mm.kernel.b.f a(com.tencent.mm.kernel.b.f paramf)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(123236);
        if (J(paramf.getClass()))
        {
          j.w("MMSkeleton.CorePlugins", "Plugin %s has been installed.", new Object[] { paramf.getClass() });
          paramf = (com.tencent.mm.kernel.b.f)N(paramf.getClass());
          AppMethodBeat.o(123236);
          return paramf;
        }
        Assert.assertNotNull(paramf);
        String[] arrayOfString = paramf.ofProcesses();
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          g localg = h.RT().RM().Rn();
          int i = arrayOfString.length;
          int j = 0;
          int k = 0;
          if (j < i)
          {
            boolean bool = localg.lQ(arrayOfString[j]);
            k = bool;
            if (!bool)
            {
              j++;
              k = bool;
              continue;
            }
          }
          if (k == 0)
          {
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            localIllegalStateException.<init>(String.format("Plugin %s can't install in process %s. It only support process %s.", new Object[] { paramf, localg.eHT, Arrays.asList(arrayOfString) }));
            AppMethodBeat.o(123236);
            throw localIllegalStateException;
          }
        }
      }
      finally
      {
      }
      this.eJw.put(paramf.getClass(), paramf);
      this.eJx.add(paramf);
      paramf.invokeInstalled();
      if (this.eJC != null)
        this.eJC.b(paramf);
      AppMethodBeat.o(123236);
    }
  }

  private com.tencent.mm.kernel.b.f a(Class<? extends com.tencent.mm.kernel.b.f> paramClass, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(123233);
      Assert.assertNotNull(paramClass);
      try
      {
        com.tencent.mm.kernel.b.f localf = (com.tencent.mm.kernel.b.f)paramClass.newInstance();
        if (paramBoolean)
          localf.markAsPendingPlugin();
        localf = a(localf);
        paramClass = localf;
        AppMethodBeat.o(123233);
        return paramClass;
      }
      catch (Exception localException)
      {
        while (true)
        {
          j.printErrStackTrace("MMSkeleton.CorePlugins", localException, "Install plugin %s failed.", new Object[] { paramClass });
          paramClass = null;
          AppMethodBeat.o(123233);
        }
      }
    }
    finally
    {
    }
    throw paramClass;
  }

  public final com.tencent.mm.kernel.b.f I(Class<? extends com.tencent.mm.kernel.b.f> paramClass)
  {
    try
    {
      AppMethodBeat.i(123232);
      paramClass = a(paramClass, false);
      AppMethodBeat.o(123232);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }

  public final boolean J(Class<? extends com.tencent.mm.kernel.b.a> paramClass)
  {
    try
    {
      AppMethodBeat.i(123237);
      boolean bool = this.eJw.containsKey(paramClass);
      AppMethodBeat.o(123237);
      return bool;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }

  public final <T extends com.tencent.mm.kernel.c.a> T K(Class<T> paramClass)
  {
    AppMethodBeat.i(123239);
    com.tencent.mm.kernel.c.a locala = this.eJB.U(paramClass);
    int i;
    if (locala == null)
      if (paramClass != null)
      {
        Object localObject = (com.tencent.mm.kernel.b.e)paramClass.getAnnotation(com.tencent.mm.kernel.b.e.class);
        if ((localObject != null) && (((com.tencent.mm.kernel.b.e)localObject).value() != null))
        {
          localObject = M(((com.tencent.mm.kernel.b.e)localObject).value());
          if ((localObject != null) && (!f.ay(localObject)))
          {
            i = 1;
            if (i == 0)
              break label149;
            j.i("MMSkeleton.CorePlugins", "Try load OwnerPlugin for service(%s)...", new Object[] { paramClass });
            locala = this.eJB.U(paramClass);
          }
        }
      }
    label149: 
    while (true)
    {
      if (locala != null)
        AppMethodBeat.o(123239);
      while (true)
      {
        return locala;
        i = 0;
        break;
        i = 0;
        break;
        h.RT().RM();
        j.RU();
        locala = (com.tencent.mm.kernel.c.a)f.P(paramClass);
        AppMethodBeat.o(123239);
      }
    }
  }

  public final void L(Class<? extends com.tencent.mm.kernel.c.a> paramClass)
  {
    AppMethodBeat.i(123241);
    this.eJB.L(paramClass);
    AppMethodBeat.o(123241);
  }

  public final <T extends com.tencent.mm.kernel.b.a> T M(Class<T> paramClass)
  {
    while (true)
    {
      com.tencent.mm.kernel.b.a locala;
      try
      {
        AppMethodBeat.i(123242);
        locala = N(paramClass);
        if (this.eJC != null)
          this.eJC.c((com.tencent.mm.kernel.b.f)locala);
        if (locala == null)
        {
          paramClass = (com.tencent.mm.kernel.b.a)f.P(paramClass);
          AppMethodBeat.o(123242);
          return paramClass;
        }
      }
      finally
      {
      }
      paramClass = locala;
    }
  }

  public final void Rl()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(123246);
        Iterator localIterator = this.eJx.iterator();
        if (!localIterator.hasNext())
          break;
        com.tencent.mm.kernel.b.f localf = (com.tencent.mm.kernel.b.f)localIterator.next();
        if (!localf.isDependencyMade())
        {
          com.tencent.mm.kernel.a.a.k("make dependency for plugin %s...", new Object[] { localf });
          localf.invokeDependency();
          continue;
        }
      }
      finally
      {
      }
      com.tencent.mm.kernel.a.a.k("skip make dependency for plugin %s.", new Object[] { localObject });
    }
    AppMethodBeat.o(123246);
  }

  public final List<com.tencent.mm.kernel.b.f> Rm()
  {
    try
    {
      ArrayList localArrayList = this.eJx;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final <T extends com.tencent.mm.kernel.c.a, N extends T> void a(Class<T> paramClass, com.tencent.mm.kernel.c.c<N> paramc)
  {
    AppMethodBeat.i(123240);
    this.eJB.b(paramClass, paramc);
    AppMethodBeat.o(123240);
  }

  public final void k(Class<? extends com.tencent.mm.kernel.b.f> paramClass, Class<? extends com.tencent.mm.kernel.b.a> paramClass1)
  {
    try
    {
      AppMethodBeat.i(123238);
      Assert.assertNotNull(paramClass);
      Assert.assertNotNull(paramClass1);
      com.tencent.mm.kernel.b.f localf = (com.tencent.mm.kernel.b.f)this.eJw.get(paramClass);
      Assert.assertNotNull(localf);
      ArrayList localArrayList1 = (ArrayList)this.eJy.get(paramClass);
      ArrayList localArrayList2 = localArrayList1;
      if (localArrayList1 == null)
      {
        localArrayList2 = new java/util/ArrayList;
        localArrayList2.<init>();
        this.eJy.put(paramClass, localArrayList2);
      }
      this.eJz.put(paramClass1, paramClass);
      localArrayList2.add(paramClass1);
      this.eJw.put(paramClass1, localf);
      AppMethodBeat.o(123238);
      return;
    }
    finally
    {
    }
    throw paramClass;
  }

  public final void l(Class<? extends com.tencent.mm.kernel.b.f> paramClass, Class<? extends com.tencent.mm.kernel.b.a> paramClass1)
  {
    AppMethodBeat.i(123245);
    Assert.assertNotNull(paramClass);
    Assert.assertNotNull(paramClass1);
    if (!O(paramClass1))
    {
      paramClass = String.format("depends plugin %s not install, plugin %s will not add in to dependency tree", new Object[] { paramClass1.getName(), paramClass.getName() });
      j.e("MMSkeleton.CorePlugins", paramClass, new Object[0]);
      paramClass = new IllegalAccessError(paramClass);
      AppMethodBeat.o(123245);
      throw paramClass;
    }
    Object localObject = paramClass1;
    if (this.eJz.containsKey(paramClass1))
      localObject = (Class)this.eJz.get(paramClass1);
    this.eJA.n(paramClass, localObject);
    if (this.eJE == null)
      this.eJE = h.RT().RM().Rn().eJE;
    paramClass = (com.tencent.mm.kernel.b.f)N(paramClass);
    paramClass1 = (com.tencent.mm.kernel.b.f)N((Class)localObject);
    this.eJE.eKM.a(com.tencent.mm.kernel.b.b.class, paramClass, paramClass1);
    this.eJE.eKM.a(com.tencent.mm.kernel.a.c.b.class, paramClass, paramClass1);
    AppMethodBeat.o(123245);
  }

  public final com.tencent.mm.kernel.b.f lH(String paramString)
  {
    try
    {
      AppMethodBeat.i(123234);
      paramString = u(paramString, false);
      AppMethodBeat.o(123234);
      return paramString;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  // ERROR //
  public final com.tencent.mm.kernel.b.f u(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 373
    //   5: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: invokestatic 377	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   12: astore_3
    //   13: ldc 143
    //   15: aload_3
    //   16: invokevirtual 380	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   19: ifeq +22 -> 41
    //   22: aload_0
    //   23: aload_3
    //   24: iload_2
    //   25: invokespecial 234	com/tencent/mm/kernel/c:a	(Ljava/lang/Class;Z)Lcom/tencent/mm/kernel/b/f;
    //   28: astore_3
    //   29: aload_3
    //   30: astore_1
    //   31: ldc_w 373
    //   34: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: areturn
    //   41: ldc 111
    //   43: ldc_w 382
    //   46: iconst_1
    //   47: anewarray 4	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: aload_1
    //   53: aastore
    //   54: invokestatic 340	com/tencent/mm/kernel/j:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   57: aconst_null
    //   58: astore_1
    //   59: ldc_w 373
    //   62: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   65: goto -28 -> 37
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    //   73: astore_3
    //   74: ldc 111
    //   76: ldc_w 384
    //   79: iconst_1
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload_1
    //   86: aastore
    //   87: invokestatic 340	com/tencent/mm/kernel/j:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   90: invokestatic 153	com/tencent/mm/kernel/h:RT	()Lcom/tencent/mm/kernel/h;
    //   93: invokevirtual 157	com/tencent/mm/kernel/h:RM	()Lcom/tencent/mm/kernel/d;
    //   96: pop
    //   97: invokestatic 269	com/tencent/mm/kernel/j:RU	()V
    //   100: goto -43 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   2	8	68	finally
    //   8	29	68	finally
    //   31	37	68	finally
    //   41	57	68	finally
    //   59	65	68	finally
    //   74	100	68	finally
    //   8	29	73	java/lang/ClassNotFoundException
    //   41	57	73	java/lang/ClassNotFoundException
  }

  public static abstract interface a
  {
    public abstract void b(com.tencent.mm.kernel.b.f paramf);

    public abstract void b(com.tencent.mm.kernel.c.a parama);

    public abstract void c(com.tencent.mm.kernel.b.f paramf);

    public abstract void c(com.tencent.mm.kernel.c.a parama);

    public abstract void d(com.tencent.mm.kernel.c.a parama);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.c
 * JD-Core Version:    0.6.2
 */