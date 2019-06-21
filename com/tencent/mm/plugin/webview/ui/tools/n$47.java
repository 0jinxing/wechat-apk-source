package com.tencent.mm.plugin.webview.ui.tools;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;

final class n$47
  implements Runnable
{
  n$47(n paramn, boolean paramBoolean1, Bitmap paramBitmap, String paramString, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7764);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7764);
    while (true)
    {
      return;
      if (!this.uuO)
        break;
      ((WebViewUI)n.a(this.uuo).get()).nR(true);
      AppMethodBeat.o(7764);
    }
    Object localObject = ((WebViewUI)n.a(this.uuo).get()).dae();
    if (!bo.isNullOrNil((String)localObject));
    for (localObject = (Boolean)((WebViewUI)n.a(this.uuo).get()).uwd.get(localObject); ; localObject = null)
    {
      boolean bool;
      if (localObject == null)
      {
        bool = false;
        label132: ((WebViewUI)n.a(this.uuo).get()).nR(Boolean.valueOf(bool).booleanValue());
        if ((this.uji == null) || (this.uji.isRecycled()))
          break label288;
        ((WebViewUI)n.a(this.uuo).get()).c(this.val$text, new BitmapDrawable(((WebViewUI)n.a(this.uuo).get()).getResources(), this.uji));
        if (this.ujj)
          ((WebViewUI)n.a(this.uuo).get()).a(0, new n.47.1(this));
      }
      while (true)
      {
        ((WebViewUI)n.a(this.uuo).get()).Jt(this.ujm);
        AppMethodBeat.o(7764);
        break;
        bool = ((Boolean)localObject).booleanValue();
        break label132;
        label288: if (!bo.isNullOrNil(this.val$text))
        {
          if (this.ujl == -1)
            ((WebViewUI)n.a(this.uuo).get()).addTextOptionMenu(0, this.val$text, new MenuItem.OnMenuItemClickListener()
            {
              public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
              {
                AppMethodBeat.i(7761);
                ab.d("MicroMsg.WebViewStubCallbackAIDLStub", "click item: %s", new Object[] { Integer.valueOf(paramAnonymousMenuItem.getItemId()) });
                ((WebViewUI)n.a(n.47.this.uuo).get()).uhz.dco();
                AppMethodBeat.o(7761);
                return false;
              }
            });
          else
            ((WebViewUI)n.a(this.uuo).get()).a(this.val$text, this.ujl, new n.47.3(this));
        }
        else
          ((WebViewUI)n.a(this.uuo).get()).a(((WebViewUI)n.a(this.uuo).get()).dat(), new n.47.4(this), ((WebViewUI)n.a(this.uuo).get()).uxc);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.47
 * JD-Core Version:    0.6.2
 */