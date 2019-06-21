package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ac
{
  public static List<Bankcard> cPS()
  {
    AppMethodBeat.i(138554);
    ArrayList localArrayList = ne(false);
    AppMethodBeat.o(138554);
    return localArrayList;
  }

  public static ArrayList<Bankcard> ne(boolean paramBoolean)
  {
    AppMethodBeat.i(46914);
    ab.i("MicroMsg.WalletPayOrderMgr", "sort bankcard isPos: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = r.cPI().cQE();
      localObject2 = r.cPI().cQC();
      if (localObject2 != null)
        break label70;
      ab.w("MicroMsg.WalletPayOrderMgr", "empty bankinfo list");
      AppMethodBeat.o(46914);
    }
    while (true)
    {
      return localObject1;
      localObject1 = r.cPI().nf(true);
      break;
      label70: ArrayList localArrayList = new ArrayList();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (c)((Iterator)localObject2).next();
        localObject3 = r.cPI().h(((c)localObject3).pbo, true, true);
        if (localObject3 != null)
        {
          localArrayList.add(localObject3);
          ((ArrayList)localObject1).remove(localObject3);
        }
      }
      if (!((ArrayList)localObject1).isEmpty())
      {
        ab.w("MicroMsg.WalletPayOrderMgr", "has unsort bankcard");
        localArrayList.addAll((Collection)localObject1);
      }
      AppMethodBeat.o(46914);
      localObject1 = localArrayList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ac
 * JD-Core Version:    0.6.2
 */