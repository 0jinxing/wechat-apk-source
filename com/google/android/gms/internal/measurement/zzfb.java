package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.firebase.iid.FirebaseInstanceId;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Locale;

public final class zzfb extends zzhh
{
  private String zzadm;
  private String zzadt;
  private long zzadx;
  private int zzaen;
  private int zzaie;
  private long zzaif;
  private String zztg;
  private String zzth;
  private String zzti;

  zzfb(zzgl paramzzgl)
  {
    super(paramzzgl);
  }

  private final String zzgj()
  {
    Object localObject = null;
    AppMethodBeat.i(68778);
    zzab();
    if ((zzgg().zzay(this.zzti)) && (!this.zzacw.isEnabled()))
      AppMethodBeat.o(68778);
    while (true)
    {
      return localObject;
      try
      {
        FirebaseInstanceId.uD().uE();
        String str = FirebaseInstanceId.zzf();
        localObject = str;
        AppMethodBeat.o(68778);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        zzge().zzip().log("Failed to retrieve Firebase Instance Id");
        AppMethodBeat.o(68778);
      }
    }
  }

  final String getGmpAppId()
  {
    AppMethodBeat.i(68780);
    zzch();
    String str = this.zzadm;
    AppMethodBeat.o(68780);
    return str;
  }

  final String zzah()
  {
    AppMethodBeat.i(68779);
    zzch();
    String str = this.zzti;
    AppMethodBeat.o(68779);
    return str;
  }

  final zzdz zzbi(String paramString)
  {
    AppMethodBeat.i(68776);
    zzab();
    String str1 = zzah();
    String str2 = getGmpAppId();
    zzch();
    String str3 = this.zzth;
    long l1 = zzij();
    zzch();
    String str4 = this.zzadt;
    zzch();
    zzab();
    if (this.zzaif == 0L)
      this.zzaif = this.zzacw.zzgb().zzd(getContext(), getContext().getPackageName());
    long l2 = this.zzaif;
    boolean bool1 = this.zzacw.isEnabled();
    boolean bool2;
    String str5;
    long l3;
    int i;
    boolean bool3;
    if (!zzgf().zzakn)
    {
      bool2 = true;
      str5 = zzgj();
      zzch();
      l3 = this.zzacw.zzjt();
      i = zzik();
      Boolean localBoolean = zzgg().zzas("google_analytics_adid_collection_enabled");
      if ((localBoolean != null) && (!localBoolean.booleanValue()))
        break label252;
      bool3 = true;
      label168: localBoolean = zzgg().zzas("google_analytics_ssaid_collection_enabled");
      if ((localBoolean != null) && (!localBoolean.booleanValue()))
        break label258;
    }
    label258: for (boolean bool4 = true; ; bool4 = false)
    {
      paramString = new zzdz(str1, str2, str3, l1, str4, 12451L, l2, paramString, bool1, bool2, str5, 0L, l3, i, bool3, bool4, zzgf().zzje());
      AppMethodBeat.o(68776);
      return paramString;
      bool2 = false;
      break;
      label252: bool3 = false;
      break label168;
    }
  }

  protected final boolean zzhf()
  {
    return true;
  }

