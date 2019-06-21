package com.tencent.mm.loader.g.a;

import a.f.b.j;
import a.f.b.v;
import a.l;
import a.y;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/loader/cfg/LoaderCoreFactory;", "", "()V", "DEFAULT_THREAD_POOL_SIZE", "", "DEFAULT_THREAD_PRIORITY", "TAG", "", "getTAG", "()Ljava/lang/String;", "_instance", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/loader/loader/IWorkTask;", "getInstance", "newLoader", "configuration", "Lcom/tencent/mm/loader/loader/cfg/TaskLoaderConfiguration;", "libimageloader_release"})
public final class e
{
  private static final String TAG = "MicroMsg.Loader.LoaderFactory";
  public static final e eRA = new e();
  private static volatile com.tencent.mm.loader.g.d<com.tencent.mm.loader.g.c> eRz;

  public static com.tencent.mm.loader.g.d<com.tencent.mm.loader.g.c> TV()
  {
    if (eRz == null);
    synchronized (v.aN(com.tencent.mm.loader.g.d.class))
    {
      Object localObject2 = new com/tencent/mm/loader/g/d;
      g localg = new com/tencent/mm/loader/g/a/g;
      Object localObject4 = new com/tencent/mm/loader/g/a/a;
      ((a)localObject4).<init>(2147483647);
      localObject4 = (c)localObject4;
      h localh1 = new com/tencent/mm/loader/g/a/h;
      localh1.<init>(3);
      h localh2 = new com/tencent/mm/loader/g/a/h;
      localh2.<init>(3);
      h localh3 = new com/tencent/mm/loader/g/a/h;
      localh3.<init>(3);
      localg.<init>((c)localObject4, localh1, localh2, localh3, 3, "imageLoader");
      ((com.tencent.mm.loader.g.d)localObject2).<init>((d)localg);
      eRz = (com.tencent.mm.loader.g.d)localObject2;
      localObject2 = y.AUy;
      ??? = eRz;
      if (??? == null)
        j.dWJ();
      return ???;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.g.a.e
 * JD-Core Version:    0.6.2
 */