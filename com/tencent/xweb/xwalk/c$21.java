package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.d.a;

final class c$21
  implements View.OnClickListener
{
  c$21(c paramc, EditText paramEditText)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85142);
    c.a(this.ARk, this.ARq.getText().toString(), d.a.ALW);
    AppMethodBeat.o(85142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.21
 * JD-Core Version:    0.6.2
 */