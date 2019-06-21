package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bv;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.ArrayList;

public class LabelPreference extends Preference
{
  public ad ldh;
  private View omq;
  public bv pCq;
  private TextView pmi;
  private TextView viw;

  public LabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public LabelPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(28070);
    super.onBindView(paramView);
    if (this.ldh == null)
    {
      paramView.setVisibility(8);
      AppMethodBeat.o(28070);
    }
    while (true)
    {
      return;
      paramView.setVisibility(0);
      if (this.pmi == null)
        this.pmi = ((TextView)paramView.findViewById(2131826655));
      if (this.viw == null)
        this.viw = ((TextView)paramView.findViewById(2131826654));
      if (this.viw != null)
      {
        paramView = this.viw.getLayoutParams();
        paramView.width = com.tencent.mm.bz.a.al(this.mContext, 2131427668);
        this.viw.setLayoutParams(paramView);
      }
      this.pmi.setVisibility(0);
      String str;
      if (com.tencent.mm.n.a.jh(this.ldh.field_type))
      {
        str = this.ldh.field_contactLabelIds;
        paramView = (ArrayList)com.tencent.mm.plugin.label.a.a.bJa().PG(str);
        if ((!bo.isNullOrNil(str)) && (paramView != null) && (paramView.size() > 0))
          this.pmi.setText(j.b(this.mContext, bo.c(paramView, this.mContext.getResources().getString(2131298411))));
        AppMethodBeat.o(28070);
      }
      else
      {
        if (this.pCq != null)
        {
          str = this.pCq.field_contactLabels;
          paramView = (ArrayList)com.tencent.mm.plugin.label.a.a.bJa().PF(str);
          if ((!bo.isNullOrNil(str)) && (paramView != null) && (paramView.size() > 0))
            this.pmi.setText(j.b(this.mContext, bo.c(paramView, this.mContext.getResources().getString(2131298411))));
        }
        AppMethodBeat.o(28070);
      }
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28069);
    if (this.omq == null)
    {
      paramViewGroup = super.onCreateView(paramViewGroup);
      ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
      localViewGroup.removeAllViews();
      LayoutInflater.from(this.mContext).inflate(2130970407, localViewGroup);
      this.omq = paramViewGroup;
    }
    paramViewGroup = this.omq;
    AppMethodBeat.o(28069);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.LabelPreference
 * JD-Core Version:    0.6.2
 */