package com.tencent.pb.common.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.g.a.a;
import com.tencent.g.f;
import com.tencent.pb.common.b.g;
import com.tencent.pb.common.b.h;
import com.tencent.pb.common.c.c;

public class ConnectReceiver extends BroadcastReceiver
{
  private static g ApS = null;

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent != null);
    try
    {
      if (paramIntent.getAction() == null);
      while (true)
      {
        return;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction()))
        {
          if (ApS == null)
          {
            paramContext = new com/tencent/pb/common/b/g;
            paramContext.<init>();
            ApS = paramContext;
          }
          boolean bool1 = h.isNetworkConnected();
          boolean bool2 = ApS.Il();
          paramContext = (a)f.aux("EventCenter");
          if ((bool2) && (paramContext != null))
          {
            if (!bool1)
              break;
            paramContext.c("GLOBAL_TOPIC_NETWORK_CHANGE", 21, null);
          }
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        c.w("ConnectReceiver", new Object[] { "onReceive", paramContext });
        continue;
        paramContext.c("GLOBAL_TOPIC_NETWORK_CHANGE", 33, null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.system.ConnectReceiver
 * JD-Core Version:    0.6.2
 */