package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.m;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class h extends p<com.tencent.mm.plugin.ipcall.a.g.c>
  implements d.a
{
  private static HashMap<String, com.tencent.mm.plugin.ipcall.a.g.c> nzw = null;
  private boolean jLC;
  private d nAw;
  private HashMap<Long, com.tencent.mm.plugin.ipcall.a.g.c> nAx;
  private HashSet<String> nAy;
  private boolean nAz;
  ArrayList<k> nDZ;
  private View.OnClickListener nEa;

  public h(Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(22240);
    this.nAx = new HashMap();
    this.nAy = new HashSet();
    this.nAz = false;
    this.jLC = false;
    this.nEa = new h.1(this);
    pN(true);
    this.nAw = new d(paramContext);
    o.acd().a(this);
    AppMethodBeat.o(22240);
  }

  public final void KC()
  {
    AppMethodBeat.i(138615);
    this.nDZ = m.bIb();
    AppMethodBeat.o(138615);
  }

  public final void KD()
  {
    AppMethodBeat.i(138171);
    this.nDZ = m.bIb();
    AppMethodBeat.o(138171);
  }

  public final int getCount()
  {
    AppMethodBeat.i(22243);
    if (this.nDZ == null)
      this.nDZ = m.bIb();
    int i;
    if (this.nDZ != null)
    {
      i = this.nDZ.size();
      AppMethodBeat.o(22243);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(22243);
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(22246);
    paramInt = super.getItemViewType(paramInt);
    AppMethodBeat.o(22246);
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22245);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.context).inflate(2130969894, paramViewGroup, false);
      paramView = new h.a(this, (byte)0);
      paramView.nAM = localView.findViewById(2131825131);
      paramView.nAN = localView.findViewById(2131825132);
      paramView.eks = ((ImageView)localView.findViewById(2131821183));
      paramView.gtO = ((TextView)localView.findViewById(2131823149));
      paramView.nAE = ((TextView)localView.findViewById(2131825079));
      paramView.nAF = ((LinearLayout)localView.findViewById(2131825135));
      paramView.nAG = ((TextView)localView.findViewById(2131825136));
      paramView.nAH = ((TextView)localView.findViewById(2131825137));
      paramView.nAI = ((TextView)localView.findViewById(2131825130));
      paramView.nAJ = ((TextView)localView.findViewById(2131825129));
      paramView.nAK = ((ImageView)localView.findViewById(2131825138));
      paramView.nAL = localView.findViewById(2131825134);
      paramView.nAL.setClickable(true);
      paramView.nAO = ((ImageView)localView.findViewById(2131821128));
      localView.setTag(paramView);
    }
    h.a locala = (h.a)localView.getTag();
    locala.nAL.setClickable(true);
    locala.nAL.setTag(Integer.valueOf(paramInt));
    locala.nAO.setVisibility(8);
    if (wK(paramInt))
    {
      locala.gtO.setVisibility(8);
      locala.nAE.setVisibility(8);
      locala.nAF.setVisibility(8);
      locala.eks.setVisibility(8);
      locala.eks.setTag(null);
      locala.nAJ.setVisibility(8);
      locala.nAI.setVisibility(8);
      locala.nAK.setVisibility(8);
      AppMethodBeat.o(22245);
      return localView;
    }
    k localk = xt(paramInt);
    if (localk != null)
    {
      if (paramInt != 0)
        break label808;
      locala.nAJ.setVisibility(0);
      locala.nAI.setVisibility(8);
      locala.nAJ.setText(this.context.getString(2131300756));
      label415: locala.nAO.setVisibility(0);
      locala.gtO.setVisibility(0);
      paramView = (FrameLayout.LayoutParams)locala.nAM.getLayoutParams();
      paramView.height = ((int)locala.nAE.getContext().getResources().getDimension(2131427405));
      locala.nAM.setLayoutParams(paramView);
      paramView = (RelativeLayout.LayoutParams)locala.eks.getLayoutParams();
      paramView.height = ((int)locala.eks.getContext().getResources().getDimension(2131427491));
      paramView.width = ((int)locala.eks.getContext().getResources().getDimension(2131427491));
      locala.eks.setLayoutParams(paramView);
      if (localk.field_addressId <= 0L)
        break label846;
      if (!this.nAx.containsKey(Long.valueOf(localk.field_addressId)))
        break label831;
      paramView = (com.tencent.mm.plugin.ipcall.a.g.c)this.nAx.get(Long.valueOf(localk.field_addressId));
      label588: paramViewGroup = paramView;
      if (paramView != null)
      {
        this.nAx.put(Long.valueOf(localk.field_addressId), paramView);
        locala.gtO.setText(paramView.field_systemAddressBookUsername);
        paramViewGroup = paramView;
      }
      label625: locala.nAE.setVisibility(8);
      locala.nAF.setVisibility(0);
      locala.nAH.setText(com.tencent.mm.plugin.ipcall.b.c.iY(localk.field_calltime));
      if (localk.field_duration <= 0L)
        break label867;
      locala.nAG.setText(com.tencent.mm.plugin.ipcall.b.c.jc(localk.field_duration));
      label686: paramView = locala.eks;
      if (paramView != null)
      {
        paramView.setVisibility(0);
        paramView.setTag(null);
        paramView.setImageResource(2130839123);
        if (paramViewGroup != null)
        {
          if ((bo.isNullOrNil(paramViewGroup.field_contactId)) || (bo.isNullOrNil(paramViewGroup.field_wechatUsername)))
            break label886;
          this.nAw.a(paramViewGroup.field_contactId, paramViewGroup.field_wechatUsername, paramView);
        }
      }
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramViewGroup.field_wechatUsername))
        this.nAy.add(paramViewGroup.field_wechatUsername);
      locala.nAL.setVisibility(0);
      locala.nAK.setVisibility(0);
      locala.nAL.setOnClickListener(this.nEa);
      break;
      label808: locala.nAJ.setVisibility(8);
      locala.nAI.setVisibility(8);
      break label415;
      label831: paramView = i.bHw().iU(localk.field_addressId);
      break label588;
      label846: locala.gtO.setText(a.Pw(localk.field_phonenumber));
      paramViewGroup = null;
      break label625;
      label867: locala.nAG.setText(com.tencent.mm.plugin.ipcall.b.c.xy(localk.field_status));
      break label686;
      label886: if (!bo.isNullOrNil(paramViewGroup.field_contactId))
        this.nAw.c(paramViewGroup.field_contactId, paramView);
      else if (!bo.isNullOrNil(paramViewGroup.field_wechatUsername))
        this.nAw.e(paramViewGroup.field_wechatUsername, paramView);
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(22247);
    int i = super.getViewTypeCount();
    AppMethodBeat.o(22247);
    return i;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(22249);
    this.nDZ = m.bIb();
    this.nAx.clear();
    super.notifyDataSetChanged();
    AppMethodBeat.o(22249);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(22248);
    if (this.nAy.contains(paramString))
      al.d(new h.2(this));
    AppMethodBeat.o(22248);
  }

  public final k xt(int paramInt)
  {
    AppMethodBeat.i(22244);
    k localk = (k)this.nDZ.get(paramInt);
    AppMethodBeat.o(22244);
    return localk;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.h
 * JD-Core Version:    0.6.2
 */