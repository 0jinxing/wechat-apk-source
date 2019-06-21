package com.facebook.internal;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class WebDialog$2
  implements View.OnClickListener
{
  WebDialog$2(WebDialog paramWebDialog)
  {
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(96656);
    this.this$0.cancel();
    AppMethodBeat.o(96656);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WebDialog.2
 * JD-Core Version:    0.6.2
 */