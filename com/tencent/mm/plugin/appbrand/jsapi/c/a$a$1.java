package com.tencent.mm.plugin.appbrand.jsapi.c;

import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

final class a$a$1
  implements BluetoothAdapter.LeScanCallback
{
  a$a$1(a.a parama)
  {
  }

  public final void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94352);
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.BeaconManager", "valueByte is null or nil");
      AppMethodBeat.o(94352);
    }
    while (true)
    {
      return;
      int i = 0;
      for (int j = 2; ; j++)
      {
        k = i;
        if (j <= 5)
        {
          if (((paramArrayOfByte[(j + 2)] & 0xFF) == 2) && ((paramArrayOfByte[(j + 3)] & 0xFF) == 21))
            k = 1;
        }
        else
        {
          if (k == 0)
            break label620;
          localObject1 = new byte[16];
          System.arraycopy(paramArrayOfByte, j + 4, localObject1, 0, 16);
          localObject2 = new StringBuilder();
          for (k = 0; k < 16; k++)
          {
            i = localObject1[k] & 0xFF;
            if (i < 16)
              ((StringBuilder)localObject2).append("0");
            ((StringBuilder)localObject2).append(Integer.toHexString(i));
          }
        }
      }
      Object localObject2 = ((StringBuilder)localObject2).toString().toUpperCase(Locale.US);
      if (bo.isNullOrNil((String)localObject2))
      {
        ab.e("MicroMsg.BeaconManager", "hexString is null, err");
        AppMethodBeat.o(94352);
        continue;
      }
      localObject2 = UUID.fromString(((String)localObject2).substring(0, 8) + "-" + ((String)localObject2).substring(8, 12) + "-" + ((String)localObject2).substring(12, 16) + "-" + ((String)localObject2).substring(16, 20) + "-" + ((String)localObject2).substring(20, 32));
      int m = 0;
      Object localObject1 = this.hKf.hKa;
      int n = localObject1.length;
      i = 0;
      label315: int k = m;
      double d;
      if (i < n)
      {
        if (localObject1[i].equals(localObject2))
          k = 1;
      }
      else if (k != 0)
      {
        m = paramArrayOfByte[(j + 20)];
        n = paramArrayOfByte[(j + 21)];
        i = paramArrayOfByte[(j + 22)];
        k = paramArrayOfByte[(j + 23)];
        j = paramArrayOfByte[(j + 24)];
        d = paramInt;
        if (d != 0.0D)
          break label634;
        d = -1.0D;
        label408: paramBluetoothDevice = paramBluetoothDevice.getAddress();
        paramArrayOfByte = new JSONObject();
      }
      try
      {
        paramArrayOfByte.put("uuid", localObject2);
        paramArrayOfByte.put("major", (m & 0xFF) * 256 + (n & 0xFF));
        paramArrayOfByte.put("minor", (i & 0xFF) * 256 + (k & 0xFF));
        paramArrayOfByte.put("proximity", 0);
        paramArrayOfByte.put("accuracy", d);
        paramArrayOfByte.put("rssi", paramInt);
        this.hKf.hJZ.put(paramBluetoothDevice, paramArrayOfByte);
        this.hKf.hKd.put(paramBluetoothDevice, paramArrayOfByte);
        ab.d("MicroMsg.BeaconManager", "found device ibeacon %s", new Object[] { paramArrayOfByte });
        long l = System.currentTimeMillis();
        if (l - this.hKf.hKc > 500L)
        {
          if (this.hKf.hKb != null)
            this.hKf.hKb.z(this.hKf.hKd);
          this.hKf.hKc = l;
          this.hKf.hKd.clear();
        }
        label620: AppMethodBeat.o(94352);
        continue;
        i++;
        break label315;
        label634: d = d * 1.0D / j;
        if (d < 1.0D)
        {
          d = Math.pow(d, 10.0D);
          break label408;
        }
        d = Math.pow(d, 9.9476D) * 0.92093D + 0.54992D;
      }
      catch (JSONException paramBluetoothDevice)
      {
        while (true)
          ab.e("MicroMsg.BeaconManager", "put JSON data error : %s", new Object[] { paramBluetoothDevice });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.c.a.a.1
 * JD-Core Version:    0.6.2
 */