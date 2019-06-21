package com.tencent.mm.plugin.appbrand.l;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.q;
import com.tencent.mm.plugin.appbrand.s.q.a;
import com.tencent.mm.plugin.appbrand.s.q.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

final class d$1
  implements Runnable
{
  d$1(d paramd, c paramc, JSONObject paramJSONObject, d.a parama, String paramString1, int paramInt, Map paramMap, ArrayList paramArrayList, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(108148);
    if (q.a(this.hxc.aBx(), this.ioC, (q.a)this.hxc.aa(q.a.class)) == q.b.iRJ)
    {
      this.ioD.BA("convert native buffer parameter fail. native buffer exceed size limit.");
      AppMethodBeat.o(108148);
    }
    while (true)
    {
      return;
      String str = j.CS(this.ioC.optString("url"));
      Object localObject1 = this.ioC.opt("data");
      ??? = this.ioC.optString("method");
      Object localObject4 = ???;
      if (bo.isNullOrNil((String)???))
        localObject4 = "GET";
      if (TextUtils.isEmpty(str))
      {
        this.ioD.BA("url is null");
        AppMethodBeat.o(108148);
        continue;
      }
      if ((!URLUtil.isHttpsUrl(str)) && (!URLUtil.isHttpUrl(str)))
      {
        this.ioD.BA("request protocol must be http or https");
        AppMethodBeat.o(108148);
        continue;
      }
      ??? = new byte[0];
      ??? = ???;
      if (localObject1 != null)
      {
        ??? = ???;
        if (d.CK((String)localObject4))
        {
          if (!(localObject1 instanceof String))
            break label301;
          ??? = ((String)localObject1).getBytes(Charset.forName("UTF-8"));
        }
      }
      synchronized (this.ioI.ioA)
      {
        while (true)
        {
          if (this.ioI.ioA.size() < this.ioI.ioB)
            break label322;
          this.ioD.BA("max connected");
          ab.i("MicroMsg.AppBrandNetworkRequest", "max connected mRequestTaskList.size():%d,mMaxRequestConcurrent:%d", new Object[] { Integer.valueOf(this.ioI.ioA.size()), Integer.valueOf(this.ioI.ioB) });
          AppMethodBeat.o(108148);
          break;
          label301: ??? = ???;
          if ((localObject1 instanceof ByteBuffer))
            ??? = com.tencent.mm.plugin.appbrand.r.d.q((ByteBuffer)localObject1);
        }
        label322: ab.i("MicroMsg.AppBrandNetworkRequest", "request taskId %s, method %s ,url %s timeout %s", new Object[] { this.hvm, localObject4, str, Integer.valueOf(this.ioE) });
        localObject4 = new e(str, (byte[])???, this.ioE, this.ioD, (String)localObject4);
        ((e)localObject4).ioM = this.ioF;
        ((e)localObject4).ioN = this.ioG;
        ((e)localObject4).ioR = this.ioH;
        ((e)localObject4).ioP = this.ioC.optString("responseType", "text");
      }
      synchronized (this.ioI.ioA)
      {
        this.ioI.ioA.add(localObject4);
        ((e)localObject4).hvr = this.hvm;
        d.a(this.ioI, (e)localObject4);
        AppMethodBeat.o(108148);
        continue;
        localObject3 = finally;
        AppMethodBeat.o(108148);
        throw localObject3;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.d.1
 * JD-Core Version:    0.6.2
 */