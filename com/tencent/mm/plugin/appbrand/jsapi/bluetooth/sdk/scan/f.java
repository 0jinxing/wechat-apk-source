package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.annotation.TargetApi;
import android.bluetooth.le.ScanRecord;
import android.os.ParcelUuid;
import android.support.v4.f.a;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f
{
  private final int hFV;
  public final List<ParcelUuid> hFW;
  public final SparseArray<byte[]> hFX;
  public final Map<ParcelUuid, byte[]> hFY;
  private final int hFZ;
  final byte[] mBytes;
  public final String mDeviceName;

  @TargetApi(21)
  f(ScanRecord paramScanRecord)
  {
    AppMethodBeat.i(94320);
    this.hFW = paramScanRecord.getServiceUuids();
    this.hFX = paramScanRecord.getManufacturerSpecificData();
    this.hFY = paramScanRecord.getServiceData();
    this.mDeviceName = paramScanRecord.getDeviceName();
    this.hFV = paramScanRecord.getAdvertiseFlags();
    this.hFZ = paramScanRecord.getTxPowerLevel();
    this.mBytes = paramScanRecord.getBytes();
    AppMethodBeat.o(94320);
  }

  private f(List<ParcelUuid> paramList, SparseArray<byte[]> paramSparseArray, Map<ParcelUuid, byte[]> paramMap, int paramInt1, int paramInt2, String paramString, byte[] paramArrayOfByte)
  {
    this.hFW = paramList;
    this.hFX = paramSparseArray;
    this.hFY = paramMap;
    this.mDeviceName = paramString;
    this.hFV = paramInt1;
    this.hFZ = paramInt2;
    this.mBytes = paramArrayOfByte;
  }

  private static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, List<ParcelUuid> paramList)
  {
    AppMethodBeat.i(94323);
    while (paramInt2 > 0)
    {
      paramList.add(c.ai(p(paramArrayOfByte, paramInt1, paramInt3)));
      paramInt2 -= paramInt3;
      paramInt1 += paramInt3;
    }
    AppMethodBeat.o(94323);
    return paramInt1;
  }

  public static f aj(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94321);
    if (paramArrayOfByte == null)
    {
      AppMethodBeat.o(94321);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      int i = 0;
      ArrayList localArrayList1 = new ArrayList();
      SparseArray localSparseArray = new SparseArray();
      a locala = new a();
      int j = -2147483648;
      Object localObject1 = null;
      int k = -1;
      while (true)
      {
        int n;
        try
        {
          if (i >= paramArrayOfByte.length)
            break label404;
          int m = i + 1;
          i = paramArrayOfByte[i] & 0xFF;
          if (i == 0)
            break label404;
          i--;
          n = m + 1;
          switch (paramArrayOfByte[m] & 0xFF)
          {
          default:
            i += n;
            break;
          case 1:
            k = paramArrayOfByte[n] & 0xFF;
            break;
          case 2:
          case 3:
            a(paramArrayOfByte, n, i, 2, localArrayList1);
            continue;
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          case 22:
          case 255:
          }
        }
        catch (Exception localException)
        {
          new StringBuilder("unable to parse scan record: ").append(Arrays.toString(paramArrayOfByte));
          paramArrayOfByte = new f(null, null, null, -1, -2147483648, null, paramArrayOfByte);
          AppMethodBeat.o(94321);
        }
        break;
        a(paramArrayOfByte, n, i, 4, localArrayList1);
        continue;
        a(paramArrayOfByte, n, i, 16, localArrayList1);
        continue;
        localObject2 = new String(p(paramArrayOfByte, n, i));
        continue;
        j = paramArrayOfByte[n];
        continue;
        locala.put(c.ai(p(paramArrayOfByte, n, 2)), p(paramArrayOfByte, n + 2, i - 2));
        continue;
        localSparseArray.put(((paramArrayOfByte[(n + 1)] & 0xFF) << 8) + (paramArrayOfByte[n] & 0xFF), p(paramArrayOfByte, n + 2, i - 2));
      }
      label404: ArrayList localArrayList2 = localArrayList1;
      if (localArrayList1.isEmpty())
        localArrayList2 = null;
      Object localObject2 = new f(localArrayList2, localSparseArray, locala, k, j, (String)localObject2, paramArrayOfByte);
      AppMethodBeat.o(94321);
      paramArrayOfByte = (byte[])localObject2;
    }
  }

  private static String c(SparseArray<byte[]> paramSparseArray)
  {
    AppMethodBeat.i(94325);
    if (paramSparseArray == null)
    {
      paramSparseArray = "null";
      AppMethodBeat.o(94325);
    }
    while (true)
    {
      return paramSparseArray;
      if (paramSparseArray.size() == 0)
      {
        paramSparseArray = "{}";
        AppMethodBeat.o(94325);
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append('{');
        for (int i = 0; i < paramSparseArray.size(); i++)
          localStringBuilder.append(paramSparseArray.keyAt(i)).append("=").append(Arrays.toString((byte[])paramSparseArray.valueAt(i)));
        localStringBuilder.append('}');
        paramSparseArray = localStringBuilder.toString();
        AppMethodBeat.o(94325);
      }
    }
  }

  private static byte[] p(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94324);
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    AppMethodBeat.o(94324);
    return arrayOfByte;
  }

  private static <T> String x(Map<T, byte[]> paramMap)
  {
    AppMethodBeat.i(94326);
    if (paramMap == null)
    {
      paramMap = "null";
      AppMethodBeat.o(94326);
    }
    while (true)
    {
      return paramMap;
      if (paramMap.isEmpty())
      {
        paramMap = "{}";
        AppMethodBeat.o(94326);
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append('{');
        Iterator localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject = ((Map.Entry)localIterator.next()).getKey();
          localStringBuilder.append(localObject).append("=").append(Arrays.toString((byte[])paramMap.get(localObject)));
          if (localIterator.hasNext())
            localStringBuilder.append(", ");
        }
        localStringBuilder.append('}');
        paramMap = localStringBuilder.toString();
        AppMethodBeat.o(94326);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(94322);
    String str = "ScanRecord [mAdvertiseFlags=" + this.hFV + ", mServiceUuids=" + this.hFW + ", mManufacturerSpecificData=" + c(this.hFX) + ", mServiceData=" + x(this.hFY) + ", mTxPowerLevel=" + this.hFZ + ", mDeviceName=" + this.mDeviceName + "]";
    AppMethodBeat.o(94322);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.f
 * JD-Core Version:    0.6.2
 */