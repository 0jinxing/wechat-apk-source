package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.choosemsgfile.b.b.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class e$3 extends RecyclerView.h
{
  int kvg;
  ColorDrawable kvh;
  int mSize;

  public e$3(e parame)
  {
    AppMethodBeat.i(54348);
    this.kvg = ah.getResources().getColor(2131690048);
    this.kvh = new ColorDrawable(this.kvg);
    this.mSize = ((int)ah.getResources().getDimension(2131427500));
    AppMethodBeat.o(54348);
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(54349);
    int i = paramRecyclerView.getPaddingLeft();
    int j = paramRecyclerView.getWidth();
    int k = paramRecyclerView.getPaddingRight();
    int m = paramRecyclerView.getChildCount();
    for (int n = 0; n < m; n++)
    {
      params = paramRecyclerView.getChildAt(n);
      if (params.getTag() != null)
      {
        Object localObject = this.kuZ.kuY.ts(((Integer)params.getTag()).intValue() + 1);
        if ((localObject == null) || (((a)localObject).getType() != 0))
        {
          localObject = (RecyclerView.LayoutParams)params.getLayoutParams();
          int i1 = params.getBottom();
          i1 = ((RecyclerView.LayoutParams)localObject).bottomMargin + i1;
          int i2 = this.mSize;
          this.kvh.setBounds(i, i1, j - k, i2 + i1);
          this.kvh.draw(paramCanvas);
        }
      }
    }
    AppMethodBeat.o(54349);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.e.3
 * JD-Core Version:    0.6.2
 */