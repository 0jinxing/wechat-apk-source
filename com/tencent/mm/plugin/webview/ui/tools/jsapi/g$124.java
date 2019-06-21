package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;

final class g$124
  implements com.tencent.mm.at.a.c.i
{
  g$124(g paramg, String paramString1, String paramString2, String paramString3, i parami)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(9201);
    ab.i("MicroMsg.MsgHandler", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramString });
    if ((paramBitmap != null) && (paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
      if ((paramArrayOfObject[0] != null) && ((paramArrayOfObject[0] instanceof String)))
        if (paramString.equals(this.ujP))
        {
          paramString = new com.tencent.mm.vfs.b(paramArrayOfObject[0].toString());
          if (paramString.exists())
          {
            paramView = e.atg(j.w(paramString.mUri));
            paramBitmap = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", paramView);
            e.y(j.w(paramString.dMD()), paramBitmap);
            g.a(this.uHd, paramView, this.fEJ, this.uIv);
            AppMethodBeat.o(9201);
          }
        }
    while (true)
    {
      return;
      g.a(this.uHd, this.uqf, "addToEmoticon:fail", null);
      AppMethodBeat.o(9201);
      continue;
      g.a(this.uHd, this.uqf, "addToEmoticon:fail", null);
      AppMethodBeat.o(9201);
      continue;
      g.a(this.uHd, this.uqf, "addToEmoticon:fail", null);
      AppMethodBeat.o(9201);
      continue;
      g.a(this.uHd, this.uqf, "addToEmoticon:fail", null);
      AppMethodBeat.o(9201);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.124
 * JD-Core Version:    0.6.2
 */