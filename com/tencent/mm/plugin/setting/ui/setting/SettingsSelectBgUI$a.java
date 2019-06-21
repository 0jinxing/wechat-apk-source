package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.a;
import com.tencent.mm.ba.m;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.p;

final class SettingsSelectBgUI$a extends p<m>
{
  private Context context;
  private int itemWidth;

  public SettingsSelectBgUI$a(SettingsSelectBgUI paramSettingsSelectBgUI, Context paramContext, int paramInt)
  {
    super(paramContext, new m());
    AppMethodBeat.i(127474);
    this.context = paramContext;
    this.itemWidth = paramInt;
    AppMethodBeat.o(127474);
  }

  public final void KC()
  {
    AppMethodBeat.i(127477);
    setCursor(r.aix().ait());
    super.notifyDataSetChanged();
    AppMethodBeat.o(127477);
  }

  public final void KD()
  {
    AppMethodBeat.i(127476);
    KC();
    AppMethodBeat.o(127476);
  }

  public final int getCount()
  {
    AppMethodBeat.i(127475);
    int i = getCursor().getCount();
    AppMethodBeat.o(127475);
    return i + 2;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(127478);
    int i;
    a locala;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130970643, null);
      paramView.setLayoutParams(new AbsListView.LayoutParams(this.itemWidth, this.itemWidth));
      paramViewGroup = new b();
      paramViewGroup.qqB = ((LinearLayout)paramView.findViewById(2131827419));
      paramViewGroup.qqC = ((LinearLayout)paramView.findViewById(2131827422));
      paramViewGroup.qqD = ((LinearLayout)paramView.findViewById(2131827423));
      paramViewGroup.qqE = ((LinearLayout)paramView.findViewById(2131827424));
      paramViewGroup.qqF = ((LinearLayout)paramView.findViewById(2131827425));
      paramView.setTag(paramViewGroup);
      i = bo.a((Integer)g.RP().Ry().get(12311, null), -2);
      locala = r.aiy().sU(SettingsSelectBgUI.f(this.qoV));
      if (paramInt != 0)
        break label278;
      if (((!SettingsSelectBgUI.c(this.qoV)) || (i != -2)) && ((SettingsSelectBgUI.c(this.qoV)) || (i != -2) || (locala != null)) && ((locala == null) || (locala.fLV != -2)))
        break label269;
      paramViewGroup.WA("using");
    }
    while (true)
    {
      paramViewGroup = d.a(BitmapFactory.decodeResource(this.context.getResources(), 2130838255), true, 10.0F);
      ((ImageView)paramView.findViewById(2131827418)).setImageBitmap(paramViewGroup);
      AppMethodBeat.o(127478);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      label269: paramViewGroup.WA("downloaded");
    }
    label278: if (paramInt == 1)
    {
      if (((SettingsSelectBgUI.c(this.qoV)) && (i == 0)) || ((!SettingsSelectBgUI.c(this.qoV)) && (i == 0) && (locala == null)) || ((locala != null) && (locala.fLV == 0)))
        paramViewGroup.WA("using");
      while (true)
      {
        paramViewGroup = d.a(BitmapFactory.decodeResource(this.context.getResources(), 2130838254), true, 10.0F);
        ((ImageView)paramView.findViewById(2131827418)).setImageBitmap(paramViewGroup);
        AppMethodBeat.o(127478);
        break;
        paramViewGroup.WA("downloaded");
      }
    }
    m localm = (m)getItem(paramInt - 2);
    r.aix();
    if (!g.RP().isSDCardAvailable());
    for (Bitmap localBitmap = BitmapFactory.decodeResource(this.qoV.getResources(), 2130839708); ; localBitmap = d.aml(n.aiu() + n.cw(localm.id, localm.cBc)))
    {
      if (localBitmap != null)
        break label478;
      AppMethodBeat.o(127478);
      break;
    }
    label478: localBitmap = d.a(localBitmap, true, 10.0F);
    ((ImageView)paramView.findViewById(2131827418)).setImageBitmap(localBitmap);
    switch (localm.status)
    {
    default:
    case 3:
    case 2:
    case 5:
    case 1:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(127478);
      break;
      paramViewGroup.WA("downloading");
      continue;
      if ((!SettingsSelectBgUI.c(this.qoV)) && (locala != null) && (locala.fLV == localm.id))
      {
        paramViewGroup.WA("using");
      }
      else
      {
        paramViewGroup.WA("downloaded");
        continue;
        paramViewGroup.WA("undownloaded");
        continue;
        if ((!SettingsSelectBgUI.c(this.qoV)) && (locala != null) && (locala.fLV != localm.id))
        {
          paramViewGroup.WA("downloaded");
        }
        else
        {
          paramViewGroup.WA("using");
          continue;
          paramViewGroup.WA("canceling");
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI.a
 * JD-Core Version:    0.6.2
 */