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

public class DirectionSwitchFooter extends LinearLayout
  implements a
{
  private Context context;
  private ImageView iPN;
  private c udB;
  private TextView uei;
  private a.a uel;
  private View uen;
  private View ueo;
  private View uep;
  private View ueq;

  public DirectionSwitchFooter(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(91571);
    c.a locala = new c.a();
    locala.ePH = true;
    locala.ePG = true;
    this.udB = locala.ahG();
    this.context = paramContext;
    init();
    AppMethodBeat.o(91571);
  }

  public DirectionSwitchFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(91572);
    paramAttributeSet = new c.a();
    paramAttributeSet.ePH = true;
    paramAttributeSet.ePG = true;
    this.udB = paramAttributeSet.ahG();
    this.context = paramContext;
    init();
    AppMethodBeat.o(91572);
  }

  private void init()
  {
    AppMethodBeat.i(91573);
    ViewGroup localViewGroup = (ViewGroup)v.hu(this.context).inflate(2130971238, this);
    this.uei = ((TextView)localViewGroup.findViewById(2131829226));
    this.iPN = ((ImageView)localViewGroup.findViewById(2131829225));
    this.uen = localViewGroup.findViewById(2131829230);
    this.ueo = localViewGroup.findViewById(2131821517);
    this.uep = localViewGroup.findViewById(2131829229);
    this.ueq = localViewGroup.findViewById(2131829231);
    this.uep.setOnClickListener(new DirectionSwitchFooter.1(this));
    this.ueq.setOnClickListener(new DirectionSwitchFooter.2(this));
    AppMethodBeat.o(91573);
  }

  public void setCallback(a.a parama)
  {
    AppMethodBeat.i(91576);
    this.uel = parama;
    if (parama != null)
    {
      if (parama.getItemCount() == 1)
      {
        this.uep.setVisibility(8);
        this.ueq.setVisibility(8);
      }
      if (this.uel != null)
        if (!this.uel.hasNext())
        {
          this.ueq.setEnabled(false);
          this.ueo.setEnabled(false);
          if (this.uel.hasPrevious())
            break label130;
          this.uen.setEnabled(false);
          this.uep.setEnabled(false);
          AppMethodBeat.o(91576);
        }
    }
    while (true)
    {
      return;
      this.ueo.setEnabled(true);
      this.ueq.setEnabled(true);
      break;
      label130: this.uep.setEnabled(true);
      this.uen.setEnabled(true);
      AppMethodBeat.o(91576);
    }
  }

  public void setIcon(String paramString)
  {
    AppMethodBeat.i(91575);
    if (TextUtils.isEmpty(paramString))
    {
      this.iPN.setVisibility(8);
      AppMethodBeat.o(91575);
    }
    while (true)
    {
      return;
      this.iPN.setVisibility(0);
      com.tencent.mm.at.a.a.ahv().a(paramString, this.iPN, this.udB);
      AppMethodBeat.o(91575);
    }
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(91574);
    this.uei.setText(paramString);
    AppMethodBeat.o(91574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.footer.DirectionSwitchFooter
 * JD-Core Version:    0.6.2
 */