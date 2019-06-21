package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.r;
import com.tencent.mm.sdk.platformtools.ab;

final class k$2
  implements Runnable
{
  k$2(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81168);
    if (System.currentTimeMillis() - k.a(this.qeT) > 30000L)
    {
      ab.d("MicroMsg.scanner.ScanModeImage", "show scan img nothing recognize");
      this.qeT.qet.kj(true);
      this.qeT.iqU.setVisibility(8);
      k.b(this.qeT).setText(2131302743);
      k.b(this.qeT).setVisibility(0);
      if (k.c(this.qeT) == null)
        k.a(this.qeT, new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            AppMethodBeat.i(81167);
            k.2.this.qeT.qet.kj(false);
            k.2.this.qeT.iqU.setVisibility(0);
            k.2.this.qeT.iqU.setText(r.fT(r.qiR, k.2.this.qeT.qet.getContext().getString(2131302745)));
            k.b(k.2.this.qeT).setVisibility(8);
            k.a(k.2.this.qeT, System.currentTimeMillis());
            AppMethodBeat.o(81167);
            return false;
          }
        });
      k.d(this.qeT).setOnTouchListener(k.c(this.qeT));
    }
    AppMethodBeat.o(81168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.k.2
 * JD-Core Version:    0.6.2
 */