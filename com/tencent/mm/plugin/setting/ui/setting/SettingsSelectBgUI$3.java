package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.ba.j;
import com.tencent.mm.ba.m;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.List;

final class SettingsSelectBgUI$3
  implements AdapterView.OnItemClickListener
{
  SettingsSelectBgUI$3(SettingsSelectBgUI paramSettingsSelectBgUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(127473);
    if (paramInt == 0)
    {
      SettingsSelectBgUI.a(this.qoV, -2);
      SettingsSelectBgUI.b(this.qoV).KC();
      if (!SettingsSelectBgUI.c(this.qoV))
      {
        this.qoV.setResult(-1);
        this.qoV.finish();
      }
      AppMethodBeat.o(127473);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        SettingsSelectBgUI.a(this.qoV, 0);
        SettingsSelectBgUI.b(this.qoV).KC();
        if (!SettingsSelectBgUI.c(this.qoV))
        {
          this.qoV.setResult(-1);
          this.qoV.finish();
        }
        AppMethodBeat.o(127473);
      }
      else if (!g.RP().isSDCardAvailable())
      {
        Toast.makeText(this.qoV, 2131303250, 1).show();
        AppMethodBeat.o(127473);
      }
      else
      {
        paramAdapterView = (m)paramAdapterView.getItemAtPosition(paramInt - 2);
        if (paramAdapterView != null)
          break;
        ab.e("MicroMsg.SettingsSelectBgUI", "onItemClick fail, info is null, position = ".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(127473);
      }
    }
    switch (paramAdapterView.status)
    {
    default:
    case 5:
    case 3:
    case 4:
    case 1:
    case 2:
    }
    label551: 
    while (true)
    {
      AppMethodBeat.o(127473);
      break;
      if (SettingsSelectBgUI.d(this.qoV) == null)
      {
        SettingsSelectBgUI.a(this.qoV, new j(paramAdapterView.id, 1));
        g.Rg().a(SettingsSelectBgUI.d(this.qoV), 0);
        AppMethodBeat.o(127473);
        break;
      }
      SettingsSelectBgUI.e(this.qoV).add(new j(paramAdapterView.id, 1));
      AppMethodBeat.o(127473);
      break;
      if ((SettingsSelectBgUI.d(this.qoV) != null) && (SettingsSelectBgUI.d(this.qoV).fMn == paramAdapterView.id))
      {
        g.Rg().c(SettingsSelectBgUI.d(this.qoV));
        r.aix().cz(SettingsSelectBgUI.d(this.qoV).fMn, 1);
        SettingsSelectBgUI.a(this.qoV, SettingsSelectBgUI.e(this.qoV));
      }
      SettingsSelectBgUI.h(paramAdapterView.id, SettingsSelectBgUI.e(this.qoV));
      paramView = r.aix();
      paramAdapterView.status = 4;
      paramView.b(paramAdapterView);
      new SettingsSelectBgUI.3.1(this, paramView, paramAdapterView.id).sendEmptyMessageDelayed(0, 1000L);
      AppMethodBeat.o(127473);
      break;
      r.aix().cz(paramAdapterView.id, 1);
      AppMethodBeat.o(127473);
      break;
      SettingsSelectBgUI.a(this.qoV, paramAdapterView.id);
      if (SettingsSelectBgUI.c(this.qoV))
      {
        paramAdapterView.status = 1;
        paramView = r.aix();
        paramView.lS(paramAdapterView.cBc);
        paramAdapterView.status = 1;
        paramView.b(paramAdapterView);
      }
      while (true)
      {
        if (SettingsSelectBgUI.c(this.qoV))
          break label551;
        this.qoV.setResult(-1);
        this.qoV.finish();
        break;
        SettingsSelectBgUI.b(this.qoV).KC();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI.3
 * JD-Core Version:    0.6.2
 */