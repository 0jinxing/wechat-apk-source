package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class i extends BaseAdapter
{
  private Context mContext;
  private c piK;
  LinkedList<m> pjv;
  AdapterView.OnItemClickListener pjw;

  public i(Context paramContext)
  {
    AppMethodBeat.i(44119);
    this.mContext = paramContext;
    com.tencent.mm.plugin.product.a.a.bZC();
    this.piK = com.tencent.mm.plugin.product.a.a.bZD();
    AppMethodBeat.o(44119);
  }

  private m AO(int paramInt)
  {
    AppMethodBeat.i(44121);
    m localm = (m)this.pjv.get(paramInt);
    AppMethodBeat.o(44121);
    return localm;
  }

  public final int getCount()
  {
    AppMethodBeat.i(44120);
    int i;
    if (this.pjv != null)
    {
      i = this.pjv.size();
      AppMethodBeat.o(44120);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(44120);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44122);
    m localm = AO(paramInt);
    Object localObject1;
    Object localObject2;
    label163: int i;
    float f1;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramViewGroup = new i.a(this);
      paramView = View.inflate(this.mContext, 2130970396, null);
      paramViewGroup.pjx = ((TextView)paramView.findViewById(2131826606));
      paramViewGroup.pjy = ((MaxGridView)paramView.findViewById(2131826607));
      paramViewGroup.pjz = new j(this.mContext);
      paramView.setTag(paramViewGroup);
      paramViewGroup.pjx.setText(localm.phY);
      paramViewGroup.pjy.setOnItemClickListener(this.pjw);
      localObject1 = paramViewGroup.pjz;
      localObject2 = this.piK;
      Object localObject3 = localm.phX;
      if (!((c)localObject2).pha.containsKey(localObject3))
        break label303;
      localObject2 = (String)((c)localObject2).pha.get(localObject3);
      ((j)localObject1).pjB = localm;
      ((j)localObject1).pjC = ((String)localObject2);
      localObject2 = this.mContext;
      localObject3 = localm.phZ;
      i = ((Context)localObject2).getResources().getDisplayMetrics().widthPixels - com.tencent.mm.bz.a.fromDPToPix((Context)localObject2, 16) * 2;
      localObject1 = ((TextView)((LayoutInflater)((Context)localObject2).getSystemService("layout_inflater")).inflate(2130970395, null)).getPaint();
      f1 = 0.0F;
      localObject3 = ((LinkedList)localObject3).iterator();
      label247: if (!((Iterator)localObject3).hasNext())
        break label309;
      float f2 = ((TextPaint)localObject1).measureText(((h)((Iterator)localObject3).next()).name);
      if (f1 >= f2)
        break label512;
      f1 = f2;
    }
    label512: 
    while (true)
    {
      break label247;
      paramViewGroup = (i.a)paramView.getTag();
      break;
      label303: localObject2 = null;
      break label163;
      label309: int j = (int)f1;
      int k = com.tencent.mm.bz.a.fromDPToPix((Context)localObject2, 10);
      localObject1 = new int[4];
      int m = com.tencent.mm.bz.a.fromDPToPix((Context)localObject2, 12);
      for (paramInt = 0; paramInt < 4; paramInt++)
        localObject1[paramInt] = ((i - m * paramInt) / (paramInt + 1));
      paramInt = 4;
      if (paramInt > 0)
        if (j + k * 2 >= localObject1[(paramInt - 1)]);
      for (localObject2 = new Pair(Integer.valueOf(paramInt), Integer.valueOf(localObject1[(paramInt - 1)])); ; localObject2 = new Pair(Integer.valueOf(1), Integer.valueOf(i)))
      {
        ab.d("MicroMsg.MallProductImageAdapter", localm.phY + " numColumns = " + localObject2);
        paramViewGroup.pjy.setColumnWidth(((Integer)((Pair)localObject2).second).intValue());
        paramViewGroup.pjz.notifyDataSetChanged();
        paramViewGroup.pjy.setAdapter(paramViewGroup.pjz);
        AppMethodBeat.o(44122);
        return paramView;
        paramInt--;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.i
 * JD-Core Version:    0.6.2
 */