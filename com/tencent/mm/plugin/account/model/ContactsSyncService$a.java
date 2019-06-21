package com.tencent.mm.plugin.account.model;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class ContactsSyncService$a extends AbstractThreadedSyncAdapter
{
  private Context mContext;

  public ContactsSyncService$a(ContactsSyncService paramContactsSyncService, Context paramContext)
  {
    super(paramContext, true);
    AppMethodBeat.i(124662);
    this.mContext = paramContext;
    ab.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl construction");
    AppMethodBeat.o(124662);
  }

  public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
  {
    AppMethodBeat.i(124663);
    ab.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl onPerformSync");
    if (!g.RK())
    {
      ab.e("MicroMsg.ContactsSyncService", "ContactsSyncService account not ready, ignore this sync");
      AppMethodBeat.o(124663);
    }
    while (true)
    {
      return;
      try
      {
        Looper.prepare();
        ContactsSyncService.a(this.gyG, Looper.myLooper());
        ContactsSyncService.a(this.gyG, paramAccount);
        Looper.loop();
        AppMethodBeat.o(124663);
      }
      catch (Exception paramAccount)
      {
        ContactsSyncService.a(this.gyG);
        ab.e("MicroMsg.ContactsSyncService", "ContactsSyncService.onPerformSync error: " + paramAccount.getMessage());
        AppMethodBeat.o(124663);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.ContactsSyncService.a
 * JD-Core Version:    0.6.2
 */