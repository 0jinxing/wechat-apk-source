package com.tencent.mm.pluginsdk.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class d
  implements AbsListView.OnScrollListener
{
  private AbsListView.OnScrollListener vgR;
  private ArrayList<WeakReference<d.a>> vgS;

  public d()
  {
    this(null);
  }

  public d(AbsListView.OnScrollListener paramOnScrollListener)
  {
    AppMethodBeat.i(79676);
    this.vgS = new ArrayList();
    this.vgR = paramOnScrollListener;
    AppMethodBeat.o(79676);
  }

  private void ow(boolean paramBoolean)
  {
    AppMethodBeat.i(79680);
    int i = 0;
    if (i < this.vgS.size())
    {
      Object localObject = (WeakReference)this.vgS.get(i);
      if (localObject != null)
      {
        localObject = (d.a)((WeakReference)localObject).get();
        if (localObject != null)
          ((d.a)localObject).onScrollStateChanged(paramBoolean);
      }
      while (true)
      {
        i++;
        break;
        this.vgS.remove(i);
        continue;
        this.vgS.remove(i);
      }
    }
    AppMethodBeat.o(79680);
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(79679);
    this.vgS.add(new WeakReference(parama));
    AppMethodBeat.o(79679);
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(79677);
    if (this.vgR != null)
      this.vgR.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(79677);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(79678);
    if (paramInt == 2)
      ow(true);
    while (true)
    {
      if (this.vgR != null)
        this.vgR.onScrollStateChanged(paramAbsListView, paramInt);
      AppMethodBeat.o(79678);
      return;
      ow(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.d
 * JD-Core Version:    0.6.2
 */