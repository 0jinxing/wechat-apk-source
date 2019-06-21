package com.tencent.mm.ui.conversation.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class k$1$1
  implements Runnable
{
  k$1$1(k.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34671);
    if (this.zwz.zwy.zwx != null)
    {
      this.zwz.zwy.zwx.setVisibility(8);
      this.zwz.zwy.zwx.removeAllViews();
    }
    a locala = e.a(this.zwz.val$context, e.a.zwe, null);
    Object localObject = locala;
    if (locala == null)
      localObject = e.a(this.zwz.val$context, e.a.zvW, null);
    if ((localObject != null) && (((a)localObject).getView() != null))
    {
      ab.i("MicroMsg.MainFrameAndAbtestBanner", "summerinit MainFrameBannerStorage onNotify banner[%s], view[%s]", new Object[] { localObject, ((a)localObject).getView() });
      this.zwz.zwy.zwx.setVisibility(0);
      localObject = ((a)localObject).getView();
      this.zwz.zwy.zwx.addView((View)localObject, new LinearLayout.LayoutParams(-1, -2));
    }
    AppMethodBeat.o(34671);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.k.1.1
 * JD-Core Version:    0.6.2
 */