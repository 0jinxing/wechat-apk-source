package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ReaderAppSubscribeUI$a extends BaseAdapter
{
  private final Context context;
  final int[] pFa;
  int pFb;
  private String[] pFc;
  int pFd;

  public ReaderAppSubscribeUI$a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(76805);
    this.pFa = new int[] { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192 };
    this.pFc = null;
    this.pFd = 0;
    this.context = paramContext;
    this.pFb = paramInt;
    this.pFc = paramContext.getString(2131302154).split(";");
    this.pFd = Bz(paramInt);
    AppMethodBeat.o(76805);
  }

  private int Bz(int paramInt)
  {
    int i = 0;
    int j = 0;
    if (i < this.pFa.length)
    {
      if ((this.pFa[i] & paramInt) == 0)
        break label35;
      j++;
    }
    label35: 
    while (true)
    {
      i++;
      break;
      return j;
    }
  }

  public final int getCount()
  {
    return this.pFc.length;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(76806);
    if (paramView == null)
    {
      paramViewGroup = new ReaderAppSubscribeUI.a.a();
      paramView = View.inflate(this.context, 2130970461, null);
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131826843));
      paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131826844));
      paramView.setTag(paramViewGroup);
      paramViewGroup.gnB.setText(this.pFc[paramInt]);
      paramViewGroup = paramViewGroup.gnD;
      if ((this.pFb & this.pFa[paramInt]) == 0)
        break label118;
    }
    label118: for (boolean bool = true; ; bool = false)
    {
      paramViewGroup.setChecked(bool);
      AppMethodBeat.o(76806);
      return paramView;
      paramViewGroup = (ReaderAppSubscribeUI.a.a)paramView.getTag();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI.a
 * JD-Core Version:    0.6.2
 */