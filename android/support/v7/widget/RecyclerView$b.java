package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

public final class RecyclerView$b extends Observable<RecyclerView.c>
{
  public final void ar(int paramInt1, int paramInt2)
  {
    c(paramInt1, paramInt2, null);
  }

  public final void as(int paramInt1, int paramInt2)
  {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((RecyclerView.c)this.mObservers.get(i)).ay(paramInt1, paramInt2);
  }

  public final void at(int paramInt1, int paramInt2)
  {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((RecyclerView.c)this.mObservers.get(i)).aw(paramInt1, paramInt2);
  }

  public final void au(int paramInt1, int paramInt2)
  {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((RecyclerView.c)this.mObservers.get(i)).ax(paramInt1, paramInt2);
  }

  public final void c(int paramInt1, int paramInt2, Object paramObject)
  {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((RecyclerView.c)this.mObservers.get(i)).d(paramInt1, paramInt2, paramObject);
  }

  public final boolean hasObservers()
  {
    if (!this.mObservers.isEmpty());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void notifyChanged()
  {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((RecyclerView.c)this.mObservers.get(i)).onChanged();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.b
 * JD-Core Version:    0.6.2
 */