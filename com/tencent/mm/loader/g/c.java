package com.tencent.mm.loader.g;

import a.f.b.j;
import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/loader/IWorkTask;", "", "()V", "<set-?>", "Lcom/tencent/mm/loader/loader/ITaskLoader;", "loader", "getLoader", "()Lcom/tencent/mm/loader/loader/ITaskLoader;", "setLoader", "(Lcom/tencent/mm/loader/loader/ITaskLoader;)V", "watch", "Lcom/tencent/mm/loader/loader/WorkTaskWrap$IWorkTaskWrap;", "call", "", "callback", "status", "Lcom/tencent/mm/loader/loader/WorkStatus;", "uniqueId", "", "libimageloader_release"})
public abstract class c
{
  protected b eQR;
  i.a eQS;

  public abstract void Pa();

  public abstract String Pc();

  public final void a(h paramh)
  {
    j.p(paramh, "status");
    i.a locala = this.eQS;
    if (locala == null)
      j.avw("watch");
    locala.b(this, paramh);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.g.c
 * JD-Core Version:    0.6.2
 */