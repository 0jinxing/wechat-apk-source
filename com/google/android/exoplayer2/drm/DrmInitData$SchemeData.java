package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.UUID;

public final class DrmInitData$SchemeData
  implements Parcelable
{
  public static final Parcelable.Creator<SchemeData> CREATOR;
  private int aBR;
  public final boolean aSy;
  public final byte[] data;
  public final String mimeType;
  public final String type;
  final UUID uuid;

  static
  {
    AppMethodBeat.i(94761);
    CREATOR = new DrmInitData.SchemeData.1();
    AppMethodBeat.o(94761);
  }

  DrmInitData$SchemeData(Parcel paramParcel)
  {
    AppMethodBeat.i(94757);
    this.uuid = new UUID(paramParcel.readLong(), paramParcel.readLong());
    this.type = paramParcel.readString();
    this.mimeType = paramParcel.readString();
    this.data = paramParcel.createByteArray();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.aSy = bool;
      AppMethodBeat.o(94757);
      return;
    }
  }

  public DrmInitData$SchemeData(UUID paramUUID, String paramString1, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(94756);
    this.uuid = ((UUID)a.checkNotNull(paramUUID));
    this.type = paramString1;
    this.mimeType = ((String)a.checkNotNull(paramString2));
    this.data = ((byte[])a.checkNotNull(paramArrayOfByte));
    this.aSy = paramBoolean;
    AppMethodBeat.o(94756);
  }

  public DrmInitData$SchemeData(UUID paramUUID, String paramString, byte[] paramArrayOfByte)
  {
    this(paramUUID, null, paramString, paramArrayOfByte, false);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(94758);
    if (!(paramObject instanceof SchemeData))
      AppMethodBeat.o(94758);
    while (true)
    {
      return bool;
      if (paramObject == this)
      {
        AppMethodBeat.o(94758);
        bool = true;
      }
      else
      {
        paramObject = (SchemeData)paramObject;
        if ((this.mimeType.equals(paramObject.mimeType)) && (v.j(this.uuid, paramObject.uuid)) && (v.j(this.type, paramObject.type)) && (Arrays.equals(this.data, paramObject.data)))
        {
          AppMethodBeat.o(94758);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(94758);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(94759);
    int i;
    if (this.aBR == 0)
    {
      i = this.uuid.hashCode();
      if (this.type != null)
        break label73;
    }
    label73: for (int j = 0; ; j = this.type.hashCode())
    {
      this.aBR = (((j + i * 31) * 31 + this.mimeType.hashCode()) * 31 + Arrays.hashCode(this.data));
      j = this.aBR;
      AppMethodBeat.o(94759);
      return j;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(94760);
    paramParcel.writeLong(this.uuid.getMostSignificantBits());
    paramParcel.writeLong(this.uuid.getLeastSignificantBits());
    paramParcel.writeString(this.type);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeByteArray(this.data);
    if (this.aSy);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(94760);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.drm.DrmInitData.SchemeData
 * JD-Core Version:    0.6.2
 */