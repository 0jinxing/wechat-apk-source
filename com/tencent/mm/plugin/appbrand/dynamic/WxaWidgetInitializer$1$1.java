package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.j.a;
import com.tencent.mm.plugin.appbrand.dynamic.j.a.e;
import com.tencent.mm.plugin.appbrand.dynamic.j.d;
import com.tencent.mm.protocal.protobuf.cvy;
import com.tencent.mm.sdk.platformtools.ab;

final class WxaWidgetInitializer$1$1
  implements a.e
{
  WxaWidgetInitializer$1$1(WxaWidgetInitializer.1 param1, d paramd)
  {
  }

  public final void ac(String paramString, boolean paramBoolean)
  {
    boolean bool1 = false;
    AppMethodBeat.i(10717);
    String str = null;
    ab.d("MicroMsg.WxaWidgetInitializer", "tryToUpdate(id : %s, pkgType : %s, version : %s), callback(%s, %s).", new Object[] { this.hlT.val$id, Integer.valueOf(this.hlT.gQG), Integer.valueOf(this.hlS.hoY.vMG), paramString, Boolean.valueOf(paramBoolean) });
    u.i("MicroMsg.WxaWidgetInitializer", "tryToUpdate(id : %s, pkgType : %s, version : %s), callback(%s, %s).", new Object[] { this.hlT.val$id, Integer.valueOf(this.hlT.gQG), Integer.valueOf(this.hlS.hoY.vMG), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject = str;
    boolean bool2 = paramBoolean;
    if (paramBoolean)
    {
      localObject = a.b(this.hlT.val$id, paramString, this.hlT.hlQ, this.hlT.gQG);
      if (localObject == null)
        break label262;
      localObject = WxaWidgetInitializer.a(this.hlT.val$id, paramString, (WxaPkgWrappingInfo)localObject, this.hlS);
      bool2 = paramBoolean;
    }
    while (true)
    {
      if (this.hlT.hlP != null)
      {
        WxaWidgetInitializer.a locala = this.hlT.hlP;
        str = this.hlT.val$id;
        paramBoolean = bool1;
        if (bool2)
        {
          paramBoolean = bool1;
          if (localObject != null)
            paramBoolean = true;
        }
        locala.a(str, paramString, paramBoolean, (WxaWidgetContext)localObject);
      }
      AppMethodBeat.o(10717);
      return;
      label262: bool2 = false;
      localObject = str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetInitializer.1.1
 * JD-Core Version:    0.6.2
 */