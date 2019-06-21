package com.tencent.mm.plugin.fav.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.ui.a.b;
import com.tencent.mm.plugin.fav.ui.widget.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class FavCleanUI$5$1$1$1
  implements Runnable
{
  FavCleanUI$5$1$1$1(FavCleanUI.5.1.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(73953);
    b localb = FavCleanUI.e(this.mib.mia.mhX.mhW);
    List localList = this.mib.mhY;
    ArrayList localArrayList;
    Iterator localIterator1;
    if (localb.mld != null)
    {
      localArrayList = new ArrayList();
      localIterator1 = localb.mld.iterator();
    }
    label332: label338: 
    while (true)
    {
      Object localObject;
      Iterator localIterator2;
      g localg;
      if (localIterator1.hasNext())
      {
        localObject = (g)localIterator1.next();
        if (localObject != null)
        {
          localIterator2 = localList.iterator();
          do
          {
            if (!localIterator2.hasNext())
              break;
            localg = (g)localIterator2.next();
          }
          while ((localg == null) || (((g)localObject).field_localId != localg.field_localId));
        }
      }
      else
      {
        for (int i = 1; ; i = 0)
        {
          if (i != 0)
            break label338;
          localArrayList.add(localObject);
          break;
          localb.mld = localArrayList;
          localArrayList = new ArrayList();
          localIterator2 = localb.mlg.iterator();
          while (true)
          {
            if (localIterator2.hasNext())
            {
              localObject = (Long)localIterator2.next();
              localIterator1 = localList.iterator();
              do
              {
                if (!localIterator1.hasNext())
                  break;
                localg = (g)localIterator1.next();
              }
              while ((localg == null) || (!((Long)localObject).equals(Long.valueOf(localg.field_localId))));
            }
            for (i = 1; ; i = 0)
            {
              if (i != 0)
                break label332;
              localArrayList.add(localObject);
              break;
              localb.mlg = localArrayList;
              FavCleanUI.e(this.mib.mia.mhX.mhW).notifyDataSetChanged();
              FavCleanUI.f(this.mib.mia.mhX.mhW).bwz();
              this.mib.mhZ.dismiss();
              AppMethodBeat.o(73953);
              return;
            }
          }
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(73954);
    String str = super.toString() + "|batchDelFavItems";
    AppMethodBeat.o(73954);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavCleanUI.5.1.1.1
 * JD-Core Version:    0.6.2
 */