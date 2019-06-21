package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import java.util.LinkedList;

public class DelChatroomMemberUI extends MMActivity
  implements f
{
  private String chatroomName;
  private u eih;
  private DelChatroomMemberUI.a eje;
  private LinkedList<String> ejf;
  private ListView mListView;
  private int scene;
  private p tipDialog;

  public DelChatroomMemberUI()
  {
    AppMethodBeat.i(104096);
    this.ejf = new LinkedList();
    AppMethodBeat.o(104096);
  }

  public final int getLayoutId()
  {
    return 2130969008;
  }

  public final void initView()
  {
    AppMethodBeat.i(104100);
    setMMTitle(2131302539);
    this.mListView = ((ListView)findViewById(2131822366));
    this.eje = new DelChatroomMemberUI.a(this);
    this.eje.P(this.ejf);
    this.mListView.setAdapter(this.eje);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(104083);
        DelChatroomMemberUI.this.finish();
        AppMethodBeat.o(104083);
        return true;
      }
    });
    AppMethodBeat.o(104100);
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(104097);
    super.onCreate(paramBundle);
    this.chatroomName = getIntent().getStringExtra("RoomInfo_Id");
    this.scene = getIntent().getIntExtra("scene", 0);
    String[] arrayOfString = getIntent().getStringExtra("members").split(",");
    int j = arrayOfString.length;
    while (i < j)
    {
      paramBundle = arrayOfString[i];
      this.ejf.add(paramBundle);
      i++;
    }
    this.eih = ((c)g.K(c.class)).XV().oa(this.chatroomName);
    initView();
    AppMethodBeat.o(104097);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104098);
    super.onDestroy();
    AppMethodBeat.o(104098);
  }

  public void onResume()
  {
    AppMethodBeat.i(104099);
    super.onResume();
    AppMethodBeat.o(104099);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(104101);
    ab.i("MicroMsg.DelChatroomMemberUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    AppMethodBeat.o(104101);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.DelChatroomMemberUI
 * JD-Core Version:    0.6.2
 */