package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.e.a.a;
import com.tencent.mm.plugin.game.model.n.f;
import com.tencent.mm.plugin.game.model.n.g;
import com.tencent.mm.plugin.game.model.n.h;
import com.tencent.mm.plugin.game.model.n.i;
import com.tencent.mm.plugin.game.model.o.a;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.p.a;
import java.util.LinkedList;
import java.util.Map;

public final class n extends com.tencent.mm.ui.p<com.tencent.mm.plugin.game.model.n>
{
  private static w nkH;
  private int csm;
  private int enb;
  private int kmW;
  private Context mContext;
  private int mXC;
  private View.OnClickListener nkI;
  private View.OnClickListener nkJ;
  private v nkK;
  private v nkL;
  private long nkM;
  private int nkN;
  private com.tencent.mm.plugin.game.model.o nkO;
  private f<String, Bitmap> nkP;

  public n(Context paramContext, com.tencent.mm.plugin.game.model.n paramn, int paramInt)
  {
    super(paramContext, paramn);
    AppMethodBeat.i(112068);
    this.kmW = 15;
    this.enb = 0;
    this.csm = 0;
    this.nkM = 0L;
    this.mXC = 0;
    this.nkN = 0;
    this.mContext = paramContext;
    this.mXC = paramInt;
    paramn = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY();
    String str = r.v(new int[] { 2, 5, 6, 10, 11, 100 });
    paramn = paramn.rawQuery("select count(*) from GameRawMessage where " + str + " and showInMsgList = 1 and isHidden = 0", new String[0]);
    if (paramn == null)
    {
      this.enb = i;
      this.csm = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().bEw();
      nkH = new w();
      this.nkI = new o(paramContext, paramInt);
      this.nkJ = new p(paramContext, paramInt);
      this.nkK = new v(paramContext);
      this.nkK.em(paramInt, 1);
      this.nkL = new v(paramContext);
      this.nkL.em(paramInt, 2);
      this.nkO = new com.tencent.mm.plugin.game.model.o(paramContext, this.mXC);
      int j = com.tencent.mm.plugin.game.f.c.getScreenWidth(this.mContext);
      i = this.mContext.getResources().getDimensionPixelSize(2131427738);
      int k = this.mContext.getResources().getDimensionPixelSize(2131427510);
      paramInt = this.mContext.getResources().getDimensionPixelSize(2131427796);
      this.nkN = (a.ao(this.mContext, j - k * 2 - i - paramInt) / 34);
      this.nkP = new com.tencent.mm.memory.a.b(30, getClass());
      AppMethodBeat.o(112068);
      return;
    }
    if (paramn.moveToFirst());
    for (i = paramn.getInt(0); ; i = 0)
    {
      paramn.close();
      break;
    }
  }

  private static com.tencent.mm.plugin.game.model.n a(com.tencent.mm.plugin.game.model.n paramn, Cursor paramCursor)
  {
    AppMethodBeat.i(112077);
    com.tencent.mm.plugin.game.model.n localn = paramn;
    if (paramn == null)
      localn = new com.tencent.mm.plugin.game.model.n();
    localn.d(paramCursor);
    AppMethodBeat.o(112077);
    return localn;
  }

  private void a(com.tencent.mm.plugin.game.model.n paramn, n.a parama)
  {
    AppMethodBeat.i(112070);
    LinkedList localLinkedList = new LinkedList();
    for (int i = 1; i < paramn.mWp.size(); i++)
      localLinkedList.add(paramn.mWp.get(i));
    parama.nld.a(paramn, localLinkedList, this.nkN, this.mXC, this.nkP);
    AppMethodBeat.o(112070);
  }

  private void d(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(112071);
    if (bo.isNullOrNil(paramString))
    {
      a.b.b(paramImageView, paramString);
      AppMethodBeat.o(112071);
    }
    while (true)
    {
      return;
      if (!this.nkP.aj(paramString))
      {
        e(paramImageView, paramString);
        AppMethodBeat.o(112071);
      }
      else
      {
        Bitmap localBitmap = (Bitmap)this.nkP.get(paramString);
        if ((localBitmap == null) || (localBitmap.isRecycled()))
        {
          e(paramImageView, paramString);
          AppMethodBeat.o(112071);
        }
        else
        {
          paramImageView.setImageBitmap(localBitmap);
          AppMethodBeat.o(112071);
        }
      }
    }
  }

