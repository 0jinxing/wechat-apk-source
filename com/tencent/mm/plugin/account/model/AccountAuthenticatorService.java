package com.tencent.mm.plugin.account.model;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class AccountAuthenticatorService extends Service
{
  private static AccountAuthenticatorService.a gyy = null;

  public IBinder onBind(Intent paramIntent)
  {
    Object localObject = null;
    AppMethodBeat.i(124652);
    if (paramIntent == null)
    {
      AppMethodBeat.o(124652);
      paramIntent = localObject;
    }
    while (true)
    {
      return paramIntent;
      if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("android.accounts.AccountAuthenticator")))
      {
        if (gyy == null)
          gyy = new AccountAuthenticatorService.a(this);
        paramIntent = gyy.getIBinder();
        AppMethodBeat.o(124652);
      }
      else
      {
        AppMethodBeat.o(124652);
        paramIntent = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.AccountAuthenticatorService
 * JD-Core Version:    0.6.2
 */