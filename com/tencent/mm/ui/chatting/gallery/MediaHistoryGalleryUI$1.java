package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.e.b;
import com.tencent.mm.sdk.platformtools.bo;

final class MediaHistoryGalleryUI$1 extends b
{
  MediaHistoryGalleryUI$1(MediaHistoryGalleryUI paramMediaHistoryGalleryUI)
  {
  }

  public final void a(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(32405);
    super.a(paramString, paramLong, paramInt);
    if ((paramInt > 0) && (!bo.isNullOrNil(paramString)) && (paramString.endsWith(this.yXS.getClass().getSimpleName())))
      MediaHistoryGalleryUI.a(this.yXS, MediaHistoryGalleryUI.a(this.yXS) + paramInt);
    AppMethodBeat.o(32405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI.1
 * JD-Core Version:    0.6.2
 */