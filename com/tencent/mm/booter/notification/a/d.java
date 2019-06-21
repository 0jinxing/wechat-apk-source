package com.tencent.mm.booter.notification.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public Intent mIntent;

  public static PendingIntent b(Context paramContext, int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(16011);
    paramContext = PendingIntent.getActivity(paramContext, paramInt, paramIntent, 134217728);
    AppMethodBeat.o(16011);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.d
 * JD-Core Version:    0.6.2
 */