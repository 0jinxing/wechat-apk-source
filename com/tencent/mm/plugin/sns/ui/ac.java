package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qt;
import com.tencent.mm.g.a.qt.b;
import com.tencent.mm.g.b.a.ag;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.QImageView.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ac
  implements y
{
  private String appId;
  private String appName;
  MMActivity crP;
  String cvZ;
  private boolean cwB;
  String desc;
  ProgressDialog ehJ;
  String fgE;
  private String hcl;
  private View jAp;
  String nuk;
  private int rig;
  private com.tencent.mm.modelsns.b rim;
  private boolean rjF;
  private boolean rjG;
  private WXMediaMessage rjH;
  private Bitmap rkA;
  private baa rkB;
  private String rkC;
  private boolean rkD;
  boolean rkE;
  private int rkF;
  private MediaMetadataRetriever rkG;
  private int rkH;
  private int rkI;
  private int rkJ;
  private Pair<Integer, Integer> rkK;
  private Bitmap rkL;
  boolean rkM;
  private c rkN;
  ax rkO;
  private int rkP;
  Runnable rkQ;
  Runnable rkR;
  SightPlayImageView rkx;
  private ImageView rky;
  boolean rkz;
  String thumbPath;
  String videoPath;

  public ac(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(38347);
    this.jAp = null;
    this.rky = null;
    this.thumbPath = "";
    this.videoPath = "";
    this.cvZ = "";
    this.cwB = false;
    this.rkz = false;
    this.rkA = null;
    this.rim = null;
    this.rkB = new baa();
    this.rjF = false;
    this.rjG = false;
    this.rjH = null;
    this.rkD = false;
    this.rkE = false;
    this.rkF = 0;
    this.rkG = new MediaMetadataRetriever();
    this.rkH = 0;
    this.rkI = 0;
    this.rkJ = 90;
    this.rkK = null;
    this.rkL = null;
    this.rkM = false;
    this.rkN = new ac.1(this);
    this.rkO = null;
    this.rkP = 0;
    this.desc = "";
    this.ehJ = null;
    this.rkQ = new ac.5(this);
    this.rkR = new ac.6(this);
    this.crP = paramMMActivity;
    AppMethodBeat.o(38347);
  }

  private void ld(boolean paramBoolean)
  {
    AppMethodBeat.i(38351);
    this.videoPath = "";
    this.thumbPath = "";
    this.rkE = paramBoolean;
    this.rkJ = 90;
    if (com.tencent.mm.plugin.sns.data.i.B(this.rkL))
    {
      this.rkL.recycle();
      this.rkL = null;
    }
    AppMethodBeat.o(38351);
  }

  final void DR(int paramInt)
  {
    AppMethodBeat.i(38354);
    ag localag = new ag().Fr();
    localag.cYH = paramInt;
    localag.fj(this.rkC).ajK();
    AppMethodBeat.o(38354);
  }

  public final void M(Bundle paramBundle)
  {
    AppMethodBeat.i(38348);
    this.rim = com.tencent.mm.modelsns.b.u(this.crP.getIntent());
    this.nuk = bo.bc(this.crP.getIntent().getStringExtra("KSightCdnUrl"), "");
    this.fgE = bo.bc(this.crP.getIntent().getStringExtra("KSightCdnThumbUrl"), "");
    this.appId = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.rjF = this.crP.getIntent().getBooleanExtra("KThrid_app", false);
    this.rjG = this.crP.getIntent().getBooleanExtra("KSnsAction", false);
    this.rkD = this.crP.getIntent().getBooleanExtra("Kis_take_photo", false);
    this.rkM = this.crP.getIntent().getBooleanExtra("KBlockAdd", false);
    this.rig = this.crP.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.hcl = bo.bc(this.crP.getIntent().getStringExtra("reportSessionId"), "");
    this.rkC = this.crP.getIntent().getStringExtra("KSessionID");
    paramBundle = this.crP.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null)
      this.rjH = new SendMessageToWX.Req(paramBundle).message;
    this.thumbPath = this.crP.getIntent().getStringExtra("KSightThumbPath");
    this.videoPath = this.crP.getIntent().getStringExtra("KSightPath");
    this.cvZ = this.crP.getIntent().getStringExtra("sight_md5");
    paramBundle = this.crP.getIntent().getByteArrayExtra("KMMSightExtInfo");
    if (paramBundle != null);
    try
    {
      this.rkB.parseFrom(paramBundle);
      if (this.rkB == null)
      {
        this.rkB = new baa();
        this.rkB.wDP = this.rkD;
      }
      this.rkB.csB = this.hcl;
      paramBundle = new qt();
      paramBundle.cMT.type = 2;
      com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
      if (bo.isNullOrNil(this.videoPath))
      {
        this.videoPath = bo.bc(paramBundle.cMU.cMY, "");
        ab.e("MicroMsg.SightWidget", "videoPath is null %s", new Object[] { this.videoPath });
      }
      if (bo.isNullOrNil(this.cvZ))
      {
        paramBundle = bo.bc(paramBundle.cMU.cMW, "");
        this.cvZ = paramBundle;
        ab.i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", new Object[] { this.thumbPath, this.videoPath, this.cvZ });
        com.tencent.mm.sdk.b.a.xxA.c(this.rkN);
        if (this.rkF != 0)
          break label625;
        af.cnu();
        i = s.getScreenWidth();
        if (i != 0)
          break label586;
        AppMethodBeat.o(38348);
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        int i;
        ab.i("MicroMsg.SightWidget", "error %s", new Object[] { paramBundle.getMessage() });
        continue;
        paramBundle = this.cvZ;
        continue;
        label586: this.rkF = ((i - this.crP.getResources().getDimensionPixelSize(2131428681) * 4 - this.crP.getResources().getDimensionPixelSize(2131427779) * 2) / 3);
        label625: AppMethodBeat.o(38348);
      }
    }
  }

  public final void N(Bundle paramBundle)
  {
  }

  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, ayt paramayt, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(38350);
    if (!com.tencent.mm.vfs.e.ct(this.videoPath))
    {
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(38340);
          com.tencent.mm.ui.base.t.makeText(ac.this.crP, 2131302960, 0).show();
          AppMethodBeat.o(38340);
        }
      });
      paramBoolean = false;
      AppMethodBeat.o(38350);
    }
    while (true)
    {
      return paramBoolean;
      if (this.rkO != null)
      {
        paramBoolean = false;
        AppMethodBeat.o(38350);
      }
      else
      {
        if (!this.rkz)
          break;
        paramBoolean = true;
        AppMethodBeat.o(38350);
      }
    }
    this.rkz = true;
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
      this.rkO.dg(paramList2);
      this.rkO.Dh(this.rig);
      this.rkO.cNJ = this.rkB;
      this.rkO.g(null, null, null, paramInt4, paramInt5);
      if (!bo.isNullOrNil(this.appId))
        this.rkO.Ys(this.appId);
      if (!bo.isNullOrNil(this.appName))
        this.rkO.Yt(bo.bc(this.appName, ""));
      if (this.rjF)
        this.rkO.Dh(5);
      if ((this.rjG) && (this.rjH != null))
      {
        this.rkO.Yn(this.rjH.mediaTagName);
        this.rkO.af(this.appId, this.rjH.messageExt, this.rjH.messageAction);
      }
      al.n(this.rkR, 700L);
      d.post(new ac.4(this), "sight_send_ready");
      paramBoolean = true;
      AppMethodBeat.o(38350);
      break;
      this.rkO.Di(0);
    }
  }

  public final boolean crG()
  {
    if (!this.rkE);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final View crH()
  {
    AppMethodBeat.i(38349);
    this.jAp = View.inflate(this.crP, 2130970980, null);
    this.rkx = ((SightPlayImageView)this.jAp.findViewById(2131821511));
    this.rky = ((ImageView)this.jAp.findViewById(2131820981));
    Object localObject = new DisplayMetrics();
    this.crP.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.rkI = com.tencent.mm.bz.a.fromDPToPix(this.crP, 100);
    this.rkH = com.tencent.mm.bz.a.fromDPToPix(this.crP, 100);
    try
    {
      this.rkG.setDataSource(this.videoPath);
      this.rkJ = bo.getInt(this.rkG.extractMetadata(24), 0);
      this.rkL = this.rkG.getFrameAtTime();
      int i;
      if ((this.rkJ == 0) || (this.rkJ == 180))
      {
        i = 1;
        if (i == 0)
          break label460;
        this.rkI = bo.getInt(this.rkG.extractMetadata(19), com.tencent.mm.bz.a.fromDPToPix(this.crP, 100));
      }
      for (this.rkH = bo.getInt(this.rkG.extractMetadata(18), com.tencent.mm.bz.a.fromDPToPix(this.crP, 100)); ; this.rkH = bo.getInt(this.rkG.extractMetadata(19), com.tencent.mm.bz.a.fromDPToPix(this.crP, 100)))
      {
        this.rkK = com.tencent.mm.modelsns.e.a(this.rkH, this.rkI, this.crP, false);
        ab.d("MicroMsg.SightWidget", "rawWidth=%s rawHeight=%s fixWidth=%s fixHeight=%s rotation=%s", new Object[] { Integer.valueOf(this.rkH), Integer.valueOf(this.rkI), this.rkK.first, this.rkK.second, Integer.valueOf(this.rkJ) });
        crZ();
        this.rkx.setScaleType(QImageView.a.zNT);
        this.rkx.qyI = true;
        this.rkx.setOnClickListener(new ac.2(this));
        ab.i("MicroMsg.SightWidget", "videoPath " + this.videoPath + " thumbPath " + this.thumbPath + " " + com.tencent.mm.vfs.e.asZ(this.videoPath) + " " + com.tencent.mm.vfs.e.asZ(this.thumbPath));
        if (com.tencent.mm.vfs.e.ct(this.videoPath))
          ab.i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", new Object[] { this.videoPath, this.cvZ });
        localObject = this.jAp;
        AppMethodBeat.o(38349);
        return localObject;
        i = 0;
        break;
        label460: this.rkI = bo.getInt(this.rkG.extractMetadata(18), com.tencent.mm.bz.a.fromDPToPix(this.crP, 100));
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.SightWidget", "MetadataRetriever init fail! path:%s  exception:%s", new Object[] { this.videoPath, localException.getMessage() });
    }
  }

  public final boolean crI()
  {
    AppMethodBeat.i(38353);
    if (this.ehJ != null)
      this.ehJ.dismiss();
    com.tencent.mm.sdk.b.a.xxA.d(this.rkN);
    if (com.tencent.mm.plugin.sns.data.i.B(this.rkA))
      this.rkA.recycle();
    ld(false);
    AppMethodBeat.o(38353);
    return false;
  }

  final void crZ()
  {
    AppMethodBeat.i(38355);
    if ((this.rkL != null) && (!this.rkL.isRecycled()))
    {
      this.rkx.setImageBitmap(this.rkL);
      this.rkx.fi(((Integer)this.rkK.first).intValue(), ((Integer)this.rkK.second).intValue());
    }
    AppMethodBeat.o(38355);
  }

  final void csa()
  {
    AppMethodBeat.i(38356);
    this.rky.setVisibility(8);
    this.rkx.qyA.clear();
    this.rkx.fi(com.tencent.mm.bz.a.fromDPToPix(this.crP, 100), com.tencent.mm.bz.a.fromDPToPix(this.crP, 100));
    this.rkx.setBackgroundResource(2131690503);
    this.rkx.setImageResource(2131230780);
    this.rkx.setContentDescription(this.rkx.getContext().getString(2131303592));
    int i = com.tencent.mm.bz.a.fromDPToPix(this.crP, 100) * 35 / 100;
    this.rkx.setPadding(i, i, i, i);
    AppMethodBeat.o(38356);
  }

  // ERROR //
  public final boolean f(int paramInt, Intent paramIntent)
  {
    // Byte code:
    //   0: ldc_w 833
    //   3: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_1
    //   7: tableswitch	default:+29 -> 36, 9:+290->297, 10:+29->36, 11:+82->89, 12:+39->46
    //   37: istore_3
    //   38: ldc_w 833
    //   41: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: iload_3
    //   45: ireturn
    //   46: aload_2
    //   47: ifnull -11 -> 36
    //   50: aload_0
    //   51: aload_2
    //   52: ldc_w 835
    //   55: iconst_0
    //   56: invokevirtual 253	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   59: putfield 112	com/tencent/mm/plugin/sns/ui/ac:rkE	Z
    //   62: aload_0
    //   63: getfield 112	com/tencent/mm/plugin/sns/ui/ac:rkE	Z
    //   66: ifeq +12 -> 78
    //   69: aload_0
    //   70: invokevirtual 837	com/tencent/mm/plugin/sns/ui/ac:csa	()V
    //   73: aload_0
    //   74: iconst_1
    //   75: invokespecial 775	com/tencent/mm/plugin/sns/ui/ac:ld	(Z)V
    //   78: iconst_1
    //   79: istore_3
    //   80: ldc_w 833
    //   83: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: goto -42 -> 44
    //   89: aload_2
    //   90: ldc_w 839
    //   93: invokevirtual 843	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   96: checkcast 845	com/tencent/mm/plugin/mmsight/SightCaptureResult
    //   99: astore 4
    //   101: aload 4
    //   103: ifnull -67 -> 36
    //   106: aload 4
    //   108: getfield 848	com/tencent/mm/plugin/mmsight/SightCaptureResult:osA	Z
    //   111: ifne +116 -> 227
    //   114: aload_0
    //   115: iconst_0
    //   116: putfield 112	com/tencent/mm/plugin/sns/ui/ac:rkE	Z
    //   119: aload_0
    //   120: aload 4
    //   122: getfield 851	com/tencent/mm/plugin/mmsight/SightCaptureResult:osC	Ljava/lang/String;
    //   125: putfield 87	com/tencent/mm/plugin/sns/ui/ac:videoPath	Ljava/lang/String;
    //   128: aload_0
    //   129: aload 4
    //   131: getfield 854	com/tencent/mm/plugin/mmsight/SightCaptureResult:osD	Ljava/lang/String;
    //   134: putfield 85	com/tencent/mm/plugin/sns/ui/ac:thumbPath	Ljava/lang/String;
    //   137: aload 4
    //   139: getfield 857	com/tencent/mm/plugin/mmsight/SightCaptureResult:osF	Ljava/lang/String;
    //   142: invokestatic 424	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   145: ifne +67 -> 212
    //   148: aload_0
    //   149: aload 4
    //   151: getfield 857	com/tencent/mm/plugin/mmsight/SightCaptureResult:osF	Ljava/lang/String;
    //   154: putfield 89	com/tencent/mm/plugin/sns/ui/ac:cvZ	Ljava/lang/String;
    //   157: aload_0
    //   158: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   161: instanceof 859
    //   164: ifeq +37 -> 201
    //   167: aload_0
    //   168: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   171: checkcast 859	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   174: aload_0
    //   175: getfield 87	com/tencent/mm/plugin/sns/ui/ac:videoPath	Ljava/lang/String;
    //   178: aload_0
    //   179: getfield 85	com/tencent/mm/plugin/sns/ui/ac:thumbPath	Ljava/lang/String;
    //   182: aload_0
    //   183: getfield 89	com/tencent/mm/plugin/sns/ui/ac:cvZ	Ljava/lang/String;
    //   186: aconst_null
    //   187: iconst_1
    //   188: invokevirtual 862	com/tencent/mm/plugin/sns/ui/SnsUploadUI:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BZ)V
    //   191: aload_0
    //   192: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   195: checkcast 859	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   198: invokevirtual 865	com/tencent/mm/plugin/sns/ui/SnsUploadUI:cuF	()V
    //   201: iconst_1
    //   202: istore_3
    //   203: ldc_w 833
    //   206: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: goto -165 -> 44
    //   212: aload_0
    //   213: aload 4
    //   215: getfield 851	com/tencent/mm/plugin/mmsight/SightCaptureResult:osC	Ljava/lang/String;
    //   218: invokestatic 868	com/tencent/mm/vfs/e:atg	(Ljava/lang/String;)Ljava/lang/String;
    //   221: putfield 89	com/tencent/mm/plugin/sns/ui/ac:cvZ	Ljava/lang/String;
    //   224: goto -67 -> 157
    //   227: aload_0
    //   228: iconst_1
    //   229: putfield 112	com/tencent/mm/plugin/sns/ui/ac:rkE	Z
    //   232: aload_2
    //   233: ldc_w 870
    //   236: iconst_0
    //   237: invokevirtual 377	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   240: istore_1
    //   241: aload 4
    //   243: getfield 873	com/tencent/mm/plugin/mmsight/SightCaptureResult:osI	Ljava/lang/String;
    //   246: astore_2
    //   247: aload_0
    //   248: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   251: instanceof 859
    //   254: ifeq +32 -> 286
    //   257: aload_0
    //   258: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   261: checkcast 859	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   264: aload_2
    //   265: iconst_1
    //   266: iload_1
    //   267: aconst_null
    //   268: aconst_null
    //   269: aload_0
    //   270: getfield 379	com/tencent/mm/plugin/sns/ui/ac:rig	I
    //   273: invokevirtual 876	com/tencent/mm/plugin/sns/ui/SnsUploadUI:a	(Ljava/lang/String;ZILjava/util/ArrayList;Ljava/util/ArrayList;I)V
    //   276: aload_0
    //   277: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   280: checkcast 859	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   283: invokevirtual 865	com/tencent/mm/plugin/sns/ui/SnsUploadUI:cuF	()V
    //   286: iconst_1
    //   287: istore_3
    //   288: ldc_w 833
    //   291: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   294: goto -250 -> 44
    //   297: aload_2
    //   298: ldc_w 878
    //   301: invokevirtual 882	android/content/Intent:getStringArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   304: astore 4
    //   306: aload 4
    //   308: ifnull +11 -> 319
    //   311: aload 4
    //   313: invokevirtual 887	java/util/ArrayList:size	()I
    //   316: ifgt +16 -> 332
    //   319: aload_2
    //   320: ldc_w 889
    //   323: invokevirtual 343	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   326: invokestatic 424	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   329: ifne +387 -> 716
    //   332: aload_0
    //   333: iconst_0
    //   334: putfield 112	com/tencent/mm/plugin/sns/ui/ac:rkE	Z
    //   337: aload 4
    //   339: ifnull +124 -> 463
    //   342: aload 4
    //   344: invokevirtual 887	java/util/ArrayList:size	()I
    //   347: ifle +116 -> 463
    //   350: aload 4
    //   352: iconst_0
    //   353: invokevirtual 893	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   356: checkcast 517	java/lang/String
    //   359: astore 4
    //   361: aload_2
    //   362: ldc_w 895
    //   365: invokevirtual 343	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   368: astore 5
    //   370: aload 5
    //   372: invokestatic 424	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   375: ifne +14 -> 389
    //   378: aload 5
    //   380: astore_2
    //   381: aload 5
    //   383: invokestatic 484	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   386: ifne +180 -> 566
    //   389: new 740	java/lang/StringBuilder
    //   392: dup
    //   393: invokespecial 896	java/lang/StringBuilder:<init>	()V
    //   396: invokestatic 899	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   399: invokevirtual 748	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: aload 4
    //   404: invokestatic 868	com/tencent/mm/vfs/e:atg	(Ljava/lang/String;)Ljava/lang/String;
    //   407: invokevirtual 748	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: invokevirtual 762	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   413: astore_2
    //   414: new 116	android/media/MediaMetadataRetriever
    //   417: dup
    //   418: invokespecial 117	android/media/MediaMetadataRetriever:<init>	()V
    //   421: astore 5
    //   423: aload 5
    //   425: aload 4
    //   427: invokevirtual 680	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   430: aload 5
    //   432: lconst_0
    //   433: invokevirtual 902	android/media/MediaMetadataRetriever:getFrameAtTime	(J)Landroid/graphics/Bitmap;
    //   436: astore 6
    //   438: aload 6
    //   440: ifnonnull +35 -> 475
    //   443: ldc 171
    //   445: ldc_w 904
    //   448: invokestatic 906	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   451: aload 5
    //   453: invokevirtual 909	android/media/MediaMetadataRetriever:release	()V
    //   456: goto -420 -> 36
    //   459: astore_2
    //   460: goto -424 -> 36
    //   463: aload_2
    //   464: ldc_w 889
    //   467: invokevirtual 343	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   470: astore 4
    //   472: goto -111 -> 361
    //   475: ldc 171
    //   477: ldc_w 911
    //   480: iconst_2
    //   481: anewarray 4	java/lang/Object
    //   484: dup
    //   485: iconst_0
    //   486: aload 6
    //   488: invokevirtual 914	android/graphics/Bitmap:getWidth	()I
    //   491: invokestatic 704	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   494: aastore
    //   495: dup
    //   496: iconst_1
    //   497: aload 6
    //   499: invokevirtual 917	android/graphics/Bitmap:getHeight	()I
    //   502: invokestatic 704	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   505: aastore
    //   506: invokestatic 446	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   509: aload 6
    //   511: bipush 80
    //   513: getstatic 923	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   516: aload_2
    //   517: iconst_1
    //   518: invokestatic 928	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   521: aload_2
    //   522: invokestatic 932	com/tencent/mm/sdk/platformtools/d:amj	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   525: astore 6
    //   527: ldc 171
    //   529: ldc_w 934
    //   532: iconst_2
    //   533: anewarray 4	java/lang/Object
    //   536: dup
    //   537: iconst_0
    //   538: aload 6
    //   540: getfield 939	android/graphics/BitmapFactory$Options:outWidth	I
    //   543: invokestatic 704	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   546: aastore
    //   547: dup
    //   548: iconst_1
    //   549: aload 6
    //   551: getfield 942	android/graphics/BitmapFactory$Options:outHeight	I
    //   554: invokestatic 704	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   557: aastore
    //   558: invokestatic 446	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   561: aload 5
    //   563: invokevirtual 909	android/media/MediaMetadataRetriever:release	()V
    //   566: aload_0
    //   567: aload 4
    //   569: invokestatic 868	com/tencent/mm/vfs/e:atg	(Ljava/lang/String;)Ljava/lang/String;
    //   572: putfield 89	com/tencent/mm/plugin/sns/ui/ac:cvZ	Ljava/lang/String;
    //   575: ldc 171
    //   577: ldc_w 944
    //   580: iconst_4
    //   581: anewarray 4	java/lang/Object
    //   584: dup
    //   585: iconst_0
    //   586: aload 4
    //   588: aastore
    //   589: dup
    //   590: iconst_1
    //   591: aload_2
    //   592: aastore
    //   593: dup
    //   594: iconst_2
    //   595: aload 4
    //   597: invokestatic 756	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   600: invokestatic 949	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   603: aastore
    //   604: dup
    //   605: iconst_3
    //   606: aload_2
    //   607: invokestatic 756	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   610: invokestatic 949	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   613: aastore
    //   614: invokestatic 446	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   617: aload_0
    //   618: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   621: instanceof 859
    //   624: ifeq +32 -> 656
    //   627: aload_0
    //   628: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   631: checkcast 859	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   634: aload 4
    //   636: aload_2
    //   637: aload_0
    //   638: getfield 89	com/tencent/mm/plugin/sns/ui/ac:cvZ	Ljava/lang/String;
    //   641: aconst_null
    //   642: iconst_0
    //   643: invokevirtual 862	com/tencent/mm/plugin/sns/ui/SnsUploadUI:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BZ)V
    //   646: aload_0
    //   647: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   650: checkcast 859	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   653: invokevirtual 865	com/tencent/mm/plugin/sns/ui/SnsUploadUI:cuF	()V
    //   656: iconst_1
    //   657: istore_3
    //   658: ldc_w 833
    //   661: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   664: goto -620 -> 44
    //   667: astore 6
    //   669: ldc 171
    //   671: ldc_w 951
    //   674: iconst_1
    //   675: anewarray 4	java/lang/Object
    //   678: dup
    //   679: iconst_0
    //   680: aload 6
    //   682: invokevirtual 464	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   685: aastore
    //   686: invokestatic 439	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   689: aload 5
    //   691: invokevirtual 909	android/media/MediaMetadataRetriever:release	()V
    //   694: goto -128 -> 566
    //   697: astore 5
    //   699: goto -133 -> 566
    //   702: astore_2
    //   703: aload 5
    //   705: invokevirtual 909	android/media/MediaMetadataRetriever:release	()V
    //   708: ldc_w 833
    //   711: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   714: aload_2
    //   715: athrow
    //   716: aload_0
    //   717: iconst_1
    //   718: putfield 112	com/tencent/mm/plugin/sns/ui/ac:rkE	Z
    //   721: aload_2
    //   722: ldc_w 953
    //   725: invokevirtual 882	android/content/Intent:getStringArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   728: astore 6
    //   730: aload 6
    //   732: ifnull +11 -> 743
    //   735: aload 6
    //   737: invokevirtual 887	java/util/ArrayList:size	()I
    //   740: ifne +22 -> 762
    //   743: ldc 171
    //   745: ldc_w 955
    //   748: invokestatic 178	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   751: iconst_0
    //   752: istore_3
    //   753: ldc_w 833
    //   756: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   759: goto -715 -> 44
    //   762: new 884	java/util/ArrayList
    //   765: dup
    //   766: invokespecial 956	java/util/ArrayList:<init>	()V
    //   769: astore 7
    //   771: aload 6
    //   773: invokevirtual 957	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   776: astore 8
    //   778: aload 8
    //   780: invokeinterface 511 1 0
    //   785: ifeq +76 -> 861
    //   788: aload 8
    //   790: invokeinterface 515 1 0
    //   795: checkcast 517	java/lang/String
    //   798: astore 4
    //   800: aload 4
    //   802: invokestatic 963	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   805: invokevirtual 967	com/tencent/mm/compatible/util/Exif:getLocation	()Lcom/tencent/mm/compatible/util/Exif$a;
    //   808: astore 5
    //   810: aload 5
    //   812: ifnull -34 -> 778
    //   815: aload 7
    //   817: ldc_w 969
    //   820: iconst_3
    //   821: anewarray 4	java/lang/Object
    //   824: dup
    //   825: iconst_0
    //   826: aload 4
    //   828: aastore
    //   829: dup
    //   830: iconst_1
    //   831: aload 5
    //   833: getfield 975	com/tencent/mm/compatible/util/Exif$a:latitude	D
    //   836: invokestatic 980	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   839: aastore
    //   840: dup
    //   841: iconst_2
    //   842: aload 5
    //   844: getfield 983	com/tencent/mm/compatible/util/Exif$a:longitude	D
    //   847: invokestatic 980	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   850: aastore
    //   851: invokestatic 987	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   854: invokevirtual 988	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   857: pop
    //   858: goto -80 -> 778
    //   861: aload_2
    //   862: ldc_w 990
    //   865: iconst_0
    //   866: invokevirtual 253	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   869: istore_3
    //   870: aload_2
    //   871: ldc_w 870
    //   874: iconst_0
    //   875: invokevirtual 377	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   878: istore_1
    //   879: aload_0
    //   880: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   883: instanceof 859
    //   886: ifeq -850 -> 36
    //   889: aload_0
    //   890: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   893: checkcast 859	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   896: aconst_null
    //   897: iload_3
    //   898: iload_1
    //   899: aload 6
    //   901: aload 7
    //   903: aload_0
    //   904: getfield 379	com/tencent/mm/plugin/sns/ui/ac:rig	I
    //   907: invokevirtual 876	com/tencent/mm/plugin/sns/ui/SnsUploadUI:a	(Ljava/lang/String;ZILjava/util/ArrayList;Ljava/util/ArrayList;I)V
    //   910: aload_0
    //   911: getfield 158	com/tencent/mm/plugin/sns/ui/ac:crP	Lcom/tencent/mm/ui/MMActivity;
    //   914: checkcast 859	com/tencent/mm/plugin/sns/ui/SnsUploadUI
    //   917: invokevirtual 865	com/tencent/mm/plugin/sns/ui/SnsUploadUI:cuF	()V
    //   920: goto -884 -> 36
    //   923: astore 5
    //   925: goto -359 -> 566
    //   928: astore 4
    //   930: goto -222 -> 708
    //
    // Exception table:
    //   from	to	target	type
    //   451	456	459	java/lang/Exception
    //   423	438	667	java/lang/Exception
    //   443	451	667	java/lang/Exception
    //   475	561	667	java/lang/Exception
    //   689	694	697	java/lang/Exception
    //   423	438	702	finally
    //   443	451	702	finally
    //   475	561	702	finally
    //   669	689	702	finally
    //   561	566	923	java/lang/Exception
    //   703	708	928	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ac
 * JD-Core Version:    0.6.2
 */