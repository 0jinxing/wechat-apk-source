package com.tencent.mm.booter.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class f
{
  public e eeb;

  private f()
  {
    AppMethodBeat.i(15965);
    this.eeb = new e();
    AppMethodBeat.o(15965);
  }

  public static boolean a(String paramString, bi parambi, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(15966);
    if (bo.isNullOrNil(paramString))
    {
      paramBoolean = false;
      AppMethodBeat.o(15966);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = c.a(paramString, parambi, paramInt, paramBoolean);
      AppMethodBeat.o(15966);
    }
  }

  public final Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4)
  {
    AppMethodBeat.i(15968);
    paramNotification = this.eeb.a(paramNotification, paramInt1, paramInt2, paramPendingIntent, paramString1, paramString2, paramString3, paramBitmap, paramString4);
    AppMethodBeat.o(15968);
    return paramNotification;
  }

  public final int b(NotificationItem paramNotificationItem)
  {
    AppMethodBeat.i(15967);
    int i = this.eeb.a(paramNotificationItem);
    AppMethodBeat.o(15967);
    return i;
  }

  public static final class a
  {
    private static final f eec;

    static
    {
      AppMethodBeat.i(15964);
      eec = new f((byte)0);
      AppMethodBeat.o(15964);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.f
 * JD-Core Version:    0.6.2
 */