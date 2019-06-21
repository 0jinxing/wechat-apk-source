package com.tencent.mm.sdk.platformtools;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.tencent.mm.ci.j;
import com.tencent.mm.sdk.a.a;
import com.tencent.recovery.crash.DefaultExceptionHandler;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class ao
  implements Thread.UncaughtExceptionHandler
{
  private static ao xzq = null;
  private d xzr = null;
  private a xzs = null;
  public a xzt = null;
  public Map<String, b> xzu = new HashMap();
  private Thread.UncaughtExceptionHandler xzv = null;
  private boolean xzw = false;
  private List<c> xzx = new LinkedList();

  private ao()
  {
    Thread.setDefaultUncaughtExceptionHandler(new DefaultExceptionHandler(this));
  }

  public static void D(String paramString1, String paramString2, boolean paramBoolean)
  {
    try
    {
      b local1 = new com/tencent/mm/sdk/platformtools/ao$1;
      local1.<init>(paramString2);
      a(paramString1, local1);
      Assert.assertTrue(paramString1, paramBoolean);
      return;
    }
    finally
    {
      paramString1 = finally;
    }
    throw paramString1;
  }

  public static void a(a parama)
  {
    try
    {
      if (xzq == null)
      {
        ao localao = new com/tencent/mm/sdk/platformtools/ao;
        localao.<init>();
        xzq = localao;
      }
      xzq.xzs = parama;
      return;
    }
    finally
    {
    }
    throw parama;
  }

  public static void a(a parama)
  {
    try
    {
      if (xzq == null)
      {
        ao localao = new com/tencent/mm/sdk/platformtools/ao;
        localao.<init>();
        xzq = localao;
      }
      xzq.xzt = parama;
      return;
    }
    finally
    {
    }
    throw parama;
  }

  public static void a(c paramc)
  {
    if (paramc == null);
    while (true)
    {
      return;
      try
      {
        if (xzq == null)
        {
          ao localao = new com/tencent/mm/sdk/platformtools/ao;
          localao.<init>();
          xzq = localao;
        }
        xzq.xzx.add(paramc);
      }
      finally
      {
      }
    }
    throw paramc;
  }

  public static void a(d paramd)
  {
    try
    {
      if (xzq == null)
      {
        ao localao = new com/tencent/mm/sdk/platformtools/ao;
        localao.<init>();
        xzq = localao;
      }
      xzq.xzr = paramd;
      return;
    }
    finally
    {
    }
    throw paramd;
  }

  public static void a(String paramString, b paramb)
  {
    try
    {
      if (xzq == null)
      {
        ao localao = new com/tencent/mm/sdk/platformtools/ao;
        localao.<init>();
        xzq = localao;
      }
      xzq.xzu.put(paramString, paramb);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  private static String amD(String paramString)
  {
    if (paramString == null)
      paramString = null;
    label24: label72: 
    while (true)
    {
      return paramString;
      char[] arrayOfChar = paramString.toCharArray();
      if (arrayOfChar == null)
      {
        paramString = null;
      }
      else
      {
        int i = 0;
        if (i < arrayOfChar.length)
          if (arrayOfChar[i] > '')
            arrayOfChar[i] = ((char)0);
        for (int j = 1; ; j = 0)
        {
          if (j == 0)
            break label72;
          paramString = new String(arrayOfChar, 0, i);
          break;
          i++;
          break label24;
        }
      }
    }
  }

  // ERROR //
  public static String m(Throwable paramThrowable)
  {
    // Byte code:
    //   0: new 131	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 132	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: new 134	java/io/PrintStream
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 137	java/io/PrintStream:<init>	(Ljava/io/OutputStream;)V
    //   16: astore_2
    //   17: aload_0
    //   18: invokevirtual 143	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   21: ifnull +11 -> 32
    //   24: aload_0
    //   25: invokevirtual 143	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   28: astore_0
    //   29: goto -12 -> 17
    //   32: aload_0
    //   33: aload_2
    //   34: invokevirtual 147	java/lang/Throwable:printStackTrace	(Ljava/io/PrintStream;)V
    //   37: aload_1
    //   38: invokevirtual 151	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   41: invokestatic 153	com/tencent/mm/sdk/platformtools/ao:amD	(Ljava/lang/String;)Ljava/lang/String;
    //   44: astore_0
    //   45: aload_1
    //   46: invokevirtual 156	java/io/ByteArrayOutputStream:close	()V
    //   49: aload_0
    //   50: areturn
    //   51: astore_0
    //   52: aload_1
    //   53: invokevirtual 156	java/io/ByteArrayOutputStream:close	()V
    //   56: aload_0
    //   57: athrow
    //   58: astore_1
    //   59: goto -10 -> 49
    //   62: astore_1
    //   63: goto -7 -> 56
    //
    // Exception table:
    //   from	to	target	type
    //   17	29	51	finally
    //   32	45	51	finally
    //   45	49	58	java/io/IOException
    //   52	56	62	java/io/IOException
  }

  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (this.xzw);
    while (true)
    {
      return;
      this.xzw = true;
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        Object localObject1 = new java/io/PrintStream;
        ((PrintStream)localObject1).<init>(localByteArrayOutputStream);
        for (Object localObject2 = paramThrowable; ((Throwable)localObject2).getCause() != null; localObject2 = ((Throwable)localObject2).getCause());
        ((Throwable)localObject2).printStackTrace((PrintStream)localObject1);
        localObject2 = amD(localByteArrayOutputStream.toString());
        Object localObject4;
        if ((this.xzs != null) && (localObject2 != null))
        {
          Object localObject3 = new android/os/HandlerThread;
          ((HandlerThread)localObject3).<init>("close-db-while-crash");
          ((HandlerThread)localObject3).start();
          localObject4 = new com/tencent/mm/ci/j;
          ((j)localObject4).<init>();
          localObject1 = new android/os/Handler;
          ((Handler)localObject1).<init>(((HandlerThread)localObject3).getLooper());
          localObject3 = new com/tencent/mm/sdk/platformtools/ao$2;
          ((2)localObject3).<init>(this, (String)localObject2, (j)localObject4);
          ((Handler)localObject1).post((Runnable)localObject3);
          ((j)localObject4).dOX();
        }
        if ((this.xzr != null) && (localObject2 != null))
        {
          this.xzr.a(this, (String)localObject2, paramThrowable);
          this.xzt.Bl();
        }
        localObject1 = this.xzx.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject4 = (c)((Iterator)localObject1).next();
          if (localObject4 != null)
            try
            {
              ((c)localObject4).b((String)localObject2, paramThrowable);
            }
            catch (Exception localException2)
            {
            }
        }
        localByteArrayOutputStream.close();
        label245: ab.appenderClose();
        if (f.DEBUG)
        {
          this.xzv.uncaughtException(paramThread, paramThrowable);
          continue;
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
      }
      catch (Exception localException1)
      {
        break label245;
      }
    }
  }

  public static abstract interface a
  {
    public abstract void Bl();
  }

  public static abstract interface b
  {
    public abstract String abq();
  }

  public static abstract interface c
  {
    public abstract void b(String paramString, Throwable paramThrowable);
  }

  public static abstract interface d
  {
    public abstract void a(ao paramao, String paramString, Throwable paramThrowable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ao
 * JD-Core Version:    0.6.2
 */