package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class EventMessage
  implements Metadata.Entry
{
  public static final Parcelable.Creator<EventMessage> CREATOR;
  private int aBR;
  public final String bfh;
  public final long bfi;
  public final byte[] bfj;
  public final long id;
  public final String value;

  static
  {
    AppMethodBeat.i(95272);
    CREATOR = new EventMessage.1();
    AppMethodBeat.o(95272);
  }

  EventMessage(Parcel paramParcel)
  {
    AppMethodBeat.i(95268);
    this.bfh = paramParcel.readString();
    this.value = paramParcel.readString();
    this.bfi = paramParcel.readLong();
    this.id = paramParcel.readLong();
    this.bfj = paramParcel.createByteArray();
    AppMethodBeat.o(95268);
  }

  public EventMessage(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    this.bfh = paramString1;
    this.value = paramString2;
    this.bfi = paramLong1;
    this.id = paramLong2;
    this.bfj = paramArrayOfByte;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95270);
    if (this == paramObject)
      AppMethodBeat.o(95270);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95270);
        bool = false;
      }
      else
      {
        paramObject = (EventMessage)paramObject;
        if ((this.bfi == paramObject.bfi) && (this.id == paramObject.id) && (v.j(this.bfh, paramObject.bfh)) && (v.j(this.value, paramObject.value)) && (Arrays.equals(this.bfj, paramObject.bfj)))
        {
          AppMethodBeat.o(95270);
        }
        else
        {
          AppMethodBeat.o(95270);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(95269);
    if (this.aBR == 0)
      if (this.bfh == null)
        break label115;
    label115: for (int j = this.bfh.hashCode(); ; j = 0)
    {
      if (this.value != null)
        i = this.value.hashCode();
      this.aBR = (((((j + 527) * 31 + i) * 31 + (int)(this.bfi ^ this.bfi >>> 32)) * 31 + (int)(this.id ^ this.id >>> 32)) * 31 + Arrays.hashCode(this.bfj));
      j = this.aBR;
      AppMethodBeat.o(95269);
      return j;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95271);
    paramParcel.writeString(this.bfh);
    paramParcel.writeString(this.value);
    paramParcel.writeLong(this.bfi);
    paramParcel.writeLong(this.id);
    paramParcel.writeByteArray(this.bfj);
    AppMethodBeat.o(95271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.emsg.EventMessage
 * JD-Core Version:    0.6.2
 */