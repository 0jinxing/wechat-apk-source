package com.tencent.mm.plugin.account.ui;

import android.accounts.AccountAuthenticatorResponse;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.model.b.a;
import com.tencent.mm.plugin.account.model.b.b;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public final class ContactsSyncUI extends MMActivity
{
  private AccountAuthenticatorResponse gAw = null;
  Bundle gAx = null;

  public final void finish()
  {
    AppMethodBeat.i(124752);
    if (this.gAw != null)
    {
      if (this.gAx == null)
        break label45;
      this.gAw.onResult(this.gAx);
    }
    while (true)
    {
      this.gAw = null;
      super.finish();
      AppMethodBeat.o(124752);
      return;
      label45: this.gAw.onError(4, "canceled");
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
    boolean bool = true;
    AppMethodBeat.i(124751);
    g.RN();
    if ((!a.QX()) || (a.QT()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      AppMethodBeat.o(124751);
    }
    while (true)
    {
      return;
      if (getIntent() != null)
        break;
      ab.e("MicroMsg.ContactsSyncUI", "initView fail, intent is null");
      finish();
      AppMethodBeat.o(124751);
    }
    int i = w.a(getIntent(), "contact_sync_scene", -1);
    if ((getIntent().getAction() != null) && (getIntent().getAction().equalsIgnoreCase("com.tencent.mm.login.ACTION_LOGIN")))
      i = 4;
    Object localObject;
    while (true)
    {
      if (i != -1)
        break label269;
      ab.e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
      finish();
      AppMethodBeat.o(124751);
      break;
      localObject = getIntent().resolveType(this);
      ab.i("MicroMsg.ContactsSyncUI", "scheme = " + (String)localObject + ", action = " + getIntent().getAction());
      if (!bo.isNullOrNil((String)localObject))
        if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile"))
          i = 2;
        else if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip"))
          i = 12;
        else if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video"))
          i = 13;
        else if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline"))
          i = 3;
        else if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.phonenum"))
          i = 6;
        else
          i = -1;
    }
    switch (i)
    {
    case 5:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    default:
      label269: label336: localObject = null;
      label338: if (localObject != null)
        switch (((b.a)localObject).cy(this))
        {
        case 0:
        case 1:
        default:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      break;
    case 2:
    case 6:
    case 12:
    case 13:
    case 3:
    case 4:
    case 1:
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(124751);
      break;
      localObject = getIntent().getData();
      localObject = new b.b(1, w.n(getIntent(), "k_phone_num"), (Uri)localObject);
      break label338;
      localObject = getIntent().getData();
      localObject = new b.b(3, w.n(getIntent(), "k_phone_num"), (Uri)localObject);
      break label338;
      localObject = getIntent().getData();
      localObject = new b.b(4, w.n(getIntent(), "k_phone_num"), (Uri)localObject);
      break label338;
      localObject = getIntent().getData();
      localObject = new b.b(2, w.n(getIntent(), "k_phone_num"), (Uri)localObject);
      break label338;
      localObject = getIntent().getParcelableExtra("accountAuthenticatorResponse");
      this.gAw = null;
      if ((localObject != null) && ((localObject instanceof AccountAuthenticatorResponse)))
        this.gAw = ((AccountAuthenticatorResponse)localObject);
      if (this.gAw != null)
        this.gAw.onRequestContinued();
      if (getSharedPreferences(ah.doA(), 0).getBoolean("upload_contacts_already_displayed", false))
        break label336;
      if (!w.a(getIntent(), "k_login_without_bind_mobile", false));
      for (bool = true; ; bool = false)
      {
        localObject = new ContactsSyncUI.a(this, bool);
        break;
      }
      localObject = getIntent().getParcelableExtra("accountAuthenticatorResponse");
      this.gAw = null;
      if ((localObject != null) && ((localObject instanceof AccountAuthenticatorResponse)))
        this.gAw = ((AccountAuthenticatorResponse)localObject);
      if (this.gAw != null)
        this.gAw.onRequestContinued();
      if (!w.a(getIntent(), "k_login_without_bind_mobile", false));
      while (true)
      {
        localObject = new ContactsSyncUI.a(this, bool);
        break;
        bool = false;
      }
      localObject = getIntent();
      ((Intent)localObject).setClass(this, ContactsSyncUI.class);
      Intent localIntent = new Intent();
      localIntent.setClass(this, BindMContactIntroUI.class);
      localIntent.putExtra("key_upload_scene", 2);
      localIntent.putExtra("bind_scene", 2);
      MMWizardActivity.b(this, localIntent, (Intent)localObject);
      finish();
      continue;
      localObject = getIntent();
      ((Intent)localObject).setClass(this, ContactsSyncUI.class);
      localIntent = new Intent();
      localIntent.setClass(this, SimpleLoginUI.class);
      MMWizardActivity.b(this, localIntent, (Intent)localObject);
      finish();
      continue;
      localObject = getIntent();
      ((Intent)localObject).setClass(this, ContactsSyncUI.class);
      localIntent = new Intent();
      localIntent.setClass(this, SimpleLoginUI.class);
      localIntent.putExtra("accountAuthenticatorResponse", this.gAw);
      MMWizardActivity.b(this, localIntent, (Intent)localObject);
      finish();
      continue;
      AppMethodBeat.o(124751);
      break;
      ab.e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124750);
    super.onCreate(paramBundle);
    setMMTitle("");
    int i = w.a(getIntent(), "wizard_activity_result_code", 0);
    ab.i("MicroMsg.ContactsSyncUI", "onCreate() resultCode[%d]", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default:
      ab.e("MicroMsg.ContactsSyncUI", "onCreate, should not reach here, resultCode = ".concat(String.valueOf(i)));
      finish();
      AppMethodBeat.o(124750);
    case 1:
    case -1:
    case 0:
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(124750);
      continue;
      boolean bool = b.a(this, "android.permission.READ_CONTACTS", 48, null, null);
      ab.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts read[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
      if (!bool)
      {
        AppMethodBeat.o(124750);
      }
      else
      {
        bool = b.a(this, "android.permission.WRITE_CONTACTS", 48, null, null);
        ab.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts write[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
        if (!bool)
        {
          AppMethodBeat.o(124750);
        }
        else
        {
          initView();
          AppMethodBeat.o(124750);
        }
      }
    }
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(124753);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.ContactsSyncUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(124753);
      return;
    }
    ab.i("MicroMsg.ContactsSyncUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    }
    while (true)
    {
      AppMethodBeat.o(124753);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        paramArrayOfString = paramArrayOfString[0];
        new ak().post(new ContactsSyncUI.1(this, paramArrayOfString));
        AppMethodBeat.o(124753);
        break;
      }
      h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131296868), false, new ContactsSyncUI.2(this), new ContactsSyncUI.3(this));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ContactsSyncUI
 * JD-Core Version:    0.6.2
 */