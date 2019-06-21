package com.tencent.mm.ui.chatting;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ChattingImageBGView$1
  implements Runnable
{
  ChattingImageBGView$1(ChattingImageBGView paramChattingImageBGView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30688);
    if (ChattingImageBGView.a(this.yJu) == null)
    {
      ab.w("MicroMsg.ChattingImageBGView", "want to reset matrix, but bmp is null");
      AppMethodBeat.o(30688);
      return;
    }
    if (ChattingImageBGView.a(this.yJu).getWidth() == 0)
      ab.w("MicroMsg.ChattingImageBGView", "want to reset matrix, but measured width error");
    Matrix localMatrix = new Matrix();
    float f1 = this.yJu.getMeasuredWidth() / ChattingImageBGView.a(this.yJu).getWidth();
    float f2 = this.yJu.getMeasuredHeight() / ChattingImageBGView.a(this.yJu).getHeight();
    ab.d("MicroMsg.ChattingImageBGView", "scaleW[%f], scaleH[%f] measured width[%d] measured height[%d]", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(this.yJu.getMeasuredWidth()), Integer.valueOf(this.yJu.getMeasuredHeight()) });
    if (f1 > f2)
      localMatrix.setScale(f1, f1);
    while (true)
    {
      this.yJu.setImageMatrix(localMatrix);
      AppMethodBeat.o(30688);
      break;
      localMatrix.setScale(f2, f2);
      f1 = ChattingImageBGView.a(this.yJu).getWidth();
      localMatrix.postTranslate((this.yJu.getMeasuredWidth() - f1 * f2) / 2.0F, 0.0F);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingImageBGView.1
 * JD-Core Version:    0.6.2
 */