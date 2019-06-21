package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class c
{
  private RandomAccessFile bqD = null;
  private String fileName = "";

  public c(String paramString)
  {
    this.fileName = paramString;
  }

  private boolean abj(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(25258);
    boolean bool2;
    if (this.fileName.length() >= 0)
      bool2 = true;
    while (true)
    {
      Assert.assertTrue(bool2);
      if (this.bqD == null)
      {
        bool2 = true;
        label33: Assert.assertTrue(bool2);
        if ((!paramString.equals("r")) && (!paramString.equals("rw")))
          break label135;
        bool2 = true;
        Assert.assertTrue(bool2);
        ab.d("MicroMsg.SpxFileOperator", "Open file:" + this.bqD + " mode:" + paramString);
      }
      try
      {
        RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
        localRandomAccessFile.<init>(this.fileName, paramString);
        this.bqD = localRandomAccessFile;
        AppMethodBeat.o(25258);
        bool2 = bool1;
        return bool2;
        bool2 = false;
        continue;
        bool2 = false;
        break label33;
        label135: bool2 = false;
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.SpxFileOperator", "ERR: OpenFile[" + this.fileName + "] failed:[" + paramString.getMessage() + "]");
          this.bqD = null;
          AppMethodBeat.o(25258);
          bool2 = false;
        }
      }
    }
  }

  public static int uj(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(25256);
    boolean bool;
    int j;
    if (paramString.length() >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = new File(paramString);
      if (paramString.exists())
        break label52;
      AppMethodBeat.o(25256);
      j = i;
    }
    while (true)
    {
      return j;
      bool = false;
      break;
      label52: j = (int)paramString.length();
      if (j <= 0)
      {
        AppMethodBeat.o(25256);
        j = i;
      }
      else
      {
        AppMethodBeat.o(25256);
      }
    }
  }

  public final c.a Fo(int paramInt)
  {
    AppMethodBeat.i(25259);
    c.a locala = new c.a();
    if (paramInt < 0)
    {
      locala.ret = -3;
      AppMethodBeat.o(25259);
    }
    while (true)
    {
      return locala;
      if ((this.bqD == null) && (!abj("r")))
      {
        locala.ret = -2;
        AppMethodBeat.o(25259);
      }
      else
      {
        locala.buf = new byte[6000];
        try
        {
          long l = this.bqD.length();
          this.bqD.seek(paramInt);
          int i = this.bqD.read(locala.buf, 0, 6000);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("DBG: ReadFile[");
          ab.d("MicroMsg.SpxFileOperator", this.fileName + "] readOffset:" + paramInt + " readRet:" + i + " fileNow:" + this.bqD.getFilePointer() + " fileSize:" + l);
          int j = i;
          if (i < 0)
            j = 0;
          locala.cqs = j;
          locala.fXD = (j + paramInt);
          locala.ret = 0;
          AppMethodBeat.o(25259);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.SpxFileOperator", "ERR: ReadFile[" + this.fileName + "] Offset:" + paramInt + "  failed:[" + localException.getMessage() + "] ");
          alO();
          locala.ret = -1;
          AppMethodBeat.o(25259);
        }
      }
    }
  }

  public final void alO()
  {
    AppMethodBeat.i(25257);
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
        AppMethodBeat.o(25257);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(25257);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.c
 * JD-Core Version:    0.6.2
 */