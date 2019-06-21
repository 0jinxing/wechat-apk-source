package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

final class g$5
  implements j.a
{
  g$5(g paramg)
  {
  }

  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(19255);
    if ((paramInt != 12) || (paramArrayOfObject == null) || (paramArrayOfObject.length < 2) || (!(paramArrayOfObject[0] instanceof Integer)) || (!(paramArrayOfObject[1] instanceof byte[])))
      AppMethodBeat.o(19255);
    while (true)
    {
      return;
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      Object localObject = (byte[])paramArrayOfObject[1];
      if (paramInt > 0)
      {
        paramArrayOfObject = (String)this.lsY.lsX.get(Integer.valueOf(paramInt));
        if (paramArrayOfObject != null)
          try
          {
            String str = new java/lang/String;
            str.<init>((byte[])localObject);
            ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "receive response json %s", new Object[] { str });
            localObject = new org/json/JSONObject;
            ((JSONObject)localObject).<init>(str);
            if ((!((JSONObject)localObject).isNull("errcode")) && (((JSONObject)localObject).getInt("errcode") != 0))
            {
              g.dQ(paramArrayOfObject, this.lsY.lsC);
              ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "send msg failed data %s", new Object[] { str });
              AppMethodBeat.o(19255);
              continue;
            }
            g.dQ(paramArrayOfObject, this.lsY.lsB);
            ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "send data success!");
            AppMethodBeat.o(19255);
          }
          catch (JSONException paramArrayOfObject)
          {
            ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode mUseWCLanDeviceServiceCmdId failed %s", new Object[] { paramArrayOfObject });
            AppMethodBeat.o(19255);
          }
      }
      else
      {
        ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "receive cmdId =".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(19255);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.g.5
 * JD-Core Version:    0.6.2
 */