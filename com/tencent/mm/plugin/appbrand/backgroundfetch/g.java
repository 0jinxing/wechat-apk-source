package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.d;
import com.tencent.mm.protocal.protobuf.ble;
import com.tencent.mm.protocal.protobuf.gk;
import com.tencent.mm.protocal.protobuf.gl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public final class g
  implements i
{
  public final void e(List<gl> paramList, List<gk> paramList1)
  {
    AppMethodBeat.i(129809);
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (gl)localIterator.next();
        Object localObject2;
        if ((localObject1 != null) && (!bo.isNullOrNil(((gl)localObject1).username)) && (paramList1 != null) && (!paramList1.isEmpty()))
        {
          localObject2 = paramList1.iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext())
              break;
            paramList = (gk)((Iterator)localObject2).next();
          }
          while (!((gl)localObject1).username.equalsIgnoreCase(paramList.username));
        }
        while (true)
          if ((((gl)localObject1).cyE == 0) && (paramList != null))
          {
            if ((paramList == null) || (localObject1 == null))
            {
              ab.w("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData fail, request item or response item is null");
              break;
              paramList = null;
              continue;
            }
            if ((bo.isNullOrNil(((gl)localObject1).username)) || (bo.isNullOrNil(((gl)localObject1).data)))
            {
              ab.w("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData fail, no username or data in response");
              break;
            }
            long l = bo.anU();
            String str1 = ((gl)localObject1).username;
            String str2 = ((gl)localObject1).data;
            int i = paramList.vIG;
            if (paramList.vIH != null)
            {
              localObject1 = paramList.vIH.path;
              label227: if (paramList.vIH == null)
                break label305;
              localObject2 = paramList.vIH.query;
              label243: if (paramList.vIH == null)
                break label311;
            }
            label305: label311: for (int j = paramList.vIH.scene; ; j = 1000)
            {
              if (((h)com.tencent.mm.kernel.g.K(h.class)).a(str1, i, str2, (String)localObject1, (String)localObject2, j, l))
                break label319;
              ab.e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData fail, save data fail");
              break;
              localObject1 = null;
              break label227;
              localObject2 = null;
              break label243;
            }
            label319: if (bo.isNullOrNil(paramList.csB))
              break;
            AppBrandBackgroundFetchDataParcel localAppBrandBackgroundFetchDataParcel = new AppBrandBackgroundFetchDataParcel();
            localAppBrandBackgroundFetchDataParcel.username = str1;
            localAppBrandBackgroundFetchDataParcel.hca = i;
            localAppBrandBackgroundFetchDataParcel.data = str2;
            localAppBrandBackgroundFetchDataParcel.path = ((String)localObject1);
            localAppBrandBackgroundFetchDataParcel.query = ((String)localObject2);
            localAppBrandBackgroundFetchDataParcel.scene = j;
            localAppBrandBackgroundFetchDataParcel.updateTime = l;
            ab.i("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData success, send data event to app(%s), appId:%s", new Object[] { paramList.username, paramList.csB });
            d.a(paramList.csB, localAppBrandBackgroundFetchDataParcel);
            break;
          }
        ab.w("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi success, but app(%s) failed to fetch data", new Object[] { ((gl)localObject1).username });
      }
    }
    AppMethodBeat.o(129809);
  }

  public final void onFail(int paramInt)
  {
    AppMethodBeat.i(129810);
    ab.e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi fail, type(%d)", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(129810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.g
 * JD-Core Version:    0.6.2
 */