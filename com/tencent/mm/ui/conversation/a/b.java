package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.h.a.a;
import com.tencent.mm.ui.p;
import java.util.ArrayList;

public final class b extends p<c>
{
  private ArrayList<c> gHf;
  a zvR;

  public b(Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(34636);
    this.gHf = new ArrayList();
    this.zvR = null;
    KD();
    AppMethodBeat.o(34636);
  }

  public final void KC()
  {
    AppMethodBeat.i(34638);
    this.gHf.clear();
    if (this.zvR == null)
      AppMethodBeat.o(34638);
    while (true)
    {
      return;
      c localc = new c(this.zvR);
      this.gHf.add(localc);
      notifyDataSetChanged();
      AppMethodBeat.o(34638);
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(34637);
    KC();
    AppMethodBeat.o(34637);
  }

  public final c Pz(int paramInt)
  {
    AppMethodBeat.i(34640);
    c localc = (c)this.gHf.get(paramInt);
    AppMethodBeat.o(34640);
    return localc;
  }

  public final int getCount()
  {
    AppMethodBeat.i(34639);
    int i = this.gHf.size();
    AppMethodBeat.o(34639);
    return i;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(34641);
    c localc = (c)this.gHf.get(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130968644, null);
      paramViewGroup = new d();
      paramViewGroup.zvT = paramView;
      paramViewGroup.zvU = ((Button)paramView.findViewById(2131821093));
      paramView.setTag(paramViewGroup);
      if (localc.a(paramViewGroup) == 0)
        break label93;
      AppMethodBeat.o(34641);
      paramView = null;
    }
    while (true)
    {
      return paramView;
      paramViewGroup = (d)paramView.getTag();
      break;
      label93: AppMethodBeat.o(34641);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.b
 * JD-Core Version:    0.6.2
 */