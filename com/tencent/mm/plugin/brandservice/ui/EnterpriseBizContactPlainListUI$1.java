package com.tencent.mm.plugin.brandservice.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class EnterpriseBizContactPlainListUI$1
  implements AdapterView.OnItemClickListener
{
  EnterpriseBizContactPlainListUI$1(EnterpriseBizContactPlainListUI paramEnterpriseBizContactPlainListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(13980);
    ab.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "onItemClick position = %s", new Object[] { Integer.valueOf(paramInt) });
    EnterpriseBizContactPlainListUI.a(this.jMl, paramInt);
    AppMethodBeat.o(13980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI.1
 * JD-Core Version:    0.6.2
 */