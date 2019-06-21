package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

final class b$1$1
  implements AdapterView.OnItemClickListener
{
  b$1$1(b.1 param1, com.tencent.mm.plugin.appbrand.widget.b.b paramb)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(74781);
    paramAdapterView = new HashMap();
    paramAdapterView.put("tapIndex", Integer.valueOf(paramInt));
    this.hUV.hsD.M(this.hUV.eIl, this.hUV.hUT.j("ok", paramAdapterView));
    this.hUU.dismiss();
    AppMethodBeat.o(74781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.b.1.1
 * JD-Core Version:    0.6.2
 */