package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.e;
import com.tencent.mm.plugin.location.model.i;
import com.tencent.mm.plugin.location.model.i.a;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.o;
import com.tencent.mm.plugin.location.ui.impl.TrackPoint;
import com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar;
import com.tencent.mm.plugin.location_soso.ViewManager;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bku;
import com.tencent.mm.protocal.protobuf.cie;
import com.tencent.mm.protocal.protobuf.cmj;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class m
{
  private static Object nNN;
  private b.a ecy;
  private boolean hOy;
  Context mContext;
  public cmj nKI;
  private i.a nKU;
  com.tencent.mm.plugin.k.d nLG;
  boolean nLH;
  public List<cmj> nNM;
  public TrackPoint nNO;
  TrackPointAnimAvatar nNP;
  boolean nNQ;
  public boolean nNR;
  public boolean nNS;
  public boolean nNT;
  public boolean nNU;
  public boolean nNV;
  public cie nNW;
  public boolean nNX;
  public boolean nNY;
  private boolean nNZ;
  private long nOa;
  private View.OnTouchListener nOb;
  View.OnClickListener nOc;
  View.OnClickListener nOd;
  public m.a nOe;
  protected float neG;
  protected float neH;

  static
  {
    AppMethodBeat.i(113576);
    nNN = new Object();
    AppMethodBeat.o(113576);
  }

  public m(Context paramContext, com.tencent.mm.plugin.k.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(113564);
    this.nNQ = false;
    this.nNR = false;
    this.nNS = true;
    this.nNT = false;
    this.nNU = false;
    this.nNV = false;
    this.nLH = false;
    this.nNX = true;
    this.nNY = true;
    this.nNZ = false;
    this.neG = 0.0F;
    this.neH = 0.0F;
    this.hOy = false;
    this.nOa = 0L;
    this.nOb = new m.1(this);
    this.nOc = new m.2(this);
    this.nOd = new m.3(this);
    this.nOe = null;
    this.ecy = new m.4(this);
    this.nKU = new m.5(this);
    this.mContext = paramContext;
    this.nLH = paramBoolean;
    this.nLG = paramd;
    this.nNM = new ArrayList();
    paramd.setMapViewOnTouchListener(this.nOb);
    AppMethodBeat.o(113564);
  }

  private void bKg()
  {
    AppMethodBeat.i(113570);
    double d1 = 0.0D;
    double d2 = 0.0D;
    if (this.nKI == null)
      AppMethodBeat.o(113570);
    while (true)
    {
      return;
      LocationInfo localLocationInfo = l.bJy().nKJ;
      double d3 = d2;
      double d4 = d1;
      if (this.nKI != null)
      {
        d3 = d2;
        d4 = d1;
        if (e.j(localLocationInfo.nJu, localLocationInfo.nJv))
        {
          d4 = 2.0D * Math.abs(this.nKI.xkm.vNI - localLocationInfo.nJu);
          d3 = Math.abs(this.nKI.xkm.vNH - localLocationInfo.nJv) * 2.0D;
        }
      }
      int i = 0;
      d1 = d4;
      for (d4 = d3; i < this.nNM.size(); d4 = d2)
      {
        cmj localcmj = (cmj)this.nNM.get(i);
        d3 = d1;
        d2 = d4;
        if (localcmj != null)
        {
          d3 = d1;
          d2 = d4;
          if (e.j(localcmj.xkm.vNI, localcmj.xkm.vNH))
          {
            double d5 = 2.0D * Math.abs(localcmj.xkm.vNI - this.nKI.xkm.vNI);
            d2 = Math.abs(localcmj.xkm.vNH - this.nKI.xkm.vNH) * 2.0D;
            d3 = d1;
            if (d5 > d1)
              d3 = d5;
            d1 = d4;
            if (d2 > d4)
              d1 = d2;
            ab.d("MicroMsg.TrackPointViewMgrImpl", "update %s %f %f", new Object[] { localcmj.vHl, Double.valueOf(localcmj.xkm.vNI), Double.valueOf(localcmj.xkm.vNH) });
            d2 = d1;
          }
        }
        i++;
        d1 = d3;
      }
      if ((Math.abs(d1 + 1000.0D) < 0.5D) || (Math.abs(d4 + 1000.0D) < 0.5D))
      {
        AppMethodBeat.o(113570);
      }
      else
      {
        ab.d("MicroMsg.TrackPointViewMgrImpl", "zoomToSpan maxlat " + 1000000.0D * d1 + " maxlng " + 1000000.0D * d4 + " poi " + localLocationInfo.nJu + " " + localLocationInfo.nJv);
        if (this.nKI != null)
        {
          ab.d("MicroMsg.TrackPointViewMgrImpl", "mPosition item %f %f", new Object[] { Double.valueOf(this.nKI.xkm.vNI), Double.valueOf(this.nKI.xkm.vNH) });
          this.nLG.zoomToSpan(this.nKI.xkm.vNI, this.nKI.xkm.vNH, d1, d4);
          AppMethodBeat.o(113570);
        }
        else
        {
          if (e.j(localLocationInfo.nJu, localLocationInfo.nJv))
            this.nLG.zoomToSpan(localLocationInfo.nJu, localLocationInfo.nJv, d1, d4);
          AppMethodBeat.o(113570);
        }
      }
    }
  }

  public final void a(com.tencent.mm.plugin.k.d paramd)
  {
    AppMethodBeat.i(113571);
    if (this.nKI == null)
      AppMethodBeat.o(113571);
    while (true)
    {
      return;
      if (paramd.getZoomLevel() < 16)
      {
        paramd.getIController().animateTo(this.nKI.xkm.vNI, this.nKI.xkm.vNH, 16);
        AppMethodBeat.o(113571);
      }
      else
      {
        paramd.getIController().animateTo(this.nKI.xkm.vNI, this.nKI.xkm.vNH);
        AppMethodBeat.o(113571);
      }
    }
  }

  final void bKf()
  {
    AppMethodBeat.i(113569);
    if (this.nNR)
      AppMethodBeat.o(113569);
    while (true)
    {
      return;
      if (this.nKI == null)
      {
        AppMethodBeat.o(113569);
      }
      else
      {
        bKg();
        this.nNR = true;
        AppMethodBeat.o(113569);
      }
    }
  }

  public final void ci(List<cmj> paramList)
  {
    AppMethodBeat.i(113568);
    this.nNQ = true;
    int i = this.nNM.size() + 1;
    int k;
    synchronized (nNN)
    {
      this.nNM.clear();
      for (j = 0; j < paramList.size(); j++)
        this.nNM.add(paramList.get(j));
      k = this.nNM.size() + 1;
    }
    Object localObject2;
    synchronized (nNN)
    {
      localObject2 = this.nLG.getTags();
      paramList = new java/util/HashSet;
      paramList.<init>();
      j = 0;
      while (j < this.nNM.size())
      {
        paramList.add(((cmj)this.nNM.get(j)).vHl);
        j++;
        continue;
        paramList = finally;
        AppMethodBeat.o(113568);
        throw paramList;
      }
      localObject3 = new java/util/LinkedList;
      ((LinkedList)localObject3).<init>();
      Iterator localIterator = ((Set)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        if ((!paramList.contains(localObject2)) && (!((String)localObject2).endsWith("myAnim")) && ((this.nNO == null) || (!this.nNO.equals(this.nLG.getViewByItag((String)localObject2)))))
          ((List)localObject3).add(localObject2);
      }
    }
    Object localObject3 = ((List)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      paramList = (String)((Iterator)localObject3).next();
      localObject2 = this.nLG.getViewByItag(paramList);
      if ((localObject2 instanceof TrackPoint))
      {
        localObject2 = (TrackPoint)localObject2;
        if (((TrackPoint)localObject2).mViewManager != null)
        {
          ((TrackPoint)localObject2).mViewManager.removeView(((TrackPoint)localObject2).nRh);
          ((TrackPoint)localObject2).mViewManager.removeView(((TrackPoint)localObject2).nRi);
        }
      }
      this.nLG.removeViewByTag(paramList);
    }
    int j = 0;
    if (j < this.nNM.size())
    {
      localObject3 = (cmj)this.nNM.get(j);
      paramList = this.nLG.getViewByItag(((cmj)localObject3).vHl);
      ab.d("MicroMsg.TrackPointViewMgrImpl", "position %d %s %f %f %f", new Object[] { Integer.valueOf(j), ((cmj)localObject3).vHl, Double.valueOf(((cmj)localObject3).xkm.vNI), Double.valueOf(((cmj)localObject3).xkm.vNH), Double.valueOf(((cmj)localObject3).xkm.wNP) });
      if (paramList != null)
      {
        if (!(paramList instanceof TrackPoint))
          break label881;
        ((TrackPoint)paramList).n(((cmj)localObject3).xkm.vNI, ((cmj)localObject3).xkm.vNH);
      }
    }
    label789: label881: 
    while (true)
    {
      if ((paramList instanceof TrackPoint))
      {
        paramList = (TrackPoint)paramList;
        paramList.setAvatar(((cmj)localObject3).vHl);
        paramList.z(((cmj)localObject3).xkm.wNP);
        if (!this.nNT)
          paramList.bKE();
      }
      j++;
      break;
      paramList = new com/tencent/mm/plugin/location/ui/impl/TrackPoint;
      paramList.<init>(this.mContext, (ViewManager)this.nLG.getViewManager());
      this.nLG.addView(paramList, ((cmj)localObject3).xkm.vNI, ((cmj)localObject3).xkm.vNH, ((cmj)localObject3).vHl);
      ((TrackPoint)paramList).o(((cmj)localObject3).xkm.vNI, ((cmj)localObject3).xkm.vNH);
      ((TrackPoint)paramList).setOnAvatarOnClickListener(this.nOd);
      ((TrackPoint)paramList).setOnLocationOnClickListener(this.nOc);
      continue;
      if ((this.nLH) && (this.nNQ))
      {
        if (!t.kH(l.bJy().nKN))
          break label789;
        bKf();
      }
      while ((i < 10) && (k >= 10))
      {
        localObject3 = this.nLG.getChilds().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          paramList = ((Iterator)localObject3).next();
          if ((paramList instanceof TrackPoint))
            ((TrackPoint)paramList).bKE();
        }
        if (this.nNM.size() > 0)
          bKf();
      }
      if ((i >= 10) && (k < 10))
      {
        paramList = this.nLG.getChilds().iterator();
        while (paramList.hasNext())
        {
          localObject3 = paramList.next();
          if ((localObject3 instanceof TrackPoint))
            ((TrackPoint)localObject3).bKF();
        }
      }
      AppMethodBeat.o(113568);
      return;
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(113566);
    synchronized (nNN)
    {
      if (this.nNM != null)
        this.nNM.clear();
      this.nLG.clean();
      AppMethodBeat.o(113566);
      return;
    }
  }

  public final void iD(boolean paramBoolean)
  {
    AppMethodBeat.i(113565);
    if (paramBoolean)
      if (this.nNO == null)
        break label75;
    label75: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        h.pYm.e(10997, new Object[] { "20", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        this.nNU = paramBoolean;
      }
      AppMethodBeat.o(113565);
      return;
    }
  }

  public final void iE(boolean paramBoolean)
  {
    AppMethodBeat.i(113567);
    if ((paramBoolean) && (!this.nNT) && (this.nLG != null))
    {
      Iterator localIterator = this.nLG.getChilds().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if ((localObject instanceof TrackPoint))
          ((TrackPoint)localObject).bKF();
      }
    }
    this.nNT = paramBoolean;
    AppMethodBeat.o(113567);
  }

  public final void onPause()
  {
    AppMethodBeat.i(113573);
    com.tencent.mm.modelgeo.d.agz().c(this.ecy);
    l.bJA().b(this.nKU);
    AppMethodBeat.o(113573);
  }

  public final void onResume()
  {
    AppMethodBeat.i(113572);
    com.tencent.mm.modelgeo.d.agz().b(this.ecy, true);
    l.bJA().a(this.nKU);
    AppMethodBeat.o(113572);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.m
 * JD-Core Version:    0.6.2
 */