package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ExdeviceProfileAffectedUserView$1
  implements AdapterView.OnItemClickListener
{
  ExdeviceProfileAffectedUserView$1(ExdeviceProfileAffectedUserView paramExdeviceProfileAffectedUserView, Context paramContext)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(20009);
    paramView = (String)paramAdapterView.getAdapter().getItem(paramInt);
    ab.d("MicroMsg.ExdeviceProfileAffectedUserView", "onItemClick, username : %s", new Object[] { paramView });
    if (bo.isNullOrNil(paramView))
    {
      ab.w("MicroMsg.ExdeviceProfileAffectedUserView", "username is null.");
      AppMethodBeat.o(20009);
    }
    while (true)
    {
      return;
      paramAdapterView = new Intent(this.val$context, ExdeviceProfileUI.class);
      paramAdapterView.putExtra("username", paramView);
      this.val$context.startActivity(paramAdapterView);
      AppMethodBeat.o(20009);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView.1
 * JD-Core Version:    0.6.2
 */