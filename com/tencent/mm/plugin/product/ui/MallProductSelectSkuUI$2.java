package com.tencent.mm.plugin.product.ui;

import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class MallProductSelectSkuUI$2
  implements AdapterView.OnItemClickListener
{
  MallProductSelectSkuUI$2(MallProductSelectSkuUI paramMallProductSelectSkuUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = null;
    AppMethodBeat.i(44106);
    Object localObject = (Pair)paramView.getTag();
    paramView = this.pju;
    c localc = MallProductSelectSkuUI.b(this.pju);
    String str = (String)((Pair)localObject).first;
    localObject = (String)((Pair)localObject).second;
    ab.d("MicroMsg.MallProductManager", "selectSkuInfo (" + str + " , " + (String)localObject + ")");
    if ((localc.pha.containsKey(str)) && (((String)localc.pha.get(str)).equals(localObject)))
    {
      localc.pha.remove(str);
      localc.pgS = c.V(localc.pha);
      if (localc.pgZ != null)
        paramAdapterView = (e)localc.pgZ.get(localc.pgS);
    }
    for (localc.phd = paramAdapterView; ; localc.phd = ((e)localc.pgZ.get(localc.pgS)))
    {
      localc.bZU();
      paramAdapterView = localc.phd;
      do
      {
        MallProductSelectSkuUI.a(paramView, paramAdapterView);
        MallProductSelectSkuUI.a(this.pju);
        AppMethodBeat.o(44106);
        return;
        paramAdapterView = null;
        break;
        localc.pha.put(str, localObject);
        localc.pgS = c.V(localc.pha);
        ab.d("MicroMsg.MallProductManager", "getSkuInfoId (" + localc.pgS + ")");
      }
      while (localc.pgZ == null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI.2
 * JD-Core Version:    0.6.2
 */