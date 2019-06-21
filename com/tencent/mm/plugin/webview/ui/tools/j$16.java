package com.tencent.mm.plugin.webview.ui.tools;

import android.graphics.Bitmap;
import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.a;

final class j$16
  implements n.a
{
  j$16(j paramj)
  {
  }

  public final void a(ImageView paramImageView, MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7657);
    if (j.g(paramMenuItem))
    {
      paramImageView.setVisibility(8);
      AppMethodBeat.o(7657);
    }
    while (true)
    {
      return;
      paramMenuItem = paramMenuItem.getTitle();
      if ((this.utN.utC.get(paramMenuItem) != null) && (!((Bitmap)this.utN.utC.get(paramMenuItem)).isRecycled()))
      {
        paramImageView.setImageBitmap((Bitmap)this.utN.utC.get(paramMenuItem));
        AppMethodBeat.o(7657);
      }
      else
      {
        ab.w("MicroMsg.WebViewMenuHelper", "on attach icon, load from cache fail");
        try
        {
          Object localObject = this.utN.cZv().icy.aff(paramMenuItem);
          if (!bo.isNullOrNil((String)localObject))
          {
            localObject = g.afx((String)localObject);
            if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
            {
              paramImageView.setImageBitmap((Bitmap)localObject);
              this.utN.utC.put(paramMenuItem, localObject);
            }
          }
          AppMethodBeat.o(7657);
        }
        catch (Exception paramImageView)
        {
          ab.w("MicroMsg.WebViewMenuHelper", "getheadimg, ex = " + paramImageView.getMessage());
          AppMethodBeat.o(7657);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.16
 * JD-Core Version:    0.6.2
 */