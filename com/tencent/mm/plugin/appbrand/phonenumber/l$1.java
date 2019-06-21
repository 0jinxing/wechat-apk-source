package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class l$1
  implements View.OnClickListener
{
  l$1(l paraml)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134846);
    paramView = l.b(this.iyz);
    if (paramView != null)
    {
      paramView = paramView.ixy;
      if (paramView == null)
        j.dWJ();
      Object localObject = paramView.iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          paramView = (PhoneItem)((Iterator)localObject).next();
          if (paramView.ixN)
          {
            localObject = this.iyz.iyx;
            if (localObject != null)
            {
              j.o(paramView, "phoneItem");
              ((l.b)localObject).c(paramView);
              AppMethodBeat.o(134846);
            }
          }
        }
    }
    while (true)
    {
      return;
      paramView = null;
      break;
      AppMethodBeat.o(134846);
      continue;
      AppMethodBeat.o(134846);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.l.1
 * JD-Core Version:    0.6.2
 */