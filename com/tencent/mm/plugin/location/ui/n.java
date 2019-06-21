package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.k.d;
import com.tencent.mm.plugin.location_soso.ViewManager;

public final class n
  implements c
{
  public boolean czr;
  public String eUu;
  public boolean isVisible;
  private Context mContext;
  public ViewManager mViewManager;
  private String nJq;
  public double nJu;
  public double nJv;
  public boolean nLW;
  private View nLX;
  private TextView nLs;
  private ProgressBar nLt;
  private String nLw;
  public FrameLayout nOA;
  private TextView nOB;
  public boolean nOC;
  public final String nOy;
  public ImageView nOz;

  public n(d paramd, Context paramContext)
  {
    AppMethodBeat.i(113587);
    this.nOy = "info_window_tag";
    this.czr = false;
    this.nLW = true;
    this.nJu = 1000000.0D;
    this.nJv = 1000000.0D;
    this.isVisible = true;
    this.nLw = "";
    this.mContext = paramContext;
    this.nOC = false;
    this.nOz = new ImageView(paramContext);
    this.nOz.setBackgroundResource(2130839563);
    this.nOz.setScaleType(ImageView.ScaleType.CENTER_CROP);
    this.nOA = ((FrameLayout)View.inflate(paramContext, 2130970068, null));
    this.nOz.setImageResource(2130839178);
    this.nLX = this.nOA;
    this.mViewManager = ((ViewManager)paramd.getViewManager());
    AppMethodBeat.o(113587);
  }

  public final String getPreText()
  {
    return this.nLw;
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(113588);
    this.nJq = paramString;
    paramString = this.nJq;
    this.nLs = ((TextView)this.nOA.findViewById(2131825276));
    this.nLt = ((ProgressBar)this.nOA.findViewById(2131825275));
    this.nOB = ((TextView)this.nOA.findViewById(2131825913));
    if ((paramString == null) || (paramString.equals("")))
    {
      this.nLt.setVisibility(0);
      if ((this.eUu == null) || (this.eUu.equals("")))
        break label201;
      this.nOB.setVisibility(0);
      this.nOB.setText(this.eUu);
    }
    while (true)
    {
      if (this.nLW)
      {
        this.mViewManager.updateViewLayout(this.nOz, this.nJu, this.nJv, false);
        if (this.nOC)
          this.mViewManager.showInfoWindowByView(this.nOz);
      }
      AppMethodBeat.o(113588);
      return;
      this.nLt.setVisibility(8);
      this.nLs.setVisibility(0);
      this.nLs.setText(paramString);
      break;
      label201: this.nOB.setText("");
      this.nOB.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.n
 * JD-Core Version:    0.6.2
 */