package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class FileSelectorFolderView$b extends BaseAdapter
{
  private Context mContext;

  public FileSelectorFolderView$b(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final int getCount()
  {
    return 2;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(28161);
    AppMethodBeat.o(28161);
    return Integer.valueOf(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28162);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.mContext).inflate(2130969571, null);
      paramViewGroup = new FileSelectorFolderView.c(paramView);
      paramView.setTag(paramViewGroup);
      switch (paramInt)
      {
      default:
        paramViewGroup.gne.setText(2131296899);
      case 0:
      case 1:
      }
    }
    while (true)
    {
      AppMethodBeat.o(28162);
      return paramView;
      paramViewGroup = (FileSelectorFolderView.c)paramView.getTag();
      break;
      paramViewGroup.gne.setText(2131299785);
      continue;
      paramViewGroup.gne.setText(2131299786);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView.b
 * JD-Core Version:    0.6.2
 */