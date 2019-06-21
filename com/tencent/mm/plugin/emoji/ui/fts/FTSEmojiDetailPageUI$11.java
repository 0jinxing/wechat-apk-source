package com.tencent.mm.plugin.emoji.ui.fts;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;

final class FTSEmojiDetailPageUI$11
  implements i
{
  FTSEmojiDetailPageUI$11(FTSEmojiDetailPageUI paramFTSEmojiDetailPageUI)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53549);
    ab.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramString });
    if ((paramBitmap != null) && (paramArrayOfObject != null) && (paramArrayOfObject.length > 0) && (paramArrayOfObject[0] != null) && ((paramArrayOfObject[0] instanceof String)) && (paramString.equals(FTSEmojiDetailPageUI.a(this.lcK).field_encrypturl)))
    {
      paramString = new com.tencent.mm.vfs.b(paramArrayOfObject[0].toString());
      if (paramString.exists())
      {
        FTSEmojiDetailPageUI.a(this.lcK).field_md5 = e.atg(j.w(paramString.mUri));
        FTSEmojiDetailPageUI.a(this.lcK, EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", FTSEmojiDetailPageUI.a(this.lcK).field_md5));
        e.y(j.w(paramString.dMD()), FTSEmojiDetailPageUI.f(this.lcK));
        al.d(new FTSEmojiDetailPageUI.11.1(this));
      }
    }
    AppMethodBeat.o(53549);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.11
 * JD-Core Version:    0.6.2
 */