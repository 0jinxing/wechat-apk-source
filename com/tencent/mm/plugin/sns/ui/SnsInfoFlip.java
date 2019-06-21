package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Gallery;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.a.a;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMNewPhotoEditUI;
import com.tencent.mm.ui.base.MMPageControlView;
import com.tencent.mm.ui.base.MultiTouchImageView.a;
import com.tencent.mm.ui.base.f;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.vfs.e;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SnsInfoFlip extends FlipView
{
  private static int fgI = 0;
  private static int fgJ = 0;
  private Context context;
  private com.tencent.mm.sdk.platformtools.ak handler;
  List<com.tencent.mm.plugin.sns.h.b> items;
  boolean qFG;
  private az qFT;
  private boolean rps;
  private boolean rpu;
  MMPageControlView rsA;
  private Runnable rsB;
  private String rsC;
  private int rsD;
  private int rsE;
  private boolean rsF;
  long rsG;
  private HashSet<String> rsH;
  private Map<String, Boolean> rsI;
  private int rsJ;
  private int rsK;
  private boolean rsL;
  private SnsInfoFlip.c rsM;
  private HashMap<String, n> rsN;
  int rsO;
  private HashSet<String> rsP;
  public int rsQ;
  public int rsR;
  private HashMap<String, SnsInfoFlip.a> rsS;
  private MultiTouchImageView.a rsT;
  SnsInfoFlip.b rsm;
  Gallery rsn;
  private boolean rso;
  HashMap<Integer, Integer> rsp;
  HashMap<Integer, Long> rsq;
  HashMap<Integer, Long> rsr;
  private boolean rss;
  private boolean rst;
  private boolean rsu;
  private boolean rsv;
  private boolean rsw;
  private boolean rsx;
  private boolean rsy;
  private float rsz;
  public String username;

  public SnsInfoFlip(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(38985);
    this.qFG = false;
    this.rso = true;
    this.rsp = new HashMap();
    this.rsq = new HashMap();
    this.rsr = new HashMap();
    this.qFT = az.xYU;
    this.rss = false;
    this.rst = false;
    this.rsu = false;
    this.rsv = false;
    this.rsw = false;
    this.rsx = true;
    this.rsy = true;
    this.rsz = 1.0F;
    this.rsB = null;
    this.handler = new com.tencent.mm.sdk.platformtools.ak();
    this.rsC = "";
    this.rsD = -1;
    this.rsE = -1;
    this.rsF = false;
    this.rps = false;
    this.rpu = false;
    this.rsG = 0L;
    this.rsH = new HashSet();
    this.rsJ = 0;
    this.rsK = 0;
    this.rsL = false;
    this.rsN = new HashMap();
    this.rsO = -1;
    this.rsP = new HashSet();
    this.rsQ = 0;
    this.rsR = 0;
    this.rsS = new HashMap();
    this.rsT = new SnsInfoFlip.6(this);
    init(paramContext);
    AppMethodBeat.o(38985);
  }

  public SnsInfoFlip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38984);
    this.qFG = false;
    this.rso = true;
    this.rsp = new HashMap();
    this.rsq = new HashMap();
    this.rsr = new HashMap();
    this.qFT = az.xYU;
    this.rss = false;
    this.rst = false;
    this.rsu = false;
    this.rsv = false;
    this.rsw = false;
    this.rsx = true;
    this.rsy = true;
    this.rsz = 1.0F;
    this.rsB = null;
    this.handler = new com.tencent.mm.sdk.platformtools.ak();
    this.rsC = "";
    this.rsD = -1;
    this.rsE = -1;
    this.rsF = false;
    this.rps = false;
    this.rpu = false;
    this.rsG = 0L;
    this.rsH = new HashSet();
    this.rsJ = 0;
    this.rsK = 0;
    this.rsL = false;
    this.rsN = new HashMap();
    this.rsO = -1;
    this.rsP = new HashSet();
    this.rsQ = 0;
    this.rsR = 0;
    this.rsS = new HashMap();
    this.rsT = new SnsInfoFlip.6(this);
    init(paramContext);
    AppMethodBeat.o(38984);
  }

  private void a(bau parambau, int paramInt, String paramString)
  {
    long l1 = 0L;
    AppMethodBeat.i(38991);
    Object localObject1;
    String str1;
    int i;
    label148: float f1;
    float f2;
    if ((this.rsn == null) || (!(this.rsn instanceof MMGestureGallery)))
    {
      if (this.rsM != null)
        this.rsM.Eb(paramInt);
      localObject1 = af.cnF().YT(paramString);
      if (localObject1 != null)
        a.c((n)localObject1, paramInt);
      if (this.rsD == -1)
        this.rsD = paramInt;
      this.rsE = 1;
      str1 = parambau.Id;
      if (bo.isNullOrNil(paramString))
      {
        i = this.rsm.getCount();
        parambau = paramInt + 1 + " / " + i;
        this.ris.gt(parambau, null);
        AppMethodBeat.o(38991);
      }
    }
    else
    {
      if (parambau.wEK == null)
        break label1205;
      f1 = parambau.wEK.wFy;
      f2 = parambau.wEK.wFx;
    }
    while (true)
    {
      if ((f1 <= 0.0F) || (f2 <= 0.0F))
        if (parambau.Id.startsWith("Locall_path"))
        {
          localObject1 = an.fZ(af.getAccSnsPath(), parambau.Id) + i.m(parambau);
          label233: localObject1 = d.amj((String)localObject1);
          if (localObject1 == null)
            break;
          f1 = ((BitmapFactory.Options)localObject1).outHeight;
          f2 = ((BitmapFactory.Options)localObject1).outWidth;
        }
      while (true)
      {
        if ((f1 <= 0.0F) || (f2 <= 0.0F))
          break label1203;
        localObject1 = (MMGestureGallery)this.rsn;
        if ((this.rsw) && (f2 * 1.0D > f1 * 2.0D))
        {
          ab.d("MicroMsg.SnsInfoFlip", "set on fling true");
          ((MMGestureGallery)localObject1).yyh = true;
          break;
          localObject1 = an.fZ(af.getAccSnsPath(), parambau.Id) + i.d(parambau);
          break label233;
        }
        ab.d("MicroMsg.SnsInfoFlip", "set on fling false");
        ((MMGestureGallery)localObject1).yyh = false;
        break;
        Object localObject2 = (n)this.rsN.get(paramString);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = af.cnF().YT(paramString);
          this.rsN.put(paramString, localObject1);
        }
        if (localObject1 == null)
        {
          AppMethodBeat.o(38991);
          break label148;
        }
        if ((parambau.jCt != 2) && ((this.rsn instanceof MMGestureGallery)))
          ((MMGestureGallery)this.rsn).setLoadQuit(true);
        if (parambau.jCt != 6)
          af.bCo().post(new SnsInfoFlip.3(this));
        ab.d("MicroMsg.SnsInfoFlip", "onItemSelected  " + paramInt + " localId " + paramString);
        label558: long l2;
        if (this.rsO != paramInt)
        {
          if (!this.rsp.containsKey(Integer.valueOf(paramInt)))
            break label1140;
          i = ((Integer)this.rsp.get(Integer.valueOf(paramInt))).intValue();
          this.rsp.put(Integer.valueOf(paramInt), Integer.valueOf(i + 1));
          this.rsq.put(Integer.valueOf(paramInt), Long.valueOf(bo.yz()));
          if (this.rsO >= 0)
          {
            if (!this.rsq.containsKey(Integer.valueOf(this.rsO)))
              break label1146;
            l2 = ((Long)this.rsq.get(Integer.valueOf(this.rsO))).longValue();
            label641: if (l2 > 0L)
            {
              this.rsq.put(Integer.valueOf(this.rsO), Long.valueOf(0L));
              if (this.rsr.containsKey(Integer.valueOf(this.rsO)))
                l1 = ((Long)this.rsr.get(Integer.valueOf(this.rsO))).longValue();
              l2 = bo.az(l2);
              l1 += l2;
              this.rsr.put(Integer.valueOf(this.rsO), Long.valueOf(l1));
              ab.i("MicroMsg.SnsInfoFlip", "lastSelectPosition " + this.rsO + " curtime " + l1 + " passtime " + l2 / 1000.0D);
            }
          }
          if ((this.rps) && (this.rsm != null))
          {
            parambau = (com.tencent.mm.plugin.sns.h.b)this.rsm.getItem(this.rsO);
            if (parambau != null)
            {
              parambau = parambau.cNr.Id;
              ab.d("MicroMsg.SnsInfoFlip", "recordMediaScollOver, bigPicId:%s", new Object[] { parambau });
              if (this.rsS.containsKey(parambau))
              {
                parambau = (SnsInfoFlip.a)this.rsS.get(parambau);
                parambau.networkType = getReportNetworkType();
                if (parambau.rsY == -1L)
                  break label1152;
                parambau.rsW = 1;
                parambau.qNk = (parambau.rsY - parambau.rsX);
                ab.d("MicroMsg.SnsInfoFlip", "recordMediaScollOver, load success, costTime:%d", new Object[] { Long.valueOf(parambau.qNk) });
              }
            }
          }
        }
        while (true)
        {
          this.rsO = paramInt;
          if (this.rir != null)
            this.rir.Zv(paramString);
          i = ((n)localObject1).field_createTime;
          localObject2 = ((n)localObject1).cqu();
          String str2 = aw.m(this.context, i * 1000L);
          localObject1 = null;
          parambau = (bau)localObject1;
          if (localObject2 != null)
          {
            parambau = (bau)localObject1;
            if (((TimeLineObject)localObject2).xfI != null)
            {
              parambau = (bau)localObject1;
              if (((TimeLineObject)localObject2).xfI.wbK.size() > 1)
              {
                i = ((TimeLineObject)localObject2).xfI.wbK.size();
                parambau = ((com.tencent.mm.plugin.sns.h.b)this.items.get(paramInt)).qQe + 1 + " / " + i;
                this.rsE = b(str1, (TimeLineObject)localObject2);
              }
            }
          }
          this.ris.gt(String.valueOf(str2), parambau);
          this.ris.dh(paramString, paramInt);
          if (this.rsm != null)
            this.rsm.Ea(paramInt);
          AppMethodBeat.o(38991);
          break;
          label1140: i = 0;
          break label558;
          label1146: l2 = 0L;
          break label641;
          label1152: parambau.rsW = 2;
          parambau.rsY = System.currentTimeMillis();
          parambau.qNk = (parambau.rsY - parambau.rsX);
          ab.d("MicroMsg.SnsInfoFlip", "recordMediaScollOver, load failed, costTime:%d", new Object[] { Long.valueOf(parambau.qNk) });
        }
      }
      label1203: break;
      label1205: f2 = 0.0F;
      f1 = 0.0F;
    }
  }

  private static int b(String paramString, TimeLineObject paramTimeLineObject)
  {
    AppMethodBeat.i(38990);
    Iterator localIterator = paramTimeLineObject.xfI.wbK.iterator();
    int i = 0;
    int j;
    while (localIterator.hasNext())
    {
      paramTimeLineObject = (bau)localIterator.next();
      j = i + 1;
      i = j;
      if (paramString.equals(paramTimeLineObject.Id))
        AppMethodBeat.o(38990);
    }
    while (true)
    {
      return j;
      AppMethodBeat.o(38990);
      j = 0;
    }
  }

  private void ctl()
  {
    AppMethodBeat.i(38994);
    if ((this.rsn.getSelectedItem() == null) || (this.rsm == null))
      AppMethodBeat.o(38994);
    while (true)
    {
      return;
      int i = this.rsn.getSelectedItemPosition();
      if ((this.rss) && (this.rsm.getCount() > 1))
      {
        this.rsA.setVisibility(0);
        this.rsA.setPage(i);
      }
      bau localbau = ((com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem()).cNr;
      this.rsP.add(localbau.Id);
      String str1 = ((com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem()).qQd;
      String str2 = localbau.Id;
      if ((bo.isNullOrNil(this.rsC)) || (!this.rsC.equals(str2)))
        this.rsC = "";
      a(localbau, i, str1);
      AppMethodBeat.o(38994);
    }
  }

  private int getReportNetworkType()
  {
    AppMethodBeat.i(39007);
    Context localContext = ah.getContext();
    int i;
    if (at.is2G(localContext))
    {
      i = 1;
      AppMethodBeat.o(39007);
    }
    while (true)
    {
      return i;
      if (at.is3G(localContext))
      {
        i = 2;
        AppMethodBeat.o(39007);
      }
      else if (at.is4G(localContext))
      {
        i = 3;
        AppMethodBeat.o(39007);
      }
      else if (at.isWifi(localContext))
      {
        i = 4;
        AppMethodBeat.o(39007);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(39007);
      }
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(38986);
    this.rsG = System.currentTimeMillis();
    this.context = paramContext;
    View localView = inflate(paramContext, 2130970766, this);
    if (f.dzs())
      localView.findViewById(2131827782).setVisibility(0);
    for (this.rsn = ((Gallery)localView.findViewById(2131827782)); ; this.rsn = ((Gallery)localView.findViewById(2131827781)))
    {
      if ((this.rsn instanceof MMGestureGallery))
      {
        this.rsn.setSpacing(50);
        ((MMGestureGallery)this.rsn).setSingleClickOverListener(new SnsInfoFlip.1(this, paramContext));
        ((MMGestureGallery)this.rsn).setScrollLeftRightListener(new SnsInfoFlip.2(this));
      }
      this.rsA = ((MMPageControlView)findViewById(2131827783));
      this.rsA.setIndicatorLayoutRes(2130970833);
      paramContext = (LinearLayout.LayoutParams)this.rsA.getLayoutParams();
      paramContext.bottomMargin += com.tencent.mm.ui.ak.fr(getContext());
      this.rsA.setLayoutParams(paramContext);
      this.rsI = new HashMap();
      AppMethodBeat.o(38986);
      return;
      localView.findViewById(2131827781).setVisibility(0);
    }
  }

  public final void a(List<com.tencent.mm.plugin.sns.h.b> paramList, String paramString, int paramInt, u paramu, s.a parama)
  {
    AppMethodBeat.i(38992);
    af.cnA().a(this);
    this.items = paramList;
    boolean bool;
    if (this.items.size() > 1)
    {
      bool = true;
      this.rsF = bool;
      aj.XY(paramString);
      this.rir = paramu;
      this.ris = parama;
      this.rsm = new SnsInfoFlip.b(this, this.context);
      this.rsn.setAdapter(this.rsm);
      if ((paramInt >= 0) && (paramInt < this.items.size()))
      {
        this.rsn.setSelection(paramInt);
        if (this.rsy)
        {
          this.rsy = false;
          paramList = ((com.tencent.mm.plugin.sns.h.b)this.items.get(paramInt)).cNr;
          if ((paramList == null) || (paramList.wEK == null) || (paramList.wEK.wFy <= 0.0F))
            break label368;
        }
      }
    }
    label368: for (this.rsz = (paramList.wEK.wFx / paramList.wEK.wFy); ; this.rsz = 1.0F)
    {
      this.rsn.setFadingEdgeLength(0);
      this.rsn.setOnItemSelectedListener(new SnsInfoFlip.4(this));
      if (this.rso)
        this.rsn.setOnItemLongClickListener(new SnsInfoFlip.5(this));
      if ((this.rss) && (this.rsm.getCount() > 1))
      {
        this.rsA.setVisibility(0);
        this.rsA.hj(this.rsm.getCount(), paramInt);
      }
      if ((this.rpu) && (!bo.isNullOrNil(((com.tencent.mm.plugin.sns.h.b)this.rsm.getItem(paramInt)).qQd)))
      {
        paramList = ((com.tencent.mm.plugin.sns.h.b)this.rsm.getItem(paramInt)).cNr.Id;
        Zs(an.fZ(af.getAccSnsPath(), paramList) + i.l(((com.tencent.mm.plugin.sns.h.b)this.rsm.getItem(paramInt)).cNr));
      }
      AppMethodBeat.o(38992);
      return;
      bool = false;
      break;
    }
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(39005);
    Object localObject;
    if (!paramBoolean)
    {
      localObject = ((com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem()).cNr;
      if ((localObject != null) && (((bau)localObject).Id != null) && (((bau)localObject).Id.equals(paramString)))
      {
        Toast.makeText(this.context, this.context.getString(2131303619), 0).show();
        this.rsC = paramString;
      }
    }
    this.rsR += 1;
    if (this.rps)
    {
      ab.d("MicroMsg.SnsInfoFlip", "recordLoadEnd, bigPicId:%s, suceess:%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      if ((paramBoolean) && (this.rsS.containsKey(paramString)))
      {
        localObject = (SnsInfoFlip.a)this.rsS.get(paramString);
        ((SnsInfoFlip.a)localObject).rsY = System.currentTimeMillis();
        ((SnsInfoFlip.a)localObject).networkType = getReportNetworkType();
        ab.d("MicroMsg.SnsInfoFlip", "recordLoadEnd, update map");
        this.rsI.put(paramString, Boolean.TRUE);
      }
    }
    if ((this.rsm != null) && ((com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem() != null))
    {
      localObject = ((com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem()).cNr;
      if ((localObject != null) && (((bau)localObject).Id != null) && (((bau)localObject).Id.equals(paramString)))
      {
        this.rsm.notifyDataSetChanged();
        if (this.rpu)
          if (localObject == null)
            AppMethodBeat.o(39005);
      }
    }
    while (true)
    {
      return;
      paramString = an.fZ(af.getAccSnsPath(), ((bau)localObject).Id);
      localObject = i.l((bau)localObject);
      if (e.ct(paramString + (String)localObject))
      {
        localObject = paramString + (String)localObject;
        paramString = new Intent();
        ab.i("MicroMsg.FlipView", "edit image path:%s", new Object[] { localObject });
        paramString.putExtra("raw_photo_path", (String)localObject);
        paramString.putExtra("from_scene", 293);
        paramString.putExtra("after_photo_edit", "");
        paramString.putExtra("Retr_Compress_Type", 0);
        paramString.putExtra("Retr_Msg_Type", 0);
        paramString.putExtra("Retr_FromMainTimeline", crK());
        paramString.setClass(this.context, MMNewPhotoEditUI.class);
        this.context.startActivity(paramString);
      }
      AppMethodBeat.o(39005);
    }
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(39006);
    ab.i("MicroMsg.SnsInfoFlip", "onSightFinish " + paramString + " " + paramBoolean);
    if (!paramBoolean)
    {
      bau localbau = ((com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem()).cNr;
      if ((localbau != null) && (localbau.Id != null) && (localbau.Id.equals(paramString)))
      {
        Toast.makeText(this.context, this.context.getString(2131303620), 0).show();
        this.rsC = paramString;
      }
    }
    if (this.rsm != null)
      this.rsm.notifyDataSetChanged();
    AppMethodBeat.o(39006);
  }

  public final void btt()
  {
    AppMethodBeat.i(38995);
    if (this.rsm != null)
    {
      ab.d("MicroMsg.SnsInfoFlip", "onRefresh ");
      this.rsm.notifyDataSetChanged();
      ctl();
    }
    AppMethodBeat.o(38995);
  }

  public final boolean crK()
  {
    return this.rps;
  }

  public final void ctm()
  {
    AppMethodBeat.i(38999);
    ab.i("MicroMsg.SnsInfoFlip", "sns info flip on detch.");
    if (this.rsm != null)
    {
      this.rsm.cts();
      this.rsm.clear();
    }
    af.cnA().b(this);
    AppMethodBeat.o(38999);
  }

  public final int ctn()
  {
    AppMethodBeat.i(39000);
    int i;
    if (this.rsn == null)
    {
      i = -1;
      AppMethodBeat.o(39000);
    }
    while (true)
    {
      return i;
      i = this.rsn.getSelectedItemPosition();
      this.items.remove(i);
      this.rsm.notifyDataSetChanged();
      ctl();
      i = this.rsm.getCount();
      AppMethodBeat.o(39000);
    }
  }

  public final void cto()
  {
    AppMethodBeat.i(39008);
    Iterator localIterator = this.rsS.values().iterator();
    while (localIterator.hasNext())
    {
      SnsInfoFlip.a locala = (SnsInfoFlip.a)localIterator.next();
      if (locala.rsW != -1)
      {
        h.pYm.e(11601, new Object[] { Integer.valueOf(locala.fjN), Integer.valueOf(locala.rsW), Long.valueOf(locala.qNk), Integer.valueOf(locala.networkType) });
        ab.d("MicroMsg.SnsInfoFlip", "report big pic load, picNum:%d, loadResult:%d, loadCostTime:%d, networkType:%d", new Object[] { Integer.valueOf(locala.fjN), Integer.valueOf(locala.rsW), Long.valueOf(locala.qNk), Integer.valueOf(locala.networkType) });
      }
      else if (locala.rsX != -1L)
      {
        if (locala.rsY != -1L)
          locala.rsW = 1;
        while (true)
        {
          locala.qNk = (locala.rsY - locala.rsX);
          h.pYm.e(11601, new Object[] { Integer.valueOf(locala.fjN), Integer.valueOf(locala.rsW), Long.valueOf(locala.qNk), Integer.valueOf(locala.networkType) });
          ab.d("MicroMsg.SnsInfoFlip", "report big pic load, picNum:%d, loadResult:%d, loadCostTime:%d, networkType:%d", new Object[] { Integer.valueOf(locala.fjN), Integer.valueOf(locala.rsW), Long.valueOf(locala.qNk), Integer.valueOf(locala.networkType) });
          break;
          locala.rsW = 2;
          locala.rsY = System.currentTimeMillis();
        }
      }
    }
    this.rsS.clear();
    AppMethodBeat.o(39008);
  }

  public bau getCntMedia()
  {
    AppMethodBeat.i(39002);
    bau localbau;
    if (this.rsm != null)
    {
      int i = this.rsn.getSelectedItemPosition();
      if ((this.items != null) && (i < this.items.size()))
      {
        localbau = ((com.tencent.mm.plugin.sns.h.b)this.items.get(i)).cNr;
        AppMethodBeat.o(39002);
      }
    }
    while (true)
    {
      return localbau;
      localbau = null;
      AppMethodBeat.o(39002);
    }
  }

  public int getCount()
  {
    AppMethodBeat.i(39001);
    int i;
    if (this.rsm != null)
    {
      i = this.rsm.getCount();
      AppMethodBeat.o(39001);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(39001);
    }
  }

  public List<com.tencent.mm.plugin.sns.h.b> getFlipList()
  {
    return this.items;
  }

  public az getFromScene()
  {
    return this.qFT;
  }

  public Gallery getGallery()
  {
    return this.rsn;
  }

  public int getNumOfFileExist()
  {
    AppMethodBeat.i(39004);
    Iterator localIterator = this.items.iterator();
    int i = 0;
    int k;
    for (int j = 0; ; j = k)
    {
      k = j;
      if (localIterator.hasNext())
      {
        com.tencent.mm.plugin.sns.h.b localb = (com.tencent.mm.plugin.sns.h.b)localIterator.next();
        af.cnC();
        k = j;
        if (e.ct(g.C(localb.cNr)))
          k = j + 1;
        i++;
        if (i <= 9);
      }
      else
      {
        AppMethodBeat.o(39004);
        return k;
      }
    }
  }

  public int getPosition()
  {
    return this.rsE;
  }

  public int getSelectCount()
  {
    AppMethodBeat.i(39003);
    int i = this.rsP.size();
    AppMethodBeat.o(39003);
    return i;
  }

  public String getSelectId()
  {
    AppMethodBeat.i(38989);
    Object localObject;
    if (this.rsn == null)
    {
      localObject = "";
      AppMethodBeat.o(38989);
    }
    while (true)
    {
      return localObject;
      localObject = (com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem();
      if (localObject == null)
      {
        localObject = "";
        AppMethodBeat.o(38989);
      }
      else
      {
        localObject = ((com.tencent.mm.plugin.sns.h.b)localObject).qQd;
        AppMethodBeat.o(38989);
      }
    }
  }

  public com.tencent.mm.plugin.sns.h.b getSelectItem()
  {
    AppMethodBeat.i(38987);
    com.tencent.mm.plugin.sns.h.b localb;
    if (this.rsn == null)
    {
      localb = null;
      AppMethodBeat.o(38987);
    }
    while (true)
    {
      return localb;
      localb = (com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem();
      AppMethodBeat.o(38987);
    }
  }

  public String getSelectedMediaId()
  {
    AppMethodBeat.i(38988);
    Object localObject;
    if (this.rsn == null)
    {
      AppMethodBeat.o(38988);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = (com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem();
      if (localObject == null)
      {
        AppMethodBeat.o(38988);
        localObject = null;
      }
      else
      {
        localObject = ((com.tencent.mm.plugin.sns.h.b)localObject).cNr.Id;
        AppMethodBeat.o(38988);
      }
    }
  }

  public long getSnsId()
  {
    AppMethodBeat.i(38993);
    Object localObject = (com.tencent.mm.plugin.sns.h.b)this.rsn.getSelectedItem();
    long l;
    if (localObject == null)
    {
      localObject = "";
      if (bo.isNullOrNil((String)localObject))
        break label75;
      localObject = af.cnF().YT((String)localObject);
      if (localObject != null)
        break label61;
      AppMethodBeat.o(38993);
      l = 0L;
    }
    while (true)
    {
      return l;
      localObject = ((com.tencent.mm.plugin.sns.h.b)localObject).qQd;
      break;
      label61: l = ((n)localObject).field_snsId;
      AppMethodBeat.o(38993);
      continue;
      label75: AppMethodBeat.o(38993);
      l = 0L;
    }
  }

  public float getWidthModHeight()
  {
    return this.rsz;
  }

  public int gettotalSuccDownload()
  {
    return this.rsR;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(38998);
    this.rsL = false;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(38998);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38997);
    this.rsL = true;
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(38997);
  }

  protected final void onPause()
  {
    AppMethodBeat.i(38996);
    super.onPause();
    if (this.rsm != null)
    {
      this.rsm.cts();
      this.rsm.clear();
    }
    AppMethodBeat.o(38996);
  }

  public void setDoubleClick(boolean paramBoolean)
  {
    this.rst = paramBoolean;
  }

  public void setEnableHorLongBmpMode(boolean paramBoolean)
  {
    this.rsw = paramBoolean;
  }

  public void setFromScene(az paramaz)
  {
    this.qFT = paramaz;
  }

  public void setInfoType(int paramInt)
  {
    this.infoType = paramInt;
  }

  public void setIsAd(boolean paramBoolean)
  {
    this.qFG = paramBoolean;
  }

  public void setIsFromMainTimeline(boolean paramBoolean)
  {
    this.rps = paramBoolean;
  }

  public void setIsSoonEnterPhotoEditUI(boolean paramBoolean)
  {
    this.rpu = paramBoolean;
  }

  public void setItems(List<com.tencent.mm.plugin.sns.h.b> paramList)
  {
    this.items = paramList;
  }

  public void setOnDeleteAllAction(Runnable paramRunnable)
  {
    this.rsB = paramRunnable;
  }

  public void setOnPageSelectListener(SnsInfoFlip.c paramc)
  {
    this.rsM = paramc;
  }

  public void setOreitaion(boolean paramBoolean)
  {
  }

  public void setShowLongClickMenu(boolean paramBoolean)
  {
    this.rso = paramBoolean;
  }

  public void setShowPageControl(boolean paramBoolean)
  {
    this.rss = paramBoolean;
  }

  public void setShowTitle(boolean paramBoolean)
  {
    this.rsv = paramBoolean;
  }

  public void setTouchFinish(boolean paramBoolean)
  {
    this.rsu = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsInfoFlip
 * JD-Core Version:    0.6.2
 */