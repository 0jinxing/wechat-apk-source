package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.UUID;

public class ScanFilterCompat
  implements Parcelable
{
  public static final Parcelable.Creator<ScanFilterCompat> CREATOR;
  private static final ScanFilterCompat hFT;
  final String hFK;
  final ParcelUuid hFL;
  final ParcelUuid hFM;
  final ParcelUuid hFN;
  final byte[] hFO;
  final byte[] hFP;
  final int hFQ;
  final byte[] hFR;
  final byte[] hFS;
  final String mDeviceName;

  static
  {
    AppMethodBeat.i(94319);
    hFT = new ScanFilterCompat.a().aCV();
    CREATOR = new ScanFilterCompat.1();
    AppMethodBeat.o(94319);
  }

  private ScanFilterCompat(String paramString1, String paramString2, ParcelUuid paramParcelUuid1, ParcelUuid paramParcelUuid2, ParcelUuid paramParcelUuid3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4)
  {
    this.mDeviceName = paramString1;
    this.hFL = paramParcelUuid1;
    this.hFM = paramParcelUuid2;
    this.hFK = paramString2;
    this.hFN = paramParcelUuid3;
    this.hFO = paramArrayOfByte1;
    this.hFP = paramArrayOfByte2;
    this.hFQ = paramInt;
    this.hFR = paramArrayOfByte3;
    this.hFS = paramArrayOfByte4;
  }

  static boolean a(UUID paramUUID1, UUID paramUUID2, UUID paramUUID3)
  {
    boolean bool = false;
    AppMethodBeat.i(94315);
    if (paramUUID2 == null)
    {
      bool = paramUUID1.equals(paramUUID3);
      AppMethodBeat.o(94315);
    }
    while (true)
    {
      return bool;
      if ((paramUUID1.getLeastSignificantBits() & paramUUID2.getLeastSignificantBits()) != (paramUUID3.getLeastSignificantBits() & paramUUID2.getLeastSignificantBits()))
      {
        AppMethodBeat.o(94315);
      }
      else if ((paramUUID1.getMostSignificantBits() & paramUUID2.getMostSignificantBits()) == (paramUUID3.getMostSignificantBits() & paramUUID2.getMostSignificantBits()))
      {
        bool = true;
        AppMethodBeat.o(94315);
      }
      else
      {
        AppMethodBeat.o(94315);
      }
    }
  }

  static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramArrayOfByte3 != null)
    {
      if (paramArrayOfByte3.length >= paramArrayOfByte1.length)
        break label22;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label22: int i;
      if (paramArrayOfByte2 == null)
      {
        for (i = 0; ; i++)
        {
          if (i >= paramArrayOfByte1.length)
            break label56;
          bool2 = bool1;
          if (paramArrayOfByte3[i] != paramArrayOfByte1[i])
            break;
        }
        label56: bool2 = true;
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= paramArrayOfByte1.length)
            break label102;
          bool2 = bool1;
          if ((paramArrayOfByte2[i] & paramArrayOfByte3[i]) != (paramArrayOfByte2[i] & paramArrayOfByte1[i]))
            break;
        }
        label102: bool2 = true;
      }
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(94318);
    if (this == paramObject)
      AppMethodBeat.o(94318);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(94318);
        bool = false;
      }
      else
      {
        paramObject = (ScanFilterCompat)paramObject;
        if ((d.equals(this.mDeviceName, paramObject.mDeviceName)) && (d.equals(this.hFK, paramObject.hFK)) && (this.hFQ == paramObject.hFQ) && (d.deepEquals(this.hFR, paramObject.hFR)) && (d.deepEquals(this.hFS, paramObject.hFS)) && (d.deepEquals(this.hFN, paramObject.hFN)) && (d.deepEquals(this.hFO, paramObject.hFO)) && (d.deepEquals(this.hFP, paramObject.hFP)) && (d.equals(this.hFL, paramObject.hFL)) && (d.equals(this.hFM, paramObject.hFM)))
        {
          AppMethodBeat.o(94318);
        }
        else
        {
          AppMethodBeat.o(94318);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(94317);
    int i = Arrays.hashCode(new Object[] { this.mDeviceName, this.hFK, Integer.valueOf(this.hFQ), this.hFR, this.hFS, this.hFN, this.hFO, this.hFP, this.hFL, this.hFM });
    AppMethodBeat.o(94317);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(94316);
    String str = "BluetoothLeScanFilter [mDeviceName=" + this.mDeviceName + ", mDeviceAddress=" + this.hFK + ", mUuid=" + this.hFL + ", mUuidMask=" + this.hFM + ", mServiceDataUuid=" + d.toString(this.hFN) + ", mServiceData=" + Arrays.toString(this.hFO) + ", mServiceDataMask=" + Arrays.toString(this.hFP) + ", mManufacturerId=" + this.hFQ + ", mManufacturerData=" + Arrays.toString(this.hFR) + ", mManufacturerDataMask=" + Arrays.toString(this.hFS) + "]";
    AppMethodBeat.o(94316);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(94314);
    int j;
    if (this.mDeviceName == null)
    {
      j = 0;
      paramParcel.writeInt(j);
      if (this.mDeviceName != null)
        paramParcel.writeString(this.mDeviceName);
      if (this.hFK != null)
        break label337;
      j = 0;
      label48: paramParcel.writeInt(j);
      if (this.hFK != null)
        paramParcel.writeString(this.hFK);
      if (this.hFL != null)
        break label343;
      j = 0;
      label79: paramParcel.writeInt(j);
      if (this.hFL != null)
      {
        paramParcel.writeParcelable(this.hFL, paramInt);
        if (this.hFM != null)
          break label349;
        j = 0;
        label111: paramParcel.writeInt(j);
        if (this.hFM != null)
          paramParcel.writeParcelable(this.hFM, paramInt);
      }
      if (this.hFN != null)
        break label355;
      j = 0;
      label143: paramParcel.writeInt(j);
      if (this.hFN != null)
      {
        paramParcel.writeParcelable(this.hFN, paramInt);
        if (this.hFO != null)
          break label361;
        paramInt = 0;
        label174: paramParcel.writeInt(paramInt);
        if (this.hFO != null)
        {
          paramParcel.writeInt(this.hFO.length);
          paramParcel.writeByteArray(this.hFO);
          if (this.hFP != null)
            break label366;
          paramInt = 0;
          label212: paramParcel.writeInt(paramInt);
          if (this.hFP != null)
          {
            paramParcel.writeInt(this.hFP.length);
            paramParcel.writeByteArray(this.hFP);
          }
        }
      }
      paramParcel.writeInt(this.hFQ);
      if (this.hFR != null)
        break label371;
      paramInt = 0;
      label258: paramParcel.writeInt(paramInt);
      if (this.hFR != null)
      {
        paramParcel.writeInt(this.hFR.length);
        paramParcel.writeByteArray(this.hFR);
        if (this.hFS != null)
          break label376;
      }
    }
    label337: label343: label349: label355: label361: label366: label371: label376: for (paramInt = i; ; paramInt = 1)
    {
      paramParcel.writeInt(paramInt);
      if (this.hFS != null)
      {
        paramParcel.writeInt(this.hFS.length);
        paramParcel.writeByteArray(this.hFS);
      }
      AppMethodBeat.o(94314);
      return;
      j = 1;
      break;
      j = 1;
      break label48;
      j = 1;
      break label79;
      j = 1;
      break label111;
      j = 1;
      break label143;
      paramInt = 1;
      break label174;
      paramInt = 1;
      break label212;
      paramInt = 1;
      break label258;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat
 * JD-Core Version:    0.6.2
 */