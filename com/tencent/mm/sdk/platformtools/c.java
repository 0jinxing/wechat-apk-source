package com.tencent.mm.sdk.platformtools;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class c
{
  private static final Handler handler;
  private static final WeakHashMap<Bitmap, a> xxQ;
  private static boolean xxR;

  static
  {
    AppMethodBeat.i(93316);
    xxQ = new WeakHashMap();
    HandlerThread localHandlerThread;
    if (!bp.dnM())
    {
      handler = null;
      localHandlerThread = new HandlerThread("BitmapBriefTracer");
      localHandlerThread.start();
      new ap(localHandlerThread.getLooper(), new ap.a()
      {
        public final boolean BI()
        {
          AppMethodBeat.i(93297);
          c.dnV();
          AppMethodBeat.o(93297);
          return true;
        }
      }
      , true).ae(120000L, 120000L);
    }
    while (true)
    {
      ao.a(new ao.c()
      {
        public final void b(String paramAnonymousString, Throwable paramAnonymousThrowable)
        {
          AppMethodBeat.i(93299);
          if (!(paramAnonymousThrowable instanceof OutOfMemoryError))
            AppMethodBeat.o(93299);
          while (true)
          {
            return;
            c.dnW();
            AppMethodBeat.o(93299);
          }
        }
      });
      AppMethodBeat.o(93316);
      return;
      localHandlerThread = new HandlerThread("BitmapTracer");
      localHandlerThread.start();
      handler = new Handler(localHandlerThread.getLooper(), new Handler.Callback()
      {
        boolean xxS = false;
        long xxT = 0L;

        // ERROR //
        public final boolean handleMessage(android.os.Message paramAnonymousMessage)
        {
          // Byte code:
          //   0: ldc 26
          //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
          //   5: invokestatic 36	com/tencent/mm/sdk/platformtools/c:Pu	()Z
          //   8: pop
          //   9: invokestatic 42	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
          //   12: astore_1
          //   13: aload_1
          //   14: invokevirtual 46	java/lang/Runtime:totalMemory	()J
          //   17: lstore_2
          //   18: aload_1
          //   19: invokevirtual 49	java/lang/Runtime:freeMemory	()J
          //   22: lstore 4
          //   24: aload_1
          //   25: invokevirtual 52	java/lang/Runtime:maxMemory	()J
          //   28: lstore 6
          //   30: ldc 54
          //   32: ldc 56
          //   34: iconst_3
          //   35: anewarray 4	java/lang/Object
          //   38: dup
          //   39: iconst_0
          //   40: lload_2
          //   41: lload 4
          //   43: lsub
          //   44: invokestatic 60	com/tencent/mm/sdk/platformtools/c:mp	(J)Ljava/lang/String;
          //   47: aastore
          //   48: dup
          //   49: iconst_1
          //   50: lload 4
          //   52: invokestatic 60	com/tencent/mm/sdk/platformtools/c:mp	(J)Ljava/lang/String;
          //   55: aastore
          //   56: dup
          //   57: iconst_2
          //   58: lload 6
          //   60: invokestatic 60	com/tencent/mm/sdk/platformtools/c:mp	(J)Ljava/lang/String;
          //   63: aastore
          //   64: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   67: aload_0
          //   68: getfield 18	com/tencent/mm/sdk/platformtools/c$2:xxS	Z
          //   71: ifne +153 -> 224
          //   74: lload_2
          //   75: lload 4
          //   77: lsub
          //   78: ldc2_w 66
          //   81: lcmp
          //   82: ifle +142 -> 224
          //   85: invokestatic 72	java/lang/System:currentTimeMillis	()J
          //   88: lstore 6
          //   90: lload 6
          //   92: aload_0
          //   93: getfield 20	com/tencent/mm/sdk/platformtools/c$2:xxT	J
          //   96: lsub
          //   97: ldc2_w 73
          //   100: lcmp
          //   101: ifle +19 -> 120
          //   104: invokestatic 77	java/lang/System:gc	()V
          //   107: aload_0
          //   108: lload 6
          //   110: putfield 20	com/tencent/mm/sdk/platformtools/c$2:xxT	J
          //   113: ldc 26
          //   115: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
          //   118: iconst_1
          //   119: ireturn
          //   120: aconst_null
          //   121: astore 8
          //   123: new 82	java/io/PrintWriter
          //   126: astore 9
          //   128: new 84	java/util/zip/GZIPOutputStream
          //   131: astore 10
          //   133: new 86	java/io/FileOutputStream
          //   136: astore 11
          //   138: new 88	java/lang/StringBuilder
          //   141: astore_1
          //   142: aload_1
          //   143: invokespecial 89	java/lang/StringBuilder:<init>	()V
          //   146: aload 11
          //   148: aload_1
          //   149: getstatic 95	com/tencent/mm/compatible/util/e:eSn	Ljava/lang/String;
          //   152: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   155: ldc 101
          //   157: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   160: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   163: invokespecial 108	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
          //   166: aload 10
          //   168: aload 11
          //   170: invokespecial 111	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
          //   173: aload 9
          //   175: aload 10
          //   177: invokespecial 112	java/io/PrintWriter:<init>	(Ljava/io/OutputStream;)V
          //   180: aload 9
          //   182: astore_1
          //   183: aload 9
          //   185: invokestatic 116	com/tencent/mm/sdk/platformtools/c:a	(Ljava/io/PrintWriter;)V
          //   188: aload 9
          //   190: invokestatic 122	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
          //   193: new 88	java/lang/StringBuilder
          //   196: astore_1
          //   197: aload_1
          //   198: invokespecial 89	java/lang/StringBuilder:<init>	()V
          //   201: aload_1
          //   202: getstatic 95	com/tencent/mm/compatible/util/e:eSn	Ljava/lang/String;
          //   205: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   208: ldc 124
          //   210: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   213: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   216: invokestatic 129	android/os/Debug:dumpHprofData	(Ljava/lang/String;)V
          //   219: aload_0
          //   220: iconst_1
          //   221: putfield 18	com/tencent/mm/sdk/platformtools/c$2:xxS	Z
          //   224: ldc 26
          //   226: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
          //   229: goto -111 -> 118
          //   232: astore 8
          //   234: aconst_null
          //   235: astore 9
          //   237: aload 9
          //   239: astore_1
          //   240: ldc 54
          //   242: aload 8
          //   244: ldc 131
          //   246: iconst_0
          //   247: anewarray 4	java/lang/Object
          //   250: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   253: aload 9
          //   255: invokestatic 122	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
          //   258: goto -65 -> 193
          //   261: astore_1
          //   262: aload 8
          //   264: astore 9
          //   266: aload_1
          //   267: astore 8
          //   269: aload 9
          //   271: invokestatic 122	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
          //   274: ldc 26
          //   276: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
          //   279: aload 8
          //   281: athrow
          //   282: astore_1
          //   283: ldc 54
          //   285: aload_1
          //   286: ldc 131
          //   288: iconst_0
          //   289: anewarray 4	java/lang/Object
          //   292: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   295: goto -76 -> 219
          //   298: astore 9
          //   300: aload 9
          //   302: astore 8
          //   304: aload_1
          //   305: astore 9
          //   307: goto -38 -> 269
          //   310: astore 8
          //   312: goto -75 -> 237
          //
          // Exception table:
          //   from	to	target	type
          //   123	180	232	java/lang/Exception
          //   123	180	261	finally
          //   193	219	282	java/lang/Exception
          //   183	188	298	finally
          //   240	253	298	finally
          //   183	188	310	java/lang/Exception
        }
      });
    }
  }

  private static void I(long paramLong, int paramInt)
  {
    AppMethodBeat.i(93305);
    a(new PrintWriter(new Writer()
    {
      private StringWriter xxU;

      public final void close()
      {
        AppMethodBeat.i(93302);
        flush();
        AppMethodBeat.o(93302);
      }

      public final void flush()
      {
        AppMethodBeat.i(93301);
        if (this.xxU == null)
          AppMethodBeat.o(93301);
        while (true)
        {
          return;
          String str = this.xxU.toString();
          this.xxU = null;
          ab.w("MicroMsg.BitmapTracer", str);
          AppMethodBeat.o(93301);
        }
      }

      public final void write(char[] paramAnonymousArrayOfChar, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(93300);
        if (this.xxU == null)
          this.xxU = new StringWriter();
        this.xxU.write(paramAnonymousArrayOfChar, paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(93300);
      }
    }
    , false), paramLong, paramInt);
    AppMethodBeat.o(93305);
  }

  private static void a(PrintWriter paramPrintWriter, long paramLong, int paramInt)
  {
    AppMethodBeat.i(93311);
    if (paramLong > 0L)
      paramPrintWriter.format("Statistics for all Bitmaps larger than %.2f MB:\n", new Object[] { Double.valueOf(paramLong / 1048576.0D) });
    while (true)
    {
      paramPrintWriter.flush();
      int i = 0;
      int j = 0;
      long l1 = 0L;
      long l2 = System.currentTimeMillis();
      long l3 = 0L;
      synchronized (xxQ)
      {
        Object localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        Object localObject2;
        try
        {
          ((List)localObject1).addAll(xxQ.entrySet());
          Iterator localIterator = ((List)localObject1).iterator();
          localObject2 = null;
          localObject1 = null;
          while (true)
          {
            if (!localIterator.hasNext())
              break label326;
            Object localObject3 = (Map.Entry)localIterator.next();
            Bitmap localBitmap = (Bitmap)((Map.Entry)localObject3).getKey();
            a locala = (a)((Map.Entry)localObject3).getValue();
            if (localBitmap != null)
            {
              boolean bool = localBitmap.isRecycled();
              if (bool)
              {
                j++;
                continue;
                paramPrintWriter.print("Statistics for all Bitmaps alive:\n");
                break;
              }
              long l4 = localBitmap.getAllocationByteCount();
              long l5 = l1 + l4;
              i++;
              if (localObject1 != null)
              {
                localObject3 = localObject1;
                if (l4 <= ((Bitmap)localObject1).getAllocationByteCount());
              }
              else
              {
                localObject1 = locala;
                localObject3 = localBitmap;
                localObject2 = localObject1;
              }
              l1 = l3;
              if (l4 >= paramLong)
                if (paramInt != -1)
                {
                  l1 = l3;
                  if (l3 >= paramInt);
                }
                else
                {
                  l1 = l3 + 1L;
                  paramPrintWriter.append('#').println(i);
                  a(paramPrintWriter, localBitmap, locala, l2);
                }
              l3 = l1;
              localObject1 = localObject3;
              l1 = l5;
            }
          }
        }
        catch (ConcurrentModificationException localConcurrentModificationException)
        {
          paramPrintWriter.print("ConcurrentModificationException occur.");
          paramPrintWriter.flush();
          paramPrintWriter.close();
          AppMethodBeat.o(93311);
          return;
        }
        label326: if ((localConcurrentModificationException != null) && (localObject2 != null))
        {
          paramPrintWriter.append("# Biggest Bitmap");
          a(paramPrintWriter, localConcurrentModificationException, localObject2, l2);
        }
        paramPrintWriter.format("\n\nLiving Bitmaps: %d, %s\n", new Object[] { Integer.valueOf(i), mo(l1) });
        paramPrintWriter.append("Recycled Bitmaps: ").println(j);
        paramPrintWriter.flush();
        paramPrintWriter.close();
        AppMethodBeat.o(93311);
      }
    }
  }

  private static void a(PrintWriter paramPrintWriter, Bitmap paramBitmap, a parama, long paramLong)
  {
    AppMethodBeat.i(93312);
    Bitmap.Config localConfig = paramBitmap.getConfig();
    String str = mo(paramBitmap.getAllocationByteCount());
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    if (localConfig == null);
    for (paramBitmap = "UNKNOWN"; ; paramBitmap = localConfig.name())
    {
      paramPrintWriter.format("\nSize: %s (%d x %d, %s)\n", new Object[] { str, Integer.valueOf(i), Integer.valueOf(j), paramBitmap });
      paramPrintWriter.append("Source: ").println(parama.source);
      paramPrintWriter.format("Acquired: %d seconds ago\n", new Object[] { Long.valueOf((paramLong - parama.xxX) / 1000L) });
      paramPrintWriter.print("Stack:\n");
      a(parama.xxV, paramPrintWriter);
      paramPrintWriter.print("=======================================================\n");
      paramPrintWriter.flush();
      AppMethodBeat.o(93312);
      return;
    }
  }

  private static void a(StackTraceElement[] paramArrayOfStackTraceElement, PrintWriter paramPrintWriter)
  {
    AppMethodBeat.i(93310);
    int i = paramArrayOfStackTraceElement.length;
    for (int j = 0; j < i; j++)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[j];
      paramPrintWriter.append("  at ").println(localStackTraceElement.toString());
    }
    AppMethodBeat.o(93310);
  }

  public static Bitmap ag(Bitmap paramBitmap)
  {
    AppMethodBeat.i(93306);
    paramBitmap = g(paramBitmap, null);
    AppMethodBeat.o(93306);
    return paramBitmap;
  }

  public static void dnV()
  {
    AppMethodBeat.i(93304);
    I(2097152L, 3);
    AppMethodBeat.o(93304);
  }

  public static Bitmap f(Bitmap paramBitmap, String paramString)
  {
    AppMethodBeat.i(93307);
    paramBitmap = g(paramBitmap, paramString);
    AppMethodBeat.o(93307);
    return paramBitmap;
  }

  private static Bitmap g(Bitmap paramBitmap, String arg1)
  {
    AppMethodBeat.i(93308);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(93308);
    }
    while (true)
    {
      return paramBitmap;
      if ((paramBitmap.getAllocationByteCount() < 1048576) && (!bp.dnM()))
      {
        AppMethodBeat.o(93308);
        continue;
      }
      a locala = new a(???);
      synchronized (xxQ)
      {
        xxQ.put(paramBitmap, locala);
        if ((handler != null) && (!xxR))
        {
          handler.sendEmptyMessageDelayed(0, 5000L);
          xxR = true;
        }
        AppMethodBeat.o(93308);
      }
    }
  }

  @SuppressLint({"DefaultLocale"})
  private static String mo(long paramLong)
  {
    AppMethodBeat.i(93309);
    String str;
    if (paramLong >= 1073741824L)
    {
      str = String.format("%.2f GB", new Object[] { Double.valueOf(paramLong / 1073741824.0D) });
      AppMethodBeat.o(93309);
    }
    while (true)
    {
      return str;
      if (paramLong >= 1048576L)
      {
        str = String.format("%.2f MB", new Object[] { Double.valueOf(paramLong / 1048576.0D) });
        AppMethodBeat.o(93309);
      }
      else if (paramLong >= 1024L)
      {
        str = String.format("%.2f kB", new Object[] { Double.valueOf(paramLong / 1024.0D) });
        AppMethodBeat.o(93309);
      }
      else
      {
        str = String.format("%d bytes", new Object[] { Long.valueOf(paramLong) });
        AppMethodBeat.o(93309);
      }
    }
  }

  static final class a
  {
    final String source;
    final StackTraceElement[] xxV;
    final BitmapFactory.Options xxW;
    final long xxX;

    a(String paramString)
    {
      AppMethodBeat.i(93303);
      StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
      this.xxV = ((StackTraceElement[])Arrays.copyOfRange(arrayOfStackTraceElement, 4, arrayOfStackTraceElement.length));
      this.source = paramString;
      this.xxW = null;
      this.xxX = System.currentTimeMillis();
      AppMethodBeat.o(93303);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.c
 * JD-Core Version:    0.6.2
 */