package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

final class aw$1
  implements i
{
  aw$1(aw paramaw, String paramString, Context paramContext, bc.a parama)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(6377);
    ab.i("MicroMsg.JsApiShareEmotion", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramString });
    if ((paramBitmap != null) && (paramArrayOfObject != null) && (paramArrayOfObject.length > 0) && (paramArrayOfObject[0] != null) && ((paramArrayOfObject[0] instanceof String)) && (paramString.equals(this.ujP)))
    {
      paramString = new File(paramArrayOfObject[0].toString());
      if (paramString.exists())
      {
        paramView = g.v(paramString);
        paramBitmap = EmojiLogic.L(b.Yb(), "", paramView);
        FileOp.y(paramString.getAbsolutePath(), paramBitmap);
        aw.a(this.ukw, this.val$context, paramView, this.kOx);
        AppMethodBeat.o(6377);
      }
    }
    while (true)
    {
      return;
      this.kOx.d("fail", null);
      AppMethodBeat.o(6377);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aw.1
 * JD-Core Version:    0.6.2
 */