package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.base.MMHorList;
import java.util.ArrayList;

public class ExdeviceProfileAffectedUserView extends LinearLayout
{
  private String igi;
  private TextView lBH;
  private MMHorList lBI;
  private ExdeviceProfileAffectedUserView.a lBJ;
  private ArrayList<String> lBK;

  public ExdeviceProfileAffectedUserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(20018);
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(2130969428, this, true);
    this.lBH = ((TextView)paramAttributeSet.findViewById(2131823675));
    this.lBI = ((MMHorList)paramAttributeSet.findViewById(2131823676));
    this.lBI.setCenterInParent(true);
    int i = a.fromDPToPix(paramContext, 44);
    this.lBI.setOverScrollEnabled(true);
    this.lBI.setItemWidth(i);
    this.lBI.setCenterInParent(true);
    this.lBJ = new ExdeviceProfileAffectedUserView.a(this, (byte)0);
    this.lBI.setAdapter(this.lBJ);
    this.lBI.setOnItemClickListener(new ExdeviceProfileAffectedUserView.1(this, paramContext));
    this.lBH.setOnClickListener(new ExdeviceProfileAffectedUserView.2(this));
    setOnClickListener(new ExdeviceProfileAffectedUserView.3(this));
    setVisibility(8);
    AppMethodBeat.o(20018);
  }

  public void setAffectedUserInfo(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(20019);
    this.lBK = paramArrayList;
    if ((this.lBK == null) || (this.lBK.size() == 0))
    {
      this.lBH.setText("");
      setVisibility(8);
      AppMethodBeat.o(20019);
    }
    while (true)
    {
      return;
      setVisibility(0);
      this.lBH.setText(getResources().getString(2131299352, new Object[] { Integer.valueOf(this.lBK.size()) }));
      this.lBJ.notifyDataSetChanged();
      AppMethodBeat.o(20019);
    }
  }

  public void setUsername(String paramString)
  {
    this.igi = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView
 * JD-Core Version:    0.6.2
 */