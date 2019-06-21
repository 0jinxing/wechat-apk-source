package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ah
  implements y
{
  private String appId = "";
  private String appName = "";
  private String cMg;
  private MMActivity crP;
  private Bitmap fru = null;
  private TextView gne = null;
  private int h = -1;
  private int hog = 9;
  private String imgPath = "";
  private View jAp = null;
  private String link = "";
  private boolean mog = false;
  private String rid = "";
  private byte[] rie = null;
  private String rif;
  private int rig;
  private CdnImageView rih = null;
  private TextView rii = null;
  private int rij;
  private String rik = "";
  private String ril = "";
  private b rim = null;
  private String title = "";
  private int w = -1;

  public ah(MMActivity paramMMActivity, int paramInt)
  {
    this.crP = paramMMActivity;
    this.hog = paramInt;
  }

  public final void M(Bundle paramBundle)
  {
    AppMethodBeat.i(38521);
    this.rim = b.u(this.crP.getIntent());
    this.w = this.crP.getIntent().getIntExtra("Ksnsupload_width", -1);
    this.h = this.crP.getIntent().getIntExtra("Ksnsupload_height", -1);
    this.rig = this.crP.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.link = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_link"), "");
    this.title = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_title"), "");
    this.rid = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
    this.imgPath = this.crP.getIntent().getStringExtra("KsnsUpload_imgPath");
    this.mog = this.crP.getIntent().getBooleanExtra("ksnsis_video", false);
    this.cMg = bo.bc(this.crP.getIntent().getStringExtra("src_username"), "");
    this.rif = bo.bc(this.crP.getIntent().getStringExtra("src_displayname"), "");
    this.ril = bo.bc(this.crP.getIntent().getStringExtra("KContentObjDesc"), "");
    this.rik = bo.bc(this.crP.getIntent().getStringExtra("KUploadProduct_UserData"), "");
    this.appName = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.appId = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.rij = this.crP.getIntent().getIntExtra("KUploadProduct_subType", 0);
    AppMethodBeat.o(38521);
  }

  public final void N(Bundle paramBundle)
  {
  }

  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, ayt paramayt, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(38523);
    paramString2 = new ax(this.hog);
    paramPInt.value = paramString2.aPA;
    if (paramInt3 > a.qFE)
      paramString2.Dd(2);
    paramString2.Yr(this.title).Yp(this.ril).Yq(this.link).Ym(paramString1);
    if (!bo.isNullOrNil(this.imgPath))
    {
      paramString2.a(e.e(this.imgPath, 0, -1), this.ril, this.title, this.rij, this.rik);
      if (parami != null)
        paramString2.gc(parami.token, parami.wFn);
      paramString2.Dh(this.rig);
      paramString2.Yu(this.cMg);
      paramString2.Yv(this.rif);
      paramString2.Df(paramInt1);
      paramString2.g(null, null, null, paramInt4, paramInt5);
      if (!paramBoolean)
        break label377;
      paramString2.Di(1);
    }
    while (true)
    {
      paramString2.dg(paramList2);
      if (!bo.isNullOrNil(this.appId))
      {
        paramString2.Ys(this.appId);
        paramString2.Yt(this.appName);
      }
      paramString1 = new LinkedList();
      if (paramList1 == null)
        break label387;
      new LinkedList();
      parami = t.Zn();
      paramPInt = paramList1.iterator();
      while (paramPInt.hasNext())
      {
        paramList1 = (String)paramPInt.next();
        if (!parami.contains(paramList1))
        {
          paramList2 = new cco();
          paramList2.jBB = paramList1;
          paramString1.add(paramList2);
        }
      }
      if ((bo.isNullOrNil(this.rid)) || (o.ahk() == null))
        break;
      o.ahk();
      paramString1 = c.kR(this.rid);
      if (paramString1 == null)
        break;
      paramString2.b(d.ai(paramString1), "", "");
      break;
      label377: paramString2.Di(0);
    }
    label387: paramString2.ar(paramString1);
    paramString2.a(paramayt);
    paramInt1 = paramString2.commit();
    if (this.rim != null)
    {
      this.rim.ma(paramInt1);
      g.qTp.c(this.rim);
    }
    af.cnB().cmp();
    this.crP.finish();
    AppMethodBeat.o(38523);
    return false;
  }

  public final boolean crG()
  {
    return true;
  }

  public final View crH()
  {
    AppMethodBeat.i(38522);
    this.jAp = v.hu(this.crP).inflate(2130970978, null);
    this.rih = ((CdnImageView)this.jAp.findViewById(2131825687));
    this.gne = ((TextView)this.jAp.findViewById(2131825689));
    this.rii = ((TextView)this.jAp.findViewById(2131825690));
    if (this.mog)
    {
      this.jAp.findViewById(2131824637).setVisibility(0);
      this.gne.setText(this.title);
      if (this.hog == 13)
        this.gne.setText(this.title + "\n" + this.ril);
      if (bo.isNullOrNil(this.rid))
        break label224;
      this.rih.setVisibility(0);
      this.rih.setUrl(this.rid);
    }
    while (true)
    {
      com.tencent.mm.plugin.sns.data.i.b(this.rih, this.crP);
      View localView = this.jAp;
      AppMethodBeat.o(38522);
      return localView;
      this.jAp.findViewById(2131824637).setVisibility(8);
      break;
      label224: if (!bo.cb(this.rie))
      {
        this.rih.setVisibility(0);
        this.fru = d.bQ(this.rie);
        this.rih.setImageBitmap(this.fru);
      }
      else
      {
        this.rih.setVisibility(8);
      }
    }
  }

  public final boolean crI()
  {
    AppMethodBeat.i(38524);
    if ((this.fru != null) && (!this.fru.isRecycled()))
      this.fru.recycle();
    AppMethodBeat.o(38524);
    return false;
  }

  public final boolean f(int paramInt, Intent paramIntent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ah
 * JD-Core Version:    0.6.2
 */