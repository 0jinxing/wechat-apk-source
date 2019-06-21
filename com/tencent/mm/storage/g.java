package com.tencent.mm.storage;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public final class g extends j<com.tencent.mm.g.c.g>
{
  public static final String[] fnj;
  private h fni;
  SparseArray<String> xHR;

  static
  {
    AppMethodBeat.i(80280);
    fnj = new String[] { j.a(com.tencent.mm.g.c.g.Hm(), "AddContactAntispamTicket") };
    AppMethodBeat.o(80280);
  }

  public g(e parame)
  {
    super(parame, com.tencent.mm.g.c.g.Hm(), "AddContactAntispamTicket", null);
    AppMethodBeat.i(80275);
    this.xHR = new SparseArray();
    this.fni = ((h)parame);
    AppMethodBeat.o(80275);
  }

  public final String aoh(String paramString)
  {
    AppMethodBeat.i(80279);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(80279);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Object localObject = (String)this.xHR.get(paramString.hashCode());
      if (!bo.isNullOrNil((String)localObject))
      {
        AppMethodBeat.o(80279);
        paramString = (String)localObject;
      }
      else
      {
        localObject = new g.a();
        ((g.a)localObject).field_userName = paramString;
        if (b((c)localObject, new String[] { "userName" }))
        {
          ia(((g.a)localObject).field_userName, ((g.a)localObject).field_ticket);
          paramString = ((g.a)localObject).field_ticket;
          AppMethodBeat.o(80279);
        }
        else
        {
          AppMethodBeat.o(80279);
          paramString = null;
        }
      }
    }
  }

  public final void en(List<com.tencent.mm.g.c.g> paramList)
  {
    AppMethodBeat.i(80277);
    if (paramList.size() == 0)
      AppMethodBeat.o(80277);
    while (true)
    {
      return;
      long l = this.fni.iV(Thread.currentThread().getId());
      paramList = paramList.iterator();
      while (paramList.hasNext())
        a((com.tencent.mm.g.c.g)paramList.next());
      this.fni.mB(l);
      AppMethodBeat.o(80277);
    }
  }

  public final void ia(String paramString1, String paramString2)
  {
    AppMethodBeat.i(80278);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(80278);
    while (true)
    {
      return;
      this.xHR.put(paramString1.hashCode(), paramString2);
      AppMethodBeat.o(80278);
    }
  }

  public final void x(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(80276);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(80276);
    while (true)
    {
      return;
      g.a locala = new g.a();
      locala.field_userName = paramString1;
      locala.field_scene = paramInt;
      locala.field_ticket = paramString2;
      a(locala);
      ia(paramString1, paramString2);
      AppMethodBeat.o(80276);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.g
 * JD-Core Version:    0.6.2
 */