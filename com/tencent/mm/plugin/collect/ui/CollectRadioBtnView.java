package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.v;

public class CollectRadioBtnView extends LinearLayout
{
  private TextView iDT;
  private ImageView kHC;

  public CollectRadioBtnView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(41329);
    init(paramContext);
    AppMethodBeat.o(41329);
  }

  public CollectRadioBtnView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(41330);
    init(paramContext);
    AppMethodBeat.o(41330);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(41331);
    paramContext = v.hu(paramContext).inflate(2130969158, this);
    this.kHC = ((ImageView)paramContext.findViewById(2131822840));
    this.iDT = ((TextView)paramContext.findViewById(2131821185));
    AppMethodBeat.o(41331);
  }

  public void setRadioSrc(int paramInt)
  {
    AppMethodBeat.i(41333);
    this.kHC.setImageResource(paramInt);
    AppMethodBeat.o(41333);
  }

  public void setTitleText(String paramString)
  {
    AppMethodBeat.i(41332);
    this.iDT.setText(paramString);
    AppMethodBeat.o(41332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectRadioBtnView
 * JD-Core Version:    0.6.2
 */