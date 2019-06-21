package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.io.File;

@a(3)
@JgClassChecked(author=12, fComment="checked", lastDate="20141031", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareScreenImgUI extends MMActivity
{
  private ProgressDialog ehJ;
  String filePath;
  private ak handler;
  private Intent intent;
  Uri uri;

  public ShareScreenImgUI()
  {
    AppMethodBeat.i(34967);
    this.ehJ = null;
    this.intent = null;
    this.filePath = null;
    this.uri = null;
    this.handler = new ShareScreenImgUI.1(this);
    AppMethodBeat.o(34967);
  }

  private static int asc(String paramString)
  {
    AppMethodBeat.i(34971);
    int i;
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.ShareScreenImgUI", "map : mimeType is null");
      i = -1;
      AppMethodBeat.o(34971);
    }
    while (true)
    {
      return i;
      paramString = paramString.toLowerCase();
      if ((paramString.contains("image")) || ((Build.VERSION.SDK_INT >= 28) && (paramString.contains("heic"))))
      {
        i = 0;
        AppMethodBeat.o(34971);
      }
      else
      {
        ab.d("MicroMsg.ShareScreenImgUI", "map : unknown mimetype, send as file");
        i = 3;
        AppMethodBeat.o(34971);
      }
    }
  }

  private void dJW()
  {
    AppMethodBeat.i(34970);
    ab.i("MicroMsg.ShareScreenImgUI", "filepath:[%s]", new Object[] { this.filePath });
    Intent localIntent = getIntent();
    int i = asc(localIntent.resolveType(this));
    if (i == -1)
    {
      ab.e("MicroMsg.ShareScreenImgUI", "launch, msgType is invalid");
      finish();
      AppMethodBeat.o(34970);
      return;
    }
    if ((!w.a(getIntent(), "Intro_Switch", false)) && (aw.ZM()) && (!aw.QT()))
    {
      localIntent.setData(this.uri);
      localIntent.setClass(this, MsgRetransmitUI.class);
      localIntent.putExtra("Retr_File_Name", this.filePath);
      localIntent.putExtra("Retr_Msg_Type", i);
      localIntent.putExtra("Retr_Scene", 1);
      localIntent.putExtra("Retr_start_where_you_are", false);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(34970);
      break;
      if (!bo.isNullOrNil(this.filePath))
      {
        localIntent = new Intent(this, ShareImgUI.class);
        localIntent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(this.filePath)));
        localIntent.addFlags(67108864);
        localIntent.setType("image/*");
        localIntent.setAction("android.intent.action.SEND");
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), localIntent);
      }
      else
      {
        dJX();
      }
    }
  }

  private void dJX()
  {
    AppMethodBeat.i(34972);
    Toast.makeText(this, 2131303506, 1).show();
    AppMethodBeat.o(34972);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
    AppMethodBeat.i(34969);
    this.intent = getIntent();
    if (this.intent == null)
    {
      ab.e("MicroMsg.ShareScreenImgUI", "launch : fail, intent is null");
      dJX();
      finish();
      AppMethodBeat.o(34969);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ShareScreenImgUI", "intent = " + this.intent);
      String str = this.intent.getAction();
      this.uri = this.intent.getData();
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.ShareScreenImgUI", "launch : fail, action is null");
        dJX();
        finish();
        AppMethodBeat.o(34969);
      }
      else if (str.equals("android.intent.action.VIEW"))
      {
        ab.i("MicroMsg.ShareScreenImgUI", "send signal: ".concat(String.valueOf(str)));
        if ((this.uri == null) || (!bo.v(this.uri)))
        {
          ab.e("MicroMsg.ShareScreenImgUI", "launch : fail, not accepted: %s", new Object[] { this.uri });
          dJX();
          finish();
          AppMethodBeat.o(34969);
        }
        else
        {
          getString(2131297061);
          this.ehJ = h.b(this, getString(2131297086), true, new ShareScreenImgUI.2(this));
          this.filePath = bo.h(this, this.uri);
          if ((bo.isNullOrNil(this.filePath)) || (!r.amn(this.filePath)))
          {
            ab.e("MicroMsg.ShareScreenImgUI", "launch : fail, filePath is null");
            dJX();
            finish();
            AppMethodBeat.o(34969);
          }
          else
          {
            dJW();
            AppMethodBeat.o(34969);
          }
        }
      }
      else
      {
        ab.e("MicroMsg.ShareScreenImgUI", "launch : fail, uri is null");
        dJX();
        finish();
        AppMethodBeat.o(34969);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34968);
    super.onCreate(paramBundle);
    setMMTitle("");
    int i = w.a(getIntent(), "wizard_activity_result_code", 0);
    switch (i)
    {
    default:
      ab.e("MicroMsg.ShareScreenImgUI", "onCreate, should not reach here, resultCode = ".concat(String.valueOf(i)));
      finish();
      AppMethodBeat.o(34968);
    case 1:
    case -1:
    case 0:
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(34968);
      continue;
      NotifyReceiver.Io();
      initView();
      AppMethodBeat.o(34968);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareScreenImgUI
 * JD-Core Version:    0.6.2
 */