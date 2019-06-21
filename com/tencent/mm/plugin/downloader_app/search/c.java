package com.tencent.mm.plugin.downloader_app.search;

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
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends RecyclerView.h
{
  private final Drawable ahS;
  private final Resources mRes;
  private int mSize;

  public c(Resources paramResources)
  {
    AppMethodBeat.i(136197);
    this.mRes = paramResources;
    this.ahS = new ColorDrawable(paramResources.getColor(2131689962));
    this.mSize = paramResources.getDimensionPixelSize(2131428453);
    AppMethodBeat.o(136197);
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(136198);
    int i = paramRecyclerView.getPaddingLeft();
    int j = paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight();
    int k = paramRecyclerView.getChildCount();
    int m = 0;
    if (m < k - 1)
    {
      View localView1 = paramRecyclerView.getChildAt(m);
      View localView2 = localView1.findViewById(2131827271);
      View localView3 = localView1.findViewById(2131827274);
      View localView4 = localView1.findViewById(2131827278);
      if (localView1.getVisibility() == 8)
        super.a(paramCanvas, paramRecyclerView, params);
      while (true)
      {
        m++;
        break;
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView1.getLayoutParams();
        int n = localView1.getBottom();
        n = localLayoutParams.bottomMargin + n;
        int i1 = this.mSize + n;
        if (localView2.getVisibility() == 0)
        {
          this.ahS.setBounds(i, n, j, i1);
          this.ahS.draw(paramCanvas);
        }
        else if (localView3.getVisibility() == 0)
        {
          this.ahS.setBounds(this.mRes.getDimensionPixelSize(2131428618) + i, n, j, i1);
          this.ahS.draw(paramCanvas);
        }
        else if (localView4.getVisibility() == 0)
        {
          this.ahS.setBounds(this.mRes.getDimensionPixelSize(2131428617) + i, n, j, i1);
          this.ahS.draw(paramCanvas);
        }
      }
    }
    AppMethodBeat.o(136198);
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(136199);
    paramRect.set(0, 0, 0, this.mSize);
    AppMethodBeat.o(136199);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.search.c
 * JD-Core Version:    0.6.2
 */