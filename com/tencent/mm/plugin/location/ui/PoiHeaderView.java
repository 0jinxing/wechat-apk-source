package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class PoiHeaderView extends RelativeLayout
{
  private Context context;
  public TextView eku;
  public String nMe;
  public String nMf;
  public SimpleImageView nMg;

  public PoiHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113469);
    this.nMe = "";
    this.nMf = "";
    this.context = paramContext;
    paramContext = View.inflate(this.context, 2130970367, this);
    this.eku = ((TextView)paramContext.findViewById(2131826555));
    this.nMg = ((SimpleImageView)paramContext.findViewById(2131826556));
    this.eku.setVisibility(8);
    this.nMg.setVisibility(8);
    setVisibility(8);
    setOnClickListener(new PoiHeaderView.1(this));
    AppMethodBeat.o(113469);
  }

  public void setViewUrl(String paramString)
  {
    AppMethodBeat.i(113470);
    ab.d("MicroMsg.PoiHeaderView", "viewUrl ".concat(String.valueOf(paramString)));
    this.nMf = paramString;
    AppMethodBeat.o(113470);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.PoiHeaderView
 * JD-Core Version:    0.6.2
 */