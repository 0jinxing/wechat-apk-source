package com.tencent.mm.plugin.appbrand.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class a
  implements k.a
{
  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(129955);
    if (f.auT() == null)
    {
      ab.w("MicroMsg.AppBrandSearchStorageChangeListener", "onNotifyChange by SysConfigStorage, but sLayoutStorage is null.");
      AppMethodBeat.o(129955);
      return;
    }
    switch (paramm.hsh)
    {
    case 4:
    default:
    case 2:
    case 3:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(129955);
      break;
      LinkedList localLinkedList = new LinkedList();
      if ("batch".equals(paramString))
      {
        if ((paramm.obj != null) && ((paramm.obj instanceof List)))
        {
          paramString = ((List)paramm.obj).iterator();
          while (paramString.hasNext())
          {
            paramm = (String)paramString.next();
            localLinkedList.addAll(f.auT().yx(paramm));
          }
        }
      }
      else
      {
        localLinkedList.addAll(f.auT().yx(paramm.obj.toString()));
        if (!localLinkedList.isEmpty())
        {
          f.auT().b("batch", 3, localLinkedList);
          AppMethodBeat.o(129955);
          break;
          localLinkedList = new LinkedList();
          if ("batch".equals(paramString))
          {
            if ((paramm.obj != null) && ((paramm.obj instanceof List)))
            {
              paramm = ((List)paramm.obj).iterator();
              while (paramm.hasNext())
              {
                paramString = (String)paramm.next();
                localLinkedList.addAll(f.auT().yx(paramString));
              }
            }
          }
          else
          {
            localLinkedList.addAll(f.auT().yx(paramm.obj.toString()));
            if (!localLinkedList.isEmpty())
              f.auT().b("batch", 5, localLinkedList);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.a
 * JD-Core Version:    0.6.2
 */