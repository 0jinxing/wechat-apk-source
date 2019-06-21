package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

final class b$1
  implements i
{
  b$1(b paramb, String paramString1, Context paramContext, String paramString2, bc.a parama)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(6273);
    ab.i("MicroMsg.JsApiAddToEmotion", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramString });
    if ((paramBitmap != null) && (paramArrayOfObject != null) && (paramArrayOfObject.length > 0) && (paramArrayOfObject[0] != null) && ((paramArrayOfObject[0] instanceof String)) && (paramString.equals(this.ujP)))
    {
      paramString = new File(paramArrayOfObject[0].toString());
      if (paramString.exists())
      {
        paramBitmap = g.v(paramString);
        paramView = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", paramBitmap);
        FileOp.y(paramString.getAbsolutePath(), paramView);
        b.b(this.val$context, paramBitmap, this.fEJ, this.kOx);
        AppMethodBeat.o(6273);
      }
    }
    while (true)
    {
      return;
      this.kOx.d("fail", null);
      AppMethodBeat.o(6273);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.b.1
 * JD-Core Version:    0.6.2
 */