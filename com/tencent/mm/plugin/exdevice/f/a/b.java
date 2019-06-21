package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.io.IOException;

public final class b
{
  public static String Kl(String paramString)
  {
    AppMethodBeat.i(19434);
    if ((bo.isNullOrNil(paramString)) || ("#".equals(paramString)))
    {
      paramString = "";
      AppMethodBeat.o(19434);
    }
    while (true)
    {
      return paramString;
      String str = ag.ck(paramString);
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(d.bpj(), str);
      if (localb.exists())
      {
        paramString = j.w(localb.dMD());
        AppMethodBeat.o(19434);
        continue;
      }
      try
      {
        localb.createNewFile();
        aw.RS().aa(new a(paramString, localb));
        paramString = "";
        AppMethodBeat.o(19434);
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.d("MicroMsg.ExdevicePictureLocalizer", "hy: %s", new Object[] { localIOException.toString() });
      }
    }
  }

  static final class a
    implements Runnable
  {
    private com.tencent.mm.vfs.b lvo;
    private String url;

    a(String paramString, com.tencent.mm.vfs.b paramb)
    {
      this.url = paramString;
      this.lvo = paramb;
    }

    public final void run()
    {
      AppMethodBeat.i(19432);
      byte[] arrayOfByte = bo.ano(this.url);
      if (arrayOfByte != null)
        e.b(j.w(this.lvo.mUri), arrayOfByte, arrayOfByte.length);
      AppMethodBeat.o(19432);
    }

    public final String toString()
    {
      AppMethodBeat.i(19433);
      String str = super.toString() + "|DownloadRunnable";
      AppMethodBeat.o(19433);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.b
 * JD-Core Version:    0.6.2
 */