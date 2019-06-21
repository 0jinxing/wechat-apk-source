package com.tencent.mm.plugin.websearch.widget.view.footer;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.ui.v;

public class BtnSwitchFooter extends LinearLayout
  implements a
{
  private Context context;
  private ImageView iPN;
  private c udB;
  private TextView uei;
  private View uej;
  private View uek;
  private a.a uel;

  public BtnSwitchFooter(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(91561);
    c.a locala = new c.a();
    locala.ePH = true;
    locala.ePG = true;
    this.udB = locala.ahG();
    this.context = paramContext;
    init();
    AppMethodBeat.o(91561);
  }

  public BtnSwitchFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(91562);
    paramAttributeSet = new c.a();
    paramAttributeSet.ePH = true;
    paramAttributeSet.ePG = true;
    this.udB = paramAttributeSet.ahG();
    this.context = paramContext;
    init();
    AppMethodBeat.o(91562);
  }

  private void init()
  {
    AppMethodBeat.i(91563);
    ViewGroup localViewGroup = (ViewGroup)v.hu(this.context).inflate(2130971237, this);
    this.uek = localViewGroup.findViewById(2131829227);
    this.uej = localViewGroup.findViewById(2131829228);
    this.uei = ((TextView)localViewGroup.findViewById(2131829226));
    this.iPN = ((ImageView)localViewGroup.findViewById(2131829225));
    this.uek.setVisibility(8);
    this.uej.setOnClickListener(new BtnSwitchFooter.1(this));
    AppMethodBeat.o(91563);
  }

  public void setCallback(a.a parama)
  {
    AppMethodBeat.i(91568);
    this.uel = parama;
    if (parama != null)
      if (parama.getItemCount() > 1)
      {
        this.uej.setVisibility(0);
        AppMethodBeat.o(91568);
      }
    while (true)
    {
      return;
      this.uej.setVisibility(8);
      AppMethodBeat.o(91568);
    }
  }

  public void setIcon(String paramString)
  {
    AppMethodBeat.i(91567);
    if (TextUtils.isEmpty(paramString))
    {
      this.iPN.setVisibility(8);
      AppMethodBeat.o(91567);
    }
    while (true)
    {
      return;
      this.iPN.setVisibility(0);
      com.tencent.mm.at.a.a.ahv().a(paramString, this.iPN, this.udB);
      AppMethodBeat.o(91567);
    }
  }

  public void setSwitchClickLsn(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(91564);
    this.uej.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(91564);
  }

  public void setSwitchVisible(int paramInt)
  {
    AppMethodBeat.i(91565);
    this.uej.setVisibility(paramInt);
    AppMethodBeat.o(91565);
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(91566);
    this.uei.setText(paramString);
    AppMethodBeat.o(91566);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.footer.BtnSwitchFooter
 * JD-Core Version:    0.6.2
 */