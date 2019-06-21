package com.tencent.mm.plugin.backup.backuppcui;

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
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import java.util.HashSet;
import java.util.LinkedList;

public final class a extends BaseAdapter
{
  static boolean jwF = false;
  HashSet<Integer> jur;
  BackupPcChooseUI jwE;

  public a(BackupPcChooseUI paramBackupPcChooseUI)
  {
    AppMethodBeat.i(17568);
    this.jwE = paramBackupPcChooseUI;
    this.jur = new HashSet();
    jwF = false;
    AppMethodBeat.o(17568);
  }

  private static String getItem(int paramInt)
  {
    AppMethodBeat.i(17570);
    Object localObject = b.aTD().aTH().aSV();
    if (((LinkedList)localObject).get(paramInt) == null)
    {
      localObject = null;
      AppMethodBeat.o(17570);
    }
    while (true)
    {
      return localObject;
      localObject = ((f.b)((LinkedList)localObject).get(paramInt)).jrf;
      AppMethodBeat.o(17570);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(17569);
    LinkedList localLinkedList = b.aTD().aTH().aSV();
    int i;
    if (localLinkedList != null)
    {
      i = localLinkedList.size();
      AppMethodBeat.o(17569);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(17569);
    }
  }

  public final long getItemId(int paramInt)
  {
    return -1L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(17571);
    String str;
    if (paramView == null)
    {
      paramView = this.jwE.getLayoutInflater().inflate(2130968798, paramViewGroup, false);
      paramViewGroup = new a.a(this);
      paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131821185));
      paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131821593));
      paramViewGroup.juu = ((RelativeLayout)paramView.findViewById(2131821592));
      paramView.setTag(paramViewGroup);
      paramViewGroup.juu.setOnClickListener(new a.1(this, paramInt));
      str = getItem(paramInt);
      a.b.b(paramViewGroup.ejo, str);
      if (!t.kH(str))
        break label199;
      paramViewGroup.gnB.setText(j.b(this.jwE, s.getDisplayName(str, str), paramViewGroup.gnB.getTextSize()));
      label158: if (!this.jur.contains(Integer.valueOf(paramInt)))
        break label228;
      paramViewGroup.gnD.setChecked(true);
    }
    while (true)
    {
      AppMethodBeat.o(17571);
      return paramView;
      paramViewGroup = (a.a)paramView.getTag();
      break;
      label199: paramViewGroup.gnB.setText(j.b(this.jwE, s.mJ(str), paramViewGroup.gnB.getTextSize()));
      break label158;
      label228: paramViewGroup.gnD.setChecked(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.a
 * JD-Core Version:    0.6.2
 */