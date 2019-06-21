package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

final class CompressPreviewUI$b extends BaseAdapter
{
  CompressPreviewUI.a pxw;
  private List<CompressPreviewUI.a> pxx = null;

  private CompressPreviewUI$b(CompressPreviewUI paramCompressPreviewUI)
  {
  }

  public final CompressPreviewUI.a Bs(int paramInt)
  {
    AppMethodBeat.i(68248);
    CompressPreviewUI.a locala;
    if ((this.pxx != null) && (this.pxx.size() > paramInt))
    {
      locala = (CompressPreviewUI.a)this.pxx.get(paramInt);
      AppMethodBeat.o(68248);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(68248);
    }
  }

  public final void a(CompressPreviewUI.a parama, List<CompressPreviewUI.a> paramList)
  {
    this.pxw = parama;
    this.pxx = paramList;
  }

  public final String ccY()
  {
    String str = null;
    AppMethodBeat.i(68246);
    if ((this.pxw == null) || (this.pxw.pxv == null))
      AppMethodBeat.o(68246);
    while (true)
    {
      return str;
      if (this.pxw.pxv.length() == 0)
      {
        str = "";
        AppMethodBeat.o(68246);
      }
      else
      {
        int i = this.pxw.id.indexOf(this.pxw.pxv);
        if (i >= 0)
        {
          str = this.pxw.id.substring(0, i) + this.pxw.pxv;
          AppMethodBeat.o(68246);
        }
        else
        {
          AppMethodBeat.o(68246);
        }
      }
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(68247);
    int i;
    if (this.pxx != null)
    {
      i = this.pxx.size();
      AppMethodBeat.o(68247);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(68247);
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(68249);
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = View.inflate(this.pxt.mController.ylL, 2130970013, null);
      paramView = new CompressPreviewUI.b.a(this, (byte)0);
      paramView.iqT = ((ImageView)paramViewGroup.findViewById(2131825695));
      paramView.gxi = ((TextView)paramViewGroup.findViewById(2131823901));
      paramView.pxy = ((TextView)paramViewGroup.findViewById(2131825696));
      paramView.pxz = ((ImageView)paramViewGroup.findViewById(2131825697));
      paramViewGroup.setTag(paramView);
    }
    CompressPreviewUI.b.a locala = (CompressPreviewUI.b.a)paramViewGroup.getTag();
    CompressPreviewUI.a locala1 = Bs(paramInt);
    if ((paramInt == 0) && (ccY() != null))
    {
      paramView = locala.iqT;
      paramInt = 2130839897;
      paramView.setImageResource(paramInt);
      paramView = locala.pxz;
      if (!locala1.aIt)
        break label222;
    }
    label222: for (paramInt = 0; ; paramInt = 4)
    {
      paramView.setVisibility(paramInt);
      locala.gxi.setText(locala1.name);
      locala.pxy.setText(locala1.size);
      AppMethodBeat.o(68249);
      return paramViewGroup;
      paramView = locala.iqT;
      if (locala1.ccX())
      {
        paramInt = 2130839898;
        break;
      }
      paramInt = FileExplorerUI.ajW(locala1.name);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI.b
 * JD-Core Version:    0.6.2
 */