package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public final class t
{
  public SparseArray<String> tCm = null;
  public List<ElementQuery> tum = null;

  public final String Z(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(46888);
    if (this.tCm != null)
    {
      String str = (String)this.tCm.get(paramInt);
      if (!bo.isNullOrNil(str))
      {
        AppMethodBeat.o(46888);
        paramContext = str;
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131304645);
      AppMethodBeat.o(46888);
    }
  }

  public final ElementQuery acy(String paramString)
  {
    AppMethodBeat.i(46889);
    if ((this.tum != null) && (this.tum.size() != 0))
    {
      Iterator localIterator = this.tum.iterator();
      while (localIterator.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)localIterator.next();
        if ((localElementQuery.pbn != null) && (localElementQuery.pbn.equals(paramString)))
        {
          AppMethodBeat.o(46889);
          paramString = localElementQuery;
        }
      }
    }
    while (true)
    {
      return paramString;
      ab.w("MicroMsg.WalletBankElementManager", "hy: not found given banktype: %s", new Object[] { paramString });
      AppMethodBeat.o(46889);
      paramString = null;
      continue;
      ab.w("MicroMsg.WalletBankElementManager", "hy: no element from given banktype");
      AppMethodBeat.o(46889);
      paramString = null;
    }
  }

  public final ElementQuery acz(String paramString)
  {
    AppMethodBeat.i(46890);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.WalletBankElementManager", "hy: bindSerail given is null");
      AppMethodBeat.o(46890);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if ((this.tum != null) && (this.tum.size() != 0))
      {
        Iterator localIterator = this.tum.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            ElementQuery localElementQuery = (ElementQuery)localIterator.next();
            if (paramString.equals(localElementQuery.pbo))
            {
              AppMethodBeat.o(46890);
              paramString = localElementQuery;
              break;
            }
          }
        ab.w("MicroMsg.WalletBankElementManager", "hy: not found given element query");
        AppMethodBeat.o(46890);
        paramString = null;
      }
      else
      {
        ab.w("MicroMsg.WalletBankElementManager", "hy: element list is null. get element failed");
        AppMethodBeat.o(46890);
        paramString = null;
      }
    }
  }

  public final String fk(Context paramContext)
  {
    AppMethodBeat.i(46887);
    paramContext = Z(paramContext, r.cPI().cQq());
    AppMethodBeat.o(46887);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.t
 * JD-Core Version:    0.6.2
 */