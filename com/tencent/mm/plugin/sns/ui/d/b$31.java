package com.tencent.mm.plugin.sns.ui.d;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sns.ui.aj;
import java.lang.ref.WeakReference;

final class b$31
  implements b.e
{
  b$31(b paramb)
  {
  }

  public final void c(com.tencent.mm.plugin.sight.decode.a.b paramb, int paramInt)
  {
    AppMethodBeat.i(40288);
    if ((paramb != null) && (paramInt == 0))
      if (paramb.qxx == null)
        break label88;
    label88: for (paramb = (View)paramb.qxx.get(); ; paramb = null)
    {
      if ((paramb != null) && ((paramb instanceof a)))
      {
        paramb = (a)paramb;
        paramb.getVideoPath();
        if ((paramb.getTagObject() != null) && ((paramb.getTagObject() instanceof aj)))
          paramb.getTagObject();
      }
      AppMethodBeat.o(40288);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.31
 * JD-Core Version:    0.6.2
 */