package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.b;

final class ReadMailUI$14
  implements MenuItem.OnMenuItemClickListener
{
  ReadMailUI$14(ReadMailUI paramReadMailUI, WebView.b paramb)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68438);
    Object localObject = this.pAg.mExtra;
    paramMenuItem = (MenuItem)localObject;
    if (((String)localObject).contains("qqmail.weixin.qq.com"))
    {
      paramMenuItem = (MenuItem)localObject;
      if (!((String)localObject).contains("qqmail.weixin.qq.com:443"))
        paramMenuItem = ((String)localObject).replace("qqmail.weixin.qq.com", "qqmail.weixin.qq.com:443");
    }
    paramMenuItem = paramMenuItem.replaceFirst("%p2p0", "%25p2p0");
    try
    {
      localObject = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
      ((ReadMailProxy)localObject).<init>(ReadMailUI.l(this.pzZ), null);
      bool = ((Boolean)((ReadMailProxy)localObject).REMOTE_CALL("isSDCardAvailable", new Object[0])).booleanValue();
      u.a(this.pzZ, paramMenuItem, b.dTR().getCookie(v.ccw()), bool);
      AppMethodBeat.o(68438);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.ReadMailUI", "createContextMenu, isSDCardAvailable, ex = %s", new Object[] { localException.getMessage() });
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.14
 * JD-Core Version:    0.6.2
 */