package com.tencent.mm.ui.bizchat;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.MessageQueue.IdleHandler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.c;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.conversation.BaseConversationUI;
import com.tencent.mm.ui.g;
import com.tencent.mm.ui.p.a;
import com.tencent.mm.ui.v;

public class BizChatConversationUI extends BaseConversationUI
{
  private View contentView;

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(30099);
    super.onConfigurationChanged(paramConfiguration);
    f.a(this, this.contentView);
    AppMethodBeat.o(30099);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30098);
    super.onCreate(paramBundle);
    this.contentView = v.hu(this).inflate(2130968881, null);
    setContentView(this.contentView);
    this.conversationFm = new BizChatConversationUI.BizChatConversationFmUI();
    getSupportFragmentManager().beginTransaction().a(2131821892, this.conversationFm).commit();
    f.a(this, this.contentView);
    AppMethodBeat.o(30098);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI
 * JD-Core Version:    0.6.2
 */