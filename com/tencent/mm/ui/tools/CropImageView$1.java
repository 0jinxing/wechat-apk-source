package com.tencent.mm.ui.tools;

import android.os.Message;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.f;

final class CropImageView$1 extends ak
{
  CropImageView$1(CropImageView paramCropImageView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(107600);
    ab.d("MicroMsg.CropImageView", "on handler");
    if (paramMessage.what == 4659)
      this.zBE.zoomIn();
    do
      while (true)
      {
        super.handleMessage(paramMessage);
        AppMethodBeat.o(107600);
        return;
        if (paramMessage.what == 4658)
        {
          this.zBE.zoomOut();
        }
        else
        {
          if (paramMessage.what != 4660)
            break;
          if ((CropImageView.a(this.zBE) != null) && (CropImageView.b(this.zBE) != null))
          {
            CropImageView.b(this.zBE).cancel();
            CropImageView.c(this.zBE);
          }
        }
      }
    while (paramMessage.what != 4661);
    MotionEvent localMotionEvent = (MotionEvent)paramMessage.obj;
    CropImageView.a(this.zBE, System.currentTimeMillis());
    CropImageView.a(this.zBE, false);
    if ((localMotionEvent.getRawX() - CropImageView.d(this.zBE) > 10.0F) || (localMotionEvent.getRawY() - CropImageView.e(this.zBE) > 10.0F) || (localMotionEvent.getRawX() - CropImageView.d(this.zBE) < -10.0F) || (localMotionEvent.getRawY() - CropImageView.e(this.zBE) < -10.0F));
    for (int i = 0; ; i = 1)
    {
      if (i != 0)
      {
        long l = System.currentTimeMillis();
        if ((CropImageView.f(this.zBE) != 0L) && (l - CropImageView.f(this.zBE) < 300L) && (l - CropImageView.f(this.zBE) >= 0L) && (CropImageView.g(this.zBE) != null))
          CropImageView.g(this.zBE).dJI();
        CropImageView.a(this.zBE, 0L);
      }
      f.a(CropImageView.h(this.zBE), CropImageView.i(this.zBE));
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageView.1
 * JD-Core Version:    0.6.2
 */