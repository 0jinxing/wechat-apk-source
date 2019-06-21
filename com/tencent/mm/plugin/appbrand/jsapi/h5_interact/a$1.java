package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

final class a$1
  implements MMToClientEvent.c
{
  public final void bk(Object paramObject)
  {
    AppMethodBeat.i(131085);
    Object localObject1;
    Object localObject2;
    int i;
    if ((paramObject instanceof SendDataToMiniProgramFromH5Event))
    {
      localObject1 = (SendDataToMiniProgramFromH5Event)paramObject;
      localObject2 = ((SendDataToMiniProgramFromH5Event)localObject1).hJW;
      paramObject = ((SendDataToMiniProgramFromH5Event)localObject1).data;
      i = ((SendDataToMiniProgramFromH5Event)localObject1).hJX;
      if (!bo.isNullOrNil((String)localObject2))
      {
        localObject1 = com.tencent.mm.plugin.appbrand.a.wI((String)localObject2);
        if ((localObject1 == null) || (!((i)localObject1).eMP))
          AppMethodBeat.o(131085);
      }
    }
    while (true)
    {
      return;
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        paramObject = ((JSONObject)localObject2).put("data", paramObject).put("webviewId", String.valueOf(i));
        localObject2 = new com/tencent/mm/plugin/appbrand/jsapi/h5_interact/a;
        ((a)localObject2).<init>();
        ((a)localObject2).i(((o)localObject1).atK()).AL(paramObject.toString());
        ((a)localObject2).aCj();
        AppMethodBeat.o(131085);
      }
      catch (Exception paramObject)
      {
        ab.e("MicroMsg.AppBrand.EventOnH5Data", "dispatch ex = %s", new Object[] { paramObject });
      }
      AppMethodBeat.o(131085);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a.1
 * JD-Core Version:    0.6.2
 */