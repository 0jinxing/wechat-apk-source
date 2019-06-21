package android.support.v7.widget.a;

import android.graphics.Canvas;
import android.support.v4.view.s;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class c$a extends c.b
{
  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    float f1;
    float f2;
    int j;
    if ((paramBoolean) && (paramView.getTag(2131820632) == null))
    {
      f1 = s.ag(paramView);
      int i = paramRecyclerView.getChildCount();
      f2 = 0.0F;
      j = 0;
      if (j < i)
      {
        View localView = paramRecyclerView.getChildAt(j);
        if (localView == paramView)
          break label113;
        float f3 = s.ag(localView);
        if (f3 <= f2)
          break label113;
        f2 = f3;
      }
    }
    label113: 
    while (true)
    {
      j++;
      break;
      s.h(paramView, 1.0F + f2);
      paramView.setTag(2131820632, Float.valueOf(f1));
      super.a(paramCanvas, paramRecyclerView, paramView, paramFloat1, paramFloat2, paramInt, paramBoolean);
      return;
    }
  }

  public final void bZ(View paramView)
  {
    Object localObject = paramView.getTag(2131820632);
    if ((localObject != null) && ((localObject instanceof Float)))
      s.h(paramView, ((Float)localObject).floatValue());
    paramView.setTag(2131820632, null);
    super.bZ(paramView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a.c.a
 * JD-Core Version:    0.6.2
 */