package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;

public class SettingSnsBackgroundUI extends MMPreference
{
  private f ehK;
  private SharedPreferences ehZ;
  protected String filePath;

  private void bCz()
  {
    AppMethodBeat.i(38567);
    if (!com.tencent.mm.pluginsdk.ui.tools.n.c(this, com.tencent.mm.compatible.util.e.euR, "microMsg." + System.currentTimeMillis() + ".jpg", 2))
      Toast.makeText(this, getString(2131302908), 1).show();
    AppMethodBeat.o(38567);
  }

  private void g(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(38563);
    switch (paramInt)
    {
    case 3:
    case 4:
    default:
      ab.e("MicroMsg.SettingSnsBackgroundUI", "onActivityResult: not found this requestCode");
      AppMethodBeat.o(38563);
    case 2:
    case 5:
    case 6:
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult CONTEXT_MENU_TAKE_PICTURE");
      this.filePath = com.tencent.mm.pluginsdk.ui.tools.n.h(getApplicationContext(), paramIntent, af.getAccSnsTmpPath());
      if (this.filePath == null)
      {
        AppMethodBeat.o(38563);
      }
      else
      {
        paramIntent = new Intent();
        paramIntent.putExtra("CropImageMode", 1);
        paramIntent.putExtra("CropImage_ImgPath", this.filePath);
        Object localObject1 = com.tencent.mm.a.g.x((this.filePath + System.currentTimeMillis()).getBytes());
        paramIntent.putExtra("CropImage_OutputPath", af.getAccSnsTmpPath() + (String)localObject1);
        com.tencent.mm.plugin.sns.c.a.gkE.a(this, paramIntent, 6);
        AppMethodBeat.o(38563);
        continue;
        ab.d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult CONTEXT_MENU_IMAGE_BROUND");
        if (paramIntent == null)
        {
          AppMethodBeat.o(38563);
        }
        else
        {
          this.filePath = com.tencent.mm.pluginsdk.ui.tools.n.h(getApplicationContext(), paramIntent, af.getAccSnsTmpPath());
          if (this.filePath == null)
          {
            AppMethodBeat.o(38563);
          }
          else
          {
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("CropImageMode", 1);
            ((Intent)localObject1).putExtra("CropImage_ImgPath", this.filePath);
            com.tencent.mm.plugin.sns.c.a.gkE.a(this, paramIntent, (Intent)localObject1, af.getAccSnsTmpPath(), 6, new SettingSnsBackgroundUI.1(this));
            AppMethodBeat.o(38563);
            continue;
            ab.d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM");
            new ak(Looper.getMainLooper()).post(new SettingSnsBackgroundUI.2(this));
            if (paramIntent == null)
            {
              AppMethodBeat.o(38563);
            }
            else
            {
              this.filePath = paramIntent.getStringExtra("CropImage_OutputPath");
              if (this.filePath == null)
              {
                AppMethodBeat.o(38563);
              }
              else
              {
                ab.d("MicroMsg.SettingSnsBackgroundUI", "REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM   " + this.filePath);
                localObject1 = af.cnB();
                paramIntent = this.filePath;
                new LinkedList().add(new com.tencent.mm.plugin.sns.data.h(paramIntent, 2));
                if ((((aw)localObject1).cnk() != null) && (!((aw)localObject1).cnk().equals("")))
                {
                  Object localObject2 = an.fZ(af.getAccSnsPath(), ((aw)localObject1).cnk());
                  com.tencent.mm.vfs.e.tf((String)localObject2);
                  com.tencent.mm.vfs.e.deleteFile((String)localObject2 + ((aw)localObject1).cnk() + "bg_");
                  com.tencent.mm.vfs.e.y(paramIntent, (String)localObject2 + ((aw)localObject1).cnk() + "bg_");
                  m localm = af.cnJ();
                  localObject2 = localm.YX(((aw)localObject1).cnk());
                  ((l)localObject2).field_bgId = "";
                  localm.c((l)localObject2);
                }
                ((aw)localObject1).con();
                ((aw)localObject1).cnk();
                localObject1 = new ax(7);
                ((ax)localObject1).ge(paramIntent, "");
                ((ax)localObject1).De(1);
                ((ax)localObject1).commit();
                setResult(-1);
                finish();
                AppMethodBeat.o(38563);
              }
            }
          }
        }
      }
    }
  }

