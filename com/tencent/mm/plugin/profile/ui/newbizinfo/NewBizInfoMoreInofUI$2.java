package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference.c;
import com.tencent.mm.ui.q;

final class NewBizInfoMoreInofUI$2
  implements Preference.c
{
  NewBizInfoMoreInofUI$2(NewBizInfoMoreInofUI paramNewBizInfoMoreInofUI, KeyValuePreference paramKeyValuePreference)
  {
  }

  public final boolean cbK()
  {
    AppMethodBeat.i(23897);
    ClipboardManager localClipboardManager = (ClipboardManager)ah.getContext().getSystemService("clipboard");
    try
    {
      localClipboardManager.setText(this.pqq.getSummary());
      h.bQ(this.pqp.mController.ylL, this.pqp.mController.ylL.getString(2131296876));
      AppMethodBeat.o(23897);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.NewBizInfoMoreInofUI", "clip.setText error ");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMoreInofUI.2
 * JD-Core Version:    0.6.2
 */