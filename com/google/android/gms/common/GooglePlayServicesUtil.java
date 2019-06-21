package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight
{
  public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

  @Deprecated
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

  @Deprecated
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

  @Deprecated
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2)
  {
    AppMethodBeat.i(60451);
    paramActivity = getErrorDialog(paramInt1, paramActivity, paramInt2, null);
    AppMethodBeat.o(60451);
    return paramActivity;
  }

  @Deprecated
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(60452);
    int i = paramInt1;
    if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(paramActivity, paramInt1))
      i = 18;
    paramActivity = GoogleApiAvailability.getInstance().getErrorDialog(paramActivity, i, paramInt2, paramOnCancelListener);
    AppMethodBeat.o(60452);
    return paramActivity;
  }

  @Deprecated
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    AppMethodBeat.i(60459);
    paramContext = GooglePlayServicesUtilLight.getErrorPendingIntent(paramInt1, paramContext, paramInt2);
    AppMethodBeat.o(60459);
    return paramContext;
  }

  @Deprecated
  @VisibleForTesting
  public static String getErrorString(int paramInt)
  {
    AppMethodBeat.i(60457);
    String str = GooglePlayServicesUtilLight.getErrorString(paramInt);
    AppMethodBeat.o(60457);
    return str;
  }

  public static Context getRemoteContext(Context paramContext)
  {
    AppMethodBeat.i(60462);
    paramContext = GooglePlayServicesUtilLight.getRemoteContext(paramContext);
    AppMethodBeat.o(60462);
    return paramContext;
  }

  public static Resources getRemoteResource(Context paramContext)
  {
    AppMethodBeat.i(60461);
    paramContext = GooglePlayServicesUtilLight.getRemoteResource(paramContext);
    AppMethodBeat.o(60461);
    return paramContext;
  }

  @Deprecated
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    AppMethodBeat.i(60458);
    int i = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(paramContext);
    AppMethodBeat.o(60458);
    return i;
  }

  @Deprecated
  public static boolean isUserRecoverableError(int paramInt)
  {
    AppMethodBeat.i(60460);
    boolean bool = GooglePlayServicesUtilLight.isUserRecoverableError(paramInt);
    AppMethodBeat.o(60460);
    return bool;
  }

  @Deprecated
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2)
  {
    AppMethodBeat.i(60456);
    boolean bool = showErrorDialogFragment(paramInt1, paramActivity, paramInt2, null);
    AppMethodBeat.o(60456);
    return bool;
  }

  @Deprecated
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(60453);
    boolean bool = showErrorDialogFragment(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
    AppMethodBeat.o(60453);
    return bool;
  }

  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(60454);
    int i = paramInt1;
    if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(paramActivity, paramInt1))
      i = 18;
    GoogleApiAvailability localGoogleApiAvailability = GoogleApiAvailability.getInstance();
    boolean bool;
    if (paramFragment == null)
    {
      bool = localGoogleApiAvailability.showErrorDialogFragment(paramActivity, i, paramInt2, paramOnCancelListener);
      AppMethodBeat.o(60454);
    }
    while (true)
    {
      return bool;
      paramFragment = GoogleApiAvailability.zza(paramActivity, i, DialogRedirect.getInstance(paramFragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(paramActivity, i, "d"), paramInt2), paramOnCancelListener);
      if (paramFragment == null)
      {
        bool = false;
        AppMethodBeat.o(60454);
      }
      else
      {
        GoogleApiAvailability.zza(paramActivity, paramFragment, "GooglePlayServicesErrorDialog", paramOnCancelListener);
        bool = true;
        AppMethodBeat.o(60454);
      }
    }
  }

  @Deprecated
  public static void showErrorNotification(int paramInt, Context paramContext)
  {
    AppMethodBeat.i(60455);
    GoogleApiAvailability localGoogleApiAvailability = GoogleApiAvailability.getInstance();
    if ((GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(paramContext, paramInt)) || (GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(paramContext, paramInt)))
    {
      localGoogleApiAvailability.zza(paramContext);
      AppMethodBeat.o(60455);
    }
    while (true)
    {
      return;
      localGoogleApiAvailability.showErrorNotification(paramContext, paramInt);
      AppMethodBeat.o(60455);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesUtil
 * JD-Core Version:    0.6.2
 */