  public final int JC()
  {
    return 2131165293;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = false;
    AppMethodBeat.i(38566);
    paramf = paramPreference.mKey;
    ab.i("MicroMsg.SettingSnsBackgroundUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_sns_bg_select_from_album"))
    {
      com.tencent.mm.kernel.g.RQ();
      if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
      {
        t.hO(this);
        AppMethodBeat.o(38566);
      }
    }
    while (true)
    {
      return bool1;
      com.tencent.mm.pluginsdk.ui.tools.n.a(this, 5, null);
      AppMethodBeat.o(38566);
      bool1 = true;
      continue;
      if (paramf.equals("settings_sns_bg_take_photo"))
      {
        com.tencent.mm.kernel.g.RQ();
        if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
        {
          t.hO(this);
          AppMethodBeat.o(38566);
        }
        else
        {
          boolean bool2 = b.a(this.mController.ylL, "android.permission.CAMERA", 16, "", "");
          ab.i("MicroMsg.SettingSnsBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool2), bo.dpG(), this.mController.ylL });
          if (!bool2)
          {
            AppMethodBeat.o(38566);
          }
          else
          {
            bCz();
            AppMethodBeat.o(38566);
            bool1 = true;
          }
        }
      }
      else if (paramf.equals("settings_sns_bg_select_bg"))
      {
        startActivity(new Intent(this, ArtistUI.class));
        AppMethodBeat.o(38566);
        bool1 = true;
      }
      else
      {
        AppMethodBeat.o(38566);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(38565);
    setMMTitle(2131303268);
    SnsArtistPreference localSnsArtistPreference = (SnsArtistPreference)this.ehK.aqO("settings_sns_bg_select_bg");
    if (localSnsArtistPreference != null)
    {
      String str = this.ehZ.getString("artist_name", "");
      ab.d("MicroMsg.SettingSnsBackgroundUI", "artistName".concat(String.valueOf(str)));
      localSnsArtistPreference.ZE(str);
      this.ehK.notifyDataSetChanged();
    }
    setBackBtn(new SettingSnsBackgroundUI.5(this));
    AppMethodBeat.o(38565);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(38564);
    ab.i("MicroMsg.SettingSnsBackgroundUI", "onAcvityResult requestCode:" + paramInt1 + " " + paramInt2);
    if (paramInt2 != -1)
    {
      if ((paramInt1 == 2) || (paramInt1 == 5) || (paramInt1 == 6))
        new ak(Looper.getMainLooper()).post(new SettingSnsBackgroundUI.3(this));
      AppMethodBeat.o(38564);
    }
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder("result ok ");
      com.tencent.mm.kernel.g.RQ();
      ab.d("MicroMsg.SettingSnsBackgroundUI", com.tencent.mm.kernel.g.RN().QY());
      if (af.cnn())
      {
        new ak(Looper.myLooper()).postDelayed(new SettingSnsBackgroundUI.4(this, paramInt1, paramInt2, paramIntent), 2000L);
        AppMethodBeat.o(38564);
      }
      else
      {
        ab.d("MicroMsg.SettingSnsBackgroundUI", "isInValid ok");
        g(paramInt1, paramIntent);
        AppMethodBeat.o(38564);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38559);
    ab.d("MicroMsg.SettingSnsBackgroundUI", "onCreate");
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    this.ehZ = getSharedPreferences(ah.doA(), 0);
    initView();
    AppMethodBeat.o(38559);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38561);
    super.onDestroy();
    ab.d("MicroMsg.SettingSnsBackgroundUI", "onDestroy");
    AppMethodBeat.o(38561);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(38560);
    ab.d("MicroMsg.SettingSnsBackgroundUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    setResult(-1);
    finish();
    AppMethodBeat.o(38560);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(38568);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.SettingSnsBackgroundUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(38568);
      return;
    }
    ab.i("MicroMsg.SettingSnsBackgroundUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 16:
    }
    while (true)
    {
      AppMethodBeat.o(38568);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        bCz();
        AppMethodBeat.o(38568);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131296868), false, new SettingSnsBackgroundUI.6(this), null);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(38562);
    super.onResume();
    if (this.ehK != null)
      this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(38562);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI
 * JD-Core Version:    0.6.2
 */