package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.a.b;
import com.tencent.mm.plugin.fav.ui.d.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.List;

final class FavSearchUI$11
  implements AdapterView.OnItemClickListener
{
  FavSearchUI$11(FavSearchUI paramFavSearchUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, final int paramInt, long paramLong)
  {
    AppMethodBeat.i(74083);
    final a.b localb = (a.b)paramView.getTag();
    if ((localb != null) && (localb.mgf != null))
    {
      this.mjo.mjm.mjz = true;
      FavSearchUI.a(this.mjo, paramInt, localb.mgf.field_id);
    }
    if (1 == FavSearchUI.i(this.mjo))
      if (localb == null)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavSearchUI", "on item click, holder is null");
        AppMethodBeat.o(74083);
      }
    while (true)
    {
      return;
      if (localb.mgf == null)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavSearchUI", "on item click, info is null");
        AppMethodBeat.o(74083);
      }
      else
      {
        ((com.tencent.mm.plugin.fav.a.ab)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.fav.a.ab.class)).a(this.mjo.mController.ylL, FavSearchUI.j(this.mjo), localb.mgf, false, new FavSearchUI.11.1(this, localb));
        AppMethodBeat.o(74083);
        continue;
        if (2 == FavSearchUI.i(this.mjo))
        {
          if (localb == null)
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavSearchUI", "on item click, holder is null");
            AppMethodBeat.o(74083);
          }
          else if (localb.mgf == null)
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavSearchUI", "on item click, info is null");
            AppMethodBeat.o(74083);
          }
          else
          {
            paramAdapterView = new Intent();
            paramAdapterView.putExtra("key_fav_result_local_id", localb.mgf.field_localId);
            this.mjo.setResult(-1, paramAdapterView);
            this.mjo.finish();
            AppMethodBeat.o(74083);
          }
        }
        else
        {
          FavSearchUI.g(this.mjo).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
          if (localb.mgf != null)
            com.tencent.mm.kernel.g.RS().aa(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(74082);
                com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.FavSearchUI", "type %s", new Object[] { Integer.valueOf(localb.mgf.field_type) });
                long l = localb.mgf.field_localId;
                if (FavSearchUI.k(FavSearchUI.11.this.mjo).size() == 0)
                  FavSearchUI.a(FavSearchUI.11.this.mjo, ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().bvb());
                if (FavSearchUI.k(FavSearchUI.11.this.mjo).size() != 0)
                {
                  localObject = FavSearchUI.k(FavSearchUI.11.this.mjo).iterator();
                  for (i = 1; ; i++)
                  {
                    j = i;
                    if (!((Iterator)localObject).hasNext())
                      break;
                    j = i;
                    if (((Long)((Iterator)localObject).next()).longValue() == l)
                      break;
                  }
                }
                int j = 1;
                Object localObject = h.pYm;
                int i = localb.mgf.field_type;
                int k = FavSearchUI.l(FavSearchUI.11.this.mjo);
                if (FavSearchUI.k(FavSearchUI.11.this.mjo).size() == 0)
                  j = paramInt;
                ((h)localObject).e(12746, new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j) });
                AppMethodBeat.o(74082);
              }
            });
          AppMethodBeat.o(74083);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.11
 * JD-Core Version:    0.6.2
 */