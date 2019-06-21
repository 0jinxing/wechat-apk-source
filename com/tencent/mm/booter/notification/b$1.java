package com.tencent.mm.booter.notification;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class b$1 extends ak
{
  b$1(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(15892);
    super.handleMessage(paramMessage);
    ah.getContext().getSharedPreferences("notify_prep", 0).edit().putBoolean("longNoopIntervalFlag", true).apply();
    String str1 = paramMessage.getData().getString("notification.show.talker");
    String str2 = paramMessage.getData().getString("notification.show.message.content");
    int i = paramMessage.getData().getInt("notification.show.message.type");
    int j = paramMessage.getData().getInt("notification.show.tipsflag");
    ab.i("MicroMsg.MMNotification", "notify need to deal: %s", new Object[] { str1 });
    try
    {
      if (paramMessage.what == 1)
      {
        b.a(this.edA, str1, str2, i, j, true);
        AppMethodBeat.o(15892);
      }
      while (true)
      {
        return;
        b.a(this.edA, str1, str2, i, j, false);
        AppMethodBeat.o(15892);
      }
    }
    catch (Exception paramMessage)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMNotification", paramMessage, "showNotifiHandler", new Object[0]);
        AppMethodBeat.o(15892);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.b.1
 * JD-Core Version:    0.6.2
 */