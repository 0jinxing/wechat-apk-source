package com.tencent.mm.ui.tools;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CropImageNewUI$4
  implements View.OnClickListener
{
  CropImageNewUI$4(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34817);
    CropImageView localCropImageView = CropImageNewUI.j(this.zBc);
    if (localCropImageView.mQQ == null)
    {
      ab.w("MicroMsg.CropImageView", "rotate not done! cause: btmp is null!");
      AppMethodBeat.o(34817);
    }
    while (true)
    {
      return;
      paramView = new float[2];
      paramView[0] = (localCropImageView.mQQ.getWidth() / 2);
      paramView[1] = (localCropImageView.mQQ.getHeight() / 2);
      localCropImageView.getImageMatrix().mapPoints(paramView);
      localCropImageView.getImageMatrix().postRotate(90.0F, paramView[0], paramView[1]);
      localCropImageView.setImageBitmap(localCropImageView.mQQ);
      localCropImageView.invalidate();
      localCropImageView.cDW += 1;
      AppMethodBeat.o(34817);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI.4
 * JD-Core Version:    0.6.2
 */