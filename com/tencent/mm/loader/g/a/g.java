package com.tencent.mm.loader.g.a;

import a.l;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/loader/cfg/TaskLoaderConfiguration;", "Lcom/tencent/mm/loader/loader/cfg/ITaskLoaderConfiguration;", "lightWork", "Lcom/tencent/mm/loader/loader/cfg/ThreadConfiguration;", "parallelTask", "", "name", "", "(Lcom/tencent/mm/loader/loader/cfg/ThreadConfiguration;ILjava/lang/String;)V", "retrySg", "Lcom/tencent/mm/loader/loader/cfg/ILoaderRetryStrategy;", "(Lcom/tencent/mm/loader/loader/cfg/ILoaderRetryStrategy;Lcom/tencent/mm/loader/loader/cfg/ThreadConfiguration;ILjava/lang/String;)V", "heavyWork", "ioWork", "(Lcom/tencent/mm/loader/loader/cfg/ThreadConfiguration;Lcom/tencent/mm/loader/loader/cfg/ThreadConfiguration;Lcom/tencent/mm/loader/loader/cfg/ThreadConfiguration;ILjava/lang/String;)V", "(Lcom/tencent/mm/loader/loader/cfg/ILoaderRetryStrategy;Lcom/tencent/mm/loader/loader/cfg/ThreadConfiguration;Lcom/tencent/mm/loader/loader/cfg/ThreadConfiguration;Lcom/tencent/mm/loader/loader/cfg/ThreadConfiguration;ILjava/lang/String;)V", "TAG", "createHeavyExecutor", "Lcom/tencent/mm/loader/loader/ILoaderExecutor;", "createIoExecutor", "createLightExecutor", "retryStrategy", "libimageloader_release"})
public final class g
  implements d
{
  private final String TAG;
  private final c eRD;
  private final h eRE;
  private final h eRF;
  private final h eRG;
  private final int eRH;
  private final String name;

  public g(c paramc, h paramh1, h paramh2, h paramh3, int paramInt, String paramString)
  {
    this.eRD = paramc;
    this.eRE = paramh1;
    this.eRF = paramh2;
    this.eRG = paramh3;
    this.eRH = paramInt;
    this.name = paramString;
    this.TAG = "MicroMsg.Loader.TaskLoaderConfiguration";
  }

  public g(c paramc, h paramh, String paramString)
  {
    this(paramc, paramh, paramh, paramh, 1, paramString);
  }

  public final com.tencent.mm.loader.g.a TR()
  {
    ab.i(this.TAG, "pool light poolSize " + this.eRE.eRI + " priority " + this.eRE.eRI + " name: " + this.name);
    return (com.tencent.mm.loader.g.a)new b(this.eRE.eRI, this.eRE.eRI, TimeUnit.MILLISECONDS, (BlockingQueue)new com.tencent.mm.loader.i.a(), (ThreadFactory)new f(this.eRE.priority, this.name));
  }

  public final com.tencent.mm.loader.g.a TS()
  {
    ab.i(this.TAG, "pool heavy poolSize " + this.eRF.eRI + " priority " + this.eRF.eRI + " name: " + this.name);
    return (com.tencent.mm.loader.g.a)new b(this.eRF.eRI, this.eRF.eRI, TimeUnit.MILLISECONDS, (BlockingQueue)new com.tencent.mm.loader.i.a(), (ThreadFactory)new f(this.eRF.priority, this.name));
  }

  public final int TT()
  {
    return this.eRH;
  }

  public final c TU()
  {
    return this.eRD;
  }

  public final String name()
  {
    return this.name;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.g.a.g
 * JD-Core Version:    0.6.2
 */