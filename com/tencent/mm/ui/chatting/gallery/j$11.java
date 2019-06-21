package com.tencent.mm.ui.chatting.gallery;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.vfs.e;
import java.util.HashMap;

final class j$11
  implements Runnable
{
  j$11(j paramj, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32326);
    if ((this.yWZ.yTG == null) || (this.yWZ.yTG.dFP() == null) || (j.l(this.yWZ) == null))
    {
      ab.w("MicroMsg.Imagegallery.handler.video", "show error alert but adapter is null.");
      AppMethodBeat.o(32326);
    }
    while (true)
    {
      return;
      this.yWZ.yTG.dFP().a(false, 0.0F);
      if (!bo.isNullOrNil(this.mqo))
        ab.e("MicroMsg.Imagegallery.handler.video", "mediaplay play video error, use third player.[%s]", new Object[] { this.mqo });
      try
      {
        Object localObject = new android/content/Intent;
        ((Intent)localObject).<init>();
        ((Intent)localObject).setAction("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.k.a(this.yWZ.yTG.yTI, (Intent)localObject, e.asY(this.mqo), "video/*");
        this.yWZ.yTG.yTI.startActivity((Intent)localObject);
        localObject = (j.a)j.l(this.yWZ).get(j.a(this.yWZ));
        if ((localObject == null) || (((j.a)localObject).csG == null))
          AppMethodBeat.o(32326);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.Imagegallery.handler.video", "startActivity fail, activity not found");
          h.g(this.yWZ.yTG.yTI, 2131299668, 2131299669);
        }
        this.yWZ.Pf(localException.pos);
        AppMethodBeat.o(32326);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.11
 * JD-Core Version:    0.6.2
 */