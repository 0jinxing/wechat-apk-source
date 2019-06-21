package com.tencent.mm.plugin.remittance.bankcard.model;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import java.util.ArrayList;
import java.util.List;

public final class c extends BaseAdapter
  implements Filterable
{
  private Context mContext;
  private List<TransferRecordParcel> pLU;
  private List<TransferRecordParcel> pLV;
  private List<Pair<Integer, Integer>> pLW;
  private Filter pLX;

  public c(Context paramContext, List<TransferRecordParcel> paramList)
  {
    AppMethodBeat.i(44503);
    this.pLV = new ArrayList();
    this.pLW = new ArrayList();
    this.mContext = paramContext;
    this.pLU = paramList;
    AppMethodBeat.o(44503);
  }

  public final int getCount()
  {
    AppMethodBeat.i(44504);
    int i = this.pLV.size();
    AppMethodBeat.o(44504);
    return i;
  }

  public final Filter getFilter()
  {
    AppMethodBeat.i(44507);
    if (this.pLX == null)
      this.pLX = new c.a(this, (byte)0);
    Filter localFilter = this.pLX;
    AppMethodBeat.o(44507);
    return localFilter;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(44505);
    Object localObject = this.pLV.get(paramInt);
    AppMethodBeat.o(44505);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44506);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.mContext).inflate(2130968822, paramViewGroup, false);
      paramView = new c.b(this, (byte)0);
      paramView.pMa = ((CdnImageView)localView.findViewById(2131821683));
      paramView.pMb = ((TextView)localView.findViewById(2131821684));
      paramView.pMc = ((TextView)localView.findViewById(2131821685));
      localView.setTag(paramView);
    }
    c.b localb = (c.b)localView.getTag();
    TransferRecordParcel localTransferRecordParcel = (TransferRecordParcel)getItem(paramInt);
    Pair localPair = (Pair)this.pLW.get(paramInt);
    paramView = new ForegroundColorSpan(this.mContext.getResources().getColor(2131690316));
    paramViewGroup = new SpannableString(localTransferRecordParcel.pMf);
    paramViewGroup.setSpan(paramView, ((Integer)localPair.first).intValue(), ((Integer)localPair.second).intValue(), 18);
    localb.pMa.setUrl(localTransferRecordParcel.pLH);
    localb.pMb.setText(paramViewGroup);
    localb.pMc.setText(this.mContext.getString(2131297481, new Object[] { localTransferRecordParcel.nuL, localTransferRecordParcel.pMe }));
    AppMethodBeat.o(44506);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.model.c
 * JD-Core Version:    0.6.2
 */