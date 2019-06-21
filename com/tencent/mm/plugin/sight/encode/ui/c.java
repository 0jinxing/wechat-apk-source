package com.tencent.mm.plugin.sight.encode.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.a.a;
import com.tencent.mm.ui.contact.a.a.b;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import java.util.ArrayList;
import java.util.List;

public final class c extends o
{
  public static boolean qAQ = true;
  public static boolean qAR = false;
  List<String> qAO;
  boolean qAP;

  public c(l paraml)
  {
    super(paraml, new ArrayList(), true, true);
    AppMethodBeat.i(25064);
    this.qAP = true;
    this.qAP = true;
    this.qAO = null;
    AppMethodBeat.o(25064);
  }

  public static boolean WT(String paramString)
  {
    AppMethodBeat.i(25068);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(25068);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@sns.tencent");
      AppMethodBeat.o(25068);
    }
  }

  public static boolean WU(String paramString)
  {
    AppMethodBeat.i(25069);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(25069);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@search.tencent");
      AppMethodBeat.o(25069);
    }
  }

  public static boolean WV(String paramString)
  {
    AppMethodBeat.i(25070);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(25070);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@draft.tencent");
      AppMethodBeat.o(25070);
    }
  }

  public final void aZ(List<String> paramList)
  {
    AppMethodBeat.i(25066);
    clearCache();
    this.qAO = paramList;
    notifyDataSetChanged();
    AppMethodBeat.o(25066);
  }

  public final boolean clI()
  {
    return this.qAP;
  }

  public final int getCount()
  {
    AppMethodBeat.i(25065);
    int i;
    if (this.qAO == null)
    {
      i = 0;
      AppMethodBeat.o(25065);
    }
    while (true)
    {
      return i;
      i = this.qAO.size();
      AppMethodBeat.o(25065);
    }
  }

  public final a mP(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(25067);
    if (this.qAO == null)
      AppMethodBeat.o(25067);
    while (true)
    {
      return localObject;
      if ((paramInt >= 0) && (paramInt < getCount()))
        break;
      ab.e("MicroMsg.MainSightSelectContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(25067);
    }
    a locala = new a(paramInt);
    localObject = (String)this.qAO.get(paramInt);
    if (WT((String)localObject))
      localObject = new ad("@sns.tencent");
    while (true)
    {
      locala.ehM = ((ad)localObject);
      locala.zmW = this.qAP;
      AppMethodBeat.o(25067);
      localObject = locala;
      break;
      if (WU((String)localObject))
      {
        localObject = new ad("@search.tencent");
      }
      else if (WV((String)localObject))
      {
        localObject = new ad("@draft.tencent");
      }
      else
      {
        aw.ZK();
        localObject = com.tencent.mm.model.c.XM().aoO((String)this.qAO.get(paramInt));
      }
    }
  }

  public final class a extends e
  {
    public a(int arg2)
    {
      super();
    }

    public final a.b aou()
    {
      AppMethodBeat.i(25062);
      c.a.b localb = new c.a.b(this);
      AppMethodBeat.o(25062);
      return localb;
    }

    public final a.a clJ()
    {
      AppMethodBeat.i(25063);
      c.a.a locala = new c.a.a(this);
      AppMethodBeat.o(25063);
      return locala;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.c
 * JD-Core Version:    0.6.2
 */