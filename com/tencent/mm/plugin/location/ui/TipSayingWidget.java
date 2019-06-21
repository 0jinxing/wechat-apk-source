package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bo;

public class TipSayingWidget extends LinearLayout
{
  private Context context;
  private String ecX;
  private TextView eku;
  private ImageView nNH;
  private Chronometer nNI;
  private int nNJ;

  public TipSayingWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113552);
    this.nNJ = 0;
    this.context = paramContext;
    paramContext = View.inflate(this.context, 2130970927, this);
    this.nNH = ((ImageView)paramContext.findViewById(2131828236));
    this.eku = ((TextView)paramContext.findViewById(2131828237));
    this.nNI = ((Chronometer)findViewById(2131826443));
    AppMethodBeat.o(113552);
  }

  public void setCurSaying(String paramString)
  {
    AppMethodBeat.i(113553);
    if (bo.isNullOrNil(paramString))
    {
      setVisibility(8);
      AppMethodBeat.o(113553);
    }
    while (true)
    {
      return;
      setVisibility(0);
      a.b.t(this.nNH, paramString);
      if (bo.isNullOrNil(this.ecX))
        this.ecX = r.Yz();
      if (this.ecX.equals(paramString))
      {
        this.eku.setText(this.context.getString(2131304125, new Object[] { paramString }));
        this.nNI.setVisibility(0);
        AppMethodBeat.o(113553);
      }
      else
      {
        this.eku.setText(this.context.getString(2131304125, new Object[] { paramString }));
        this.nNI.setVisibility(8);
        AppMethodBeat.o(113553);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.TipSayingWidget
 * JD-Core Version:    0.6.2
 */