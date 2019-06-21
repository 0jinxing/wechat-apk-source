package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SnsNotifyBanner extends RelativeLayout
{
  private View WL;
  private LayoutInflater mInflater;
  private TextView ruS;
  private ImageView ruT;
  int ruU;
  private a ruV;

  public SnsNotifyBanner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(39139);
    this.ruU = 0;
    init();
    AppMethodBeat.o(39139);
  }

  public SnsNotifyBanner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(39138);
    this.ruU = 0;
    init();
    AppMethodBeat.o(39138);
  }

  private void init()
  {
    AppMethodBeat.i(39140);
    this.mInflater = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
    this.WL = this.mInflater.inflate(2130970785, this, true);
    this.ruS = ((TextView)this.WL.findViewById(2131827814));
    this.ruT = ((ImageView)this.WL.findViewById(2131827815));
    this.ruT.setOnClickListener(new SnsNotifyBanner.1(this));
    AppMethodBeat.o(39140);
  }

  public void setOnClickNotify(a parama)
  {
    AppMethodBeat.i(39141);
    this.ruV = parama;
    this.ruS.setOnClickListener(new SnsNotifyBanner.2(this));
    AppMethodBeat.o(39141);
  }

  public static abstract interface a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsNotifyBanner
 * JD-Core Version:    0.6.2
 */