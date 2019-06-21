package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.sharecard.model.r;
import com.tencent.mm.plugin.card.ui.e.d;
import com.tencent.mm.plugin.card.ui.n;
import java.util.ArrayList;

final class x$1
  implements View.OnClickListener
{
  x$1(x paramx)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88784);
    if (!(paramView.getTag() instanceof r))
      AppMethodBeat.o(88784);
    while (true)
    {
      return;
      Object localObject = this.krs.kqK.bcv();
      this.krs.kqK.bcx();
      paramView = (r)paramView.getTag();
      if (paramView == null)
      {
        AppMethodBeat.o(88784);
      }
      else if ((paramView.kfV == null) || (paramView.kfV.isEmpty()))
      {
        AppMethodBeat.o(88784);
      }
      else if ((paramView.kfT != null) && (paramView.kfT.equals(((com.tencent.mm.plugin.card.base.b)localObject).bab())))
      {
        this.krs.krp.setVisibility(8);
        this.krs.kqK.bbB();
        AppMethodBeat.o(88784);
      }
      else if ((TextUtils.isEmpty(paramView.kfT)) && (TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject).bab())))
      {
        this.krs.krp.setVisibility(8);
        this.krs.kqK.bbB();
        AppMethodBeat.o(88784);
      }
      else
      {
        ArrayList localArrayList = com.tencent.mm.plugin.card.sharecard.a.b.GD(paramView.kbU);
        int k;
        if ((localArrayList != null) && (localArrayList.size() > 0))
        {
          int i = 0;
          int j = 0;
          k = j;
          if (i < localArrayList.size())
          {
            localObject = (r)localArrayList.get(i);
            if (((((r)localObject).kfT != null) && (((r)localObject).kfT.equals(paramView.kfT))) || ((TextUtils.isEmpty(((r)localObject).kfT)) && (TextUtils.isEmpty(paramView.kfT))))
            {
              ((r)localObject).kfW = true;
              if (!((r)localObject).kfX)
              {
                ((r)localObject).kfX = true;
                j = 1;
              }
              localArrayList.set(i, localObject);
            }
            while (true)
            {
              i++;
              break;
              ((r)localObject).kfW = false;
              localArrayList.set(i, localObject);
            }
          }
        }
        else
        {
          k = 0;
        }
        paramView = (String)paramView.kfV.get(0);
        paramView = am.bbe().GK(paramView);
        if (paramView != null)
          this.krs.kqK.b(paramView);
        if ((k != 0) && (this.krs.kqK.bcB() != null))
          this.krs.kqK.bcB().bco();
        this.krs.krp.setVisibility(8);
        AppMethodBeat.o(88784);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.x.1
 * JD-Core Version:    0.6.2
 */