package com.tencent.mm.plugin.webview.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.webview.model.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.util.Map;

final class b$a
  implements g.a
{
  private b$a(b paramb)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(10132);
    ab.d("MicroMsg.VestImgUploadEngine", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
    paramc = this.uKP;
    if (paramd != null);
    try
    {
      if ((paramd.field_retCode != 0) || (paramInt != 0));
      while (true)
      {
        return 0;
        paramString = (String)this.uKP.uKM.get(paramString);
        if (!this.uKP.hWL.equals(paramString))
        {
          ab.i("MicroMsg.VestImgUploadEngine", "currentPath=%s,callbackPath=%s, path updated after CDNTaskCallback", new Object[] { this.uKP.hWL, paramString });
          AppMethodBeat.o(10132);
        }
        else
        {
          ab.i("MicroMsg.VestImgUploadEngine", "CDN upload success, file url = %s", new Object[] { paramd.field_fileUrl });
          h localh = new com/tencent/mm/plugin/webview/model/h;
          localh.<init>(paramd.field_fileUrl, this.uKP.appId, paramString);
          g.Rg().a(localh, 0);
          AppMethodBeat.o(10132);
        }
      }
    }
    finally
    {
      AppMethodBeat.o(10132);
    }
    throw paramString;
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.e.b.a
 * JD-Core Version:    0.6.2
 */