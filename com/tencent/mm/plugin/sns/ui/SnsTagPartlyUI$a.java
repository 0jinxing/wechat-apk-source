package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.ui.p;

final class SnsTagPartlyUI$a extends p<t>
{
  private Context context;
  public boolean rxJ;

  public SnsTagPartlyUI$a(SnsTagPartlyUI paramSnsTagPartlyUI, Context paramContext)
  {
    super(paramContext, new t());
    AppMethodBeat.i(39381);
    this.rxJ = false;
    this.context = paramContext;
    AppMethodBeat.o(39381);
  }

  public final void KC()
  {
    AppMethodBeat.i(39383);
    setCursor(af.cnL().getCursor());
    notifyDataSetChanged();
    AppMethodBeat.o(39383);
  }

  public final void KD()
  {
    AppMethodBeat.i(39384);
    bIf();
    KC();
    AppMethodBeat.o(39384);
  }

  public final int bFs()
  {
    return 1;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(39382);
    int i;
    if (paramView == null)
    {
      paramViewGroup = new SnsTagPartlyUI.a.a(this);
      paramView = View.inflate(this.context, 2130970343, null);
      paramViewGroup.rxK = ((TextView)paramView.findViewById(2131826454));
      paramViewGroup.rxL = ((TextView)paramView.findViewById(2131826455));
      paramViewGroup.gzI = ((Button)paramView.findViewById(2131822772));
      paramView.setTag(paramViewGroup);
      if (wK(paramInt))
        break label229;
      Object localObject = (t)getItem(paramInt);
      paramViewGroup.rxK.setText(((t)localObject).field_tagName);
      paramViewGroup.rxL.setVisibility(0);
      paramViewGroup.rxL.setText(" (" + ((t)localObject).field_count + ") ");
      localObject = paramViewGroup.gzI;
      if (!this.rxJ)
        break label222;
      i = 0;
      label172: ((Button)localObject).setVisibility(i);
      paramViewGroup.gzI.setOnClickListener(SnsTagPartlyUI.b(this.rxH));
      paramViewGroup.gzI.setTag(Integer.valueOf(paramInt));
    }
    while (true)
    {
      AppMethodBeat.o(39382);
      return paramView;
      paramViewGroup = (SnsTagPartlyUI.a.a)paramView.getTag();
      break;
      label222: i = 8;
      break label172;
      label229: paramViewGroup.rxK.setText(2131303990);
      paramViewGroup.rxL.setVisibility(8);
      paramViewGroup.gzI.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.a
 * JD-Core Version:    0.6.2
 */