package com.tencent.mm.plugin.appbrand.j;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.widget.b.g;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class e
  implements DialogInterface
{
  private DialogInterface.OnCancelListener Ue;
  private ap gGo;
  private g inM;
  private boolean mDismissed = false;
  private boolean xH = false;

  final e a(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(102148);
    this.Ue = paramOnCancelListener;
    if (this.inM != null)
      this.inM.setOnCancelListener(this.Ue);
    AppMethodBeat.o(102148);
    return this;
  }

  public final void cancel()
  {
    AppMethodBeat.i(102149);
    this.xH = true;
    if (this.inM != null)
    {
      this.inM.cancel();
      AppMethodBeat.o(102149);
    }
    while (true)
    {
      return;
      if (this.Ue != null)
        this.Ue.onCancel(this);
      AppMethodBeat.o(102149);
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(102150);
    this.mDismissed = true;
    if (this.inM != null)
      this.inM.dismiss();
    AppMethodBeat.o(102150);
  }

  final void x(final i parami)
  {
    AppMethodBeat.i(102147);
    if (!al.isMainThread())
    {
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(102145);
          e.this.x(parami);
          AppMethodBeat.o(102145);
        }
      });
      AppMethodBeat.o(102147);
    }
    while (true)
    {
      return;
      this.gGo = new ap(Looper.getMainLooper(), new ap.a()
      {
        public final boolean BI()
        {
          AppMethodBeat.i(102146);
          if ((e.a(e.this)) || (e.b(e.this)))
            AppMethodBeat.o(102146);
          while (true)
          {
            return false;
            g localg = new g(parami.getContext());
            localg.setMessage(parami.getContext().getString(2131301230));
            localg.setOnCancelListener(e.c(e.this));
            localg.setCanceledOnTouchOutside(false);
            parami.gNG.b(localg);
            e.a(e.this, localg);
            AppMethodBeat.o(102146);
          }
        }
      }
      , false);
      this.gGo.ae(500L, 500L);
      AppMethodBeat.o(102147);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.e
 * JD-Core Version:    0.6.2
 */