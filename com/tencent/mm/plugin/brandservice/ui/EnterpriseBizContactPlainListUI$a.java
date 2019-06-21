package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.bz.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.lk;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.applet.b;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.p;

final class EnterpriseBizContactPlainListUI$a extends p<lk>
  implements n.b
{
  b gvm;
  private b.b gvn;

  public EnterpriseBizContactPlainListUI$a(EnterpriseBizContactPlainListUI paramEnterpriseBizContactPlainListUI, Context paramContext)
  {
    super(paramContext, new lk());
    AppMethodBeat.i(13990);
    this.gvn = null;
    this.gvm = new b(new EnterpriseBizContactPlainListUI.a.1(this));
    KC();
    AppMethodBeat.o(13990);
  }

  public final void KC()
  {
    AppMethodBeat.i(13994);
    if (!g.RK())
    {
      ab.e("MicroMsg.EnterpriseBizListAdapter", "accHasReady");
      AppMethodBeat.o(13994);
      return;
    }
    bIf();
    Object localObject1 = null;
    Object localObject2;
    switch (EnterpriseBizContactPlainListUI.b(this.jMl))
    {
    default:
      z.aeR();
      localObject2 = e.F(EnterpriseBizContactPlainListUI.c(this.jMl), true);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      setCursor((Cursor)localObject2);
      AppMethodBeat.o(13994);
      break;
      z.aeR();
      localObject2 = e.V(EnterpriseBizContactPlainListUI.c(this.jMl), 25);
      continue;
      z.aeR();
      localObject2 = e.qR(EnterpriseBizContactPlainListUI.c(this.jMl));
      continue;
      z.aeR();
      localObject2 = e.V(EnterpriseBizContactPlainListUI.c(this.jMl), 128);
      continue;
      d locald = f.qX(EnterpriseBizContactPlainListUI.c(this.jMl));
      localObject2 = localObject1;
      if (locald != null)
      {
        localObject2 = localObject1;
        if (locald.field_enterpriseFather != null)
          localObject2 = z.aeR().qQ(locald.field_enterpriseFather);
      }
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(138508);
    KC();
    AppMethodBeat.o(138508);
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(13991);
    ab.i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange");
    al.d(new EnterpriseBizContactPlainListUI.a.2(this));
    AppMethodBeat.o(13991);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(13992);
    if (this.gvn == null)
      this.gvn = new b.b()
      {
        public final int apO()
        {
          AppMethodBeat.i(13988);
          int i = EnterpriseBizContactPlainListUI.a.this.getCount();
          AppMethodBeat.o(13988);
          return i;
        }

        public final String mW(int paramAnonymousInt)
        {
          AppMethodBeat.i(13987);
          Object localObject;
          if ((paramAnonymousInt < 0) || (paramAnonymousInt >= EnterpriseBizContactPlainListUI.a.this.getCount()))
          {
            ab.e("MicroMsg.EnterpriseBizListAdapter", "pos is invalid");
            AppMethodBeat.o(13987);
            localObject = null;
          }
          while (true)
          {
            return localObject;
            localObject = (lk)EnterpriseBizContactPlainListUI.a.this.getItem(paramAnonymousInt);
            if (localObject == null)
            {
              AppMethodBeat.o(13987);
              localObject = null;
            }
            else
            {
              localObject = ((lk)localObject).userName;
              AppMethodBeat.o(13987);
            }
          }
        }
      };
    if (this.gvm != null)
      this.gvm.a(paramInt, this.gvn);
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = View.inflate(this.context, 2130969394, null);
      paramViewGroup.gvq = ((ImageView)paramView.findViewById(2131823615));
      paramViewGroup.gtG = ((TextView)paramView.findViewById(2131823616));
      paramView.setTag(paramViewGroup);
    }
    lk locallk;
    while (true)
    {
      locallk = (lk)getItem(paramInt);
      if (locallk != null)
        break;
      paramViewGroup.clear();
      AppMethodBeat.o(13992);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
    paramViewGroup.clear();
    int i = paramView.getPaddingBottom();
    paramInt = paramView.getPaddingTop();
    int j = paramView.getPaddingRight();
    int k = paramView.getPaddingLeft();
    paramView.setBackgroundDrawable(a.g(this.context, 2130838396));
    paramView.setPadding(k, paramInt, j, i);
    String str = bo.nullAsNil(locallk.ehM.Oi());
    paramViewGroup.gtG.setText(j.b(this.context, str, paramViewGroup.gtG.getTextSize()));
    paramViewGroup.gtG.setVisibility(0);
    paramViewGroup.gvq.setVisibility(0);
    if (!bo.isNullOrNil(locallk.ehM.field_username))
      a.b.b(paramViewGroup.gvq, locallk.ehM.field_username);
    while (true)
    {
      AppMethodBeat.o(13992);
      break;
      paramViewGroup.gvq.setImageDrawable(null);
    }
  }

  final class a
  {
    TextView gtG;
    ImageView gvq;

    a()
    {
    }

    public final void clear()
    {
      AppMethodBeat.i(13989);
      if (this.gvq != null)
      {
        this.gvq.setImageDrawable(null);
        this.gvq.setVisibility(8);
      }
      if (this.gtG != null)
      {
        this.gtG.setText("");
        this.gtG.setVisibility(8);
      }
      AppMethodBeat.o(13989);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI.a
 * JD-Core Version:    0.6.2
 */