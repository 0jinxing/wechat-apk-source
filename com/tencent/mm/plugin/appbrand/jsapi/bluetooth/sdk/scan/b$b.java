package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class b$b
  implements BluetoothAdapter.LeScanCallback
{
  private final List<ScanFilterCompat> filters;
  private final WeakReference<e> hFo;

  b$b(List<ScanFilterCompat> paramList, e parame)
  {
    AppMethodBeat.i(94295);
    this.filters = paramList;
    this.hFo = new WeakReference(parame);
    AppMethodBeat.o(94295);
  }

  public final void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94296);
    e locale = (e)this.hFo.get();
    if (locale == null)
      AppMethodBeat.o(94296);
    while (true)
    {
      return;
      ScanResultCompat localScanResultCompat = new ScanResultCompat(paramBluetoothDevice, f.aj(paramArrayOfByte), paramInt, System.currentTimeMillis());
      if (this.filters == null)
      {
        locale.a(1, localScanResultCompat);
        AppMethodBeat.o(94296);
      }
      else
      {
        Iterator localIterator1 = this.filters.iterator();
        label422: label479: 
        while (true)
        {
          if (!localIterator1.hasNext())
            break label481;
          paramArrayOfByte = (ScanFilterCompat)localIterator1.next();
          paramBluetoothDevice = localScanResultCompat.getDevice();
          if ((paramArrayOfByte.hFK != null) && ((paramBluetoothDevice == null) || (!paramArrayOfByte.hFK.equals(paramBluetoothDevice.getAddress()))))
            paramInt = 0;
          while (true)
          {
            if (paramInt == 0)
              break label479;
            locale.a(1, localScanResultCompat);
            AppMethodBeat.o(94296);
            break;
            f localf = localScanResultCompat.hGb;
            if ((localf == null) && ((paramArrayOfByte.mDeviceName != null) || (paramArrayOfByte.hFL != null) || (paramArrayOfByte.hFR != null) || (paramArrayOfByte.hFO != null) || (paramArrayOfByte.hFN != null) || (paramArrayOfByte.hFQ >= 0)))
            {
              paramInt = 0;
            }
            else if ((paramArrayOfByte.mDeviceName != null) && (!paramArrayOfByte.mDeviceName.equals(localf.mDeviceName)))
            {
              paramInt = 0;
            }
            else
            {
              Object localObject1;
              Object localObject2;
              if (paramArrayOfByte.hFL != null)
              {
                localObject1 = paramArrayOfByte.hFL;
                localObject2 = paramArrayOfByte.hFM;
                paramBluetoothDevice = localf.hFW;
                if (localObject1 == null)
                  paramInt = 1;
                while (true)
                {
                  if (paramInt != 0)
                    break label358;
                  paramInt = 0;
                  break;
                  if (paramBluetoothDevice != null)
                  {
                    Iterator localIterator2 = paramBluetoothDevice.iterator();
                    label351: 
                    while (true)
                    {
                      if (!localIterator2.hasNext())
                        break label353;
                      ParcelUuid localParcelUuid = (ParcelUuid)localIterator2.next();
                      if (localObject2 == null);
                      for (paramBluetoothDevice = null; ; paramBluetoothDevice = ((ParcelUuid)localObject2).getUuid())
                      {
                        if (!ScanFilterCompat.a(((ParcelUuid)localObject1).getUuid(), paramBluetoothDevice, localParcelUuid.getUuid()))
                          break label351;
                        paramInt = 1;
                        break;
                      }
                    }
                  }
                  label353: paramInt = 0;
                }
              }
              label358: if (paramArrayOfByte.hFN != null)
              {
                localObject1 = paramArrayOfByte.hFO;
                localObject2 = paramArrayOfByte.hFP;
                paramBluetoothDevice = paramArrayOfByte.hFN;
                if (paramBluetoothDevice == null);
                for (paramBluetoothDevice = null; ; paramBluetoothDevice = (byte[])localf.hFY.get(paramBluetoothDevice))
                {
                  if (ScanFilterCompat.a((byte[])localObject1, (byte[])localObject2, paramBluetoothDevice))
                    break label422;
                  paramInt = 0;
                  break;
                }
              }
              if ((paramArrayOfByte.hFQ >= 0) && (localf != null))
              {
                paramBluetoothDevice = paramArrayOfByte.hFR;
                localObject1 = paramArrayOfByte.hFS;
                paramInt = paramArrayOfByte.hFQ;
                if (!ScanFilterCompat.a(paramBluetoothDevice, (byte[])localObject1, (byte[])localf.hFX.get(paramInt)))
                  paramInt = 0;
              }
              else
              {
                paramInt = 1;
              }
            }
          }
        }
        label481: AppMethodBeat.o(94296);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.b.b
 * JD-Core Version:    0.6.2
 */