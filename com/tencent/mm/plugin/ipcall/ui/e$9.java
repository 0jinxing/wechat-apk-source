package com.tencent.mm.plugin.ipcall.ui;

import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;
import java.util.ArrayList;

final class e$9
  implements n.d
{
  e$9(e parame, k paramk, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(22041);
    Object localObject;
    l locall;
    int i;
    if (paramInt == 0)
    {
      paramMenuItem = this.nBc;
      localObject = this.nBd;
      paramInt = this.nBe;
      if (((k)localObject).field_addressId > 0L)
      {
        locall = i.bHx();
        long l = ((k)localObject).field_addressId;
        if (l > 0L)
        {
          i = locall.bSd.delete("IPCallRecord", "addressId=?", new String[] { String.valueOf(l) });
          if (i < 0)
            ab.d("MicroMsg.IPCallRecordStorage", "deleteByAddressId failed, ret: %d, addressId: %d", new Object[] { Integer.valueOf(i), Long.valueOf(l) });
        }
        localObject = paramMenuItem.nAT;
        ((h)localObject).nDZ.remove(paramInt);
        ((h)localObject).notifyDataSetChanged();
        if (paramMenuItem.nAT.getCount() <= 0)
          break label228;
        paramMenuItem.nAU.setVisibility(8);
        AppMethodBeat.o(22041);
      }
    }
    while (true)
    {
      return;
      locall = i.bHx();
      localObject = ((k)localObject).field_phonenumber;
      if (bo.isNullOrNil((String)localObject))
        break;
      i = locall.bSd.delete("IPCallRecord", "phonenumber=?", new String[] { localObject });
      if (i >= 0)
        break;
      ab.d("MicroMsg.IPCallRecordStorage", "deleteByCallPhoneNumber failed, ret: %d, phoneNumber: %s", new Object[] { Integer.valueOf(i), localObject });
      break;
      label228: paramMenuItem.nAU.setVisibility(0);
      AppMethodBeat.o(22041);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.e.9
 * JD-Core Version:    0.6.2
 */