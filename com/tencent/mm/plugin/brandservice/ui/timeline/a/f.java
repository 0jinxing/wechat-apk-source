package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import java.util.ArrayList;
import java.util.List;

public final class f extends e
{
  public LinearLayout jOP;
  public LinearLayout jOQ;
  public l jPA;
  public View.OnClickListener jPB;
  public LinearLayout jPr;
  public LinearLayout jPs;
  public TextView jPt;
  public List<b> jPu;
  public k jPv;
  public m jPw;
  public j jPx;
  public n jPy;
  public i jPz;

  public f()
  {
    AppMethodBeat.i(14259);
    this.jPu = new ArrayList();
    this.jPv = new k();
    this.jPw = new m();
    this.jPx = new j();
    this.jPy = new n();
    this.jPz = new i();
    this.jPA = new l();
    this.jPB = new f.1(this);
    AppMethodBeat.o(14259);
  }

  public static void O(View paramView, int paramInt)
  {
    AppMethodBeat.i(14263);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    localLayoutParams.rightMargin = paramInt;
    paramView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(14263);
  }

  private void a(View paramView, c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(14260);
    if (paramBoolean)
    {
      if (paramc.jOR == null)
        paramc.a(paramView, this.jPm);
      if (paramc.jOR == null)
        break label64;
      paramc.jOR.setVisibility(0);
      AppMethodBeat.o(14260);
    }
    while (true)
    {
      return;
      if (paramc.jOR != null)
        paramc.jOR.setVisibility(8);
      label64: AppMethodBeat.o(14260);
    }
  }

  public static void r(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14262);
    paramView.setPadding(0, paramInt1 - a.jNk, 0, paramInt2 - a.jNk);
    AppMethodBeat.o(14262);
  }

  public final void a(f paramf, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    AppMethodBeat.i(14261);
    boolean bool2;
    if (paramInt1 == 5)
    {
      bool2 = true;
      a(paramf.jPr, paramf.jPw, bool2);
      if (!bool2)
        break label247;
    }
    label48: label79: label110: label244: label247: for (int i = 1; ; i = 0)
    {
      if (paramInt1 == 8)
      {
        bool2 = true;
        a(paramf.jPr, paramf.jPx, bool2);
        if (bool2)
          i = 1;
        if (paramInt1 != 7)
          break label220;
        bool2 = true;
        a(paramf.jPr, paramf.jPy, bool2);
        if (bool2)
          i = 1;
        if (paramInt1 != 6)
          break label226;
        bool2 = true;
        a(paramf.jPr, paramf.jPz, bool2);
        if (bool2)
          i = 1;
        if (paramInt1 != 10)
          break label232;
        bool2 = true;
        a(paramf.jPr, paramf.jPA, bool2);
        if (!bool2)
          break label244;
        i = 1;
      }
      while (true)
      {
        LinearLayout localLinearLayout = paramf.jPr;
        paramf = paramf.jPv;
        if ((i == 0) && (paramInt2 > 0) && (paramInt1 != -1));
        for (bool2 = bool1; ; bool2 = false)
        {
          a(localLinearLayout, paramf, bool2);
          AppMethodBeat.o(14261);
          return;
          bool2 = false;
          break;
          bool2 = false;
          break label48;
          bool2 = false;
          break label79;
          bool2 = false;
          break label110;
          bool2 = false;
          break label141;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.f
 * JD-Core Version:    0.6.2
 */