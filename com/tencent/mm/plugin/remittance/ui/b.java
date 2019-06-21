package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abv;
import com.tencent.mm.protocal.protobuf.abw;
import com.tencent.mm.protocal.protobuf.lp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  abv pQG = null;
  lp pQH;

  private static boolean a(List<abw> paramList, abv paramabv)
  {
    AppMethodBeat.i(44813);
    boolean bool;
    if (paramabv.vPg.size() == 0)
    {
      AppMethodBeat.o(44813);
      bool = false;
    }
    while (true)
    {
      return bool;
      HashSet localHashSet = new HashSet();
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localHashSet.add(Long.valueOf(((abw)paramList.next()).wjm));
      paramList = paramabv.vPg.iterator();
      while (true)
        if (paramList.hasNext())
          if (!localHashSet.contains(Long.valueOf(((abw)paramList.next()).wjm)))
          {
            AppMethodBeat.o(44813);
            bool = false;
            break;
          }
      bool = true;
      AppMethodBeat.o(44813);
    }
  }

  public final void VR(String paramString)
  {
    AppMethodBeat.i(44811);
    this.pQG = null;
    if (paramString == null)
    {
      this.pQG = null;
      AppMethodBeat.o(44811);
    }
    while (true)
    {
      return;
      if (this.pQH == null)
      {
        ab.e("MicroMsg.FavorInfoPicked", "error setSelectFavorComposeId currentFavorResp is null");
        this.pQG = null;
        AppMethodBeat.o(44811);
      }
      else
      {
        Iterator localIterator = this.pQH.vPh.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            abv localabv = (abv)localIterator.next();
            if (paramString.equals(localabv.wjd))
            {
              this.pQG = localabv;
              AppMethodBeat.o(44811);
              break;
            }
          }
        AppMethodBeat.o(44811);
      }
    }
  }

  public final boolean a(List<abw> paramList, abw paramabw)
  {
    AppMethodBeat.i(44812);
    boolean bool;
    if (this.pQH == null)
    {
      ab.e("MicroMsg.FavorInfoPicked", "error setFavorInfoList currentFavorResp is null");
      AppMethodBeat.o(44812);
      bool = false;
      return bool;
    }
    if (paramabw != null);
    for (Object localObject1 = new BigInteger(Long.toBinaryString(paramabw.wjm), 2).toString(); ; localObject1 = null)
    {
      Object localObject2 = new LinkedList();
      Iterator localIterator = this.pQH.vPh.iterator();
      while (localIterator.hasNext())
      {
        abv localabv = (abv)localIterator.next();
        if ((paramabw == null) || ((!bo.isNullOrNil((String)localObject1)) && (localabv.wjd.contains((CharSequence)localObject1))))
          ((List)localObject2).add(localabv);
      }
      paramabw = new LinkedList();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (abv)((Iterator)localObject2).next();
        if (a(paramList, (abv)localObject1))
          paramabw.add(localObject1);
      }
      if (paramabw.size() > 0)
      {
        Collections.sort(paramabw, new b.a(this));
        this.pQG = ((abv)paramabw.get(0));
        bool = true;
        AppMethodBeat.o(44812);
        break;
      }
      this.pQG = null;
      AppMethodBeat.o(44812);
      bool = false;
      break;
    }
  }

  public final void cft()
  {
    AppMethodBeat.i(44808);
    ab.i("MicroMsg.FavorInfoPicked", "cleanBusiF2FFavor");
    this.pQH = null;
    this.pQG = null;
    AppMethodBeat.o(44808);
  }

  public final List<abw> cfu()
  {
    AppMethodBeat.i(44809);
    LinkedList localLinkedList;
    if (this.pQH != null)
    {
      localLinkedList = this.pQH.vPg;
      AppMethodBeat.o(44809);
    }
    while (true)
    {
      return localLinkedList;
      localLinkedList = new LinkedList();
      AppMethodBeat.o(44809);
    }
  }

  public final String cfv()
  {
    if (this.pQH == null);
    for (String str = ""; ; str = this.pQH.vPk)
      return str;
  }

  public final boolean cfw()
  {
    if (this.pQH != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cfx()
  {
    AppMethodBeat.i(44810);
    boolean bool;
    if ((this.pQH != null) && (this.pQH.vPg != null) && (this.pQH.vPg.size() > 0))
    {
      bool = true;
      AppMethodBeat.o(44810);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(44810);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.b
 * JD-Core Version:    0.6.2
 */