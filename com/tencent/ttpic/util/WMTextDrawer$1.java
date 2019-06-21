package com.tencent.ttpic.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.model.TextWMElement;

class WMTextDrawer$1 extends WMTextDrawer.AsyncDrawRunnable
{
  WMTextDrawer$1(WMTextDrawer paramWMTextDrawer, TextWMElement paramTextWMElement, String paramString, boolean paramBoolean)
  {
    super(paramWMTextDrawer);
  }

  public void run()
  {
    AppMethodBeat.i(84279);
    if ((!BitmapUtils.isLegal(this.val$element.getIdleBitmap())) || (this.val$text == null))
    {
      WMTextDrawer.access$002(this.this$0, true);
      AppMethodBeat.o(84279);
      return;
    }
    if (this.val$updateShaderBmp);
    for (String str = this.this$0.lastDrawText; ; str = this.val$text)
    {
      this.val$element.getIdleBitmap().eraseColor(0);
      if (str.length() != 0)
        break label98;
      WMTextDrawer.access$002(this.this$0, true);
      AppMethodBeat.o(84279);
      break;
    }
    label98: Canvas localCanvas = new Canvas(this.val$element.getIdleBitmap());
    if (this.val$element.vertical == 0)
      WMTextDrawer.access$100(this.this$0, this.val$element, localCanvas, localCanvas.getWidth(), localCanvas.getHeight(), str);
    while (true)
    {
      this.val$element.swapActiveBitmap();
      this.val$element.setContentChanged(true);
      if (this.isTaskCanceled)
        this.val$element.setContentChanged(false);
      WMTextDrawer.access$002(this.this$0, true);
      AppMethodBeat.o(84279);
      break;
      WMTextDrawer.access$200(this.this$0, this.val$element, localCanvas, localCanvas.getWidth(), localCanvas.getHeight(), str);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.WMTextDrawer.1
 * JD-Core Version:    0.6.2
 */