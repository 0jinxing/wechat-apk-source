package com.tencent.tinker.loader;

import android.os.Build.VERSION;
import com.tencent.tinker.loader.shareutil.ShareFileLockHelper;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class TinkerDexOptimizer
{
  public static boolean a(Collection<File> paramCollection, File paramFile, ResultCallback paramResultCallback)
  {
    return a(paramCollection, paramFile, false, null, paramResultCallback);
  }

  public static boolean a(Collection<File> paramCollection, File paramFile, boolean paramBoolean, String paramString, ResultCallback paramResultCallback)
  {
    paramCollection = new ArrayList(paramCollection);
    Collections.sort(paramCollection, new Comparator()
    {
    });
    Collections.reverse(paramCollection);
    paramCollection = paramCollection.iterator();
    do
      if (!paramCollection.hasNext())
        break;
    while (new OptimizeWorker((File)paramCollection.next(), paramFile, paramBoolean, paramString, paramResultCallback).dSk());
    for (paramBoolean = false; ; paramBoolean = true)
      return paramBoolean;
  }

  static class OptimizeWorker
  {
    private static String ACC = null;
    private final boolean ABR;
    private final File ACD;
    private final File ACE;
    private final TinkerDexOptimizer.ResultCallback ACF;

    OptimizeWorker(File paramFile1, File paramFile2, boolean paramBoolean, String paramString, TinkerDexOptimizer.ResultCallback paramResultCallback)
    {
      this.ACD = paramFile1;
      this.ACE = paramFile2;
      this.ABR = paramBoolean;
      this.ACF = paramResultCallback;
      ACC = paramString;
    }

    public final boolean dSk()
    {
      boolean bool = false;
      try
      {
        Object localObject1;
        if ((!SharePatchFileUtil.ap(this.ACD)) && (this.ACF != null))
        {
          localObject1 = this.ACF;
          localObject3 = this.ACD;
          localObject5 = new java/io/IOException;
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>("dex file ");
          ((IOException)localObject5).<init>(this.ACD.getAbsolutePath() + " is not exist!");
          ((TinkerDexOptimizer.ResultCallback)localObject1).b((File)localObject3, (Throwable)localObject5);
          return bool;
        }
        if (this.ACF != null)
          this.ACF.ai(this.ACD);
        localObject6 = SharePatchFileUtil.k(this.ACD, this.ACE);
        if (this.ABR)
        {
          localObject5 = this.ACD.getAbsolutePath();
          localObject3 = new java/io/File;
          ((File)localObject3).<init>((String)localObject6);
          if (!((File)localObject3).exists())
            ((File)localObject3).getParentFile().mkdirs();
          localObject1 = new java/io/File;
          ((File)localObject1).<init>(((File)localObject3).getParentFile(), "interpret.lock");
          localObject3 = null;
          try
          {
            localObject1 = ShareFileLockHelper.ao((File)localObject1);
            localObject3 = localObject1;
            ArrayList localArrayList = new java/util/ArrayList;
            localObject3 = localObject1;
            localArrayList.<init>();
            localObject3 = localObject1;
            localArrayList.add("dex2oat");
            localObject3 = localObject1;
            if (Build.VERSION.SDK_INT >= 24)
            {
              localObject3 = localObject1;
              localArrayList.add("--runtime-arg");
              localObject3 = localObject1;
              localArrayList.add("-classpath");
              localObject3 = localObject1;
              localArrayList.add("--runtime-arg");
              localObject3 = localObject1;
              localArrayList.add("&");
            }
            localObject3 = localObject1;
            localArrayList.add("--dex-file=".concat(String.valueOf(localObject5)));
            localObject3 = localObject1;
            localArrayList.add("--oat-file=".concat(String.valueOf(localObject6)));
            localObject3 = localObject1;
            localObject5 = new java/lang/StringBuilder;
            localObject3 = localObject1;
            ((StringBuilder)localObject5).<init>("--instruction-set=");
            localObject3 = localObject1;
            localArrayList.add(ACC);
            localObject3 = localObject1;
            if (Build.VERSION.SDK_INT > 25)
            {
              localObject3 = localObject1;
              localArrayList.add("--compiler-filter=quicken");
              localObject3 = localObject1;
              localObject5 = new java/lang/ProcessBuilder;
              localObject3 = localObject1;
              ((ProcessBuilder)localObject5).<init>(localArrayList);
              localObject3 = localObject1;
              ((ProcessBuilder)localObject5).redirectErrorStream(true);
              localObject3 = localObject1;
              localObject5 = ((ProcessBuilder)localObject5).start();
              localObject3 = localObject1;
              TinkerDexOptimizer.StreamConsumer.L(((Process)localObject5).getInputStream());
              localObject3 = localObject1;
              TinkerDexOptimizer.StreamConsumer.L(((Process)localObject5).getErrorStream());
              localObject3 = localObject1;
              try
              {
                int i = ((Process)localObject5).waitFor();
                if (i != 0)
                {
                  localObject3 = localObject1;
                  localObject6 = new java/io/IOException;
                  localObject3 = localObject1;
                  ((IOException)localObject6).<init>("dex2oat works unsuccessfully, exit code: ".concat(String.valueOf(i)));
                  localObject3 = localObject1;
                  throw ((Throwable)localObject6);
                }
              }
              catch (InterruptedException localInterruptedException)
              {
                localObject3 = localObject1;
                localObject6 = new java/io/IOException;
                localObject3 = localObject1;
                localObject5 = new java/lang/StringBuilder;
                localObject3 = localObject1;
                ((StringBuilder)localObject5).<init>("dex2oat is interrupted, msg: ");
                localObject3 = localObject1;
                ((IOException)localObject6).<init>(localInterruptedException.getMessage(), localInterruptedException);
                localObject3 = localObject1;
                throw ((Throwable)localObject6);
              }
            }
          }
          finally
          {
            if (localObject3 == null);
          }
        }
      }
      catch (Throwable localThrowable)
      {
        try
        {
          while (true)
          {
            Object localObject3;
            Object localObject5;
            Object localObject6;
            ((ShareFileLockHelper)localObject3).close();
            label518: throw localObject2;
            localThrowable = localThrowable;
            new StringBuilder("Failed to optimize dex: ").append(this.ACD.getAbsolutePath());
            Object localObject4;
            if (this.ACF != null)
            {
              this.ACF.b(this.ACD, localThrowable);
              continue;
              localObject4 = localObject2;
              localInterruptedException.add("--compiler-filter=interpret-only");
              continue;
            }
            try
            {
              localObject2.close();
              while (true)
              {
                label584: if (this.ACF != null)
                {
                  TinkerDexOptimizer.ResultCallback localResultCallback = this.ACF;
                  localObject4 = this.ACD;
                  localObject5 = new java/io/File;
                  ((File)localObject5).<init>((String)localObject6);
                  localResultCallback.i((File)localObject4, (File)localObject5);
                }
                bool = true;
                break;
                DexFile.loadDex(this.ACD.getAbsolutePath(), (String)localObject6, 0);
              }
            }
            catch (IOException localIOException1)
            {
              break label584;
            }
          }
        }
        catch (IOException localIOException2)
        {
          break label518;
        }
      }
    }
  }

  public static abstract interface ResultCallback
  {
    public abstract void ai(File paramFile);

    public abstract void b(File paramFile, Throwable paramThrowable);

    public abstract void i(File paramFile1, File paramFile2);
  }

  static class StreamConsumer
  {
    static final Executor ACG = Executors.newSingleThreadExecutor();

    static void L(InputStream paramInputStream)
    {
      ACG.execute(new Runnable()
      {
        // ERROR //
        public final void run()
        {
          // Byte code:
          //   0: aload_0
          //   1: getfield 19	com/tencent/tinker/loader/TinkerDexOptimizer$StreamConsumer$1:ACH	Ljava/io/InputStream;
          //   4: ifnonnull +4 -> 8
          //   7: return
          //   8: sipush 256
          //   11: newarray byte
          //   13: astore_1
          //   14: aload_0
          //   15: getfield 19	com/tencent/tinker/loader/TinkerDexOptimizer$StreamConsumer$1:ACH	Ljava/io/InputStream;
          //   18: aload_1
          //   19: invokevirtual 34	java/io/InputStream:read	([B)I
          //   22: istore_2
          //   23: iload_2
          //   24: ifgt -10 -> 14
          //   27: aload_0
          //   28: getfield 19	com/tencent/tinker/loader/TinkerDexOptimizer$StreamConsumer$1:ACH	Ljava/io/InputStream;
          //   31: invokevirtual 37	java/io/InputStream:close	()V
          //   34: goto -27 -> 7
          //   37: astore_1
          //   38: goto -31 -> 7
          //   41: astore_1
          //   42: aload_0
          //   43: getfield 19	com/tencent/tinker/loader/TinkerDexOptimizer$StreamConsumer$1:ACH	Ljava/io/InputStream;
          //   46: invokevirtual 37	java/io/InputStream:close	()V
          //   49: goto -42 -> 7
          //   52: astore_1
          //   53: goto -46 -> 7
          //   56: astore_1
          //   57: aload_0
          //   58: getfield 19	com/tencent/tinker/loader/TinkerDexOptimizer$StreamConsumer$1:ACH	Ljava/io/InputStream;
          //   61: invokevirtual 37	java/io/InputStream:close	()V
          //   64: aload_1
          //   65: athrow
          //   66: astore_3
          //   67: goto -3 -> 64
          //
          // Exception table:
          //   from	to	target	type
          //   27	34	37	java/lang/Exception
          //   14	23	41	java/io/IOException
          //   42	49	52	java/lang/Exception
          //   14	23	56	finally
          //   57	64	66	java/lang/Exception
        }
      });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.TinkerDexOptimizer
 * JD-Core Version:    0.6.2
 */