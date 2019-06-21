package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.k;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.List;

public final class b extends BaseAdapter
{
  private Context context;
  List<k> dataList;
  int mode;

  public b(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(40715);
    this.dataList = new ArrayList();
    this.context = paramContext;
    this.mode = paramInt;
    AppMethodBeat.o(40715);
  }

  public final void aot()
  {
    AppMethodBeat.i(40719);
    this.dataList.clear();
    AppMethodBeat.o(40719);
  }

  public final int getCount()
  {
    AppMethodBeat.i(40716);
    int i = this.dataList.size();
    AppMethodBeat.o(40716);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(40717);
    Object localObject = this.dataList.get(paramInt);
    AppMethodBeat.o(40717);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(40718);
    View localView = paramView;
    if (paramView == null)
    {
      localView = v.hu(this.context).inflate(2130968578, paramViewGroup, false);
      localView.setTag(new a(localView));
    }
    a locala = (a)localView.getTag();
    k localk = (k)getItem(paramInt);
    locala.eks.setImageResource(2131230720);
    a.b.f(locala.eks, localk.vzM, 2131230720);
    locala.gne.setText(j.b(this.context, localk.title, locala.gne.getTextSize()));
    paramViewGroup = ((com.tencent.mm.plugin.messenger.a.b)g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(localk.vzM);
    if (!bo.isNullOrNil(paramViewGroup))
    {
      paramView = paramViewGroup;
      if (!paramViewGroup.endsWith("@chatroom"));
    }
    else
    {
      paramView = this.context.getString(2131296334);
    }
    locala.gnd.setText(j.b(this.context, paramView, locala.gnd.getTextSize()));
    if (this.mode == 2)
    {
      locala.gnf.setText(localk.vzY);
      locala.gng.setText(String.format("%s%s", new Object[] { Float.valueOf((float)localk.cSh / 100.0F), this.context.getString(2131296380) }));
      locala.gnh.setVisibility(0);
      if (this.mode != 2)
        break label395;
      switch (localk.state)
      {
      default:
        locala.gnh.setVisibility(4);
      case 1:
      case 2:
      }
    }
    while (true)
    {
      AppMethodBeat.o(40718);
      return localView;
      locala.gnf.setText(localk.vzV);
      break;
      locala.gnh.setText(2131296354);
      locala.gnh.setTextColor(this.context.getResources().getColor(2131689630));
      continue;
      locala.gnh.setText(2131296352);
      locala.gnh.setTextColor(this.context.getResources().getColor(2131689630));
      continue;
      label395: switch (localk.state)
      {
      default:
        locala.gnh.setVisibility(4);
        break;
      case 1:
        locala.gnh.setText(2131296353);
        locala.gnh.setTextColor(this.context.getResources().getColor(2131689630));
        break;
      case 2:
        locala.gnh.setText(2131296351);
        locala.gnh.setTextColor(this.context.getResources().getColor(2131689630));
        break;
      case 3:
        locala.gnh.setText(2131296349);
        locala.gnh.setTextColor(this.context.getResources().getColor(2131690384));
        break;
      case 4:
        locala.gnh.setText(2131296350);
        locala.gnh.setTextColor(this.context.getResources().getColor(2131690384));
      }
    }
  }

  final class a
  {
    public ImageView eks;
    public TextView gnd;
    public TextView gne;
    public TextView gnf;
    public TextView gng;
    public TextView gnh;

    public a(View arg2)
    {
      AppMethodBeat.i(40714);
      Object localObject;
      this.eks = ((ImageView)localObject.findViewById(2131820887));
      this.gnd = ((TextView)localObject.findViewById(2131820889));
      this.gne = ((TextView)localObject.findViewById(2131820890));
      this.gnf = ((TextView)localObject.findViewById(2131820891));
      this.gng = ((TextView)localObject.findViewById(2131820892));
      this.gnh = ((TextView)localObject.findViewById(2131820893));
      AppMethodBeat.o(40714);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.b
 * JD-Core Version:    0.6.2
 */