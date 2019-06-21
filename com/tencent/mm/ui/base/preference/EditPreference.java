package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

public class EditPreference extends Preference
{
  private c gud;
  private EditText mLL;
  String value;
  EditPreference.a yBA;
  private Preference.a yBv;

  public EditPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public EditPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(Preference.a parama)
  {
    this.yBv = parama;
  }

  public final void showDialog()
  {
    AppMethodBeat.i(107162);
    EditText localEditText;
    if (this.mLL != null)
      localEditText = this.mLL;
    while (true)
    {
      Object localObject = localEditText.getLayoutParams();
      if ((localObject instanceof ViewGroup.MarginLayoutParams))
      {
        localObject = (ViewGroup.MarginLayoutParams)localObject;
        int i = localEditText.getResources().getDimensionPixelSize(2131427776);
        ((ViewGroup.MarginLayoutParams)localObject).leftMargin = i;
        ((ViewGroup.MarginLayoutParams)localObject).rightMargin = i;
        ((ViewGroup.MarginLayoutParams)localObject).topMargin = i;
        ((ViewGroup.MarginLayoutParams)localObject).bottomMargin = i;
      }
      if (localEditText.getParent() != null)
        ((ViewGroup)localEditText.getParent()).removeView(localEditText);
      this.gud = h.a(this.mContext, getTitle().toString(), localEditText, a.an(this.mContext, 2131296994), a.an(this.mContext, 2131296868), new EditPreference.1(this, localEditText), new EditPreference.2(this));
      AppMethodBeat.o(107162);
      return;
      localEditText = new EditText(this.mContext);
      localEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      localEditText.setSingleLine(true);
      localEditText.setText(this.value);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.EditPreference
 * JD-Core Version:    0.6.2
 */