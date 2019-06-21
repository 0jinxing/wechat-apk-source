package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.a.tc;
import com.tencent.mm.g.a.td;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.storage.a.b;
import com.tencent.mm.plugin.sns.storage.a.b.a;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ao;
import com.tencent.mm.plugin.sns.ui.au.a;
import com.tencent.mm.plugin.sns.ui.bb;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.plugin.sns.ui.item.c.a;
import com.tencent.mm.plugin.sns.ui.item.i.a;
import com.tencent.mm.plugin.sns.ui.item.i.b;
import com.tencent.mm.plugin.sns.ui.q;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.at;
import com.tencent.mm.protocal.protobuf.av;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.cbb;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbu;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class b
{
  Activity activity;
  int cvd = 0;
  public View.OnTouchListener jNA;
  private ClipboardManager mmO;
  volatile com.tencent.mm.plugin.sns.ui.b.b.b rJD;
  volatile com.tencent.mm.plugin.sns.ui.b.b.a rJE;
  volatile com.tencent.mm.plugin.sns.ui.b.a.b rJF;
  volatile com.tencent.mm.plugin.sns.ui.b.a.a rJG;
  public a rJH;
  public View.OnClickListener rJI;
  public View.OnLongClickListener rJJ;
  public c rJK;
  public View.OnClickListener rJL;
  public View.OnClickListener rJM;
  public View.OnClickListener rJN;
  public View.OnClickListener rJO;
  public View.OnClickListener rJP;
  public View.OnClickListener rJQ;
  public View.OnClickListener rJR;
  public View.OnClickListener rJS;
  public View.OnClickListener rJT;
  public c rJU;
  public c rJV;
  public c rJW;
  public c rJX;
  public c rJY;
  public c rJZ;
  public com.tencent.mm.plugin.sight.decode.a.b.e rJj;
  public c rKa;
  c rKb;
  public View.OnClickListener rKc;
  public View.OnClickListener rKd;
  public View.OnClickListener rKe;
  public View.OnClickListener rKf;
  public View.OnClickListener rKg;
  public View.OnClickListener rKh;
  public View.OnClickListener rKi;
  public AdapterView.OnItemClickListener rKj;
  public AdapterView.OnItemClickListener rKk;
  public View.OnClickListener rKl = new b.1(this);
  public View.OnClickListener rKm = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      boolean bool = false;
      AppMethodBeat.i(40259);
      if (paramAnonymousView.getTag() == null)
        AppMethodBeat.o(40259);
      com.tencent.mm.plugin.sns.storage.n localn;
      while (true)
      {
        return;
        localn = b.dQ(paramAnonymousView);
        if ((localn != null) && (localn.DI(32)))
          break;
        AppMethodBeat.o(40259);
      }
      int i;
      int j;
      label86: Object localObject;
      label118: int k;
      if (localn.crd().cqo().coS())
      {
        i = v.gr(localn.crd().cqo().coN(), localn.crc());
        if (i > 0)
        {
          j = 1;
          String str1 = localn.crd().cqo().coN();
          localObject = localn.crc();
          com.tencent.mm.kernel.g.RN();
          String str2 = com.tencent.mm.kernel.a.QG();
          if (j == 0)
            break label211;
          if (j == 0)
            break label217;
          k = 0;
          label126: v.h(str1, (String)localObject, str2, i, k);
          if (j != 0);
        }
      }
      for (bool = true; ; bool = false)
      {
        localObject = localn.cqu();
        if ((((TimeLineObject)localObject).xfI.wbJ == 15) && (((TimeLineObject)localObject).xfP != 1))
        {
          b.a(b.this, paramAnonymousView, localn, 1002, localn.crd().cqo().coU(), bool);
          AppMethodBeat.o(40259);
          break;
          j = 0;
          break label86;
          label211: i = 2;
          break label118;
          label217: k = 1;
          break label126;
        }
        if (((((TimeLineObject)localObject).xfI.wbJ == 1) && (((TimeLineObject)localObject).xfI.wbK.size() == 1)) || (((TimeLineObject)localObject).xfI.wbJ == 7))
          b.b(b.this, paramAnonymousView, localn, 1002, localn.crd().cqo().coU(), bool);
        AppMethodBeat.o(40259);
        break;
      }
    }
  };
  public View.OnClickListener rKn;
  public au.a rKo;
  int rKp;
  private com.tencent.mm.sdk.b.c<td> rKq = new b.23(this);
  private com.tencent.mm.sdk.b.c<tc> rKr = new b.33(this);
  public View.OnClickListener rKs = new b.32(this);
  com.tencent.mm.plugin.sns.model.ae rhQ;
  public View.OnClickListener rjy;

  public b(int paramInt, Activity paramActivity, com.tencent.mm.plugin.sns.model.ae paramae)
  {
    this.cvd = paramInt;
    this.activity = paramActivity;
    this.rhQ = paramae;
    this.rKp = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsPOICommentFeedNewUrlSwitch"), 0);
    ab.i("MicroMsg.TimelineClickListener", "init POIComment_FeedNewUrl_Switch:%d", new Object[] { Integer.valueOf(this.rKp) });
    this.mmO = ((ClipboardManager)ah.getContext().getSystemService("clipboard"));
    this.rJH = new a(this.activity, this.cvd, this.rhQ);
    this.rJS = new b.34(this);
    this.rKd = new b.35(this);
    this.rKh = new b.36(this);
    this.rKi = new b.37(this);
    this.rJI = new b.38(this);
    this.rJJ = new b.2(this);
    this.rJK = new b.3(this);
    this.rJZ = new b.4(this);
    this.rKa = new b.5(this);
    this.rJW = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        AppMethodBeat.i(40249);
        if ((paramAnonymousView.getTag() instanceof q))
          b.this.rKb.onCreateContextMenu(paramAnonymousContextMenu, paramAnonymousView, paramAnonymousContextMenuInfo);
        AppMethodBeat.o(40249);
      }

      public final boolean dR(View paramAnonymousView)
      {
        AppMethodBeat.i(40250);
        boolean bool;
        if ((paramAnonymousView.getTag() instanceof q))
        {
          String str = ((q)paramAnonymousView.getTag()).cwT;
          com.tencent.mm.plugin.sns.storage.n localn = com.tencent.mm.plugin.sns.model.af.cnF().YT(str);
          b.this.rJH.a(paramAnonymousView, str, localn.cqu());
          bool = true;
          AppMethodBeat.o(40250);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(40250);
        }
      }
    };
    this.rJV = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        AppMethodBeat.i(40251);
        int i;
        int j;
        if ((paramAnonymousView != null) && ((paramAnonymousView.getTag() instanceof ao)))
        {
          paramAnonymousContextMenuInfo = ((ao)paramAnonymousView.getTag()).czD;
          com.tencent.mm.plugin.sns.storage.n localn = com.tencent.mm.plugin.sns.model.af.cnF().YT(paramAnonymousContextMenuInfo);
          if (com.tencent.mm.bp.d.afj("favorite"))
          {
            paramAnonymousContextMenu.add(0, 2, 0, b.this.activity.getString(2131301955));
            dq localdq = new dq();
            localdq.cxc.cwT = paramAnonymousContextMenuInfo;
            com.tencent.mm.sdk.b.a.xxA.m(localdq);
            if (localdq.cxd.cwB)
              paramAnonymousContextMenu.add(0, 18, 0, b.this.activity.getString(2131296995));
          }
          com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, localn);
          paramAnonymousContextMenu = paramAnonymousContextMenu.add(0, 21, 0, b.this.activity.getString(2131303622));
          paramAnonymousContextMenuInfo = new int[2];
          if (paramAnonymousView == null)
            break label238;
          i = paramAnonymousView.getWidth();
          j = paramAnonymousView.getHeight();
          paramAnonymousView.getLocationInWindow(paramAnonymousContextMenuInfo);
        }
        while (true)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("img_gallery_width", i).putExtra("img_gallery_height", j).putExtra("img_gallery_left", paramAnonymousContextMenuInfo[0]).putExtra("img_gallery_top", paramAnonymousContextMenuInfo[1]);
          paramAnonymousContextMenu.setIntent(paramAnonymousView);
          AppMethodBeat.o(40251);
          return;
          label238: j = 0;
          i = 0;
        }
      }

      public final boolean dR(View paramAnonymousView)
      {
        AppMethodBeat.i(40252);
        boolean bool;
        if ((paramAnonymousView.getTag() instanceof ao))
        {
          String str = ((ao)paramAnonymousView.getTag()).czD;
          com.tencent.mm.plugin.sns.storage.n localn = com.tencent.mm.plugin.sns.model.af.cnF().YT(str);
          b.this.rJH.a(paramAnonymousView, str, localn.cqu());
          bool = true;
          AppMethodBeat.o(40252);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(40252);
        }
      }
    };
    this.rJY = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        AppMethodBeat.i(40254);
        paramAnonymousContextMenuInfo = paramAnonymousView.getTag();
        if ((paramAnonymousContextMenuInfo instanceof ao))
          paramAnonymousContextMenuInfo = ((ao)paramAnonymousContextMenuInfo).czD;
        while (true)
        {
          if (paramAnonymousContextMenuInfo != null)
          {
            paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.af.cnF().YT(paramAnonymousContextMenuInfo);
            TimeLineObject localTimeLineObject = paramAnonymousContextMenuInfo.cqu();
            if (com.tencent.mm.bp.d.afj("favorite"))
              switch (localTimeLineObject.xfI.wbJ)
              {
              default:
              case 15:
              case 1:
              }
          }
          while (true)
          {
            com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, paramAnonymousContextMenuInfo);
            AppMethodBeat.o(40254);
            return;
            if (!(paramAnonymousContextMenuInfo instanceof q))
              break label158;
            paramAnonymousContextMenuInfo = ((q)paramAnonymousContextMenuInfo).cwT;
            break;
            paramAnonymousContextMenu.add(0, 10, 0, paramAnonymousView.getContext().getString(2131301955));
            continue;
            paramAnonymousContextMenu.add(0, 2, 0, paramAnonymousView.getContext().getString(2131301955));
          }
          label158: paramAnonymousContextMenuInfo = null;
        }
      }

      public final boolean dR(View paramAnonymousView)
      {
        AppMethodBeat.i(40253);
        Object localObject = paramAnonymousView.getTag();
        if ((localObject instanceof ao))
          localObject = ((ao)localObject).czD;
        while (true)
        {
          boolean bool;
          if (localObject != null)
          {
            com.tencent.mm.plugin.sns.storage.n localn = com.tencent.mm.plugin.sns.model.af.cnF().YT((String)localObject);
            b.this.rJH.a(paramAnonymousView, (String)localObject, localn.cqu());
            bool = true;
            AppMethodBeat.o(40253);
          }
          while (true)
          {
            return bool;
            if (!(localObject instanceof q))
              break label93;
            localObject = ((q)localObject).cwT;
            break;
            bool = false;
            AppMethodBeat.o(40253);
          }
          label93: localObject = null;
        }
      }
    };
    this.rjy = new b.9(this);
    this.rJL = new b.10(this);
    this.rJM = new b.11(this);
    this.rJN = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(40260);
        paramAnonymousView = (String)paramAnonymousView.getTag();
        ab.d("MicroMsg.TimelineClickListener", "onItemDelClick:".concat(String.valueOf(paramAnonymousView)));
        TimeLineObject localTimeLineObject = com.tencent.mm.plugin.sns.model.af.cnF().YT(paramAnonymousView).cqu();
        paramAnonymousView = localTimeLineObject.qNO;
        if (paramAnonymousView.vCy == null)
        {
          AppMethodBeat.o(40260);
          return;
        }
        String str = com.tencent.mm.plugin.sns.c.a.gkF.df(paramAnonymousView.vCy.fKh);
        int i = 0;
        if (localTimeLineObject.xfI.wbJ == 1)
          i = 2;
        while (true)
        {
          if (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(localTimeLineObject, b.this.activity))
            break label191;
          com.tencent.mm.plugin.sns.c.a.gkF.a(b.this.activity, paramAnonymousView.vCy.fKh, str, localTimeLineObject.jBB, i, 11, 9, paramAnonymousView.vCy.vCs, localTimeLineObject.Id);
          AppMethodBeat.o(40260);
          break;
          if (localTimeLineObject.xfI.wbJ == 3)
            i = 5;
          else if (localTimeLineObject.xfI.wbJ == 15)
            i = 38;
        }
        label191: switch (paramAnonymousView.jCt)
        {
        default:
        case 4:
        case 5:
        case 6:
        }
        while (true)
        {
          AppMethodBeat.o(40260);
          break;
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", paramAnonymousView.Url);
          com.tencent.mm.plugin.sns.c.a.gkE.i((Intent)localObject, b.this.activity);
          com.tencent.mm.plugin.sns.c.a.gkF.a(b.this.activity, paramAnonymousView.vCy.fKh, str, localTimeLineObject.jBB, i, 11, 1, paramAnonymousView.vCy.vCs, localTimeLineObject.Id);
          AppMethodBeat.o(40260);
          break;
          if (paramAnonymousView.Scene == 1)
          {
            localObject = new gt();
            ((gt)localObject).cBv.actionCode = 2;
            ((gt)localObject).cBv.scene = 3;
            ((gt)localObject).cBv.appId = paramAnonymousView.vCy.fKh;
            ((gt)localObject).cBv.context = b.this.activity;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
            com.tencent.mm.plugin.sns.c.a.gkF.a(b.this.activity, paramAnonymousView.vCy.fKh, str, localTimeLineObject.jBB, i, 11, 6, paramAnonymousView.vCy.vCs, localTimeLineObject.Id);
            AppMethodBeat.o(40260);
            break;
            int j = com.tencent.mm.plugin.sns.ui.af.a(b.this.activity, paramAnonymousView);
            if (j == 1)
            {
              localObject = new gt();
              ((gt)localObject).cBv.context = b.this.activity;
              ((gt)localObject).cBv.actionCode = 2;
              ((gt)localObject).cBv.appId = paramAnonymousView.vCy.fKh;
              ((gt)localObject).cBv.messageAction = paramAnonymousView.vCy.vCu;
              ((gt)localObject).cBv.messageExt = paramAnonymousView.vCy.vCt;
              ((gt)localObject).cBv.scene = 3;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
              com.tencent.mm.plugin.sns.c.a.gkF.a(b.this.activity, paramAnonymousView.vCy.fKh, str, localTimeLineObject.jBB, i, 11, 6, paramAnonymousView.vCy.vCs, localTimeLineObject.Id);
              AppMethodBeat.o(40260);
              break;
            }
            if (j == 2)
            {
              localObject = new gt();
              ((gt)localObject).cBv.context = b.this.activity;
              ((gt)localObject).cBv.actionCode = 1;
              ((gt)localObject).cBv.appId = paramAnonymousView.vCy.fKh;
              ((gt)localObject).cBv.messageAction = paramAnonymousView.vCy.vCu;
              ((gt)localObject).cBv.messageExt = paramAnonymousView.vCy.vCt;
              ((gt)localObject).cBv.scene = 3;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
              com.tencent.mm.plugin.sns.c.a.gkF.a(b.this.activity, paramAnonymousView.vCy.fKh, str, localTimeLineObject.jBB, i, 11, 3, paramAnonymousView.vCy.vCs, localTimeLineObject.Id);
            }
          }
        }
      }
    };
    this.rJT = new View.OnClickListener()
    {
      private static void ZQ(String paramAnonymousString)
      {
        AppMethodBeat.i(40262);
        long l = com.tencent.mm.plugin.sns.model.af.cnF().YT(paramAnonymousString).field_snsId;
        Object localObject1 = com.tencent.mm.plugin.sns.model.af.cnF().kD(l);
        if (localObject1 != null)
        {
          Object localObject2 = ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqu();
          if (localObject2 != null)
          {
            localObject2 = ((TimeLineObject)localObject2).xfI.wbK;
            if (((List)localObject2).size() > 0)
              ((List)localObject2).get(0);
          }
          localObject2 = com.tencent.mm.plugin.sns.model.aj.q((com.tencent.mm.plugin.sns.storage.n)localObject1);
          localObject1 = new ArrayList();
          LinkedList localLinkedList = ((cbf)localObject2).xaE.xbh;
          if (localLinkedList != null)
            for (int i = 0; i < localLinkedList.size(); i++)
            {
              localObject2 = (cbb)localLinkedList.get(i);
              com.tencent.mm.plugin.l.a.a locala = new com.tencent.mm.plugin.l.a.a();
              locala.igi = ((cbb)localObject2).vHl;
              locala.nRz = ((cbb)localObject2).pcX;
              locala.nRA = ((cbb)localObject2).wZK;
              ((List)localObject1).add(locala);
            }
          com.tencent.mm.plugin.l.a.o(paramAnonymousString, (List)localObject1);
        }
        AppMethodBeat.o(40262);
      }

      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(40261);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.storage.n))
        {
          paramAnonymousView = (com.tencent.mm.plugin.sns.storage.n)paramAnonymousView.getTag();
          if ((paramAnonymousView.field_type == 21) && (com.tencent.mm.model.r.Yz().equals(paramAnonymousView.field_userName)))
          {
            paramAnonymousView.cqu();
            com.tencent.mm.plugin.sns.lucky.a.m.m(paramAnonymousView);
            com.tencent.mm.plugin.sns.lucky.a.m.l(paramAnonymousView);
            System.currentTimeMillis();
            com.tencent.mm.plugin.sns.lucky.a.b.kT(24);
          }
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("key_sendid", paramAnonymousView.cqA());
          ((Intent)localObject).putExtra("key_feedid", paramAnonymousView.cqU());
          ((Intent)localObject).setClassName(b.this.activity, "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI");
          b.this.activity.startActivity((Intent)localObject);
          localObject = paramAnonymousView.cqU();
          paramAnonymousView.cqA();
          ZQ((String)localObject);
        }
        AppMethodBeat.o(40261);
      }
    };
    this.rJO = new b.15(this);
    this.rJP = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(40264);
        b.this.dJ(paramAnonymousView);
        AppMethodBeat.o(40264);
      }
    };
    this.rJQ = new b.17(this);
    this.rJR = new b.18(this);
    this.rJU = new b.19(this);
    this.jNA = new b.20(this);
    this.rKc = new b.21(this);
    this.rKf = new b.22(this);
    this.rKe = new b.24(this);
    this.rJX = new b.25(this);
    this.rKg = new b.26(this);
    this.rKj = new b.27(this);
    this.rKk = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(40284);
        if ((paramAnonymousView.getTag() != null) && ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
        {
          paramAnonymousAdapterView = (com.tencent.mm.plugin.sns.data.b)paramAnonymousView.getTag();
          if (paramAnonymousInt < paramAnonymousAdapterView.qFH.rDn.qTP.coJ().size())
            if (paramAnonymousAdapterView.qFH.rDn.qTT)
              AppMethodBeat.o(40284);
        }
        while (true)
        {
          return;
          a.b.a locala = (a.b.a)paramAnonymousAdapterView.qFH.rDn.qTP.coJ().get(paramAnonymousInt);
          ab.i("MicroMsg.TimelineClickListener", "unlike item click, reason=%s, id=%s", new Object[] { locala.qTZ, Integer.valueOf(locala.qUc) });
          com.tencent.mm.plugin.sns.storage.n localn = com.tencent.mm.plugin.sns.model.af.cnF().YT(paramAnonymousAdapterView.cwT);
          if (localn == null)
          {
            AppMethodBeat.o(40284);
          }
          else
          {
            locala.qFI = paramAnonymousAdapterView.qFI;
            locala.qUd = System.currentTimeMillis();
            paramAnonymousAdapterView = new com.tencent.mm.plugin.sns.model.r(localn.field_snsId, 8, locala);
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.a(paramAnonymousAdapterView, 0);
            b.this.dL(paramAnonymousView);
            AppMethodBeat.o(40284);
          }
        }
      }
    };
    this.rKn = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(40285);
        if ((paramAnonymousView.getTag() == null) || ((!(paramAnonymousView.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) && (!(paramAnonymousView.getTag() instanceof ao)) && (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.aj)) && (!(paramAnonymousView.getTag() instanceof MaskImageView)) && (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a))))
        {
          AppMethodBeat.o(40285);
          return;
        }
        Object localObject1 = null;
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;
        int n = 0;
        Object localObject3;
        if ((paramAnonymousView.getTag() instanceof ao))
        {
          localObject3 = com.tencent.mm.plugin.sns.storage.h.YT(((ao)paramAnonymousView.getTag()).czD);
          if ((paramAnonymousView instanceof LinearLayout))
          {
            n = 0;
            label119: if (!((ao)paramAnonymousView.getTag()).rnw)
              break label4076;
            m = ((ao)paramAnonymousView.getTag()).index;
            if (m <= 0)
              break label191;
            j = 2;
          }
        }
        while (true)
        {
          i = n;
          n = j;
          j = i;
          label162: if ((localObject3 == null) || (!((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32)))
          {
            AppMethodBeat.o(40285);
            break;
            n = 1;
            break label119;
            label191: j = 1;
            continue;
            if ((paramAnonymousView.getTag() instanceof MaskImageView))
            {
              localObject3 = (MaskImageView)paramAnonymousView.getTag();
              if (!(((MaskImageView)localObject3).getTag() instanceof ao))
                break label4070;
              localObject3 = com.tencent.mm.plugin.sns.storage.h.YT(((ao)((MaskImageView)localObject3).getTag()).czD);
              localObject1 = localObject3;
              j = k;
              if ((paramAnonymousView instanceof LinearLayout))
                break label414;
              n = 1;
              localObject1 = localObject3;
            }
          }
          while (true)
          {
            i = 0;
            m = 0;
            localObject3 = localObject1;
            j = n;
            n = i;
            break label162;
            if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.aj))
            {
              localObject1 = (com.tencent.mm.plugin.sns.ui.aj)paramAnonymousView.getTag();
              localObject3 = com.tencent.mm.plugin.sns.model.af.cnF().YT(((com.tencent.mm.plugin.sns.ui.aj)localObject1).cwT);
              if ((paramAnonymousView instanceof LinearLayout))
              {
                j = 0;
                label321: if (!((com.tencent.mm.plugin.sns.ui.aj)localObject1).rnw)
                  break label4061;
                m = ((com.tencent.mm.plugin.sns.ui.aj)localObject1).rnx;
                if (m <= 0)
                  break label351;
                n = 2;
              }
            }
            while (true)
            {
              break label162;
              j = 1;
              break label321;
              label351: n = 1;
              continue;
              if ((paramAnonymousView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
              {
                localObject3 = (BaseTimeLineItem.BaseViewHolder)paramAnonymousView.getTag();
                localObject1 = com.tencent.mm.plugin.sns.storage.h.YS(((BaseTimeLineItem.BaseViewHolder)localObject3).cFc);
                if (!(localObject3 instanceof i.b))
                  break label4055;
                j = ((i.b)localObject3).rJh.index;
                if (j > 0)
                  n = 2;
              }
              label1152: label1536: label3079: 
              while (true)
              {
                label414: label556: label833: label838: label1488: label1873: label1883: 
                while (true)
                {
                  m = j;
                  j = 0;
                  localObject3 = localObject1;
                  break label162;
                  n = 1;
                  continue;
                  label1757: label3425: if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a))
                  {
                    localObject3 = ((com.tencent.mm.plugin.sns.ui.c.a.a)paramAnonymousView.getTag()).ros;
                    localObject1 = localObject3;
                    j = k;
                    if (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.d))
                      continue;
                    j = ((com.tencent.mm.plugin.sns.ui.c.a.d)paramAnonymousView.getTag()).currentIndex;
                    if (j > 0);
                    for (n = 2; ; n = 1)
                    {
                      localObject1 = localObject3;
                      break;
                    }
                    label2277: label3046: 
                    try
                    {
                      localObject1 = b.a(b.this, (com.tencent.mm.plugin.sns.storage.n)localObject3);
                      if (localObject1 == null)
                      {
                        localObject1 = "";
                        localObject4 = ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().Id;
                        if (!((com.tencent.mm.plugin.sns.storage.n)localObject3).coX())
                        {
                          localObject5 = com.tencent.mm.plugin.report.service.h.pYm;
                          if (b.this.cvd != 0)
                            break label833;
                          i = 1;
                          if (j == 0)
                            break label838;
                        }
                      }
                      for (j = 1; ; j = 2)
                      {
                        ((com.tencent.mm.plugin.report.service.h)localObject5).e(14066, new Object[] { Integer.valueOf(i), Integer.valueOf(j), localObject4, localObject1 });
                        if (((com.tencent.mm.plugin.sns.storage.n)localObject3).crd().cqo().coS())
                        {
                          localObject5 = ((com.tencent.mm.plugin.sns.storage.n)localObject3).crd().cqo().coN();
                          localObject4 = ((com.tencent.mm.plugin.sns.storage.n)localObject3).crc();
                          com.tencent.mm.kernel.g.RN();
                          localObject1 = com.tencent.mm.kernel.a.QG();
                          v.h((String)localObject5, (String)localObject4, (String)localObject1, v.ak((String)localObject5, (String)localObject4, (String)localObject1), 0);
                        }
                        localTimeLineObject = ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu();
                        if (((localTimeLineObject.xfI.wbJ != 15) || (localTimeLineObject.xfP == 1)) && ((localTimeLineObject.xfI.wbJ != 27) || (localTimeLineObject.xfI.wbK.size() <= m) || (((bau)localTimeLineObject.xfI.wbK.get(m)).jCt != 6)))
                          break label2616;
                        ab.i("MicroMsg.TimelineClickListener", "onsight click");
                        localObject1 = null;
                        localObject4 = null;
                        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.aj))
                          localObject1 = (com.tencent.mm.plugin.sns.ui.aj)paramAnonymousView.getTag();
                        if (!(paramAnonymousView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
                          break label881;
                        localObject4 = (BaseTimeLineItem.BaseViewHolder)paramAnonymousView.getTag();
                        if (localTimeLineObject.xfI.wbJ != 27)
                          break label872;
                        localObject1 = ((i.b)localObject4).rJi;
                        if (localObject3 != null)
                          break label905;
                        AppMethodBeat.o(40285);
                        break;
                        localObject1 = ((com.tencent.mm.plugin.sns.storage.a)localObject1).hnw;
                        break label521;
                        i = 2;
                        break label556;
                      }
                    }
                    catch (Exception localException)
                    {
                      label872: label2286: 
                      while (true)
                      {
                        Object localObject4;
                        Object localObject5;
                        TimeLineObject localTimeLineObject;
                        ab.e("MicroMsg.TimelineClickListener", "report click ad card style error " + localException.getMessage());
                        continue;
                        localObject2 = ((BaseTimeLineItem.BaseViewHolder)localObject4).rGD;
                        continue;
                        label881: if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a))
                        {
                          localObject2 = ((com.tencent.mm.plugin.sns.ui.c.a.a)paramAnonymousView.getTag()).rGD;
                          continue;
                          if (b.this.rhQ != null)
                            b.this.rhQ.cnj().x((com.tencent.mm.plugin.sns.storage.n)localObject3);
                          boolean bool = ((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32);
                          if ((localTimeLineObject.xfI.wbK == null) || (localTimeLineObject.xfI.wbK.size() == 0))
                          {
                            ab.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
                            AppMethodBeat.o(40285);
                            break;
                          }
                          bau localbau = (bau)localTimeLineObject.xfI.wbK.get(m);
                          if (bool)
                          {
                            com.tencent.mm.plugin.sns.model.af.cnC();
                            if ((!com.tencent.mm.plugin.sns.model.g.t(localbau)) && (localObject2 != null))
                            {
                              ((com.tencent.mm.plugin.sns.ui.aj)localObject2).raP.setVisibility(8);
                              ((com.tencent.mm.plugin.sns.ui.aj)localObject2).rnu.setVisibility(0);
                              ((com.tencent.mm.plugin.sns.ui.aj)localObject2).rnu.dKB();
                              com.tencent.mm.plugin.sns.model.af.cnC().z(localbau);
                              localObject2 = com.tencent.mm.plugin.sns.model.af.cnA();
                              paramAnonymousView = az.dtl();
                              paramAnonymousView.oyB = localTimeLineObject.pcX;
                              ((com.tencent.mm.plugin.sns.model.b)localObject2).a(localbau, 4, null, paramAnonymousView);
                              if (bool)
                                j.a(j.b.qET, j.a.qEK, (com.tencent.mm.plugin.sns.storage.n)localObject3, b.this.cvd);
                              AppMethodBeat.o(40285);
                              break;
                            }
                          }
                          if ((((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32)) && (((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().coK()))
                          {
                            String str = ((com.tencent.mm.plugin.sns.storage.n)localObject3).crd().field_adxml;
                            if (m > 0)
                            {
                              localObject5 = "adTurnCanvasInfo";
                              if (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.go(str, (String)localObject5))
                                break label1312;
                            }
                          }
                          for (i = 1; ; i = 0)
                          {
                            if ((i != 0) || (!bool) || (!com.tencent.mm.plugin.sns.model.af.cnC().u(localbau)) || (localObject2 == null))
                              break label1317;
                            com.tencent.mm.plugin.sns.model.af.cnC().z(localbau);
                            ((com.tencent.mm.plugin.sns.ui.aj)localObject2).raP.setVisibility(8);
                            ((com.tencent.mm.plugin.sns.ui.aj)localObject2).rnu.setVisibility(8);
                            paramAnonymousView = com.tencent.mm.plugin.sns.model.af.cnC();
                            localObject4 = ((com.tencent.mm.plugin.sns.ui.aj)localObject2).qzM;
                            j = b.this.activity.hashCode();
                            n = ((com.tencent.mm.plugin.sns.ui.aj)localObject2).position;
                            localObject2 = az.dtl();
                            ((az)localObject2).oyB = localTimeLineObject.pcX;
                            paramAnonymousView.a((com.tencent.mm.plugin.sns.storage.n)localObject3, localbau, (com.tencent.mm.plugin.sight.decode.a.a)localObject4, j, n, (az)localObject2, bool);
                            if (bool)
                              j.a(j.b.qET, j.a.qEK, (com.tencent.mm.plugin.sns.storage.n)localObject3, b.this.cvd);
                            AppMethodBeat.o(40285);
                            break;
                            localObject5 = "adCanvasInfo";
                            break label1152;
                          }
                          if (b.this.cvd == 0)
                          {
                            localObject2 = com.tencent.mm.modelsns.b.lY(717);
                            ((com.tencent.mm.modelsns.b)localObject2).tx(com.tencent.mm.plugin.sns.data.i.j((com.tencent.mm.plugin.sns.storage.n)localObject3)).mb(((com.tencent.mm.plugin.sns.storage.n)localObject3).field_type).cS(((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32)).tx(((com.tencent.mm.plugin.sns.storage.n)localObject3).crc()).tx(localbau.Id);
                            ((com.tencent.mm.modelsns.b)localObject2).ajK();
                            if (b.this.cvd != 0)
                              break label1873;
                            localObject2 = com.tencent.mm.modelsns.b.lY(745);
                            label1400: ((com.tencent.mm.modelsns.b)localObject2).tx(com.tencent.mm.plugin.sns.data.i.j((com.tencent.mm.plugin.sns.storage.n)localObject3)).mb(((com.tencent.mm.plugin.sns.storage.n)localObject3).field_type).cS(((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32));
                            localObject5 = new int[2];
                            if (localObject4 == null)
                              break label1938;
                            if (((BaseTimeLineItem.BaseViewHolder)localObject4).rGD.rnt == null)
                              break label1883;
                            ((BaseTimeLineItem.BaseViewHolder)localObject4).rGD.rnt.getLocationInWindow((int[])localObject5);
                            j = ((BaseTimeLineItem.BaseViewHolder)localObject4).rGD.rnt.getWidth();
                            n = ((BaseTimeLineItem.BaseViewHolder)localObject4).rGD.rnt.getHeight();
                          }
                          while (true)
                          {
                            com.tencent.mm.plugin.report.service.h.pYm.e(11444, new Object[] { Integer.valueOf(3) });
                            if (i != 0)
                            {
                              if ((paramAnonymousView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
                              {
                                b.this.h((BaseTimeLineItem.BaseViewHolder)paramAnonymousView.getTag());
                                k = b.this.cvd;
                                if (b.this.cvd != 0)
                                  break label2042;
                                i = 1;
                                com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(k, i, ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId, 22, 21));
                                localObject2 = new Intent();
                                ((Intent)localObject2).putExtra("img_gallery_left", localObject5[0]);
                                ((Intent)localObject2).putExtra("img_gallery_top", localObject5[1]);
                                ((Intent)localObject2).putExtra("img_gallery_width", j);
                                ((Intent)localObject2).putExtra("img_gallery_height", n);
                                ((Intent)localObject2).putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqA());
                                ((Intent)localObject2).putExtra("sns_landing_pages_rawSnsId", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().Id);
                                ((Intent)localObject2).putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.n)localObject3).crc());
                                paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu();
                                if (paramAnonymousView != null)
                                {
                                  paramAnonymousView = paramAnonymousView.xfI.wbK;
                                  if (paramAnonymousView.size() > m)
                                    ((Intent)localObject2).putExtra("sns_landing_pages_share_thumb_url", ((bau)paramAnonymousView.get(m)).wEH);
                                }
                                ((Intent)localObject2).setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                                n = 1;
                                if (b.this.cvd != 2)
                                  break label2047;
                                n = 16;
                                ((Intent)localObject2).putExtra("sns_landig_pages_from_source", n);
                                if (m <= 0)
                                  break label2064;
                              }
                              for (paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().coV(); ; paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).crd().field_adxml)
                              {
                                ((Intent)localObject2).putExtra("sns_landing_pages_xml", paramAnonymousView);
                                ((Intent)localObject2).putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cre());
                                ((Intent)localObject2).putExtra("sns_landing_pages_xml_prefix", "adxml");
                                ((Intent)localObject2).putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                                ((Intent)localObject2).putExtra("sns_landing_is_native_sight_ad", true);
                                b.this.activity.startActivity((Intent)localObject2);
                                b.this.activity.overridePendingTransition(0, 0);
                                AppMethodBeat.o(40285);
                                break;
                                localObject2 = com.tencent.mm.modelsns.b.lZ(717);
                                break label1334;
                                localObject2 = com.tencent.mm.modelsns.b.lZ(745);
                                break label1400;
                                if (localTimeLineObject.xfI.wbJ != 27)
                                  break label4034;
                                ((i.b)localObject4).rJf.getLocationInWindow((int[])localObject5);
                                j = ((i.b)localObject4).rJf.getWidth();
                                n = ((i.b)localObject4).rJf.getHeight();
                                break label1488;
                                if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.aj))
                                {
                                  localObject2 = (com.tencent.mm.plugin.sns.ui.aj)paramAnonymousView.getTag();
                                  if (localObject2 != null)
                                    ((com.tencent.mm.plugin.sns.ui.aj)localObject2).rnt.getLocationInWindow((int[])localObject5);
                                  j = ((com.tencent.mm.plugin.sns.ui.aj)localObject2).rnt.getWidth();
                                  n = ((com.tencent.mm.plugin.sns.ui.aj)localObject2).rnt.getHeight();
                                  break label1488;
                                }
                                if (paramAnonymousView != null)
                                  paramAnonymousView.getLocationInWindow((int[])localObject5);
                                j = paramAnonymousView.getWidth();
                                n = paramAnonymousView.getHeight();
                                break label1488;
                                if (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a))
                                  break label1536;
                                b.this.a((com.tencent.mm.plugin.sns.ui.c.a.a)paramAnonymousView.getTag());
                                break label1536;
                                label2042: i = 2;
                                break label1557;
                                label2047: if (b.this.cvd != 1)
                                  break label1757;
                                n = 2;
                                break label1757;
                              }
                            }
                            paramAnonymousView = b.this;
                            localObject2 = b.a(b.this, (com.tencent.mm.plugin.sns.storage.n)localObject3);
                            if (m > 0)
                            {
                              bool = true;
                              if (!b.a(paramAnonymousView, (com.tencent.mm.plugin.sns.storage.a)localObject2, (com.tencent.mm.plugin.sns.storage.n)localObject3, bool))
                                break label2176;
                              j = b.this.cvd;
                              if (b.this.cvd != 0)
                                break label2170;
                            }
                            label2170: for (n = 1; ; n = 2)
                            {
                              com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(j, n, ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId, 22, 31));
                              AppMethodBeat.o(40285);
                              break;
                              bool = false;
                              break label2099;
                            }
                            j = b.this.cvd;
                            if (b.this.cvd == 0)
                            {
                              n = 1;
                              localObject4 = new SnsAdClick(j, n, ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId, 22, 0);
                              com.tencent.mm.plugin.sns.data.i.a((SnsAdClick)localObject4);
                              if (m <= 0)
                                break label2277;
                            }
                            for (paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().qUX.qTA; ; paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).crb())
                            {
                              localObject2 = paramAnonymousView;
                              if (bo.isNullOrNil(paramAnonymousView))
                                localObject2 = ((com.tencent.mm.plugin.sns.storage.n)localObject3).getAdLink();
                              if (!bo.isNullOrNil((String)localObject2))
                                break label2286;
                              AppMethodBeat.o(40285);
                              break;
                              n = 2;
                              break label2198;
                            }
                            ab.i("MicroMsg.TimelineClickListener", "adlink url " + (String)localObject2 + " " + ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().qUg);
                            paramAnonymousView = new Intent();
                            if (((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().qUg == 0);
                            for (bool = true; ; bool = false)
                            {
                              if (com.tencent.mm.platformtools.ae.giI)
                                bool = false;
                              if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32)))
                              {
                                localObject5 = b.a(b.this, (com.tencent.mm.plugin.sns.storage.n)localObject3);
                                if (localObject5 != null)
                                  paramAnonymousView.putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject5).hnw);
                              }
                              paramAnonymousView.putExtra("KRightBtn", bool);
                              localObject5 = new Bundle();
                              ((Bundle)localObject5).putParcelable("KSnsAdTag", (Parcelable)localObject4);
                              ((Bundle)localObject5).putString("key_snsad_statextstr", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().rjC);
                              paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject5);
                              paramAnonymousView.putExtra("rawUrl", (String)localObject2);
                              paramAnonymousView.putExtra("useJs", true);
                              paramAnonymousView.putExtra("srcUsername", ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_userName);
                              paramAnonymousView.putExtra("stastic_scene", 15);
                              paramAnonymousView.putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId));
                              paramAnonymousView.putExtra("pre_username", ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_userName);
                              paramAnonymousView.putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId));
                              paramAnonymousView.putExtra("preUsername", ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_userName);
                              com.tencent.mm.plugin.sns.c.a.gkE.i(paramAnonymousView, b.this.activity);
                              AppMethodBeat.o(40285);
                              break;
                            }
                            if (((localTimeLineObject.xfI.wbJ == 1) && (localTimeLineObject.xfI.wbK.size() == 1)) || (localTimeLineObject.xfI.wbJ == 7) || ((localTimeLineObject.xfI.wbJ == 27) && (localTimeLineObject.xfI.wbK.size() > m) && (((bau)localTimeLineObject.xfI.wbK.get(m)).jCt == 2)))
                              if ((paramAnonymousView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
                              {
                                localObject2 = (BaseTimeLineItem.BaseViewHolder)paramAnonymousView.getTag();
                                if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.a.a))
                                  localObject2 = ((com.tencent.mm.plugin.sns.ui.item.a.a)paramAnonymousView.getTag()).rGX;
                              }
                            while (true)
                            {
                              if (((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().coK())
                              {
                                localObject5 = ((com.tencent.mm.plugin.sns.storage.n)localObject3).crd().field_adxml;
                                if (m > 0)
                                {
                                  localObject4 = "adTurnCanvasInfo";
                                  if (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.go((String)localObject5, (String)localObject4))
                                    break label3487;
                                  i = b.this.cvd;
                                  if (b.this.cvd != 0)
                                    break label3392;
                                  j = 1;
                                  label2809: com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(i, j, ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId, 21, n, (byte)0));
                                  if (!(paramAnonymousView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
                                    break label3398;
                                  b.this.h((BaseTimeLineItem.BaseViewHolder)paramAnonymousView.getTag());
                                  paramAnonymousView = new int[2];
                                  ((View)localObject2).getLocationInWindow(paramAnonymousView);
                                  n = ((View)localObject2).getWidth();
                                  j = ((View)localObject2).getHeight();
                                  localObject2 = new Intent();
                                  ((Intent)localObject2).putExtra("img_gallery_left", paramAnonymousView[0]);
                                  ((Intent)localObject2).putExtra("img_gallery_top", paramAnonymousView[1]);
                                  ((Intent)localObject2).putExtra("img_gallery_width", n);
                                  ((Intent)localObject2).putExtra("img_gallery_height", j);
                                  ((Intent)localObject2).putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqA());
                                  ((Intent)localObject2).putExtra("sns_landing_pages_rawSnsId", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().Id);
                                  ((Intent)localObject2).putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.n)localObject3).crc());
                                  ((Intent)localObject2).putExtra("sns_landing_pages_aid", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqZ());
                                  ((Intent)localObject2).putExtra("sns_landing_pages_traceid", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cra());
                                  paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu();
                                  if (paramAnonymousView != null)
                                  {
                                    paramAnonymousView = paramAnonymousView.xfI.wbK;
                                    if (paramAnonymousView.size() <= m)
                                      break label3425;
                                    ((Intent)localObject2).putExtra("sns_landing_pages_share_thumb_url", ((bau)paramAnonymousView.get(m)).wEH);
                                  }
                                  ((Intent)localObject2).setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                                  n = 1;
                                  if (b.this.cvd != 2)
                                    break label3458;
                                  n = 16;
                                  ((Intent)localObject2).putExtra("sns_landig_pages_from_source", n);
                                  if (m <= 0)
                                    break label3475;
                                }
                                for (paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().coV(); ; paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).crd().field_adxml)
                                {
                                  ((Intent)localObject2).putExtra("sns_landing_pages_xml", paramAnonymousView);
                                  ((Intent)localObject2).putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cre());
                                  ((Intent)localObject2).putExtra("sns_landing_pages_xml_prefix", "adxml");
                                  ((Intent)localObject2).putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                                  b.this.activity.startActivity((Intent)localObject2);
                                  b.this.activity.overridePendingTransition(0, 0);
                                  if (b.this.rhQ != null)
                                    b.this.rhQ.cnj().x((com.tencent.mm.plugin.sns.storage.n)localObject3);
                                  AppMethodBeat.o(40285);
                                  break;
                                  if ((paramAnonymousView.getTag() instanceof c.a))
                                  {
                                    localObject2 = ((c.a)paramAnonymousView.getTag()).rGX;
                                    break label2747;
                                  }
                                  if ((localObject2 instanceof i.b))
                                  {
                                    localObject2 = (TagImageView)((i.b)localObject2).rJh.view;
                                    break label2747;
                                  }
                                  localObject2 = ((BaseTimeLineItem.BaseViewHolder)localObject2).rHT.DT(0);
                                  break label2747;
                                  if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a))
                                  {
                                    if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.b))
                                    {
                                      localObject2 = ((com.tencent.mm.plugin.sns.ui.c.a.b)paramAnonymousView.getTag()).rGK;
                                      break label2747;
                                    }
                                    if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.c))
                                    {
                                      localObject2 = ((com.tencent.mm.plugin.sns.ui.c.a.c)paramAnonymousView.getTag()).rGX;
                                      break label2747;
                                    }
                                    if (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.d))
                                      break label4029;
                                    localObject2 = ((com.tencent.mm.plugin.sns.ui.c.a.d)paramAnonymousView.getTag()).contentView;
                                    break label2747;
                                  }
                                  if ((paramAnonymousView.getTag() instanceof MaskImageView))
                                  {
                                    localObject2 = (MaskImageView)paramAnonymousView.getTag();
                                    break label2747;
                                  }
                                  if (!(paramAnonymousView.getTag() instanceof TagImageView))
                                    break label4029;
                                  localObject2 = (TagImageView)paramAnonymousView;
                                  break label2747;
                                  localObject4 = "adCanvasInfo";
                                  break label2778;
                                  j = 2;
                                  break label2809;
                                  if (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a))
                                    break label2856;
                                  b.this.a((com.tencent.mm.plugin.sns.ui.c.a.a)paramAnonymousView.getTag());
                                  break label2856;
                                  if (paramAnonymousView.size() <= 0)
                                    break label3046;
                                  ((Intent)localObject2).putExtra("sns_landing_pages_share_thumb_url", ((bau)paramAnonymousView.get(0)).wEH);
                                  break label3046;
                                  if (b.this.cvd != 1)
                                    break label3079;
                                  n = 2;
                                  break label3079;
                                }
                              }
                              paramAnonymousView = b.this;
                              localObject2 = b.a(b.this, (com.tencent.mm.plugin.sns.storage.n)localObject3);
                              if (m > 0)
                              {
                                bool = true;
                                if (!b.a(paramAnonymousView, (com.tencent.mm.plugin.sns.storage.a)localObject2, (com.tencent.mm.plugin.sns.storage.n)localObject3, bool))
                                  break label3588;
                                m = b.this.cvd;
                                if (b.this.cvd != 0)
                                  break label3582;
                              }
                              label3582: for (j = 1; ; j = 2)
                              {
                                com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(m, j, ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId, 31, n, (byte)0));
                                AppMethodBeat.o(40285);
                                break;
                                bool = false;
                                break label3510;
                              }
                              if (m > 0);
                              for (paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().qUX.qTA; ; paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.n)localObject3).crb())
                              {
                                localObject2 = paramAnonymousView;
                                if (bo.isNullOrNil(paramAnonymousView))
                                  localObject2 = ((com.tencent.mm.plugin.sns.storage.n)localObject3).getAdLink();
                                if (!bo.isNullOrNil((String)localObject2))
                                  break label3644;
                                AppMethodBeat.o(40285);
                                break;
                              }
                              m = b.this.cvd;
                              if (b.this.cvd == 0)
                              {
                                j = 1;
                                localObject4 = new SnsAdClick(m, j, ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId, 0, n, (byte)0);
                                com.tencent.mm.plugin.sns.data.i.a((SnsAdClick)localObject4);
                                ab.i("MicroMsg.TimelineClickListener", "adlink url " + (String)localObject2 + " " + ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().qUg);
                                paramAnonymousView = new Intent();
                                if (((com.tencent.mm.plugin.sns.storage.n)localObject3).cqo().qUg != 0)
                                  break label4023;
                              }
                              for (bool = true; ; bool = false)
                              {
                                if (com.tencent.mm.platformtools.ae.giI)
                                  bool = false;
                                if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32)))
                                {
                                  localObject5 = b.a(b.this, (com.tencent.mm.plugin.sns.storage.n)localObject3);
                                  if (localObject5 != null)
                                    paramAnonymousView.putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject5).hnw);
                                }
                                paramAnonymousView.putExtra("KRightBtn", bool);
                                localObject5 = new Bundle();
                                ((Bundle)localObject5).putParcelable("KSnsAdTag", (Parcelable)localObject4);
                                ((Bundle)localObject5).putString("key_snsad_statextstr", ((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().rjC);
                                paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject5);
                                paramAnonymousView.putExtra("rawUrl", (String)localObject2);
                                paramAnonymousView.putExtra("useJs", true);
                                paramAnonymousView.putExtra("srcUsername", ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_userName);
                                paramAnonymousView.putExtra("stastic_scene", 15);
                                paramAnonymousView.putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId));
                                paramAnonymousView.putExtra("pre_username", ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_userName);
                                paramAnonymousView.putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(((com.tencent.mm.plugin.sns.storage.n)localObject3).field_snsId));
                                paramAnonymousView.putExtra("preUsername", ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_userName);
                                com.tencent.mm.plugin.sns.c.a.gkE.i(paramAnonymousView, b.this.activity);
                                AppMethodBeat.o(40285);
                                break;
                                j = 2;
                                break label3666;
                              }
                              localObject2 = null;
                            }
                            n = 0;
                            j = 0;
                          }
                        }
                      }
                    }
                  }
                }
                label521: label905: label1312: label1317: label1334: label2616: label2747: label2778: Object localObject2 = null;
                label1557: label2099: label3392: label3398: label3666: j = k;
                label1938: label2198: label2856: label3510: label3644: label4029: label4034: continue;
                label2064: label3475: label3487: label4023: label4055: n = 0;
              }
              label2176: label3458: label3588: label4061: n = 0;
              m = i;
            }
            label4070: n = 0;
          }
          label4076: j = 0;
        }
      }
    };
    this.rKb = new b.30(this);
    this.rJj = new b.31(this);
  }

  public final void a(com.tencent.mm.plugin.sns.ui.c.a.a parama)
  {
    if ((parama instanceof com.tencent.mm.plugin.sns.ui.c.a.b))
    {
      this.rJF = new com.tencent.mm.plugin.sns.ui.b.a.d((MMActivity)this.activity, parama);
      this.rJG = new com.tencent.mm.plugin.sns.ui.b.a.c((MMActivity)this.activity, parama);
    }
    while (true)
    {
      return;
      if ((parama instanceof com.tencent.mm.plugin.sns.ui.c.a.c))
      {
        this.rJF = new com.tencent.mm.plugin.sns.ui.b.a.f((MMActivity)this.activity, parama);
        this.rJG = new com.tencent.mm.plugin.sns.ui.b.a.e((MMActivity)this.activity, parama);
      }
      else if ((parama instanceof com.tencent.mm.plugin.sns.ui.c.a.d))
      {
        this.rJF = new com.tencent.mm.plugin.sns.ui.b.a.h((MMActivity)this.activity, parama);
        this.rJG = new com.tencent.mm.plugin.sns.ui.b.a.g((MMActivity)this.activity, parama);
      }
    }
  }

  public abstract void b(View paramView, int paramInt1, int paramInt2, int paramInt3);

  public final void bIB()
  {
    this.rJH.bIB();
    com.tencent.mm.sdk.b.a.xxA.c(this.rKq);
    com.tencent.mm.sdk.b.a.xxA.c(this.rKr);
  }

  public abstract void cp(Object paramObject);

  public abstract void crE();

  public abstract void crF();

  public abstract void dG(View paramView);

  public abstract void dH(View paramView);

  public abstract void dI(View paramView);

  public abstract void dJ(View paramView);

  public abstract void dK(View paramView);

  public abstract void dL(View paramView);

  public final void h(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    if ((paramBaseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.a.a))
    {
      this.rJD = new com.tencent.mm.plugin.sns.ui.b.b.d((MMActivity)this.activity, paramBaseViewHolder);
      this.rJE = new com.tencent.mm.plugin.sns.ui.b.b.c((MMActivity)this.activity, paramBaseViewHolder);
    }
    while (true)
    {
      return;
      if ((paramBaseViewHolder instanceof c.a))
      {
        this.rJD = new com.tencent.mm.plugin.sns.ui.b.b.f((MMActivity)this.activity, paramBaseViewHolder);
        this.rJE = new com.tencent.mm.plugin.sns.ui.b.b.e((MMActivity)this.activity, paramBaseViewHolder);
      }
      else if ((paramBaseViewHolder instanceof i.b))
      {
        this.rJD = new com.tencent.mm.plugin.sns.ui.b.b.h((MMActivity)this.activity, paramBaseViewHolder);
        this.rJE = new com.tencent.mm.plugin.sns.ui.b.b.g((MMActivity)this.activity, paramBaseViewHolder);
      }
    }
  }

  public final void removeListener()
  {
    this.rJH.removeListener();
    com.tencent.mm.sdk.b.a.xxA.d(this.rKq);
    com.tencent.mm.sdk.b.a.xxA.d(this.rKr);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b
 * JD-Core Version:    0.6.2
 */