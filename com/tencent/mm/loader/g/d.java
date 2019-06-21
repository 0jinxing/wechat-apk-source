package com.tencent.mm.loader.g;

import a.f.b.j;
import a.f.b.k;
import a.l;
import a.v;
import a.y;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/loader/LoaderCore;", "T", "Lcom/tencent/mm/loader/loader/IWorkTask;", "Lcom/tencent/mm/loader/loader/ITaskLoader;", "configuration", "Lcom/tencent/mm/loader/loader/cfg/ITaskLoaderConfiguration;", "(Lcom/tencent/mm/loader/loader/cfg/ITaskLoaderConfiguration;)V", "callbackQueue", "Ljava/util/LinkedList;", "Lcom/tencent/mm/loader/loader/LoaderCoreCallback;", "getConfiguration", "()Lcom/tencent/mm/loader/loader/cfg/ITaskLoaderConfiguration;", "heavyWork", "Lcom/tencent/mm/loader/loader/ILoaderExecutor;", "lightWork", "mPendingQueue", "Lcom/tencent/mm/loader/loader/LoaderPair;", "mRunningQueue", "addTask", "", "t", "(Lcom/tencent/mm/loader/loader/IWorkTask;)V", "callback", "(Lcom/tencent/mm/loader/loader/IWorkTask;Lcom/tencent/mm/loader/loader/LoaderCoreCallback;)V", "callInUI", "callPrepareInUI", "", "clean", "dispatch", "task", "status", "Lcom/tencent/mm/loader/loader/WorkStatus;", "execute", "runnable", "Ljava/lang/Runnable;", "executeHeavy", "initHeavyLoader", "initLoader", "logHead", "", "register", "removeTask", "unregister", "Companion", "libimageloader_release"})
public final class d<T extends c>
  implements b
{
  public static final d.a eQY = new d.a((byte)0);
  private a eQT;
  private a eQU;
  private final LinkedList<g<c, f<T>>> eQV;
  private final LinkedList<g<c, f<T>>> eQW;
  private final com.tencent.mm.loader.g.a.d eQX;
  private final LinkedList<f<T>> ezr;

  public d(com.tencent.mm.loader.g.a.d paramd)
  {
    this.eQX = paramd;
    this.ezr = new LinkedList();
    this.eQV = new LinkedList();
    this.eQW = new LinkedList();
  }

  private final String TO()
  {
    return "name:" + this.eQX.name() + "_this:" + hashCode() + '_';
  }

  private final void TP()
  {
    if (this.eQT != null);
    while (true)
    {
      return;
      this.eQT = this.eQX.TR();
    }
  }

  private final boolean TQ()
  {
    boolean bool = false;
    if (this.eQV.size() <= 0)
      ab.i("MicroMsg.Loader.DefaultTaskLoader", TO() + "DefaultTaskLoader mPendingQueue is empty");
    while (true)
    {
      return bool;
      if (this.eQW.size() <= this.eQX.TT())
      {
        ab.i("MicroMsg.Loader.DefaultTaskLoader", TO() + "callPrepare RunningQueue %s max_run_task %s mPendingQueue %s", new Object[] { Integer.valueOf(this.eQW.size()), Integer.valueOf(this.eQX.TT()), Integer.valueOf(this.eQV.size()) });
        Object localObject1 = this.eQV.remove(0);
        j.o(localObject1, "mPendingQueue.removeAt(0)");
        Object localObject2 = (g)localObject1;
        this.eQW.add(localObject2);
        if (!this.eQX.TU().b((c)((g)localObject2).first))
        {
          ab.w("MicroMsg.Loader.DefaultTaskLoader", TO() + " block retryStrategy " + localObject2 + ".first");
          localObject1 = (f)((g)localObject2).second;
          if (localObject1 != null)
          {
            localObject2 = ((g)localObject2).first;
            if (localObject2 == null)
              throw new v("null cannot be cast to non-null type T");
            ((f)localObject1).a((c)localObject2, h.eRi);
          }
          bool = true;
        }
        else
        {
          execute((Runnable)new i((c)((g)localObject2).first, (b)this, (i.a)new d.c(this)));
          bool = true;
        }
      }
    }
  }

  public final void a(T paramT)
  {
    j.p(paramT, "t");
    a(paramT, null);
  }

  public final void a(T paramT, f<T> paramf)
  {
    j.p(paramT, "t");
    com.tencent.mm.ab.b.a((a.f.a.a)new d.b(this, paramT, paramf));
  }

  public final void a(final f<T> paramf)
  {
    j.p(paramf, "callback");
    com.tencent.mm.ab.b.a((a.f.a.a)new f(this, paramf));
  }

  public final void b(f<T> paramf)
  {
    j.p(paramf, "callback");
    com.tencent.mm.ab.b.a((a.f.a.a)new d.g(this, paramf));
  }

  public final void clean()
  {
    com.tencent.mm.ab.b.a((a.f.a.a)new d.d(this));
  }

  public final void execute(Runnable paramRunnable)
  {
    j.p(paramRunnable, "runnable");
    TP();
    a locala = this.eQT;
    if (locala != null)
      locala.execute(paramRunnable);
  }

  public final void u(Runnable paramRunnable)
  {
    j.p(paramRunnable, "runnable");
    if (this.eQU == null)
      this.eQU = this.eQX.TS();
    a locala = this.eQU;
    if (locala != null)
      locala.execute(paramRunnable);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "Lcom/tencent/mm/loader/loader/IWorkTask;", "invoke"})
  static final class f extends k
    implements a.f.a.a<y>
  {
    f(d paramd, f paramf)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.g.d
 * JD-Core Version:    0.6.2
 */