package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.wenote.model.a.q;
import com.tencent.mm.plugin.wenote.model.c;
import com.tencent.mm.plugin.wenote.model.d;
import com.tencent.mm.plugin.wenote.model.f;
import com.tencent.mm.plugin.wenote.model.g;
import com.tencent.mm.plugin.wenote.model.j;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

public final class b extends com.tencent.mm.pluginsdk.ui.b.b
{
  private TextView gne;
  private View jyC;
  private View jyD;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(27113);
    this.gne = null;
    if (this.view != null)
    {
      this.gne = ((TextView)this.view.findViewById(2131829219));
      this.jyC = this.view.findViewById(2131829218);
      this.jyD = this.view.findViewById(2131821629);
      this.gne.setTextSize(0, a.al(this.gne.getContext(), 2131427762));
      this.view.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(27112);
          ab.i("WNNoteBanner", "click WNNoteBanner");
          paramAnonymousView = com.tencent.mm.plugin.wenote.model.nativenote.manager.h.deH().deI();
          if (paramAnonymousView == null)
          {
            ab.i("WNNoteBanner", "keepTopItem is null");
            b.this.setVisibility(8);
            AppMethodBeat.o(27112);
          }
          while (true)
          {
            return;
            if (paramAnonymousView.uOr)
            {
              if (paramAnonymousView.mgQ)
                com.tencent.mm.plugin.report.service.h.pYm.e(14789, new Object[] { Integer.valueOf(3) });
              while (true)
              {
                ab.i("WNNoteBanner", "isOpenFromSession: true");
                localObject1 = new j();
                c.ddG().uMN = ((d)localObject1);
                localObject2 = new abh();
                ((abh)localObject2).scene = 8;
                ((j)localObject1).a(paramAnonymousView.uOv, Long.valueOf(paramAnonymousView.uOt), true, (Context)b.this.vlu.get(), paramAnonymousView.uOw, paramAnonymousView.uOx, (abh)localObject2);
                AppMethodBeat.o(27112);
                break;
                com.tencent.mm.plugin.report.service.h.pYm.e(14789, new Object[] { Integer.valueOf(2) });
              }
            }
            com.tencent.mm.plugin.report.service.h.pYm.e(14789, new Object[] { Integer.valueOf(1) });
            ab.i("WNNoteBanner", "isOpenFromSession: false");
            Object localObject2 = new g();
            c.ddG().uMN = ((d)localObject2);
            Object localObject1 = new abh();
            ((abh)localObject1).scene = 8;
            ((g)localObject2).a(paramAnonymousView.uOs, (Context)b.this.vlu.get(), Boolean.TRUE, paramAnonymousView.uOw, paramAnonymousView.uOx, (abh)localObject1, null);
            AppMethodBeat.o(27112);
          }
        }
      });
    }
    AppMethodBeat.o(27113);
  }

  public final boolean aMN()
  {
    boolean bool = true;
    AppMethodBeat.i(27115);
    Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.h.deH().deI();
    int i;
    if ((this.nfA) && (this.eVH))
    {
      this.jyD.setBackgroundResource(2130840456);
      this.jyC.setBackground(null);
      this.gne.setBackground(null);
      if ((localObject == null) || (!((q)localObject).uOr) || (((q)localObject).uOt <= 0L) || (bo.isNullOrNil(((q)localObject).uOv)))
        break label225;
      i = 1;
    }
    while (true)
    {
      label86: if (i != 0)
      {
        localObject = ((q)localObject).uOu;
        if (this.gne != null)
          this.gne.setText((CharSequence)localObject);
        setVisibility(0);
        AppMethodBeat.o(27115);
      }
      while (true)
      {
        return bool;
        if (this.nfA)
        {
          this.jyD.setBackgroundResource(2130839165);
          this.jyC.setBackgroundResource(2130839164);
          this.gne.setBackgroundResource(2130839162);
          break;
        }
        if (this.eVH)
        {
          this.jyD.setBackgroundResource(2130839165);
          this.jyC.setBackgroundResource(2130839162);
          this.gne.setBackground(null);
          break;
        }
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackground(null);
        this.gne.setBackgroundResource(2130839162);
        break;
        label225: if ((localObject == null) || (((q)localObject).uOr) || (f.jD(((q)localObject).uOs) == null))
          break label279;
        i = 1;
        break label86;
        if (localObject != null)
          com.tencent.mm.plugin.wenote.model.nativenote.manager.h.deH().a(null);
        setVisibility(8);
        AppMethodBeat.o(27115);
        bool = false;
      }
      label279: i = 0;
    }
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return 2130971230;
  }

  public final int getOrder()
  {
    return 0;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(27114);
    if (this.view != null)
      this.view.findViewById(2131829218).setVisibility(paramInt);
    AppMethodBeat.o(27114);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b
 * JD-Core Version:    0.6.2
 */