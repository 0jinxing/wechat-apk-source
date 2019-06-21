package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.jj;
import com.tencent.mm.g.a.l;
import com.tencent.mm.g.a.l.b;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.b;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.b.a;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.e;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.appbrand.c.4;
import com.tencent.mm.ui.chatting.c.b.o;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"ValidFragment"})
public class AppBrandServiceChattingUI$AppBrandServiceChattingFmUI extends ChattingUIFragment
{
  private String appId;
  private int fromScene;
  private String hIn;
  private String hIo;
  private String hIp;
  private boolean hIq;
  private String hIr;
  private boolean hIs;
  private WxaAttributes.b hhQ;
  private WxaExposedParams iIa;
  private String mSceneId;
  private com.tencent.mm.ui.chatting.c.c.b yGA;
  private final ChatFooter.e yGx;
  private com.tencent.mm.pluginsdk.ui.e.g yGy;
  private com.tencent.mm.ui.appbrand.c yGz;

  public AppBrandServiceChattingUI$AppBrandServiceChattingFmUI()
  {
    AppMethodBeat.i(30354);
    this.yGx = new ChatFooter.e()
    {
      public final boolean oS(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(30348);
        if (AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.a(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this) != null)
        {
          WxaAttributes.b.a locala = (WxaAttributes.b.a)AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.a(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this).hhZ.get(0);
          if ((AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.b(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this) == 2) && (AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.c(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this).username.equals(locala.userName)))
          {
            ab.i("MicroMsg.AppBrandServiceChattingUI", "[bizmenu]onBackFromContact username:%s path:%s", new Object[] { locala.userName, locala.csu });
            AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.a(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this, locala.csu);
            AppMethodBeat.o(30348);
            return true;
          }
          AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
          localAppBrandStatObject.scene = 1080;
          ((e)com.tencent.mm.kernel.g.K(e.class)).a(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this.getContext(), locala.userName, "", 0, locala.version, locala.csu, localAppBrandStatObject, AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.d(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this));
        }
        while (true)
        {
          AppMethodBeat.o(30348);
          break;
          ab.e("MicroMsg.AppBrandServiceChattingUI", "[mOnOpenMiniProgramBtnClickListener]wxaBizMenu or wxaBizMenu.ButtonList is empty, error");
        }
      }
    };
    this.yGy = new AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.2(this);
    this.yGA = new com.tencent.mm.ui.chatting.c.c.b(new com.tencent.mm.ui.chatting.c.c.a());
    AppMethodBeat.o(30354);
  }

  public AppBrandServiceChattingUI$AppBrandServiceChattingFmUI(byte paramByte)
  {
    super((byte)0);
    AppMethodBeat.i(30355);
    this.yGx = new ChatFooter.e()
    {
      public final boolean oS(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(30348);
        if (AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.a(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this) != null)
        {
          WxaAttributes.b.a locala = (WxaAttributes.b.a)AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.a(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this).hhZ.get(0);
          if ((AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.b(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this) == 2) && (AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.c(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this).username.equals(locala.userName)))
          {
            ab.i("MicroMsg.AppBrandServiceChattingUI", "[bizmenu]onBackFromContact username:%s path:%s", new Object[] { locala.userName, locala.csu });
            AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.a(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this, locala.csu);
            AppMethodBeat.o(30348);
            return true;
          }
          AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
          localAppBrandStatObject.scene = 1080;
          ((e)com.tencent.mm.kernel.g.K(e.class)).a(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this.getContext(), locala.userName, "", 0, locala.version, locala.csu, localAppBrandStatObject, AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.d(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.this));
        }
        while (true)
        {
          AppMethodBeat.o(30348);
          break;
          ab.e("MicroMsg.AppBrandServiceChattingUI", "[mOnOpenMiniProgramBtnClickListener]wxaBizMenu or wxaBizMenu.ButtonList is empty, error");
        }
      }
    };
    this.yGy = new AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.2(this);
    this.yGA = new com.tencent.mm.ui.chatting.c.c.b(new com.tencent.mm.ui.chatting.c.c.a());
    AppMethodBeat.o(30355);
  }

  private float Li(int paramInt)
  {
    AppMethodBeat.i(30363);
    float f = TypedValue.applyDimension(1, paramInt, getContext().getResources().getDisplayMetrics());
    AppMethodBeat.o(30363);
    return f;
  }