  protected final void zzih()
  {
    int i = 1;
    AppMethodBeat.i(68775);
    Object localObject1 = "unknown";
    String str1 = "Unknown";
    int j = -2147483648;
    String str2 = "Unknown";
    String str3 = getContext().getPackageName();
    Object localObject3 = getContext().getPackageManager();
    Object localObject4;
    String str4;
    Object localObject5;
    if (localObject3 == null)
    {
      zzge().zzim().zzg("PackageManager is null, app identity information might be inaccurate. appId", zzfg.zzbm(str3));
      localObject4 = localObject1;
      str4 = str1;
      k = j;
      localObject1 = str2;
      this.zzti = str3;
      this.zzadt = ((String)localObject4);
      this.zzth = str4;
      this.zzaie = k;
      this.zztg = ((String)localObject1);
      this.zzaif = 0L;
      localObject5 = GoogleServices.initialize(getContext());
      if ((localObject5 == null) || (!((Status)localObject5).isSuccess()))
        break label533;
      k = 1;
      label139: if (k == 0)
      {
        if (localObject5 != null)
          break label539;
        zzge().zzim().log("GoogleService failed to initialize (no status)");
      }
      label162: if (k == 0)
        break label694;
      localObject5 = zzgg().zzas("firebase_analytics_collection_enabled");
      if (!zzgg().zzhg())
        break label568;
      zzge().zzir().log("Collection disabled with firebase_analytics_collection_deactivated=1");
    }
    label533: label539: label674: label680: label694: for (int k = 0; ; k = 0)
      while (true)
      {
        this.zzadm = "";
        this.zzadx = 0L;
        try
        {
          Object localObject6;
          while (true)
          {
            localObject1 = GoogleServices.getGoogleAppId();
            localObject5 = localObject1;
            if (TextUtils.isEmpty((CharSequence)localObject1))
              localObject5 = "";
            this.zzadm = ((String)localObject5);
            if (k != 0)
              zzge().zzit().zze("App package, google app id", this.zzti, this.zzadm);
            if (Build.VERSION.SDK_INT < 16)
              break label680;
            if (!InstantApps.isInstantApp(getContext()))
              break label674;
            k = i;
            this.zzaen = k;
            AppMethodBeat.o(68775);
            return;
            try
            {
              localObject5 = ((PackageManager)localObject3).getInstallerPackageName(str3);
              localObject1 = localObject5;
              if (localObject1 == null)
              {
                localObject5 = "manual_install";
                localObject4 = str2;
                str4 = str1;
              }
            }
            catch (IllegalArgumentException localIllegalArgumentException)
            {
              try
              {
                do
                {
                  while (true)
                  {
                    PackageInfo localPackageInfo = ((PackageManager)localObject3).getPackageInfo(getContext().getPackageName(), 0);
                    localObject1 = str2;
                    k = j;
                    str4 = str1;
                    localObject4 = localObject5;
                    if (localPackageInfo == null)
                      break;
                    localObject4 = str2;
                    str4 = str1;
                    localObject3 = ((PackageManager)localObject3).getApplicationLabel(localPackageInfo.applicationInfo);
                    localObject1 = str2;
                    localObject4 = str2;
                    str4 = str1;
                    if (!TextUtils.isEmpty((CharSequence)localObject3))
                    {
                      localObject4 = str2;
                      str4 = str1;
                      localObject1 = ((CharSequence)localObject3).toString();
                    }
                    localObject4 = localObject1;
                    str4 = str1;
                    str2 = localPackageInfo.versionName;
                    localObject4 = localObject1;
                    str4 = str2;
                    k = localPackageInfo.versionCode;
                    str4 = str2;
                    localObject4 = localObject5;
                    break;
                    localIllegalArgumentException = localIllegalArgumentException;
                    zzge().zzim().zzg("Error retrieving app installer package name. appId", zzfg.zzbm(str3));
                  }
                  localObject6 = localObject1;
                }
                while (!"com.android.vending".equals(localObject1));
                localObject6 = "";
              }
              catch (PackageManager.NameNotFoundException localNameNotFoundException)
              {
                zzge().zzim().zze("Error retrieving package info. appId, appName", zzfg.zzbm(str3), localObject4);
                Object localObject2 = localObject4;
                k = j;
                localObject4 = localObject6;
              }
            }
          }
          break;
          k = 0;
          break label139;
          zzge().zzim().zze("GoogleService failed to initialize, status", Integer.valueOf(((Status)localObject6).getStatusCode()), ((Status)localObject6).getStatusMessage());
          break label162;
          label568: if ((localObject6 != null) && (!((Boolean)localObject6).booleanValue()))
          {
            zzge().zzir().log("Collection disabled with firebase_analytics_collection_enabled=0");
            k = 0;
          }
          else if ((localObject6 == null) && (GoogleServices.isMeasurementExplicitlyDisabled()))
          {
            zzge().zzir().log("Collection disabled with google_app_measurement_enable=0");
            k = 0;
          }
          else
          {
            zzge().zzit().log("Collection enabled");
            k = 1;
          }
        }
        catch (IllegalStateException localIllegalStateException)
        {
          while (true)
          {
            zzge().zzim().zze("getGoogleAppId or isMeasurementEnabled failed with exception. appId", zzfg.zzbm(str3), localIllegalStateException);
            continue;
            k = 0;
            continue;
            this.zzaen = 0;
            AppMethodBeat.o(68775);
          }
        }
      }
  }

  final String zzii()
  {
    AppMethodBeat.i(68777);
    Object localObject = new byte[16];
    zzgb().zzlc().nextBytes((byte[])localObject);
    localObject = String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, (byte[])localObject) });
    AppMethodBeat.o(68777);
    return localObject;
  }

  final int zzij()
  {
    AppMethodBeat.i(68781);
    zzch();
    int i = this.zzaie;
    AppMethodBeat.o(68781);
    return i;
  }

  final int zzik()
  {
    AppMethodBeat.i(68782);
    zzch();
    int i = this.zzaen;
    AppMethodBeat.o(68782);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfb
 * JD-Core Version:    0.6.2
 */