package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.e.k;
import java.io.File;

@a(3)
@JgClassChecked(author=12, fComment="checked", lastDate="20141031", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareScreenToTimeLineUI extends MMActivity
{
  String filePath = null;
  Uri uri = null;

  private void dJw()
  {
    AppMethodBeat.i(34979);
    Toast.makeText(this, 2131303508, 1).show();
    AppMethodBeat.o(34979);
  }

  private void ip(String paramString1, String paramString2)
  {
    AppMethodBeat.i(34978);
    Intent localIntent = new Intent();
    if (!bo.isNullOrNil(paramString1))
    {
      localIntent.putExtra("sns_kemdia_path", paramString1);
      localIntent.putExtra("KFilterId", -1);
    }
    if (!bo.isNullOrNil(paramString2))
      localIntent.putExtra(e.k.ygd, paramString2);
    if ((aw.ZM()) && (!aw.QT()))
    {
      localIntent.putExtra("K_go_to_SnsTimeLineUI", true);
      d.b(this, "sns", ".ui.SnsUploadUI", localIntent);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(34978);
      return;
      if (!bo.isNullOrNil(paramString1))
      {
        paramString2 = new Intent(this, ShareToTimeLineUI.class);
        paramString2.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(paramString1)));
        paramString2.addFlags(32768).addFlags(268435456);
        paramString2.setType("image/*");
        paramString2.setAction("android.intent.action.SEND");
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), paramString2);
      }
      else
      {
        dJw();
      }
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
    AppMethodBeat.i(34977);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      ab.e("MicroMsg.ShareScreenToTimeLineUI", "launch : fail, intent is null");
      dJw();
      finish();
      AppMethodBeat.o(34977);
    }
    while (true)
    {
      return;
      String str1 = localIntent.getAction();
      this.uri = localIntent.getData();
      if (bo.isNullOrNil(str1))
      {
        ab.e("MicroMsg.ShareScreenToTimeLineUI", "launch : fail, action is null");
        dJw();
        finish();
        AppMethodBeat.o(34977);
      }
      else
      {
        String str2 = w.n(localIntent, e.k.ygd);
        String str3 = getIntent().resolveType(this);
        if (bo.isNullOrNil(str3))
        {
          dJw();
          finish();
          AppMethodBeat.o(34977);
        }
        else if (Build.VERSION.SDK_INT >= 28)
        {
          if ((!str3.contains("heic")) && (!str3.contains("image")))
          {
            dJw();
            finish();
            AppMethodBeat.o(34977);
          }
        }
        else if (!str3.contains("image"))
        {
          dJw();
          finish();
          AppMethodBeat.o(34977);
        }
        else if (str1.equals("android.intent.action.VIEW"))
        {
          ab.i("MicroMsg.ShareScreenToTimeLineUI", "send signal: ".concat(String.valueOf(str1)));
          if (!bo.v(this.uri))
          {
            ab.e("MicroMsg.ShareScreenToTimeLineUI", "fail, not accepted: %s", new Object[] { this.uri });
            dJw();
            finish();
            AppMethodBeat.o(34977);
          }
          else
          {
            this.filePath = bo.h(this, this.uri);
            if ((bo.isNullOrNil(this.filePath)) || (!bo.anx(this.filePath)))
            {
              if (w.a(localIntent, "Ksnsupload_empty_img", false))
              {
                ip(this.filePath, str2);
                AppMethodBeat.o(34977);
              }
              else
              {
                dJw();
                finish();
                AppMethodBeat.o(34977);
              }
            }
            else if (r.amn(this.filePath))
            {
              ip(this.filePath, str2);
              AppMethodBeat.o(34977);
            }
            else
            {
              dJw();
              finish();
              AppMethodBeat.o(34977);
            }
          }
        }
        else
        {
          ab.e("MicroMsg.ShareScreenToTimeLineUI", "launch : fail, uri is null");
          dJw();
          finish();
          AppMethodBeat.o(34977);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34976);
    super.onCreate(paramBundle);
    setMMTitle("");
    int i = w.a(getIntent(), "wizard_activity_result_code", 0);
    switch (i)
    {
    default:
      ab.e("MicroMsg.ShareScreenToTimeLineUI", "onCreate, should not reach here, resultCode = ".concat(String.valueOf(i)));
      finish();
      AppMethodBeat.o(34976);
    case 1:
    case -1:
    case 0:
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(34976);
      continue;
      NotifyReceiver.Io();
      aw.Rg().a(new bk(new ShareScreenToTimeLineUI.1(this)), 0);
      initView();
      AppMethodBeat.o(34976);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareScreenToTimeLineUI
 * JD-Core Version:    0.6.2
 */