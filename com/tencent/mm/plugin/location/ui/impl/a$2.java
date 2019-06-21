package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;

final class a$2
  implements View.OnClickListener
{
  a$2(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113590);
    paramView = new Intent();
    paramView.putExtra("key_fav_item_id", this.nOW.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L));
    paramView.putExtra("key_fav_result_list", this.nOW.activity.getIntent().getStringArrayListExtra("kTags"));
    b.a(this.nOW.activity, ".ui.FavTagEditUI", paramView, 4100);
    AppMethodBeat.o(113590);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.a.2
 * JD-Core Version:    0.6.2
 */