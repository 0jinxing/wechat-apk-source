package com.tencent.mm.plugin.game.ui.tab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.plugin.game.model.GameTabData;
import com.tencent.mm.plugin.game.model.GameTabData.TabItem;
import com.tencent.mm.plugin.game.model.aj;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class a extends BaseAdapter
{
  private Context mContext;
  private GameTabData nng;
  private String nnh;

  public a(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final void a(GameTabData paramGameTabData, String paramString)
  {
    AppMethodBeat.i(112233);
    this.nng = paramGameTabData;
    this.nnh = paramString;
    notifyDataSetChanged();
    AppMethodBeat.o(112233);
  }

  public final int getCount()
  {
    AppMethodBeat.i(112234);
    int i;
    if (this.nng == null)
    {
      i = 0;
      AppMethodBeat.o(112234);
    }
    while (true)
    {
      return i;
      i = this.nng.getItemList().size();
      AppMethodBeat.o(112234);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(112235);
    View localView = LayoutInflater.from(this.mContext).inflate(2130969786, paramViewGroup, false);
    paramViewGroup = new a.a(this, localView);
    paramView = (GameTabData.TabItem)this.nng.getItemList().get(paramInt);
    Object localObject;
    c.a locala;
    if (paramView != null)
    {
      paramViewGroup.gsf.setText(paramView.title);
      if (!bo.nullAsNil(this.nnh).equalsIgnoreCase(paramView.mYp))
        break label181;
      if (!bo.isNullOrNil(paramView.mYv))
      {
        localObject = aj.mYz + g.x(paramView.mYv.getBytes());
        locala = new c.a();
        locala.ePH = true;
        locala.ePJ = ((String)localObject);
        localObject = locala.ahG();
        com.tencent.mm.at.a.a.ahv().a(paramView.mYv, paramViewGroup.iNr, (c)localObject);
      }
    }
    while (true)
    {
      localView.setTag(paramView);
      AppMethodBeat.o(112235);
      return localView;
      label181: if (!bo.isNullOrNil(paramView.mYu))
      {
        localObject = aj.mYz + g.x(paramView.mYu.getBytes());
        locala = new c.a();
        locala.ePH = true;
        locala.ePJ = ((String)localObject);
        localObject = locala.ahG();
        com.tencent.mm.at.a.a.ahv().a(paramView.mYu, paramViewGroup.iNr, (c)localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.a
 * JD-Core Version:    0.6.2
 */