package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class f$1
  implements MMToClientEvent.c
{
  f$1(String paramString)
  {
  }

  public final void bk(Object paramObject)
  {
    AppMethodBeat.i(129806);
    String str1;
    Object localObject;
    String str2;
    int i;
    q localq;
    if ((paramObject instanceof AppBrandBackgroundFetchDataParcel))
    {
      ab.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent.javayhu", "app received data, appId:%s", new Object[] { this.val$appId });
      str1 = this.val$appId;
      localObject = (AppBrandBackgroundFetchDataParcel)paramObject;
      if ((localObject == null) || (bo.isNullOrNil(str1)))
      {
        ab.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent.javayhu", "dispatch, parcel is null or appid is null");
        AppMethodBeat.o(129806);
      }
      String str3;
      String str4;
      int j;
      long l;
      while (true)
      {
        return;
        str2 = ((AppBrandBackgroundFetchDataParcel)localObject).username;
        i = ((AppBrandBackgroundFetchDataParcel)localObject).hca;
        str3 = ((AppBrandBackgroundFetchDataParcel)localObject).data;
        str4 = ((AppBrandBackgroundFetchDataParcel)localObject).path;
        paramObject = ((AppBrandBackgroundFetchDataParcel)localObject).query;
        j = ((AppBrandBackgroundFetchDataParcel)localObject).scene;
        l = ((AppBrandBackgroundFetchDataParcel)localObject).updateTime;
        if ((bo.isNullOrNil(str2)) || (bo.isNullOrNil(str3)))
        {
          ab.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent.javayhu", "username or data is null");
          AppMethodBeat.o(129806);
        }
        else
        {
          localObject = a.wI(str1);
          if ((localObject == null) || (!((i)localObject).eMP))
          {
            ab.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent.javayhu", "app(%s) runtime is null or not initialized, appId:%s", new Object[] { str2, str1 });
            AppMethodBeat.o(129806);
          }
          else
          {
            localq = ((i)localObject).xT();
            if ((localq != null) && (localq.asD() != b.gWw))
              break;
            ab.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent.javayhu", "app(%s) service is null or has destroyed, appId:%s", new Object[] { str2, str1 });
            AppMethodBeat.o(129806);
          }
        }
      }
      localObject = new HashMap();
      ((HashMap)localObject).put("timeStamp", Long.valueOf(l));
      ((HashMap)localObject).put("path", str4);
      ((HashMap)localObject).put("query", paramObject);
      ((HashMap)localObject).put("scene", Integer.valueOf(j));
      ((HashMap)localObject).put("fetchedData", str3);
      if (i != 0)
        break label359;
    }
    label359: for (paramObject = "pre"; ; paramObject = "peroid")
    {
      ((HashMap)localObject).put("fetchType", paramObject);
      ab.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent.javayhu", "AppBrandOnBackgroundFetchDataEvent dispatch to app(%s), appId:%s, fetch type:%d", new Object[] { str2, str1, Integer.valueOf(i) });
      new f().s((Map)localObject).i(localq).aCj();
      AppMethodBeat.o(129806);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.f.1
 * JD-Core Version:    0.6.2
 */