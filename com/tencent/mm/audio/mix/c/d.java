package com.tencent.mm.audio.mix.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.h.b;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class d extends c
{
  private com.tencent.mm.audio.mix.a.c cll;
  private FileInputStream clm;
  private FileOutputStream outputStream;

  // ERROR //
  public d(com.tencent.mm.audio.mix.a.c paramc, int paramInt1, int paramInt2, int paramInt3, java.lang.String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 19	com/tencent/mm/audio/mix/c/c:<init>	()V
    //   4: ldc 20
    //   6: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: ldc 28
    //   11: ldc 30
    //   13: iconst_4
    //   14: anewarray 32	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: aload 5
    //   21: aastore
    //   22: dup
    //   23: iconst_1
    //   24: iload_2
    //   25: invokestatic 38	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   28: aastore
    //   29: dup
    //   30: iconst_2
    //   31: iload_3
    //   32: invokestatic 38	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   35: aastore
    //   36: dup
    //   37: iconst_3
    //   38: iload 4
    //   40: invokestatic 38	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: aastore
    //   44: invokestatic 43	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: invokestatic 48	com/tencent/mm/audio/mix/c/b:Dq	()V
    //   50: aload_0
    //   51: aload_1
    //   52: putfield 50	com/tencent/mm/audio/mix/c/d:cll	Lcom/tencent/mm/audio/mix/a/c;
    //   55: aload_0
    //   56: aload 5
    //   58: invokestatic 56	com/tencent/mm/audio/mix/h/a:eh	(Ljava/lang/String;)Ljava/lang/String;
    //   61: putfield 60	com/tencent/mm/audio/mix/c/d:clf	Ljava/lang/String;
    //   64: ldc 28
    //   66: ldc 62
    //   68: iconst_1
    //   69: anewarray 32	java/lang/Object
    //   72: dup
    //   73: iconst_0
    //   74: aload_0
    //   75: getfield 60	com/tencent/mm/audio/mix/c/d:clf	Ljava/lang/String;
    //   78: aastore
    //   79: invokestatic 43	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   82: new 64	java/io/File
    //   85: dup
    //   86: aload_0
    //   87: getfield 60	com/tencent/mm/audio/mix/c/d:clf	Ljava/lang/String;
    //   90: invokespecial 67	java/io/File:<init>	(Ljava/lang/String;)V
    //   93: invokevirtual 71	java/io/File:delete	()Z
    //   96: pop
    //   97: new 73	java/io/FileOutputStream
    //   100: astore_1
    //   101: aload_1
    //   102: aload_0
    //   103: getfield 60	com/tencent/mm/audio/mix/c/d:clf	Ljava/lang/String;
    //   106: invokestatic 77	com/tencent/mm/audio/mix/h/a:ei	(Ljava/lang/String;)Ljava/io/File;
    //   109: invokespecial 80	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   112: aload_0
    //   113: aload_1
    //   114: putfield 82	com/tencent/mm/audio/mix/c/d:outputStream	Ljava/io/FileOutputStream;
    //   117: new 84	java/io/FileInputStream
    //   120: astore_1
    //   121: aload_1
    //   122: aload_0
    //   123: getfield 60	com/tencent/mm/audio/mix/c/d:clf	Ljava/lang/String;
    //   126: invokestatic 77	com/tencent/mm/audio/mix/h/a:ei	(Ljava/lang/String;)Ljava/io/File;
    //   129: invokespecial 85	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   132: aload_0
    //   133: aload_1
    //   134: putfield 87	com/tencent/mm/audio/mix/c/d:clm	Ljava/io/FileInputStream;
    //   137: aload_0
    //   138: aload 5
    //   140: putfield 90	com/tencent/mm/audio/mix/c/d:cle	Ljava/lang/String;
    //   143: aload_0
    //   144: ldc 91
    //   146: putfield 95	com/tencent/mm/audio/mix/c/d:ckY	I
    //   149: aload_0
    //   150: iconst_2
    //   151: putfield 98	com/tencent/mm/audio/mix/c/d:ckZ	I
    //   154: aload_0
    //   155: iconst_2
    //   156: putfield 101	com/tencent/mm/audio/mix/c/d:cla	I
    //   159: aload_0
    //   160: iload_2
    //   161: iload_3
    //   162: iload 4
    //   164: invokevirtual 105	com/tencent/mm/audio/mix/c/d:C	(III)V
    //   167: ldc 20
    //   169: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   172: return
    //   173: astore_1
    //   174: ldc 28
    //   176: aload_1
    //   177: ldc 110
    //   179: iconst_0
    //   180: anewarray 32	java/lang/Object
    //   183: invokestatic 114	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: goto -69 -> 117
    //   189: astore_1
    //   190: ldc 28
    //   192: aload_1
    //   193: ldc 110
    //   195: iconst_0
    //   196: anewarray 32	java/lang/Object
    //   199: invokestatic 114	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: goto -85 -> 117
    //   205: astore_1
    //   206: ldc 28
    //   208: aload_1
    //   209: ldc 116
    //   211: iconst_0
    //   212: anewarray 32	java/lang/Object
    //   215: invokestatic 114	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: goto -81 -> 137
    //   221: astore_1
    //   222: ldc 28
    //   224: aload_1
    //   225: ldc 116
    //   227: iconst_0
    //   228: anewarray 32	java/lang/Object
    //   231: invokestatic 114	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: goto -97 -> 137
    //
    // Exception table:
    //   from	to	target	type
    //   97	117	173	java/io/FileNotFoundException
    //   97	117	189	java/lang/Exception
    //   117	137	205	java/io/FileNotFoundException
    //   117	137	221	java/lang/Exception
  }

  public final h Dr()
  {
    AppMethodBeat.i(137025);
    i locali = new i();
    AppMethodBeat.o(137025);
    return locali;
  }

  public final void Ds()
  {
    AppMethodBeat.i(137021);
    b.i("MicroMsg.Mix.AudioFixedConvertProcess", "finishProcess");
    try
    {
      if (this.outputStream != null)
      {
        this.outputStream.flush();
        this.outputStream.close();
        this.outputStream = null;
      }
      Runtime.getRuntime().gc();
      AppMethodBeat.o(137021);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        b.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", localException, "finishProcess", new Object[0]);
    }
  }

  public final com.tencent.mm.audio.mix.a.d Dt()
  {
    com.tencent.mm.audio.mix.a.d locald = null;
    AppMethodBeat.i(137022);
    if (this.clm == null)
    {
      b.e("MicroMsg.Mix.AudioFixedConvertProcess", "readPcmDataTrack, inputStream is null");
      AppMethodBeat.o(137022);
    }
    while (true)
    {
      return locald;
      byte[] arrayOfByte = new byte[3536];
      try
      {
        int i = this.clm.read(arrayOfByte, 0, 3536);
        if (i <= 0)
          break label92;
        locald = com.tencent.mm.audio.mix.b.c.Dk().Dj();
        locald.ckv = arrayOfByte;
        AppMethodBeat.o(137022);
      }
      catch (Exception localException)
      {
        b.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", localException, "readPcmDataTrack", new Object[0]);
        AppMethodBeat.o(137022);
      }
      continue;
      label92: b.e("MicroMsg.Mix.AudioFixedConvertProcess", "readPcmDataTrack readSize is 0");
      AppMethodBeat.o(137022);
    }
  }

  public final byte[] F(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(137020);
    if (paramArrayOfByte == null)
      AppMethodBeat.o(137020);
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = super.F(paramArrayOfByte);
      if (this.outputStream == null)
      {
        AppMethodBeat.o(137020);
      }
      else if (paramArrayOfByte != null)
      {
        try
        {
          this.outputStream.write(paramArrayOfByte, 0, paramArrayOfByte.length);
          AppMethodBeat.o(137020);
        }
        catch (Exception localException)
        {
          while (true)
            b.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", localException, "write", new Object[0]);
        }
      }
      else
      {
        b.e("MicroMsg.Mix.AudioFixedConvertProcess", "desdata is null");
        paramArrayOfByte = null;
        AppMethodBeat.o(137020);
      }
    }
  }

  public final void flushCache()
  {
    AppMethodBeat.i(137023);
    b.i("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache");
    if (this.clm == null)
    {
      b.e("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache, inputStream is null");
      AppMethodBeat.o(137023);
    }
    while (true)
    {
      return;
      if (this.cll.cky)
      {
        b.e("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache, cache is complete");
        AppMethodBeat.o(137023);
      }
      else
      {
        int i = 0;
        while (true)
          if (i != -1)
          {
            byte[] arrayOfByte = new byte[3536];
            try
            {
              int j = this.clm.read(arrayOfByte, 0, 3536);
              i = j;
              if (i > 0)
              {
                com.tencent.mm.audio.mix.a.d locald = com.tencent.mm.audio.mix.b.c.Dk().Dj();
                locald.ckv = arrayOfByte;
                this.cll.a(locald);
              }
            }
            catch (Exception localException)
            {
              while (true)
                b.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", localException, "readPcmDataTrack", new Object[0]);
            }
          }
        this.cll.complete();
        AppMethodBeat.o(137023);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(137024);
    b.i("MicroMsg.Mix.AudioFixedConvertProcess", "release");
    super.release();
    try
    {
      if (this.outputStream != null)
      {
        this.outputStream.flush();
        this.outputStream.close();
        this.outputStream = null;
      }
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          if (this.clm != null)
          {
            this.clm.close();
            this.clm = null;
          }
          AppMethodBeat.o(137024);
          return;
          localException1 = localException1;
          b.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", localException1, "outputStream close", new Object[0]);
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          b.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", localException2, "inputStream close", new Object[0]);
          AppMethodBeat.o(137024);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.c.d
 * JD-Core Version:    0.6.2
 */