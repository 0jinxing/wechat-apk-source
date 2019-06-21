package com.tencent.mm.plugin.account.model;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.ui.ContactsSyncUI;
import com.tencent.mm.sdk.platformtools.ab;

final class AccountAuthenticatorService$a extends AbstractAccountAuthenticator
{
  private Context mContext;

  public AccountAuthenticatorService$a(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
  }

  public final Bundle addAccount(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle)
  {
    AppMethodBeat.i(124645);
    paramString2 = new Bundle();
    paramString1 = new Intent(this.mContext, ContactsSyncUI.class);
    paramString1.putExtra("accountAuthenticatorResponse", paramAccountAuthenticatorResponse);
    paramString1.putExtra("contact_sync_scene", 1);
    paramString2.putParcelable("intent", paramString1);
    AppMethodBeat.o(124645);
    return paramString2;
  }

  public final Bundle confirmCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, Bundle paramBundle)
  {
    AppMethodBeat.i(124646);
    ab.i("MicroMsg.AccountAuthenticatorService", "confirmCredentials");
    AppMethodBeat.o(124646);
    return null;
  }

  public final Bundle editProperties(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString)
  {
    AppMethodBeat.i(124647);
    ab.i("MicroMsg.AccountAuthenticatorService", "editProperties");
    AppMethodBeat.o(124647);
    return null;
  }

  public final Bundle getAuthToken(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(124648);
    ab.i("MicroMsg.AccountAuthenticatorService", "getAuthToken");
    AppMethodBeat.o(124648);
    return null;
  }

  public final String getAuthTokenLabel(String paramString)
  {
    AppMethodBeat.i(124649);
    ab.i("MicroMsg.AccountAuthenticatorService", "getAuthTokenLabel");
    AppMethodBeat.o(124649);
    return null;
  }

  public final Bundle hasFeatures(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String[] paramArrayOfString)
  {
    AppMethodBeat.i(124650);
    ab.i("MicroMsg.AccountAuthenticatorService", "hasFeatures: ".concat(String.valueOf(paramArrayOfString)));
    AppMethodBeat.o(124650);
    return null;
  }

  public final Bundle updateCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(124651);
    ab.i("MicroMsg.AccountAuthenticatorService", "updateCredentials");
    AppMethodBeat.o(124651);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.AccountAuthenticatorService.a
 * JD-Core Version:    0.6.2
 */