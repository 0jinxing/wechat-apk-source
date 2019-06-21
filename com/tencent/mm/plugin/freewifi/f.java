package com.tencent.mm.plugin.freewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class f
{
  Lock aCZ;
  private WifiManager bJj;
  private BroadcastReceiver broadcastReceiver;
  Condition cbS;
  private Context context;
  private int mtM;

  public f(Context paramContext)
  {
    AppMethodBeat.i(20576);
    this.context = paramContext;
    this.aCZ = new ReentrantLock();
    this.cbS = this.aCZ.newCondition();
    this.bJj = ((WifiManager)ah.getContext().getSystemService("wifi"));
    this.mtM = 10;
    AppMethodBeat.o(20576);
  }

  public final void byc()
  {
    AppMethodBeat.i(20578);
    try
    {
      this.context.unregisterReceiver(this.broadcastReceiver);
      AppMethodBeat.o(20578);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        AppMethodBeat.o(20578);
    }
  }

  // ERROR //
  public final int bye()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: sipush 20577
    //   5: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: iconst_3
    //   9: aload_0
    //   10: getfield 62	com/tencent/mm/plugin/freewifi/f:bJj	Landroid/net/wifi/WifiManager;
    //   13: invokevirtual 84	android/net/wifi/WifiManager:getWifiState	()I
    //   16: if_icmpne +11 -> 27
    //   19: sipush 20577
    //   22: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: iload_1
    //   26: ireturn
    //   27: aload_0
    //   28: new 6	com/tencent/mm/plugin/freewifi/f$1
    //   31: dup
    //   32: aload_0
    //   33: invokespecial 87	com/tencent/mm/plugin/freewifi/f$1:<init>	(Lcom/tencent/mm/plugin/freewifi/f;)V
    //   36: putfield 73	com/tencent/mm/plugin/freewifi/f:broadcastReceiver	Landroid/content/BroadcastReceiver;
    //   39: aload_0
    //   40: getfield 36	com/tencent/mm/plugin/freewifi/f:aCZ	Ljava/util/concurrent/locks/Lock;
    //   43: invokeinterface 90 1 0
    //   48: new 92	android/content/IntentFilter
    //   51: astore_2
    //   52: aload_2
    //   53: invokespecial 93	android/content/IntentFilter:<init>	()V
    //   56: aload_2
    //   57: ldc 95
    //   59: invokevirtual 99	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   62: aload_0
    //   63: getfield 31	com/tencent/mm/plugin/freewifi/f:context	Landroid/content/Context;
    //   66: aload_0
    //   67: getfield 73	com/tencent/mm/plugin/freewifi/f:broadcastReceiver	Landroid/content/BroadcastReceiver;
    //   70: aload_2
    //   71: invokevirtual 103	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   74: pop
    //   75: aload_0
    //   76: getfield 62	com/tencent/mm/plugin/freewifi/f:bJj	Landroid/net/wifi/WifiManager;
    //   79: iconst_1
    //   80: invokevirtual 107	android/net/wifi/WifiManager:setWifiEnabled	(Z)Z
    //   83: pop
    //   84: aload_0
    //   85: getfield 44	com/tencent/mm/plugin/freewifi/f:cbS	Ljava/util/concurrent/locks/Condition;
    //   88: aload_0
    //   89: getfield 64	com/tencent/mm/plugin/freewifi/f:mtM	I
    //   92: i2l
    //   93: getstatic 113	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   96: invokeinterface 119 4 0
    //   101: istore_3
    //   102: iload_3
    //   103: ifeq +25 -> 128
    //   106: aload_0
    //   107: invokevirtual 121	com/tencent/mm/plugin/freewifi/f:byc	()V
    //   110: aload_0
    //   111: getfield 36	com/tencent/mm/plugin/freewifi/f:aCZ	Ljava/util/concurrent/locks/Lock;
    //   114: invokeinterface 124 1 0
    //   119: sipush 20577
    //   122: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: goto -100 -> 25
    //   128: aload_0
    //   129: invokevirtual 121	com/tencent/mm/plugin/freewifi/f:byc	()V
    //   132: aload_0
    //   133: getfield 36	com/tencent/mm/plugin/freewifi/f:aCZ	Ljava/util/concurrent/locks/Lock;
    //   136: invokeinterface 124 1 0
    //   141: sipush 20577
    //   144: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: iconst_1
    //   148: istore_1
    //   149: goto -124 -> 25
    //   152: astore_2
    //   153: aload_0
    //   154: invokevirtual 121	com/tencent/mm/plugin/freewifi/f:byc	()V
    //   157: aload_0
    //   158: getfield 36	com/tencent/mm/plugin/freewifi/f:aCZ	Ljava/util/concurrent/locks/Lock;
    //   161: invokeinterface 124 1 0
    //   166: iconst_2
    //   167: istore_1
    //   168: sipush 20577
    //   171: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: goto -149 -> 25
    //   177: astore_2
    //   178: aload_0
    //   179: invokevirtual 121	com/tencent/mm/plugin/freewifi/f:byc	()V
    //   182: aload_0
    //   183: getfield 36	com/tencent/mm/plugin/freewifi/f:aCZ	Ljava/util/concurrent/locks/Lock;
    //   186: invokeinterface 124 1 0
    //   191: sipush 20577
    //   194: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: aload_2
    //   198: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   39	102	152	java/lang/InterruptedException
    //   39	102	177	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.f
 * JD-Core Version:    0.6.2
 */