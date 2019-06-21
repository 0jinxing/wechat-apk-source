package com.tencent.mm.plugin.recharge.ui;

import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.a;
import com.tencent.mm.sdk.platformtools.bo;

final class MallEditText$a$a$3
  implements Runnable
{
  MallEditText$a$a$3(MallEditText.a.a parama, a parama1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44216);
    MallEditText.a(this.pGI.pGH.pGB, this.pGJ);
    if (!bo.isNullOrNil(MallEditText.e(this.pGI.pGH.pGB).name))
    {
      MallEditText.g(this.pGI.pGH.pGB).setText(MallEditText.e(this.pGI.pGH.pGB).name);
      MallEditText.g(this.pGI.pGH.pGB).setVisibility(0);
    }
    while (true)
    {
      MallEditText.a(this.pGI.pGH.pGB).dismissDropDown();
      AppMethodBeat.o(44216);
      return;
      MallEditText.g(this.pGI.pGH.pGB).setText("");
      MallEditText.g(this.pGI.pGH.pGB).setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.MallEditText.a.a.3
 * JD-Core Version:    0.6.2
 */