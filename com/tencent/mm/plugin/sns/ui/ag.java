package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.cap;
import com.tencent.mm.protocal.protobuf.cbv;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ag extends a
{
  private String appId;
  private String appName;
  MMActivity crP;
  private String hcl;
  private int rig;
  private com.tencent.mm.modelsns.b rim;
  private boolean rjF;
  private boolean rjG;
  private WXMediaMessage rjH;
  private String rkC;
  private boolean rkD;
  ag.b rlP;
  v rlQ;
  Map<String, Exif.a> rlR;
  private Map<String, cbv> rlS;
  private int rlT;
  private boolean rlU;
  ayt rlV;

  public ag(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(38493);
    this.rlP = new ag.b(this);
    this.rkD = false;
    this.rlR = new HashMap();
    this.rlS = new HashMap();
    this.rlT = 0;
    this.rjF = false;
    this.rlU = false;
    this.rjG = false;
    this.rjH = null;
    this.rim = null;
    this.crP = paramMMActivity;
    AppMethodBeat.o(38493);
  }

  private boolean O(Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(38496);
    if (paramBundle == null)
      AppMethodBeat.o(38496);
    while (true)
    {
      return bool;
      paramBundle = paramBundle.getStringArrayList("sns_media_latlong_list");
      if (paramBundle == null)
      {
        AppMethodBeat.o(38496);
      }
      else
      {
        paramBundle = paramBundle.iterator();
        while (true)
        {
          if (!paramBundle.hasNext())
            break label158;
          String[] arrayOfString = ((String)paramBundle.next()).split("\n");
          if (3 != arrayOfString.length)
          {
            ab.e("MicroMsg.PicWidget", "invalid params");
            AppMethodBeat.o(38496);
            bool = true;
            break;
          }
          try
          {
            Map localMap = this.rlR;
            String str = arrayOfString[0].trim();
            Exif.a locala = new com/tencent/mm/compatible/util/Exif$a;
            locala.<init>(bo.getDouble(arrayOfString[1], 0.0D), bo.getDouble(arrayOfString[2], 0.0D), 0.0D);
            localMap.put(str, locala);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            ab.e("MicroMsg.PicWidget", localNumberFormatException.toString());
          }
        }
        label158: AppMethodBeat.o(38496);
        bool = true;
      }
    }
  }

  private static com.tencent.mm.plugin.sns.model.ax a(com.tencent.mm.plugin.sns.model.ax paramax, List<com.tencent.mm.plugin.sns.data.h> paramList)
  {
    AppMethodBeat.i(38501);
    paramax.dh(paramList);
    AppMethodBeat.o(38501);
    return paramax;
  }

  final void DR(int paramInt)
  {
    AppMethodBeat.i(38508);
    com.tencent.mm.g.b.a.ag localag = new com.tencent.mm.g.b.a.ag().Fr();
    localag.cYH = paramInt;
    localag.fj(this.rkC).ajK();
    AppMethodBeat.o(38508);
  }

  public final void M(Bundle paramBundle)
  {
    AppMethodBeat.i(38494);
    this.rim = com.tencent.mm.modelsns.b.u(this.crP.getIntent());
    this.rkD = this.crP.getIntent().getBooleanExtra("Kis_take_photo", false);
    this.appId = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.rjF = this.crP.getIntent().getBooleanExtra("KThrid_app", false);
    this.rlU = this.crP.getIntent().getBooleanExtra("KBlockAdd", false);
    this.rjG = this.crP.getIntent().getBooleanExtra("KSnsAction", false);
    this.rig = this.crP.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.hcl = bo.bc(this.crP.getIntent().getStringExtra("reportSessionId"), "");
    this.rkC = this.crP.getIntent().getStringExtra("KSessionID");
    Object localObject1 = this.crP.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (localObject1 != null)
      this.rjH = new SendMessageToWX.Req((Bundle)localObject1).message;
    Object localObject3 = this.crP.getIntent().getStringExtra("sns_kemdia_path");
    Object localObject4 = this.crP.getIntent().getByteArrayExtra("Ksnsupload_imgbuf");
    localObject1 = localObject4;
    if (localObject4 == null)
    {
      localObject1 = localObject4;
      if (this.rjH != null)
      {
        localObject1 = localObject4;
        if (this.rjH.mediaObject != null)
        {
          localObject1 = localObject4;
          if ((this.rjH.mediaObject instanceof WXImageObject))
            localObject1 = ((WXImageObject)this.rjH.mediaObject).imageData;
        }
      }
    }
    if ((bo.isNullOrNil((String)localObject3)) && (!bo.cb((byte[])localObject1)))
    {
      localObject3 = af.getAccSnsTmpPath() + com.tencent.mm.a.g.x(new StringBuilder(" ").append(System.currentTimeMillis()).toString().getBytes());
      com.tencent.mm.vfs.e.deleteFile((String)localObject3);
      com.tencent.mm.vfs.e.b((String)localObject3, (byte[])localObject1, localObject1.length);
    }
    label461: Object localObject2;
    for (localObject1 = localObject3; ; localObject2 = localObject3)
    {
      int i = this.crP.getIntent().getIntExtra("KFilterId", 0);
      boolean bool;
      if (paramBundle == null)
      {
        localObject3 = null;
        O(paramBundle);
        bool = O(this.crP.getIntent().getExtras());
        this.rlT = 0;
        if (bo.isNullOrNil((String)localObject3))
          break label461;
        this.rlP.ZC((String)localObject3);
        AppMethodBeat.o(38494);
      }
      while (true)
      {
        return;
        localObject3 = paramBundle.getString("sns_kemdia_path_list");
        break;
        paramBundle = this.crP.getIntent().getStringArrayListExtra("sns_kemdia_path_list");
        if (bo.ek(paramBundle))
          break label679;
        paramBundle = paramBundle.iterator();
        if (paramBundle.hasNext())
        {
          localObject1 = (String)paramBundle.next();
          ab.d("MicroMsg.PicWidget", "newPath ".concat(String.valueOf(localObject1)));
          this.rlP.q((String)localObject1, i, false);
          if (!bool)
          {
            localObject3 = Exif.fromFile((String)localObject1).getLocation();
            if (localObject3 != null)
              this.rlR.put(localObject1, localObject3);
          }
          while (true)
          {
            try
            {
              localObject4 = new com/tencent/mm/vfs/b;
              ((com.tencent.mm.vfs.b)localObject4).<init>((String)localObject1);
              localObject3 = new com/tencent/mm/protocal/protobuf/cbv;
              ((cbv)localObject3).<init>();
              if (!this.rkD)
                break label665;
              j = 1;
              ((cbv)localObject3).xbo = j;
              ((cbv)localObject3).xbq = (((com.tencent.mm.vfs.b)localObject4).lastModified() / 1000L);
              ((cbv)localObject3).xbp = Exif.fromFile((String)localObject1).getUxtimeDatatimeOriginal();
              this.rlS.put(localObject1, localObject3);
            }
            catch (Exception localException)
            {
              ab.e("MicroMsg.PicWidget", "get report info error " + localException.getMessage());
            }
            break;
            label665: j = 2;
          }
        }
        AppMethodBeat.o(38494);
      }
      label679: if (!bo.isNullOrNil(localException))
      {
        paramBundle = af.getAccSnsTmpPath() + "pre_temp_sns_pic" + com.tencent.mm.a.g.x(localException.getBytes());
        com.tencent.mm.vfs.e.tf(com.tencent.mm.vfs.e.atb(paramBundle));
        com.tencent.mm.vfs.e.y(localException, paramBundle);
        if (i != -1)
          break label908;
      }
      label908: for (int j = 0; ; j = i)
      {
        while (true)
        {
          this.rlP.q(paramBundle, j, this.rkD);
          if (!bool)
          {
            localObject3 = Exif.fromFile(localException).getLocation();
            if (localObject3 != null)
              this.rlR.put(paramBundle, localObject3);
          }
          try
          {
            localObject3 = new com/tencent/mm/vfs/b;
            ((com.tencent.mm.vfs.b)localObject3).<init>(localException);
            localObject4 = new com/tencent/mm/protocal/protobuf/cbv;
            ((cbv)localObject4).<init>();
            if (this.rkD);
            for (j = 1; ; j = 2)
            {
              ((cbv)localObject4).xbo = j;
              ((cbv)localObject4).xbq = (((com.tencent.mm.vfs.b)localObject3).lastModified() / 1000L);
              ((cbv)localObject4).xbp = Exif.fromFile(localException).getUxtimeDatatimeOriginal();
              this.rlS.put(paramBundle, localObject4);
              AppMethodBeat.o(38494);
              break;
            }
          }
          catch (Exception paramBundle)
          {
            ab.e("MicroMsg.PicWidget", "get report info error " + paramBundle.getMessage());
          }
        }
        AppMethodBeat.o(38494);
        break;
      }
    }
  }

  public final void N(Bundle paramBundle)
  {
    AppMethodBeat.i(38497);
    paramBundle.putString("sns_kemdia_path_list", this.rlP.toString());
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.rlR.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localArrayList.add(String.format("%s\n%f\n%f", new Object[] { localEntry.getKey(), Double.valueOf(((Exif.a)localEntry.getValue()).latitude), Double.valueOf(((Exif.a)localEntry.getValue()).longitude) }));
    }
    paramBundle.putStringArrayList("sns_media_latlong_list", localArrayList);
    paramBundle.getString("contentdesc");
    AppMethodBeat.o(38497);
  }

  public final View a(View paramView1, View paramView2, DynamicGridView paramDynamicGridView, View paramView3)
  {
    AppMethodBeat.i(38499);
    boolean bool;
    if (this.rlQ == null)
    {
      MMActivity localMMActivity = this.crP;
      ArrayList localArrayList = this.rlP.rma;
      ag.1 local1 = new ag.1(this);
      ag.2 local2 = new ag.2(this);
      if (!this.rlU)
      {
        bool = true;
        this.rlQ = new com.tencent.mm.plugin.sns.ui.previewimageview.e(paramView1, paramView2, paramView3, localMMActivity, localArrayList, paramDynamicGridView, local1, local2, bool);
      }
    }
    while (true)
    {
      paramView1 = this.rlQ.getView();
      AppMethodBeat.o(38499);
      return paramView1;
      bool = false;
      break;
      this.rlQ.setList$22875ea3(this.rlP.rma);
    }
  }

  final void a(com.tencent.mm.plugin.sns.model.ax paramax)
  {
    AppMethodBeat.i(38502);
    int i = paramax.commit();
    if (this.rim != null)
    {
      this.rim.ma(i);
      com.tencent.mm.plugin.sns.i.g.qTp.c(this.rim);
    }
    if ((this.rlP != null) && (this.rlP.rma != null) && (s.crt()))
      com.tencent.mm.plugin.report.service.h.pYm.e(12834, new Object[] { Integer.valueOf(this.rlP.rma.size()) });
    paramax = new Intent();
    paramax.putExtra("sns_local_id", i);
    this.crP.setResult(-1, paramax);
    this.crP.finish();
    AppMethodBeat.o(38502);
  }

  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, ayt paramayt, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(38503);
    paramString2 = new LinkedList();
    Object localObject1 = this.rlP.rma.iterator();
    int i = 0;
    Object localObject3;
    label109: Object localObject4;
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localObject3 = new com.tencent.mm.plugin.sns.data.h((String)localObject2, 2);
      ((com.tencent.mm.plugin.sns.data.h)localObject3).type = 2;
      ((com.tencent.mm.plugin.sns.data.h)localObject3).qFY = paramInt1;
      int j;
      if (i == 0)
      {
        ((com.tencent.mm.plugin.sns.data.h)localObject3).qFX = paramInt2;
        if (parami != null)
        {
          ((com.tencent.mm.plugin.sns.data.h)localObject3).qFZ = parami.token;
          ((com.tencent.mm.plugin.sns.data.h)localObject3).qGa = parami.wFn;
        }
        localObject4 = this.rlP;
        if (!((ag.b)localObject4).rmc.containsKey(localObject2))
          break label245;
        j = ((Integer)((ag.b)localObject4).rmc.get(localObject2)).intValue();
        label150: ((com.tencent.mm.plugin.sns.data.h)localObject3).filterId = j;
        ((com.tencent.mm.plugin.sns.data.h)localObject3).desc = paramString1;
        localObject4 = this.rlP;
        if ((bo.isNullOrNil((String)localObject2)) || (!((ag.b)localObject4).rmb.containsKey(localObject2)))
          break label251;
      }
      label245: label251: for (boolean bool = ((Boolean)((ag.b)localObject4).rmb.get(localObject2)).booleanValue(); ; bool = false)
      {
        ((com.tencent.mm.plugin.sns.data.h)localObject3).qGc = bool;
        paramString2.add(localObject3);
        i++;
        break;
        ((com.tencent.mm.plugin.sns.data.h)localObject3).qFX = 0;
        break label109;
        j = 0;
        break label150;
      }
    }
    Object localObject2 = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      localObject3 = com.tencent.mm.model.t.Zn();
      localObject4 = paramList1.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject1 = (String)((Iterator)localObject4).next();
        if (!((List)localObject3).contains(localObject1))
        {
          paramList1 = new cco();
          paramList1.jBB = ((String)localObject1);
          ((LinkedList)localObject2).add(paramList1);
        }
      }
    }
    paramList1 = new com.tencent.mm.plugin.sns.model.ax(1);
    paramPInt.value = paramList1.aPA;
    if (parami != null)
      paramList1.gc(parami.token, parami.wFn);
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.qFE)
      paramList1.Dd(3);
    paramList1.Ym(paramString1).a(paramayt).ar((LinkedList)localObject2).Df(paramInt1).Dg(paramInt2);
    if (paramBoolean)
      paramList1.Di(1);
    while (true)
    {
      if (!bo.isNullOrNil(this.appId))
        paramList1.Ys(this.appId);
      if (!bo.isNullOrNil(this.appName))
        paramList1.Yt(bo.bc(this.appName, ""));
      paramList1.Dh(this.rig);
      if (this.rjF)
        paramList1.Dh(5);
      if ((this.rjG) && (this.rjH != null))
      {
        paramList1.Yn(this.rjH.mediaTagName);
        paramList1.af(this.appId, this.rjH.messageExt, this.rjH.messageAction);
      }
      paramList1.g(null, null, null, paramInt4, paramInt5);
      paramList1.dg(paramList2);
      paramList1.setSessionId(this.hcl);
      if ((paramayt != null) && (paramayt.score != 0))
      {
        paramInt1 = paramayt.score;
        parami = paramayt.wCC;
        paramList1.qNL.wFw = new cap();
        paramList1.qNL.wFw.wZS = paramInt1;
        paramList1.qNL.wFw.wZP = parami;
      }
      ab.i("MicroMsg.PicWidget", "commit pic size %d, browseImageCount:%d", new Object[] { Integer.valueOf(paramString2.size()), Integer.valueOf(this.rlT) });
      com.tencent.mm.plugin.report.service.h.pYm.e(11602, new Object[] { Integer.valueOf(this.rlT), Integer.valueOf(paramString2.size()) });
      paramString1 = paramString2.iterator();
      while (paramString1.hasNext())
      {
        parami = (com.tencent.mm.plugin.sns.data.h)paramString1.next();
        ab.i("MicroMsg.PicWidget", "commit path  %s len: %d", new Object[] { parami.path, Long.valueOf(com.tencent.mm.vfs.e.asZ(parami.path)) });
      }
      paramList1.Di(0);
    }
    paramString1 = paramString2.iterator();
    if (paramString1.hasNext())
    {
      paramayt = ((com.tencent.mm.plugin.sns.data.h)paramString1.next()).path;
      parami = (cbv)this.rlS.get(paramayt);
      if (parami != null)
        break label1339;
      parami = new cbv();
    }
    label940: label1339: 
    while (true)
    {
      if ((this.rlV != null) && ((this.rlV.vRq != 0.0F) || (this.rlV.vRp != 0.0F)))
      {
        parami.xbm = this.rlV.vRq;
        parami.xbn = this.rlV.vRp;
        parami.rkk = this.rlV.rkk;
        parami.bEJ = this.rlV.bEJ;
        paramayt = (Exif.a)this.rlR.get(paramayt);
        if ((paramayt == null) || ((paramayt.latitude == 0.0D) && (paramayt.longitude == 0.0D)))
          break label1246;
        parami.xbk = ((float)paramayt.latitude);
      }
      for (parami.xbl = ((float)paramayt.longitude); ; parami.xbl = -1000.0F)
      {
        paramayt = new StringBuffer();
        paramayt.append("||index: " + paramList1.qNL.wFr.size());
        paramayt.append("||item poi lat " + parami.xbm + " " + parami.xbn);
        paramayt.append("||item pic lat " + parami.xbk + " " + parami.xbl);
        paramayt.append("||item exitime:" + parami.xbp + " filetime: " + parami.xbq);
        paramayt.append("||item source: " + parami.xbo);
        ab.i("MicroMsg.UploadPackHelper", "addSnsReportInfo item : " + paramayt.toString());
        paramList1.qNL.wFr.add(parami);
        break;
        parami.xbm = -1000.0F;
        parami.xbn = -1000.0F;
        break label940;
        label1246: parami.xbk = -1000.0F;
      }
      if (paramString2.size() <= 1)
      {
        a(paramList1, paramString2);
        a(paramList1);
      }
      while (true)
      {
        com.tencent.mm.kernel.g.RS().aa(new ag.4(this));
        AppMethodBeat.o(38503);
        return true;
        new ag.a(this, paramList1, paramString2).u(new String[] { "" });
      }
    }
  }

  public final boolean crG()
  {
    boolean bool = true;
    AppMethodBeat.i(38498);
    int i;
    if (this.rlP != null)
    {
      ag.b localb = this.rlP;
      if ((localb.rma != null) && (localb.rma.size() > 0))
      {
        i = 1;
        if (i == 0)
          break label56;
        AppMethodBeat.o(38498);
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label56: AppMethodBeat.o(38498);
      bool = false;
    }
  }

  public final View crH()
  {
    AppMethodBeat.i(38500);
    this.rlQ = new PreviewImageView(this.crP);
    if (this.rlU)
      this.rlQ.setIsShowAddImage(false);
    this.rlQ.setImageClick(new ag.3(this));
    this.rlQ.setList$22875ea3(this.rlP.rma);
    View localView = this.rlQ.getView();
    AppMethodBeat.o(38500);
    return localView;
  }

  public final boolean crI()
  {
    AppMethodBeat.i(38507);
    if (this.rlQ != null)
      this.rlQ.clean();
    this.rlR.clear();
    this.rlS.clear();
    AppMethodBeat.o(38507);
    return false;
  }

  public final int css()
  {
    AppMethodBeat.i(38495);
    int i = this.rlP.rma.size();
    AppMethodBeat.o(38495);
    return i;
  }

  protected final boolean cst()
  {
    boolean bool = false;
    AppMethodBeat.i(38504);
    com.tencent.mm.kernel.g.RQ();
    if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(this.crP);
      AppMethodBeat.o(38504);
    }
    while (true)
    {
      return bool;
      if (this.rlP.rma.size() >= 9)
      {
        com.tencent.mm.ui.base.h.g(this.crP, 2131303847, 2131297061);
        AppMethodBeat.o(38504);
        continue;
      }
      try
      {
        ax localax = new com/tencent/mm/plugin/sns/ui/ax;
        localax.<init>(this.crP);
        Object localObject = new com/tencent/mm/plugin/sns/ui/ag$5;
        ((ag.5)localObject).<init>(this);
        localax.rBl = ((n.c)localObject);
        localObject = new com/tencent/mm/plugin/sns/ui/ag$6;
        ((ag.6)localObject).<init>(this);
        localax.rBm = ((n.d)localObject);
        localax.cuu();
        label119: bool = true;
        AppMethodBeat.o(38504);
      }
      catch (Exception localException)
      {
        break label119;
      }
    }
  }

  public final boolean d(List<String> paramList, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(38505);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.i("MicroMsg.PicWidget", "no image selected");
      AppMethodBeat.o(38505);
    }
    while (true)
    {
      return true;
      if (this.rlP.rma.size() >= 9)
      {
        AppMethodBeat.o(38505);
      }
      else
      {
        paramList = paramList.iterator();
        while (true)
          if (paramList.hasNext())
          {
            Object localObject1 = (String)paramList.next();
            if (!com.tencent.mm.vfs.e.ct((String)localObject1))
              continue;
            String str = "pre_temp_sns_pic" + com.tencent.mm.a.g.x(new StringBuilder().append((String)localObject1).append(System.currentTimeMillis()).toString().getBytes());
            s.aj(af.getAccSnsTmpPath(), (String)localObject1, str);
            ab.d("MicroMsg.PicWidget", "newPath " + af.getAccSnsTmpPath() + str);
            this.rlP.q(af.getAccSnsTmpPath() + str, paramInt, paramBoolean);
            ((com.tencent.mm.plugin.sns.ui.previewimageview.e)this.rlQ).Eu(this.rlP.rma.size());
            this.rlQ.setList$22875ea3(this.rlP.rma);
            this.crP.getIntent().putExtra("sns_kemdia_path_list", this.rlP.rma);
            try
            {
              Object localObject2 = new com/tencent/mm/vfs/b;
              ((com.tencent.mm.vfs.b)localObject2).<init>((String)localObject1);
              cbv localcbv = new com/tencent/mm/protocal/protobuf/cbv;
              localcbv.<init>();
              if (paramBoolean);
              for (int i = 1; ; i = 2)
              {
                localcbv.xbo = i;
                localcbv.xbq = (((com.tencent.mm.vfs.b)localObject2).lastModified() / 1000L);
                localcbv.xbp = Exif.fromFile((String)localObject1).getUxtimeDatatimeOriginal();
                Map localMap = this.rlS;
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localMap.put(af.getAccSnsTmpPath() + str, localcbv);
                localObject1 = Exif.fromFile((String)localObject1).getLocation();
                if (localObject1 == null)
                  break;
                this.rlR.put(af.getAccSnsTmpPath() + str, localObject1);
                break;
              }
            }
            catch (Exception localException)
            {
              while (true)
                ab.e("MicroMsg.PicWidget", "get report info error " + localException.getMessage());
            }
          }
        AppMethodBeat.o(38505);
      }
    }
  }

  // ERROR //
  public final boolean f(int paramInt, Intent paramIntent)
  {
    // Byte code:
    //   0: ldc_w 964
    //   3: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_1
    //   7: tableswitch	default:+53 -> 60, 2:+63->70, 3:+171->178, 4:+1154->1161, 5:+53->60, 6:+53->60, 7:+1549->1556, 8:+53->60, 9:+499->506, 10:+53->60, 11:+946->953
    //   61: istore_3
    //   62: ldc_w 964
    //   65: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: iload_3
    //   69: ireturn
    //   70: ldc 121
    //   72: ldc_w 966
    //   75: invokestatic 372	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload_2
    //   79: ifnonnull +14 -> 93
    //   82: iconst_0
    //   83: istore_3
    //   84: ldc_w 964
    //   87: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: goto -22 -> 68
    //   93: ldc 121
    //   95: ldc_w 968
    //   98: invokestatic 372	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   101: new 207	android/content/Intent
    //   104: dup
    //   105: invokespecial 551	android/content/Intent:<init>	()V
    //   108: astore 4
    //   110: aload 4
    //   112: ldc_w 970
    //   115: iconst_4
    //   116: invokevirtual 557	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   119: pop
    //   120: aload 4
    //   122: ldc_w 972
    //   125: iconst_1
    //   126: invokevirtual 975	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   129: pop
    //   130: aload 4
    //   132: ldc_w 977
    //   135: iconst_1
    //   136: invokevirtual 975	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   139: pop
    //   140: getstatic 981	com/tencent/mm/plugin/sns/c/a:gkE	Lcom/tencent/mm/pluginsdk/n;
    //   143: aload_0
    //   144: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   147: aload_2
    //   148: aload 4
    //   150: invokestatic 298	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   153: iconst_4
    //   154: new 983	com/tencent/mm/plugin/sns/ui/ag$7
    //   157: dup
    //   158: aload_0
    //   159: invokespecial 984	com/tencent/mm/plugin/sns/ui/ag$7:<init>	(Lcom/tencent/mm/plugin/sns/ui/ag;)V
    //   162: invokeinterface 989 7 0
    //   167: iconst_1
    //   168: istore_3
    //   169: ldc_w 964
    //   172: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: goto -107 -> 68
    //   178: ldc 121
    //   180: ldc_w 991
    //   183: invokestatic 372	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   186: aload_0
    //   187: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   190: invokevirtual 995	com/tencent/mm/ui/MMActivity:getApplicationContext	()Landroid/content/Context;
    //   193: aload_2
    //   194: invokestatic 298	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   197: invokestatic 1001	com/tencent/mm/pluginsdk/ui/tools/n:h	(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;
    //   200: astore_2
    //   201: aload_2
    //   202: ifnonnull +14 -> 216
    //   205: iconst_1
    //   206: istore_3
    //   207: ldc_w 964
    //   210: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   213: goto -145 -> 68
    //   216: new 207	android/content/Intent
    //   219: dup
    //   220: invokespecial 551	android/content/Intent:<init>	()V
    //   223: astore 4
    //   225: aload 4
    //   227: ldc_w 970
    //   230: iconst_4
    //   231: invokevirtual 557	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   234: pop
    //   235: aload 4
    //   237: ldc_w 977
    //   240: iconst_1
    //   241: invokevirtual 975	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   244: pop
    //   245: aload 4
    //   247: ldc_w 972
    //   250: iconst_1
    //   251: invokevirtual 975	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   254: pop
    //   255: aload 4
    //   257: ldc_w 1003
    //   260: aload_2
    //   261: invokevirtual 1006	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   264: pop
    //   265: new 292	java/lang/StringBuilder
    //   268: dup
    //   269: invokespecial 293	java/lang/StringBuilder:<init>	()V
    //   272: aload_2
    //   273: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: invokestatic 313	java/lang/System:currentTimeMillis	()J
    //   279: invokevirtual 316	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   282: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: invokevirtual 321	java/lang/String:getBytes	()[B
    //   288: invokestatic 327	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   291: astore 5
    //   293: aload 4
    //   295: ldc_w 1008
    //   298: new 292	java/lang/StringBuilder
    //   301: dup
    //   302: invokespecial 293	java/lang/StringBuilder:<init>	()V
    //   305: invokestatic 298	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   308: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: aload 5
    //   313: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   319: invokevirtual 1006	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   322: pop
    //   323: aload_2
    //   324: invokestatic 382	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   327: invokevirtual 386	com/tencent/mm/compatible/util/Exif:getLocation	()Lcom/tencent/mm/compatible/util/Exif$a;
    //   330: astore 6
    //   332: aload 6
    //   334: ifnull +70 -> 404
    //   337: aload_0
    //   338: getfield 62	com/tencent/mm/plugin/sns/ui/ag:rlR	Ljava/util/Map;
    //   341: new 292	java/lang/StringBuilder
    //   344: dup
    //   345: invokespecial 293	java/lang/StringBuilder:<init>	()V
    //   348: invokestatic 298	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   351: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: aload 5
    //   356: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   362: aload 6
    //   364: invokeinterface 150 3 0
    //   369: pop
    //   370: ldc 121
    //   372: ldc_w 1010
    //   375: iconst_2
    //   376: anewarray 446	java/lang/Object
    //   379: dup
    //   380: iconst_0
    //   381: aload 6
    //   383: getfield 456	com/tencent/mm/compatible/util/Exif$a:latitude	D
    //   386: invokestatic 461	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   389: aastore
    //   390: dup
    //   391: iconst_1
    //   392: aload 6
    //   394: getfield 464	com/tencent/mm/compatible/util/Exif$a:longitude	D
    //   397: invokestatic 461	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   400: aastore
    //   401: invokestatic 1012	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   404: new 391	com/tencent/mm/protocal/protobuf/cbv
    //   407: dup
    //   408: invokespecial 392	com/tencent/mm/protocal/protobuf/cbv:<init>	()V
    //   411: astore 6
    //   413: aload 6
    //   415: iconst_1
    //   416: putfield 395	com/tencent/mm/protocal/protobuf/cbv:xbo	I
    //   419: aload 6
    //   421: invokestatic 313	java/lang/System:currentTimeMillis	()J
    //   424: putfield 403	com/tencent/mm/protocal/protobuf/cbv:xbq	J
    //   427: aload 6
    //   429: aload_2
    //   430: invokestatic 382	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   433: getfield 1015	com/tencent/mm/compatible/util/Exif:dateTime	Ljava/lang/String;
    //   436: invokestatic 1018	com/tencent/mm/sdk/platformtools/bo:anl	(Ljava/lang/String;)J
    //   439: putfield 409	com/tencent/mm/protocal/protobuf/cbv:xbp	J
    //   442: aload_0
    //   443: getfield 64	com/tencent/mm/plugin/sns/ui/ag:rlS	Ljava/util/Map;
    //   446: new 292	java/lang/StringBuilder
    //   449: dup
    //   450: invokespecial 293	java/lang/StringBuilder:<init>	()V
    //   453: invokestatic 298	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   456: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: aload 5
    //   461: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   467: aload 6
    //   469: invokeinterface 150 3 0
    //   474: pop
    //   475: getstatic 981	com/tencent/mm/plugin/sns/c/a:gkE	Lcom/tencent/mm/pluginsdk/n;
    //   478: aload_0
    //   479: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   482: aload 4
    //   484: iconst_4
    //   485: invokeinterface 1021 4 0
    //   490: aload_0
    //   491: iconst_1
    //   492: putfield 57	com/tencent/mm/plugin/sns/ui/ag:rkD	Z
    //   495: iconst_1
    //   496: istore_3
    //   497: ldc_w 964
    //   500: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   503: goto -435 -> 68
    //   506: aload_2
    //   507: ldc_w 1023
    //   510: invokevirtual 356	android/content/Intent:getStringArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   513: astore 4
    //   515: aload 4
    //   517: ifnull +11 -> 528
    //   520: aload 4
    //   522: invokevirtual 542	java/util/ArrayList:size	()I
    //   525: ifgt +16 -> 541
    //   528: aload_2
    //   529: ldc_w 1025
    //   532: invokevirtual 217	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   535: invokestatic 286	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   538: ifne +378 -> 916
    //   541: aload 4
    //   543: ifnull +124 -> 667
    //   546: aload 4
    //   548: invokevirtual 542	java/util/ArrayList:size	()I
    //   551: ifle +116 -> 667
    //   554: aload 4
    //   556: iconst_0
    //   557: invokevirtual 1028	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   560: checkcast 113	java/lang/String
    //   563: astore 4
    //   565: aload_2
    //   566: ldc_w 1030
    //   569: invokevirtual 217	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   572: astore 5
    //   574: aload 5
    //   576: invokestatic 286	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   579: ifne +14 -> 593
    //   582: aload 5
    //   584: astore_2
    //   585: aload 5
    //   587: invokestatic 950	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   590: ifne +180 -> 770
    //   593: new 292	java/lang/StringBuilder
    //   596: dup
    //   597: invokespecial 293	java/lang/StringBuilder:<init>	()V
    //   600: invokestatic 298	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   603: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: aload 4
    //   608: invokestatic 1033	com/tencent/mm/a/g:cz	(Ljava/lang/String;)Ljava/lang/String;
    //   611: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   614: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   617: astore_2
    //   618: new 1035	android/media/MediaMetadataRetriever
    //   621: dup
    //   622: invokespecial 1036	android/media/MediaMetadataRetriever:<init>	()V
    //   625: astore 5
    //   627: aload 5
    //   629: aload 4
    //   631: invokevirtual 1039	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   634: aload 5
    //   636: lconst_0
    //   637: invokevirtual 1043	android/media/MediaMetadataRetriever:getFrameAtTime	(J)Landroid/graphics/Bitmap;
    //   640: astore 6
    //   642: aload 6
    //   644: ifnonnull +35 -> 679
    //   647: ldc 121
    //   649: ldc_w 1045
    //   652: invokestatic 129	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   655: aload 5
    //   657: invokevirtual 1048	android/media/MediaMetadataRetriever:release	()V
    //   660: goto -600 -> 60
    //   663: astore_2
    //   664: goto -604 -> 60
    //   667: aload_2
    //   668: ldc_w 1025
    //   671: invokevirtual 217	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   674: astore 4
    //   676: goto -111 -> 565
    //   679: ldc 121
    //   681: ldc_w 1050
    //   684: iconst_2
    //   685: anewarray 446	java/lang/Object
    //   688: dup
    //   689: iconst_0
    //   690: aload 6
    //   692: invokevirtual 1055	android/graphics/Bitmap:getWidth	()I
    //   695: invokestatic 547	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   698: aastore
    //   699: dup
    //   700: iconst_1
    //   701: aload 6
    //   703: invokevirtual 1058	android/graphics/Bitmap:getHeight	()I
    //   706: invokestatic 547	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   709: aastore
    //   710: invokestatic 759	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   713: aload 6
    //   715: bipush 80
    //   717: getstatic 1064	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   720: aload_2
    //   721: iconst_1
    //   722: invokestatic 1069	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   725: aload_2
    //   726: invokestatic 1073	com/tencent/mm/sdk/platformtools/d:amj	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   729: astore 6
    //   731: ldc 121
    //   733: ldc_w 1075
    //   736: iconst_2
    //   737: anewarray 446	java/lang/Object
    //   740: dup
    //   741: iconst_0
    //   742: aload 6
    //   744: getfield 1080	android/graphics/BitmapFactory$Options:outWidth	I
    //   747: invokestatic 547	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   750: aastore
    //   751: dup
    //   752: iconst_1
    //   753: aload 6
    //   755: getfield 1083	android/graphics/BitmapFactory$Options:outHeight	I
    //   758: invokestatic 547	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   761: aastore
    //   762: invokestatic 759	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   765: aload 5
    //   767: invokevirtual 1048	android/media/MediaMetadataRetriever:release	()V
    //   770: ldc 121
    //   772: ldc_w 1085
    //   775: iconst_4
    //   776: anewarray 446	java/lang/Object
    //   779: dup
    //   780: iconst_0
    //   781: aload 4
    //   783: aastore
    //   784: dup
    //   785: iconst_1
    //   786: aload_2
    //   787: aastore
    //   788: dup
    //   789: iconst_2
    //   790: aload 4
    //   792: invokestatic 768	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   795: invokestatic 773	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   798: aastore
    //   799: dup
    //   800: iconst_3
    //   801: aload_2
    //   802: invokestatic 768	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   805: invokestatic 773	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   808: aastore
    //   809: invokestatic 759	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   812: aload 4
    //   814: invokestatic 1033	com/tencent/mm/a/g:cz	(Ljava/lang/String;)Ljava/lang/String;
    //   817: astore 5
    //   819: aload_0
    //   820: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   823: instanceof 1087
    //   826: ifeq +30 -> 856
    //   829: aload_0
    //   830: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   833: checkcast 1087	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   836: aload 4
    //   838: aload_2
    //   839: aload 5
    //   841: aconst_null
    //   842: iconst_0
    //   843: invokevirtual 1090	com/tencent/mm/plugin/sns/ui/SnsUploadUI:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BZ)V
    //   846: aload_0
    //   847: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   850: checkcast 1087	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   853: invokevirtual 1093	com/tencent/mm/plugin/sns/ui/SnsUploadUI:cuF	()V
    //   856: iconst_1
    //   857: istore_3
    //   858: ldc_w 964
    //   861: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   864: goto -796 -> 68
    //   867: astore 6
    //   869: ldc 121
    //   871: ldc_w 1095
    //   874: iconst_1
    //   875: anewarray 446	java/lang/Object
    //   878: dup
    //   879: iconst_0
    //   880: aload 6
    //   882: invokevirtual 414	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   885: aastore
    //   886: invokestatic 1097	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   889: aload 5
    //   891: invokevirtual 1048	android/media/MediaMetadataRetriever:release	()V
    //   894: goto -124 -> 770
    //   897: astore 5
    //   899: goto -129 -> 770
    //   902: astore_2
    //   903: aload 5
    //   905: invokevirtual 1048	android/media/MediaMetadataRetriever:release	()V
    //   908: ldc_w 964
    //   911: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   914: aload_2
    //   915: athrow
    //   916: aload_0
    //   917: aload_2
    //   918: ldc_w 1099
    //   921: invokevirtual 356	android/content/Intent:getStringArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   924: aload_2
    //   925: ldc_w 1101
    //   928: iconst_0
    //   929: invokevirtual 241	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   932: aload_2
    //   933: ldc_w 1103
    //   936: iconst_0
    //   937: invokevirtual 211	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   940: invokevirtual 1105	com/tencent/mm/plugin/sns/ui/ag:d	(Ljava/util/List;IZ)Z
    //   943: istore_3
    //   944: ldc_w 964
    //   947: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   950: goto -882 -> 68
    //   953: aload_2
    //   954: ldc_w 1107
    //   957: invokevirtual 1111	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   960: checkcast 1113	com/tencent/mm/plugin/mmsight/SightCaptureResult
    //   963: astore 5
    //   965: aload 5
    //   967: ifnull -907 -> 60
    //   970: aload 5
    //   972: getfield 1116	com/tencent/mm/plugin/mmsight/SightCaptureResult:osA	Z
    //   975: ifeq +36 -> 1011
    //   978: aload 5
    //   980: getfield 1119	com/tencent/mm/plugin/mmsight/SightCaptureResult:osI	Ljava/lang/String;
    //   983: astore_2
    //   984: aload_2
    //   985: invokestatic 286	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   988: ifne -928 -> 60
    //   991: aload_0
    //   992: aload_2
    //   993: invokestatic 1125	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   996: iconst_0
    //   997: iconst_1
    //   998: invokevirtual 1105	com/tencent/mm/plugin/sns/ui/ag:d	(Ljava/util/List;IZ)Z
    //   1001: istore_3
    //   1002: ldc_w 964
    //   1005: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1008: goto -940 -> 68
    //   1011: aload 5
    //   1013: getfield 1128	com/tencent/mm/plugin/mmsight/SightCaptureResult:osC	Ljava/lang/String;
    //   1016: astore 7
    //   1018: aload 5
    //   1020: getfield 1131	com/tencent/mm/plugin/mmsight/SightCaptureResult:osD	Ljava/lang/String;
    //   1023: astore 6
    //   1025: aconst_null
    //   1026: astore 4
    //   1028: aload_0
    //   1029: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1032: invokevirtual 197	com/tencent/mm/ui/MMActivity:getIntent	()Landroid/content/Intent;
    //   1035: ldc_w 1133
    //   1038: aload 5
    //   1040: getfield 1131	com/tencent/mm/plugin/mmsight/SightCaptureResult:osD	Ljava/lang/String;
    //   1043: invokevirtual 1006	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1046: pop
    //   1047: aload 5
    //   1049: getfield 1136	com/tencent/mm/plugin/mmsight/SightCaptureResult:osF	Ljava/lang/String;
    //   1052: invokestatic 286	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1055: ifne +72 -> 1127
    //   1058: aload 5
    //   1060: getfield 1136	com/tencent/mm/plugin/mmsight/SightCaptureResult:osF	Ljava/lang/String;
    //   1063: astore_2
    //   1064: aload 5
    //   1066: getfield 1140	com/tencent/mm/plugin/mmsight/SightCaptureResult:osH	Lcom/tencent/mm/protocal/protobuf/baa;
    //   1069: invokevirtual 1145	com/tencent/mm/protocal/protobuf/baa:toByteArray	()[B
    //   1072: astore 5
    //   1074: aload 5
    //   1076: astore 4
    //   1078: aload_0
    //   1079: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1082: instanceof 1087
    //   1085: ifeq +31 -> 1116
    //   1088: aload_0
    //   1089: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1092: checkcast 1087	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   1095: aload 7
    //   1097: aload 6
    //   1099: aload_2
    //   1100: aload 4
    //   1102: iconst_1
    //   1103: invokevirtual 1090	com/tencent/mm/plugin/sns/ui/SnsUploadUI:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BZ)V
    //   1106: aload_0
    //   1107: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1110: checkcast 1087	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   1113: invokevirtual 1093	com/tencent/mm/plugin/sns/ui/SnsUploadUI:cuF	()V
    //   1116: iconst_1
    //   1117: istore_3
    //   1118: ldc_w 964
    //   1121: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1124: goto -1056 -> 68
    //   1127: aload 7
    //   1129: invokestatic 1033	com/tencent/mm/a/g:cz	(Ljava/lang/String;)Ljava/lang/String;
    //   1132: astore_2
    //   1133: goto -69 -> 1064
    //   1136: astore 5
    //   1138: ldc 121
    //   1140: ldc_w 1147
    //   1143: iconst_1
    //   1144: anewarray 446	java/lang/Object
    //   1147: dup
    //   1148: iconst_0
    //   1149: aload 5
    //   1151: invokevirtual 414	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1154: aastore
    //   1155: invokestatic 759	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1158: goto -80 -> 1078
    //   1161: ldc 121
    //   1163: ldc_w 1149
    //   1166: invokestatic 372	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1169: aload_2
    //   1170: ifnonnull +14 -> 1184
    //   1173: iconst_1
    //   1174: istore_3
    //   1175: ldc_w 964
    //   1178: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1181: goto -1113 -> 68
    //   1184: aload_2
    //   1185: ldc_w 1008
    //   1188: invokevirtual 217	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   1191: astore 4
    //   1193: ldc 121
    //   1195: ldc_w 1151
    //   1198: aload 4
    //   1200: invokestatic 366	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1203: invokevirtual 369	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1206: invokestatic 372	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1209: aload 4
    //   1211: ifnonnull +14 -> 1225
    //   1214: iconst_1
    //   1215: istore_3
    //   1216: ldc_w 964
    //   1219: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1222: goto -1154 -> 68
    //   1225: aload 4
    //   1227: invokestatic 950	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   1230: ifne +14 -> 1244
    //   1233: iconst_1
    //   1234: istore_3
    //   1235: ldc_w 964
    //   1238: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1241: goto -1173 -> 68
    //   1244: aload_0
    //   1245: getfield 55	com/tencent/mm/plugin/sns/ui/ag:rlP	Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1248: getfield 486	com/tencent/mm/plugin/sns/ui/ag$b:rma	Ljava/util/ArrayList;
    //   1251: invokevirtual 542	java/util/ArrayList:size	()I
    //   1254: bipush 9
    //   1256: if_icmplt +14 -> 1270
    //   1259: iconst_1
    //   1260: istore_3
    //   1261: ldc_w 964
    //   1264: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1267: goto -1199 -> 68
    //   1270: aload_2
    //   1271: ldc_w 1101
    //   1274: iconst_0
    //   1275: invokevirtual 241	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1278: istore_1
    //   1279: new 292	java/lang/StringBuilder
    //   1282: dup
    //   1283: ldc_w 416
    //   1286: invokespecial 307	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1289: new 292	java/lang/StringBuilder
    //   1292: dup
    //   1293: invokespecial 293	java/lang/StringBuilder:<init>	()V
    //   1296: aload 4
    //   1298: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1301: invokestatic 313	java/lang/System:currentTimeMillis	()J
    //   1304: invokevirtual 316	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1307: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1310: invokevirtual 321	java/lang/String:getBytes	()[B
    //   1313: invokestatic 327	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   1316: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1319: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1322: astore_2
    //   1323: ldc 121
    //   1325: new 292	java/lang/StringBuilder
    //   1328: dup
    //   1329: ldc_w 1153
    //   1332: invokespecial 307	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1335: aload 4
    //   1337: invokestatic 768	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   1340: invokevirtual 316	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1343: ldc_w 304
    //   1346: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1349: aload 4
    //   1351: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1354: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1357: invokestatic 838	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1360: aload 4
    //   1362: new 292	java/lang/StringBuilder
    //   1365: dup
    //   1366: invokespecial 293	java/lang/StringBuilder:<init>	()V
    //   1369: invokestatic 298	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   1372: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1375: aload_2
    //   1376: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1379: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1382: invokestatic 426	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   1385: pop2
    //   1386: aload_0
    //   1387: getfield 62	com/tencent/mm/plugin/sns/ui/ag:rlR	Ljava/util/Map;
    //   1390: aload 4
    //   1392: invokeinterface 603 2 0
    //   1397: ifeq +44 -> 1441
    //   1400: aload_0
    //   1401: getfield 62	com/tencent/mm/plugin/sns/ui/ag:rlR	Ljava/util/Map;
    //   1404: new 292	java/lang/StringBuilder
    //   1407: dup
    //   1408: invokespecial 293	java/lang/StringBuilder:<init>	()V
    //   1411: invokestatic 298	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   1414: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1417: aload_2
    //   1418: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1421: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1424: aload_0
    //   1425: getfield 62	com/tencent/mm/plugin/sns/ui/ag:rlR	Ljava/util/Map;
    //   1428: aload 4
    //   1430: invokeinterface 607 2 0
    //   1435: invokeinterface 150 3 0
    //   1440: pop
    //   1441: new 292	java/lang/StringBuilder
    //   1444: dup
    //   1445: invokespecial 293	java/lang/StringBuilder:<init>	()V
    //   1448: invokestatic 298	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   1451: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1454: aload_2
    //   1455: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1458: invokevirtual 317	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1461: astore_2
    //   1462: ldc 121
    //   1464: ldc_w 362
    //   1467: aload_2
    //   1468: invokestatic 366	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1471: invokevirtual 369	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1474: invokestatic 372	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1477: aload_0
    //   1478: getfield 55	com/tencent/mm/plugin/sns/ui/ag:rlP	Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1481: aload_2
    //   1482: iload_1
    //   1483: iconst_0
    //   1484: invokevirtual 376	com/tencent/mm/plugin/sns/ui/ag$b:q	(Ljava/lang/String;IZ)Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1487: pop
    //   1488: aload_0
    //   1489: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1492: invokevirtual 197	com/tencent/mm/ui/MMActivity:getIntent	()Landroid/content/Intent;
    //   1495: ldc_w 350
    //   1498: aload_0
    //   1499: getfield 55	com/tencent/mm/plugin/sns/ui/ag:rlP	Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1502: getfield 486	com/tencent/mm/plugin/sns/ui/ag$b:rma	Ljava/util/ArrayList;
    //   1505: invokevirtual 960	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    //   1508: pop
    //   1509: aload_0
    //   1510: getfield 482	com/tencent/mm/plugin/sns/ui/ag:rlQ	Lcom/tencent/mm/plugin/sns/ui/v;
    //   1513: checkcast 494	com/tencent/mm/plugin/sns/ui/previewimageview/e
    //   1516: aload_0
    //   1517: getfield 55	com/tencent/mm/plugin/sns/ui/ag:rlP	Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1520: getfield 486	com/tencent/mm/plugin/sns/ui/ag$b:rma	Ljava/util/ArrayList;
    //   1523: invokevirtual 542	java/util/ArrayList:size	()I
    //   1526: invokevirtual 957	com/tencent/mm/plugin/sns/ui/previewimageview/e:Eu	(I)V
    //   1529: aload_0
    //   1530: getfield 482	com/tencent/mm/plugin/sns/ui/ag:rlQ	Lcom/tencent/mm/plugin/sns/ui/v;
    //   1533: aload_0
    //   1534: getfield 55	com/tencent/mm/plugin/sns/ui/ag:rlP	Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1537: getfield 486	com/tencent/mm/plugin/sns/ui/ag$b:rma	Ljava/util/ArrayList;
    //   1540: invokeinterface 506 2 0
    //   1545: iconst_1
    //   1546: istore_3
    //   1547: ldc_w 964
    //   1550: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1553: goto -1485 -> 68
    //   1556: aload_2
    //   1557: ifnonnull +14 -> 1571
    //   1560: iconst_1
    //   1561: istore_3
    //   1562: ldc_w 964
    //   1565: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1568: goto -1500 -> 68
    //   1571: aload_0
    //   1572: getfield 55	com/tencent/mm/plugin/sns/ui/ag:rlP	Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1575: aload_2
    //   1576: ldc_w 1155
    //   1579: invokevirtual 356	android/content/Intent:getStringArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   1582: invokevirtual 1159	com/tencent/mm/plugin/sns/ui/ag$b:S	(Ljava/util/ArrayList;)V
    //   1585: aload_0
    //   1586: getfield 78	com/tencent/mm/plugin/sns/ui/ag:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1589: invokevirtual 197	com/tencent/mm/ui/MMActivity:getIntent	()Landroid/content/Intent;
    //   1592: ldc_w 350
    //   1595: aload_0
    //   1596: getfield 55	com/tencent/mm/plugin/sns/ui/ag:rlP	Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1599: getfield 486	com/tencent/mm/plugin/sns/ui/ag$b:rma	Ljava/util/ArrayList;
    //   1602: invokevirtual 960	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    //   1605: pop
    //   1606: aload_0
    //   1607: getfield 482	com/tencent/mm/plugin/sns/ui/ag:rlQ	Lcom/tencent/mm/plugin/sns/ui/v;
    //   1610: checkcast 494	com/tencent/mm/plugin/sns/ui/previewimageview/e
    //   1613: aload_0
    //   1614: getfield 55	com/tencent/mm/plugin/sns/ui/ag:rlP	Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1617: getfield 486	com/tencent/mm/plugin/sns/ui/ag$b:rma	Ljava/util/ArrayList;
    //   1620: invokevirtual 542	java/util/ArrayList:size	()I
    //   1623: invokevirtual 957	com/tencent/mm/plugin/sns/ui/previewimageview/e:Eu	(I)V
    //   1626: aload_0
    //   1627: getfield 482	com/tencent/mm/plugin/sns/ui/ag:rlQ	Lcom/tencent/mm/plugin/sns/ui/v;
    //   1630: aload_0
    //   1631: getfield 55	com/tencent/mm/plugin/sns/ui/ag:rlP	Lcom/tencent/mm/plugin/sns/ui/ag$b;
    //   1634: getfield 486	com/tencent/mm/plugin/sns/ui/ag$b:rma	Ljava/util/ArrayList;
    //   1637: invokeinterface 506 2 0
    //   1642: aload_0
    //   1643: aload_2
    //   1644: ldc_w 1161
    //   1647: iconst_0
    //   1648: invokevirtual 241	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1651: putfield 66	com/tencent/mm/plugin/sns/ui/ag:rlT	I
    //   1654: iconst_1
    //   1655: istore_3
    //   1656: ldc_w 964
    //   1659: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1662: goto -1594 -> 68
    //   1665: astore 5
    //   1667: goto -897 -> 770
    //   1670: astore 4
    //   1672: goto -764 -> 908
    //
    // Exception table:
    //   from	to	target	type
    //   655	660	663	java/lang/Exception
    //   627	642	867	java/lang/Exception
    //   647	655	867	java/lang/Exception
    //   679	765	867	java/lang/Exception
    //   889	894	897	java/lang/Exception
    //   627	642	902	finally
    //   647	655	902	finally
    //   679	765	902	finally
    //   869	889	902	finally
    //   1064	1074	1136	java/lang/Exception
    //   765	770	1665	java/lang/Exception
    //   903	908	1670	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ag
 * JD-Core Version:    0.6.2
 */