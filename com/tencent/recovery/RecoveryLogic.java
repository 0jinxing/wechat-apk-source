package com.tencent.recovery;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryData;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.service.RecoveryHandleService;
import com.tencent.recovery.service.RecoveryReportService;
import com.tencent.recovery.service.RecoveryUploadService;
import com.tencent.recovery.util.Util;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecoveryLogic
{
  public static Field AqY = null;
  public static int AqZ = 17;

  public static void a(Context paramContext, ArrayList<RecoveryHandleItem> paramArrayList, String paramString)
  {
    RecoveryLog.i("Recovery.RecoveryLogic", "startReportService %s", new Object[] { "HandleStatus" });
    Intent localIntent = new Intent(paramContext, RecoveryReportService.class);
    localIntent.putExtra("KeyReportType", "HandleStatus");
    localIntent.putExtra("KeyReportUploadClassName", paramString);
    localIntent.putParcelableArrayListExtra("KeyReportItem", paramArrayList);
    paramContext.startService(localIntent);
  }

  public static boolean a(Context paramContext, CommonOptions paramCommonOptions, RecoveryContext paramRecoveryContext)
  {
    boolean bool = false;
    if (paramCommonOptions.Aro == null)
    {
      RecoveryLog.i("Recovery.RecoveryLogic", "startRecoveryProcess not set handle service", new Object[0]);
      return bool;
    }
    RecoveryLog.i("Recovery.RecoveryLogic", "startHandleService %s", new Object[] { Util.iC(paramContext) });
    String str1;
    if (Util.isNullOrNil(paramCommonOptions.Arp))
    {
      str1 = RecoveryUploadService.class.getName();
      label57: if (!Util.isNullOrNil(paramCommonOptions.Aro))
        break label193;
    }
    label193: for (String str2 = RecoveryHandleService.class.getName(); ; str2 = paramCommonOptions.Aro)
    {
      RecoveryData localRecoveryData = new RecoveryData();
      localRecoveryData.processName = Util.iC(paramContext);
      localRecoveryData.eCq = paramCommonOptions.eCq;
      localRecoveryData.Arl = paramCommonOptions.Arl;
      localRecoveryData.Arm = paramRecoveryContext.AqX;
      localRecoveryData.clientVersion = paramCommonOptions.clientVersion;
      paramRecoveryContext = new Intent();
      paramRecoveryContext.setClassName(paramContext, paramCommonOptions.Aro);
      paramRecoveryContext.putExtra("KeyReportUploadClassName", str1);
      paramRecoveryContext.putExtra("KeyReportHandleClassName", str2);
      paramRecoveryContext.putExtra("KeyRecoveryData", localRecoveryData);
      paramContext.startService(paramRecoveryContext);
      bool = true;
      break;
      str1 = paramCommonOptions.Arp;
      break label57;
    }
  }

  public static int bW(Context paramContext, String paramString)
  {
    int i;
    if (AqZ != 17)
      i = AqZ;
    while (true)
    {
      return i;
      AqZ = 16;
      if (AqY == null);
      try
      {
        AqY = ActivityManager.RunningAppProcessInfo.class.getDeclaredField("processState");
        if (AqY != null)
          paramContext = (ActivityManager)paramContext.getSystemService("activity");
        while (true)
        {
          Iterator localIterator;
          try
          {
            paramContext = paramContext.getRunningAppProcesses();
            if ((paramContext == null) || (paramContext.isEmpty()))
            {
              RecoveryLog.i("Recovery.RecoveryLogic", "can not get running app process", new Object[0]);
              i = AqZ;
            }
          }
          catch (Exception paramContext)
          {
            paramContext = null;
            continue;
            localIterator = paramContext.iterator();
          }
          label100: Object localObject1;
          do
          {
            if (!localIterator.hasNext())
              break;
            localObject1 = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          }
          while ((localObject1 == null) || (((ActivityManager.RunningAppProcessInfo)localObject1).importance != 100) || (((ActivityManager.RunningAppProcessInfo)localObject1).importanceReasonCode != 0));
          try
          {
            i = AqY.getInt(localObject1);
            Object localObject2 = Integer.valueOf(i);
            if ((localObject2 == null) || (((Integer)localObject2).intValue() != 2))
              break label100;
            localObject2 = localObject1;
            if (localObject2 != null)
            {
              RecoveryLog.i("Recovery.RecoveryLogic", "%s %s", new Object[] { paramString, ((ActivityManager.RunningAppProcessInfo)localObject2).processName });
              if (!paramString.equals(((ActivityManager.RunningAppProcessInfo)localObject2).processName))
                continue;
              AqZ = 1;
            }
          }
          catch (Exception localException1)
          {
            while (true)
              localStringBuffer = null;
            StringBuffer localStringBuffer = new StringBuffer();
            localObject1 = paramContext.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              paramString = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject1).next();
              if (paramString != null)
                localStringBuffer.append(paramString.processName + ":" + paramString.importance + " ");
            }
            RecoveryLog.i("Recovery.RecoveryLogic", "foregroundInfo is null %s %s", new Object[] { Integer.valueOf(paramContext.size()), localStringBuffer.toString() });
          }
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          continue;
          Object localObject3 = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.RecoveryLogic
 * JD-Core Version:    0.6.2
 */