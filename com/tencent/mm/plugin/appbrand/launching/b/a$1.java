package com.tencent.mm.plugin.appbrand.launching.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class a$1
  implements h.a
{
  a$1(a parama, String paramString1, String paramString2, Context paramContext, String paramString3, Uri paramUri, int paramInt, Bundle paramBundle)
  {
  }

  public final void aHG()
  {
    AppMethodBeat.i(132027);
    ab.i("MicroMsg.AppBrand.AbsLinkOpener", "[banjump] should ban, from appid:%s, to username:%s", new Object[] { this.hxh, this.eiH });
    new ak(Looper.getMainLooper()).post(new a.1.1(this));
    AppMethodBeat.o(132027);
  }

  public final void aHH()
  {
    AppMethodBeat.i(132028);
    ab.i("MicroMsg.AppBrand.AbsLinkOpener", "[banjump] not ban, from appid:%s, to username:%s", new Object[] { this.hxh, this.eiH });
    a.a(this.val$context, this.val$url, this.ijb, this.fwD, this.ijc, this.eiH);
    AppMethodBeat.o(132028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.b.a.1
 * JD-Core Version:    0.6.2
 */