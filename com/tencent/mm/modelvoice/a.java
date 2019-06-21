package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class a
  implements b
{
  private RandomAccessFile bqD = null;
  private String fileName = "";

  public a(String paramString)
  {
    this.fileName = paramString;
  }

  private boolean cY(boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(55785);
    boolean bool2;
    if (this.fileName.length() >= 0)
      bool2 = true;
    while (true)
    {
      Assert.assertTrue(bool2);
      if (this.bqD == null)
      {
        bool2 = true;
        Assert.assertTrue(bool2);
        ab.d("MicroMsg.AmrFileOperator", "Open file:" + this.bqD + " forWrite:" + paramBoolean);
      }
      try
      {
        this.bqD = e.ck(this.fileName, paramBoolean);
        AppMethodBeat.o(55785);
        paramBoolean = bool1;
        return paramBoolean;
        bool2 = false;
        continue;
        bool2 = false;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.AmrFileOperator", "ERR: OpenFile[" + this.fileName + "] failed:[" + localException.getMessage() + "]");
          this.bqD = null;
          AppMethodBeat.o(55785);
          paramBoolean = false;
        }
      }
    }
  }

  public final void alO()
  {
    AppMethodBeat.i(55784);
    if (this.bqD != null);
    while (true)
    {
      try
      {
        this.bqD.close();
        this.bqD = null;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Close :");
        ab.d("MicroMsg.AmrFileOperator", this.fileName);
        AppMethodBeat.o(55784);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(55784);
    }
  }

  public final g cF(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55786);
    g localg = new g();
    if ((paramInt1 < 0) || (paramInt2 <= 0))
    {
      localg.ret = -3;
      AppMethodBeat.o(55786);
    }
    while (true)
    {
      return localg;
      if ((this.bqD == null) && (!cY(false)))
      {
        localg.ret = -2;
        AppMethodBeat.o(55786);
      }
      else
      {
        int i = paramInt1 + 6;
        localg.buf = new byte[paramInt2];
        try
        {
          long l = this.bqD.length();
          this.bqD.seek(i);
          paramInt2 = this.bqD.read(localg.buf, 0, paramInt2);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("DBG: ReadFile[");
          ab.d("MicroMsg.AmrFileOperator", this.fileName + "] readOffset:" + i + " readRet:" + paramInt2 + " fileNow:" + this.bqD.getFilePointer() + " fileSize:" + l);
          paramInt1 = paramInt2;
          if (paramInt2 < 0)
            paramInt1 = 0;
          localg.cqs = paramInt1;
          localg.fXD = (paramInt1 + i - 6);
          localg.ret = 0;
          AppMethodBeat.o(55786);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.AmrFileOperator", "ERR: ReadFile[" + this.fileName + "] Offset:" + i + "  failed:[" + localException.getMessage() + "] ");
          alO();
          localg.ret = -1;
          AppMethodBeat.o(55786);
        }
      }
    }
  }

  public final int getFormat()
  {
    return 0;
  }

  // ERROR //
  public final int write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: ldc 172
    //   5: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: arraylength
    //   10: ifle +39 -> 49
    //   13: iload_2
    //   14: ifle +35 -> 49
    //   17: iconst_1
    //   18: istore 5
    //   20: iload 5
    //   22: invokestatic 45	junit/framework/Assert:assertTrue	(Z)V
    //   25: aload_0
    //   26: getfield 17	com/tencent/mm/modelvoice/a:bqD	Ljava/io/RandomAccessFile;
    //   29: ifnonnull +26 -> 55
    //   32: aload_0
    //   33: iconst_1
    //   34: invokespecial 119	com/tencent/mm/modelvoice/a:cY	(Z)Z
    //   37: ifne +18 -> 55
    //   40: iconst_m1
    //   41: istore_2
    //   42: ldc 172
    //   44: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: iload_2
    //   48: ireturn
    //   49: iconst_0
    //   50: istore 5
    //   52: goto -32 -> 20
    //   55: iload_3
    //   56: ifne +18 -> 74
    //   59: aload_0
    //   60: getfield 17	com/tencent/mm/modelvoice/a:bqD	Ljava/io/RandomAccessFile;
    //   63: ldc 174
    //   65: invokevirtual 178	java/lang/String:getBytes	()[B
    //   68: iconst_0
    //   69: bipush 6
    //   71: invokevirtual 181	java/io/RandomAccessFile:write	([BII)V
    //   74: iload_3
    //   75: bipush 6
    //   77: iadd
    //   78: istore 6
    //   80: aload_0
    //   81: getfield 17	com/tencent/mm/modelvoice/a:bqD	Ljava/io/RandomAccessFile;
    //   84: iload 6
    //   86: i2l
    //   87: invokevirtual 130	java/io/RandomAccessFile:seek	(J)V
    //   90: aload_0
    //   91: getfield 17	com/tencent/mm/modelvoice/a:bqD	Ljava/io/RandomAccessFile;
    //   94: aload_1
    //   95: iconst_0
    //   96: iload_2
    //   97: invokevirtual 181	java/io/RandomAccessFile:write	([BII)V
    //   100: aload_0
    //   101: getfield 17	com/tencent/mm/modelvoice/a:bqD	Ljava/io/RandomAccessFile;
    //   104: invokevirtual 148	java/io/RandomAccessFile:getFilePointer	()J
    //   107: lstore 7
    //   109: lload 7
    //   111: l2i
    //   112: istore_3
    //   113: iload 6
    //   115: iload_2
    //   116: iadd
    //   117: istore_2
    //   118: iload_3
    //   119: iload_2
    //   120: if_icmpne +159 -> 279
    //   123: iconst_1
    //   124: istore 5
    //   126: iload 5
    //   128: invokestatic 45	junit/framework/Assert:assertTrue	(Z)V
    //   131: iinc 2 250
    //   134: iload_2
    //   135: iflt +150 -> 285
    //   138: iload 4
    //   140: istore 5
    //   142: iload 5
    //   144: invokestatic 45	junit/framework/Assert:assertTrue	(Z)V
    //   147: ldc 172
    //   149: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: goto -105 -> 47
    //   155: astore_1
    //   156: ldc 47
    //   158: new 49	java/lang/StringBuilder
    //   161: dup
    //   162: ldc 183
    //   164: invokespecial 53	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   167: aload_0
    //   168: getfield 21	com/tencent/mm/modelvoice/a:fileName	Ljava/lang/String;
    //   171: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: ldc 88
    //   176: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: aload_1
    //   180: invokevirtual 91	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   183: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: ldc 93
    //   188: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: invokestatic 96	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   197: aload_0
    //   198: invokevirtual 169	com/tencent/mm/modelvoice/a:alO	()V
    //   201: bipush 254
    //   203: istore_2
    //   204: ldc 172
    //   206: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: goto -162 -> 47
    //   212: astore_1
    //   213: ldc 47
    //   215: new 49	java/lang/StringBuilder
    //   218: dup
    //   219: ldc 185
    //   221: invokespecial 53	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   224: aload_0
    //   225: getfield 21	com/tencent/mm/modelvoice/a:fileName	Ljava/lang/String;
    //   228: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: ldc 163
    //   233: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: iload 6
    //   238: invokevirtual 141	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   241: ldc 187
    //   243: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: aload_1
    //   247: invokevirtual 91	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   250: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: ldc 93
    //   255: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokestatic 96	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   264: aload_0
    //   265: invokevirtual 169	com/tencent/mm/modelvoice/a:alO	()V
    //   268: bipush 253
    //   270: istore_2
    //   271: ldc 172
    //   273: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   276: goto -229 -> 47
    //   279: iconst_0
    //   280: istore 5
    //   282: goto -156 -> 126
    //   285: iconst_0
    //   286: istore 5
    //   288: goto -146 -> 142
    //
    // Exception table:
    //   from	to	target	type
    //   59	74	155	java/lang/Exception
    //   80	109	212	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.a
 * JD-Core Version:    0.6.2
 */