package com.tencent.mm.modelmulti;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class NotifyFreqLimit extends BroadcastReceiver
{
  private static long beginTime;
  private static byte[] eMl;
  private static NotifyFreqLimit.a fIM;
  private static l fIN;
  private static int fIO;
  private static long[] fIP;
  private static LinkedList<Object> fIQ;
  private static int fIR;
  private static Boolean fIS;
  private static Boolean fIT;
  private static long fIU;
  private static PendingIntent fIV;

  static
  {
    AppMethodBeat.i(16504);
    eMl = new byte[0];
    fIM = null;
    fIN = null;
    fIO = 0;
    fIP = null;
    fIQ = new LinkedList();
    fIR = 0;
    beginTime = 0L;
    fIS = null;
    fIT = null;
    fIU = 0L;
    fIV = null;
    AppMethodBeat.o(16504);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(16503);
    try
    {
      arrayOfByte = eMl;
      if (paramIntent == null);
    }
    catch (Throwable paramContext)
    {
      try
      {
        if (!"com.tencent.mm.NotifyFreqLimit.AlarmReceiver".equals(paramIntent.getAction()))
          if (paramIntent == null)
          {
            paramContext = "intent is null";
            ab.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver onReceive intent:%s", new Object[] { paramContext });
          }
        while (true)
        {
          return;
          paramContext = paramIntent.getAction();
          break;
          long l1 = paramIntent.getLongExtra("hashCode", 0L);
          long l2 = bo.anU() - l1;
          int i = paramIntent.getIntExtra("pid", 0);
          long l3 = paramIntent.getLongExtra("delaySecond", 0L) * 1000L;
          int j = Process.myPid();
          long l4 = Thread.currentThread().getId();
          ab.i("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l4), Long.valueOf(l2), Long.valueOf(l3), fIV, fIM });
          if (fIV == null)
          {
            h.pYm.a(99L, 156L, 1L, false);
            ab.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive ERR: SENDER NULL alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l4), Long.valueOf(l2), Long.valueOf(l3), fIV, fIM });
            AppMethodBeat.o(16503);
          }
          else
          {
            fIV = null;
            if (j != i)
            {
              h.pYm.a(99L, 159L, 1L, false);
              ab.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive ERR: DIFF PID alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l4), Long.valueOf(l2), Long.valueOf(l3), fIV, fIM });
              AppMethodBeat.o(16503);
            }
            else
            {
              if ((5L * l3 < l2) || (180000L + l3 < l2))
              {
                ab.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive ERR: ALARM DELAY TOO MUCH alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l4), Long.valueOf(l2), Long.valueOf(l3), fIV, fIM });
                fIT = Boolean.FALSE;
                paramIntent = ah.getContext().getSharedPreferences("NOTIFY_FREQ_LIMIT_INFO", 0);
                paramContext = bo.nullAsNil(paramIntent.getString("NOTIFY_FREQ_LIMIT_CLOSE_BY_ALARM_FAILED_KEY", ""));
                paramIntent = paramIntent.edit();
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                paramIntent.putString("NOTIFY_FREQ_LIMIT_CLOSE_BY_ALARM_FAILED_KEY", bo.anU() + "," + paramContext);
                paramIntent.commit();
                if (bo.isNullOrNil(paramContext))
                  h.pYm.e(11098, new Object[] { Integer.valueOf(3103) });
                ab.i("MicroMsg.NotifyFreqLimit", "setAlarmFailed end isAlarmCanUse:%s shared_pref:%s", new Object[] { fIT, paramContext });
              }
              if (fIM == null)
              {
                h.pYm.a(99L, 157L, 1L, false);
                ab.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive ERR: FUNC NULL alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l4), Long.valueOf(l2), Long.valueOf(l3), fIV, fIM });
              }
              AppMethodBeat.o(16503);
              continue;
              paramContext = paramContext;
              fIV = null;
              h.pYm.a(99L, 151L, 1L, false);
              ab.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver onReceive e:%s", new Object[] { bo.l(paramContext) });
              AppMethodBeat.o(16503);
            }
          }
        }
      }
      finally
      {
        byte[] arrayOfByte;
        AppMethodBeat.o(16503);
      }
    }
    throw paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.NotifyFreqLimit
 * JD-Core Version:    0.6.2
 */