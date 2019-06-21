package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import java.util.ArrayList;
import java.util.List;

public final class c extends BaseAdapter
{
  private Context context;
  private String gtX;
  private List<b.a> list;
  private List<b.a> nBI;
  int[] nBK;
  boolean nBL;

  public c(Context paramContext, List<b.a> paramList)
  {
    AppMethodBeat.i(34793);
    this.nBI = new ArrayList();
    this.nBL = false;
    this.context = paramContext;
    this.list = paramList;
    bIk();
    bIl();
    AppMethodBeat.o(34793);
  }

  private void bIk()
  {
    AppMethodBeat.i(34794);
    int i = 0;
    int j = this.list.size();
    while (i < j)
    {
      this.nBI.add(this.list.get(i));
      i++;
    }
    AppMethodBeat.o(34794);
  }

  private void bIl()
  {
    AppMethodBeat.i(34795);
    this.nBK = new int[this.list.size()];
    int i = this.list.size();
    for (int j = 0; j < i; j++)
      this.nBK[j] = ((b.a)this.list.get(j)).fHG;
    AppMethodBeat.o(34795);
  }

  private static String xo(int paramInt)
  {
    AppMethodBeat.i(34800);
    String str;
    if (aa.dop())
    {
      str = Integer.toString(paramInt) + "劃";
      AppMethodBeat.o(34800);
    }
    while (true)
    {
      return str;
      str = String.valueOf((char)paramInt);
      AppMethodBeat.o(34800);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(34796);
    int i = this.list.size();
    AppMethodBeat.o(34796);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(34797);
    Object localObject = this.list.get(paramInt);
    AppMethodBeat.o(34797);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(34799);
    b.a locala = (b.a)getItem(paramInt);
    label88: int i;
    if (paramView == null)
      if (!aa.dop())
      {
        paramView = View.inflate(this.context, 2130969247, null);
        paramViewGroup = new a();
        paramViewGroup.nBN = ((TextView)paramView.findViewById(2131821069));
        paramViewGroup.emg = ((TextView)paramView.findViewById(2131821079));
        paramViewGroup.nBO = ((TextView)paramView.findViewById(2131821075));
        paramView.setTag(paramViewGroup);
        if (paramInt <= 0)
          break label201;
        i = this.nBK[(paramInt - 1)];
        label102: if (paramInt != 0)
          break label207;
        paramViewGroup.nBN.setVisibility(0);
        paramViewGroup.nBN.setText(xo(this.nBK[paramInt]));
        label130: paramViewGroup.emg.setText(locala.fHE);
        paramViewGroup.nBO.setText(locala.fHD);
        if (!this.nBL)
          break label261;
        paramViewGroup.nBO.setVisibility(0);
      }
    while (true)
    {
      AppMethodBeat.o(34799);
      return paramView;
      paramView = View.inflate(this.context, 2130969248, null);
      break;
      paramViewGroup = (a)paramView.getTag();
      break label88;
      label201: i = -1;
      break label102;
      label207: if ((paramInt > 0) && (this.nBK[paramInt] != i))
      {
        paramViewGroup.nBN.setVisibility(0);
        paramViewGroup.nBN.setText(xo(this.nBK[paramInt]));
        break label130;
      }
      paramViewGroup.nBN.setVisibility(8);
      break label130;
      label261: paramViewGroup.nBO.setVisibility(4);
    }
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(34798);
    if (paramString != null)
    {
      this.gtX = paramString.trim();
      this.list.clear();
      int i = this.nBI.size();
      for (int j = 0; j < i; j++)
        if ((((b.a)this.nBI.get(j)).fHE.toUpperCase().contains(this.gtX.toUpperCase())) || (((b.a)this.nBI.get(j)).fHF.toUpperCase().contains(this.gtX.toUpperCase())) || (((b.a)this.nBI.get(j)).fHD.contains(this.gtX)))
          this.list.add(this.nBI.get(j));
      bIl();
      super.notifyDataSetChanged();
    }
    AppMethodBeat.o(34798);
  }

  static final class a
  {
    TextView emg;
    TextView nBN;
    TextView nBO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.c
 * JD-Core Version:    0.6.2
 */