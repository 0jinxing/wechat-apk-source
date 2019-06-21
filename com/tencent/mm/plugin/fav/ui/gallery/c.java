package com.tencent.mm.plugin.fav.ui.gallery;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
  implements g.b
{
  private RecyclerView aiB;
  Activity czX;
  public long eEO;
  public int ehv;
  private TextView emq;
  public long fAq;
  public View jWH;
  private ProgressDialog kvA;
  boolean kvO;
  private int kvP;
  private abh mnG;
  public g.a mnI;
  TextView mnJ;
  public boolean mnK;
  public int mnL;
  public com.tencent.matrix.trace.e.b mnM;
  private TextView mnN;
  private TextView mnO;
  private View.OnClickListener mnP;
  private View.OnClickListener mnQ;
  private View.OnClickListener mnR;
  public List<d> mnS;

  public c(Activity paramActivity, View paramView)
  {
    AppMethodBeat.i(74551);
    this.mnK = false;
    this.mnL = -1;
    this.kvO = true;
    this.eEO = 0L;
    this.fAq = 0L;
    this.mnM = new com.tencent.matrix.trace.e.b()
    {
      public final void a(String paramAnonymousString, long paramAnonymousLong, int paramAnonymousInt)
      {
        AppMethodBeat.i(74540);
        super.a(paramAnonymousString, paramAnonymousLong, paramAnonymousInt);
        if ((paramAnonymousInt > 0) && (!bo.isNullOrNil(paramAnonymousString)) && (paramAnonymousString.endsWith(c.this.getClass().getSimpleName())))
          c.this.eEO += paramAnonymousInt;
        AppMethodBeat.o(74540);
      }
    };
    this.mnP = new c.4(this);
    this.mnQ = new c.5(this);
    this.mnR = new c.6(this);
    this.mnS = new ArrayList();
    this.czX = paramActivity;
    this.jWH = paramView;
    this.mnK = true;
    g.c localc = g.c.mou;
    paramView = null;
    switch (c.7.mnV[localc.ordinal()])
    {
    default:
    case 1:
    }
    for (paramActivity = paramView; ; paramActivity = new h(paramActivity))
    {
      paramActivity.a(this);
      this.mnG = new abh();
      this.mnG.scene = 2;
      this.mnG.jSW = 2;
      this.mnG.index = 0;
      this.mnG.cvF = "";
      this.mnG.query = "";
      this.mnG.mfg = "";
      this.mnN = ((TextView)this.jWH.findViewById(2131823944));
      this.mnN.setTag(Integer.valueOf(0));
      this.mnN.setOnClickListener(this.mnR);
      this.mnO = ((TextView)this.jWH.findViewById(2131823945));
      this.mnO.setOnClickListener(this.mnP);
      this.mnJ = ((TextView)this.jWH.findViewById(2131823946));
      this.emq = ((TextView)this.jWH.findViewById(2131821477));
      this.aiB = ((RecyclerView)this.jWH.findViewById(2131821478));
      this.aiB.setLayoutManager(this.mnI.bfC());
      this.aiB.b(this.mnI.dN(this.czX));
      this.aiB.setAdapter(this.mnI.bfB());
      ((f)this.mnI.bwx()).mnG = this.mnG;
      this.aiB.setHasFixedSize(true);
      this.aiB.setOnScrollListener(new c.2(this));
      this.aiB.a(new c.3(this));
      AppMethodBeat.o(74551);
      return;
    }
  }

  private void fP(boolean paramBoolean)
  {
    AppMethodBeat.i(74559);
    ab.i("MicroMsg.MediaHistoryGalleryUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.kvA = p.b(this.czX, this.czX.getString(2131300968), true, null);
      AppMethodBeat.o(74559);
    }
    while (true)
    {
      return;
      if ((this.kvA != null) && (this.kvA.isShowing()))
      {
        this.kvA.dismiss();
        this.kvA = null;
      }
      AppMethodBeat.o(74559);
    }
  }

  public final void bS(List<d> paramList)
  {
    AppMethodBeat.i(74558);
    if ((paramList == null) || (paramList.size() <= 0))
      AppMethodBeat.o(74558);
    while (true)
    {
      return;
      this.mnS.clear();
      this.mnS.addAll(paramList);
      Intent localIntent = new Intent();
      localIntent.putExtra("Select_Conv_Type", 3);
      localIntent.putExtra("mutil_select_is_ret", true);
      String str2;
      int i;
      if (this.mnS.size() == 1)
      {
        d locald = (d)paramList.get(0);
        String str1 = com.tencent.mm.plugin.fav.a.b.c(locald.cAJ);
        str2 = com.tencent.mm.plugin.fav.a.b.b(locald.cAJ);
        if (e.ct(str1))
        {
          localIntent.putExtra("image_path", str1);
          if ((!locald.bwt()) && (!locald.bws()))
            break label232;
          i = 1;
          label149: localIntent.putExtra("Retr_Msg_Type", i);
          localIntent.putExtra("select_is_ret", true);
        }
      }
      while (true)
      {
        com.tencent.mm.bp.d.b(this.czX, ".ui.transmit.SelectConversationUI", localIntent, 1);
        paramList = paramList.iterator();
        while (paramList.hasNext())
          com.tencent.mm.plugin.fav.a.h.j(((d)paramList.next()).mnW.field_localId, 1, 0);
        localIntent.putExtra("image_path", str2);
        break;
        label232: i = 0;
        break label149;
        localIntent.putExtra("scene_from", 1);
        localIntent.putExtra("Retr_Msg_Type", 17);
        localIntent.putExtra("select_fav_select_count", this.mnS.size());
      }
      AppMethodBeat.o(74558);
    }
  }

  public final void bwq()
  {
    AppMethodBeat.i(74556);
    this.mnI.bwq();
    this.mnO.setText(2131299580);
    this.mnN.setText(this.czX.getString(2131304131));
    this.mnN.setVisibility(0);
    this.mnO.setOnClickListener(this.mnQ);
    AppMethodBeat.o(74556);
  }

  public final void bwr()
  {
    AppMethodBeat.i(74557);
    this.mnI.bwr();
    this.mnO.setText(2131299582);
    this.mnN.setVisibility(8);
    this.mnO.setOnClickListener(this.mnP);
    AppMethodBeat.o(74557);
  }

  public final void fO(boolean paramBoolean)
  {
    AppMethodBeat.i(74553);
    if (paramBoolean)
    {
      fP(true);
      AppMethodBeat.o(74553);
    }
    while (true)
    {
      return;
      this.kvP = ((GridLayoutManager)this.aiB.getLayoutManager()).iS();
      AppMethodBeat.o(74553);
    }
  }

  public final void p(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(74554);
    ab.i("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isFirst:%s addCount:%s mIntentPos:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(this.mnL) });
    if (paramBoolean)
    {
      fP(false);
      this.aiB.getAdapter().aop.notifyChanged();
      if (this.mnL > 0)
      {
        if (this.mnL % 4 == 0)
          this.mnL += 1;
        this.aiB.bY(this.mnL);
        if (paramInt > 0)
          break label170;
        this.emq.setVisibility(0);
        this.aiB.setVisibility(8);
        this.emq.setText(this.czX.getString(2131299581));
        AppMethodBeat.o(74554);
      }
    }
    while (true)
    {
      return;
      int i = this.aiB.getAdapter().getItemCount();
      this.aiB.bY(i - 1);
      break;
      label170: this.emq.setVisibility(8);
      this.aiB.setVisibility(0);
      AppMethodBeat.o(74554);
      continue;
      if (paramInt > 0)
      {
        this.aiB.getAdapter().aop.notifyChanged();
        AppMethodBeat.o(74554);
      }
      else
      {
        this.aiB.getAdapter().cg(0);
        AppMethodBeat.o(74554);
      }
    }
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(74552);
    this.jWH.setVisibility(paramInt);
    AppMethodBeat.o(74552);
  }

  public final void vF(int paramInt)
  {
    AppMethodBeat.i(74555);
    if (paramInt > 0)
    {
      this.mnN.setText(this.czX.getString(2131304131) + "(" + paramInt + ")");
      AppMethodBeat.o(74555);
    }
    while (true)
    {
      return;
      this.mnN.setText(this.czX.getString(2131304131));
      AppMethodBeat.o(74555);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.c
 * JD-Core Version:    0.6.2
 */