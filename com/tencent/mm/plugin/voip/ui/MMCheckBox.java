package com.tencent.mm.plugin.voip.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMCheckBox extends CheckBox
{
  private Drawable sVQ;
  private int sVR;

  public MMCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void drawableStateChanged()
  {
    AppMethodBeat.i(4776);
    super.drawableStateChanged();
    if (this.sVQ != null)
    {
      int[] arrayOfInt = getDrawableState();
      this.sVQ.setState(arrayOfInt);
      invalidate();
    }
    AppMethodBeat.o(4776);
  }

  @TargetApi(11)
  public void jumpDrawablesToCurrentState()
  {
    AppMethodBeat.i(4778);
    super.jumpDrawablesToCurrentState();
    if ((Build.VERSION.SDK_INT >= 11) && (this.sVQ != null))
      this.sVQ.jumpToCurrentState();
    AppMethodBeat.o(4778);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i = 0;
    AppMethodBeat.i(4779);
    super.onDraw(paramCanvas);
    Drawable localDrawable = this.sVQ;
    int j;
    int m;
    int n;
    if (localDrawable != null)
    {
      j = getGravity();
      int k = getGravity();
      m = localDrawable.getIntrinsicHeight();
      n = localDrawable.getIntrinsicWidth();
      switch (j & 0x70)
      {
      default:
        j = 0;
        switch (k & 0x7)
        {
        default:
        case 5:
        case 1:
        }
        break;
      case 80:
      case 16:
      }
    }
    while (true)
    {
      localDrawable.setBounds(i, j, i + n, m + j);
      localDrawable.draw(paramCanvas);
      AppMethodBeat.o(4779);
      return;
      j = getHeight() - m;
      break;
      j = (getHeight() - m) / 2;
      break;
      i = getWidth() - n;
      continue;
      i = (getWidth() - n) / 2;
    }
  }

  public void setButtonDrawable(int paramInt)
  {
    AppMethodBeat.i(4775);
    if ((paramInt != 0) && (paramInt == this.sVR))
      AppMethodBeat.o(4775);
    while (true)
    {
      return;
      this.sVR = paramInt;
      Drawable localDrawable = null;
      if (this.sVR != 0)
        localDrawable = getResources().getDrawable(this.sVR);
      setButtonDrawable(localDrawable);
      AppMethodBeat.o(4775);
    }
  }

  public void setButtonDrawable(Drawable paramDrawable)
  {
    this.sVQ = paramDrawable;
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(4777);
    boolean bool;
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.sVQ))
    {
      bool = true;
      AppMethodBeat.o(4777);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4777);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.MMCheckBox
 * JD-Core Version:    0.6.2
 */