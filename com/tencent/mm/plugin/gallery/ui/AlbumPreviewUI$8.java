package com.tencent.mm.plugin.gallery.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class AlbumPreviewUI$8
  implements a.a
{
  private View.OnClickListener mjE;

  AlbumPreviewUI$8(AlbumPreviewUI paramAlbumPreviewUI)
  {
    AppMethodBeat.i(21402);
    this.mjE = new AlbumPreviewUI.8.1(this);
    AppMethodBeat.o(21402);
  }

  public final View getView()
  {
    AppMethodBeat.i(21403);
    View localView = View.inflate(this.mPO.mController.ylL, 2130969001, null);
    localView.setOnClickListener(this.mjE);
    TextView localTextView = (TextView)localView.findViewById(2131822355);
    if ((e.bBZ().mOu == 2) || (e.bBZ().hOZ == 13))
      localTextView.setText(2131300213);
    while (true)
    {
      localView.setLayerType(1, null);
      AppMethodBeat.o(21403);
      return localView;
      if (e.bBZ().mOu == 1)
        localTextView.setText(2131300212);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.8
 * JD-Core Version:    0.6.2
 */