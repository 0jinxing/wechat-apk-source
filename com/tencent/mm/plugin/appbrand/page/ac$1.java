package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class ac$1 extends ai
{
  ac$1(ac paramac)
  {
  }

  public final void aDI()
  {
    AppMethodBeat.i(91087);
    ac localac = this.iuB;
    ac.b localb = localac.py(localac.iuy);
    float[] arrayOfFloat = localac.iuv;
    if ((localb == null) || (localb.iuM == null) || (arrayOfFloat == null));
    while (true)
    {
      if (this.iuB.iux != null)
      {
        this.iuB.iux.aDI();
        this.iuB.iux = null;
      }
      AppMethodBeat.o(91087);
      return;
      View localView = (View)localb.iuM.get();
      if (localView != null)
      {
        if (localac.iuy != localac.iuu)
        {
          Object localObject = localac.py(localac.iuu);
          if ((localObject != null) && (((ac.b)localObject).iuM != null))
          {
            localObject = (View)((ac.b)localObject).iuM.get();
            if (localObject != null)
              localac.b(localac.iuu, arrayOfFloat, ((View)localObject).getVisibility(), Boolean.valueOf(localb.iuO), Boolean.FALSE);
          }
        }
        int i = localac.iuy;
        localac.iuu = -1;
        localac.iuy = -1;
        localac.b(i, arrayOfFloat, localView.getVisibility(), Boolean.valueOf(localb.iuO), Boolean.FALSE);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ac.1
 * JD-Core Version:    0.6.2
 */