  private void e(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(112072);
    paramImageView = e.bFH().j(paramImageView, paramString);
    if (paramImageView != null)
      this.nkP.put(paramString, paramImageView);
    AppMethodBeat.o(112072);
  }

  private void f(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(112073);
    Bitmap localBitmap;
    if (this.nkP.aj(paramString))
    {
      localBitmap = (Bitmap)this.nkP.get(paramString);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        g(paramImageView, paramString);
        AppMethodBeat.o(112073);
      }
    }
    while (true)
    {
      return;
      paramImageView.setImageBitmap(localBitmap);
      AppMethodBeat.o(112073);
      continue;
      g(paramImageView, paramString);
      AppMethodBeat.o(112073);
    }
  }

  private void g(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(112074);
    e.a.a locala = new e.a.a();
    locala.ePF = false;
    e.bFH().a(paramImageView, paramString, locala.bFI(), new n.1(this, paramString));
    AppMethodBeat.o(112074);
  }

  private com.tencent.mm.plugin.game.model.n wL(int paramInt)
  {
    AppMethodBeat.i(112080);
    com.tencent.mm.plugin.game.model.n localn;
    if (wK(paramInt))
    {
      localn = (com.tencent.mm.plugin.game.model.n)this.ylb;
      AppMethodBeat.o(112080);
    }
    while (true)
    {
      return localn;
      if (this.yld != null)
      {
        localn = (com.tencent.mm.plugin.game.model.n)this.yld.get(Integer.valueOf(paramInt));
        if (localn != null)
          AppMethodBeat.o(112080);
      }
      else
      {
        if (wM(paramInt));
        for (int i = paramInt - 1; ; i = paramInt)
        {
          if ((paramInt >= 0) && (getCursor().moveToPosition(i)))
            break label112;
          AppMethodBeat.o(112080);
          localn = null;
          break;
        }
        label112: if (this.yld == null)
        {
          localn = a((com.tencent.mm.plugin.game.model.n)this.ylb, getCursor());
          AppMethodBeat.o(112080);
        }
        else
        {
          localn = a(null, getCursor());
          this.yld.put(Integer.valueOf(paramInt), localn);
          AppMethodBeat.o(112080);
        }
      }
    }
  }

  private boolean wM(int paramInt)
  {
    if ((this.enb > this.csm) && (this.csm > 0) && (paramInt > this.csm));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void KC()
  {
    AppMethodBeat.i(112075);
    r localr = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY();
    int i = this.kmW;
    String str = r.v(new int[] { 2, 5, 6, 10, 11, 100 });
    setCursor(localr.rawQuery("select * from GameRawMessage where " + str + " and showInMsgList = 1 and isHidden = 0 order by isRead, createTime desc limit " + i, new String[0]));
    this.kmW = getCount();
    if (this.yle != null)
      this.yle.apt();
    super.notifyDataSetChanged();
    AppMethodBeat.o(112075);
  }

  public final void KD()
  {
    AppMethodBeat.i(112076);
    bIf();
    KC();
    AppMethodBeat.o(112076);
  }

  public final void bFr()
  {
    AppMethodBeat.i(112078);
    if (bdn())
    {
      if (this.yle != null)
        this.yle.apt();
      AppMethodBeat.o(112078);
    }
    while (true)
    {
      return;
      this.kmW += 15;
      if (this.kmW > this.enb)
        this.kmW = this.enb;
      AppMethodBeat.o(112078);
    }
  }

  public final int bFs()
  {
    if ((this.enb > this.csm) && (this.csm > 0));
    for (int i = 1; ; i = 0)
      return i;
  }

  public final boolean bdn()
  {
    if (this.kmW >= this.enb);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int getCount()
  {
    AppMethodBeat.i(112079);
    if (this.count < 0)
      this.count = getCursor().getCount();
    int i;
    if (this.count <= 0)
    {
      i = 0;
      AppMethodBeat.o(112079);
    }
    while (true)
    {
      return i;
      i = this.count + bFs();
      AppMethodBeat.o(112079);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(112069);
    n.a locala;
    View localView;
    com.tencent.mm.plugin.game.model.n localn;
    if (paramView == null)
    {
      locala = new n.a();
      localView = View.inflate(this.context, 2130969755, null);
      locala.nkS = ((ImageView)localView.findViewById(2131821226));
      locala.nkR = ((LinearLayout)localView.findViewById(2131824055));
      locala.nkT = ((LinearLayout)localView.findViewById(2131824572));
      locala.ejp = ((TextView)localView.findViewById(2131823149));
      locala.nkU = ((ImageView)localView.findViewById(2131824382));
      locala.iqU = ((TextView)localView.findViewById(2131823800));
      locala.nkV = ((TextView)localView.findViewById(2131824573));
      locala.nkW = ((LinearLayout)localView.findViewById(2131824575));
      locala.nkX = ((TextView)localView.findViewById(2131824577));
      locala.nkY = ((ImageView)localView.findViewById(2131824576));
      locala.nkZ = ((ImageView)localView.findViewById(2131824578));
      locala.nla = ((TextView)localView.findViewById(2131824579));
      locala.nlb = ((TextView)localView.findViewById(2131824580));
      locala.nld = ((GameMessageListContainerView)localView.findViewById(2131824574));
      locala.nlc = ((LinearLayout)localView.findViewById(2131824581));
      localView.setTag(locala);
      localn = wL(paramInt);
      if ((localn == null) || (!localn.mXf))
        break label342;
      locala.nkR.setVisibility(8);
      locala.nlc.setVisibility(0);
    }
    label318: label342: 
    while (localn == null)
    {
      AppMethodBeat.o(112069);
      return localView;
      locala = (n.a)paramView.getTag();
      localView = paramView;
      break;
    }
    localn.bEl();
    locala.nkR.setVisibility(0);
    locala.nlc.setVisibility(8);
    locala.nla.setText(com.tencent.mm.plugin.game.f.b.h(this.context, localn.field_createTime * 1000L));
    label478: label630: label765: Object localObject;
    if (localn.field_msgType == 100)
    {
      if (localn.mWT != null)
      {
        f(locala.nkS, localn.mWT.mXr);
        locala.nkS.setVisibility(0);
        if (!bo.isNullOrNil(localn.mWT.mXq))
        {
          locala.ejp.setText(localn.mWT.mXq);
          locala.ejp.setVisibility(0);
          if (bo.isNullOrNil(localn.mWT.mXs))
            break label1145;
          f(locala.nkU, localn.mWT.mXs);
          locala.nkU.setVisibility(0);
          label518: if (bo.isNullOrNil(localn.mWT.mXk))
            break label1158;
          locala.ejp.setEnabled(true);
          locala.nkS.setEnabled(true);
          paramView = new o.a(localn, localn.mWT.mXk, 1);
          paramViewGroup = new o.a(localn, localn.mWT.mXk, 2);
          locala.ejp.setTag(paramView);
          locala.ejp.setOnClickListener(this.nkO);
          locala.nkS.setTag(paramViewGroup);
          locala.nkS.setOnClickListener(this.nkO);
          if (bo.isNullOrNil(localn.mWP))
            break label1598;
          paramInt = localn.mWp.size();
          if (paramInt <= 1)
            break label1582;
          locala.iqU.setText(this.context.getResources().getString(2131300324, new Object[] { Integer.valueOf(paramInt) }) + localn.mWP);
          label708: locala.iqU.setVisibility(0);
          label717: if (bo.isNullOrNil(localn.mWQ))
            break label1611;
          locala.nkV.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, localn.mWQ, locala.nkV.getTextSize()));
          locala.nkV.setVisibility(0);
          a(localn, locala);
          if (bo.isNullOrNil(localn.mWU.mXp))
            break label1649;
          locala.nkW.setVisibility(0);
          if (bo.isNullOrNil(localn.mWU.mXk))
            break label1624;
          paramView = new o.a(localn, localn.mWU.mXk, 3);
          locala.nkW.setTag(paramView);
          locala.nkW.setOnClickListener(this.nkO);
          locala.nkW.setEnabled(true);
          label859: locala.nkX.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, localn.mWU.mXp, locala.nkX.getTextSize()));
          if (bo.isNullOrNil(localn.mWU.mXj))
            break label1636;
          f(locala.nkY, localn.mWU.mXj);
          locala.nkY.setVisibility(0);
          label930: if (bo.isNullOrNil(localn.mWR))
            break label1674;
          f(locala.nkZ, localn.mWR);
          locala.nkZ.setVisibility(0);
          if (bo.isNullOrNil(localn.mWS))
            break label1662;
          paramView = new o.a(localn, localn.mWS, 3);
          locala.nkZ.setTag(paramView);
          locala.nkZ.setOnClickListener(this.nkO);
          locala.nkZ.setEnabled(true);
          label1021: if (bo.isNullOrNil(localn.mWV.mName))
            break label1699;
          locala.nlb.setText(localn.mWV.mName);
          locala.nlb.setVisibility(0);
          if (bo.isNullOrNil(localn.mWV.mXk))
            break label1687;
          paramView = new o.a(localn, localn.mWV.mXk, 5);
          locala.nlb.setTag(paramView);
          locala.nlb.setOnClickListener(this.nkO);
          locala.nlb.setEnabled(true);
        }
      }
      while (true)
      {
        AppMethodBeat.o(112069);
        break;
        locala.ejp.setVisibility(8);
        break label478;
        label1145: locala.nkU.setVisibility(8);
        break label518;
        label1158: locala.ejp.setEnabled(false);
        locala.nkS.setEnabled(false);
        break label630;
        if (!bo.ek(localn.mWp))
        {
          paramViewGroup = (n.i)localn.mWp.get(0);
          if (!bo.isNullOrNil(paramViewGroup.bCu))
          {
            paramView = paramViewGroup.bCu;
            label1218: if (bo.isNullOrNil(paramViewGroup.mXx))
              break label1486;
            locala.ejp.setEnabled(true);
            locala.nkS.setEnabled(true);
            localObject = new o.a(localn, paramViewGroup.mXx, 1);
            o.a locala1 = new o.a(localn, paramViewGroup.mXx, 2);
            locala.ejp.setTag(localObject);
            locala.ejp.setOnClickListener(this.nkO);
            locala.nkS.setTag(locala1);
            locala.nkS.setOnClickListener(this.nkO);
            label1322: if (bo.isNullOrNil(paramView))
              break label1507;
            locala.ejp.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, paramView, locala.ejp.getTextSize()), TextView.BufferType.SPANNABLE);
            locala.ejp.setVisibility(0);
            label1365: locala.nkS.setVisibility(0);
            if (bo.isNullOrNil(paramViewGroup.mXu))
              break label1520;
            f(locala.nkS, paramViewGroup.mXu);
          }
          while (true)
          {
            if (bo.isNullOrNil(paramViewGroup.mXw))
              break label1536;
            f(locala.nkU, paramViewGroup.mXw);
            locala.nkU.setVisibility(0);
            break;
            paramView = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramViewGroup.userName);
            if ((paramView == null) || (bo.isNullOrNil(paramView.Oj())))
            {
              paramView = paramViewGroup.userName;
              break label1218;
            }
            paramView = paramView.Oj();
            break label1218;
            label1486: locala.ejp.setEnabled(false);
            locala.nkS.setEnabled(false);
            break label1322;
            label1507: locala.ejp.setVisibility(8);
            break label1365;
            label1520: d(locala.nkS, paramViewGroup.userName);
          }
          label1536: locala.nkU.setVisibility(8);
          break label630;
        }
        locala.nkS.setVisibility(8);
        locala.ejp.setVisibility(8);
        locala.nkU.setVisibility(8);
        break label630;
        label1582: locala.iqU.setText(localn.mWP);
        break label708;
        label1598: locala.iqU.setVisibility(8);
        break label717;
        label1611: locala.nkV.setVisibility(8);
        break label765;
        label1624: locala.nkW.setEnabled(false);
        break label859;
        label1636: locala.nkY.setVisibility(8);
        break label930;
        label1649: locala.nkW.setVisibility(8);
        break label930;
        label1662: locala.nkZ.setEnabled(false);
        break label1021;
        label1674: locala.nkZ.setVisibility(8);
        break label1021;
        label1687: locala.nlb.setEnabled(false);
        continue;
        label1699: locala.nlb.setVisibility(8);
      }
    }
    locala.iqU.setVisibility(8);
    locala.nkV.setVisibility(8);
    locala.nkW.setVisibility(8);
    locala.nkY.setVisibility(8);
    locala.nkZ.setVisibility(8);
    locala.nlb.setVisibility(8);
    locala.nlb.setEnabled(false);
    locala.nkZ.setEnabled(false);
    locala.nkS.setEnabled(false);
    locala.ejp.setEnabled(false);
    locala.nld.setVisibility(8);
    locala.nkU.setVisibility(8);
    if (!bo.ek(localn.mWp))
    {
      localObject = (n.i)localn.mWp.get(0);
      paramView = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(((n.i)localObject).userName);
      if (paramView != null)
      {
        paramViewGroup = paramView.Oj();
        label1887: paramView = paramViewGroup;
        if (bo.isNullOrNil(paramViewGroup))
          paramView = ((n.i)localObject).bCu;
        if (!bo.isNullOrNil(((n.i)localObject).mXv))
          paramInt = 1;
      }
    }
    while (true)
    {
      int i = localn.mWp.size();
      int j;
      if ((!bo.isNullOrNil(localn.mWn)) && ((localn.mWD & 1L) == 0L))
      {
        locala.nlb.setText(localn.mWn);
        locala.nlb.setVisibility(0);
        if ((localn.mWD & 0x2) > 0L)
        {
          j = this.context.getResources().getColor(2131690111);
          locala.nlb.setTextColor(j);
          locala.nlb.setBackgroundResource(2130838905);
          locala.nlb.setOnClickListener(this.nkI);
          locala.nlb.setTag(localn);
          locala.nlb.setEnabled(true);
        }
      }
      else
      {
        label2051: if ((localn.field_msgType != 10) && (localn.field_msgType != 11))
          break label2321;
        if (bo.isNullOrNil(localn.mAppName))
          break label2265;
        locala.ejp.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, localn.mAppName, locala.ejp.getTextSize()), TextView.BufferType.SPANNABLE);
        locala.ejp.setVisibility(0);
      }
      while (true)
        switch (localn.field_msgType)
        {
        case 3:
        case 4:
        case 7:
        case 8:
        case 9:
        default:
          ab.e("MicroMsg.GameMessageAdapter", "error msgtype: " + localn.field_msgType);
          break label318;
          j = this.context.getResources().getColor(2131690093);
          locala.nlb.setTextColor(j);
          locala.nlb.setBackgroundResource(0);
          locala.nlb.setOnClickListener(null);
          locala.nlb.setEnabled(false);
          break label2051;
          label2265: if (!bo.isNullOrNil(paramView))
          {
            locala.ejp.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, paramView, locala.ejp.getTextSize()));
            locala.ejp.setVisibility(0);
          }
          else
          {
            locala.ejp.setVisibility(8);
            continue;
            if (!bo.isNullOrNil(paramView))
            {
              locala.ejp.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, paramView, locala.ejp.getTextSize()));
              locala.ejp.setVisibility(0);
              if (paramInt != 0)
              {
                locala.ejp.setOnClickListener(this.nkK);
                locala.ejp.setTag(localn);
                locala.ejp.setEnabled(true);
              }
            }
            else
            {
              locala.ejp.setVisibility(8);
            }
          }
          label2321: break;
        case 10:
        case 11:
        case 6:
        case 2:
        case 5:
        }
      if (!bo.isNullOrNil(localn.mWj))
      {
        f(locala.nkS, localn.mWj);
        locala.nkS.setVisibility(0);
        label2446: if (!bo.isNullOrNil(localn.kYQ))
        {
          if (bo.isNullOrNil(localn.mWv))
            break label2597;
          locala.nkV.setText(localn.kYQ);
          locala.nkV.setVisibility(0);
        }
      }
      while (!bo.isNullOrNil(localn.mWv))
      {
        f(locala.nkZ, localn.mWv);
        locala.nkZ.setTag(Long.valueOf(localn.field_msgId));
        locala.nkZ.setOnTouchListener(nkH);
        locala.nkZ.setOnClickListener(this.nkJ);
        locala.nkZ.setVisibility(0);
        locala.nkZ.setEnabled(true);
        break;
        ab.e("MicroMsg.GameMessageAdapter", "mAppIcon is null");
        locala.nkS.setVisibility(8);
        break label2446;
        label2597: locala.nkW.setVisibility(0);
        locala.nkX.setText(localn.kYQ);
        locala.nkW.setOnClickListener(this.nkJ);
        locala.nkW.setTag(Long.valueOf(localn.field_msgId));
      }
      if (!bo.ek(localn.mWp))
      {
        locala.nkS.setVisibility(0);
        if (!bo.isNullOrNil(((n.i)localn.mWp.get(0)).mXu))
        {
          f(locala.nkS, ((n.i)localn.mWp.get(0)).mXu);
          label2715: if (!bo.isNullOrNil(((n.i)localn.mWp.get(0)).mXv))
          {
            locala.nkS.setOnClickListener(this.nkL);
            locala.nkS.setTag(localn);
            locala.nkS.setEnabled(true);
          }
        }
      }
      while (true)
      {
        locala.nkW.setVisibility(0);
        locala.nkW.setOnClickListener(this.nkJ);
        locala.nkW.setTag(Long.valueOf(localn.field_msgId));
        if (localn.mXa != 1)
          break label2906;
        locala.nkV.setVisibility(0);
        locala.nkV.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, localn.mWH, locala.nkV.getTextSize()));
        locala.nkX.setText(localn.mWK);
        break;
        d(locala.nkS, ((n.i)localn.mWp.get(0)).userName);
        break label2715;
        locala.nkS.setVisibility(8);
      }
      label2906: if (localn.mXa == 2)
      {
        locala.nkV.setVisibility(0);
        locala.nkV.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, localn.mWH, locala.nkV.getTextSize()));
        locala.nkX.setText(localn.mWI);
        break;
      }
      if (localn.mXa != 3)
        break;
      locala.iqU.setVisibility(0);
      if (i > 1)
      {
        locala.iqU.setText(this.context.getResources().getString(2131300318, new Object[] { String.valueOf(i) }));
        a(localn, locala);
      }
      while (true)
      {
        locala.nkX.setText(localn.mWK);
        break;
        locala.iqU.setText(this.context.getResources().getString(2131300319));
      }
      f(locala.nkS, localn.mWj);
      paramView = "礼物";
      if (localn.mWA.contains("爱心"))
      {
        paramView = "爱心";
        label3109: if (i <= 1)
          break label3193;
        locala.iqU.setText(this.context.getResources().getString(2131300322, new Object[] { String.valueOf(i), paramView }));
      }
      while (true)
      {
        locala.iqU.setVisibility(0);
        a(localn, locala);
        break;
        if (!localn.mWA.contains("体力"))
          break label3109;
        paramView = "体力";
        break label3109;
        label3193: locala.iqU.setText(this.context.getResources().getString(2131300323, new Object[] { paramView }));
      }
      if (!bo.ek(localn.mWp))
      {
        locala.nkS.setVisibility(0);
        if (!bo.isNullOrNil(((n.i)localn.mWp.get(0)).mXu))
        {
          f(locala.nkS, ((n.i)localn.mWp.get(0)).mXu);
          label3290: if (!bo.isNullOrNil(((n.i)localn.mWp.get(0)).mXv))
          {
            locala.nkS.setOnClickListener(this.nkL);
            locala.nkS.setTag(localn);
            locala.nkS.setEnabled(true);
          }
          label3342: if (i <= 1)
            break label3525;
          locala.iqU.setText(this.context.getResources().getString(2131300320, new Object[] { String.valueOf(i) }));
          a(localn, locala);
        }
      }
      while (true)
      {
        locala.nkW.setVisibility(0);
        locala.iqU.setVisibility(0);
        locala.nkX.setText(localn.mWL);
        locala.nkW.setOnClickListener(this.nkJ);
        locala.nkW.setTag(Long.valueOf(localn.field_msgId));
        if (bo.isNullOrNil(localn.mWN))
          break;
        locala.nkY.setVisibility(0);
        f(locala.nkY, localn.mWN);
        break;
        d(locala.nkS, ((n.i)localn.mWp.get(0)).userName);
        break label3290;
        locala.nkS.setVisibility(8);
        break label3342;
        label3525: locala.iqU.setText(this.context.getResources().getString(2131300321));
      }
      paramInt = 0;
      continue;
      paramViewGroup = null;
      break label1887;
      paramInt = 0;
      paramView = null;
    }
  }

  public final boolean wK(int paramInt)
  {
    if ((this.enb > this.csm) && (this.csm > 0) && (paramInt == this.csm));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.n
 * JD-Core Version:    0.6.2
 */