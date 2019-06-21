package com.tencent.mm.plugin.sport.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.h.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bs;
import java.util.Calendar;

public final class a
{
  public c rPa;
  public com.tencent.mm.sdk.b.c<sd> rPb;
  public f rPc;
  private long rPd;
  long rPe;

  public a()
  {
    AppMethodBeat.i(93631);
    this.rPb = new a.1(this);
    this.rPb.dnU();
    this.rPa = new c();
    AppMethodBeat.o(93631);
  }

  public static long cwf()
  {
    AppMethodBeat.i(93637);
    long l1 = cwg();
    if (b.dqw());
    while (true)
    {
      try
      {
        bool = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIw, true);
        if (bool)
        {
          l2 = n.cwH();
          if (l2 > l1)
          {
            ab.i("MicroMsg.Sport.DeviceStepManager", "getTodayStep MIUI Step %d %d", new Object[] { Long.valueOf(l2), Long.valueOf(l1) });
            AppMethodBeat.o(93637);
            return l2;
          }
        }
      }
      catch (Exception localException)
      {
        boolean bool = true;
        continue;
      }
      AppMethodBeat.o(93637);
      long l2 = l1;
    }
  }

  // ERROR //
  private static long cwg()
  {
    // Byte code:
    //   0: ldc 101
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   8: lstore_0
    //   9: invokestatic 109	com/tencent/mm/plugin/sport/model/n:cwC	()J
    //   12: lstore_2
    //   13: aconst_null
    //   14: astore 4
    //   16: ldc 111
    //   18: invokestatic 117	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   21: astore 5
    //   23: invokestatic 123	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   26: invokevirtual 129	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   29: aload 5
    //   31: aconst_null
    //   32: ldc 131
    //   34: aconst_null
    //   35: aconst_null
    //   36: invokevirtual 137	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   39: astore 5
    //   41: aload 5
    //   43: astore 4
    //   45: aload 4
    //   47: ifnull +176 -> 223
    //   50: aload 4
    //   52: invokeinterface 143 1 0
    //   57: astore 5
    //   59: aload 5
    //   61: ldc 145
    //   63: ldc2_w 146
    //   66: invokevirtual 153	android/os/Bundle:getLong	(Ljava/lang/String;J)J
    //   69: lstore 6
    //   71: aload 5
    //   73: ldc 155
    //   75: lconst_0
    //   76: invokevirtual 153	android/os/Bundle:getLong	(Ljava/lang/String;J)J
    //   79: lload_2
    //   80: lcmp
    //   81: ifne +130 -> 211
    //   84: ldc 157
    //   86: astore 5
    //   88: aload 5
    //   90: astore 8
    //   92: lload 6
    //   94: lstore 9
    //   96: aload 4
    //   98: ifnull +239 -> 337
    //   101: aload 4
    //   103: invokeinterface 160 1 0
    //   108: lload 6
    //   110: lstore 9
    //   112: lload 9
    //   114: lstore 6
    //   116: lload 9
    //   118: ldc2_w 146
    //   121: lcmp
    //   122: ifne +46 -> 168
    //   125: invokestatic 166	com/tencent/mm/plugin/sport/model/k:cwy	()Ljava/lang/String;
    //   128: astore 5
    //   130: aload 5
    //   132: invokestatic 172	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   135: ifne +170 -> 305
    //   138: aload 5
    //   140: invokestatic 176	com/tencent/mm/plugin/sport/model/n:ZV	(Ljava/lang/String;)[J
    //   143: astore 5
    //   145: aload 5
    //   147: iconst_0
    //   148: laload
    //   149: lstore 9
    //   151: aload 5
    //   153: iconst_5
    //   154: laload
    //   155: lstore 6
    //   157: lload 9
    //   159: lload_2
    //   160: lcmp
    //   161: ifne +134 -> 295
    //   164: ldc 178
    //   166: astore 5
    //   168: ldc 87
    //   170: ldc 180
    //   172: iconst_3
    //   173: anewarray 4	java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: aload 5
    //   180: aastore
    //   181: dup
    //   182: iconst_1
    //   183: lload 6
    //   185: invokestatic 95	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   188: aastore
    //   189: dup
    //   190: iconst_2
    //   191: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   194: lload_0
    //   195: lsub
    //   196: invokestatic 95	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   199: aastore
    //   200: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: ldc 101
    //   205: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: lload 6
    //   210: lreturn
    //   211: ldc2_w 146
    //   214: lstore 6
    //   216: ldc 182
    //   218: astore 5
    //   220: goto -132 -> 88
    //   223: ldc2_w 146
    //   226: lstore 6
    //   228: ldc 182
    //   230: astore 5
    //   232: goto -144 -> 88
    //   235: astore 5
    //   237: aconst_null
    //   238: astore 4
    //   240: ldc2_w 146
    //   243: lstore 9
    //   245: ldc 182
    //   247: astore 5
    //   249: aload 5
    //   251: astore 8
    //   253: aload 4
    //   255: ifnull +82 -> 337
    //   258: aload 4
    //   260: invokeinterface 160 1 0
    //   265: ldc2_w 146
    //   268: lstore 9
    //   270: goto -158 -> 112
    //   273: astore 5
    //   275: aload 4
    //   277: ifnull +10 -> 287
    //   280: aload 4
    //   282: invokeinterface 160 1 0
    //   287: ldc 101
    //   289: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: aload 5
    //   294: athrow
    //   295: ldc 182
    //   297: astore 5
    //   299: lconst_0
    //   300: lstore 6
    //   302: goto -134 -> 168
    //   305: ldc 182
    //   307: astore 5
    //   309: lconst_0
    //   310: lstore 6
    //   312: goto -144 -> 168
    //   315: astore 5
    //   317: ldc 182
    //   319: astore 5
    //   321: lconst_0
    //   322: lstore 6
    //   324: goto -156 -> 168
    //   327: astore 5
    //   329: goto -54 -> 275
    //   332: astore 5
    //   334: goto -94 -> 240
    //   337: aload 8
    //   339: astore 5
    //   341: goto -229 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   16	41	235	java/lang/Exception
    //   16	41	273	finally
    //   125	145	315	java/lang/Exception
    //   50	84	327	finally
    //   50	84	332	java/lang/Exception
  }

  private void kR(long paramLong)
  {
    AppMethodBeat.i(93635);
    this.rPd = paramLong;
    k.ab(4, this.rPd);
    AppMethodBeat.o(93635);
  }

  private void kS(long paramLong)
  {
    AppMethodBeat.i(93636);
    this.rPe = paramLong;
    k.ab(3, paramLong);
    AppMethodBeat.o(93636);
  }

  public final void ZR(String paramString)
  {
    AppMethodBeat.i(93639);
    d.xDG.b(new a.2(this, paramString), "Sport.updateConfigToPush");
    AppMethodBeat.o(93639);
  }

  public final void cwd()
  {
    AppMethodBeat.i(93632);
    long l = cwf();
    ab.i("MicroMsg.Sport.DeviceStepManager", "forceUploadDeviceStep %d", new Object[] { Long.valueOf(l) });
    kQ(l);
    AppMethodBeat.o(93632);
  }

  public final long cwe()
  {
    AppMethodBeat.i(93634);
    if (this.rPd == 0L)
      this.rPd = k.aa(4, 0L);
    long l = this.rPd;
    AppMethodBeat.o(93634);
    return l;
  }

  final boolean kQ(long paramLong)
  {
    AppMethodBeat.i(93633);
    if (this.rPc != null)
      g.Rg().c(this.rPc);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    long l1 = localCalendar.getTimeInMillis();
    long l2 = System.currentTimeMillis();
    ab.i("MicroMsg.Sport.DeviceStepManager", "update device Step time: %s stepCount: %s", new Object[] { n.fQ(l2), Long.valueOf(paramLong) });
    this.rPc = new f("", "gh_43f2581f6fd6", (int)(l1 / 1000L), (int)(l2 / 1000L), (int)paramLong, bs.dut(), 1);
    g.Rg().a(this.rPc, 0);
    kS(System.currentTimeMillis());
    kR(paramLong);
    AppMethodBeat.o(93633);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.a
 * JD-Core Version:    0.6.2
 */