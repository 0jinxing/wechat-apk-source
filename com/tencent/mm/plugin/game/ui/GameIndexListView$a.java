package com.tencent.mm.plugin.game.ui;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class GameIndexListView$a extends RecyclerView.h
{
  private final Drawable ahS;
  private int mSize;

  public GameIndexListView$a(GameIndexListView paramGameIndexListView, Resources paramResources)
  {
    AppMethodBeat.i(111971);
    this.ahS = new ColorDrawable(paramResources.getColor(2131690081));
    this.mSize = paramResources.getDimensionPixelSize(2131427719);
    AppMethodBeat.o(111971);
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(111972);
    int i = paramRecyclerView.getPaddingLeft();
    int j = paramRecyclerView.getWidth();
    int k = paramRecyclerView.getPaddingRight();
    int m = paramRecyclerView.getChildCount();
    int n = 0;
    if (n < m - 1)
    {
      View localView = paramRecyclerView.getChildAt(n);
      Object localObject = ((ViewGroup)localView).getChildAt(0);
      if (((localObject instanceof GameBestSellingItemView)) || ((localObject instanceof GameBestSellingTitle)) || ((localObject instanceof GameFeedModuleTitle)))
        super.a(paramCanvas, paramRecyclerView, params);
      while (true)
      {
        n++;
        break;
        localObject = (RecyclerView.LayoutParams)localView.getLayoutParams();
        int i1 = localView.getBottom();
        i1 = ((RecyclerView.LayoutParams)localObject).bottomMargin + i1;
        int i2 = this.mSize;
        this.ahS.setBounds(i, i1, j - k, i2 + i1);
        this.ahS.draw(paramCanvas);
      }
    }
    AppMethodBeat.o(111972);
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(111973);
    paramRect.set(0, 0, 0, this.mSize);
    AppMethodBeat.o(111973);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameIndexListView.a
 * JD-Core Version:    0.6.2
 */