package com.tencent.mm.plugin.order.ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.order.c.b;
import com.tencent.mm.plugin.order.model.ProductSectionItem;
import com.tencent.mm.plugin.order.model.ProductSectionItem.Skus;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

final class MallOrderProductListUI$a extends BaseAdapter
{
  private MallOrderProductListUI$a(MallOrderProductListUI paramMallOrderProductListUI)
  {
  }

  private ProductSectionItem AG(int paramInt)
  {
    AppMethodBeat.i(43837);
    ProductSectionItem localProductSectionItem = (ProductSectionItem)MallOrderProductListUI.a(this.pdS).get(paramInt);
    AppMethodBeat.o(43837);
    return localProductSectionItem;
  }

  public final int getCount()
  {
    AppMethodBeat.i(43836);
    int i = MallOrderProductListUI.a(this.pdS).size();
    AppMethodBeat.o(43836);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43838);
    ProductSectionItem localProductSectionItem;
    if (paramView == null)
    {
      paramView = View.inflate(this.pdS, 2130970060, null);
      paramViewGroup = new MallOrderProductListUI.b(this.pdS, (byte)0);
      paramViewGroup.knb = ((ImageView)paramView.findViewById(2131825844));
      paramViewGroup.pdT = ((TextView)paramView.findViewById(2131825845));
      paramViewGroup.pdU = ((TextView)paramView.findViewById(2131825852));
      paramViewGroup.pdV = ((TextView)paramView.findViewById(2131825853));
      paramViewGroup.pdW = ((TextView)paramView.findViewById(2131825854));
      paramViewGroup.pdX = ((TextView)paramView.findViewById(2131825851));
      paramView.setTag(paramViewGroup);
      localProductSectionItem = AG(paramInt);
      paramViewGroup.kbV = localProductSectionItem.iconUrl;
      if ((TextUtils.isEmpty(paramViewGroup.kbV)) || (!e.ats(paramViewGroup.kbV)))
        break label275;
      Bitmap localBitmap = x.a(new b(paramViewGroup.kbV));
      paramViewGroup.knb.setImageBitmap(localBitmap);
    }
    while (true)
    {
      paramViewGroup.pdT.setText(localProductSectionItem.name);
      paramViewGroup.pdU.setText(ProductSectionItem.Skus.ct(localProductSectionItem.pdy));
      paramViewGroup.pdV.setText(localProductSectionItem.pdz);
      paramViewGroup.pdW.setText("+" + localProductSectionItem.count);
      x.a(paramViewGroup);
      paramViewGroup.pdX.setVisibility(8);
      AppMethodBeat.o(43838);
      return paramView;
      paramViewGroup = (MallOrderProductListUI.b)paramView.getTag();
      break;
      label275: paramViewGroup.knb.setImageResource(2131231569);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderProductListUI.a
 * JD-Core Version:    0.6.2
 */