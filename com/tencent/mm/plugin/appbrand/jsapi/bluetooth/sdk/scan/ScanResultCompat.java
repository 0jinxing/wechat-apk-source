package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public class ScanResultCompat
  implements Parcelable
{
  public static final Parcelable.Creator<ScanResultCompat> CREATOR;
  private BluetoothDevice hGa;
  public f hGb;
  public int hGc;
  private long hGd;

  static
  {
    AppMethodBeat.i(94334);
    CREATOR = new ScanResultCompat.1();
    AppMethodBeat.o(94334);
  }

  public ScanResultCompat(BluetoothDevice paramBluetoothDevice, f paramf, int paramInt, long paramLong)
  {
    this.hGa = paramBluetoothDevice;
    this.hGb = paramf;
    this.hGc = paramInt;
    this.hGd = paramLong;
  }

  @TargetApi(21)
  ScanResultCompat(ScanResult paramScanResult)
  {
    AppMethodBeat.i(94328);
    this.hGa = paramScanResult.getDevice();
    this.hGb = new f(paramScanResult.getScanRecord());
    this.hGc = paramScanResult.getRssi();
    this.hGd = System.currentTimeMillis();
    AppMethodBeat.o(94328);
  }

  private ScanResultCompat(Parcel paramParcel)
  {
    AppMethodBeat.i(94329);
    if (paramParcel.readInt() == 1)
      this.hGa = ((BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(paramParcel));
    if (paramParcel.readInt() == 1)
      this.hGb = f.aj(paramParcel.createByteArray());
    this.hGc = paramParcel.readInt();
    this.hGd = paramParcel.readLong();
    AppMethodBeat.o(94329);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(94332);
    if (this == paramObject)
      AppMethodBeat.o(94332);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(94332);
        bool = false;
      }
      else
      {
        paramObject = (ScanResultCompat)paramObject;
        if ((d.equals(this.hGa, paramObject.hGa)) && (this.hGc == paramObject.hGc) && (d.equals(this.hGb, paramObject.hGb)) && (this.hGd == paramObject.hGd))
        {
          AppMethodBeat.o(94332);
        }
        else
        {
          AppMethodBeat.o(94332);
          bool = false;
        }
      }
    }
  }

  public final BluetoothDevice getDevice()
  {
    if (this.hGa != null);
    for (BluetoothDevice localBluetoothDevice = this.hGa; ; localBluetoothDevice = null)
      return localBluetoothDevice;
  }

  public int hashCode()
  {
    AppMethodBeat.i(94331);
    int i = Arrays.hashCode(new Object[] { this.hGa, Integer.valueOf(this.hGc), this.hGb, Long.valueOf(this.hGd) });
    AppMethodBeat.o(94331);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(94333);
    String str = "ScanResult{mDevice=" + this.hGa + ", mScanRecord=" + d.toString(this.hGb) + ", mRssi=" + this.hGc + ", mTimestampNanos=" + this.hGd + '}';
    AppMethodBeat.o(94333);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(94330);
    if (this.hGa != null)
    {
      paramParcel.writeInt(1);
      this.hGa.writeToParcel(paramParcel, paramInt);
      if (this.hGb == null)
        break label79;
      paramParcel.writeInt(1);
      paramParcel.writeByteArray(this.hGb.mBytes);
    }
    while (true)
    {
      paramParcel.writeInt(this.hGc);
      paramParcel.writeLong(this.hGd);
      AppMethodBeat.o(94330);
      return;
      paramParcel.writeInt(0);
      break;
      label79: paramParcel.writeInt(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat
 * JD-Core Version:    0.6.2
 */