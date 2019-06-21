package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AccountAccessor extends IAccountAccessor.Stub
{
  private Context mContext;
  private int zzqu;
  private Account zzs;

  public AccountAccessor(Context paramContext, Account paramAccount)
  {
    AppMethodBeat.i(89557);
    this.zzqu = -1;
    this.mContext = paramContext.getApplicationContext();
    this.zzs = paramAccount;
    AppMethodBeat.o(89557);
  }

  public static AccountAccessor fromGoogleAccountName(Context paramContext, String paramString)
  {
    AppMethodBeat.i(89555);
    if (TextUtils.isEmpty(paramString));
    for (paramString = null; ; paramString = new Account(paramString, "com.google"))
    {
      paramContext = new AccountAccessor(paramContext, paramString);
      AppMethodBeat.o(89555);
      return paramContext;
    }
  }

  // ERROR //
  public static Account getAccountBinderSafe(IAccountAccessor paramIAccountAccessor)
  {
    // Byte code:
    //   0: ldc 61
    //   2: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_1
    //   7: aload_1
    //   8: astore_2
    //   9: aload_0
    //   10: ifnull +18 -> 28
    //   13: invokestatic 67	android/os/Binder:clearCallingIdentity	()J
    //   16: lstore_3
    //   17: aload_0
    //   18: invokeinterface 73 1 0
    //   23: astore_2
    //   24: lload_3
    //   25: invokestatic 77	android/os/Binder:restoreCallingIdentity	(J)V
    //   28: ldc 61
    //   30: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: aload_2
    //   34: areturn
    //   35: astore_0
    //   36: lload_3
    //   37: invokestatic 77	android/os/Binder:restoreCallingIdentity	(J)V
    //   40: aload_1
    //   41: astore_2
    //   42: goto -14 -> 28
    //   45: astore_0
    //   46: lload_3
    //   47: invokestatic 77	android/os/Binder:restoreCallingIdentity	(J)V
    //   50: ldc 61
    //   52: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   55: aload_0
    //   56: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   17	24	35	android/os/RemoteException
    //   17	24	45	finally
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(89559);
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(89559);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof AccountAccessor))
      {
        bool = false;
        AppMethodBeat.o(89559);
      }
      else
      {
        bool = this.zzs.equals(((AccountAccessor)paramObject).zzs);
        AppMethodBeat.o(89559);
      }
    }
  }

  public Account getAccount()
  {
    AppMethodBeat.i(89558);
    int i = Binder.getCallingUid();
    if (i == this.zzqu)
    {
      localObject = this.zzs;
      AppMethodBeat.o(89558);
    }
    while (true)
    {
      return localObject;
      if (!GooglePlayServicesUtilLight.isGooglePlayServicesUid(this.mContext, i))
        break;
      this.zzqu = i;
      localObject = this.zzs;
      AppMethodBeat.o(89558);
    }
    Object localObject = new SecurityException("Caller is not GooglePlayServices");
    AppMethodBeat.o(89558);
    throw ((Throwable)localObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.AccountAccessor
 * JD-Core Version:    0.6.2
 */