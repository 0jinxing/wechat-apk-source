package com.tencent.mm.plugin.appbrand.game.e.a;

import android.text.Editable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.widget.input.WAGamePanelInputEditText;
import com.tencent.mm.plugin.appbrand.game.widget.input.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class f$1
  implements Runnable
{
  f$1(f paramf, q paramq, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130214);
    Object localObject;
    if (this.hsD.isRunning())
    {
      localObject = this.hsD.getCurrentPageView();
      if (localObject != null);
    }
    else
    {
      AppMethodBeat.o(130214);
    }
    while (true)
    {
      return;
      localObject = a.ck(((u)localObject).getContentView());
      if (localObject != null)
      {
        WAGamePanelInputEditText localWAGamePanelInputEditText = ((a)localObject).getAttachedEditText();
        int i = localWAGamePanelInputEditText.getMaxLength();
        ab.v("MicroMsg.WAGameJsApiUpdateKeyboard", "maxLength(%d).", new Object[] { Integer.valueOf(i) });
        if (!bo.isNullOrNil(this.gdK))
          if (i > 0)
            if (this.gdK.length() > i)
            {
              localObject = this.gdK.substring(0, i);
              label108: localWAGamePanelInputEditText.setText((CharSequence)localObject);
              label113: localWAGamePanelInputEditText.setSelection(localWAGamePanelInputEditText.getText().length());
            }
        while (true)
        {
          this.hsD.M(this.eIl, this.hsE.j("ok", null));
          AppMethodBeat.o(130214);
          break;
          localObject = this.gdK;
          break label108;
          localWAGamePanelInputEditText.setText(this.gdK);
          break label113;
          localWAGamePanelInputEditText.setText("");
        }
      }
      this.hsD.M(this.eIl, this.hsE.j("fail", null));
      AppMethodBeat.o(130214);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.a.f.1
 * JD-Core Version:    0.6.2
 */