package com.google.android.gms.internal.auth_api_phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzj extends SmsRetrieverClient
{
  public zzj(Activity paramActivity)
  {
    super(paramActivity);
  }

  public zzj(Context paramContext)
  {
    super(paramContext);
  }

  public final Task<Void> startSmsRetriever()
  {
    AppMethodBeat.i(80433);
    Task localTask = doWrite(new zzk(this));
    AppMethodBeat.o(80433);
    return localTask;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzj
 * JD-Core Version:    0.6.2
 */