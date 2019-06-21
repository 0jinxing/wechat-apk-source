package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.mm.ui.v;

public class VideoSeekBarEditorView extends LinearLayout
{
  private Button lXI;
  public RecyclerThumbSeekBar oDA;
  private Button oDB;
  private LinearLayout oDC;

  public VideoSeekBarEditorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(55302);
    init(paramContext);
    AppMethodBeat.o(55302);
  }

  public VideoSeekBarEditorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(55303);
    init(paramContext);
    AppMethodBeat.o(55303);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(55304);
    this.oDC = ((LinearLayout)v.hu(paramContext).inflate(2130970997, this, true));
    this.oDA = ((RecyclerThumbSeekBar)findViewById(2131828430));
    this.lXI = ((Button)findViewById(2131826542));
    this.oDB = ((Button)findViewById(2131826543));
    AppMethodBeat.o(55304);
  }

  public final void bQM()
  {
    AppMethodBeat.i(55308);
    this.oDA.release();
    ViewParent localViewParent = this.oDA.getParent();
    if ((localViewParent instanceof LinearLayout))
    {
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.oDA.getLayoutParams();
      ((LinearLayout)localViewParent).removeView(this.oDA);
      this.oDA = new RecyclerThumbSeekBar(getContext());
      ((LinearLayout)localViewParent).addView(this.oDA, 0, localLayoutParams);
    }
    AppMethodBeat.o(55308);
  }

  public void setCancelButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(55307);
    this.lXI.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(55307);
  }

  public void setFinishButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(55306);
    this.oDB.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(55306);
  }

  public void setTextColor(String paramString)
  {
    AppMethodBeat.i(55305);
    if (paramString != null)
      this.oDB.setTextColor(Color.parseColor(paramString));
    AppMethodBeat.o(55305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView
 * JD-Core Version:    0.6.2
 */