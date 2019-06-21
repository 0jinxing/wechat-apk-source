package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import java.util.List;

final class s$3
  implements n.d
{
  s$3(s params, com.tencent.mm.plugin.sns.storage.n paramn, bau parambau, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(38253);
    paramInt = paramMenuItem.getItemId();
    ab.d("MicroMsg.GalleryTitleManager", "showAlertWithDel ".concat(String.valueOf(paramInt)));
    switch (paramInt)
    {
    case 0:
    case 4:
    default:
    case 6:
    case 8:
    case 5:
    case 1:
    case 2:
    case 3:
    case 7:
    case -1:
    }
    while (true)
    {
      AppMethodBeat.o(38253);
      while (true)
      {
        return;
        if ((this.rjt == null) || (this.rjt.cqu().xfI == null))
          break;
        s.a(this.rjs, this.rjt, this.qIs);
        AppMethodBeat.o(38253);
        continue;
        s.a(this.rjs, this.rjt, this.qIs, this.sN);
        AppMethodBeat.o(38253);
        continue;
        Object localObject1 = this.rjs;
        paramMenuItem = new r(this.rjt.field_snsId, 3);
        g.RQ();
        g.RO().eJo.a(paramMenuItem, 0);
        Object localObject2 = ((s)localObject1).context;
        ((s)localObject1).context.getString(2131297061);
        ((s)localObject1).tipDialog = h.b((Context)localObject2, ((s)localObject1).context.getString(2131303764), true, new s.9((s)localObject1, paramMenuItem));
        AppMethodBeat.o(38253);
        continue;
        paramMenuItem = this.rjs;
        localObject1 = this.rjt;
        if ((((com.tencent.mm.plugin.sns.storage.n)localObject1).cqV()) || (((com.tencent.mm.plugin.sns.storage.n)localObject1).cqW()))
        {
          af.cnF().DL(((com.tencent.mm.plugin.sns.storage.n)localObject1).reX);
          AppMethodBeat.o(38253);
        }
        else
        {
          localObject2 = new r(((com.tencent.mm.plugin.sns.storage.n)localObject1).field_snsId, 2);
          g.RQ();
          g.RO().eJo.a((m)localObject2, 0);
          localObject1 = paramMenuItem.context;
          paramMenuItem.context.getString(2131297061);
          paramMenuItem.tipDialog = h.b((Context)localObject1, paramMenuItem.context.getString(2131303764), true, new s.8(paramMenuItem, (r)localObject2));
          AppMethodBeat.o(38253);
          continue;
          if ((this.rjt == null) || (this.rjt.cqu().xfI == null))
            break;
          if (this.rjt.field_type != 15)
          {
            com.tencent.mm.pluginsdk.ui.tools.n.j(an.fZ(af.getAccSnsPath(), this.qIs.Id) + i.l(this.qIs), this.rjs.context);
            AppMethodBeat.o(38253);
          }
          else
          {
            s.Zx(this.rjt.cqU());
            AppMethodBeat.o(38253);
            continue;
            if ((this.rjt == null) || (this.rjt.cqu().xfI == null))
              break;
            if (this.rjt.cqu().xfI.wbJ == 1)
            {
              paramMenuItem = an.fZ(af.getAccSnsPath(), this.qIs.Id) + i.l(this.qIs);
              this.rjs.Zw(paramMenuItem);
              AppMethodBeat.o(38253);
            }
            else
            {
              s.Zy(this.rjt.cqU());
              AppMethodBeat.o(38253);
              continue;
              paramMenuItem = new Bundle();
              paramMenuItem.putString("stat_msg_id", "sns_" + i.jV(this.rjt.field_snsId));
              paramMenuItem.putString("stat_send_msg_user", this.rjt.field_userName);
              paramMenuItem.putInt("stat_scene", 3);
              s.a(this.rjs, paramMenuItem);
              AppMethodBeat.o(38253);
              continue;
              if (this.rjt.cqu().xfI.wbK.size() <= 1)
                break label723;
              h.a(this.rjs.context, this.rjs.context.getString(2131303741), "", new s.3.1(this), null);
              AppMethodBeat.o(38253);
            }
          }
        }
      }
      label723: h.a(this.rjs.context, this.rjs.context.getString(2131303739), "", new s.3.2(this), null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.s.3
 * JD-Core Version:    0.6.2
 */