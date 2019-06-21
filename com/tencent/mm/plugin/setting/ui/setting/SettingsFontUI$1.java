package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.setting.ui.widget.FontSelectorView.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class SettingsFontUI$1
  implements FontSelectorView.a
{
  SettingsFontUI$1(SettingsFontUI paramSettingsFontUI, MMNeat7extView paramMMNeat7extView1, MMNeat7extView paramMMNeat7extView2, MMNeat7extView paramMMNeat7extView3)
  {
  }

  public final void Cl(int paramInt)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(127221);
    float f2 = f1;
    label79: Object localObject;
    switch (paramInt)
    {
    default:
      f2 = f1;
    case 1:
      if (f2 != this.qnl.qnh)
      {
        SettingsFontUI.a(this.qnl, 1);
        a.h(this.qnl.mController.ylL, f2);
        localObject = this.qnl.mController.ylL.getSharedPreferences(ah.doA(), 0).edit();
        ((SharedPreferences.Editor)localObject).putFloat("current_text_size_scale_key", f2);
        ((SharedPreferences.Editor)localObject).commit();
        SettingsFontUI.b(this.qnl, a.fX(this.qnl.mController.ylL));
        f1 = a.dm(this.qnl.mController.ylL);
        localObject = this.qnl.mController.ylL;
        if (f1 != 0.875F)
          break label322;
        SettingsFontUI.c(this.qnl, a.am((Context)localObject, 2131428223));
      }
      break;
    case 0:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      this.qni.setTextSize(1, SetTextSizeUI.aS(f2));
      this.qnj.setTextSize(1, SetTextSizeUI.aS(f2));
      this.qnk.setTextSize(1, SetTextSizeUI.aS(f2));
      this.qnl.bn(a.am((Context)localObject, 2131427496) * a.fY((Context)localObject));
      AppMethodBeat.o(127221);
      return;
      f2 = 0.875F;
      break;
      f2 = 1.125F;
      break;
      f2 = 1.25F;
      break;
      f2 = 1.375F;
      break;
      f2 = 1.625F;
      break;
      f2 = 1.875F;
      break;
      f2 = 2.025F;
      break;
      SettingsFontUI.a(this.qnl, 0);
      break label79;
      label322: if (f1 == 1.125F)
        SettingsFontUI.c(this.qnl, a.am((Context)localObject, 2131428216));
      else if (f1 == 1.25F)
        SettingsFontUI.c(this.qnl, a.am((Context)localObject, 2131428224));
      else if (f1 == 1.375F)
        SettingsFontUI.c(this.qnl, a.am((Context)localObject, 2131428206));
      else if ((f1 == 1.625F) || (f1 == 1.875F) || (f1 == 2.025F))
        SettingsFontUI.c(this.qnl, a.am((Context)localObject, 2131428207));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI.1
 * JD-Core Version:    0.6.2
 */