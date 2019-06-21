package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Parcelable.Creator;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.setting.model.UserAuthItemParcelable;
import com.tencent.mm.protocal.protobuf.cmb;
import com.tencent.mm.protocal.protobuf.cmc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

final class SettingsSearchAuthUI$4
  implements AdapterView.OnItemClickListener
{
  SettingsSearchAuthUI$4(SettingsSearchAuthUI paramSettingsSearchAuthUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(127444);
    if (!SettingsSearchAuthUI.f(this.qoM))
    {
      paramView = SettingsSearchAuthUI.g(this.qoM).Cm(paramInt);
      if (paramView != null)
      {
        Intent localIntent = new Intent(this.qoM, SettingsModifyUserAuthUI.class);
        UserAuthItemParcelable[] arrayOfUserAuthItemParcelable = (UserAuthItemParcelable[])UserAuthItemParcelable.CREATOR.newArray(paramView.xjN.size());
        for (paramInt = 0; paramInt < paramView.xjN.size(); paramInt++)
        {
          paramAdapterView = (cmc)paramView.xjN.get(paramInt);
          UserAuthItemParcelable localUserAuthItemParcelable = new UserAuthItemParcelable();
          localUserAuthItemParcelable.scope = paramAdapterView.scope;
          localUserAuthItemParcelable.qkh = paramAdapterView.qkh;
          localUserAuthItemParcelable.state = paramAdapterView.state;
          localUserAuthItemParcelable.qki = paramAdapterView.qki;
          arrayOfUserAuthItemParcelable[paramInt] = localUserAuthItemParcelable;
        }
        localIntent.putExtra("app_id", paramView.csB);
        localIntent.putExtra("app_name", paramView.fhH);
        localIntent.putExtra("modify_scene", 2);
        localIntent.putParcelableArrayListExtra("app_auth_items", new ArrayList(Arrays.asList(arrayOfUserAuthItemParcelable)));
        this.qoM.startActivity(localIntent);
      }
    }
    AppMethodBeat.o(127444);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.4
 * JD-Core Version:    0.6.2
 */