package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.p;

final class IPCallAllRecordUI$a extends p<k>
{
  public IPCallAllRecordUI$a(IPCallAllRecordUI paramIPCallAllRecordUI, Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(22065);
    pN(true);
    AppMethodBeat.o(22065);
  }

  public final void KC()
  {
    Object localObject1 = null;
    AppMethodBeat.i(22066);
    Object localObject3;
    if (!bo.isNullOrNil(IPCallAllRecordUI.a(this.nBr)))
    {
      Object localObject2 = IPCallAllRecordUI.a(this.nBr);
      localObject3 = localObject1;
      if (!bo.isNullOrNil((String)localObject2))
      {
        localObject2 = i.bHw().OQ((String)localObject2);
        localObject3 = localObject1;
        if (localObject2 != null)
        {
          localObject3 = localObject1;
          if (((com.tencent.mm.plugin.ipcall.a.g.c)localObject2).xDa != -1L)
          {
            long l = ((com.tencent.mm.plugin.ipcall.a.g.c)localObject2).xDa;
            localObject3 = i.bHx().iX(l);
          }
        }
      }
    }
    while (true)
    {
      setCursor((Cursor)localObject3);
      AppMethodBeat.o(22066);
      return;
      localObject3 = localObject1;
      if (!bo.isNullOrNil(IPCallAllRecordUI.b(this.nBr)))
        localObject3 = i.bHx().OV(IPCallAllRecordUI.b(this.nBr));
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(22067);
    bIf();
    KC();
    AppMethodBeat.o(22067);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22068);
    View localView = paramView;
    if (paramView == null)
    {
      localView = this.nBr.getLayoutInflater().inflate(2130969895, paramViewGroup, false);
      paramView = new IPCallAllRecordUI.a.a(this);
      paramView.nBs = ((TextView)localView.findViewById(2131825141));
      paramView.nBt = ((TextView)localView.findViewById(2131825142));
      paramView.gnh = ((TextView)localView.findViewById(2131825143));
      localView.setTag(paramView);
    }
    paramViewGroup = (k)getItem(paramInt);
    paramView = (IPCallAllRecordUI.a.a)localView.getTag();
    paramView.nBt.setText(a.Pw(paramViewGroup.field_phonenumber));
    if (paramViewGroup.field_duration > 0L)
      paramView.gnh.setText(com.tencent.mm.plugin.ipcall.b.c.jc(paramViewGroup.field_duration));
    while (true)
    {
      paramView.nBs.setText(com.tencent.mm.plugin.ipcall.b.c.iY(paramViewGroup.field_calltime));
      AppMethodBeat.o(22068);
      return localView;
      paramView.gnh.setText(com.tencent.mm.plugin.ipcall.b.c.xy(paramViewGroup.field_status));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI.a
 * JD-Core Version:    0.6.2
 */