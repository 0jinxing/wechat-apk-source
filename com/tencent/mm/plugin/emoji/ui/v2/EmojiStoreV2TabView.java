package com.tencent.mm.plugin.emoji.ui.v2;

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
import com.tencent.mm.g.a.cw;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.ui.MMTabView;

public class EmojiStoreV2TabView extends RelativeLayout
{
  private int lfN;
  private int lfO;
  private Bitmap lfP;
  private LinearLayout lfQ;
  private ImageView lfR;
  private MMTabView lfS;
  private MMTabView lfT;
  private EmojiStoreV2TabView.a lfU;
  protected View.OnClickListener lfV;
  c<cw> lfW;
  private Matrix mMatrix;

  public EmojiStoreV2TabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(53803);
    this.lfO = 0;
    this.mMatrix = new Matrix();
    this.lfV = new EmojiStoreV2TabView.1(this);
    this.lfW = new EmojiStoreV2TabView.2(this);
    init();
    AppMethodBeat.o(53803);
  }

  public EmojiStoreV2TabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(53802);
    this.lfO = 0;
    this.mMatrix = new Matrix();
    this.lfV = new EmojiStoreV2TabView.1(this);
    this.lfW = new EmojiStoreV2TabView.2(this);
    init();
    AppMethodBeat.o(53802);
  }

  private void bmo()
  {
    AppMethodBeat.i(53806);
    this.lfQ = new LinearLayout(getContext());
    this.lfQ.setBackgroundResource(2131690691);
    this.lfQ.setId(2131820597);
    this.lfQ.setOrientation(0);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    addView(this.lfQ, localLayoutParams);
    AppMethodBeat.o(53806);
  }

  private void bmp()
  {
    AppMethodBeat.i(53807);
    this.lfR = new ImageView(getContext());
    this.lfR.setImageMatrix(this.mMatrix);
    this.lfR.setScaleType(ImageView.ScaleType.MATRIX);
    this.lfR.setId(2131820598);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, com.tencent.mm.bz.a.fromDPToPix(getContext(), 3));
    localLayoutParams.addRule(8, 2131820597);
    addView(this.lfR, localLayoutParams);
    AppMethodBeat.o(53807);
  }

  private void bmq()
  {
    AppMethodBeat.i(53808);
    this.lfS = ul(0);
    if (j.getEmojiStorageMgr().dta())
      this.lfS.setText(2131299118);
    while (true)
    {
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131428725));
      localLayoutParams.weight = 1.0F;
      this.lfQ.addView(this.lfS, localLayoutParams);
      AppMethodBeat.o(53808);
      return;
      this.lfS.setText(2131299117);
    }
  }

  private void bmr()
  {
    AppMethodBeat.i(53809);
    this.lfT = ul(1);
    this.lfT.setText(2131299125);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131428725));
    localLayoutParams.weight = 1.0F;
    this.lfQ.addView(this.lfT, localLayoutParams);
    AppMethodBeat.o(53809);
  }

  private void init()
  {
    AppMethodBeat.i(53805);
    bmo();
    bmp();
    bmq();
    bmr();
    AppMethodBeat.o(53805);
  }

  private MMTabView ul(int paramInt)
  {
    AppMethodBeat.i(53810);
    MMTabView localMMTabView = new MMTabView(getContext(), paramInt);
    localMMTabView.setTag(Integer.valueOf(paramInt));
    localMMTabView.setOnClickListener(this.lfV);
    AppMethodBeat.o(53810);
    return localMMTabView;
  }

  protected final void bms()
  {
    AppMethodBeat.i(53815);
    com.tencent.mm.sdk.b.a.xxA.c(this.lfW);
    AppMethodBeat.o(53815);
  }

  public int getCurentIndex()
  {
    return this.lfO;
  }

  public final void gz(boolean paramBoolean)
  {
    AppMethodBeat.i(53814);
    if (this.lfT != null)
      this.lfT.pR(paramBoolean);
    AppMethodBeat.o(53814);
  }

  public final void l(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(53811);
    this.mMatrix.setTranslate(this.lfN * (paramInt + paramFloat), 0.0F);
    this.lfR.setImageMatrix(this.mMatrix);
    AppMethodBeat.o(53811);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(53804);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.lfN = ((paramInt3 - paramInt1) / 2);
    paramInt2 = this.lfN;
    if (((this.lfP == null) || (this.lfP.getWidth() != paramInt2)) && (paramInt2 > 0))
      if (this.lfP != null)
        break label166;
    label166: for (paramInt1 = -1; ; paramInt1 = this.lfP.getWidth())
    {
      ab.w("MicroMsg.emoji.EmojiStoreV2TabView", "sharp width changed, from %d to %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.lfP = Bitmap.createBitmap(paramInt2, com.tencent.mm.bz.a.fromDPToPix(getContext(), 3), Bitmap.Config.ARGB_8888);
      new Canvas(this.lfP).drawColor(getResources().getColor(2131690683));
      l(this.lfO, 0.0F);
      this.lfR.setImageBitmap(this.lfP);
      setTo(this.lfO);
      AppMethodBeat.o(53804);
      return;
    }
  }

  public void setOnTabClickListener(EmojiStoreV2TabView.a parama)
  {
    this.lfU = parama;
  }

  public void setPersonTabUnReadCount(String paramString)
  {
    AppMethodBeat.i(53813);
    if (this.lfT != null)
      this.lfT.setUnread(paramString);
    AppMethodBeat.o(53813);
  }

  public void setTo(int paramInt)
  {
    AppMethodBeat.i(53812);
    this.lfO = paramInt;
    MMTabView localMMTabView = this.lfS;
    if (this.lfO == 0)
    {
      localColorStateList = getResources().getColorStateList(2131690683);
      localMMTabView.setTextColor(localColorStateList);
      localMMTabView = this.lfT;
      if (this.lfO != 1)
        break label89;
    }
    label89: for (ColorStateList localColorStateList = getResources().getColorStateList(2131690683); ; localColorStateList = getResources().getColorStateList(2131690741))
    {
      localMMTabView.setTextColor(localColorStateList);
      AppMethodBeat.o(53812);
      return;
      localColorStateList = getResources().getColorStateList(2131690741);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView
 * JD-Core Version:    0.6.2
 */