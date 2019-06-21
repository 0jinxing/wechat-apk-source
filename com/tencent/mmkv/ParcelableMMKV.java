package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class ParcelableMMKV
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableMMKV> CREATOR;
  String AiR;
  int AiS;
  int AiT;
  String AiU;

  static
  {
    AppMethodBeat.i(124055);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(124055);
  }

  public ParcelableMMKV(MMKV paramMMKV)
  {
    AppMethodBeat.i(124053);
    this.AiS = -1;
    this.AiT = -1;
    this.AiU = null;
    this.AiR = paramMMKV.mmapID();
    this.AiS = paramMMKV.ashmemFD();
    this.AiT = paramMMKV.ashmemMetaFD();
    this.AiU = paramMMKV.cryptKey();
    AppMethodBeat.o(124053);
  }

  private ParcelableMMKV(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this.AiS = -1;
    this.AiT = -1;
    this.AiU = null;
    this.AiR = paramString1;
    this.AiS = paramInt1;
    this.AiT = paramInt2;
    this.AiU = paramString2;
  }

  public final int describeContents()
  {
    return 1;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(124054);
    try
    {
      paramParcel.writeString(this.AiR);
      ParcelFileDescriptor localParcelFileDescriptor1 = ParcelFileDescriptor.fromFd(this.AiS);
      ParcelFileDescriptor localParcelFileDescriptor2 = ParcelFileDescriptor.fromFd(this.AiT);
      paramInt |= 1;
      localParcelFileDescriptor1.writeToParcel(paramParcel, paramInt);
      localParcelFileDescriptor2.writeToParcel(paramParcel, paramInt);
      if (this.AiU != null)
        paramParcel.writeString(this.AiU);
      AppMethodBeat.o(124054);
      return;
    }
    catch (IOException paramParcel)
    {
      while (true)
        AppMethodBeat.o(124054);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mmkv.ParcelableMMKV
 * JD-Core Version:    0.6.2
 */