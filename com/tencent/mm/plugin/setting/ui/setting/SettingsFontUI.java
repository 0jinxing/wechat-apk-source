package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.g.a.gn;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.ui.widget.FontSelectorView;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMNeat7extView;

public class SettingsFontUI extends MMActivity
{
  private int qne;
  private int qnf;
  private int qng;
  final float qnh;

  public SettingsFontUI()
  {
    AppMethodBeat.i(127223);
    this.qne = 0;
    this.qnf = 2;
    this.qng = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 2131428222);
    this.qnh = SetTextSizeUI.eM(this.mController.ylL);
    AppMethodBeat.o(127223);
  }

  private void a(FontSelectorView paramFontSelectorView)
  {
    AppMethodBeat.i(127228);
    float f1 = SetTextSizeUI.eM(this.mController.ylL);
    float f2;
    if (f1 >= 0.875F)
    {
      f2 = f1;
      if (f1 <= 2.025F);
    }
    else
    {
      f2 = 1.0F;
    }
    int i;
    if (f2 == 0.875F)
      i = 0;
    while (true)
    {
      paramFontSelectorView.setSliderIndex(i);
      AppMethodBeat.o(127228);
      return;
      if (f2 == 1.125F)
        i = 2;
      else if (f2 == 1.25F)
        i = 3;
      else if (f2 == 1.375F)
        i = 4;
      else if (f2 == 1.625F)
        i = 5;
      else if (f2 == 1.875F)
        i = 6;
      else if (f2 == 2.025F)
        i = 7;
      else
        i = 1;
    }
  }

  private void aT(float paramFloat)
  {
    AppMethodBeat.i(127227);
    float f = this.mController.ylL.getSharedPreferences(ah.doA(), 0).getFloat("current_text_size_scale_key", 1.0F);
    ab.i("MicroMsg.SettingsFontUI", "fontSizeAfter=".concat(String.valueOf(f)));
    if (paramFloat != f)
    {
      Object localObject = new Intent();
      ((Intent)localObject).putExtra("Intro_Need_Clear_Top ", true);
      com.tencent.mm.plugin.setting.b.gkE.p((Intent)localObject, this.mController.ylL);
      localObject = new gn();
      ((gn)localObject).cBi.cBj = paramFloat;
      ((gn)localObject).cBi.cBk = f;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      c.atD("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
    }
    AppMethodBeat.o(127227);
  }

  public final int getLayoutId()
  {
    return 2130970634;
  }

  public final void initView()
  {
    AppMethodBeat.i(127225);
    setMMTitle(2131303303);
    ab.i("MicroMsg.SettingsFontUI", "fontSizeBefore=" + this.qnh);
    Object localObject = (ImageView)findViewById(2131827390);
    MMNeat7extView localMMNeat7extView1 = (MMNeat7extView)findViewById(2131827389);
    MMNeat7extView localMMNeat7extView2 = (MMNeat7extView)findViewById(2131827391);
    MMNeat7extView localMMNeat7extView3 = (MMNeat7extView)findViewById(2131827392);
    a.b.b((ImageView)localObject, r.Yz());
    localObject = (FontSelectorView)findViewById(2131827393);
    a((FontSelectorView)localObject);
    ((FontSelectorView)localObject).setOnChangeListener(new SettingsFontUI.1(this, localMMNeat7extView1, localMMNeat7extView2, localMMNeat7extView3));
    setBackBtn(new SettingsFontUI.2(this));
    AppMethodBeat.o(127225);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127224);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127224);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(127226);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      h.pYm.e(11609, new Object[] { Integer.valueOf(this.qne), Integer.valueOf(this.qnf), Integer.valueOf(0) });
      ab.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%d , changeFontSize: %d, curFontSize:%d", new Object[] { Integer.valueOf(11609), Integer.valueOf(this.qne), Integer.valueOf(this.qnf) });
      finish();
      aT(this.qnh);
      AppMethodBeat.o(127226);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(127226);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI
 * JD-Core Version:    0.6.2
 */