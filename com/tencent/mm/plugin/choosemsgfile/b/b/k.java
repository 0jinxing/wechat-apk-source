package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public class k extends a<n>
{
  private String edV;
  private String kuA;
  private j.b kul;
  public String kuu;
  private String kux;
  private Integer kuy;
  private String kuz;

  public k(com.tencent.mm.plugin.choosemsgfile.b.c.g paramg, bi parambi, String paramString)
  {
    super(paramg, parambi);
    this.kuu = paramString;
  }

  private String Hr()
  {
    AppMethodBeat.i(54318);
    Object localObject;
    if (this.kuA == null)
    {
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(this.kuu);
      if (localObject == null)
        break label59;
    }
    label59: for (this.kuA = ((ap)localObject).field_conRemark; ; this.kuA = "")
    {
      localObject = this.kuA;
      AppMethodBeat.o(54318);
      return localObject;
    }
  }

  private void a(n paramn)
  {
    AppMethodBeat.i(54320);
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      b(paramn);
      AppMethodBeat.o(54320);
    }
    while (true)
    {
      return;
      al.d(new k.1(this, paramn));
      AppMethodBeat.o(54320);
    }
  }

  private void b(n paramn)
  {
    AppMethodBeat.i(54321);
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
      AppMethodBeat.o(54321);
      while (true)
      {
        return;
        paramn.gtQ.setVisibility(0);
        paramn.kuH.setVisibility(8);
        paramn.kuN.setVisibility(8);
        paramn.kuR.setVisibility(8);
        paramn.kuP.setVisibility(8);
        AppMethodBeat.o(54321);
        continue;
        paramn.gtQ.setVisibility(0);
        paramn.kuH.setVisibility(0);
        paramn.kuN.setVisibility(8);
        paramn.kuR.setVisibility(8);
        paramn.kuP.setVisibility(8);
        if (this.alq <= 0)
          break;
        int i = (int)(this.Lp / this.alq * 100.0F);
        if ((i == -1) || (i >= 100))
        {
          paramn.kuH.setProgress(100);
          AppMethodBeat.o(54321);
        }
        else
        {
          paramn.kuH.setProgress(i);
          AppMethodBeat.o(54321);
          continue;
          paramn.gtQ.setVisibility(8);
          paramn.kuH.setVisibility(8);
          paramn.kuN.setVisibility(0);
          paramn.kuR.setVisibility(0);
          paramn.kuP.setVisibility(8);
          AppMethodBeat.o(54321);
          continue;
          paramn.gtQ.setVisibility(8);
          paramn.kuH.setVisibility(8);
          paramn.kuN.setVisibility(8);
          paramn.kuR.setVisibility(8);
          paramn.kuP.setVisibility(0);
          paramn.hrg.setText(bfo().toUpperCase() + " " + getContext().getString(2131298279));
          AppMethodBeat.o(54321);
          continue;
          paramn.gtQ.setVisibility(8);
          paramn.kuH.setVisibility(8);
          paramn.kuN.setVisibility(8);
          paramn.kuR.setVisibility(8);
          paramn.kuP.setVisibility(0);
          paramn.hrg.setText(bfo().toUpperCase() + " " + getContext().getString(2131298278));
          AppMethodBeat.o(54321);
        }
      }
      paramn.gtQ.setVisibility(8);
      paramn.kuH.setVisibility(8);
      paramn.kuN.setVisibility(0);
      paramn.kuR.setVisibility(0);
      paramn.kuN.setChecked(false);
      paramn.kuP.setVisibility(8);
    }
  }

  private j.b bfv()
  {
    AppMethodBeat.i(54311);
    if (this.kul == null)
      this.kul = j.b.me(this.kua.field_content);
    j.b localb = this.kul;
    AppMethodBeat.o(54311);
    return localb;
  }

  private String bfx()
  {
    AppMethodBeat.i(54317);
    Object localObject;
    if (this.kuz == null)
    {
      localObject = null;
      if (t.kH(this.kuu))
        localObject = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.kuu);
      if (localObject == null)
        break label75;
    }
    label75: for (this.kuz = ((u)localObject).mJ(getUsername()); ; this.kuz = "")
    {
      localObject = this.kuz;
      AppMethodBeat.o(54317);
      return localObject;
    }
  }

  public void a(View paramView, a parama)
  {
    AppMethodBeat.i(54319);
    if ((!bfn().gZ(this.kua.field_msgId)) && (!kq()))
      if (isEnable())
      {
        b.f(getContext(), this.kua.field_msgId);
        AppMethodBeat.o(54319);
      }
    while (true)
    {
      return;
      b.I(getContext(), bfn().mMaxCount);
      AppMethodBeat.o(54319);
    }
  }

  public String bfo()
  {
    AppMethodBeat.i(54313);
    String str;
    if (bfv() != null)
    {
      str = bfv().fgp;
      AppMethodBeat.o(54313);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(54313);
    }
  }

  public int bfp()
  {
    AppMethodBeat.i(54316);
    int i;
    if (bfv() != null)
    {
      i = bfv().fgo;
      AppMethodBeat.o(54316);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(54316);
    }
  }

  public int bfw()
  {
    AppMethodBeat.i(54314);
    if (this.kuy == null)
      this.kuy = Integer.valueOf(com.tencent.mm.plugin.fav.ui.c.LX(bfo()));
    int i = this.kuy.intValue();
    AppMethodBeat.o(54314);
    return i;
  }

  public String getFileName()
  {
    AppMethodBeat.i(54315);
    Object localObject;
    if (bfv() != null)
    {
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(this.kuu);
      if (localObject != null)
        this.kux = ((ad)localObject).Oi();
      localObject = bfv().title;
      AppMethodBeat.o(54315);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(54315);
    }
  }

  public int getType()
  {
    return 1;
  }

  public String getUsername()
  {
    AppMethodBeat.i(54312);
    if (this.edV == null)
      this.edV = b.b(this.kua, t.kH(this.kuu));
    String str = this.edV;
    AppMethodBeat.o(54312);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.k
 * JD-Core Version:    0.6.2
 */