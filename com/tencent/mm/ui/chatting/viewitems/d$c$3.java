package com.tencent.mm.ui.chatting.viewitems;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.lang.ref.WeakReference;

final class d$c$3
  implements ao.b.a
{
  d$c$3(WeakReference paramWeakReference)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(32812);
    ImageView localImageView = (ImageView)this.zcN.get();
    if (localImageView == null)
      AppMethodBeat.o(32812);
    while (true)
    {
      return;
      ad localad = ((j)g.K(j.class)).XM().aoO(paramString);
      if ((localad != null) && ((int)localad.ewQ > 0) && ((localImageView.getTag() instanceof String)) && (bo.isEqual((String)localImageView.getTag(), paramString)))
      {
        h localh = o.act().qo(paramString);
        if ((localh != null) && (!bo.isNullOrNil(localh.acl())))
        {
          com.tencent.mm.plugin.brandservice.b.a.a(localImageView, localad, localh.acl(), true);
          AppMethodBeat.o(32812);
        }
        else
        {
          a.b.r(localImageView, paramString);
        }
      }
      else
      {
        AppMethodBeat.o(32812);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.c.3
 * JD-Core Version:    0.6.2
 */