package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.tencent.matrix.trace.core.AppMethodBeat;

@SafeParcelable.Class(creator="ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable
{
  public static final int API_UNAVAILABLE = 16;
  public static final int API_VERSION_UPDATE_REQUIRED = 21;
  public static final int CANCELED = 13;
  public static final Parcelable.Creator<ConnectionResult> CREATOR;
  public static final int DEVELOPER_ERROR = 10;

  @Deprecated
  public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
  public static final int INTERNAL_ERROR = 8;
  public static final int INTERRUPTED = 15;
  public static final int INVALID_ACCOUNT = 5;
  public static final int LICENSE_CHECK_FAILED = 11;
  public static final int NETWORK_ERROR = 7;
  public static final int RESOLUTION_REQUIRED = 6;
  public static final int RESTRICTED_PROFILE = 20;
  public static final ConnectionResult RESULT_SUCCESS;
  public static final int SERVICE_DISABLED = 3;
  public static final int SERVICE_INVALID = 9;
  public static final int SERVICE_MISSING = 1;
  public static final int SERVICE_MISSING_PERMISSION = 19;
  public static final int SERVICE_UPDATING = 18;
  public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
  public static final int SIGN_IN_FAILED = 17;
  public static final int SIGN_IN_REQUIRED = 4;
  public static final int SUCCESS = 0;
  public static final int TIMEOUT = 14;
  public static final int UNFINISHED = 99;
  public static final int UNKNOWN = -1;

  @SafeParcelable.VersionField(id=1)
  private final int zzal;

  @SafeParcelable.Field(getter="getErrorCode", id=2)
  private final int zzam;

  @SafeParcelable.Field(getter="getResolution", id=3)
  private final PendingIntent zzan;

  @SafeParcelable.Field(getter="getErrorMessage", id=4)
  private final String zzao;

  static
  {
    AppMethodBeat.i(89348);
    RESULT_SUCCESS = new ConnectionResult(0);
    CREATOR = new ConnectionResultCreator();
    AppMethodBeat.o(89348);
  }

  public ConnectionResult(int paramInt)
  {
    this(paramInt, null, null);
  }

  @SafeParcelable.Constructor
  ConnectionResult(@SafeParcelable.Param(id=1) int paramInt1, @SafeParcelable.Param(id=2) int paramInt2, @SafeParcelable.Param(id=3) PendingIntent paramPendingIntent, @SafeParcelable.Param(id=4) String paramString)
  {
    this.zzal = paramInt1;
    this.zzam = paramInt2;
    this.zzan = paramPendingIntent;
    this.zzao = paramString;
  }

  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, null);
  }

  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent, String paramString)
  {
    this(1, paramInt, paramPendingIntent, paramString);
  }

  static String zza(int paramInt)
  {
    AppMethodBeat.i(89343);
    String str;
    switch (paramInt)
    {
    default:
      str = 31 + "UNKNOWN_ERROR_CODE(" + paramInt + ")";
      AppMethodBeat.o(89343);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 1500:
    case 99:
    case -1:
    }
    while (true)
    {
      return str;
      str = "SUCCESS";
      AppMethodBeat.o(89343);
      continue;
      str = "SERVICE_MISSING";
      AppMethodBeat.o(89343);
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      AppMethodBeat.o(89343);
      continue;
      str = "SERVICE_DISABLED";
      AppMethodBeat.o(89343);
      continue;
      str = "SIGN_IN_REQUIRED";
      AppMethodBeat.o(89343);
      continue;
      str = "INVALID_ACCOUNT";
      AppMethodBeat.o(89343);
      continue;
      str = "RESOLUTION_REQUIRED";
      AppMethodBeat.o(89343);
      continue;
      str = "NETWORK_ERROR";
      AppMethodBeat.o(89343);
      continue;
      str = "INTERNAL_ERROR";
      AppMethodBeat.o(89343);
      continue;
      str = "SERVICE_INVALID";
      AppMethodBeat.o(89343);
      continue;
      str = "DEVELOPER_ERROR";
      AppMethodBeat.o(89343);
      continue;
      str = "LICENSE_CHECK_FAILED";
      AppMethodBeat.o(89343);
      continue;
      str = "CANCELED";
      AppMethodBeat.o(89343);
      continue;
      str = "TIMEOUT";
      AppMethodBeat.o(89343);
      continue;
      str = "INTERRUPTED";
      AppMethodBeat.o(89343);
      continue;
      str = "API_UNAVAILABLE";
      AppMethodBeat.o(89343);
      continue;
      str = "SIGN_IN_FAILED";
      AppMethodBeat.o(89343);
      continue;
      str = "SERVICE_UPDATING";
      AppMethodBeat.o(89343);
      continue;
      str = "SERVICE_MISSING_PERMISSION";
      AppMethodBeat.o(89343);
      continue;
      str = "RESTRICTED_PROFILE";
      AppMethodBeat.o(89343);
      continue;
      str = "API_VERSION_UPDATE_REQUIRED";
      AppMethodBeat.o(89343);
      continue;
      str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
      AppMethodBeat.o(89343);
      continue;
      str = "UNFINISHED";
      AppMethodBeat.o(89343);
      continue;
      str = "UNKNOWN";
      AppMethodBeat.o(89343);
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(89344);
    if (paramObject == this)
      AppMethodBeat.o(89344);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof ConnectionResult))
      {
        AppMethodBeat.o(89344);
        bool = false;
      }
      else
      {
        paramObject = (ConnectionResult)paramObject;
        if ((this.zzam == paramObject.zzam) && (Objects.equal(this.zzan, paramObject.zzan)) && (Objects.equal(this.zzao, paramObject.zzao)))
        {
          AppMethodBeat.o(89344);
        }
        else
        {
          AppMethodBeat.o(89344);
          bool = false;
        }
      }
    }
  }

  public final int getErrorCode()
  {
    return this.zzam;
  }

  public final String getErrorMessage()
  {
    return this.zzao;
  }

  public final PendingIntent getResolution()
  {
    return this.zzan;
  }

  public final boolean hasResolution()
  {
    if ((this.zzam != 0) && (this.zzan != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(89345);
    int i = Objects.hashCode(new Object[] { Integer.valueOf(this.zzam), this.zzan, this.zzao });
    AppMethodBeat.o(89345);
    return i;
  }

  public final boolean isSuccess()
  {
    if (this.zzam == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void startResolutionForResult(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(89342);
    if (!hasResolution())
      AppMethodBeat.o(89342);
    while (true)
    {
      return;
      paramActivity.startIntentSenderForResult(this.zzan.getIntentSender(), paramInt, null, 0, 0, 0);
      AppMethodBeat.o(89342);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(89346);
    String str = Objects.toStringHelper(this).add("statusCode", zza(this.zzam)).add("resolution", this.zzan).add("message", this.zzao).toString();
    AppMethodBeat.o(89346);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89347);
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zzal);
    SafeParcelWriter.writeInt(paramParcel, 2, getErrorCode());
    SafeParcelWriter.writeParcelable(paramParcel, 3, getResolution(), paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 4, getErrorMessage(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
    AppMethodBeat.o(89347);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.ConnectionResult
 * JD-Core Version:    0.6.2
 */