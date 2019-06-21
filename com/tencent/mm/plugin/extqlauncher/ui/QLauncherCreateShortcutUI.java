package com.tencent.mm.plugin.extqlauncher.ui;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMBaseActivity;
import java.util.List;

public class QLauncherCreateShortcutUI extends MMBaseActivity
{
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(20495);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "onActivityResult resultCode = %s", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      finish();
      AppMethodBeat.o(20495);
    }
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
      case 1:
      }
      label68: 
      do
      {
        finish();
        AppMethodBeat.o(20495);
        break;
      }
      while (paramIntent == null);
      if (aw.RK())
        break;
      ab.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "account not ready");
      Toast.makeText(this, 2131299427, 0).show();
      finish();
      AppMethodBeat.o(20495);
    }
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    if (!bo.isNullOrNil(paramIntent));
    for (paramIntent = bo.P(paramIntent.split(",")); ; paramIntent = null)
    {
      while (true)
      {
        if ((paramIntent == null) || (paramIntent.size() <= 0))
        {
          ab.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames empty");
          break label68;
        }
        ab.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames count " + paramIntent.size());
        String str1 = r.Yz();
        try
        {
          ContentValues[] arrayOfContentValues = new ContentValues[paramIntent.size()];
          for (paramInt1 = 0; ; paramInt1++)
          {
            if (paramInt1 >= paramIntent.size())
              break label501;
            aw.ZK();
            Object localObject = c.XM().aoO((String)paramIntent.get(paramInt1));
            if ((localObject == null) || ((int)((com.tencent.mm.n.a)localObject).ewQ <= 0))
            {
              ab.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "no such user");
              finish();
              AppMethodBeat.o(20495);
              break;
            }
            String str2 = com.tencent.mm.plugin.base.model.b.Ft((String)paramIntent.get(paramInt1));
            if (bo.isNullOrNil(str2))
            {
              ab.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "null encryptShortcutUser");
              finish();
              AppMethodBeat.o(20495);
              break;
            }
            ContentValues localContentValues = new android/content/ContentValues;
            localContentValues.<init>();
            localContentValues.put("source_key", com.tencent.mm.plugin.base.model.b.SOURCE_KEY);
            localContentValues.put("owner_id", com.tencent.mm.plugin.base.model.b.Ft(str1));
            localContentValues.put("unique_id", str2);
            localContentValues.put("container", Integer.valueOf(1));
            localContentValues.put("item_type", Integer.valueOf(com.tencent.mm.plugin.base.model.b.C((ad)localObject)));
            localContentValues.put("name", com.tencent.mm.model.s.a((ad)localObject, (String)paramIntent.get(paramInt1)));
            o.acd();
            localContentValues.put("icon_path", com.tencent.mm.ah.d.D((String)paramIntent.get(paramInt1), false));
            localObject = new android/content/Intent;
            ((Intent)localObject).<init>("com.tencent.mm.action.BIZSHORTCUT");
            ((Intent)localObject).putExtra("LauncherUI.Shortcut.Username", str2);
            ((Intent)localObject).putExtra("LauncherUI.From.Biz.Shortcut", true);
            ((Intent)localObject).addFlags(67108864);
            localContentValues.put("intent", ((Intent)localObject).toUri(0));
            arrayOfContentValues[paramInt1] = localContentValues;
          }
          label501: getContentResolver().bulkInsert(a.lRW, arrayOfContentValues);
          Toast.makeText(this, 2131299428, 0).show();
          com.tencent.mm.plugin.extqlauncher.b.bsa().bsc();
        }
        catch (Exception paramIntent)
        {
          ab.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "bulkInsert shortcut failed, %s", new Object[] { paramIntent.getMessage() });
          ab.printErrStackTrace("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", paramIntent, "", new Object[0]);
          Toast.makeText(this, 2131299427, 0).show();
        }
      }
      break label68;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20494);
    super.onCreate(paramBundle);
    ab.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "onCreate");
    requestWindowFeature(1);
    setContentView(2130969253);
    paramBundle = new Intent();
    int i = com.tencent.mm.ui.contact.s.C(new int[] { com.tencent.mm.ui.contact.s.znD, 64, 16384 });
    com.tencent.mm.ui.contact.s.hs(i, 1);
    paramBundle.putExtra("list_attr", i);
    paramBundle.putExtra("list_type", 12);
    paramBundle.putExtra("stay_in_wechat", false);
    paramBundle.putExtra("titile", getString(2131296486));
    paramBundle.putExtra("block_contact", r.Yz());
    com.tencent.mm.bp.d.b(this, ".ui.contact.SelectContactUI", paramBundle, 1);
    AppMethodBeat.o(20494);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.ui.QLauncherCreateShortcutUI
 * JD-Core Version:    0.6.2
 */