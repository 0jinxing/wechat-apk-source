package com.tencent.mm.ui;

import android.view.View.OnTouchListener;
import android.widget.AbsListView.OnScrollListener;
import java.util.List;

public abstract class i
  implements View.OnTouchListener, AbsListView.OnScrollListener
{
  protected List<i.a> jdb;

  public final void a(i.a parama)
  {
    if (!this.jdb.contains(parama))
      this.jdb.add(parama);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i
 * JD-Core Version:    0.6.2
 */