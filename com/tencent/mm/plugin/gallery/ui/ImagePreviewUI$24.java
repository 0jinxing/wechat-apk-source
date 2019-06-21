package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ImagePreviewUI$24
  implements View.OnClickListener
{
  ImagePreviewUI$24(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21523);
    String str = ImagePreviewUI.h(this.mRu).getItem(ImagePreviewUI.g(this.mRu).intValue());
    if (bo.isNullOrNil(str))
    {
      ab.w("MicroMsg.ImagePreviewUI", "get path error, position %d", new Object[] { ImagePreviewUI.g(this.mRu) });
      AppMethodBeat.o(21523);
    }
    while (true)
    {
      return;
      paramView = new Intent();
      paramView.putExtra("key_video_path", str);
      paramView.putExtra("key_need_clip_video_first", true);
      if (e.bBZ().hOZ == 14)
        paramView.putExtra("key_need_remux_video", false);
      paramView.putExtra("key_max_duration_seconds", ImagePreviewUI.i(this.mRu));
      d.b(this.mRu.mController.ylL, "mmsight", ".segment.MMSightEditUI", paramView, 4370);
      AppMethodBeat.o(21523);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.24
 * JD-Core Version:    0.6.2
 */