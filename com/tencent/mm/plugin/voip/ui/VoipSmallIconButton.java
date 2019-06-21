package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.a;

public class VoipSmallIconButton extends FrameLayout
{
  private ImageView ikh;
  private View.OnTouchListener jZu;
  private TextView sW;
  private Drawable sWI;
  private Drawable sWJ;

  public VoipSmallIconButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(4868);
    this.sWI = null;
    this.sWJ = null;
    this.jZu = new VoipSmallIconButton.1(this);
    LayoutInflater.from(paramContext).inflate(2130969929, this);
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, a.a.VoipButton, 0, 0);
    try
    {
      this.sWI = paramContext.getDrawable(2);
      this.sWJ = paramContext.getDrawable(3);
      paramAttributeSet = paramContext.getString(4);
      int i = paramContext.getResourceId(4, -1);
      paramContext.recycle();
      this.ikh = ((ImageView)findViewById(2131825248));
      this.ikh.setImageDrawable(this.sWI);
      this.ikh.setOnTouchListener(this.jZu);
      this.ikh.setContentDescription(paramAttributeSet);
      this.sW = ((TextView)findViewById(2131825249));
      if (i != -1)
        this.sW.setText(getContext().getString(i));
      AppMethodBeat.o(4868);
      return;
    }
    finally
    {
      paramContext.recycle();
      AppMethodBeat.o(4868);
    }
    throw paramAttributeSet;
  }

  public void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(4869);
    this.ikh.setEnabled(paramBoolean);
    this.sW.setEnabled(paramBoolean);
    AppMethodBeat.o(4869);
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(4867);
    this.ikh.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(4867);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipSmallIconButton
 * JD-Core Version:    0.6.2
 */