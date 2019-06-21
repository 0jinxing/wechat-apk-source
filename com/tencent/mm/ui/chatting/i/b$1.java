package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.a.c.b;

final class b$1 extends RecyclerView.h
{
  int kvg;
  ColorDrawable kvh;
  int mSize;

  b$1(b paramb)
  {
    AppMethodBeat.i(32525);
    this.kvg = this.yZb.mContext.getResources().getColor(2131690048);
    this.kvh = new ColorDrawable(this.kvg);
    this.mSize = ((int)this.yZb.mContext.getResources().getDimension(2131427500));
    AppMethodBeat.o(32525);
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(32526);
    int i = paramRecyclerView.getPaddingLeft();
    int j = paramRecyclerView.getWidth();
    int k = paramRecyclerView.getPaddingRight();
    int m = paramRecyclerView.getChildCount();
    for (int n = 0; n < m; n++)
    {
      params = paramRecyclerView.getChildAt(n);
      if (params.getTag() != null)
      {
        Object localObject = this.yZb.Oy(((Integer)params.getTag()).intValue() + 1);
        if ((localObject == null) || (((c.b)localObject).getType() != 2147483647))
        {
          localObject = (RecyclerView.LayoutParams)params.getLayoutParams();
          int i1 = params.getBottom();
          int i2 = ((RecyclerView.LayoutParams)localObject).bottomMargin + i1;
          i1 = this.mSize;
          this.kvh.setBounds(i, i2, j - k, i1 + i2);
          this.kvh.draw(paramCanvas);
        }
      }
    }
    AppMethodBeat.o(32526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.b.1
 * JD-Core Version:    0.6.2
 */