  private String getAppId()
  {
    AppMethodBeat.i(30359);
    if (bo.isNullOrNil(this.appId))
    {
      localObject = ((d)com.tencent.mm.kernel.g.K(d.class)).zb(this.cgL.getTalkerUserName());
      if (localObject != null)
        break label81;
    }
    label81: for (Object localObject = null; ; localObject = ((WxaAttributes)localObject).field_appId)
    {
      this.appId = ((String)localObject);
      if (bo.isNullOrNil(this.appId))
        ab.e("MicroMsg.AppBrandServiceChattingUI", "error, appId is null");
      localObject = this.appId;
      AppMethodBeat.o(30359);
      return localObject;
    }
  }

  public final void cch()
  {
    AppMethodBeat.i(30361);
    Object localObject;
    if (this.fromScene == 2)
    {
      aw.ZK();
      ak localak = com.tencent.mm.model.c.XR().aoZ("appbrandcustomerservicemsg");
      if ((localak != null) && (!bo.isNullOrNil(localak.field_username)))
      {
        int i = localak.field_unReadCount;
        localObject = new l();
        ((l)localObject).csj.csl = this.cgL.getTalkerUserName();
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        int j = ((l)localObject).csk.csm;
        ab.i("MicroMsg.AppBrandServiceChattingUI", "parUnReadCount:%d, unReadCount:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        localak.hM(Math.max(0, i - j));
        aw.ZK();
        if (com.tencent.mm.model.c.XR().a(localak, localak.field_username) == -1)
          ab.e("MicroMsg.AppBrandServiceChattingUI", "update SPUSER_APP_BRAND_SERVICE cvs unread failed");
      }
    }
    while (true)
    {
      super.cch();
      AppMethodBeat.o(30361);
      return;
      localObject = new com.tencent.mm.g.a.p();
      ((com.tencent.mm.g.a.p)localObject).csz.csl = this.cgL.getTalkerUserName();
      ((com.tencent.mm.g.a.p)localObject).csz.csm = 0;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      continue;
      ab.e("MicroMsg.AppBrandServiceChattingUI", "update Unread: can not find SPUSER_APP_BRAND_SERVICE cvs");
      continue;
      ab.i("MicroMsg.AppBrandServiceChattingUI", "writeOpLogAndMarkRead clear AppBrandKvData username:%s", new Object[] { this.cgL.getTalkerUserName() });
      localObject = new com.tencent.mm.g.a.p();
      ((com.tencent.mm.g.a.p)localObject).csz.csl = this.cgL.getTalkerUserName();
      ((com.tencent.mm.g.a.p)localObject).csz.csm = 0;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
  }

  public final void dBq()
  {
    AppMethodBeat.i(30356);
    if (!this.cgL.yTu.yYL.containsKey(com.tencent.mm.ui.chatting.c.b.a.class))
      this.cgL.a(com.tencent.mm.ui.chatting.c.b.a.class, this.yGA);
    super.dBq();
    this.fromScene = getIntExtra("app_brand_chatting_from_scene", 1);
    this.iIa = ((WxaExposedParams)getParcelableExtra("app_brand_chatting_expose_params"));
    this.mSceneId = bo.nullAsNil(getStringExtra("key_scene_id"));
    this.hIn = getStringExtra("sendMessageTitle");
    this.hIo = getStringExtra("sendMessagePath");
    this.hIp = getStringExtra("sendMessageImg");
    this.hIr = getStringExtra("sendMessageLocalImg");
    this.hIq = getBooleanExtra("showMessageCard", false).booleanValue();
    this.hIs = getBooleanExtra("needDelThumb", false).booleanValue();
    ab.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate fromScene:%d", new Object[] { Integer.valueOf(this.fromScene) });
    ab.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate wxaExposedParams:%s", new Object[] { this.iIa });
    ab.i("MicroMsg.AppBrandServiceChattingUI", "mSceneId:%s, sendMessageTitle:%s, sendMessagePath:%s, sendMessageImg:%s, showMessageCard:%b, needDelThumb:%b", new Object[] { this.mSceneId, this.hIn, this.hIo, this.hIp, Boolean.valueOf(this.hIq), Boolean.valueOf(this.hIs) });
    AppMethodBeat.o(30356);
  }

  public final void dBr()
  {
    AppMethodBeat.i(30357);
    super.dBr();
    j.a(this.yGy);
    AppMethodBeat.o(30357);
  }

  protected final void dBs()
  {
    AppMethodBeat.i(30360);
    super.dBs();
    jj localjj = new jj();
    localjj.cEF.cEA = 0;
    localjj.cEF.aOt = aa.dor();
    if (t.kH(this.cgL.getTalkerUserName()));
    for (localjj.cEF.cEH = true; ; localjj.cEF.cEH = false)
    {
      com.tencent.mm.sdk.b.a.xxA.m(localjj);
      AppMethodBeat.o(30360);
      return;
    }
  }

  public final void dBt()
  {
    AppMethodBeat.i(30364);
    super.dBt();
    j.b(this.yGy);
    AppMethodBeat.o(30364);
  }

  public final void onEnterBegin()
  {
    AppMethodBeat.i(30358);
    super.onEnterBegin();
    Object localObject1 = this.cgL.getTalkerUserName();
    label87: int i;
    Object localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject1 = null;
      this.hhQ = ((WxaAttributes.b)localObject1);
      if ((this.hhQ == null) || (this.hhQ.hhZ.size() != 1))
        break label252;
      localObject1 = ((o)this.cgL.aF(o.class)).dDX();
      ((ChatFooter)localObject1).setSwitchButtonMode(1);
      ((ChatFooter)localObject1).setOnFooterSwitchListener(this.yGx);
      if (this.fromScene == 2)
      {
        localObject1 = new com.tencent.mm.modelsimple.g(this.cgL.getTalkerUserName(), 19, getStringExtra("key_temp_session_from"));
        aw.Rg().a((m)localObject1, 0);
        localObject1 = getAppId();
        String str = this.cgL.getTalkerUserName();
        i = this.fromScene;
        aw.ZK();
        localObject2 = com.tencent.mm.model.c.XR().aoZ(str);
        if (localObject2 != null)
          break label315;
        ab.e("MicroMsg.AppBrandServiceChattingUI", "cvs:%s is null, error", new Object[] { str });
      }
    }
    while (true)
    {
      ab.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onActivityCreated NetSceneEnterTempSession");
      AppMethodBeat.o(30358);
      return;
      localObject2 = ((d)com.tencent.mm.kernel.g.K(d.class)).zb((String)localObject1);
      if (localObject2 != null)
      {
        localObject1 = ((WxaAttributes)localObject2).ayN();
        break;
      }
      ab.e("MicroMsg.AppBrandServiceHelper", "username:%s, attr is null or getWxaBizMenuByUsername return null", new Object[] { localObject1 });
      localObject1 = null;
      break;
      label252: if ((this.hhQ != null) && (this.hhQ.hhZ != null))
      {
        ab.e("MicroMsg.AppBrandServiceChattingUI", "wxaBizMenu.buttonList.size():%d", new Object[] { Integer.valueOf(this.hhQ.hhZ.size()) });
        break label87;
      }
      ab.e("MicroMsg.AppBrandServiceChattingUI", "wxaBizMenu or wxaBizMenu.buttonList is empty");
      break label87;
      label315: int j = ((at)localObject2).field_unReadCount;
      localObject2 = bo.nullAsNil(this.mSceneId);
      ab.d("MicroMsg.AppBrandServiceChattingUI", "stev report(%s), appId : %s, scene %s, unReadCount %d, sceneId %s", new Object[] { Integer.valueOf(13799), localObject1, Integer.valueOf(i), Integer.valueOf(j), localObject2 });
      h.pYm.e(13799, new Object[] { localObject1, Integer.valueOf(i), Integer.valueOf(j), localObject2, Long.valueOf(bo.anT()) });
    }
  }

  public void onViewAttachedToWindow(View paramView)
  {
    AppMethodBeat.i(30362);
    super.onViewAttachedToWindow(paramView);
    boolean bool;
    if ((this.fromScene == 2) && (this.hIq))
    {
      if (this.yGz == null)
      {
        paramView = ((o)this.cgL.aF(o.class)).dDX();
        FragmentActivity localFragmentActivity = getActivity();
        View localView = paramView.getRootView();
        if (bo.isNullOrNil(paramView.getLastText()))
          break label219;
        bool = true;
        this.yGz = new com.tencent.mm.ui.appbrand.c(localFragmentActivity, localView, paramView, bool);
        this.yGz.vou = false;
      }
      if (bo.isNullOrNil(this.hIr))
        break label225;
      com.tencent.mm.modelappbrand.a.b.abR().a(this.yGz, "file://" + this.hIr, null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq((int)Li(75), (int)Li(60)));
    }
    while (true)
    {
      this.yGz.yrt = new AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.4(this);
      paramView = this.yGz;
      ab.d("MicroMsg.AppBrandServiceImageBubble", "show");
      aw.RS().aa(new c.4(paramView));
      AppMethodBeat.o(30362);
      return;
      label219: bool = false;
      break;
      label225: com.tencent.mm.modelappbrand.a.b.abR().a(this.yGz, this.hIp, null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq((int)Li(75), (int)Li(60)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI
 * JD-Core Version:    0.6.2
 */