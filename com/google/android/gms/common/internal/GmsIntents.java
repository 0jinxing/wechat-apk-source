package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Parcelable;
import android.support.v4.app.ab.a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.AccountPicker;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.api.Scope;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Locale;

public class GmsIntents
{
  public static final String ACTION_FITNESS_APP_DISCONNECTED = "com.google.android.gms.fitness.app_disconnected";
  public static final String ACTION_ICING_CONTACT_CHANGED = "com.google.android.gms.icing.action.CONTACT_CHANGED";
  public static final String ACTION_SET_GMS_ACCOUNT = "com.google.android.gms.common.SET_GMS_ACCOUNT";
  public static final String ACTION_UDC_SETTING_CHANGED = "com.google.android.gms.udc.action.SETTING_CHANGED";
  public static final String BROADCAST_CIRCLES_CHANGED = "com.google.android.gms.people.BROADCAST_CIRCLES_CHANGED";
  public static final String COMMON_SIGN_IN_EXTRA_PACKAGE_NAME = "SIGN_IN_PACKAGE_NAME";
  public static final String COMMON_SIGN_IN_EXTRA_SAVE_DEFAULT_ACCOUNT = "SIGN_IN_SAVE_DEFAULT_ACCOUNT";
  public static final String COMMON_SIGN_IN_EXTRA_SCOPE_ARRAY = "SIGN_IN_SCOPE_ARRAY";
  public static final String EXTRA_ACCOUNT = "com.google.android.gms.fitness.disconnected_account";
  public static final String EXTRA_APP = "com.google.android.gms.fitness.disconnected_app";
  public static final String EXTRA_ICING_CONTACT_CHANGED_IS_SIGNIFICANT = "com.google.android.gms.icing.extra.isSignificant";
  public static final String EXTRA_SET_GMS_ACCOUNT_NAME = "ACCOUNT_NAME";
  public static final String EXTRA_SET_GMS_ACCOUNT_PACKAGE_NAME = "PACKAGE_NAME";
  public static final String EXTRA_UDC_ACCOUNT_NAME = "com.google.android.gms.udc.extra.accountName";
  public static final String EXTRA_UDC_SETTING_ID_LIST = "com.google.android.gms.udc.extra.settingIdList";
  public static final String GOOGLE_NOW_PACKAGE_NAME = "com.google.android.googlequicksearchbox";
  public static final String MIME_ACTIVITY_DISCONNECT_TYPE = "vnd.google.android.fitness/app_disconnect";
  public static final String PERMISSION_GMS_INTERNAL_BROADCAST = "com.google.android.gms.permission.INTERNAL_BROADCAST";
  private static final Uri zztz;
  private static final Uri zzua;

  static
  {
    AppMethodBeat.i(89641);
    Uri localUri = Uri.parse("https://plus.google.com/");
    zztz = localUri;
    zzua = localUri.buildUpon().appendPath("circles").appendPath("find").build();
    AppMethodBeat.o(89641);
  }

  public static Intent createAndroidWearUpdateIntent()
  {
    AppMethodBeat.i(89628);
    Intent localIntent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    localIntent.setPackage("com.google.android.wearable.app");
    AppMethodBeat.o(89628);
    return localIntent;
  }

  public static Intent createChooseGmsAccountIntent()
  {
    AppMethodBeat.i(89636);
    Intent localIntent = AccountPicker.newChooseAccountIntent(null, null, new String[] { "com.google" }, true, null, null, null, null, true);
    AppMethodBeat.o(89636);
    return localIntent;
  }

  public static Intent createChooseGmsAccountWithConsentIntent(String paramString, Scope[] paramArrayOfScope, boolean paramBoolean)
  {
    AppMethodBeat.i(89637);
    Intent localIntent = new Intent("com.google.android.gms.signin.action.SIGN_IN");
    localIntent.putExtra("SIGN_IN_PACKAGE_NAME", paramString);
    localIntent.putExtra("SIGN_IN_SCOPE_ARRAY", paramArrayOfScope);
    localIntent.putExtra("SIGN_IN_SAVE_DEFAULT_ACCOUNT", paramBoolean);
    AppMethodBeat.o(89637);
    return localIntent;
  }

  public static Intent createDateSettingsIntent()
  {
    AppMethodBeat.i(89622);
    Intent localIntent = new Intent("android.settings.DATE_SETTINGS");
    AppMethodBeat.o(89622);
    return localIntent;
  }

  public static Intent createFindPeopleIntent(Context paramContext)
  {
    AppMethodBeat.i(89632);
    paramContext = zza(paramContext, zzua);
    AppMethodBeat.o(89632);
    return paramContext;
  }

