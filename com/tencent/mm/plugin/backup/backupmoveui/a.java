package com.tencent.mm.plugin.backup.backupmoveui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.backup.b.f.b;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import java.util.HashSet;
import java.util.LinkedList;

public final class a extends BaseAdapter
{
  BackupMoveChooseUI juq;
  HashSet<Integer> jur;
  boolean jus;

  public a(BackupMoveChooseUI paramBackupMoveChooseUI)
  {
    AppMethodBeat.i(17319);
    this.jus = false;
    this.juq = paramBackupMoveChooseUI;
    this.jur = new HashSet();
    this.jus = false;
    AppMethodBeat.o(17319);
  }

  private static f.b rp(int paramInt)
  {
    AppMethodBeat.i(17321);
    f.b localb = (f.b)b.aSZ().aTd().aSV().get(paramInt);
    AppMethodBeat.o(17321);
    return localb;
  }

  public final int getCount()
  {
    AppMethodBeat.i(17320);
    LinkedList localLinkedList = b.aSZ().aTd().aSV();
    int i;
    if (localLinkedList != null)
    {
      i = localLinkedList.size();
      AppMethodBeat.o(17320);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(17320);
    }
  }

  public final long getItemId(int paramInt)
  {
    return -1L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(17322);
    f.b localb;
    if (paramView == null)
    {
      paramView = this.juq.getLayoutInflater().inflate(2130968803, paramViewGroup, false);
      paramViewGroup = new a.a(this);
      paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131821185));
      paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131821593));
      paramViewGroup.juu = ((RelativeLayout)paramView.findViewById(2131821592));
      paramView.setTag(paramViewGroup);
      paramViewGroup.juu.setOnClickListener(new a.1(this, paramInt));
      localb = rp(paramInt);
      a.b.b(paramViewGroup.ejo, localb.jrf);
      if (!t.kH(localb.jrf))
        break label211;
      paramViewGroup.gnB.setText(j.b(this.juq, s.getDisplayName(localb.jrf, localb.jrf), paramViewGroup.gnB.getTextSize()));
      label170: if (!this.jur.contains(Integer.valueOf(paramInt)))
        break label243;
      paramViewGroup.gnD.setChecked(true);
    }
    while (true)
    {
      AppMethodBeat.o(17322);
      return paramView;
      paramViewGroup = (a.a)paramView.getTag();
      break;
      label211: paramViewGroup.gnB.setText(j.b(this.juq, s.mJ(localb.jrf), paramViewGroup.gnB.getTextSize()));
      break label170;
      label243: paramViewGroup.gnD.setChecked(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.a
 * JD-Core Version:    0.6.2
 */