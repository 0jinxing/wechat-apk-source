package com.tencent.mm.plugin.sight.decode.a;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import java.lang.ref.WeakReference;

final class b$j
  implements Runnable
{
  private b$j(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70246);
    if ((b.e(this.qxW) < 0) || (b.k(this.qxW) == null) || (b.k(this.qxW).get() == null))
      AppMethodBeat.o(70246);
    while (true)
    {
      return;
      String str = SightVideoJNI.getVideoInfo(b.e(this.qxW));
      ((TextView)b.k(this.qxW).get()).setText(str);
      AppMethodBeat.o(70246);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b.j
 * JD-Core Version:    0.6.2
 */