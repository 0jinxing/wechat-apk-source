package com.tencent.mm.loader.k;

import a.f.b.j;
import a.l;
import com.tencent.mm.loader.e.b.d;
import com.tencent.mm.loader.e.b.d.a;
import com.tencent.mm.loader.g.h;
import com.tencent.mm.loader.h.c;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/loader/task/LoadTask$call$1", "Lcom/tencent/mm/loader/task/LoadTask$ITask;", "onTaskDownFin", "", "resultData", "Lcom/tencent/mm/loader/model/LoadResult;", "onTaskFail", "onTaskRemove", "ontaskLoadFin", "libimageloader_release"})
public final class b$b
  implements b.a<R>
{
  public final void Uq()
  {
    this.eSF.b(h.eRk);
    this.eSF.a(this.eSF.eSD);
  }

  public final void a(c<R> paramc)
  {
    j.p(paramc, "resultData");
    this.eSF.b(h.eRj);
    if (paramc.isValid());
    for (Object localObject = paramc; ; localObject = null)
    {
      if (localObject != null)
      {
        ab.d(this.eSF.TAG, "[ImageLoader] run. get bitmap successs. %s", new Object[] { this.eSF.eQE });
        localObject = d.eQA;
        d.a.TN().a(this.eSF.eQE, paramc);
      }
      this.eSF.Up();
      this.eSF.a(this.eSF.eSD);
      return;
    }
  }

  public final void b(c<R> paramc)
  {
    j.p(paramc, "resultData");
    this.eSF.b(h.eRj);
    if (paramc.isValid());
    for (Object localObject = paramc; ; localObject = null)
    {
      if (localObject != null)
      {
        ab.d(this.eSF.TAG, "[ImageLoader] run. get bitmap successs. %s", new Object[] { this.eSF.eQE });
        localObject = d.eQA;
        d.a.TN().a(this.eSF.eQE, paramc);
      }
      this.eSF.Up();
      this.eSF.a(this.eSF.eSD);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.k.b.b
 * JD-Core Version:    0.6.2
 */