package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.os.Looper;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.choosemsgfile.b.c.g;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public abstract class d extends a<m>
{
  public d(g paramg, bi parambi)
  {
    super(paramg, parambi);
  }

  private void a(m paramm)
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      b(paramm);
    while (true)
    {
      return;
      al.d(new d.1(this, paramm));
    }
  }

  private void b(m paramm)
  {
    switch (this.kuk)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 0:
    }
    while (true)
    {
      return;
      paramm.gtQ.setVisibility(0);
      paramm.kuH.setVisibility(8);
      paramm.kuN.setVisibility(8);
      paramm.kuO.setVisibility(8);
      paramm.kuP.setVisibility(8);
      continue;
      paramm.gtQ.setVisibility(0);
      paramm.kuH.setVisibility(0);
      paramm.kuN.setVisibility(8);
      paramm.kuO.setVisibility(8);
      paramm.kuP.setVisibility(8);
      if (this.alq > 0)
      {
        int i = (int)(this.Lp / this.alq * 100.0F);
        if ((i == -1) || (i >= 100))
        {
          paramm.kuH.setProgress(100);
        }
        else
        {
          paramm.kuH.setProgress(i);
          continue;
          paramm.gtQ.setVisibility(8);
          paramm.kuH.setVisibility(8);
          paramm.kuN.setVisibility(0);
          paramm.kuO.setVisibility(0);
          paramm.kuP.setVisibility(8);
          continue;
          paramm.gtQ.setVisibility(8);
          paramm.kuH.setVisibility(8);
          paramm.kuN.setVisibility(8);
          paramm.kuO.setVisibility(8);
          paramm.kuP.setVisibility(0);
          continue;
          paramm.gtQ.setVisibility(8);
          paramm.kuH.setVisibility(8);
          paramm.kuN.setVisibility(8);
          paramm.kuO.setVisibility(8);
          paramm.kuP.setVisibility(0);
          continue;
          paramm.gtQ.setVisibility(8);
          paramm.kuH.setVisibility(8);
          paramm.kuN.setVisibility(0);
          paramm.kuO.setVisibility(0);
          paramm.kuN.setChecked(false);
          paramm.kuP.setVisibility(8);
        }
      }
    }
  }

  public void a(m paramm, int paramInt)
  {
    paramm.kuG.setTag(this);
    paramm.kuO.setTag(this);
    o.ahp().a(aan(), paramm.kuG, b.dy(getContext()));
    paramm.kuK.setVisibility(8);
    paramm.kuL.setVisibility(8);
    paramm.kuI.setVisibility(8);
    paramm.kuJ.setVisibility(8);
    paramm.kuO.setVisibility(0);
    paramm.kuN.setVisibility(0);
    a(paramm);
    if (bfn().gW(this.kua.field_msgId))
    {
      paramm.kuM.setVisibility(8);
      paramm.kuN.setChecked(true);
      if (!isEnable())
        break label163;
      paramm.kuF.setAlpha(1.0F);
    }
    while (true)
    {
      return;
      paramm.kuM.setVisibility(0);
      paramm.kuN.setChecked(false);
      break;
      label163: paramm.kuF.setAlpha(0.6F);
    }
  }

  protected String aan()
  {
    return "";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.d
 * JD-Core Version:    0.6.2
 */