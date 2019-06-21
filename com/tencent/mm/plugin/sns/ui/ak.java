package com.tencent.mm.plugin.sns.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qt;
import com.tencent.mm.g.a.qt.b;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ak
  implements y
{
  MMActivity crP;
  String cvZ;
  private boolean cwB;
  private String desc;
  ProgressDialog ehJ;
  private View jAp;
  ProgressBar progressBar;
  private int rig;
  private com.tencent.mm.modelsns.b rim;
  private Bitmap rkA;
  private com.tencent.mm.sdk.b.c rkN;
  ax rkO;
  private boolean rkz;
  com.tencent.mm.plugin.sight.decode.a.a rny;
  com.tencent.mm.plugin.sight.decode.ui.c rnz;
  String thumbPath;
  String videoPath;

  public ak(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(38600);
    this.jAp = null;
    this.thumbPath = "";
    this.videoPath = "";
    this.cvZ = "";
    this.cwB = false;
    this.rkz = false;
    this.rkA = null;
    this.rnz = null;
    this.rim = null;
    this.rkN = new ak.1(this);
    this.rkO = null;
    this.desc = "";
    this.ehJ = null;
    this.crP = paramMMActivity;
    AppMethodBeat.o(38600);
  }

  public final void M(Bundle paramBundle)
  {
    AppMethodBeat.i(38601);
    this.rim = com.tencent.mm.modelsns.b.u(this.crP.getIntent());
    this.thumbPath = this.crP.getIntent().getStringExtra("KSightThumbPath");
    this.videoPath = this.crP.getIntent().getStringExtra("KSightPath");
    this.cvZ = this.crP.getIntent().getStringExtra("sight_md5");
    this.rig = this.crP.getIntent().getIntExtra("Ksnsupload_source", 0);
    paramBundle = new qt();
    paramBundle.cMT.type = 2;
    com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
    if (bo.isNullOrNil(this.videoPath))
    {
      this.videoPath = bo.bc(paramBundle.cMU.cMY, "");
      ab.e("MicroMsg.SightWidget", "videoPath is null %s", new Object[] { this.videoPath });
    }
    if (bo.isNullOrNil(this.cvZ));
    for (paramBundle = bo.bc(paramBundle.cMU.cMW, ""); ; paramBundle = this.cvZ)
    {
      this.cvZ = paramBundle;
      ab.i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", new Object[] { this.thumbPath, this.videoPath, this.cvZ });
      com.tencent.mm.sdk.b.a.xxA.c(this.rkN);
      AppMethodBeat.o(38601);
      return;
    }
  }

  public final void N(Bundle paramBundle)
  {
  }

  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, ayt paramayt, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(38603);
    if (this.rkO != null)
    {
      paramBoolean = false;
      AppMethodBeat.o(38603);
    }
    while (true)
    {
      return paramBoolean;
      this.desc = paramString1;
      parami = new LinkedList();
      if (paramList1 != null)
      {
        new LinkedList();
        paramString2 = com.tencent.mm.model.t.Zn();
        paramList1 = paramList1.iterator();
        while (paramList1.hasNext())
        {
          String str = (String)paramList1.next();
          if (!paramString2.contains(str))
          {
            cco localcco = new cco();
            localcco.jBB = str;
            parami.add(localcco);
          }
        }
      }
      this.rkO = new ax(15);
      paramPInt.value = this.rkO.aPA;
      if (paramInt3 > com.tencent.mm.plugin.sns.c.a.qFE)
        this.rkO.Dd(3);
      paramString1 = this.rkO.Ym(paramString1);
      new LinkedList();
      paramString1.a(paramayt).ar(parami).Df(paramInt1).Dg(paramInt2).dg(paramList2);
      if (paramBoolean)
        this.rkO.Di(1);
      while (true)
      {
        this.rkO.dg(paramList2).Df(paramInt1);
        this.rkO.Dh(this.rig);
        this.rkO.g(null, null, null, paramInt4, paramInt5);
        if (!e.ct(this.videoPath))
          break label301;
        csv();
        paramBoolean = true;
        AppMethodBeat.o(38603);
        break;
        this.rkO.Di(0);
      }
      label301: ab.i("MicroMsg.SightWidget", "commit file is not exist " + this.videoPath);
      parami = this.crP;
      this.crP.getString(2131297061);
      this.ehJ = h.b(parami, this.crP.getString(2131303775), true, new ak.3(this));
      paramBoolean = true;
      AppMethodBeat.o(38603);
    }
  }

  public final boolean crG()
  {
    return true;
  }

  public final View crH()
  {
    AppMethodBeat.i(38602);
    this.jAp = View.inflate(this.crP, 2130970981, null);
    this.rny = ((com.tencent.mm.plugin.sight.decode.a.a)this.jAp.findViewById(2131820629));
    this.rny.setDrawableWidth(com.tencent.mm.bz.a.fromDPToPix(this.crP, 90));
    this.progressBar = ((ProgressBar)this.jAp.findViewById(2131823898));
    this.crP.getResources().getDisplayMetrics();
    this.jAp.findViewById(2131822515).setOnClickListener(new ak.2(this));
    ab.i("MicroMsg.SightWidget", "videoPath " + this.videoPath + " thumbPath " + this.thumbPath + " " + e.asZ(this.videoPath) + " " + e.asZ(this.thumbPath));
    if (e.ct(this.videoPath))
    {
      this.rny.bf(this.videoPath, false);
      this.progressBar.setVisibility(8);
      ab.i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", new Object[] { this.videoPath, this.cvZ });
    }
    while (true)
    {
      Object localObject = this.jAp;
      AppMethodBeat.o(38602);
      return localObject;
      localObject = com.tencent.mm.plugin.sns.data.i.Xk(this.thumbPath);
      if (localObject != null)
      {
        this.rkA = ((n)localObject).Xh();
        if (com.tencent.mm.plugin.sns.data.i.B(this.rkA))
          this.rny.setThumbBmp(this.rkA);
      }
      this.progressBar.setVisibility(0);
    }
  }

  public final boolean crI()
  {
    AppMethodBeat.i(38605);
    if (this.ehJ != null)
      this.ehJ.dismiss();
    com.tencent.mm.sdk.b.a.xxA.d(this.rkN);
    if (com.tencent.mm.plugin.sns.data.i.B(this.rkA))
      this.rkA.recycle();
    AppMethodBeat.o(38605);
    return false;
  }

  final void csv()
  {
    AppMethodBeat.i(38604);
    if (this.rkz)
      AppMethodBeat.o(38604);
    while (true)
    {
      return;
      if (!this.rkO.t(this.videoPath, this.thumbPath, this.desc, this.cvZ))
      {
        ab.i("MicroMsg.SightWidget", "videopath " + e.asZ(this.videoPath) + " thumb: " + e.asZ(this.thumbPath));
        com.tencent.mm.ui.base.t.makeText(this.crP, 2131302960, 0).show();
        AppMethodBeat.o(38604);
      }
      else
      {
        Object localObject = new qt();
        ((qt)localObject).cMT.type = 0;
        ((qt)localObject).cMT.cMV = true;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        this.rkz = true;
        int i = this.rkO.commit();
        if (this.rim != null)
        {
          this.rim.ma(i);
          g.qTp.c(this.rim);
        }
        af.cnM().rmK = 0L;
        localObject = new Intent();
        ((Intent)localObject).putExtra("sns_resume_state", false);
        ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
        ((Intent)localObject).setClass(this.crP, SnsTimeLineUI.class);
        ((Intent)localObject).addFlags(67108864);
        this.crP.startActivity((Intent)localObject);
        this.crP.setResult(-1);
        this.crP.finish();
        AppMethodBeat.o(38604);
      }
    }
  }

  public final boolean f(int paramInt, Intent paramIntent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ak
 * JD-Core Version:    0.6.2
 */