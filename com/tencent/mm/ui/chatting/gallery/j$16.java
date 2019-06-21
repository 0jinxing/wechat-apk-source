package com.tencent.mm.ui.chatting.gallery;

import android.content.DialogInterface.OnClickListener;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class j$16
  implements Runnable
{
  j$16(j paramj, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32334);
    ab.w("MicroMsg.Imagegallery.handler.video", "show play video error.");
    u.uw(j.a(this.yWZ));
    if (this.yWZ.yTG == null)
    {
      AppMethodBeat.o(32334);
      return;
    }
    Object localObject = this.yWZ.yTG.dFP();
    ((k)localObject).dGH().yXp.stop();
    ((k)localObject).a(false, 0.0F);
    String str = this.yWZ.yTG.yTI.getString(2131304254);
    if ((this.yXb == -5103059) || (this.yXb == -5103087))
      str = this.yWZ.yTG.yTI.getString(2131304253);
    for (localObject = new j.16.1(this); ; localObject = new j.16.2(this))
    {
      h.a(this.yWZ.yTG.yTI, str, this.yWZ.yTG.yTI.getString(2131298205), (DialogInterface.OnClickListener)localObject);
      this.yWZ.yWJ.clear();
      AppMethodBeat.o(32334);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.16
 * JD-Core Version:    0.6.2
 */