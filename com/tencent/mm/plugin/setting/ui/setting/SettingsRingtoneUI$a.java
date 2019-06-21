package com.tencent.mm.plugin.setting.ui.setting;

import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SettingsRingtoneUI$a extends BaseAdapter
{
  int count;
  Cursor cyz;
  int padding;

  public SettingsRingtoneUI$a(SettingsRingtoneUI paramSettingsRingtoneUI, Cursor paramCursor)
  {
    AppMethodBeat.i(127426);
    this.count = 0;
    this.padding = 0;
    this.cyz = paramCursor;
    this.count = (paramCursor.getCount() + 1);
    ab.d("RingtonePickerActivity", "count = " + this.count);
    this.padding = paramSettingsRingtoneUI.getResources().getDimensionPixelSize(2131427812);
    AppMethodBeat.o(127426);
  }

  private String getItem(int paramInt)
  {
    AppMethodBeat.i(127428);
    String str;
    if ((this.cyz.isClosed()) || (!this.cyz.moveToPosition(paramInt - 1)))
    {
      str = "";
      AppMethodBeat.o(127428);
    }
    while (true)
    {
      return str;
      str = this.cyz.getString(this.cyz.getColumnIndex("title"));
      AppMethodBeat.o(127428);
    }
  }

  public final int getCount()
  {
    return this.count;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(127427);
    paramView = (CheckedTextView)this.qoF.qoB.inflate(2130970591, null);
    if (paramInt == 0)
    {
      paramView.setBackgroundResource(2130838396);
      paramView.setText(2131303185);
    }
    while (true)
    {
      paramView.setPadding(this.padding, 0, this.padding, 0);
      paramView.setCheckMarkDrawable(2130840056);
      AppMethodBeat.o(127427);
      return paramView;
      paramView.setBackgroundResource(2130838396);
      paramView.setText(getItem(paramInt));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI.a
 * JD-Core Version:    0.6.2
 */