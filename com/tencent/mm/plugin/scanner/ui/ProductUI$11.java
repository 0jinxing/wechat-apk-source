package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.f;
import java.util.HashMap;

final class ProductUI$11
  implements e.a
{
  ProductUI$11(ProductUI paramProductUI)
  {
  }

  public final Boolean Wg(String paramString)
  {
    AppMethodBeat.i(81093);
    if ((paramString != null) && (paramString.length() > 0))
    {
      paramString = (Boolean)ProductUI.k(this.qdu).get(paramString);
      AppMethodBeat.o(81093);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(81093);
    }
  }

  public final void a(String paramString, Boolean paramBoolean)
  {
    AppMethodBeat.i(81092);
    if ((paramString != null) && (paramString.length() > 0))
      ProductUI.k(this.qdu).put(paramString, paramBoolean);
    AppMethodBeat.o(81092);
  }

  public final void chl()
  {
    AppMethodBeat.i(81094);
    if (this.qdu.ehK != null)
      this.qdu.ehK.notifyDataSetChanged();
    AppMethodBeat.o(81094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.11
 * JD-Core Version:    0.6.2
 */