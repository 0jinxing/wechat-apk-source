package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import a.v;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.brandservice.b.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "username", "", "kotlin.jvm.PlatformType", "succ", "", "getContactCallBack"})
final class MPVideoHeaderView$a
  implements ao.b.a
{
  MPVideoHeaderView$a(WeakReference paramWeakReference)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(138520);
    ImageView localImageView = (ImageView)this.jXM.get();
    if (localImageView == null)
      AppMethodBeat.o(138520);
    while (true)
    {
      return;
      a.f.b.j.o(localImageView, "weakReference.get() ?: return@GetContactCallBack");
      Object localObject1 = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject1, "MMKernel.service(IMessengerStorage::class.java)");
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject1).XM().aoO(paramString);
      if ((localObject1 == null) || (((ad)localObject1).Oh() <= 0))
      {
        AppMethodBeat.o(138520);
      }
      else if ((localImageView.getTag() instanceof String))
      {
        o.acv().pZ(paramString);
        Object localObject2 = localImageView.getTag();
        if (localObject2 == null)
        {
          paramString = new v("null cannot be cast to non-null type kotlin.String");
          AppMethodBeat.o(138520);
          throw paramString;
        }
        if (bo.isEqual((String)localObject2, paramString))
        {
          localObject2 = o.act().qo(paramString);
          if ((localObject2 != null) && (!bo.isNullOrNil(((h)localObject2).acl())))
          {
            a.a(localImageView, (ad)localObject1, ((h)localObject2).acl(), true);
            AppMethodBeat.o(138520);
            continue;
          }
          a.b.r(localImageView, paramString);
        }
      }
      else
      {
        AppMethodBeat.o(138520);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoHeaderView.a
 * JD-Core Version:    0.6.2
 */