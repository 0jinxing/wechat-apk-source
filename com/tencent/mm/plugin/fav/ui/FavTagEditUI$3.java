package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

final class FavTagEditUI$3
  implements MenuItem.OnMenuItemClickListener
{
  FavTagEditUI$3(FavTagEditUI paramFavTagEditUI, long paramLong)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74139);
    if (FavTagEditUI.b(this.mjZ))
    {
      FavTagEditUI.c(this.mjZ);
      AppMethodBeat.o(74139);
      return true;
    }
    paramMenuItem = FavTagEditUI.d(this.mjZ).getTagList();
    Object localObject1 = FavTagEditUI.d(this.mjZ).getEditText().trim();
    if (!bo.isNullOrNil((String)localObject1))
    {
      paramMenuItem.remove(localObject1);
      paramMenuItem.add(localObject1);
    }
    FavTagEditUI.a(this.mjZ, ((ae)g.M(ae.class)).getFavItemInfoStorage().iE(this.mka));
    if (FavTagEditUI.e(this.mjZ) != null)
    {
      FavTagEditUI.a(FavTagEditUI.e(this.mjZ), paramMenuItem, this.mjZ.getIntent().getIntExtra("key_fav_scene", 1));
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("key_fav_result_list", paramMenuItem);
      this.mjZ.setResult(-1, (Intent)localObject1);
    }
    while (true)
    {
      this.mjZ.finish();
      this.mjZ.aqX();
      AppMethodBeat.o(74139);
      break;
      localObject1 = new String[paramMenuItem.size()];
      Object localObject2 = paramMenuItem.iterator();
      for (int i = 0; ((Iterator)localObject2).hasNext(); i++)
        localObject1[i] = ((String)((Iterator)localObject2).next());
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("key_fav_result_array", (String[])localObject1);
      ((Intent)localObject2).putExtra("key_fav_result_list", paramMenuItem);
      this.mjZ.setResult(-1, (Intent)localObject2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTagEditUI.3
 * JD-Core Version:    0.6.2
 */