package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.amt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;

final class AppBrandProfileUI$a
  implements b.a
{
  WeakReference<AppBrandProfileUI> iIm;

  public AppBrandProfileUI$a(AppBrandProfileUI paramAppBrandProfileUI)
  {
    AppMethodBeat.i(133049);
    this.iIm = new WeakReference(paramAppBrandProfileUI);
    AppMethodBeat.o(133049);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(133050);
    if ((this.iIm != null) && (this.iIm.get() != null))
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramb != null) && (paramb.fsH.fsP != null) && ((paramb.fsH.fsP instanceof amt)))
      {
        ab.i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "queryProfile, request success");
        al.d(new AppBrandProfileUI.a.1(this, (amt)paramb.fsH.fsP));
        AppMethodBeat.o(133050);
      }
    while (true)
    {
      return;
      ab.e("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "queryProfile, request fail");
      AppMethodBeat.o(133050);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.a
 * JD-Core Version:    0.6.2
 */