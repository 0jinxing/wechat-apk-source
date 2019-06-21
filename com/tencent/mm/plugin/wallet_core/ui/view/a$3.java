package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.e.a;

final class a$3
  implements View.OnClickListener
{
  a$3(a.a parama, EditText paramEditText, Context paramContext, e.a parama1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47855);
    if (this.tMZ != null)
      this.tMZ.a(true, this.tMX.getText().toString().trim(), null, null, null);
    a.a(this.val$context, this.tNa.gud);
    AppMethodBeat.o(47855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.a.3
 * JD-Core Version:    0.6.2
 */