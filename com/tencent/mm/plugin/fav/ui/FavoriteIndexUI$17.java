package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class FavoriteIndexUI$17
  implements Runnable
{
  FavoriteIndexUI$17(FavoriteIndexUI paramFavoriteIndexUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74243);
    long l = System.currentTimeMillis();
    List localList = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buY();
    if (localList != null)
    {
      ab.i("MicroMsg.FavoriteIndexUI", "initInvalidFavItem getInvalid favitems , size = %d,start time = %s", new Object[] { Integer.valueOf(localList.size()), Long.valueOf(l) });
      if (localList.size() == 0)
        AppMethodBeat.o(74243);
    }
    while (true)
    {
      return;
      int i = localList.size();
      for (int j = 0; j < i; j++)
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().z((com.tencent.mm.plugin.fav.a.g)localList.get(j));
      ab.i("MicroMsg.FavoriteIndexUI", "initInvalidFavItem  cost time = %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(74243);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.17
 * JD-Core Version:    0.6.2
 */