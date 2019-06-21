package com.tencent.mm.plugin.appbrand.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.a.b;
import com.tencent.mm.af.a.c;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.bt.a;
import com.tencent.mm.modelappbrand.k;
import com.tencent.mm.modelappbrand.k.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.protocal.protobuf.ape;
import com.tencent.mm.protocal.protobuf.apf;
import com.tencent.mm.protocal.protobuf.bzk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class e
  implements k
{
  private static Map<String, Object> inw;
  private static Map<String, List<e.a>> inx;

  static
  {
    AppMethodBeat.i(132299);
    inw = new HashMap();
    inx = new HashMap();
    AppMethodBeat.o(132299);
  }

  public final boolean T(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(132293);
    c localc = f.auS();
    if (localc == null)
    {
      ab.e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null, err");
      AppMethodBeat.o(132293);
      return bool;
    }
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WxaUpdateableMsgStorage", "shareKey is null, err");
      bool = false;
    }
    while (true)
    {
      ab.d("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d, btnState:%d isOk:%b", new Object[] { paramString, Integer.valueOf(paramString.hashCode()), Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      if (bool)
        inw.get(paramString);
      AppMethodBeat.o(132293);
      break;
      b localb = new b();
      localb.field_shareKeyHash = paramString.hashCode();
      bool = localc.b(localb, new String[0]);
      localb.field_btnState = paramInt;
      if (bool)
        bool = localc.c(localb, new String[0]);
      else
        bool = localc.b(localb);
    }
  }

  public final void a(String paramString1, String paramString2, String paramString3, int paramInt, k.a parama)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(132295);
        if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString3)))
        {
          ab.e("MicroMsg.WxaUpdateableMsgService", "token appId or shareKey is null, return");
          AppMethodBeat.o(132295);
          return;
        }
        List localList = (List)inx.get(paramString1);
        Object localObject = localList;
        if (localList == null)
        {
          ab.i("MicroMsg.WxaUpdateableMsgService", "addOnUpdatbleMsgInfoChange token:%s", new Object[] { paramString1 });
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          inx.put(paramString1, localObject);
        }
        ab.i("MicroMsg.WxaUpdateableMsgService", "addOnUpdatbleMsgInfoChange shareKeyHash:%d", new Object[] { Integer.valueOf(paramString3.hashCode()) });
        ab.d("MicroMsg.WxaUpdateableMsgService", "addOnUpdatbleMsgInfoChange shareKey:%s", new Object[] { paramString3 });
        paramString1 = new com/tencent/mm/plugin/appbrand/i/e$a;
        paramString1.<init>((byte)0);
        paramString1.appId = paramString2;
        paramString1.bQi = paramString3;
        paramString1.iny = paramInt;
        paramString1.inz = parama;
        if ((bo.isNullOrNil(paramString1.appId)) || (bo.isNullOrNil(paramString1.bQi)))
        {
          ab.w("MicroMsg.WxaUpdateableMsgService", "appId or shareKey is null, return");
          ((List)localObject).add(paramString1);
          AppMethodBeat.o(132295);
          continue;
        }
      }
      finally
      {
      }
      paramString2 = e.b.inA;
      ab.d("MicroMsg.WxaUpdateableMsgService", "[addWorker]getUpdatableMsgWorkerList size:%d", new Object[] { Integer.valueOf(paramString2.inB.size()) });
      paramString2.inB.put(Integer.valueOf(paramString1.bQi.hashCode()), paramString1);
    }
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(132294);
    c localc = f.auS();
    if (localc == null)
    {
      ab.e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null, err");
      AppMethodBeat.o(132294);
      return bool;
    }
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.WxaUpdateableMsgStorage", "shareKey is null, err");
      bool = false;
    }
    while (true)
    {
      ab.d("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d, content:%s contentColor:%s isOk:%b", new Object[] { paramString1, Integer.valueOf(paramString1.hashCode()), paramString2, paramString3, Boolean.valueOf(bool) });
      AppMethodBeat.o(132294);
      break;
      b localb = new b();
      localb.field_shareKeyHash = paramString1.hashCode();
      bool = localc.b(localb, new String[0]);
      localb.field_updatePeroid = paramInt1;
      localb.field_msgState = paramInt2;
      localb.field_content = paramString2;
      localb.field_contentColor = paramString3;
      if (bool)
        bool = localc.c(localb, new String[0]);
      else
        bool = localc.b(localb);
    }
  }

  public final void abC()
  {
    AppMethodBeat.i(132297);
    ab.i("MicroMsg.WxaUpdateableMsgService", "startUpdatbleMsgInfoChange");
    e.b.inA.start();
    AppMethodBeat.o(132297);
  }

  public final void abD()
  {
    AppMethodBeat.i(132298);
    ab.i("MicroMsg.WxaUpdateableMsgService", "stopOnUpdatbleMsgInfoChange");
    e.b.inA.stop();
    AppMethodBeat.o(132298);
  }

  public final b pn(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(132292);
    c localc = f.auS();
    Object localObject2;
    if (localc == null)
    {
      ab.e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null");
      AppMethodBeat.o(132292);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.WxaUpdateableMsgService", "shareKey is null, return");
        AppMethodBeat.o(132292);
        localObject2 = localObject1;
      }
      else
      {
        int i = paramString.hashCode();
        b localb = new b();
        localb.field_shareKeyHash = i;
        localObject2 = localb;
        if (!localc.b(localb, new String[] { "shareKeyHash" }))
        {
          ab.e("MicroMsg.WxaUpdateableMsgStorage", "WxaUpdateableMsg is null");
          localObject2 = null;
        }
        if (localObject2 == null)
        {
          ab.e("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d, wxaUpdateableMsg is null", new Object[] { paramString, Integer.valueOf(paramString.hashCode()) });
          AppMethodBeat.o(132292);
          localObject2 = localObject1;
        }
        else
        {
          ab.d("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d status:%s", new Object[] { paramString, Integer.valueOf(paramString.hashCode()), Integer.valueOf(localObject2.field_btnState) });
          AppMethodBeat.o(132292);
        }
      }
    }
  }

  public final void po(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(132296);
        ab.i("MicroMsg.WxaUpdateableMsgService", "removeOnUpdatbleMsgInfoChange token:%s", new Object[] { paramString });
        Object localObject = (List)inx.get(paramString);
        if (localObject == null)
        {
          ab.w("MicroMsg.WxaUpdateableMsgService", "[removeOnUpdatbleMsgInfoChange]getUpdatableMsgWorkers is null, err");
          AppMethodBeat.o(132296);
          return;
        }
        Iterator localIterator = ((List)localObject).iterator();
        if (localIterator.hasNext())
        {
          localObject = (e.a)localIterator.next();
          e.b localb = e.b.inA;
          ab.d("MicroMsg.WxaUpdateableMsgService", "[removeWorker]getUpdatableMsgWorkerList size:%d", new Object[] { Integer.valueOf(localb.inB.size()) });
          localb.inB.remove(Integer.valueOf(((e.a)localObject).bQi.hashCode()));
          continue;
        }
      }
      finally
      {
      }
      inx.remove(paramString);
      AppMethodBeat.o(132296);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.e
 * JD-Core Version:    0.6.2
 */