package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;

final class e$1
  implements Runnable
{
  e$1(e parame, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26858);
    RecyclerView localRecyclerView = e.a(this.uRO);
    if (localRecyclerView == null)
      AppMethodBeat.o(26858);
    while (true)
    {
      return;
      int i = 0;
      if (i < localRecyclerView.getChildCount())
      {
        Object localObject = localRecyclerView.getChildAt(i);
        c localc = f.er((View)localObject);
        if (localc != null)
        {
          if (localc.uRc == null)
            break label81;
          if (this.uRN)
            localc.uRc.postInvalidate();
        }
        while (true)
        {
          i++;
          break;
          label81: if ((localc.uRd != null) && (localc.uRe != null))
          {
            LinearLayout localLinearLayout1 = (LinearLayout)((View)localObject).findViewById(2131826408);
            LinearLayout localLinearLayout2 = (LinearLayout)((View)localObject).findViewById(2131826377);
            localObject = (LinearLayout)((View)localObject).findViewById(2131826409);
            this.uRO.a(localLinearLayout1, localLinearLayout2, (View)localObject, localc.uRd.getPosInDataList());
          }
        }
      }
      AppMethodBeat.o(26858);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.e.1
 * JD-Core Version:    0.6.2
 */