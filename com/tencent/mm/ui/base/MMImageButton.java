package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public class MMImageButton extends FrameLayout
{
  private ImageView cDh;
  private TextView piD;

  public MMImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106676);
    paramAttributeSet = new FrameLayout.LayoutParams(-2, -2);
    paramAttributeSet.gravity = 17;
    this.cDh = new ImageView(paramContext);
    this.cDh.setLayoutParams(paramAttributeSet);
    addView(this.cDh);
    paramAttributeSet = new FrameLayout.LayoutParams(-2, -2);
    paramAttributeSet.gravity = 17;
    this.piD = new TextView(paramContext);
    this.piD.setLayoutParams(paramAttributeSet);
    this.piD.setClickable(false);
    this.piD.setFocusable(false);
    this.piD.setFocusableInTouchMode(false);
    this.piD.setTextColor(a.h(paramContext, 2131690760));
    addView(this.piD);
    AppMethodBeat.o(106676);
  }

  public void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(106681);
    super.setEnabled(paramBoolean);
    this.piD.setEnabled(paramBoolean);
    this.cDh.setEnabled(paramBoolean);
    AppMethodBeat.o(106681);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(106678);
    this.cDh.setImageDrawable(paramDrawable);
    this.cDh.setVisibility(0);
    this.piD.setVisibility(8);
    AppMethodBeat.o(106678);
  }

  public void setImageRsource(int paramInt)
  {
    AppMethodBeat.i(106677);
    setImageDrawable(a.g(getContext(), paramInt));
    AppMethodBeat.o(106677);
  }

  public void setText(int paramInt)
  {
    AppMethodBeat.i(106680);
    this.piD.setText(paramInt);
    this.piD.setVisibility(0);
    this.cDh.setVisibility(8);
    AppMethodBeat.o(106680);
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(106679);
    this.piD.setText(paramString);
    this.piD.setVisibility(0);
    this.cDh.setVisibility(8);
    AppMethodBeat.o(106679);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMImageButton
 * JD-Core Version:    0.6.2
 */