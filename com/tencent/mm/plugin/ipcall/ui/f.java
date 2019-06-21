package com.tencent.mm.plugin.ipcall.ui;

import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class f extends BaseAdapter
{
  private String gtX;
  private List<a> list;
  private List<a> nBI;
  private IPCallCountryCodeSelectUI nBJ;
  int[] nBK;
  boolean nBL;
  boolean nBM;

  public f(IPCallCountryCodeSelectUI paramIPCallCountryCodeSelectUI, List<a> paramList)
  {
    AppMethodBeat.i(22098);
    this.nBI = new ArrayList();
    this.nBL = false;
    this.nBM = false;
    this.nBJ = paramIPCallCountryCodeSelectUI;
    this.list = paramList;
    bIk();
    bIl();
    AppMethodBeat.o(22098);
  }

  private void bIk()
  {
    AppMethodBeat.i(22099);
    int i = 0;
    int j = this.list.size();
    while (i < j)
    {
      this.nBI.add(this.list.get(i));
      i++;
    }
    this.nBJ.nBB.setVisibility(8);
    AppMethodBeat.o(22099);
  }

  private void bIl()
  {
    AppMethodBeat.i(22100);
    this.nBK = new int[this.list.size()];
    int i = this.list.size();
    for (int j = 0; j < i; j++)
      this.nBK[j] = ((a)this.list.get(j)).bIc();
    AppMethodBeat.o(22100);
  }

  private static String xo(int paramInt)
  {
    AppMethodBeat.i(22105);
    String str = String.valueOf((char)paramInt);
    String[] arrayOfString = IPCallCountryCodeScrollbar.nBP;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
      if (arrayOfString[j].equals(String.valueOf((char)paramInt)))
        AppMethodBeat.o(22105);
    while (true)
    {
      return str;
      j++;
      break;
      str = "#";
      AppMethodBeat.o(22105);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(22101);
    int i = this.list.size();
    AppMethodBeat.o(22101);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(22102);
    Object localObject = this.list.get(paramInt);
    AppMethodBeat.o(22102);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22104);
    Object localObject = (a)getItem(paramInt);
    int i;
    if (paramView == null)
    {
      paramView = View.inflate(this.nBJ, 2130969884, null);
      paramViewGroup = new a();
      paramViewGroup.nBN = ((TextView)paramView.findViewById(2131821069));
      paramViewGroup.emg = ((TextView)paramView.findViewById(2131821079));
      paramViewGroup.nBO = ((TextView)paramView.findViewById(2131821075));
      paramView.setTag(paramViewGroup);
      if (paramInt <= 0)
        break label235;
      i = this.nBK[(paramInt - 1)];
      label97: if (paramInt != 0)
        break label260;
      paramViewGroup.nBN.setVisibility(0);
      if (!this.nBM)
        break label241;
      paramViewGroup.nBN.setText(2131302013);
      label125: if (bo.isNullOrNil(this.gtX))
        break label314;
      Spannable localSpannable = com.tencent.mm.plugin.fts.a.f.a(((a)localObject).fHE, this.gtX);
      paramViewGroup.emg.setText(localSpannable);
      localObject = com.tencent.mm.plugin.fts.a.f.a(" (+" + ((a)localObject).countryCode + ")", this.gtX);
      paramViewGroup.nBO.setText((CharSequence)localObject);
      label201: if (!this.nBL)
        break label361;
      paramViewGroup.nBO.setVisibility(0);
    }
    while (true)
    {
      AppMethodBeat.o(22104);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label235: i = -1;
      break label97;
      label241: paramViewGroup.nBN.setText(xo(this.nBK[paramInt]));
      break label125;
      label260: if ((paramInt > 0) && (this.nBK[paramInt] != i))
      {
        paramViewGroup.nBN.setVisibility(0);
        paramViewGroup.nBN.setText(xo(this.nBK[paramInt]));
        break label125;
      }
      paramViewGroup.nBN.setVisibility(8);
      break label125;
      label314: paramViewGroup.emg.setText(((a)localObject).fHE);
      paramViewGroup.nBO.setText(" (+" + ((a)localObject).countryCode + ")");
      break label201;
      label361: paramViewGroup.nBO.setVisibility(4);
    }
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(22103);
    if (paramString != null)
    {
      this.gtX = paramString.trim();
      this.list.clear();
      int i = this.nBI.size();
      for (int j = 0; j < i; j++)
        if ((((a)this.nBI.get(j)).fHE.toUpperCase().contains(this.gtX.toUpperCase())) || (((a)this.nBI.get(j)).fHF.toUpperCase().contains(this.gtX.toUpperCase())) || (((a)this.nBI.get(j)).countryCode.contains(this.gtX)))
          this.list.add(this.nBI.get(j));
      bIl();
      if (this.list.size() != 0)
        break label198;
      this.nBJ.nBB.setVisibility(0);
    }
    while (true)
    {
      super.notifyDataSetChanged();
      AppMethodBeat.o(22103);
      return;
      label198: this.nBJ.nBB.setVisibility(8);
    }
  }

  static final class a
  {
    TextView emg;
    TextView nBN;
    TextView nBO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.f
 * JD-Core Version:    0.6.2
 */