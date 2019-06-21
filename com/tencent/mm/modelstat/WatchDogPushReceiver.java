package com.tencent.mm.modelstat;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.a.a.a;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.text.SimpleDateFormat;
import java.util.Date;
import junit.framework.Assert;

public class WatchDogPushReceiver extends BroadcastReceiver
{
  private static String className = "";

  public static void a(h paramh)
  {
    AppMethodBeat.i(78804);
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ah.getPackageName(), getClassName()));
    localIntent.putExtra("type", 1);
    localIntent.putExtra("rtType", paramh.rtType);
    localIntent.putExtra("beginTime", paramh.beginTime);
    localIntent.putExtra("endTime", paramh.endTime);
    localIntent.putExtra("rtType", paramh.rtType);
    localIntent.putExtra("dataLen", paramh.fSW);
    localIntent.putExtra("isSend", paramh.cRY);
    localIntent.putExtra("cost", paramh.bZI);
    localIntent.putExtra("doSceneCount", paramh.fSX);
    ah.getContext().sendBroadcast(localIntent);
    AppMethodBeat.o(78804);
  }

  public static void akt()
  {
    AppMethodBeat.i(78805);
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ah.getPackageName(), getClassName()));
    localIntent.putExtra("type", 3);
    ah.getContext().sendBroadcast(localIntent);
    AppMethodBeat.o(78805);
  }

  public static void aku()
  {
    AppMethodBeat.i(78807);
    if (!b.dnO())
      AppMethodBeat.o(78807);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
      localIntent.setComponent(new ComponentName(ah.getPackageName(), getClassName()));
      localIntent.putExtra("type", 7);
      ah.getContext().sendBroadcast(localIntent);
      AppMethodBeat.o(78807);
    }
  }

  private static String getClassName()
  {
    AppMethodBeat.i(78803);
    if (bo.isNullOrNil(className))
      className = ah.getPackageName() + ".modelstat.WatchDogPushReceiver";
    String str = className;
    AppMethodBeat.o(78803);
    return str;
  }

  public static void mj(int paramInt)
  {
    AppMethodBeat.i(78806);
    if (!b.dnO())
      AppMethodBeat.o(78806);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
      localIntent.setComponent(new ComponentName(ah.getPackageName(), getClassName()));
      localIntent.putExtra("type", 5);
      localIntent.putExtra("jni", paramInt);
      ah.getContext().sendBroadcast(localIntent);
      AppMethodBeat.o(78806);
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(78802);
    if (paramIntent == null)
    {
      ab.e("MicroMsg.WatchDogPushReceiver", "onReceive intent == null");
      AppMethodBeat.o(78802);
    }
    while (true)
    {
      return;
      int i = paramIntent.getIntExtra("type", 0);
      ab.d("MicroMsg.WatchDogPushReceiver", "onReceive type:".concat(String.valueOf(i)));
      if (i == 1)
      {
        paramContext = new a.a();
        paramContext.rtType = paramIntent.getIntExtra("rtType", 0);
        paramContext.beginTime = paramIntent.getLongExtra("beginTime", 0L);
        paramContext.endTime = paramIntent.getLongExtra("endTime", 0L);
        boolean bool = paramIntent.getBooleanExtra("isSend", false);
        if (!bool)
          paramContext.geD = paramIntent.getLongExtra("dataLen", 0L);
        while (true)
        {
          paramContext.bZI = paramIntent.getLongExtra("cost", 0L);
          paramContext.geE = paramIntent.getLongExtra("doSceneCount", 0L);
          ab.d("MicroMsg.WatchDogPushReceiver", "onRecv: rtType:" + paramContext.rtType + " isSend:" + bool + " tx:" + paramContext.geC + " rx:" + paramContext.geD + " begin:" + paramContext.beginTime + " end:" + paramContext.endTime);
          if ((paramContext.geE != 0L) && (paramContext.rtType != 0L) && (paramContext.beginTime != 0L) && (paramContext.endTime != 0L) && (paramContext.endTime - paramContext.beginTime > 0L))
            break label352;
          ab.w("MicroMsg.WatchDogPushReceiver", "onRecv: count:" + paramContext.geE + " rtType:" + paramContext.rtType + " begin:" + paramContext.beginTime + " end:" + paramContext.endTime);
          AppMethodBeat.o(78802);
          break;
          paramContext.geC = paramIntent.getLongExtra("dataLen", 0L);
        }
        label352: AppMethodBeat.o(78802);
      }
      else if ((i != 2) && (i != 3) && (i != 4))
      {
        if ((i == 5) && (b.dnO()))
        {
          if (paramIntent.getIntExtra("jni", 1) == 1)
          {
            Assert.assertTrue("test errlog push " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), false);
            AppMethodBeat.o(78802);
          }
          else
          {
            MMProtocalJni.setClientPackVersion(-1);
            AppMethodBeat.o(78802);
          }
        }
        else if (i == 6)
          ab.dot();
      }
      else
      {
        AppMethodBeat.o(78802);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.WatchDogPushReceiver
 * JD-Core Version:    0.6.2
 */