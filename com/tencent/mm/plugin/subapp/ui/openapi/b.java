package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import java.util.List;

public final class b extends BaseAdapter
  implements k.a
{
  private Context context;
  private List<f> qnw;
  boolean suv = false;

  public b(Context paramContext, List<f> paramList)
  {
    this.context = paramContext;
    this.qnw = paramList;
  }

  private int bFs()
  {
    AppMethodBeat.i(25469);
    int i = getRealCount();
    AppMethodBeat.o(25469);
    return (4 - i % 4) % 4;
  }

  private int getRealCount()
  {
    AppMethodBeat.i(25468);
    int i = this.qnw.size();
    AppMethodBeat.o(25468);
    return i;
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(25470);
    notifyDataSetChanged();
    AppMethodBeat.o(25470);
  }

  public final int getCount()
  {
    AppMethodBeat.i(25465);
    int i = getRealCount();
    int j = bFs();
    AppMethodBeat.o(25465);
    return i + j;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(25467);
    Object localObject;
    if (wK(paramInt))
    {
      localObject = null;
      AppMethodBeat.o(25467);
    }
    while (true)
    {
      return localObject;
      localObject = this.qnw.get(paramInt);
      AppMethodBeat.o(25467);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(25464);
    if (paramView == null)
    {
      paramViewGroup = new c();
      paramView = View.inflate(this.context, 2130968753, null);
      paramViewGroup.iyo = ((ImageView)paramView.findViewById(2131821444));
      paramViewGroup.suQ = ((TextView)paramView.findViewById(2131821445));
      paramViewGroup.gtb = ((TextView)paramView.findViewById(2131821447));
      paramViewGroup.suR = paramView.findViewById(2131821446);
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      paramViewGroup.suR.setVisibility(4);
      if (!wK(paramInt))
        break;
      paramViewGroup.iyo.setVisibility(4);
      paramViewGroup.suQ.setVisibility(4);
      paramViewGroup.gtb.setVisibility(4);
      AppMethodBeat.o(25464);
      return paramView;
      paramViewGroup = (c)paramView.getTag();
    }
    f localf = (f)getItem(paramInt);
    paramViewGroup.iyo.setVisibility(0);
    Bitmap localBitmap = g.b(localf.field_appId, 5, a.getDensity(this.context));
    if (localBitmap == null)
    {
      paramViewGroup.iyo.setBackgroundResource(2130837795);
      label192: paramViewGroup.gtb.setVisibility(0);
      paramViewGroup.gtb.setText(g.b(this.context, localf, null));
      if (!this.suv)
        break label260;
      paramViewGroup.suQ.setVisibility(0);
    }
    while (true)
    {
      AppMethodBeat.o(25464);
      break;
      paramViewGroup.iyo.setBackgroundDrawable(new BitmapDrawable(localBitmap));
      break label192;
      label260: paramViewGroup.suQ.setVisibility(8);
    }
  }

  public final void lX(boolean paramBoolean)
  {
    AppMethodBeat.i(25463);
    this.suv = paramBoolean;
    notifyDataSetChanged();
    AppMethodBeat.o(25463);
  }

  public final boolean wK(int paramInt)
  {
    AppMethodBeat.i(25466);
    int i = this.qnw.size();
    boolean bool;
    if ((paramInt >= i) && (paramInt < i + bFs()))
    {
      bool = true;
      AppMethodBeat.o(25466);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25466);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.b
 * JD-Core Version:    0.6.2
 */