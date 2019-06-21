package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;

class bd
{
  private DexLoader a = null;
  private Object b = null;

  public bd(DexLoader paramDexLoader)
  {
    this.a = paramDexLoader;
  }

  public Object a(Context paramContext, Object paramObject, Bundle paramBundle)
  {
    AppMethodBeat.i(64614);
    if (this.a != null)
      this.b = this.a.newInstance("com.tencent.tbs.cache.TbsVideoCacheTaskProxy", new Class[] { Context.class, Object.class, Bundle.class }, new Object[] { paramContext, paramObject, paramBundle });
    paramContext = this.b;
    AppMethodBeat.o(64614);
    return paramContext;
  }

  public void a()
  {
    AppMethodBeat.i(64615);
    if (this.a != null)
      this.a.invokeMethod(this.b, "com.tencent.tbs.cache.TbsVideoCacheTaskProxy", "pauseTask", new Class[0], new Object[0]);
    AppMethodBeat.o(64615);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(64618);
    if (this.a != null)
      this.a.invokeMethod(this.b, "com.tencent.tbs.cache.TbsVideoCacheTaskProxy", "removeTask", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(64618);
  }

  public void b()
  {
    AppMethodBeat.i(64616);
    if (this.a != null)
      this.a.invokeMethod(this.b, "com.tencent.tbs.cache.TbsVideoCacheTaskProxy", "resumeTask", new Class[0], new Object[0]);
    AppMethodBeat.o(64616);
  }

  public void c()
  {
    AppMethodBeat.i(64617);
    if (this.a != null)
      this.a.invokeMethod(this.b, "com.tencent.tbs.cache.TbsVideoCacheTaskProxy", "stopTask", new Class[0], new Object[0]);
    AppMethodBeat.o(64617);
  }

  public long d()
  {
    AppMethodBeat.i(64619);
    long l;
    if (this.a != null)
    {
      Object localObject = this.a.invokeMethod(this.b, "com.tencent.tbs.cache.TbsVideoCacheTaskProxy", "getContentLength", new Class[0], new Object[0]);
      if ((localObject instanceof Long))
      {
        l = ((Long)localObject).longValue();
        AppMethodBeat.o(64619);
      }
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(64619);
    }
  }

  public int e()
  {
    AppMethodBeat.i(64620);
    int i;
    if (this.a != null)
    {
      Object localObject = this.a.invokeMethod(this.b, "com.tencent.tbs.cache.TbsVideoCacheTaskProxy", "getDownloadedSize", new Class[0], new Object[0]);
      if ((localObject instanceof Integer))
      {
        i = ((Integer)localObject).intValue();
        AppMethodBeat.o(64620);
      }
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(64620);
      i = 0;
    }
  }

  public int f()
  {
    AppMethodBeat.i(64621);
    int i;
    if (this.a != null)
    {
      Object localObject = this.a.invokeMethod(this.b, "com.tencent.tbs.cache.TbsVideoCacheTaskProxy", "getProgress", new Class[0], new Object[0]);
      if ((localObject instanceof Integer))
      {
        i = ((Integer)localObject).intValue();
        AppMethodBeat.o(64621);
      }
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(64621);
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bd
 * JD-Core Version:    0.6.2
 */