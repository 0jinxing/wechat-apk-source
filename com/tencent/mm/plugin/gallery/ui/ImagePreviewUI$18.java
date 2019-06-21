package com.tencent.mm.plugin.gallery.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.gallery.model.m;
import com.tencent.mm.plugin.gallery.model.m.a;
import java.util.ArrayList;

final class ImagePreviewUI$18
  implements m.a
{
  ImagePreviewUI$18(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void a(m paramm)
  {
    AppMethodBeat.i(21517);
    if (paramm.position != ImagePreviewUI.g(this.mRu).intValue())
      AppMethodBeat.o(21517);
    while (true)
    {
      return;
      if ((paramm.mOA.fPW >= ImagePreviewUI.y(this.mRu)) || ((paramm.mOA.fPW > 0) && (paramm.mOA.fPW < 1000)))
      {
        ImagePreviewUI.a(this.mRu).setVisibility(0);
        TextView localTextView = ImagePreviewUI.A(this.mRu);
        if (paramm.mOA.fPW >= ImagePreviewUI.y(this.mRu));
        for (paramm = ImagePreviewUI.z(this.mRu); ; paramm = this.mRu.getString(2131300193))
        {
          localTextView.setText(paramm);
          ImagePreviewUI.B(this.mRu).setEnabled(false);
          ImagePreviewUI.e(this.mRu).setEnabled(false);
          ImagePreviewUI.B(this.mRu).setTextColor(this.mRu.getResources().getColor(2131690694));
          if (ImagePreviewUI.d(this.mRu).size() != 0)
            break label262;
          this.mRu.enableOptionMenu(false);
          AppMethodBeat.o(21517);
          break;
        }
      }
      ImagePreviewUI.B(this.mRu).setEnabled(true);
      ImagePreviewUI.e(this.mRu).setEnabled(true);
      ImagePreviewUI.B(this.mRu).setTextColor(this.mRu.getResources().getColor(2131690693));
      ImagePreviewUI.a(this.mRu).setVisibility(8);
      label262: AppMethodBeat.o(21517);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.18
 * JD-Core Version:    0.6.2
 */