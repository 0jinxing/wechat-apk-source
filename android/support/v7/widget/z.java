package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class z extends RecyclerView.h
{
  private static final int[] MT = { 16843284 };
  private Drawable ahS;
  private int mOrientation;
  private final Rect xv = new Rect();

  public z(Context paramContext)
  {
    paramContext = paramContext.obtainStyledAttributes(MT);
    this.ahS = paramContext.getDrawable(0);
    paramContext.recycle();
    this.mOrientation = 1;
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    int i = 0;
    int j = 0;
    if ((paramRecyclerView.getLayoutManager() == null) || (this.ahS == null));
    while (true)
    {
      return;
      int k;
      int m;
      int n;
      int i1;
      if (this.mOrientation == 1)
      {
        paramCanvas.save();
        if (paramRecyclerView.getClipToPadding())
        {
          k = paramRecyclerView.getPaddingLeft();
          m = paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight();
          paramCanvas.clipRect(k, paramRecyclerView.getPaddingTop(), m, paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom());
        }
        while (true)
        {
          i = paramRecyclerView.getChildCount();
          while (j < i)
          {
            params = paramRecyclerView.getChildAt(j);
            RecyclerView.d(params, this.xv);
            n = this.xv.bottom;
            n = Math.round(params.getTranslationY()) + n;
            i1 = this.ahS.getIntrinsicHeight();
            this.ahS.setBounds(k, n - i1, m, n);
            this.ahS.draw(paramCanvas);
            j++;
          }
          m = paramRecyclerView.getWidth();
          k = 0;
        }
        paramCanvas.restore();
      }
      else
      {
        paramCanvas.save();
        if (paramRecyclerView.getClipToPadding())
        {
          m = paramRecyclerView.getPaddingTop();
          k = paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom();
          paramCanvas.clipRect(paramRecyclerView.getPaddingLeft(), m, paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight(), k);
        }
        while (true)
        {
          n = paramRecyclerView.getChildCount();
          for (j = i; j < n; j++)
          {
            params = paramRecyclerView.getChildAt(j);
            paramRecyclerView.getLayoutManager();
            RecyclerView.i.d(params, this.xv);
            i = this.xv.right;
            i1 = Math.round(params.getTranslationX()) + i;
            i = this.ahS.getIntrinsicWidth();
            this.ahS.setBounds(i1 - i, m, i1, k);
            this.ahS.draw(paramCanvas);
          }
          k = paramRecyclerView.getHeight();
          m = 0;
        }
        paramCanvas.restore();
      }
    }
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    if (this.ahS == null)
      paramRect.set(0, 0, 0, 0);
    while (true)
    {
      return;
      if (this.mOrientation == 1)
        paramRect.set(0, 0, 0, this.ahS.getIntrinsicHeight());
      else
        paramRect.set(0, 0, this.ahS.getIntrinsicWidth(), 0);
    }
  }

  public final void setDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == null)
      throw new IllegalArgumentException("Drawable cannot be null.");
    this.ahS = paramDrawable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.z
 * JD-Core Version:    0.6.2
 */