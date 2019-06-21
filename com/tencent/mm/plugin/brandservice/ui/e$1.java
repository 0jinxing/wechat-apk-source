package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.sortview.a;
import com.tencent.mm.ui.base.sortview.a.a;
import com.tencent.mm.ui.base.sortview.a.b;

final class e$1 extends a.b
{
  e$1(e parame)
  {
  }

  public final void a(Context paramContext, a.a parama, a parama1)
  {
    AppMethodBeat.i(14017);
    if ((paramContext == null) || (parama == null) || (parama1 == null))
    {
      ab.e("MicroMsg.ReadMoreBtnDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
      AppMethodBeat.o(14017);
    }
    while (true)
    {
      return;
      if (!(parama instanceof e.a))
      {
        ab.e("MicroMsg.ReadMoreBtnDataItem", "The ViewHolder is not a instance of MoreBtnViewHolder.");
        AppMethodBeat.o(14017);
      }
      else if (!(parama1 instanceof e))
      {
        ab.e("MicroMsg.ReadMoreBtnDataItem", "The DataItem is not a instance of MoreBtnDataItem.");
        AppMethodBeat.o(14017);
      }
      else
      {
        paramContext = (e.a)parama;
        parama = (e)parama1;
        paramContext.iqU.setText(parama.jMq);
        AppMethodBeat.o(14017);
      }
    }
  }

  public final void a(View paramView, a.a parama)
  {
    AppMethodBeat.i(14018);
    if ((paramView != null) && (parama != null) && ((parama instanceof e.a)))
      ((e.a)parama).iqU = ((TextView)paramView.findViewById(2131823632));
    AppMethodBeat.o(14018);
  }

  public final boolean a(Context paramContext, a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14015);
    if ((paramContext != null) && (parama != null))
    {
      int i = 0;
      int j = i;
      if (paramArrayOfObject != null)
      {
        j = i;
        if (paramArrayOfObject.length >= 2)
        {
          j = i;
          if ((paramArrayOfObject[1] instanceof Integer))
            j = ((Integer)paramArrayOfObject[1]).intValue();
        }
      }
      parama = (e)parama;
      paramArrayOfObject = new Intent(paramContext, BizSearchDetailPageUI.class);
      paramArrayOfObject.putExtra("keyword", parama.jKW);
      paramArrayOfObject.putExtra("businessType", parama.jKV);
      paramArrayOfObject.putExtra("offset", parama.Lp);
      paramArrayOfObject.putExtra("showEditText", true);
      paramArrayOfObject.putExtra("fromScene", j);
      paramContext.startActivity(paramArrayOfObject);
    }
    AppMethodBeat.o(14015);
    return true;
  }

  public final View c(Context paramContext, View paramView)
  {
    AppMethodBeat.i(14016);
    View localView = paramView;
    if (paramView == null)
      localView = View.inflate(paramContext, 2130970573, null);
    AppMethodBeat.o(14016);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.e.1
 * JD-Core Version:    0.6.2
 */