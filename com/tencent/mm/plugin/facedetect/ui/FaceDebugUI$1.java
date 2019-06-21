package com.tencent.mm.plugin.facedetect.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceDebugUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FaceDebugUI$1(FaceDebugUI paramFaceDebugUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(356);
    this.lWj.finish();
    AppMethodBeat.o(356);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDebugUI.1
 * JD-Core Version:    0.6.2
 */