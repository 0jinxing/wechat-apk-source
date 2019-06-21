package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo;
import com.tencent.mm.plugin.wallet_core.model.b;
import com.tencent.mm.plugin.wallet_core.model.b.b;
import com.tencent.mm.plugin.wallet_core.model.j;
import com.tencent.mm.plugin.wallet_core.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
{
  public static c a(Context paramContext, b paramb, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(47376);
    if (((Activity)paramContext).isFinishing())
    {
      paramContext = null;
      AppMethodBeat.o(47376);
    }
    while (true)
    {
      return paramContext;
      if ((paramb == null) || ((TextUtils.isEmpty(paramb.twx)) && ((paramb.twy == null) || (paramb.twy.isEmpty()))))
      {
        ab.w("MicroMsg.WalletDialogHelper", "show showBalanceFetchAlert alert fail");
        paramContext = null;
        AppMethodBeat.o(47376);
      }
      else
      {
        c.a locala = new c.a(paramContext);
        locala.rc(false);
        locala.Qd(2131296868).b(paramOnClickListener2);
        if (paramBoolean)
          locala.Qc(2131304525).a(paramOnClickListener1);
        while (true)
        {
          paramOnClickListener1 = View.inflate(paramContext, 2130971095, null);
          if ((paramb.twy == null) || (paramb.twy.isEmpty()))
            break;
          paramOnClickListener2 = (LinearLayout)paramOnClickListener1.findViewById(2131821064);
          paramOnClickListener2.removeAllViews();
          for (int i = 0; (i < paramb.twy.size()) && (i < paramb.twy.size()); i++)
          {
            View localView = View.inflate(paramContext, 2130971094, null);
            TextView localTextView1 = (TextView)localView.findViewById(2131820678);
            TextView localTextView2 = (TextView)localView.findViewById(2131821920);
            localTextView1.setText(((b.b)paramb.twy.get(i)).key);
            localTextView2.setText(((b.b)paramb.twy.get(i)).value);
            paramOnClickListener2.addView(localView, i);
          }
          locala.PV(2131304532);
          locala.Qc(2131304539).a(paramOnClickListener1);
        }
        ab.e("MicroMsg.WalletDialogHelper", "fetch itemsList is empty");
        ((TextView)paramOnClickListener1.findViewById(2131820678)).setText(paramb.twx);
        if (paramBoolean)
        {
          paramb = (TextView)paramOnClickListener1.findViewById(2131820972);
          paramb.setVisibility(0);
          paramb.setText(paramContext.getString(2131304526));
        }
        locala.fn(paramOnClickListener1);
        paramb = locala.aMb();
        paramb.show();
        h.a(paramContext, paramb);
        AppMethodBeat.o(47376);
        paramContext = paramb;
      }
    }
  }

  public static c a(Context paramContext, j paramj, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(47375);
    if ((((Activity)paramContext).isFinishing()) || (paramj == null))
      AppMethodBeat.o(47375);
    for (paramContext = null; ; paramContext = paramj)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.rc(false);
      locala.Qd(2131296868).b(paramOnClickListener2);
      locala.Qc(2131304539).a(paramOnClickListener1);
      locala.asD(paramj.title);
      paramOnClickListener1 = View.inflate(paramContext, 2130971095, null);
      ((TextView)paramOnClickListener1.findViewById(2131820678)).setText(paramj.content);
      if (paramj.tzi != null)
      {
        paramOnClickListener2 = (LinearLayout)paramOnClickListener1.findViewById(2131821064);
        Iterator localIterator = paramj.tzi.iterator();
        while (localIterator.hasNext())
        {
          paramj = (j.a)localIterator.next();
          View localView = View.inflate(paramContext, 2130971094, null);
          TextView localTextView1 = (TextView)localView.findViewById(2131820678);
          TextView localTextView2 = (TextView)localView.findViewById(2131821920);
          localTextView1.setText(paramj.tzj.name);
          localTextView2.setText(paramj.tzj.value);
          paramOnClickListener2.addView(localView);
        }
      }
      locala.fn(paramOnClickListener1);
      paramj = locala.aMb();
      paramj.show();
      h.a(paramContext, paramj);
      AppMethodBeat.o(47375);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.k
 * JD-Core Version:    0.6.2
 */