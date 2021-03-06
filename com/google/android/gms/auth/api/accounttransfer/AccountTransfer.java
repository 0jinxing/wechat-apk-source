package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.internal.auth.zzw;
import com.google.android.gms.internal.auth.zzx;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AccountTransfer
{
  public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
  public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
  public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
  public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
  private static final Api.ClientKey<zzx> zzau;
  private static final Api.AbstractClientBuilder<zzx, zzq> zzav;
  private static final Api<zzq> zzaw;

  @Deprecated
  private static final zze zzax;
  private static final zzt zzay;

  static
  {
    AppMethodBeat.i(76977);
    zzau = new Api.ClientKey();
    zzav = new zzd();
    zzaw = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zzav, zzau);
    zzax = new zzw();
    zzay = new zzw();
    AppMethodBeat.o(76977);
  }

  public static AccountTransferClient getAccountTransferClient(Activity paramActivity)
  {
    AppMethodBeat.i(76975);
    paramActivity = new AccountTransferClient(paramActivity);
    AppMethodBeat.o(76975);
    return paramActivity;
  }

  public static AccountTransferClient getAccountTransferClient(Context paramContext)
  {
    AppMethodBeat.i(76976);
    paramContext = new AccountTransferClient(paramContext);
    AppMethodBeat.o(76976);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.accounttransfer.AccountTransfer
 * JD-Core Version:    0.6.2
 */