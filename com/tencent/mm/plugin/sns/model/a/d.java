package com.tencent.mm.plugin.sns.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.u;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.b.3;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class d extends b
{
  private int qOA = 0;
  private long qOz = 0L;

  public d(c.a parama, a parama1)
  {
    super(parama, parama1);
  }

  public final boolean E(InputStream paramInputStream)
  {
    AppMethodBeat.i(36748);
    com.tencent.mm.plugin.sns.model.b localb = null;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    Object localObject3 = localb;
    try
    {
      byte[] arrayOfByte = new byte[1024];
      localObject2 = localObject1;
      localObject3 = localb;
      Object localObject4 = new java/lang/StringBuilder;
      localObject2 = localObject1;
      localObject3 = localb;
      ((StringBuilder)localObject4).<init>();
      localObject2 = localObject1;
      localObject3 = localb;
      localObject4 = this.qOa.getPath() + this.qOa.cop();
      localObject2 = localObject1;
      localObject3 = localb;
      ab.i("MicroMsg.SnsDownloadAdSight", "getdatabegin ".concat(String.valueOf(e.asZ((String)localObject4))));
      localObject2 = localObject1;
      localObject3 = localb;
      localObject1 = e.L((String)localObject4, true);
      int i = 1;
      localObject2 = localObject1;
      localObject3 = localObject1;
      long l = System.currentTimeMillis();
      localObject2 = localObject1;
      localObject3 = localObject1;
      this.qOl.value = "";
      int j = 0;
      localObject2 = localObject1;
      localObject3 = localObject1;
      int k = paramInputStream.read(arrayOfByte);
      if (k != -1)
      {
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (this.qOo == 0L)
        {
          localObject2 = localObject1;
          localObject3 = localObject1;
          this.qOo = bo.gb(this.qOp);
        }
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (k > this.qOm)
        {
          localObject2 = localObject1;
          localObject3 = localObject1;
          this.qOm = k;
          localObject2 = localObject1;
          localObject3 = localObject1;
          this.qOn = bo.anT();
        }
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (!i.Xn(af.getAccPath()))
        {
          localObject2 = localObject1;
          localObject3 = localObject1;
          ab.i("MicroMsg.SnsDownloadAdSight", "read data");
          localObject2 = localObject1;
          localObject3 = localObject1;
          ((OutputStream)localObject1).close();
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramInputStream.close();
          if (localObject1 == null);
        }
      }
      while (true)
      {
        try
        {
          ((OutputStream)localObject1).close();
          bool = false;
          AppMethodBeat.o(36748);
          return bool;
        }
        catch (IOException paramInputStream)
        {
          ab.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
          continue;
        }
        localObject2 = localObject1;
        localObject3 = localObject1;
        ((OutputStream)localObject1).write(arrayOfByte, 0, k);
        localObject2 = localObject1;
        localObject3 = localObject1;
        this.qOt += k;
        k = i;
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (this.qOt - this.qOA > 409600 * i)
        {
          localObject2 = localObject1;
          localObject3 = localObject1;
          localb = af.cnA();
          localObject2 = localObject1;
          localObject3 = localObject1;
          String str = this.qOa.cHr;
          localObject2 = localObject1;
          localObject3 = localObject1;
          ak localak = af.bCo();
          localObject2 = localObject1;
          localObject3 = localObject1;
          b.3 local3 = new com/tencent/mm/plugin/sns/model/b$3;
          localObject2 = localObject1;
          localObject3 = localObject1;
          local3.<init>(localb, str, (String)localObject4);
          localObject2 = localObject1;
          localObject3 = localObject1;
          localak.post(local3);
          localObject2 = localObject1;
          localObject3 = localObject1;
          this.qOA = this.qOt;
          k = i + 1;
        }
        j = 1;
        i = k;
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (!a(this.qOt, l, this.qOl))
          break;
        localObject2 = localObject1;
        localObject3 = localObject1;
        l = System.currentTimeMillis();
        j = 0;
        i = k;
        break;
        localObject2 = localObject1;
        localObject3 = localObject1;
        ((OutputStream)localObject1).close();
        localObject3 = null;
        localObject2 = null;
        if (j != 0)
          a(this.qOt, 0L, this.qOl);
        ab.i("MicroMsg.SnsDownloadAdSight", "getdataend2  ".concat(String.valueOf(e.asZ(this.qOa.getPath() + this.qOa.cop()))));
        bool = true;
        AppMethodBeat.o(36748);
      }
    }
    catch (Exception paramInputStream)
    {
      while (true)
      {
        boolean bool;
        localObject3 = localObject2;
        localObject1 = new java/lang/StringBuilder;
        localObject3 = localObject2;
        ((StringBuilder)localObject1).<init>("snscdndownload fail : ");
        localObject3 = localObject2;
        ab.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, paramInputStream.getMessage(), new Object[0]);
        localObject3 = localObject2;
        ab.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
        if (localObject2 != null);
        try
        {
          localObject2.close();
          bool = false;
          AppMethodBeat.o(36748);
        }
        catch (IOException paramInputStream)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localObject3 == null);
    }
    try
    {
      ((OutputStream)localObject3).close();
      AppMethodBeat.o(36748);
      throw paramInputStream;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.SnsDownloadAdSight", localIOException, "", new Object[0]);
    }
  }

  public final String Yx(String paramString)
  {
    return paramString;
  }

  public final u b(u paramu)
  {
    AppMethodBeat.i(36747);
    this.qOz = 0L;
    if (this.qOz > 0L)
    {
      ab.i("MicroMsg.SnsDownloadAdSight", "appendHttpArg range " + this.qOz);
      paramu.setRequestProperty("RANGE", "bytes=" + this.qOz + "-");
    }
    AppMethodBeat.o(36747);
    return paramu;
  }

  public final boolean coq()
  {
    return false;
  }

  public final boolean cor()
  {
    AppMethodBeat.i(36749);
    long l = e.asZ(this.qOa.getPath() + this.qOa.cop());
    ab.i("MicroMsg.SnsDownloadAdSight", "preceeData  downloadLen " + l + " " + this.qOq);
    boolean bool;
    if (l < this.qOq + this.qOz)
    {
      bool = false;
      AppMethodBeat.o(36749);
    }
    while (true)
    {
      return bool;
      String str = i.k(this.cNr);
      e.h(this.qOa.getPath(), this.qOa.cop(), str);
      bool = true;
      AppMethodBeat.o(36749);
    }
  }

  protected final int cos()
  {
    return 4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.d
 * JD-Core Version:    0.6.2
 */