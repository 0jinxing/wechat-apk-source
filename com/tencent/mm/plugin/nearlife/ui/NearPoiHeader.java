package com.tencent.mm.plugin.nearlife.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class NearPoiHeader extends LinearLayout
{
  private TextView hrg;
  private ImageView olT;

  public NearPoiHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(22995);
    init(paramContext);
    AppMethodBeat.o(22995);
  }

  @TargetApi(11)
  public NearPoiHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(22994);
    init(paramContext);
    AppMethodBeat.o(22994);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(22996);
    paramContext = View.inflate(paramContext, 2130970281, this);
    this.olT = ((ImageView)paramContext.findViewById(2131826276));
    this.hrg = ((TextView)paramContext.findViewById(2131826277));
    AppMethodBeat.o(22996);
  }

  public void setText(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(22997);
    this.hrg.setText(paramCharSequence);
    AppMethodBeat.o(22997);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.NearPoiHeader
 * JD-Core Version:    0.6.2
 */