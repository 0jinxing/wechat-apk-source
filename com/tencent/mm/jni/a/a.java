package com.tencent.mm.jni.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.om;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class a
{
  private static SparseArray<b> eHG;
  private static final byte[] eHH;
  private static ak mHandler;

  static
  {
    AppMethodBeat.i(77206);
    eHG = new SparseArray();
    mHandler = new ak(Looper.getMainLooper());
    eHH = new byte[0];
    AppMethodBeat.o(77206);
  }

  public static void Qi()
  {
    AppMethodBeat.i(77202);
    c.Qm();
    AppMethodBeat.o(77202);
  }

  public static void Qj()
  {
    AppMethodBeat.i(77203);
    c.detach();
    AppMethodBeat.o(77203);
  }

  public static void a(WakerLock paramWakerLock, String paramString)
  {
    AppMethodBeat.i(77204);
    synchronized (eHH)
    {
      Object localObject1 = (b)eHG.get(paramWakerLock.hashCode());
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new com/tencent/mm/jni/a/a$b;
        ((b)localObject2).<init>(paramWakerLock);
        eHG.put(paramWakerLock.hashCode(), localObject2);
      }
      if (!((b)localObject2).eHL.containsKey(paramString))
      {
        paramWakerLock = ((b)localObject2).eHL;
        localObject1 = new com/tencent/mm/jni/a/a$b$a;
        ((a.b.a)localObject1).<init>(paramString, SystemClock.elapsedRealtime());
        paramWakerLock.put(paramString, localObject1);
      }
      c.lm(paramString);
      paramWakerLock = mHandler;
      if (!((b)localObject2).eHJ)
      {
        ((b)localObject2).eHJ = true;
        paramWakerLock.postDelayed(((b)localObject2).eHK, 60000L);
      }
      AppMethodBeat.o(77204);
      return;
    }
  }

  public static void c(WakerLock paramWakerLock)
  {
    AppMethodBeat.i(77205);
    synchronized (eHH)
    {
      paramWakerLock = (b)eHG.get(paramWakerLock.hashCode());
      if (paramWakerLock == null)
        break label114;
      Object localObject = mHandler;
      if (paramWakerLock.eHJ)
      {
        paramWakerLock.eHJ = false;
        ((ak)localObject).removeCallbacks(paramWakerLock.eHK);
      }
      localObject = paramWakerLock.eHL.values().iterator();
      if (((Iterator)localObject).hasNext())
        c.ln(((a.b.a)((Iterator)localObject).next()).eHM);
    }
    paramWakerLock.eHL.clear();
    label114: AppMethodBeat.o(77205);
  }

  static final class a
    implements Runnable
  {
    private WakerLock eHI = null;

    public a(WakerLock paramWakerLock)
    {
      this.eHI = paramWakerLock;
    }

    public final void run()
    {
      AppMethodBeat.i(77185);
      Object localObject1;
      int i;
      int j;
      while (true)
      {
        int k;
        synchronized (a.Qk())
        {
          localObject1 = (a.b)a.Ql().get(this.eHI.hashCode());
          if (localObject1 == null)
            break label270;
          i = this.eHI.hashCode();
          j = this.eHI.innerWakeLockHashCode();
          String str = this.eHI.getCreatePosStackLine();
          Object localObject3 = ((a.b)localObject1).eHL.values();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          k = 1;
          Iterator localIterator = ((Collection)localObject3).iterator();
          if (!localIterator.hasNext())
            break;
          localObject3 = (a.b.a)localIterator.next();
          if (k != 0)
          {
            m = 0;
            k = m;
            if (((a.b.a)localObject3).eHN == 0L)
              continue;
            ((StringBuilder)localObject1).append('{').append(((a.b.a)localObject3).eHM).append(',').append(SystemClock.elapsedRealtime() - ((a.b.a)localObject3).eHN).append('}');
            k = m;
          }
        }
        ((StringBuilder)localObject1).append(',');
        int m = k;
      }
      if (((StringBuilder)localObject1).length() == 0)
        ((StringBuilder)localObject1).append("<empty>");
      ab.w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localObject2, ((StringBuilder)localObject1).toString() });
      while (true)
      {
        this.eHI.unLock();
        AppMethodBeat.o(77185);
        return;
        label270: ab.w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", new Object[] { Integer.valueOf(this.eHI.hashCode()), Integer.valueOf(this.eHI.innerWakeLockHashCode()), this.eHI.getCreatePosStackLine(), "#lost-trace-state#" });
      }
    }
  }

  static final class b
  {
    volatile boolean eHJ;
    a.a eHK;
    Map<String, a> eHL;

    public b(WakerLock paramWakerLock)
    {
      AppMethodBeat.i(77186);
      this.eHJ = false;
      this.eHK = null;
      this.eHL = new HashMap();
      this.eHK = new a.a(paramWakerLock);
      AppMethodBeat.o(77186);
    }

    static final class a
    {
      public String eHM = null;
      public long eHN = 0L;

      public a(String paramString, long paramLong)
      {
        this.eHM = paramString;
        this.eHN = paramLong;
      }
    }
  }

  static final class c
  {
    private static int eHO = 0;
    private static long eHP = 0L;
    private static HashMap<String, a> eHQ = null;
    private static final byte[] eHR = new byte[0];
    private static BroadcastReceiver eHS = null;
    private static long mLastReportTime = 0L;

    // ERROR //
    public static void Qm()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_0
      //   2: ldc 45
      //   4: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   7: getstatic 28	com/tencent/mm/jni/a/a$c:eHO	I
      //   10: ifne +127 -> 137
      //   13: invokestatic 57	android/os/Process:myPid	()I
      //   16: putstatic 28	com/tencent/mm/jni/a/a$c:eHO	I
      //   19: new 9	com/tencent/mm/jni/a/a$c$1
      //   22: dup
      //   23: invokespecial 60	com/tencent/mm/jni/a/a$c$1:<init>	()V
      //   26: putstatic 38	com/tencent/mm/jni/a/a$c:eHS	Landroid/content/BroadcastReceiver;
      //   29: getstatic 36	com/tencent/mm/jni/a/a$c:eHR	[B
      //   32: astore_1
      //   33: aload_1
      //   34: monitorenter
      //   35: new 62	com/tencent/mm/vfs/b
      //   38: astore_2
      //   39: aload_2
      //   40: invokestatic 68	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
      //   43: invokevirtual 74	android/content/Context:getCacheDir	()Ljava/io/File;
      //   46: ldc 76
      //   48: invokespecial 79	com/tencent/mm/vfs/b:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   51: new 81	java/io/ObjectInputStream
      //   54: astore_3
      //   55: aload_3
      //   56: aload_2
      //   57: invokestatic 87	com/tencent/mm/vfs/e:p	(Lcom/tencent/mm/vfs/b;)Ljava/io/InputStream;
      //   60: invokespecial 90	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
      //   63: aload_3
      //   64: invokevirtual 94	java/io/ObjectInputStream:readLong	()J
      //   67: putstatic 30	com/tencent/mm/jni/a/a$c:mLastReportTime	J
      //   70: aload_3
      //   71: invokevirtual 98	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
      //   74: checkcast 100	java/util/HashMap
      //   77: putstatic 34	com/tencent/mm/jni/a/a$c:eHQ	Ljava/util/HashMap;
      //   80: aload_3
      //   81: invokevirtual 103	java/io/ObjectInputStream:close	()V
      //   84: aload_1
      //   85: monitorexit
      //   86: new 105	android/content/IntentFilter
      //   89: dup
      //   90: invokespecial 106	android/content/IntentFilter:<init>	()V
      //   93: astore_3
      //   94: aload_3
      //   95: ldc 108
      //   97: invokevirtual 112	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
      //   100: aload_3
      //   101: ldc 114
      //   103: invokevirtual 112	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
      //   106: invokestatic 68	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
      //   109: getstatic 38	com/tencent/mm/jni/a/a$c:eHS	Landroid/content/BroadcastReceiver;
      //   112: aload_3
      //   113: ldc 116
      //   115: aconst_null
      //   116: invokevirtual 120	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
      //   119: pop
      //   120: ldc 122
      //   122: ldc 124
      //   124: iconst_1
      //   125: anewarray 4	java/lang/Object
      //   128: dup
      //   129: iconst_0
      //   130: invokestatic 128	com/tencent/mm/sdk/platformtools/ah:getProcessName	()Ljava/lang/String;
      //   133: aastore
      //   134: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   137: ldc 45
      //   139: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   142: return
      //   143: astore_3
      //   144: aconst_null
      //   145: astore_3
      //   146: ldc 122
      //   148: ldc 138
      //   150: invokestatic 142	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   153: invokestatic 147	android/os/SystemClock:elapsedRealtime	()J
      //   156: putstatic 30	com/tencent/mm/jni/a/a$c:mLastReportTime	J
      //   159: new 100	java/util/HashMap
      //   162: astore_0
      //   163: aload_0
      //   164: invokespecial 148	java/util/HashMap:<init>	()V
      //   167: aload_0
      //   168: putstatic 34	com/tencent/mm/jni/a/a$c:eHQ	Ljava/util/HashMap;
      //   171: aload_3
      //   172: ifnull -88 -> 84
      //   175: aload_3
      //   176: invokevirtual 103	java/io/ObjectInputStream:close	()V
      //   179: goto -95 -> 84
      //   182: astore_3
      //   183: goto -99 -> 84
      //   186: astore_3
      //   187: aload_0
      //   188: ifnull +7 -> 195
      //   191: aload_0
      //   192: invokevirtual 103	java/io/ObjectInputStream:close	()V
      //   195: ldc 45
      //   197: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   200: aload_3
      //   201: athrow
      //   202: astore_3
      //   203: aload_1
      //   204: monitorexit
      //   205: ldc 45
      //   207: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   210: aload_3
      //   211: athrow
      //   212: astore_3
      //   213: goto -129 -> 84
      //   216: astore_0
      //   217: goto -22 -> 195
      //   220: astore_2
      //   221: aload_3
      //   222: astore_0
      //   223: aload_2
      //   224: astore_3
      //   225: goto -38 -> 187
      //   228: astore_2
      //   229: aload_3
      //   230: astore_0
      //   231: aload_2
      //   232: astore_3
      //   233: goto -46 -> 187
      //   236: astore_0
      //   237: goto -91 -> 146
      //
      // Exception table:
      //   from	to	target	type
      //   35	63	143	java/lang/Exception
      //   175	179	182	java/lang/Exception
      //   35	63	186	finally
      //   80	84	202	finally
      //   84	86	202	finally
      //   175	179	202	finally
      //   191	195	202	finally
      //   195	202	202	finally
      //   203	205	202	finally
      //   80	84	212	java/lang/Exception
      //   191	195	216	java/lang/Exception
      //   63	80	220	finally
      //   146	171	228	finally
      //   63	80	236	java/lang/Exception
    }

    private static void Qn()
    {
      AppMethodBeat.i(77198);
      long l;
      while (true)
      {
        synchronized (eHR)
        {
          l = SystemClock.elapsedRealtime();
          if (l - mLastReportTime < 21600000L)
            break label290;
          if (eHQ.isEmpty())
            break label286;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          Iterator localIterator = eHQ.entrySet().iterator();
          if (!localIterator.hasNext())
            break;
          Object localObject2 = (a)((Map.Entry)localIterator.next()).getValue();
          if (((a)localObject2).eHX <= 0)
            continue;
          localStringBuilder.setLength(0);
          Object localObject3 = localStringBuilder.append(((a)localObject2).eHT).append(',').append(((a)localObject2).eHM.replace(",", "##")).append(',').append(((a)localObject2).eHX).append(',').append(((a)localObject2).eHW).append(',').append(((a)localObject2).eHY).append(',');
          if (((a)localObject2).eHV)
          {
            i = 1;
            ((StringBuilder)localObject3).append(i).append(',').append(((a)localObject2).eHU);
            localObject2 = localStringBuilder.toString();
            localObject3 = new com/tencent/mm/g/a/om;
            ((om)localObject3).<init>();
            ((om)localObject3).cKO.cKP = ((String)localObject2);
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
            ab.d("MicroMsg.WakeLockStatsManager", "kvstat-str: %s", new Object[] { localStringBuilder.toString() });
          }
        }
        int i = 0;
      }
      eHQ.clear();
      label286: mLastReportTime = l;
      label290: AppMethodBeat.o(77198);
    }

    // ERROR //
    private static void Qo()
    {
      // Byte code:
      //   0: ldc_w 268
      //   3: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   6: getstatic 36	com/tencent/mm/jni/a/a$c:eHR	[B
      //   9: astore_0
      //   10: aload_0
      //   11: monitorenter
      //   12: aconst_null
      //   13: astore_1
      //   14: aconst_null
      //   15: astore_2
      //   16: aload_1
      //   17: astore_3
      //   18: new 62	com/tencent/mm/vfs/b
      //   21: astore 4
      //   23: aload_1
      //   24: astore_3
      //   25: aload 4
      //   27: invokestatic 68	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
      //   30: invokevirtual 74	android/content/Context:getCacheDir	()Ljava/io/File;
      //   33: ldc_w 270
      //   36: invokespecial 79	com/tencent/mm/vfs/b:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   39: aload_1
      //   40: astore_3
      //   41: aload 4
      //   43: invokevirtual 274	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
      //   46: invokestatic 280	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
      //   49: invokestatic 284	com/tencent/mm/vfs/e:tf	(Ljava/lang/String;)Z
      //   52: ifne +106 -> 158
      //   55: aload_1
      //   56: astore_3
      //   57: new 267	java/io/IOException
      //   60: astore 5
      //   62: aload_1
      //   63: astore_3
      //   64: new 158	java/lang/StringBuilder
      //   67: astore 6
      //   69: aload_1
      //   70: astore_3
      //   71: aload 6
      //   73: ldc_w 286
      //   76: invokespecial 288	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   79: aload_1
      //   80: astore_3
      //   81: aload 5
      //   83: aload 6
      //   85: aload 4
      //   87: invokevirtual 274	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
      //   90: invokestatic 280	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
      //   93: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   96: ldc_w 290
      //   99: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   102: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   105: invokespecial 291	java/io/IOException:<init>	(Ljava/lang/String;)V
      //   108: aload_1
      //   109: astore_3
      //   110: ldc_w 268
      //   113: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   116: aload_1
      //   117: astore_3
      //   118: aload 5
      //   120: athrow
      //   121: astore 4
      //   123: aload_2
      //   124: astore_1
      //   125: aload_1
      //   126: astore_3
      //   127: ldc 122
      //   129: aload 4
      //   131: ldc_w 293
      //   134: iconst_0
      //   135: anewarray 4	java/lang/Object
      //   138: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   141: aload_1
      //   142: ifnull +7 -> 149
      //   145: aload_1
      //   146: invokevirtual 300	java/io/ObjectOutputStream:close	()V
      //   149: aload_0
      //   150: monitorexit
      //   151: ldc_w 268
      //   154: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   157: return
      //   158: aload_1
      //   159: astore_3
      //   160: new 62	com/tencent/mm/vfs/b
      //   163: astore 6
      //   165: aload_1
      //   166: astore_3
      //   167: aload 6
      //   169: aload 4
      //   171: ldc_w 302
      //   174: invokespecial 305	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
      //   177: aload_1
      //   178: astore_3
      //   179: new 299	java/io/ObjectOutputStream
      //   182: dup
      //   183: aload 6
      //   185: invokestatic 309	com/tencent/mm/vfs/e:q	(Lcom/tencent/mm/vfs/b;)Ljava/io/OutputStream;
      //   188: invokespecial 312	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   191: astore_1
      //   192: aload_1
      //   193: getstatic 30	com/tencent/mm/jni/a/a$c:mLastReportTime	J
      //   196: invokevirtual 316	java/io/ObjectOutputStream:writeLong	(J)V
      //   199: aload_1
      //   200: getstatic 34	com/tencent/mm/jni/a/a$c:eHQ	Ljava/util/HashMap;
      //   203: invokevirtual 320	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
      //   206: aload_1
      //   207: invokevirtual 300	java/io/ObjectOutputStream:close	()V
      //   210: goto -61 -> 149
      //   213: astore_3
      //   214: goto -65 -> 149
      //   217: astore_1
      //   218: aload_3
      //   219: astore 4
      //   221: aload_1
      //   222: astore_3
      //   223: aload 4
      //   225: ifnull +8 -> 233
      //   228: aload 4
      //   230: invokevirtual 300	java/io/ObjectOutputStream:close	()V
      //   233: ldc_w 268
      //   236: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   239: aload_3
      //   240: athrow
      //   241: astore_3
      //   242: aload_0
      //   243: monitorexit
      //   244: ldc_w 268
      //   247: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   250: aload_3
      //   251: athrow
      //   252: astore_3
      //   253: goto -104 -> 149
      //   256: astore_1
      //   257: goto -24 -> 233
      //   260: astore_3
      //   261: aload_1
      //   262: astore 4
      //   264: goto -41 -> 223
      //   267: astore 4
      //   269: goto -144 -> 125
      //
      // Exception table:
      //   from	to	target	type
      //   18	23	121	java/io/IOException
      //   25	39	121	java/io/IOException
      //   41	55	121	java/io/IOException
      //   57	62	121	java/io/IOException
      //   64	69	121	java/io/IOException
      //   71	79	121	java/io/IOException
      //   81	108	121	java/io/IOException
      //   110	116	121	java/io/IOException
      //   118	121	121	java/io/IOException
      //   160	165	121	java/io/IOException
      //   167	177	121	java/io/IOException
      //   179	192	121	java/io/IOException
      //   206	210	213	java/lang/Exception
      //   18	23	217	finally
      //   25	39	217	finally
      //   41	55	217	finally
      //   57	62	217	finally
      //   64	69	217	finally
      //   71	79	217	finally
      //   81	108	217	finally
      //   110	116	217	finally
      //   118	121	217	finally
      //   127	141	217	finally
      //   160	165	217	finally
      //   167	177	217	finally
      //   179	192	217	finally
      //   145	149	241	finally
      //   149	151	241	finally
      //   206	210	241	finally
      //   228	233	241	finally
      //   233	241	241	finally
      //   242	244	241	finally
      //   145	149	252	java/lang/Exception
      //   228	233	256	java/lang/Exception
      //   192	206	260	finally
      //   192	206	267	java/io/IOException
    }

    private static void c(String paramString1, String paramString2, long paramLong)
    {
      AppMethodBeat.i(77196);
      String str = paramString1 + "_" + paramString2;
      synchronized (eHR)
      {
        a locala1 = (a)eHQ.get(str);
        a locala2 = locala1;
        if (locala1 == null)
        {
          locala2 = new com/tencent/mm/jni/a/a$c$a;
          locala2.<init>((byte)0);
          locala2.eHT = paramString1;
          locala2.eHM = paramString2;
          locala2.eHY = 0L;
          locala2.eHW = 0;
          locala2.eHX = 0;
          eHQ.put(str, locala2);
        }
        if (locala2.eIa.getAndIncrement() == 0)
        {
          locala2.eHZ = paramLong;
          locala2.eHU = at.getNetTypeString(ah.getContext());
          locala2.eHV = com.tencent.mm.sdk.a.b.foreground;
        }
        AppMethodBeat.o(77196);
        return;
      }
    }

    private static void d(String arg0, String paramString2, long paramLong)
    {
      AppMethodBeat.i(77197);
      paramString2 = ??? + "_" + paramString2;
      long l1 = 0L;
      synchronized (eHR)
      {
        paramString2 = (a)eHQ.get(paramString2);
        long l2 = l1;
        if (paramString2 != null)
        {
          l2 = l1;
          if (paramString2.eIa.get() > 0)
          {
            paramString2.eHW += 1;
            l2 = l1;
            if (paramString2.eIa.decrementAndGet() == 0)
            {
              l2 = paramLong - paramString2.eHZ;
              paramString2.eHY += l2;
              paramString2.eHX += 1;
            }
          }
        }
        Qn();
        paramLong = SystemClock.elapsedRealtime();
        if ((l2 >= 14000L) || (paramLong - eHP >= 3600000L))
        {
          ab.d("MicroMsg.WakeLockStatsManager", "saveStatsToStorage triggered.");
          Qo();
          eHP = paramLong;
        }
        AppMethodBeat.o(77197);
        return;
      }
    }

    public static void detach()
    {
      AppMethodBeat.i(77192);
      if (eHO > 0)
      {
        ah.getContext().unregisterReceiver(eHS);
        Qo();
        eHO = 0;
        ab.i("MicroMsg.WakeLockStatsManager", "WakeLockStatsManager is detached from process [%s]", new Object[] { ah.getProcessName() });
      }
      AppMethodBeat.o(77192);
    }

    public static void lm(String paramString)
    {
      AppMethodBeat.i(77193);
      r(paramString, true);
      AppMethodBeat.o(77193);
    }

    public static void ln(String paramString)
    {
      AppMethodBeat.i(77194);
      r(paramString, false);
      AppMethodBeat.o(77194);
    }

    private static void r(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(77195);
      int i = Process.myPid();
      String str = ah.getProcessName();
      if (i == eHO)
        if (paramBoolean)
        {
          c(str, paramString, SystemClock.elapsedRealtime());
          AppMethodBeat.o(77195);
        }
      while (true)
      {
        return;
        d(str, paramString, SystemClock.elapsedRealtime());
        AppMethodBeat.o(77195);
        continue;
        Intent localIntent;
        if (paramBoolean)
        {
          localIntent = new Intent("com.tencent.mm.ACTION.note_tracemsg_lock");
          localIntent.putExtra("pid", i);
          localIntent.putExtra("processName", str);
          localIntent.putExtra("traceMsg", paramString);
          localIntent.putExtra("tick", SystemClock.elapsedRealtime());
          ah.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
          AppMethodBeat.o(77195);
        }
        else
        {
          localIntent = new Intent("com.tencent.mm.ACTION.note_tracemsg_unlock");
          localIntent.putExtra("pid", i);
          localIntent.putExtra("processName", str);
          localIntent.putExtra("traceMsg", paramString);
          localIntent.putExtra("tick", SystemClock.elapsedRealtime());
          ah.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
          AppMethodBeat.o(77195);
        }
      }
    }

    static final class a
      implements Externalizable
    {
      public String eHM;
      public String eHT;
      public String eHU;
      public boolean eHV;
      public int eHW;
      public int eHX;
      public long eHY;
      public long eHZ;
      public AtomicInteger eIa;

      private a()
      {
        AppMethodBeat.i(77188);
        this.eHT = "";
        this.eHM = "";
        this.eHU = "";
        this.eHV = false;
        this.eHW = 0;
        this.eHX = 0;
        this.eHY = 0L;
        this.eHZ = 0L;
        this.eIa = new AtomicInteger(0);
        AppMethodBeat.o(77188);
      }

      public final void readExternal(ObjectInput paramObjectInput)
      {
        AppMethodBeat.i(77189);
        synchronized (a.c.Ip())
        {
          this.eHT = paramObjectInput.readUTF();
          this.eHM = paramObjectInput.readUTF();
          this.eHW = paramObjectInput.readInt();
          this.eHX = paramObjectInput.readInt();
          this.eHY = paramObjectInput.readLong();
          this.eHU = "";
          this.eHV = false;
          this.eHZ = 0L;
          paramObjectInput = new java/util/concurrent/atomic/AtomicInteger;
          paramObjectInput.<init>(0);
          this.eIa = paramObjectInput;
          AppMethodBeat.o(77189);
          return;
        }
      }

      public final void writeExternal(ObjectOutput paramObjectOutput)
      {
        AppMethodBeat.i(77190);
        synchronized (a.c.Ip())
        {
          paramObjectOutput.writeUTF(this.eHT);
          paramObjectOutput.writeUTF(this.eHM);
          paramObjectOutput.writeInt(this.eHW);
          paramObjectOutput.writeInt(this.eHX);
          paramObjectOutput.writeLong(this.eHY);
          AppMethodBeat.o(77190);
          return;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.jni.a.a
 * JD-Core Version:    0.6.2
 */