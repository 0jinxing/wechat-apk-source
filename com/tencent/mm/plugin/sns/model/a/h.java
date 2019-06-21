package com.tencent.mm.plugin.sns.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class h extends b
{
  public h(c.a parama, a parama1)
  {
    super(parama, parama1);
  }

  public final boolean E(InputStream paramInputStream)
  {
    AppMethodBeat.i(36752);
    ab.i("MicroMsg.SnsDownloadSightForAdShort", "download sight. %s ", new Object[] { this.qOa.getPath() + this.qOa.cop() });
    Object localObject1 = null;
    OutputStream localOutputStream1 = null;
    OutputStream localOutputStream2 = localOutputStream1;
    Object localObject2 = localObject1;
    try
    {
      byte[] arrayOfByte = new byte[1024];
      localOutputStream2 = localOutputStream1;
      localObject2 = localObject1;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localOutputStream2 = localOutputStream1;
      localObject2 = localObject1;
      localStringBuilder.<init>();
      localOutputStream2 = localOutputStream1;
      localObject2 = localObject1;
      localOutputStream1 = e.L(this.qOa.getPath() + this.qOa.cop(), false);
      localOutputStream2 = localOutputStream1;
      localObject2 = localOutputStream1;
      long l = System.currentTimeMillis();
      localOutputStream2 = localOutputStream1;
      localObject2 = localOutputStream1;
      this.qOl.value = "";
      int i = 0;
      localOutputStream2 = localOutputStream1;
      localObject2 = localOutputStream1;
      int j = paramInputStream.read(arrayOfByte);
      if (j != -1)
      {
        localOutputStream2 = localOutputStream1;
        localObject2 = localOutputStream1;
        if (j > this.qOm)
        {
          localOutputStream2 = localOutputStream1;
          localObject2 = localOutputStream1;
          this.qOm = j;
          localOutputStream2 = localOutputStream1;
          localObject2 = localOutputStream1;
          this.qOn = bo.anT();
        }
        localOutputStream2 = localOutputStream1;
        localObject2 = localOutputStream1;
        if (this.qOo == 0L)
        {
          localOutputStream2 = localOutputStream1;
          localObject2 = localOutputStream1;
          this.qOo = bo.gb(this.qOp);
        }
        localOutputStream2 = localOutputStream1;
        localObject2 = localOutputStream1;
        if (!i.Xn(af.getAccPath()))
        {
          localOutputStream2 = localOutputStream1;
          localObject2 = localOutputStream1;
          localOutputStream1.close();
          localOutputStream2 = localOutputStream1;
          localObject2 = localOutputStream1;
          paramInputStream.close();
          if (localOutputStream1 == null);
        }
      }
      while (true)
      {
        try
        {
          localOutputStream1.close();
          bool = false;
          AppMethodBeat.o(36752);
          return bool;
        }
        catch (IOException paramInputStream)
        {
          ab.printErrStackTrace("MicroMsg.SnsDownloadSightForAdShort", paramInputStream, "", new Object[0]);
          continue;
        }
        localOutputStream2 = localOutputStream1;
        localObject2 = localOutputStream1;
        localOutputStream1.write(arrayOfByte, 0, j);
        localOutputStream2 = localOutputStream1;
        localObject2 = localOutputStream1;
        this.qOt += j;
        i = 1;
        localOutputStream2 = localOutputStream1;
        localObject2 = localOutputStream1;
        if (!a(this.qOt, l, this.qOl))
          break;
        localOutputStream2 = localOutputStream1;
        localObject2 = localOutputStream1;
        l = System.currentTimeMillis();
        i = 0;
        break;
        localOutputStream2 = localOutputStream1;
        localObject2 = localOutputStream1;
        localOutputStream1.close();
        localObject2 = null;
        localOutputStream2 = null;
        if (i != 0)
          a(this.qOt, 0L, this.qOl);
        bool = true;
        AppMethodBeat.o(36752);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool;
        localObject2 = localOutputStream2;
        paramInputStream = new java/lang/StringBuilder;
        localObject2 = localOutputStream2;
        paramInputStream.<init>("snscdndownload fail : ");
        localObject2 = localOutputStream2;
        ab.printErrStackTrace("MicroMsg.SnsDownloadSightForAdShort", localException, localException.getMessage(), new Object[0]);
        localObject2 = localOutputStream2;
        ab.printErrStackTrace("MicroMsg.SnsDownloadSightForAdShort", localException, "", new Object[0]);
        if (localOutputStream2 != null);
        try
        {
          localOutputStream2.close();
          bool = false;
          AppMethodBeat.o(36752);
        }
        catch (IOException paramInputStream)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.SnsDownloadSightForAdShort", paramInputStream, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localObject2 == null);
    }
    try
    {
      ((OutputStream)localObject2).close();
      AppMethodBeat.o(36752);
      throw paramInputStream;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.SnsDownloadSightForAdShort", localIOException, "", new Object[0]);
    }
  }

  public final String Yx(String paramString)
  {
    return paramString;
  }

  public final boolean cor()
  {
    AppMethodBeat.i(36753);
    String str = i.j(this.cNr);
    e.h(this.qOa.getPath(), this.qOa.cop(), str);
    AppMethodBeat.o(36753);
    return true;
  }

  protected final int cos()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.h
 * JD-Core Version:    0.6.2
 */