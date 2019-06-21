package com.tencent.mm.ui.chatting.c.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.g.a.lo;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.protocal.protobuf.ajz;
import com.tencent.mm.protocal.protobuf.aka;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.appbrand.b;
import com.tencent.mm.ui.appbrand.b.2;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.r;

public final class a extends c
{
  private com.tencent.mm.ui.appbrand.a appBrandServiceActionSheet;
  private String appId;
  private int emC;
  private String hID;
  private String hIE;
  private String hIF;
  private String hIG;
  private String hIH;
  private String mSceneId;
  private WxaExposedParams yTl;
  private boolean yTm;
  private com.tencent.mm.sdk.b.c<lo> yTn;
  private String yTo;

  public a()
  {
    AppMethodBeat.i(31891);
    this.yTn = new a.1(this);
    this.yTo = "";
    AppMethodBeat.o(31891);
  }

  public final void dEm()
  {
    AppMethodBeat.i(31895);
    ab.i("MicroMsg.AppBrandServiceComponent", "updateStaticTitle()");
    if (!bo.isNullOrNil(this.hIF))
    {
      this.cgL.yTx.setMMTitle(this.hIF);
      if (bo.isNullOrNil(this.hIG))
        break label113;
      this.cgL.yTx.setMMSubTitle(this.hIG);
      label61: if (!this.yTm)
        break label201;
      ((r)this.cgL.aF(r.class)).OA(0);
      AppMethodBeat.o(31895);
    }
    while (true)
    {
      return;
      this.cgL.yTx.setMMTitle(this.cgL.dDw());
      break;
      label113: this.yTo = b.aqK(b.aqJ(this.cgL.getTalkerUserName()));
      if (bo.isNullOrNil(this.yTo))
      {
        this.cgL.yTx.setMMSubTitle(2131296834);
        break label61;
      }
      this.cgL.yTx.setMMSubTitle(ah.getContext().getString(2131296834) + "-" + this.yTo);
      break label61;
      label201: ((r)this.cgL.aF(r.class)).OA(8);
      AppMethodBeat.o(31895);
    }
  }

  public final void dFq()
  {
    AppMethodBeat.i(31896);
    this.cgL.yTx.addIconOptionMenu(0, 2131296731, 2130839555, new a.2(this));
    AppMethodBeat.o(31896);
  }

  public final String dFr()
  {
    return this.hIH;
  }

  public final void dxA()
  {
    AppMethodBeat.i(31893);
    this.yTn.dnU();
    AppMethodBeat.o(31893);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31894);
    this.yTn.dead();
    AppMethodBeat.o(31894);
  }

  public final void dxx()
  {
    AppMethodBeat.i(31892);
    this.emC = this.cgL.yTx.getIntExtra("app_brand_chatting_from_scene", 1);
    this.yTl = ((WxaExposedParams)this.cgL.yTx.getParcelableExtra("app_brand_chatting_expose_params"));
    this.mSceneId = bo.nullAsNil(this.cgL.yTx.getStringExtra("key_scene_id"));
    ab.i("MicroMsg.AppBrandServiceComponent", "onChattingInit() fromScene:%d wxaExposedParams:%s mSceneId:%s", new Object[] { Integer.valueOf(this.emC), this.yTl, this.mSceneId });
    this.hID = this.cgL.yTx.getStringExtra("keyPrivateAppId");
    if (!bo.isNullOrNil(this.hID))
    {
      this.hIE = this.cgL.yTx.getStringExtra("keyPrivateUserName");
      this.hIF = this.cgL.yTx.getStringExtra("keyPrivateTitle");
      this.hIG = this.cgL.yTx.getStringExtra("keyPrivateSubTitle");
      this.hIH = this.cgL.yTx.getStringExtra("keyPrivateHeadImage");
      ab.i("MicroMsg.AppBrandServiceComponent", "onChattingInit customized appId:%s, username:%s, title:%s, subtitle:%s, headImage:%s", new Object[] { this.hID, this.hIE, this.hIF, this.hIG, this.hIH });
    }
    this.appBrandServiceActionSheet = new com.tencent.mm.ui.appbrand.a(this.cgL.yTx.getContext());
    Object localObject = ((d)g.K(d.class)).zb(this.cgL.getTalkerUserName());
    boolean bool;
    String str;
    b.a locala;
    ajz localajz;
    if ((localObject != null) && ((((WxaAttributes)localObject).field_appOpt & 0x2) > 0))
    {
      bool = true;
      this.yTm = bool;
      str = this.cgL.getTalkerUserName();
      localObject = getAppId();
      locala = new b.a();
      locala.fsI = 2912;
      locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/getkefusessioninfo";
      locala.fsL = 0;
      locala.fsM = 0;
      localajz = new ajz();
      str = b.aqJ(str);
      if (!bo.isNullOrNil(str))
        break label425;
      localajz.csB = ((String)localObject);
    }
    for (localajz.wpz = ""; ; localajz.wpz = ((String)localObject))
    {
      locala.fsJ = localajz;
      locala.fsK = new aka();
      w.a(locala.acD(), new b.2());
      AppMethodBeat.o(31892);
      return;
      bool = false;
      break;
      label425: localajz.csB = b.zm(str);
    }
  }

  protected final String getAppId()
  {
    AppMethodBeat.i(31897);
    if (!bo.isNullOrNil(this.hID))
      this.appId = this.hID;
    if (bo.isNullOrNil(this.appId))
    {
      localObject = ((d)g.K(d.class)).zb(this.cgL.getTalkerUserName());
      if (localObject != null)
        break label97;
    }
    label97: for (Object localObject = null; ; localObject = ((WxaAttributes)localObject).field_appId)
    {
      this.appId = ((String)localObject);
      if (bo.isNullOrNil(this.appId))
        ab.e("MicroMsg.AppBrandServiceComponent", "error, appId is null");
      localObject = this.appId;
      AppMethodBeat.o(31897);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.a
 * JD-Core Version:    0.6.2
 */