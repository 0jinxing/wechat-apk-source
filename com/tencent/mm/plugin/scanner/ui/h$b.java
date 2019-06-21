package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.scanner.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class h$b extends BaseAdapter
  implements x.a
{
  private LayoutInflater mInflater;
  private Map<String, WeakReference<ImageView>> qcI;
  private int qcL;
  private List<a.a> qcM;

  public h$b(h paramh)
  {
    AppMethodBeat.i(81063);
    this.qcM = new ArrayList();
    this.qcI = new HashMap();
    this.mInflater = null;
    this.mInflater = LayoutInflater.from(h.a(paramh));
    x.a(this);
    this.qcL = h.a(paramh).getResources().getColor(2131690154);
    AppMethodBeat.o(81063);
  }

  public final int getCount()
  {
    AppMethodBeat.i(81065);
    int i = this.qcM.size();
    AppMethodBeat.o(81065);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(81066);
    Object localObject = this.qcM.get(paramInt);
    AppMethodBeat.o(81066);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(81067);
    a.a locala;
    Object localObject;
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130970386, paramViewGroup, false);
      paramViewGroup = new h.b.a(this);
      paramViewGroup.qaL = ((ImageView)paramView.findViewById(2131826580));
      paramViewGroup.kEq = ((TextView)paramView.findViewById(2131826581));
      paramView.setTag(paramViewGroup);
      locala = (a.a)this.qcM.get(paramInt);
      localObject = x.a(new h.a(locala.iconUrl));
      if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
        break label217;
      paramViewGroup.qaL.setImageBitmap((Bitmap)localObject);
      paramViewGroup.qaL.setBackgroundColor(0);
    }
    while (true)
    {
      localObject = locala.pZp;
      paramViewGroup.qaL.setOnClickListener(new h.b.1(this, (String)localObject, locala));
      paramViewGroup.qaL.setTag(locala.iconUrl);
      this.qcI.put(locala.iconUrl, new WeakReference(paramViewGroup.qaL));
      paramViewGroup.kEq.setText(locala.name);
      AppMethodBeat.o(81067);
      return paramView;
      paramViewGroup = (h.b.a)paramView.getTag();
      break;
      label217: paramViewGroup.qaL.setBackgroundColor(this.qcL);
      paramViewGroup.qaL.setImageBitmap(null);
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(81068);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()) && (!bo.isNullOrNil(paramString)))
    {
      ab.v("MicroMsg.ProductGridPreference", "On get pic, notifyKey=".concat(String.valueOf(paramString)));
      if ((WeakReference)this.qcI.get(paramString) != null)
      {
        ImageView localImageView = (ImageView)((WeakReference)this.qcI.get(paramString)).get();
        if ((localImageView != null) && (paramString.equals((String)localImageView.getTag())))
          al.d(new h.b.2(this, localImageView, paramBitmap));
      }
    }
    AppMethodBeat.o(81068);
  }

  public final void setItemList(List<a.a> paramList)
  {
    AppMethodBeat.i(81064);
    this.qcI.clear();
    this.qcM.clear();
    this.qcM = paramList;
    notifyDataSetChanged();
    AppMethodBeat.o(81064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.h.b
 * JD-Core Version:    0.6.2
 */