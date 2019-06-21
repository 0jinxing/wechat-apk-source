package com.tencent.mm.plugin.qmessage.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.aju;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public class QConversationUI extends MMActivity
  implements f
{
  private TextView emptyTipTv;
  private boolean isDeleteCancel;
  private n.d jKa;
  private ad ldh;
  private boolean ooX;
  private ListView ptc;
  private c ptd;
  private com.tencent.mm.plugin.qmessage.a.c pte;
  private boolean ptf;
  private String ptg;
  private String pth;
  private boolean pti;
  private String ptj;

  public QConversationUI()
  {
    AppMethodBeat.i(24140);
    this.ooX = false;
    this.ptf = false;
    this.pti = false;
    this.isDeleteCancel = false;
    this.jKa = new QConversationUI.5(this);
    AppMethodBeat.o(24140);
  }

  private static String aO(Context paramContext, String paramString)
  {
    AppMethodBeat.i(24147);
    paramContext = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageInfo(paramString, 0);
      paramString = new android/content/Intent;
      paramString.<init>("android.intent.action.MAIN", null);
      paramString.addCategory("android.intent.category.LAUNCHER");
      paramString.setPackage(localPackageInfo.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(paramString, 0).iterator().next();
      if (paramContext != null)
      {
        paramContext = paramContext.activityInfo.name;
        AppMethodBeat.o(24147);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.QConversationUI", paramContext, "", new Object[0]);
        paramContext = null;
      }
    }
  }

  private static void cch()
  {
    AppMethodBeat.i(24144);
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.XO().yw(2);
    if ((localObject != null) && (((cy)localObject).field_msgId > 0L))
    {
      ab.d("MicroMsg.QConversationUI", "resetUnread: lastReadTime = " + ((cy)localObject).field_createTime);
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(12295, Long.valueOf(((cy)localObject).field_createTime));
    }
    aw.ZK();
    localObject = com.tencent.mm.model.c.XR().aoZ("qmessage");
    if ((localObject == null) || (bo.nullAsNil(((at)localObject).field_username).length() <= 0))
    {
      ab.e("MicroMsg.QConversationUI", "resetUnread: can not find QMessage");
      AppMethodBeat.o(24144);
    }
    while (true)
    {
      return;
      ((ak)localObject).hM(0);
      aw.ZK();
      if (com.tencent.mm.model.c.XR().a((ak)localObject, ((at)localObject).field_username) == -1)
        ab.e("MicroMsg.QConversationUI", "reset qmessage unread failed");
      AppMethodBeat.o(24144);
    }
  }

  private void cci()
  {
    AppMethodBeat.i(24148);
    if (bo.isNullOrNil(this.ptg))
      AppMethodBeat.o(24148);
    while (true)
    {
      return;
      this.ptf = true;
      addIconOptionMenu(0, 2131296391, 2131231835, new QConversationUI.13(this));
      AppMethodBeat.o(24148);
    }
  }

  private void ccj()
  {
    AppMethodBeat.i(24149);
    this.mController.removeAllOptionMenu();
    cci();
    addIconOptionMenu(2, 2131296394, 2131230758, new QConversationUI.2(this));
    AppMethodBeat.o(24149);
  }

  private void cck()
  {
    AppMethodBeat.i(24150);
    aw.ZK();
    this.ptg = ((String)com.tencent.mm.model.c.Ry().get(77, ""));
    aw.ZK();
    this.pth = ((String)com.tencent.mm.model.c.Ry().get(78, ""));
    ccl();
    AppMethodBeat.o(24150);
  }

  private void ccl()
  {
    AppMethodBeat.i(24151);
    if (this.pte == null)
    {
      this.pte = new com.tencent.mm.plugin.qmessage.a.c();
      aw.Rg().a(this.pte.getType(), this);
    }
    aw.Rg().a(this.pte, 0);
    AppMethodBeat.o(24151);
  }

  private static void ccm()
  {
    AppMethodBeat.i(24152);
    com.tencent.mm.plugin.qmessage.a.psH.gk(1010);
    AppMethodBeat.o(24152);
  }

  private void goBack()
  {
    AppMethodBeat.i(24154);
    if (this.ooX)
    {
      finish();
      AppMethodBeat.o(24154);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      com.tencent.mm.plugin.qmessage.a.gkE.p(localIntent, this);
      overridePendingTransition(2131034130, 2131034221);
      AppMethodBeat.o(24154);
    }
  }

  public final int getLayoutId()
  {
    return 2130970930;
  }

  public final void initView()
  {
    boolean bool1 = false;
    AppMethodBeat.i(24146);
    this.ooX = getIntent().getBooleanExtra("finish_direct", false);
    ab.d("MicroMsg.QConversationUI", "isFromSearch  " + this.ooX);
    aw.ZK();
    this.ldh = com.tencent.mm.model.c.XM().aoO("qmessage");
    boolean bool2 = bool1;
    if (this.ldh != null)
    {
      bool2 = bool1;
      if ((int)this.ldh.ewQ > 0)
        bool2 = true;
    }
    Assert.assertTrue("can not find qmessage", bool2);
    this.ptc = ((ListView)findViewById(2131823620));
    this.emptyTipTv = ((TextView)findViewById(2131821807));
    this.emptyTipTv.setText(2131299204);
    this.ptd = new c(this, new QConversationUI.1(this));
    this.ptd.setGetViewPositionCallback(new QConversationUI.6(this));
    this.ptd.setPerformItemClickListener(new QConversationUI.7(this));
    this.ptd.a(new QConversationUI.8(this));
    this.ptc.setAdapter(this.ptd);
    this.ptc.setOnItemClickListener(new QConversationUI.9(this));
    com.tencent.mm.ui.widget.b.a locala = new com.tencent.mm.ui.widget.b.a(this);
    this.ptc.setOnItemLongClickListener(new QConversationUI.10(this, locala));
    com.tencent.mm.plugin.qmessage.a.psH.gk(1010);
    setBackBtn(new QConversationUI.11(this));
    new QConversationUI.12(this);
    cck();
    ccj();
    ccm();
    AppMethodBeat.o(24146);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24141);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(24141);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(24155);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramView = (ak)this.ptd.getItem(paramView.position);
    aw.ZK();
    paramContextMenu.setHeaderTitle(com.tencent.mm.model.c.XM().aoO(paramView.field_username).Oj());
    paramContextMenu.add(0, 0, 0, 2131301288);
    this.ptj = paramView.field_username;
    AppMethodBeat.o(24155);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24142);
    this.ptd.bIf();
    if (this.pte != null)
    {
      aw.Rg().c(this.pte);
      aw.Rg().b(this.pte.getType(), this);
      this.pte = null;
    }
    super.onDestroy();
    AppMethodBeat.o(24142);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(24153);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(24153);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(24153);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(24145);
    ab.v("MicroMsg.QConversationUI", "on pause");
    aw.ZK();
    com.tencent.mm.model.c.XR().b(this.ptd);
    cch();
    this.ptd.onPause();
    super.onPause();
    AppMethodBeat.o(24145);
  }

  public void onResume()
  {
    AppMethodBeat.i(24143);
    super.onResume();
    cch();
    aw.ZK();
    com.tencent.mm.model.c.XR().a(this.ptd);
    this.ptd.a(null, null);
    AppMethodBeat.o(24143);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    Object localObject1 = null;
    AppMethodBeat.i(24156);
    ab.d("MicroMsg.QConversationUI", "on scene end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramm.getType())
    {
    default:
    case 630:
    }
    do
    {
      AppMethodBeat.o(24156);
      return;
    }
    while ((paramInt1 != 0) || (paramInt2 != 0));
    Object localObject2 = (com.tencent.mm.plugin.qmessage.a.c)paramm;
    if (((com.tencent.mm.plugin.qmessage.a.c)localObject2).fSY != null)
    {
      paramString = (aju)((com.tencent.mm.plugin.qmessage.a.c)localObject2).fSY.fsH.fsP;
      if (paramString == null);
    }
    for (paramString = paramString.wpt; ; paramString = null)
    {
      if (((com.tencent.mm.plugin.qmessage.a.c)localObject2).fSY != null)
      {
        paramm = (aju)((com.tencent.mm.plugin.qmessage.a.c)localObject2).fSY.fsH.fsP;
        if (paramm == null);
      }
      for (paramm = paramm.vMJ; ; paramm = null)
      {
        Object localObject3 = localObject1;
        if (((com.tencent.mm.plugin.qmessage.a.c)localObject2).fSY != null)
        {
          localObject2 = (aju)((com.tencent.mm.plugin.qmessage.a.c)localObject2).fSY.fsH.fsP;
          localObject3 = localObject1;
          if (localObject2 != null)
            localObject3 = ((aju)localObject2).wpu;
        }
        if (!bo.isNullOrNil((String)localObject3))
        {
          this.ptg = ((String)localObject3);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(77, localObject3);
        }
        this.pth = paramm;
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(78, paramm);
        if (!this.ptf)
          ccj();
        ab.d("MicroMsg.QConversationUI", "diaplayName: %s, url: %s, qqScheme: %s", new Object[] { paramString, paramm, localObject3 });
        break;
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI
 * JD-Core Version:    0.6.2
 */