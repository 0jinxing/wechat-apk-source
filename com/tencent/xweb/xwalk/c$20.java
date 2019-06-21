package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.d.a;

final class c$20
  implements View.OnClickListener
{
  c$20(c paramc, EditText paramEditText)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85141);
    c.a(this.ARk, this.ARq.getText().toString(), d.a.ALY);
    AppMethodBeat.o(85141);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.20
 * JD-Core Version:    0.6.2
 */