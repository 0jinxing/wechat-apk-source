package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.r;
import com.tencent.mm.n.a;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.EllipsizeTextView;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class SelectMemberUI$b extends BaseAdapter
{
  private List<SelectMemberUI.a> cFX;
  private u eih;
  private String ejD;
  public final String emJ;
  HashMap<String, Integer> emK;
  public String ema;
  private String emc;
  private List<SelectMemberUI.a> emd;
  volatile boolean isLoading;
  private Context mContext;

  public SelectMemberUI$b(SelectMemberUI paramSelectMemberUI, Context paramContext, u paramu, String paramString1, String paramString2)
  {
    AppMethodBeat.i(104419);
    this.emJ = new String(Character.toChars(91));
    this.emc = null;
    this.emd = new ArrayList(0);
    this.cFX = new ArrayList();
    this.isLoading = false;
    this.emK = new HashMap();
    this.eih = paramu;
    this.ejD = paramString1;
    this.emc = paramString2;
    this.mContext = paramContext;
    AppMethodBeat.o(104419);
  }

  private String c(ad paramad)
  {
    AppMethodBeat.i(104424);
    String str1;
    if (!bo.isNullOrNil(paramad.field_conRemark))
    {
      str1 = paramad.field_conRemark;
      if (!bo.isNullOrNil(str1))
        break label112;
      str1 = paramad.Oi();
    }
    label112: 
    while (true)
    {
      String str2 = str1;
      if (!a.jh(paramad.field_type))
      {
        paramad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XN().RB(paramad.field_username);
        str2 = str1;
        if (paramad != null)
        {
          str2 = str1;
          if (!bo.isNullOrNil(paramad.field_conRemark))
            str2 = paramad.field_conRemark;
        }
      }
      AppMethodBeat.o(104424);
      return str2;
      str1 = SelectMemberUI.a(this.eih, paramad.field_username);
      break;
    }
  }

  public final void Q(List<String> paramList)
  {
    AppMethodBeat.i(104425);
    if (paramList == null)
      AppMethodBeat.o(104425);
    while (true)
    {
      return;
      this.cFX.clear();
      int i = 0;
      if (i < paramList.size())
      {
        ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)paramList.get(i));
        if ((this.emG.Kl()) || (!r.mG(localad.field_username)))
        {
          boolean bool = localad.field_username.equals(this.emc);
          if (((!bool) || (SelectMemberUI.e(this.emG))) && (!this.emG.Ku().contains(localad.field_username)))
          {
            if ((!bool) || (!SelectMemberUI.e(this.emG)))
              break label173;
            this.cFX.add(0, new SelectMemberUI.a(this.emG, localad));
          }
        }
        while (true)
        {
          i++;
          break;
          label173: this.cFX.add(new SelectMemberUI.a(this.emG, localad));
        }
      }
      Collections.sort(this.cFX, new SelectMemberUI.b.6(this));
      this.emd = this.cFX;
      AppMethodBeat.o(104425);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(104421);
    int i;
    if ((this.cFX == null) || (this.isLoading))
    {
      i = 0;
      AppMethodBeat.o(104421);
    }
    while (true)
    {
      return i;
      i = this.cFX.size();
      AppMethodBeat.o(104421);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104423);
    Object localObject;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130970597, null);
      paramViewGroup = new SelectMemberUI.c();
      paramViewGroup.emP = ((MaskLayout)paramView.findViewById(2131827320));
      paramViewGroup.emg = ((EllipsizeTextView)paramView.findViewById(2131827321));
      paramViewGroup.emg = ((TextView)paramView.findViewById(2131827321));
      paramViewGroup.emR = ((ImageButton)paramView.findViewById(2131822735));
      paramViewGroup.emS = ((LinearLayout)paramView.findViewById(2131827323));
      localObject = (WindowManager)this.mContext.getSystemService("window");
      paramViewGroup.emg.setMaxWidth(((WindowManager)localObject).getDefaultDisplay().getWidth() * 2 / 3);
      paramViewGroup.emQ = ((TextView)paramView.findViewById(2131827322));
      paramViewGroup.emQ.setMaxWidth(((WindowManager)localObject).getDefaultDisplay().getWidth() * 2 / 3);
      paramView.setTag(paramViewGroup);
      paramViewGroup.emR.setOnClickListener(new SelectMemberUI.b.3(this, paramViewGroup));
      paramViewGroup.emS.setOnClickListener(new SelectMemberUI.b.4(this, paramViewGroup));
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(104417);
          SelectMemberUI.c localc = (SelectMemberUI.c)paramAnonymousView.getTag();
          SelectMemberUI.b.this.emG.a(paramAnonymousView, localc.position, paramAnonymousView.getId());
          AppMethodBeat.o(104417);
        }
      });
    }
    SelectMemberUI.a locala;
    while (true)
    {
      locala = iH(paramInt);
      paramViewGroup.emS.setTag(Integer.valueOf(paramInt));
      if (locala != null)
        break;
      ab.e("MicroMsg.SelectMemberAdapter", "null == item! position:%s, count:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(getCount()) });
      AppMethodBeat.o(104423);
      return paramView;
      paramViewGroup = (SelectMemberUI.c)paramView.getTag();
    }
    ad localad = locala.ehM;
    a.b.b((ImageView)paramViewGroup.emP.getContentView(), localad.field_username);
    label370: String str;
    if (localad.field_verifyFlag != 0)
      if (ao.a.flw != null)
      {
        localObject = ao.a.flw.kz(localad.field_verifyFlag);
        if (localObject != null)
        {
          localObject = com.tencent.mm.aj.m.rk((String)localObject);
          paramViewGroup.emP.a((Bitmap)localObject, MaskLayout.a.yyU);
          str = c(localad);
          localObject = "";
          if (a.jh(localad.field_type))
            localObject = localad.dul;
          if (bo.isNullOrNil((String)localObject))
            break label615;
          paramViewGroup.emQ.setVisibility(0);
          paramViewGroup.emQ.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, (CharSequence)localObject, paramViewGroup.emQ.getTextSize()));
          label439: if (!ad.aox(localad.field_username))
            break label636;
          ((b)g.K(b.class)).a(this.mContext, paramViewGroup.emg, str, localad.field_openImAppid, localad.field_descWordingId, (int)paramViewGroup.emg.getTextSize());
          label492: if (!this.emG.Kr())
            break label725;
          paramViewGroup.emR.setVisibility(0);
          paramViewGroup.emS.setVisibility(0);
          if (!this.emG.Ks().contains(localad.field_username))
            break label662;
          paramViewGroup.emS.setEnabled(false);
          paramViewGroup.emR.setEnabled(false);
          paramViewGroup.emR.setImageResource(2131231118);
        }
      }
    while (true)
    {
      paramViewGroup.emO = locala;
      paramViewGroup.position = paramInt;
      AppMethodBeat.o(104423);
      break;
      paramViewGroup.emP.setMaskDrawable(null);
      break label370;
      paramViewGroup.emP.setMaskDrawable(null);
      break label370;
      paramViewGroup.emP.setMaskDrawable(null);
      break label370;
      label615: paramViewGroup.emQ.setVisibility(8);
      paramViewGroup.emQ.setText("");
      break label439;
      label636: paramViewGroup.emg.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, str, paramViewGroup.emg.getTextSize()));
      break label492;
      label662: paramViewGroup.emS.setEnabled(true);
      paramViewGroup.emR.setEnabled(true);
      if (this.emG.emD.contains(locala.ehM.field_username))
      {
        paramViewGroup.emR.setImageResource(2131231117);
      }
      else
      {
        paramViewGroup.emR.setImageResource(2131231120);
        continue;
        label725: paramViewGroup.emR.setVisibility(8);
        paramViewGroup.emS.setVisibility(8);
      }
    }
  }

  public final SelectMemberUI.a iH(int paramInt)
  {
    AppMethodBeat.i(104422);
    SelectMemberUI.a locala;
    if (this.cFX.size() > paramInt)
    {
      locala = (SelectMemberUI.a)this.cFX.get(paramInt);
      AppMethodBeat.o(104422);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(104422);
    }
  }

  public final void kn(String paramString)
  {
    AppMethodBeat.i(104420);
    ab.i("MicroMsg.SelectMemberAdapter", "[setMemberListBySearch]");
    ArrayList localArrayList = new ArrayList();
    if (!bo.isNullOrNil(paramString))
    {
      Iterator localIterator = this.emd.iterator();
      while (localIterator.hasNext())
      {
        SelectMemberUI.a locala = (SelectMemberUI.a)localIterator.next();
        if ((locala != null) && (locala.ehM != null) && (locala.type == 1))
        {
          Object localObject = locala.ehM;
          if ((((ap)localObject).field_conRemark != null) && (((ap)localObject).field_conRemark.contains(paramString)))
          {
            localArrayList.add(locala);
          }
          else if ((!bo.isNullOrNil(SeeRoomMemberUI.a(this.eih, ((ap)localObject).field_username))) && (SeeRoomMemberUI.a(this.eih, ((ap)localObject).field_username).contains(paramString)))
          {
            localArrayList.add(locala);
          }
          else if ((((ad)localObject).Oi() != null) && (((ad)localObject).Oi().contains(paramString)))
          {
            localArrayList.add(locala);
          }
          else if ((((ad)localObject).Ht() != null) && (((ad)localObject).Ht().contains(paramString)))
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
          else if (!a.jh(((ap)localObject).field_type))
          {
            localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XN().RB(((ap)localObject).field_username);
            if ((localObject != null) && (((bv)localObject).field_conRemark != null) && (((bv)localObject).field_conRemark.contains(paramString)))
              localArrayList.add(locala);
          }
        }
      }
      this.cFX = localArrayList;
      AppMethodBeat.o(104420);
    }
    while (true)
    {
      return;
      this.cFX = this.emd;
      AppMethodBeat.o(104420);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI.b
 * JD-Core Version:    0.6.2
 */