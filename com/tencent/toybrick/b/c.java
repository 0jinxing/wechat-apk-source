package com.tencent.toybrick.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.s;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.toybrick.c.g;
import com.tencent.toybrick.d.a.a;
import java.util.LinkedList;

public final class c extends RecyclerView.h
{
  private static final int[] MT = { 16843284 };
  public a.a AFT;
  private int mOrientation;
  private final Rect xv;

  public c(Context paramContext)
  {
    AppMethodBeat.i(113192);
    this.xv = new Rect();
    paramContext.obtainStyledAttributes(MT).recycle();
    this.mOrientation = 1;
    AppMethodBeat.o(113192);
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    int i = 0;
    AppMethodBeat.i(113193);
    if ((paramRecyclerView.getLayoutManager() == null) || (this.AFT.AGS == null))
      AppMethodBeat.o(113193);
    while (true)
    {
      return;
      int j;
      int k;
      Object localObject;
      int m;
      int n;
      int i1;
      if (this.mOrientation == 1)
      {
        if (this.AFT.AGR)
        {
          paramCanvas.save();
          j = paramRecyclerView.getChildCount();
          for (k = 0; k < j; k++)
          {
            View localView = paramRecyclerView.getChildAt(k);
            i = paramRecyclerView.bm(localView).kj();
            if (i >= 0)
            {
              localObject = ((b)paramRecyclerView.getAdapter()).Sg(i);
              if (((g)localObject).AGG)
              {
                m = localObject.fz(localView)[0];
                i = paramRecyclerView.getWidth();
                n = localObject.fz(localView)[1];
                RecyclerView.d(localView, this.xv);
                i1 = this.xv.bottom;
                int i2 = Math.round(localView.getTranslationY()) + i1;
                i1 = this.AFT.AGS.getIntrinsicHeight();
                this.AFT.AGS.setBounds(m, i2 - i1, i - n, i2);
                this.AFT.AGS.draw(paramCanvas);
              }
            }
          }
          paramCanvas.restore();
        }
        AppMethodBeat.o(113193);
      }
      else
      {
        if (this.AFT.AGR)
        {
          paramCanvas.save();
          if (paramRecyclerView.getClipToPadding())
          {
            j = paramRecyclerView.getPaddingTop();
            k = paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom();
            paramCanvas.clipRect(paramRecyclerView.getPaddingLeft(), j, paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight(), k);
          }
          while (true)
          {
            n = paramRecyclerView.getChildCount();
            while (i < n)
            {
              localObject = paramRecyclerView.getChildAt(i);
              if (((g)this.AFT.AGQ.get(paramRecyclerView.bm((View)localObject).kj())).AGG)
              {
                paramRecyclerView.getLayoutManager();
                RecyclerView.i.d((View)localObject, this.xv);
                m = this.xv.right + Math.round(((View)localObject).getTranslationX());
                i1 = this.AFT.AGS.getIntrinsicWidth();
                this.AFT.AGS.setBounds(m - i1, j, m, k);
                this.AFT.AGS.draw(paramCanvas);
              }
              i++;
            }
            k = paramRecyclerView.getHeight();
            j = 0;
          }
          paramCanvas.restore();
        }
        AppMethodBeat.o(113193);
      }
    }
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(113194);
    if (this.AFT.AGS == null)
    {
      paramRect.set(0, 0, 0, 0);
      AppMethodBeat.o(113194);
    }
    while (true)
    {
      return;
      if (this.mOrientation == 1)
      {
        paramRect.set(0, 0, 0, this.AFT.AGS.getIntrinsicHeight());
        AppMethodBeat.o(113194);
      }
      else
      {
        paramRect.set(0, 0, this.AFT.AGS.getIntrinsicWidth(), 0);
        AppMethodBeat.o(113194);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.b.c
 * JD-Core Version:    0.6.2
 */