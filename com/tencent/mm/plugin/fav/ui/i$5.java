package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;

public final class i$5
  implements Runnable
{
  public i$5(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74124);
    Context localContext = this.val$context;
    String str1 = this.cgl;
    Object localObject = this.mjM;
    String str2 = this.fED;
    int i = this.hVj;
    String str3 = this.mjN;
    b localb = new b((String)localObject);
    if (localb.exists())
    {
      localObject = new b(str2);
      ab.i("MicroMsg.FavSendLogic", "sendVideo::data path[%s] thumb path[%s]", new Object[] { j.w(localb.dMD()), j.w(((b)localObject).dMD()) });
      g.bOk().a(localContext, str1, j.w(localb.dMD()), str2, 1, i, str3);
    }
    al.d(this.cfC);
    AppMethodBeat.o(74124);
  }

  public final String toString()
  {
    AppMethodBeat.i(74125);
    String str = super.toString() + "|sendFavVideo";
    AppMethodBeat.o(74125);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.i.5
 * JD-Core Version:    0.6.2
 */