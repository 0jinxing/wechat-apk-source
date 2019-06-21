package com.tencent.mm.at;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.util.HashMap;

final class c$b
  implements Runnable
{
  private HashMap<String, c.c> fDl;
  private String url;

  c$b(String paramString, HashMap<String, c.c> paramHashMap)
  {
    this.url = paramString;
    this.fDl = paramHashMap;
  }

  public final void run()
  {
    AppMethodBeat.i(78166);
    Object localObject1 = bo.ano(this.url);
    if (localObject1 == null)
    {
      ab.w("MicroMsg.CdnImageService", "download fail: url[%s] data is null", new Object[] { this.url });
      AppMethodBeat.o(78166);
    }
    while (true)
    {
      return;
      try
      {
        localObject1 = d.bQ((byte[])localObject1);
        ab.i("MicroMsg.CdnImageService", "download finish, url[%s], do post job", new Object[] { this.url });
        al.d(new c.a(this.url, (Bitmap)localObject1, this.fDl));
        AppMethodBeat.o(78166);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.w("MicroMsg.CdnImageService", "download fail: url[%s] decode bitmap error[%s]", new Object[] { this.url, localException.getLocalizedMessage() });
          Object localObject2 = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.c.b
 * JD-Core Version:    0.6.2
 */