package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SeeRoomManagerUI$b extends BaseAdapter
{
  List<SeeRoomManagerUI.a> dataList;
  private com.tencent.mm.at.a.a.c elH;
  Context mContext;

  public SeeRoomManagerUI$b(SeeRoomManagerUI paramSeeRoomManagerUI, Context paramContext)
  {
    AppMethodBeat.i(104289);
    this.dataList = new ArrayList();
    this.mContext = paramContext;
    Km();
    notifyDataSetChanged();
    paramSeeRoomManagerUI = new c.a();
    paramSeeRoomManagerUI.ePH = true;
    paramSeeRoomManagerUI.ePZ = true;
    paramSeeRoomManagerUI.ePT = 2131231172;
    this.elH = paramSeeRoomManagerUI.ahG();
    AppMethodBeat.o(104289);
  }

  private void Km()
  {
    AppMethodBeat.i(104291);
    this.dataList.clear();
    SeeRoomManagerUI.a(this.elM, ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(bo.nullAsNil(SeeRoomManagerUI.c(this.elM))));
    if (SeeRoomManagerUI.d(this.elM) == null)
      AppMethodBeat.o(104291);
    while (true)
    {
      return;
      Iterator localIterator = SeeRoomManagerUI.d(this.elM).afg().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        if (SeeRoomManagerUI.d(this.elM).aoo((String)localObject))
        {
          ab.i("MicroMsg.SeeRoomManagerUI", "[resetData] Room Manager:%s", new Object[] { localObject });
          localObject = ((j)g.K(j.class)).XM().aoO((String)localObject);
          this.dataList.add(new SeeRoomManagerUI.a(this.elM, 1, (ad)localObject));
        }
      }
      if (r.Yz().equals(SeeRoomManagerUI.d(this.elM).field_roomowner))
      {
        this.dataList.add(new SeeRoomManagerUI.a(this.elM, 2, null));
        if (this.dataList.size() > 1)
          this.dataList.add(new SeeRoomManagerUI.a(this.elM, 3, null));
      }
      AppMethodBeat.o(104291);
    }
  }

  private SeeRoomManagerUI.a iF(int paramInt)
  {
    AppMethodBeat.i(104293);
    SeeRoomManagerUI.a locala = (SeeRoomManagerUI.a)this.dataList.get(paramInt);
    AppMethodBeat.o(104293);
    return locala;
  }

  public final int getCount()
  {
    AppMethodBeat.i(104292);
    int i = this.dataList.size();
    AppMethodBeat.o(104292);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104294);
    View localView;
    if (paramView == null)
    {
      localView = View.inflate(this.mContext, 2130970531, null);
      paramViewGroup = this.elM.ce(localView);
    }
    while (true)
    {
      paramView = iF(paramInt);
      if (paramView != null)
        break;
      ab.e("MicroMsg.SeeRoomManagerUI", "null == item! position:%s, count:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(getCount()) });
      AppMethodBeat.o(104294);
      return localView;
      SeeRoomManagerUI.c localc = (SeeRoomManagerUI.c)paramView.getTag();
      paramViewGroup = localc;
      localView = paramView;
      if (localc == null)
      {
        paramViewGroup = this.elM.ce(paramView);
        localView = paramView;
      }
    }
    if (paramView.type == 1)
    {
      paramViewGroup.elJ.setVisibility(0);
      paramView = paramView.ehM;
      paramViewGroup.elJ.setText(SeeRoomManagerUI.a(this.elM, paramView.field_username, paramViewGroup.elJ));
      a.b.b(paramViewGroup.ejo, paramView.field_username);
    }
    while (true)
    {
      localView.setOnClickListener(new SeeRoomManagerUI.b.2(this, paramInt));
      AppMethodBeat.o(104294);
      break;
      if (paramView.type == 2)
      {
        paramViewGroup.elJ.setVisibility(4);
        paramViewGroup.ejo.setImageResource(2130837886);
      }
      else if (paramView.type == 3)
      {
        paramViewGroup.elJ.setVisibility(4);
        paramViewGroup.ejo.setImageResource(2130837887);
      }
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(104290);
    super.notifyDataSetChanged();
    SeeRoomManagerUI.b(this.elM).post(new SeeRoomManagerUI.b.1(this));
    AppMethodBeat.o(104290);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomManagerUI.b
 * JD-Core Version:    0.6.2
 */