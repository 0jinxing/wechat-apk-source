package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
{
  public View mParentView;
  public PopupWindow uPB;
  public g.a uPC;

  public g(Context paramContext, View paramView)
  {
    AppMethodBeat.i(26779);
    this.mParentView = paramView;
    paramContext = LayoutInflater.from(paramContext).inflate(2130971231, null);
    paramContext.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    this.uPB = new PopupWindow(paramContext, -2, -2, false);
    this.uPB.setClippingEnabled(false);
    paramContext.findViewById(2131829220).setOnClickListener(new g.1(this));
    paramContext.findViewById(2131829221).setOnClickListener(new g.2(this));
    paramContext.findViewById(2131829222).setOnClickListener(new g.3(this));
    paramContext.findViewById(2131829223).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(26778);
        g.this.uPB.dismiss();
        g.this.mParentView.setVisibility(8);
        if (g.this.uPC != null)
          g.this.uPC.deG();
        AppMethodBeat.o(26778);
      }
    });
    AppMethodBeat.o(26779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.g
 * JD-Core Version:    0.6.2
 */