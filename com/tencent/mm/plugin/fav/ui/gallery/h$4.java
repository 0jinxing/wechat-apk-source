package com.tencent.mm.plugin.fav.ui.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.aa;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class h$4
  implements Runnable
{
  h$4(h paramh, boolean paramBoolean, int paramInt)
  {
  }

  public final void run()
  {
    int i = 100;
    AppMethodBeat.i(74594);
    if (this.kve)
    {
      localObject1 = new ArrayList();
      ((List)localObject1).add(Integer.valueOf(21));
      this.moB.idList = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().b(null, null, (List)localObject1);
      this.moB.moz = this.moB.idList.size();
    }
    int j = i;
    if (this.fzv >= 0)
    {
      j = i;
      if (this.moB.moz - this.fzv > 100)
        j = this.moB.moz - this.fzv;
    }
    ab.i("MicroMsg.MediaHistoryGalleryPresenter", "offset:%s limit:%s", new Object[] { Integer.valueOf(this.fzv), Integer.valueOf(j) });
    Object localObject1 = new LinkedList();
    while ((((LinkedList)localObject1).size() < j) && (this.moB.moA < this.moB.idList.size()))
    {
      int k = this.moB.moA;
      if (k + j > this.moB.idList.size());
      for (i = this.moB.idList.size(); ; i = k + j)
      {
        Object localObject2 = h.bT(this.moB.idList.subList(k, i));
        this.moB.moA = i;
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
          ((LinkedList)localObject1).addAll(h.G((com.tencent.mm.plugin.fav.a.g)((Iterator)localObject2).next()));
      }
      ab.i("MicroMsg.MediaHistoryGalleryPresenter", "traverse until size ok. start:%s, end:%s, idListSize:%s, limit:%s, linklistSize:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(this.moB.idList.size()), Integer.valueOf(j), Integer.valueOf(((LinkedList)localObject1).size()) });
    }
    j = ((LinkedList)localObject1).size();
    Collections.reverse((List)localObject1);
    this.moB.iPr.addAll(0, (Collection)localObject1);
    ((LinkedList)localObject1).clear();
    ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] %s", new Object[] { Integer.valueOf(this.moB.iPr.size()) });
    al.d(new h.4.1(this, j));
    AppMethodBeat.o(74594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.h.4
 * JD-Core Version:    0.6.2
 */