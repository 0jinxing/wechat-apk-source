package com.tencent.mm.plugin.account.bind.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.n;
import com.tencent.mm.plugin.account.friend.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.p;

public final class a extends p<n>
{
  private String gqn;
  a.a gsZ;
  private Context mContext;
  private String mFilter;
  private LayoutInflater mLayoutInflater;

  public a(Context paramContext, String paramString)
  {
    super(paramContext, new n());
    AppMethodBeat.i(13644);
    this.gqn = paramString;
    this.mContext = paramContext;
    this.mLayoutInflater = LayoutInflater.from(this.mContext);
    AppMethodBeat.o(13644);
  }

  public final void KC()
  {
    AppMethodBeat.i(13646);
    setCursor(((o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).bi(this.mFilter, this.gqn));
    super.notifyDataSetChanged();
    AppMethodBeat.o(13646);
  }

  public final void KD()
  {
    AppMethodBeat.i(13645);
    KC();
    AppMethodBeat.o(13645);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(13648);
    n localn;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = this.mLayoutInflater.inflate(2130969798, null);
      paramViewGroup = new a.b(this, paramView);
      paramView.setTag(paramViewGroup);
      localn = (n)getItem(paramInt);
      if (localn != null)
        break label77;
      AppMethodBeat.o(13648);
    }
    while (true)
    {
      return paramView;
      paramViewGroup = (a.b)paramView.getTag();
      break;
      label77: paramViewGroup.position = paramInt;
      paramViewGroup.gta = localn.field_googlegmail;
      switch (localn.field_status)
      {
      default:
        if (!TextUtils.isEmpty(localn.field_googlename))
          break label335;
        paramViewGroup.gtb.setText(bo.anu(localn.field_googlegmail));
        label150: switch (localn.field_status)
        {
        default:
          label180: switch (localn.field_googlecgistatus)
          {
          default:
            label212: paramViewGroup.gtc.setText(localn.field_googlegmail);
            AppMethodBeat.o(13648);
          case 0:
          case 1:
          case 2:
          }
          break;
        case 0:
        case 1:
        case 2:
        }
        break;
      case 0:
      case 2:
      case 1:
      }
    }
    if (localn.field_small_url != null);
    for (Bitmap localBitmap = b.a(localn.field_username, false, -1); ; localBitmap = null)
    {
      if (localBitmap == null)
      {
        paramViewGroup.eks.setImageDrawable(com.tencent.mm.bz.a.g(this.mContext, 2131231172));
        break;
      }
      paramViewGroup.eks.setImageBitmap(localBitmap);
      break;
      localBitmap = b.pP(localn.field_googleid);
      if (localBitmap == null)
      {
        paramViewGroup.eks.setImageDrawable(com.tencent.mm.bz.a.g(this.mContext, 2131231172));
        break;
      }
      paramViewGroup.eks.setImageBitmap(localBitmap);
      break;
      label335: paramViewGroup.gtb.setText(localn.field_googlename);
      break label150;
      paramViewGroup.gtd.setClickable(true);
      paramViewGroup.gtd.setBackgroundResource(2130838000);
      paramViewGroup.gnh.setText(2131300362);
      paramViewGroup.gnh.setTextColor(this.mContext.getResources().getColor(2131690691));
      break label180;
      paramViewGroup.gtd.setClickable(true);
      paramViewGroup.gtd.setBackgroundResource(2130838002);
      paramViewGroup.gnh.setText(2131300370);
      paramViewGroup.gnh.setTextColor(this.mContext.getResources().getColor(2131690205));
      break label180;
      paramViewGroup.gtd.setClickable(false);
      paramViewGroup.gtd.setBackgroundDrawable(null);
      paramViewGroup.gnh.setText(2131300364);
      paramViewGroup.gnh.setTextColor(this.mContext.getResources().getColor(2131690205));
      break label180;
      paramViewGroup.gnh.setVisibility(4);
      paramViewGroup.gte.setVisibility(0);
      break label212;
      paramViewGroup.gtd.setClickable(false);
      paramViewGroup.gtd.setBackgroundDrawable(null);
      paramViewGroup.gnh.setVisibility(0);
      paramViewGroup.gte.setVisibility(8);
      paramViewGroup.gnh.setTextColor(this.mContext.getResources().getColor(2131690205));
      switch (localn.field_status)
      {
      default:
        break;
      case 0:
        paramViewGroup.gnh.setText(2131300363);
        break;
      case 1:
        paramViewGroup.gnh.setText(2131300371);
        break;
        paramViewGroup.gnh.setVisibility(0);
        paramViewGroup.gte.setVisibility(8);
        switch (localn.field_status)
        {
        default:
          break;
        case 0:
          paramViewGroup.gnh.setText(2131300362);
          paramViewGroup.gnh.setTextColor(this.mContext.getResources().getColor(2131690691));
          break;
        case 1:
          paramViewGroup.gnh.setText(2131300370);
          paramViewGroup.gnh.setTextColor(this.mContext.getResources().getColor(2131690205));
          break;
        }
        break;
      }
    }
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(13647);
    this.mFilter = bo.vA(paramString);
    bIf();
    KC();
    AppMethodBeat.o(13647);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.a
 * JD-Core Version:    0.6.2
 */