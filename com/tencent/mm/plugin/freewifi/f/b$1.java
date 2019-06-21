package com.tencent.mm.plugin.freewifi.f;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.e;
import com.tencent.mm.plugin.freewifi.g.f;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.protobuf.acl;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class b$1
  implements Runnable
{
  b$1(int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20869);
    if (!b.access$000())
      AppMethodBeat.o(20869);
    while (true)
    {
      return;
      if (this.mxJ == 0)
      {
        long l = System.currentTimeMillis() - i.a.byn().lb("LOCAL_CONFIG_LAST_MOBILE_NETWORK_REPORT_TIMEMILLIS");
        ab.v("MicroMsg.FreeWifi.FreeWifiServerReporter", "mobile netowrk report interval between last time is : ".concat(String.valueOf(l)));
        if ((l >= 0L) && (l <= 86400000L))
        {
          ab.v("MicroMsg.FreeWifi.FreeWifiServerReporter", "interval less than 24 hours. return.");
          AppMethodBeat.o(20869);
        }
        else
        {
          i.a.byn().F("LOCAL_CONFIG_LAST_MOBILE_NETWORK_REPORT_TIMEMILLIS", System.currentTimeMillis());
        }
      }
      else
      {
        b.access$002(false);
        Object localObject1 = com.tencent.mm.plugin.freewifi.model.j.byY();
        m.a("FreeWifiLog", f.mxM, (com.tencent.mm.sdk.e.j)localObject1, "MicroMsg.FreeWifi.FreeWifiLogStorage");
        Cursor localCursor = ((f)localObject1).rawQuery("select id, protocolNumber, logContent, createTime from FreeWifiLog", new String[0]);
        localObject1 = new LinkedList();
        while ((localCursor != null) && (localCursor.moveToNext()))
        {
          localObject2 = new acl();
          ((acl)localObject2).id = localCursor.getString(0);
          ((acl)localObject2).mwG = localCursor.getInt(1);
          ((acl)localObject2).wkh = localCursor.getString(2);
          ((acl)localObject2).wki = localCursor.getLong(3);
          ((LinkedList)localObject1).add(localObject2);
        }
        if (localCursor != null)
          localCursor.close();
        Object localObject2 = "ServerReportSimpleLog:" + b.U((LinkedList)localObject1);
        m.MA((String)localObject2);
        ab.i("MicroMsg.FreeWifi.FreeWifiServerReporter", (String)localObject2);
        if (((LinkedList)localObject1).size() > 0)
        {
          new e((LinkedList)localObject1).c(new b.1.1(this));
          AppMethodBeat.o(20869);
        }
        else
        {
          b.access$002(true);
          AppMethodBeat.o(20869);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.f.b.1
 * JD-Core Version:    0.6.2
 */