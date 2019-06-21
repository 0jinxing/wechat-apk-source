package android.support.v7.widget;

import android.view.View;

final class RecyclerView$g
  implements RecyclerView.f.b
{
  RecyclerView$g(RecyclerView paramRecyclerView)
  {
  }

  public final void n(RecyclerView.v paramv)
  {
    boolean bool = true;
    paramv.ao(true);
    if ((paramv.apP != null) && (paramv.apQ == null))
      paramv.apP = null;
    paramv.apQ = null;
    RecyclerView localRecyclerView;
    Object localObject;
    v localv;
    int i;
    if (!RecyclerView.v.z(paramv))
    {
      localRecyclerView = this.aoo;
      localObject = paramv.apJ;
      localRecyclerView.jl();
      localv = localRecyclerView.anf;
      i = localv.aha.indexOfChild((View)localObject);
      if (i != -1)
        break label155;
      localv.aX((View)localObject);
      i = 1;
      if (i != 0)
      {
        localObject = RecyclerView.bn((View)localObject);
        localRecyclerView.anc.t((RecyclerView.v)localObject);
        localRecyclerView.anc.s((RecyclerView.v)localObject);
      }
      if (i != 0)
        break label211;
    }
    while (true)
    {
      localRecyclerView.ak(bool);
      if ((i == 0) && (paramv.ks()))
        this.aoo.removeDetachedView(paramv.apJ, false);
      return;
      label155: if (localv.ahb.get(i))
      {
        localv.ahb.bJ(i);
        localv.aX((View)localObject);
        localv.aha.removeViewAt(i);
        i = 1;
        break;
      }
      i = 0;
      break;
      label211: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.g
 * JD-Core Version:    0.6.2
 */