  public static Intent createPlayStoreGamesIntent(Context paramContext)
  {
    AppMethodBeat.i(89627);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("http://play.google.com/store/apps/category/GAME"));
    localIntent.addFlags(524288);
    localIntent.setPackage("com.android.vending");
    if (paramContext.getPackageManager().resolveActivity(localIntent, 65536) == null)
    {
      paramContext = new Intent(localIntent.getAction(), localIntent.getData());
      paramContext.setFlags(localIntent.getFlags());
      AppMethodBeat.o(89627);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(89627);
      paramContext = localIntent;
    }
  }

  public static Intent createPlayStoreIntent(String paramString)
  {
    AppMethodBeat.i(89624);
    paramString = createPlayStoreIntent(paramString, null);
    AppMethodBeat.o(89624);
    return paramString;
  }

  public static Intent createPlayStoreIntent(String paramString1, String paramString2)
  {
    AppMethodBeat.i(89625);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    paramString1 = Uri.parse("market://details").buildUpon().appendQueryParameter("id", paramString1);
    if (!TextUtils.isEmpty(paramString2))
      paramString1.appendQueryParameter("pcampaignid", paramString2);
    localIntent.setData(paramString1.build());
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    AppMethodBeat.o(89625);
    return localIntent;
  }

  public static Intent createPlayStoreLightPurchaseFlowIntent(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(89626);
    Intent localIntent = new Intent("com.android.vending.billing.PURCHASE");
    localIntent.addCategory("android.intent.category.DEFAULT");
    localIntent.setPackage("com.android.vending");
    if (!TextUtils.isEmpty(paramString1))
      localIntent.putExtra("authAccount", paramString1);
    localIntent.putExtra("backend", 3);
    localIntent.putExtra("document_type", 1);
    localIntent.putExtra("full_docid", paramString2);
    localIntent.putExtra("backend_docid", paramString2);
    localIntent.putExtra("offer_type", 1);
    paramString1 = localIntent;
    if (!isIntentResolvable(paramContext.getPackageManager(), localIntent))
    {
      paramString1 = new Intent("android.intent.action.VIEW");
      paramString1.setData(Uri.parse(String.format(Locale.US, "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", new Object[] { paramString2, Integer.valueOf(1) })));
      paramString1.setPackage("com.android.vending");
      paramString1.putExtra("use_direct_purchase", true);
    }
    AppMethodBeat.o(89626);
    return paramString1;
  }

  public static Intent createSettingsIntent(String paramString)
  {
    AppMethodBeat.i(89621);
    Uri localUri = Uri.fromParts("package", paramString, null);
    paramString = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    paramString.setData(localUri);
    AppMethodBeat.o(89621);
    return paramString;
  }

  public static Intent createShareOnPlusIntent(Activity paramActivity, String paramString1, String paramString2)
  {
    AppMethodBeat.i(89635);
    ab.a locala = new ab.a(paramActivity);
    locala.mIntent.putExtra("android.intent.extra.SUBJECT", paramString1);
    locala.mIntent.putExtra("android.intent.extra.TEXT", paramString2);
    locala.mIntent.setType("text/plain");
    if (locala.FZ != null)
    {
      locala.a("android.intent.extra.EMAIL", locala.FZ);
      locala.FZ = null;
    }
    if (locala.Ga != null)
    {
      locala.a("android.intent.extra.CC", locala.Ga);
      locala.Ga = null;
    }
    if (locala.Gb != null)
    {
      locala.a("android.intent.extra.BCC", locala.Gb);
      locala.Gb = null;
    }
    int i;
    if ((locala.Gc != null) && (locala.Gc.size() > 1))
    {
      i = 1;
      boolean bool = locala.mIntent.getAction().equals("android.intent.action.SEND_MULTIPLE");
      if ((i == 0) && (bool))
      {
        locala.mIntent.setAction("android.intent.action.SEND");
        if ((locala.Gc == null) || (locala.Gc.isEmpty()))
          break label313;
        locala.mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)locala.Gc.get(0));
        label215: locala.Gc = null;
      }
      if ((i != 0) && (!bool))
      {
        locala.mIntent.setAction("android.intent.action.SEND_MULTIPLE");
        if ((locala.Gc == null) || (locala.Gc.isEmpty()))
          break label326;
        locala.mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", locala.Gc);
      }
      label273: paramString1 = locala.mIntent;
      paramString1.setPackage("com.google.android.apps.plus");
      if (!isIntentResolvable(paramActivity.getPackageManager(), paramString1))
        break label339;
      AppMethodBeat.o(89635);
      paramActivity = paramString1;
    }
    while (true)
    {
      return paramActivity;
      i = 0;
      break;
      label313: locala.mIntent.removeExtra("android.intent.extra.STREAM");
      break label215;
      label326: locala.mIntent.removeExtra("android.intent.extra.STREAM");
      break label273;
      label339: paramActivity = createPlayStoreIntent("com.google.android.apps.plus");
      AppMethodBeat.o(89635);
    }
  }

  public static Intent createShowProfileIntent(Context paramContext, String paramString)
  {
    AppMethodBeat.i(89633);
    paramContext = zza(paramContext, Uri.parse(String.format("https://plus.google.com/%s/about", new Object[] { paramString })));
    AppMethodBeat.o(89633);
    return paramContext;
  }

  public static Intent getFitnessAppDisconnectedIntent(String paramString1, String paramString2)
  {
    AppMethodBeat.i(89640);
    Intent localIntent = new Intent();
    localIntent.setPackage("com.google.android.gms");
    localIntent.setAction("com.google.android.gms.fitness.app_disconnected");
    localIntent.setType("vnd.google.android.fitness/app_disconnect");
    localIntent.putExtra("com.google.android.gms.fitness.disconnected_app", paramString1);
    localIntent.putExtra("com.google.android.gms.fitness.disconnected_account", paramString2);
    AppMethodBeat.o(89640);
    return localIntent;
  }

  public static Uri getPlayStoreUri(String paramString)
  {
    AppMethodBeat.i(89623);
    paramString = Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", paramString).build();
    AppMethodBeat.o(89623);
    return paramString;
  }

  public static boolean isIntentResolvable(PackageManager paramPackageManager, Intent paramIntent)
  {
    AppMethodBeat.i(89639);
    boolean bool;
    if (paramPackageManager.resolveActivity(paramIntent, 65536) != null)
    {
      bool = true;
      AppMethodBeat.o(89639);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(89639);
    }
  }

  public static void sendIcingContactChangedBroadcast(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(89631);
    Intent localIntent = new Intent("com.google.android.gms.icing.action.CONTACT_CHANGED").setPackage("com.google.android.gms").putExtra("com.google.android.gms.icing.extra.isSignificant", paramBoolean);
    if (Log.isLoggable("GmsIntents", 2))
    {
      String str = localIntent.getAction();
      new StringBuilder(String.valueOf(str).length() + 98).append("Icing detected contact change, broadcasting it with intent action: ").append(str).append(" and isSignificant extra: ").append(paramBoolean);
    }
    paramContext.sendBroadcast(localIntent);
    AppMethodBeat.o(89631);
  }

  public static void sendSetGmsAccountIntent(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(89638);
    Intent localIntent = new Intent("com.google.android.gms.common.SET_GMS_ACCOUNT");
    localIntent.putExtra("ACCOUNT_NAME", paramString1);
    localIntent.putExtra("PACKAGE_NAME", paramString2);
    localIntent.setPackage("com.google.android.gms");
    paramContext.sendBroadcast(localIntent, "com.google.android.gms.permission.INTERNAL_BROADCAST");
    AppMethodBeat.o(89638);
  }

  public static void sendUdcSettingsChangedBroadcast(Context paramContext, String paramString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(89629);
    zza("com.google.android.gms", paramContext, paramString, paramArrayOfInt);
    if (!GoogleSignatureVerifier.getInstance(paramContext).isPackageGoogleSigned("com.google.android.googlequicksearchbox"))
    {
      Log.isLoggable("GmsIntents", 5);
      AppMethodBeat.o(89629);
    }
    while (true)
    {
      return;
      zza("com.google.android.googlequicksearchbox", paramContext, paramString, paramArrayOfInt);
      AppMethodBeat.o(89629);
    }
  }

  private static Intent zza(Context paramContext, Uri paramUri)
  {
    AppMethodBeat.i(89634);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(paramUri);
    localIntent.setPackage("com.google.android.apps.plus");
    if (isIntentResolvable(paramContext.getPackageManager(), localIntent))
    {
      AppMethodBeat.o(89634);
      paramContext = localIntent;
    }
    while (true)
    {
      return paramContext;
      paramContext = createPlayStoreIntent("com.google.android.apps.plus");
      AppMethodBeat.o(89634);
    }
  }

  private static void zza(String paramString1, Context paramContext, String paramString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(89630);
    paramArrayOfInt = new Intent("com.google.android.gms.udc.action.SETTING_CHANGED").setPackage(paramString1).putExtra("com.google.android.gms.udc.extra.accountName", paramString2).putExtra("com.google.android.gms.udc.extra.settingIdList", paramArrayOfInt);
    if (Log.isLoggable("GmsIntents", 3))
    {
      paramString2 = paramArrayOfInt.getAction();
      new StringBuilder(String.valueOf(paramString1).length() + 72 + String.valueOf(paramString2).length()).append("UDC settings changed, sending broadcast to package ").append(paramString1).append(" with intent action: ").append(paramString2);
    }
    paramContext.sendBroadcast(paramArrayOfInt);
    AppMethodBeat.o(89630);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.GmsIntents
 * JD-Core Version:    0.6.2
 */