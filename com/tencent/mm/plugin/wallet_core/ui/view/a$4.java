package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.e.a;

final class a$4
  implements View.OnClickListener
{
  a$4(a.a parama, EditText paramEditText, String paramString1, String paramString2, TextView paramTextView, Context paramContext, e.a parama1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47856);
    if (this.tMZ != null)
      this.tMZ.a(false, this.tMX.getText().toString().trim(), this.val$name, this.tNb, this.tNc.getText().toString().trim());
    a.a(this.val$context, this.tNa.gud);
    AppMethodBeat.o(47856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.a.4
 * JD-Core Version:    0.6.2
 */