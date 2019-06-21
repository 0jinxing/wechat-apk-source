package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.tools.b.c;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(28028);
    View localView = View.inflate(a.a(this.vqo), 2130970617, null);
    ((TextView)localView.findViewById(2131827352)).setVisibility(8);
    paramView = (TextView)localView.findViewById(2131823129);
    paramView.setVisibility(0);
    paramView.setText("50");
    EditText localEditText = (EditText)localView.findViewById(2131827353);
    localEditText.setSingleLine(false);
    c.d(localEditText).PM(100).a(null);
    localEditText.addTextChangedListener(new a.1.1(this, paramView));
    h.a(a.a(this.vqo), a.a(this.vqo).getString(2131297033), localView, new a.1.2(this, localEditText), null);
    localEditText.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(28027);
        if ((a.a(a.1.this.vqo) instanceof MMActivity))
          ((MMActivity)a.a(a.1.this.vqo)).showVKB();
        AppMethodBeat.o(28027);
      }
    });
    AppMethodBeat.o(28028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.a.1
 * JD-Core Version:    0.6.2
 */