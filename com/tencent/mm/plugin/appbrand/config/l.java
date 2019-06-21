package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.protocal.protobuf.aec;
import com.tencent.mm.protocal.protobuf.aed;
import com.tencent.mm.protocal.protobuf.aee;
import com.tencent.mm.protocal.protobuf.cnp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
{
  private static aec B(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129866);
    aec localaec = new aec();
    localaec.fKh = paramString;
    localaec.jCt = paramInt1;
    localaec.vFs = paramInt2;
    AppMethodBeat.o(129866);
    return localaec;
  }

  public static String a(String paramString, int paramInt1, int paramInt2, l.c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(129867);
    if (f.xH() == null)
    {
      paramString = "";
      AppMethodBeat.o(129867);
      return paramString;
    }
    int i = l.a.aV(paramString, paramInt1);
    int j = l.a.aW(paramString, paramInt1);
    String str = l.a.aX(paramString, paramInt1);
    boolean bool;
    if ((j != 0) && ((bo.isNullOrNil(str)) || (j > i)))
    {
      bool = true;
      label65: ab.i("MicroMsg.CommonConfigManager", "getConfig the server_version is %d ,the local_version is %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      ab.i("MicroMsg.CommonConfigManager", "the config is \n %s \n isShouldSyncFromServer:%b", new Object[] { str, Boolean.valueOf(bool) });
      if (!bool)
        break label160;
      if (paramBoolean)
        a(paramString, paramInt1, j, paramInt2, new l.2(paramc, paramString));
    }
    while (true)
    {
      AppMethodBeat.o(129867);
      paramString = str;
      break;
      bool = false;
      break label65;
      label160: paramc.xC(str);
    }
  }

  private static void a(String paramString, int paramInt1, int paramInt2, int paramInt3, l.b paramb)
  {
    AppMethodBeat.i(129868);
    LinkedList localLinkedList = new LinkedList();
    aec localaec = new aec();
    localaec.fKh = paramString;
    localaec.jCt = paramInt1;
    localaec.vFs = paramInt2;
    localaec.wmf = paramInt3;
    localLinkedList.add(localaec);
    a(localLinkedList, paramb);
    AppMethodBeat.o(129868);
  }

  public static void a(String paramString, LinkedList<cnp> paramLinkedList, boolean paramBoolean)
  {
    AppMethodBeat.i(129865);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.CommonConfigManager", "setVersion, app_id is null");
      AppMethodBeat.o(129865);
    }
    while (true)
    {
      return;
      if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
      {
        ab.e("MicroMsg.CommonConfigManager", "setVersion, versionItems is empty");
        AppMethodBeat.o(129865);
      }
      else
      {
        LinkedList localLinkedList = new LinkedList();
        Iterator localIterator = paramLinkedList.iterator();
        while (localIterator.hasNext())
        {
          cnp localcnp = (cnp)localIterator.next();
          ab.d("MicroMsg.CommonConfigManager", "versionItem.version:%d,version.type:%d", new Object[] { Integer.valueOf(localcnp.version), Integer.valueOf(localcnp.type) });
          int i = l.a.aV(paramString, localcnp.type);
          int j = localcnp.version;
          l.a.D(paramString, localcnp.type, j);
          if (j != 0)
            if (j > i)
            {
              localLinkedList.add(B(paramString, localcnp.type, localcnp.version));
            }
            else if (j == i)
            {
              if (bo.isNullOrNil(l.a.aX(paramString, localcnp.type)))
                localLinkedList.add(B(paramString, localcnp.type, localcnp.version));
            }
            else
            {
              ab.i("MicroMsg.CommonConfigManager", "local_version:%d, server_version:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
              if (bo.isNullOrNil(l.a.aX(paramString, localcnp.type)))
                localLinkedList.add(B(paramString, localcnp.type, localcnp.version));
            }
        }
        ab.i("MicroMsg.CommonConfigManager", "setVersion appid:%s,versionItems.size:%d,getAppConfigItems.size:%d", new Object[] { paramString, Integer.valueOf(paramLinkedList.size()), Integer.valueOf(localLinkedList.size()) });
        if (paramBoolean)
        {
          if (localLinkedList.size() == 0)
          {
            AppMethodBeat.o(129865);
          }
          else
          {
            ab.d("MicroMsg.CommonConfigManager", "setVersion appid:%s, need sync from server", new Object[] { paramString });
            a(localLinkedList, new l.1(paramString));
          }
        }
        else
          AppMethodBeat.o(129865);
      }
    }
  }

  private static void a(LinkedList<aec> paramLinkedList, l.b paramb)
  {
    AppMethodBeat.i(129869);
    b.a locala = new b.a();
    locala.fsI = 1138;
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getappconfig";
    locala.fsK = new aee();
    locala.fsL = 0;
    locala.fsM = 0;
    aed localaed = new aed();
    localaed.wmg = paramLinkedList;
    locala.fsJ = localaed;
    w.a(locala.acD(), new l.3(paramb), true);
    AppMethodBeat.o(129869);
  }

  public static void b(String paramString, LinkedList<cnp> paramLinkedList)
  {
    AppMethodBeat.i(129864);
    a(paramString, paramLinkedList, true);
    AppMethodBeat.o(129864);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.l
 * JD-Core Version:    0.6.2
 */