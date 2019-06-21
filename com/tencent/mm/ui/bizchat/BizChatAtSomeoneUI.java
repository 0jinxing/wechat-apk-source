package com.tencent.mm.ui.bizchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.z;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BizChatAtSomeoneUI extends MMActivity
{
  private static boolean yDJ = false;
  private String elQ;
  private String elR;
  private o elS;
  private ListView gGW;
  private long jMj;
  private String mTitle;
  private String talker;
  private BizChatAtSomeoneUI.a yDH;
  private c yDI;

  private List<String> Ko()
  {
    AppMethodBeat.i(30042);
    Object localObject = new LinkedList();
    if (!ah.isNullOrNil(this.elQ))
      localObject = ah.j(this.elQ.split(";"));
    AppMethodBeat.o(30042);
    return localObject;
  }

  protected static String a(c paramc, String paramString)
  {
    AppMethodBeat.i(30043);
    if (paramc == null)
    {
      paramc = null;
      AppMethodBeat.o(30043);
    }
    while (true)
    {
      return paramc;
      paramc = paramc.mJ(paramString);
      AppMethodBeat.o(30043);
    }
  }

  private String[] dAJ()
  {
    AppMethodBeat.i(30041);
    String[] arrayOfString = null;
    if (!ah.isNullOrNil(this.elR))
    {
      arrayOfString = this.elR.split(";");
      ab.d("MicroMsg.AtSomeoneUI", "chatroom members name=[%s]", new Object[] { Arrays.toString(arrayOfString) });
    }
    AppMethodBeat.o(30041);
    return arrayOfString;
  }

  public final int getLayoutId()
  {
    return 2130968782;
  }

  public final void initView()
  {
    AppMethodBeat.i(30038);
    setMMTitle(this.mTitle);
    setBackBtn(new BizChatAtSomeoneUI.1(this));
    this.elS = new o((byte)0);
    this.elS.zHa = new BizChatAtSomeoneUI.2(this);
    a(this.elS);
    this.gGW = ((ListView)findViewById(2131821522));
    this.yDH = new BizChatAtSomeoneUI.a(this, new j(), this.yDI, dAJ(), Ko());
    this.gGW.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(30029);
        Intent localIntent = new Intent();
        if ((paramAnonymousInt == 0) && (BizChatAtSomeoneUI.yDJ))
        {
          localIntent.putExtra("Select_Conv_User", BizChatAtSomeoneUI.this.getString(2131297179, new Object[] { "" }));
          localIntent.putExtra("select_raw_user_name", "notify@all");
        }
        while (true)
        {
          BizChatAtSomeoneUI.this.setResult(-1, localIntent);
          BizChatAtSomeoneUI.this.finish();
          AppMethodBeat.o(30029);
          return;
          paramAnonymousAdapterView = (j)BizChatAtSomeoneUI.a(BizChatAtSomeoneUI.this).getItem(paramAnonymousInt);
          paramAnonymousView = BizChatAtSomeoneUI.a(BizChatAtSomeoneUI.b(BizChatAtSomeoneUI.this), paramAnonymousAdapterView.field_userId);
          localIntent.putExtra("select_raw_user_name", paramAnonymousAdapterView.field_userId);
          localIntent.putExtra("Select_Conv_User", paramAnonymousView);
        }
      }
    });
    this.gGW.setAdapter(this.yDH);
    this.gGW.setOnScrollListener(new BizChatAtSomeoneUI.4(this));
    AppMethodBeat.o(30038);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30037);
    super.onCreate(paramBundle);
    this.elQ = getIntent().getStringExtra("Block_list");
    this.elR = getIntent().getStringExtra("Chatroom_member_list");
    this.talker = getIntent().getStringExtra("Chat_User");
    this.mTitle = getIntent().getStringExtra("Add_address_titile");
    this.jMj = getIntent().getLongExtra("key_biz_chat_id", -1L);
    this.yDI = z.aeT().aK(this.jMj);
    if (this.yDI == null)
    {
      ab.w("MicroMsg.AtSomeoneUI", "bizChatInfo is null");
      finish();
      AppMethodBeat.o(30037);
    }
    while (true)
    {
      return;
      if ((this.yDI != null) && (this.yDI.field_ownerUserId.equals(r.Yz())))
        yDJ = true;
      initView();
      AppMethodBeat.o(30037);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30040);
    this.yDH.bIf();
    super.onDestroy();
    AppMethodBeat.o(30040);
  }

  public void onPause()
  {
    AppMethodBeat.i(30039);
    super.onPause();
    if (this.elS != null)
      this.elS.dJS();
    AppMethodBeat.o(30039);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI
 * JD-Core Version:    0.6.2
 */