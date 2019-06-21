package com.tencent.mm.plugin.fav.ui.d;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.a;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.vfs.j;

final class g$1
  implements View.OnClickListener
{
  g$1(g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74628);
    if (!com.tencent.mm.compatible.util.f.Mn())
    {
      t.hO(this.moQ.mhy.context);
      AppMethodBeat.o(74628);
    }
    abl localabl;
    aar localaar;
    while (true)
    {
      return;
      if (!(paramView.getTag() instanceof com.tencent.mm.plugin.fav.a.g))
        break label207;
      localObject = (com.tencent.mm.plugin.fav.a.g)paramView.getTag();
      localabl = ((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.wit;
      localaar = com.tencent.mm.plugin.fav.a.b.c((com.tencent.mm.plugin.fav.a.g)localObject);
      if (localaar == null)
      {
        ab.w("MicroMsg.FavBaseListItem", "data item is null");
        AppMethodBeat.o(74628);
      }
      else
      {
        if (!com.tencent.mm.plugin.fav.a.b.e(localaar))
          break;
        ab.i("MicroMsg.FavBaseListItem", "same song, do release");
        a.aic();
        g.a(this.moQ, null);
        AppMethodBeat.o(74628);
      }
    }
    Object localObject = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(localaar));
    if (!((com.tencent.mm.vfs.b)localObject).exists())
      if (localaar.cvq == null)
        localObject = "";
    while (true)
    {
      a.b(com.tencent.mm.aw.f.a(6, null, localaar.title, localaar.desc, localaar.wgg, localaar.wgk, localaar.wgi, localaar.mnd, com.tencent.mm.plugin.fav.a.b.bul(), (String)localObject, "", localabl.appId));
      g.a(this.moQ, (ImageView)paramView);
      label207: AppMethodBeat.o(74628);
      break;
      localObject = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(localaar.cvq.getBytes()));
      if (((com.tencent.mm.vfs.b)localObject).exists());
      for (localObject = j.w(((com.tencent.mm.vfs.b)localObject).dMD()); ; localObject = "")
        break;
      localObject = j.w(((com.tencent.mm.vfs.b)localObject).dMD());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.g.1
 * JD-Core Version:    0.6.2
 */