package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class e
{
  Lock aCZ;
  private Activity activity;
  private WifiManager bJj;
  private BroadcastReceiver broadcastReceiver;
  Condition cbS;
  private int mtM;

  public e(Activity paramActivity)
  {
    AppMethodBeat.i(20572);
    this.activity = paramActivity;
    this.aCZ = new ReentrantLock();
    this.cbS = this.aCZ.newCondition();
    this.bJj = ((WifiManager)ah.getContext().getSystemService("wifi"));
    this.mtM = 10;
    AppMethodBeat.o(20572);
  }

  public final void byc()
  {
    AppMethodBeat.i(20574);
    try
    {
      this.activity.unregisterReceiver(this.broadcastReceiver);
      AppMethodBeat.o(20574);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        AppMethodBeat.o(20574);
    }
  }

  // ERROR //
  public final int bye()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: sipush 20573
    //   5: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: iconst_3
    //   9: aload_0
    //   10: getfield 60	com/tencent/mm/plugin/freewifi/e:bJj	Landroid/net/wifi/WifiManager;
    //   13: invokevirtual 84	android/net/wifi/WifiManager:getWifiState	()I
    //   16: if_icmpne +11 -> 27
    //   19: sipush 20573
    //   22: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: iload_1
    //   26: ireturn
    //   27: aload_0
    //   28: new 86	com/tencent/mm/plugin/freewifi/e$1
    //   31: dup
    //   32: aload_0
    //   33: invokespecial 89	com/tencent/mm/plugin/freewifi/e$1:<init>	(Lcom/tencent/mm/plugin/freewifi/e;)V
    //   36: putfield 71	com/tencent/mm/plugin/freewifi/e:broadcastReceiver	Landroid/content/BroadcastReceiver;
    //   39: aload_0
    //   40: getfield 34	com/tencent/mm/plugin/freewifi/e:aCZ	Ljava/util/concurrent/locks/Lock;
    //   43: invokeinterface 92 1 0
    //   48: new 94	android/content/IntentFilter
    //   51: astore_2
    //   52: aload_2
    //   53: invokespecial 95	android/content/IntentFilter:<init>	()V
    //   56: aload_2
    //   57: ldc 97
    //   59: invokevirtual 101	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   62: aload_0
    //   63: getfield 29	com/tencent/mm/plugin/freewifi/e:activity	Landroid/app/Activity;
    //   66: aload_0
    //   67: getfield 71	com/tencent/mm/plugin/freewifi/e:broadcastReceiver	Landroid/content/BroadcastReceiver;
    //   70: aload_2
    //   71: invokevirtual 105	android/app/Activity:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   74: pop
    //   75: aload_0
    //   76: getfield 60	com/tencent/mm/plugin/freewifi/e:bJj	Landroid/net/wifi/WifiManager;
    //   79: iconst_1
    //   80: invokevirtual 109	android/net/wifi/WifiManager:setWifiEnabled	(Z)Z
    //   83: pop
    //   84: aload_0
    //   85: getfield 42	com/tencent/mm/plugin/freewifi/e:cbS	Ljava/util/concurrent/locks/Condition;
    //   88: aload_0
    //   89: getfield 62	com/tencent/mm/plugin/freewifi/e:mtM	I
    //   92: i2l
    //   93: getstatic 115	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   96: invokeinterface 121 4 0
    //   101: istore_3
    //   102: iload_3
    //   103: ifeq +25 -> 128
    //   106: aload_0
    //   107: invokevirtual 123	com/tencent/mm/plugin/freewifi/e:byc	()V
    //   110: aload_0
    //   111: getfield 34	com/tencent/mm/plugin/freewifi/e:aCZ	Ljava/util/concurrent/locks/Lock;
    //   114: invokeinterface 126 1 0
    //   119: sipush 20573
    //   122: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: goto -100 -> 25
    //   128: aload_0
    //   129: invokevirtual 123	com/tencent/mm/plugin/freewifi/e:byc	()V
    //   132: aload_0
    //   133: getfield 34	com/tencent/mm/plugin/freewifi/e:aCZ	Ljava/util/concurrent/locks/Lock;
    //   136: invokeinterface 126 1 0
    //   141: sipush 20573
    //   144: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: iconst_1
    //   148: istore_1
    //   149: goto -124 -> 25
    //   152: astore_2
    //   153: aload_0
    //   154: invokevirtual 123	com/tencent/mm/plugin/freewifi/e:byc	()V
    //   157: aload_0
    //   158: getfield 34	com/tencent/mm/plugin/freewifi/e:aCZ	Ljava/util/concurrent/locks/Lock;
    //   161: invokeinterface 126 1 0
    //   166: iconst_2
    //   167: istore_1
    //   168: sipush 20573
    //   171: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: goto -149 -> 25
    //   177: astore_2
    //   178: aload_0
    //   179: invokevirtual 123	com/tencent/mm/plugin/freewifi/e:byc	()V
    //   182: aload_0
    //   183: getfield 34	com/tencent/mm/plugin/freewifi/e:aCZ	Ljava/util/concurrent/locks/Lock;
    //   186: invokeinterface 126 1 0
    //   191: sipush 20573
    //   194: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: aload_2
    //   198: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   39	102	152	java/lang/InterruptedException
    //   39	102	177	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e
 * JD-Core Version:    0.6.2
 */