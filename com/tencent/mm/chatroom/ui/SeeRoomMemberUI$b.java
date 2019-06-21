package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class SeeRoomMemberUI$b extends BaseAdapter
{
  private List<SeeRoomMemberUI.a> cFX;
  private String ehq;
  private u eih;
  private List<String> elZ;
  public String ema;
  private boolean emb;
  private String emc;
  private List<SeeRoomMemberUI.a> emd;
  private com.tencent.mm.plugin.messenger.foundation.a.j eme;
  private Context mContext;

  public SeeRoomMemberUI$b(Context paramContext, u paramu, String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(104326);
    this.emb = false;
    this.emc = null;
    this.cFX = new ArrayList();
    this.eih = paramString1;
    this.ehq = paramList;
    this.elZ = paramString2;
    Object localObject;
    this.emc = localObject;
    this.mContext = paramu;
    this.eme = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class));
    Q(n.my(paramList));
    AppMethodBeat.o(104326);
  }

  private void kn(String paramString)
  {
    AppMethodBeat.i(104328);
    ArrayList localArrayList = new ArrayList();
    if (!bo.isNullOrNil(paramString))
    {
      Iterator localIterator = this.emd.iterator();
      while (localIterator.hasNext())
      {
        SeeRoomMemberUI.a locala = (SeeRoomMemberUI.a)localIterator.next();
        if ((locala != null) && (locala.ehM != null) && (locala.type == 1))
        {
          Object localObject = locala.ehM;
          if ((((ap)localObject).field_conRemark != null) && (((ap)localObject).field_conRemark.toUpperCase().contains(paramString.toUpperCase())))
          {
            localArrayList.add(locala);
          }
          else if ((!bo.isNullOrNil(SeeRoomMemberUI.a(this.eih, ((ap)localObject).field_username))) && (SeeRoomMemberUI.a(this.eih, ((ap)localObject).field_username).contains(paramString)))
          {
            localArrayList.add(locala);
          }
          else if ((((ad)localObject).Oi() != null) && (((ad)localObject).Oi().toUpperCase().contains(paramString.toUpperCase())))
          {
            localArrayList.add(locala);
          }
          else if ((((ad)localObject).Ht() != null) && (((ad)localObject).Ht().toUpperCase().contains(paramString.toUpperCase())))
          {
            localArrayList.add(locala);
          }
          else if ((((ad)localObject).Hq() != null) && (((ad)localObject).Hq().contains(paramString)))
          {
            localArrayList.add(locala);
          }
          else if ((((ap)localObject).field_username != null) && (((ap)localObject).field_username.contains(paramString)))
          {
            localArrayList.add(locala);
          }
          else if (!com.tencent.mm.n.a.jh(((ap)localObject).field_type))
          {
            localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XN().RB(((ap)localObject).field_username);
            if ((localObject != null) && (((bv)localObject).field_conRemark != null) && (((bv)localObject).field_conRemark.toUpperCase().contains(paramString.toUpperCase())))
              localArrayList.add(locala);
          }
        }
      }
      ab.i("MicroMsg.SeeRoomMemberUI", "[setMemberListBySearch]");
    }
    for (this.cFX = localArrayList; ; this.cFX = this.emd)
    {
      notifyDataSetChanged();
      AppMethodBeat.o(104328);
      return;
    }
  }

  public final void Q(List<String> paramList)
  {
    AppMethodBeat.i(104327);
    if (paramList == null)
      AppMethodBeat.o(104327);
    while (true)
    {
      return;
      this.cFX.clear();
      int i = 0;
      if (i < paramList.size())
      {
        ad localad = this.eme.XM().aoO((String)paramList.get(i));
        if (this.eih.aos(localad.field_username))
          this.cFX.add(new SeeRoomMemberUI.a(localad, 3));
        while (true)
        {
          i++;
          break;
          if (this.eih.aoo(localad.field_username))
            this.cFX.add(new SeeRoomMemberUI.a(localad, 2));
          else
            this.cFX.add(new SeeRoomMemberUI.a(localad, 1));
        }
      }
      Collections.sort(this.cFX, new SeeRoomMemberUI.b.1(this));
      this.cFX.add(new SeeRoomMemberUI.a(2));
      if (this.eih.JR())
        this.cFX.add(new SeeRoomMemberUI.a(3));
      this.emd = this.cFX;
      notifyDataSetChanged();
      AppMethodBeat.o(104327);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(104332);
    int i = this.cFX.size();
    AppMethodBeat.o(104332);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104330);
    View localView;
    SeeRoomMemberUI.c localc;
    String str;
    if (paramView == null)
    {
      localView = View.inflate(this.mContext, 2130970582, null);
      localc = new SeeRoomMemberUI.c((byte)0);
      localc.ejo = ((ImageView)localView.findViewById(2131822731));
      localc.emg = ((TextView)localView.findViewById(2131822733));
      paramView = (WindowManager)this.mContext.getSystemService("window");
      localc.emg.setMaxWidth(paramView.getDefaultDisplay().getWidth() * 2 / 3);
      localc.emh = ((TextView)localView.findViewById(2131827306));
      localView.setTag(localc);
      if (localc.emh != null)
        localc.emh.setVisibility(8);
      paramView = (SeeRoomMemberUI.a)this.cFX.get(paramInt);
      if ((paramView == null) || (paramView.type != 1))
        break label408;
      ad localad = paramView.ehM;
      a.b.b(localc.ejo, localad.field_username);
      str = SeeRoomMemberUI.a(this.eih, localad.field_username);
      if (bo.isNullOrNil(localad.field_conRemark))
        break label381;
      paramViewGroup = localad.field_conRemark;
      label216: paramView = paramViewGroup;
      if (bo.isNullOrNil(paramViewGroup))
        paramView = localad.Oi();
      paramViewGroup = paramView;
      if (str != null)
      {
        paramViewGroup = paramView;
        if (!str.equals(""))
        {
          paramViewGroup = paramView;
          if (!paramView.equals(str))
            paramViewGroup = str + "( " + paramView + " )";
        }
      }
      localc.emg.setVisibility(0);
      localc.emg.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, paramViewGroup, localc.emg.getTextSize()));
      if (localc.emh != null)
      {
        paramView = com.tencent.mm.openim.room.a.a.A(localad);
        if (!TextUtils.isEmpty(paramView))
          break label387;
        localc.emh.setVisibility(8);
      }
    }
    while (true)
    {
      AppMethodBeat.o(104330);
      return localView;
      localc = (SeeRoomMemberUI.c)paramView.getTag();
      localView = paramView;
      break;
      label381: paramViewGroup = str;
      break label216;
      label387: localc.emh.setVisibility(0);
      localc.emh.setText(paramView);
      continue;
      label408: if ((paramView != null) && (paramView.type == 2))
      {
        localc.emg.setVisibility(4);
        localc.ejo.setImageResource(2130837886);
      }
      else if ((paramView != null) && (paramView.type == 3))
      {
        localc.emg.setVisibility(4);
        localc.ejo.setImageResource(2130837887);
      }
    }
  }

  public final SeeRoomMemberUI.a iG(int paramInt)
  {
    AppMethodBeat.i(104329);
    SeeRoomMemberUI.a locala = (SeeRoomMemberUI.a)this.cFX.get(paramInt);
    AppMethodBeat.o(104329);
    return locala;
  }

  public final void ko(String paramString)
  {
    AppMethodBeat.i(104331);
    this.emb = true;
    this.ema = paramString;
    kn(paramString);
    AppMethodBeat.o(104331);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI.b
 * JD-Core Version:    0.6.2
 */