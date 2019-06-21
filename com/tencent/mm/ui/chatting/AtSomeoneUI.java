package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AtSomeoneUI extends MMActivity
{
  private static boolean yDJ = false;
  private u eih;
  private String elQ;
  private String elR;
  private o elS;
  private ListView gGW;
  private String mTitle;
  private String talker;
  private AtSomeoneUI.a yGL;

  private List<String> Ko()
  {
    AppMethodBeat.i(30401);
    Object localObject = new LinkedList();
    if (!ah.isNullOrNil(this.elQ))
      localObject = ah.j(this.elQ.split(","));
    aw.ZK();
    bq localbq = c.XU().RA("@t.qq.com");
    if (localbq != null)
      ((List)localObject).add(localbq.name);
    AppMethodBeat.o(30401);
    return localObject;
  }

  protected static String a(u paramu, String paramString)
  {
    AppMethodBeat.i(30402);
    if (paramu == null)
    {
      paramu = null;
      AppMethodBeat.o(30402);
    }
    while (true)
    {
      return paramu;
      paramu = paramu.mJ(paramString);
      AppMethodBeat.o(30402);
    }
  }

  private String[] dAJ()
  {
    boolean bool = true;
    AppMethodBeat.i(30400);
    String[] arrayOfString1 = null;
    if (!ah.isNullOrNil(this.elR))
    {
      arrayOfString1 = this.elR.split(",");
      ab.d("MicroMsg.AtSomeoneUI", "chatroom members name=[%s]", new Object[] { Arrays.toString(arrayOfString1) });
    }
    String[] arrayOfString2 = arrayOfString1;
    if (arrayOfString1 == null)
    {
      arrayOfString2 = arrayOfString1;
      if (this.eih != null)
      {
        ab.w("MicroMsg.AtSomeoneUI", "[getChatroomMember] chatroomMemberList is null!");
        arrayOfString2 = ah.c(this.eih.afg(), ",").split(",");
      }
    }
    if (arrayOfString2 == null)
      if (this.eih != null)
        break label125;
    while (true)
    {
      ab.e("MicroMsg.AtSomeoneUI", "WTF! member is null? %s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(30400);
      return arrayOfString2;
      label125: bool = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130968782;
  }

  public final void initView()
  {
    AppMethodBeat.i(30397);
    setMMTitle(this.mTitle);
    setBackBtn(new AtSomeoneUI.1(this));
    this.elS = new o((byte)0);
    this.elS.zHa = new AtSomeoneUI.2(this);
    a(this.elS);
    this.gGW = ((ListView)findViewById(2131821522));
    this.yGL = new AtSomeoneUI.a(this, new ad(), this.eih, dAJ(), Ko());
    this.gGW.setOnItemClickListener(new AtSomeoneUI.3(this));
    this.gGW.setAdapter(this.yGL);
    AppMethodBeat.o(30397);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30396);
    super.onCreate(paramBundle);
    this.elQ = getIntent().getStringExtra("Block_list");
    this.elR = getIntent().getStringExtra("Chatroom_member_list");
    this.talker = getIntent().getStringExtra("Chat_User");
    this.mTitle = getIntent().getStringExtra("Add_address_titile");
    aw.ZK();
    this.eih = c.XV().oa(this.talker);
    if ((this.eih != null) && (this.eih.field_roomowner.equals(r.Yz())))
      yDJ = false;
    initView();
    AppMethodBeat.o(30396);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30399);
    this.yGL.bIf();
    super.onDestroy();
    AppMethodBeat.o(30399);
  }

  public void onPause()
  {
    AppMethodBeat.i(30398);
    super.onPause();
    if (this.elS != null)
      this.elS.dJS();
    AppMethodBeat.o(30398);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AtSomeoneUI
 * JD-Core Version:    0.6.2
 */