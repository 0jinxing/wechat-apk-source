package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.product.b.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class MallProductUI$5
  implements AdapterView.OnItemClickListener
{
  MallProductUI$5(MallProductUI paramMallProductUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44161);
    paramView = (m)paramView.getTag();
    paramAdapterView = MallProductUI.e(this.pke);
    Object localObject;
    if ((paramView != null) && (paramView.pjH != null))
    {
      localObject = paramView.pjH;
      ab.i("MicroMsg.MallProductUI", "goProductUI type : " + ((n.a)localObject).type);
      switch (((n.a)localObject).type)
      {
      default:
      case 0:
      case 1:
      }
    }
    while (true)
    {
      AppMethodBeat.o(44161);
      while (true)
      {
        return;
        paramView = new Intent();
        paramView.putExtra("rawUrl", ((n.a)localObject).url);
        d.b(paramAdapterView.gNy, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
        AppMethodBeat.o(44161);
      }
      localObject = ((n.a)localObject).data.replace("product_id=", "");
      paramView = new Intent();
      paramView.putExtra("key_product_id", (String)localObject);
      paramView.putExtra("key_product_scene", 6);
      d.b(paramAdapterView.gNy, "mall", ".product.ui.MallProductUI", paramView);
      paramAdapterView.gNy.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI.5
 * JD-Core Version:    0.6.2
 */