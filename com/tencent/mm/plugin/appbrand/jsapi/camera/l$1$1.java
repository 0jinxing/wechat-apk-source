package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class l$1$1
  implements c
{
  l$1$1(l.1 param1)
  {
  }

  public final void Q(int paramInt, String paramString)
  {
    AppMethodBeat.i(126248);
    if (paramInt == 0)
    {
      this.hHe.hyd.M(this.hHe.eIl, this.hHe.hHd.j("ok", null));
      AppMethodBeat.o(126248);
    }
    while (true)
    {
      return;
      this.hHe.hyd.M(this.hHe.eIl, this.hHe.hHd.j("fail:".concat(String.valueOf(paramString)), null));
      AppMethodBeat.o(126248);
    }
  }

  public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(126247);
    if (paramInt1 == 0)
    {
      paramString2 = new HashMap();
      paramString2.put("tempImagePath", paramString1);
      paramString2.put("width", Integer.valueOf(paramInt2));
      paramString2.put("height", Integer.valueOf(paramInt3));
      this.hHe.hyd.M(this.hHe.eIl, this.hHe.hHd.j("ok", paramString2));
      AppMethodBeat.o(126247);
    }
    while (true)
    {
      return;
      this.hHe.hyd.M(this.hHe.eIl, this.hHe.hHd.j("fail:".concat(String.valueOf(paramString2)), null));
      AppMethodBeat.o(126247);
    }
  }

  public final void d(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(126249);
    ab.d("MicroMsg.JsApiOperateCamera", "onStopRecord ret %d, thumbPath %s,tempVideoPath %s", new Object[] { Integer.valueOf(paramInt), paramString2, paramString3 });
    if (paramInt == 0)
    {
      paramString1 = new HashMap();
      paramString1.put("tempThumbPath", paramString2);
      paramString1.put("tempVideoPath", paramString3);
      this.hHe.hyd.M(this.hHe.eIl, this.hHe.hHd.j("ok", paramString1));
      AppMethodBeat.o(126249);
    }
    while (true)
    {
      return;
      this.hHe.hyd.M(this.hHe.eIl, this.hHe.hHd.j("fail:".concat(String.valueOf(paramString1)), null));
      AppMethodBeat.o(126249);
    }
  }

  public final void g(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(126250);
    if (!bo.isNullOrNil(paramString))
    {
      this.hHe.hyd.M(this.hHe.eIl, this.hHe.hHd.j("fail:".concat(String.valueOf(paramString)), null));
      AppMethodBeat.o(126250);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.JsApiOperateCamera", "onListenFrameChange bufferId:%d width:%d height:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      paramString = new HashMap();
      paramString.put("bufferId", Integer.valueOf(paramInt1));
      paramString.put("width", Integer.valueOf(paramInt2));
      paramString.put("height", Integer.valueOf(paramInt3));
      this.hHe.hyd.M(this.hHe.eIl, this.hHe.hHd.j("ok", paramString));
      AppMethodBeat.o(126250);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.l.1.1
 * JD-Core Version:    0.6.2
 */