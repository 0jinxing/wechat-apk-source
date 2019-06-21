package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public class GoogleSignatureVerifier
{
  private static GoogleSignatureVerifier zzbv;
  private final Context mContext;

  private GoogleSignatureVerifier(Context paramContext)
  {
    AppMethodBeat.i(89419);
    this.mContext = paramContext.getApplicationContext();
    AppMethodBeat.o(89419);
  }

  public static GoogleSignatureVerifier getInstance(Context paramContext)
  {
    AppMethodBeat.i(89420);
    Preconditions.checkNotNull(paramContext);
    try
    {
      if (zzbv == null)
      {
        GoogleCertificates.init(paramContext);
        GoogleSignatureVerifier localGoogleSignatureVerifier = new com/google/android/gms/common/GoogleSignatureVerifier;
        localGoogleSignatureVerifier.<init>(paramContext);
        zzbv = localGoogleSignatureVerifier;
      }
      paramContext = zzbv;
      AppMethodBeat.o(89420);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(89420);
    }
    throw paramContext;
  }

  @VisibleForTesting
  public static void resetForTests()
  {
    try
    {
      zzbv = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static GoogleCertificates.CertData zza(PackageInfo paramPackageInfo, GoogleCertificates.CertData[] paramArrayOfCertData)
  {
    int i = 0;
    AppMethodBeat.i(89439);
    if (paramPackageInfo.signatures == null)
    {
      AppMethodBeat.o(89439);
      paramPackageInfo = null;
    }
    while (true)
    {
      return paramPackageInfo;
      if (paramPackageInfo.signatures.length != 1)
      {
        AppMethodBeat.o(89439);
        paramPackageInfo = null;
      }
      else
      {
        paramPackageInfo = new zzb(paramPackageInfo.signatures[0].toByteArray());
        while (true)
        {
          if (i >= paramArrayOfCertData.length)
            break label93;
          if (paramArrayOfCertData[i].equals(paramPackageInfo))
          {
            paramPackageInfo = paramArrayOfCertData[i];
            AppMethodBeat.o(89439);
            break;
          }
          i++;
        }
        label93: AppMethodBeat.o(89439);
        paramPackageInfo = null;
      }
    }
  }

  private final zzg zza(PackageInfo paramPackageInfo)
  {
    AppMethodBeat.i(89438);
    boolean bool = GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext);
    if (paramPackageInfo == null)
    {
      paramPackageInfo = zzg.zze("null pkg");
      AppMethodBeat.o(89438);
    }
    while (true)
    {
      return paramPackageInfo;
      if (paramPackageInfo.signatures.length != 1)
      {
        paramPackageInfo = zzg.zze("single cert required");
        AppMethodBeat.o(89438);
      }
      else
      {
        zzb localzzb = new zzb(paramPackageInfo.signatures[0].toByteArray());
        String str = paramPackageInfo.packageName;
        zzg localzzg = GoogleCertificates.zza(str, localzzb, bool);
        if ((localzzg.zzbl) && (paramPackageInfo.applicationInfo != null) && ((paramPackageInfo.applicationInfo.flags & 0x2) != 0) && ((!bool) || (GoogleCertificates.zza(str, localzzb, false).zzbl)))
        {
          paramPackageInfo = zzg.zze("debuggable release cert app rejected");
          AppMethodBeat.o(89438);
        }
        else
        {
          AppMethodBeat.o(89438);
          paramPackageInfo = localzzg;
        }
      }
    }
  }

  private final zzg zzb(int paramInt)
  {
    AppMethodBeat.i(89436);
    String[] arrayOfString = Wrappers.packageManager(this.mContext).getPackagesForUid(paramInt);
    zzg localzzg;
    if ((arrayOfString == null) || (arrayOfString.length == 0))
    {
      localzzg = zzg.zze("no pkgs");
      AppMethodBeat.o(89436);
    }
    while (true)
    {
      return localzzg;
      localzzg = null;
      int i = arrayOfString.length;
      for (paramInt = 0; ; paramInt++)
      {
        if (paramInt >= i)
          break label82;
        localzzg = zzf(arrayOfString[paramInt]);
        if (localzzg.zzbl)
        {
          AppMethodBeat.o(89436);
          break;
        }
      }
      label82: AppMethodBeat.o(89436);
    }
  }

  private final zzg zzf(String paramString)
  {
    AppMethodBeat.i(89437);
    try
    {
      PackageInfo localPackageInfo = Wrappers.packageManager(this.mContext).getPackageInfo(paramString, 64);
      paramString = zza(localPackageInfo);
      AppMethodBeat.o(89437);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() == 0);
    }
    for (paramString = "no pkg ".concat(paramString); ; paramString = new String("no pkg "))
    {
      paramString = zzg.zze(paramString);
      AppMethodBeat.o(89437);
      break;
    }
  }

  @Deprecated
  public Set<byte[]> getAllGoogleSignatures(boolean paramBoolean)
  {
    AppMethodBeat.i(89431);
    if (paramBoolean);
    Set localSet;
    for (Object localObject = GoogleCertificates.zzd(); ; localSet = GoogleCertificates.zze())
    {
      HashSet localHashSet = new HashSet(((Set)localObject).size());
      try
      {
        localObject = ((Set)localObject).iterator();
        while (((Iterator)localObject).hasNext())
          localHashSet.add((byte[])ObjectWrapper.unwrap(((ICertData)((Iterator)localObject).next()).getBytesWrapped()));
      }
      catch (RemoteException localRemoteException)
      {
        AppMethodBeat.o(89431);
        return localHashSet;
      }
    }
  }

  public boolean isChimeraSigned(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    AppMethodBeat.i(89435);
    paramPackageManager = paramPackageInfo.packageName;
    paramPackageInfo.packageName = "com.google.android.gms.chimera";
    boolean bool = isPackageGoogleSigned(paramPackageInfo);
    paramPackageInfo.packageName = paramPackageManager;
    AppMethodBeat.o(89435);
    return bool;
  }

  public boolean isGooglePublicSignedPackage(PackageInfo paramPackageInfo)
  {
    boolean bool = false;
    AppMethodBeat.i(89434);
    if (paramPackageInfo == null)
      AppMethodBeat.o(89434);
    while (true)
    {
      return bool;
      if (isGooglePublicSignedPackage(paramPackageInfo, false))
      {
        AppMethodBeat.o(89434);
        bool = true;
      }
      else if ((isGooglePublicSignedPackage(paramPackageInfo, true)) && (GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext)))
      {
        AppMethodBeat.o(89434);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(89434);
      }
    }
  }

  public boolean isGooglePublicSignedPackage(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(89432);
    if ((paramPackageInfo != null) && (paramPackageInfo.signatures != null))
      if (paramBoolean)
      {
        paramPackageInfo = zza(paramPackageInfo, zzd.zzbg);
        if (paramPackageInfo == null)
          break label63;
        AppMethodBeat.o(89432);
      }
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      return paramBoolean;
      paramPackageInfo = zza(paramPackageInfo, new GoogleCertificates.CertData[] { zzd.zzbg[0] });
      break;
      label63: AppMethodBeat.o(89432);
    }
  }

  @Deprecated
  public boolean isGooglePublicSignedPackage(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    AppMethodBeat.i(89433);
    boolean bool = isGooglePublicSignedPackage(paramPackageInfo);
    AppMethodBeat.o(89433);
    return bool;
  }

  public boolean isPackageGoogleSigned(PackageInfo paramPackageInfo)
  {
    AppMethodBeat.i(89430);
    paramPackageInfo = zza(paramPackageInfo);
    paramPackageInfo.zzi();
    boolean bool = paramPackageInfo.zzbl;
    AppMethodBeat.o(89430);
    return bool;
  }

  @Deprecated
  public boolean isPackageGoogleSigned(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    AppMethodBeat.i(89429);
    boolean bool = isPackageGoogleSigned(paramPackageInfo);
    AppMethodBeat.o(89429);
    return bool;
  }

  @Deprecated
  public boolean isPackageGoogleSigned(PackageManager paramPackageManager, String paramString)
  {
    AppMethodBeat.i(89427);
    boolean bool = isPackageGoogleSigned(paramString);
    AppMethodBeat.o(89427);
    return bool;
  }

  public boolean isPackageGoogleSigned(String paramString)
  {
    AppMethodBeat.i(89428);
    paramString = zzf(paramString);
    paramString.zzi();
    boolean bool = paramString.zzbl;
    AppMethodBeat.o(89428);
    return bool;
  }

  public boolean isUidGoogleSigned(int paramInt)
  {
    AppMethodBeat.i(89424);
    zzg localzzg = zzb(paramInt);
    localzzg.zzi();
    boolean bool = localzzg.zzbl;
    AppMethodBeat.o(89424);
    return bool;
  }

  @Deprecated
  public boolean isUidGoogleSigned(PackageManager paramPackageManager, int paramInt)
  {
    AppMethodBeat.i(89423);
    boolean bool = isUidGoogleSigned(paramInt);
    AppMethodBeat.o(89423);
    return bool;
  }

  @Deprecated
  public void verifyPackageIsGoogleSigned(PackageManager paramPackageManager, String paramString)
  {
    AppMethodBeat.i(89425);
    verifyPackageIsGoogleSigned(paramString);
    AppMethodBeat.o(89425);
  }

  public void verifyPackageIsGoogleSigned(String paramString)
  {
    AppMethodBeat.i(89426);
    zzf(paramString).zzh();
    AppMethodBeat.o(89426);
  }

  public void verifyUidIsGoogleSigned(int paramInt)
  {
    AppMethodBeat.i(89422);
    zzb(paramInt).zzh();
    AppMethodBeat.o(89422);
  }

  @Deprecated
  public void verifyUidIsGoogleSigned(PackageManager paramPackageManager, int paramInt)
  {
    AppMethodBeat.i(89421);
    verifyUidIsGoogleSigned(paramInt);
    AppMethodBeat.o(89421);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GoogleSignatureVerifier
 * JD-Core Version:    0.6.2
 */