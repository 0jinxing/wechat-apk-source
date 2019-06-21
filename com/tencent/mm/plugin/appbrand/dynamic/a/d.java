package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.database.Cursor;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.h;
import com.tencent.mm.modelappbrand.x;
import com.tencent.mm.plugin.appbrand.appcache.as;
import com.tencent.mm.plugin.appbrand.appcache.as.a;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.az;
import com.tencent.mm.sdk.e.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class d
  implements com.tencent.mm.modelappbrand.g
{
  public final boolean S(String paramString, int paramInt)
  {
    AppMethodBeat.i(10759);
    paramString = as.v(paramString, 10102, paramInt);
    boolean bool;
    if ((paramString != null) && (paramString.first == as.a.gUI))
    {
      bool = true;
      AppMethodBeat.o(10759);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(10759);
    }
  }

  public final void a(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(10757);
    ((com.tencent.mm.plugin.appbrand.a.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.a.d.class)).xF().a(paramString1, 10102, paramInt, paramString2, paramString3);
    AppMethodBeat.o(10757);
  }

  public final boolean a(String paramString1, int paramInt, String paramString2, h paramh)
  {
    AppMethodBeat.i(10758);
    boolean bool = az.b(paramString1, 10102, paramInt, paramString2, new d.1(this, paramh));
    AppMethodBeat.o(10758);
    return bool;
  }

  public final List<x> abA()
  {
    Object localObject1 = null;
    AppMethodBeat.i(10760);
    Object localObject2 = ((com.tencent.mm.plugin.appbrand.a.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.a.d.class)).xF();
    if (localObject2 == null)
    {
      localObject1 = Collections.EMPTY_LIST;
      AppMethodBeat.o(10760);
    }
    while (true)
    {
      return localObject1;
      Object localObject3 = new StringBuilder("debugType");
      ((StringBuilder)localObject3).append(" = 10102");
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject2 = ((ax)localObject2).gVj.a("AppBrandWxaPkgManifestRecord", null, (String)localObject3, null, null, null, null, 2);
      if (localObject2 == null);
      while (true)
      {
        if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
          break label174;
        localObject1 = Collections.emptyList();
        AppMethodBeat.o(10760);
        break;
        if (!((Cursor)localObject2).moveToFirst())
        {
          ((Cursor)localObject2).close();
        }
        else
        {
          localObject1 = new ArrayList();
          do
          {
            localObject3 = new at();
            ((at)localObject3).d((Cursor)localObject2);
            ((List)localObject1).add(localObject3);
          }
          while (((Cursor)localObject2).moveToNext());
          ((Cursor)localObject2).close();
        }
      }
      label174: localObject2 = new ArrayList(((List)localObject1).size());
      localObject3 = ((List)localObject1).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        at localat = (at)((Iterator)localObject3).next();
        localObject1 = new x();
        ((x)localObject1).csB = localat.field_appId;
        ((x)localObject1).version = localat.field_version;
        ((x)localObject1).cvZ = localat.field_versionMd5;
        ((List)localObject2).add(localObject1);
      }
      AppMethodBeat.o(10760);
      localObject1 = localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.d
 * JD-Core Version:    0.6.2
 */