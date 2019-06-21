package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import java.util.List;

public final class f extends BaseAdapter
{
  private static final String mVL;
  private Context mContext;
  l rBn;

  static
  {
    AppMethodBeat.i(8849);
    mVL = b.eSn + "Game/HvMenu/";
    AppMethodBeat.o(8849);
  }

  public f(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final void b(l paraml)
  {
    AppMethodBeat.i(8845);
    this.rBn = paraml;
    notifyDataSetChanged();
    AppMethodBeat.o(8845);
  }

  public final int getCount()
  {
    AppMethodBeat.i(8846);
    int i;
    if (this.rBn == null)
    {
      i = 0;
      AppMethodBeat.o(8846);
    }
    while (true)
    {
      return i;
      i = this.rBn.size();
      AppMethodBeat.o(8846);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(8847);
    paramViewGroup = LayoutInflater.from(this.mContext).inflate(2130969748, paramViewGroup, false);
    f.a locala = new f.a(this, paramViewGroup);
    paramView = (m)this.rBn.yvT.get(paramInt);
    Object localObject1;
    if ((paramView != null) && (paramView.getItemId() != -1))
    {
      localObject1 = paramView.getTitle().toString();
      if (!bo.isNullOrNil((String)localObject1))
      {
        localObject1 = ((String)localObject1).split("__", 2);
        if (localObject1.length == 1)
        {
          locala.gsf.setText(localObject1[0]);
          paramViewGroup.setTag(paramView);
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(8847);
      return paramViewGroup;
      locala.gsf.setText(localObject1[0]);
      localObject1 = localObject1[1];
      if (((String)localObject1).startsWith("http"))
      {
        String str = mVL + g.x(((String)localObject1).getBytes());
        Object localObject2 = new c.a();
        ((c.a)localObject2).ePH = true;
        ((c.a)localObject2).ePJ = str;
        localObject2 = ((c.a)localObject2).ahG();
        a.ahv().a((String)localObject1, locala.iNr, (c)localObject2);
        break;
      }
      locala.iNr.setImageResource(ah.getResources().getIdentifier((String)localObject1, "drawable", ah.getPackageName()));
      break;
      paramViewGroup.setTag(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.f
 * JD-Core Version:    0.6.2
 */