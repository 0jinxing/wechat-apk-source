package com.tencent.mm.plugin.topstory.ui.webview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.websearch.api.ao;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.b;
import com.tencent.xweb.util.d;

final class c$a
  implements Runnable
{
  private c$a(c paramc)
  {
  }

  private static long bl(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    for (long l = 0L; ; l = paramArrayOfByte.length)
      return l;
  }

  public final void run()
  {
    AppMethodBeat.i(2152);
    long l = System.currentTimeMillis();
    Object localObject = aa.HQ(1);
    String str1 = String.format("%s/%s", new Object[] { ((ao)localObject).aLD(), "app.html" });
    String str2 = String.format("%s/%s", new Object[] { ((ao)localObject).aLD(), "dist/build.js" });
    String str3 = String.format("%s/%s", new Object[] { ((ao)localObject).aLD(), "dist/style.css" });
    this.sHB.sHw = com.tencent.mm.vfs.e.e(str1, 0, -1);
    this.sHB.sHx = com.tencent.mm.vfs.e.e(str2, 0, -1);
    this.sHB.sHy = com.tencent.mm.vfs.e.e(str3, 0, -1);
    String str4 = d.x(this.sHB.sHx);
    String str5 = ((ao)localObject).cVz();
    if ((str4 == null) || (!str4.equals(str5)))
    {
      com.tencent.mm.a.e.cu(((ao)localObject).aLD());
      aa.a(new b(((ao)localObject).aLD()), 1);
      this.sHB.sHw = com.tencent.mm.vfs.e.e(str1, 0, -1);
      this.sHB.sHx = com.tencent.mm.vfs.e.e(str2, 0, -1);
      this.sHB.sHy = com.tencent.mm.vfs.e.e(str3, 0, -1);
      str1 = d.x(this.sHB.sHx);
      localObject = ((ao)localObject).cVz();
      an.Il(21);
      ab.i("MicroMsg.TopStory.TopStoryWebData", "update template file fileJSMd5 %s configJSMD5 %s", new Object[] { str1, localObject });
      ab.i("MicroMsg.TopStory.TopStoryWebData", "loadHtmlDataFromSdcard totalLength: %d usetime: %d fileJSMd5 %s configJSMD5 %s", new Object[] { Long.valueOf(bl(this.sHB.sHw) + bl(this.sHB.sHx) + bl(this.sHB.sHy)), Long.valueOf(System.currentTimeMillis() - l), str1, localObject });
    }
    AppMethodBeat.o(2152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.c.a
 * JD-Core Version:    0.6.2
 */