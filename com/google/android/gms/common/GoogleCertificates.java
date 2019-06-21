package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.ICertData.Stub;
import com.google.android.gms.common.internal.IGoogleCertificatesApi;
import com.google.android.gms.common.internal.IGoogleCertificatesApi.Stub;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.concurrent.GuardedBy;

@CheckReturnValue
final class GoogleCertificates
{
  private static volatile IGoogleCertificatesApi zzax;
  private static final Object zzay;
  private static Context zzaz;

  @GuardedBy("GoogleCertificates.class")
  private static Set<ICertData> zzba;

  @GuardedBy("GoogleCertificates.class")
  private static Set<ICertData> zzbb;

  static
  {
    AppMethodBeat.i(89384);
    zzay = new Object();
    AppMethodBeat.o(89384);
  }

  static void init(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(89378);
      if ((zzaz == null) && (paramContext != null))
      {
        zzaz = paramContext.getApplicationContext();
        AppMethodBeat.o(89378);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(89378);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  static zzg zza(String paramString, CertData paramCertData, boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(89383);
    try
    {
      zzc();
      Preconditions.checkNotNull(zzaz);
      localGoogleCertificatesQuery = new GoogleCertificatesQuery(paramString, paramCertData, paramBoolean);
    }
    catch (DynamiteModule.LoadingException paramString)
    {
      try
      {
        GoogleCertificatesQuery localGoogleCertificatesQuery;
        boolean bool2 = zzax.isGoogleOrPlatformSigned(localGoogleCertificatesQuery, ObjectWrapper.wrap(zzaz.getPackageManager()));
        if (bool2)
        {
          paramString = zzg.zzg();
          AppMethodBeat.o(89383);
          while (true)
          {
            return paramString;
            paramString = paramString;
            paramString = zzg.zza("module init", paramString);
            AppMethodBeat.o(89383);
          }
        }
      }
      catch (RemoteException paramString)
      {
        while (true)
        {
          paramString = zzg.zza("module call", paramString);
          AppMethodBeat.o(89383);
        }
        if (paramBoolean)
          break label130;
      }
    }
    if (zza(paramString, paramCertData, true).zzbl);
    while (true)
    {
      paramString = zzg.zza(paramString, paramCertData, paramBoolean, bool1);
      AppMethodBeat.o(89383);
      break;
      label130: bool1 = false;
    }
  }

  private static Set<ICertData> zza(IBinder[] paramArrayOfIBinder)
  {
    AppMethodBeat.i(89380);
    int i = paramArrayOfIBinder.length;
    HashSet localHashSet = new HashSet(i);
    for (int j = 0; j < i; j++)
    {
      ICertData localICertData = ICertData.Stub.asInterface(paramArrayOfIBinder[j]);
      if (localICertData != null)
        localHashSet.add(localICertData);
    }
    AppMethodBeat.o(89380);
    return localHashSet;
  }

  private static void zzc()
  {
    AppMethodBeat.i(89379);
    if (zzax != null)
      AppMethodBeat.o(89379);
    while (true)
    {
      return;
      Preconditions.checkNotNull(zzaz);
      synchronized (zzay)
      {
        if (zzax == null)
          zzax = IGoogleCertificatesApi.Stub.asInterface(DynamiteModule.load(zzaz, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
        AppMethodBeat.o(89379);
      }
    }
  }

  // ERROR //
  static Set<ICertData> zzd()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 158
    //   5: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 160	com/google/android/gms/common/GoogleCertificates:zzba	Ljava/util/Set;
    //   11: ifnull +17 -> 28
    //   14: getstatic 160	com/google/android/gms/common/GoogleCertificates:zzba	Ljava/util/Set;
    //   17: astore_0
    //   18: ldc 158
    //   20: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: ldc 2
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: invokestatic 60	com/google/android/gms/common/GoogleCertificates:zzc	()V
    //   31: getstatic 73	com/google/android/gms/common/GoogleCertificates:zzax	Lcom/google/android/gms/common/internal/IGoogleCertificatesApi;
    //   34: invokeinterface 164 1 0
    //   39: astore_0
    //   40: aload_0
    //   41: ifnonnull +34 -> 75
    //   44: invokestatic 169	java/util/Collections:emptySet	()Ljava/util/Set;
    //   47: astore_0
    //   48: ldc 158
    //   50: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: goto -30 -> 23
    //   56: astore_0
    //   57: ldc 2
    //   59: monitorexit
    //   60: aload_0
    //   61: athrow
    //   62: astore_0
    //   63: invokestatic 169	java/util/Collections:emptySet	()Ljava/util/Set;
    //   66: astore_0
    //   67: ldc 158
    //   69: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: goto -49 -> 23
    //   75: aload_0
    //   76: invokestatic 173	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   79: checkcast 175	[Landroid/os/IBinder;
    //   82: invokestatic 177	com/google/android/gms/common/GoogleCertificates:zza	([Landroid/os/IBinder;)Ljava/util/Set;
    //   85: putstatic 160	com/google/android/gms/common/GoogleCertificates:zzba	Ljava/util/Set;
    //   88: getstatic 160	com/google/android/gms/common/GoogleCertificates:zzba	Ljava/util/Set;
    //   91: astore_0
    //   92: ldc 158
    //   94: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: goto -74 -> 23
    //   100: astore_0
    //   101: invokestatic 169	java/util/Collections:emptySet	()Ljava/util/Set;
    //   104: astore_0
    //   105: ldc 158
    //   107: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: goto -87 -> 23
    //
    // Exception table:
    //   from	to	target	type
    //   3	23	56	finally
    //   28	31	56	finally
    //   31	40	56	finally
    //   44	48	56	finally
    //   48	53	56	finally
    //   63	72	56	finally
    //   75	88	56	finally
    //   88	97	56	finally
    //   101	110	56	finally
    //   28	31	62	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   31	40	100	android/os/RemoteException
    //   44	48	100	android/os/RemoteException
    //   75	88	100	android/os/RemoteException
  }

  // ERROR //
  static Set<ICertData> zze()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 180
    //   5: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 182	com/google/android/gms/common/GoogleCertificates:zzbb	Ljava/util/Set;
    //   11: ifnull +17 -> 28
    //   14: getstatic 182	com/google/android/gms/common/GoogleCertificates:zzbb	Ljava/util/Set;
    //   17: astore_0
    //   18: ldc 180
    //   20: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: ldc 2
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: invokestatic 60	com/google/android/gms/common/GoogleCertificates:zzc	()V
    //   31: getstatic 73	com/google/android/gms/common/GoogleCertificates:zzax	Lcom/google/android/gms/common/internal/IGoogleCertificatesApi;
    //   34: invokeinterface 185 1 0
    //   39: astore_0
    //   40: aload_0
    //   41: ifnonnull +34 -> 75
    //   44: invokestatic 169	java/util/Collections:emptySet	()Ljava/util/Set;
    //   47: astore_0
    //   48: ldc 180
    //   50: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: goto -30 -> 23
    //   56: astore_0
    //   57: ldc 2
    //   59: monitorexit
    //   60: aload_0
    //   61: athrow
    //   62: astore_0
    //   63: invokestatic 169	java/util/Collections:emptySet	()Ljava/util/Set;
    //   66: astore_0
    //   67: ldc 180
    //   69: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: goto -49 -> 23
    //   75: aload_0
    //   76: invokestatic 173	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   79: checkcast 175	[Landroid/os/IBinder;
    //   82: invokestatic 177	com/google/android/gms/common/GoogleCertificates:zza	([Landroid/os/IBinder;)Ljava/util/Set;
    //   85: putstatic 182	com/google/android/gms/common/GoogleCertificates:zzbb	Ljava/util/Set;
    //   88: getstatic 182	com/google/android/gms/common/GoogleCertificates:zzbb	Ljava/util/Set;
    //   91: astore_0
    //   92: ldc 180
    //   94: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: goto -74 -> 23
    //   100: astore_0
    //   101: invokestatic 169	java/util/Collections:emptySet	()Ljava/util/Set;
    //   104: astore_0
    //   105: ldc 180
    //   107: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: goto -87 -> 23
    //
    // Exception table:
    //   from	to	target	type
    //   3	23	56	finally
    //   28	31	56	finally
    //   31	40	56	finally
    //   44	48	56	finally
    //   48	53	56	finally
    //   63	72	56	finally
    //   75	88	56	finally
    //   88	97	56	finally
    //   101	110	56	finally
    //   28	31	62	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   31	40	100	android/os/RemoteException
    //   44	48	100	android/os/RemoteException
    //   75	88	100	android/os/RemoteException
  }

  static abstract class CertData extends ICertData.Stub
  {
    private int zzbc;

    protected CertData(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte.length == 25);
      for (boolean bool = true; ; bool = false)
      {
        Preconditions.checkArgument(bool);
        this.zzbc = Arrays.hashCode(paramArrayOfByte);
        return;
      }
    }

    protected static byte[] zzd(String paramString)
    {
      try
      {
        paramString = paramString.getBytes("ISO-8859-1");
        return paramString;
      }
      catch (UnsupportedEncodingException paramString)
      {
      }
      throw new AssertionError(paramString);
    }

    public boolean equals(Object paramObject)
    {
      boolean bool;
      if ((paramObject == null) || (!(paramObject instanceof ICertData)))
        bool = false;
      while (true)
      {
        return bool;
        try
        {
          paramObject = (ICertData)paramObject;
          if (paramObject.getHashCode() != hashCode())
          {
            bool = false;
          }
          else
          {
            paramObject = paramObject.getBytesWrapped();
            if (paramObject == null)
            {
              bool = false;
            }
            else
            {
              paramObject = (byte[])ObjectWrapper.unwrap(paramObject);
              bool = Arrays.equals(getBytes(), paramObject);
            }
          }
        }
        catch (RemoteException paramObject)
        {
          bool = false;
        }
      }
    }

    abstract byte[] getBytes();

    public IObjectWrapper getBytesWrapped()
    {
      return ObjectWrapper.wrap(getBytes());
    }

    public int getHashCode()
    {
      return hashCode();
    }

    public int hashCode()
    {
      return this.zzbc;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GoogleCertificates
 * JD-Core Version:    0.6.2
 */