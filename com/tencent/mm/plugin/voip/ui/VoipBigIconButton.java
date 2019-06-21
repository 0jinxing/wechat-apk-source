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

public class VoipBigIconButton extends FrameLayout
{
  private ImageView ikh;
  private View.OnTouchListener jZu;
  private TextView sW;
  private Drawable sWG;
  private Drawable sWH;
  private Drawable sWI;
  private Drawable sWJ;

  public VoipBigIconButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(4853);
    this.sWG = null;
    this.sWH = null;
    this.sWI = null;
    this.sWJ = null;
    this.jZu = new VoipBigIconButton.1(this);
    LayoutInflater.from(paramContext).inflate(2130969928, this);
    paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, a.a.VoipButton, 0, 0);
    while (true)
    {
      try
      {
        this.sWG = paramAttributeSet.getDrawable(0);
        this.sWH = paramAttributeSet.getDrawable(1);
        this.sWI = paramAttributeSet.getDrawable(2);
        this.sWJ = paramAttributeSet.getDrawable(3);
        int i = paramAttributeSet.getResourceId(4, -1);
        int j = paramAttributeSet.getResourceId(4, 0);
        if (j == 0)
          break label296;
        paramContext = getContext().getString(j);
        paramAttributeSet.recycle();
        if (this.sWH == null)
        {
          paramAttributeSet = this.sWG;
          this.sWH = paramAttributeSet;
          if (this.sWJ != null)
            break label288;
          paramAttributeSet = this.sWI;
          this.sWJ = paramAttributeSet;
          this.ikh = ((ImageView)findViewById(2131825246));
          this.ikh.setBackgroundDrawable(this.sWG);
          this.ikh.setImageDrawable(this.sWI);
          this.ikh.setOnTouchListener(this.jZu);
          this.ikh.setContentDescription(paramContext);
          this.sW = ((TextView)findViewById(2131825247));
          if (i != -1)
            this.sW.setText(getContext().getString(i));
          AppMethodBeat.o(4853);
          return;
        }
      }
      finally
      {
        paramAttributeSet.recycle();
        AppMethodBeat.o(4853);
      }
      paramAttributeSet = this.sWH;
      continue;
      label288: paramAttributeSet = this.sWJ;
      continue;
      label296: paramContext = null;
    }
  }

  public void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(4854);
    this.ikh.setEnabled(paramBoolean);
    this.sW.setEnabled(paramBoolean);
    AppMethodBeat.o(4854);
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(4855);
    this.ikh.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(4855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipBigIconButton
 * JD-Core Version:    0.6.2
 */