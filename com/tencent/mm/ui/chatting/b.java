package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

final class b extends BaseAdapter
{
  private Context context;
  private c lyr;
  private List<z> yGD;
  boolean yGE;

  public b(Context paramContext)
  {
    AppMethodBeat.i(30370);
    this.yGE = false;
    this.context = paramContext;
    this.yGD = new ArrayList();
    paramContext = new c.a();
    paramContext.ePT = 2130839645;
    this.lyr = paramContext.ahG();
    bw(null);
    AppMethodBeat.o(30370);
  }

  private z Oc(int paramInt)
  {
    AppMethodBeat.i(30375);
    z localz = (z)this.yGD.get(paramInt);
    AppMethodBeat.o(30375);
    return localz;
  }

  private z dBu()
  {
    AppMethodBeat.i(30372);
    z localz = new z();
    localz.resId = 2130840111;
    localz.eoz = this.context.getString(2131303304);
    AppMethodBeat.o(30372);
    return localz;
  }

  private z dBv()
  {
    AppMethodBeat.i(30373);
    z localz = new z();
    localz.resId = 2130840112;
    localz.eoz = this.context.getString(2131298243);
    AppMethodBeat.o(30373);
    return localz;
  }

  public final void bw(List<z> paramList)
  {
    AppMethodBeat.i(30371);
    this.yGD.clear();
    if ((paramList != null) && (paramList.size() != 0))
      this.yGD.addAll(paramList);
    if (this.yGE)
      this.yGD.add(dBv());
    this.yGD.add(dBu());
    ab.d("MicroMsg.AppInfoListAdapter", "updateData mDeviceInfoList.size() = %d.", new Object[] { Integer.valueOf(this.yGD.size()) });
    AppMethodBeat.o(30371);
  }

  public final int getCount()
  {
    AppMethodBeat.i(30374);
    int i = this.yGD.size();
    AppMethodBeat.o(30374);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30376);
    z localz = Oc(paramInt);
    Object localObject;
    if (paramView == null)
    {
      localObject = new aq();
      paramView = View.inflate(paramViewGroup.getContext(), 2130970614, null);
      ((aq)localObject).lBq = paramView.findViewById(2131821064);
      ((aq)localObject).gxi = ((TextView)paramView.findViewById(2131823625));
      ((aq)localObject).iqT = ((ImageView)paramView.findViewById(2131823624));
      ((aq)localObject).yKX = ((TextView)paramView.findViewById(2131827346));
      ((aq)localObject).yMM = ((SendDataToDeviceProgressBar)paramView.findViewById(2131827345));
      ((aq)localObject).yMM.setVisibility(4);
      paramView.setTag(localObject);
      paramViewGroup = (ViewGroup)localObject;
      paramViewGroup.gxi.setText(localz.eoz);
      ab.v("MicroMsg.AppInfoListAdapter", "position(%s), name(%s).", new Object[] { Integer.valueOf(paramInt), localz.eoz });
      if (localz.resId == 0)
        break label210;
      paramViewGroup.iqT.setImageResource(localz.resId);
    }
    while (true)
    {
      paramViewGroup.lBq.setTag(Integer.valueOf(paramInt));
      AppMethodBeat.o(30376);
      return paramView;
      paramViewGroup = (aq)paramView.getTag();
      break;
      label210: localObject = g.b(localz.appId, 1, com.tencent.mm.bz.a.getDensity(this.context));
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
        paramViewGroup.iqT.setImageBitmap((Bitmap)localObject);
      else
        o.ahp().a(localz.iconUrl, paramViewGroup.iqT, this.lyr);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.b
 * JD-Core Version:    0.6.2
 */