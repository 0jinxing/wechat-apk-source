package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class am
{
  protected final RecyclerView.i amP;
  int amQ = -2147483648;
  final Rect oT = new Rect();

  private am(RecyclerView.i parami)
  {
    this.amP = parami;
  }

  public static am d(RecyclerView.i parami)
  {
    return new am.1(parami);
  }

  public static am e(RecyclerView.i parami)
  {
    return new am.2(parami);
  }

  public abstract int bf(View paramView);

  public abstract int bg(View paramView);

  public abstract int bh(View paramView);

  public abstract int bi(View paramView);

  public abstract int bj(View paramView);

  public abstract int bk(View paramView);

  public abstract void cc(int paramInt);

  public abstract int getEnd();

  public abstract int getEndPadding();

  public final RecyclerView.i getLayoutManager()
  {
    return this.amP;
  }

  public abstract int getMode();

  public final int jd()
  {
    if (-2147483648 == this.amQ);
    for (int i = 0; ; i = jg() - this.amQ)
      return i;
  }

  public abstract int je();

  public abstract int jf();

  public abstract int jg();

  public abstract int jh();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.am
 * JD-Core Version:    0.6.2
 */