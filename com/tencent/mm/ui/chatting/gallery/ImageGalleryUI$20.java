package com.tencent.mm.ui.chatting.gallery;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ao;
import com.tencent.mm.sdk.b.a;

final class ImageGalleryUI$20
  implements View.OnClickListener
{
  ImageGalleryUI$20(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(32220);
    paramView = new ao();
    paramView.ctD.scene = 1;
    paramView.ctD.ctE = ImageGalleryUI.h(this.yWC);
    a.xxA.m(paramView);
    ImageGalleryUI.g(this.yWC);
    ImageGalleryUI.i(this.yWC);
    AppMethodBeat.o(32220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.20
 * JD-Core Version:    0.6.2
 */