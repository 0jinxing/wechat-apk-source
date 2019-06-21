package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@SafeParcelable.Class(creator="ChannelEventParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzaw extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaw> CREATOR;

  @SafeParcelable.Field(id=3)
  private final int type;

  @SafeParcelable.Field(id=5)
  private final int zzcj;

  @SafeParcelable.Field(id=2)
  private final zzay zzck;

  @SafeParcelable.Field(id=4)
  private final int zzg;

  static
  {
    AppMethodBeat.i(71041);
    CREATOR = new zzax();
    AppMethodBeat.o(71041);
  }

  @SafeParcelable.Constructor
  public zzaw(@SafeParcelable.Param(id=2) zzay paramzzay, @SafeParcelable.Param(id=3) int paramInt1, @SafeParcelable.Param(id=4) int paramInt2, @SafeParcelable.Param(id=5) int paramInt3)
  {
    this.zzck = paramzzay;
    this.type = paramInt1;
    this.zzg = paramInt2;
    this.zzcj = paramInt3;
  }

  public final String toString()
  {
    AppMethodBeat.i(71040);
    String str1 = String.valueOf(this.zzck);
    int i = this.type;
    String str2;
    String str3;
    switch (i)
    {
    default:
      str2 = Integer.toString(i);
      i = this.zzg;
      switch (i)
      {
      default:
        str3 = Integer.toString(i);
      case 1:
      case 2:
      case 3:
      case 0:
      }
      break;
    case 1:
    case 2:
    case 4:
    case 3:
    }
    while (true)
    {
      i = this.zzcj;
      str2 = String.valueOf(str1).length() + 81 + String.valueOf(str2).length() + String.valueOf(str3).length() + "ChannelEventParcelable[, channel=" + str1 + ", type=" + str2 + ", closeReason=" + str3 + ", appErrorCode=" + i + "]";
      AppMethodBeat.o(71040);
      return str2;
      str2 = "CHANNEL_OPENED";
      break;
      str2 = "CHANNEL_CLOSED";
      break;
      str2 = "OUTPUT_CLOSED";
      break;
      str2 = "INPUT_CLOSED";
      break;
      str3 = "CLOSE_REASON_DISCONNECTED";
      continue;
      str3 = "CLOSE_REASON_REMOTE_CLOSE";
      continue;
      str3 = "CLOSE_REASON_LOCAL_CLOSE";
      continue;
      str3 = "CLOSE_REASON_NORMAL";
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(71039);
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzck, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.type);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzg);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zzcj);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
    AppMethodBeat.o(71039);
  }

  public final void zza(ChannelApi.ChannelListener paramChannelListener)
  {
    AppMethodBeat.i(71038);
    switch (this.type)
    {
    default:
      int i = this.type;
      new StringBuilder(25).append("Unknown type: ").append(i);
      AppMethodBeat.o(71038);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      paramChannelListener.onChannelOpened(this.zzck);
      AppMethodBeat.o(71038);
      continue;
      paramChannelListener.onChannelClosed(this.zzck, this.zzg, this.zzcj);
      AppMethodBeat.o(71038);
      continue;
      paramChannelListener.onInputClosed(this.zzck, this.zzg, this.zzcj);
      AppMethodBeat.o(71038);
      continue;
      paramChannelListener.onOutputClosed(this.zzck, this.zzg, this.zzcj);
      AppMethodBeat.o(71038);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzaw
 * JD-Core Version:    0.6.2
 */