package com.tencent.mm.ui.widget.a;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d$b$a extends RecyclerView.v
  implements View.OnClickListener
{
  TextView gsf;
  ImageView iNr;
  TextView qZb;
  RadioButton zQF;
  ImageView zQG;
  LinearLayout zQH;

  public d$b$a(d.b paramb, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(112651);
    paramView.setOnClickListener(this);
    this.gsf = ((TextView)paramView.findViewById(2131820678));
    this.iNr = ((ImageView)paramView.findViewById(2131820915));
    this.zQH = ((LinearLayout)paramView.findViewById(2131820987));
    if ((d.x(paramb.zQE)) || (d.z(paramb.zQE)))
    {
      this.qZb = ((TextView)paramView.findViewById(2131821095));
      this.zQF = ((RadioButton)paramView.findViewById(2131820934));
      this.zQG = ((ImageView)paramView.findViewById(2131821128));
    }
    AppMethodBeat.o(112651);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112652);
    if (this.zQI.amz != null)
      this.zQI.amz.onItemClick(null, paramView, getPosition(), getPosition());
    AppMethodBeat.o(112652);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.d.b.a
 * JD-Core Version:    0.6.2
 */