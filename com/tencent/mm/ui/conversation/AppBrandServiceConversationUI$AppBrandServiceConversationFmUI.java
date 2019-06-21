package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.o;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.vo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.tools.j;
import java.math.BigInteger;
import java.util.List;

@Keep
public class AppBrandServiceConversationUI$AppBrandServiceConversationFmUI extends BaseConversationUI.BaseConversationFmUI
  implements n.d
{
  private static final int CONTEXT_MENU_LONGCLICK_ACCEPT_MSG = 1;
  private static final int CONTEXT_MENU_LONGCLICK_DELETE = 3;
  private static final int CONTEXT_MENU_LONGCLICK_REFUSE_MSG = 2;
  private static final String TAG = "MicroMsg.AppBrandServiceConversationFmUI";
  private e adapter;
  private com.tencent.mm.ui.appbrand.a appBrandServiceActionSheet;
  private ListView appbrandMessageLV;
  private j contextMenuHelper;
  private ak conversation;
  private TextView emptyTipTv;
  private int fromScene;
  private boolean isDeleteCancel = false;
  private String mAppId;
  private String mSceneId;
  private String superUsername;
  private String talker = "";
  private p tipDialog = null;

  private void asyncDelMsg(String paramString)
  {
    AppMethodBeat.i(34018);
    ab.i("MicroMsg.AppBrandServiceConversationFmUI", "async del msg talker:%s", new Object[] { paramString });
    aw.ZK();
    Object localObject = c.XO().Ra(paramString);
    vo localvo = new vo();
    localvo.wcB = new bts().alV(bo.nullAsNil(paramString));
    localvo.ptF = ((cy)localObject).field_msgSvrId;
    aw.ZK();
    c.XL().c(new j.a(8, localvo));
    this.isDeleteCancel = false;
    localObject = thisActivity();
    getString(2131297061);
    localObject = com.tencent.mm.ui.base.h.b((Context)localObject, getString(2131297086), true, new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.3(this));
    customerMsgOperateReport(5);
    bf.a(paramString, new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.4(this, (ProgressDialog)localObject));
    AppMethodBeat.o(34018);
  }

  private void batchSyncForWxaContact()
  {
    AppMethodBeat.i(34009);
    if ((this.adapter == null) || (this.adapter.getCount() == 0))
      AppMethodBeat.o(34009);
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandServiceConversationFmUI", "batchSyncForWxaContact, size:%d", new Object[] { Integer.valueOf(this.adapter.getCount()) });
      if ((this.adapter instanceof AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.a))
      {
        List localList = ((AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.a)this.adapter).ewK;
        if ((localList != null) && (localList.size() > 0))
          ((d)g.K(d.class)).aE(localList);
      }
      AppMethodBeat.o(34009);
    }
  }

  private void cleadAllServiceAppBrandUnreadCount()
  {
    AppMethodBeat.i(34005);
    o localo = new o();
    com.tencent.mm.sdk.b.a.xxA.m(localo);
    AppMethodBeat.o(34005);
  }

  private void delConversationAndMsg(String paramString)
  {
    AppMethodBeat.i(34017);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppBrandServiceConversationFmUI", "Delete Conversation and messages fail because username is null or nil.");
      AppMethodBeat.o(34017);
    }
    while (true)
    {
      return;
      asyncDelMsg(paramString);
      aw.ZK();
      c.XR().aoX(paramString);
      AppMethodBeat.o(34017);
    }
  }

  private void enterConversationReport()
  {
    AppMethodBeat.i(34011);
    if (this.adapter == null)
    {
      ab.d("MicroMsg.AppBrandServiceConversationFmUI", "adapter is null!");
      AppMethodBeat.o(34011);
      return;
    }
    aw.ZK();
    Object localObject1 = c.XR().aoZ("appbrandcustomerservicemsg");
    if ((localObject1 != null) && (!bo.isNullOrNil(((at)localObject1).field_username)));
    for (int i = ((at)localObject1).field_unReadCount; ; i = 0)
    {
      localObject1 = (ak)this.adapter.getItem(0);
      Object localObject2;
      if ((localObject1 != null) && (!bo.isNullOrNil(((at)localObject1).field_username)))
      {
        localObject2 = bo.nullAsNil(((at)localObject1).field_content);
        localObject1 = ((d)g.K(d.class)).zb(((at)localObject1).field_username);
        if (localObject1 == null)
        {
          localObject1 = null;
          label121: this.mAppId = ((String)localObject1);
        }
      }
      for (localObject1 = localObject2; ; localObject1 = "")
      {
        int k;
        label147: int n;
        if (i > 0)
        {
          int j = this.adapter.getCount();
          k = 0;
          int m = 0;
          n = m;
          if (k >= j)
            break label207;
          localObject2 = (ak)this.adapter.getItem(k);
          n = ((at)localObject2).field_unReadCount;
          if (((at)localObject2).field_unReadMuteCount + n <= 0)
            break label335;
          m++;
        }
        label335: 
        while (true)
        {
          k++;
          break label147;
          localObject1 = ((WxaAttributes)localObject1).field_appId;
          break label121;
          n = 0;
          label207: ab.d("MicroMsg.AppBrandServiceConversationFmUI", "stev report(%s), sceneId : %s, unReadCount %d, unReadAppCount %d, lastPushAppId %s, lastPushMsg %s", new Object[] { Integer.valueOf(13797), this.mSceneId, Integer.valueOf(i), Integer.valueOf(n), this.mAppId, localObject1 });
          com.tencent.mm.plugin.report.service.h.pYm.e(13797, new Object[] { this.mSceneId, Integer.valueOf(i), Integer.valueOf(n), this.mAppId, Long.valueOf(bo.anT()), Integer.valueOf(0), localObject1 });
          AppMethodBeat.o(34011);
          break;
        }
      }
    }
  }

  private String intToString(int paramInt)
  {
    AppMethodBeat.i(34010);
    String str = new BigInteger(Integer.toBinaryString(paramInt), 2).toString();
    AppMethodBeat.o(34010);
    return str;
  }

  private void setShowView(int paramInt)
  {
    AppMethodBeat.i(34016);
    if (paramInt <= 0)
    {
      this.emptyTipTv.setVisibility(0);
      this.appbrandMessageLV.setVisibility(8);
      AppMethodBeat.o(34016);
    }
    while (true)
    {
      return;
      this.emptyTipTv.setVisibility(8);
      this.appbrandMessageLV.setVisibility(0);
      AppMethodBeat.o(34016);
    }
  }

  public void customerMsgOperateReport(int paramInt)
  {
    AppMethodBeat.i(34012);
    ab.d("MicroMsg.AppBrandServiceConversationFmUI", "stev report(%s), eventId : %s, appId %s, sceneId %s", new Object[] { Integer.valueOf(13798), Integer.valueOf(paramInt), this.mAppId, this.mSceneId });
    com.tencent.mm.plugin.report.service.h.pYm.e(13798, new Object[] { Integer.valueOf(paramInt), this.mAppId, Integer.valueOf(0), this.mSceneId, Long.valueOf(bo.anT()) });
    AppMethodBeat.o(34012);
  }

  public void entryCustomerMsgDialogReport(String paramString, int paramInt)
  {
    AppMethodBeat.i(34013);
    aw.ZK();
    ak localak = c.XR().aoZ(paramString);
    if (localak == null)
    {
      ab.e("MicroMsg.AppBrandServiceConversationFmUI", "cvs:%s is null, error", new Object[] { paramString });
      AppMethodBeat.o(34013);
    }
    while (true)
    {
      return;
      int i = localak.field_unReadCount;
      paramString = bo.nullAsNil(this.mSceneId);
      ab.d("MicroMsg.AppBrandServiceConversationFmUI", "stev report(%s), appId : %s, scene %s, unReadCount %d, sceneId %s", new Object[] { Integer.valueOf(13799), this.mAppId, Integer.valueOf(paramInt), Integer.valueOf(i), paramString });
      com.tencent.mm.plugin.report.service.h.pYm.e(13799, new Object[] { this.mAppId, Integer.valueOf(paramInt), Integer.valueOf(i), paramString, Long.valueOf(bo.anT()) });
      AppMethodBeat.o(34013);
    }
  }

  public int getLayoutId()
  {
    return 2130970930;
  }

  public String getUserName()
  {
    return this.superUsername;
  }

  protected void initView()
  {
    AppMethodBeat.i(34014);
    setMMTitle(getString(2131296586));
    this.appbrandMessageLV = ((ListView)findViewById(2131823620));
    this.emptyTipTv = ((TextView)findViewById(2131821807));
    this.emptyTipTv.setText(2131296610);
    setBackBtn(new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.5(this));
    this.appBrandServiceActionSheet = new com.tencent.mm.ui.appbrand.a(thisActivity());
    this.adapter = new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.a(thisActivity(), this.superUsername, new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.6(this));
    this.adapter.setGetViewPositionCallback(new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.7(this));
    this.adapter.setPerformItemClickListener(new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.8(this));
    this.appbrandMessageLV.setAdapter(this.adapter);
    this.contextMenuHelper = new j(thisActivity());
    this.appbrandMessageLV.setOnItemClickListener(new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.9(this));
    this.appbrandMessageLV.setOnItemLongClickListener(new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.10(this));
    this.adapter.setGetViewPositionCallback(new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.11(this));
    this.adapter.setPerformItemClickListener(new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.12(this));
    this.adapter.a(new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.2(this));
    AppMethodBeat.o(34014);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(34004);
    ab.i("MicroMsg.AppBrandServiceConversationFmUI", "onActivityCreated");
    super.onActivityCreated(paramBundle);
    this.superUsername = getStringExtra("Contact_User");
    if (TextUtils.isEmpty(this.superUsername))
      this.superUsername = "appbrandcustomerservicemsg";
    this.fromScene = getIntExtra("app_brand_conversation_from_scene", 1);
    ab.i("MicroMsg.AppBrandServiceConversationFmUI", "fromScene:%d", new Object[] { Integer.valueOf(this.fromScene) });
    aw.ZK();
    paramBundle = intToString(c.QF());
    this.mSceneId = (System.currentTimeMillis() + paramBundle);
    initView();
    addIconOptionMenu(1, 2131230874, new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.1(this));
    aw.ZK();
    c.XR().a(this.adapter);
    cleadAllServiceAppBrandUnreadCount();
    enterConversationReport();
    batchSyncForWxaContact();
    AppMethodBeat.o(34004);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(34015);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((this.talker != null) && (!this.talker.isEmpty()))
      this.talker = "";
    if (paramInt2 != -1)
      AppMethodBeat.o(34015);
    while (true)
    {
      return;
      AppMethodBeat.o(34015);
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(34020);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramView = ((d)g.K(d.class)).zb(this.talker);
    int i;
    if ((paramView != null) && ((paramView.field_appOpt & 0x2) > 0))
    {
      i = 1;
      if (i == 0)
        break label102;
      paramContextMenu.add(paramContextMenuInfo.position, 1, 0, 2131296715);
    }
    while (true)
    {
      paramContextMenu.add(paramContextMenuInfo.position, 3, 0, 2131298868);
      AppMethodBeat.o(34020);
      return;
      i = 0;
      break;
      label102: paramContextMenu.add(paramContextMenuInfo.position, 2, 0, 2131296716);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34006);
    if (aw.RK())
    {
      aw.ZK();
      c.XR().b(this.adapter);
    }
    batchSyncForWxaContact();
    if (this.adapter != null)
      this.adapter.onDestroy();
    super.onDestroy();
    AppMethodBeat.o(34006);
  }

  public void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(34019);
    aw.ZK();
    ad localad = c.XM().aoO(this.talker);
    if ((localad == null) || ((int)localad.ewQ == 0))
    {
      ab.e("MicroMsg.AppBrandServiceConversationFmUI", "changed biz stick status failed, contact is null, talker = " + this.talker);
      AppMethodBeat.o(34019);
      return;
    }
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(34019);
      break;
      this.appBrandServiceActionSheet.username = this.talker;
      this.appBrandServiceActionSheet.scene = this.fromScene;
      this.appBrandServiceActionSheet.yrk = this.mSceneId;
      this.appBrandServiceActionSheet.jnK = true;
      this.appBrandServiceActionSheet.show(3);
      AppMethodBeat.o(34019);
      break;
      this.appBrandServiceActionSheet.username = this.talker;
      this.appBrandServiceActionSheet.scene = this.fromScene;
      this.appBrandServiceActionSheet.yrk = this.mSceneId;
      this.appBrandServiceActionSheet.jnK = true;
      this.appBrandServiceActionSheet.show(4);
      AppMethodBeat.o(34019);
      break;
      delConversationAndMsg(this.talker);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(34008);
    ab.i("MicroMsg.AppBrandServiceConversationFmUI", "on pause");
    aw.ZK();
    c.XR().apb(this.superUsername);
    if (this.adapter != null)
      this.adapter.onPause();
    super.onPause();
    AppMethodBeat.o(34008);
  }

  public void onResume()
  {
    AppMethodBeat.i(34007);
    ab.i("MicroMsg.AppBrandServiceConversationFmUI", "on resume");
    if (this.adapter != null)
      this.adapter.onResume();
    super.onResume();
    AppMethodBeat.o(34007);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI
 * JD-Core Version:    0.6.2
 */