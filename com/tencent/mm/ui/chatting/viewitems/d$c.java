package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.r;
import com.tencent.mm.ah.i;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.j.a;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.f;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

final class d$c extends c.a
{
  public static int[] mqq = { 2131822651, 2131822652, 2131822653, 2131822654, 2131822655 };
  protected TextView gnB;
  protected TextView gnC;
  protected TextView moL;
  private ArrayList<MMImageView> rlN;
  protected MMImageView zbI;
  protected ImageView zbJ;
  protected ImageView zbK;
  protected TextView zbL;
  protected LinearLayout zbM;
  protected TextView zbN;
  protected ImageView zbO;
  protected MMPinProgressBtn zbP;
  protected ImageView zbQ;
  protected ImageView zbR;
  protected ImageView zbS;
  protected ImageView zbT;
  protected TextView zbU;
  protected ChattingItemFooter zbV;
  protected ImageView zbW;
  protected LinearLayout zbX;
  protected ViewGroup zbY;
  protected TextView zbZ;
  ImageView zcA;
  TextView zcB;
  LinearLayout zcC;
  MMNeat7extView zcD;
  ImageView zcE;
  ImageView zcF;
  ImageView zcG;
  TextView zcH;
  TextView zcI;
  public int zcJ;
  private int zcK;
  protected LinearLayout zca;
  protected RelativeLayout zcb;
  protected FrameLayout zcc;
  protected LinearLayout zcd;
  protected LinearLayout zce;
  protected ViewStub zcf;
  protected ImageView zcg;
  protected ImageView zch;
  ImageView zci;
  protected LinearLayout zcj;
  protected ImageView zck;
  protected TextView zcl;
  protected TextView zcm;
  protected ImageView zcn;
  protected TextView zco;
  protected TextView zcp;
  protected LinearLayout zcq;
  protected ImageView zcr;
  protected ImageView zcs;
  protected TextView zct;
  protected LinearLayout zcu;
  LinearLayout zcv;
  TextView zcw;
  TextView zcx;
  ImageView zcy;
  ImageView zcz;

  d$c()
  {
    AppMethodBeat.i(32813);
    this.zcJ = 0;
    this.zcK = 2147483647;
    this.rlN = new ArrayList();
    AppMethodBeat.o(32813);
  }

