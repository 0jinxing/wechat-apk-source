package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactListCustomPreference extends Preference
{
  int background;
  View.OnClickListener pLd;
  private View uvN;
  private final View.OnTouchListener vla;

  public ContactListCustomPreference(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(79759);
    this.background = -1;
    this.vla = new ContactListCustomPreference.1(this);
    setLayoutResource(2130970140);
    AppMethodBeat.o(79759);
  }

  public ContactListCustomPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(79760);
    this.background = -1;
    this.vla = new ContactListCustomPreference.1(this);
    setLayoutResource(2130970140);
    AppMethodBeat.o(79760);
  }

  public ContactListCustomPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(79761);
    this.background = -1;
    this.vla = new ContactListCustomPreference.1(this);
    setLayoutResource(2130970140);
    AppMethodBeat.o(79761);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(79762);
    ViewGroup localViewGroup = (ViewGroup)paramView;
    if ((this.uvN != null) && (this.uvN != null))
    {
      localViewGroup.removeAllViews();
      if (this.uvN.getParent() != null)
        ((ViewGroup)this.uvN.getParent()).removeAllViews();
      localViewGroup.addView(this.uvN);
      if (this.pLd == null)
        break label95;
      localViewGroup.setOnClickListener(this.pLd);
    }
    while (true)
    {
      if (this.background >= 0)
        paramView.setBackgroundResource(this.background);
      AppMethodBeat.o(79762);
      return;
      label95: localViewGroup.setOnTouchListener(this.vla);
    }
  }

  public final void setCustomView(View paramView)
  {
    if (paramView == null);
    while (true)
    {
      return;
      this.uvN = paramView;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.ContactListCustomPreference
 * JD-Core Version:    0.6.2
 */