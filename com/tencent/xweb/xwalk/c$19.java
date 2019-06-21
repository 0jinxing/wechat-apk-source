package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.d.a;

final class c$19
  implements View.OnClickListener
{
  c$19(c paramc, EditText paramEditText)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85140);
    c.a(this.ARk, this.ARq.getText().toString(), d.a.ALX);
    AppMethodBeat.o(85140);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.19
 * JD-Core Version:    0.6.2
 */