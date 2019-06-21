package com.tencent.mm.plugin.bottle.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.l;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.p.a;
import com.tencent.mm.ui.tools.j;

public class BottleConversationUI extends MMActivity
{
  private TextView emptyTipTv;
  private boolean isDeleteCancel;
  private ListView jJY;
  private a jJZ;
  private n.d jKa;
  private String talker;
  private p tipDialog;

  public BottleConversationUI()
  {
    AppMethodBeat.i(18566);
    this.jKa = new BottleConversationUI.10(this);
    this.isDeleteCancel = false;
    this.tipDialog = null;
    AppMethodBeat.o(18566);
  }

  public final int getLayoutId()
  {
    return 2130970930;
  }

  public final void initView()
  {
    AppMethodBeat.i(18571);
    int i = r.YD();
    int j = r.YK();
    aw.ZK();
    c.Ry().set(7, Integer.valueOf(i | 0x1000));
    aw.ZK();
    c.Ry().set(34, Integer.valueOf(j & 0xFFFFFFBF));
    this.jJY = ((ListView)findViewById(2131823620));
    this.emptyTipTv = ((TextView)findViewById(2131821807));
    this.emptyTipTv.setText(2131297714);
    this.jJZ = new a(this, new p.a()
    {
      public final void apt()
      {
        AppMethodBeat.i(18553);
        BottleConversationUI localBottleConversationUI = BottleConversationUI.this;
        String str = BottleConversationUI.this.getString(2131297720);
        int i = l.Yv();
        if (i <= 0)
        {
          localBottleConversationUI.setMMTitle(str);
          if (BottleConversationUI.a(BottleConversationUI.this).getCount() > 0)
            break label112;
          BottleConversationUI.b(BottleConversationUI.this).setVisibility(0);
          BottleConversationUI.c(BottleConversationUI.this).setVisibility(8);
          AppMethodBeat.o(18553);
        }
        while (true)
        {
          return;
          localBottleConversationUI.setMMTitle(str + "(" + i + ")");
          break;
          label112: BottleConversationUI.b(BottleConversationUI.this).setVisibility(8);
          BottleConversationUI.c(BottleConversationUI.this).setVisibility(0);
          AppMethodBeat.o(18553);
        }
      }
    });
    this.jJZ.setGetViewPositionCallback(new MMSlideDelView.c()
    {
      public final int cZ(View paramAnonymousView)
      {
        AppMethodBeat.i(18558);
        int i = BottleConversationUI.c(BottleConversationUI.this).getPositionForView(paramAnonymousView);
        AppMethodBeat.o(18558);
        return i;
      }
    });
    this.jJZ.setPerformItemClickListener(new BottleConversationUI.4(this));
    this.jJZ.a(new BottleConversationUI.5(this));
    this.jJY.setAdapter(this.jJZ);
    j localj = new j(this);
    this.jJY.setOnItemLongClickListener(new BottleConversationUI.6(this, localj));
    this.jJY.setOnItemClickListener(new BottleConversationUI.7(this));
    com.tencent.mm.plugin.bottle.a.gkF.BS();
    setBackBtn(new BottleConversationUI.8(this));
    new BottleConversationUI.9(this);
    AppMethodBeat.o(18571);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18567);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(18567);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(18572);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.talker = ((ak)this.jJZ.getItem(paramView.position)).field_username;
    paramContextMenuInfo = this.jJZ;
    aw.ZK();
    paramContextMenu.setHeaderTitle(getString(2131297710, new Object[] { paramContextMenuInfo.E(c.XM().aoO(this.talker)) }));
    paramContextMenu.add(paramView.position, 0, 0, 2131297711);
    AppMethodBeat.o(18572);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(18568);
    this.jJZ.bIf();
    super.onDestroy();
    AppMethodBeat.o(18568);
  }

  public void onPause()
  {
    AppMethodBeat.i(18570);
    aw.ZK();
    c.XM().b(this.jJZ);
    aw.ZK();
    c.XR().b(this.jJZ);
    aw.ZK();
    Object localObject = c.XO().yw(8);
    if ((localObject != null) && (((cy)localObject).field_msgId > 0L))
    {
      ab.d("MicroMsg.Bottle.BottleConversationUI", "resetUnread: lastReadTime = " + ((cy)localObject).field_createTime);
      aw.ZK();
      c.Ry().set(12306, Long.valueOf(((cy)localObject).field_createTime));
    }
    aw.ZK();
    localObject = c.XR().aoZ("floatbottle");
    if ((localObject == null) || (bo.nullAsNil(((at)localObject).field_username).length() <= 0))
      ab.e("MicroMsg.Bottle.BottleConversationUI", "resetUnread: can not find bottle");
    while (true)
    {
      this.jJZ.onPause();
      super.onPause();
      AppMethodBeat.o(18570);
      return;
      ((ak)localObject).hM(0);
      aw.ZK();
      if (c.XR().a((ak)localObject, ((at)localObject).field_username) == -1)
        ab.e("MicroMsg.Bottle.BottleConversationUI", "reset bottle unread failed");
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(18569);
    super.onResume();
    aw.ZK();
    c.XM().a(this.jJZ);
    aw.ZK();
    c.XR().a(this.jJZ);
    this.jJZ.a(null, null);
    AppMethodBeat.o(18569);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI
 * JD-Core Version:    0.6.2
 */