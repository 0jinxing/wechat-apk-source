package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.h.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.widget.MMEditText;

public class RoomCardUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private String ejD;
  private String ejR;
  private int ejS;
  private String ejT;
  private boolean ejU;
  private boolean ejV;
  private String ejW;
  private String ejX;
  private long ejY;
  private com.tencent.mm.ui.base.p ejZ;
  private TextView eka;
  private MMEditText ekb;
  private TextView ekc;
  private TextView ekd;
  private ImageView eke;
  private LinearLayout ekf;
  private LinearLayout ekg;
  private LinearLayout ekh;
  private LinearLayout eki;
  private j.b ekj;
  private c ekk;
  private boolean ekl;

  public RoomCardUI()
  {
    AppMethodBeat.i(104158);
    this.ekk = new RoomCardUI.3(this);
    this.ekl = false;
    AppMethodBeat.o(104158);
  }

  private boolean JY()
  {
    boolean bool = false;
    AppMethodBeat.i(104163);
    String str = this.ekb.getText().toString();
    if (bo.isNullOrNil(str))
      if (bo.isNullOrNil(this.ejW))
        AppMethodBeat.o(104163);
    while (true)
    {
      return bool;
      AppMethodBeat.o(104163);
      bool = true;
      continue;
      if ((this.ejW == null) || (!this.ejW.equals(str)))
      {
        AppMethodBeat.o(104163);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(104163);
      }
    }
  }

  private void JZ()
  {
    AppMethodBeat.i(104164);
    if (JY())
    {
      enableOptionMenu(true);
      AppMethodBeat.o(104164);
    }
    while (true)
    {
      return;
      enableOptionMenu(false);
      AppMethodBeat.o(104164);
    }
  }

  private void Ka()
  {
    AppMethodBeat.i(104169);
    Intent localIntent = new Intent();
    localIntent.putExtra("room_name", this.ejR);
    localIntent.putExtra("room_notice", this.ejW);
    setResult(-1, localIntent);
    finish();
    AppMethodBeat.o(104169);
  }

  private void d(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(104168);
    if ((this.ejZ != null) && (this.ejZ.isShowing()))
      this.ejZ.dismiss();
    if ((this.ejZ != null) && (this.ejZ.isShowing()))
      this.ejZ.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.RoomInfoUI", "dz[onSceneEnd : set announcement successfully!]");
      this.ejW = this.ekb.getText().toString();
      com.tencent.mm.plugin.report.service.h.pYm.a(219L, 15L, 1L, true);
      Ka();
      AppMethodBeat.o(104168);
    }
    while (true)
    {
      return;
      kj(paramString);
      ab.i("MicroMsg.RoomInfoUI", "dz[onSceneEnd : set announcement failed:%d %d %s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AppMethodBeat.o(104168);
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(104162);
    if ((!this.ejU) && (!this.ejV))
    {
      setResult(0);
      finish();
      AppMethodBeat.o(104162);
    }
    while (true)
    {
      return;
      if (JY())
      {
        com.tencent.mm.ui.base.h.d(this, getString(2131302509), null, getString(2131302511), getString(2131302510), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        }
        , new RoomCardUI.10(this));
        AppMethodBeat.o(104162);
      }
      else
      {
        setResult(0);
        finish();
        AppMethodBeat.o(104162);
      }
    }
  }

  private void kj(String paramString)
  {
    AppMethodBeat.i(104170);
    ab.w("MicroMsg.RoomInfoUI", "dz[handleSetNoticeFailed:%s]", new Object[] { paramString });
    paramString = a.jY(paramString);
    if (paramString != null)
      paramString.a(this, new RoomCardUI.4(this));
    AppMethodBeat.o(104170);
  }

  public final int getLayoutId()
  {
    return 2130970528;
  }

  public final void initView()
  {
    AppMethodBeat.i(104159);
    setMMTitle(2131302590);
    a(0, getString(2131296894), new RoomCardUI.1(this), q.b.ymu);
    enableOptionMenu(true);
    this.ekh = ((LinearLayout)findViewById(2131827147));
    this.eki = ((LinearLayout)findViewById(2131827153));
    this.ekb = ((MMEditText)findViewById(2131827151));
    this.ekc = ((TextView)findViewById(2131827150));
    this.ekd = ((TextView)findViewById(2131827149));
    this.ekf = ((LinearLayout)findViewById(2131827154));
    this.eke = ((ImageView)findViewById(2131827148));
    this.ekg = ((LinearLayout)findViewById(2131827156));
    this.ekb.setText(this.ejW);
    Object localObject = (WindowManager)getSystemService("window");
    this.ekb.setMinHeight(((WindowManager)localObject).getDefaultDisplay().getHeight() * 2 / 3 - 100);
    j.b(this.ekb, Integer.valueOf(31));
    this.eka = ((TextView)findViewById(2131827152));
    this.eka.setText(Integer.toString(com.tencent.mm.ui.tools.f.bP(280, this.ejW)));
    this.ekg.setVisibility(8);
    this.ekb.setCursorVisible(false);
    this.ekb.setFocusable(false);
    label363: ImageView localImageView;
    if ((!this.ejU) && (!this.ejV))
    {
      removeOptionMenu(0);
      this.eki.setVisibility(0);
      this.ekb.setFocusable(false);
      this.ekb.setCursorVisible(false);
      this.ekb.setOnLongClickListener(new RoomCardUI.5(this));
      if (this.ejY == 0L)
        break label565;
      this.ekc.setVisibility(0);
      this.ekc.setText(com.tencent.mm.pluginsdk.f.h.formatTime("yyyy-MM-dd HH:mm", this.ejY));
      if (!bo.isNullOrNil(this.ejW))
        break label577;
      this.ekb.setEnabled(true);
      this.ekb.setFocusableInTouchMode(true);
      this.ekb.setFocusable(true);
      this.ekh.setVisibility(8);
      this.ekb.setMinHeight(((WindowManager)localObject).getDefaultDisplay().getHeight() * 2 / 3 + 100);
      this.ekb.requestFocus();
      this.ekb.setCursorVisible(true);
      updateOptionMenuText(0, this.mController.ylL.getString(2131296944));
      JZ();
      this.ekb.performClick();
      showVKB();
      label479: localObject = s.mJ(this.ejX);
      this.ekd.setText(j.b(this, (CharSequence)localObject, this.ekd.getTextSize()));
      localImageView = this.eke;
      localObject = this.ejX;
      if (!bo.isNullOrNil((String)localObject))
        break label588;
      localImageView.setImageResource(2130838444);
    }
    while (true)
    {
      this.ekb.addTextChangedListener(new RoomCardUI.a(this, (byte)0));
      AppMethodBeat.o(104159);
      return;
      this.eki.setVisibility(8);
      break;
      label565: this.ekc.setVisibility(8);
      break label363;
      label577: this.ekh.setVisibility(0);
      break label479;
      label588: a.b.b(localImageView, (String)localObject);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(104166);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
      AppMethodBeat.o(104166);
    while (true)
    {
      return;
      AppMethodBeat.o(104166);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104160);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.pYm.a(219L, 0L, 1L, true);
    g.RO().eJo.a(993, this);
    this.ejD = getIntent().getStringExtra("RoomInfo_Id");
    this.ejW = getIntent().getStringExtra("room_notice");
    this.ejX = getIntent().getStringExtra("room_notice_editor");
    this.ejY = getIntent().getLongExtra("room_notice_publish_time", 0L);
    this.ejR = getIntent().getStringExtra("room_name");
    this.ejS = getIntent().getIntExtra("room_member_count", 0);
    this.ejT = getIntent().getStringExtra("room_owner_name");
    this.ejU = getIntent().getBooleanExtra("Is_RoomOwner", false);
    this.ejV = getIntent().getBooleanExtra("Is_RoomManager", false);
    initView();
    setBackBtn(new RoomCardUI.8(this));
    AppMethodBeat.o(104160);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104161);
    super.onDestroy();
    g.RO().eJo.b(993, this);
    if ((this.ejZ != null) && (this.ejZ.isShowing()))
      this.ejZ.dismiss();
    AppMethodBeat.o(104161);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(104165);
    super.onKeyDown(paramInt, paramKeyEvent);
    boolean bool;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(104165);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104165);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(104167);
    if (paramm.getType() == 993)
    {
      d(paramInt1, paramInt2, paramString);
      AppMethodBeat.o(104167);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.RoomInfoUI", "error cgi type callback:[%d]", new Object[] { Integer.valueOf(paramm.getType()) });
      AppMethodBeat.o(104167);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomCardUI
 * JD-Core Version:    0.6.2
 */