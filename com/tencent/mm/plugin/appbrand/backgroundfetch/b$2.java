package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.cxb;
import com.tencent.mm.protocal.protobuf.cxc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class b$2
  implements b.a
{
  b$2(i parami, cxb paramcxb, int paramInt)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(129760);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramb != null) && (paramb.fsH.fsP != null) && ((paramb.fsH.fsP instanceof cxc)))
    {
      paramString = (cxc)paramb.fsH.fsP;
      if ((paramString.xsD != null) && (!paramString.xsD.isEmpty()))
      {
        ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data success");
        this.hbY.e(paramString.xsD, this.hbZ.xsC);
        AppMethodBeat.o(129760);
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data fail:data is null");
      this.hbY.onFail(this.bVv);
      AppMethodBeat.o(129760);
      continue;
      ab.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data fail:request fail");
      this.hbY.onFail(this.bVv);
      AppMethodBeat.o(129760);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.b.2
 * JD-Core Version:    0.6.2
 */