package com.tencent.mm.plugin.appbrand.widget.desktop.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewParent;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class b<T extends RecyclerView.v>
  implements c<T>
{
  public static float Q(RecyclerView.v paramv)
  {
    if ((paramv != null) && (paramv.apJ != null))
    {
      View localView = paramv.apJ;
      paramv = new int[2];
      localView.getLocationOnScreen(paramv);
    }
    for (float f = paramv[1]; ; f = 0.0F)
      return f;
  }

  public static float c(RecyclerView paramRecyclerView, RecyclerView.v paramv)
  {
    if (paramv != null);
    try
    {
      if (paramv.apJ == null)
        f1 = 0.0F;
      while (true)
      {
        return f1;
        float f2 = paramv.apJ.getLeft();
        paramv = paramv.apJ;
        ViewParent localViewParent1 = paramv.getParent();
        ViewParent localViewParent2 = localViewParent1;
        f1 = f2;
        if ((localViewParent1 instanceof View))
        {
          paramv = (View)localViewParent1;
          f1 = f2 + paramv.getLeft();
          localViewParent2 = localViewParent1;
        }
        while ((paramv != paramRecyclerView) && (localViewParent2 != null))
        {
          localViewParent1 = paramv.getParent();
          localViewParent2 = localViewParent1;
          if ((localViewParent1 instanceof View))
          {
            paramv = (View)localViewParent1;
            int i = paramv.getLeft();
            f1 += i;
            localViewParent2 = localViewParent1;
          }
        }
      }
    }
    catch (Exception paramRecyclerView)
    {
      while (true)
      {
        ab.printErrStackTrace("alvinluo", paramRecyclerView, "alvinluo getTransX exception", new Object[0]);
        float f1 = 0.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.b
 * JD-Core Version:    0.6.2
 */