package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location_soso.ViewManager;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;

public class TrackPoint extends LinearLayout
{
  private boolean aIB;
  private double hOr;
  private double hOs;
  private double hOt;
  private double hOu;
  private Context mContext;
  public ViewManager mViewManager;
  public FrameLayout nRh;
  public ImageView nRi;
  private double nRj;
  private String username;

  public TrackPoint(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113720);
    this.nRj = 0.0D;
    this.hOr = -1.0D;
    this.hOs = -1.0D;
    this.hOt = -1.0D;
    this.hOu = -1.0D;
    this.aIB = true;
    this.mContext = paramContext;
    init(0);
    AppMethodBeat.o(113720);
  }

  public TrackPoint(Context paramContext, ViewManager paramViewManager)
  {
    super(paramContext);
    AppMethodBeat.i(113721);
    this.nRj = 0.0D;
    this.hOr = -1.0D;
    this.hOs = -1.0D;
    this.hOt = -1.0D;
    this.hOu = -1.0D;
    this.aIB = true;
    this.mContext = paramContext;
    this.mViewManager = paramViewManager;
    init(0);
    AppMethodBeat.o(113721);
  }

  public TrackPoint(Context paramContext, ViewManager paramViewManager, byte paramByte)
  {
    super(paramContext);
    AppMethodBeat.i(113722);
    this.nRj = 0.0D;
    this.hOr = -1.0D;
    this.hOs = -1.0D;
    this.hOt = -1.0D;
    this.hOu = -1.0D;
    this.aIB = true;
    this.mContext = paramContext;
    this.mViewManager = paramViewManager;
    init(2130839204);
    AppMethodBeat.o(113722);
  }

  private void init(int paramInt)
  {
    AppMethodBeat.i(113723);
    this.nRh = ((FrameLayout)View.inflate(this.mContext, 2130970965, null));
    this.nRi = new ImageView(this.mContext);
    if (paramInt > 0)
      this.nRi.setImageResource(paramInt);
    while (true)
    {
      this.nRi.setBackgroundResource(2130839563);
      this.nRi.setFocusable(true);
      this.nRi.setFocusableInTouchMode(true);
      AppMethodBeat.o(113723);
      return;
      this.nRi.setImageResource(2130839205);
    }
  }

  public final void bKE()
  {
    AppMethodBeat.i(113725);
    this.aIB = false;
    this.nRh.setVisibility(4);
    if (this.mViewManager != null)
      this.mViewManager.toggleViewVisible(this.nRh);
    AppMethodBeat.o(113725);
  }

  public final void bKF()
  {
    AppMethodBeat.i(113726);
    this.aIB = true;
    this.nRh.setVisibility(0);
    if (this.mViewManager != null)
      this.mViewManager.toggleViewVisible(this.nRh);
    AppMethodBeat.o(113726);
  }

  public double getHeading()
  {
    return this.nRj;
  }

  public double getLatOffest()
  {
    return this.hOr - this.hOt;
  }

  public double getLongOffset()
  {
    return this.hOs - this.hOu;
  }

  public final void n(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(113728);
    if (this.mViewManager != null)
    {
      this.mViewManager.updateViewLayout(this.nRh, paramDouble1, paramDouble2, false);
      this.mViewManager.updateLocaitonPinLayout(this.nRi, paramDouble1, paramDouble2, false);
    }
    AppMethodBeat.o(113728);
  }

  public final void o(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(113729);
    if (this.mViewManager != null)
    {
      this.mViewManager.addView(this.nRh, paramDouble1, paramDouble2);
      this.mViewManager.addView(this.nRi, paramDouble1, paramDouble2);
    }
    AppMethodBeat.o(113729);
  }

  public final void set2Top()
  {
    AppMethodBeat.i(113730);
    if (this.mViewManager != null)
    {
      this.mViewManager.setMarker2Top(this.nRh);
      this.mViewManager.setMarker2Top(this.nRi);
    }
    AppMethodBeat.o(113730);
  }

  public void setAvatar(String paramString)
  {
    AppMethodBeat.i(113724);
    if (paramString.equals(this.username))
    {
      ab.i("MicroMsg.TrackPoint", "skip this set avatar");
      AppMethodBeat.o(113724);
    }
    while (true)
    {
      return;
      this.username = paramString;
      a.b.r((ImageView)this.nRh.findViewById(2131828358), paramString);
      if (this.mViewManager != null)
        this.mViewManager.updateMarkerView(this.nRh);
      AppMethodBeat.o(113724);
    }
  }

  public void setHeading(double paramDouble)
  {
    this.nRj = paramDouble;
  }

  public void setOnAvatarOnClickListener(View.OnClickListener paramOnClickListener)
  {
  }

  public void setOnLocationOnClickListener(View.OnClickListener paramOnClickListener)
  {
  }

  public final void z(double paramDouble)
  {
    AppMethodBeat.i(113727);
    this.nRj = paramDouble;
    if (this.mViewManager != null)
      this.mViewManager.updateRotation(this.nRi, (float)paramDouble);
    AppMethodBeat.o(113727);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.TrackPoint
 * JD-Core Version:    0.6.2
 */