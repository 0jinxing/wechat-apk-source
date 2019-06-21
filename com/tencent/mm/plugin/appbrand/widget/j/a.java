package com.tencent.mm.plugin.appbrand.widget.j;

import a.l;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"traverseFixAccessibility", "", "parent", "Landroid/view/ViewGroup;", "plugin-appbrand-integration_release"})
public final class a
{
  public static final void k(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(135269);
    if (paramViewGroup == null)
      AppMethodBeat.o(135269);
    while (true)
    {
      return;
      int i = paramViewGroup.getChildCount();
      if (i >= 0)
      {
        int j = 0;
        View localView = paramViewGroup.getChildAt(j);
        if ((localView instanceof ViewGroup))
          k((ViewGroup)localView);
        while (true)
        {
          if (j == i)
            break label72;
          j++;
          break;
          if ((localView instanceof RecyclerView))
            localView.setAccessibilityDelegate(null);
        }
      }
      label72: AppMethodBeat.o(135269);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.j.a
 * JD-Core Version:    0.6.2
 */