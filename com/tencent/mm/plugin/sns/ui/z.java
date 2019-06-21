package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.h;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class z
  implements y
{
  private String appId;
  private String appName;
  private String cMg;
  private String cMl;
  private String cMm;
  final MMActivity crP;
  public String fiM = "";
  public String fiN = "";
  private Bitmap fru = null;
  private TextView gne = null;
  private int h = -1;
  String hcl;
  private View jAp = null;
  String link = "";
  private boolean mog = false;
  private cvi qNQ = null;
  private String rid = "";
  private byte[] rie = null;
  private String rif;
  private int rig;
  private CdnImageView rih = null;
  private TextView rii = null;
  private b rim = null;
  private boolean rjA = false;
  private String rjB;
  private String rjC;
  private boolean rjD = false;
  private boolean rjE = false;
  private boolean rjF = false;
  private boolean rjG = false;
  private WXMediaMessage rjH = null;
  private String rjI = "";
  private String rjJ = "";
  private String rjK;
  private String rjL;
  private int rjM = 0;
  private b rjN = null;
  private int rjO = 0;
  private String rjP = "";
  private String rjQ = "";
  private int rjR = 0;
  private String rjS = "";
  private String rjT = "";
  String rjU = "";
  private String title = "";
  private String videoUrl = "";
  private int w = -1;

  public z(MMActivity paramMMActivity)
  {
    this.crP = paramMMActivity;
  }

  public final void M(Bundle paramBundle)
  {
    AppMethodBeat.i(38276);
    this.rim = b.u(this.crP.getIntent());
    this.rjO = this.crP.getIntent().getIntExtra("Ksnsupload_type", 0);
    this.rjR = this.crP.getIntent().getIntExtra("KSnsStreamVideoTotalTime", 0);
    this.rjS = bo.bc(this.crP.getIntent().getStringExtra("KSnsStreamVideoWroding"), "");
    this.rjT = bo.bc(this.crP.getIntent().getStringExtra("KSnsStreamVideoWebUrl"), "");
    this.fiM = bo.bc(this.crP.getIntent().getStringExtra("KSnsStreamVideoAduxInfo"), "");
    this.fiN = bo.bc(this.crP.getIntent().getStringExtra("KSnsStreamVideoPublishId"), "");
    this.w = this.crP.getIntent().getIntExtra("Ksnsupload_width", -1);
    this.h = this.crP.getIntent().getIntExtra("Ksnsupload_height", -1);
    this.rig = this.crP.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.rjC = bo.bc(this.crP.getIntent().getStringExtra("key_snsad_statextstr"), "");
    this.link = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_link"), "");
    this.title = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_title"), "");
    this.rid = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
    this.rie = this.crP.getIntent().getByteArrayExtra("Ksnsupload_imgbuf");
    if ((this.rie == null) && (this.rjH != null) && (this.rjH.mediaObject != null) && ((this.rjH.mediaObject instanceof WXImageObject)))
      this.rie = ((WXImageObject)this.rjH.mediaObject).imageData;
    this.mog = this.crP.getIntent().getBooleanExtra("ksnsis_video", false);
    this.rjD = this.crP.getIntent().getBooleanExtra("ksnsis_music", false);
    this.rjE = this.crP.getIntent().getBooleanExtra("ksnsis_appbrand", false);
    this.cMg = bo.bc(this.crP.getIntent().getStringExtra("src_username"), "");
    this.rif = bo.bc(this.crP.getIntent().getStringExtra("src_displayname"), "");
    this.appId = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.rjF = this.crP.getIntent().getBooleanExtra("KThrid_app", false);
    this.rjG = this.crP.getIntent().getBooleanExtra("KSnsAction", false);
    this.rjK = bo.bc(this.crP.getIntent().getStringExtra("ShareUrlOriginal"), "");
    this.rjL = bo.bc(this.crP.getIntent().getStringExtra("ShareUrlOpen"), "");
    this.cMl = bo.bc(this.crP.getIntent().getStringExtra("JsAppId"), "");
    this.cMm = bo.bc(this.crP.getIntent().getStringExtra("KPublisherId"), "");
    this.hcl = bo.bc(this.crP.getIntent().getStringExtra("reportSessionId"), "");
    this.rjM = this.crP.getIntent().getIntExtra("Ksnsupload_contentattribute", 0);
    this.rjU = this.crP.getIntent().getStringExtra("fav_note_xml");
    this.rjP = bo.bc(this.crP.getIntent().getStringExtra("KsnsUpload_BrandUsername"), "");
    this.rjQ = bo.bc(this.crP.getIntent().getStringExtra("KsnsUpload_BrandPath"), "");
    this.rjB = bo.bc(this.crP.getIntent().getStringExtra("KlinkThumb_url"), "");
    if ((this.rjB.startsWith("http://mmsns.qpic.cn")) || (this.rjB.startsWith("https://mmsns.qpic.cn")))
    {
      this.rid = this.rjB;
      this.rie = null;
      ab.i("MicroMsg.LinkWidget", "get thumb url %s", new Object[] { this.rjB });
    }
    paramBundle = this.crP.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null)
    {
      this.rjH = new SendMessageToWX.Req(paramBundle).message;
      if (bo.isNullOrNil(this.title))
        this.title = this.rjH.title;
      if (bo.isNullOrNil(this.rjJ))
        this.rjJ = this.rjH.description;
      if (bo.cb(this.rie))
        this.rie = this.rjH.thumbData;
    }
    paramBundle = this.crP.getIntent().getByteArrayExtra("KWebSearchInfo");
    if (paramBundle != null)
      this.qNQ = new cvi();
    try
    {
      this.qNQ.parseFrom(paramBundle);
      paramBundle = this.crP.getIntent().getStringExtra("KSnsStrId");
      Object localObject = bo.bc(this.crP.getIntent().getStringExtra("KSnsLocalId"), "");
      localObject = af.cnF().YT((String)localObject);
      if (!bo.isNullOrNil(paramBundle))
      {
        this.rjN = b.lY(706);
        this.rjN.mc(this.rjN.fQh).ty(System.currentTimeMillis()).mc(this.rjN.fQi).mc(1).ty(paramBundle);
        if (localObject != null)
        {
          this.rjN.mb(((n)localObject).field_type);
          this.rjN.cS(((n)localObject).DI(32)).tx(((n)localObject).crc()).tx(this.link);
        }
        h.qTp.b(this.rjN);
      }
      AppMethodBeat.o(38276);
      return;
    }
    catch (IOException paramBundle)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LinkWidget", paramBundle, "parse web search info failed", new Object[0]);
        this.qNQ = null;
      }
    }
  }

  public final void N(Bundle paramBundle)
  {
  }

  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, ayt paramayt, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(38278);
    Object localObject1;
    if (this.rjD)
      localObject1 = new ax(4);
    label324: Object localObject2;
    Object localObject3;
    while (true)
    {
      paramPInt.value = ((ax)localObject1).aPA;
      if (paramInt3 > a.qFE)
        ((ax)localObject1).Dd(4);
      if (this.rie == null)
      {
        com.tencent.mm.at.o.ahk();
        paramPInt = c.kR(this.rid);
        if ((paramPInt != null) && (!paramPInt.isRecycled()))
        {
          paramPInt = d.a(paramPInt, 150, 150, false, false);
          ab.i("MicroMsg.LinkWidget", "create bitmap %d %d", new Object[] { Integer.valueOf(paramPInt.getHeight()), Integer.valueOf(paramPInt.getWidth()) });
          this.rie = d.ai(paramPInt);
        }
      }
      ((ax)localObject1).Yr(this.title).Yp(this.link).Yq(this.link).Ym(paramString1);
      if (this.rjO == 15)
        ((ax)localObject1).Yp(bo.bc(this.crP.getIntent().getStringExtra("fav_note_link_description"), ""));
      if (!this.rjD)
        break;
      if (!((ax)localObject1).a(this.rie, this.link, this.link, this.link, 3, "", ""));
      ((ax)localObject1).Dh(this.rig);
      ((ax)localObject1).Yu(this.cMg);
      ((ax)localObject1).Yv(this.rif);
      paramString1 = this.rjC;
      ((ax)localObject1).qNK.rjC = bo.nullAsNil(paramString1);
      ab.i("MicroMsg.UploadPackHelper", "setStatExtStr:%s", new Object[] { paramString1 });
      ((ax)localObject1).Df(paramInt1);
      if (!paramBoolean)
        break label1191;
      ((ax)localObject1).Di(1);
      ((ax)localObject1).dg(paramList2);
      paramString1 = new LinkedList();
      if (paramList1 == null)
        break label1201;
      new LinkedList();
      paramList2 = t.Zn();
      paramPInt = paramList1.iterator();
      while (paramPInt.hasNext())
      {
        paramList1 = (String)paramPInt.next();
        if (!paramList2.contains(paramList1))
        {
          localObject2 = new cco();
          ((cco)localObject2).jBB = paramList1;
          paramString1.add(localObject2);
        }
      }
      if (this.mog)
      {
        localObject1 = new ax(5);
      }
      else if (this.rjE)
      {
        localObject1 = new ax(25);
        localObject2 = this.rjP;
        ((ax)localObject1).qNK.xfO.username = ((String)localObject2);
        localObject2 = this.rjQ;
        ((ax)localObject1).qNK.xfO.path = ((String)localObject2);
      }
      else if (this.rjO == 11)
      {
        localObject1 = new ax(18);
        localObject2 = new cfg();
        ((cfg)localObject2).fiJ = this.rjS;
        ((cfg)localObject2).fiI = this.title;
        ((cfg)localObject2).fiG = this.link;
        ((cfg)localObject2).fiK = this.rjT;
        ((cfg)localObject2).fiH = this.rjR;
        ((cfg)localObject2).fiL = this.rid;
        ((cfg)localObject2).fiM = this.fiM;
        ((cfg)localObject2).fiN = this.fiN;
        ((ax)localObject1).qNP = ((cfg)localObject2);
        ((ax)localObject1).qNK.xfN = ((cfg)localObject2);
      }
      else if (this.rjO == 15)
      {
        localObject1 = new ax(26);
        localObject2 = this.rjU;
        ((ax)localObject1).qNK.xfI.wbM = ((String)localObject2);
      }
      else if ((this.rjO == 16) && (this.qNQ != null))
      {
        localObject2 = new ax(3);
        localObject3 = this.qNQ;
        localObject1 = localObject2;
        if (localObject3 != null)
        {
          ((ax)localObject2).qNQ = ((cvi)localObject3);
          localObject1 = localObject2;
        }
      }
      else
      {
        localObject1 = new ax(3);
      }
    }
    if (this.mog)
      if (this.rjH == null)
        break label1500;
    label788: label852: label1500: for (paramPInt = (WXVideoObject)this.rjH.mediaObject; ; paramPInt = null)
    {
      localObject2 = this.rie;
      localObject3 = this.link;
      if (paramPInt == null)
      {
        paramString1 = this.link;
        if (paramPInt != null)
          break label852;
      }
      for (paramPInt = this.link; ; paramPInt = bo.bc(paramPInt.videoUrl, this.link))
      {
        ((ax)localObject1).a((byte[])localObject2, (String)localObject3, paramString1, paramPInt, 4, bo.bc(this.title, ""), bo.bc(this.rjJ, ""));
        break;
        paramString1 = bo.bc(paramPInt.videoLowBandUrl, this.link);
        break label788;
      }
      if (!bo.isNullOrNil(this.rjB))
      {
        paramString1 = this.rjB;
        paramInt2 = this.w;
        paramInt3 = this.h;
        paramString1 = ax.ag("", paramString1, paramString1);
        if (paramString1 == null)
        {
          ab.e("MicroMsg.UploadPackHelper", "share img o.url is null!");
          break;
        }
        paramString1.Desc = "";
        if ((paramInt2 > 0) && (paramInt3 > 0))
        {
          paramPInt = new baw();
          paramPInt.wFy = paramInt3;
          paramPInt.wFx = paramInt2;
          paramString1.wEK = paramPInt;
        }
        if (!bo.isNullOrNil(""))
          paramString1.Title = "";
        if (!bo.isNullOrNil(""))
          paramString1.Desc = "";
        ((ax)localObject1).qNK.xfI.wbK.add(paramString1);
        break;
      }
      if (this.rie == null)
        break;
      if (this.rjE)
      {
        paramString1 = this.rie;
        if (paramString1 != null)
          break label1118;
      }
      for (paramInt3 = 0; ; paramInt3 = 0)
      {
        if (paramInt3 != 0)
        {
          ab.i("MicroMsg.LinkWidget", "isPngThumbData");
          paramString1 = e.bj(this.rie);
          if ((paramString1 != null) && (paramString1.length > 0))
          {
            ab.i("MicroMsg.LinkWidget", "use covert data");
            this.rie = e.bj(paramString1);
          }
        }
        ((ax)localObject1).b(this.rie, "", "");
        break;
        label1118: if (paramString1.length >= 4)
          break label1131;
      }
      label1131: paramInt2 = 1;
      for (int i = 0; ; i++)
      {
        paramInt3 = paramInt2;
        if (i >= 4)
          break;
        if (paramString1[i] != new byte[] { -119, 80, 78, 71 }[i])
          paramInt2 = 0;
      }
      ((ax)localObject1).Di(0);
      break label324;
      if (parami != null)
        ((ax)localObject1).gc(parami.token, parami.wFn);
      ((ax)localObject1).ar(paramString1);
      if (!bo.isNullOrNil(this.appId))
        ((ax)localObject1).Ys(this.appId);
      if (!bo.isNullOrNil(this.appName))
        ((ax)localObject1).Yt(bo.bc(this.appName, ""));
      if (this.rjF)
        ((ax)localObject1).Dh(5);
      ((ax)localObject1).a(paramayt);
      if ((this.rjG) && (this.rjH != null))
      {
        ((ax)localObject1).Yn(this.rjH.mediaTagName);
        ((ax)localObject1).af(this.appId, this.rjH.messageExt, this.rjH.messageAction);
      }
      ((ax)localObject1).Yo(paramString2);
      ((ax)localObject1).g(this.rjK, this.rjL, this.cMl, paramInt4, paramInt5);
      parami = this.cMm;
      ((ax)localObject1).qNL.cMm = parami;
      ((ax)localObject1).setSessionId(this.hcl);
      paramInt1 = this.rjM;
      ((ax)localObject1).qNK.fgt = paramInt1;
      paramInt1 = ((ax)localObject1).commit();
      if (this.rim != null)
      {
        this.rim.ma(paramInt1);
        g.qTp.c(this.rim);
      }
      if (this.rjN != null)
      {
        this.rjN.ma(paramInt1);
        h.qTp.c(this.rjN);
        this.rjN.ajK();
      }
      af.cnB().cmp();
      this.crP.finish();
      AppMethodBeat.o(38278);
      return false;
    }
  }

  public final boolean crG()
  {
    return true;
  }

  public final View crH()
  {
    AppMethodBeat.i(38277);
    this.jAp = v.hu(this.crP).inflate(2130970978, null);
    if (!bo.isNullOrNil(this.link))
      this.jAp.setOnClickListener(new z.1(this));
    this.rih = ((CdnImageView)this.jAp.findViewById(2131825687));
    this.gne = ((TextView)this.jAp.findViewById(2131825689));
    this.rii = ((TextView)this.jAp.findViewById(2131825690));
    int i;
    if ((!this.mog) && (!this.rjD))
    {
      if ((this.qNQ != null) && (!bo.isNullOrNil(this.qNQ.uaa)))
      {
        i = 1;
        if (i == 0)
          break label233;
      }
    }
    else
    {
      this.jAp.findViewById(2131824637).setVisibility(0);
      label154: if (bo.isNullOrNil(this.title))
        break label251;
      this.gne.setText(this.title);
      label175: if (bo.isNullOrNil(this.rid))
        break label268;
      this.rih.setVisibility(0);
      this.rih.setUrl(this.rid);
    }
    while (true)
    {
      com.tencent.mm.plugin.sns.data.i.b(this.rih, this.crP);
      View localView = this.jAp;
      AppMethodBeat.o(38277);
      return localView;
      i = 0;
      break;
      label233: this.jAp.findViewById(2131824637).setVisibility(8);
      break label154;
      label251: this.gne.setText(au.ZI(this.link));
      break label175;
      label268: if (!bo.cb(this.rie))
      {
        this.rih.setVisibility(0);
        this.fru = d.bQ(this.rie);
        this.rih.setImageBitmap(this.fru);
        this.rjA = true;
      }
      else if (!bo.isNullOrNil(this.rjU))
      {
        this.rih.setImageResource(2131231726);
        this.rih.setVisibility(0);
      }
      else
      {
        this.rih.setImageResource(2131230820);
        this.rih.setVisibility(0);
      }
    }
  }

  public final boolean crI()
  {
    AppMethodBeat.i(38279);
    if ((this.fru != null) && (!this.fru.isRecycled()) && (this.rjA))
      this.fru.recycle();
    AppMethodBeat.o(38279);
    return false;
  }

  public final boolean f(int paramInt, Intent paramIntent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.z
 * JD-Core Version:    0.6.2
 */