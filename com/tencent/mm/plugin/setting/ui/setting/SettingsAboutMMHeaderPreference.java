package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class SettingsAboutMMHeaderPreference extends Preference
{
  public String qlS = "";

  public SettingsAboutMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SettingsAboutMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(127086);
    super.onBindView(paramView);
    LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(2131827376);
    TextView localTextView = (TextView)paramView.findViewById(2131827377);
    if (localTextView != null)
      localTextView.getPaint().setFakeBoldText(true);
    ((TextView)paramView.findViewById(2131827378)).setText(String.format("%s %s", new Object[] { "Version", this.qlS }));
    if (localLinearLayout != null)
      localLinearLayout.setOnClickListener(new SettingsAboutMMHeaderPreference.1(this));
    AppMethodBeat.o(127086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference
 * JD-Core Version:    0.6.2
 */