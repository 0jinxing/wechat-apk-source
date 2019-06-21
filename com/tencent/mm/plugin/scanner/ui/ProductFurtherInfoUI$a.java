package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.scanner.util.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMPageControlView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ProductFurtherInfoUI$a extends p
  implements x.a
{
  private Context mContext;
  private List<String> qcH;
  private Map<String, ImageView> qcI;
  private int qcJ;

  public ProductFurtherInfoUI$a(ProductFurtherInfoUI paramProductFurtherInfoUI, Context paramContext)
  {
    AppMethodBeat.i(81049);
    this.qcH = new ArrayList();
    this.qcI = new HashMap();
    this.mContext = paramContext;
    x.a(this);
    this.qcJ = this.mContext.getResources().getColor(2131690165);
    AppMethodBeat.o(81049);
  }

  private ImageView Wh(String paramString)
  {
    AppMethodBeat.i(81051);
    if (this.qcI.containsKey(paramString))
    {
      paramString = (ImageView)this.qcI.get(paramString);
      AppMethodBeat.o(81051);
    }
    while (true)
    {
      return paramString;
      ImageView localImageView = new ImageView(this.mContext);
      localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
      localImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      this.qcI.put(paramString, localImageView);
      AppMethodBeat.o(81051);
      paramString = localImageView;
    }
  }

  public final void cW(List<String> paramList)
  {
    AppMethodBeat.i(81050);
    this.qcH = paramList;
    ProductFurtherInfoUI.c(this.qcF).hj(paramList.size(), 0);
    notifyDataSetChanged();
    AppMethodBeat.o(81050);
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(81053);
    paramViewGroup.removeView((ImageView)paramObject);
    paramViewGroup = (String)this.qcH.get(paramInt);
    if (this.qcI.containsKey(paramViewGroup))
      this.qcI.remove(paramViewGroup);
    AppMethodBeat.o(81053);
  }

  public final int getCount()
  {
    AppMethodBeat.i(81054);
    int i = this.qcH.size();
    AppMethodBeat.o(81054);
    return i;
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(81052);
    Object localObject = (String)this.qcH.get(paramInt);
    ImageView localImageView = Wh((String)localObject);
    localObject = x.a(new q((String)localObject));
    if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
    {
      localImageView.setImageBitmap((Bitmap)localObject);
      localImageView.setBackgroundColor(0);
    }
    try
    {
      while (true)
      {
        paramViewGroup.addView(localImageView);
        AppMethodBeat.o(81052);
        return localImageView;
        localImageView.setImageBitmap(null);
        localImageView.setBackgroundColor(this.qcJ);
      }
    }
    catch (Exception paramViewGroup)
    {
      while (true)
        ab.e("MicroMsg.ProductFurtherInfoUI", "Add view failed: " + paramViewGroup.getMessage());
    }
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(81055);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()) && (!bo.isNullOrNil(paramString)))
    {
      paramString = Wh(paramString);
      if (paramString != null)
        al.d(new ProductFurtherInfoUI.a.1(this, paramString, paramBitmap));
    }
    AppMethodBeat.o(81055);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI.a
 * JD-Core Version:    0.6.2
 */