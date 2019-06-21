package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class d$1
  implements Runnable
{
  d$1(d paramd, String paramString, c paramc, int paramInt1, WeakReference paramWeakReference, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114353);
    Object localObject;
    d.a locala;
    c localc;
    if ((!bo.isNullOrNil(this.val$filePath)) && (this.val$filePath.startsWith("wxfile://")))
    {
      localObject = new d.b((byte)0);
      locala = ((d.c)localObject).a(this.hyd, this.val$filePath, this.hPX);
      if ((this.hPY.get() == null) || (!((c)this.hPY.get()).isRunning()))
        break label260;
      localc = (c)this.hPY.get();
      if ((locala.success) || (!bo.isNullOrNil(locala.result)))
        break label156;
      ab.w("MicroMsg.JsApiCompressImage.javayhu", "worker:compress image fail");
      localc.M(this.eIl, this.hPZ.j("fail:compress image fail", null));
      AppMethodBeat.o(114353);
    }
    label260: 
    while (true)
    {
      return;
      localObject = new d.d((byte)0);
      break;
      label156: if (!locala.success)
      {
        ab.w("MicroMsg.JsApiCompressImage.javayhu", "worker:compress image fail, message:%s", new Object[] { locala.result });
        localc.M(this.eIl, this.hPZ.j(locala.result, null));
        AppMethodBeat.o(114353);
      }
      else
      {
        localObject = new HashMap();
        ((Map)localObject).put("tempFilePath", locala.result);
        localc.M(this.eIl, this.hPZ.j("ok", (Map)localObject));
        AppMethodBeat.o(114353);
        continue;
        ab.w("MicroMsg.JsApiCompressImage.javayhu", "worker:component is null");
        AppMethodBeat.o(114353);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.d.1
 * JD-Core Version:    0.6.2
 */