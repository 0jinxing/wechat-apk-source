package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class AlbumPreviewUI$14
  implements View.OnClickListener
{
  AlbumPreviewUI$14(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21409);
    paramView = this.mPO;
    boolean bool;
    if (!AlbumPreviewUI.d(this.mPO))
    {
      bool = true;
      AlbumPreviewUI.a(paramView, bool);
      AlbumPreviewUI.e(this.mPO);
      AlbumPreviewUI.f(this.mPO).setText(this.mPO.mController.ylL.getString(2131300182) + AlbumPreviewUI.bCB());
      if (!AlbumPreviewUI.d(this.mPO))
        break label121;
      AlbumPreviewUI.c(this.mPO).setImageResource(2131231853);
    }
    while (true)
    {
      AlbumPreviewUI.g(this.mPO);
      AppMethodBeat.o(21409);
      return;
      bool = false;
      break;
      label121: AlbumPreviewUI.c(this.mPO).setImageResource(2131231852);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.14
 * JD-Core Version:    0.6.2
 */