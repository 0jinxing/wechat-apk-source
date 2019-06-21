package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class MusicPreference extends Preference
{
  private boolean isPlaying;
  private View mView;
  private View.OnClickListener pLd;
  public String pZl;
  public String pZm;
  public String pZn;
  MusicPreference.a qcA;
  private ImageButton qcz;

  public MusicPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public MusicPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MusicPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(81036);
    this.mView = null;
    this.qcz = null;
    this.pZl = "";
    this.pZm = "";
    this.pZn = "";
    setLayoutResource(2130970195);
    AppMethodBeat.o(81036);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(81037);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(81037);
    return paramView;
  }

  public final void kk(boolean paramBoolean)
  {
    AppMethodBeat.i(81038);
    this.isPlaying = paramBoolean;
    if (this.qcz != null)
      if (paramBoolean)
      {
        this.qcz.setImageResource(2130839856);
        AppMethodBeat.o(81038);
      }
    while (true)
    {
      return;
      this.qcz.setImageResource(2130839855);
      AppMethodBeat.o(81038);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(81039);
    super.onBindView(paramView);
    if (this.pLd == null)
      this.pLd = new MusicPreference.1(this);
    this.qcz = ((ImageButton)paramView.findViewById(2131826075));
    this.qcz.setOnClickListener(this.pLd);
    if (this.isPlaying)
    {
      this.qcz.setImageResource(2130839856);
      AppMethodBeat.o(81039);
    }
    while (true)
    {
      return;
      this.qcz.setImageResource(2130839855);
      AppMethodBeat.o(81039);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.MusicPreference
 * JD-Core Version:    0.6.2
 */