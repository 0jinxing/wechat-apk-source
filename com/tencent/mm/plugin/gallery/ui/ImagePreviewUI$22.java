package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

final class ImagePreviewUI$22
  implements View.OnClickListener
{
  ImagePreviewUI$22(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21521);
    paramView = this.mRu;
    boolean bool;
    if (!ImagePreviewUI.b(this.mRu))
    {
      bool = true;
      ImagePreviewUI.b(paramView, bool);
      if (!ImagePreviewUI.b(this.mRu))
        break label148;
      ImagePreviewUI.c(this.mRu).setImageResource(2131231853);
      if (ImagePreviewUI.d(this.mRu).size() == 0)
        ImagePreviewUI.e(this.mRu).performClick();
    }
    while (true)
    {
      ImagePreviewUI.f(this.mRu).setText(this.mRu.mController.ylL.getString(2131300182) + ImagePreviewUI.bCM());
      ImagePreviewUI.a(this.mRu, ImagePreviewUI.g(this.mRu).intValue());
      AppMethodBeat.o(21521);
      return;
      bool = false;
      break;
      label148: ImagePreviewUI.c(this.mRu).setImageResource(2131231852);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.22
 * JD-Core Version:    0.6.2
 */