package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import org.json.JSONObject;

final class g$6
  implements j.a
{
  g$6(g paramg)
  {
  }

  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(19256);
    if ((paramInt != 13) || (paramArrayOfObject == null) || (paramArrayOfObject.length < 2) || (!(paramArrayOfObject[0] instanceof String)) || (!(paramArrayOfObject[1] instanceof Integer)))
    {
      AppMethodBeat.o(19256);
      return;
    }
    Object localObject = (String)paramArrayOfObject[0];
    paramInt = ((Integer)paramArrayOfObject[1]).intValue();
    String str1 = null;
    paramArrayOfObject = str1;
    while (true)
    {
      try
      {
        String str2 = new java/lang/String;
        paramArrayOfObject = str1;
        str2.<init>((String)localObject);
        paramArrayOfObject = str1;
        localObject = new org/json/JSONObject;
        paramArrayOfObject = str1;
        ((JSONObject)localObject).<init>(str2);
        paramArrayOfObject = str1;
        str1 = ((JSONObject)localObject).getString("deviceId");
        paramArrayOfObject = str1;
        ((JSONObject)localObject).getString("deviceType");
        paramArrayOfObject = str1;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(19256);
        case -2:
        case -1:
        case 0:
        case 1:
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", localException, "", new Object[0]);
        ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in device ConnState notify callback");
        continue;
        this.lsY.lsN.put(paramArrayOfObject, Boolean.FALSE);
        ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device not connect stateCode = ".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(19256);
      }
      break;
      this.lsY.lsN.put(paramArrayOfObject, Boolean.TRUE);
      ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device connect");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.g.6
 * JD-Core Version:    0.6.2
 */