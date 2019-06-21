package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MetadataValueReader;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
@KeepForSdk
public final class GoogleServices
{
  private static final Object sLock;

  @GuardedBy("sLock")
  private static GoogleServices zzku;
  private final String zzkv;
  private final Status zzkw;
  private final boolean zzkx;
  private final boolean zzky;

  static
  {
    AppMethodBeat.i(89479);
    sLock = new Object();
    AppMethodBeat.o(89479);
  }

  @KeepForSdk
  @VisibleForTesting
  GoogleServices(Context paramContext)
  {
    AppMethodBeat.i(89470);
    Object localObject = paramContext.getResources();
    int i = ((Resources)localObject).getIdentifier("google_app_measurement_enable", "integer", ((Resources)localObject).getResourcePackageName(2131296282));
    if (i != 0)
      if (((Resources)localObject).getInteger(i) != 0)
      {
        bool1 = true;
        if (bool1)
          break label137;
        label58: this.zzky = bool2;
        label63: this.zzkx = bool1;
        String str = MetadataValueReader.getGoogleAppId(paramContext);
        localObject = str;
        if (str == null)
          localObject = new StringResourceValueReader(paramContext).getString("google_app_id");
        if (!TextUtils.isEmpty((CharSequence)localObject))
          break label150;
        this.zzkw = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
        this.zzkv = null;
        AppMethodBeat.o(89470);
      }
    while (true)
    {
      return;
      bool1 = false;
      break;
      label137: bool2 = false;
      break label58;
      this.zzky = false;
      break label63;
      label150: this.zzkv = ((String)localObject);
      this.zzkw = Status.RESULT_SUCCESS;
      AppMethodBeat.o(89470);
    }
  }

  @KeepForSdk
  @VisibleForTesting
  GoogleServices(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(89471);
    this.zzkv = paramString;
    this.zzkw = Status.RESULT_SUCCESS;
    this.zzkx = paramBoolean;
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.zzky = paramBoolean;
      AppMethodBeat.o(89471);
      return;
    }
  }

  @KeepForSdk
  private static GoogleServices checkInitialized(String paramString)
  {
    AppMethodBeat.i(89478);
    synchronized (sLock)
    {
      if (zzku == null)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        int i = String.valueOf(paramString).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 34);
        localIllegalStateException.<init>("Initialize must be called before " + paramString + ".");
        AppMethodBeat.o(89478);
        throw localIllegalStateException;
      }
    }
    paramString = zzku;
    AppMethodBeat.o(89478);
    return paramString;
  }

  @KeepForSdk
  @VisibleForTesting
  static void clearInstanceForTest()
  {
    synchronized (sLock)
    {
      zzku = null;
      return;
    }
  }

  @KeepForSdk
  public static String getGoogleAppId()
  {
    AppMethodBeat.i(89475);
    String str = checkInitialized("getGoogleAppId").zzkv;
    AppMethodBeat.o(89475);
    return str;
  }

  @KeepForSdk
  public static Status initialize(Context paramContext)
  {
    AppMethodBeat.i(89474);
    Preconditions.checkNotNull(paramContext, "Context must not be null.");
    synchronized (sLock)
    {
      if (zzku == null)
      {
        GoogleServices localGoogleServices = new com/google/android/gms/common/api/internal/GoogleServices;
        localGoogleServices.<init>(paramContext);
        zzku = localGoogleServices;
      }
      paramContext = zzku.zzkw;
      AppMethodBeat.o(89474);
      return paramContext;
    }
  }

  @KeepForSdk
  public static Status initialize(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(89472);
    Preconditions.checkNotNull(paramContext, "Context must not be null.");
    Preconditions.checkNotEmpty(paramString, "App ID must be nonempty.");
    synchronized (sLock)
    {
      if (zzku != null)
      {
        paramContext = zzku.checkGoogleAppId(paramString);
        AppMethodBeat.o(89472);
        return paramContext;
      }
      paramContext = new com/google/android/gms/common/api/internal/GoogleServices;
      paramContext.<init>(paramString, paramBoolean);
      zzku = paramContext;
      paramContext = paramContext.zzkw;
      AppMethodBeat.o(89472);
    }
  }

  @KeepForSdk
  public static boolean isMeasurementEnabled()
  {
    AppMethodBeat.i(89476);
    GoogleServices localGoogleServices = checkInitialized("isMeasurementEnabled");
    boolean bool;
    if ((localGoogleServices.zzkw.isSuccess()) && (localGoogleServices.zzkx))
    {
      bool = true;
      AppMethodBeat.o(89476);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(89476);
    }
  }

  @KeepForSdk
  public static boolean isMeasurementExplicitlyDisabled()
  {
    AppMethodBeat.i(89477);
    boolean bool = checkInitialized("isMeasurementExplicitlyDisabled").zzky;
    AppMethodBeat.o(89477);
    return bool;
  }

  @KeepForSdk
  @VisibleForTesting
  final Status checkGoogleAppId(String paramString)
  {
    AppMethodBeat.i(89473);
    if ((this.zzkv != null) && (!this.zzkv.equals(paramString)))
    {
      paramString = this.zzkv;
      paramString = new Status(10, String.valueOf(paramString).length() + 97 + "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + paramString + "'.");
      AppMethodBeat.o(89473);
    }
    while (true)
    {
      return paramString;
      paramString = Status.RESULT_SUCCESS;
      AppMethodBeat.o(89473);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.GoogleServices
 * JD-Core Version:    0.6.2
 */