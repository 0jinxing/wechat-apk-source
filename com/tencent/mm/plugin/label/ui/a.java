package com.tencent.mm.plugin.label.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.m;
import com.tencent.mm.cd.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.AddressView;
import com.tencent.mm.ui.contact.f;
import com.tencent.mm.ui.p;
import java.util.List;
import java.util.Map;

public final class a extends p<f>
{
  public static final ColorStateList nIp;
  public static final ColorStateList nIq;
  List<String> nIr;

  static
  {
    AppMethodBeat.i(22638);
    nIp = com.tencent.mm.bz.a.h(ah.getContext(), 2131690750);
    nIq = com.tencent.mm.bz.a.h(ah.getContext(), 2131690164);
    AppMethodBeat.o(22638);
  }

  public a(Context paramContext)
  {
    super(paramContext, new f());
    AppMethodBeat.i(22628);
    AppMethodBeat.o(22628);
  }

  private static f a(f paramf, Cursor paramCursor)
  {
    AppMethodBeat.i(22634);
    f localf = paramf;
    if (paramf == null)
      localf = new f();
    aw.ZK();
    paramf = c.XM().aoI(ad.q(paramCursor));
    if (paramf == null)
    {
      localf.ehM.d(paramCursor);
      aw.ZK();
      c.XM().W(localf.ehM);
    }
    while (true)
    {
      AppMethodBeat.o(22634);
      return localf;
      localf.ehM = paramf;
    }
  }

  public final void KC()
  {
    try
    {
      AppMethodBeat.i(22632);
      int i;
      Cursor localCursor;
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        i = 1;
        if ((this.nIr == null) || (this.nIr.size() <= 0))
          break label78;
        aw.ZK();
        localCursor = c.XM().ew(this.nIr);
        label55: if (i == 0)
          break label85;
        l(localCursor);
        AppMethodBeat.o(22632);
      }
      while (true)
      {
        return;
        i = 0;
        break;
        label78: localCursor = d.dvo();
        break label55;
        label85: a.1 local1 = new com/tencent/mm/plugin/label/ui/a$1;
        local1.<init>(this, localCursor);
        al.d(local1);
        AppMethodBeat.o(22632);
      }
    }
    finally
    {
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(22633);
    KC();
    AppMethodBeat.o(22633);
  }

  public final int getCount()
  {
    AppMethodBeat.i(22629);
    int i = super.getCount();
    AppMethodBeat.o(22629);
    return i;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22631);
    ad localad = xB(paramInt).ehM;
    View localView;
    Object localObject1;
    Object localObject2;
    float f;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      localView = View.inflate(this.context, 2130969228, null);
      paramViewGroup = new a.a(localView);
      localView.setTag(paramViewGroup);
      localObject1 = paramViewGroup.nIu;
      localObject2 = localad.field_username;
      f = com.tencent.mm.pluginsdk.ui.a.Iz();
      paramView = ((com.tencent.mm.pluginsdk.ui.a.a)localObject1).getDrawable();
      if ((paramView == null) || (!(paramView instanceof b)))
        break label353;
      paramView = (b)paramView;
      label97: paramView.setTag((String)localObject2);
      ((com.tencent.mm.pluginsdk.ui.a.a)localObject1).setImageDrawable(paramView);
      ((com.tencent.mm.pluginsdk.ui.a.a)localObject1).doInvalidate();
      if (localad.field_verifyFlag == 0)
        break label379;
      paramView = ao.a.flw.kz(localad.field_verifyFlag);
      if (paramView == null)
        break label368;
      paramView = m.rk(paramView);
      paramViewGroup.nIu.setMaskBitmap(paramView);
      label157: if (localad.field_deleteFlag != 1)
        break label390;
      paramViewGroup.nIu.setNickNameTextColor(nIq);
      paramViewGroup.nIu.updateTextColors();
      paramView = localad.xHQ;
      if (paramView != null)
        break label409;
    }
    while (true)
    {
      try
      {
        localObject1 = this.context;
        localObject2 = s.mJ(localad.field_username);
        paramView = (View)localObject2;
        if ("".length() > 0)
        {
          paramView = (View)localObject2;
          if (!"".equals(localObject2))
          {
            paramView = new java/lang/StringBuilder;
            paramView.<init>(32);
            paramView.append((String)localObject2);
            paramView.append("(");
            paramView.append("");
            paramView.append(")");
            paramView = paramView.toString();
          }
        }
        paramView = j.b((Context)localObject1, paramView, paramViewGroup.nIu.getNickNameSize());
        localObject2 = paramView;
        if (paramView == null)
          localObject2 = "";
        paramViewGroup.nIu.setName((CharSequence)localObject2);
        localad.xHQ = ((CharSequence)localObject2);
        paramViewGroup.nIu.updatePositionFlag();
        AppMethodBeat.o(22631);
        return localView;
        paramViewGroup = (a.a)paramView.getTag();
        localView = paramView;
        break;
        label353: paramView = new b((String)localObject2, f);
        break label97;
        label368: paramViewGroup.nIu.setMaskBitmap(null);
        break label157;
        label379: paramViewGroup.nIu.setMaskBitmap(null);
        break label157;
        label390: paramViewGroup.nIu.setNickNameTextColor(nIp);
      }
      catch (Exception paramView)
      {
        paramView = null;
        continue;
      }
      label409: paramViewGroup.nIu.setName(paramView);
    }
  }

  public final void l(Cursor paramCursor)
  {
    AppMethodBeat.i(22635);
    bIf();
    setCursor(paramCursor);
    notifyDataSetChanged();
    AppMethodBeat.o(22635);
  }

  public final f xB(int paramInt)
  {
    AppMethodBeat.i(22630);
    f localf;
    if (wK(paramInt))
    {
      localf = (f)bFt();
      AppMethodBeat.o(22630);
    }
    while (true)
    {
      return localf;
      if (this.yld != null)
      {
        localf = (f)this.yld.get(Integer.valueOf(paramInt));
        if (localf != null)
          AppMethodBeat.o(22630);
      }
      else if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt)))
      {
        AppMethodBeat.o(22630);
        localf = null;
      }
      else
      {
        localf = a(null, getCursor());
        if (this.yld == null)
          pN(true);
        if (this.yld != null)
          this.yld.put(Integer.valueOf(paramInt), localf);
        AppMethodBeat.o(22630);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.a
 * JD-Core Version:    0.6.2
 */