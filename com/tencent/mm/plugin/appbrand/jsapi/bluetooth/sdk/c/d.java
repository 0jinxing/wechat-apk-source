package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import android.util.Base64;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.f;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{
  public String ceI;
  public int cyC;
  public SparseArray<byte[]> hEG;
  public List<ParcelUuid> hEH;
  public String hEI;
  public Map<ParcelUuid, byte[]> hEJ;
  private JSONObject jsonObject;
  public String name;

  public d(ScanResultCompat paramScanResultCompat)
  {
    AppMethodBeat.i(94279);
    this.name = bo.nullAsNil(paramScanResultCompat.getDevice().getName());
    this.ceI = bo.nullAsNil(paramScanResultCompat.getDevice().getAddress());
    this.cyC = paramScanResultCompat.hGc;
    this.hEG = paramScanResultCompat.hGb.hFX;
    this.hEH = paramScanResultCompat.hGb.hFW;
    this.hEI = bo.nullAsNil(paramScanResultCompat.hGb.mDeviceName);
    this.hEJ = paramScanResultCompat.hGb.hFY;
    AppMethodBeat.o(94279);
  }

  public d(String paramString1, String paramString2)
  {
    this.name = paramString1;
    this.ceI = paramString2;
  }

  public final JSONObject aCq()
  {
    AppMethodBeat.i(94280);
    if (this.jsonObject == null)
    {
      this.jsonObject = new JSONObject();
      this.jsonObject.put("deviceId", this.ceI);
      this.jsonObject.put("name", this.name);
      this.jsonObject.put("RSSI", this.cyC);
      Object localObject1 = new byte[0];
      Object localObject2 = new StringBuilder();
      localObject3 = localObject1;
      if (this.hEG != null)
      {
        localObject3 = localObject1;
        if (this.hEG.size() >= 0)
        {
          int i = 0;
          for (localObject3 = localObject1; i < this.hEG.size(); localObject3 = localObject1)
          {
            int j = this.hEG.keyAt(0);
            int k = (byte)(j & 0xFF);
            int m = (byte)(j >> 8 & 0xFF);
            byte[] arrayOfByte = (byte[])this.hEG.valueAt(i);
            localObject1 = new byte[localObject3.length + 2 + arrayOfByte.length];
            System.arraycopy(localObject3, 0, localObject1, 0, localObject3.length);
            j = localObject3.length;
            System.arraycopy(new byte[] { k, m }, 0, localObject1, j, 2);
            System.arraycopy(arrayOfByte, 0, localObject1, localObject3.length + 2, arrayOfByte.length);
            i++;
          }
        }
      }
      ((StringBuilder)localObject2).append(new String(Base64.encode((byte[])localObject3, 2)));
      this.jsonObject.put("advertisData", localObject2);
      localObject1 = new JSONArray();
      if (this.hEH != null)
      {
        localObject3 = this.hEH.iterator();
        while (((Iterator)localObject3).hasNext())
          ((JSONArray)localObject1).put(((ParcelUuid)((Iterator)localObject3).next()).getUuid().toString().toUpperCase());
      }
      this.jsonObject.put("advertisServiceUUIDs", localObject1);
      this.jsonObject.put("localName", this.hEI);
      localObject1 = new JSONObject();
      if ((this.hEJ != null) && (this.hEJ.size() > 0))
      {
        localObject3 = this.hEJ.keySet().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (ParcelUuid)((Iterator)localObject3).next();
          ((JSONObject)localObject1).put(((ParcelUuid)localObject2).getUuid().toString().toUpperCase(), new String(Base64.encode((byte[])this.hEJ.get(localObject2), 2)));
        }
      }
      this.jsonObject.put("serviceData", localObject1);
    }
    Object localObject3 = this.jsonObject;
    AppMethodBeat.o(94280);
    return localObject3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.d
 * JD-Core Version:    0.6.2
 */