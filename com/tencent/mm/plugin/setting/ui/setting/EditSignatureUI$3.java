package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.b;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText;

final class EditSignatureUI$3
  implements MenuItem.OnMenuItemClickListener
{
  EditSignatureUI$3(EditSignatureUI paramEditSignatureUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = false;
    AppMethodBeat.i(126946);
    paramMenuItem = EditSignatureUI.a(this.qkL).getText().toString().trim();
    Object localObject = b.Ne();
    if ((!bo.isNullOrNil((String)localObject)) && (paramMenuItem.matches(".*[" + (String)localObject + "].*")))
    {
      h.b(this.qkL.mController.ylL, this.qkL.getString(2131300632, new Object[] { localObject }), this.qkL.getString(2131297061), true);
      AppMethodBeat.o(126946);
    }
    while (true)
    {
      return bool;
      localObject = this.qkL;
      AppCompatActivity localAppCompatActivity = this.qkL.mController.ylL;
      this.qkL.getString(2131297061);
      EditSignatureUI.a((EditSignatureUI)localObject, h.b(localAppCompatActivity, this.qkL.getString(2131298487), false, null));
      EditSignatureUI.a(this.qkL, r.r(18, paramMenuItem));
      EditSignatureUI.f(this.qkL);
      this.qkL.aqX();
      AppMethodBeat.o(126946);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI.3
 * JD-Core Version:    0.6.2
 */