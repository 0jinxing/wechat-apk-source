package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d
{
  static void a(String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(77231);
    Bundle localBundle = new Bundle();
    String str = paramIntent.getStringExtra("google.c.a.c_id");
    if (str != null)
      localBundle.putString("_nmid", str);
    str = paramIntent.getStringExtra("google.c.a.c_l");
    if (str != null)
      localBundle.putString("_nmn", str);
    str = paramIntent.getStringExtra("google.c.a.m_l");
    if (!TextUtils.isEmpty(str))
      localBundle.putString("label", str);
    str = paramIntent.getStringExtra("from");
    if ((str != null) && (str.startsWith("/topics/")));
    while (true)
    {
      if (str != null)
        localBundle.putString("_nt", str);
      try
      {
        localBundle.putInt("_nmt", Integer.parseInt(paramIntent.getStringExtra("google.c.a.ts")));
        label116: if (paramIntent.hasExtra("google.c.a.udt"));
        try
        {
          localBundle.putInt("_ndt", Integer.parseInt(paramIntent.getStringExtra("google.c.a.udt")));
          label140: if (Log.isLoggable("FirebaseMessaging", 3))
          {
            paramIntent = String.valueOf(localBundle);
            new StringBuilder(String.valueOf(paramString).length() + 22 + String.valueOf(paramIntent).length()).append("Sending event=").append(paramString).append(" params=").append(paramIntent);
          }
          paramIntent = (com.google.firebase.analytics.connector.a)com.google.firebase.a.ut().x(com.google.firebase.analytics.connector.a.class);
          if (paramIntent != null)
          {
            paramIntent.logEvent("fcm", paramString, localBundle);
            AppMethodBeat.o(77231);
          }
          while (true)
          {
            return;
            str = null;
            break;
            AppMethodBeat.o(77231);
          }
        }
        catch (NumberFormatException paramIntent)
        {
          break label140;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        break label116;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.firebase.messaging.d
 * JD-Core Version:    0.6.2
 */