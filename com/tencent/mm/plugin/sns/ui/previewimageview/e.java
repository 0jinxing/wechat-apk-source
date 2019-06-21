package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.ui.v;
import com.tencent.mm.plugin.sns.ui.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;
import java.util.List;

public final class e
  implements v
{
  private Context context;
  private boolean rKR;
  c rKS;
  DynamicGridView rKT;
  v.a rKU;
  float rKV;
  View rKW;
  ImageView rKX;
  private View rKY;
  private View rKZ;
  private int rLa;
  private Rect rLb;
  TextView rjj;
  private ImageView ruT;

  public e(View paramView1, View paramView2, View paramView3, Context paramContext, List<String> paramList, DynamicGridView paramDynamicGridView, v.a parama, c.a parama1, boolean paramBoolean)
  {
    AppMethodBeat.i(40331);
    this.rKR = paramBoolean;
    this.context = paramContext;
    this.rKU = parama;
    this.rKW = paramView2;
    this.rKY = paramView3;
    this.rKT = paramDynamicGridView;
    this.rKX = ((ImageView)paramView2.findViewById(2131827943));
    this.rjj = ((TextView)paramView2.findViewById(2131827745));
    this.rKZ = paramView1;
    paramDynamicGridView.setWobbleInEditMode(false);
    af.cnu();
    this.rLa = ((s.getScreenWidth() - paramContext.getResources().getDimensionPixelSize(2131428681) * 4 - paramContext.getResources().getDimensionPixelSize(2131427779) * 2) / 3);
    paramDynamicGridView.setColumnWidth(this.rLa + paramContext.getResources().getDimensionPixelSize(2131428681) * 2);
    paramDynamicGridView.setNumColumns(3);
    paramDynamicGridView.setOverScrollMode(2);
    paramDynamicGridView.setStretchMode(0);
    paramDynamicGridView.setClipChildren(false);
    paramDynamicGridView.setClipToPadding(false);
    paramDynamicGridView.setSelector(new ColorDrawable(0));
    this.rKS = new c(paramContext, paramList, paramBoolean, parama1);
    cvb();
    paramDynamicGridView.setAdapter(this.rKS);
    paramDynamicGridView.setOnDragListener(new e.1(this, paramDynamicGridView));
    paramDynamicGridView.setOnItemLongClickListener(new e.2(this));
    paramDynamicGridView.setOnItemClickListener(new e.3(this));
    paramDynamicGridView.setOnDropListener(new e.4(this, paramDynamicGridView, paramView1));
    paramDynamicGridView.getViewTreeObserver().addOnPreDrawListener(new e.5(this, paramDynamicGridView, paramList));
    af.cnu();
    if (s.getScreenWidth() == 0)
      new ak().postDelayed(new e.6(this, paramList), 50L);
    AppMethodBeat.o(40331);
  }

  private void cvb()
  {
    AppMethodBeat.i(40333);
    if ((ah.doB().getBoolean("key_show_tips", true)) && (this.rKS.cva() > 1))
    {
      this.rKY.setVisibility(0);
      this.ruT = ((ImageView)this.rKY.findViewById(2131827937));
      this.ruT.setOnClickListener(new e.7(this));
      AppMethodBeat.o(40333);
    }
    while (true)
    {
      return;
      this.rKY.setVisibility(8);
      AppMethodBeat.o(40333);
    }
  }

  public final void Eu(int paramInt)
  {
    int i = 3;
    AppMethodBeat.i(40332);
    af.cnu();
    this.rLa = ((s.getScreenWidth() - this.context.getResources().getDimensionPixelSize(2131428681) * 4 - this.context.getResources().getDimensionPixelSize(2131427779) * 2) / 3);
    this.rKT.setColumnWidth(this.rLa + this.context.getResources().getDimensionPixelSize(2131428681) * 2);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.rKT.getLayoutParams();
    af.cnu();
    ab.i("DynamicGrid", "setGridViewMargins margin: screenWith:%d", new Object[] { Integer.valueOf(s.getScreenWidth()) });
    paramInt = (paramInt + 3) / 3;
    if (paramInt > 3)
      paramInt = i;
    while (true)
    {
      int j = localMarginLayoutParams.leftMargin;
      int k = this.rKZ.getHeight();
      int m = this.rLa;
      int n = this.context.getResources().getDimensionPixelSize(2131428681);
      i = localMarginLayoutParams.rightMargin;
      float f = d.anS().density;
      localMarginLayoutParams.setMargins(j, k - m - n * 2, i, (int)((4 - paramInt) * (f * 32.0F)));
      this.rKT.setLayoutParams(localMarginLayoutParams);
      AppMethodBeat.o(40332);
      return;
    }
  }

  public final void clean()
  {
    AppMethodBeat.i(40335);
    if ((this.rKT != null) && (this.rKT.getAdapter() == null))
      ((c)this.rKT.getAdapter()).rmk = true;
    AppMethodBeat.o(40335);
  }

  public final View getView()
  {
    return this.rKT;
  }

  public final void setImageClick(v.a parama)
  {
    this.rKU = parama;
  }

  public final void setIsShowAddImage(boolean paramBoolean)
  {
    this.rKR = paramBoolean;
  }

  public final void setList$22875ea3(List<String> paramList)
  {
    AppMethodBeat.i(40334);
    if (this.rKS != null)
    {
      this.rKS.dy(paramList);
      cvb();
    }
    AppMethodBeat.o(40334);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.e
 * JD-Core Version:    0.6.2
 */