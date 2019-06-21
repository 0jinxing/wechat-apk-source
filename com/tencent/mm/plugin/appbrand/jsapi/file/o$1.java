package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

final class o$1
  implements Runnable
{
  o$1(o paramo, c paramc, String paramString1, int paramInt, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102784);
    Object localObject = this.hyd.asE().yg(this.hJL);
    if (localObject == null)
    {
      this.hyd.M(this.eIl, this.hJN.j("fail:file doesn't exist", null));
      AppMethodBeat.o(102784);
      return;
    }
    File localFile = new File(((File)localObject).getAbsolutePath());
    localObject = this.hJM;
    int i = -1;
    switch (((String)localObject).hashCode())
    {
    default:
      switch (i)
      {
      default:
        label108: localObject = "";
      case 0:
      case 1:
      }
      break;
    case 107902:
    case 3528965:
    }
    while (true)
    {
      HashMap localHashMap = new HashMap(2);
      localHashMap.put("size", Long.valueOf(localFile.length()));
      localHashMap.put("digest", localObject);
      this.hyd.M(this.eIl, this.hJN.j("ok", localHashMap));
      AppMethodBeat.o(102784);
      break;
      if (!((String)localObject).equals("md5"))
        break label108;
      i = 0;
      break label108;
      if (!((String)localObject).equals("sha1"))
        break label108;
      i = 1;
      break label108;
      localObject = g.v(localFile);
      continue;
      localObject = o.H(localFile);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.o.1
 * JD-Core Version:    0.6.2
 */