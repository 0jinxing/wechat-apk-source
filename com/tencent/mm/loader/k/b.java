package com.tencent.mm.loader.k;

import a.f.b.j;
import a.l;
import com.tencent.mm.loader.b.a.d;
import com.tencent.mm.loader.c.e.b;
import com.tencent.mm.loader.g.h;
import com.tencent.mm.loader.h.a.a;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/task/LoadTask;", "T", "R", "Lcom/tencent/mm/loader/loader/IWorkTask;", "url", "Lcom/tencent/mm/loader/model/data/DataItem;", "target", "Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;", "REAPER", "Lcom/tencent/mm/loader/Reaper;", "(Lcom/tencent/mm/loader/model/data/DataItem;Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;Lcom/tencent/mm/loader/Reaper;)V", "getREAPER", "()Lcom/tencent/mm/loader/Reaper;", "setREAPER", "(Lcom/tencent/mm/loader/Reaper;)V", "TAG", "", "debugInfo", "getDebugInfo", "()Ljava/lang/String;", "setDebugInfo", "(Ljava/lang/String;)V", "getTarget", "()Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;", "setTarget", "(Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;)V", "taskStatus", "Lcom/tencent/mm/loader/loader/WorkStatus;", "getTaskStatus", "()Lcom/tencent/mm/loader/loader/WorkStatus;", "setTaskStatus", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "getUrl", "()Lcom/tencent/mm/loader/model/data/DataItem;", "setUrl", "(Lcom/tencent/mm/loader/model/data/DataItem;)V", "cacheImageToDisk", "", "httpResponse", "Lcom/tencent/mm/loader/model/Response;", "source", "Lcom/tencent/mm/loader/model/Resource;", "resource", "task", "call", "debugCheck", "execute", "fileType", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions$LoadFrom;", "taskListener", "Lcom/tencent/mm/loader/task/LoadTask$ITask;", "isAddTaskWhePause", "", "reportReadCacheTime", "time", "", "taskEnd", "resultData", "Lcom/tencent/mm/loader/model/LoadResult;", "uniqueId", "ITask", "libimageloader_release"})
public abstract class b<T, R> extends com.tencent.mm.loader.g.c
{
  final String TAG;
  com.tencent.mm.loader.e.b.c<R> eOZ;
  public String ePa;
  a<T> eQE;
  h eSD;
  com.tencent.mm.loader.f<T, R> eSE;

  public b(a<T> parama, com.tencent.mm.loader.e.b.c<R> paramc, com.tencent.mm.loader.f<T, R> paramf)
  {
    this.eQE = parama;
    this.eOZ = paramc;
    this.eSE = paramf;
    this.TAG = "MicroMsg.Loader.ImageLoader.ImageLoadTask";
    this.eSD = h.eRh;
  }

  public final void Pa()
  {
    System.currentTimeMillis();
    e.b localb = this.eSE.eOF.Ty();
    j.o(localb, "fileType");
    a(localb, (b.a)new b.b(this));
  }

  public final String Pc()
  {
    String str = this.eQE.toString();
    j.o(str, "url.toString()");
    return str;
  }

  protected final void Up()
  {
    Object localObject = this.eSE;
    if (((com.tencent.mm.loader.f)localObject).eOI != null)
      ((com.tencent.mm.loader.f)localObject).Tc();
    ((com.tencent.mm.loader.f)localObject).Tc();
    localObject = this.eSE.eOF.TG();
    Arrays.copyOf((Object[])localObject, localObject.length);
  }

  protected abstract void a(e.b paramb, b.a<R> parama);

  public final void a(com.tencent.mm.loader.h.f<?> paramf, com.tencent.mm.loader.h.e<R> parame1, com.tencent.mm.loader.h.e<R> parame2, b<T, R> paramb)
  {
    j.p(paramf, "httpResponse");
    j.p(parame1, "source");
    j.p(paramb, "task");
    if (this.eSE.eOF.Tt())
      this.eSE.eOL.a(this.eQE, paramf, parame1, parame2, this.eSE.eOF, this.eSE);
    if (this.eSE.eOF.Tu())
      this.eSE.eOL.a(this.eQE, paramf, parame1, parame2, this.eSE.eOF, this.eSE);
  }

  public final void b(h paramh)
  {
    j.p(paramh, "<set-?>");
    this.eSD = paramh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.k.b
 * JD-Core Version:    0.6.2
 */