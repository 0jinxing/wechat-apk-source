package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.e;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.pluginsdk.g.a.c.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import javax.net.ssl.SSLException;

abstract class ap$a$a
  implements g.a
{
  private final ap.c gUu;

  ap$a$a(ap.c paramc)
  {
    this.gUu = paramc;
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, d paramd, boolean paramBoolean)
  {
    if (paramInt != 0)
    {
      b(new m(this.gUu, new SSLException(String.format(Locale.US, "CdnHttpsAddTaskFailed$%s$%d", new Object[] { this.gUu.dib(), Integer.valueOf(paramInt) })), 3));
      ab.e("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "urlKey %s, startRet %d", new Object[] { this.gUu.dib(), Integer.valueOf(paramInt) });
    }
    while (true)
    {
      return 0;
      if (paramc == null)
        break;
      paramString = this.gUu.vft;
      if (paramString != null)
      {
        paramc = new WxaPkgLoadProgress((int)(paramc.field_finishedLength / paramc.field_toltalLength * 100.0F), paramc.field_finishedLength, paramc.field_toltalLength);
        paramString.a(this.gUu.dib(), paramc);
      }
    }
    if (paramd != null)
    {
      ab.i("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "urlKey %s, retCode %d, responseHeader %s", new Object[] { this.gUu.dib(), Integer.valueOf(paramd.field_retCode), paramd.field_httpResponseHeader });
      if (paramd.field_retCode == 0)
        break label323;
      if ((paramd.field_fileLength <= 0) || (this.gUu.gh(paramd.field_fileLength)))
        break label262;
      paramString = new m(this.gUu, new com.tencent.mm.pluginsdk.g.a.b.a(), paramd.field_httpStatusCode, 3);
      label254: b(paramString);
    }
    while (true)
    {
      break;
      label262: paramString = new m(this.gUu, new SSLException(String.format(Locale.US, "CdnHttpsDownloadFailed$%s$%d", new Object[] { this.gUu.dib(), Integer.valueOf(paramd.field_retCode) })), paramd.field_httpStatusCode, 3);
      break label254;
      label323: b(new m(this.gUu, paramd.field_fileLength, null));
      paramInt = (int)e.asZ(this.gUu.avZ().getFilePath());
      if (ao.a.flv != null)
        ao.a.flv.cm(paramInt, 0);
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  abstract void b(m paramm);

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ap.a.a
 * JD-Core Version:    0.6.2
 */