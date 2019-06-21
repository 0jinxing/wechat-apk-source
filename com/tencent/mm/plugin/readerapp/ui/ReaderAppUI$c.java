package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bm;
import com.tencent.mm.plugin.readerapp.c.g;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.ui.e;
import com.tencent.mm.ui.base.n.d;

@Deprecated
final class ReaderAppUI$c extends a<String>
{
  private Context context;
  private int enb;
  private int jNi;
  private int kmW;
  private int pFo;

  public ReaderAppUI$c(ReaderAppUI paramReaderAppUI, Context paramContext, String paramString)
  {
    super(paramContext, paramString);
    AppMethodBeat.i(76839);
    this.context = paramContext;
    this.kmW = 3;
    this.enb = this.kmW;
    this.pFo = paramContext.getResources().getDimensionPixelSize(2131427500);
    this.jNi = paramContext.getResources().getDimensionPixelSize(2131427858);
    AppMethodBeat.o(76839);
  }

  public final void KC()
  {
    AppMethodBeat.i(76842);
    this.enb = g.cdZ().kI(ReaderAppUI.a(this.pFj));
    setCursor(g.cdZ().cp(this.kmW, ReaderAppUI.a(this.pFj)));
    super.notifyDataSetChanged();
    AppMethodBeat.o(76842);
  }

  public final void KD()
  {
    AppMethodBeat.i(76840);
    KC();
    AppMethodBeat.o(76840);
  }

  public final boolean bdn()
  {
    if (this.kmW >= this.enb);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int bdo()
  {
    AppMethodBeat.i(76841);
    int i;
    if (bdn())
    {
      i = 0;
      AppMethodBeat.o(76841);
    }
    while (true)
    {
      return i;
      this.kmW += 3;
      if (this.kmW <= this.enb)
      {
        i = 3;
        AppMethodBeat.o(76841);
      }
      else
      {
        this.kmW = this.enb;
        i = this.enb % 3;
        AppMethodBeat.o(76841);
      }
    }
  }

  public final int getShowCount()
  {
    return this.kmW;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(76843);
    if (paramView == null)
    {
      paramViewGroup = new ReaderAppUI.c.a(this);
      paramView = View.inflate(this.context, 2130970451, null);
      paramViewGroup.pFy = ((ReaderItemListView)paramView.findViewById(2131826836));
      paramViewGroup.ngD = ((TextView)paramView.findViewById(2131826831));
      paramView.setTag(paramViewGroup);
      getItem(paramInt);
      paramViewGroup.ngD.setText(h.c(this.context, 0L, false));
      ReaderItemListView localReaderItemListView = paramViewGroup.pFy;
      String str = (String)getItem(paramInt);
      View.OnCreateContextMenuListener localOnCreateContextMenuListener = ReaderAppUI.a(this.pFj, false);
      n.d locald = ReaderAppUI.g(this.pFj);
      localReaderItemListView.position = paramInt;
      localReaderItemListView.pFC = localOnCreateContextMenuListener;
      localReaderItemListView.jOb = locald;
      localReaderItemListView.pFA = g.cdZ().R(str, localReaderItemListView.type);
      localReaderItemListView.pFB.notifyDataSetChanged();
      if (ReaderAppUI.h(this.pFj) != null)
      {
        paramViewGroup.ngD.setTextColor(ReaderAppUI.h(this.pFj).vgW);
        if (!ReaderAppUI.h(this.pFj).vgX)
          break label288;
        paramViewGroup.ngD.setShadowLayer(2.0F, 1.2F, 1.2F, ReaderAppUI.h(this.pFj).vgY);
        label225: if (!ReaderAppUI.h(this.pFj).vgZ)
          break label302;
        paramViewGroup.ngD.setBackgroundResource(2130838199);
        paramViewGroup.ngD.setPadding(this.jNi, this.pFo, this.jNi, this.pFo);
      }
    }
    while (true)
    {
      AppMethodBeat.o(76843);
      return paramView;
      paramViewGroup = (ReaderAppUI.c.a)paramView.getTag();
      break;
      label288: paramViewGroup.ngD.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
      break label225;
      label302: paramViewGroup.ngD.setBackgroundColor(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.c
 * JD-Core Version:    0.6.2
 */