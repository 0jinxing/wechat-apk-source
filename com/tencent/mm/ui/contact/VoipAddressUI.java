package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.LauncherUI;
import java.util.ArrayList;
import java.util.List;

public class VoipAddressUI extends MMBaseSelectContactUI
{
  private List<String> elZ;
  private String talker;
  private boolean zpw;
  private boolean zpx;
  private com.tencent.mm.sdk.b.c zpy;

  public VoipAddressUI()
  {
    AppMethodBeat.i(33972);
    this.zpw = false;
    this.zpx = false;
    this.talker = "";
    this.zpy = new VoipAddressUI.1(this);
    AppMethodBeat.o(33972);
  }

  private void cbl()
  {
    AppMethodBeat.i(33975);
    boolean bool = b.a(this, "android.permission.RECORD_AUDIO", 82, "", "");
    ab.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
    if (!bool)
    {
      AppMethodBeat.o(33975);
      return;
    }
    ui localui = new ui();
    localui.cQx.cAd = 5;
    localui.cQx.talker = this.talker;
    localui.cQx.context = this;
    if (this.zpw);
    for (int i = 2; ; i = 1)
    {
      localui.cQx.cQs = 3;
      com.tencent.mm.plugin.report.service.h.pYm.e(11033, new Object[] { Integer.valueOf(i), Integer.valueOf(2), Integer.valueOf(0) });
      com.tencent.mm.sdk.b.a.xxA.m(localui);
      aqX();
      AppMethodBeat.o(33975);
      break;
    }
  }

  private void cbm()
  {
    AppMethodBeat.i(33976);
    boolean bool = b.a(this, "android.permission.CAMERA", 19, "", "");
    ab.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
    if (!bool)
      AppMethodBeat.o(33976);
    while (true)
    {
      return;
      bool = b.a(this, "android.permission.RECORD_AUDIO", 19, "", "");
      ab.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
      if (bool)
        break;
      AppMethodBeat.o(33976);
    }
    ui localui = new ui();
    localui.cQx.cAd = 5;
    localui.cQx.talker = this.talker;
    localui.cQx.context = this;
    if (this.zpw);
    for (int i = 2; ; i = 1)
    {
      localui.cQx.cQs = 2;
      com.tencent.mm.plugin.report.service.h.pYm.e(11033, new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(0) });
      com.tencent.mm.sdk.b.a.xxA.m(localui);
      aqX();
      AppMethodBeat.o(33976);
      break;
    }
  }

  public static void hX(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(33980);
    boolean bool;
    if (1 == bo.getInt(g.Nu().getValue("VOIPCallType"), 0))
    {
      bool = true;
      Intent localIntent = new Intent(paramContext, VoipAddressUI.class);
      localIntent.putExtra("Add_address_titile", paramContext.getString(2131296486));
      localIntent.putExtra("voip_video", bool);
      paramContext.startActivity(localIntent);
      paramContext = com.tencent.mm.plugin.report.service.h.pYm;
      if (!bool)
        break label106;
    }
    while (true)
    {
      paramContext.e(11034, new Object[] { Integer.valueOf(1), Integer.valueOf(i) });
      AppMethodBeat.o(33980);
      return;
      bool = false;
      break;
      label106: i = 1;
    }
  }

  protected final void Kh()
  {
    AppMethodBeat.i(33977);
    super.Kh();
    String str = getIntent().getStringExtra("LauncherUI.Shortcut.LaunchType");
    this.zpx = getIntent().getBooleanExtra("voip_video", true);
    if (str != null)
    {
      this.zpw = true;
      if (!str.equals("launch_type_voip"))
        break label99;
      this.zpx = true;
    }
    while (true)
    {
      this.elZ = new ArrayList();
      this.elZ.addAll(s.dIf());
      this.elZ.addAll(s.dIg());
      AppMethodBeat.o(33977);
      return;
      label99: if (str.equals("launch_type_voip_audio"))
        this.zpx = false;
    }
  }

  protected final m aoA()
  {
    AppMethodBeat.i(33979);
    q localq = new q(this, this.elZ, false, this.scene);
    AppMethodBeat.o(33979);
    return localq;
  }

  protected final boolean aow()
  {
    return false;
  }

  protected final boolean aox()
  {
    return true;
  }

  protected final String aoy()
  {
    AppMethodBeat.i(33983);
    String str1 = getIntent().getStringExtra("Add_address_titile");
    String str2 = str1;
    if (!bo.isNullOrNil(str1))
      str2 = getString(2131296486);
    AppMethodBeat.o(33983);
    return str2;
  }

  protected final o aoz()
  {
    AppMethodBeat.i(33978);
    Object localObject = new c.a();
    ((c.a)localObject).zkR = true;
    ((c.a)localObject).zkQ = true;
    localObject = new c(this, this.elZ, false, (c.a)localObject);
    AppMethodBeat.o(33978);
    return localObject;
  }

  public final int[] bMP()
  {
    return new int[] { 131072 };
  }

  protected final void bMQ()
  {
    AppMethodBeat.i(33982);
    if (this.zpw)
    {
      Intent localIntent = new Intent(this, LauncherUI.class);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
    }
    aqX();
    finish();
    AppMethodBeat.o(33982);
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(33974);
    com.tencent.mm.ui.contact.a.a locala = (com.tencent.mm.ui.contact.a.a)getContentLV().getAdapter().getItem(paramInt);
    if (locala == null)
      AppMethodBeat.o(33974);
    while (true)
    {
      return;
      if (locala.ehM == null)
      {
        AppMethodBeat.o(33974);
      }
      else
      {
        this.talker = locala.ehM.field_username;
        if (this.zpx)
        {
          cbm();
          AppMethodBeat.o(33974);
        }
        else
        {
          cbl();
          AppMethodBeat.o(33974);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33973);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.xxA.c(this.zpy);
    AppMethodBeat.o(33973);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33981);
    com.tencent.mm.sdk.b.a.xxA.d(this.zpy);
    super.onDestroy();
    AppMethodBeat.o(33981);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(33984);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.VoipAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(33984);
      return;
    }
    ab.i("MicroMsg.VoipAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 19:
    case 82:
    }
    while (true)
    {
      AppMethodBeat.o(33984);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        cbm();
        AppMethodBeat.o(33984);
        break;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0]));
      for (paramInt = 2131301920; ; paramInt = 2131301928)
      {
        if (paramArrayOfInt[0] != 0)
          com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(2131301936), getString(2131300878), getString(2131297773), false, new VoipAddressUI.2(this), new VoipAddressUI.3(this));
        AppMethodBeat.o(33984);
        break;
      }
      if (paramArrayOfInt[0] == 0)
      {
        cbl();
        AppMethodBeat.o(33984);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new VoipAddressUI.4(this), null);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.VoipAddressUI
 * JD-Core Version:    0.6.2
 */