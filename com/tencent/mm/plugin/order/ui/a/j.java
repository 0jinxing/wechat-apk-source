package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.HelpCenter;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;
import java.util.List;

public final class j extends Preference
{
  View.OnClickListener mOnClickListener;
  private View mView;
  List<MallOrderDetailObject.HelpCenter> pbM;
  String peR;
  View.OnClickListener peS;

  public j(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(43924);
    this.mView = null;
    this.mOnClickListener = null;
    this.peS = null;
    this.pbM = new LinkedList();
    setLayoutResource(2130970055);
    AppMethodBeat.o(43924);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43925);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(43925);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(43926);
    super.onBindView(paramView);
    paramView = (LinearLayout)paramView.findViewById(2131825842);
    paramView.removeAllViews();
    if (this.pbM == null)
    {
      AppMethodBeat.o(43926);
      return;
    }
    int i;
    if ((!bo.isNullOrNil(this.peR)) && (this.peS != null))
    {
      i = this.pbM.size();
      if (i != 0)
        break label453;
      i = -1;
    }
    label453: 
    while (true)
    {
      int j = 0;
      int k = 0;
      Object localObject;
      while (true)
        if (j < this.pbM.size())
        {
          localObject = (MallOrderDetailObject.HelpCenter)this.pbM.get(j);
          TextView localTextView = new TextView(this.mContext);
          localTextView.setTextColor(this.mContext.getResources().getColor(2131689761));
          localTextView.setTextSize(0, a.al(this.mContext, 2131427813));
          localTextView.setIncludeFontPadding(false);
          localTextView.setText(((MallOrderDetailObject.HelpCenter)localObject).name);
          localTextView.setTag(localObject);
          localTextView.setGravity(17);
          localTextView.setOnClickListener(this.mOnClickListener);
          if (k == i)
            localTextView.setTextColor(this.mContext.getResources().getColor(2131690135));
          paramView.addView(localTextView, new LinearLayout.LayoutParams(0, -2, 1.0F));
          if (k < i)
          {
            localObject = new View(this.mContext);
            ((View)localObject).setBackgroundColor(this.mContext.getResources().getColor(2131690464));
            paramView.addView((View)localObject, new LinearLayout.LayoutParams(a.al(this.mContext, 2131427581), -1));
          }
          k++;
          j++;
          continue;
          i = this.pbM.size() - 1;
          break;
        }
      if ((!bo.isNullOrNil(this.peR)) && (this.peS != null))
      {
        localObject = new TextView(this.mContext);
        ((TextView)localObject).setTextColor(this.mContext.getResources().getColor(2131689761));
        ((TextView)localObject).setTextSize(0, a.al(this.mContext, 2131427813));
        ((TextView)localObject).setIncludeFontPadding(false);
        ((TextView)localObject).setText(this.peR);
        ((TextView)localObject).setGravity(17);
        ((TextView)localObject).setOnClickListener(this.peS);
        if (k == i)
          ((TextView)localObject).setTextColor(this.mContext.getResources().getColor(2131690135));
        paramView.addView((View)localObject, new LinearLayout.LayoutParams(0, -2, 1.0F));
      }
      AppMethodBeat.o(43926);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.j
 * JD-Core Version:    0.6.2
 */