package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class d
{
  public Button grC;
  public View iym;
  public Button jAH;
  public Context mContext;
  private BottomSheetBehavior nA;
  public n.c rBl;
  public n.d rBm;
  public l rBn;
  public TextView rMl;
  public ListView zSv;
  public View zSw;
  public ArrayList<Integer> zSx;
  public a zSy;
  public d.b zSz;
  public c zaW;
  public int zaX;

  public d(Context paramContext)
  {
    AppMethodBeat.i(112849);
    this.mContext = paramContext;
    this.rBn = new l(this.mContext);
    this.zaW = new c(this.mContext);
    this.iym = View.inflate(this.mContext, 2130970263, null);
    this.zSv = ((ListView)this.iym.findViewById(2131826212));
    this.grC = ((Button)this.iym.findViewById(2131823196));
    this.jAH = ((Button)this.iym.findViewById(2131822819));
    this.zSw = this.iym.findViewById(2131826211);
    this.rMl = ((TextView)this.iym.findViewById(2131823952));
    this.zaW.setContentView(this.iym);
    this.zaX = (aj.am(this.mContext, 2131427514) + aj.am(this.mContext, 2131427515));
    this.nA = BottomSheetBehavior.j((View)this.iym.getParent());
    if (this.nA != null)
    {
      this.nA.K(this.zaX);
      this.nA.nj = false;
    }
    this.zaW.setOnDismissListener(new d.1(this));
    AppMethodBeat.o(112849);
  }

  public final void hide()
  {
    AppMethodBeat.i(112850);
    if (this.zaW != null)
      this.zaW.dismiss();
    AppMethodBeat.o(112850);
  }

  public final class a extends BaseAdapter
  {
    private Context context;
    public HashMap<Integer, Boolean> zSB;
    private ArrayList<Integer> zSC;

    public a(Context arg2)
    {
      AppMethodBeat.i(112843);
      this.zSB = new HashMap();
      Object localObject;
      this.context = localObject;
      AppMethodBeat.o(112843);
    }

    public final void dLm()
    {
      AppMethodBeat.i(112847);
      if (d.this.zSx == null)
        AppMethodBeat.o(112847);
      while (true)
      {
        return;
        int i = 0;
        if (i < getCount())
        {
          if (d.this.zSx.contains(Integer.valueOf(i)))
            this.zSB.put(Integer.valueOf(i), Boolean.TRUE);
          while (true)
          {
            i++;
            break;
            this.zSB.put(Integer.valueOf(i), Boolean.FALSE);
          }
        }
        AppMethodBeat.o(112847);
      }
    }

    public final ArrayList<Integer> dLn()
    {
      AppMethodBeat.i(112848);
      Object localObject;
      if (this.zSB == null)
      {
        localObject = null;
        AppMethodBeat.o(112848);
      }
      while (true)
      {
        return localObject;
        this.zSC = new ArrayList();
        for (int i = 0; i < getCount(); i++)
          if (((Boolean)this.zSB.get(Integer.valueOf(i))).booleanValue())
            this.zSC.add(Integer.valueOf(i));
        localObject = this.zSC;
        AppMethodBeat.o(112848);
      }
    }

    public final int getCount()
    {
      AppMethodBeat.i(112844);
      int i = d.this.rBn.size();
      AppMethodBeat.o(112844);
      return i;
    }

    public final Object getItem(int paramInt)
    {
      AppMethodBeat.i(112845);
      Object localObject = d.this.rBn.yvT.get(paramInt);
      AppMethodBeat.o(112845);
      return localObject;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(112846);
      m localm = (m)d.this.rBn.yvT.get(paramInt);
      paramViewGroup = LayoutInflater.from(this.context);
      if (paramView == null)
      {
        paramView = paramViewGroup.inflate(2130970262, null);
        paramViewGroup = new d.a.a(this);
        paramViewGroup.zQH = ((LinearLayout)paramView.findViewById(2131826208));
        paramViewGroup.moo = ((CheckBox)paramView.findViewById(2131826210));
        paramViewGroup.gnB = ((TextView)paramView.findViewById(2131823564));
        paramViewGroup.gnC = ((TextView)paramView.findViewById(2131826209));
        paramView.setTag(paramViewGroup);
        paramViewGroup.gnB.setText(localm.getTitle());
        paramViewGroup.zQH.setOnClickListener(new d.a.1(this, paramInt, localm));
        if (paramViewGroup.gnC != null)
        {
          if ((localm.mKB == null) || (localm.mKB.length() <= 0))
            break label292;
          paramViewGroup.gnC.setVisibility(0);
          paramViewGroup.gnC.setText(localm.mKB);
        }
        label190: if (!localm.xeS)
          break label304;
        paramViewGroup.gnB.setTextColor(d.this.mContext.getResources().getColor(2131689773));
        paramViewGroup.gnC.setTextColor(d.this.mContext.getResources().getColor(2131689773));
        paramViewGroup.moo.setChecked(((Boolean)this.zSB.get(Integer.valueOf(paramInt))).booleanValue());
        paramViewGroup.moo.setEnabled(false);
      }
      while (true)
      {
        AppMethodBeat.o(112846);
        return paramView;
        paramViewGroup = (d.a.a)paramView.getTag();
        break;
        label292: paramViewGroup.gnC.setVisibility(8);
        break label190;
        label304: paramViewGroup.gnB.setTextColor(d.this.mContext.getResources().getColor(2131689772));
        paramViewGroup.gnC.setTextColor(d.this.mContext.getResources().getColor(2131689774));
        paramViewGroup.moo.setChecked(((Boolean)this.zSB.get(Integer.valueOf(paramInt))).booleanValue());
        paramViewGroup.moo.setEnabled(true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.d
 * JD-Core Version:    0.6.2
 */