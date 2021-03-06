package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class ChattingImageBGView extends ImageView
{
  private int lastWidth;
  private Bitmap mQQ;

  public ChattingImageBGView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(30690);
    this.lastWidth = 0;
    setScaleType(ImageView.ScaleType.CENTER_CROP);
    AppMethodBeat.o(30690);
  }

  public ChattingImageBGView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(30689);
    this.lastWidth = 0;
    setScaleType(ImageView.ScaleType.CENTER_CROP);
    AppMethodBeat.o(30689);
  }

  private void dCq()
  {
    AppMethodBeat.i(30693);
    post(new ChattingImageBGView.1(this));
    AppMethodBeat.o(30693);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(30691);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (this.lastWidth != paramInt3 - paramInt1))
    {
      this.lastWidth = (paramInt3 - paramInt1);
      ab.d("MicroMsg.ChattingImageBGView", "on layout changed, %d, %d, %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      dCq();
    }
    AppMethodBeat.o(30691);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(30692);
    this.mQQ = paramBitmap;
    super.setImageBitmap(paramBitmap);
    dCq();
    AppMethodBeat.o(30692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingImageBGView
 * JD-Core Version:    0.6.2
 */