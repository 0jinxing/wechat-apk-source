package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.protobuf.rt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.e.k;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareToTimeLineUI extends AutoLoginActivity
  implements f
{
  private ProgressDialog ehJ = null;
  private Intent intent;
  private Intent zHq;

  private void Q(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(34985);
    Intent localIntent = new Intent();
    ArrayList localArrayList = new ArrayList();
    if (!bo.isNullOrNil(paramString1))
    {
      localIntent.putExtra("sns_kemdia_path", paramString1);
      localIntent.putExtra("KFilterId", -1);
      localArrayList.add(paramString1);
    }
    if (!bo.isNullOrNil(paramString2))
      localIntent.putExtra(e.k.ygd, paramString2);
    if ((paramInt == 4) && (bo.isNullOrNil(paramString1)) && (!bo.isNullOrNil(paramString2)))
      localArrayList.add(paramString2);
    if ((aw.ZM()) && (!aw.QT()))
    {
      localIntent.putExtra("K_go_to_SnsTimeLineUI", true);
      localIntent.putExtra("Ksnsupload_source", 12);
      if (paramInt == 0)
        localIntent.putExtra("KBlockAdd", true);
      localIntent.setClassName(this, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
      this.zHq = localIntent;
      paramString1 = null;
      switch (paramInt)
      {
      default:
      case 4:
      case 0:
      }
      while (true)
      {
        if (paramString1 != null)
        {
          aw.Rg().a(837, this);
          com.tencent.mm.kernel.g.Rg().a(paramString1, 0);
          showDialog();
        }
        AppMethodBeat.o(34985);
        return;
        paramString1 = new com.tencent.mm.modelsimple.d(5, localArrayList, dyh());
        continue;
        paramString1 = new com.tencent.mm.modelsimple.d(1, localArrayList, dyh());
      }
    }
    if (!bo.isNullOrNil(paramString1))
    {
      paramString2 = new Intent(this, ShareToTimeLineUI.class);
      paramString2.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(paramString1)));
      paramString2.addFlags(32768).addFlags(268435456);
      paramString2.setType("image/*");
      paramString2.setAction("android.intent.action.SEND");
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(268435456).addFlags(32768), paramString2);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(34985);
      break;
      dJw();
    }
  }

  private static boolean asl(String paramString)
  {
    AppMethodBeat.i(34984);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      bool = false;
      AppMethodBeat.o(34984);
    }
    while (true)
    {
      return bool;
      bool = r.amn(paramString);
      AppMethodBeat.o(34984);
    }
  }

  private void dJW()
  {
    AppMethodBeat.i(34983);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      ab.e("MicroMsg.ShareToTimeLine", "launch : fail, intent is null");
      dJw();
      finish();
      AppMethodBeat.o(34983);
    }
    Object localObject1;
    String str2;
    while (true)
    {
      return;
      String str1 = localIntent.getAction();
      localObject1 = w.aM(localIntent);
      if (bo.isNullOrNil(str1))
      {
        ab.e("MicroMsg.ShareToTimeLine", "launch : fail, action is null");
        dJw();
        finish();
        AppMethodBeat.o(34983);
      }
      else
      {
        str2 = w.n(localIntent, e.k.ygd);
        localObject2 = getIntent().resolveType(this);
        if (bo.isNullOrNil((String)localObject2))
        {
          dJw();
          finish();
          AppMethodBeat.o(34983);
        }
        else if (!((String)localObject2).contains("image"))
        {
          dJw();
          finish();
          AppMethodBeat.o(34983);
        }
        else
        {
          if ((!str1.equals("android.intent.action.SEND")) || (localObject1 == null))
            break label420;
          ab.i("MicroMsg.ShareToTimeLine", "send signal: ".concat(String.valueOf(str1)));
          localObject2 = ((Bundle)localObject1).getParcelable("android.intent.extra.STREAM");
          if ((localObject2 == null) || (!(localObject2 instanceof Uri)))
          {
            if (localIntent.getBooleanExtra("Ksnsupload_empty_img", false))
            {
              Q(null, str2, 4);
              AppMethodBeat.o(34983);
            }
            else
            {
              dJw();
              finish();
              AppMethodBeat.o(34983);
            }
          }
          else
          {
            localObject1 = (Uri)localObject2;
            if (bo.v((Uri)localObject1))
              break;
            ab.e("MicroMsg.ShareToTimeLine", "deal : fail, not accept, %s", new Object[] { localObject1 });
            dJw();
            finish();
            AppMethodBeat.o(34983);
          }
        }
      }
    }
    Object localObject2 = bo.h(this, (Uri)localObject1);
    if ((bo.isNullOrNil((String)localObject2)) || (!new com.tencent.mm.vfs.b((String)localObject2).exists()))
      localObject2 = com.tencent.mm.pluginsdk.i.e.a(getContentResolver(), (Uri)localObject1, 2);
    while (true)
    {
      if ((bo.isNullOrNil((String)localObject2)) || (!bo.anx((String)localObject2)))
      {
        if (localIntent.getBooleanExtra("Ksnsupload_empty_img", false))
        {
          Q((String)localObject2, str2, 4);
          AppMethodBeat.o(34983);
          break;
        }
        dJw();
        finish();
        AppMethodBeat.o(34983);
        break;
      }
      if (asl((String)localObject2))
      {
        Q((String)localObject2, str2, 0);
        AppMethodBeat.o(34983);
        break;
      }
      dJw();
      finish();
      AppMethodBeat.o(34983);
      break;
      label420: ab.e("MicroMsg.ShareToTimeLine", "launch : fail, uri is null");
      dJw();
      finish();
      AppMethodBeat.o(34983);
      break;
    }
  }

  private void dJw()
  {
    AppMethodBeat.i(34987);
    Toast.makeText(this, 2131303508, 1).show();
    AppMethodBeat.o(34987);
  }

  private void showDialog()
  {
    AppMethodBeat.i(34988);
    getString(2131297061);
    this.ehJ = h.b(this, getString(2131297086), true, new ShareToTimeLineUI.1(this));
    AppMethodBeat.o(34988);
  }

  public final boolean O(Intent paramIntent)
  {
    return true;
  }

  public final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    AppMethodBeat.i(34989);
    switch (ShareToTimeLineUI.2.jDI[parama.ordinal()])
    {
    default:
      finish();
      AppMethodBeat.o(34989);
    case 1:
    }
    while (true)
    {
      return;
      this.intent = paramIntent;
      int i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SystemShareControlBitset"), 0);
      ab.i("MicroMsg.ShareToTimeLine", "now permission = %d", new Object[] { Integer.valueOf(i) });
      if ((i & 0x2) > 0)
      {
        ab.e("MicroMsg.ShareToTimeLine", "now allowed to share to friend");
        finish();
        AppMethodBeat.o(34989);
      }
      else
      {
        parama = w.n(paramIntent, "android.intent.extra.TEXT");
        ab.i("MicroMsg.ShareToTimeLine", "postLogin, text = %s", new Object[] { parama });
        if (!bo.isNullOrNil(parama))
        {
          parama = String.format("weixin://dl/business/systemshare/?txt=%s", new Object[] { URLEncoder.encode(parama) });
          showDialog();
          aw.Rg().a(1200, this);
          parama = new z(parama, 15, null);
          aw.Rg().a(parama, 0);
          AppMethodBeat.o(34989);
        }
        else
        {
          dJW();
          AppMethodBeat.o(34989);
        }
      }
    }
  }

  public final boolean bVD()
  {
    AppMethodBeat.i(34982);
    boolean bool;
    if ((!aw.ZM()) || (aw.QT()))
    {
      ab.w("MicroMsg.ShareToTimeLine", "not login");
      dJW();
      bool = true;
      AppMethodBeat.o(34982);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(34982);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34986);
    aw.Rg().b(837, this);
    super.onDestroy();
    AppMethodBeat.o(34986);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(34990);
    ab.i("MicroMsg.ShareToTimeLine", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    aw.Rg().b(1200, this);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    if ((paramm instanceof z))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        dJW();
        AppMethodBeat.o(34990);
        return;
      }
      dJw();
    }
    while (true)
    {
      finish();
      do
      {
        AppMethodBeat.o(34990);
        break;
      }
      while (!(paramm instanceof com.tencent.mm.modelsimple.d));
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        if (paramm.ftl != null)
        {
          paramString = (rt)((com.tencent.mm.ai.b)paramm.ftl).fsH.fsP;
          if ((paramString != null) && (!bo.isNullOrNil(paramString.vZf)))
          {
            paramm = new Intent();
            paramm.putExtra("rawUrl", paramString.vZf);
            paramm.putExtra("showShare", false);
            paramm.putExtra("show_bottom", false);
            paramm.putExtra("needRedirect", false);
            com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramm);
          }
        }
      }
      else
        startActivity(this.zHq);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareToTimeLineUI
 * JD-Core Version:    0.6.2
 */