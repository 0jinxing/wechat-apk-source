package com.tencent.mm.plugin.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class b
{
  public static String oFb = "afterLogin";
  public static String oFc = "afterSleep";
  public static String oFd = "getMore";
  public static int oFe = 0;
  public static int oFf = 1644429312;
  public static int oFg = 302122240;
  public static int oFh = 50;
  public static int oFi = 20;
  public static int oFj = 100;
  public static int oFk = 3;
  public static int oFl = 1;
  public static int oFm = 1;
  public static int oFn = 1000;

  public static void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(22891);
    int i = 0;
    if (paramString.equals(oFb))
      i = 1;
    while (true)
    {
      h.pYm.e(14108, new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Long.valueOf(paramLong4), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      AppMethodBeat.o(22891);
      return;
      if (paramString.equals(oFc))
        i = 2;
      else if (paramString.equals(oFd))
        i = 3;
    }
  }

  public static void bQV()
  {
    AppMethodBeat.i(22890);
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100224");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).dru();
      oFe = bo.getInt((String)((Map)localObject).get("SyncOpen"), 0);
      oFf = bo.getInt((String)((Map)localObject).get("WindowsVersion"), 1644429312);
      oFg = bo.getInt((String)((Map)localObject).get("MacVersion"), 302122240);
      oFh = bo.getInt((String)((Map)localObject).get("MsgSyncSessionCount"), 50);
      oFi = bo.getInt((String)((Map)localObject).get("MsgSyncMsgCount"), 20);
      oFj = bo.getInt((String)((Map)localObject).get("MsgSyncSessionListCount"), 100);
      oFk = bo.getInt((String)((Map)localObject).get("MsgSyncTimeLimit"), 3);
      oFl = bo.getInt((String)((Map)localObject).get("MsgSyncAfterSleepSwitch"), 1);
      oFm = bo.getInt((String)((Map)localObject).get("MsgSyncGetMoreSwitch"), 1);
      oFn = bo.getInt((String)((Map)localObject).get("MsgSyncGetMoreMaxMsgCount"), 1000);
    }
    ab.i("MicroMsg.MsgSynchronizeConstants", "initMsgSynchronizeAbtest, SYNC_CLOSE:%d, WINDOWS_VERSION:%d, MAC_VERSION:%d, SESSION_COUNT:%d, MSG_COUNT%d, MSG_LIST_COUNT:%d, TIME_LIMIT:%d, AFTER_SLEEP_SWITCH:%d, GET_MORE_SWITCH:%d, GET_MORE_MAX_MSG_COUNT:%d", new Object[] { Integer.valueOf(oFe), Integer.valueOf(oFf), Integer.valueOf(oFg), Integer.valueOf(oFh), Integer.valueOf(oFi), Integer.valueOf(oFj), Integer.valueOf(oFk), Integer.valueOf(oFl), Integer.valueOf(oFm), Integer.valueOf(oFn) });
    AppMethodBeat.o(22890);
  }

  public static void l(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(22892);
    h.pYm.e(14108, new Object[] { Long.valueOf(0L), Long.valueOf(paramLong), Long.valueOf(0L), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(22892);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.q.b
 * JD-Core Version:    0.6.2
 */