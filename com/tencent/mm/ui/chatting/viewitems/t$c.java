package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class t$c extends c.a
{
  LinearLayout jPr;
  List<t.a> jPu;
  TextView zbU;
  t.g zeA;
  t.f zev;
  t.h zew;
  t.e zex;
  t.i zey;
  t.d zez;

  t$c()
  {
    AppMethodBeat.i(33071);
    this.zev = new t.f();
    this.jPu = new ArrayList();
    this.zew = new t.h();
    this.zex = new t.e();
    this.zey = new t.i();
    this.zez = new t.d();
    this.zeA = new t.g();
    AppMethodBeat.o(33071);
  }

  public final c.a fd(View paramView)
  {
    AppMethodBeat.i(33072);
    LinearLayout localLinearLayout = this.jPr;
    t.a locala = new t.a();
    locala.jOR = paramView;
    locala.jOS = paramView.findViewById(2131821838);
    locala.jOT = paramView.findViewById(2131821839);
    locala.gsf = ((TextView)paramView.findViewById(2131820678));
    locala.jOV = ((TextView)paramView.findViewById(2131821841));
    locala.jOW = paramView.findViewById(2131821403);
    locala.jOX = ((ImageView)paramView.findViewById(2131821404));
    locala.jOY = ((ImageView)paramView.findViewById(2131821843));
    localLinearLayout.addView(paramView, localLinearLayout.getChildCount());
    this.jPu.add(locala);
    AppMethodBeat.o(33072);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.c
 * JD-Core Version:    0.6.2
 */