package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

final class ImagePreviewUI$11$1
  implements Runnable
{
  ImagePreviewUI$11$1(ImagePreviewUI.11 param11, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21508);
    ImagePreviewUI.h(this.mRv.mRu).E(ImagePreviewUI.s(this.mRv.mRu));
    f localf = (f)ImagePreviewUI.p(this.mRv.mRu).getAdapter();
    ArrayList localArrayList = ImagePreviewUI.s(this.mRv.mRu);
    localf.mRE.clear();
    localf.mRE.addAll(localArrayList);
    localf.aop.notifyChanged();
    localArrayList = this.mRv.val$data.getStringArrayListExtra("preview_select_image_list");
    ImagePreviewUI.d(this.mRv.mRu).clear();
    if (localArrayList != null)
      ImagePreviewUI.d(this.mRv.mRu).addAll(localArrayList);
    this.mRv.mRu.updateOptionMenuText(0, ImagePreviewUI.n(this.mRv.mRu));
    ImagePreviewUI.f(this.mRv.mRu).setText(this.mRv.mRu.mController.ylL.getString(2131300182) + ImagePreviewUI.bCM());
    if (!ImagePreviewUI.d(this.mRv.mRu).contains(this.val$filePath))
      ImagePreviewUI.e(this.mRv.mRu).performClick();
    AppMethodBeat.o(21508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.11.1
 * JD-Core Version:    0.6.2
 */