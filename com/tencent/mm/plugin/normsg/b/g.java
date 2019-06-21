package com.tencent.mm.plugin.normsg.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.reflect.Field;
import java.util.List;

public final class g
{
  public static boolean oVi;

  static
  {
    AppMethodBeat.i(10441);
    oVi = false;
    long l = System.nanoTime();
    try
    {
      oVi = false;
      if (Build.VERSION.SDK_INT < 21);
      for (oVi = false; ; oVi = false)
      {
        return;
        localField = ActivityManager.RecentTaskInfo.class.getDeclaredField("instanceId");
        localField.setAccessible(true);
        List localList = ((ActivityManager)ah.getContext().getApplicationContext().getSystemService("activity")).getRecentTasks(1, 2);
        if ((localList != null) && (localList.size() != 0))
          break;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Field localField;
        oVi = false;
        ab.i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", new Object[] { Boolean.valueOf(oVi), Long.valueOf(System.nanoTime() - l) });
        AppMethodBeat.o(10441);
        continue;
        if (localField.getInt((ActivityManager.RecentTaskInfo)localThrowable.get(0)) > 0)
          oVi = true;
      }
    }
    finally
    {
      ab.i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", new Object[] { Boolean.valueOf(oVi), Long.valueOf(System.nanoTime() - l) });
      AppMethodBeat.o(10441);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.g
 * JD-Core Version:    0.6.2
 */