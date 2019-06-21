package com.tencent.mm.plugin.webview.luggage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class j extends i
{
  public View uiV;
  public View uiW;
  private TextView uiX;

  public j(Context paramContext, View paramView)
  {
    super(paramContext);
    AppMethodBeat.i(6168);
    this.uiV = paramView;
    this.uiW = LayoutInflater.from(paramContext).inflate(2130971215, this, false);
    this.uiW.setVisibility(0);
    this.uiW.setBackgroundResource(2131690677);
    paramContext = this.uiW;
    removeAllViews();
    this.itI = paramContext;
    this.itJ = new FrameLayout(getContext());
    this.itJ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.itJ.addView(paramContext);
    this.WL = paramView;
    this.itK = new FrameLayout(getContext());
    this.itK.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.itK.addView(paramView);
    addView(this.itJ);
    addView(this.itK);
    this.uiX = ((TextView)this.uiW.findViewById(2131829179));
    AppMethodBeat.o(6168);
  }

  public final void setBgColor(int paramInt)
  {
    AppMethodBeat.i(6171);
    ((ViewGroup)this.uiW.getParent()).setBackgroundColor(paramInt);
    AppMethodBeat.o(6171);
  }

  public final void setCurrentUrl(String paramString)
  {
    AppMethodBeat.i(6169);
    if (!bo.isNullOrNil(paramString))
    {
      paramString = Uri.parse(paramString).getHost();
      if (!bo.isNullOrNil(paramString))
      {
        paramString = getContext().getString(2131305572, new Object[] { paramString });
        this.uiX.setVisibility(0);
        this.uiX.setText(paramString);
        AppMethodBeat.o(6169);
      }
    }
    while (true)
    {
      return;
      this.uiX.setVisibility(8);
      AppMethodBeat.o(6169);
    }
  }

  public final void setX5LogoViewVisibility(int paramInt)
  {
    AppMethodBeat.i(6170);
    this.uiW.setVisibility(paramInt);
    AppMethodBeat.o(6170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.j
 * JD-Core Version:    0.6.2
 */