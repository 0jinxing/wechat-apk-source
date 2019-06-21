package com.tencent.mm.plugin.downloader_app.ui;

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

public final class a extends RecyclerView.h
{
  private final Drawable ahS;
  private final Drawable kQu;
  private int mSize;

  public a(Resources paramResources)
  {
    AppMethodBeat.i(136257);
    this.ahS = new ColorDrawable(paramResources.getColor(2131689962));
    this.mSize = paramResources.getDimensionPixelSize(2131428453);
    this.kQu = new ColorDrawable(-1);
    AppMethodBeat.o(136257);
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(136258);
    int i = paramRecyclerView.getPaddingLeft();
    int j = paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight();
    int k = paramRecyclerView.getChildCount();
    int m = 0;
    if (m < k)
    {
      View localView1 = paramRecyclerView.getChildAt(m);
      View localView2 = ((ViewGroup)localView1).getChildAt(0);
      Object localObject = (RecyclerView.LayoutParams)localView1.getLayoutParams();
      int n = localView1.getBottom() + ((RecyclerView.LayoutParams)localObject).bottomMargin;
      int i1 = n + this.mSize;
      if ((localView1.getVisibility() == 8) || (localView2.getVisibility() == 8))
        if ((localView2 instanceof TaskItemView))
        {
          this.kQu.setBounds(i, n, j, i1);
          this.kQu.draw(paramCanvas);
        }
      while (true)
      {
        m++;
        break;
        if (((localView2 instanceof TaskManagerHeaderView)) || ((localView2 instanceof TaskHeaderView)) || ((localView2 instanceof ExpandView)))
        {
          this.ahS.setBounds(i, n, j, i1);
          this.ahS.draw(paramCanvas);
        }
        else if ((localView2 instanceof TaskItemView))
        {
          localObject = paramRecyclerView.getChildAt(m + 1);
          if (localObject != null)
          {
            localObject = ((ViewGroup)localObject).getChildAt(0);
            if (!(localObject instanceof TaskHeaderView))
              if (((localObject instanceof ExpandView)) && (((View)localObject).getVisibility() == 8))
              {
                this.ahS.setBounds(i, n, j, i1);
                this.ahS.draw(paramCanvas);
              }
          }
          else
          {
            this.ahS.setBounds(((TaskItemView)localView2).getNamePaddingLeft() + i, n, j, i1);
            this.ahS.draw(paramCanvas);
            this.kQu.setBounds(i, n, ((TaskItemView)localView2).getNamePaddingLeft() + i, i1);
            this.kQu.draw(paramCanvas);
          }
        }
        else
        {
          super.a(paramCanvas, paramRecyclerView, params);
        }
      }
    }
    AppMethodBeat.o(136258);
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(136259);
    paramRect.set(0, 0, 0, this.mSize);
    AppMethodBeat.o(136259);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.a
 * JD-Core Version:    0.6.2
 */