package com.tencent.mm.loader.e.b;

import a.f.b.j;
import a.l;
import a.v;
import android.os.Looper;
import com.tencent.mm.sdk.platformtools.al;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;", "R", "", "weakHolder", "Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;)V", "getWeakHolder", "()Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;", "setWeakHolder", "onResourceReady", "", "resource", "(Ljava/lang/Object;)V", "onResourceReadyUI", "viewWeakHolder", "(Ljava/lang/Object;Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;)V", "updateBackgroundUI", "request", "Lcom/tencent/mm/loader/Reaper;", "updateDefaultDrawable", "libimageloader_release"})
public abstract class c<R>
{
  public f<?> eQw;

  public c(f<?> paramf)
  {
    this.eQw = paramf;
  }

  public abstract void a(f<?> paramf, com.tencent.mm.loader.f<?, ?> paramf1);

  protected abstract void a(R paramR, f<?> paramf);

  public final void aP(R paramR)
  {
    Thread localThread = Thread.currentThread();
    Looper localLooper = Looper.getMainLooper();
    j.o(localLooper, "Looper.getMainLooper()");
    if (localThread == localLooper.getThread())
    {
      a(paramR, this.eQw);
      paramR = d.eQA;
      paramR = d.a.TN();
      if (this == null)
        throw new v("null cannot be cast to non-null type com.tencent.mm.loader.impr.target.ResourceShowTarget<kotlin.Any>");
      paramR.a((c)this);
    }
    while (true)
    {
      return;
      al.d((Runnable)new c.a(this, paramR));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.b.c
 * JD-Core Version:    0.6.2
 */