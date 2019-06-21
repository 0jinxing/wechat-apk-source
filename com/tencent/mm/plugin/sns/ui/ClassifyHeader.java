package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ClassifyHeader extends LinearLayout
{
  private TextView hrg;
  private Context mContext;
  private ImageView olT;

  public ClassifyHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38195);
    init(paramContext);
    AppMethodBeat.o(38195);
  }

  @TargetApi(11)
  public ClassifyHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38194);
    init(paramContext);
    AppMethodBeat.o(38194);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(38196);
    this.mContext = paramContext;
    paramContext = View.inflate(this.mContext, 2130969138, this);
    this.olT = ((ImageView)paramContext.findViewById(2131822757));
    this.hrg = ((TextView)paramContext.findViewById(2131822758));
    AppMethodBeat.o(38196);
  }

  public void setDesc(String paramString)
  {
    AppMethodBeat.i(38197);
    this.hrg.setText(String.valueOf(paramString));
    AppMethodBeat.o(38197);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ClassifyHeader
 * JD-Core Version:    0.6.2
 */