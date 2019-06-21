package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;

public class SetTextSizeUI extends MMPreference
{
  private f ehK;
  private int jVE = 1;
  private float qlI;

  public static float aS(float paramFloat)
  {
    float f1 = 17.0F;
    float f2;
    if (paramFloat == 0.875F)
      f2 = 14.0F;
    while (true)
    {
      return f2;
      f2 = f1;
      if (paramFloat != 1.0F)
        if (paramFloat == 1.125F)
        {
          f2 = 18.0F;
        }
        else if (paramFloat == 1.25F)
        {
          f2 = 20.0F;
        }
        else if (paramFloat == 1.375F)
        {
          f2 = 22.0F;
        }
        else if (paramFloat == 1.625F)
        {
          f2 = 26.0F;
        }
        else if (paramFloat == 1.875F)
        {
          f2 = 28.0F;
        }
        else
        {
          f2 = f1;
          if (paramFloat == 2.025F)
            f2 = 30.0F;
        }
    }
  }

  public static float eM(Context paramContext)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(127057);
    float f2 = a.dm(paramContext);
    if ((f2 != 1.0F) && (f2 != 0.875F) && (f2 != 1.125F) && (f2 != 1.25F) && (f2 != 1.375F) && (f2 != 1.625F) && (f2 != 1.875F) && (f2 != 2.025F));
    while (true)
    {
      AppMethodBeat.o(127057);
      return f1;
      f1 = f2;
    }
  }

  public static int eN(Context paramContext)
  {
    AppMethodBeat.i(127058);
    float f = eM(paramContext);
    int i;
    if (f == 0.875F)
    {
      i = 2131302993;
      AppMethodBeat.o(127058);
    }
    while (true)
    {
      return i;
      if (f == 1.125F)
      {
        i = 2131302991;
        AppMethodBeat.o(127058);
      }
      else if (f == 1.25F)
      {
        i = 2131302994;
        AppMethodBeat.o(127058);
      }
      else if (f == 1.375F)
      {
        i = 2131302989;
        AppMethodBeat.o(127058);
      }
      else
      {
        i = 2131302992;
        AppMethodBeat.o(127058);
      }
    }
  }

  private void refresh()
  {
    AppMethodBeat.i(127060);
    this.ehK.removeAll();
    Object localObject = new SetTextSizeUI.a(this, this, 0.875F);
    ((Preference)localObject).setKey("setting_text_size_small");
    ((Preference)localObject).setLayoutResource(2130970127);
    if (this.qlI == 0.875F)
    {
      ((Preference)localObject).setWidgetLayoutResource(2130970197);
      this.ehK.b((Preference)localObject);
      localObject = new SetTextSizeUI.a(this, this, 1.0F);
      ((Preference)localObject).setKey("setting_text_size_normal");
      ((Preference)localObject).setLayoutResource(2130970127);
      if (this.qlI != 1.0F)
        break label367;
      ((Preference)localObject).setWidgetLayoutResource(2130970197);
      label102: this.ehK.b((Preference)localObject);
      localObject = new SetTextSizeUI.a(this, this, 1.125F);
      ((Preference)localObject).setKey("setting_text_size_large");
      ((Preference)localObject).setLayoutResource(2130970127);
      if (this.qlI != 1.125F)
        break label376;
      ((Preference)localObject).setWidgetLayoutResource(2130970197);
      label152: this.ehK.b((Preference)localObject);
      localObject = new SetTextSizeUI.a(this, this, 1.25F);
      ((Preference)localObject).setKey("setting_text_size_super");
      ((Preference)localObject).setLayoutResource(2130970127);
      if (this.qlI != 1.25F)
        break label385;
      ((Preference)localObject).setWidgetLayoutResource(2130970197);
      label202: this.ehK.b((Preference)localObject);
      localObject = new SetTextSizeUI.a(this, this, 1.375F);
      ((Preference)localObject).setKey("setting_text_size_huge");
      ((Preference)localObject).setLayoutResource(2130970127);
      if (this.qlI != 1.375F)
        break label394;
      ((Preference)localObject).setWidgetLayoutResource(2130970197);
    }
    while (true)
    {
      this.ehK.b((Preference)localObject);
      localObject = new PreferenceCategory(this);
      this.ehK.b((Preference)localObject);
      this.ehK.notifyDataSetChanged();
      ViewGroup localViewGroup = (ViewGroup)this.mController.ylv;
      int i = 0;
      int j = localViewGroup.getChildCount();
      while (i < j)
      {
        localObject = localViewGroup.getChildAt(i);
        if ((localObject instanceof TextView))
          ab.d("ui.settings.SetTextSize", "id=" + ((View)localObject).getId());
        i++;
      }
      ((Preference)localObject).setWidgetLayoutResource(2130970198);
      break;
      label367: ((Preference)localObject).setWidgetLayoutResource(2130970198);
      break label102;
      label376: ((Preference)localObject).setWidgetLayoutResource(2130970198);
      break label152;
      label385: ((Preference)localObject).setWidgetLayoutResource(2130970198);
      break label202;
      label394: ((Preference)localObject).setWidgetLayoutResource(2130970198);
    }
    AppMethodBeat.o(127060);
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(127059);
    paramf = paramPreference.mKey;
    this.jVE = 1;
    if (paramf.equals("setting_text_size_small"))
    {
      this.qlI = 0.875F;
      this.jVE = 0;
    }
    while (true)
    {
      refresh();
      AppMethodBeat.o(127059);
      return false;
      if (paramf.equals("setting_text_size_normal"))
      {
        this.qlI = 1.0F;
        this.jVE = 1;
      }
      else if (paramf.equals("setting_text_size_large"))
      {
        this.qlI = 1.125F;
        this.jVE = 2;
      }
      else if (paramf.equals("setting_text_size_super"))
      {
        this.qlI = 1.25F;
        this.jVE = 3;
      }
      else if (paramf.equals("setting_text_size_huge"))
      {
        this.qlI = 1.375F;
        this.jVE = 4;
      }
      else if (paramf.equals("setting_text_size_huger"))
      {
        this.qlI = 1.625F;
        this.jVE = 5;
      }
      else if (paramf.equals("setting_text_size_hugers"))
      {
        this.qlI = 1.625F;
        this.jVE = 6;
      }
      else if (paramf.equals("setting_text_size_hugerss"))
      {
        this.qlI = 1.625F;
        this.jVE = 7;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127056);
    this.qlI = eM(this);
    this.ehK = this.yCw;
    setMMTitle(2131303303);
    setBackBtn(new SetTextSizeUI.1(this));
    a(0, getString(2131303118), new SetTextSizeUI.2(this), q.b.ymu);
    refresh();
    AppMethodBeat.o(127056);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127055);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127055);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SetTextSizeUI
 * JD-Core Version:    0.6.2
 */