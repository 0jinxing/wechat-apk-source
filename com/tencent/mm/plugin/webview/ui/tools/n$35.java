package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class n$35
  implements Runnable
{
  n$35(n paramn, int paramInt, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7748);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()) || (((WebViewUI)n.a(this.uuo).get()).pzf == null))
    {
      AppMethodBeat.o(7748);
      label63: return;
    }
    ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "setMenuItemsVisible, actionCode = " + this.uqC);
    Object localObject1 = new HashSet();
    if ((this.uqC == 3003) || (this.uqC == 3004))
    {
      ((Set)localObject1).add("menuItem:share:brand");
      ((Set)localObject1).add("menuItem:share:appMessage");
      ((Set)localObject1).add("menuItem:share:dataMessage");
      ((Set)localObject1).add("menuItem:share:timeline");
      ((Set)localObject1).add("menuItem:favorite");
      ((Set)localObject1).add("menuItem:profile");
      ((Set)localObject1).add("menuItem:addContact");
      ((Set)localObject1).add("menuItem:copyUrl");
      ((Set)localObject1).add("menuItem:openWithSafari");
      ((Set)localObject1).add("menuItem:share:email");
      ((Set)localObject1).add("menuItem:delete");
      ((Set)localObject1).add("menuItem:editTag");
      ((Set)localObject1).add("menuItem:readMode");
      ((Set)localObject1).add("menuItem:originPage");
      ((Set)localObject1).add("menuItem:share:qq");
      ((Set)localObject1).add("menuItem:share:weiboApp");
      ((Set)localObject1).add("menuItem:share:QZone");
      ((Set)localObject1).add("menuItem:share:Facebook");
      ((Set)localObject1).add("menuItem:share:enterprise");
      ((Set)localObject1).add("menuItem:share:wework");
      ((Set)localObject1).add("menuItem:share:weread");
      ((Set)localObject1).add("menuItem:addShortcut");
    }
    String str;
    Object localObject2;
    while (true)
    {
      str = ((WebViewUI)n.a(this.uuo).get()).pzf.getUrl();
      localObject2 = (SparseBooleanArray)((WebViewUI)n.a(this.uuo).get()).uwI.utA.get(str);
      switch (this.uqC)
      {
      default:
        label396: AppMethodBeat.o(7748);
        break label63;
        if (this.cgJ == null)
        {
          ab.w("MicroMsg.WebViewStubCallbackAIDLStub", "setMenuItemsVisible data is null.");
          AppMethodBeat.o(7748);
          break label63;
        }
        localObject2 = this.cgJ.getStringArrayList("menu_item_list");
        if ((localObject2 == null) || (((List)localObject2).size() == 0))
        {
          ab.w("MicroMsg.WebViewStubCallbackAIDLStub", "setMenuItemsVisible menuItems is null or nil.");
          AppMethodBeat.o(7748);
          break label63;
        }
        ((Set)localObject1).addAll((Collection)localObject2);
        ((Set)localObject1).remove("menuItem:exposeArticle");
        ((Set)localObject1).remove("menuItem:setFont");
        ((Set)localObject1).remove("menuItem:keepTop");
        ((Set)localObject1).remove("menuItem:cancelKeepTop");
        ((Set)localObject1).remove("menuItem:profile");
        ((Set)localObject1).remove("menuItem:addContact");
        ((Set)localObject1).remove("menuItem:refresh");
      case 3001:
      case 3003:
      case 3002:
      case 3004:
      }
    }
    if (localObject2 == null)
    {
      localObject2 = new SparseBooleanArray();
      ((WebViewUI)n.a(this.uuo).get()).uwI.utA.put(str, localObject2);
    }
    while (true)
    {
      localObject1 = ((Set)localObject1).iterator();
      int i;
      while (((Iterator)localObject1).hasNext())
      {
        i = bo.a((Integer)((WebViewUI)n.a(this.uuo).get()).uwI.utB.get(((Iterator)localObject1).next()), -1);
        if (i >= 0)
          ((SparseBooleanArray)localObject2).put(i, true);
      }
      ((WebViewUI)n.a(this.uuo).get()).uwI.Kt();
      AppMethodBeat.o(7748);
      break;
      if (localObject2 == null)
        break label396;
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        i = bo.a((Integer)((WebViewUI)n.a(this.uuo).get()).uwI.utB.get(((Iterator)localObject1).next()), -1);
        if (i >= 0)
          ((SparseBooleanArray)localObject2).delete(i);
      }
      ((WebViewUI)n.a(this.uuo).get()).uwI.Kt();
      break label396;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.35
 * JD-Core Version:    0.6.2
 */