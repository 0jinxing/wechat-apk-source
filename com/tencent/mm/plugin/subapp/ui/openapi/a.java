package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class a extends BaseAdapter
  implements k.a
{
  private Context context;
  private List<f> qnw;
  boolean suv;
  private int suw;

  public a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(25429);
    this.suv = false;
    this.suw = 0;
    this.context = paramContext;
    this.suw = paramInt;
    init();
    AppMethodBeat.o(25429);
  }

  private int bFs()
  {
    AppMethodBeat.i(25437);
    int i = getRealCount();
    AppMethodBeat.o(25437);
    return (4 - i % 4) % 4;
  }

  private int getRealCount()
  {
    AppMethodBeat.i(25436);
    int i = this.qnw.size();
    AppMethodBeat.o(25436);
    return i;
  }

  private void init()
  {
    int i = 0;
    AppMethodBeat.i(25430);
    this.qnw = new ArrayList();
    Object localObject1 = am.bYJ();
    int j = this.suw;
    Object localObject2 = ((i)localObject1).rawQuery("select * from AppInfo where status = " + j + " and (appType is null or appType not like ',1,')", new String[0]);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      ab.e("MicroMsg.AppInfoStorage", "getAppByStatusExcludeByType: curosr is null");
      localObject1 = null;
    }
    if (localObject1 != null)
    {
      j = ((Cursor)localObject1).getCount();
      while (i < j)
      {
        ((Cursor)localObject1).moveToPosition(i);
        localObject2 = new f();
        ((f)localObject2).d((Cursor)localObject1);
        if (g.u(this.context, ((f)localObject2).field_appId))
          this.qnw.add(localObject2);
        i++;
      }
      ((Cursor)localObject1).close();
    }
    AppMethodBeat.o(25430);
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(25438);
    init();
    super.notifyDataSetChanged();
    AppMethodBeat.o(25438);
  }

  public final int getCount()
  {
    AppMethodBeat.i(25433);
    int i = getRealCount();
    int j = bFs();
    AppMethodBeat.o(25433);
    return i + j;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(25435);
    Object localObject;
    if (wK(paramInt))
    {
      localObject = null;
      AppMethodBeat.o(25435);
    }
    while (true)
    {
      return localObject;
      localObject = this.qnw.get(paramInt);
      AppMethodBeat.o(25435);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(25432);
    if (paramView == null)
    {
      paramViewGroup = new d();
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
      AppMethodBeat.o(25432);
      return paramView;
      paramViewGroup = (d)paramView.getTag();
    }
    f localf = (f)getItem(paramInt);
    paramViewGroup.iyo.setVisibility(0);
    Bitmap localBitmap = g.b(localf.field_appId, 1, com.tencent.mm.bz.a.getDensity(this.context));
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
      AppMethodBeat.o(25432);
      break;
      paramViewGroup.iyo.setBackgroundDrawable(new BitmapDrawable(localBitmap));
      break label192;
      label260: paramViewGroup.suQ.setVisibility(8);
    }
  }

  public final void lX(boolean paramBoolean)
  {
    AppMethodBeat.i(25431);
    this.suv = paramBoolean;
    notifyDataSetChanged();
    AppMethodBeat.o(25431);
  }

  public final boolean wK(int paramInt)
  {
    AppMethodBeat.i(25434);
    int i = this.qnw.size();
    boolean bool;
    if ((paramInt >= i) && (paramInt < i + bFs()))
    {
      bool = true;
      AppMethodBeat.o(25434);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25434);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.a
 * JD-Core Version:    0.6.2
 */