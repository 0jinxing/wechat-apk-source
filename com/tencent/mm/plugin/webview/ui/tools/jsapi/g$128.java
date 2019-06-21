package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;

final class g$128
  implements com.tencent.mm.at.a.c.i
{
  g$128(g paramg, String paramString1, String paramString2, i parami)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(9205);
    ab.i("MicroMsg.MsgHandler", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramString });
    if ((paramBitmap != null) && (paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
      if ((paramArrayOfObject[0] != null) && ((paramArrayOfObject[0] instanceof String)))
        if (paramString.equals(this.ujP))
        {
          paramView = new com.tencent.mm.vfs.b(paramArrayOfObject[0].toString());
          if (paramView.exists())
          {
            paramBitmap = e.atg(j.w(paramView.mUri));
            paramString = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", paramBitmap);
            e.y(j.w(paramView.dMD()), paramString);
            g.a(this.uHd, paramBitmap, this.uIv);
            AppMethodBeat.o(9205);
          }
        }
    while (true)
    {
      return;
      g.a(this.uHd, this.uqf, "shareEmoticon:fail", null);
      AppMethodBeat.o(9205);
      continue;
      g.a(this.uHd, this.uqf, "shareEmoticon:fail", null);
      AppMethodBeat.o(9205);
      continue;
      g.a(this.uHd, this.uqf, "shareEmoticon:fail", null);
      AppMethodBeat.o(9205);
      continue;
      g.a(this.uHd, this.uqf, "shareEmoticon:fail", null);
      AppMethodBeat.o(9205);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.128
 * JD-Core Version:    0.6.2
 */