package com.tencent.mm.plugin.remittance.ui;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bl;
import com.tencent.mm.plugin.remittance.model.v;
import com.tencent.mm.ui.widget.a.e.c;

final class c$2
  implements e.c
{
  c$2(c paramc, v paramv, EditText paramEditText)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(44815);
    if (paramBoolean)
    {
      paramString = new bl();
      paramString.dcq = this.pQM.nUf;
      paramString = paramString.ge(this.pQM.username);
      paramString.dck = 3L;
      paramString.ajK();
      this.pQL.pQJ.VS(this.pQK.getText().toString());
      AppMethodBeat.o(44815);
    }
    while (true)
    {
      return;
      paramString = new bl();
      paramString.dcq = this.pQM.nUf;
      paramString = paramString.ge(this.pQM.username);
      paramString.dck = 2L;
      paramString.ajK();
      this.pQL.pQJ.onCancel();
      AppMethodBeat.o(44815);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.c.2
 * JD-Core Version:    0.6.2
 */