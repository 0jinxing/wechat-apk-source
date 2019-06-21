package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class ColorInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ColorInfo> CREATOR;
  private int aBR;
  public final int aUU;
  public final int aUV;
  public final int aUW;
  public final byte[] brS;

  static
  {
    AppMethodBeat.i(95987);
    CREATOR = new ColorInfo.1();
    AppMethodBeat.o(95987);
  }

  public ColorInfo(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.aUU = paramInt1;
    this.aUW = paramInt2;
    this.aUV = paramInt3;
    this.brS = paramArrayOfByte;
  }

  ColorInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(95982);
    this.aUU = paramParcel.readInt();
    this.aUW = paramParcel.readInt();
    this.aUV = paramParcel.readInt();
    int i;
    if (paramParcel.readInt() != 0)
    {
      i = 1;
      if (i == 0)
        break label67;
    }
    label67: for (paramParcel = paramParcel.createByteArray(); ; paramParcel = null)
    {
      this.brS = paramParcel;
      AppMethodBeat.o(95982);
      return;
      i = 0;
      break;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95983);
    if (this == paramObject)
      AppMethodBeat.o(95983);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95983);
        bool = false;
      }
      else
      {
        paramObject = (ColorInfo)paramObject;
        if ((this.aUU != paramObject.aUU) || (this.aUW != paramObject.aUW) || (this.aUV != paramObject.aUV) || (!Arrays.equals(this.brS, paramObject.brS)))
        {
          AppMethodBeat.o(95983);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(95983);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95985);
    if (this.aBR == 0)
      this.aBR = ((((this.aUU + 527) * 31 + this.aUW) * 31 + this.aUV) * 31 + Arrays.hashCode(this.brS));
    int i = this.aBR;
    AppMethodBeat.o(95985);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(95984);
    Object localObject = new StringBuilder("ColorInfo(").append(this.aUU).append(", ").append(this.aUW).append(", ").append(this.aUV).append(", ");
    if (this.brS != null);
    for (boolean bool = true; ; bool = false)
    {
      localObject = bool + ")";
      AppMethodBeat.o(95984);
      return localObject;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95986);
    paramParcel.writeInt(this.aUU);
    paramParcel.writeInt(this.aUW);
    paramParcel.writeInt(this.aUV);
    if (this.brS != null);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      if (this.brS != null)
        paramParcel.writeByteArray(this.brS);
      AppMethodBeat.o(95986);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.video.ColorInfo
 * JD-Core Version:    0.6.2
 */