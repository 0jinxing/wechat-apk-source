package com.tencent.mm.ui.chatting.viewitems;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.s.n;

public final class q
{
  public static final class b extends c
    implements s.n
  {
    private com.tencent.mm.ui.chatting.d.a yJI;
    private q.c zeg;

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(33013);
      Object localObject;
      if (paramView != null)
      {
        localObject = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localObject = new v(paramLayoutInflater, 2130969110);
        ((View)localObject).setTag(new q.d().fb((View)localObject));
      }
      AppMethodBeat.o(33013);
      return localObject;
    }

    public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33017);
      if (parambi.bAA())
      {
        l.al(parambi);
        bf.fm(parambi.field_msgId);
        parama.qp(true);
      }
      AppMethodBeat.o(33017);
    }

    public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(33014);
      this.yJI = parama1;
      parama = (q.d)parama;
      if (this.zeg == null)
        this.zeg = new q.c(this.yJI, this);
      q.d.a(parama, paramInt, parama1, parambi, true, this.zeg, c(parama1));
      a(paramInt, parama, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
      AppMethodBeat.o(33014);
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(33015);
      boolean bool = q.a(this.yJI, paramContextMenu, paramView, parambi);
      AppMethodBeat.o(33015);
      return bool;
    }

    public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33016);
      if (paramMenuItem.getItemId() == 111)
      {
        paramMenuItem = j.b.me(bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
        if (paramMenuItem != null)
          com.tencent.mm.plugin.report.service.h.pYm.e(16979, new Object[] { paramMenuItem.fiQ, paramMenuItem.fiO, Integer.valueOf(0), Integer.valueOf(2) });
        d.b.a(parama, parambi, b(parama, parambi));
      }
      AppMethodBeat.o(33016);
      return false;
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if ((paramBoolean) && (paramInt == 687865905));
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      return true;
    }

    final boolean dHk()
    {
      return true;
    }

    final boolean dHl()
    {
      return false;
    }
  }

  static final class d extends c.a
  {
    public ImageView iYg;
    public TextView moL;
    public ProgressBar progressBar;
    public ImageView zdN;
    public ImageView zeh;

    @SuppressLint({"ResourceType"})
    public static void a(d paramd, int paramInt, com.tencent.mm.ui.chatting.d.a parama, bi parambi, boolean paramBoolean, q.c paramc, c.c paramc1)
    {
      AppMethodBeat.i(33020);
      j.b localb = j.b.me(bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
      if (localb == null)
      {
        ab.w("MicroMsg.WeishiVideoItemViewHolder", "parseMsgInfo, content is null");
        AppMethodBeat.o(33020);
        return;
      }
      Object localObject = com.tencent.mm.pluginsdk.model.app.g.dX(localb.appId, localb.axy);
      String str;
      if ((localObject == null) || (((f)localObject).field_appName == null) || (((f)localObject).field_appName.trim().length() <= 0))
      {
        str = localb.appName;
        label92: if ((localb.appId == null) || (localb.appId.length() <= 0) || (!c.dg(str)))
          break label557;
        paramd.moL.setText(com.tencent.mm.pluginsdk.model.app.g.b(parama.yTx.getContext(), (f)localObject, str));
        paramd.moL.setVisibility(0);
        c.a(parama, paramd.moL, localb.appId);
        label161: paramd.iYg.setImageDrawable(com.tencent.mm.bz.a.g(parama.yTx.getContext(), 2131231923));
        if (paramd.progressBar != null)
          paramd.progressBar.setVisibility(8);
        str = o.ahl().c(parambi.field_imgPath, false, true);
        ab.i("MicroMsg.WeishiVideoItemViewHolder", "parseMsgInfo, msgImgPath:%s, thumbFullPath:%s", new Object[] { parambi.field_imgPath, str });
        localObject = o.ahl().a(str, com.tencent.mm.bz.a.getDensity(parama.yTx.getContext()), parama.yTx.getContext(), 2130838182);
        if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
          break label569;
        paramd.zdN.setImageBitmap((Bitmap)localObject);
        FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
        paramd.zdN.setLayoutParams(localLayoutParams);
        localObject = new FrameLayout.LayoutParams(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
        paramd.zeh.setLayoutParams((ViewGroup.LayoutParams)localObject);
        label340: if (paramBoolean)
        {
          if ((parambi.field_status != 5) && (parambi.field_status != 2))
            break label712;
          if (paramd.progressBar != null)
            paramd.progressBar.setVisibility(8);
        }
      }
      while (true)
      {
        paramd.jPL.setTag(new ay(parambi, parama.dFx(), paramInt, parambi.field_talker, '\000'));
        paramd.jPL.setOnClickListener(paramc);
        paramd.jPL.setOnLongClickListener(paramc1);
        paramd.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
        com.tencent.mm.plugin.report.service.h.pYm.e(16979, new Object[] { localb.fiQ, localb.fiO, Integer.valueOf(0), Integer.valueOf(0) });
        b.abR().pC("file://".concat(String.valueOf(str)));
        paramd = (com.tencent.mm.af.a)localb.X(com.tencent.mm.af.a.class);
        if ((paramd != null) && (!bo.isNullOrNil(paramd.appThumbUrl)))
          b.abR().pC(paramd.appThumbUrl);
        AppMethodBeat.o(33020);
        break;
        str = ((f)localObject).field_appName;
        break label92;
        label557: paramd.moL.setVisibility(8);
        break label161;
        label569: ab.i("MicroMsg.WeishiVideoItemViewHolder", "parseMsgInfo, has no video thumb");
        paramd.zeh.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        int i = com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), 85);
        int j = com.tencent.mm.bz.a.al(parama.yTx.getContext(), 2131427524);
        localObject = d.a(d.au(parama.yTx.getContext().getResources().getColor(2131690151), i, j), 2130838182, i, j);
        paramd.zdN.setImageBitmap((Bitmap)localObject);
        localObject = new FrameLayout.LayoutParams(i, j);
        paramd.zdN.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localObject = new FrameLayout.LayoutParams(i, j);
        paramd.zeh.setLayoutParams((ViewGroup.LayoutParams)localObject);
        break label340;
        label712: if (paramd.progressBar != null)
          paramd.progressBar.setVisibility(0);
      }
    }

    public final c.a fb(View paramView)
    {
      AppMethodBeat.i(33019);
      super.eP(paramView);
      this.zdN = ((ImageView)paramView.findViewById(2131822578));
      this.zeh = ((ImageView)paramView.findViewById(2131822553));
      this.jPL = paramView.findViewById(2131822515);
      this.iYg = ((ImageView)paramView.findViewById(2131822581));
      this.qkY = ((TextView)paramView.findViewById(2131821102));
      this.moL = ((TextView)paramView.findViewById(2131822543));
      this.progressBar = ((ProgressBar)paramView.findViewById(2131822674));
      this.zby = ((ImageView)paramView.findViewById(2131822629));
      this.moo = ((CheckBox)paramView.findViewById(2131820580));
      this.iVh = paramView.findViewById(2131820586);
      AppMethodBeat.o(33019);
      return this;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.q
 * JD-Core Version:    0.6.2
 */