package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.base.g;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.TXLivePusher.ITXSnapshotListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

final class d$2
  implements TXLivePusher.ITXSnapshotListener
{
  d$2(d paramd, g paramg, com.tencent.mm.plugin.appbrand.jsapi.e parame)
  {
  }

  public final void onSnapshot(Bitmap paramBitmap)
  {
    AppMethodBeat.i(96113);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      ab.e("MicroMsg.JsApiOperateLivePusher", "onSnapshot: bitmap nil");
      this.hCL.AR(this.hLD.j("fail:snapshot error", null));
      AppMethodBeat.o(96113);
    }
    while (true)
    {
      return;
      String str = com.tencent.mm.compatible.util.e.euR + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" });
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      com.tencent.mm.plugin.appbrand.r.j localj;
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramBitmap, 90, Bitmap.CompressFormat.JPEG, str, true);
        localj = new com.tencent.mm.plugin.appbrand.r.j();
        if (this.hLB.asE().a(new File(str), "jpg", true, localj) == com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
          break label227;
        this.hCL.AR(this.hLD.j("fail:snapshot error", null));
        AppMethodBeat.o(96113);
      }
      catch (IOException paramBitmap)
      {
        ab.e("MicroMsg.JsApiOperateLivePusher", "onSnapshot: exception %s", new Object[] { paramBitmap.getMessage() });
        this.hCL.AR(this.hLD.j("fail:snapshot error", null));
        AppMethodBeat.o(96113);
      }
      continue;
      label227: if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      {
        ab.i("MicroMsg.JsApiOperateLivePusher", "bitmap recycle " + paramBitmap.toString());
        paramBitmap.recycle();
      }
      ab.i("MicroMsg.JsApiOperateLivePusher", "onSnapshot: actualPath:%s path:%s", new Object[] { str, localj.value });
      paramBitmap = new HashMap();
      paramBitmap.put("tempImagePath", localj.value);
      paramBitmap.put("width", Integer.valueOf(i));
      paramBitmap.put("height", Integer.valueOf(j));
      this.hCL.AR(this.hLD.j("ok", paramBitmap));
      AppMethodBeat.o(96113);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.d.2
 * JD-Core Version:    0.6.2
 */