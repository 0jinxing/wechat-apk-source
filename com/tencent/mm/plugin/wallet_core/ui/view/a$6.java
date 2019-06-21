package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.e.c;

final class a$6
  implements e.c
{
  a$6(Context paramContext, a.a parama, TextView paramTextView1, EditText paramEditText, String paramString1, String paramString2, TextView paramTextView2)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(47859);
    if ((this.val$context instanceof MMActivity))
      if (this.tMZ != null)
        if (!bo.isNullOrNil(this.tNf.getText().toString().trim()))
          break label119;
    label119: for (paramBoolean = true; ; paramBoolean = false)
    {
      this.tMZ.a(paramBoolean, this.tMX.getText().toString().trim(), this.val$name, this.tNb, this.tNc.getText().toString().trim());
      if ((this.val$context instanceof MMActivity))
        al.d(new a.6.1(this));
      AppMethodBeat.o(47859);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.a.6
 * JD-Core Version:    0.6.2
 */