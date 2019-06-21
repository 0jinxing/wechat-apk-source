package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;

public class FLock
{
  private File gUc;
  private volatile int xyi;

  static
  {
    AppMethodBeat.i(115187);
    try
    {
      System.loadLibrary("wechatcommon");
      AppMethodBeat.o(115187);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FLock", localThrowable, "fail to load so.", new Object[0]);
        AppMethodBeat.o(115187);
      }
    }
  }

  public FLock(File paramFile)
  {
    AppMethodBeat.i(115179);
    this.gUc = null;
    this.xyi = -1;
    if (!paramFile.exists());
    while (paramFile.isFile())
      try
      {
        paramFile.createNewFile();
        this.gUc = paramFile;
        AppMethodBeat.o(115179);
        return;
      }
      catch (IOException paramFile)
      {
        paramFile = new IllegalStateException(paramFile);
        AppMethodBeat.o(115179);
        throw paramFile;
      }
    paramFile = new IllegalArgumentException("target is not a file.");
    AppMethodBeat.o(115179);
    throw paramFile;
  }

  public FLock(String paramString)
  {
    this(new File(paramString));
    AppMethodBeat.i(115178);
    AppMethodBeat.o(115178);
  }

  private void free()
  {
    try
    {
      AppMethodBeat.i(115182);
      if (this.xyi != -1)
      {
        nativeFree(this.xyi);
        this.xyi = -1;
      }
      AppMethodBeat.o(115182);
      return;
    }
    finally
    {
    }
  }

  // ERROR //
  private int init()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 87
    //   4: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 50	com/tencent/mm/sdk/platformtools/FLock:gUc	Ljava/io/File;
    //   11: invokevirtual 58	java/io/File:exists	()Z
    //   14: istore_1
    //   15: iload_1
    //   16: ifne +16 -> 32
    //   19: aload_0
    //   20: getfield 50	com/tencent/mm/sdk/platformtools/FLock:gUc	Ljava/io/File;
    //   23: invokevirtual 61	java/io/File:createNewFile	()Z
    //   26: pop
    //   27: aload_0
    //   28: iconst_m1
    //   29: putfield 52	com/tencent/mm/sdk/platformtools/FLock:xyi	I
    //   32: aload_0
    //   33: getfield 52	com/tencent/mm/sdk/platformtools/FLock:xyi	I
    //   36: iconst_m1
    //   37: if_icmpne +17 -> 54
    //   40: aload_0
    //   41: aload_0
    //   42: getfield 50	com/tencent/mm/sdk/platformtools/FLock:gUc	Ljava/io/File;
    //   45: invokevirtual 91	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   48: invokestatic 95	com/tencent/mm/sdk/platformtools/FLock:nativeInit	(Ljava/lang/String;)I
    //   51: putfield 52	com/tencent/mm/sdk/platformtools/FLock:xyi	I
    //   54: aload_0
    //   55: getfield 52	com/tencent/mm/sdk/platformtools/FLock:xyi	I
    //   58: istore_2
    //   59: ldc 87
    //   61: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: aload_0
    //   65: monitorexit
    //   66: iload_2
    //   67: ireturn
    //   68: astore_3
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_3
    //   72: athrow
    //   73: astore_3
    //   74: goto -47 -> 27
    //
    // Exception table:
    //   from	to	target	type
    //   2	15	68	finally
    //   19	27	68	finally
    //   27	32	68	finally
    //   32	54	68	finally
    //   54	64	68	finally
    //   19	27	73	java/io/IOException
  }

  private static native void nativeFree(int paramInt);

  private static native int nativeInit(String paramString);

  private static native int nativeLockRead(int paramInt, boolean paramBoolean);

  private static native int nativeLockWrite(int paramInt, boolean paramBoolean);

  private static native int nativeUnlock(int paramInt);

  public final boolean dob()
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(115184);
        int i = init();
        switch (nativeLockWrite(i, false))
        {
        default:
          bool = true;
          AppMethodBeat.o(115184);
          return bool;
        case 9:
          IllegalStateException localIllegalStateException1 = new java/lang/IllegalStateException;
          localIllegalStateException1.<init>("bad file descriptor.");
          AppMethodBeat.o(115184);
          throw localIllegalStateException1;
        case 22:
        case 46:
        case 4:
        case 11:
        }
      }
      finally
      {
      }
      IllegalStateException localIllegalStateException2 = new java/lang/IllegalStateException;
      localIllegalStateException2.<init>("bad operation.");
      AppMethodBeat.o(115184);
      throw localIllegalStateException2;
      localIllegalStateException2 = new java/lang/IllegalStateException;
      localIllegalStateException2.<init>("kernel lock spaces ran out.");
      AppMethodBeat.o(115184);
      throw localIllegalStateException2;
      try
      {
        Thread.sleep(0L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
      continue;
      AppMethodBeat.o(115184);
    }
  }

  public final void doc()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(115185);
        int i = init();
        switch (nativeLockWrite(i, true))
        {
        default:
          AppMethodBeat.o(115185);
          return;
        case 9:
          IllegalStateException localIllegalStateException1 = new java/lang/IllegalStateException;
          localIllegalStateException1.<init>("bad file descriptor.");
          AppMethodBeat.o(115185);
          throw localIllegalStateException1;
        case 22:
        case 46:
        case 4:
        case 11:
        }
      }
      finally
      {
      }
      IllegalStateException localIllegalStateException2 = new java/lang/IllegalStateException;
      localIllegalStateException2.<init>("bad operation.");
      AppMethodBeat.o(115185);
      throw localIllegalStateException2;
      localIllegalStateException2 = new java/lang/IllegalStateException;
      localIllegalStateException2.<init>("kernel lock spaces ran out.");
      AppMethodBeat.o(115185);
      throw localIllegalStateException2;
      try
      {
        Thread.sleep(0L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(115180);
    super.finalize();
    unlock();
    AppMethodBeat.o(115180);
  }

  public final void lockRead()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(115183);
        int i = init();
        switch (nativeLockRead(i, true))
        {
        default:
          AppMethodBeat.o(115183);
          return;
        case 9:
          IllegalStateException localIllegalStateException1 = new java/lang/IllegalStateException;
          localIllegalStateException1.<init>("bad file descriptor.");
          AppMethodBeat.o(115183);
          throw localIllegalStateException1;
        case 22:
        case 46:
        case 4:
        case 11:
        }
      }
      finally
      {
      }
      IllegalStateException localIllegalStateException2 = new java/lang/IllegalStateException;
      localIllegalStateException2.<init>("bad operation.");
      AppMethodBeat.o(115183);
      throw localIllegalStateException2;
      localIllegalStateException2 = new java/lang/IllegalStateException;
      localIllegalStateException2.<init>("kernel lock spaces ran out.");
      AppMethodBeat.o(115183);
      throw localIllegalStateException2;
      try
      {
        Thread.sleep(0L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
  }

  public final void unlock()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(115186);
        if (this.xyi == -1)
        {
          AppMethodBeat.o(115186);
          return;
        }
        try
        {
          int i = nativeUnlock(this.xyi);
          switch (i)
          {
          default:
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            localIllegalStateException.<init>("other err: ".concat(String.valueOf(i)));
            AppMethodBeat.o(115186);
            throw localIllegalStateException;
          case 9:
          case 22:
          case 0:
          }
        }
        finally
        {
          free();
          AppMethodBeat.o(115186);
        }
      }
      finally
      {
      }
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localIllegalArgumentException.<init>(this.xyi + " is not a valid fd.");
      AppMethodBeat.o(115186);
      throw localIllegalArgumentException;
      localObject3 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject3).<init>("bad operation.");
      AppMethodBeat.o(115186);
      throw ((Throwable)localObject3);
      free();
      AppMethodBeat.o(115186);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.FLock
 * JD-Core Version:    0.6.2
 */