package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.os.Looper;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e extends BaseAdapter
{
  byte[] buffer;
  private Context context;
  boolean eTf;
  boolean gxV;
  String kPJ;
  String key;
  int llU;
  boolean nPV;
  List<f> nQk;

  public e(Context paramContext)
  {
    AppMethodBeat.i(113656);
    this.nQk = new ArrayList();
    this.context = null;
    this.llU = 0;
    this.buffer = null;
    this.eTf = false;
    this.key = "";
    this.kPJ = "";
    this.gxV = false;
    this.nPV = false;
    this.context = paramContext;
    AppMethodBeat.o(113656);
  }

  private Spannable Qc(String paramString)
  {
    AppMethodBeat.i(113664);
    paramString = com.tencent.mm.plugin.fts.a.f.a(paramString, this.kPJ);
    AppMethodBeat.o(113664);
    return paramString;
  }

  public final void Qb(String paramString)
  {
    AppMethodBeat.i(113658);
    this.key = paramString;
    ab.i("MicroMsg.PoiAdapter", "initdata key %s", new Object[] { paramString });
    AppMethodBeat.o(113658);
  }

  public final void a(List<f> paramList, byte[] paramArrayOfByte, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(113660);
    if ((this.key == null) || (!this.key.equals(paramString)))
    {
      ab.i("MicroMsg.PoiAdapter", "old key come pass it %s %s", new Object[] { this.key, paramString });
      AppMethodBeat.o(113660);
    }
    while (true)
    {
      return;
      int i = this.nQk.size();
      paramString = paramList.iterator();
      while (paramString.hasNext())
      {
        paramList = (f)paramString.next();
        paramList.nQC = i;
        i++;
        this.nQk.add(paramList);
      }
      this.buffer = paramArrayOfByte;
      this.eTf = paramBoolean;
      notifyDataSetChanged();
      AppMethodBeat.o(113660);
    }
  }

  public final void b(f paramf)
  {
    AppMethodBeat.i(113659);
    if (this.nQk.size() >= 0)
    {
      this.nQk.add(0, paramf);
      notifyDataSetChanged();
    }
    AppMethodBeat.o(113659);
  }

  public final void bKy()
  {
    this.buffer = null;
    this.eTf = false;
    this.key = "";
  }

  public final void clean()
  {
    AppMethodBeat.i(113657);
    this.buffer = null;
    this.eTf = false;
    this.key = "";
    this.nQk.clear();
    AppMethodBeat.o(113657);
  }

  public final int getCount()
  {
    AppMethodBeat.i(113661);
    int i = this.nQk.size();
    AppMethodBeat.o(113661);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(113663);
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(2130970368, null);
      paramViewGroup = new e.a();
      paramViewGroup.titleView = ((TextView)paramView.findViewById(2131820678));
      paramViewGroup.nQl = ((TextView)paramView.findViewById(2131821920));
      paramViewGroup.nQm = ((ImageView)paramView.findViewById(2131826557));
      paramViewGroup.nQo = paramView.findViewById(2131826559);
      paramViewGroup.nQn = paramView.findViewById(2131826558);
      paramViewGroup.iKA = ((TextView)paramView.findViewById(2131826560));
      paramView.setTag(paramViewGroup);
      if ((((f)this.nQk.get(paramInt)).type != 1) && (((f)this.nQk.get(paramInt)).type != 2))
        break label314;
      paramViewGroup.nQo.setVisibility(0);
      paramViewGroup.nQn.setVisibility(8);
      paramViewGroup.iKA.setText(bo.bc(((f)this.nQk.get(paramInt)).nQp, ""));
      label198: if ((paramInt != 0) || (this.gxV))
        break label480;
      if (!this.nPV)
        break label334;
      paramViewGroup.titleView.setText(bo.bc(((f)this.nQk.get(0)).mName, ""));
      paramViewGroup.nQl.setVisibility(0);
      paramViewGroup.nQl.setText(bo.bc(((f)this.nQk.get(0)).nQp, ""));
    }
    label296: label314: label334: label480: Object localObject1;
    Object localObject2;
    while (true)
      if (paramInt == this.llU)
      {
        paramViewGroup.nQm.setVisibility(0);
        AppMethodBeat.o(113663);
        return paramView;
        paramViewGroup = (e.a)paramView.getTag();
        break;
        paramViewGroup.nQo.setVisibility(8);
        paramViewGroup.nQn.setVisibility(0);
        break label198;
        paramViewGroup.nQl.setVisibility(8);
        if (!bo.isNullOrNil(((f)this.nQk.get(0)).nQp))
        {
          paramViewGroup.titleView.setText(bo.bc(((f)this.nQk.get(paramInt)).nQp, ""));
        }
        else if (bo.isNullOrNil(((f)this.nQk.get(0)).nQy))
        {
          paramViewGroup.titleView.setText(bo.bc(((f)this.nQk.get(paramInt)).mName, ""));
        }
        else
        {
          paramViewGroup.titleView.setText(bo.bc(((f)this.nQk.get(paramInt)).nQy, ""));
          continue;
          localObject1 = (f)this.nQk.get(paramInt);
          localObject2 = bo.bc(((f)localObject1).mName, "");
          localObject1 = bo.bc(((f)localObject1).nQp, "");
          if ((!this.gxV) || (bo.isNullOrNil(this.kPJ)))
            break label592;
          localObject2 = Qc((String)localObject2);
          localObject1 = Qc((String)localObject1);
        }
      }
    label592: 
    while (true)
    {
      paramViewGroup.titleView.setText((CharSequence)localObject2);
      paramViewGroup.nQl.setText((CharSequence)localObject1);
      paramViewGroup.nQl.setVisibility(0);
      break;
      paramViewGroup.nQm.setVisibility(4);
      break label296;
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(113665);
    super.notifyDataSetChanged();
    Thread.currentThread().getId();
    Looper.getMainLooper().getThread().getId();
    ab.i("MicroMsg.PoiAdapter", "map notifyDataChange " + bo.dpG().toString() + " threadId : " + Thread.currentThread().getId());
    AppMethodBeat.o(113665);
  }

  public final f xG(int paramInt)
  {
    AppMethodBeat.i(113662);
    f localf = (f)this.nQk.get(paramInt);
    AppMethodBeat.o(113662);
    return localf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.e
 * JD-Core Version:    0.6.2
 */