package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class l
  implements b
{
  private RandomAccessFile bqD = null;
  private String fileName = "";

  public l(String paramString)
  {
    this.fileName = paramString;
  }

  private boolean cY(boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(55834);
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
        ab.d("MicroMsg.SpxFileOperator", "Open file:" + this.bqD + " forWrite:" + paramBoolean);
      }
      try
      {
        this.bqD = e.ck(this.fileName, paramBoolean);
        AppMethodBeat.o(55834);
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
          ab.e("MicroMsg.SpxFileOperator", "ERR: OpenFile[" + this.fileName + "] failed:[" + localException.getMessage() + "]");
          this.bqD = null;
          AppMethodBeat.o(55834);
          paramBoolean = false;
        }
      }
    }
  }

  public final void alO()
  {
    AppMethodBeat.i(55833);
    if (this.bqD != null);
    while (true)
    {
      try
      {
        this.bqD.close();
        this.bqD = null;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Close :");
        ab.d("MicroMsg.SpxFileOperator", this.fileName);
        AppMethodBeat.o(55833);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(55833);
    }
  }

  public final g cF(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55835);
    g localg = new g();
    if ((paramInt1 < 0) || (paramInt2 <= 0))
    {
      localg.ret = -3;
      AppMethodBeat.o(55835);
    }
    while (true)
    {
      return localg;
      if ((this.bqD == null) && (!cY(false)))
      {
        localg.ret = -2;
        AppMethodBeat.o(55835);
      }
      else
      {
        localg.buf = new byte[paramInt2];
        try
        {
          long l = this.bqD.length();
          this.bqD.seek(paramInt1);
          int i = this.bqD.read(localg.buf, 0, paramInt2);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("DBG: ReadFile[");
          ab.d("MicroMsg.SpxFileOperator", this.fileName + "] readOffset:" + paramInt1 + " readRet:" + i + " fileNow:" + this.bqD.getFilePointer() + " fileSize:" + l);
          paramInt2 = i;
          if (i < 0)
            paramInt2 = 0;
          localg.cqs = paramInt2;
          localg.fXD = (paramInt2 + paramInt1);
          localg.ret = 0;
          AppMethodBeat.o(55835);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.SpxFileOperator", "ERR: ReadFile[" + this.fileName + "] Offset:" + paramInt1 + "  failed:[" + localException.getMessage() + "] ");
          alO();
          localg.ret = -1;
          AppMethodBeat.o(55835);
        }
      }
    }
  }

  public final int getFormat()
  {
    return 1;
  }

  public final int write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    AppMethodBeat.i(55836);
    if ((paramArrayOfByte.length > 0) && (paramInt1 > 0));
    for (boolean bool2 = true; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      if ((this.bqD != null) || (cY(true)))
        break;
      paramInt1 = -1;
      AppMethodBeat.o(55836);
      return paramInt1;
    }
    while (true)
    {
      try
      {
        this.bqD.seek(paramInt2);
        this.bqD.write(paramArrayOfByte, 0, paramInt1);
        long l = this.bqD.getFilePointer();
        int i = (int)l;
        paramInt1 = paramInt2 + paramInt1;
        if (i != paramInt1)
          break label193;
        bool2 = true;
        Assert.assertTrue(bool2);
        if (paramInt1 < 0)
          break label199;
        bool2 = bool1;
        Assert.assertTrue(bool2);
        AppMethodBeat.o(55836);
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.SpxFileOperator", "ERR: WriteFile[" + this.fileName + "] Offset:" + paramInt2 + " failed:[" + paramArrayOfByte.getMessage() + "]");
        alO();
        paramInt1 = -3;
        AppMethodBeat.o(55836);
      }
      break;
      label193: bool2 = false;
      continue;
      label199: bool2 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.l
 * JD-Core Version:    0.6.2
 */