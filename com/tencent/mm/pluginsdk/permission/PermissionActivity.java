package com.tencent.mm.pluginsdk.permission;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

public class PermissionActivity extends AppCompatActivity
{
  private Intent intent;
  private String key;
  private int requestCode;
  private int scene;
  private String[] vdl;
  private boolean vdm;
  private String vdn;
  private String vdo;

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(79434);
    ab.i("MicroMsg.PermissionActivity", "onActivityResult(),  scene=%d, requestCode=%d, resultCode=%d", new Object[] { Integer.valueOf(this.scene), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.scene == 2)
    {
      paramIntent = b.aiU(this.key);
      if (paramIntent != null)
        paramIntent.Cp(paramInt2);
      finish();
      AppMethodBeat.o(79434);
    }
    while (true)
    {
      return;
      if (this.scene == 3)
      {
        if (paramInt2 == -1)
          startActivity(this.intent);
        while (true)
        {
          finish();
          AppMethodBeat.o(79434);
          break;
          Toast.makeText(ah.getContext(), 2131301726, 1).show();
        }
      }
      if (this.scene == 4)
      {
        if (Build.VERSION.SDK_INT >= 23)
        {
          boolean bool = com.tencent.mm.booter.c.bn(this);
          if (bool)
          {
            if (as.amF("service_launch_way").getBoolean("954_84_first", true))
            {
              e.pXa.a(954L, 84L, 1L, false);
              as.amF("service_launch_way").edit().putBoolean("954_84_first", false);
            }
            com.tencent.mm.booter.c.bu(true);
          }
          ab.i("MicroMsg.PermissionActivity", "onActivityResult ADD_IGNORING_BATTERY_OPTIMIZATIONS result=%s", new Object[] { Boolean.valueOf(bool) });
        }
      }
      else
        finish();
      AppMethodBeat.o(79434);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(79431);
    super.onCreate(paramBundle);
    if ((getIntent() == null) || (!getIntent().hasExtra("scene")))
    {
      finish();
      AppMethodBeat.o(79431);
    }
    while (true)
    {
      return;
      getWindow().addFlags(67108864);
      Window localWindow = getWindow();
      localWindow.setGravity(51);
      paramBundle = localWindow.getAttributes();
      paramBundle.x = 0;
      paramBundle.y = 0;
      paramBundle.height = 1;
      paramBundle.width = 1;
      localWindow.setAttributes(paramBundle);
      this.vdm = true;
      this.scene = getIntent().getIntExtra("scene", 1);
      this.key = getIntent().getStringExtra("key");
      if (this.scene == 1)
      {
        this.vdl = getIntent().getStringArrayExtra("permission");
        this.requestCode = getIntent().getIntExtra("requestCode", 0);
        if (!bo.Q(this.vdl))
        {
          ab.i("MicroMsg.PermissionActivity", "scene: %d, permission: %s, requestCode: %d", new Object[] { Integer.valueOf(this.scene), this.vdl.toString(), Integer.valueOf(this.requestCode) });
          AppMethodBeat.o(79431);
        }
      }
      else if (this.scene == 2)
      {
        this.intent = getIntent().getSelector();
        this.vdn = getIntent().getStringExtra("reasonTitle");
        this.vdo = getIntent().getStringExtra("reasonMsg");
        if ((!bo.isNullOrNil(this.vdn)) && (!bo.isNullOrNil(this.vdo)))
        {
          ab.i("MicroMsg.PermissionActivity", "scene: %d, reasonTitle: %s, reasonMsg: %s", new Object[] { Integer.valueOf(this.scene), this.vdn, this.vdo });
          AppMethodBeat.o(79431);
        }
      }
      else if (this.scene == 3)
      {
        this.intent = getIntent().getSelector();
        if (this.intent != null)
        {
          ab.i("MicroMsg.PermissionActivity", "scene: %d, intent: %s", new Object[] { Integer.valueOf(this.scene), this.intent.toString() });
          AppMethodBeat.o(79431);
        }
      }
      else
      {
        if (this.scene == 4)
          ab.i("MicroMsg.PermissionActivity", "scene: %d", new Object[] { Integer.valueOf(this.scene) });
        AppMethodBeat.o(79431);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(79435);
    ab.i("MicroMsg.PermissionActivity", "onDestroy(), scene=%d", new Object[] { Integer.valueOf(this.scene) });
    if (this.scene == 1)
      b.aiT(this.key);
    while (true)
    {
      super.onDestroy();
      AppMethodBeat.o(79435);
      return;
      if (this.scene == 2)
        b.aiU(this.key);
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(79433);
    ab.i("MicroMsg.PermissionActivity", "onRequestPermissionsResult(),  scene=%d, requestCode=%d, permissions=%s, grantResults=%s", new Object[] { Integer.valueOf(this.scene), Integer.valueOf(paramInt), paramArrayOfString.toString(), paramArrayOfInt.toString() });
    if (this.scene == 1)
    {
      paramArrayOfString = b.aiT(this.key);
      if (paramArrayOfString != null)
        paramArrayOfString.r(paramArrayOfInt);
    }
    finish();
    AppMethodBeat.o(79433);
  }

  public void onResume()
  {
    AppMethodBeat.i(79432);
    ab.i("MicroMsg.PermissionActivity", "onResume(), scene=%d", new Object[] { Integer.valueOf(this.scene) });
    super.onResume();
    if (this.vdm)
      if (this.scene == 1)
      {
        b.a(this, this.vdl, this.requestCode);
        this.vdm = false;
        AppMethodBeat.o(79432);
      }
    while (true)
    {
      while (true)
      {
        while (true)
        {
          return;
          if (this.scene != 2)
            break label190;
          if ((!bo.isNullOrNil(this.vdo)) || (!bo.isNullOrNil(this.vdn)))
            break label143;
          try
          {
            startActivityForResult(this.intent, 1);
          }
          catch (Exception localException1)
          {
            ab.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", new Object[] { Integer.valueOf(this.scene), localException1.getMessage() });
          }
        }
        break;
        label143: h.a(this, false, this.vdo, this.vdn, getString(2131300878), getString(2131296868), new PermissionActivity.1(this), new PermissionActivity.2(this));
        break;
        label190: if (this.scene != 3)
          break label312;
        if (Build.VERSION.SDK_INT < 26)
          break label301;
        if (getPackageManager().canRequestPackageInstalls())
          break label290;
        Intent localIntent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getPackageName()));
        try
        {
          startActivityForResult(localIntent, 1);
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", new Object[] { Integer.valueOf(this.scene), localException2.getMessage() });
        }
      }
      break;
      label290: startActivity(this.intent);
      break;
      label301: startActivity(this.intent);
      break;
      label312: if (this.scene != 4)
        break;
      if (as.amF("service_launch_way").getBoolean("954_95_first", true))
      {
        e.pXa.a(954L, 95L, 1L, false);
        as.amF("service_launch_way").edit().putBoolean("954_95_first", false);
      }
      e.pXa.a(954L, 96L, 1L, false);
      h.a(this, false, getString(2131301925), getString(2131301936), getString(2131300878), getString(2131296868), new PermissionActivity.3(this), new PermissionActivity.4(this));
      break;
      this.vdm = true;
      AppMethodBeat.o(79432);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.permission.PermissionActivity
 * JD-Core Version:    0.6.2
 */