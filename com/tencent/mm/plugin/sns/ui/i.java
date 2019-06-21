package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bv;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.plugin.sns.ui.widget.d;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i
{
  public static List<k> rhw;
  Context context;
  String ecX;
  ClipboardManager mmO;
  public ListView nDp;
  FrameLayout qOM;
  public au qPr;
  public com.tencent.mm.plugin.sns.ui.d.b rhA;
  com.tencent.mm.ui.base.p rhB;
  c rhC;
  c rhD;
  View.OnLongClickListener rhE;
  public com.tencent.mm.plugin.sns.a.b.g rhm;
  public com.tencent.mm.plugin.sns.model.au rhn;
  boolean rho;
  boolean rhp;
  SnsCommentFooter rhq;
  be rhr;
  an rhs;
  private boolean rht;
  String rhu;
  private boolean rhv;
  bd rhx;
  b rhy;
  com.tencent.mm.plugin.sns.g.b rhz;

  static
  {
    AppMethodBeat.i(38193);
    rhw = new LinkedList();
    AppMethodBeat.o(38193);
  }

  public i(Context paramContext, int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(38188);
    this.rhp = false;
    this.rht = false;
    this.rhu = "";
    this.rhv = false;
    this.rhB = null;
    this.rhC = new c()
    {
    };
    this.rhD = new i.3(this);
    this.rhE = new i.6(this);
    this.context = paramContext;
    this.ecX = com.tencent.mm.model.r.Yz();
    this.rhn = new com.tencent.mm.plugin.sns.model.au();
    this.rhn.qMn = new com.tencent.mm.plugin.sns.i.b(paramInt1, paramString1, paramInt2, paramString2);
    this.rhA = new i.1(this, (Activity)paramContext, this.rhn);
    this.rhA.bIB();
    com.tencent.mm.sdk.b.a.xxA.c(this.rhC);
    com.tencent.mm.sdk.b.a.xxA.c(this.rhD);
    AppMethodBeat.o(38188);
  }

  static int di(String paramString, int paramInt)
  {
    AppMethodBeat.i(38192);
    Iterator localIterator = rhw.iterator();
    k localk;
    do
    {
      i = paramInt;
      if (!localIterator.hasNext())
        break;
      localk = (k)localIterator.next();
    }
    while (!bo.isEqual(localk.key, paramString));
    int i = localk.bJt;
    AppMethodBeat.o(38192);
    return i;
  }

  final void c(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(38191);
    int i = com.tencent.mm.bz.a.fromDPToPix(this.context, 8);
    if (paramBaseViewHolder.rHN != null)
    {
      i += paramBaseViewHolder.rHP.getHeight() - paramBaseViewHolder.rHN.getBottom();
      ab.i("MicroMsg.BaseTimeLine", "comment item bottom = " + paramBaseViewHolder.rHN.getBottom());
      this.rhr.position = paramBaseViewHolder.position;
      this.rhr.rDM = (paramBaseViewHolder.mRR.getHeight() - i);
      paramBaseViewHolder.rHN = null;
      this.rhr.rDN = paramBaseViewHolder.mRR.getTop();
      this.rhr.rpW = this.nDp.getBottom();
      ab.e("MicroMsg.BaseTimeLine", "originalTop:" + this.rhr.rDN);
      if ((!(this.context instanceof MMActivity)) || (((MMActivity)this.context).mController.ymc == 1))
        break label198;
      this.rho = true;
      AppMethodBeat.o(38191);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label198: this.rhr.cuK();
      AppMethodBeat.o(38191);
    }
  }

  final void crC()
  {
    AppMethodBeat.i(38189);
    if (this.rht)
      AppMethodBeat.o(38189);
    while (true)
    {
      return;
      this.rht = true;
      this.rhq.setAfterEditAction(this.rhr.rDS);
      this.rhq.setOnCommentSendImp(new SnsCommentFooter.b()
      {
        public final void Zr(String paramAnonymousString)
        {
          AppMethodBeat.i(38181);
          n localn = (n)i.this.rhq.getTag();
          ab.d("MicroMsg.BaseTimeLine", "onCommentSend click");
          if ((paramAnonymousString == null) || (paramAnonymousString.trim().equals("")))
          {
            ab.e("MicroMsg.BaseTimeLine", "onCommentSend tosendText is null or empty");
            AppMethodBeat.o(38181);
          }
          while (true)
          {
            return;
            Object localObject = i.this.rhq.getCommentInfo();
            cbf localcbf = aj.q(localn);
            if ((((cat)localObject).wZG == 0) && (((cat)localObject).wZJ == 0L));
            com.tencent.mm.modelsns.b localb1;
            int j;
            for (int i = 708; ; i = 709)
            {
              localb1 = com.tencent.mm.modelsns.b.lY(i);
              if (localb1.opType != 708)
                break label403;
              localb1.tx(com.tencent.mm.plugin.sns.data.i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx(localn.field_userName).mb(localcbf.xao).mb(localcbf.xar);
              localb1.ajK();
              if (i.this.rhn != null)
                i.this.rhn.qMn.w(localn);
              j = i.this.rhq.getCommentFlag();
              ab.i("MicroMsg.BaseTimeLine", "onCommentSend click %s", new Object[] { Integer.valueOf(j) });
              if (!d.fF(j, 8))
                break label516;
              paramAnonymousString = paramAnonymousString.substring(i.this.rhq.getCommentAtPrefix().length());
              ab.i("MicroMsg.BaseTimeLine", "send atFriend ad timeline comment");
              am.a.a(localn, 16, paramAnonymousString, i.this.rhq.getCommentInfo(), j, 0);
              i.this.qPr.Z(i.this.rhr.rDS);
              i.this.crD();
              if (bo.isNullOrNil(i.b(i.this)))
                break label567;
              paramAnonymousString = i.rhw.iterator();
              do
              {
                if (!paramAnonymousString.hasNext())
                  break;
                localObject = (k)paramAnonymousString.next();
              }
              while (!i.b(i.this).equals(((k)localObject).key));
              ab.d("MicroMsg.BaseTimeLine", "remove ct");
              i.rhw.remove(localObject);
              AppMethodBeat.o(38181);
              break;
            }
            label403: com.tencent.mm.modelsns.b localb2 = localb1.tx(com.tencent.mm.plugin.sns.data.i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx(((cat)localObject).vHl);
            if (((cat)localObject).wZG == 0);
            for (localObject = ((cat)localObject).wZJ; ; localObject = ((cat)localObject).wZG)
            {
              localb2.tx((String)localObject).mb(localcbf.xao).mb(localcbf.xar);
              break;
            }
            label516: ab.i("MicroMsg.BaseTimeLine", "send timeline comment");
            if (localn.DI(32));
            for (i = 8; ; i = 2)
            {
              am.a.a(localn, i, paramAnonymousString, i.this.rhq.getCommentInfo(), j, 0);
              break;
            }
            label567: AppMethodBeat.o(38181);
          }
        }
      });
      SnsCommentFooter localSnsCommentFooter = this.rhq;
      i.5 local5 = new i.5(this);
      if (localSnsCommentFooter.oij != null)
        localSnsCommentFooter.oij.setBackListener(local5);
      AppMethodBeat.o(38189);
    }
  }

  final void crD()
  {
    AppMethodBeat.i(38190);
    if (!this.rht)
      AppMethodBeat.o(38190);
    while (true)
    {
      return;
      if (this.rhq.getVisibility() != 8)
        this.rhq.setVisibility(8);
      au localau = this.qPr;
      if (localau.rxS != null)
        localau.rxS.setVisibility(8);
      localau.rxS = null;
      AppMethodBeat.o(38190);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.i
 * JD-Core Version:    0.6.2
 */