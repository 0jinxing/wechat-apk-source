package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.a;
import com.tencent.mm.ba.r;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;

public class SettingsChattingBackgroundUI extends MMPreference
{
  private f ehK;
  private boolean qmZ;
  private String username;

  private void bCz()
  {
    AppMethodBeat.i(127205);
    if (!com.tencent.mm.pluginsdk.ui.tools.n.c(this, com.tencent.mm.compatible.util.e.euR, "microMsg." + System.currentTimeMillis() + ".jpg", 2))
      Toast.makeText(this, getString(2131302908), 1).show();
    AppMethodBeat.o(127205);
  }

  private String kq(boolean paramBoolean)
  {
    AppMethodBeat.i(127207);
    r.aix();
    String str;
    if (this.qmZ)
    {
      str = com.tencent.mm.ba.n.K("default", paramBoolean);
      AppMethodBeat.o(127207);
    }
    while (true)
    {
      return str;
      str = com.tencent.mm.ba.n.K(this.username, paramBoolean);
      AppMethodBeat.o(127207);
    }
  }

  public final int JC()
  {
    return 2131165273;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    AppMethodBeat.i(127204);
    paramf = paramPreference.mKey;
    ab.i("MicroMsg.SettingsChattingBackgroundUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_chatting_bg_select_bg"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsSelectBgUI.class);
      paramf.putExtra("isApplyToAll", this.qmZ);
      paramf.putExtra("username", this.username);
      startActivityForResult(paramf, 3);
      AppMethodBeat.o(127204);
    }
    while (true)
    {
      return bool1;
      if (paramf.equals("settings_chatting_bg_select_from_album"))
      {
        com.tencent.mm.pluginsdk.ui.tools.n.a(this, 1, null);
        AppMethodBeat.o(127204);
      }
      else if (paramf.equals("settings_chatting_bg_take_photo"))
      {
        boolean bool2 = com.tencent.mm.pluginsdk.permission.b.a(this.mController.ylL, "android.permission.CAMERA", 16, "", "");
        ab.i("MicroMsg.SettingsChattingBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool2), bo.dpG(), this.mController.ylL });
        if (!bool2)
        {
          AppMethodBeat.o(127204);
          bool1 = false;
        }
        else
        {
          bCz();
          AppMethodBeat.o(127204);
        }
      }
      else if (paramf.equals("settings_chatting_bg_apply_to_all"))
      {
        com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131303062), "", new SettingsChattingBackgroundUI.3(this), null);
        AppMethodBeat.o(127204);
      }
      else
      {
        AppMethodBeat.o(127204);
        bool1 = false;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127203);
    setMMTitle(2131303061);
    this.ehK = this.yCw;
    this.qmZ = getIntent().getBooleanExtra("isApplyToAll", true);
    if (!this.qmZ)
    {
      Preference localPreference = this.ehK.aqO("settings_chatting_bg_apply_to_all");
      if (localPreference != null)
        this.ehK.d(localPreference);
    }
    this.username = getIntent().getStringExtra("username");
    setBackBtn(new SettingsChattingBackgroundUI.1(this));
    AppMethodBeat.o(127203);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(127202);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
      if (!this.qmZ)
      {
        setResult(-1);
        finish();
      }
      AppMethodBeat.o(127202);
    case 1:
    case 2:
    case 4:
    case 3:
    }
    while (true)
    {
      return;
      if (paramIntent == null)
      {
        AppMethodBeat.o(127202);
      }
      else
      {
        Object localObject = new Intent();
        ((Intent)localObject).putExtra("CropImageMode", 2);
        ((Intent)localObject).putExtra("CropImage_bg_vertical", kq(true));
        ((Intent)localObject).putExtra("CropImage_bg_horizontal", kq(false));
        com.tencent.mm.plugin.setting.b.gkE.a(this, paramIntent, (Intent)localObject, c.XW(), 4, null);
        AppMethodBeat.o(127202);
        continue;
        paramIntent = com.tencent.mm.pluginsdk.ui.tools.n.h(getApplicationContext(), paramIntent, c.XW());
        if (paramIntent == null)
        {
          AppMethodBeat.o(127202);
        }
        else
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("CropImageMode", 2);
          ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
          ((Intent)localObject).putExtra("CropImage_bg_vertical", kq(true));
          ((Intent)localObject).putExtra("CropImage_bg_horizontal", kq(false));
          com.tencent.mm.plugin.setting.b.gkE.a(this, (Intent)localObject, 4);
          AppMethodBeat.o(127202);
          continue;
          if (paramInt2 != -1)
            break;
          g.RP().Ry().set(66820, Integer.valueOf(-1));
          com.tencent.mm.plugin.report.service.h.pYm.e(10198, new Object[] { Integer.valueOf(-1) });
          ab.i("MicroMsg.SettingsChattingBackgroundUI", "set chating bg id:%d", new Object[] { Integer.valueOf(-1) });
          if (this.qmZ)
          {
            g.RP().Ry().set(12311, Integer.valueOf(-1));
            r.aix().lS(1);
            break;
          }
          paramIntent = r.aiy();
          localObject = paramIntent.sU(this.username);
          if (localObject == null)
          {
            localObject = new a();
            ((a)localObject).username = this.username;
            ((a)localObject).fLV = -1;
            paramIntent.a((a)localObject);
            break;
          }
          ((a)localObject).fLV = -1;
          paramIntent.b((a)localObject);
          break;
          if (paramInt2 == -1)
            break;
          AppMethodBeat.o(127202);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127200);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127200);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127201);
    super.onDestroy();
    AppMethodBeat.o(127201);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(127206);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.SettingsChattingBackgroundUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(127206);
      return;
    }
    ab.i("MicroMsg.SettingsChattingBackgroundUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 16:
    }
    while (true)
    {
      AppMethodBeat.o(127206);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        bCz();
        AppMethodBeat.o(127206);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131296868), false, new SettingsChattingBackgroundUI.2(this), null);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI
 * JD-Core Version:    0.6.2
 */