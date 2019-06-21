package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.w;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

final class ls$1
  implements Runnable
{
  ls$1(w paramw, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(100468);
    int i = -1;
    if (this.a != null)
      i = this.a.b("worldTileCount");
    if ((i <= 0) && (this.b <= 0))
      AppMethodBeat.o(100468);
    while (true)
    {
      return;
      label52: String str;
      if (i > 0)
      {
        i += this.b;
        str = "https://pr.map.qq.com/pingd?" + ic.a(i);
      }
      try
      {
        Object localObject = new java/net/URL;
        ((URL)localObject).<init>(str);
        int j = ((HttpURLConnection)((URL)localObject).openConnection()).getResponseCode();
        localObject = this.a;
        if (localObject == null)
        {
          AppMethodBeat.o(100468);
          continue;
          i = this.b;
          break label52;
        }
        if (j != 200)
          break label178;
        this.a.a(new String[] { "worldTileCount" });
        AppMethodBeat.o(100468);
      }
      catch (IOException localIOException)
      {
        if (this.a != null)
          this.a.a("worldTileCount", i);
        AppMethodBeat.o(100468);
      }
      continue;
      label178: this.a.a("worldTileCount", i);
      AppMethodBeat.o(100468);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ls.1
 * JD-Core Version:    0.6.2
 */