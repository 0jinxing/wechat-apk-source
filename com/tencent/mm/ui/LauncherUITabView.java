package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public class LauncherUITabView extends RelativeLayout
  implements c
{
  private Matrix aKk;
  protected int lWS;
  private long nlj;
  private c.a yjX;
  private int ykG;
  private Bitmap ykH;
  private ImageView ykI;
  protected a ykJ;
  protected a ykK;
  protected a ykL;
  protected a ykM;
  private int ykn;
  protected View.OnClickListener ykp;
  private ak ykq;
  private int ykr;
  private int yks;
  private int ykt;
  private boolean yku;
  private int ykw;
  private boolean ykx;

  public LauncherUITabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(29517);
    this.lWS = 0;
    this.aKk = new Matrix();
    this.nlj = 0L;
    this.ykn = -1;
    this.ykp = new LauncherUITabView.1(this);
    this.ykq = new LauncherUITabView.2(this);
    this.ykr = 0;
    this.yks = 0;
    this.ykt = 0;
    this.ykw = 0;
    this.yku = false;
    this.ykx = false;
    init();
    AppMethodBeat.o(29517);
  }

  public LauncherUITabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(29518);
    this.lWS = 0;
    this.aKk = new Matrix();
    this.nlj = 0L;
    this.ykn = -1;
    this.ykp = new LauncherUITabView.1(this);
    this.ykq = new LauncherUITabView.2(this);
    this.ykr = 0;
    this.yks = 0;
    this.ykt = 0;
    this.ykw = 0;
    this.yku = false;
    this.ykx = false;
    init();
    AppMethodBeat.o(29518);
  }

  private a MX(int paramInt)
  {
    AppMethodBeat.i(29519);
    a locala = new a();
    locala.ykO = new MMTabView(getContext(), paramInt);
    locala.ykO.setTag(Integer.valueOf(paramInt));
    locala.ykO.setOnClickListener(this.ykp);
    AppMethodBeat.o(29519);
    return locala;
  }

  private void dxN()
  {
    AppMethodBeat.i(29524);
    this.ykI = new ImageView(getContext());
    this.ykI.setImageMatrix(this.aKk);
    this.ykI.setScaleType(ImageView.ScaleType.MATRIX);
    this.ykI.setId(2307142);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, a.fromDPToPix(getContext(), 3));
    localLayoutParams.addRule(8, 2307141);
    addView(this.ykI, localLayoutParams);
    AppMethodBeat.o(29524);
  }

  private a f(LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(29520);
    a locala = MX(0);
    locala.ykO.setText(2131301269);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131428725));
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(locala.ykO, localLayoutParams);
    AppMethodBeat.o(29520);
    return locala;
  }

  private a g(LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(29521);
    a locala = MX(1);
    locala.ykO.setText(2131301270);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131428725));
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(locala.ykO, localLayoutParams);
    AppMethodBeat.o(29521);
    return locala;
  }

  private a h(LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(29522);
    a locala = MX(2);
    locala.ykO.setText(2131301268);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131428725));
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(locala.ykO, localLayoutParams);
    AppMethodBeat.o(29522);
    return locala;
  }

  private a i(LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(29523);
    a locala = MX(3);
    locala.ykO.setText(2131301302);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131428725));
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(locala.ykO, localLayoutParams);
    AppMethodBeat.o(29523);
    return locala;
  }

  private void init()
  {
    AppMethodBeat.i(29525);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setBackgroundResource(2131690691);
    localLinearLayout.setId(2307141);
    localLinearLayout.setOrientation(0);
    addView(localLinearLayout, new RelativeLayout.LayoutParams(-1, -2));
    dxN();
    this.ykJ = f(localLinearLayout);
    this.ykK = g(localLinearLayout);
    this.ykL = h(localLinearLayout);
    this.ykM = i(localLinearLayout);
    AppMethodBeat.o(29525);
  }

  public final void MM(int paramInt)
  {
    AppMethodBeat.i(29527);
    ab.d("MicroMsg.LauncherUITabView", "updateMainTabUnread %d", new Object[] { Integer.valueOf(paramInt) });
    this.ykr = paramInt;
    if (paramInt > 0)
      if (paramInt > 99)
      {
        this.ykJ.ykO.setUnread(getContext().getString(2131304157));
        AppMethodBeat.o(29527);
      }
    while (true)
    {
      return;
      this.ykJ.ykO.setUnread(String.valueOf(paramInt));
      AppMethodBeat.o(29527);
      continue;
      this.ykJ.ykO.setUnread(null);
      AppMethodBeat.o(29527);
    }
  }

  public final void MN(int paramInt)
  {
    AppMethodBeat.i(29529);
    this.yks = paramInt;
    if (paramInt > 0)
      if (paramInt > 99)
      {
        this.ykK.ykO.setUnread(getContext().getString(2131304157));
        AppMethodBeat.o(29529);
      }
    while (true)
    {
      return;
      this.ykK.ykO.setUnread(String.valueOf(paramInt));
      AppMethodBeat.o(29529);
      continue;
      this.ykK.ykO.setUnread(null);
      AppMethodBeat.o(29529);
    }
  }

  public final void MO(int paramInt)
  {
    AppMethodBeat.i(29530);
    this.ykt = paramInt;
    if (paramInt > 0)
      if (paramInt > 99)
      {
        this.ykL.ykO.setUnread(getContext().getString(2131304157));
        AppMethodBeat.o(29530);
      }
    while (true)
    {
      return;
      this.ykL.ykO.setUnread(String.valueOf(paramInt));
      AppMethodBeat.o(29530);
      continue;
      this.ykL.ykO.setUnread(null);
      AppMethodBeat.o(29530);
    }
  }

  public final void MP(int paramInt)
  {
    AppMethodBeat.i(29531);
    this.ykw = paramInt;
    if (paramInt > 0)
      if (paramInt > 99)
      {
        this.ykM.ykO.setUnread(getContext().getString(2131304157));
        AppMethodBeat.o(29531);
      }
    while (true)
    {
      return;
      this.ykM.ykO.setUnread(String.valueOf(paramInt));
      AppMethodBeat.o(29531);
      continue;
      this.ykM.ykO.setUnread(null);
      AppMethodBeat.o(29531);
    }
  }

  public final void dwp()
  {
    AppMethodBeat.i(29528);
    if ((this.ykJ == null) || (this.ykK == null) || (this.ykL == null) || (this.ykM == null))
      AppMethodBeat.o(29528);
    while (true)
    {
      return;
      this.ykJ.ykO.dyw();
      this.ykK.ykO.dyw();
      this.ykL.ykO.dyw();
      this.ykM.ykO.dyw();
      AppMethodBeat.o(29528);
    }
  }

  public int getContactTabUnread()
  {
    return this.yks;
  }

  public int getCurIdx()
  {
    return this.lWS;
  }

  public int getFriendTabUnread()
  {
    return this.ykt;
  }

  public int getMainTabUnread()
  {
    return this.ykr;
  }

  public boolean getSettingsPoint()
  {
    return this.ykx;
  }

  public int getSettingsTabUnread()
  {
    return this.ykw;
  }

  public boolean getShowFriendPoint()
  {
    return this.yku;
  }

  public final void l(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(29534);
    this.aKk.setTranslate(this.ykG * (paramInt + paramFloat), 0.0F);
    this.ykI.setImageMatrix(this.aKk);
    AppMethodBeat.o(29534);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(29526);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ab.d("MicroMsg.LauncherUITabView", "on layout, width %d", new Object[] { Integer.valueOf(paramInt3 - paramInt1) });
    this.ykG = ((paramInt3 - paramInt1) / 4);
    paramInt2 = this.ykG;
    if ((this.ykH == null) || (this.ykH.getWidth() != paramInt2))
      if (this.ykH != null)
        break label185;
    label185: for (paramInt1 = -1; ; paramInt1 = this.ykH.getWidth())
    {
      ab.w("MicroMsg.LauncherUITabView", "sharp width changed, from %d to %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.ykH = Bitmap.createBitmap(paramInt2, a.fromDPToPix(getContext(), 3), Bitmap.Config.ARGB_8888);
      new Canvas(this.ykH).drawColor(getResources().getColor(2131690683));
      l(this.lWS, 0.0F);
      this.ykI.setImageBitmap(this.ykH);
      setTo(this.lWS);
      AppMethodBeat.o(29526);
      return;
    }
  }

  public final void px(boolean paramBoolean)
  {
    AppMethodBeat.i(29532);
    this.yku = paramBoolean;
    this.ykL.ykO.pR(paramBoolean);
    AppMethodBeat.o(29532);
  }

  public final void py(boolean paramBoolean)
  {
    AppMethodBeat.i(29533);
    this.ykx = paramBoolean;
    this.ykM.ykO.pR(paramBoolean);
    AppMethodBeat.o(29533);
  }

  public final void pz(boolean paramBoolean)
  {
  }

  public void setOnTabClickListener(c.a parama)
  {
    this.yjX = parama;
  }

  public void setTo(int paramInt)
  {
    AppMethodBeat.i(29535);
    this.lWS = paramInt;
    MMTabView localMMTabView = this.ykJ.ykO;
    if (paramInt == 0)
    {
      localColorStateList = getResources().getColorStateList(2131690683);
      localMMTabView.setTextColor(localColorStateList);
      localMMTabView = this.ykK.ykO;
      if (paramInt != 1)
        break label162;
      localColorStateList = getResources().getColorStateList(2131690683);
      label63: localMMTabView.setTextColor(localColorStateList);
      localMMTabView = this.ykL.ykO;
      if (paramInt != 2)
        break label176;
      localColorStateList = getResources().getColorStateList(2131690683);
      label92: localMMTabView.setTextColor(localColorStateList);
      localMMTabView = this.ykM.ykO;
      if (paramInt != 3)
        break label190;
    }
    label162: label176: label190: for (ColorStateList localColorStateList = getResources().getColorStateList(2131690683); ; localColorStateList = getResources().getColorStateList(2131690741))
    {
      localMMTabView.setTextColor(localColorStateList);
      this.nlj = System.currentTimeMillis();
      this.ykn = this.lWS;
      AppMethodBeat.o(29535);
      return;
      localColorStateList = getResources().getColorStateList(2131690741);
      break;
      localColorStateList = getResources().getColorStateList(2131690741);
      break label63;
      localColorStateList = getResources().getColorStateList(2131690741);
      break label92;
    }
  }

  protected final class a
  {
    MMTabView ykO;

    protected a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUITabView
 * JD-Core Version:    0.6.2
 */