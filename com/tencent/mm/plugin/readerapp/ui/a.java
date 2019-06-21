package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.mm.ui.p;

public abstract class a<T> extends p<T>
  implements AbsListView.OnScrollListener
{
  private static final String TAG = "MicroMsg." + a.class.getName();
  protected boolean eBB;

  public a(Context paramContext, T paramT)
  {
    super(paramContext, paramT);
    pN(true);
  }

  public abstract boolean bdn();

  public abstract int bdo();

  public abstract int getShowCount();

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    this.eBB = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.a
 * JD-Core Version:    0.6.2
 */