package com.tencent.mm.plugin.downloader_app.e;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.downloader_app.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bko;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;

final class a$5
  implements Runnable
{
  a$5(a parama, boolean paramBoolean, ProgressDialog paramProgressDialog, Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136321);
    boolean bool = this.kRo;
    int i = r.YK();
    bko localbko;
    if (bool)
    {
      i &= -134217729;
      g.RP().Ry().set(34, Integer.valueOf(i));
      localbko = new bko();
      localbko.vCi = 134217728;
      if (!bool)
        break label152;
    }
    label152: for (i = 0; ; i = 1)
    {
      localbko.wNJ = i;
      ((j)g.K(j.class)).XL().c(new j.a(39, localbko));
      if (!this.kRo)
      {
        bf.oD("downloaderapp");
        ((j)g.K(j.class)).XR().aoX("downloaderapp");
      }
      al.n(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(136320);
          a.5.this.kRn.biW();
          a.5.this.kHP.dismiss();
          if (a.5.this.kRo)
          {
            ((d)g.K(d.class)).biy();
            Bundle localBundle = ((Activity)a.5.this.val$context).getIntent().getBundleExtra("download_params");
            if (localBundle != null)
              ((d)g.K(d.class)).a(a.5.this.val$context, new Intent().putExtras(localBundle), null);
          }
          AppMethodBeat.o(136320);
        }
      }
      , 1000L);
      AppMethodBeat.o(136321);
      return;
      i |= 134217728;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.e.a.5
 * JD-Core Version:    0.6.2
 */