  private static void a(com.tencent.mm.ui.chatting.d.a parama, c paramc, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, int[] paramArrayOfInt1, String[] paramArrayOfString4, String[] paramArrayOfString5, int[] paramArrayOfInt2, String paramString)
  {
    AppMethodBeat.i(32821);
    for (int i = 0; i <= 4; i++)
    {
      localObject1 = (MMImageView)paramc.zce.findViewById(mqq[i]);
      if (localObject1 != null)
      {
        ((MMImageView)localObject1).setImageDrawable(null);
        ((MMImageView)localObject1).setVisibility(8);
      }
    }
    Object localObject1 = (ImageView)paramc.zce.findViewById(2131822656);
    Object localObject2 = (TextView)paramc.zce.findViewById(2131822657);
    if (localObject1 != null)
      ((ImageView)localObject1).setVisibility(8);
    if (localObject2 != null)
      ((TextView)localObject2).setVisibility(8);
    i = 0;
    if (i < paramInt)
    {
      label147: Object localObject3;
      if (paramInt == 1)
      {
        localObject1 = (MMImageView)paramc.zce.findViewById(mqq[i]);
        ((MMImageView)localObject1).setImageResource(2131231107);
        ((MMImageView)localObject1).setVisibility(0);
        am.dhM().a((j.a)parama.aF(com.tencent.mm.ui.chatting.c.b.h.class), paramArrayOfString1[i], bo.anU(), paramArrayOfString2[i], paramArrayOfString3[i], paramArrayOfInt1[i], paramString);
        localObject2 = com.tencent.mm.at.o.ahl().q("Note_" + paramArrayOfString1[i], "", "");
        localObject3 = new com.tencent.mm.at.a.a.c.a();
        ((com.tencent.mm.at.a.a.c.a)localObject3).fHe = 1;
        ((com.tencent.mm.at.a.a.c.a)localObject3).eQa = true;
        ((com.tencent.mm.at.a.a.c.a)localObject3).ePV = 2131231106;
        ((com.tencent.mm.at.a.a.c.a)localObject3).ePN = ((int)parama.yTx.getMMResources().getDimension(2131427527));
        ((com.tencent.mm.at.a.a.c.a)localObject3).ePO = ((int)parama.yTx.getMMResources().getDimension(2131427527));
        localObject3 = ((com.tencent.mm.at.a.a.c.a)localObject3).ahG();
        if (!com.tencent.mm.vfs.e.ct((String)localObject2))
          break label351;
        com.tencent.mm.at.o.ahp().a((String)localObject2, (ImageView)localObject1, (com.tencent.mm.at.a.a.c)localObject3);
      }
      while (true)
      {
        i++;
        break;
        localObject1 = (MMImageView)paramc.zce.findViewById(mqq[(i + 1)]);
        ((MMImageView)localObject1).setImageResource(2131231106);
        break label147;
        label351: am.dhM().a((j.a)parama.aF(com.tencent.mm.ui.chatting.c.b.h.class), paramArrayOfString1[i], bo.anU(), paramArrayOfString4[i], paramArrayOfString5[i], paramArrayOfInt2[i], paramString);
        com.tencent.mm.at.o.ahl().q("Note_" + paramArrayOfString1[i], "", "");
        com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), 45);
        if (com.tencent.mm.vfs.e.ct((String)localObject2))
          com.tencent.mm.at.o.ahp().a((String)localObject2, (ImageView)localObject1, (com.tencent.mm.at.a.a.c)localObject3);
        else
          ab.i("MicroMsg.AppMsgViewHolder", "thumb file not exist!");
      }
    }
    AppMethodBeat.o(32821);
  }

  static void a(com.tencent.mm.ui.chatting.d.a parama, c paramc, j.b paramb, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(32819);
    paramc.zcd.setVisibility(8);
    paramc.zcC.setVisibility(0);
    Object localObject1;
    int i;
    label91: Object localObject2;
    if ((paramb.title != null) && (paramb.title.length() > 0))
    {
      paramc.zcD.setMaxLines(2);
      paramc.zcD.setVisibility(0);
      paramc.zcD.ah(paramb.getTitle());
      localObject1 = (com.tencent.mm.af.e)paramb.X(com.tencent.mm.af.e.class);
      if (localObject1 == null)
        break label454;
      i = ((com.tencent.mm.af.e)localObject1).duration;
      localObject2 = com.tencent.mm.af.l.kr(i);
      if (bo.isNullOrNil((String)localObject2))
        break label460;
      paramc.zcI.setVisibility(0);
      paramc.zcI.setText((CharSequence)localObject2);
      label123: paramc.zcG.setVisibility(0);
      if ((localObject1 != null) && (r.ks(((com.tencent.mm.af.e)localObject1).fgc)))
      {
        paramc.zcI.setVisibility(8);
        paramc.zcG.setVisibility(8);
      }
      a.b.r(paramc.zcF, paramb.cMg);
      localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramb.cMg);
      if ((localObject2 != null) && ((int)((com.tencent.mm.n.a)localObject2).ewQ > 0))
        break label472;
      localObject2 = paramb.cMh;
      paramc.zcF.setTag(paramb.cMg);
      localObject1 = new WeakReference(paramc.zcF);
      ao.a.flu.a(paramb.cMg, "", new d.c.3((WeakReference)localObject1));
      label268: paramc.zcH.setText(com.tencent.mm.pluginsdk.ui.e.j.b(parama.yTx.getContext(), (CharSequence)localObject2, paramc.zcH.getTextSize()));
      paramc.zbO.setVisibility(4);
      i = com.tencent.mm.bz.a.al(parama.yTx.getContext(), 2131428222) - com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), 24);
      int j = i * 9 / 16;
      if ((!paramBoolean) && (bo.isNullOrNil(paramb.thumburl)))
        break label586;
      parama = paramb.thumburl;
      paramb = new com.tencent.mm.at.a.a.c.a();
      paramb.ePT = 2131689876;
      paramb.ePG = true;
      paramb.ePJ = q.v(parama, parambi.getType(), "@T");
      parambi = paramb.ct(i, j);
      parambi.fGV = new f();
      parambi.ePF = true;
      com.tencent.mm.at.o.ahp().a(parama, paramc.zcE, paramb.ahG());
      AppMethodBeat.o(32819);
    }
    while (true)
    {
      return;
      paramc.zcD.setVisibility(8);
      break;
      label454: i = 0;
      break label91;
      label460: paramc.zcI.setVisibility(8);
      break label123;
      label472: if ((!com.tencent.mm.n.a.jh(((ap)localObject2).field_type)) && (com.tencent.mm.ah.b.a(paramb.cMg, false, -1) == null))
      {
        localObject1 = com.tencent.mm.ah.o.act().qo(paramb.cMg);
        if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.ah.h)localObject1).acl())))
          com.tencent.mm.plugin.brandservice.b.a.a(paramc.zcF, (ad)localObject2, ((com.tencent.mm.ah.h)localObject1).acl(), true);
      }
      localObject1 = s.mJ(paramb.cMg);
      localObject2 = localObject1;
      if (!bo.isEqual((String)localObject1, paramb.cMg))
        break label268;
      localObject2 = localObject1;
      if (bo.isNullOrNil(paramb.cMh))
        break label268;
      localObject2 = paramb.cMh;
      break label268;
      label586: paramb = null;
      if (!d.b.arC(parambi.field_imgPath))
        paramb = com.tencent.mm.at.o.ahl().a(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama.yTx.getContext()), false);
      if ((paramb != null) && (!paramb.isRecycled()))
      {
        paramc.zcE.setImageBitmap(paramb);
        AppMethodBeat.o(32819);
      }
      else
      {
        paramc.zcE.setImageResource(2131689876);
        AppMethodBeat.o(32819);
      }
    }
  }

  static void a(com.tencent.mm.ui.chatting.d.a parama, c paramc, j.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(32818);
    paramc.gnB.setVisibility(8);
    String str;
    Object localObject1;
    Object localObject2;
    label221: Object localObject3;
    int i;
    if ((paramb.title != null) && (paramb.title.trim().length() > 0))
    {
      str = paramb.title;
      paramc.zbN.setVisibility(0);
      paramc.zbN.setMaxLines(2);
      paramc.gnC.setMaxLines(4);
      paramc.zbT.setVisibility(8);
      paramc.zbO.setVisibility(4);
      if (paramBoolean)
        paramc.zbI.setVisibility(8);
      localObject1 = new nt();
      ((nt)localObject1).cJY.type = 0;
      ((nt)localObject1).cJY.cKa = paramb.fgU;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject2 = ((nt)localObject1).cJZ.cKi;
      if (localObject2 == null)
        break label1006;
      localObject1 = com.tencent.mm.pluginsdk.ui.e.j.b(paramc.zbN.getContext(), bo.bc(((com.tencent.mm.protocal.b.a.c)localObject2).title, paramb.title), paramc.zbN.getTextSize());
      paramc.zbN.setText((CharSequence)localObject1);
      localObject1 = ((com.tencent.mm.protocal.b.a.c)localObject2).desc;
      if (localObject1 != null)
        break label510;
      ab.e("MicroMsg.AppMsgViewHolder", "recordMsg desc is null !! recordInfo = [%s]", new Object[] { paramb.fgU });
      localObject3 = localObject1;
      if (localObject1 != null)
      {
        localObject3 = localObject1;
        if (((String)localObject1).length() > 100)
          localObject3 = ((String)localObject1).substring(0, 100);
      }
      paramc.gnC.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramc.gnC.getContext(), bo.bc((String)localObject3, paramb.description), paramc.gnC.getTextSize()));
      paramb = ((com.tencent.mm.protocal.b.a.c)localObject2).fjr.iterator();
      i = 0;
      localObject3 = null;
      localObject1 = null;
      label305: 
      do
      {
        if (!paramb.hasNext())
          break;
        localObject2 = (aar)paramb.next();
      }
      while ((!bo.isNullOrNil(((aar)localObject2).wgo)) && (((aar)localObject2).wgo.equals(".htm")) && (!bo.isNullOrNil(((aar)localObject2).whb)) && (((aar)localObject2).whb.equals("WeNoteHtmlFile")));
      if (((aar)localObject2).wgT.whw.whU == null)
        break label535;
      str = parama.yTx.getContext().getString(2131302200);
      i = 1;
      label407: switch (((aar)localObject2).dataType)
      {
      case 9:
      case 12:
      case 13:
      case 15:
      default:
      case 3:
      case 1:
      case 2:
      case 5:
      case 4:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 14:
      case 16:
      }
    }
    while (true)
    {
      break label305;
      paramc.zbN.setVisibility(8);
      str = null;
      break;
      label510: localObject1 = ((String)localObject1).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
      break label221;
      label535: if (((aar)localObject2).wgT.whw.cEV == null)
        break label1003;
      if (localObject1 == null)
      {
        localObject1 = ((aar)localObject2).wgV;
        break label407;
      }
      if (localObject1 == ((aar)localObject2).wgV)
        break label1003;
      localObject3 = ((aar)localObject2).wgV;
      break label407;
      if (paramBoolean)
      {
        paramc.zbI.setVisibility(0);
        paramc.zbI.setImageResource(2131230819);
      }
      break label305;
      break label305;
      if (paramBoolean)
      {
        paramc.zbI.setVisibility(0);
        paramc.zbI.setImageResource(2130837705);
      }
      break label305;
      if (paramBoolean)
      {
        paramc.zbI.setVisibility(0);
        paramc.zbI.setImageResource(2131230820);
      }
      break label305;
      if (paramBoolean)
      {
        paramc.zbI.setVisibility(0);
        paramc.zbI.setImageResource(2131230817);
      }
      paramc.zbT.setVisibility(0);
      paramc.zbT.setImageResource(2130840523);
      break label305;
      paramc.zbI.setVisibility(0);
      paramc.zbI.setImageResource(2131230798);
      break label305;
      if (paramBoolean)
      {
        paramc.zbI.setVisibility(0);
        paramc.zbI.setImageResource(2131230800);
      }
      paramc.zbT.setVisibility(0);
      paramc.zbT.setImageResource(2130839639);
      break label305;
      if (paramBoolean)
      {
        paramc.zbI.setVisibility(0);
        paramc.zbI.setImageResource(d.ail(((aar)localObject2).wgo));
      }
      break label305;
      if (paramBoolean)
      {
        paramc.zbI.setVisibility(0);
        paramc.zbI.setImageResource(2131230813);
      }
      break label305;
      if (paramBoolean)
      {
        paramc.zbI.setVisibility(0);
        paramc.zbI.setImageResource(2130838444);
      }
    }
    if ((localObject1 != null) && (localObject3 == null) && (i == 0))
      paramb = parama.yTx.getContext().getString(2131299698, new Object[] { localObject1 });
    while (true)
    {
      if (!bo.isNullOrNil(paramb))
      {
        paramc.zbN.setText(paramb);
        paramc.zbN.setVisibility(0);
      }
      paramc.zbI.setVisibility(8);
      paramc.zcb.setVisibility(8);
      AppMethodBeat.o(32818);
      return;
      paramb = str;
      if (localObject1 != null)
      {
        paramb = str;
        if (localObject3 != null)
        {
          paramb = str;
          if (!((String)localObject1).equals(localObject3))
          {
            paramb = str;
            if (i == 0)
            {
              paramb = parama.yTx.getContext().getString(2131299697, new Object[] { localObject1, localObject3 });
              continue;
              label1003: break;
              label1006: paramb = str;
            }
          }
        }
      }
    }
  }

  public static void a(c paramc, Boolean paramBoolean, bi parambi, String paramString1, String paramString2)
  {
    AppMethodBeat.i(32817);
    long l = parambi.field_msgId;
    com.tencent.mm.pluginsdk.model.app.b localb = am.aUq().lZ(l);
    if (localb == null)
    {
      ab.w("MicroMsg.AppMsgViewHolder", "attach info is null, msgId: %s, attachName: %s", new Object[] { Long.valueOf(l), paramString2 });
      AppMethodBeat.o(32817);
      return;
    }
    if (paramBoolean.booleanValue())
      if (localb.field_status == 101L)
      {
        paramc.zbS.setVisibility(0);
        paramc.zbP.setVisibility(0);
        paramc.zbQ.setVisibility(0);
      }
    while (true)
    {
      if (parambi.field_status == 5)
      {
        paramc.zbS.setVisibility(8);
        paramc.zbR.setVisibility(8);
      }
      paramc.zbS.setOnClickListener(new d.c.1(paramBoolean, l, paramString1, paramString2, parambi));
      paramc.zbR.setOnClickListener(new d.c.2(paramBoolean, l, paramString2, parambi));
      AppMethodBeat.o(32817);
      break;
      if (localb.field_status == 102L)
      {
        paramc.zbS.setVisibility(8);
        paramc.zbP.setVisibility(8);
        paramc.zbQ.setVisibility(8);
      }
      else
      {
        paramc.zbS.setVisibility(8);
        paramc.zbP.setVisibility(8);
        paramc.zbQ.setVisibility(8);
        continue;
        if (localb.field_status == 101L)
        {
          paramc.zbS.setVisibility(0);
          paramc.zbR.setVisibility(8);
        }
        else if (localb.field_status == 105L)
        {
          paramc.zbS.setVisibility(8);
          paramc.zbR.setVisibility(0);
        }
        else
        {
          paramc.zbS.setVisibility(8);
          paramc.zbR.setVisibility(8);
        }
      }
    }
  }

  public static void a(c paramc, String paramString, int paramInt)
  {
    AppMethodBeat.i(32816);
    int i = com.tencent.mm.pluginsdk.model.app.l.aiL(paramString);
    if ((i == -1) || (i >= 100) || (paramInt <= 0))
    {
      paramc.zbP.setVisibility(8);
      paramc.zbQ.setVisibility(8);
      AppMethodBeat.o(32816);
    }
    while (true)
    {
      return;
      paramc.zbP.setVisibility(0);
      paramc.zbQ.setVisibility(0);
      paramc.zbP.setProgress(i);
      AppMethodBeat.o(32816);
    }
  }

  static void b(com.tencent.mm.ui.chatting.d.a parama, c paramc, j.b paramb, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(32820);
    Object localObject1 = new nt();
    ((nt)localObject1).cJY.type = 0;
    ((nt)localObject1).cJY.cKa = paramb.fgU;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    Object localObject2 = ((nt)localObject1).cJZ.cKi;
    paramc.zcb.setVisibility(8);
    String[] arrayOfString1 = new String[4];
    String[] arrayOfString2 = new String[4];
    int[] arrayOfInt1 = new int[4];
    String[] arrayOfString3 = new String[4];
    String[] arrayOfString4 = new String[4];
    int[] arrayOfInt2 = new int[4];
    String[] arrayOfString5 = new String[4];
    int i;
    Object localObject3;
    int j;
    Object localObject4;
    label264: String str;
    if (localObject2 != null)
    {
      localObject1 = null;
      paramb = bo.bc(((com.tencent.mm.protocal.b.a.c)localObject2).desc, paramb.description);
      i = 0;
      localObject3 = ((com.tencent.mm.protocal.b.a.c)localObject2).fjr.iterator();
      j = 0;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (aar)((Iterator)localObject3).next();
        if ((bo.isNullOrNil(((aar)localObject4).wgo)) || (!((aar)localObject4).wgo.equals(".htm")) || (bo.isNullOrNil(((aar)localObject4).whb)) || (!((aar)localObject4).whb.equals("WeNoteHtmlFile")))
          switch (((aar)localObject4).dataType)
          {
          case 3:
          case 6:
          case 4:
          case 5:
          case 7:
          default:
          case 1:
            do
            {
              do
                break;
              while (i != 0);
              str = ((aar)localObject4).desc;
            }
            while (bo.isNullOrNil(str));
            if (bo.isNullOrNil(str.replaceAll("\n", "").trim()))
              break label1223;
            localObject1 = ((aar)localObject4).desc.replaceAll("&lt;", "<").replaceAll("&gt;", ">");
          case 2:
          case 8:
          }
      }
    }
    label801: label1214: label1217: label1223: 
    while (true)
    {
      i = 1;
      break;
      if (paramBoolean)
      {
        paramc.zcb.setVisibility(0);
        paramc.zbI.setVisibility(0);
        paramc.zbI.setImageResource(2130837705);
      }
      if (j < 4)
      {
        arrayOfString1[j] = ((aar)localObject4).fgE;
        arrayOfString2[j] = ((aar)localObject4).wfV;
        arrayOfInt1[j] = ((int)((aar)localObject4).wgF);
        arrayOfString3[j] = ((aar)localObject4).wfZ;
        arrayOfString4[j] = ((aar)localObject4).wgb;
        arrayOfInt2[j] = ((int)((aar)localObject4).wgu);
        arrayOfString5[j] = ((aar)localObject4).mnd;
      }
      j++;
      break;
      if (!bo.isNullOrNil(paramb))
        break label264;
      paramb = ah.getContext().getString(2131296942) + ((aar)localObject4).title;
      break label264;
      if (localObject1 != null)
      {
        localObject4 = ((String)localObject1).split("\n", 2);
        localObject3 = new ArrayList();
        if (localObject4.length > 0)
        {
          int k = localObject4.length;
          for (m = 0; m < k; m++)
          {
            str = localObject4[m];
            if (str.length() > 0)
              ((ArrayList)localObject3).add(str);
          }
        }
        if (((ArrayList)localObject3).size() != 1)
          break label1217;
      }
      for (int m = 1; ; m = 0)
      {
        if ((((ArrayList)localObject3).size() == 1) && (((com.tencent.mm.protocal.b.a.c)localObject2).fjr.size() == 2))
        {
          localObject2 = ah.getContext().getString(2131299765);
          paramb = (j.b)localObject1;
          localObject1 = localObject2;
          localObject1 = ((String)localObject1).trim();
          label626: if (localObject1 == null)
            break label1214;
          localObject1 = ((String)localObject1).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
        }
        while (true)
        {
          localObject1 = com.tencent.mm.pluginsdk.ui.e.j.b(paramc.zbN.getContext(), (CharSequence)localObject1, (int)paramc.zbN.getTextSize());
          paramc.zbN.setText((CharSequence)localObject1);
          if ((paramb != null) && (paramb.length() > 100))
            paramb = paramb.substring(0, 100).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
          while (true)
          {
            localObject1 = com.tencent.mm.pluginsdk.ui.e.j.b(paramc.gnC.getContext(), paramb, (int)paramc.gnC.getTextSize());
            paramc.gnC.setText((CharSequence)localObject1);
            if (j > 0)
            {
              paramc.zcb.setVisibility(8);
              if ((m != 0) || (i == 0) || (bo.isNullOrNil(paramb)))
              {
                paramc.gnC.setVisibility(8);
                paramc.zbN.setMaxLines(2);
                paramc.zcg.setVisibility(8);
                paramc.zcf.setLayoutResource(2130969079);
              }
            }
            while (true)
            {
              try
              {
                if (paramc.zce == null)
                {
                  paramc.zce = ((LinearLayout)paramc.zcf.inflate());
                  if (j <= 4)
                    continue;
                  m = 4;
                  a(parama, paramc, m, arrayOfString5, arrayOfString2, arrayOfString1, arrayOfInt1, arrayOfString4, arrayOfString3, arrayOfInt2, parambi.field_talker);
                  parama = (ImageView)paramc.zce.findViewById(2131822656);
                  paramc = (TextView)paramc.zce.findViewById(2131822657);
                  if (paramc != null)
                    paramc.setTextSize(0, ah.getContext().getResources().getDimensionPixelSize(2131427858));
                  if (j > 4)
                  {
                    if (parama != null)
                      parama.setVisibility(0);
                    if (paramc != null)
                    {
                      paramc.setText("(" + j + ")");
                      paramc.setVisibility(0);
                    }
                  }
                  AppMethodBeat.o(32820);
                  return;
                  if (j > 0)
                  {
                    localObject1 = (String)((ArrayList)localObject3).get(0);
                    if (((ArrayList)localObject3).size() > 1)
                    {
                      paramb = (String)((ArrayList)localObject3).get(1);
                      break;
                    }
                    paramb = null;
                    break;
                  }
                  localObject2 = (String)((ArrayList)localObject3).get(0);
                  localObject3 = paramb.split(Pattern.quote((String)localObject2), 2);
                  paramb = localObject3[0].trim();
                  localObject1 = localObject2;
                  if (localObject3.length <= 1)
                    break;
                  paramb = (localObject3[0].trim() + "\n" + localObject3[1].trim()).trim();
                  localObject1 = localObject2;
                  break;
                  localObject1 = ah.getContext().getString(2131299765);
                  m = 0;
                  break label626;
                  paramc.gnC.setMaxLines(1);
                  paramc.gnC.setVisibility(0);
                  paramc.zbN.setMaxLines(1);
                  break label801;
                }
                paramc.zce.setVisibility(0);
                continue;
              }
              catch (Exception paramb)
              {
                paramc.zcf.setVisibility(0);
                continue;
                m = j;
                continue;
              }
              paramc.zcf.setVisibility(8);
              paramc.zcg.setVisibility(0);
              AppMethodBeat.o(32820);
            }
          }
        }
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(32815);
    if (this.zbN != null)
      this.zbN.setMaxLines(this.zcK);
    AppMethodBeat.o(32815);
  }

  public final c y(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(32814);
    super.eP(paramView);
    this.zcu = ((LinearLayout)paramView.findViewById(2131822523));
    this.zbI = ((MMImageView)paramView.findViewById(2131822536));
    this.gnB = ((TextView)paramView.findViewById(2131822533));
    this.zbN = ((TextView)paramView.findViewById(2131822531));
    this.gnC = ((TextView)paramView.findViewById(2131822534));
    this.moL = ((TextView)paramView.findViewById(2131822543));
    this.zbJ = ((ImageView)paramView.findViewById(2131822542));
    this.zbL = ((TextView)paramView.findViewById(2131822545));
    this.zbK = ((ImageView)paramView.findViewById(2131822544));
    this.zbM = ((LinearLayout)paramView.findViewById(2131822541));
    this.zbO = ((ImageView)paramView.findViewById(2131822557));
    this.zbP = ((MMPinProgressBtn)paramView.findViewById(2131822537));
    this.zbQ = ((ImageView)this.mRR.findViewById(2131822538));
    this.zbR = ((ImageView)this.mRR.findViewById(2131822556));
    this.zbS = ((ImageView)this.mRR.findViewById(2131822555));
    this.zbT = ((ImageView)paramView.findViewById(2131822539));
    this.zbU = ((TextView)paramView.findViewById(2131822454));
    this.zbW = ((ImageView)paramView.findViewById(2131822558));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    this.zbV = ((ChattingItemFooter)paramView.findViewById(2131822554));
    this.zbX = ((LinearLayout)paramView.findViewById(2131822514));
    this.zbY = ((ViewGroup)paramView.findViewById(2131822511));
    this.zbZ = ((TextView)paramView.findViewById(2131822513));
    this.zca = ((LinearLayout)paramView.findViewById(2131821893));
    this.zcc = ((FrameLayout)paramView.findViewById(2131822515));
    this.zcd = ((LinearLayout)paramView.findViewById(2131822530));
    this.zch = ((ImageView)paramView.findViewById(2131822553));
    this.zcb = ((RelativeLayout)paramView.findViewById(2131822535));
    this.zcf = ((ViewStub)paramView.findViewById(2131822540));
    this.zcg = ((ImageView)paramView.findViewById(2131822532));
    if (!paramBoolean)
    {
      this.zci = ((ImageView)this.mRR.findViewById(2131822661));
      this.pyf = ((ProgressBar)this.mRR.findViewById(2131822660));
    }
    this.zcq = ((LinearLayout)paramView.findViewById(2131822516));
    this.zcn = ((ImageView)paramView.findViewById(2131822517));
    this.zco = ((TextView)paramView.findViewById(2131822518));
    this.zct = ((TextView)paramView.findViewById(2131822519));
    this.zcm = ((TextView)paramView.findViewById(2131822520));
    this.zcs = ((ImageView)paramView.findViewById(2131822521));
    this.zcr = ((ImageView)paramView.findViewById(2131822522));
    this.zcj = ((LinearLayout)paramView.findViewById(2131822525));
    this.zck = ((ImageView)paramView.findViewById(2131822526));
    this.zcl = ((TextView)paramView.findViewById(2131822527));
    this.zcp = ((TextView)paramView.findViewById(2131822524));
    this.zcv = ((LinearLayout)paramView.findViewById(2131822546));
    this.zcw = ((TextView)paramView.findViewById(2131822547));
    this.zcx = ((TextView)paramView.findViewById(2131822548));
    this.zcy = ((ImageView)paramView.findViewById(2131822549));
    this.zcz = ((ImageView)paramView.findViewById(2131822550));
    this.zcA = ((ImageView)paramView.findViewById(2131822551));
    this.zcB = ((TextView)paramView.findViewById(2131822552));
    this.zcC = ((LinearLayout)paramView.findViewById(2131822441));
    this.zcG = ((ImageView)paramView.findViewById(2131822445));
    this.zcD = ((MMNeat7extView)paramView.findViewById(2131822442));
    this.zcE = ((ImageView)paramView.findViewById(2131822444));
    this.zcF = ((ImageView)paramView.findViewById(2131822447));
    this.zcH = ((TextView)paramView.findViewById(2131822448));
    this.zcI = ((TextView)paramView.findViewById(2131822446));
    if ((this.zbN != null) && (Build.VERSION.SDK_INT >= 16))
      this.zcK = this.zbN.getMaxLines();
    this.zcJ = c.hU(ah.getContext());
    AppMethodBeat.o(32814);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.c
 * JD-Core Version:    0.6.2
 */