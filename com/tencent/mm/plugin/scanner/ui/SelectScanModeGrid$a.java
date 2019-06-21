package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public final class SelectScanModeGrid$a extends BaseAdapter
{
  private Context context;
  private List<SelectScanModeGrid.b> itemList;
  int qgq;

  public SelectScanModeGrid$a(Context paramContext, List<SelectScanModeGrid.b> paramList)
  {
    AppMethodBeat.i(81327);
    this.qgq = -1;
    this.context = paramContext;
    this.itemList = paramList;
    ab.d("MicroMsg.scanner.SelectScanModeGroupAdapter", "<init> list size = " + this.itemList.size());
    AppMethodBeat.o(81327);
  }

  public final int getCount()
  {
    AppMethodBeat.i(81328);
    int i = this.itemList.size();
    AppMethodBeat.o(81328);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(81329);
    Object localObject;
    if ((paramInt < 0) || (paramInt >= this.itemList.size()))
    {
      ab.e("MicroMsg.scanner.SelectScanModeGroupAdapter", "getItem fail, invalid position = ".concat(String.valueOf(paramInt)));
      localObject = null;
      AppMethodBeat.o(81329);
    }
    while (true)
    {
      return localObject;
      localObject = this.itemList.get(paramInt);
      AppMethodBeat.o(81329);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(81330);
    SelectScanModeGrid.a.a locala;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130970603, null);
      locala = new SelectScanModeGrid.a.a();
      locala.qgr = ((TextView)paramView.findViewById(2131827330));
      locala.piD = ((TextView)paramView.findViewById(2131827331));
      locala.qgs = ((ImageView)paramView.findViewById(2131827332));
      paramView.setTag(locala);
    }
    while (paramInt == paramViewGroup.getChildCount())
    {
      paramViewGroup = (SelectScanModeGrid.b)getItem(paramInt);
      if (paramViewGroup == null)
      {
        ab.e("MicroMsg.scanner.SelectScanModeGroupAdapter", "getView fail, item is null");
        AppMethodBeat.o(81330);
        return paramView;
        locala = (SelectScanModeGrid.a.a)paramView.getTag();
      }
      else
      {
        locala.piD.setText(paramViewGroup.title);
        if (paramInt != this.qgq)
          break label189;
        locala.qgr.setBackgroundResource(paramViewGroup.qgu);
        label156: paramViewGroup.qgw = locala.qgr;
        if (!paramViewGroup.qgx)
          break label204;
        locala.qgs.setVisibility(0);
      }
    }
    while (true)
    {
      AppMethodBeat.o(81330);
      break;
      label189: locala.qgr.setBackgroundResource(paramViewGroup.qgt);
      break label156;
      label204: locala.qgs.setVisibility(4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.SelectScanModeGrid.a
 * JD-Core Version:    0.6.2
 */