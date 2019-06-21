package android.support.v7.widget;

final class RecyclerView$4
  implements bj.b
{
  RecyclerView$4(RecyclerView paramRecyclerView)
  {
  }

  public final void a(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    this.aoo.anc.t(paramv);
    RecyclerView localRecyclerView = this.aoo;
    localRecyclerView.f(paramv);
    paramv.ao(false);
    if (localRecyclerView.anJ.d(paramv, paramc1, paramc2))
      localRecyclerView.jA();
  }

  public final void b(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    RecyclerView localRecyclerView = this.aoo;
    paramv.ao(false);
    if (localRecyclerView.anJ.e(paramv, paramc1, paramc2))
      localRecyclerView.jA();
  }

  public final void c(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    paramv.ao(false);
    if (this.aoo.anA)
      if (this.aoo.anJ.a(paramv, paramv, paramc1, paramc2))
        this.aoo.jA();
    while (true)
    {
      return;
      if (this.aoo.anJ.f(paramv, paramc1, paramc2))
        this.aoo.jA();
    }
  }

  public final void j(RecyclerView.v paramv)
  {
    this.aoo.ank.a(paramv.apJ, this.aoo.anc);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.4
 * JD-Core Version:    0.6.2
 */