package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.ICertData.Stub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator="GoogleCertificatesQueryCreator")
public class GoogleCertificatesQuery extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR;

  @SafeParcelable.Field(getter="getCallingPackage", id=1)
  private final String zzbh;

  @Nullable
  @SafeParcelable.Field(getter="getCallingCertificateBinder", id=2, type="android.os.IBinder")
  private final GoogleCertificates.CertData zzbi;

  @SafeParcelable.Field(getter="getAllowTestKeys", id=3)
  private final boolean zzbj;

  static
  {
    AppMethodBeat.i(89389);
    CREATOR = new GoogleCertificatesQueryCreator();
    AppMethodBeat.o(89389);
  }

  @SafeParcelable.Constructor
  GoogleCertificatesQuery(@SafeParcelable.Param(id=1) String paramString, @SafeParcelable.Param(id=2) @Nullable IBinder paramIBinder, @SafeParcelable.Param(id=3) boolean paramBoolean)
  {
    AppMethodBeat.i(89385);
    this.zzbh = paramString;
    this.zzbi = zza(paramIBinder);
    this.zzbj = paramBoolean;
    AppMethodBeat.o(89385);
  }

  GoogleCertificatesQuery(String paramString, @Nullable GoogleCertificates.CertData paramCertData, boolean paramBoolean)
  {
    this.zzbh = paramString;
    this.zzbi = paramCertData;
    this.zzbj = paramBoolean;
  }

  @Nullable
  private static GoogleCertificates.CertData zza(@Nullable IBinder paramIBinder)
  {
    Object localObject = null;
    AppMethodBeat.i(89388);
    if (paramIBinder == null)
    {
      AppMethodBeat.o(89388);
      paramIBinder = localObject;
      return paramIBinder;
    }
    while (true)
    {
      try
      {
        paramIBinder = ICertData.Stub.asInterface(paramIBinder).getBytesWrapped();
        if (paramIBinder != null)
          break label68;
        paramIBinder = null;
        if (paramIBinder == null)
          break label79;
        paramIBinder = new zzb(paramIBinder);
        AppMethodBeat.o(89388);
      }
      catch (RemoteException paramIBinder)
      {
        AppMethodBeat.o(89388);
        paramIBinder = localObject;
      }
      break;
      label68: paramIBinder = (byte[])ObjectWrapper.unwrap(paramIBinder);
      continue;
      label79: paramIBinder = null;
    }
  }

  public boolean getAllowTestKeys()
  {
    return this.zzbj;
  }

  @Nullable
  public IBinder getCallingCertificateBinder()
  {
    AppMethodBeat.i(89386);
    IBinder localIBinder;
    if (this.zzbi == null)
    {
      localIBinder = null;
      AppMethodBeat.o(89386);
    }
    while (true)
    {
      return localIBinder;
      localIBinder = this.zzbi.asBinder();
      AppMethodBeat.o(89386);
    }
  }

  public String getCallingPackage()
  {
    return this.zzbh;
  }

  @Nullable
  public GoogleCertificates.CertData getCertificate()
  {
    return this.zzbi;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(89387);
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, getCallingPackage(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 2, getCallingCertificateBinder(), false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, getAllowTestKeys());
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
    AppMethodBeat.o(89387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GoogleCertificatesQuery
 * JD-Core Version:    0.6.2
 */