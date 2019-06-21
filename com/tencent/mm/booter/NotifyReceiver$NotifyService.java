package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelmulti.k;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.plugin.zero.PluginZero.b;
import com.tencent.mm.protocal.x.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.service.MMService;

public class NotifyReceiver$NotifyService extends MMService
{
  Boolean ecl = null;
  private com.tencent.mm.kernel.api.g ecm;

  private static void A(Context paramContext, String paramString)
  {
    AppMethodBeat.i(57797);
    synchronized (NotifyReceiver.access$400())
    {
      if (NotifyReceiver.Ir() == null)
      {
        WakerLock localWakerLock = new com/tencent/mars/comm/WakerLock;
        localWakerLock.<init>(paramContext, "MicroMsg.NotifyReceiver");
        NotifyReceiver.b(localWakerLock);
      }
      NotifyReceiver.Ir().lock(60000L, paramString);
      AppMethodBeat.o(57797);
      return;
    }
  }

  private static void bt(Context paramContext)
  {
    AppMethodBeat.i(57800);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NotifyReceiver", "dealWithLooper");
    if ((!com.tencent.mm.kernel.g.RK()) || (com.tencent.mm.kernel.a.QT()))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NotifyReceiver", "receiveImp hasSetuin:" + com.tencent.mm.kernel.g.RK() + " isHold:" + com.tencent.mm.kernel.a.QT());
      AppMethodBeat.o(57800);
    }
    while (true)
    {
      return;
      if ((com.tencent.mm.kernel.g.Rg().foreground) || (!com.tencent.mm.network.ab.cg(paramContext)))
      {
        ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.b.class)).ahW().lN(2);
        AppMethodBeat.o(57800);
      }
      else
      {
        com.tencent.mm.kernel.g.Rg().a(new com.tencent.mm.modelmulti.i(), 0);
        AppMethodBeat.o(57800);
      }
    }
  }

  public static void jG(String paramString)
  {
    AppMethodBeat.i(57795);
    synchronized (NotifyReceiver.Ip())
    {
      if (NotifyReceiver.Iq() == null)
      {
        WakerLock localWakerLock = new com/tencent/mars/comm/WakerLock;
        localWakerLock.<init>(ah.getContext(), "MicroMsg.NotifyReceiver");
        NotifyReceiver.a(localWakerLock);
      }
      NotifyReceiver.Iq().lock(5000L, paramString);
      AppMethodBeat.o(57795);
      return;
    }
  }

  private void o(Intent paramIntent)
  {
    AppMethodBeat.i(57792);
    if (paramIntent == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NotifyReceiver", "receiveImp receiveIntent == null");
      AppMethodBeat.o(57792);
      return;
    }
    if (!com.tencent.mm.kernel.g.RQ().eKi.eKC)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NotifyReceiver", "summerboot WorkerProfile not has create, status %d", new Object[] { Integer.valueOf(0) });
      if (this.ecm != null)
        com.tencent.mm.kernel.g.RQ().b(this.ecm);
      this.ecm = new NotifyReceiver.NotifyService.1(this, System.currentTimeMillis(), paramIntent);
      com.tencent.mm.kernel.g.RQ().a(this.ecm);
      com.tencent.mm.plugin.report.e.pXa.a(99L, 213L, 1L, false);
    }
    for (int i = -1; ; i = 0)
    {
      if (i < 0)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NotifyReceiver", "summerboot status %s", new Object[] { Integer.valueOf(-1) });
        AppMethodBeat.o(57792);
        break;
      }
      p(paramIntent);
      AppMethodBeat.o(57792);
      break;
    }
  }

  private void p(Intent paramIntent)
  {
    AppMethodBeat.i(57793);
    int i = paramIntent.getIntExtra("notify_option_type", 0);
    if (i == 0)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NotifyReceiver", "receiveImp invalid opcode.");
      AppMethodBeat.o(57793);
    }
    while (true)
    {
      label29: return;
      if ((com.tencent.mm.kernel.g.RK()) && (!com.tencent.mm.kernel.a.QT()))
        break;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NotifyReceiver", "receiveImp hasSetuin:%b  isHold:%b  opcode:%d", new Object[] { Boolean.valueOf(com.tencent.mm.kernel.g.RK()), Boolean.valueOf(com.tencent.mm.kernel.a.QT()), Integer.valueOf(i) });
      AppMethodBeat.o(57793);
    }
    if (com.tencent.mm.kernel.g.Rg().ftA == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NotifyReceiver", "receiveImp  opcode:%d  getDispatcher == null", new Object[] { Integer.valueOf(i) });
      com.tencent.mm.kernel.g.Rg().cD(true);
    }
    if (this.ecl == null)
      if (!com.tencent.mm.sdk.a.b.dnO())
        break label215;
    label215: label345: 
    while (true)
    {
      for (boolean bool = false; ; bool = true)
      {
        this.ecl = Boolean.valueOf(bool);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NotifyReceiver", "handleCommand useOld:%s operationCode:%d", new Object[] { this.ecl, Integer.valueOf(i) });
        switch (i)
        {
        default:
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NotifyReceiver", "invald opCode:".concat(String.valueOf(i)));
          AppMethodBeat.o(57793);
          break label29;
          int j = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("AndroidOldNotifyReceiver"), 0);
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RN();
          if (j <= com.tencent.mm.a.i.bL(com.tencent.mm.kernel.a.QF(), 100))
            break label345;
        case 1:
        case 2:
        }
      }
      if (this.ecl.booleanValue())
        z(ah.getContext(), "NotifyReceiver.handleCommand:NOTIFY_OPCODE_NETWORK_AVAILABLE");
      bt(ah.getContext());
      AppMethodBeat.o(57793);
      break;
      if (this.ecl.booleanValue())
      {
        z(ah.getContext(), "NotifyReceiver.handleCommand:NOTIFY_OPCODE_NOTIFY");
        r(paramIntent);
        AppMethodBeat.o(57793);
        break;
      }
      q(paramIntent);
      AppMethodBeat.o(57793);
      break;
    }
  }

  private void q(Intent paramIntent)
  {
    AppMethodBeat.i(57798);
    int i = paramIntent.getIntExtra("notify_respType", 0);
    byte[] arrayOfByte1 = paramIntent.getByteArrayExtra("notify_respBuf");
    byte[] arrayOfByte2 = paramIntent.getByteArrayExtra("notify_skey");
    long l = paramIntent.getLongExtra("notfiy_recv_time", -1L);
    int j;
    int k;
    if (arrayOfByte1 == null)
    {
      j = -1;
      if (arrayOfByte2 != null)
        break label157;
      k = -1;
      label59: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NotifyReceiver", "dealWithNotify respType:%d recvTime:%d respBuf:%d sessionkey:%s ", new Object[] { Integer.valueOf(i), Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(k) });
      if (!bo.cb(arrayOfByte2))
        break label165;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify session null and ret sessionKey:" + arrayOfByte2 + " respType:" + i);
      AppMethodBeat.o(57798);
    }
    while (true)
    {
      return;
      j = arrayOfByte1.length;
      break;
      label157: k = arrayOfByte2.length;
      break label59;
      switch (i)
      {
      default:
        ((PluginZero)com.tencent.mm.kernel.g.M(PluginZero.class)).uZU.a(this, i, arrayOfByte1, arrayOfByte2, l);
        AppMethodBeat.o(57798);
        break;
      case 268369921:
        if ((bo.cb(arrayOfByte1)) || (arrayOfByte1.length <= 8))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify respBuf error ");
          AppMethodBeat.o(57798);
        }
        else
        {
          k = com.tencent.mm.a.o.t(arrayOfByte1, 0);
          j = com.tencent.mm.a.o.t(arrayOfByte1, 4);
          if (j != arrayOfByte1.length - 8)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NotifyReceiver", "dkpush: respBuf length error len:" + arrayOfByte1.length);
            AppMethodBeat.o(57798);
          }
          else
          {
            paramIntent = new byte[j];
            System.arraycopy(arrayOfByte1, 8, paramIntent, 0, j);
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NotifyReceiver", "dkpush PUSHDATA flag:%d bufLen:%d respBuf:%d recvTime:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(arrayOfByte1.length), Long.valueOf(l) });
            k.b(k, paramIntent, arrayOfByte2, l);
            AppMethodBeat.o(57798);
          }
        }
        break;
      case 138:
        if (arrayOfByte1 == null)
        {
          j = 7;
          if (arrayOfByte1 != null)
            break label512;
          k = 2;
          if (arrayOfByte1 != null)
            break label518;
        }
        for (i = -1; ; i = arrayOfByte1.length)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NotifyReceiver", "dkpush NOTIFY or SyncCheck selector:%d scnen:%d  respBuf:%d ", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i) });
          ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.b.class)).ahW().a(j, k, "");
          AppMethodBeat.o(57798);
          break;
          j = com.tencent.mm.a.o.t(arrayOfByte1, 0);
          break label420;
          k = 1;
          break label427;
        }
      case 2147480001:
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NotifyReceiver", "dkpush FCM Notify");
        ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.b.class)).ahW().a(7L, 16, "");
        AppMethodBeat.o(57798);
        break;
      case 1000000205:
        label512: label518: paramIntent = new StringBuilder("oreh on newsynccheck2 notify, notify=");
        if (arrayOfByte1 != null);
        for (boolean bool = true; ; bool = false)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NotifyReceiver", bool);
          paramIntent = new x.b();
          ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.b.class)).ahW().a(paramIntent.vyM, 1, paramIntent.dmu());
          AppMethodBeat.o(57798);
          break;
        }
      case 39:
        label165: label427: com.tencent.mm.kernel.g.Rg().a(new com.tencent.mm.modelmulti.i(), 0);
        label420: AppMethodBeat.o(57798);
      }
    }
  }

  // ERROR //
  private void r(Intent paramIntent)
  {
    // Byte code:
    //   0: ldc_w 429
    //   3: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ldc_w 330
    //   10: iconst_0
    //   11: invokevirtual 236	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   14: istore_2
    //   15: aload_1
    //   16: ldc_w 332
    //   19: invokevirtual 336	android/content/Intent:getByteArrayExtra	(Ljava/lang/String;)[B
    //   22: astore_3
    //   23: aload_1
    //   24: ldc_w 338
    //   27: invokevirtual 336	android/content/Intent:getByteArrayExtra	(Ljava/lang/String;)[B
    //   30: astore 4
    //   32: aload_1
    //   33: ldc_w 340
    //   36: ldc2_w 341
    //   39: invokevirtual 346	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   42: lstore 5
    //   44: aload_3
    //   45: ifnonnull +132 -> 177
    //   48: iconst_m1
    //   49: istore 7
    //   51: ldc 39
    //   53: ldc_w 348
    //   56: iconst_4
    //   57: anewarray 187	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: iload_2
    //   63: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: aastore
    //   67: dup
    //   68: iconst_1
    //   69: lload 5
    //   71: invokestatic 353	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   74: aastore
    //   75: dup
    //   76: iconst_2
    //   77: iload 7
    //   79: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   82: aastore
    //   83: dup
    //   84: iconst_3
    //   85: aload 4
    //   87: invokestatic 433	com/tencent/mm/sdk/platformtools/bo:cd	([B)Ljava/lang/String;
    //   90: invokestatic 436	com/tencent/mm/sdk/platformtools/bo:anv	(Ljava/lang/String;)Ljava/lang/String;
    //   93: aastore
    //   94: invokestatic 266	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: iload_2
    //   98: lookupswitch	default:+50->148, 39:+770->868, 138:+345->443, 268369921:+86->184, 1000000205:+549->647, 2147480001:+794->892
    //   149: aconst_null
    //   150: lrem
    //   151: invokestatic 373	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   154: checkcast 369	com/tencent/mm/plugin/zero/PluginZero
    //   157: getfield 377	com/tencent/mm/plugin/zero/PluginZero:uZU	Lcom/tencent/mm/plugin/zero/PluginZero$b;
    //   160: aload_0
    //   161: iload_2
    //   162: aload_3
    //   163: aload 4
    //   165: lload 5
    //   167: invokevirtual 382	com/tencent/mm/plugin/zero/PluginZero$b:a	(Lcom/tencent/mm/booter/NotifyReceiver$NotifyService;I[B[BJ)V
    //   170: ldc_w 429
    //   173: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: return
    //   177: aload_3
    //   178: arraylength
    //   179: istore 7
    //   181: goto -130 -> 51
    //   184: aload 4
    //   186: invokestatic 357	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   189: ifeq +28 -> 217
    //   192: ldc 39
    //   194: ldc_w 438
    //   197: aload 4
    //   199: invokestatic 441	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   202: invokevirtual 277	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   205: invokestatic 170	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   208: ldc_w 429
    //   211: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   214: goto -38 -> 176
    //   217: aload_3
    //   218: invokestatic 357	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   221: ifne +10 -> 231
    //   224: aload_3
    //   225: arraylength
    //   226: bipush 8
    //   228: if_icmpgt +20 -> 248
    //   231: ldc 39
    //   233: ldc_w 384
    //   236: invokestatic 170	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: ldc_w 429
    //   242: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   245: goto -69 -> 176
    //   248: aload_3
    //   249: iconst_0
    //   250: invokestatic 390	com/tencent/mm/a/o:t	([BI)I
    //   253: istore 7
    //   255: aload_3
    //   256: iconst_4
    //   257: invokestatic 390	com/tencent/mm/a/o:t	([BI)I
    //   260: istore_2
    //   261: iload_2
    //   262: aload_3
    //   263: arraylength
    //   264: bipush 8
    //   266: isub
    //   267: if_icmpeq +35 -> 302
    //   270: ldc 39
    //   272: new 87	java/lang/StringBuilder
    //   275: dup
    //   276: ldc_w 392
    //   279: invokespecial 92	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   282: aload_3
    //   283: arraylength
    //   284: invokevirtual 367	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   287: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   290: invokestatic 170	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   293: ldc_w 429
    //   296: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   299: goto -123 -> 176
    //   302: iload_2
    //   303: newarray byte
    //   305: astore_1
    //   306: aload_3
    //   307: bipush 8
    //   309: aload_1
    //   310: iconst_0
    //   311: iload_2
    //   312: invokestatic 396	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   315: ldc 39
    //   317: ldc_w 398
    //   320: iconst_4
    //   321: anewarray 187	java/lang/Object
    //   324: dup
    //   325: iconst_0
    //   326: iload 7
    //   328: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   331: aastore
    //   332: dup
    //   333: iconst_1
    //   334: iload_2
    //   335: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   338: aastore
    //   339: dup
    //   340: iconst_2
    //   341: aload_3
    //   342: arraylength
    //   343: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   346: aastore
    //   347: dup
    //   348: iconst_3
    //   349: lload 5
    //   351: invokestatic 353	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   354: aastore
    //   355: invokestatic 266	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   358: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   361: invokeinterface 449 1 0
    //   366: iload 7
    //   368: aload_1
    //   369: aload 4
    //   371: lload 5
    //   373: invokestatic 403	com/tencent/mm/modelmulti/k:b	(I[B[BJ)V
    //   376: invokestatic 453	com/tencent/mm/booter/NotifyReceiver:It	()Ljava/util/Set;
    //   379: lload 5
    //   381: invokestatic 353	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   384: invokeinterface 459 2 0
    //   389: pop
    //   390: invokestatic 160	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   393: ldc_w 461
    //   396: invokestatic 463	com/tencent/mm/booter/NotifyReceiver$NotifyService:A	(Landroid/content/Context;Ljava/lang/String;)V
    //   399: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   402: invokeinterface 466 1 0
    //   407: ldc_w 429
    //   410: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   413: goto -237 -> 176
    //   416: astore_1
    //   417: ldc_w 429
    //   420: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   423: goto -247 -> 176
    //   426: astore_3
    //   427: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   430: invokeinterface 466 1 0
    //   435: ldc_w 429
    //   438: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   441: aload_3
    //   442: athrow
    //   443: aload_3
    //   444: ifnonnull +154 -> 598
    //   447: bipush 7
    //   449: istore 7
    //   451: aload_3
    //   452: ifnonnull +156 -> 608
    //   455: iconst_2
    //   456: istore_2
    //   457: aload_3
    //   458: ifnonnull +155 -> 613
    //   461: iconst_m1
    //   462: istore 8
    //   464: ldc 39
    //   466: ldc_w 405
    //   469: iconst_3
    //   470: anewarray 187	java/lang/Object
    //   473: dup
    //   474: iconst_0
    //   475: iload 7
    //   477: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   480: aastore
    //   481: dup
    //   482: iconst_1
    //   483: iload_2
    //   484: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   487: aastore
    //   488: dup
    //   489: iconst_2
    //   490: iload 8
    //   492: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   495: aastore
    //   496: invokestatic 469	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   499: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   502: invokeinterface 449 1 0
    //   507: ldc 126
    //   509: invokestatic 130	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   512: checkcast 126	com/tencent/mm/plugin/zero/b/b
    //   515: invokeinterface 134 1 0
    //   520: iload 7
    //   522: i2l
    //   523: iload_2
    //   524: ldc_w 407
    //   527: invokevirtual 410	com/tencent/mm/modelmulti/o:a	(JILjava/lang/String;)I
    //   530: istore 7
    //   532: iload 7
    //   534: ifle +47 -> 581
    //   537: ldc 39
    //   539: ldc_w 471
    //   542: iconst_1
    //   543: anewarray 187	java/lang/Object
    //   546: dup
    //   547: iconst_0
    //   548: iload 7
    //   550: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   553: aastore
    //   554: invokestatic 469	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   557: invokestatic 453	com/tencent/mm/booter/NotifyReceiver:It	()Ljava/util/Set;
    //   560: iload 7
    //   562: i2l
    //   563: invokestatic 353	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   566: invokeinterface 459 2 0
    //   571: pop
    //   572: invokestatic 160	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   575: ldc_w 473
    //   578: invokestatic 463	com/tencent/mm/booter/NotifyReceiver$NotifyService:A	(Landroid/content/Context;Ljava/lang/String;)V
    //   581: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   584: invokeinterface 466 1 0
    //   589: ldc_w 429
    //   592: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   595: goto -419 -> 176
    //   598: aload_3
    //   599: iconst_0
    //   600: invokestatic 390	com/tencent/mm/a/o:t	([BI)I
    //   603: istore 7
    //   605: goto -154 -> 451
    //   608: iconst_1
    //   609: istore_2
    //   610: goto -153 -> 457
    //   613: aload_3
    //   614: arraylength
    //   615: istore 8
    //   617: goto -153 -> 464
    //   620: astore_1
    //   621: ldc_w 429
    //   624: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   627: goto -451 -> 176
    //   630: astore_1
    //   631: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   634: invokeinterface 466 1 0
    //   639: ldc_w 429
    //   642: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   645: aload_1
    //   646: athrow
    //   647: new 87	java/lang/StringBuilder
    //   650: dup
    //   651: ldc_w 416
    //   654: invokespecial 92	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   657: astore_1
    //   658: aload_3
    //   659: ifnull +135 -> 794
    //   662: iconst_1
    //   663: istore 9
    //   665: ldc 39
    //   667: aload_1
    //   668: iload 9
    //   670: invokevirtual 96	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   673: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   676: invokestatic 475	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   679: new 418	com/tencent/mm/protocal/x$b
    //   682: dup
    //   683: invokespecial 419	com/tencent/mm/protocal/x$b:<init>	()V
    //   686: astore_1
    //   687: aload_1
    //   688: aload_3
    //   689: invokevirtual 479	com/tencent/mm/protocal/x$b:P	([B)I
    //   692: pop
    //   693: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   696: invokeinterface 449 1 0
    //   701: ldc 126
    //   703: invokestatic 130	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   706: checkcast 126	com/tencent/mm/plugin/zero/b/b
    //   709: invokeinterface 134 1 0
    //   714: aload_1
    //   715: getfield 423	com/tencent/mm/protocal/x$b:vyM	J
    //   718: iconst_1
    //   719: aload_1
    //   720: invokevirtual 426	com/tencent/mm/protocal/x$b:dmu	()Ljava/lang/String;
    //   723: invokevirtual 410	com/tencent/mm/modelmulti/o:a	(JILjava/lang/String;)I
    //   726: istore 7
    //   728: iload 7
    //   730: ifle +47 -> 777
    //   733: ldc 39
    //   735: ldc_w 471
    //   738: iconst_1
    //   739: anewarray 187	java/lang/Object
    //   742: dup
    //   743: iconst_0
    //   744: iload 7
    //   746: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   749: aastore
    //   750: invokestatic 469	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   753: invokestatic 453	com/tencent/mm/booter/NotifyReceiver:It	()Ljava/util/Set;
    //   756: iload 7
    //   758: i2l
    //   759: invokestatic 353	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   762: invokeinterface 459 2 0
    //   767: pop
    //   768: invokestatic 160	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   771: ldc_w 481
    //   774: invokestatic 463	com/tencent/mm/booter/NotifyReceiver$NotifyService:A	(Landroid/content/Context;Ljava/lang/String;)V
    //   777: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   780: invokeinterface 466 1 0
    //   785: ldc_w 429
    //   788: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   791: goto -615 -> 176
    //   794: iconst_0
    //   795: istore 9
    //   797: goto -132 -> 665
    //   800: astore_1
    //   801: ldc_w 429
    //   804: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   807: goto -631 -> 176
    //   810: astore_1
    //   811: ldc 39
    //   813: aload_1
    //   814: ldc_w 407
    //   817: iconst_0
    //   818: anewarray 187	java/lang/Object
    //   821: invokestatic 485	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   824: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   827: invokeinterface 466 1 0
    //   832: ldc_w 429
    //   835: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   838: goto -662 -> 176
    //   841: astore_1
    //   842: ldc_w 429
    //   845: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   848: goto -672 -> 176
    //   851: astore_3
    //   852: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   855: invokeinterface 466 1 0
    //   860: ldc_w 429
    //   863: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   866: aload_3
    //   867: athrow
    //   868: invokestatic 112	com/tencent/mm/kernel/g:Rg	()Lcom/tencent/mm/ai/p;
    //   871: new 142	com/tencent/mm/modelmulti/i
    //   874: dup
    //   875: invokespecial 143	com/tencent/mm/modelmulti/i:<init>	()V
    //   878: iconst_0
    //   879: invokevirtual 146	com/tencent/mm/ai/p:a	(Lcom/tencent/mm/ai/m;I)Z
    //   882: pop
    //   883: ldc_w 429
    //   886: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   889: goto -713 -> 176
    //   892: ldc 39
    //   894: ldc_w 412
    //   897: invokestatic 475	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   900: ldc 126
    //   902: invokestatic 130	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   905: checkcast 126	com/tencent/mm/plugin/zero/b/b
    //   908: invokeinterface 134 1 0
    //   913: ldc2_w 413
    //   916: bipush 16
    //   918: ldc_w 407
    //   921: invokevirtual 410	com/tencent/mm/modelmulti/o:a	(JILjava/lang/String;)I
    //   924: istore 7
    //   926: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   929: invokeinterface 449 1 0
    //   934: iload 7
    //   936: ifle +47 -> 983
    //   939: ldc 39
    //   941: ldc_w 471
    //   944: iconst_1
    //   945: anewarray 187	java/lang/Object
    //   948: dup
    //   949: iconst_0
    //   950: iload 7
    //   952: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   955: aastore
    //   956: invokestatic 469	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   959: invokestatic 453	com/tencent/mm/booter/NotifyReceiver:It	()Ljava/util/Set;
    //   962: iload 7
    //   964: i2l
    //   965: invokestatic 353	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   968: invokeinterface 459 2 0
    //   973: pop
    //   974: invokestatic 160	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   977: ldc_w 487
    //   980: invokestatic 463	com/tencent/mm/booter/NotifyReceiver$NotifyService:A	(Landroid/content/Context;Ljava/lang/String;)V
    //   983: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   986: invokeinterface 466 1 0
    //   991: ldc_w 429
    //   994: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   997: goto -821 -> 176
    //   1000: astore_1
    //   1001: ldc_w 429
    //   1004: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1007: goto -831 -> 176
    //   1010: astore_1
    //   1011: invokestatic 445	com/tencent/mm/booter/NotifyReceiver:Is	()Ljava/util/concurrent/locks/Lock;
    //   1014: invokeinterface 466 1 0
    //   1019: ldc_w 429
    //   1022: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1025: aload_1
    //   1026: athrow
    //   1027: astore_3
    //   1028: goto -9 -> 1019
    //   1031: astore_1
    //   1032: goto -172 -> 860
    //   1035: astore_3
    //   1036: goto -397 -> 639
    //   1039: astore_1
    //   1040: goto -605 -> 435
    //
    // Exception table:
    //   from	to	target	type
    //   399	407	416	java/lang/Exception
    //   358	399	426	finally
    //   581	589	620	java/lang/Exception
    //   499	532	630	finally
    //   537	581	630	finally
    //   777	785	800	java/lang/Exception
    //   687	728	810	java/lang/Exception
    //   733	777	810	java/lang/Exception
    //   824	832	841	java/lang/Exception
    //   687	728	851	finally
    //   733	777	851	finally
    //   811	824	851	finally
    //   983	991	1000	java/lang/Exception
    //   926	934	1010	finally
    //   939	983	1010	finally
    //   1011	1019	1027	java/lang/Exception
    //   852	860	1031	java/lang/Exception
    //   631	639	1035	java/lang/Exception
    //   427	435	1039	java/lang/Exception
  }

  private static void z(Context paramContext, String paramString)
  {
    AppMethodBeat.i(57796);
    synchronized (NotifyReceiver.Ip())
    {
      if (NotifyReceiver.Iq() == null)
      {
        WakerLock localWakerLock = new com/tencent/mars/comm/WakerLock;
        localWakerLock.<init>(paramContext, "MicroMsg.NotifyReceiver");
        NotifyReceiver.a(localWakerLock);
      }
      NotifyReceiver.Iq().lock(14000L, paramString);
      AppMethodBeat.o(57796);
      return;
    }
  }

  public final IBinder Iu()
  {
    return null;
  }

  public final String getTag()
  {
    return "MicroMsg.NotifyReceiver";
  }

  public final void onCreate()
  {
    AppMethodBeat.i(57794);
    super.onCreate();
    AppMethodBeat.o(57794);
  }

  public final void onStart(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(57790);
    o(paramIntent);
    AppMethodBeat.o(57790);
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57791);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NotifyReceiver", "NotifyService onStartCommand flags :" + paramInt1 + "startId :" + paramInt2 + " intent " + paramIntent);
    o(paramIntent);
    AppMethodBeat.o(57791);
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.NotifyReceiver.NotifyService
 * JD-Core Version:    0.6.2
 */