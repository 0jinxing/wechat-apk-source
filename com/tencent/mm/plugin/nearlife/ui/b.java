package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.Spannable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.protocal.protobuf.axw;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.imageview.WeImageView;
import java.util.HashMap;

public final class b extends a
{
  private String color;
  private boolean oRU;
  com.tencent.mm.plugin.nearlife.b.a oSb;
  private com.tencent.mm.plugin.nearlife.b.a oSc;
  String oSd;
  private HashMap<String, Integer> oSe;

  public b(Context paramContext, View.OnClickListener paramOnClickListener, String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    super(paramContext, paramOnClickListener, paramString1, paramBoolean2);
    AppMethodBeat.i(22949);
    this.oSe = new HashMap();
    this.oRU = true;
    this.oSc = new com.tencent.mm.plugin.nearlife.b.a("", new axw());
    this.oSc.oQU = "NotCheckIn";
    this.oSc.Title = paramContext.getString(2131301610);
    this.oRU = paramBoolean1;
    this.color = paramString2;
    this.oSe.put(this.oSc.oQU, Integer.valueOf(2));
    if ((!paramBoolean2) && (paramBoolean1))
    {
      a(this.oSc, 0);
      notifyDataSetChanged();
    }
    AppMethodBeat.o(22949);
  }

  private Spannable Qc(String paramString)
  {
    AppMethodBeat.i(22952);
    paramString = f.a(paramString, this.oRh);
    AppMethodBeat.o(22952);
    return paramString;
  }

  public final com.tencent.mm.plugin.nearlife.b.a fs(String paramString1, String paramString2)
  {
    int i = 1;
    AppMethodBeat.i(22950);
    com.tencent.mm.plugin.nearlife.b.a locala;
    if (this.oSb == null)
    {
      this.oSb = new com.tencent.mm.plugin.nearlife.b.a("", new axw());
      this.oSb.oQU = "City";
      this.oSe.put(this.oSb.oQU, Integer.valueOf(1));
      locala = this.oSb;
      if (!this.oRU)
        break label116;
    }
    while (true)
    {
      a(locala, i);
      this.oSb.Title = paramString1;
      this.oSb.nQB = paramString2;
      notifyDataSetChanged();
      paramString1 = this.oSb;
      AppMethodBeat.o(22950);
      return paramString1;
      label116: i = 0;
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22951);
    com.tencent.mm.plugin.nearlife.b.a locala;
    if (paramView == null)
    {
      paramViewGroup = new b.a(this);
      paramView = View.inflate(this.mContext, 2130970284, null);
      paramViewGroup.gne = ((TextView)paramView.findViewById(2131826277));
      paramViewGroup.nDW = ((TextView)paramView.findViewById(2131826289));
      paramViewGroup.hrg = ((TextView)paramView.findViewById(2131826290));
      paramViewGroup.oSg = ((LinearLayout)paramView.findViewById(2131826013));
      paramViewGroup.oSh = ((WeImageView)paramView.findViewById(2131826291));
      if (this.color != null)
        paramViewGroup.oSh.setIconColor(Color.parseColor(this.color));
      paramViewGroup.oSg.setOnClickListener(this.mjE);
      paramView.setTag(paramViewGroup);
      locala = Ad(paramInt);
      if (!this.oSe.containsKey(locala.oQU))
        break label481;
    }
    label256: label481: for (int i = ((Integer)this.oSe.get(locala.oQU)).intValue(); ; i = 0)
    {
      paramViewGroup.oSh.setVisibility(8);
      paramViewGroup.type = i;
      paramViewGroup.oSf = locala;
      if ((!bo.isNullOrNil(this.oSd)) && (this.oSd.equals(locala.oQU)))
        paramViewGroup.oSh.setVisibility(0);
      switch (i)
      {
      default:
        paramViewGroup.position = paramInt;
        paramViewGroup.oQU = locala.oQU;
        if (this.oRm)
        {
          paramViewGroup.gne.setText(Qc(locala.Title));
          paramViewGroup.hrg.setText(Qc(cs(locala.oQZ)));
        }
        break;
      case 1:
      case 2:
      case 0:
      }
      while (true)
      {
        paramViewGroup.nDW.setVisibility(8);
        AppMethodBeat.o(22951);
        return paramView;
        paramViewGroup = (b.a)paramView.getTag();
        break;
        paramViewGroup.gne.setTextColor(this.mContext.getResources().getColor(2131689761));
        paramViewGroup.hrg.setVisibility(8);
        break label256;
        paramViewGroup.hrg.setVisibility(8);
        paramViewGroup.gne.setTextColor(this.mContext.getResources().getColor(2131690481));
        if (!bo.isNullOrNil(this.oSd))
          break label256;
        paramViewGroup.oSh.setVisibility(0);
        break label256;
        paramViewGroup.gne.setTextColor(this.mContext.getResources().getColor(2131689761));
        paramViewGroup.hrg.setVisibility(0);
        break label256;
        paramViewGroup.gne.setText(locala.Title);
        paramViewGroup.hrg.setText(cs(locala.oQZ));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.b
 * JD-Core Version:    0.6.2
 */