package com.tencent.mm.plugin.websearch.widget.view.footer;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.ui.v;

public class DownArrowSwitchFooter extends LinearLayout
  implements a
{
  private Context context;
  private ImageView iPN;
  private c udB;
  private TextView uei;
  private View uej;
  private a.a uel;

  public DownArrowSwitchFooter(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(91578);
    c.a locala = new c.a();
    locala.ePH = true;
    locala.ePG = true;
    this.udB = locala.ahG();
    this.context = paramContext;
    init();
    AppMethodBeat.o(91578);
  }

  public DownArrowSwitchFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(91579);
    paramAttributeSet = new c.a();
    paramAttributeSet.ePH = true;
    paramAttributeSet.ePG = true;
    this.udB = paramAttributeSet.ahG();
    this.context = paramContext;
    init();
    AppMethodBeat.o(91579);
  }

  private void init()
  {
    AppMethodBeat.i(91580);
    ViewGroup localViewGroup = (ViewGroup)v.hu(this.context).inflate(2130971239, this);
    this.uej = localViewGroup.findViewById(2131829232);
    this.uei = ((TextView)localViewGroup.findViewById(2131829226));
    this.iPN = ((ImageView)localViewGroup.findViewById(2131829225));
    localViewGroup.setOnClickListener(new DownArrowSwitchFooter.1(this));
    AppMethodBeat.o(91580);
  }

  public void setCallback(a.a parama)
  {
    AppMethodBeat.i(91583);
    this.uel = parama;
    if (parama != null)
      if (parama.getItemCount() > 1)
      {
        this.uej.setVisibility(0);
        AppMethodBeat.o(91583);
      }
    while (true)
    {
      return;
      this.uej.setVisibility(8);
      AppMethodBeat.o(91583);
    }
  }

  public void setIcon(String paramString)
  {
    AppMethodBeat.i(91582);
    if (TextUtils.isEmpty(paramString))
    {
      this.iPN.setVisibility(8);
      AppMethodBeat.o(91582);
    }
    while (true)
    {
      return;
      this.iPN.setVisibility(0);
      com.tencent.mm.at.a.a.ahv().a(paramString, this.iPN, this.udB);
      AppMethodBeat.o(91582);
    }
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(91581);
    this.uei.setText(paramString);
    AppMethodBeat.o(91581);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.footer.DownArrowSwitchFooter
 * JD-Core Version:    0.6.2
 */