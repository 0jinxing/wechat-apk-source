package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ISignInButtonCreator$Stub$Proxy extends zza
  implements ISignInButtonCreator
{
  ISignInButtonCreator$Stub$Proxy(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
  }

  public IObjectWrapper newSignInButton(IObjectWrapper paramIObjectWrapper, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61352);
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramIObjectWrapper);
    localParcel.writeInt(paramInt1);
    localParcel.writeInt(paramInt2);
    localParcel = transactAndReadException(1, localParcel);
    paramIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    AppMethodBeat.o(61352);
    return paramIObjectWrapper;
  }

  public IObjectWrapper newSignInButtonFromConfig(IObjectWrapper paramIObjectWrapper, SignInButtonConfig paramSignInButtonConfig)
  {
    AppMethodBeat.i(61353);
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramIObjectWrapper);
    zzc.zza(localParcel, paramSignInButtonConfig);
    paramSignInButtonConfig = transactAndReadException(2, localParcel);
    paramIObjectWrapper = IObjectWrapper.Stub.asInterface(paramSignInButtonConfig.readStrongBinder());
    paramSignInButtonConfig.recycle();
    AppMethodBeat.o(61353);
    return paramIObjectWrapper;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ISignInButtonCreator.Stub.Proxy
 * JD-Core Version:    0.6.2
 */