package com.tencent.mm.plugin.nearlife.ui;

import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class NearLifeCreatePoiUI$5
  implements c.a
{
  NearLifeCreatePoiUI$5(NearLifeCreatePoiUI paramNearLifeCreatePoiUI)
  {
  }

  public final void b(Addr paramAddr)
  {
    AppMethodBeat.i(22976);
    String str1 = bo.nullAsNil(paramAddr.fBi) + bo.nullAsNil(paramAddr.fBk);
    String str2 = bo.nullAsNil(paramAddr.fBl) + bo.nullAsNil(paramAddr.fBm);
    ab.d("MicroMsg.NearLifeCreatePoiUI", "get address:".concat(String.valueOf(str1)));
    if (bo.isNullOrNil(NearLifeCreatePoiUI.e(this.oSJ).getText().toString()))
      NearLifeCreatePoiUI.e(this.oSJ).setText(str1);
    if ((bo.isNullOrNil(NearLifeCreatePoiUI.f(this.oSJ).getText().toString())) && (!bo.isNullOrNil(str2)))
      NearLifeCreatePoiUI.f(this.oSJ).setText(str2);
    NearLifeCreatePoiUI.a(this.oSJ, paramAddr);
    AppMethodBeat.o(22976);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI.5
 * JD-Core Version:    0.6.2
 */